package X;

import java.util.Map;

/* renamed from: X.9dc  reason: invalid class name and case insensitive filesystem */
public final class C197629dc implements AnonymousClass4DR {
    public final C620733j A00;

    public /* bridge */ /* synthetic */ Object Bk2(Enum enumR, Object obj, Map map) {
        String str;
        int i;
        AnonymousClass39L r7 = (AnonymousClass39L) obj;
        AnonymousClass9KD r6 = (AnonymousClass9KD) enumR;
        boolean A1Y = AnonymousClass0x2.A1Y(r7, r6);
        int ordinal = r6.ordinal();
        if (ordinal != 0) {
            if (ordinal == A1Y) {
                i = (int) (r7.A02.A00.doubleValue() * ((double) r7.A00));
            } else if (ordinal == 2) {
                i = r7.A00;
            } else if (ordinal == 3) {
                C85204Fi r1 = r7.A01;
                AnonymousClass3H6 r12 = (AnonymousClass3H6) r1;
                str = AnonymousClass359.A02(this.A00, r12.A04, r12.A05, r7.A02.A00, false);
            } else if (ordinal == 4) {
                str = r7.A01.B3W(this.A00, r7.A02.A00);
            } else {
                throw new C73153f1();
            }
            return Integer.valueOf(i);
        }
        str = ((AnonymousClass3H6) r7.A01).A04;
        C162457s7.A0D(str);
        return str;
    }

    public C197629dc(C620733j r1) {
        this.A00 = r1;
    }

    public Class B3E() {
        return AnonymousClass9KD.class;
    }
}
