package androidx.viewpager2.adapter;

import X.AnonymousClass09I;
import X.AnonymousClass0GH;
import X.C011309h;
import X.C06360Xi;
import X.C15910sA;
import X.C17280vG;

public class FragmentStateAdapter$2 implements C17280vG {
    public final /* synthetic */ AnonymousClass09I A00;
    public final /* synthetic */ C011309h A01;

    public FragmentStateAdapter$2(AnonymousClass09I r1, C011309h r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BcK(AnonymousClass0GH r4, C15910sA r5) {
        AnonymousClass09I r2 = this.A00;
        if (!r2.A06.A0t()) {
            r5.getLifecycle().A01(this);
            C011309h r1 = this.A01;
            if (C06360Xi.A04(r1.A0H)) {
                r2.A0O(r1);
            }
        }
    }
}
