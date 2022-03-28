package designpatterns.structural.factory;


import designpatterns.structural.factory.message.JSONMessage;
import designpatterns.structural.factory.message.Message;

/**
 * Provides implementation for creating JSON messages
 */
public class JSONMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new JSONMessage();
	}

	
}
