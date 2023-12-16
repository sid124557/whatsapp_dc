package X;

import android.widget.TextView;
import com.whatsapp.calling.callrating.CallRatingFragment;

/* renamed from: X.60P  reason: invalid class name */
public final class AnonymousClass60P extends C829045j implements AnonymousClass4GQ {
    public final /* synthetic */ CallRatingFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass60P(CallRatingFragment callRatingFragment) {
        super(1);
        this.this$0 = callRatingFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        Number number = (Number) obj;
        TextView textView = this.this$0.A00;
        if (textView != null) {
            if (number == null || number.intValue() != -1) {
                textView.setText(C86644Kx.A07(number));
                i = 0;
            } else {
                i = 4;
            }
            textView.setVisibility(i);
        }
        return C59022wD.A00;
    }
}
