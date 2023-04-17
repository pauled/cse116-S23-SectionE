package week11.with_mocks;
/*
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;
import week11.without_mocks.TwitterConfig;

public class RealTwitter implements TwitterAPI {

    private final Twitter twitterAPI;

    public RealTwitter() {
        ConfigurationBuilder configuration = new ConfigurationBuilder();

        configuration.setOAuthConsumerKey(TwitterConfig.CONSUMER_KEY);
        configuration.setOAuthConsumerSecret(TwitterConfig.CONSUMER_SECRET);
        configuration.setOAuthAccessToken(TwitterConfig.ACCESS_TOKEN);
        configuration.setOAuthAccessTokenSecret(TwitterConfig.ACCESS_SECRET);

        TwitterFactory twitterFactory = new TwitterFactory(configuration.build());
        this.twitterAPI = twitterFactory.getInstance();
    }

    @Override
    public void sendTweet(String tweet) {
        try {
            this.twitterAPI.updateStatus(tweet);
        } catch (TwitterException exception) {
            exception.printStackTrace();
        }
    }

}
*/