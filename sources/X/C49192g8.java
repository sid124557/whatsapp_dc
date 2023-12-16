package X;

import com.whatsapp.Me;
import com.whatsapp.voipcalling.CallLinkInfo;

/* renamed from: X.2g8  reason: invalid class name and case insensitive filesystem */
public final class C49192g8 {
    public final C56972sr A00;
    public final AnonymousClass1VX A01;
    public final C51932kc A02;

    public final String A00() {
        Me A002;
        String A0w;
        if (!this.A01.A0Y(C58422vE.A02, 4501) || (A002 = C56972sr.A00(this.A00)) == null || (A0w = AnonymousClass0x9.A0w(A002)) == null) {
            return "";
        }
        return A0w;
    }

    public C49192g8(C56972sr r1, AnonymousClass1VX r2, C51932kc r3) {
        C18260x0.A0V(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }

    public final String A01() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(CallLinkInfo.DEFAULT_CALL_LINK_CALL_ID);
        A0o.append(",");
        A0o.append("weights");
        AnonymousClass1VX r2 = this.A01;
        C58422vE r1 = C58422vE.A02;
        if (r2.A0Y(r1, 4196)) {
            A0o.append(",");
            A0o.append("animated");
        }
        if (r2.A0Y(r1, 4821)) {
            A0o.append(",");
            A0o.append("smallhead");
        }
        String A08 = C56952sp.A08(r2, 6112);
        if (A08.length() > 0) {
            A0o.append(",");
            A0o.append(A08);
        }
        return C18290x4.A0o(A0o);
    }
}
