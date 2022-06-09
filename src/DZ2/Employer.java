package DZ5;

public class Employer {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;
    static int count = 0;

    public Employer (String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
        count++;
    };

    public void print () {
        System.out.println("fullName" + "," + " position" + "," + "," + " email" + "," + " phone" + " salary" + "," + " age");
    }

    public int getAge() {
        return age;
    }
}

