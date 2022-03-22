package module1;
import java.util.*;

public class Arithmeticcalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int n1,n2;
       char opr;
       Scanner sc=new Scanner(System.in);
       System.out.println("enter values:");
       n1=sc.nextInt();
       n2=sc.nextInt();
       System.out.println("Enter operator:");
       opr=sc.next().charAt(0);
       switch(opr) {
       			case '+':
       				System.out.println(n1+n2);
       				break;
       			case '-':
       				System.out.println(n1-n2);
       				break;
       			case '*' :
       				System.out.println(n1*n2);
       			case '/' :
       				System.out.println(n1/n2);
       			default:
       				System.out.println("invalid input");
       				break;
       				
       	}
       sc.close();
	}

}
