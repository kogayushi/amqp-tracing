package kogayushi.amqptracing

import org.springframework.amqp.rabbit.config.ContainerCustomizer
import org.springframework.amqp.rabbit.listener.DirectMessageListenerContainer
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration


@Configuration(proxyBeanMethods = false)
class ObservabilityConfig {

    @Bean
    fun directMessageListenerContainerCustomizer(): ContainerCustomizer<DirectMessageListenerContainer> {
        return ContainerCustomizer { container: DirectMessageListenerContainer -> container.setObservationEnabled(true) }
    }
}
