package X;

import android.os.CountDownTimer;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.93w  reason: invalid class name and case insensitive filesystem */
public class C1901093w extends CountDownTimer {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1901093w(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, long j) {
        super(j, 1000);
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void onFinish() {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        pinBottomSheetDialogFragment.A01 = null;
        pinBottomSheetDialogFragment.A05.setVisibility(4);
        pinBottomSheetDialogFragment.A06.setErrorState(false);
        pinBottomSheetDialogFragment.A06.setEnabled(true);
    }

    public void onTick(long j) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        TextView textView = pinBottomSheetDialogFragment.A05;
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = C107565bW.A0A(pinBottomSheetDialogFragment.A08, C18290x4.A0B(j));
        C1899693i.A0l(textView, pinBottomSheetDialogFragment, A0L, R.string.f11nameremoved);
    }
}
