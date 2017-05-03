package net.goit.hwork_2_1;

import java.util.Scanner;

/**
 * class describing methods Array
 * @author Mamedov Vyacheslav
 * @version 1.0
 */
public class arrHolder {

    private int count;

    private int[] imas = new int[count];


    public int iMasCreate(int imas[]) {
        System.out.println("Выберите метод заполнения массива: ");
        System.out.println();
        System.out.print("1 - автоматически, или 2 - вручную : ");

        Scanner autoMas = new Scanner(System.in);
        String AutoMas = autoMas.next();

        switch (Integer.parseInt(AutoMas)) {

            case 1: {
                //Автоматическое заполнение массива
                for (int i = 0; i < imas.length; i++) {
                    int rCount = -50 + (int) (Math.random() * 90);
                    imas[i] = rCount;
                }
            }
            break;

            case 2: {
                //Ручное заполние массива
                for (int i = 0; i < imas.length; i++) {
                    System.out.print("Ведите " + i + " элемен массива: ");
                    Scanner mas = new Scanner(System.in);
                    int Mas=0;
                    if (mas.hasNextInt()) {
                         Mas = mas.nextInt();
                        imas[i] = Mas;
                    } else {
                        System.out.println("You not enter digital count!!!");
                        i--;
                    }
                }
                break;
            }
            default:
                break;

        }
        return 0;
     }

    public int outMass(int imas[]) {
        System.out.println();
        System.out.println("Ваш массив");

        for (int i = 0; i < imas.length; i++) {
            System.out.print(imas[i] + " ");
        }
        System.out.println();
        return 0;
    }

    public int sortMassIncrease(int imas[]) {

        int[] imas2 = new int[imas.length];

        for (int i = 0; i < imas.length; i++) {
            imas2[i] = imas[i];
        }

        for (int i = imas2.length - 1; i >= 2; i--) {
            boolean sort = true;

            for (int j = 0; j < i; j++) {
                if (imas2[j] > imas2[j + 1]) {
                    int temp = imas2[j];
                    imas2[j] = imas2[j + 1];
                    imas2[j + 1] = temp;
                    sort = false;
                }
            }
            if (sort) {
                break;
            }
        }
        System.out.println();

        System.out.println("Отсортированный масив");

        for (int i = 0; i < imas2.length; i++) {
            System.out.print(imas2[i] + " ");
        }
        return 0;
    }
    public int sortMassDecrease(int imas[]){

        int[] imas2 = new int[imas.length];

        for (int i = 0; i < imas.length; i++) {
            imas2[i]=imas[i];
        }

        for (int i = imas2.length - 1; i >= 2; i--) {
            boolean sort = true;

            for (int j = 0; j < i; j++) {
                if (imas2[j] < imas2[j+1]) {
                    int temp = imas2[j];
                    imas2[j] = imas2[j+1];
                    imas2[j+1] = temp;
                    sort = false;
                }
            }
            if(sort) {
                break;
            }
        }
        System.out.println();

        System.out.println("Отсортированный масив");

        for (int i = 0; i < imas2.length; i++) {
            System.out.print(imas2[i] + " ");
        }
return 0;
    }

    public int foundNomber (int[] imas, String whyNomber) {
        int maxIndex = 0;
        if (whyNomber == "max") {

            for (int i = 0; i < imas.length; i++) {
                if (imas[maxIndex] < imas[i]) {
                    maxIndex = i;
                }
            }
            } else if (whyNomber == "min") {
            for (int i = 0; i > imas.length; i++) {
                if (imas[maxIndex] < imas[i]) {
                    maxIndex = i;
                }
            }
        } else if (whyNomber=="myVolume") {
            System.out.print("Enter volume: ");

            maxIndex = -1;
            int myvolume =0;
            Scanner myVolume = new Scanner(System.in);
            if (myVolume.hasNextInt()) {
                myvolume = myVolume.nextInt();
            } else System.out.println("You not enter digital count!!!");
            for (int i = 0; i < imas.length; i++) {
                if (imas[i] == myvolume) {
                    maxIndex = i;
                }
            }
        }
         return maxIndex;
    }
}
