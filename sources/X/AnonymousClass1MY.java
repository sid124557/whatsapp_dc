package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.1MY  reason: invalid class name */
public final class AnonymousClass1MY extends C196812d {
    public final TextView A00;
    public final /* synthetic */ BonsaiDiscoveryFragment A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MY(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view, bonsaiDiscoveryFragment);
        this.A01 = bonsaiDiscoveryFragment;
        this.A00 = C18280x3.A0F(view, R.id.subtitle);
        this.A01.setForeground(AnonymousClass0RP.A00(view.getContext(), R.drawable.bonsai_onboarding_contact_rounded_corners_small));
    }
}
