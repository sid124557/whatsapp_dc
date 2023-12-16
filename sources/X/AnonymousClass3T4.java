package X;

import com.whatsapp.util.Log;

/* renamed from: X.3T4  reason: invalid class name */
public class AnonymousClass3T4 implements AnonymousClass4EZ {
    public C101865Gk A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C29441ip A04;
    public final AnonymousClass31C A05;

    public void BQs(String str) {
        Log.e("DeleteBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.BkS(new C71283br((Object) this, 11));
        }
    }

    public void BSN(AnonymousClass36K r5, String str) {
        Log.e("DeleteBusinessActivityReport/onError");
        if (this.A00 != null) {
            this.A02.BkS(new C71283br((Object) this, 10));
        }
        C55682qk r3 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("error_code=");
        r3.A0A("DeleteBusinessActivityReport/delete business activity error", true, AnonymousClass000.A0h(A0o, C57492tj.A01(r5)));
    }

    public void BdM(AnonymousClass36K r4, String str) {
        if (this.A00 != null) {
            this.A02.BkS(new C71283br((Object) this, 12));
        }
    }

    public AnonymousClass3T4(C55682qk r1, C69263Wi r2, C56972sr r3, C29441ip r4, AnonymousClass31C r5) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A05 = r5;
        this.A04 = r4;
    }
}
