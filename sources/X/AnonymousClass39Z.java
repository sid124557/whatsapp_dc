package X;

import android.view.View;
import com.whatsapp.voipcalling.VoipErrorDialogFragment;

/* renamed from: X.39Z  reason: invalid class name */
public class AnonymousClass39Z implements View.OnClickListener {
    public final int A00;

    public AnonymousClass39Z(int i) {
        this.A00 = i;
    }

    public final void onClick(View view) {
        if (this.A00 == 0) {
            try {
                C18270x1.A0t(VoipErrorDialogFragment.A01(new C47702dg(), 9), (C003203q) C111095hX.A03(view.getContext(), C003203q.class));
            } catch (IllegalStateException e) {
                C18260x0.A17("CallInfoButtonViewHolder/showCallIsFullDialog/Context not an activity: ", AnonymousClass001.A0o(), e);
            }
        }
    }
}
