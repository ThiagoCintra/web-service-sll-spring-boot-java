package org.br.inmetrics.websocket.service.impl;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

@Component
public class SpringSocketTextHandler extends TextWebSocketHandler{
	
	@Override
	public void handleTextMessage(WebSocketSession session, TextMessage message)
			throws InterruptedException, IOException {
		//lendo a menssagem 
		String payload = message.getPayload();
		
		if(payload.equalsIgnoreCase("ping")) {
			session.sendMessage(new TextMessage("PONG"));
		}else {
			session.sendMessage(new TextMessage("Mensagem não reconhecida pelo serviço : " + payload));
		}
		
	}

}
