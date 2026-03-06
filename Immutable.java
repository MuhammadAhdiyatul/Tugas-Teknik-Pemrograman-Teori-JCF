import java.util.List;
import java.util.Set;
import java.util.Map;

public class Immutable {
    public static void main(String[] args){
        List<String> HariLibur = List.of("Sabtu", "Minggu");
        Set<String> roleUser = Set.of("Dosen", "Mahasiswa", "Rektor");
        Map<Integer, String> areaCode = Map.of(40001, "Bandung", 10001, "Jakarta");
    
    System.out.println("Immutable List: " + HariLibur);
    System.out.println("Immutable Set:" + roleUser);
    System.out.println("Immutable Map:" + areaCode);
}    
}