package designpatterns.structural.abstractfactory.aws;


import designpatterns.structural.abstractfactory.Instance;
import designpatterns.structural.abstractfactory.Instance.Capacity;
import designpatterns.structural.abstractfactory.ResourceFactory;
import designpatterns.structural.abstractfactory.Storage;

//Factory implementation for Google cloud platform resources
public class AwsResourceFactory implements ResourceFactory {

	@Override
	public Instance createInstance(Capacity capacity) {
		return new Ec2Instance(capacity);
	}

	@Override
	public Storage createStorage(int capMib) {
		return new S3Storage(capMib);
	}


}
