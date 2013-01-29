package me.avocardo.guilds.messages;

import org.bukkit.entity.Player;

import me.avocardo.guilds.Guild;
import me.avocardo.guilds.GuildsBasic;

public class Console {
	
	public Console(MessageType msg, GuildsBasic GuildsBasic) {
		
		GuildsBasic.sendConsole(msg.getMessage());
		
	}
	
	public Console(MessageType msg, Player p, GuildsBasic GuildsBasic) {
		
		String message = msg.getMessage();
		
		message = message.replaceAll("/p/", p.getName());
		
		GuildsBasic.sendConsole(message);
		
	}
	
	public Console(MessageType msg, Guild g, GuildsBasic GuildsBasic) {
		
		String message = msg.getMessage();
		
		message = message.replaceAll("/g/", g.getName());
		
		GuildsBasic.sendConsole(message);
		
	}
	
	public Console(MessageType msg, String input1, GuildsBasic GuildsBasic) {
		
		String message = msg.getMessage();
		
		message = message.replaceAll("/p/", input1);
		message = message.replaceAll("/g/", input1);
		
		GuildsBasic.sendConsole(message);
		
	}
	
	public Console(MessageType msg, Player p, Guild g, GuildsBasic GuildsBasic) {
		
		String message = msg.getMessage();
		
		message = message.replaceAll("/p/", p.getName());
		message = message.replaceAll("/g/", g.getName());
		
		GuildsBasic.sendConsole(message);
		
	}
	
}
