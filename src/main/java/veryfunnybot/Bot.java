package veryfunnybot;

import net.dv8tion.jda.api.JDABuilder;

public class Bot {

    public static String token = "Nzc0MjQ5ODc5MTEwMjg3Mzkw.X6VCZA.c9wvfUxFoDZwaYwGIaQJ6KqcHLg";

    public static void main(String[] args) throws Exception {
        var jda = JDABuilder.createDefault(token).build().awaitReady();
        var messageListener = new MessageListener();
        jda.addEventListener(messageListener);
    }

}

