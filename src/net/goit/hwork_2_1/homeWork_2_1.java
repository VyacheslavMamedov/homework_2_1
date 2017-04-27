package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * Main class describing home work
 * @author Mamedov Vyacheslav
 * @version 1.0
 */
public class homeWork_2_1 {

    public static void main(String[] args) {
        boolean controlExit  = false;
        arrayHolderDemo startProg = new arrayHolderDemo();
        while (controlExit!=true){
            startProg.mainMenu();
            Scanner pressButton = new Scanner(System.in);
            String pressbutton = pressButton.next();
            switch (Integer.parseInt(pressbutton)){
            case   1: {
                startProg.runningProgramm((byte) 1);
                controlExit = false;
                break;
            }
            case 2: {
                startProg.runningProgramm((byte) 2);
                controlExit = false;
                break;
            }
            case 3: {
                 startProg.runningProgramm((byte) 3);
                 controlExit = false;
                 break;
                }
            case 4: {
                startProg.runningProgramm((byte) 4);
                controlExit = false;
                break;
                }
            case 5: {
                startProg.runningProgramm((byte) 5);
                controlExit = false;
                break;
                }
            case 6: {
                startProg.runningProgramm((byte) 6);
                controlExit = false;
                break;
                }
            case 7: {
                startProg.runningProgramm((byte) 7);
                controlExit = false;
                break;
                }
            case 8: {
                controlExit = true;
                break;
                }
            }
        }

    }
}

