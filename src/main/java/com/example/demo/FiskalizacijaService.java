package com.example.demo;

import com.example.demo.gen.RacunOdgovor;
import com.example.demo.gen.RacunZahtjev;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;

public class FiskalizacijaService extends WebServiceGatewaySupport {

  public RacunOdgovor sendRequest(RacunZahtjev request) {
   // getWebServiceTemplate().setInterceptors(new ClientInterceptor[]{new RequestLoggingInterceptor()});
    return (RacunOdgovor) getWebServiceTemplate().marshalSendAndReceive(request);
  }


}