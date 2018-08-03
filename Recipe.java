import java.util.ArrayList;
/**
* Recipe class :
*    create one recipe
*
*/
public class Recipe {
   //variables
   private ArrayList<Ingredient> ingredientList;
   private ArrayList<String> instructions;
   private String recipeName;
   private double totalRecipeCalories;
  
   //constructor
   public Recipe(String recipeName) {
       this.recipeName = recipeName;
       this.ingredientList = new ArrayList<>();
       this.instructions = new ArrayList<>();
   }
  
   //get IngredientList
   public ArrayList<Ingredient> getIngredientList() {
       return ingredientList;
   }
  
   //set IngredientList
   public void setIngredientList(ArrayList<Ingredient> ingredientList) {
       this.ingredientList = ingredientList;
   }
  
   // add Ingredient in recipe
   public boolean addIngredient(Ingredient ingredient){
       return this.ingredientList.add(ingredient);
   }
  
   // remove Ingredient in recipe
   public boolean removeIngredient(Ingredient ingredient){
       return this.ingredientList.remove(ingredient);
   }
  
   // remove all Ingredient in recipe
   public boolean removeAllIngredient(){
       return this.ingredientList.removeAll(ingredientList);
   }
  
   // print Ingredients in recipe
   public void printRecipe(){
       int i = 0;
       System.out.println("Reciepe contains:");
       for (Ingredient ing : ingredientList){
           i++;
           System.out.println(i);
           ing.printItemDetails();
          
       }
   }
   //create new recipe
   public static Recipe createNewRecipe(String recipeName){
       return new Recipe(recipeName);
   }
  
   //insert instruction
   public boolean insertInstruction(String instruction){
       return this.instructions.add(instruction);
   }
  
   public void printInstruction(){
       instructions.toString();
   }
}
