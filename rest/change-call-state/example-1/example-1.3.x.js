// Download the Node helper library from twilio.com/docs/node/install
// These identifiers are your accountSid and authToken from
// https://www.twilio.com/console
// To set up environmental variables, see http://twil.io/secure
const accountSid = process.env.TWILIO_ACCOUNT_SID;
const authToken = process.env.TWILIO_AUTH_TOKEN;
const client = require('twilio')(accountSid, authToken);

client
  .calls('CAe1644a7eed5088b159577c5802d8be38')
  .update({
    url: 'http://demo.twilio.com/docs/voice.xml',
    method: 'POST',
  })
  .then(call => console.log(call.to));
