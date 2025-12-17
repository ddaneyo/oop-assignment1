import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("enter your name: ");
       String name = input.nextLine();
       System.out.print("enter your  age: ");
       int age = input.nextInt();
       System.out.print("are you kind ?: ");
       boolean iskind = input.nextBoolean();
       human justrandomhuman = new human (age, name, iskind);
       employee randomemployer = new employee (35, "Henry", false, "The upside down", 0.0f);
       student randomstudent = new student ( 18, "Lucas","Hawkins", true, 100.0f);
       System.out.println(randomemployer.getName() + " graduated from " + randomemployer.getuniversityname() + " and he is " + randomemployer.getAge());
       System.out.println(justrandomhuman.aboutyou());
       System.out.println(randomstudent.aboutyou());
       System.out.println(randomstudent.thiiisold());
       randomstudent.setscholarship( 2000.0f);
       System.out.println( "Horay students are not poor anumore! Scholarship now is " + randomstudent.getscholarship() + " dollars ");



    }

}