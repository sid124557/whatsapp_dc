package X;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9dn  reason: invalid class name and case insensitive filesystem */
public abstract class C197739dn implements AnonymousClass4EZ {
    public final Context A00;
    public final C40602Ha A01;
    public final C84104Ba A02;

    public abstract void A03(AnonymousClass34V r1);

    public abstract void A04(AnonymousClass34V r1);

    public abstract void A05(AnonymousClass36K r1);

    public void BSN(AnonymousClass36K r8, String str) {
        List<AnonymousClass34V> list;
        if (!(this instanceof C203899oU) || 13 - ((C203899oU) this).A02 != 0) {
            list = A02(r8);
        } else {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator A0M = AnonymousClass36K.A0M(r8, "error");
            while (A0M.hasNext()) {
                AnonymousClass36K r4 = (AnonymousClass36K) A0M.next();
                if (r4 != null) {
                    String A0r = r4.A0r("code", (String) null);
                    String A0r2 = r4.A0r("text", (String) null);
                    String A0r3 = r4.A0r("auth-ticket-fp", (String) null);
                    if (A0r != null) {
                        int parseInt = Integer.parseInt(A0r);
                        AnonymousClass34V A0M2 = C1899693i.A0M();
                        A0M2.A00 = parseInt;
                        A0M2.A08 = A0r2;
                        A0M2.A06 = A0r3;
                        A0s.add(A0M2);
                    }
                }
            }
            list = A0s;
        }
        for (AnonymousClass34V r3 : list) {
            C40602Ha r0 = this.A01;
            int i = r3.A00;
            AnonymousClass48M r2 = r0.A00;
            if (r2 != null) {
                C197769dq r22 = (C197769dq) r2;
                if (i == 404 || i == 440 || i == 449) {
                    r22.A01(true, false);
                }
            }
            this.A02.BkS(new C199989hb(this, r3));
        }
    }

    public void BdM(AnonymousClass36K r3, String str) {
        this.A02.BkS(new C199969hZ(this, r3));
    }

    public C197739dn(Context context, C40602Ha r2, C84104Ba r3) {
        this.A00 = context;
        this.A02 = r3;
        this.A01 = r2;
    }

    public static List A02(AnonymousClass36K r6) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator A0M = AnonymousClass36K.A0M(r6, "error");
        while (A0M.hasNext()) {
            AnonymousClass36K r4 = (AnonymousClass36K) A0M.next();
            if (r4 != null) {
                String A0r = r4.A0r("code", (String) null);
                String A0r2 = r4.A0r("text", (String) null);
                r4.A0r("display_title", (String) null);
                String A0r3 = r4.A0r("display_text", (String) null);
                if (A0r != null) {
                    int parseInt = Integer.parseInt(A0r);
                    AnonymousClass34V A0M2 = C1899693i.A0M();
                    A0M2.A00 = parseInt;
                    A0M2.A08 = A0r2;
                    A0M2.A07 = A0r3;
                    A0s.add(A0M2);
                    if (parseInt == 454) {
                        A0M2.A05 = r4.A0l("step_up");
                    }
                }
            }
        }
        return A0s;
    }

    public void BQs(String str) {
        AnonymousClass34V A0M = C1899693i.A0M();
        int i = 6;
        if (C29441ip.A02(this.A00)) {
            i = -2;
        }
        A0M.A00 = i;
        this.A02.BkS(new C199979ha(this, A0M));
    }
}
