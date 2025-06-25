
import java.util.*;
public class StudentManagement
{
	public static void main(String[] args) {
    
       try {
            ArrayList<String> names=new ArrayList<>();
        int choice=0,roll_no=0;
        Scanner sc=new Scanner(System.in);
        
        while(choice!=4)
        {
            System.out.println("\n1 .Add Student\n2. View All\n3. Remove by index\n4. Exit");
            System.out.print("\nEnter choice : ");
            choice=sc.nextInt();
            switch(choice)
            {   
                case 1:sc.nextLine();
                    System.out.print("Enter Your Name : ");
                        names.add(sc.nextLine());
                        break;
                case 2:System.out.println("\nStudents : \n");
                        for(int i=1;i<=names.size();i++)
                        {
                            System.out.println(i+". "+names.get(i-1));
                        }
                        break;
                case 3:System.out.print("Enter roll no. :");
                        roll_no=sc.nextInt();
                        if(roll_no>0 && roll_no<=names.size())
                        {
                            names.remove(roll_no-1);
                        }
                        else{
                            System.out.println("!!! Invalid Roll Number !!!");
                        }
                        break;
                case 4:System.out.println("\nExiting...");
                        break;
            
                default:System.out.println("\n!!! Something went wrong !!!");
            }
        }
        
       } catch(Exception e) {
           System.err.println(e);
       }
	}
}