class AvengerConstructor {
   AvengerConstructor(String name){
    System.out.println("Hello I am " + name);
   }

   public static void main(String[] args) {
    System.out.println("Avenger Assemble");
    AvengerConstructor a = new AvengerConstructor("Steve Roger");
    AvengerConstructor a1 = new AvengerConstructor("Tony Stark");
   }

}
