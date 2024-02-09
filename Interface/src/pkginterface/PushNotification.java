package pkginterface;

public class PushNotification implements InterfaceNotifikasi{
    
    @Override
    public void sendMessage(String receiver, String content){
        System.out.println("Mengirim Push ke " + receiver + "dengan isi:");
        System.out.println("content");
    }
}
