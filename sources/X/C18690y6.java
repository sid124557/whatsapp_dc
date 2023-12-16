package X;

import android.os.CountDownTimer;
import com.whatsapp.registration.RequestOtpCodeBottomSheetFragment;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.wds.components.button.WDSButton;

/* renamed from: X.0y6  reason: invalid class name and case insensitive filesystem */
public class C18690y6 extends CountDownTimer {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RequestOtpCodeBottomSheetFragment A01;
    public final /* synthetic */ VerifyPhoneNumber A02;
    public final /* synthetic */ WDSButton A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18690y6(RequestOtpCodeBottomSheetFragment requestOtpCodeBottomSheetFragment, VerifyPhoneNumber verifyPhoneNumber, WDSButton wDSButton, String str, String str2, int i, long j) {
        super(j, 1000);
        this.A01 = requestOtpCodeBottomSheetFragment;
        this.A03 = wDSButton;
        this.A02 = verifyPhoneNumber;
        this.A00 = i;
        this.A04 = str;
        this.A05 = str2;
    }

    public void onFinish() {
        WDSButton wDSButton = this.A03;
        wDSButton.setEnabled(true);
        wDSButton.setText(this.A04);
        this.A01.A0E.put(this.A05, (Object) null);
    }

    public void onTick(long j) {
        WDSButton wDSButton = this.A03;
        C620733j r3 = this.A01.A04;
        wDSButton.setText(AnonymousClass36l.A09(this.A02, r3, this.A04, this.A00, j, true));
    }
}
