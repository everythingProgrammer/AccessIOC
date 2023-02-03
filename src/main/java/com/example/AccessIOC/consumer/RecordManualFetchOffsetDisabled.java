package com.example.AccessIOC.consumer;


import org.apache.kafka.clients.consumer.Consumer;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.listener.AcknowledgingConsumerAwareMessageListener;
import org.springframework.kafka.support.Acknowledgment;
import org.springframework.stereotype.Component;


//@Component
public class RecordManualFetchOffsetDisabled implements AcknowledgingConsumerAwareMessageListener<String,String> {


//public class RecordManualFetchOffsetDisabled{

    @Override
    @KafkaListener(topics="demo_java")
    public void onMessage(ConsumerRecord<String,String> consumerRecord , Acknowledgment acknowledgment, Consumer<?,?> consumer){
            System.out.println(consumerRecord.key() +" - " +consumerRecord.value());

    }



//    @KafkaListener(topics="demo_java")
//    public void onMessage(ConsumerRecord<String,String> consumerRecord ){
//        System.out.println(consumerRecord.key() +" - " +consumerRecord.value());
//
//    }
}