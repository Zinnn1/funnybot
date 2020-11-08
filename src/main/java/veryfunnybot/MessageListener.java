package veryfunnybot;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class MessageListener extends ListenerAdapter {
    @Override
    public void onMessageReceived(@NotNull MessageReceivedEvent event) {
        if (event.getAuthor().isBot())
            return;

        var messageContent = (event.getMessage().getContentDisplay());
        if (!Images.containsCategory(messageContent))
            return;

        var image = Images.getRandomImage(messageContent);
        event.getChannel().sendMessage(image).queue();
    }
}
