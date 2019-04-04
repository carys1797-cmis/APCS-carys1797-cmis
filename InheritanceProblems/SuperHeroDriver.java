import java.util.*;
public class SuperHeroDriver
{
    public static void print(SuperHero[][] array){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[0].length; x++){
                if(array[y][x] != null){
                    System.out.println(array[y][x]);
                }
            }
            System.out.println();
        }
    }

    public static void printContents(SuperHero[][] array){
        for(int y = 0; y < array.length; y++){
            for(int x = 0; x < array[0].length; x++){
                if(array[y][x] != null){
                    System.out.println(array[y][x]);
                }
            }
        }
    }

    public static void main(String args[]){
        AsteroidMan asteroidman = new AsteroidMan("Silver", false);
        FriedEggMan friedeggman = new FriedEggMan("White & Yellow", true);
        BigGranny biggranny = new BigGranny("Blue", true);

        List<SuperHero> heroes = new ArrayList<SuperHero>();
        heroes.add(asteroidman);
        heroes.add(friedeggman);
        heroes.add(biggranny);

        System.out.println("Original set of ArrayList heroes...");
        for(SuperHero hero : heroes){
            System.out.println(hero);
        }

        SuperHero[][] capedHeroes = new SuperHero[3][3];
        int x = 0, y = 0;
        for(SuperHero hero: heroes){
            if (hero.isCaped()){
                capedHeroes[y][x] = hero;
                x++;
                if(x > 2){
                    y++;
                    x = 0;
                }
            }
        }
        int i = 0;
        while(i < heroes.size()){
            if(heroes.get(i).isCaped()){
                heroes.remove(heroes.get(i));
            }else{
                i++;
            }
        }
        while(x < 2 & y < 2){
            capedHeroes[y][x] = null;
            x++;
            if(x > 2){
                y++;
                x = 0;
            }
        }
        System.out.println("\n\nPrinting 2D Array capedHeroes...");
        print(capedHeroes);
        System.out.println("\n\nPrinting contents of capedHeroes...");
        printContents(capedHeroes);
        System.out.println("\n\nRemaining set of ArrayList heroes...");
        for(SuperHero hero : heroes){
            System.out.println(hero);
        }

    }
}
