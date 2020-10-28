 


/**
 * Write a description of class printTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class printTriangle
{
    int n = (int)((Math.random()*4)+ 12);
    
     public static void main(String args[]) 
    {
       new printTriangle();
    }

    
    public printTriangle()
    {
        
        System.out.println();
        
         for (int i=0; i<n; i++) 
        { 
  
            // inner loop to handle number spaces 
            // values changing acc. to requirement 
            for (int j=n-i; j>1; j--) 
            { 
                // printing spaces 
                System.out.print(" "); 
            } 
   
            //  inner loop to handle number of columns 
            //  values changing acc. to outer loop 
            for (int j=0; j<=i; j++ ) 
            { 
                // printing stars 
                System.out.print("* "); 
            } 
   
            // ending line after each row 
            System.out.println(); 
        } 
    } 
    }

    

