package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4m3  reason: invalid class name and case insensitive filesystem */
public final class C92074m3 extends AnonymousClass54L {
    public final C56982ss A00;
    public final C66493Lq A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C92074m3(AnonymousClass5ZU r2, C89634eX r3, C620733j r4, C56982ss r5, C66493Lq r6, List list) {
        super(r2, r3, r4, list);
        C18270x1.A11(r5, 1, r6);
        this.A01 = r6;
        this.A00 = r5;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        String A0J;
        C41822Ls r0;
        List A07 = this.A01.A07();
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A07.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (!(A0R.A0H == null || (A0J = A0R.A0J()) == null || A0J.length() == 0 || (r0 = A0R.A0J) == null || r0.A00 != 0)) {
                AnonymousClass5ZU r2 = this.A00;
                C95814uZ r1 = A0R.A0H;
                C162457s7.A0K(r1, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
                r2.A0U((C28011fL) r1, 1, true);
                A0R.A0y = C86644Kx.A1Y(A0R, C95814uZ.class, this.A03);
                A0s.add(A0R);
            }
        }
        Collections.sort(A0s, new AnonymousClass682(this.A00, this.A01, this, 1));
        return A0s;
    }
}
