package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * Created by asus on 24.04.17.
 */
public class homeWork_2_1 {

    public static void main(String[] args) {
        Scanner col = new Scanner(System.in);
        String Col = col.next();
        arrHolder iMas = new arrHolder();
        int[] myArr = new int[Integer.parseInt(Col)];
        iMas.iMasCreate(myArr);
//        iMas.outMass(myArr);
//        System.out.println();
//        iMas.sortMassIncrease(myArr);
//        System.out.println();
//        iMas.sortMassDecrease(myArr);
        iMas.foundNomber(myArr,"max");
        System.out.println(iMas[]);

    }


    //public static int arrHolder(int count){


}

