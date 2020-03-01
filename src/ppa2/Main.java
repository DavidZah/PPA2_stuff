package ppa2;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Vlasntě napsán nefektivní dynamické pole protože "rádoby požadavky PPA2"
 * !!Vysoce nefektivní pouze pro účeli PPA2!!
 *
 * @author David Žahour
 */
class dynamicArray {

    private int intArray[];

    public dynamicArray(int array[]) {
        this.intArray = array;
    }

    public void pop(int x) {

        int y = this.intArray.length + 1;
        int[] array = new int[y];
        for (int i = 0; i < intArray.length; i++) {
            array[i] = intArray[i];
        }
        array[intArray.length] = x;
        intArray = array;
    }

    int[] getArray() {
        return this.intArray;
    }
}

    /**
     * Nedokončená funkce pro načtení dat
     */
    static void loadData() throws IOException {
        String fileName = "C:\\Users\\David\\Documents\\Exercise01\\seq1.txt";
        File file = new File(fileName);
        Scanner sc = new Scanner(file);
        String line;


        while (sc.hasNextInt()) {

        }
    }


public class Main {

    public static void main(String[] args) {
        System.out.println("I this will help");
    }
}
