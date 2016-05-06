package dontask;

public interface View {

    void addPerson(String name, String surname, SayHelloCommand command);

    void show();
}
