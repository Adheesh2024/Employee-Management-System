package bank;

class ChatBot {

    void reply(String message) {

        message = message.toLowerCase();

        if (message.contains("deposit")) {
            System.out.println("To deposit money, choose option 1.");
        }
        else if (message.contains("withdraw")) {
            System.out.println("To withdraw money, choose option 2.");
        }
        else if (message.contains("balance")) {
            System.out.println("To check balance, choose option 3.");
        }
        else if (message.contains("hello")) {
            System.out.println("Hello! How can I help you?");
        }
        else {
            System.out.println("Sorry, I didn't understand.");
        }
    }
}