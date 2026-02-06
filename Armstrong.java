public class Armstrong {
 public static void main(String[] args) {
    int n=153;
    int original=n;
    int sum=0;
    int count=0;

    int temp=n;
    while(temp>0){
        temp=temp/10;
        count++;
        System.out.println(temp);
    }
    
    temp=n;
    while(temp>0){
        int digit=temp%10;
        int power=1;
        for(int i=1;i<=count;i++){
            power=power*digit;
        }
        sum=sum+power;
        temp=temp/10;
    }
    if(sum==original){
        System.out.println("Armstrong Number");
    }else{
        System.out.println("Not an Armstrong Number");
    }
 }   
}
