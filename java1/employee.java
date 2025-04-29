

public class employee {
    String name;
    int id;
    double salary;
    String address;
        public employee(String name, int id, double salary,String address){
            this.name = name;
            this.id = id;
            this.salary = salary;
            this.address = address;
        }
        public void displayInfo(){

            System.out.println("Employee ID :" +id);
            System.out.println("Employee Name :" +name);
            System.out.println("Salary: $" + salary);
            System.out.println("Address :" +address);
        }
        public static void main(String[] args){
            employee emp1 = new employee("john",1234,2000,"Hubbali");
            emp1.displayInfo();
        }
    }