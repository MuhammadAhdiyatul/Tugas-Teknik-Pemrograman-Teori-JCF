import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueDequeue {
    public static void main(String[] args){
        Queue<String> antreanBank = new LinkedList<>();
        antreanBank.add("Nasabah 3");
        antreanBank.add("Nasabah 2");
        antreanBank.add("Nasabah 1");
        System.out.println("Queue memproses :" + antreanBank.poll());

        Deque<String> historyBrowser = new ArrayDeque<>();
        historyBrowser.push("Google.com");
        historyBrowser.push("GitHub.com");
        System.out.println("Deque ( Tombol back ditekan):" + historyBrowser.pollFirst());
    }
}