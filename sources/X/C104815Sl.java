package X;

import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.5Sl  reason: invalid class name and case insensitive filesystem */
public final class C104815Sl {
    public final C59052wG A00;
    public final C153087ae A01;
    public final Map A02 = C18320x8.A0r();
    public final Map A03 = C18320x8.A0r();
    public final AtomicInteger A04 = new AtomicInteger();

    public final int A00(int i, String str, String str2) {
        C162457s7.A0J(str2, 2);
        int andIncrement = this.A04.getAndIncrement();
        Integer valueOf = Integer.valueOf(andIncrement);
        String str3 = str;
        if (valueOf != null) {
            str3 = AnonymousClass000.A0P(valueOf, str, AnonymousClass001.A0o());
        }
        Map map = this.A03;
        AnonymousClass316 r4 = (AnonymousClass316) map.get(str3);
        if (r4 == null) {
            C47122ck r1 = new C47122ck(i);
            r4 = this.A00.A01(r1, str3);
            r1.A05 = true;
            C162457s7.A0H(r4);
            map.put(str3, r4);
        }
        r4.A06(andIncrement, str2, false);
        C161357pU A022 = this.A01.A02();
        if (A022 != null) {
            if (valueOf != null) {
                str = AnonymousClass000.A0P(valueOf, str, AnonymousClass001.A0o());
            }
            String str4 = A022.A03;
            C162457s7.A0C(str4);
            A02(valueOf, str, "country", str4);
        }
        return andIncrement;
    }

    public final void A01(Integer num, String str, String str2, long j) {
        C162457s7.A0J(str, 0);
        AnonymousClass63K r1 = new AnonymousClass63K(num, str2, j);
        Object obj = this.A03.get(str);
        if (obj != null) {
            r1.invoke(obj);
        }
    }

    public final void A02(Integer num, String str, String str2, String str3) {
        C86614Ku.A1S(str, 0, str3);
        AnonymousClass63J r1 = new AnonymousClass63J(num, str2, str3);
        Object obj = this.A03.get(str);
        if (obj != null) {
            r1.invoke(obj);
        }
    }

    public C104815Sl(C59052wG r2, C153087ae r3) {
        C18260x0.A0Q(r3, r2);
        this.A01 = r3;
        this.A00 = r2;
    }
}
