package kogayushi.amqptracing

import org.springframework.amqp.rabbit.annotation.RabbitListener
import org.springframework.stereotype.Component

@Component
class DemoListener {

    @RabbitListener(queues = ["amqp-tracing"])
    fun demo(message:String) : String {

        return "processed $message"
    }
}
