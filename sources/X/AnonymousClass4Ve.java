package X;

import android.content.Context;
import java.util.ArrayList;

/* renamed from: X.4Ve  reason: invalid class name */
public class AnonymousClass4Ve extends AnonymousClass08c {
    public final C55832qz A00;
    public final long[] A01;

    public /* bridge */ /* synthetic */ Object A06() {
        ArrayList A0s = AnonymousClass001.A0s();
        for (long j : this.A01) {
            synchronized (this) {
                if (AnonymousClass000.A1W(this.A01)) {
                    throw new C13860nr();
                }
            }
            C624134x A002 = C55122pp.A00(this.A00, j);
            if (A002 instanceof C30471mV) {
                A0s.add(A002);
            }
        }
        return A0s;
    }

    public void A03() {
        boolean z = this.A03;
        this.A03 = false;
        this.A04 |= z;
        A09();
    }

    public /* bridge */ /* synthetic */ void A04(Object obj) {
        if (!this.A05 && this.A06) {
            super.A04(obj);
        }
    }

    public AnonymousClass4Ve(Context context, C55832qz r2, long[] jArr) {
        super(context);
        this.A01 = jArr;
        this.A00 = r2;
    }

    public void A01() {
        A00();
    }

    public void A02() {
        A00();
    }
}
