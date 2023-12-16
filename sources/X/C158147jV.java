package X;

import android.os.SystemClock;
import android.view.Choreographer;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.7jV  reason: invalid class name and case insensitive filesystem */
public class C158147jV {
    public boolean A00 = true;
    public final C156707h4 A01;
    public final Map A02 = AnonymousClass001.A0t();
    public final Set A03 = new CopyOnWriteArraySet();
    public final CopyOnWriteArraySet A04 = new CopyOnWriteArraySet();

    public C153317b2 A01() {
        C153317b2 r3 = new C153317b2(this);
        Map map = this.A02;
        String str = r3.A0B;
        if (!map.containsKey(str)) {
            map.put(str, r3);
            return r3;
        }
        throw AnonymousClass001.A0c("spring is already registered");
    }

    public void A02(String str) {
        Object obj = this.A02.get(str);
        if (obj != null) {
            this.A03.add(obj);
            if (this.A00) {
                this.A00 = false;
                C156707h4 r2 = this.A01;
                if (!r2.A02) {
                    r2.A02 = true;
                    r2.A00 = SystemClock.uptimeMillis();
                    Choreographer choreographer = r2.A04;
                    Choreographer.FrameCallback frameCallback = r2.A03;
                    choreographer.removeFrameCallback(frameCallback);
                    choreographer.postFrameCallback(frameCallback);
                    return;
                }
                return;
            }
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("springId ");
        A0o.append(str);
        throw AnonymousClass000.A0F(" does not reference a registered spring", A0o);
    }

    public C158147jV(C156707h4 r2) {
        this.A01 = r2;
        r2.A01 = this;
    }

    public static C158147jV A00() {
        return new C158147jV(new C156707h4(Choreographer.getInstance()));
    }
}
