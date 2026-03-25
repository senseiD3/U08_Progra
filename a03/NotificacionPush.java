package a03;

public class NotificacionPush implements Notificable{
    
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println("Notificacion push: " + mensaje);
    }
}
