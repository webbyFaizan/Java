public class LocalVariable {
    String instanceVariable = "I am an instance variable";

    void myMethod(){
        String localVariable = "I am a local variable";
        System.out.println(localVariable);

        System.out.println(instanceVariable);
    }  
    public static void main(String[] args) {
        
        LocalVariable lv = new LocalVariable();
        
        lv.myMethod();

        System.out.println(lv.instanceVariable);
        // System.out.println(lv.localVariable); This will not work - causes compile error
    }
}
