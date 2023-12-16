package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.jid.UserJid;

/* renamed from: X.69U  reason: invalid class name */
public class AnonymousClass69U implements C183208pf {
    public Object A00;
    public final int A01;

    public AnonymousClass69U(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public final void BPB() {
        UserJid userJid;
        if (this.A01 != 0) {
            AnonymousClass5R5 r0 = (AnonymousClass5R5) this.A00;
            C89644eZ r4 = r0.A03;
            C95814uZ r3 = r0.A0B;
            Intent A07 = C18320x8.A07();
            C627336j.A0E(A07, r3, r4.getPackageName(), "com.whatsapp.gallery.MediaGalleryActivity");
            r4.startActivity(A07);
            return;
        }
        C111965iy r32 = (C111965iy) this.A00;
        C85244Fm r2 = r32.A02;
        Context context = r32.A06.getContext();
        C108985dt r02 = r32.A00;
        C626936e.A06(r02);
        C86604Kt.A12(context, r2, r02.A0J);
        if (r32.A09.BJ8()) {
            C94504rS r1 = new C94504rS();
            r1.A01 = C18290x4.A0a();
            r1.A00 = AnonymousClass001.A0f();
            C108985dt r03 = r32.A00;
            if (!(r03 == null || (userJid = r03.A08) == null)) {
                r1.A02 = AnonymousClass36P.A05(userJid);
            }
            r32.A08.BhD(r1);
        }
    }
}
