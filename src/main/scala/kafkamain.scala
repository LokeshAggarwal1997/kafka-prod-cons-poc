import com.typesafe.config._
object kafkamain extends App {
  val config = ConfigFactory.load().getConfig("main")


  //val topicname = util.Try(args(0)).getOrElse( config.getString("topic"))
  val topicname = "opo"
  println(s"Connecting to $topicname")



  val prod = new Producer
  prod.writeToKafka(topicname)

  val cons = new Consumer
  cons.consumeFromKafka(topicname)





}
