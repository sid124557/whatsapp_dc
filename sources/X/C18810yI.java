package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.0yI  reason: invalid class name and case insensitive filesystem */
public final class C18810yI extends Handler {
    public final AnonymousClass4FN A00;
    public final WeakReference A01;

    public void handleMessage(Message message) {
        Object obj = this.A01.get();
        if (obj == null) {
            C18260x0.A1S(AnonymousClass001.A0o(), "MatchPhoneNumberFragment was garbage collected with active messages still enqueued: ", message);
        }
        int i = message.what;
        if (i == 1) {
            Log.i("MatchPhoneNumberFragment/check-number/match");
            removeMessages(4);
            if (obj != null) {
                AnonymousClass4FN r0 = this.A00;
                r0.B1s();
                r0.BW5();
            }
        } else if (i != 2) {
            if (i == 3) {
                Log.e("MatchPhoneNumberFragment/error");
            } else if (i == 4) {
                Log.w("MatchPhoneNumberFragment/timeout");
                removeMessages(4);
            } else {
                return;
            }
            if (obj != null) {
                AnonymousClass4FN r02 = this.A00;
                r02.B1s();
                r02.BPo();
            }
        } else {
            Log.w("MatchPhoneNumberFragment/check-number/mismatch");
            removeMessages(4);
            if (obj != null) {
                AnonymousClass4FN r03 = this.A00;
                r03.B1s();
                r03.BWl();
            }
        }
    }

    public C18810yI(C89644eZ r2, AnonymousClass4FN r3) {
        super(Looper.getMainLooper());
        this.A01 = AnonymousClass0x9.A14(r2);
        this.A00 = r3;
    }
}
