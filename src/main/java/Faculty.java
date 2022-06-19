import java.util.Calendar;
public class Faculty extends Employee{

    enum _level{
        AS,
        AO,
        FU;
    }
    protected _level level;
    // Getter
    public _level getLevel() {
        return level;
    }

    // Setter
    public void setLevel(_level newLevel) {
        this.level = newLevel;
    }
    protected Education education;
    // Getter
    public String getLast_name() {
        return education.toString();
    }

    // Setter
    public void setEducation(Education newEducation) {
        this.education = newEducation;
    }

    public Faculty(String last_name, String first_name, String id_number, String sex, Calendar birth_date, int hourlyRate, _level level,Education education) {
        super(last_name, first_name, id_number, sex, birth_date);
        this.education = education;
        this.level = level;
    }

    @Override
    public int monthlyEarning() {
        int baseSalary = 160;
        if(level == _level.AS){
            return baseSalary;
        }
        switch (level){
            case AS -> {
                return baseSalary;
            }
            case AO -> {
                return (int) (1.2*baseSalary);
            }
            case FU -> {
                return (int) (1.4*baseSalary);
            }
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }
    }

    public String toString(String last_name, String first_name, String id_number, String sex, Calendar birth_date) {


        switch (level) {
            case AS -> {
                return "ID Employee number : {id_number}\n" +
                        "Employee name: {first_name} {last_name}\n" +
                        "Birth date: {birth_date}\n" +
                        "assistant Professor where can be Assistant\n" +
                        "Monthly Salary: {monthlyEarning()}";
            }
            case AO -> {
                return "ID Employee number : {id_number}\n" +
                        "Employee name: {first_name} {last_name}\n" +
                        "Birth date: {birth_date}\n" +
                        "associate Professor where can be Associate\n" +
                        "Monthly Salary:{monthlyEarning()} ";
            }
            case FU -> {
                return "ID Employee number : {id_number}\n" +
                        "Employee name: {first_name} {last_name}\n" +
                        "Birth date: {birth_date}\n" +
                        "Professor where can be Full\n" +
                        "Monthly Salary: {monthlyEarning()} ";
            }
            default -> throw new IllegalStateException("Unexpected value: " + level);
        }
    }

    public Object duplicate(){
        try{
            return clone();
        }catch (CloneNotSupportedException e){
            return null;
        }
    }
}
