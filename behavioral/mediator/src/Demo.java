public class Demo {
    public static void main(String[] args) {
        ChatMediator mediator = new ConcreteChatMediator();

        User user1 = new ConcreteUser(mediator, "Alice");
        User user2 = new ConcreteUser(mediator, "Bob");
        User user3 = new ConcreteUser(mediator, "Carlos");
        User user4 = new ConcreteUser(mediator, "Diana");

        mediator.addUser(user1);
        mediator.addUser(user2);
        mediator.addUser(user3);
        mediator.addUser(user4);

        user1.send("Olá a todos!");
        user3.send("Oi, Alice!");
    }
}
