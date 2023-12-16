package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.3MH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3MH implements AnonymousClass4AC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C60922zO A01;
    public final /* synthetic */ UserJid A02;

    public final void BLI(C41572Kt r5, Short sh, String str, boolean z) {
        C60922zO r3 = this.A01;
        int i = this.A00;
        UserJid userJid = this.A02;
        r3.A03.A0E(Integer.valueOf(i), sh);
        if (!r3.A02(userJid) && C60922zO.A00(r5)) {
            r3.A01(userJid);
        }
    }

    public /* synthetic */ AnonymousClass3MH(C60922zO r1, UserJid userJid, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = userJid;
    }
}
