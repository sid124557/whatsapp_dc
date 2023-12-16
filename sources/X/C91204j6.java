package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4j6  reason: invalid class name and case insensitive filesystem */
public class C91204j6 extends C91214j7 {
    public final TextView A00;
    public final C15930sC A01 = AnonymousClass4L0.A0G(this, 141);
    public final C620733j A02;

    public void A08() {
        this.A07 = null;
        CallGridViewModel callGridViewModel = this.A06;
        if (callGridViewModel != null) {
            callGridViewModel.A0F.A0F(this.A01);
        }
    }

    public void A0G(C105175Tw r3) {
        CallGridViewModel callGridViewModel = this.A06;
        if (callGridViewModel != null) {
            callGridViewModel.A0F.A0E(this.A01);
        }
        A0J(r3);
        A0M(r3);
        this.A00.setVisibility(AnonymousClass001.A08(r3.A0R ? 1 : 0));
        A0L(r3, false);
        this.A07 = r3;
    }

    public C91204j6(View view, AnonymousClass64J r3, AnonymousClass30B r4, AnonymousClass7D2 r5, CallGridViewModel callGridViewModel, AnonymousClass5UX r7, AnonymousClass5ZU r8, C620733j r9, AnonymousClass1VX r10) {
        super(view, r3, r4, r5, callGridViewModel, r7, r8, r9, r10);
        this.A02 = r9;
        this.A00 = C18300x5.A0G(view, R.id.audio_call_duration);
    }
}
