@Controller
public class UserController {

    // 로그인 페이지로 이동
    @RequestMapping("/user/login.do")
    public String login() {
        logger.info("경로:login");
        return "user/login";
    }
    
    // fuckfuckfuckfuck
    @RequsetMapping("/user/insert.do")
    public String insert() {
        logger.info("login: insert");
        return "user/insert";
    }
}