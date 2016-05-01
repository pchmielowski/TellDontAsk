package dontask;

public class DontAsk {

    public static void main(String[] args) {
        Person me = new Person("Piotr", "Chmielowski");
        
        WindowView window = new WindowView();
        me.showOn(window);
        window.show();
        
        HtmlView html = new HtmlView();
        me.showOn(html);
        html.show();
    }
}
