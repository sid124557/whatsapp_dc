package X;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2gb  reason: invalid class name and case insensitive filesystem */
public class C49482gb {
    public long A00 = -1;
    public final C56612sH A01;
    public final C56982ss A02;
    public final Map A03 = AnonymousClass001.A0t();

    public void A00(Bundle bundle) {
        if (bundle != null) {
            this.A00 = bundle.getLong("ephemeral_session_start", -1);
        }
    }

    public void A01(C95814uZ r6, String str) {
        if (this.A00 == -1) {
            this.A00 = this.A01.A0H();
        }
        Map map = this.A03;
        Set set = (Set) map.get(r6);
        if (set == null) {
            set = AnonymousClass002.A0K();
        }
        set.add(str);
        map.put(r6, set);
    }

    public C49482gb(C56612sH r3, C56982ss r4) {
        this.A01 = r3;
        this.A02 = r4;
    }
}
