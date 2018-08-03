import java.util.ArrayList;
/**
* ReciepeBox class :
*    collection of recipe
*
*/
public class ReciepeBox {
  
   private ArrayList<Recipe> recipes;
   public ReciepeBox() {
       this.recipes = new ArrayList<>();
   }
  
   //add a Recipe in collection
   public void addItem(Recipe recipe){
       recipes.add(recipe);
   }
  
   //delete a Recipe in collection
   public void deleteItem(Recipe recipe){
       recipes.remove(recipe);
   }
  
   //print all recipes
   public void printAllRecipies(){
       int i = 0;
       for(Recipe rec: recipes){
           i++;
           System.out.println("Recipe " + i);
           rec.printRecipe();
       }
   }
  
   public static void main(String[] args) {
       //create some demo recipes
       Recipe recipe1 = Recipe.createNewRecipe("Pizza");
       Ingredient ingredient1 = new Ingredient("Anchovies",20,"gram",300);
       recipe1.addIngredient(ingredient1);
       Recipe recipe2 = Recipe.createNewRecipe("Ramen");
       Ingredient ingredient2 = new Ingredient("Noodles",50,"gram",200);
       recipe2.addIngredient(ingredient2);
       // add in box
       ReciepeBox box = new ReciepeBox();
       box.addItem(recipe1);
       box.addItem(recipe2);
       box.printAllRecipies();
   }
}
