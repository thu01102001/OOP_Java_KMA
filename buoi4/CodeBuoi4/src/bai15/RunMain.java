/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bai15;

/**
 *
 * @author Administrator
 */
public class RunMain {
        public static void main(String[] args) {
            USB usb = new USB(1, 100, 5);
            Mouse mouse = new Mouse(2, 150, 10);
            usb.showInformation();
            mouse.showInfomation();
    }
}
