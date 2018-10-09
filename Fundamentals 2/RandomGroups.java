import java.util.Arrays;
public class RandomGroups
{
    public static void main(String args[]){
        String[] ya = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q"};
        makeGroups(ya, 3);
    }

    public static String[] makeGroups(String[] names, int groupSize){
        String[] shuffle = new String[names.length];
        for (int i = 0; i < shuffle.length; i++){
            int r;
            do {
                r = (int) (Math.random() * names.length);
            }while (names[r] == null);
            shuffle[i] = names[r];
            names[r] = null;
        }
        int n = names.length / groupSize;
        String[] groups = new String[n];
        for (int i = 0; i < n; i++){
            groups[i] = "";
            for (int j = 0; j < groupSize; j++){
                groups[i] += shuffle[j + (groupSize * i)];
                groups[i] += " ";
            }
        }
        int rem = names.length % groupSize;
        do{
            int u = shuffle.length - rem;
            for (int i = 0; i < n; i++){
                if (u + i < shuffle.length){
                    groups[i] += shuffle[u + i];
                    groups[i] += " ";
                }
            }
            rem -= n;
        } while (rem > 0);
        System.out.println(Arrays.toString(groups));
        return groups;
    }
}
