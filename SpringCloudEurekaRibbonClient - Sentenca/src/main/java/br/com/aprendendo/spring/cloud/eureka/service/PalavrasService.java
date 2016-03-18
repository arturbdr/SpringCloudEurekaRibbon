package br.com.aprendendo.spring.cloud.eureka.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.aprendendo.spring.cloud.feign.ClientAdjetivoRemoteService;
import br.com.aprendendo.spring.cloud.feign.ClientPronomeRemoteServices;

@Service
public class PalavrasService {

	@Autowired
	private ClientPronomeRemoteServices clientPronomeRemoteServices;

	@Autowired
	private ClientAdjetivoRemoteService adjetivoRemoteService;

	public String getPronome() {
		return clientPronomeRemoteServices.getPronome();
	}

	public String getAdjetivo() {
		return adjetivoRemoteService.getAdjetivo();
	}

}
