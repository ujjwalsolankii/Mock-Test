import java.io.*;

class GFG {
	public static void main (String[] args) {
		int n1= 10 , n2= 20, n3=30;
		
		if(n1>n2){
		    if(n1>n3){
		        System.out.println(n1);
		    }
		    else{
		        System.out.println(n3);
		    }
		}
		else{
		    if(n2>n3){
		        System.out.println(n2);
		    }
		    else{
		        System.out.println(n3);
		    }
		}
	}
}