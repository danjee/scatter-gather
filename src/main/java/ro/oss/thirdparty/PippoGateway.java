package ro.oss.thirdparty;

import java.util.List;

import org.springframework.integration.annotation.Gateway;

public interface PippoGateway {

	@Gateway(requestChannel = "inputDistribution")
	List<String> hello(String name);
	
}
