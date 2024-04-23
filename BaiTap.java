package BTVN;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private int age;
    private String department;
    private String code;
    private double salaryRate;

    public Employee(int id, String name, int age, String department, String code, double salaryRate) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.department = department;
        this.code = code;
        this.salaryRate = salaryRate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public String getCode() {
        return code;
    }

    public double getSalaryRate() {
        return salaryRate;
    }
}

public class BaiTap {
    private List<Employee> employees;

    public BaiTap() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employees.remove(employee);
    }

    public void displayEmployees() {
        System.out.println("Employee List:");
        for (Employee employee : employees) {
            System.out.println("ID: " + employee.getId());
            System.out.println("Name: " + employee.getName());
            System.out.println("Age: " + employee.getAge());
            System.out.println("Department: " + employee.getDepartment());
            System.out.println("Code: " + employee.getCode());
            System.out.println("Salary Rate: " + employee.getSalaryRate());
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        BaiTap app = new BaiTap();
        Scanner scanner = new Scanner(System.in);

        // Khởi tạo 10 nhân viên mẫu
        app.addEmployee(new Employee(1, "Lưu Anh Sơn", 21, "IT", "123", 10.0));
        app.addEmployee(new Employee(2, "Nguyễn Diệu Hoa", 21, "HR", "456", 8.5));
        app.addEmployee(new Employee(3, "Nguyễn Khánh Linh", 21, "Marketing", "789", 9.2));
        app.addEmployee(new Employee(4, "La Hồng Quân", 21, "Finance", "012", 11.5));
        app.addEmployee(new Employee(5, "Nguyễn Văn Đức", 21, "IT", "345", 10.0));
        app.addEmployee(new Employee(6, "La Hồng Quân", 21, "HR", "678", 8.5));
        app.addEmployee(new Employee(7, "Khổng Thị Vân", 21, "Marketing", "901", 9.2));
        app.addEmployee(new Employee(8, "Bùi Đức Kiên", 21, "Finance", "234", 11.5));
        app.addEmployee(new Employee(9, "Nguyễn Đình Hạnh", 21, "IT", "567", 10.0));
        app.addEmployee(new Employee(10, "Phạm Quốc Khánh", 21, "HR", "890", 8.5));
        app.displayEmployees();

        // Thêm một nhân viên mới
        System.out.println("Enter employee details:");
        System.out.print("ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Department: ");
        String department = scanner.nextLine();
        System.out.print("Code: ");
        String code = scanner.nextLine();
        System.out.print("Salary Rate: ");
        double salaryRate = Double.parseDouble(scanner.nextLine());

        Employee newEmployee = new Employee(id, name, age, department, code, salaryRate);
        app.addEmployee(newEmployee);

        app.displayEmployees();

        // Xóa một nhân viên từ danh sách
        System.out.print("Enter employee ID to remove: ");
        int removeId = scanner.nextInt();
        scanner.nextLine();

        for (Employee employee : app.employees) {
            if (employee.getId() == removeId) {
                app.removeEmployee(employee);
                break;
            }
        }

        app.displayEmployees();
    }
}