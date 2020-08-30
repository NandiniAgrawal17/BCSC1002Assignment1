/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;

import java.util.Arrays;
import java.util.Objects;

public class Student {
    //fields
    private String nameOfTheStudent;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] nameOfTheBookIssuedByTheStudent;

    public Student() {
        this.nameOfTheBookIssuedByTheStudent = new Book[5];
     for (int i = 0; i < nameOfTheBookIssuedByTheStudent.length; i++) {
     nameOfTheBookIssuedByTheStudent[i] = new Book();
     }
     }



     //
     public Book[] getNameOfTheBookIssuedByTheStudent() {
     return nameOfTheBookIssuedByTheStudent.clone(); //.clone() will return a copy of array ,
     //no the array reference itself.
     }

     public void setNameOfTheBookIssuedByTheStudent(Book[] nameOfTheBookIssuedByTheStudent) {
     this.nameOfTheBookIssuedByTheStudent = nameOfTheBookIssuedByTheStudent;
     }

     public String getNameOfTheStudent() {
     return nameOfTheStudent;

     }

     public void setNameOfTheStudent(String nameOfTheStudent) {

     this.nameOfTheStudent = nameOfTheStudent;
     }

     public long getUniversityRollNumber() {

     return universityRollNumber;
     }

     public void setUniversityRollNumber(Long universityRollNumber) {
     this.universityRollNumber = universityRollNumber;
     }
     //toString()

     public int getNumberOfBooksIssued() {
     return numberOfBooksIssued;
     }
     //hashcode

     public void setNumberOfBooksIssued(int numberOfBooksIssued) {
     this.numberOfBooksIssued = numberOfBooksIssued;
     }

    @Override
    public String toString() {
        return "Student{" +
                "nameOfTheStudent='" + nameOfTheStudent + '\'' +
                ", universityRollNumber=" + universityRollNumber +
                ", numberOfBooksIssued=" + numberOfBooksIssued +
                ", nameOfTheBookIssuedByTheStudent=" + Arrays.toString(nameOfTheBookIssuedByTheStudent) +
                '}';
    }
    //methods


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getUniversityRollNumber() == student.getUniversityRollNumber() &&
                getNumberOfBooksIssued() == student.getNumberOfBooksIssued() &&
                Objects.equals(getNameOfTheStudent(), student.getNameOfTheStudent()) &&
                Arrays.equals(getNameOfTheBookIssuedByTheStudent(), student.getNameOfTheBookIssuedByTheStudent());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getNameOfTheStudent(), getUniversityRollNumber(), getNumberOfBooksIssued());
        result = 31 * result + Arrays.hashCode(getNameOfTheBookIssuedByTheStudent());
        return result;
    }

    /**
     * This method will allow  a student to issue the book.
     *
     * @param name The name of the book to be issued.
     */
    public void addBook(String name) {
        System.out.println("\"" + name + "\"Book is issued.");
    }


    /**
     * This method will allow student to return a book.
     *
     * @param name The name of the book that the student want to return.
     */

    public static void doReturn(String name) {
        System.out.println("Thank you for returning book\"" + name + "\".");

    }

    /**
     * This method will print a list of issued book.
     */

    public void listOfIssuedBook() {
        for (Book book : this.nameOfTheBookIssuedByTheStudent) {
            System.out.println(book);

        }
    }
}