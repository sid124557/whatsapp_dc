package X;

import android.graphics.Bitmap;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5ip  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C111875ip implements C181778nJ {
    public final /* synthetic */ AnonymousClass4UA A00;
    public final /* synthetic */ UserJid A01;

    public final void BVc(Bitmap bitmap, AnonymousClass8EI r7, boolean z) {
        AnonymousClass4UA r4 = this.A00;
        UserJid userJid = this.A01;
        if (r4.A01 != null) {
            AnonymousClass4FS r2 = r4.A0d;
            r2.BkP(new C117155rT(r4, 16, bitmap));
            C117155rT.A00(r2, r4, userJid, 15);
        }
    }

    public /* synthetic */ C111875ip(AnonymousClass4UA r1, UserJid userJid) {
        this.A00 = r1;
        this.A01 = userJid;
    }
}
