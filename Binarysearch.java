package abstractclass;
import java.util.Arrays;
import java.util.Scanner;

public class Binarysearch {

	public static void main(String[] args) {
		String[] names= {"Amit","Divya","karan","mani","zara"};
		Scanner sc=new Scanner(System.in);
		String a=sc.next();
		int index=(Arrays.binarySearch(names,a));
		if(index>=0)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("not found");
		}
	}
}	

