package dontask;

public class SayHelloCommand {
    
    private final Person person;
    
    public SayHelloCommand(Person person) {
        this.person = person;
    }
    
    public void execute() {
        person.sayHello();
    }
}
