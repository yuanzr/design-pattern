package com.design.structural.chain.model;


/**
 * 请求对象
 */
public class ChainRequest {

    private int number;

    public ChainRequest(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String toString() {
        return "问题编号：[" + number + "]";
    }
}
