package assignment13;
import java.util.Scanner;

public class Assignment13 {
    
    public static int scalingFactor(){
        Scanner input=new Scanner(System.in);
        int uin;
        System.out.println("*X*");
        System.out.println("X**");
        System.out.println("**X");
        System.out.println("What scaling factor would you like to use?");
            uin=input.nextInt();
            return(uin);
    }

    public static void scale(int uin){
        for(int i=0; i<uin; i++){
        //first line
        for(int count=0; count<uin; count++){System.out.print("*");}
        for(int count=0; count<uin; count++){System.out.print("X");}
        for(int count=0; count<uin; count++){System.out.print("*");}
        
        System.out.println("");
        }
        //Second line
        for(int i=0; i<uin; i++){
        for(int count=0; count<uin; count++){System.out.print("X");}
        for(int count=0; count<uin; count++){System.out.print("*");}
        for(int count=0; count<uin; count++){System.out.print("*");}
        
        System.out.println("");
        }
        //third line
        for(int i=0; i<uin; i++){
        for(int count=0; count<uin; count++){System.out.print("*");}
        for(int count=0; count<uin; count++){System.out.print("*");}
        for(int count=0; count<uin; count++){System.out.print("X");}
        
        System.out.println("");
        }
        }
    
    
    public static void main(String[] args) {
        
        int uin=scalingFactor();
        scale(uin);
        
    }
    
}

