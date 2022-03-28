package designpatterns.structural.abstractfactory.gcp;

import designpatterns.structural.abstractfactory.Instance;
import designpatterns.structural.abstractfactory.Instance.Capacity;
import designpatterns.structural.abstractfactory.ResourceFactory;
import designpatterns.structural.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class GoogleResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new GoogleComputeEngineInstance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new GoogleCloudStorage(capMib);
	}
	

}
