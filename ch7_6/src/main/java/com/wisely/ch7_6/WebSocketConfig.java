package com.wisely.ch7_6;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

/**
 * Created by luyongchang on 17/3/21.
 */
@Configurable
@EnableWebSocketMessageBroker
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer{
	@Override
	public void registerStompEndpoints(StompEndpointRegistry stompEndpointRegistry) {
		stompEndpointRegistry.addEndpoint("/endpointWisely").withSockJS();
	}

	@Override
	public void configureMessageBroker(MessageBrokerRegistry registry) {
		registry.enableSimpleBroker("/topic");
	}
}
