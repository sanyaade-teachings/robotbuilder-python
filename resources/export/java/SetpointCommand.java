#header()

package ${package}.commands;
#set($command = $helper.getByName($command-name, $robot))

import edu.wpi.first.wpilibj.command.Command;
import ${package}.Robot;

/**
 *
 */
public class  #class($command.name) extends Command {

    public #class($command.name)() {
#@autogenerated_code("requires", "        ")
#parse("${exporter-path}Command-requires.java")
#end
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
#@autogenerated_code("execute", "        ")
#parse("${exporter-path}SetpointCommand-execute.java")
#end
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
#@autogenerated_code("isFinished", "        ")
#parse("${exporter-path}SetpointCommand-isFinished.java")
#end
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
