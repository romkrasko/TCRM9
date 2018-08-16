public class MainClass {
    public static void main(String[] args){

        Cat[] cats = new Cat[10];
        cats[0] = new Cat();
        cats[1] = new Cat("Pushok","Male");
        cats[2] = new Cat("Pushok","Female","Britain",true);
        cats[3] = new Cat("Barsik","Female","Pers",true);
        cats[4] = new Cat("Pushok2","Female","Britain",false);
        cats[5] = new Cat("Marusya","Male","Britain",true);
        CatCafe cafe = new CatCafe("address1",cats,"13:00-16:00",cats.length);

        Animal animal = new Animal();
        Animal animal1 = new Animal("bla2");

        Person owner = new Person("personName");
        Person owner1 = new Person("Roman");

        animal.speak();
        animal.info();
        animal.setSpeakWord("bla");
        animal.speak();
        animal.info();

        animal1.speak();
        animal1.info();

        cats[3].speak();
        cats[4].info();

        cats[2].takeAwayFromCafe(owner1);
        System.out.println(cats[2].getOwner());


        Pet pet = new Pet("speakPet",12,"Johny",owner);
        pet.speak();


        Lynx lynx = new Lynx();
        lynx.speak();
        lynx.info();
        Dog dog = new Dog();
        dog.speak();
        dog.info();


    }
}