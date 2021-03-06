// Download the Node helper library from www.twilio.com/docs/libraries/node#installation
// These identifiers are your accountSid and authToken from
// https://www.twilio.com/console
// To set up environmental variables, see http://twil.io/secure
const accountSid = process.env.TWILIO_ACCOUNT_SID;
const authToken = process.env.TWILIO_AUTH_TOKEN;
const client = require('twilio')(accountSid, authToken);

const bindingOpts = {
  identity: '00000001', // We recommend using a GUID or other anonymized identifier for Identity.
  bindingType: 'sms',
  address: '+1651000000000',
};

client.notify
  .services('ISXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX')
  .bindings.create(bindingOpts)
  .then(binding => console.log(binding.sid))
  .catch(error => console.log(error))
  .done();
