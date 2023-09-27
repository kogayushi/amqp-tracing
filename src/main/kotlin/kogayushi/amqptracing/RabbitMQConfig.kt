package kogayushi.amqptracing

import org.springframework.amqp.core.Binding
import org.springframework.amqp.core.BindingBuilder
import org.springframework.amqp.core.Exchange
import org.springframework.amqp.core.ExchangeBuilder
import org.springframework.amqp.core.Queue
import org.springframework.amqp.core.QueueBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class RabbitMQConfig{

    @Bean
    fun queue(): Queue = QueueBuilder.durable("amqp-tracing").autoDelete().build()

    @Bean
    fun exchange(): Exchange = ExchangeBuilder.directExchange("amqp-tracing").build()

    @Bean
    fun binding(): Binding = BindingBuilder.bind(queue()).to(exchange()).with("amqp-tracing").noargs()
}
