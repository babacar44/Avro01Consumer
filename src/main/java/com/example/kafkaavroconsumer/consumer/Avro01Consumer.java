package com.example.kafkaavroconsumer.consumer;

import com.example.avro.data.Avro01;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.common.protocol.types.Field;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class Avro01Consumer {
    private static Logger LOG = LoggerFactory.getLogger(Avro01Consumer.class);

    @KafkaListener(topics = "src-avro01")
    public void listen(ConsumerRecord<String, Avro01> record){
        LOG.info("{} : {} ", record.key(), record.value());
    }
}
