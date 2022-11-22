import java.util.*;
class Main {
	public static void main(String[] args) {
		Employee e = new Employee();
		int choice =0 ;
		do {
		choice = e.menu();
		switch(choice) {
		case 1:
			e.add_details();
			break;
		case 2:
			e.sempdetails();
			break;
		case 3:
			e.showalldetails();
			break;
		case 4:
			e.updatedetails(); break;
		case 5:
			e.deletedetails(); break;
		}
		}while(choice>0 && choice <6);	
	}
}
class Employee{
	ArrayList<Integer> id = new ArrayList<Integer>();
	ArrayList<String> name = new ArrayList<String>();
	ArrayList<Integer> salary = new ArrayList<Integer>();
	ArrayList<Integer> mobile_no = new ArrayList<Integer>();
	ArrayList<String> emailid = new ArrayList<String>();
	ArrayList<String> gender = new ArrayList<String>();
	ArrayList<String> address = new ArrayList<String>();
	ArrayList<String> DOB = new ArrayList<String>();
	ArrayList<String> DOJ = new ArrayList<String>();
	ArrayList<Integer> Exp = new ArrayList<Integer>();
	Scanner sc = new Scanner(System.in);
	public int menu() {

		System.out.println("  Employee Management System");
		System.out.println("------------------------------\n");
		System.out.println("1. Add Employee Details");
		System.out.println("2. View Single Employee Details");
		System.out.println("3. View All Employee Details");
		System.out.println("4. Update Employee Details");
		System.out.println("5. Delete Employee Details");
		System.out.println("6. exit\n");
		Scanner s = new Scanner(System.in); int i=0;
		System.out.print("Enter a choice : ");
		try {
		i = s.nextInt();}
		catch(Exception e) {
			System.out.println("Enter a valid option\n");
			return 0;
		}
		return i;
	}
	public void add_details() {
		System.out.print("Enter Employee id: ");
		id.add(sc.nextInt());
		System.out.print("Enter Employee name: ");
		sc.nextLine();
		name.add(sc.nextLine());
		System.out.print("Enter Employee salary: ");
		salary.add(sc.nextInt());
		System.out.print("Enter Employee mobile no: ");
		mobile_no.add(sc.nextInt());
		System.out.print("Enter Employee email id: ");
		sc.nextLine();
		emailid.add(sc.next());
		System.out.print("Enter Employee gender: ");
		sc.nextLine();
		gender.add(sc.next());
		System.out.print("Enter Employee address: ");
		sc.nextLine();
		address.add(sc.nextLine());
		System.out.print("Enter Employee Date of birth (DD/MM//YYYY): ");
		DOB.add(sc.nextLine());
		System.out.print("Enter Employee Date of joining (DD/MM//YYYY): ");
		DOJ.add(sc.nextLine());
		System.out.print("Enter Employee number of years of experience: ");
		Exp.add(sc.nextInt());
		System.out.println("\nEmployee details added Succesfully\n"); System.out.println();
	}
	public void sempdetails() {
		System.out.print("Enter Employee id: ");
		int ids= sc.nextInt();
		int i = id.indexOf(ids);
		System.out.println("Employee Name: "+name.get(i));
		System.out.println("Employee Salary: "+ salary.get(i));
		System.out.println("Employee mobile no: "+ mobile_no.get(i));
		System.out.println("Employee email id: "+ emailid.get(i));
		System.out.println("Employee Name: "+ gender.get(i));
		System.out.println("Employee Name: "+ address.get(i));
		System.out.println("Employee Name: "+ DOB.get(i));
		System.out.println("Employee Name: "+ DOJ.get(i));
		System.out.println("Employee Name: "+ Exp.get(i));
	}
	public void updatedetails() {
		System.out.println("Enter Employee id: ");
		int ids = sc.nextInt();
		int i = id.indexOf(ids);
		System.out.println("1. name\t 2.salary\t 3.mobileno\t 4.emailid\t 5.gender\t \n");
		System.out.println("6. address\t 7.Date of birth\t 8.Date of joining\t 9.years of Experience");
		System.out.println("Press any other number to exit\n");
		System.out.print("\nEnter option to update: ");
		int op = sc.nextInt();
		switch(op) {
		case 1:
			System.out.print("Enter name: ");
			sc.nextLine();
			name.set(i, sc.nextLine());
			break;
		case 2:
			System.out.print("Enter salary: ");
			salary.set(i, sc.nextInt());
			break;
		case 3:
			System.out.print("Enter mobile number: ");
			mobile_no.set(i, sc.nextInt());
			break;
		case 4:
			System.out.print("Enter email id: ");
			emailid.set(i, sc.next());
			break;
		case 5:
			System.out.print("Enter gender: ");
			gender.set(i, sc.next());
			break;
		case 6:
			System.out.print("Enter address: "); sc.nextLine();
			address.set(i, sc.nextLine());
			break;
		case 7:
			System.out.print("Enter Date of birth: "); sc.nextLine();
			DOB.set(i, sc.nextLine());
			break;
		case 8:
			System.out.print("Enter date of joining: "); sc.nextLine();
			DOJ.set(i, sc.nextLine());
			break;
		case 9:
			System.out.print("Enter years of experience: ");
			Exp.set(i, sc.nextInt());
			break;
		default:
			System.out.println("Enter a valid response"); 
				
		}
	}
	public void deletedetails() {
		System.out.println("Enter Employee id: ");
		int ids = sc.nextInt();
		int i = id.indexOf(ids);
		id.remove(i);
		name.remove(i);
		salary.remove(i);
		mobile_no.remove(i);
		emailid.remove(i);
		gender.remove(i);
		address.remove(i);
		DOB.remove(i);
		DOJ.remove(i);
		Exp.remove(i);
		System.out.println(ids+" Employee details deleted succesfully"); System.out.println();
	}
	public void showalldetails() {
		System.out.printf("%5s %10s %10s %8s %20s %17s %10s %10s %17s %10s", "EMPLOYEE ID", "NAME", "GENDER", "MOBILE NO", "E-MAIL ID", "SALARY", "DOB", "DOJ", "EXPERIENCE", "ADDRESS");
		System.out.println();
		for(int i=0;i<id.size();i++) {
		System.out.printf("%7s %14s %10s %10s %25s %13s %10s %10s %13s %5s",id.get(i),name.get(i),gender.get(i),mobile_no.get(i),emailid.get(i),salary.get(i),DOB.get(i),DOJ.get(i),Exp.get(i),address.get(i));
		System.out.println();
		}
	}
}
