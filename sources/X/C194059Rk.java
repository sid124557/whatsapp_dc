package X;

import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9Rk  reason: invalid class name and case insensitive filesystem */
public class C194059Rk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89644eZ A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C191689Fx A03;
    public final /* synthetic */ String A04;

    public C194059Rk(C89644eZ r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C191689Fx r3, String str, int i) {
        this.A03 = r3;
        this.A00 = i;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = r1;
        this.A04 = str;
    }

    public void A00(AnonymousClass34V r4) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment;
        Log.i("DyiViewModel/request-report/on-error");
        int i = r4.A00;
        if (i == 1440 || i == 444 || i == 478 || i == 1441 || i == 445 || i == 1448 || i == 10718) {
            C191689Fx r2 = this.A03;
            String str = this.A04;
            C626936e.A06(str);
            r2.A0F(r4, this.A02, str);
            return;
        }
        if (this.A00 == 1 && (pinBottomSheetDialogFragment = this.A02) != null) {
            pinBottomSheetDialogFragment.A1a();
            pinBottomSheetDialogFragment.A1K();
        }
        C191689Fx r22 = this.A03;
        AnonymousClass08M r0 = r22.A02;
        Integer A0Z = C18290x4.A0Z();
        r0.A0G(A0Z);
        C1899593h.A0p(r22.A03, A0Z, r4);
    }
}
