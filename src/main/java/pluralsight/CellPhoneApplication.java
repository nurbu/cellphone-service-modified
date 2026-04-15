package pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        // Make an instance of a CellPhone
        Scanner scanner = new Scanner(System.in);

        // Create a CellPhone instance called newPhone

        CellPhone newPhone1 = new CellPhone();
        CellPhone newPhone2 = new CellPhone();

        int serialNumber1;
        String model1;
        String carrier1;
        String phoneNumber1;
        String owner1;

        int serialNumber2;
        String model2;
        String carrier2;
        String phoneNumber2;
        String owner2;


        // Questions to create instance

        // newPhone1

        System.out.println("New phone 1");
        System.out.print("What is the serial number? ");
        serialNumber1 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the model? ");
        model1 = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier1 = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber1 = scanner.nextLine();
        System.out.print("Who is the owner of the service? ");
        owner1 = scanner.nextLine();

        // newPhone2

        System.out.println("New phone 2");
        System.out.print("What is the serial number? ");
        serialNumber2 = scanner.nextInt();
        scanner.nextLine();
        System.out.print("What is the model? ");
        model2 = scanner.nextLine();
        System.out.print("Who is the carrier? ");
        carrier2 = scanner.nextLine();
        System.out.print("What is the phone number? ");
        phoneNumber2 = scanner.nextLine();
        System.out.print("Who is the owner of the service? ");
        owner2 = scanner.nextLine();


        //Used Setters to add the user's inputs.
        newPhone1.setSerialNumber(serialNumber1);
        newPhone1.setModel(model1);
        newPhone1.setCarrier(carrier1);
        newPhone1.setPhoneNumber(phoneNumber1);
        newPhone1.setOwner(owner1);

        newPhone2.setSerialNumber(serialNumber2);
        newPhone2.setModel(model2);
        newPhone2.setCarrier(carrier2);
        newPhone2.setPhoneNumber(phoneNumber2);
        newPhone2.setOwner(owner2);
        // Printing phone information
        display(newPhone1);
        display(newPhone2);

        //Calling phones
        newPhone1.dial(newPhone2.getPhoneNumber());
        newPhone2.dial(newPhone1.getPhoneNumber());

        scanner.close();
    }

    public static void display(CellPhone phone) {
        // Used Getters to output information about newPhone
        System.out.println(phone.getSerialNumber());
        System.out.println(phone.getModel());
        System.out.println(phone.getCarrier());
        System.out.println(phone.getPhoneNumber());
        System.out.println(phone.getOwner());
    }
}
