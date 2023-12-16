package X;

import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.2Yd  reason: invalid class name and case insensitive filesystem */
public final class C44962Yd {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;

    public final void A00(C624134x r7, Integer num, int i) {
        AnonymousClass39W A0Y;
        AnonymousClass39P r0;
        List list;
        Long l;
        String str;
        if (this.A00.A0Y(C58422vE.A02, 4657) && (A0Y = AnonymousClass0x9.A0Y(r7)) != null && (r0 = A0Y.A03) != null && (list = r0.A03) != null) {
            long size = (long) list.size();
            C25081Zw r4 = new C25081Zw();
            UserJid A0o = r7.A0o();
            Long l2 = null;
            if (A0o == null || (str = A0o.user) == null) {
                l = null;
            } else {
                l = C18290x4.A0h(str);
            }
            r4.A02 = l;
            r4.A05 = r7.A14();
            r4.A03 = Long.valueOf(size);
            r4.A00 = 0;
            if (num != null) {
                l2 = C18280x3.A0U(num);
            }
            r4.A04 = l2;
            r4.A01 = Integer.valueOf(i);
            this.A01.BhD(r4);
        }
    }

    public C44962Yd(AnonymousClass1VX r1, AnonymousClass4FV r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
