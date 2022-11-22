/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wohs_scheduler;

/**
 *F
 * @author nokolie23
 */
public class WOHS_Scheduler{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int[] period = {       1,      2,            3,              4,     5,          6 ,       7,      8};
        String[] subject = {"Math", "English", "Computer Science", "Gym", "Science", "History", "Art", "Foreign Lang."};
        String[] teacher = {"Kim" , "Baker", "Leach", "Fleck" ,  "DeAngelis" , "Miskimmon", "Clark", "Zamloot"};
        double[] stars =   {  4.9     ,   4.8      ,   3.5      ,    4.7      ,    4.95          ,    4.85        ,     4.75    ,          4.91};        
        
        
        int choice = 0;
        
        searchperiod(period, subject, teacher, stars , 3);
        
        sortstars(period, subject, teacher, stars);
        
        for(int x = 0; x<stars.length; x++)
        {
            System.out.println(period[x] + " -- " + teacher[x] + " -- "
            + subject[x] + " -- " + stars[x]);
        }
        
        sortteacher(period, subject, teacher, stars);
        
        for(int x = 0; x < teacher.length; x++)
        {
            System.out.println(teacher[x]);
        }
        
        searchteacher(period, subject, teacher, stars, "Kim");
        
        for(int x = 0; x<stars.length; x++)
        {
            System.out.println(period[x] + " -- " + teacher[x] + " -- "
            + subject[x] + " -- " + stars[x]);
        }
       
        
        
        
    }
    //-------------------------------------------------------------------------------
    static void sortstars(int[] p, String[] s, String[] t, double[] st)
    {
        double[] nums = st;
        
        int highest = 0;
        for(int x = 0; x<nums.length - 1; x++)
        {
            highest = x;
            //SCan for the highest
            for(int y = x; y<nums.length ; y++)
            {
                if(nums[y] > nums[highest])
                {
                    highest = y;
                }                    
            }
           ///Swap or Switcheroo
            double temp = nums[highest];
            nums[highest] = nums[x];
            nums[x] = temp;
            //nums is st, but still need for p, t, s
            int temp2 = p[highest];
            p[highest] = p[x];
            p[x] = temp2;
            
            String temp3 = s[highest];
            s[highest] = s[x];
            s[x] = temp3;
            
            String temp4 = t[highest];
            t[highest] = t[x];
            t[x] = temp4;
            
        }
        
   
    }
    //-------------------------------------------------------------------------------
    static void searchperiod(int[] p, String[] s, String[] t, double[] st, int find)
    {
         
    int u=0;
    int left;
    int right;
     
    int[] array = p;
    left = 0;
    right = array.length-1;

     while(left <= right)
     {   
         u = (left + right) / 2;
         if (array[u]==find)
         {
        // System.out.println("position " + u + " had the value");
             System.out.println("---RESULTS---");
             System.out.println(p[u] + " -- " + t[u] + " -- "
             + s[u] + " -- " + st[u]);
             
             break;
         }
             
         else if (array[u] > find)            
         {                                              
              right = u - 1;
         //     System.out.println("position " + u +" was too high");
         }                                                             
         else                                                   
         {                                                        
              left = u + 1;    // Else, increase u by one. 
             // System.out.println("position " + u +" was too low");
         }  
     }  
     if (left <= right)
     {
           System.out.println("The number was found at array index " + u);
     }
     else
          System.out.println("Sorry, the number is not in this array.");   
    }
       

    //-------------------------------------------------------------------------------
    static void sortsubject(int[] p, String[] s, String[] t, double[] st)
    {
        //CHANGE SO THAT IT SORTS BY SUBJECT
        double[] nums = st;
        
        int highest = 0;
        for(int x = 0; x < nums.length - 1; x++)
        {
            highest = x;
            //SCan for the highest "cat".compareTo("dog");
            for(int y = x; y < nums.length ; y++)
            {
                if(s[y].compareTo(s[highest]) < 0)
                {
                    highest = y;
                }                    
            }
           ///Swap or Switcheroo
            double temp = nums[highest];
            nums[highest] = nums[x];
            nums[x] = temp;
            //nums is st, but still need for p, t, s
            int temp2 = p[highest];
            p[highest] = p[x];
            p[x] = temp2;
            
            String temp3 = s[highest];
            s[highest] = s[x];
            s[x] = temp3;
            
            String temp4 = t[highest];
            t[highest] = t[x];
            t[x] = temp4;
            
        }
        
    }
      
        /*
        //--------------------BINARY SEARCH-------
        
        */
    //--------------------------------------------------------------------
    static void sortteacher(int[] p, String[] s, String[] t, double[] st)
    {
        //CHANGE SO THAT IT SORTS BY SUBJECT
        double[] nums = st;
        
        int highest = 0;
        for(int x = 0; x<nums.length - 1; x++)
        {
            highest = x;
            //SCan for the highest
            for(int y = x; y<nums.length ; y++)
            {
                if(t[y].compareTo(t[highest]) < 0)
                {
                    highest = y;
                }                    
            }
           ///Swap or Switcheroo
            double temp = nums[highest];
            nums[highest] = nums[x];
            nums[x] = temp;
            //nums is st, but still need for p, t, s
            int temp2 = p[highest];
            p[highest] = p[x];
            p[x] = temp2;
            
            String temp3 = s[highest];
            s[highest] = s[x];
            s[x] = temp3;
            
            String temp4 = t[highest];
            t[highest] = t[x];
            t[x] = temp4;
            
        }
        
    }
    //--------------------------------------------------------------------------------
    static void searchteacher(int[] p, String[] s, String[] t, double[] st, String find)
    {
         
    int u = 0;
    int left;
    int right;
     
    String[] array = t;
    left = 0;
    right = array.length-1;

     while(left <= right)
     {   
         u = (left + right) / 2;
         if (array[u].equals(find))
         {
        // System.out.println("position " + u + " had the value");
             System.out.println("---RESULTS---");
             System.out.println(p[u] + " -- " + t[u] + " -- "
             + s[u] + " -- " + st[u]);
             
             break;
         }
             
         else if (find.compareTo(array[u]) < 0)            
         {                                              
              right = u - 1;
         //     System.out.println("position " + u +" was too high");
         }                                                             
         else                                                   
         {                                                        
              left = u + 1;    // Else, increase u by one. 
             // System.out.println("position " + u +" was too low");
         }  
     }  
     if (left <= right)
     {
           System.out.println("The number was found at array index " + u);
     }
     else
          System.out.println("Sorry, the number is not in this array.");   
    }
        
        
}