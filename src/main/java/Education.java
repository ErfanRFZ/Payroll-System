public class Education {

    String degree;
    // Getter
    public String getDegree() {
        return degree;
    }

    // Setter
    public void setDegree(String newDegree) {
        this.degree = newDegree;
    }
    String major;
    // Getter
    public String getMajor() {
        return major;
    }

    // Setter
    public void setMajor(String newMajor) {
        this.major = newMajor;
    }
    String research;
    // Getter
    public String getResearch(){
        return research;
    }
    // Setter
    public void setResearch(String newResearch){
        this.research = newResearch;
    }

    public Education(String degree, String major, String research){
        this.degree = degree;
        this.major = major;
        this.research = research;
    }
}
