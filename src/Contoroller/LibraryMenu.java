/* This LibraryMenu illustrate Controll of Menu
 * 
 * 
 */
package Contoroller;

import Models.Book;
import Models.BorrowingList;
import Models.Student;
import Models.WaitingList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emi
 */
public class LibraryMenu {

    
//void or String?
    public  LibraryMenu() {
        
    
        // Creating object of Scanner class to take input from user 
    Scanner input = new Scanner(System.in);
    
    // Show menu omessage
        System.out.println(
            "********************Welcome to the Library!********************");
        System.out.println(
            "                  Select From The Following Options:               ");
        System.out.println(
            "***************************************************************");
        
//rEFERENCEhttps://codereview.stackexchange.com/questions/206615/a-student-library-program-in-java
// https://www.scribd.com/document/636334916/20MID0209-JAVA-DA-1#  
//later    //??/
//     // Creating object of book class
//        Book ob = new Book();
//    // Creating object of students class
//        Student obStudent = new Student();
// 
//        int choice;
//        int searchChoice1;
//         int searchChoice3;
//        // Creating menu
//        // using do-while loop
//        do {
// 
//            ob.dispMenu();
//            choice = input.nextInt();
// 
//            // Switch case
//            switch (choice) {
//
//            // Case
//            case 1:
//                 System.out.println(" press 1 to Search Book by Title");
//                 System.out.println(" Press 2 to Search Book by Author Name");
//                searchChoice1 = input.nextInt();
// 
//                // Nested switch
//                switch (searchChoice1) {
// 
//                    // Case
//                case 1:
//                    ob.searchBytitle();
//                    break;
// 
//                    // Case
//                case 2:
//                    ob.searchByAuthorName();
//                }
//                break;
//                
//                            // Case
//            case 3:
//                 System.out.println(" press 1 to Search Student by ID");
//                 System.out.println(" Press 2 to Search Student by Name");
//                searchChoice3 = input.nextInt();
// 
//                // Nested switch
//                switch (searchChoice3) {
// 
//                    // Case
//                case 1:
//                    ob.searchByID();
//                    break;
// 
//                    // Case
//                case 2:
//                    ob.searchByName();
//                }
//                break;
// 
//                // Case
//            case 4:
//                ob.showAllBooks();
//                break;
//                
//                // Case
//            case 5:
//                student s = new student();
//                obStudent.addStudent(s);
//                break;
// 
//                // Case
//            case 6:
//                obStudent.showAllStudents();
//                break;
// 
//                // Case
//            case 7:
//                obStudent.checkOutBook(ob);
//                break;
// 
//                // Case
//            case 8:
//                obStudent.checkInBook(ob);
//                break;
//               // Case
//            case 9:
//                obStudent.checkInBook(ob);
//                break;
//                
//                              // Default case that will execute for sure
//                // if above cases does not match
//
//            default:
// 
//                // Print statement
//                System.out.println("ENTER BETWEEN 0 TO 9.");
//            }
// 
//        }
// 
//        // Checking condition at last where we are
//        // checking case entered value is not zero
//        while (choice != 0);
//    
    
    




    }
}