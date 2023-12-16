package X;

import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Iterator;

/* renamed from: X.1hi  reason: invalid class name and case insensitive filesystem */
public final class C28751hi extends C61102zi {
    public final void A08(long j, long j2) {
        Iterator A03 = C61102zi.A03(this);
        while (A03.hasNext()) {
            AnonymousClass3DC r2 = ((AnonymousClass2EW) A03.next()).A00;
            C623334p r1 = r2.A03;
            UserJid A02 = C623334p.A02(r1, C27981fH.class, j);
            UserJid A022 = C623334p.A02(r1, PhoneUserJid.class, j2);
            String A0Z = C18280x3.A0Z(AnonymousClass0x2.A0F(r2.A01), "block_list_v2_dhash");
            C56962sq r22 = r2.A00;
            boolean A0P = r22.A0P(A02);
            boolean A0P2 = r22.A0P(A022);
            if (A022 != null && A0P && !A0P2) {
                r22.A0H(A022, A0Z);
            } else if (A02 != null && A0P2 && !A0P) {
                r22.A0H(A02, A0Z);
            }
        }
    }
}
