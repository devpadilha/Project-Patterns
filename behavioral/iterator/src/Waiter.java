public class Waiter {
    private Menu breakFastMenu;
    private Menu lunchMenu;
    private Menu dinnerMenu;

    public Waiter(Menu breakFastMenu, Menu lunchMenu, Menu dinnerMenu) {
        this.breakFastMenu = breakFastMenu;
        this.lunchMenu = lunchMenu;
        this.dinnerMenu = dinnerMenu;
    }

    public void printMenu() {
        Iterator breakFastIterator = breakFastMenu.createIterator();
        Iterator lunchIterator = lunchMenu.createIterator();
        Iterator dinnerIterator = dinnerMenu.createIterator();

        System.out.println("MENU CAFÉ DA MANHÃ");
        printMenu(breakFastIterator);
        System.out.println("\nMENU ALMOÇO");
        printMenu(lunchIterator);
        System.out.println("\nMENU JANTAR");
        printMenu(dinnerIterator);
    }

    private void printMenu(Iterator iterator) {
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
