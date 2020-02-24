package contactMenu;

import java.util.LinkedList;
import java.util.Scanner;

public class ContactMenuMethod {
    private LinkedList<Integer> mobileNo;
    private Contact contact;
    private String email;
    private LinkedList<Contact> list = new LinkedList<>();

    public void addContact() {
        Scanner scan = new Scanner(System.in);
        System.out.println("You have chosen to add a new contact: \n" +
                "Please enter the name of the Person");
        System.out.print("First Name:");
        String name = scan.next();
        System.out.print("Last Name: ");
        String lastName = scan.next();
        System.out.print("Enter Mobile No:");
        mobileNo = new LinkedList<>();
        mobileNo.add(scan.nextInt());
        addMobile();
        addemail();
        Contact contact = new Contact(name, lastName, email, mobileNo);
        list.add(contact);
        Collections.sort(list);

    }
}
