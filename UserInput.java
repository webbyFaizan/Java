import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullname = sc.nextLine();

        System.out.println("Enter your nickname");
        String nickname = sc.next();
        sc.nextLine();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Enter your phone number: ");
        long phone = sc.nextLong();

        System.out.println("Enter your height: ");
        float height = sc.nextFloat();

        System.out.println("Enter your CGPA: ");
        double cgpa = sc.nextDouble();

        System.out.println("Are you a student? (true/false): ");
        boolean isSudent = sc.nextBoolean();

        System.out.println("Enter a small number: ");
        byte smallNumber = sc.nextByte();

        System.out.println("Enter a medium number: ");
        short mediumNumber = sc.nextShort();

        System.out.println("Enter your grade (A/B/C...): ");
        char grade = sc.next().charAt(0);

        System.out.println("Full Name: " + fullname);
        System.out.println("Nickname: " + nickname);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phone);
        System.out.println("Height: " + height);
        System.out.println("CGPA: " + cgpa);
        System.out.println("Student: " + isSudent);
        System.out.println("Small number: " + smallNumber);
        System.out.println("Medium Number: " + mediumNumber);
        System.out.println("Grade: " + grade);

        sc.close();
    }
}
