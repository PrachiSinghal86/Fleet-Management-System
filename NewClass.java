/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
class NewThread implements Runnable {
    String name;
    Thread t;
    NewThread(String threadn){
        name=threadn;
        t=new Thread(this,name);
        System.out.println("New thread :"+t);
        t.start();
    }
    public void run()
    {
        try{
          Thread.sleep(500);
          System.out.println("name:"+name);
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class NewClass {
    public static void main(String args[]){
        new NewThread("Prachi");
        new NewThread("Singhal");
        try{
            Thread.sleep(1500);
            System.out.println("Btech II year");
        }catch(InterruptedException e){
            System.out.println("main thread interrupted");
        }
        
    } 
}
