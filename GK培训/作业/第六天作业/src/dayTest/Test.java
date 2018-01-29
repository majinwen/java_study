package dayTest;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 15:25
 ***************************************/
public class Test {
    public static void main(String[] args){
        LoginService loginService = new LoginServiceImpl();
        loginService.login("123","456");
    }
}
