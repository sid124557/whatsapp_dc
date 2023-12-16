package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2bx  reason: invalid class name and case insensitive filesystem */
public class C46632bx {
    public AnonymousClass2ZR A00;
    public AnonymousClass2FG A01 = new AnonymousClass2FG(this);
    public final C56972sr A02;
    public final C89644eZ A03;
    public final C51342jf A04;
    public final C54072o8 A05;

    public void A00(UserJid userJid) {
        if (!this.A05.A02()) {
            C44732Xg r4 = new C44732Xg(3);
            C89644eZ r3 = this.A03;
            C56972sr r5 = this.A02;
            boolean A0a = r5.A0a(userJid);
            int i = R.string.f11nameremoved;
            if (A0a) {
                i = R.string.f11nameremoved;
            }
            String string = r3.getString(i);
            Bundle bundle = r4.A01;
            bundle.putString("title", string);
            boolean A0a2 = r5.A0a(userJid);
            int i2 = R.string.f11nameremoved;
            if (A0a2) {
                i2 = R.string.f11nameremoved;
            }
            bundle.putCharSequence("message", r3.getString(i2));
            AnonymousClass0x2.A0v(bundle, userJid, "user_jid");
            r4.A00 = this.A01;
            AnonymousClass1Hf.A2B(bundle, r3, r4, R.string.f11nameremoved);
        }
    }

    public C46632bx(AnonymousClass2CI r3, C44082Up r4, C56972sr r5, C89644eZ r6, C27991fJ r7, int i) {
        AnonymousClass2ZR r1 = new AnonymousClass2ZR(this);
        this.A00 = r1;
        this.A03 = r6;
        this.A02 = r5;
        this.A05 = r4.A00(r6, r1, r7);
        this.A04 = new C51342jf(C64333Db.A4H(r3.A00.A03), i);
    }
}
