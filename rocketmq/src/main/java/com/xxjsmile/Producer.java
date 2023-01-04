package com.xxjsmile;


import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

import java.util.Date;

/**
 *
 */
public class Producer {
    public static void main(String[] args) throws MQClientException, InterruptedException {
        //创建一个消息生产者，传入的是消息组名称
        DefaultMQProducer producer = new DefaultMQProducer("rmq-group");
        //输入nameserver服务的地址
        producer.setNamesrvAddr("127.0.0.1:9876");
        producer.setInstanceName("producer");
        //启动生产者
        producer.start();
        try {
            for (int i = 0; i < 10; i++) {
                Thread.sleep(1000);  //每秒发送一次MQ
                //创建消息
                Message msg = new Message("Topic-test",// topic
                        "testTag",// tag
                        (new Date() + " RocketMQ test msg " + i).getBytes()// body
                );

                //发送，返回结果对象
                SendResult sendResult = producer.send(msg);

                System.out.println(sendResult.getMsgId()); //消息id
                System.out.println(sendResult.getMessageQueue()); //队列信息
                System.out.println(sendResult.getSendStatus());  //发送结果
                System.out.println(sendResult.getOffsetMsgId()); //下一个要消费的消息的偏移量
                System.out.println(sendResult.getQueueOffset());  //队列消息偏移量
                System.out.println();
                System.out.println("================================================");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        producer.shutdown();
    }

}