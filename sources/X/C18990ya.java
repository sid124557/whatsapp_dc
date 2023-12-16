package X;

import android.telephony.PhoneStateListener;
import com.whatsapp.util.Log;

/* renamed from: X.0ya  reason: invalid class name and case insensitive filesystem */
public class C18990ya extends PhoneStateListener {
    public final /* synthetic */ C113895mA A00;

    public C18990ya(C113895mA r1) {
        this.A00 = r1;
    }

    public void onCallStateChanged(int i, String str) {
        String str2;
        if (i == 0) {
            str2 = "phone/state idle";
        } else if (i == 1) {
            Log.i("phone/state ringing");
            this.A00.A04();
            return;
        } else if (i != 2) {
            C18260x0.A0w("phone/state unknown=", AnonymousClass001.A0o(), i);
            return;
        } else {
            str2 = "phone/state offhook";
        }
        Log.i(str2);
    }
}
