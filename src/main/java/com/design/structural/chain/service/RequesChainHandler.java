package com.design.structural.chain.service;


import com.design.structural.chain.impl.BlockFilterHandler;
import com.design.structural.chain.impl.CurrentLimitHandler;
import com.design.structural.chain.impl.NoSupportHandler;
import com.design.structural.chain.impl.SessionVarifyHandler;
import com.design.structural.chain.model.ChainRequest;
import lombok.extern.slf4j.Slf4j;

/**
 * 责任链
   就是一个链式的处理方式，将一类问题的处理请求沿着链上传递，链上有多个处理请求的对象节点，每个对象节点收到处理请求都进行判定是否自己需要处理的请求，
      如果不是，就抛给链上的下一个节点，直到有对象处理，或者没有对象处理 就走到了默认处理分支！下面告诉你如何实现责任链的设计模式！

   责任链模式涉及到的角色如下所示：
    ●　抽象处理者(Handler)角色：
            定义出一个处理请求的接口。如果需要，接口可以定义出一个方法以设定和返回对下家的引用。
            这个角色通常由一个Java抽象类或者Java接口实现。
            上图中Handler类的聚合关系给出了具体子类对下家的引用，抽象方法handleRequest()规范了子类处理请求的操作。
    ●　具体处理者(ConcreteHandler)角色：
            具体处理者接到请求后，可以选择将请求处理掉，或者将请求传给下家。由于具体处理者持有对下家的引用，因此，如果需要，具体处理者可以访问下家。
 */
@Slf4j
public abstract class RequesChainHandler {

    protected String name;

    protected RequesChainHandler nextNode;

    public RequesChainHandler() {
    }

    public RequesChainHandler(String name) {
        this.name = name;
    }

    /**
     * 每个节点需要执行的方法
     */
    public abstract Boolean excuteHandle(ChainRequest request);


    /**
     * 执行责任链
     * @param request
     */
    public void doChain(ChainRequest request){
        if (excuteHandle(request)){
            log.info(this + "处理请求成功:"+request);
        }else if (nextNode != null){
            nextNode.doChain(request);
        }else {
            log.info(this + "====处理请求失败===:"+request);
        }
    }


    /**
     * 设置下一个责任链的节点
     * @param nextNode
     */
    public RequesChainHandler setNext(RequesChainHandler nextNode){
        this.nextNode = nextNode;
        return this.nextNode;
    }


    /**
     * 生成责任链
     * @return
     */
    public static RequesChainHandler getFristNode(){
        RequesChainHandler node1 = new SessionVarifyHandler("小于5",5);
        RequesChainHandler node2 = new SessionVarifyHandler("小于15",15);
        RequesChainHandler node3 = new CurrentLimitHandler("指定数值36",36);
        RequesChainHandler node4 = new BlockFilterHandler("奇数");
        RequesChainHandler node5 = new NoSupportHandler("不支持类型");
        node1.setNext(node2).setNext(node3).setNext(node4).setNext(node5);
        return node1;
    }


    @Override
    public String toString() {
        return "对象：<"+name+">";
    }
}
