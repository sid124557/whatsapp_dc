package X;

import com.whatsapp.util.Log;

/* renamed from: X.3T6  reason: invalid class name */
public class AnonymousClass3T6 implements AnonymousClass4EZ {
    public C101855Gj A00;
    public final C55682qk A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final C29441ip A04;
    public final C56612sH A05;
    public final AnonymousClass31C A06;

    public void BQs(String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/delivery-error");
    }

    public void BSN(AnonymousClass36K r6, String str) {
        Log.e("GetBusinessActivityReportProtocolHelper/onError");
        int A012 = C57492tj.A01(r6);
        if (this.A00 != null) {
            this.A02.BkS(new C71563cJ((Object) this, A012, 11));
        }
        this.A01.A0A("GetBusinessActivityReportProtocolHelper/get business activity error", true, AnonymousClass000.A0Y("error_code=", AnonymousClass001.A0o(), A012));
    }

    public AnonymousClass3T6(C55682qk r1, C69263Wi r2, C56972sr r3, C29441ip r4, C56612sH r5, AnonymousClass31C r6) {
        this.A05 = r5;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A04 = r4;
    }

    public void BdM(AnonymousClass36K r20, String str) {
        C69263Wi r3;
        int i;
        C69263Wi r5;
        Runnable r4;
        AnonymousClass36K A0l = r20.A0l("p2b");
        if (A0l != null) {
            AnonymousClass36K A0l2 = A0l.A0l("report");
            if (A0l2 != null && this.A00 != null) {
                AnonymousClass36K A0l3 = A0l2.A0l("url");
                AnonymousClass36K A0l4 = A0l2.A0l("direct_path");
                AnonymousClass36K A0l5 = A0l2.A0l("file_name");
                AnonymousClass36K A0l6 = A0l2.A0l("file_length");
                AnonymousClass36K A0l7 = A0l2.A0l("media_key");
                AnonymousClass36K A0l8 = A0l2.A0l("file_sha256");
                AnonymousClass36K A0l9 = A0l2.A0l("file_enc_sha256");
                if (A0l3 == null || A0l5 == null || A0l6 == null || A0l8 == null || A0l9 == null || A0l7 == null || A0l4 == null) {
                    r3 = this.A02;
                    i = 13;
                } else {
                    long A052 = C56612sH.A05(this.A05, A0l2);
                    long A042 = C615531h.A04(A0l6.A0n(), 0);
                    String A0n = A0l3.A0n();
                    String A0n2 = A0l4.A0n();
                    C626936e.A06(A0n2);
                    String A0n3 = A0l5.A0n();
                    C626936e.A06(A0n3);
                    String A0n4 = A0l7.A0n();
                    C626936e.A06(A0n4);
                    String A0n5 = A0l8.A0n();
                    C626936e.A06(A0n5);
                    String A0n6 = A0l9.A0n();
                    C626936e.A06(A0n6);
                    C165887xn r6 = new C165887xn(A0n, A0n2, A0n3, A0n4, A0n5, A0n6, A042, A0l2.A0e("creation", 0) * 1000, A052);
                    r5 = this.A02;
                    r4 = new C70143a1(this, 26, r6);
                }
            } else if (this.A00 != null) {
                r5 = this.A02;
                r4 = new C70083Zv(this, A0l.A0e("timestamp", 0) * 1000, 18);
            } else {
                return;
            }
            r5.BkS(r4);
            return;
        } else if (this.A00 != null) {
            r3 = this.A02;
            i = 14;
        } else {
            return;
        }
        r3.BkS(new C71283br((Object) this, i));
    }
}
