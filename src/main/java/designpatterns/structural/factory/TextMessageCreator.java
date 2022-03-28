package designpatterns.structural.factory;

import designpatterns.structural.factory.message.Message;
import designpatterns.structural.factory.message.TextMessage;

/**
 * Provides implementation for creating Text messages
 */
public class TextMessageCreator extends MessageCreator {

	@Override
	public Message createMessage() {
		return new TextMessage();
	}
}
