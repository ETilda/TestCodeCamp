package com.company;
import java.util.Scanner;


public class JavaMethods {
    public static void main(String[] args) {

        JavaMethods methodVar= new JavaMethods();
        methodVar.testifyNew();

    }
    public void testifyNew(){
        Scanner verify = new Scanner(System.in);
        String visitorInput ="";

        while (true){
            if ((!visitorInput.equalsIgnoreCase("Testify")) ){
                System.out.println("Try again.");
                visitorInput = verify.nextLine();
                continue;
            }else if (visitorInput.equalsIgnoreCase("Testify")){

                System.out.println("Welcome, please enter password");

                break;

            }


        }


    }
}

