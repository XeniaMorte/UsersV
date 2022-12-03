public class Main {
    public static void main(String[] args)  {
        Form f1=new Form("ibxgd","isjsnd","isjsnd");
       try {
           var a = f1.correctFormLogin(f1.getLogin());
           var b=f1.correctFormPassword(f1.getPassword());
           var c=f1.correctFormPass2(f1.getConfirmPassword());
           System.out.println(a);
           System.out.println(b);
           System.out.println(c);
       } catch (WrongLoginException e){
           System.out.println(e);
       } catch (WrongPasswordForm e) {
           System.out.println(e);
       }
    }

}