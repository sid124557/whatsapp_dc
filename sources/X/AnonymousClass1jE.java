package X;

import com.whatsapp.R;
import java.util.Map;

/* renamed from: X.1jE  reason: invalid class name */
public final class AnonymousClass1jE extends C55212pz {
    public final C69263Wi A00;
    public final C29441ip A01;
    public final C54292oU A02;
    public final Map A03;

    public final void A07(AnonymousClass4DK r4, Map map, boolean z) {
        C69263Wi r1;
        int i;
        C54292oU r12 = this.A02;
        String A04 = C54292oU.A04(r12, R.string.f11nameremoved);
        if (!this.A01.A0F()) {
            A04 = C54292oU.A04(r12, R.string.f11nameremoved);
        }
        if (!z) {
            AnonymousClass21V r13 = AnonymousClass21V.A02;
            if (!(map.get(r13.key) instanceof C52632ln)) {
                map = C52632ln.A00(r13.key, A04);
            }
            r1 = this.A00;
            i = 24;
        } else {
            r1 = this.A00;
            i = 25;
        }
        C69263Wi.A07(r1, r4, map, i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass1jE(C69263Wi r1, C29441ip r2, C54292oU r3, AnonymousClass1j2 r4, Map map) {
        super(r4);
        C18260x0.A0f(r1, r3, r2, r4, map);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = map;
    }
}
