package X;

import java.util.Set;

/* renamed from: X.2gh  reason: invalid class name and case insensitive filesystem */
public class C49542gh {
    public AnonymousClass4AZ A00;
    public boolean A01;
    public boolean A02;
    public final C50432iA A03;

    public C49542gh(C50432iA r2) {
        C162457s7.A0J(r2, 1);
        this.A03 = r2;
    }

    public final C48652fF A00(String str, boolean z, boolean z2) {
        C162457s7.A0J(str, 0);
        C48652fF r5 = new C48652fF();
        if (this.A02) {
            C50432iA r8 = this.A03;
            AnonymousClass4KS r7 = new AnonymousClass4KS(r5, 0);
            C626936e.A01();
            if (z2) {
                for (AnonymousClass5ZM A0D : r8.A0A) {
                    A0D.A0D(true);
                }
            }
            Set set = r8.A0A;
            C33501tE r2 = new C33501tE(r8, r7, r8.A07, z);
            r8.A09.BkL(r2, str);
            set.add(r2);
        }
        return r5;
    }

    public final synchronized void A01(Integer num) {
        if (!this.A01) {
            this.A01 = true;
            C50432iA r1 = this.A03;
            AnonymousClass2WT r0 = new AnonymousClass2WT(this);
            C626936e.A01();
            r1.A09.BkL(new C33941tw(r1, r0, num), new String[0]);
        }
    }
}
