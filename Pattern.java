public class Pattern {
    public static void main(String[] args) {
        // for(int i=1;i<=5;i++){
        //     for(int j=1;j<=i;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int a=1;a<=5;a++){
        //     for(int b=1;b<=a;b++){
        //         System.out.print(a);
        //     }
        //     System.out.println();
        // }

        // for(int c=1;c<=4;c++){
        //     for(int d=1;d<=c;d++){
        //         System.out.print(d);
        //     }
        //     System.out.println();
        // }

        // for(int e=1;e<=5;e++){
        //     for(int f=1;f<=5-e;f++){
        //         System.out.print(" ");
        //     }
        //     for(int g=1;g<=e;g++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int m=1;m<=5;m++){
        //     for(int n=m;n<=5;n++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // for(int i=5;i>=1;i--){
        //     for(int j=1;j<=5-i;j++){
        //         System.out.print(" ");
        //     }
        //     for(int k=1;k<=i;k++){
        //         System.out.print(" * ");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // for(int i=1;i<=4;i++){
        //     for(int j=1;j<=4;j++){
        //         if(i==1 || j==1 || j==4 || i==4){
        //             System.out.print("*");
        //         }else{
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }

        for(int i=1;i<=4;i++){
            for(int j=1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                if(i==1 || i==4){

                    System.out.print(" * ");
                }
                else{
                    
                }
            }
            System.out.println();
        }


        
    }
}
