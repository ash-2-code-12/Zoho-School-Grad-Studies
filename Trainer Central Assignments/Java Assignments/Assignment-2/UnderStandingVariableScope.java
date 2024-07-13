// 4. Write a program with an if statement. Declare one variable inside the if block and another one outside. 
// Print both variables inside and outside the if block to understand variable scope. 
// (Comment the compiler error in your program while submitting)

public class UnderStandingVariableScope {
    public static void main(String[] args) {
        if(true){
            int numInsideIf = 12;
            System.out.println(numInsideIf);
        }
        System.out.println(numInsideIf); //Compile Time Error : numInsideIf cannot be resolved 
    }                                    //to a variable Trainer Central Assignments/Java/Assignment-2
}
