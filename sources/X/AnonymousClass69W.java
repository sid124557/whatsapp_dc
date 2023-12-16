package X;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import androidx.fragment.app.DialogFragment;
import com.whatsapp.calling.avatar.viewmodel.CallAvatarViewModel;
import com.whatsapp.registration.VerifyPhoneNumber;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.Voip;
import com.whatsapp.voipcalling.VoipActivityV2;

/* renamed from: X.69W  reason: invalid class name */
public class AnonymousClass69W implements DialogInterface.OnClickListener {
    public int A00;
    public Object A01;
    public final int A02;

    public AnonymousClass69W(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A02) {
            case 0:
                C621433s.A00(((C89864fP) this.A01).A03, this.A00);
                return;
            case 1:
                C108145cU r5 = (C108145cU) this.A01;
                int i2 = this.A00;
                C621433s.A00(r5.A0X, i2);
                SharedPreferences.Editor A03 = C18270x1.A03(r5.A1C);
                if (i2 == 3) {
                    C18270x1.A0l(A03, "live_location_is_new_user", false);
                    r5.A0S(true);
                    return;
                }
                C18270x1.A0l(A03, "nearby_location_new_user", false);
                Runnable runnable = r5.A0j;
                C626936e.A06(runnable);
                runnable.run();
                return;
            case 2:
                VerifyPhoneNumber verifyPhoneNumber = (VerifyPhoneNumber) this.A01;
                C621433s.A00(verifyPhoneNumber, this.A00);
                verifyPhoneNumber.A0d.A01(verifyPhoneNumber, "how-to-register");
                return;
            case 3:
                VerifyPhoneNumber verifyPhoneNumber2 = (VerifyPhoneNumber) this.A01;
                C621433s.A00(verifyPhoneNumber2, this.A00);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("+");
                A0o.append(verifyPhoneNumber2.A1B);
                verifyPhoneNumber2.A0i.A01(verifyPhoneNumber2, AnonymousClass000.A0V("verify-bp ", AnonymousClass000.A0X(verifyPhoneNumber2.A1E, A0o), AnonymousClass001.A0o()));
                return;
            default:
                DialogFragment dialogFragment = (DialogFragment) this.A01;
                int i3 = this.A00;
                VoipActivityV2 voipActivityV2 = (VoipActivityV2) dialogFragment.A0R();
                voipActivityV2.A0D.removeMessages(3);
                Voip.switchCamera();
                voipActivityV2.A1C.A02();
                CallAvatarViewModel callAvatarViewModel = voipActivityV2.A0n;
                if (i3 == 0) {
                    callAvatarViewModel.A0H();
                } else {
                    Log.i("voip/CallAvatarViewModel/onSwitchedToBackCamera");
                    AnonymousClass107 r3 = callAvatarViewModel.A0K;
                    Object A0v = C86634Kw.A0v(r3);
                    if (!(A0v instanceof C91144iz)) {
                        C18260x0.A1Q(AnonymousClass001.A0o(), "voip/CallAvatarViewModel/onSwitchToBackCamera Unexpected state=", A0v);
                    } else {
                        callAvatarViewModel.A08.A02(4);
                        r3.A0H(new C91104iv(C91074is.A00));
                    }
                }
                if (dialogFragment.A16()) {
                    dialogFragment.A1L();
                    return;
                }
                return;
        }
    }
}
