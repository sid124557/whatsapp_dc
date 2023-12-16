package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryFragment;
import com.whatsapp.bonsai.discovery.BonsaiDiscoveryViewModel;

/* renamed from: X.12d  reason: invalid class name and case insensitive filesystem */
public abstract class C196812d extends C05570Ua {
    public AnonymousClass47w A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final WaImageView A03;
    public final AnonymousClass66R A04;
    public final /* synthetic */ BonsaiDiscoveryFragment A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C196812d(View view, BonsaiDiscoveryFragment bonsaiDiscoveryFragment) {
        super(view);
        this.A05 = bonsaiDiscoveryFragment;
        AnonymousClass8PJ A1E = AnonymousClass0x9.A1E(BonsaiDiscoveryViewModel.class);
        this.A04 = C18330xA.A02(new C76853sS(bonsaiDiscoveryFragment), new C76863sT(bonsaiDiscoveryFragment), new C79963xT(bonsaiDiscoveryFragment), A1E);
        this.A01 = (FrameLayout) C18290x4.A0M(view, R.id.contact_photo_container);
        this.A03 = (WaImageView) C18290x4.A0M(view, R.id.contact_photo);
        this.A02 = C18280x3.A0F(view, R.id.name);
        C18290x4.A1H(view, this, 13);
    }
}
