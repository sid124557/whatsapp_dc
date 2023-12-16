package X;

/* renamed from: X.1Mq  reason: invalid class name and case insensitive filesystem */
public final class C22331Mq extends C33131sU {
    public C22331Mq(C380625j r2, AnonymousClass2MO r3, int i) {
        super(r2, r3, "gifmemorycache", i);
        A04();
    }

    public AnonymousClass2OC A0A(String str) {
        AnonymousClass2OC r2 = (AnonymousClass2OC) A06(str);
        if (r2 != null) {
            String str2 = r2.A00;
            if (!AnonymousClass002.A0B(str2).exists()) {
                A08(str);
                return null;
            } else if (r2.A02 == null && !C615631i.A02()) {
                r2.A02 = C107085af.A04(AnonymousClass002.A0B(str2));
            }
        }
        return r2;
    }
}
