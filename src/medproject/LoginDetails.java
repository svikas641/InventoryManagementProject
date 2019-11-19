package medproject;

public class LoginDetails {
    private String UserId;
    private String Name;
    private String Password;
    private String ConfirmPassword;
            
    public LoginDetails(String pUserId, String pName, String pPassword, String pConfirmPassword){
    
        this.UserId = pUserId;
        this.Name = pName;
        this.Password = pPassword;
        this.ConfirmPassword = pConfirmPassword;
    }
        public String getUserId(){
            return UserId;
        }
        public String getName(){
            return Name;
        }
        public String getPassword(){
            return Password;
        }
        public String ConfirmPassword(){
            return ConfirmPassword;
        }
    
    
    
    
    
 
    
    
public static void main(String args[]){


}
}