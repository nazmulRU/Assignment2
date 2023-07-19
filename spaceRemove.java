public class spaceRemove {
    public static void main(String[] args) {
        String food = "My favorite food is hamburger" ;
        food.trim() ;
        System.out.println(food.trim());
        food = food.replace(" ","") ;
        System.out.println(food);
    }
}
