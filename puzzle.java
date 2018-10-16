import java.util.*;
public class puzzle{
    static int[][] a;
    static int[][] b;
    static boolean check(){
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    if(a[i][j]!=b[i][j])
    return false;
    }
    }
    return true;
    }
    static void fun(int[][] a,int i,int j,int k,int count){
        if(count>5) return;
        for(int i1=0;i1<3;i1++){
        for(int j1=0;j1<3;j1++){
        System.out.print(a[i1][j1]+" ");
        }
        System.out.println();
        }
        System.out.println();
        if(check())
        {System.out.println("Target position is found"); return ;}
        else{
           if(k==0 && (j-1)>=0){
            int temp=a[i][j];
            a[i][j]=a[i][j-1];
            a[i][j-1]=temp;
            fun(a,i,j-1,0,count++);
            k++;
           }
           if(k==1 && (j+1)<3){
             int temp=a[i][j];
            a[i][j]=a[i][j+1];
            a[i][j+1]=temp;
            fun(a,i,j+1,0,count++);
            k++;
            }
            if(k==2 && i-1>=0){
             int temp=a[i][j];
            a[i][j]=a[i-1][j];
            a[i-1][j]=temp;
            fun(a,i-1,j,0,count++);
            k++;
            }
            if(k==3 && i+1<3){
            int temp=a[i][j];
            a[i][j]=a[i+1][j];
            a[i+1][j]=temp;
            fun(a,i+1,j,0,count++);
            return;
            }
    }
    }
    public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    a=new int[3][3];
    b=new int[3][3];
    System.out.println("Please enter initial state");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    a[i][j]=in.nextInt();
    }
    }
    System.out.println("Please enter target state");
    for(int i=0;i<3;i++){
    for(int j=0;j<3;j++){
    b[i][j]=in.nextInt();
    }
    }
    fun(a,2,1,0,0);
    System.out.println("VERSION CAN BE UPDATED");
    }
}