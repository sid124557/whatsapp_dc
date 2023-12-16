package X;

import com.whatsapp.newsletter.ui.multiadmin.NewsletterAcceptAdminInviteSheet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68S  reason: invalid class name */
public class AnonymousClass68S implements AnonymousClass66A {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass68S(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A01 = obj2;
        this.A00 = obj;
    }

    public void BSL(List list) {
        if (this.A02 != 0) {
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A01;
            C86624Kv.A1D(newsletterAcceptAdminInviteSheet.A1X(), newsletterAcceptAdminInviteSheet, 46);
            return;
        }
        ArrayList A0r = C18300x5.A0r(list);
        for (Object next : list) {
            if (next instanceof C96854x6) {
                A0r.add(next);
            }
        }
        ArrayList A0c = C73783g4.A0c(A0r);
        Iterator it = A0r.iterator();
        while (it.hasNext()) {
            A0c.add(((C96854x6) it.next()).A00);
        }
        C89654ea r4 = (C89654ea) this.A01;
        r4.A05.A0S(new C70353aM(r4, this.A00, A0c, 17));
    }

    public void BdG(List list) {
        C69263Wi r5;
        Runnable r4;
        if (this.A02 != 0) {
            NewsletterAcceptAdminInviteSheet newsletterAcceptAdminInviteSheet = (NewsletterAcceptAdminInviteSheet) this.A01;
            r5 = newsletterAcceptAdminInviteSheet.A1X();
            r4 = new C70123Zz(newsletterAcceptAdminInviteSheet, 10, this.A00);
        } else {
            ArrayList A0r = C18300x5.A0r(list);
            for (Object next : list) {
                if (next instanceof C96864x7) {
                    A0r.add(next);
                }
            }
            ArrayList A0c = C73783g4.A0c(A0r);
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                A0c.add(((C96864x7) it.next()).A01);
            }
            C89654ea r2 = (C89654ea) this.A01;
            r5 = r2.A05;
            r4 = new C70353aM(r2, this.A00, A0c, 16);
        }
        r5.A0S(r4);
    }
}
