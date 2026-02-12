public class StaticMethod {
    public static void main(String[] args) {
        StaticMethod ironMan = new StaticMethod();
        showPower();
        showName();
        ironMan.showTeam();
    }

    static void showName(){
        System.out.println("I am Iron Man.");
    }

    static void showPower(){
        System.out.println("Showing Avenger's Power!");
        showName();
    }

    void showTeam(){
        System.out.println("We are Avenger's!");
    }
}
