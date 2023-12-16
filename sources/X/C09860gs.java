package X;

import android.util.Log;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0gs  reason: invalid class name and case insensitive filesystem */
public class C09860gs implements C187468xG {
    public final Map A00 = AnonymousClass001.A0t();

    public boolean A00(String str) {
        Map map = this.A00;
        if (!map.containsKey(str)) {
            return false;
        }
        try {
            if (map.get(str) == null || ((Set) map.get(str)).size() <= 0) {
                return false;
            }
            return true;
        } catch (NullPointerException unused) {
            Log.e("PerVideoCacheLookup", String.format("Invalid video cache for video id = %s", new Object[]{str}));
            map.remove(str);
            return false;
        }
    }

    public void Bbr(C186458vL r5, C172488Li r6) {
        String str = r6.A07;
        String A002 = AnonymousClass0JJ.A00(str);
        Map map = this.A00;
        if (!map.containsKey(A002)) {
            map.put(A002, AnonymousClass002.A0K());
        }
        ((Set) map.get(A002)).add(Integer.valueOf(str.hashCode()));
    }

    public void Bbs(C186458vL r5, C172488Li r6) {
        String str = r6.A07;
        String A002 = AnonymousClass0JJ.A00(str);
        Map map = this.A00;
        Set set = (Set) map.get(A002);
        if (set != null) {
            set.remove(Integer.valueOf(str.hashCode()));
            if (set.isEmpty()) {
                map.remove(A002);
            }
        }
    }

    public void BSI(String str, String str2, int i, int i2) {
    }

    public void Bbt(C140846uc r1, C186458vL r2, C172488Li r3, C172488Li r4) {
    }

    public void BcC(C186458vL r1, String str, long j, long j2) {
    }
}
