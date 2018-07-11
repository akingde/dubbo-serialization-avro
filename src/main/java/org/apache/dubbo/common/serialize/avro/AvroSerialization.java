package org.apache.dubbo.common.serialize.avro;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.common.serialize.ObjectInput;
import com.alibaba.dubbo.common.serialize.ObjectOutput;
import com.alibaba.dubbo.common.serialize.Serialization;

public class AvroSerialization implements Serialization{

	@Override
	public byte getContentTypeId() {
		return 10;
	}

	@Override
	public String getContentType() {
		return "avro/binary";
	}

	@Override
	public ObjectOutput serialize(URL url, OutputStream output) throws IOException {
		return new AvroObjectOutput(output);
	}

	@Override
	public ObjectInput deserialize(URL url, InputStream input) throws IOException {
		return new AvroObjectInput(input);
	}

}
