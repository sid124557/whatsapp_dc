package X;

import com.whatsapp.util.Log;

/* renamed from: X.3T7  reason: invalid class name */
public class AnonymousClass3T7 implements AnonymousClass4EZ {
    public C101845Gi A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C29441ip A04;
    public final C620733j A05;
    public final AnonymousClass31C A06;

    public void BQs(String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/delivery-error");
        if (this.A00 != null) {
            this.A02.BkS(new C71283br((Object) this, 15));
        }
    }

    public void BSN(AnonymousClass36K r6, String str) {
        Log.e("RequestBusinessActivityReportProtocolHelper/onError");
        int A012 = C57492tj.A01(r6);
        if (this.A00 != null) {
            this.A02.BkS(new C71563cJ((Object) this, A012, 12));
        }
        this.A01.A0A("RequestBusinessActivityReportProtocolHelper/get business activity error", true, AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), A012));
    }

    public AnonymousClass3T7(C55682qk r1, C69263Wi r2, C56972sr r3, C29441ip r4, C620733j r5, AnonymousClass31C r6) {
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A05 = r5;
        this.A04 = r4;
    }

    public void BdM(AnonymousClass36K r6, String str) {
        C69263Wi r2;
        Runnable r1;
        AnonymousClass36K A0l = r6.A0l("p2b");
        if (A0l != null) {
            long A052 = AnonymousClass36K.A05(A0l, "timestamp") * 1000;
            if (this.A00 != null) {
                r2 = this.A02;
                r1 = new C70083Zv(this, A052, 19);
            } else {
                return;
            }
        } else if (this.A00 != null) {
            r2 = this.A02;
            r1 = new C71283br((Object) this, 16);
        } else {
            return;
        }
        r2.BkS(r1);
    }
}
