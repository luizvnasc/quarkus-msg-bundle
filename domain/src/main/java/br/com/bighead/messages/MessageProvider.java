package br.com.bighead.messages;

import io.quarkus.qute.i18n.MessageBundles;

public abstract class MessageProvider {

    public static Messages getMessages(){
        return MessageBundles.get(Messages.class);
    }
}
