package X;

import android.os.Bundle;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;

/* renamed from: X.2ZR  reason: invalid class name */
public class AnonymousClass2ZR {
    public int A00;
    public int A01;
    public final /* synthetic */ C46632bx A02;

    public void A00(UserJid userJid, Integer num, int i) {
        AnonymousClass1Y6 A002;
        AnonymousClass4FV r0;
        if (i != 1) {
            this.A01 = 4;
            C46632bx r2 = this.A02;
            boolean A0a = r2.A02.A0a(userJid);
            int i2 = R.string.f11nameremoved;
            if (A0a) {
                i2 = R.string.f11nameremoved;
            }
            this.A00 = i2;
            if (A0a && num != null) {
                int intValue = num.intValue();
                if (intValue == 3) {
                    C51342jf r3 = r2.A04;
                    A002 = AnonymousClass1Y6.A00(r3);
                    A002.A02 = C18280x3.A0S();
                    A002.A00 = false;
                    r0 = r3.A01;
                } else if (intValue == 4) {
                    C51342jf r1 = r2.A04;
                    A002 = AnonymousClass1Y6.A00(r1);
                    A002.A02 = C18290x4.A0c();
                    A002.A00 = Boolean.FALSE;
                    r0 = r1.A01;
                }
                r0.BhD(A002);
            }
        } else {
            this.A01 = 2;
            this.A00 = R.string.f11nameremoved;
        }
        C44732Xg r5 = new C44732Xg(this.A01);
        C46632bx r4 = this.A02;
        C89644eZ r32 = r4.A03;
        String string = r32.getString(this.A00);
        Bundle bundle = r5.A01;
        bundle.putCharSequence("message", string);
        AnonymousClass0x2.A0v(bundle, userJid, "user_jid");
        r5.A00 = r4.A01;
        AnonymousClass1Hf.A2B(bundle, r32, r5, R.string.f11nameremoved);
    }

    public AnonymousClass2ZR(C46632bx r1) {
        this.A02 = r1;
    }
}
