import javax.swing.JFrame;

public class Main {
    public static void main(String[] args) {
        // BÀI 1
        int boardWidth = 360;
        int boardHeight = 640;

        JFrame frame = new JFrame("Flappy Bird");
        frame.setSize(boardWidth, boardHeight);
        frame.setLocationRelativeTo(null); 
        frame.setResizable(false);         
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Khởi tạo 
        FlappyBird flappyBird = new FlappyBird();
        frame.add(flappyBird);
        frame.pack();
        flappyBird.requestFocus();
        frame.setVisible(true);
    }
}