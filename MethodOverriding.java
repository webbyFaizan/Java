public class MethodOverriding {
    public static void main(String[] args) {
        Avenger a = new Avenger();
        a.attack();

        Antman am = new Antman();
        am.attack();
    }   
}

class Avenger{
    void attack(){
        System.out.println("Avengers on Attack");
    }
}

class Antman extends Avenger{
    void attack(){
        System.out.println("Antman on Attack");
    }
}
