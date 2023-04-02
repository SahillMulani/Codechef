import java.util.Scanner;
import java.util.*;

public class Employee {
    String name;
    int id;
    String gender;
    String designation;

    public Employee(String name, int id, String gender, String designation) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.designation = designation;
    }

    public static void filter(int n, ArrayList<Employee> e) {

        ArrayList<Employee> MaleManager = new ArrayList<Employee>();
        ArrayList<Employee> FemaleManager = new ArrayList<Employee>();
        ArrayList<Employee> MaleExecutive = new ArrayList<Employee>();
        ArrayList<Employee> FemaleExecutive = new ArrayList<Employee>();

        for (int i = 0; i < n; i++) {
            if (e.get(i).gender.equals("Male") && e.get(i).designation.equals("Manager")) {
                MaleManager.add(e.get(i));
            }
            if (e.get(i).gender.equals("Male") && e.get(i).designation.equals("Executive")) {
                MaleExecutive.add(e.get(i));
            }
            if (e.get(i).gender.equals("Female") && e.get(i).designation.equals("Manager")) {
                FemaleManager.add(e.get(i));
            }
            if (e.get(i).gender.equals("Female") && e.get(i).designation.equals("Executive")) {
                FemaleExecutive.add(e.get(i));
            }
        }
        for (int i = 0; i < MaleManager.size(); i++) {
            System.out.println(MaleManager.get(i).name);
        }
        for (int i = 0; i < FemaleManager.size(); i++) {
            System.out.println(FemaleManager.get(i).name);
        }
        for (int i = 0; i < MaleExecutive.size(); i++) {
            System.out.println(MaleExecutive.get(i).name);
        }
        for (int i = 0; i < FemaleExecutive.size(); i++) {
            System.out.println(FemaleExecutive.get(i).name);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of employee");
        int n = in.nextInt();
        ArrayList<Employee> e = new ArrayList<Employee>();
        for (int i = 0; i < n; i++) {
            e.add(new Employee(in.next(), in.nextInt(), in.next(), in.next()));
        }

        filter(n, e);
    }

}
