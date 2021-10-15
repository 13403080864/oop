package com;

/**
 * @author wq
 * @since 2021-10-15 15:32
 */

public class USBImpl implements USB {
    @Override
    public void start() {
        System.out.println("方法开始了");
    }

    @Override
    public void end() {
        System.out.println("方法结束");
    }
}
