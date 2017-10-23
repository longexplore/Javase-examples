package behavior.command.simpleremote;

/**
 * 打开电灯的命令
 */
public class LightOnCommand implements Command {
	
	Light light;
  
	public LightOnCommand(Light light) {
		this.light = light;
	}
 
	public void execute() {
		light.on();
	}
}
