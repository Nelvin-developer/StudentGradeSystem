package StudentGradeSystem;
import java.util.Scanner;
public class Student {

	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of Subjects :");
    int n=sc.nextInt();
	int arr[]=new int[n];
    int total=0;
    for(int i=0;i<n;i++) {
    System.out.print("Enter marks for subject "+(i+1)+" :");
    	arr[i]=sc.nextInt();
    	total=total+arr[i];
    }
    System.out.println("Total Marks : "+total);
    total=(total/n);
    System.out.println("Average Percentage : "+total+"%");
    if(total>=90) {
    	System.out.println("Grade A");
    }
    else if(total >= 80 && total <=89 ) {
    	System.out.println("Grade B");
    }
    else if(total >= 70 && total <=79 ) {
    	System.out.println("Grade C");
    }
    else if(total >= 60 && total <=69 ) {
    	System.out.println("Grade D");
    }
    else if(total <60 ) {
    	System.out.println("Grade F");
    }
    sc.close();
	}

}
