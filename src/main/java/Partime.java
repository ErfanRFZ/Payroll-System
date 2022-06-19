import java.util.Calendar;

public class Partime extends Staff{

    protected int hwpw; //Hours worked per week
    // Getter
    public int getHwpw() {
        return hwpw;
    }

    // Setter
    public void setHwpw(int newHwpw) {
        this.hwpw = newHwpw;
    }


    public Partime(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int hourlyRate, int hwpw) {
        super(last_name, first_name, id_number, sex, birth_date, hourlyRate);
        this.hwpw = hwpw;
    }

    public String toString(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int hourlyRate){

        int hwpm = hourlyRate * hwpw * 4;//Hours works per month
        int monthlySalary = hwpm * 160;

        return "ID Employee number :{id_number}\n" +
                "Employee name: {first_name} {last_name}\n" +
                "Birth date: {birth_date}\n" +
                "Hours works per month: ${hwpm}\n" +
                "Monthly Salary: ${monthlySalary}\n";
    }

}
