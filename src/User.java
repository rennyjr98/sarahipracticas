public class User {
    private String ID;
    private String gender;
    private int age;
    private String name;

    public User(String ID, String gender, int age, String name){
        this.ID=ID;
        this.gender=gender;
        this.age=age;
        this.name=name;
    }
    void setGender(String gender){
        this.gender=gender;
    }
    String getGender(){
        return gender;
    }
    void setAge(int age){
        this.age=age;
    }
    int getAge(){
        return age;
    }
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
    void setID(String ID){
        this.ID=ID;
    }
    String getID(){
        return ID;
    }
}
