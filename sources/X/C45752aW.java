package X;

import com.whatsapp.util.Log;

/* renamed from: X.2aW  reason: invalid class name and case insensitive filesystem */
public final class C45752aW {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public int A00() {
        C183538qC r5 = this.A02;
        if (C61072zf.A00(r5) < AnonymousClass35X.A01((C61072zf) r5.get(), (AnonymousClass1VX) this.A00.get())) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/low on storage; available storage = ");
            C18260x0.A1I(A0o, C61072zf.A00(r5));
            return 1;
        } else if (((AnonymousClass5TW) this.A03.get()).A01()) {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/call in progress");
            return 2;
        } else if (!((C10240hc) this.A01.get()).A0a.get()) {
            return 0;
        } else {
            Log.i("AccountSwitcherBridgeImpl/shouldAllowSwitchingAccounts/backup in progress");
            return 3;
        }
    }

    public C45752aW(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        C18260x0.A0c(r1, r2, r3, r4);
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = r3;
        this.A01 = r4;
    }
}
