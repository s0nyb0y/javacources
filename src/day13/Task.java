package day13;

public class Task {
    public static void main(String[] args) {
        User user1 = new User("Fedya");
        User user2 = new User("Jenya");
        User user3 = new User("Kolya");
        MessageDatabase.addNewMessage(user3,user1,"Гульнём?:)");
        user1.sendMessage(user3,"Питница, сам бог велел)))");
        MessageDatabase.addNewMessage(user1,user2,"Привет, как дела?");
        MessageDatabase.addNewMessage(user2,user1,"Привет,хорошо, сам?");
        MessageDatabase.addNewMessage(user1,user2,"Потихоньку");
        MessageDatabase.getMessages();
        MessageDatabase.showDialog(user1,user2);
        user1.subscribe(user2);
        user2.subscribe(user1);
        System.out.println(user2.isSubscribed(user1));
        System.out.println(user1.isFriends(user2));
    }
}
