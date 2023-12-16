package X;

import java.util.Map;

/* renamed from: X.2bb  reason: invalid class name and case insensitive filesystem */
public final class C46422bb {
    public final C183538qC A00;
    public final C183538qC A01;
    public final Map A02 = C18320x8.A0r();
    public final AnonymousClass66R A03 = C154517dI.A01(new C78443v1(this));
    public final AnonymousClass66R A04 = C154517dI.A01(new C78453v2(this));

    public final C53662nS A00(C85424Ge r5) {
        C53662nS r2;
        synchronized (this) {
            Map map = this.A02;
            Object obj = map.get(r5);
            if (obj == null) {
                C49852hC r1 = (C49852hC) this.A03.getValue();
                C162457s7.A0D(r1);
                AnonymousClass2Q7 r0 = (AnonymousClass2Q7) this.A04.getValue();
                C162457s7.A0D(r0);
                obj = new C53662nS(r1, r0, r5);
                map.put(r5, obj);
            }
            r2 = (C53662nS) obj;
        }
        return r2;
    }

    public C46422bb(C183538qC r2, C183538qC r3) {
        C18260x0.A0Q(r2, r3);
        this.A00 = r2;
        this.A01 = r3;
    }
}
