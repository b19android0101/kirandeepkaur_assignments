package basic;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.input Stream Reader;

public class student {
int roll_no;
String name;
char grade;
double eng_marks,math_marks,sci_marks,total_marks,average;
BufferedReader s=new BufferedReader(new InputStreamReader(System.in));
Student() throws IOException
{
	System.out.println("enter the roll_no.");
	roll_no=Integer.parseInt(s.readLine());
	
	System.out.println("enter name");
	name=s.readLine();
	System.out.println(" enter eng_marks");
	eng_marks=Double.parseDouble(s.readLine());
	System.out.println(" enter math_marks");
	math_marks=Double.parseDouble(s.readLine());
	System.out.println(" enter sci_marks");
	sci_marks=Double.parseDouble(s.readLine());
}
void cal_total()
{
	total_marks=(eng_marks+math_marks+sci_marks);
}
void cal_average()
{
	average=(total_marks)/3;
}
void grade()
{
	if(average>=85)
	{
		System.out.println("A+ grade");
	}
	else if (average>=70 && average>=85)
	{
		System.out.println("A grade");
	}
	else if (average>=50 && average>=70)
	{
		System.out.println("B grade");
	}
	else if(average>=40 && average <50)
	{
		System.out.println("C grade");	
	}
	else if(average <=40)
	{
		System.out.println("fail");	
	}	
	void display()
	{
		System.out.println(name+" "+ average " " +grade);
	}
	public static void main(String[] args) throws IOException
	{
		student s1=new Student(1,72,83,34,"rubal");
		student s2=new Student(2,82,83,34,"saruuu");
		student s3=new Student(4,82,83,89,"varuu");
		{
			S1.cal_total();
			S2.cal_total();
			S3.cal_total();
			
			S1.cal_average();
			S2.cal_average();
			S3.cal_average();
			
			S1.find grade();
			S2.find grade();
			S3.find grade();
			
			S1.display();
			S2.display();
			S3.display();
		}
		


			
			
			
		}
	}
	{
		
		
						
			
}		
}

}
