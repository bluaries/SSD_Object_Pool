import java.util.ArrayList;
import java.util.List;

// Collect lots of bullets
public class BulletsPool {
    private static BulletsPool instance;
    private List<Bullet> BulletList;

    // singleton
    public static BulletsPool getInstance() {
        if (instance == null) {
            instance = new BulletsPool();
        } return instance;
    }

    private BulletsPool() {
        BulletList = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            BulletList.add(new Bullet(0 ,0,0,0));
        }
    }

}