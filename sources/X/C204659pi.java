package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.9pi  reason: invalid class name and case insensitive filesystem */
public class C204659pi implements AnonymousClass8r2 {
    public Object A00;
    public final int A01;

    public C204659pi(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void BPJ(String str) {
        C203139nB r0;
        int i = this.A01;
        int length = str.length();
        if (i != 0) {
            if (length != 6 || (r0 = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A0B != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A07.A0H()) {
                r0 = pinBottomSheetDialogFragment.A0B;
            } else {
                return;
            }
        } else {
            return;
        }
        r0.BPT(str);
    }

    public void BXA(String str) {
        C203139nB r0;
        int i = this.A01;
        int length = str.length();
        if (i != 0) {
            if (length != 6 || (r0 = ((BrazilAccountRecoveryPinActivity) this.A00).A03) == null) {
                return;
            }
        } else if (length == 6) {
            PinBottomSheetDialogFragment pinBottomSheetDialogFragment = (PinBottomSheetDialogFragment) this.A00;
            if (pinBottomSheetDialogFragment.A0B != null && pinBottomSheetDialogFragment.A00 <= pinBottomSheetDialogFragment.A07.A0H()) {
                r0 = pinBottomSheetDialogFragment.A0B;
            } else {
                return;
            }
        } else {
            return;
        }
        r0.BPT(str);
    }
}
