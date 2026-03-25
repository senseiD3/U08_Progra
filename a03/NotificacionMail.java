package a03;

public class NotificacionMail implements Notificable{
    
    @Override
    public void enviarNotificacion(String mensaje){
        System.out.println("Correo electronico: " + mensaje);
    }
}
