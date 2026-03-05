import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        // System.out.println("enter size:");
        // int n=in.nextInt();
        // int[]arr=new int[n];
        // for(int i=0;i<n;i++){
        //     System.out.println("enter value:");
        //     arr[i]=in.nextInt();
        // }
        // moveZeros(arr);
        // // System.out.println((int)(Math.pow(5.0,3.0)));
        // String s=Integer.toBinaryString(n);
        // String ans="";
        // for(int i=0;i<s.length();i++){
        //     if(s.charAt(i)=='0') ans+="1";
        //         else ans+="0";
        // }
        // System.out.println(Integer.parseInt(ans,2));
        
        System.out.println(printMaxLen(s));
        in.close();
    }

    static int printMaxLen(String s){
        int maxLen=0;
        String[]arr=s.split(",");
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            if(arr[i].trim().length()>maxLen) maxLen=arr[i].trim().length();
        }
        return maxLen;
    }

    static void maxGCD(int[]arr1,int[]arr2){
        int maxgcd=findGDC(arr1);
        int[]maxArr=arr1;
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
              int temp=arr1[i];
              arr1[i]=arr2[j];
              int gcd=findGDC(arr1);
              if(maxgcd<gcd){
                maxgcd=gcd;
                maxArr=Arrays.copyOf(arr1,arr1.length);
              }
              arr1[i]=temp;
            }
        }
        System.out.println(Arrays.toString(maxArr));
        System.out.println("Maximum GCD :"+maxgcd);
    }

    static int findGDC(int[]arr){
        int gcd=1;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]) min=arr[i];
        }
        for(int i=2;i<=min;i++){
            boolean dividesAll=true;
           for(int j=0;j<arr.length;j++) {
             if(arr[j]%i!=0){
                dividesAll=false;
                break;
             }
           }
           if(dividesAll){
              gcd=i;
           }
        }
        return gcd;
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