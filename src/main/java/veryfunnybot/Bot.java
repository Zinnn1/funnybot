package veryfunnybot;

import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class Bot {
    public static String token = "Nzc0NjY4MjQxNzk1ODA5MzAw.X6bIBQ.ABMtH3i0218xJQWEWHpD0uIswEM";
    public static String[] giraffeImages = {
            "https://regnum.ru/uploads/pictures/news/2019/01/31/regnum_picture_154892449781415_normal.jpg",
            "https://icdn.lenta.ru/images/2020/03/17/14/20200317141307178/square_1280_7ec9e32d2322f0efd85f858b46d21fda.jpg",
            "https://kipmu.ru/wp-content/uploads/zhrfpr.jpg"
    };
    public static Random rndGiraffe = new Random();
    public static String[] catImages = {
            "https://scontent-ort2-2.cdninstagram.com/v/t51.2885-15/e35/120397393_2708357142816877_6714401999534659170_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com&_nc_cat=101&_nc_ohc=LJiooS7gFhIAX_ZrwAx&_nc_tp=18&oh=dfb8823845503a449f0e866ddf12dbf4&oe=5FADC72D",
            "https://memepedia.ru/wp-content/uploads/2018/09/babuleh-original.jpg",
            "https://sun9-9.userapi.com/c857728/v857728714/88e9/QFo5rIHGBp8.jpg"
    };
    public static Random rndCat = new Random();
    public static String[] OEDImages = {
            "https://static.wixstatic.com/media/731f2f_f8ca929f709f48ac8af96d41051cda51~mv2.png/v1/fit/w_2500,h_1330,al_c/731f2f_f8ca929f709f48ac8af96d41051cda51~mv2.png",
            "https://www.kino-teatr.ru/news/10495/102730.jpg",
            "https://i.kym-cdn.com/photos/images/original/001/502/099/790.jpg"
    };
    public static Random rndOED = new Random();

    public static void main(String[] args) throws Exception {
        var jda = JDABuilder.createDefault(token).build().awaitReady();
        var messageListener = new MessageListener();
        jda.addEventListener(messageListener);
    }

    static class MessageListener extends ListenerAdapter {
        @Override
        public void onMessageReceived(@NotNull MessageReceivedEvent event) {
            int indexGiraffe = rndGiraffe.nextInt(giraffeImages.length);
            int indexCat = rndCat.nextInt(catImages.length);
            int indexOED = rndOED.nextInt(OEDImages.length);
            var ID = (event.getAuthor().getId());
            var messageContent = (event.getMessage().getContentDisplay());
            if (messageContent.equals("Giraffe")) {
                event.getChannel().sendMessage(giraffeImages[indexGiraffe]).queue();
            } else if (messageContent.equals("Cat")) {
                event.getChannel().sendMessage(catImages[indexCat]).queue();
            } else if (messageContent.equals("OED")) {
                event.getChannel().sendMessage(OEDImages[indexOED]).queue();
            }
        }
    }
}

