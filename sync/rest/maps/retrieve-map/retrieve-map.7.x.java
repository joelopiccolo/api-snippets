// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.sync.v1.service.SyncMap;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static final String SERVICE_SID = System.getenv("TWILIO_SERVICE_SID");
  // You can use a map SID or unique name
  public static final String MAP_SID = "Players";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    SyncMap map = SyncMap.fetcher(SERVICE_SID, MAP_SID).fetch();

    System.out.println(map.getSid());
  }
}
