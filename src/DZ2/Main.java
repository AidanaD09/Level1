package DZ5;

public class Main {
    public static void main(String[] args) {

        Employer employer1 = new Employer("Aidana D.", "Manager", "ai-d.gmail.com", "+77779997799", 3000, 38);
        Employer employer2 = new Employer("Islam K.", "Deputy manager", "is-k.gmail.com", "+77779997711", 2200, 28);
        Employer employer3 = new Employer("Roman K.", "Head of KEF", "roman.k.gmail.com", "+77779997722", 2000, 43);
        Employer employer4 = new Employer("John A.", "Agent", "john-ag.gmail.com", "+77779997733", 1500, 42);
        Employer employer5 = new Employer("Mereke M.", "Lawyer", "mmereke.l.gmail.com", "+77779997744", 1800, 48);
        Employer employer6 = new Employer("Askar Q.", "Head of TEF", "ask.q.gmail.com", "+77779997755", 2000, 51);
        Employer employer7 = new Employer("Inkar D.", "Head of Bio", "ink.d.gmail.com", "+77779997766", 2100, 35);
        Employer employer8 = new Employer("Zhora S.", "Head of San", "zhorka.s.gmail.com", "+77779997777", 2100, 45);

        Employer[] employers = {employer1, employer2, employer3, employer4, employer5, employer6, employer7, employer8};

        for (int i = 0; i < employers.length; i++) {
            if (employers[i].getAge() >= 40) {
                System.out.println(employers[i].getAge());;
            }
        }








    }
}
