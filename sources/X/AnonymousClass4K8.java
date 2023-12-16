package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.group.GroupMembershipApprovalRequestsFragment;
import com.whatsapp.newsletter.NewsletterLinkLauncher;

/* renamed from: X.4K8  reason: invalid class name */
public class AnonymousClass4K8 implements C15930sC {
    public Object A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public AnonymousClass4K8(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A04 = i;
        this.A00 = obj;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
    }

    public final void BOf(Object obj) {
        if (this.A04 != 0) {
            NewsletterLinkLauncher newsletterLinkLauncher = (NewsletterLinkLauncher) this.A00;
            AnonymousClass2LU r5 = (AnonymousClass2LU) this.A01;
            C89654ea r4 = (C89654ea) this.A02;
            Object obj2 = this.A03;
            r4.A6Q(new AnonymousClass37C(r4, r5, newsletterLinkLauncher), 0, R.string.f11nameremoved);
            C70353aM.A00(newsletterLinkLauncher.A0E, newsletterLinkLauncher, r5, obj2, 18);
            return;
        }
        GroupMembershipApprovalRequestsFragment groupMembershipApprovalRequestsFragment = (GroupMembershipApprovalRequestsFragment) this.A02;
        TextView textView = (TextView) this.A03;
        Number number = (Number) obj;
        C162457s7.A0J(textView, 3);
        ((View) this.A00).setVisibility(0);
        ((View) this.A01).setVisibility(8);
        groupMembershipApprovalRequestsFragment.A13(false);
        C106715a2 r42 = groupMembershipApprovalRequestsFragment.A07;
        if (r42 != null) {
            Context context = textView.getContext();
            C162457s7.A0H(number);
            textView.setText(r42.A05(context, C70003Zm.A00(groupMembershipApprovalRequestsFragment, 8), C08310eF.A09(groupMembershipApprovalRequestsFragment).getString(number.intValue()), ""));
            return;
        }
        throw C18270x1.A0S("linkifer");
    }
}
