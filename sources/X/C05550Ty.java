package X;

import com.whatsapp.R;
import java.io.Closeable;
import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0Ty  reason: invalid class name and case insensitive filesystem */
public abstract class C05550Ty {
    public final Map A00 = AnonymousClass001.A0t();
    public final Set A01 = new LinkedHashSet();
    public volatile boolean A02 = false;

    public static void A07(int[] iArr) {
        iArr[0] = R.string.f11nameremoved;
        iArr[1] = R.string.f11nameremoved;
        iArr[2] = R.string.f11nameremoved;
        iArr[3] = R.string.f11nameremoved;
        iArr[4] = R.string.f11nameremoved;
    }

    public static void A06(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object A0B(Object obj, String str) {
        Object obj2;
        Map map = this.A00;
        synchronized (map) {
            obj2 = map.get(str);
            if (obj2 == null) {
                map.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.A02) {
            A06(obj);
        }
        return obj;
    }

    public void A0C() {
    }
}
