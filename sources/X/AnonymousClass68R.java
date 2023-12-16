package X;

import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.multiadmin.InviteNewsletterAdminSelector;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.68R  reason: invalid class name */
public class AnonymousClass68R implements AnonymousClass66A {
    public Object A00;
    public Object A01;
    public String A02;
    public final int A03;

    public AnonymousClass68R(Object obj, Object obj2, String str, int i) {
        this.A03 = i;
        this.A01 = obj2;
        this.A00 = obj;
        this.A02 = str;
    }

    public void BSL(List list) {
        String A0L;
        C69263Wi r0;
        String str;
        int i;
        C89634eX r8;
        List list2 = list;
        if (this.A03 != 0) {
            C162457s7.A0J(list, 0);
            C89634eX r82 = (C89634eX) this.A01;
            C620733j r6 = r82.A0N;
            long size = (long) list.size();
            Object[] A0L2 = AnonymousClass002.A0L();
            AnonymousClass000.A1Q(A0L2, 0, (long) list.size());
            A0L = r6.A0L(A0L2, R.plurals.f9nameremoved, size);
            C162457s7.A0D(A0L);
            r0 = r82.A05;
            str = this.A02;
            i = 3;
            r8 = r82;
        } else {
            C162457s7.A0J(list, 0);
            C89654ea r83 = (C89654ea) this.A01;
            C620733j r4 = r83.A00;
            Object[] objArr = new Object[1];
            AnonymousClass000.A1P(objArr, 1, 0);
            A0L = r4.A0L(objArr, R.plurals.f9nameremoved, 1);
            C162457s7.A0D(A0L);
            r0 = r83.A05;
            str = this.A02;
            i = 2;
            r8 = r83;
        }
        r0.A0S(new C70493aa(r8, list2, A0L, str, i));
    }

    public void BdG(List list) {
        List list2 = list;
        if (this.A03 != 0) {
            ArrayList A0r = C18300x5.A0r(list2);
            for (Object next : list2) {
                if (next instanceof C96864x7) {
                    A0r.add(next);
                }
            }
            HashMap A0t = AnonymousClass001.A0t();
            Iterator it = A0r.iterator();
            while (it.hasNext()) {
                C96864x7 r0 = (C96864x7) it.next();
                AnonymousClass0x2.A1J(r0.A01, A0t, r0.A00);
            }
            InviteNewsletterAdminSelector inviteNewsletterAdminSelector = (InviteNewsletterAdminSelector) this.A01;
            C45392Zw r9 = inviteNewsletterAdminSelector.A03;
            if (r9 != null) {
                String A13 = AnonymousClass0x9.A13(inviteNewsletterAdminSelector.A0B);
                String str = this.A02;
                r9.A00(inviteNewsletterAdminSelector, (C95804uY) this.A00, A13, str, A0t);
                ArrayList A0s = AnonymousClass001.A0s();
                for (Object next2 : list2) {
                    if (next2 instanceof C96854x6) {
                        A0s.add(next2);
                    }
                }
                if (AnonymousClass0x7.A1S(A0s)) {
                    inviteNewsletterAdminSelector.A05.A0S(new C71613cO(inviteNewsletterAdminSelector, A0t, A0s, A0r, str, 5));
                } else {
                    AnonymousClass0x2.A0m(inviteNewsletterAdminSelector, C18320x8.A07().putExtra("extra_invitees_count", (long) A0r.size()));
                }
            } else {
                throw C18270x1.A0S("newsletterAdminInvitationsUtils");
            }
        } else {
            C162457s7.A0J(list2, 0);
            HashMap A0t2 = AnonymousClass001.A0t();
            ArrayList A0s2 = AnonymousClass001.A0s();
            for (Object next3 : list2) {
                if (next3 instanceof C96864x7) {
                    A0s2.add(next3);
                }
            }
            Iterator it2 = A0s2.iterator();
            while (it2.hasNext()) {
                C96864x7 r02 = (C96864x7) it2.next();
                AnonymousClass0x2.A1J(r02.A01, A0t2, r02.A00);
            }
            NewsletterInfoActivity newsletterInfoActivity = (NewsletterInfoActivity) this.A01;
            C45392Zw r1 = newsletterInfoActivity.A0i;
            if (r1 != null) {
                r1.A00(newsletterInfoActivity, (C95804uY) this.A00, newsletterInfoActivity.A7G().A0H, this.A02, A0t2);
                C86624Kv.A1D(newsletterInfoActivity.A05, newsletterInfoActivity, 30);
                return;
            }
            throw C18270x1.A0S("newsletterAdminInvitationsUtils");
        }
    }
}
