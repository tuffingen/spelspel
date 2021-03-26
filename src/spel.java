import javax.swing.*;
import java.awt.*;

public class spel extends Canvas implements Runnable {


    @Override
    public void run() {

    }
    private int width = 900;
    private int height = 700;

    private Thread thread;
    int fps =  60;
    private boolean isrunning;


public spel(){
    JFrame frame = new JFrame("spelruta");
    frame.add(this);
    this.setSize(width, height);
    frame.pack();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);
}
    public static void main(String[] args) {
        spel painting = new spel();
        painting.start();
    }

    public synchronized void start() {
    thread = new Thread(this);
    thread.start();
    }
}

