package medproject;

import java.sql.Connection;
import java.sql.DriverManager;

public class MedProject {

    private int S_No;
    private String MedName;
    private float PPM;
    private float Expiry_Date;

    public MedProject(int pS_No, String pMedName, float pPPM , float pExpiry_Date){
        this.S_No = pS_No;
        this.MedName= pMedName;
        this.PPM= pPPM;
        this.Expiry_Date = pExpiry_Date;
} 
    public int getS_No()
            {
                return S_No;
            }
    
    public String getMedName(){
           return MedName;
            }
      
    public float getPPM(){
            return PPM;
    }
    
    public float getExpiry_Date(){
            return Expiry_Date;
    }
    
    public static Connection getConnection(){
            Connection con = null;
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/medicineprojectdb?autoReconnect=true&useSSL=false","root","vikas@123");
               }
            catch(Exception ex){
                System.out.println(ex.getMessage());
            }
            return con;
    }
    
    
    public static void main(String[] args) {
        Main_Window mw = new Main_Window();
        mw.setVisible(true);
    }
    
}
