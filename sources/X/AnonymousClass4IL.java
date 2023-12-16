package X;

import android.os.Handler;
import android.os.Message;
import com.whatsapp.R;
import com.whatsapp.profile.SetAboutInfo;

/* renamed from: X.4IL  reason: invalid class name */
public class AnonymousClass4IL implements Handler.Callback {
    public Object A00;
    public final int A01;

    public AnonymousClass4IL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final boolean handleMessage(Message message) {
        switch (this.A01) {
            case 0:
                C66523Lt.A00(message, (C66523Lt) this.A00);
                return true;
            case 1:
                SetAboutInfo setAboutInfo = (SetAboutInfo) this.A00;
                if (message.what == 1) {
                    setAboutInfo.A01.A02((String) message.obj, (String) null);
                } else {
                    setAboutInfo.A05.A0H(R.string.f11nameremoved, 0);
                }
                C621433s.A00(setAboutInfo, 2);
                return true;
            default:
                ((AnonymousClass35T) this.A00).A0C();
                return true;
        }
    }
}
