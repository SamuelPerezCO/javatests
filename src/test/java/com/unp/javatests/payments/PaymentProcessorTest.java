package com.unp.javatests.payments;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PaymentProcessorTest {

    private PaymentGateway paymentGateway;
    private PaymentProcessor paymentProcessor;

    @Before
    public void setup(){
        paymentGateway = Mockito.mock(PaymentGateway.class);
        paymentProcessor = new PaymentProcessor(paymentGateway);
    }

    @Test
    public void payment_is_correct(){

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.OK));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        boolean result = paymentProcessor.makePayment(1000);

        assertTrue(result);
    }

    @Test
    public void payment_is_wrong(){

        PaymentGateway paymentGateway = Mockito.mock(PaymentGateway.class);
        Mockito.when(paymentGateway.requestPayment(Mockito.any())).thenReturn(new PaymentResponse(PaymentResponse.PaymentStatus.ERROR));

        PaymentProcessor paymentProcessor = new PaymentProcessor(paymentGateway);

        assertFalse(paymentProcessor.makePayment(1000));
    }

}