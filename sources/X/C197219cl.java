package X;

import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment;
import com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity;

/* renamed from: X.9cl  reason: invalid class name and case insensitive filesystem */
public class C197219cl implements C203139nB {
    public final /* synthetic */ C89644eZ A00;
    public final /* synthetic */ PinBottomSheetDialogFragment A01;
    public final /* synthetic */ AnonymousClass9W1 A02;
    public final /* synthetic */ boolean A03;
    public final /* synthetic */ boolean A04;

    public C197219cl(C89644eZ r1, PinBottomSheetDialogFragment pinBottomSheetDialogFragment, AnonymousClass9W1 r3, boolean z, boolean z2) {
        this.A02 = r3;
        this.A01 = pinBottomSheetDialogFragment;
        this.A00 = r1;
        this.A03 = z;
        this.A04 = z2;
    }

    public void BPT(String str) {
        PinBottomSheetDialogFragment pinBottomSheetDialogFragment = this.A01;
        if (pinBottomSheetDialogFragment != null) {
            pinBottomSheetDialogFragment.A1b();
        } else {
            C89644eZ r3 = this.A00;
            if (r3 instanceof BrazilAccountRecoveryPinActivity) {
                r3.Bp9(R.string.f11nameremoved);
                r3.Bru(r3.getResources().getString(R.string.f11nameremoved));
            }
        }
        AnonymousClass9W1 r1 = this.A02;
        C56612sH r8 = r1.A02;
        C69263Wi r6 = r1.A00;
        C56972sr r7 = r1.A01;
        C194089Rn r14 = r1.A0F;
        AnonymousClass9U4 r13 = r1.A0E;
        C194639Tx r0 = r1.A0M;
        AnonymousClass9QC r5 = new AnonymousClass9QC(r6, r7, r8, r1.A05, r1.A08, r1.A0A, r1.A0C, r13, r14, r1.A0H, r0);
        C89644eZ r72 = this.A00;
        C203499no r4 = r1.A0I;
        String str2 = str;
        AnonymousClass9R8 r12 = new AnonymousClass9R8(this, str2);
        C134246ig B0d = r4.B0d();
        B0d.A08 = C18290x4.A0a();
        B0d.A0b = "api_event";
        B0d.A0B = 26;
        r4.BKA(B0d);
        AnonymousClass9VU r11 = r5.A07;
        C67993Rl A012 = r11.A01("FB", "PIN");
        if (A012 != null) {
            C193849Qh r2 = new C193849Qh(A012);
            r5.A06.A00(new AnonymousClass9UP(r72, r5, r2, r12, 0), r2, str2);
            return;
        }
        new C194149Rt(r72, r5.A00, r5.A02, r5.A03, r11, "PIN").A00(new C204869q3(r72, r5, r12, str2, 0), "FB");
    }

    public void BTk(View view) {
    }
}
