package X;

import com.whatsapp.R;
import java.util.List;

/* renamed from: X.5Ns  reason: invalid class name and case insensitive filesystem */
public final class C103625Ns {
    public final C620733j A00;
    public final AnonymousClass1VX A01;
    public final C614030o A02;
    public final C106675Zy A03;

    public final Integer A00(C624134x r5) {
        List<C58932w3> list;
        int i;
        C162457s7.A0J(r5, 0);
        if (!(r5 instanceof AnonymousClass1p5) || (list = ((AnonymousClass1p5) r5).A00.A06) == null) {
            return null;
        }
        for (C58932w3 r2 : list) {
            C614030o r1 = this.A02;
            C162457s7.A0H(r2);
            if (r1.A07(r2)) {
                i = R.string.f11nameremoved;
            } else if (r1.A09(r2)) {
                i = R.string.f11nameremoved;
            }
            return Integer.valueOf(i);
        }
        return null;
    }

    public C103625Ns(C620733j r1, AnonymousClass1VX r2, C614030o r3, C106675Zy r4) {
        C18260x0.A0c(r2, r1, r4, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A03 = r4;
        this.A02 = r3;
    }
}
