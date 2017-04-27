package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * Created by asus on 24.04.17.
 */
public class homeWork_2_1 {

    public static void main(String[] args) {

        Scanner pressButton = new Scanner(System.in);
        String pressbutton = pressButton.next();


//        arrayHolderDemo startProg = new arrayHolderDemo();
//
//        Scanner pressButton = new Scanner(System.in);
//        String pressbutton = pressButton.next();
//        switch (pressbutton) {
//            case "1":{
//                System.out.println("Hello in my programms!");
//                System.out.println("Enter nomber menu: ");
//                System.out.println("1. Create Array");
//                System.out.println("2. Out Array");
//                }
//            case "2":break;
//            startProg.runningProgramm((byte) 0);
            // iMas.outMass(myArr);
//        System.out.println();
//        iMas.sortMassIncrease(myArr);
//        System.out.println();
//        iMas.sortMassDecrease(myArr);
            // iMas.foundNomber(myArr,"myVolume");
            //System.out.println("intex "+iMas.foundNomber(myArr,"myVolume"));
        }

    public abstract class MenuEntry {
        private String title;

        public MenuEntry(String title) {
            this.title = title;
        }

        public abstract void run();
    }
//    }


    //public static int arrHolder(int count){


}

