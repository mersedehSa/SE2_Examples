package it.polimi.SE2.mer.mdbs;

import java.util.logging.Logger;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Message-Driven Bean implementation class for: DEIB_Subsriber
 */
@MessageDriven(
		activationConfig = { 
		@ActivationConfigProperty(propertyName = "destination", propertyValue = "java:/topic/TopicDEIB"),	
		@ActivationConfigProperty( propertyName = "destinationType", propertyValue = "javax.jms.Topic"),
	    @ActivationConfigProperty(propertyName = "acknowledgeMode", propertyValue = "Auto-acknowledge") })  

public class DEIB_Subsriber implements MessageListener {

	private final static Logger LOGGER = Logger.getLogger(DEIB_Subsriber.class.toString());

    public DEIB_Subsriber() { }
	
    public void onMessage(Message message) {

	    TextMessage msg = null;

    	msg = (TextMessage) message;
		try {
			
			LOGGER.info("Department of Electronics, Information and Bioengineering Received a Message." );

			LOGGER.info("Student ID : " + msg.getText() + " Registration Confirmed");
			
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

    }

}
