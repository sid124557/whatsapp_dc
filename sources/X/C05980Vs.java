package X;

import androidx.lifecycle.LifecycleController$$ExternalSyntheticLambda0;
import java.util.concurrent.CancellationException;

/* renamed from: X.0Vs  reason: invalid class name and case insensitive filesystem */
public final class C05980Vs {
    public final AnonymousClass0OX A00;
    public final AnonymousClass0GC A01;
    public final AnonymousClass0O9 A02;
    public final C17280vG A03;

    public C05980Vs(AnonymousClass0OX r4, AnonymousClass0GC r5, AnonymousClass0O9 r6, C85474Gj r7) {
        C162457s7.A0J(r6, 1);
        C162457s7.A0J(r5, 2);
        this.A02 = r6;
        this.A01 = r5;
        this.A00 = r4;
        LifecycleController$$ExternalSyntheticLambda0 lifecycleController$$ExternalSyntheticLambda0 = new LifecycleController$$ExternalSyntheticLambda0(this, r7);
        this.A03 = lifecycleController$$ExternalSyntheticLambda0;
        if (((AnonymousClass08A) r6).A02 == AnonymousClass0GC.DESTROYED) {
            r7.AyX((CancellationException) null);
            A02();
            return;
        }
        r6.A00(lifecycleController$$ExternalSyntheticLambda0);
    }

    public static final void A00(C05980Vs r3, C15910sA r4, C85474Gj r5) {
        C162457s7.A0J(r4, 2);
        if (((AnonymousClass08A) r4.getLifecycle()).A02 == AnonymousClass0GC.DESTROYED) {
            r5.AyX((CancellationException) null);
            r3.A02();
            return;
        }
        int compareTo = ((AnonymousClass08A) r4.getLifecycle()).A02.compareTo(r3.A01);
        AnonymousClass0OX r1 = r3.A00;
        if (compareTo < 0) {
            r1.A02 = true;
        } else if (!r1.A02) {
        } else {
            if (!r1.A00) {
                r1.A02 = false;
                r1.A00();
                return;
            }
            throw AnonymousClass001.A0e("Cannot resume a finished dispatcher");
        }
    }

    public final void A02() {
        this.A02.A01(this.A03);
        AnonymousClass0OX r1 = this.A00;
        r1.A00 = true;
        r1.A00();
    }
}
