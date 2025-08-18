import javax.swing.JFrame;

public final class SwingExp {
    public static void main(String[] args) {
        SwingExp app = new SwingExp();
        app.buildAndDisplayGui();
    }

    private void buildAndDisplayGui() {
        JFrame frame = new JFrame("Test Frame");
        buildContent(frame);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    private void buildContent(JFrame frame) {
        // Ở đây bạn có thể thêm nội dung vào frame, ví dụ như nút hoặc nhãn
        // frame.add(new JLabel("Hello, Swing!"));
    }
}

