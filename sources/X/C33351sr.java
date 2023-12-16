package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.1sr  reason: invalid class name and case insensitive filesystem */
public final class C33351sr extends AnonymousClass5ZM {
    public final List A00;
    public final /* synthetic */ AnonymousClass3S3 A01;

    public C33351sr(AnonymousClass3S3 r1, List list) {
        this.A01 = r1;
        this.A00 = list;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Map map = (Map) obj;
        Iterator A0i = C18280x3.A0i(map);
        while (A0i.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(A0i);
            AnonymousClass3S3.A00(A0P, (C41662Lc) map.get(A0P), this.A01);
        }
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        byte[] bArr;
        AnonymousClass2K8 A04;
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = this.A00.iterator();
        while (it.hasNext()) {
            Jid A0S = AnonymousClass0x7.A0S(it);
            AnonymousClass3S3 r2 = this.A01;
            UserJid A03 = AnonymousClass32Y.A03(A0S);
            if (A03 == null || (A04 = r2.A02.A04(A03)) == null) {
                bArr = null;
            } else {
                bArr = A04.A01;
            }
            A0t.put(A0S, new C41662Lc(r2, bArr));
        }
        return A0t;
    }
}
