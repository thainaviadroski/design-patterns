package decorator.java.atividade_notificacao.modelo;

public class NotificacaoBase implements Notificacao {


	@Override
	public void notificar() {
		System.out.println("Uma nova notificação disponivel!!!");
	}
}
