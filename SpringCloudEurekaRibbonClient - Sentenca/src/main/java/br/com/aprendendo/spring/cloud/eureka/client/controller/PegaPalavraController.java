package br.com.aprendendo.spring.cloud.eureka.client.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PegaPalavraController {

	@Autowired
	private DiscoveryClient discoveryClient;

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@RequestMapping("/sentenca")
	public String getSentenca() {
		StringBuffer sentenca = new StringBuffer();

		sentenca.append(getWord("EurekaClientPronome"));
		sentenca.append(getWord("EurekaClientAdjetivo"));

		return sentenca.toString();
	}

	public String getWord(String service) {

		ServiceInstance serverInstance = loadBalancerClient.choose(service);
		if (serverInstance != null) {
			URI uri = serverInstance.getUri();
			if (uri !=null ) {
				return (new RestTemplate()).getForObject(uri+"/palavra",String.class);
			}
		}
		return null;
	}

}
