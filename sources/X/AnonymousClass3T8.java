package X;

import com.whatsapp.util.Log;

/* renamed from: X.3T8  reason: invalid class name */
public final class AnonymousClass3T8 implements AnonymousClass4EZ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C49352gO A01;
    public final /* synthetic */ C54662p5 A02;
    public final /* synthetic */ C45642aL A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public void BSN(AnonymousClass36K r13, String str) {
        C162457s7.A0J(r13, 1);
        Log.e("RecordDisclosureAcceptanceAction/sendData:onError");
        int A012 = C57492tj.A01(r13);
        C45642aL r7 = this.A03;
        C49352gO r5 = this.A01;
        C54662p5 r6 = this.A02;
        C70913bG r4 = new C70913bG(r5, r6, r7, this.A06, this.A05, this.A04, this.A00);
        if (A012 != 304) {
            if (A012 != 405) {
                if (A012 != 429) {
                    if (A012 != 481) {
                        if (A012 != 500) {
                            if (!(A012 == 503 || A012 == 400 || A012 == 401)) {
                                if (!(A012 == 408 || A012 == 409)) {
                                    return;
                                }
                            }
                        }
                    } else if (r6.A04()) {
                        r4.run();
                        return;
                    }
                }
                Long A013 = r6.A01();
                if (A013 != null) {
                    r7.A01.Bkn(r4, "RecordDisclosureAcceptanceAction/retryWithBackoff", A013.longValue());
                    return;
                }
            }
            r5.A00();
            return;
        }
        r5.A01();
    }

    public AnonymousClass3T8(C49352gO r1, C54662p5 r2, C45642aL r3, String str, String str2, String str3, int i) {
        this.A01 = r1;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
        this.A06 = str;
        this.A05 = str2;
        this.A04 = str3;
    }

    public void BQs(String str) {
        Log.e("RecordDisclosureAcceptanceAction/sendData:onDeliveryFailure");
        this.A01.A00();
    }

    public void BdM(AnonymousClass36K r2, String str) {
        Log.i("RecordDisclosureAcceptanceAction/sendData:onSuccess");
        this.A01.A01();
    }
}
