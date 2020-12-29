public class User {

    private String userName;
    private String userSurName;
    private String userPassword;
    private Integer userID;



public User (String userName, String userSurName, String userPassword ) {
    this.userName = userName;
    this.userSurName = userSurName;
    this.userPassword = userPassword;

}

@Override
    public String toString(){
    String userDataOverview = "\n-----------\n";
    userDataOverview += "\nName: " + userName;
    userDataOverview += "\nSurname: " + userSurName;

    return userDataOverview;

}


}
