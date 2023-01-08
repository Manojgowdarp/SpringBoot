public class shata {
    @Controller
    public class IndexController {
        @RequestMapping("/")
        String index(){
            return "index";
        }
}
