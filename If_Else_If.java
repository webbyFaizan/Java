public class If_Else_If {
    public static void main(String[] args) {
        System.out.println("------1. elif statement------");
        if(5 < 4){
            System.out.println("5 is greater");
        }else if(4 < 3){
            System.out.println("$ is greater");
        }else if(6 > 7){
            System.out.println("6 is smaller");
        }else{
            System.out.println("7 is greater");
        }
        System.out.println();

        System.out.println("------2. elif statement------");

        int grade = 80;  
        if(grade >= 90){
            System.out.println("A Grade");
        }else if(grade >= 80){
            System.out.println("B Grade");
        }else if(grade >= 70){
            System.out.println("C Grade");
        }else if(grade >= 60){
            System.out.println("D Grade");
        }else if(grade >=50){
            System.out.println("E Grade");
        }else{
            System.out.println("Failed");
        }

        System.out.println();

        System.out.println("------3. Even Odd Example------");

        int num = 2;
        if(num%2==0){
            System.out.println("Even Number");
        }else{
            System.out.println("Odd Number");
        }

        System.out.println();

        System.out.println("------4. Divisible by 3 & 5 Example------");
        int num1 = 15;
        if(num1%3==0 && num1%5==0){
            System.out.println("Divisible by both");
        }else if(num1%3==0){
            System.out.println("Divisible by 3");
        }else if(num1%5==0){
            System.out.println("Divisible by 5");
        }else{
            System.out.println("Divisible by none");
        }
    }
}
