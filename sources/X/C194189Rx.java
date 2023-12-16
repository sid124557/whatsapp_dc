package X;

import com.whatsapp.R;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.util.Log;

/* renamed from: X.9Rx  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C194189Rx {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C89644eZ A01;
    public final /* synthetic */ FingerprintBottomSheet A02;
    public final /* synthetic */ PinBottomSheetDialogFragment A03;
    public final /* synthetic */ C1902294r A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public final void A00(AnonymousClass34V r17, AnonymousClass36K r18) {
        C1902294r r5 = this.A04;
        int i = this.A00;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A03;
        FingerprintBottomSheet fingerprintBottomSheet = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        C89644eZ r3 = this.A01;
        String str3 = this.A07;
        AnonymousClass34V r1 = r17;
        if (r17 != null) {
            if (i == 1 && pinBottomSheetDialogFragment != null) {
                pinBottomSheetDialogFragment.A1a();
            }
            r5.A03.A0G(r1);
            return;
        }
        if (i == 0 && fingerprintBottomSheet != null) {
            fingerprintBottomSheet.A1L();
        }
        AnonymousClass36K r6 = r18;
        if (r5 instanceof C191689Fx) {
            C191689Fx r52 = (C191689Fx) r5;
            Log.i("DyiViewModel/request-report/on-pin-node-ready");
            if (!str2.equals("DYIREPORT")) {
                Log.e("DyiViewModel/request-report/on-pin-node-ready :: no matching actions");
                return;
            }
            if (i == 0) {
                r3.Bp9(R.string.f11nameremoved);
            }
            r52.A0I(new C194059Rk(r3, pinBottomSheetDialogFragment, r52, str3, i), r6, str);
            return;
        }
        C191679Fw r53 = (C191679Fw) r5;
        if (i == 0) {
            r3.Bp9(R.string.f11nameremoved);
        }
        r53.A04.BkM(new AnonymousClass9k3(r3, pinBottomSheetDialogFragment, r53, r6, str3, str, i));
    }

    public /* synthetic */ C194189Rx(C89644eZ r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C1902294r r4, String str, String str2, String str3, int i) {
        this.A04 = r4;
        this.A00 = i;
        this.A03 = pinBottomSheetDialogFragment;
        this.A02 = fingerprintBottomSheet;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = r1;
        this.A07 = str3;
    }
}
