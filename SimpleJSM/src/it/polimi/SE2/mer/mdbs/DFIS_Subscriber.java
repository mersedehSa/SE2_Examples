package it.polimi.SE2.mer.mdbs;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * A Message-Driven Bean implementation 
 * 
 * It is a subscriber for the Topic_DFIS
 */
@MessageDriven(
		activationConfig = { 
				@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/topic/TopicDFIS"),
				@ActivationConfigProperty( propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
			    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })  

public class DFIS_Subscriber implements MessageListener {
	private final static Logger LOGGER = Logger.getLogger(DFIS_Subscriber.class.toString());

    public DFIS_Subscriber() { }
	
    public void onMessage(Message message) {

	    TextMessage msg = null;

    	msg = (TextMessage) message;
		try {
			LOGGER.info("Department of Physisc Received a Message." );

			LOGGER.info("Student ID : " + msg.getText() +  " Registration Confirmed!");
			
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
