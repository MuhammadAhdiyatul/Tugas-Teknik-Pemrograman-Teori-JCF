import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.Map;

public class ListSetMap {
    public static void main(String[] args){
        List<String> playList = new ArrayList<>();
        playList.add("Lagu Tarot");
        playList.add("Lagu 33x");
        playList.add("Lagu Satu");
        System.out.println("List (Boleh duplikay, berurutan): " + playList);

        Set<String> nimAbsensi = new HashSet<>();
        nimAbsensi.add("251524001");
        nimAbsensi.add("251524002");
        nimAbsensi.add("251524001");
        System.out.println("Set ( Tanpa Duplikat, acak ): " + nimAbsensi);

        Map<String, String> nilaiMahasiswa = new HashMap<>();
        nilaiMahasiswa.put("251524001", "A");
        nilaiMahasiswa.put("251524002", "B");
        System.out.println("Map (Key-Value): " + nilaiMahasiswa);
    }    
}