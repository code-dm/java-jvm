package com.codingdm.flink;

import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.functions.ReduceFunction;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.api.java.tuple.Tuple;
import org.apache.flink.api.java.tuple.Tuple2;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.streaming.api.functions.windowing.ProcessAllWindowFunction;
import org.apache.flink.streaming.api.windowing.time.Time;
import org.apache.flink.streaming.api.windowing.windows.TimeWindow;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer;
import org.apache.flink.util.Collector;

import java.util.Properties;

public class FlinkKafkaConsumerDemo {
    public static void main(String[] args) throws Exception {
        Properties props = new Properties();
        props.put("bootstrap.servers", "10.168.3.145:9092,10.168.3.147:9092,10.168.3.148:9092");
        props.put("zookeeper.connect", "10.168.3.145:2181,10.168.3.147:2181,10.168.3.148:2181");
        props.put("group.id", "flink_test");
        props.put("auto.offset.reset", "earliest");
        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
        final StreamExecutionEnvironment flinkEnv = StreamExecutionEnvironment.getExecutionEnvironment();

        FlinkKafkaConsumer<String> kafkaSource = new FlinkKafkaConsumer<>("flink.test", new SimpleStringSchema(), props);


        flinkEnv.addSource(kafkaSource)
                .keyBy(String::toLowerCase)
                .timeWindow(Time.seconds(2))
                .reduce(new ReduceFunction<String>() {
                    @Override
                    public String reduce(String tuple, String t1) throws Exception {

                        return tuple;
                    }
                }).addSink(new SinkFunction<String>() {
                    @Override
                    public void invoke(String value) throws Exception {
                        Thread.sleep(1000);
                        System.out.println(value);
                    }
                });
        flinkEnv.execute("mriya run topic");
    }


}
