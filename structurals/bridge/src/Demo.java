public class Demo {
    public static void main(String[] args) {
        // Criar canais de envio
        SendChannel email = new EmailSending();
        SendChannel sms = new SMSSending();

        // Criar notificações
        Notification alertaErro = new ErrorAlert();
        Notification notificacaoMarketing = new MarketingNotification();

        // Enviar as mensagens via diferentes canais
        alertaErro.send("Sistema caiu!", email);
        alertaErro.send("Falha no sistema!", sms);

        notificacaoMarketing.send("Promoção de fim de ano!", email);
        notificacaoMarketing.send("Descontos exclusivos via SMS!", sms);
    }
}
