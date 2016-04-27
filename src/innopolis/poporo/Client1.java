package innopolis.poporo;

public class Client1 {
    private PoporoFactory pf = null;
    
    public Client1(PoporoFactory p) {
        pf = p;
    }
    
    public void run() {
        ContentItem c = pf.createContentItem();
        Page p = pf.createPage();
        User u = pf.createUser();
    }
    
    public static void main(String[] args) {
        EnchantedPoporoFactory epf = new EnchantedPoporoFactory();
        Client1 c = new Client1(epf);
        System.out.println("waiting ...");
        try {
            Thread.sleep(1000);                 
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
        c.run();
        System.out.println("finished");
    }
    
}