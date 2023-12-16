package X;

import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9cO  reason: invalid class name and case insensitive filesystem */
public class C197019cO implements C203079n5 {
    public final /* synthetic */ PinBottomSheetDialogFragment A00;
    public final /* synthetic */ C194939Vd A01;

    public C197019cO(PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C194939Vd r2) {
        this.A01 = r2;
        this.A00 = pinBottomSheetDialogFragment;
    }

    public void BS6(AnonymousClass34V r6) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1a();
        }
        C18260x0.A1Q(AnonymousClass001.A0o(), "PAY: FbPayHubActivity/PaymentStepUpWebviewAction onError: ", r6);
        int i = r6.A00;
        if (i == 1441) {
            C194939Vd r3 = this.A01;
            AnonymousClass9TR r2 = r3.A0J;
            long j = r6.A02;
            r2.A02(j);
            if (pinBottomSheetDialogFragment != null) {
                C1899693i.A0u(pinBottomSheetDialogFragment, j);
            } else {
                r3.A02();
            }
        } else {
            if (i == 1440) {
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1c(r6.A01, R.plurals.f9nameremoved);
                    return;
                }
            } else if (i == 455) {
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1L();
                }
                this.A01.A01();
                return;
            } else {
                if (i == 1448) {
                    this.A01.A0G.A02(r6, "FB", "PIN");
                }
                if (pinBottomSheetDialogFragment != null) {
                    pinBottomSheetDialogFragment.A1L();
                }
            }
            this.A01.A02();
        }
    }

    public void BdE(String str, String str2) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A00;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1L();
        }
        C08310eF r3 = (C08310eF) this.A01.A0K;
        C003203q A0R = r3.A0R();
        C626936e.A05(str);
        r3.startActivityForResult(C627736r.A17(A0R, str, str2, true, false), 1);
    }
}
