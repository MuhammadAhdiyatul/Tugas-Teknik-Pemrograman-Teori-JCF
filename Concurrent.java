import java.util.concurrent.ConcurrentHashMap;

public class Concurrent {
    public static void main(String[] args){
        ConcurrentHashMap<String, Integer> serverRequests = new ConcurrentHashMap<>();

        serverRequests.put("Ipan", 1);
        serverRequests.putIfAbsent("pahri", 1);

        System.out.println("Data Server Requests:" + serverRequests);    }
    
}
