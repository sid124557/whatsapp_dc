package X;

import android.os.SystemClock;

/* renamed from: X.8P2  reason: invalid class name */
public class AnonymousClass8P2 implements AnonymousClass4C1, C183538qC {
    public Object A00 = null;
    public AnonymousClass4C1 A01;

    public AnonymousClass8P2(AnonymousClass4C1 r2) {
        this.A01 = r2;
    }

    public Object get() {
        Object obj = this.A00;
        if (obj == null) {
            AnonymousClass4C1 r1 = this.A01;
            C626936e.A0C(true);
            SystemClock.uptimeMillis();
            try {
                obj = r1.get();
                C626936e.A06(obj);
                this.A00 = obj;
            } finally {
                SystemClock.uptimeMillis();
            }
        }
        return obj;
    }

    public static float A00(AnonymousClass8P2 r0) {
        return ((Number) r0.get()).floatValue();
    }
}
