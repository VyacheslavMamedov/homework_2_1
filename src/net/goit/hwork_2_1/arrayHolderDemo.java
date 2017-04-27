package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * Main class describing home work
 * @author Mamedov Vyacheslav
 * @version 1.0
 */
public class arrayHolderDemo {

    public void runningProgramm(byte keyVolume){
        arrHolder iMas = new arrHolder();
        if (keyVolume == 0){
            System.out.print("Enter count elements your Array: ");
            Scanner col = new Scanner(System.in);
            String Col = col.next();
            int[] myArr = new int[Integer.parseInt(Col)];
            iMas.iMasCreate(myArr);
            iMas.outMass(myArr);
        }
        if (keyVolume == 1){

        }
        if (keyVolume == 2){

        }
        if (keyVolume == 3){

        }
        if (keyVolume == 4) {

        }
        if (keyVolume == 5){

        }
    }
}
