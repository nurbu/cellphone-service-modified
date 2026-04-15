package pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Make an instance of a CellPhone

        int serialNumber;
        String model;
        String carrier;
        String phoneNumber;
        String owner;

        Scanner scanner = new Scanner(System.in);

        // Questions to create instance

        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the model? ");
        model = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        System.out.print("Who is the owner of the service? \n");
        owner = scanner.nextLine();

        // Create a CellPhone instance called newPhone
        CellPhone newPhone = new CellPhone();

        //Used Setters to add the user's inputs.
        newPhone.setSerialNumber(serialNumber);
        newPhone.setModel(model);
        newPhone.setCarrier(carrier);
        newPhone.setPhoneNumber(phoneNumber);
        newPhone.setOwner(owner);

        System.out.println("My new phone information: ");

        // Used Getters to output information about newPhone
        System.out.println(newPhone.getSerialNumber());
        System.out.println(newPhone.getModel());
        System.out.println(newPhone.getCarrier());
        System.out.println(newPhone.getPhoneNumber());
        System.out.println(newPhone.getOwner());

        scanner.close();

    }
}
