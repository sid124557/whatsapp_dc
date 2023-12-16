package X;

import android.content.DialogInterface;
import com.whatsapp.R;
import com.whatsapp.voipcalling.VoipCallControlBottomSheetV2;

/* renamed from: X.93U  reason: invalid class name */
public class AnonymousClass93U implements DialogInterface.OnShowListener {
    public Object A00;
    public final int A01;

    public AnonymousClass93U(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void onShow(DialogInterface dialogInterface) {
        switch (this.A01) {
            case 0:
                C114825nf.A01((C114825nf) this.A00);
                return;
            case 1:
                C114825nf r3 = (C114825nf) this.A00;
                C86604Kt.A0z(r3.A03.getContext(), r3.A08.findViewById(16908290).getRootView(), R.color.f5nameremoved);
                r3.A0V.A02();
                return;
            default:
                VoipCallControlBottomSheetV2.A01(dialogInterface, (VoipCallControlBottomSheetV2) this.A00);
                return;
        }
    }
}
