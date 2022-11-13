/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author LENOVO
 */
public class TestThread extends Thread{
    public TestThread(String name){
    super(name);
    }
    public void run(){
        for(int i = 0; i < 10; i++)
            System.out.println(this.getName());
        }
    }
