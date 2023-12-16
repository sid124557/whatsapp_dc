package X;

import com.whatsapp.newsletter.NewsletterInfoActivity;
import com.whatsapp.newsletter.NewsletterInfoMembersListViewModel;
import java.util.List;

/* renamed from: X.61s  reason: invalid class name and case insensitive filesystem */
public final class C1217461s extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ NewsletterInfoActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1217461s(NewsletterInfoActivity newsletterInfoActivity) {
        super(1);
        this.this$0 = newsletterInfoActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean A46 = AnonymousClass4SG.A46(this.this$0, (C95814uZ) obj);
        NewsletterInfoActivity newsletterInfoActivity = this.this$0;
        if (A46) {
            AnonymousClass1RL A7G = newsletterInfoActivity.A7G();
            C372821q r1 = C372821q.SUBSCRIBED;
            C162457s7.A0J(r1, 0);
            A7G.A07 = r1;
            NewsletterInfoActivity newsletterInfoActivity2 = this.this$0;
            C87204Ok r3 = newsletterInfoActivity2.A0d;
            if (r3 == null) {
                throw C18270x1.A0S("newsletterMembersListAdapter");
            }
            C72023d3 r2 = C72023d3.A00;
            r3.A00 = newsletterInfoActivity2.A7G().A07;
            List list = r3.A0D;
            list.clear();
            list.addAll(r2);
            r3.A00(r3.A01);
            C91534kK r0 = this.this$0.A0c;
            if (r0 == null) {
                throw C18270x1.A0S("newsletterInfoViewModel");
            }
            r0.A0I(false);
            NewsletterInfoActivity newsletterInfoActivity3 = this.this$0;
            C56842se r12 = newsletterInfoActivity3.A0f;
            if (r12 != null) {
                r12.A05(newsletterInfoActivity3.A7H());
            } else {
                throw C18270x1.A0S("newsletterManager");
            }
        } else {
            NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel = newsletterInfoActivity.A0b;
            if (newsletterInfoMembersListViewModel != null) {
                newsletterInfoMembersListViewModel.A0E(C371521d.SHORT, true);
            }
            NewsletterInfoMembersListViewModel newsletterInfoMembersListViewModel2 = this.this$0.A0b;
            if (newsletterInfoMembersListViewModel2 != null) {
                newsletterInfoMembersListViewModel2.A0E(C371521d.FULL, true);
            }
        }
        AnonymousClass1RL A7G2 = this.this$0.A7G();
        if (!A7G2.A0K && A7G2.A07 == C372821q.OWNER) {
            NewsletterInfoActivity newsletterInfoActivity4 = this.this$0;
            C91534kK r13 = newsletterInfoActivity4.A0c;
            if (r13 == null) {
                throw C18270x1.A0S("newsletterInfoViewModel");
            }
            r13.A0H(newsletterInfoActivity4.A7H());
        }
        return C59022wD.A00;
    }
}
