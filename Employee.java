import java.util.Scanner;

public class Employee {
    String name;
    int id;
    String gender;

    public Employee(String name, int id, String gender) {
        this.name = name;
        this.id = id;
        this.gender = gender;
    }

    public static void filter(int n, Employee e[]) {
        for (int i = 0; i < n; i++) {
            if (e[i].gender.equals("Male")) {
                System.out.println("y");
                System.out.println(e[i].gender);
            } else {
                System.out.println("x");
                System.out.println(e[i].gender);
            }
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n = in.nextInt();
        Employee e[] = new Employee[n];
        for (int i = 0; i < n; i++) {
            e[i] = new Employee(in.next(), in.nextInt(), in.next());
        }

        filter(n, e);
    }

}
