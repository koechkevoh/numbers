
package rabbitmq;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.Channel;



public class Send {
    private final static String QUEUE_NAME ="hello";
    
    public static void main (String [] args)throws Exception{
        ConnectionFactory cf= new ConnectionFactory();
        cf.setHost("localhost");
        
        try(Connection conn = cf.newConnection();
                Channel channel = conn.createChannel()){
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String message= "hello world";
        channel.basicPublish("",QUEUE_NAME,null, message.getBytes("UTF-8"));
        }
    }
    

    
}
