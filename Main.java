import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("enter size:");
        int n=in.nextInt();
        // int[]arr=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("enter value:");
        //     arr[i]=in.nextInt();
        // }
        // moveZeros(arr);
        // in.close();
        String s=Integer.toBinaryString(n);
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0') ans+="1";
                else ans+="0";
        }
        System.out.println(Integer.parseInt(ans,2));
    }

    static void moveZeros(int[]arr){
     System.out.println(Arrays.toString(arr));
     int idx=0;
     for(int i=0;i<arr.length;i++){
       if(arr[i]!=0){
        arr[idx]=arr[i];
        idx++;
       }
     }
     for(int i=idx;i<arr.length;i++){
        arr[i]=0;
     }
     System.out.println(Arrays.toString(arr));
    }
}