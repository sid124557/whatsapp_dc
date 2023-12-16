package X;

import android.content.res.Resources;
import com.whatsapp.R;

/* renamed from: X.7SZ  reason: invalid class name */
public abstract class AnonymousClass7SZ {
    public final boolean A00;
    public final boolean A01;

    public static AnonymousClass7PH A00(Resources resources, AnonymousClass5Vo r3) {
        AnonymousClass7PH r1 = r3.A00;
        r1.A06 = true;
        r1.A01 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        r1.A02 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        r1.A00 = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
        r1.A03 = R.color.f5nameremoved;
        return r1;
    }

    public void A01(Resources resources, AnonymousClass5Vo r5) {
        AnonymousClass7PH A002;
        C150497Qy r0;
        if (this instanceof C139836sh) {
            A002 = A00(resources, r5);
            r0 = ((C139836sh) this).A00;
        } else if (this instanceof C139866sk) {
            return;
        } else {
            if (this instanceof C139846si) {
                C139846si r2 = (C139846si) this;
                int i = -1;
                if (r2.A00.A02()) {
                    i = resources.getDimensionPixelSize(R.dimen.f6nameremoved);
                }
                A002 = r5.A00;
                A002.A01 = i;
                r0 = r2.A01;
            } else {
                A002 = A00(resources, r5);
                r0 = C139786sc.A00;
                A002.A05 = r0;
            }
        }
        A002.A04 = r0;
        A002.A05 = r0;
    }

    public AnonymousClass7SZ(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
