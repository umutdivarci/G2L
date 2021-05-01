

/**
* This is a superclass that all account types share.
* @author Umut Divarcı
* @date 23.04.2021  
*/

public class Account {

    // Properties
    String userName;
    String password;
    String mail;

    // Constructors

    protected Account ( String userName, String password, String mail)
    {
        this.userName = userName;
        this.password = password;
        this.mail = mail;
    }

    
    // Methods

    /** 
     * Sets the user name to the given string.
     * @param newUserName
     */

    protected void setUserName ( String newUserName)
    {
        userName = newUserName;
    }

    
    /** 
     * Sets the user name to the given string.
     * @param newPassword
     */
    protected void setPassword ( String newPassword)
    {
        password = newPassword;
    }

    
    /** 
     * Sets the user name to the given string.
     * @param newMail
     */
    protected void setMail ( String newMail)
    {
        mail = newMail;
    }

    
    /** 
     * @return String
     */
    protected String getUserName()
    {
        return userName;
    }

    
    /** 
     * @return String
     */
    protected String getPassword()
    {
        return password;
    }
    
    
    /** 
     * @return String
     */
    protected String getMail()
    {
        return mail;
    }
}
