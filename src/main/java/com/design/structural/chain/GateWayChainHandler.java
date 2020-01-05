package com.design.structural.chain;


/**
 * 责任链
 */
public abstract class GateWayChainHandler {

    protected GateWayChainHandler nextGateWayChain;


    /**
     * 子类需要实现的方法
     */
    public abstract void excute(StringBuilder request);


    /**
     * 执行责任链
     * @param request
     */
    public void doChain(StringBuilder request){
      excute(request);
      nextExcute(request);
    }




    /**
     * 设置下一个责任链
     * @param nextGateWayChain
     */
    public void setNextChain(GateWayChainHandler nextGateWayChain){
        this.nextGateWayChain = nextGateWayChain;
    }


    /**
     * 执行下一个链的业务
     */
    protected void nextExcute(StringBuilder request){
        if (this.nextGateWayChain != null){
            this.nextGateWayChain.doChain(request);//执行下一个链
        }
    }

}
