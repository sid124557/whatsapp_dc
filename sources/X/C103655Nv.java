package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;

/* renamed from: X.5Nv  reason: invalid class name and case insensitive filesystem */
public final class C103655Nv {
    public final C56972sr A00;
    public final C64773Ex A01;
    public final C55152pt A02;
    public final C104055Pl A03;

    public static void A00(C623534r r7, C103655Nv r8, AbstractCollection abstractCollection, boolean z, boolean z2) {
        AnonymousClass3ZH A07;
        String str;
        AnonymousClass3ZH A0G;
        C623534r r3 = r7;
        C162457s7.A0J(r7, 0);
        UserJid userJid = r7.A0A;
        boolean z3 = userJid instanceof C135216kJ;
        C64773Ex r0 = r8.A01;
        if (z3) {
            A07 = (AnonymousClass3ZH) r0.A04.A00.get();
        } else {
            A07 = r0.A07(userJid);
        }
        if (A07 == null || (A0G = A07.A0G()) == null) {
            str = "Could not fetch contact info based on StatusInfo.";
        } else {
            C624134x A002 = r8.A02.A00(userJid);
            if (A002 == null) {
                str = "Could not fetch last status message based on StatusInfo.";
            } else {
                abstractCollection.add(new C986452r(r3, A0G, A002, r8.A03.A00(A002.A0K), z, z2));
                return;
            }
        }
        Log.e(str);
    }

    public C103655Nv(C56972sr r1, C64773Ex r2, C55152pt r3, C104055Pl r4) {
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
