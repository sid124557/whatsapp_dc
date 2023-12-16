package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.1MX  reason: invalid class name */
public final class AnonymousClass1MX extends C196812d {
    public final TextView A00;
    public final /* synthetic */ BonsaiDiscoveryFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MX(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view, bonsaiDiscoveryFragment);
        this.A01 = bonsaiDiscoveryFragment;
        TextView A0F = C18280x3.A0F(view, R.id.subtitle);
        this.A00 = A0F;
        int A04 = AnonymousClass0Y8.A04(view.getContext(), AnonymousClass5Yj.A02(view.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
        this.A02.setTextColor(A04);
        A0F.setTextColor(A04);
        this.A03.setImageResource(R.drawable.bonsai_onboarding_contact_shimmer_background);
    }
}
