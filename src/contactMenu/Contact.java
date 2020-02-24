package contactMenu;

import java.util.LinkedList;

public class Contact implements Comparable<Contact> {

    private LinkedList<Integer> mobileNo;
    private String name;
    private String lastName;
    private Contact contact;
    private String email;

    public Contact(String name, String lastName, String email, LinkedList<Integer> mobileNo) {
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.mobileNo = mobileNo;

    }

    @Override
    public int compareTo(Contact o) {
        return 0;
    }
}
