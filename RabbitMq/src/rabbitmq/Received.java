/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rabbitmq;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;

public class Received {
    private static final String QUEUE_NAME= "hello";
    
    public static void main (String ragv[])throws Exception{
        ConnectionFactory cf = new ConnectionFactory();
        cf.setHost("localhost");
        Connection conn = cf.newConnection();
        Channel channel = conn.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        
        System.out.println("[*] Waiting for message. To exit press CTRL+C");
        
        DeliverCallback deliverCallback=(consumerTaq,delivery)->{
            
            String message = new String(delivery.getBody(),"UTF-8");
            System.out.println("[x]Received'"+message+"'");
           
        };
         channel.basicConsume(QUEUE_NAME, true, deliverCallback,consumerTaq ->{});
            
    }
    
}
