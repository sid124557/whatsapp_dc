package X;

import android.view.View;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8F2  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8F2 implements AnonymousClass49M {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C89654ea A01;
    public final /* synthetic */ C93314oJ A02;
    public final /* synthetic */ UserJid A03;

    public final void BeE(boolean z) {
        C93314oJ r3 = this.A02;
        C89654ea r2 = this.A01;
        UserJid userJid = this.A03;
        View view = this.A00;
        if (!z) {
            r3.A1V(view, r2, userJid);
        }
    }

    public /* synthetic */ AnonymousClass8F2(View view, C89654ea r2, C93314oJ r3, UserJid userJid) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = userJid;
        this.A00 = view;
    }
}
