package X;

import com.whatsapp.biz.linkedaccounts.LinkedAccountsMediaCard;

/* renamed from: X.91y  reason: invalid class name and case insensitive filesystem */
public class C1896091y implements C183228ph {
    public Object A00;
    public Object A01;
    public final int A02;

    public C1896091y(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BTK(C91794l6 r8, int i) {
        C108815db r3;
        C153127ai r1;
        int i2;
        int i3;
        C91794l6 r2 = r8;
        if (this.A02 != 0) {
            r3 = (C108815db) this.A00;
            r8.setTag(r3.A04);
            r1 = ((AnonymousClass4UW) this.A01).A02;
            i2 = 2;
            i3 = 4;
        } else {
            r3 = (C108815db) this.A01;
            r8.setTag(r3.A04);
            r1 = ((LinkedAccountsMediaCard) this.A00).A04;
            i2 = 2;
            i3 = 3;
        }
        r1.A01(r2, r3, new AnonymousClass90T(r8, i3), new AnonymousClass93V(r8, i3), i2);
    }
}
