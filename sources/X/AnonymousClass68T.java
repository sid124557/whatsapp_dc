package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.newsletter.ui.multiadmin.NewsletterRevokeAdminInviteSheet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68T  reason: invalid class name */
public class AnonymousClass68T implements AnonymousClass66A {
    public Object A00;
    public final int A01;

    public AnonymousClass68T(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BSL(List list) {
        C69263Wi r4;
        Runnable runnable;
        if (this.A01 != 0) {
            C162457s7.A0J(list, 0);
            NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A00;
            Object obj = AnonymousClass0x9.A14(C111095hX.A01(newsletterRevokeAdminInviteSheet.A1D())).get();
            if (obj != null) {
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next : list) {
                    if (next instanceof C96854x6) {
                        A0s.add(next);
                    }
                }
                ArrayList A0c = C73783g4.A0c(A0s);
                Iterator it = A0s.iterator();
                while (it.hasNext()) {
                    A0c.add(((C96854x6) it.next()).A00);
                }
                r4 = newsletterRevokeAdminInviteSheet.A00;
                if (r4 != null) {
                    runnable = new C70353aM(newsletterRevokeAdminInviteSheet, A0c, obj, 24);
                } else {
                    throw C18270x1.A0S("globalUI");
                }
            } else {
                return;
            }
        } else {
            ArrayList A0r = C18300x5.A0r(list);
            for (Object next2 : list) {
                if (next2 instanceof C96854x6) {
                    A0r.add(next2);
                }
            }
            ArrayList A0c2 = C73783g4.A0c(A0r);
            Iterator it2 = A0r.iterator();
            while (it2.hasNext()) {
                A0c2.add(((C96854x6) it2.next()).A00);
            }
            C89654ea r1 = (C89654ea) this.A00;
            r4 = r1.A05;
            runnable = new C70113Zy(r1, 33, A0c2);
        }
        r4.A0S(runnable);
    }

    public void BdG(List list) {
        if (this.A01 != 0) {
            NewsletterRevokeAdminInviteSheet newsletterRevokeAdminInviteSheet = (NewsletterRevokeAdminInviteSheet) this.A00;
            C89654ea A0F = C18320x8.A0F(AnonymousClass0x9.A14(C111095hX.A01(newsletterRevokeAdminInviteSheet.A1D())));
            if (A0F != null) {
                View view = A0F.A00;
                List emptyList = Collections.emptyList();
                C620633i r5 = newsletterRevokeAdminInviteSheet.A07;
                if (r5 != null) {
                    new C110065fd(A0F, C88694ab.A00(view, R.string.f11nameremoved, 2000), r5, emptyList, false).A01();
                    return;
                }
                throw C18270x1.A0S("systemServices");
            }
            return;
        }
        C89654ea r2 = (C89654ea) this.A00;
        C86624Kv.A1D(r2.A05, r2, 29);
    }
}
