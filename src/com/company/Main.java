
package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);
    private static char[] charArray1 = {'s', 't', 't', 'i', 'i', 's'};
    private static char[] charArray2 = {'s', 'i', 'n', 'g'};
    private static char[] charArray3 = {'0', '0', '0'};

    public static void main(String[] args) {

        String input = "test";
        String[] inputArray = new String[3];
        System.out.println("Enter some stuff");
        //input = scan.next();
        charArray3 = createArrayFromInput(input, inputArray);
        
        
        arrayPrinter(charArray3, "input");
        System.out.println(detectTInArray(charArray1));
       
       
        isIdentical(charArray1, charArray2);
        charChanger(charArray1);

        while(swapArrayElements(charArray3));
        arrayPrinter(charArray3, "e)");
    }
    //IUUIppgift A0, hittar 't'
    public static boolean detectTInArray(char[] array){
        for(int i = 0; i < array.length; i++){
            
        }
        for(int i = 0; i < array.length; i++){
            if(array[i] == 't') {
                arrayPrinter(array, "0)");
                toUppercase(array);
                doubleDelete(array, "remove");
                return true;
            }
        }
        doubleDelete(array, "remove");
        return false;
    }
    //Uppgift a) ändrar r till t    
    public static void charChanger(char[] array){
        for(int i = 0; i < array.length; i++){
            if(array[i] == 'r'){
                array[i] = 't';
                System.out.println("changed array "+ array[i]);
                arrayPrinter(array, "a)");
            }
            
        }
    }
    //Uppgift 0.5) printar arrays
    public static void arrayPrinter(char[] array, String message){
        System.out.println(message);
        for(int i = 0; i < array.length; i++)
        System.out.println(array[i]);
    }

    //Uppgift b) ändrar t till T
    public static void toUppercase(char[] array) {
        for(int i = 0 ; i < array.length; i++){
            if(array[i] == 't') {
                array[i] = 'T';
            }
        }
    }
    //uppgift c)
    public static void doubleDelete(char[] array, String message){
        //Byter ut dubletter till '0'
        int newLength = array.length;
        for(int i = 0; i < array.length-1; i++){
            for(int j = i + 1; j < array.length; j++) {
                if(array[i] == array[j] && array[i] != '0') {
                    array[j] = '0';
                    newLength--;
                }
            }
        }
        
        //Skapar ny array utan '0'/dubeletter
        char[] newArray = new char[newLength];
        int newArrayIndex = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i] != '0') {
                newArray[newArrayIndex] = array[i];
                newArrayIndex++;
            }
        }
        array = newArray;
        arrayPrinter(array, "c)");
    }
    //Uppgift d)        
    public static boolean isIdentical(char[] array1, char[] array2){
        //kontrollerar arraylängd, om dem är olika långa är dem ej identiska
        if(array1.length != array2.length) {
            return false;
        }
        //kontrollerar varje element, om dem är olika returneras false
        for(int i = 0; i<array1.length; i++) {
            if(array1[i] != array2[i]) {
                return false;
            }
        }
        //om inga olikheter hittas returneras true
        return true;
    }
    //uppgift e), skapar array utav dem första 3 charsen i inputen
    public static char[] createArrayFromInput(String input, String[] inputArray) {
        char[] array = new char[3];
        inputArray = input.split("");
        for(int i = 0; i < Math.min(3, input.length()); i++) {
            array[i] = inputArray[i].charAt(0);
        }
        return array;
    }
    //uppgift e), lägger charsen i platsen angivet i inputen
    public static boolean swapArrayElements(char[] array){
        char[] tempArray = new char[3];
        for(int i = 0; i < array.length; i++) {
            System.out.print("Position for: " + array[i]);
            try {
                int newPosition = scan.nextInt();
                tempArray[newPosition] = array[i];
            } catch (InputMismatchException e) {
                return false;
            }
        }
        charArray3 = tempArray;
        return true;
    }
        
}