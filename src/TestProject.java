import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author Rajorshi Biswas
 */
public class TestProject {

    /**w
     * @param args the command line arguments
     */
    

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        System.out.println("Hellow worlld");
        Result result = JUnitCore.runClasses(DateTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
    }
    
}