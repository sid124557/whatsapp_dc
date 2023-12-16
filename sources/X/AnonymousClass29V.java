package X;

import android.app.Activity;
import com.whatsapp.chatinfo.view.custom.SharePhoneNumberBottomSheet;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.29V  reason: invalid class name */
public class AnonymousClass29V implements AnonymousClass49D {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    public AnonymousClass29V(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj3;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void BrK() {
        if (this.A03 != 0) {
            C53712nX r1 = (C53712nX) this.A00;
            r1.A02.A0D(r1.A01, (AnonymousClass49C) this.A01, AnonymousClass32Y.A04((Jid) this.A02));
            return;
        }
        SharePhoneNumberBottomSheet sharePhoneNumberBottomSheet = (SharePhoneNumberBottomSheet) this.A00;
        Activity activity = (Activity) this.A01;
        C85704Hh r2 = (C85704Hh) this.A02;
        C162457s7.A0J(activity, 1);
        C56962sq r12 = sharePhoneNumberBottomSheet.A00;
        if (r12 != null) {
            UserJid A05 = AnonymousClass32Y.A05((Jid) sharePhoneNumberBottomSheet.A04.getValue());
            C626936e.A06(A05);
            C162457s7.A0D(A05);
            r12.A0D(activity, r2, A05);
            return;
        }
        throw C18270x1.A0S("blockListManager");
    }
}
