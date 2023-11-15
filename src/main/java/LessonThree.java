public class LessonThree {

    public static void main(String[] args) {
        Employee employees[] = new Employee[5];
        employees[0] = new Employee("Raman", "H", "yep@gmail.com", 89635, 3000, 41);
        employees[1] = new Employee("Raman", "E", "smth@gmail.com", 565236, 35646, 33);
        employees[2] = new Employee("Raman", "L", "xxx@gmail.com", 61265, 2555, 43);
        employees[3] = new Employee("Raman", "L", "xyz@gmail.com", 64364, 55344, 28);
        employees[4] = new Employee("Raman", "O", "dosmth@gmail.com", 59646, 54454, 18);
        Employee.printEmployee(employees[4]);
    }


    public static class Employee{
       private static String fullName;
       private static String jobTitle;
       private static String email;
       private static int phoneNumber;
       private static int salary;
       private static int age;

        public static void printEmployee(Employee employee){
            System.out.println(fullName+" "+jobTitle+" "+email+" "+"+"+phoneNumber+" "+salary+" "+age);
        }

        public Employee(String fullName,String jobTitle, String email, int phoneNumber, int salary, int age){
            this.fullName = fullName;
            this.jobTitle = jobTitle;
            this.email = email;
            this.phoneNumber = phoneNumber;
            this.salary = salary;
            this.age = age;
        }
    }

}


