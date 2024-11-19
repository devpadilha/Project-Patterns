public class Demo {
    public static void main(String[] args) {
        Menu menuCafeDaManha = new BreakfestMenu();
        Menu menuAlmoco = new LunchMenu();
        Menu menuJantar = new DinerMenu();

        Waiter garcom = new Waiter(menuCafeDaManha, menuAlmoco, menuJantar);
        garcom.printMenu();
    }
}
