import java.util.Arrays;

public class Employee {
    String fullname;
    String jobTitle;
    String email;
    int phone;
    int salary;
    int age;

    public Employee(String fullname, String jobTitle, String email, int salary, int phone, int age) {
        this.fullname = fullname;
        this.jobTitle = jobTitle;
        this.email = email;
        this.salary = salary;
        this.phone = phone;
        this.age = age;
    }

    public void printEmployee() {
        System.out.println(fullname + " " + jobTitle + " " + email + " " + salary + " " + phone + " " + age);
    }
        public static void main(String[] args) {
            Employee[] employees = new Employee[5];
            employees[0] = new Employee("Rmn", "q", "mymail@gmail.com", 44444, 554534, 44);
            employees[1] = new Employee("Raman", "tired", "mymail2@gmail.com", 57755, 545534, 28);
            employees[2] = new Employee("Ame", "f", "mymail1@gmail.com", 53355, 555434, 35);
            employees[3] = new Employee("Xbox", "z", "mymail3@gmail.com", 55445, 552534, 41);
            employees[4] = new Employee("Kekw", "x", "mymail4@gmail.com", 51155, 555334, 40);

            for (Employee employee : employees) {
                employee.printEmployee();
            }
    }
}
