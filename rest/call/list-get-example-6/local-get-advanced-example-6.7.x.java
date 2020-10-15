// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.incomingphonenumber.LocalCreator;
import com.twilio.rest.api.v2010.account.availablephonenumbercountry.LocalReader;
import com.twilio.base.ResourceSet;
import com.twilio.rest.api.v2010.account.availablephonenumbercountry.Local;
import com.twilio.type.PhoneNumber;

public class Example {
  // Get your Account SID and Auth Token from https://twilio.com/console
  // To set up environment variables, see http://twil.io/secure
  public static final String ACCOUNT_SID = System.getenv("TWILIO_ACCOUNT_SID");
  public static final String AUTH_TOKEN = System.getenv("TWILIO_AUTH_TOKEN");

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Local> numbers = new LocalReader("US").setAreaCode(619).setContains("555").read();
    PhoneNumber availableNumber = numbers.iterator().next().getPhoneNumber();

    new LocalCreator(availableNumber).create();
  }
}
