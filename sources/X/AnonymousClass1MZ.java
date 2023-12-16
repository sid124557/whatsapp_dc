package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;

/* renamed from: X.1MZ  reason: invalid class name */
public final class AnonymousClass1MZ extends C196812d {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final TextView A03;
    public final /* synthetic */ BonsaiDiscoveryFragment A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1MZ(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view, bonsaiDiscoveryFragment);
        this.A04 = bonsaiDiscoveryFragment;
        this.A00 = C18290x4.A0M(view, R.id.name_container);
        this.A02 = C18280x3.A0F(view, R.id.count);
        this.A01 = (ImageView) C18290x4.A0M(view, R.id.count_badge);
        this.A03 = C18280x3.A0F(view, R.id.description);
        this.A01.setForeground(AnonymousClass0RP.A00(view.getContext(), R.drawable.bonsai_onboarding_contact_rounded_corners_large));
    }
}
