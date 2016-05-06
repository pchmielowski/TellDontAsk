package dontask;

public class Person {

    private final String name;
    private final String surname;

    public Person(final String name, final String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void sayHello() {
        System.out.println("Hello, " + name);
    }

    public void showOn(View view) {
        view.addPerson(name, surname, new SayHelloCommand(this));
    }
}
