public class student extends human{
    private String schoolname;
    private float scholarship;
    public static String deadlines = "always burning";
    public student( int age, String name,String schoolname, boolean iskind , float scholarship) {
        super(age,name,iskind);
        this.schoolname = schoolname;
        this.scholarship = scholarship;
    }
    public void setschoolname(String schoolname) {
        this.schoolname = schoolname;
    }
    public void setscholarship(float scholarship) {
        this.scholarship = scholarship;
    }
    public String getschoolname() {
        return schoolname;
    }
    public float getscholarship() {
        return scholarship;
    }
    @Override
    public String aboutyou() { return "my name is " + getName();}
    public String thiiisold (){ return "i am thiiiis old: " + getAge() ;}
}
