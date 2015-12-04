package Twitter4j;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
import java.awt.Font;

public class Application2 {

private JFrame frame;

/**
* Launch the application.
*/
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try {
Application2 window = new Application2();
window.frame.setVisible(true);
} catch (Exception e) {
e.printStackTrace();
}
}
});
}

/**
* Create the application.
*/
public Application2() {
initialize();
}

private static void tweet(String tweet) throws TwitterException{

Twitter twitter = new TwitterFactory().getInstance();
User User = twitter.verifyCredentials();

Status Status = twitter.updateStatus(tweet);////////////////ツイート送信
}

/**
* Initialize the contents of the frame.
*/
private void initialize() {
frame = new JFrame();
frame.setBounds(100, 100, 853, 583);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

JTextArea textArea = new JTextArea();
textArea.setLineWrap(true);
textArea.setWrapStyleWord(true);
textArea.setFont(new Font("Monospaced", Font.PLAIN, 40));
frame.getContentPane().add(textArea, BorderLayout.CENTER);

JButton btnTweet = new JButton("Tweet");
btnTweet.setFont(new Font("MS UI Gothic", Font.PLAIN, 50));
btnTweet.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent arg0) {

///////////////////////ここ
	
	String str = textArea.getText();
try {
tweet(str);
} catch (TwitterException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}

}
});
frame.getContentPane().add(btnTweet, BorderLayout.SOUTH);
}

}
