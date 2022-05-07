package br.com.gabrielli.sqsconsomer;

import java.util.concurrent.ExecutionException;

import br.com.gabrielli.sqsconsomer.services.KafkaService;

public class App {
    public static void main(String[] args) throws InterruptedException, ExecutionException{
        
        System.out.println("Lendo mensagens ...");
        KafkaService.readMessage(System.getenv("KAFKA_GROUP_ID_READER"));
    }
}
