package TextUnvaluable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class HelloWorld {
    private static int num;
    public static void main (String [] args){
           System.out.println("Hello World!");
//          method1();
           //这是单行注释
        num = 10;
       }
    public static void method1(){
        System.out.println("Hello World2!");
        try {
            FileInputStream fis = new FileInputStream("hello,txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
