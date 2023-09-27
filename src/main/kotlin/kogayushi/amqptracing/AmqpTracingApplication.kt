package kogayushi.amqptracing

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AmqpTracingApplication

fun main(args: Array<String>) {
	runApplication<AmqpTracingApplication>(*args)
}
