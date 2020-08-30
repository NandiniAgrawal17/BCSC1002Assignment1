/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

public class Library {
    // field
    private Book[] store;


    //constructor,at least 1
    public Library() {
        this.store = new Book[5];
        for (int i = 0; i < store.length; i++) {
            store[i] = new Book();

        }
    }

    //getter

    public Book[] getStore() {
        return store.clone(); //.clone() will return a copy of array ,
        //no the array reference itself.
    }

    //setter
    public void setStore(Book[] store) {
        this.store = store;
    }
}
