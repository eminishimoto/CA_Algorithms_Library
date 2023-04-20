/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Anny
 */
public class Sorting {
    
       public Book[] bubbleSort(Book[] array) {
        System.out.println("-----------");
        System.out.println("-- Bubble Sort starting by Book Title--");

        Book temp;
        boolean swap = false;
        do {
            swap = false;

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].toStringBookTitle().replaceAll("[^a-zA-Z]", "").toLowerCase().compareTo(array[j + 1].toStringBookTitle().replaceAll("[^a-zA-Z]", "").toLowerCase()) > 0) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }
        } while (swap);
        return array;
       }
//        public Student[] bubbleSort1(Student[] array) {
//        System.out.println("-----------");
//        System.out.println("-- Bubble Sort starting by Book Title--");
//
//        Student temp;
//        boolean swap = false;
//        do {
//            swap = false;
//
//            for (int j = 0; j < array.length - 1; j++) {
//                if (array[j].toString().toLowerCase().compareTo(array[j + 1].toString().toLowerCase()) > 0) {
//                    temp = array[j];
//                    array[j] = array[j + 1];
//                    array[j + 1] = temp;
//                    swap = true;
//                }
//            }
//        } while (swap);
//        return array;
//       } 
       
    
         public Student[] insertionSort(Student[]array){
         System.out.println("-----------");
         System.out.println("--Insertion Sort starting by Student Name--");

         for (int i = 1; i<array.length; i++){
            Student keyElement=array[i];
            int pos = i;
            while(pos>0 && array[pos - 1].toStringfirstName().toLowerCase().compareTo(keyElement.toStringfirstName().toLowerCase())>0){
                array[pos] = array[pos -1];
                pos=pos-1;                               
            }
            array[pos] = keyElement;
        }
        
            System.out.println("--Array Sorted--");
            System.out.println("-----------");
            return array;
    }
           
            
        

        
         }
             