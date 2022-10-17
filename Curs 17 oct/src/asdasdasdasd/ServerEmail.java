package asdasdasdasd;

import java.util.ArrayList;

public class ServerEmail {

    static ArrayList<Persoana> senders = new ArrayList<>();




    public void sendAll() {

        for(Persoana p: senders)
            p.faceCeva("Raport general");
    }
}
