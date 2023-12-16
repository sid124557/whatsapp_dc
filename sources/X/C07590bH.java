package X;

import android.os.Handler;
import android.os.SystemClock;
import android.view.MenuItem;
import java.util.List;

/* renamed from: X.0bH  reason: invalid class name and case insensitive filesystem */
public class C07590bH implements C16500tV {
    public final /* synthetic */ AnonymousClass04L A00;

    public C07590bH(AnonymousClass04L r1) {
        this.A00 = r1;
    }

    public void BUr(MenuItem menuItem, C07890cz r9) {
        AnonymousClass04L r1 = this.A00;
        Handler handler = r1.A0J;
        C03670Lc r0 = null;
        handler.removeCallbacksAndMessages((Object) null);
        List list = r1.A0O;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (r9 != ((C03670Lc) list.get(i)).A01) {
                i++;
            } else if (i != -1) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    r0 = (C03670Lc) list.get(i2);
                }
                handler.postAtTime(new C12900mJ(menuItem, this, r0, r9), r9, SystemClock.uptimeMillis() + 200);
                return;
            } else {
                return;
            }
        }
    }

    public void BUs(MenuItem menuItem, C07890cz r3) {
        this.A00.A0J.removeCallbacksAndMessages(r3);
    }
}
