package br.com.bighead;

import br.com.bighead.messages.MessageProvider;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class MessageService {
    public String hello(String name){
        return MessageProvider.getMessages().hello(name);
    }
}
