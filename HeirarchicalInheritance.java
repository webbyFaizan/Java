public class HeirarchicalInheritance {
    public static void main(String[] args) {
        Parent p1 = new Parent();

        Brother b1 = new Brother();
        b1.brotherProperty();
        b1.parentProperty();

        Sister s1 = new Sister();
        s1.sisterProperty();
        s1.parentProperty();

    }
}

class Parent{
    void parentProperty(){
        System.out.println("Parent Property");
    }
}

class Brother extends Parent{
    void brotherProperty(){
        System.out.println("Brother property");
    }
}

class Sister extends Parent{
    void sisterProperty(){
        System.out.println("Sister property");
    }
}