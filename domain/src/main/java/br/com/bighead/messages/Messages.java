package br.com.bighead.messages;

import io.quarkus.qute.i18n.Message;
import io.quarkus.qute.i18n.MessageBundle;

@MessageBundle
public interface Messages {
    @Message("Hello {name}")
    String hello(String name);
}
