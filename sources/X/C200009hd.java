package X;

import com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9hd  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200009hd implements Runnable {
    public final /* synthetic */ C202519m9 A00;
    public final /* synthetic */ AnonymousClass9bO A01;

    public final void run() {
        AnonymousClass9b0 r4;
        String str;
        boolean A0O;
        AnonymousClass9bO r1;
        AnonymousClass9bO r6 = this.A01;
        C202519m9 r5 = this.A00;
        List A0N = r6.A03.A0N(-1);
        int size = A0N.size();
        r6.A01 = size;
        if (r6.A00 > 0) {
            C160757oG r2 = r6.A08;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("starting sync for: ");
            A0o.append(size);
            C1899593h.A1J(r2, " transactions", A0o);
            Iterator it = A0N.iterator();
            while (it.hasNext()) {
                C624034w A0E = C1899693i.A0E(it);
                C626936e.A0C(AnonymousClass000.A1W(A0E.A0K));
                C203499no A06 = AnonymousClass9U4.A06(r6.A07);
                if (A06 != null) {
                    A06.Bq0();
                }
                AnonymousClass9M0 r0 = (AnonymousClass9M0) r5;
                int i = r0.A01;
                Object obj = r0.A00;
                if (i != 0) {
                    IndiaUpiPaymentsAccountSetupActivity indiaUpiPaymentsAccountSetupActivity = (IndiaUpiPaymentsAccountSetupActivity) obj;
                    r4 = indiaUpiPaymentsAccountSetupActivity.A02;
                    str = indiaUpiPaymentsAccountSetupActivity.A0o;
                    A0O = A0E.A0O();
                    r1 = indiaUpiPaymentsAccountSetupActivity.A00;
                } else {
                    C195989a7 r02 = (C195989a7) obj;
                    r4 = r02.A09;
                    str = A0E.A0K;
                    A0O = A0E.A0O();
                    r1 = r02.A08;
                }
                r4.A00(r1, r4.A08.A0G(), str, A0O);
            }
        }
    }

    public /* synthetic */ C200009hd(C202519m9 r1, AnonymousClass9bO r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
