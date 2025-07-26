/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

/**
 *
 * @author jaylo
 */
public class JavaApplication3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String name = "Jaylord";
        int gta = 6;
        double pi = 3.14159;
        char gender = 'M';
        boolean isAdmin = false;

        System.out.println("My name is " + name);
        System.out.println("Ny gta is " + gta);
        System.out.println("the value of Pi is " + pi);
        System.out.println("My gender letter is " + gender);

        if (isAdmin) {
            System.out.println("I love you denise " + name);
        } else {
            System.out.println("I love you gihapon denise " + name);
        }
    }
