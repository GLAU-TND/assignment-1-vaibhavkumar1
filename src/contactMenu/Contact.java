package contactMenu;

import java.util.LinkedList;

public class Contact implements Comparable<Contact> {

    private LinkedList<Integer> mobileNo;
    private String name;
    private String lastName;
    private Contact contact;
    private String email;

    @Override
    public int compareTo(Contact o) {
        return 0;
    }
}
