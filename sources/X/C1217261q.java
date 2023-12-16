package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import com.whatsapp.newsletter.multiadmin.NewsletterInvitedAdminsFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.61q  reason: invalid class name and case insensitive filesystem */
public final class C1217261q extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217261q(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Set set = (Set) obj;
        AnonymousClass4X3 r4 = this.this$0.A0j;
        if (r4 == null) {
            throw C18270x1.A0S("newsletterInvitedAdminsListAdapter");
        }
        C162457s7.A0H(set);
        ArrayList A0d = C73783g4.A0d(set);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            A0d.add(new C96874x8(C18310x6.A0R(it)));
        }
        r4.A0K(A0d);
        boolean isEmpty = set.isEmpty();
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        if (isEmpty) {
            View view = newsletterInfoActivity.A05;
            if (view == null) {
                throw C18270x1.A0S("invitesCard");
            }
            view.setVisibility(8);
        } else {
            C005205m.A01(newsletterInfoActivity, R.id.admin_invites_info).setText(this.this$0.A00.A0M().format(Integer.valueOf(set.size())));
            View view2 = this.this$0.A05;
            if (view2 == null) {
                throw C18270x1.A0S("invitesCard");
            }
            view2.setVisibility(0);
            this.this$0.A7b(false, true);
        }
        NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = this.this$0.A0b;
        if (newsletterInfoMembersListViewModel != null) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                C95814uZ A0b = C86604Kt.A0b(it2);
                if (A0b != null) {
                    A0s.add(A0b);
                }
            }
            Set A0O = C73723fy.A0O(A0s);
            AnonymousClass08M r42 = newsletterInfoMembersListViewModel.A06;
            Iterable iterable = (Iterable) r42.A07();
            if (iterable != null) {
                ArrayList A0s2 = AnonymousClass001.A0s();
                for (Object next : iterable) {
                    if (next instanceof C115005nx) {
                        A0s2.add(next);
                    }
                }
                Iterator it3 = A0s2.iterator();
                while (it3.hasNext()) {
                    C102295Ih r1 = ((C115005nx) it3.next()).A00;
                    r1.A01 = C73723fy.A0U(A0O, r1.A00.A0H);
                }
            }
            AnonymousClass08M r3 = newsletterInfoMembersListViewModel.A05;
            Iterable iterable2 = (Iterable) r3.A07();
            if (iterable2 != null) {
                ArrayList A0s3 = AnonymousClass001.A0s();
                for (Object next2 : iterable2) {
                    if (next2 instanceof C115005nx) {
                        A0s3.add(next2);
                    }
                }
                Iterator it4 = A0s3.iterator();
                while (it4.hasNext()) {
                    C102295Ih r12 = ((C115005nx) it4.next()).A00;
                    r12.A01 = C73723fy.A0U(A0O, r12.A00.A0H);
                }
            }
            Object A07 = r42.A07();
            if (A07 != null) {
                r42.A0G(A07);
            }
            Object A072 = r3.A07();
            if (A072 != null) {
                r3.A0G(A072);
            }
        }
        C08310eF A0D = this.this$0.getSupportFragmentManager().A0D("NewsletterInvitedAdminsFragment");
        if (A0D != null) {
            NewsletterInvitedAdminsFragment newsletterInvitedAdminsFragment = (NewsletterInvitedAdminsFragment) A0D;
            ArrayList A0d2 = C73783g4.A0d(set);
            Iterator it5 = set.iterator();
            while (it5.hasNext()) {
                A0d2.add(new C96874x8(C18310x6.A0R(it5)));
            }
            AnonymousClass4X3 r0 = newsletterInvitedAdminsFragment.A07;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterInvitedAdminsListAdapter");
            }
            r0.A0K(A0d2);
        }
        return C59022wD.A00;
    }
}
