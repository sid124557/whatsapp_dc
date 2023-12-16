package X;

import android.os.Handler;
import android.text.TextUtils;
import com.whatsapp.util.Log;

/* renamed from: X.2cV  reason: invalid class name and case insensitive filesystem */
public class C46972cV {
    public final Handler A00 = AnonymousClass000.A0A();
    public final C56972sr A01;
    public final C66543Lv A02;
    public final C72303dV A03;
    public final C381725z A04;
    public final C66443Ll A05;
    public final C183538qC A06;

    public final void A00(AnonymousClass2z0 r9, C30581mg r10) {
        Object A0n;
        int i = r10.A00;
        String str = r9.A01;
        C95814uZ r4 = r10.A1J.A00;
        C56972sr r1 = this.A01;
        if (C627636p.A0P(r1, r10)) {
            A0n = C56972sr.A04(r1);
        } else {
            A0n = r10.A0n();
        }
        if (TextUtils.isEmpty(str) || r4 == null || A0n == null) {
            Log.w("MessageAddOnScheduledCallEditManager/onScheduledCallEditMessageAdded parentMessageId or chatJid or senderJid is empty");
        } else if (i == 1) {
            this.A00.post(new C71603cN(this, r4, A0n, str, 20));
        }
    }

    public C46972cV(C56972sr r2, C66543Lv r3, C72303dV r4, C381725z r5, C66443Ll r6, C183538qC r7) {
        this.A01 = r2;
        this.A05 = r6;
        this.A03 = r4;
        this.A02 = r3;
        this.A06 = r7;
        this.A04 = r5;
    }
}
