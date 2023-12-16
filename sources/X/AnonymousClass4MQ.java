package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.widget.EditText;
import com.whatsapp.R;
import com.whatsapp.registration.ChangeNumber;
import com.whatsapp.util.Log;
import java.util.Objects;

/* renamed from: X.4MQ  reason: invalid class name */
public class AnonymousClass4MQ extends Handler {
    public final /* synthetic */ ChangeNumber A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4MQ(Looper looper, ChangeNumber changeNumber) {
        super(looper);
        this.A00 = changeNumber;
    }

    public void handleMessage(Message message) {
        EditText editText;
        int i = message.what;
        if (i == 1) {
            Log.w("ChangeNumber/check-number/match");
            ChangeNumber changeNumber = this.A00;
            changeNumber.A0J.removeMessages(4);
            C86624Kv.A1L(changeNumber.A04, this, 21);
            if (!Objects.equals(ChangeNumber.A0N, C97674z3.A0g)) {
                C621433s.A00(changeNumber, 1);
                C621433s.A01(changeNumber, 2);
                C102735Kb r0 = changeNumber.A0F;
                if (r0 != null) {
                    editText = r0.A02;
                } else {
                    return;
                }
            } else {
                changeNumber.A7B();
                return;
            }
        } else if (i == 2) {
            Log.w("ChangeNumber/check-number/mismatch");
            ChangeNumber changeNumber2 = this.A00;
            changeNumber2.A0J.removeMessages(4);
            C621433s.A00(changeNumber2, 1);
            changeNumber2.Bot(R.string.f11nameremoved);
            C102735Kb r02 = changeNumber2.A0F;
            if (r02 != null) {
                editText = r02.A03;
            } else {
                return;
            }
        } else if (i == 3) {
            Log.e("ChangeNumber/error");
            ChangeNumber changeNumber3 = this.A00;
            C621433s.A00(changeNumber3, 1);
            C621433s.A01(changeNumber3, 109);
            return;
        } else if (i == 4) {
            Log.e("ChangeNumber/timeout");
            ChangeNumber changeNumber4 = this.A00;
            changeNumber4.A0J.removeMessages(4);
            C621433s.A00(changeNumber4, 1);
            C621433s.A01(changeNumber4, 109);
            return;
        } else {
            return;
        }
        if (editText != null) {
            editText.requestFocus();
        }
    }
}
