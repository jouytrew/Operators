/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;


/**
 *
 * @author Benjamin Wong
 */
public class Operators {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        toggleValueTest();
        
    }

    private static void radiusToCircumference(int radius, String unit) {
        int r = radius;
        double pi = 3.1415926535;
        double c;
        int i;
        System.out.println(Math.round(pi));
        c = (pi * (r * 2));
        System.out.println("Circumference = " + c + " " + unit);
    }

    private static void mathTest() {
        int five = 5;
        int two = 2;
        int result;
        double dresult;

        System.out.println(" 5 * 2 = " + (five * two));
        System.out.println(" 5 / 2 = " + (double) five / two);

        result = five / two;
        dresult = five / two;
        System.out.println(" 5 / 2 = " + result);
        System.out.println(" 5 / 2 = " + dresult);

    }
    
    private static void operatorTest1(){
        int i = 10;
        int n = i++%5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);

        i = 10;
        int m = ++i%5;
        System.out.println("m = " + m);
        System.out.println("i = " + i);
    }
    
    public static Boolean toggleBoolean(Boolean myValue){
        return !myValue;
    }
    
     public static void toggleValueTest (){
        Boolean bValue = true;
        System.out.println(bValue);
        
        bValue = toggleBoolean(bValue);
        System.out.println(bValue);
        
        bValue = toggleBoolean(bValue);
        System.out.println(bValue);
     }

}
