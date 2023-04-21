/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Anny
 */
//Reference https://www.geeksforgeeks.org/comparable-interface-in-java-with-examples/
//Reference https://stackoverflow.com/questions/311276/problem-replacing-words-using-a-za-z-regex
public class Sorting {
        //method returns array of books
       public Book[] bubbleSort(Book[] array) {
        System.out.println("-----------");
        System.out.println("-- Bubble Sort starting by Book Title--"); // print line
        //declaring two variables
        Book temp;          //temporary variable used for swapping
        boolean swap = false;   //to tell whether the swap was made or not
        
        do {
            swap = false;   //loops till the swap is not made

            for (int j = 0; j < array.length - 1; j++) {
                if (array[j].toStringBookTitle().replaceAll("[^a-zA-Z]", "").toLowerCase().compareTo(array[j + 1].toStringBookTitle().replaceAll("[^a-zA-Z]", "").toLowerCase()) > 0) {
                   //comapring index j to the next index, droping non alphabethic charactors
                    temp = array[j];
                    array[j] = array[j + 1]; //swapping values here
                    array[j + 1] = temp;
                    swap = true;
                }
            }
        } while (swap); //do -while loop ends here
        return array;   // returning array
       }
 
       
         //method returns array of students
         public Student[] insertionSort(Student[]array){
         System.out.println("-----------");
         System.out.println("--Insertion Sort starting by Student Name--");
         //for loop going through array
         for (int i = 1; i<array.length; i++){
            Student keyElement=array[i]; //temporary variable 
            int pos = i; //current element position
            //While loop goes through checking where the keyElement belongs
            while(pos>0 && array[pos - 1].toStringfirstName().toLowerCase().compareTo(keyElement.toStringfirstName().toLowerCase())>0){
                array[pos] = array[pos -1]; //if condition is true position changes
                pos=pos-1;                  //pos becomes pos-1             
            }
            array[pos] = keyElement;        //when the right place is found than insert
        }
        
            System.out.println("--Array Sorted--");
            System.out.println("-----------");
            return array;
    }
           
            
        

        
         }
             