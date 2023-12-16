package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8Ef  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C170708Ef implements C181778nJ {
    public final /* synthetic */ C181778nJ A00;
    public final /* synthetic */ C152967aS A01;
    public final /* synthetic */ UserJid A02;
    public final /* synthetic */ Integer A03;

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r10, boolean z) {
        C152967aS r2 = this.A01;
        UserJid userJid = this.A02;
        Integer num = this.A03;
        C181778nJ r6 = this.A00;
        if (!z) {
            r2.A03.remove(r10);
        }
        if (!(userJid == null || num == null)) {
            AnonymousClass7SV r5 = r2.A02;
            int intValue = num.intValue();
            Number A0p = AnonymousClass0x9.A0p(num, r5.A01);
            if (A0p != null) {
                r5.A00.A02(new AnonymousClass2QO(userJid, (String) null, z, false), A0p.intValue(), intValue);
            }
        }
        r6.BVc(bitmap, r10, z);
    }

    public /* synthetic */ C170708Ef(C181778nJ r1, C152967aS r2, UserJid userJid, Integer num) {
        this.A01 = r2;
        this.A02 = userJid;
        this.A03 = num;
        this.A00 = r1;
    }
}
