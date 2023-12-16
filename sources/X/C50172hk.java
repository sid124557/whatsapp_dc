package X;

import android.view.View;

/* renamed from: X.2hk  reason: invalid class name and case insensitive filesystem */
public class C50172hk {
    public final View A00;
    public final C624134x A01;
    public final AnonymousClass7O7 A02;
    public final C185528tp A03;
    public final Object A04;
    public final boolean A05;
    public final /* synthetic */ C50542iL A06;

    public C50172hk(View view, C624134x r2, AnonymousClass7O7 r3, C185528tp r4, C50542iL r5, Object obj, boolean z) {
        this.A06 = r5;
        this.A01 = r2;
        this.A00 = view;
        this.A03 = r4;
        this.A02 = r3;
        this.A04 = obj;
        this.A05 = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.A01.A1J.equals(((C50172hk) obj).A01.A1J);
    }

    public int hashCode() {
        return this.A01.A1J.hashCode();
    }
}
