package br.com.cannoni.testejsf22.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 * @author patrizio
 * @since 15/03/2017
 */
@ServerEndpoint(value = "/myendpoint")
public class MyWebSocketEndpoint {

	private static List<Session> sessions = new ArrayList<>();
	
	@OnOpen
	public void onOpen(Session session) {
		System.out.println("Conectando com: " + session.getId());
		sessions.add(session);
		System.out.println("Clientes conectados " + sessions.size());
	}
	
	@OnMessage
	public void messageReceiver(String message) {
		System.out.println("Received message:" + message);
	}
	
	@OnClose
	public void onClose(Session session) {
		System.out.println("Desconectando: " + session.getId());
		sessions.remove(session);
	}
	
	@OnError
	public void onError(Session session, Throwable t) {
		System.out.println(t.getMessage());
	}
	
}
