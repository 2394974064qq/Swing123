import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_goodPlane=new JLabel();
    JLabel label_plane=new JLabel();
    //构造方法
    public App() {
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以

        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode()==e.VK_UP){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()-8,128,128);
                }else if(e.getKeyCode()==e.VK_RIGHT){
                    label_plane.setBounds(label_plane.getX()+8,label_plane.getY(),128,128);
                }else if (e.getKeyCode()==e.VK_LEFT){
                    label_plane.setBounds(label_plane.getX()-8,label_plane.getY(),128,128);
                }else if (e.getKeyCode()==e.VK_DOWN){
                    label_plane.setBounds(label_plane.getX(),label_plane.getY()+8,128,128);
                }
            }
        });
    }
    //显示窗体方法
    void go(){
        JFrame frame = new JFrame("一起在打飞机游戏！");
        myPanel.setLayout(null);
        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_goodPlane.setIcon(new ImageIcon(imgURL));
        label_goodPlane.setBounds(0,0,986,720);

        java.net.URL imgURLbg=App.class.getResource("img/plane2.png");
        label_plane.setIcon(new ImageIcon(imgURLbg));
        label_plane.setBounds(500,450,128,128);
        myPanel.add(label_plane);
        myPanel.add(label_goodPlane);

        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,986,720);
        //frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
