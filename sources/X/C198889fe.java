package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.9fe  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C198889fe implements Runnable {
    public final /* synthetic */ C196449ar A00;

    public final void run() {
        C196449ar r4 = this.A00;
        if (C1899693i.A0x(r4.A03)) {
            AnonymousClass8EA A03 = AnonymousClass9U4.A03(r4.A04);
            C85284Fq A0C = A03.A00.A0C();
            try {
                int A07 = ((AnonymousClass3H0) A0C).A03.A07("tmp_transactions", "tmp_ts<?", "removeOldPaymentTmpTransactionInfo/DELETE_SCHEMA_PAY_TRANSACTIONS_TMP", new String[]{Long.toString(C18290x4.A0B(A03.A03.A0H() - C86654Ky.A09(TimeUnit.DAYS)))});
                if (A07 > 0) {
                    C18260x0.A0y("PAY: PaymentStore removeOldPaymentTmpTransactionInfo deleted num rows: ", AnonymousClass001.A0o(), A07);
                }
                A0C.close();
                C196419ao r5 = r4.A0B;
                Integer[] numArr = new Integer[1];
                AnonymousClass000.A1P(numArr, 1000, 0);
                List A0V = AnonymousClass9U4.A01(r5.A05).A0V(new Integer[]{0}, numArr, -1);
                ArrayList A0s = AnonymousClass001.A0s();
                ArrayList A0s2 = AnonymousClass001.A0s();
                Iterator it = A0V.iterator();
                while (it.hasNext()) {
                    C624034w A0E = C1899693i.A0E(it);
                    C56972sr r1 = r5.A04;
                    if (r1.A0a(A0E.A0D) || r1.A0a(A0E.A0E)) {
                        A0s.add(A0E);
                    } else {
                        AnonymousClass2z0 A0R = C1899593h.A0R(A0E);
                        if (!(A0R.A00 == null || A0R.A01 == null)) {
                            AnonymousClass0x2.A1G(A0E, A0R, A0s2);
                        }
                    }
                }
                r5.A03.A0S(new C200939jG(r5, A0s, A0s2));
            } catch (Throwable th) {
                th.addSuppressed(th);
                throw th;
            }
        }
    }

    public /* synthetic */ C198889fe(C196449ar r1) {
        this.A00 = r1;
    }
}
