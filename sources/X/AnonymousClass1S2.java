package X;

import com.whatsapp.util.Log;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.1S2  reason: invalid class name */
public final class AnonymousClass1S2 extends C54242oP {
    public final C66543Lv A00;
    public final C49822h9 A01;
    public final AnonymousClass1VX A02;
    public final C66383Le A03;
    public final C47532dP A04;
    public final C54892pS A05;
    public final C55832qz A06;

    public final boolean A01(C624134x r6, C624134x r7) {
        C624134x A052;
        r6.A1Q(r7);
        if (r6.A0w() == null) {
            r6.A1R(r7.A0w());
        }
        C624134x A0w = r6.A0w();
        if (A0w == null || (A052 = this.A06.A05(A0w.A1J)) == null) {
            return false;
        }
        A0w.A1g(A052.A18);
        A0w.A1i(true);
        return true;
    }

    public Set A00() {
        if (this.A02.A0Y(C58422vE.A02, 4165)) {
            return super.A00();
        }
        Log.d("MessageOrphanBotResolver/resolveOrphanMessages/receive not enabled");
        Set emptySet = Collections.emptySet();
        C162457s7.A0D(emptySet);
        return emptySet;
    }

    public AnonymousClass1S2(C66543Lv r1, C49822h9 r2, AnonymousClass1VX r3, C66383Le r4, C47532dP r5, C54892pS r6, C55832qz r7) {
        C18260x0.A0f(r3, r7, r2, r1, r4);
        C18260x0.A0U(r5, r6);
        this.A02 = r3;
        this.A06 = r7;
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
