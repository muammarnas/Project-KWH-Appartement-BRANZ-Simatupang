/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SplashAnimate;

/**
 *
 * @author user
 */
public class SplashSceenz {
    public static void main(String[]args){
        Splash splashz = new Splash();
        splashz.setVisible(true);
        try{
            for (int i=1;i<=100;i++){
                Thread.sleep(20);
                Splash.jLabel1.setText(""+i);
                Splash.jProgressBar1.setValue(i);
                if (i==100){
                }
            }
            
        }catch(Exception e){
            
        }
    }
    
}
