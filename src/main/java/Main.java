
interface comparing{
    void getUrl();
    void getResponse();
    void compare();
}

class hitAPI implements comparing{
    @Override
    public void getUrl(){
        System.out.println("ini get url");
    }

    @Override
    public void getResponse(){
        System.out.println("ini get response");
    }

    @Override
    public void compare(){
        System.out.println("ini compare");
    }


}
public class Main {
    public static void main (String[] args){
        hitAPI API1 = new hitAPI();

        API1.getUrl();
        API1.getResponse();
        API1.compare();
    }

}
