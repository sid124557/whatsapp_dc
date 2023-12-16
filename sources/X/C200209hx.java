package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9hx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200209hx implements Runnable {
    public final /* synthetic */ C204809px A00;
    public final /* synthetic */ boolean A01;

    public final void run() {
        C204809px r0 = this.A00;
        boolean z = this.A01;
        C194969Vi r5 = ((AnonymousClass9P1) r0.A00).A02;
        if (z) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = r5.A03.A0F().iterator();
            while (it.hasNext()) {
                AnonymousClass3ZH A0R = C18310x6.A0R(it);
                if (A0R.A0Q() && !C621733w.A02(A0R.A0H)) {
                    A0s.add(A0R.A0I(UserJid.class));
                }
            }
            boolean A002 = r5.A04.A00(C59812xW.A0M, AnonymousClass227.A0C, A0s).A00();
            if (A002) {
                Iterator it2 = A0s.iterator();
                while (it2.hasNext()) {
                    AnonymousClass9U4.A03(r5.A0D).A0H((UserJid) it2.next());
                }
                try {
                    C194869Uu A02 = r5.A02();
                    C59942xk A012 = r5.A01();
                    if (A02 != null && A012 != null) {
                        A02.A02 = A002;
                        r5.A0E.A03(A02, A012.A01);
                    }
                } catch (Exception e) {
                    Log.e("PAY: PaymentIncentiveManager/processUpdateSyncFlag : Error while parsing ", e);
                }
            }
        }
    }

    public /* synthetic */ C200209hx(C204809px r1, boolean z) {
        this.A00 = r1;
        this.A01 = z;
    }
}
