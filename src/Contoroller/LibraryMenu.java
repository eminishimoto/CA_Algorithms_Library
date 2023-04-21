/* This LibraryMenu illustrate Controll of Menu
 * 
 * 
 */
package Contoroller;

import Library.InputUtilsLB;
import Library.Library;
import Models.Book;
import Models.BorrowingList;
import Models.Searching;
import Models.Sorting;
import Models.Student;
import Models.WaitingList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author emi
 */
//menue methods 
public class LibraryMenu {

    //Read files  
    Readfiles RF = new Readfiles(); //?new Readfiles is better?

    ArrayList<Book> books = RF.loadData(); //store the Bookrecord from Readfile in books to make it work in this clas
    ArrayList<Student> students = RF.loadData2();//store the Studentrecord       

    InputUtilsLB myInput = new InputUtilsLB();
    Scanner myKB = new Scanner(System.in);//Scanner
   

    
    // Show welcome message  
    public LibraryMenu() { //void or String?

        System.out.println(
                "********************Welcome to the Library!********************");
        System.out.println(
                "                                                               ");
        System.out.println(
                "***************************************************************");
    }

    //ask password for login
    public void password() {

        String password;//store password

        System.out.println("\n Enter the password to login:");//output question

        password = myKB.nextLine();//store input = password

        if (password.length() < 4) {
            System.out.println("\nInvaild. At least 4 characters.");
        } else {
            System.out.println("\n...Password valid \n");
        }
    }

    // Display option. used inseide optionSwitch() method
    public void dispMenu() {

        System.out.println(
                "  \n               Select From The Following Options               ");
        System.out.println(
                "---------------------------------------------------------------");
        System.out.println("Enter 0 -- Exit Application");
        System.out.println("Enter 1 -- Search a Book");
        System.out.println("Enter 2 -- Sort Books");
        System.out.println("Enter 3 -- Search a Student");
        System.out.println("Enter 4 -- Sort a Student");
        System.out.println("Enter 5 -- Register a student has borrowed a book");
        System.out.println("Enter 6 -- Register a student has returned a book");
        System.out.println("Enter 7 -- Student book borrowing history");
        System.out.println("---------------------------------------------------------------");
    }

//REFERENCEhttps://codereview.stackexchange.com/questions/206615/a-student-library-program-in-java
// https://www.scribd.com/document/636334916/20MID0209-JAVA-DA-1#  
//https://www.geeksforgeeks.org/library-management-system-using-switch-statement-in-java/
    
