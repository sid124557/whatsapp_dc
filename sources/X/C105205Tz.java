package X;

import android.os.SystemClock;
import java.util.Map;

/* renamed from: X.5Tz  reason: invalid class name and case insensitive filesystem */
public abstract class C105205Tz {
    public final C56612sH A00;
    public final AnonymousClass8JP A01;
    public final Map A02;

    public final void A02(int i, String str, String str2) {
        int i2;
        C162457s7.A0J(str2, 2);
        AnonymousClass8JP r1 = this.A01;
        if (this instanceof C89974fa) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerAnnotate(i2, i, str, str2);
    }

    public final void A01(int i, String str) {
        int i2;
        AnonymousClass8JP r1 = this.A01;
        if (this instanceof C89974fa) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerPoint(i2, i, str);
    }

    public final void A03(int i, short s) {
        int i2;
        AnonymousClass8JP r1 = this.A01;
        if (this instanceof C89974fa) {
            i2 = 22413317;
        } else {
            i2 = 22413316;
        }
        r1.markerEnd(i2, i, s);
    }

    public final void A04(AnonymousClass32L r4, int i) {
        String str = r4.A01;
        A02(i, "delivery_session_id", str);
        A02(i, "effect_session_id", r4.A00);
        A02(i, "event_timestamp_ms", String.valueOf(SystemClock.uptimeMillis()));
        AnonymousClass5WA r2 = (AnonymousClass5WA) this.A02.get(str);
        if (r2 != null) {
            A02(i, "session", r2.A03);
            String str2 = r4.A04;
            C162457s7.A0D(str2);
            A02(i, "product_session_id", str2);
            String str3 = r4.A03;
            C162457s7.A0D(str3);
            A02(i, "product_name", str3);
            String str4 = r2.A00;
            if (str4.length() > 0) {
                A02(i, "effect_id", str4);
                A02(i, "effect_instance_id", r2.A01);
                A02(i, "effect_name", r2.A02);
                A02(i, "effect_type", r2.A04);
            }
        }
    }

    public C105205Tz(C56612sH r1, AnonymousClass8JP r2, Map map) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = map;
    }
}
