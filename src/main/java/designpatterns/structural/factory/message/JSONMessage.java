package designpatterns.structural.factory.message;

public class JSONMessage extends Message {

	@Override
	public String getContent() {
		return "{\"JSON]\":[]}";
	}
	
}
