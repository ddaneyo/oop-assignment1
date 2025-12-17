public class human {
    private int age;
    private String name;
    private boolean iskind;
    public human(int age,String name,boolean iskind){
        this.age=age;
        this.name=name;
        this.iskind=iskind;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean iskind () {
        return iskind;
    }
    public void setkind(boolean kind) {
        iskind = kind;
    }
    public String aboutyou() {return "my name is " + getName();}
    public String thiiisold (){ return "i am thiiiis old:" + getAge();}



}
