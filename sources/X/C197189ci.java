package X;

import com.whatsapp.authentication.FingerprintBottomSheet;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;

/* renamed from: X.9ci  reason: invalid class name and case insensitive filesystem */
public class C197189ci implements C203129nA {
    public final /* synthetic */ FingerprintBottomSheet A00;
    public final /* synthetic */ C194939Vd A01;

    public C197189ci(FingerprintBottomSheet fingerprintBottomSheet, C194939Vd r2) {
        this.A01 = r2;
        this.A00 = fingerprintBottomSheet;
    }

    public void Bbb() {
        C194939Vd r3 = this.A01;
        PinBottomSheetDialogFragment A002 = AnonymousClass9SH.A00();
        A002.A0B = new C205099qQ(A002, 1, r3);
        r3.A06.Bon(A002, (String) null);
    }

    public void BdK(byte[] bArr) {
        FingerprintBottomSheet fingerprintBottomSheet = this.A00;
        fingerprintBottomSheet.A1L();
        C194939Vd r3 = this.A01;
        C89644eZ r6 = r3.A06;
        C69263Wi r7 = r3.A04;
        AnonymousClass9U5 r9 = r3.A0D;
        C40602Ha r8 = r3.A0B;
        AnonymousClass9VU r10 = r3.A0G;
        C194149Rt r5 = new C194149Rt(r6, r7, r8, r9, r10, "PIN");
        C67993Rl A012 = r10.A01("FB", "PIN");
        if (A012 != null) {
            AnonymousClass36K A013 = new C193849Qh(A012).A01(bArr);
            fingerprintBottomSheet.A1L();
            r3.A06((PinBottomSheetDialogFragment) null, A013);
            return;
        }
        r5.A00(new C204859q2(bArr, 2, this), "FB");
    }
}
