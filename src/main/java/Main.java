public class Main {
    public static void main(String[] args) {
        ApplePieRecipe whatAreTheIngredients = new ApplePieRecipe(); {
            whatAreTheIngredients.printIngredients();
        }

        ApplePieRecipe printRecipe = new ApplePieRecipe(); {
            printRecipe.heatUpOven();
            printRecipe.beatEgg();
            printRecipe.mixIngredients();
            printRecipe.peelAndCut();
            printRecipe.greaseAndSprinkle();
            printRecipe.coverWithDoughAndSprinkleBreadCrumb();
            printRecipe.addAppelsAndCinnamonSugar();
            printRecipe.rollOutAndCutDough();
            printRecipe.coverWithDoughAndSmearWithEgg();
            printRecipe.putInTheOven();
        }
    }
}