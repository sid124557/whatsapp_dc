package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.4Hj  reason: invalid class name and case insensitive filesystem */
public class C85724Hj implements C84114Bb {
    public Object A00;
    public Object A01;
    public String A02;
    public String A03;
    public String A04;
    public final int A05;

    public C85724Hj(AnonymousClass1QO r1, UserJid userJid, String str, String str2, String str3, int i) {
        this.A05 = i;
        this.A00 = r1;
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A01 = userJid;
    }

    public final void BSV(Object obj) {
        AnonymousClass1Uc r4;
        String str;
        if (this.A05 != 0) {
            String str2 = this.A02;
            String str3 = this.A03;
            String str4 = this.A04;
            ((AnonymousClass1QO) this.A00).A0B.A0E((Jid) this.A01, str2, str3, str4, "back", (String) null);
            return;
        }
        AnonymousClass1QO r3 = (AnonymousClass1QO) this.A00;
        String str5 = this.A02;
        String str6 = this.A03;
        String str7 = this.A04;
        Jid jid = (Jid) this.A01;
        C69393Wv r12 = (C69393Wv) obj;
        C162457s7.A0J(r12, 5);
        String str8 = r12.A03;
        if (C162457s7.A0P(str8, "open_bloks_screen")) {
            AnonymousClass21K r1 = r12.A00;
            if (r1 == AnonymousClass21K.ON_COMPLETION) {
                r4 = r3.A0B;
                str = "bloks_screen_cta";
            } else if (r1 == AnonymousClass21K.ON_RESUME && !r3.A0D.A0Y(C58422vE.A02, 4510)) {
                r3.A0B.A0D(str5.hashCode(), 2);
                return;
            } else {
                return;
            }
        } else if (C162457s7.A0P(str8, "wae_action_dispatcher") && r12.A00 == AnonymousClass21K.ON_START) {
            r4 = r3.A0B;
            str = "back";
        } else {
            return;
        }
        r4.A0E(jid, str5, str6, str7, str, (String) null);
    }
}
