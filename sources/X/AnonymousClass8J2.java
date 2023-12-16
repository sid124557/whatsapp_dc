package X;

import android.app.Activity;
import android.os.Build;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.8J2  reason: invalid class name */
public class AnonymousClass8J2 implements AnonymousClass66X {
    public Integer A00;
    public boolean A01 = false;
    public boolean A02 = true;
    public final C183728qW A03;
    public final AnonymousClass4FV A04;
    public final C186568vZ A05;
    public final Map A06 = AnonymousClass001.A0t();

    public void Bau(int i, boolean z, boolean z2) {
        this.A01 = z2;
        this.A02 = z;
        if (z2 || z) {
            this.A03.B2L();
            this.A00 = Integer.valueOf(i);
        }
    }

    public void Bav() {
        Integer num = this.A00;
        if (num != null) {
            this.A03.B1f(num.intValue());
        }
        this.A00 = null;
    }

    public void report() {
        if (this.A02) {
            Map map = this.A06;
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                C133936iB r8 = new C133936iB();
                AnonymousClass7N9 r10 = (AnonymousClass7N9) A0w.getValue();
                r8.A03 = Long.valueOf(r10.A03);
                r8.A02 = (Integer) A0w.getKey();
                long j = r10.A03;
                if (j > 0) {
                    double d = (double) j;
                    r8.A00 = Double.valueOf((r10.A01 * 60000.0d) / d);
                    r8.A01 = Double.valueOf((r10.A00 * 60000.0d) / d);
                }
                this.A04.BhD(r8);
            }
            map.clear();
        }
    }

    public AnonymousClass8J2(Activity activity, AnonymousClass5WR r5, AnonymousClass4FV r6, C186568vZ r7) {
        C183728qW r1;
        this.A05 = r7;
        this.A04 = r6;
        AnonymousClass7ST r2 = new AnonymousClass7ST(this, r7);
        if (Build.VERSION.SDK_INT < 26) {
            r1 = new AnonymousClass82U(activity, r5, r2);
        } else {
            r1 = new AnonymousClass82V(activity.getWindow(), r2);
        }
        this.A03 = r1;
    }
}
