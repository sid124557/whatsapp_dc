package X;

import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Future;

/* renamed from: X.0kk  reason: invalid class name and case insensitive filesystem */
public class C11960kk implements Runnable {
    public final /* synthetic */ AnonymousClass05G A00;
    public final /* synthetic */ ShortcutInfoCompatSaverImpl A01;

    public C11960kk(AnonymousClass05G r1, ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl) {
        this.A01 = shortcutInfoCompatSaverImpl;
        this.A00 = r1;
    }

    public void run() {
        ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = this.A01;
        shortcutInfoCompatSaverImpl.A04.clear();
        Map map = shortcutInfoCompatSaverImpl.A03;
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            ((Future) A0v.next()).cancel(false);
        }
        map.clear();
        shortcutInfoCompatSaverImpl.A04(this.A00);
    }
}
