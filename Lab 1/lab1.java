import java.util.Scanner;
public class lab1{
    public static void main(String[]args){
        Scanner scan= new Scanner (System.in);
        System.out.println("Enter employee name: ");
        String nm= scan.nextLine();
        System.out.println("Enter employee age: ");
        int age= Integer.parseInt(scan.nextLine());

        System.out.println("Enter employee gender (m for Male and f for Female): ");
        String g= scan.nextLine();
        String gen="";
        if(g.equals("m") || g.equals("M"))
        gen="Male";
        if(g.equals("f") || g.equals("F"))
        gen="Female";

        System.out.println("Enter the state to which the employee belongs: ");
        String s= scan.nextLine();
        String s1= s.toLowerCase();
        System.out.println("Enter 1 if employee belongs to companies like Facebook, Google, Microsoft, Samsung, IBM, Apple: ");
        int comp= Integer.parseInt(scan.nextLine());

        System.out.println("\nEmployee details:");
        System.out.println("Name: "+nm+"\nAge: "+age+"\nGender: "+gen);
        if(comp==1)
        System.out.println("The employee is working in Top MNC Companies.");
        else
        System.out.println("The employee is not working in Top MNC Companies.");

        switch(s1){
            case "jammu and kashmir":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "himachal pradesh":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "uttar pradesh":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "uttarakhand":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "rajasthan":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "punjab":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;
            case "haryana":
            System.out.println("The Employee is from the Northern states of India; Preferable work location is in "+s);
            break;

            case "karnataka":
            System.out.println("The Employee is from the Southern states of India; Preferable work location is in "+s);
            break;
            case "andhra pradesh":
            System.out.println("The Employee is from the Southern states of India; Preferable work location is in "+s);
            break;
            case "telangana":
            System.out.println("The Employee is from the Southern states of India; Preferable work location is in "+s);
            break;
            case "kerela":
            System.out.println("The Employee is from the Southern states of India; Preferable work location is in "+s);
            break;
            case "tamil nadu":
            System.out.println("The Employee is from the Southern states of India; Preferable work location is in "+s);
            break;

            case "madhya pradesh":
            System.out.println("The Employee is from the Central states of India; Preferable work location is in "+s);
            break;
            case "chattisgarh":
            System.out.println("The Employee is from the Central states of India; Preferable work location is in "+s);
            break;

            case "west bengal":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "odisha":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "jharkhand":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "arunachal pradesh":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "bihar":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "assam":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "meghalaya":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "mizoram":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "manipur":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "nagaland":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "tripura":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;
            case "sikkim":
            System.out.println("The Employee is from the Eastern states of India; Preferable work location is in "+s);
            break;

            case "maharashtra":
            System.out.println("The Employee is from the Western states of India; Preferable work location is in "+s);
            break;
            case "gujarat":
            System.out.println("The Employee is from the Western states of India; Preferable work location is in "+s);
            break;
            case "goa":
            System.out.println("The Employee is from the Western states of India; Preferable work location is in "+s);
            break;

            default:
            System.out.println("An error occurred!!");
            break;
        }
    }
}