    //Ask user to select from above optuons using switch  
    public void optionSwitch() {
        // Creating object of Scanner class to take input from user 
        Scanner input = new Scanner(System.in);
        // Creating object of book class
        Book ob = new Book();
        // Creating object of students class
        Student obStudent = new Student();

        Searching mySearch = new Searching();
        
                     Library myl =new Library();
                     BorrowingList bwl  = new BorrowingList();
                     WaitingList wl = new WaitingList();

// 
        int choice;
        int searchChoice1;
        int searchChoice3;
        // Creating menu
        // using do-while loop
        do {

            dispMenu();//above
            System.out.print("Enter an option: ");
            choice = input.nextInt();

            // Switch case
            switch (choice) {
               
                //Exit from library menu
               case 0:

                    System.out.println("...Exit program");
                    break;

                // Linearsearch
                case 1:
                    System.out.println(" press 1 to Search Book by Title");
                    System.out.println(" Press 2 to Search Book by Author Name");
                    searchChoice1 = input.nextInt();

//                // Nested switch
                    switch (searchChoice1) {
// 
//                    // Case
                        case 1:
                            //instead of this, could make this as a method in Searching class? mySearch.callmethod           
                            String calling10 = myInput.getUserText("\n Which Title would you like to search?");
                            String lineaResult1 = mySearch.linearSearchbytitle(books, calling10);//store the result from Searching class 
                            System.out.println("\n" + lineaResult1);//result
                            break;
// 
//                    // Case
                        case 2:
                            String calling11 = myInput.getUserText("\n Which Author name would you like to search?");
                            String lineaResult2 = mySearch.linearSearchbyname(books, calling11);
                            System.out.println("\n" + lineaResult2);//result
                    }
                    break;

                // Sort
                case 2:
                Sorting bubble = new Sorting(); //new object

                    Book[] bookArr = new Book[books.size()]; // creating array of books
                    //for loops to get every book for the new array
                    for (int i = 0; i < books.size(); i++) {

                        bookArr[i] = books.get(i);
                    }
                    bubble.bubbleSort(bookArr); //calling method to sort the array
                    //looping through the sorted array to get what's needed
                    for (Book b : bookArr) {
                        System.out.println("Title: " + b.getBook_title());
                        System.out.println(" Written By : " + b.getAuthor_first_name() + " " + b.getAuthor_last_name());
                    }
                    break;


//              // Linearsearch 
//                            // Case
                case 3:
                    System.out.println(" press 1 to Search Student by ID");
                    System.out.println(" Press 2 to Search Student by Name");
                    searchChoice3 = input.nextInt();
// 
//                // Nested switch
                    switch (searchChoice3) {
// 
//                    // Case
                        case 1:
                            String calling13 = myInput.getUserText("\n Which Student id  would you like to search?");
                            String lineaResult4 = mySearch.linearSearchbyStudentId(students, calling13);
                            System.out.println("\n" + lineaResult4);
                            break;
//                    // Case
                        case 2:
                            String calling12 = myInput.getUserText("\n Which Student name would you like to search?");
                            String lineaResult3 = mySearch.linearSearchbyStudentname(students, calling12);//store the result from Searching class 
                            System.out.println("\n" + lineaResult3);

                    }
                    break;

                // Sort
//             // Case
                case 4:
                    Sorting insert = new Sorting(); //new object

                    Student[] studentArr = new Student[students.size()]; //creating new object for array of students
                    //for to get every student for the new array
                    for (int i = 0; i < students.size(); i++) {
                        studentArr[i] = students.get(i);//populates student
                    }
                    insert.insertionSort(studentArr); //calling method
                    Student student = null;         //new object to hold the student which is being processed
                    //loops through sorted array
                    for (Student s : studentArr) {
                        if (student == null || !student.toStringfirstName().equals(s.toStringfirstName())) {
                            System.out.println("Student first Name: " + s.toStringfirstName());
                            System.out.println(" Students full Name: " + s.getStudentFullname()+ " " + " Students Id: " + s.getStudentId());
                            
                        }
                        student = s;
                    }
                    break;


                // Case Register borrowing
                case 5:
                             
         System.out.println("This is the empty borrowinglist :" + bwl.toString());
         
  
        //check borrowed status
        boolean register1 = bwl.isBorrowed();
        System.out.println(" Is this book borrowed?" +register1);
        
//        //abut borrowing
       String calling4 = myInput.getUserText("Input book ID");
       bwl.setBookid(calling4);//want to add book to borrowing list for specific student
       
       String calling5 = myInput.getUserText("Input student ID");
       bwl.setStudentId(calling5);
              //generate BorrowID for this student
       bwl.generateBorrowID();
       
       //change borrowedstatus = this book is borrowed now
       bwl.bookborrowed();
       System.out.println("Book borrowed " );
               
       //show the borrowinglist again
       System.out.println("This is the updated borrowinglist :" + bwl.toString());
       
        ArrayList<BorrowingList> bArray = new ArrayList<BorrowingList>();
       System.out.println("Added to borrowing list : " + bArray.add(bwl));
        System.out.println(bArray.toString());
//                             String lineaResult9 = myl.registerBorrow(borrowed, waitinglist, bookid, studentId);
//                            System.out.println("\n" + lineaResult9);
                    break;
// 
                // Case
                case 6:
//                obStudent.showAllStudents();
        Scanner myInput = new Scanner(System.in);
//        String borrowID, String studentId, String bookid;
//        System.out.println("Input book ID");
//          bookid = myInput.nextLine();
//        System.out.println("Input student ID:");
//        studentId = myInput.nextLine();
//
//        for (BorrowingList bwl : borrowed) {
//            if (bwl.getBookid().equals(bookid) && bwl.isBorrowed()== true) {
//                
//                System.out.println("Book is already borrowed.");
//                System.out.println("Please add the student to the waiting list.");
//                
//                 WaitingList wl = new WaitingList();
//                    wl.Enqueue(studentId);
//                    System.out.println("added to the waiting list.");
//                    return;
//                } else {
//                    return;
//                }
//            }
        
                    break;
// 
                // Case
                case 7:
//                obStudent.checkOutBook(ob);
                    break;


                // Default case that will execute for sure
                // if above cases does not match
                default: 

                    // Print statement
                    System.out.println("Invalid. ENTER BETWEEN 0 TO 7");
            }

// 
//       
//        // until input=0(exit), menu repeats
//    
        } while (choice != 0);

    }

}
