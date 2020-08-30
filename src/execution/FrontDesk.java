/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Student;

import java.util.Scanner;

public class FrontDesk {

    private static final int ADD_BOOK = 1;
    private static final int RETURN_BOOK = 2;
    private static final int LIST_OF_ISSUED_BOOK = 3;
    private static final int EXIT = 6;
    private static String name;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Student myLibrary = new Student();
        do {
            System.out.println("-=-=--=-=-\"Welcome To The Front Desk\"-=-=--=-=-\n" + "How may I help you today?");
            System.out.println("1.  Issue a new book for me. ");
            System.out.println("2.  Return a previously issues book for me.");
            System.out.println("3. Show me all my issues books. ");
            System.out.println("4.Exit. ");
            System.out.println("Enter your choice (1...4): ");
            studentInput = scanner.nextInt();
            switch (studentInput) {
                case ADD_BOOK:
                    System.out.println("Enter the name of the book you want to issue: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    myLibrary.addBook(name);
                    break;
                case RETURN_BOOK:
                    System.out.println("Enter the name of the book you want to return: ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    Student.doReturn(name);
                    break;
                case LIST_OF_ISSUED_BOOK:
                    System.out.println("List of all the books ");
                    scanner.nextLine();
                    name = scanner.nextLine();
                    myLibrary.listOfIssuedBook();
                    break;
                default:
                    break;
            }
        } while (studentInput != EXIT);
        scanner.close();
    }

}

