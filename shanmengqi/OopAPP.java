public class OopAPP {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog("wangwang","jinmao");

    }
}

//2. Write a Java program to create a class called "Dog" with a name and breed attribute.
//    Create two instances of the "Dog" class,
//    set their attributes using the constructor and modify the attributes using the setter methods and print the updated values.
class Dog{


    protected String name;
    protected String breed;

    public Dog(){

    }
    public Dog(String name,String breed){
        this.name = name;
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void printData(){
        System.out.println(this.name);
        System.out.println(this.breed);
    }
}
