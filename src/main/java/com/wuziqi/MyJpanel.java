//package com.wuziqi;
//
//import javax.imageio.ImageIO;
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.io.IOException;
//
///**
// * @author wq
// * @since 2021-12-16 14:46
// */
//
//public class MyJpanel extends JFrame {
//    PicJpanel pj;
//
//    public MyJpanel() {
//        init();
//    }
//
//    private void init() {
//        // 逻辑代码处理部分
//    }
//
//    public static void main(String[] args) {
//        new MyJpanel();
//    }
//}
//
//class PicJpanel extends JPanel {
//    MyJpanel mj;
//
//    public PicJpanel(MyJpanel mj) {
//        // 设定面板在窗体中的位置以及高度和宽度
//        this.setBounds(0, 0, mj.getWidth(), mj.getHeight());
//        this.mj = mj;
//    }
//
//    /**
//     * 画组件
//     */
//    @Override
//    protected void paintComponent(Graphics g) {
//
//        // 设置一个背景
//        try {
//            BufferedImage bi = ImageIO.read(new File("img/bj.jpg"));
//            g.drawImage(bi, 0, 0, this);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    class MyMouse extends MouseAdapter {
//        MyJpanel mj;
//
//        public MyMouse(MyJpanel mj) {
//            super();
//            this.mj = mj;
//        }
//
//        @Override
//        public void mousePressed(MouseEvent e) {
//            //点击事件的处理
//        }
//
//    }