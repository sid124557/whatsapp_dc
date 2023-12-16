package X;

import android.view.View;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel;

/* renamed from: X.4j7  reason: invalid class name and case insensitive filesystem */
public class C91214j7 extends C91224j8 {
    public final TextView A00;

    public void A0M(C105175Tw r4) {
        C150477Qw r1 = r4.A09;
        if (r1 != null) {
            TextView textView = this.A00;
            CharSequence A002 = r1.A00(textView.getContext());
            textView.setVisibility(0);
            textView.setText(A002);
            return;
        }
        this.A00.setVisibility(8);
    }

    public C91214j7(View view, AnonymousClass64J r3, AnonymousClass30B r4, AnonymousClass7D2 r5, CallGridViewModel callGridViewModel, AnonymousClass5UX r7, AnonymousClass5ZU r8, C620733j r9, AnonymousClass1VX r10) {
        super(view, r3, r4, r5, callGridViewModel, r7, r8, r9, r10);
        this.A02 = 0;
        this.A00 = C18300x5.A0G(view, R.id.audio_call_status);
    }

    public void A0A(int i) {
    }

    public void A0G(C105175Tw r1) {
        A0M(r1);
        super.A0G(r1);
    }
}
