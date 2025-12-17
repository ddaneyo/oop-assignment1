public class employee extends human {
    private String universityname;
    private float salary;
    public employee(int age, String name, boolean iskind , String universityname, float salary) {
    super(age,name, iskind);
    this.universityname = universityname;
    this.salary = salary;}
    public String getuniversityname() {
        return universityname;
    }
    public void setuniversityname(String universityname) {
        this.universityname = universityname;
    }
    public float getsalary() {
        return salary;
    }
    public void setsalary(float salary) {
        this.salary = salary;
    }
    @Override
    public String aboutyou() { return "my name is " + getName() + "and i have a salary of " + getsalary();
    }
    public String thiiisold (){ return "i am thiiiis old: " + getAge() ;}

}
