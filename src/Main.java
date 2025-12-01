import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            ChatServer.main(new String[]{});
        }).start();
        Thread.sleep(2000);
        System.out.println("Запуск клиента 1...");
        SwingUtilities.invokeLater(() -> {
            new ClientWindow().setTitle("Пользователь 1");
        });
        Thread.sleep(2000);
        System.out.println("Запуск клиента 2...");
        SwingUtilities.invokeLater(() -> {
            new ClientWindow().setTitle("Пользователь 2");
        });
    }
}