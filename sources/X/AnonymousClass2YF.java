package X;

/* renamed from: X.2YF  reason: invalid class name */
public class AnonymousClass2YF {
    public final C55682qk A00;
    public final AnonymousClass66R A01;

    public C624134x A00(AnonymousClass2z0 r6, int i, long j) {
        StringBuilder A0o;
        String str;
        C162457s7.A0J(r6, 0);
        AnonymousClass66R r1 = this.A01;
        try {
            return ((AnonymousClass4G5) C53662nS.A00(r1, i)).B0j(r6, j);
        } catch (C375823e e) {
            byte b = (byte) i;
            String num = Integer.toString(b);
            C162457s7.A0D(num);
            boolean A012 = C53662nS.A01(r1, i);
            C55682qk r12 = this.A00;
            if (A012) {
                r12.A09("fmessage-factory-message-type-not-supported", num, e);
                A0o = AnonymousClass001.A0o();
                A0o.append("FMessageFactorySubsystem; cannot create ");
                A0o.append(num);
                str = " (not supported)";
            } else {
                r12.A09("fmessage-factory-message-type-not-registered", num, e);
                A0o = AnonymousClass001.A0o();
                A0o.append("FMessageFactorySubsystem; cannot crete ");
                A0o.append(num);
                str = " (not registered)";
            }
            A0o.append(str);
            C18270x1.A0z(A0o);
            return new C30271mB(r6, b, j);
        }
    }

    public AnonymousClass2YF(C55682qk r2, C46422bb r3) {
        C18260x0.A0Q(r3, r2);
        this.A00 = r2;
        this.A01 = C154517dI.A01(new C78433v0(r3));
    }
}
