package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.3L7  reason: invalid class name */
public final class AnonymousClass3L7 implements C838449z {
    public final /* synthetic */ AnonymousClass2Y9 A00;
    public final /* synthetic */ C47212ct A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    public AnonymousClass3L7(AnonymousClass2Y9 r1, C47212ct r2, UserJid userJid, String str, String str2) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = userJid;
        this.A03 = str;
        this.A04 = str2;
    }

    public void BTN() {
        C47212ct r4 = this.A01;
        boolean A002 = this.A00.A00(this.A02, this.A03, this.A04);
        if (!A002) {
            Log.d("Public key and signature are not valid");
        }
        r4.A00(A002);
    }
}
