package X;

import java.util.Map;

/* renamed from: X.7nZ  reason: invalid class name and case insensitive filesystem */
public final class C160397nZ {
    public final C185488tl A00;
    public final C54522or A01;
    public final String A02;

    public C160397nZ(C185488tl r2, C60482yd r3, String str) {
        C162457s7.A0J(r3, 1);
        this.A02 = str;
        this.A00 = r2;
        this.A01 = r3.A02(str);
    }

    public final void A00(AnonymousClass7O0 r6) {
        this.A01.A01(new C197999eD(r6.A04, r6.A03.name(), r6.A00));
    }

    public final void A01(AnonymousClass7O0 r24, String str, String str2, Map map, Map map2, int i, int i2, boolean z, boolean z2) {
        Map map3 = map;
        Object obj = map3.get("app_id");
        if (obj != null) {
            this.A01.A01(new C172108Jq((String) obj));
        }
        String str3 = str;
        String str4 = str2;
        Map map4 = map2;
        int i3 = i;
        AnonymousClass8XA r16 = new AnonymousClass8XA(this, str3, str4, map3, map4, i3);
        AnonymousClass7O0 r3 = r24;
        if (r3.A02 == C141586vo.MODAL) {
            if (!z) {
                C54522or r4 = this.A01;
                r4.A00(new AnonymousClass90X(r16, 5), C197889e2.class, this);
                r4.A00(new AnonymousClass90X(this, 6), C197939e7.class, this);
                this.A00.BgH(r3.A01, r3.A04, r3.A00, r3.A03.name(), str3, this.A02, str4, map3, map4, i3, i2, z2);
                r4.A01(new C172078Jn());
                return;
            }
        } else if (!z) {
            this.A00.Bg0(r3.A04, r3.A00, r3.A03.name(), str3, this.A02, str4, map3, map4, i3);
            return;
        }
        r16.invoke();
        A00(r3);
    }
}
