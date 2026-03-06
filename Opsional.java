import java.util.Optional;

public class Opsional {
    public static void main(String[] args){
        Optional<String> hasilPencarian = cariData("User 1");
        
        hasilPencarian.ifPresentOrElse(
            data -> System.out.println("Data ditemukan:" + data),
            () -> System.out.println("Data tidak ditemukan."));
    }    

    static Optional<String> cariData(String id){
        if (id.equals("User 1")){
            return Optional.of("Data User 1");
        }
        return Optional.empty();
    }
}
