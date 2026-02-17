public class SingleInheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.parentProperty();

        Child c1 = new Child();
        c1.childProperty();
        c1.parentProperty();

    }
}

class Parent{
    void parentProperty(){
        System.out.println("Parent Property");
    }
}

class Child extends Parent{
    void childProperty(){
        System.out.println("Child property");
    }
}
