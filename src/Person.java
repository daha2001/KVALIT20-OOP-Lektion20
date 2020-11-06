import java.util.Calendar;

public class Person {

    // Instansvariabler / egenskaper / attribut
    String firstName;
    String lastName;
    String dateOfBirth;
    double height;
    double weight;

    // Instansmetoder - får INTE ha ordet static
    /**
     * En instansmetod som returnerar hela namnet
     * @return "förnamn efternamn"
     */
    public String getName(){
        return this.firstName + " " + this.lastName;
    }

    /**
     *
     * @return
     */
    public int getAge(){
        String calendar = Calendar.getInstance().getTime().toString();
        String ThisYearString = calendar.substring(calendar.lastIndexOf(' ') +1);
        int thisYear = Integer.parseInt(ThisYearString);

        String yearString = this.dateOfBirth.substring(0,4);
        int year = Integer.parseInt(yearString);

        return thisYear - year;
    }

    /**
     *  En instansmetod som beräknar BMI
     * @return BMI
     */
    public double getBMI(){
        return this.weight / (this.height * this.height);

    }

    /**
     *  En instansmetod som beräknar viktklassen
     * @return viktklassen
     */
    public String getBMICategory(){

        double BMI = this.getBMI();

        String category;

        if (BMI < 18.5)
            category = "undervikt";
        else if (BMI <= 25)
            category = "Normalvikt";
        else
            category = "Övervikt";

        return category;
    }

    @Override
    public String toString() {
        return "Namn: " + getName() +
                "\nÅlder: " + getAge() +
                "\nBMI: " + getBMI() +
                "\nViktklass: " + getBMICategory();
    }
}
