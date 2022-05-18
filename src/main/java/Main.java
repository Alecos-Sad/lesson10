import model.*;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.setName("vasek");
        cat.setAge(3);
        System.out.println(cat);

        Cat cat2 = new Cat("barsik", 4);
        System.out.println(cat2);

        Cat cat3 = new Cat();
        System.out.println(cat3);

        Person person = new Person();
        person.setName("vasek");
        person.setAge(3);
        person.setSex('F');
        System.out.println(person);

        Man man = new Man("Adam",32);
        Woman woman = new Woman("Eva",18);

        PersonPrint.print(man);
        PersonPrint.print(woman);

        Owner owner = new Owner("Герасим","Немой");

        Dog dog = new Dog();
        dog.setName("Муму");
        dog.setAge(1);
        dog.setOwner(owner);
        System.out.println(dog);

        Owner owner1 = new Owner("Вероника", "Немая");
        Owner[] owners = {owner, owner1};
        Racoon racoon = new Racoon("Jock", owners);
        System.out.println(racoon);






    }
}
