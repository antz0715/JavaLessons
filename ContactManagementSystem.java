import java.util.ArrayList;
import java.util.Scanner;

class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Phone Number: " + phoneNumber + ", Email: " + email;
    }
}

class ContactManager {
    private ArrayList<Contact> contacts;

    public ContactManager() {
        contacts = new ArrayList<>();
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    public void updateContact(int index, Contact contact) {
        if (index >= 0 && index < contacts.size()) {
            contacts.set(index, contact);
        } else {
            System.out.println("Invalid contact index.");
        }
    }

    public void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
        } else {
            System.out.println("Invalid contact index.");
        }
    }
}

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactManager manager = new ContactManager();

        while (true) {
            System.out.println("\nContact Management System");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Update Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter phone number: ");
                    String phoneNumber = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    Contact newContact = new Contact(name, phoneNumber, email);
                    manager.addContact(newContact);
                    System.out.println("Contact added.");
                    break;
                case 2:
                    manager.viewContacts();
                    break;
                case 3:
                    manager.viewContacts();
                    System.out.print("Enter the index of the contact to update: ");
                    int updateIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new phone number: ");
                    String newPhoneNumber = scanner.nextLine();
                    System.out.print("Enter new email: ");
                    String newEmail = scanner.nextLine();
                    Contact updatedContact = new Contact(newName, newPhoneNumber, newEmail);
                    manager.updateContact(updateIndex, updatedContact);
                    System.out.println("Contact updated.");
                    break;
                case 4:
                    manager.viewContacts();
                    System.out.print("Enter the index of the contact to delete: ");
                    int deleteIndex = scanner.nextInt() - 1;
                    scanner.nextLine(); // Consume newline
                    manager.deleteContact(deleteIndex);
                    System.out.println("Contact deleted.");
                    break;
                case 5:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
