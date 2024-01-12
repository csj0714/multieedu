package test.com;

import java.util.Objects;

public class Message {

	private String command;
	private String to;

	public Message() {
		// TODO Auto-generated constructor stub
	}

	public Message(String command, String to) {
		super();
		this.command = command;
		this.to = to;
	}

	public String getCommand() {
		return command;
	}

	public void setCommand(String command) {
		this.command = command;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	@Override
	public int hashCode() {
		return Objects.hash(command, to);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Message other = (Message) obj;
		return Objects.equals(command, other.command) && Objects.equals(to, other.to);
	}

	@Override
	public String toString() {
		return "Message [command=" + command + ", to=" + to + "]";
	}

}