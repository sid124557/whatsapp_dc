package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9cj  reason: invalid class name and case insensitive filesystem */
public class C197199cj implements C203129nA {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ FingerprintBottomSheet A01;
    public final /* synthetic */ PinBottomSheetDialogFragment A02;
    public final /* synthetic */ C1902294r A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;

    public C197199cj(C89644eZ r1, FingerprintBottomSheet fingerprintBottomSheet, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, C1902294r r4, String str, String str2, String str3) {
        this.A03 = r4;
        this.A05 = str;
        this.A04 = str2;
        this.A00 = r1;
        this.A06 = str3;
        this.A02 = pinBottomSheetDialogFragment;
        this.A01 = fingerprintBottomSheet;
    }

    public void Bbb() {
        C1902294r r3 = this.A03;
        String str = this.A05;
        String str2 = this.A04;
        C89644eZ r1 = this.A00;
        String str3 = this.A06;
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A02;
        pinBottomSheetDialogFragment.A0B = new C197229cm(r1, pinBottomSheetDialogFragment, r3, str2, str3, str);
        r1.Boo(pinBottomSheetDialogFragment);
    }

    public void BdK(byte[] bArr) {
        C1902294r r7 = this.A03;
        AnonymousClass9VB r2 = r7.A07;
        String str = this.A06;
        C194189Rx r3 = new C194189Rx(this.A00, this.A01, (PinBottomSheetDialogFragment) null, r7, this.A05, this.A04, str, 0);
        r2.A01(new C197209ck(r3, bArr), new C205089qP(r3, 0), str);
    }
}
