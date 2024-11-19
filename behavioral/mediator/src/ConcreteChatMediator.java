import java.util.ArrayList;
import java.util.List;

public class ConcreteChatMediator implements ChatMediator {
    private List<User> users;

    public ConcreteChatMediator() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for (User u : users) {
            // Envia a mensagem para todos os usuários, exceto o remetente
            if (u != user) {
                u.receive(message);
            }
        }
    }
}
