package X;

import android.view.View;
import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9cm  reason: invalid class name and case insensitive filesystem */
public class C197229cm implements C203139nB {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ C1902294r A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    public C197229cm(C89644eZ r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C1902294r r3, String str, String str2, String str3) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A00 = r1;
    }

    public void BPT(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        pinBottomSheetDialogFragment.A1b();
        C1902294r r5 = this.A02;
        AnonymousClass9VB r12 = r5.A07;
        String str2 = this.A03;
        String str3 = this.A05;
        C194189Rx r1 = new C194189Rx(this.A00, (FingerprintBottomSheet) null, pinBottomSheetDialogFragment, r5, this.A04, str2, str3, 1);
        r12.A01(new C204849q1(r1, r12, str, str2, 1), new C205089qP(r1, 1), str3);
    }

    public void BTk(View view) {
        this.A02.A00.A0G(Boolean.TRUE);
    }
}
