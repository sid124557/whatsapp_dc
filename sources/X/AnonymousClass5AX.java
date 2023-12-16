package X;

import android.app.Activity;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5AX  reason: invalid class name */
public class AnonymousClass5AX implements AnonymousClass49D {
    public Object A00;
    public Object A01;
    public final int A02;

    public AnonymousClass5AX(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public final void BrK() {
        C56962sq r2;
        Activity activity;
        UserJid userJid;
        switch (this.A02) {
            case 0:
                ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A00;
                r2 = contactPickerFragment.A0k;
                activity = contactPickerFragment.A0Q();
                userJid = C86604Kt.A0d((AnonymousClass3ZH) this.A01);
                break;
            case 1:
                C93314oJ r1 = (C93314oJ) this.A00;
                r2 = r1.A0q;
                activity = C111095hX.A04(r1);
                UserJid userJid2 = ((C624134x) this.A01).A0P.A0D;
                C626936e.A06(userJid2);
                userJid = AnonymousClass32Y.A03(userJid2);
                break;
            default:
                C92574mu r0 = (C92574mu) this.A00;
                r0.A0q.A0D((Activity) this.A01, r0.A02, AnonymousClass32Y.A04(r0.A04));
                return;
        }
        r2.A0G(activity, userJid);
    }
}
