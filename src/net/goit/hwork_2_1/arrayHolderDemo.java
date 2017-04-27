package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * Main class describing home work
 * @author Mamedov Vyacheslav
 * @version 1.0
 */
public class arrayHolderDemo {
    private  int[] myArr;
    public void runningProgramm(byte keyVolume){
        arrHolder iMas = new arrHolder();

        if (keyVolume == 1){
            System.out.print("Enter count elements your Array: ");
            Scanner col = new Scanner(System.in);
            String Col = col.next();
            myArr = new int[Integer.parseInt(Col)];
            iMas.iMasCreate(myArr);

        }
        if (keyVolume == 2){
            iMas.outMass(myArr);
        }
        if (keyVolume == 3){
            iMas.sortMassIncrease(myArr);
        }
        if (keyVolume == 4){
            iMas.sortMassDecrease(myArr);
        }
        if (keyVolume == 5) {
            System.err.println("Max volume: "+myArr[iMas.foundNomber(myArr,"max")]);
        }
        if (keyVolume == 6){
            System.err.println("Min volume: "+myArr[iMas.foundNomber(myArr,"min")]);
        }
        if (keyVolume == 7){
            int index = iMas.foundNomber(myArr,"myVolume");
            if (index!=-1) {
                System.err.println("Index your value: " + index);
            } else System.err.println("Not found your value in array");
        }
    }

    public void mainMenu(){
       System.out.println("");
       System.out.println("Menu:");
       System.out.println("Enter nomber menu: ");
       System.out.println("1. Create Array");
       System.out.println("2. Out Array");
       System.out.println("3. Sort Array Increase");
       System.out.println("4. Sort Array Decrease");
       System.out.println("5. Fount max value in array");
       System.out.println("6. Fount min value in array");
       System.out.println("7. Fount your value in array");
       System.out.println("8. Exit");
    }

}
