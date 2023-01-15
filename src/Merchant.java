public class Merchant {

    public static Item potion = new Item("Лечебное зелье", 20);

    public static void sell(FantasyCharacter hero) {
        if (hero.getGold() >= potion.getPrice()) {
            hero.setGold(hero.getGold() - potion.getPrice());
            hero.setHealth(100);
            System.out.println("Здоровье восстановлено! Теперь у вас " + hero.getGold() + " золота!");
        } else {
            System.out.println("Недостаточно золота!");
        }
    }
}
class Item {
    private String title;
    private int price;

    public Item(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}



