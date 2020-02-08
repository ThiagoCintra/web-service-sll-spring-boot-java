package org.br.inmetrics.websocket.service.impl;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;

@Configuration
@EnableWebSocket
public class SpringSocketConfigurator implements WebSocketConfigurer {
	public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
		registry.addHandler(new SpringSocketTextHandler(), "/spring").setAllowedOrigins("*");
	}

}