package X;

import android.os.Handler;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.registration.ChangeNumber;

/* renamed from: X.5of  reason: invalid class name and case insensitive filesystem */
public class C115435of implements AnonymousClass4DY {
    public final /* synthetic */ ChangeNumber A00;

    public C115435of(ChangeNumber changeNumber) {
        this.A00 = changeNumber;
    }

    public void BXE(int i) {
        this.A00.A0J.sendEmptyMessage(3);
    }

    public void BXF(String str) {
        Handler handler;
        int i;
        String str2;
        ChangeNumber changeNumber = this.A00;
        PhoneUserJid A2m = AnonymousClass4SG.A2m(changeNumber);
        if (A2m == null || (str2 = A2m.user) == null || !str2.equals(str)) {
            handler = changeNumber.A0J;
            i = 2;
        } else {
            handler = changeNumber.A0J;
            i = 1;
        }
        handler.sendEmptyMessage(i);
    }
}
