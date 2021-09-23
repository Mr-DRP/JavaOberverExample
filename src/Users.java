import org.graalvm.compiler.lir.LIRInstruction.Use;

public class Users {
    private String name;

    public Users(String name){
        super();
        this.name = name;
    }

    /** method to repond to the notification */
    public void update(String planName){
        System.out.println("Dear "+name+", New plan:" +planName+" has been created");
    }


}
