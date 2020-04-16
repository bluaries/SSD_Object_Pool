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

    public Bullet getReusable (int x, int y, int dx, int dy) {
        if (BulletList.isEmpty()) {
            for (int i = 0; i < 20; i++) {
                BulletList.add(new Bullet(0 ,0,0,0));
            }
        }
        Bullet setBullet = BulletList.get(0);
        setBullet.setX(x);
        setBullet.setY(y);
        setBullet.setDx(dx);
        setBullet.setDy(dy);
        BulletList.remove(0);
        return setBullet;
    }

    public void releaseReusable (Bullet bullet){
        BulletList.add(bullet);
    }

}