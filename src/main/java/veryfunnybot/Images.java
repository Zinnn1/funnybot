package veryfunnybot;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public abstract class Images {

    private static final Map<String, String[]> images = new HashMap<>();
    private static final Random rng = new Random();

    static {
        images.put(
                "giraffe",
                new String[]{
                        "https://regnum.ru/uploads/pictures/news/2019/01/31/regnum_picture_154892449781415_normal.jpg",
                        "https://icdn.lenta.ru/images/2020/03/17/14/20200317141307178/square_1280_7ec9e32d2322f0efd85f858b46d21fda.jpg",
                        "https://kipmu.ru/wp-content/uploads/zhrfpr.jpg"
                }
        );
        images.put(
                "cat",
                new String[]{
                        "https://scontent-ort2-2.cdninstagram.com/v/t51.2885-15/e35/120397393_2708357142816877_6714401999534659170_n.jpg?_nc_ht=scontent-ort2-2.cdninstagram.com&_nc_cat=101&_nc_ohc=LJiooS7gFhIAX_ZrwAx&_nc_tp=18&oh=dfb8823845503a449f0e866ddf12dbf4&oe=5FADC72D",
                        "https://memepedia.ru/wp-content/uploads/2018/09/babuleh-original.jpg",
                        "https://sun9-9.userapi.com/c857728/v857728714/88e9/QFo5rIHGBp8.jpg"
                }
        );
        images.put(
                "OED",
                new String[]{
                        "https://static.wixstatic.com/media/731f2f_f8ca929f709f48ac8af96d41051cda51~mv2.png/v1/fit/w_2500,h_1330,al_c/731f2f_f8ca929f709f48ac8af96d41051cda51~mv2.png",
                        "https://www.kino-teatr.ru/news/10495/102730.jpg",
                        "https://i.kym-cdn.com/photos/images/original/001/502/099/790.jpg"
                }
        );
    }

    public static boolean containsCategory(String category) {
        return images.containsKey(category);
    }

    public static String getRandomImage(String category) {
        var categoryImages = images.get(category);
        if (categoryImages == null)
            throw new IllegalArgumentException("Category does not exist.");
        var randomIndex = rng.nextInt(category.length());
        return categoryImages[randomIndex];
    }
}