package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {


  public final String SERVICE_URL_PRODUCTION = "https://cis.porezna-uprava.hr:8449/FiskalizacijaService";
  public final String SERVICE_URL_DEMO = "https://cistest.apis-it.hr:8449/FiskalizacijaServiceTest";

  @Bean
  public Jaxb2Marshaller marshaller() {
    Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
    marshaller.setContextPath("com.example.demo.gen");
    return marshaller;
  }

  @Bean
  public FiskalizacijaService countryClient(Jaxb2Marshaller marshaller) {
    FiskalizacijaService client = new FiskalizacijaService();
    client.setDefaultUri(SERVICE_URL_DEMO);
    client.setMarshaller(marshaller);
    client.setUnmarshaller(marshaller);
    return client;
  }


}