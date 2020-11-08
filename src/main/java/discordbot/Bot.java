package discordbot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.security.auth.login.LoginException;

public class Bot {
    public static void main(String[] args) throws Exception {
        var jda = JDABuilder.createDefault("Nzc0NjY4MjQxNzk1ODA5MzAw.X6bIBQ.ABMtH3i0218xJQWEWHpD0uIswEM").build().awaitReady();
        var messageListener = new MessageListener();
        jda.addEventListener(messageListener);
    }

    static class MessageListener extends ListenerAdapter {
        @Override
        public void onMessageReceived(@NotNull MessageReceivedEvent event) {
            super.onMessageReceived(event);
            if (!event.getAuthor().getId().equals("774668241795809300")) {
                event.getChannel().sendMessage(event.getMessage().getContentDisplay()).queue();
            }
        }
    }
}
