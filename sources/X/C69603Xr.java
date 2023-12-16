package X;

import com.whatsapp.bridge.wfal.WfalManager;
import com.whatsapp.util.Log;

/* renamed from: X.3Xr  reason: invalid class name and case insensitive filesystem */
public final class C69603Xr implements C84234Bo {
    public final C183538qC A00;
    public final C183538qC A01;
    public final C183538qC A02;
    public final C183538qC A03;

    public void Bhk() {
        if (((WfalManager) this.A03.get()).A02()) {
            Log.i("AccountLinkingDataDeleter/purgeData: Purging waffle cache and user data");
            C614430u A0c = AnonymousClass0x9.A0c(this.A02);
            synchronized (A0c) {
                C18270x1.A0m(A0c.A00());
            }
            AnonymousClass30P A0M = C18320x8.A0M(this.A01);
            ((AnonymousClass308) A0M.A00.get()).A03(AnonymousClass2BX.A00);
            C18270x1.A0g(((C49292gI) this.A00.get()).A00().edit(), "pref_ping_validity_time");
        }
    }

    public C69603Xr(C183538qC r1, C183538qC r2, C183538qC r3, C183538qC r4) {
        C18260x0.A0c(r1, r2, r3, r4);
        this.A01 = r1;
        this.A02 = r2;
        this.A00 = r3;
        this.A03 = r4;
    }
}
