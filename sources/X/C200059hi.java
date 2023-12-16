package X;

import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9hi  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C200059hi implements Runnable {
    public final /* synthetic */ C203899oU A00;
    public final /* synthetic */ AnonymousClass4EY A01;

    public final void run() {
        C203899oU r0 = this.A00;
        AnonymousClass4EY r4 = this.A01;
        C194199Ry r5 = (C194199Ry) r0.A00;
        AnonymousClass9U4 r3 = r5.A07;
        AnonymousClass8EA A03 = AnonymousClass9U4.A03(r3);
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A03.A09().iterator();
        while (it.hasNext()) {
            A0s.add(C1899693i.A0C(it).A0A);
        }
        if (!A0s.isEmpty()) {
            Iterator it2 = A0s.iterator();
            while (it2.hasNext()) {
                it2.next();
                r3.A0J();
                Log.w("PAY: removeMerchantPaymentMethod for nonSmbApp!");
            }
        }
        r5.A06.A05();
        r4.BaC(new C190849Ab());
    }

    public /* synthetic */ C200059hi(C203899oU r1, AnonymousClass4EY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
