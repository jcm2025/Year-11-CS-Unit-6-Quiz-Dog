public class Dog {

    private String name;
    private int age;
    private String color;


    public Dog(){
        name = "";
        age = 0;
        color = "";
    }

    public Dog(String name, int age, String color){
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String getColors(){
        return color;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setColor(String color){
        this.color = color;
    }

    private void addOneAge(){
        age += 1;
    }

    public int birthday(){
        addOneAge();
        return age;
    }

    public String toString(){
        return("This " + getAge() + " year(s) old, " + getColors() + " dog's name is " + getName() + ".");
    }

}
