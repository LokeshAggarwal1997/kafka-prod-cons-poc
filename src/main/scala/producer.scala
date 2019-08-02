import java.util.Properties
import org.apache.kafka.clients.producer._
import org.slf4j.{Logger, LoggerFactory}
class Producer {
  val logger: Logger = LoggerFactory.getLogger("Producer")
  def writeToKafka(topic: String): Unit = {
    val props = new Properties()
    props.put("bootstrap.servers", "localhost:9092")
    props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer")
    val producer = new KafkaProducer[Nothing, String](props)

    for(i <-1 to 50){
      logger.info("Producing......")
      val record = new ProducerRecord[Nothing, String](topic, i.toString)
      producer.send(record)
    }


    producer.close()
  }
}