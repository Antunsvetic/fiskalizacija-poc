package com.example.demo;

import org.springframework.ws.client.WebServiceClientException;
import org.springframework.ws.client.support.interceptor.ClientInterceptor;
import org.springframework.ws.context.MessageContext;

public class RequestLoggingInterceptor implements ClientInterceptor {

    @Override
    public boolean handleRequest(MessageContext messageContext) throws WebServiceClientException {
        // Log SOAP request data here
        System.out.println("SOAP Request Data: ");
        System.out.println(messageContext.getRequest());

        // Continue with the request
        return true;
    }

    @Override
    public boolean handleResponse(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public boolean handleFault(MessageContext messageContext) throws WebServiceClientException {
        return false;
    }

    @Override
    public void afterCompletion(MessageContext messageContext, Exception e) throws WebServiceClientException {

    }

    // Override other methods of ClientInterceptor as needed
}