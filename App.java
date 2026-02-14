import java.util.ArrayList;
import java.util.Scanner;

class studentManagementSystem{

    public int id;
    public String name;
    public double marks;

    public studentManagementSystem(int id,String name,double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }


   

    
}

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        ArrayList<studentManagementSystem> list = new ArrayList<>();

        while (true) { 
            
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice Here :- ");
            int choice = sc.nextInt();

            switch(choice){
                case 1 :{
                    System.out.print("Enter The Your Id :- ");
                    int id = sc.nextInt();

                    sc.nextLine();
                    System.out.print("Enter Your Name :- ");
                    String name = sc.nextLine();

                    System.out.print("Enter The Marks :- ");
                    double marks = sc.nextDouble();

                    studentManagementSystem student1 = new studentManagementSystem(id, name, marks);
                    list.add(student1);
                    break;
                }

                case 2 :{

                    if(list.size() == 0){
                        System.out.println("Size Is Zero.....");
                    }

                    System.out.println("All The Student in ArrayList");
                    for (int i = 0; i < list.size(); i++) {

                    studentManagementSystem s = list.get(i);

                    System.out.println("Student " + (i + 1));
                    System.out.println("ID   : " + s.id);
                    System.out.println("Name : " + s.name);
                    System.out.println("Mark : " + s.marks);
                    System.out.println("----------------------");
                }
                break;
                }

                case 3:{
                    System.out.print("Enter Your Student ID :- ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for(int i=0;i<list.size();i++){

                        studentManagementSystem s = list.get(i);
                        if(s.id == id){
                            sc.nextLine();
                            System.out.print("Enter New Name :- ");
                            String Newname = sc.nextLine();
                            

                            System.out.print("Enter New Marks :- ");
                            double Newmarks = sc.nextDouble();
                            
                            s.name = Newname;
                            s.marks = Newmarks;

                            System.out.println("Value Update Successfully....");
                            found = true;
                            break;
                            
                        }
                    }

                    if(!found){
                        System.out.println("Id Not Found...");
                    }
                    break;

                }

                case 4:{
                    System.out.print("Enter Your Student id :- ");
                    int id = sc.nextInt();

                    boolean found = false;

                    for(int i=0;i <list.size();i++){

                        if(list.get(i).id == id){
                            list.remove(i);
                            System.out.println("Student Remove Successfully...");
                            found = true;
                            break;
                        }
                    }

                    if(!found){
                        System.out.println("Student id not Found");
                    }
                    break;
                }

                case 5:{
                    System.out.println("Thank You For Supporting us.......!");
                    return;
                }

                default:{
                    System.out.println("Enter Wrong Input.............!");
                }


            }

        }


        
    }
}
