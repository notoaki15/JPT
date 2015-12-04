package Twitter4j;
 


import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.User;
 
public class JustPostTwitter {
     
    public static void main( String[] args ) throws TwitterException
    {
    	Twitter twitter = new TwitterFactory().getInstance();
        User User = twitter.verifyCredentials();
      
        Status Status = twitter.updateStatus("");////////////////ツイート送信
    }
    
    
    
   
}
