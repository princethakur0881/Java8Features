package streams.company;

public class lmdaexpln {
    static void main() {
        Employee employee =()-> "Software Engineer";
        Employee employee2 =()-> "Backend Engineer";
        Employee employee3 =()-> "Frontend Engineer";
        Employee employee4 =()-> "UI/UX Engineer";
        System.out.println(employee.getName());
        System.out.println(employee2.getName());
        System.out.println(employee3.getName());
        System.out.println(employee4.getName());

    }
}
