class e11{ 
    public static void main(String[] args){ 
       //main program here... 
        AllTheColorsOfTheRainbow a = new AllTheColorsOfTheRainbow();
        a.changeTheHueOfTheColor(2);
        System.out.println("before:"+a.anIntegerRepresentingColors);
        a.changeTheHueOfTheColor(3);
        System.out.println("after:"+a.anIntegerRepresentingColors);
    }

}

class AllTheColorsOfTheRainbow{
    int anIntegerRepresentingColors;
    void changeTheHueOfTheColor(int newHue)
    {
        anIntegerRepresentingColors=newHue;
    }
}
