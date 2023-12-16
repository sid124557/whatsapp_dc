package X;

import java.util.AbstractMap;
import java.util.LinkedHashSet;
import java.util.List;

/* renamed from: X.2fB  reason: invalid class name and case insensitive filesystem */
public final class C48612fB {
    public final C55202py A00;
    public final AnonymousClass66R A01 = C154517dI.A01(new C77803tz(this));

    public C48612fB(C55202py r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public final void A00(String str) {
        C162457s7.A0J(str, 0);
        ((AbstractMap) this.A01.getValue()).remove(str);
    }

    public final void A01(String str, List list, List list2) {
        ((AbstractMap) this.A01.getValue()).put(str, new C51632k8(new LinkedHashSet(list), AnonymousClass0x9.A15(list2)));
    }
}
