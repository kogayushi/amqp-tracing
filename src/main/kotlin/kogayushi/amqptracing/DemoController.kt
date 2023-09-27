package kogayushi.amqptracing

import org.slf4j.LoggerFactory
import org.slf4j.MDC
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class DemoController(
    private val rabbitTemplate: RabbitTemplate,
) {

    companion object {
        private val logger = LoggerFactory.getLogger(DemoController::class.java)
    }

    @GetMapping("/demo")
    fun demo(): String {

        logger.info("trace id => {}", MDC.get("X-B3-TraceId"))
        val receive = rabbitTemplate.convertSendAndReceive("amqp-tracing", "amqp-tracing", "Hello World!")
        return receive as String
    }
}
