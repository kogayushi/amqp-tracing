package kogayushi.amqptracing

import org.springframework.amqp.rabbit.core.RabbitTemplate

import org.springframework.boot.autoconfigure.amqp.RabbitTemplateCustomizer
import org.springframework.stereotype.Component


@Component
class ObservabilityCustomTemplate : RabbitTemplateCustomizer {
    override fun customize(rabbitTemplate: RabbitTemplate) {
        rabbitTemplate.setObservationEnabled(true)
    }
}
