package MysqlQueries;

import NetWorkProtocol.NetworkProtocol;

public class Sql_Interaction implements Sql_Interaction_Type, Sql_Create_Acc_Update, Sql_TimeTable_Queries{
    
    public final String getAllLoginInfo = "select * from login_info";
    public final String getAllUserInfo = "select * from user";
    public final String getAllCoursesInfo = "select * from courses";

    public String createLoginUserQuery(String username, String password){
        return "select BilkentID from login_info where Username = '" + username + "' and Password = '" + password + "'";
    }

    public String createBilkentIDUniquessQuery(String bilkentID){
        return "select * from login_info where BilkentID = " + bilkentID;
    }

    public String createUserInfoQuery(String username){
        String queryBuilder = "select user.Firstname, user.Lastname, user.UserID" + 
                              " from user, login_info " + 
                              "where login_info.Username = '" + username + "' && login_info.UserID = user.UserID;";
        return queryBuilder;
    }

    public String createGetCurrentLectureQuery(String userID ,String dayCol, String lectureCol){
        System.out.println(userID + NetworkProtocol.DATA_DELIMITER + dayCol + NetworkProtocol.DATA_DELIMITER + lectureCol);
        return null;
    }

    //helper method for getting current lecture...need to map the lecture column to date

}