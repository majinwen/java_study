package dayTest;

/***************************************
 *made by pengyao1207
 * create:2018/01/29 15:19
 ***************************************/
public class LoginController {
    private LoginService loginService;
    public void login(){
        loginService.login("123","456");
    }
}
