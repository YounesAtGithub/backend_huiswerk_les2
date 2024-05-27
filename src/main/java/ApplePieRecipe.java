public class ApplePieRecipe {
    Ingredient unsaltedButter = new Ingredient(200, "gram", "ongezouten roomboter");
    Ingredient casterSugar = new Ingredient(200, "gram", "witte bastard suiker");
    Ingredient selfRasingFlour = new Ingredient(400, "gram", "zelfrijzende bakmeel");
    Ingredient egg = new Ingredient(1, "stuk(s)", "ei");
    Ingredient vanillaSugar = new Ingredient(8, "gram", "vanillesuiker");
    Ingredient salt = new Ingredient(1, "snuf", "zout");
    Ingredient appel = new Ingredient(1500, "gram", "zoetzure appels");
    Ingredient granulatedSugar = new Ingredient(75, "gram", "kristalsuiker");
    Ingredient cinnamon = new Ingredient(3, "theelepels", "kaneel");
    Ingredient breadCrumbs = new Ingredient(15, "gram", "paneermeel");

    // 10 stappen

    // Verwarm de oven van tevoren op 170 graden Celsius (boven en onderwarmte)
    public void heatUpOven() {
        System.out.println("Verwarm de oven van tevoren op 170 graden Celsius (boven en onderwarmte)");
    }

    //Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.
    public void beatEgg() {
        System.out.println("Klop het ei los en verdeel deze in twee delen. De ene helft is voor het deeg, het andere deel is voor het bestrijken van de appeltaart.");
    }

    //Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.
    public void mixIngredients() {
        System.out.println("Meng de boter, bastard suiker, zelfrijzend bakmeel, een helft van het ei, vanille suiker en een snufje zout tot een stevig deeg en verdeel deze in 3 gelijke delen.");
    }

    //Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.
    public void peelAndCut() {
        System.out.println("Schil nu de appels en snij deze in plakjes. Vermeng in een kopje de suiker en kaneel.");
    }

    //Vet de springvorm in en bestrooi deze met bloem
    public void greaseAndSprinkle() {
        System.out.println("Vet de springvorm in en bestrooi deze met bloem");
    }

    //Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.
    public void coverWithDoughAndSprinkleBreadCrumb() {
        System.out.println("Gebruik een deel van het deeg om de bodem van de vorm te bedekken. Gebruik een deel van het deeg om de rand van de springvorm te bekleden. Strooi het paneermeel op de bodem van de beklede vorm. De paneermeel neemt het vocht van de appels op.");
    }

    //Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.
    public void addAppelsAndCinnamonSugar() {
        System.out.println("Doe de helft van de appels in de vorm en strooi hier 1/3 van het kaneel-suiker mengsel overheen. Meng de ander helft van de appels met het overgebleven kaneel-suiker mengsel en leg deze in de vorm.");
    }

    //Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.
    public void rollOutAndCutDough() {
        System.out.println("Rol het laatste deel van de deeg uit tot een dunne lap en snij stroken van ongeveer 1 cm breed.");
    }

    //Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken
    public void coverWithDoughAndSmearWithEgg() {
        System.out.println("Leg de stroken kuislings op de appeltaart. Met wat extra deegstroken werk je de rand rondom af. Gebruik het overgebleven ei om de bovenkant van het deeg te bestrijken");
    }

    //Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.
    public void putInTheOven() {
        System.out.println("Zet de taart iets onder het midden van de oven. Bak de taart in 60 minuten op 170 graden Celsius (boven en onderwarmte) gaar en goudbruin.");
    }

    public void printIngredients() {
        System.out.println(unsaltedButter.getAmount() + " " + unsaltedButter.getUnit() + " " + unsaltedButter.getName());
        System.out.println(casterSugar.getAmount() + " " + casterSugar.getUnit() + " " + casterSugar.getName());
        System.out.println(selfRasingFlour.getAmount() + " " + selfRasingFlour.getUnit() + " " + selfRasingFlour.getName());
        System.out.println(egg.getAmount() + " " + egg.getUnit() + " " + egg.getName());
        System.out.println(vanillaSugar.getAmount() + " " + vanillaSugar.getUnit() + " " + vanillaSugar.getName());
        System.out.println(salt.getAmount() + " " + salt.getUnit() + " " + salt.getName());
        System.out.println(appel.getAmount() + " " + appel.getUnit() + " " + appel.getName());
        System.out.println(granulatedSugar.getAmount() + " " + granulatedSugar.getUnit() + " " + granulatedSugar.getName());
        System.out.println(cinnamon.getAmount() + " " + cinnamon.getUnit() + " " + cinnamon.getName());
        System.out.println(breadCrumbs.getAmount() + " " + breadCrumbs.getUnit() + " " + breadCrumbs.getName());

    }
}
