public class Pet extends Animal {
    protected int age;
    public String name;
    private Person owner;

    public String getOwner() {
        return owner.getName();
    }

    public void setOwner(Person owner) {
        this.owner = owner;
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

    public Pet() {
    }

    public Pet(String speakWord, int age, String name, Person owner) {
        super(speakWord);
        this.age = age;
        this.name = name;
        this.owner = owner;
    }

    @Override
    public void speak(){
        System.out.println(name);
    }

}