public class PersonDemo {
    public static void main(String[] args) {


        // Instanser
        Person p1 = new Person();
        p1.firstName = "Daniel";
        p1.lastName = "Håkansson";
        p1.dateOfBirth = "19880114";
        p1.height = 1.79;
        p1.weight = 79;

        System.out.println(p1.getName());
        System.out.println("Ålder: " + p1.getAge());
        System.out.println("BMI: " + p1.getBMI());
        System.out.println("Viktklassen: " + p1.getBMICategory());


        Person p2 = new Person();
        p2.firstName = "bla bla";
        p2.lastName = "blö blö";
        p2.dateOfBirth = "19920412";
        p2.height = 1.52;
        p2.weight = 55;

        System.out.println(p2.getName());
        System.out.println("Ålder: " + p2.getAge());
        System.out.println("BMI: " + p2.getBMI());
        System.out.println("Viktklassen: " + p2.getBMICategory());

        System.out.println(p1);
        System.out.println(p2);
    }
}

