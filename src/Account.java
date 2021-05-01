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

    protected void setUserName ( String newUserName)
    {
        userName = newUserName;
    }

    protected void setPassword ( String newPassword)
    {
        password = newPassword;
    }

    protected void setMail ( String newMail)
    {
        mail = newMail;
    }

    protected String getUserName()
    {
        return userName;
    }

    protected String getPassword()
    {
        return password;
    }
    
    protected String getMail()
    {
        return mail;
    }
}
