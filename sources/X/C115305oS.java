package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5oS  reason: invalid class name and case insensitive filesystem */
public class C115305oS implements AnonymousClass4EZ {
    public final C148017Gp A00;
    public final C57162tC A01;
    public final AnonymousClass31C A02;

    public final void A00() {
        C146987Cj r5 = new C146987Cj((List) null);
        C148017Gp r0 = this.A00;
        C111755id r4 = r0.A00;
        r4.A0Z.BkS(new C172708Mj(r4, r5, r0.A01, 32));
    }

    public void BQs(String str) {
        Log.e("GetCustomUrlsByJidProtocol/onDeliveryFailure");
        A00();
    }

    public void BSN(AnonymousClass36K r2, String str) {
        Log.e("GetCustomUrlsByJidProtocol/onError");
        C57492tj.A01(r2);
        A00();
    }

    public void BdM(AnonymousClass36K r7, String str) {
        AnonymousClass36K A0l;
        String A0n;
        Log.e("GetCustomUrlsByJidProtocol/onSuccess");
        AnonymousClass36K A0l2 = r7.A0l("custom_urls");
        if (A0l2 != null) {
            List A0s = A0l2.A0s("custom_url");
            ArrayList A0s2 = AnonymousClass001.A0s();
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(it);
                if (!(A0Y == null || (A0l = A0Y.A0l("path")) == null || (A0n = A0l.A0n()) == null || A0n.isEmpty())) {
                    A0s2.add(A0n);
                }
            }
            C146987Cj r5 = new C146987Cj(A0s2);
            C148017Gp r0 = this.A00;
            C111755id r4 = r0.A00;
            r4.A0Z.BkS(new C172708Mj(r4, r5, r0.A01, 32));
            return;
        }
        A00();
    }

    public C115305oS(C148017Gp r1, C57162tC r2, AnonymousClass31C r3) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }
}
