public class MultilevelInheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        Child c1 = new Child();
        
        GrandChild g1 = new GrandChild();
        g1.grandChildProperty();
        g1.childProperty();
        g1.parentProperty();
        
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

class GrandChild extends Child{
    void grandChildProperty(){
        System.out.println("GrandChild Property");
    }
}

