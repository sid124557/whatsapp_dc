package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;

/* renamed from: X.5PW  reason: invalid class name */
public class AnonymousClass5PW {
    public final /* synthetic */ AnonymousClass7MX A00;
    public final /* synthetic */ AnonymousClass5Y9 A01;

    public AnonymousClass5PW(AnonymousClass7MX r1, AnonymousClass5Y9 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public void A00(C148037Gr r7, AnonymousClass7PS r8) {
        boolean z;
        AnonymousClass7MX r3 = this.A00;
        AnonymousClass5Y9 r2 = r3.A00;
        r2.A01 = false;
        String str = r8.A06;
        if (str == null) {
            z = false;
        } else if (str.equals(r3.A02)) {
            z = true;
        } else {
            return;
        }
        C105405Uu r0 = r2.A0C;
        UserJid userJid = r3.A01;
        r0.A0C(r7, userJid, z);
        boolean z2 = r3.A03;
        if (!z2 || !r7.A01.isEmpty()) {
            r2.A04.A0G(new C132306f4(new AnonymousClass7KK(r7.A01, z2, false), userJid));
        } else {
            r2.A04.A0G(new C132296f3(userJid));
        }
    }

    public void A01(AnonymousClass7PS r8, int i) {
        AnonymousClass7MX r3 = this.A00;
        C18260x0.A0x("onFetchCollectionsFailure errorCode =", AnonymousClass001.A0o(), i);
        AnonymousClass5Y9 r5 = r3.A00;
        r5.A01 = false;
        if (i == 404) {
            Log.d("remove collection cache");
            r5.A0C.A0H(r3.A01, false);
        } else if (406 == i) {
            UserJid userJid = r3.A01;
            AnonymousClass5Y9.A00(r5, userJid);
            Log.d("remove collection cache");
            r5.A0C.A0H(userJid, false);
        } else if (421 == i) {
            AnonymousClass5Y9.A00(r5, r8.A05);
        }
        C105405Uu r4 = r5.A0C;
        UserJid userJid2 = r3.A01;
        r4.A0C(new C148037Gr(new C148047Gs(false, (String) null), AnonymousClass001.A0s()), userJid2, true);
        r5.A04.A0G(new C132296f3(userJid2));
    }
}
