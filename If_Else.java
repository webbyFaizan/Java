public class If_Else {
    public static void main(String[] args) {
        System.out.println("------Normal if else condition------");
        if(5 < 4){
            System.out.println("Greater");
        }else{
            System.out.println("Smaller");
        }

        System.out.println();

        System.out.println("------Nested if else statement------");
        if(5 < 4){
            System.out.println("5 is greater");
        }if(6 < 7){
            System.out.println("6 is smaller");
        }else{
            if(7 > 8){
                System.out.println("7 is smaller");
            }else{
                System.out.println("8 is greater");
            }
        }
        
        System.out.println();

        System.out.println("------licence if else condition------");
        int age = 20;
        boolean license = false;

        if(age >= 18){
            if(license){
                System.out.println("You are eligible to drive.");
            }else{
                System.out.println("You are of legal age, but you don't have a driver's license.");
            }
        }else{
            System.out.println("You are too young to drive.");
        }
    }

}
