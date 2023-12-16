package X;

/* renamed from: X.3Nk  reason: invalid class name and case insensitive filesystem */
public abstract class C66953Nk implements AnonymousClass4AG, AnonymousClass4AJ, C85364Fy {
    public void A00(AnonymousClass1A1 r3, C30441mS r4) {
        AnonymousClass2z0 r1 = r4.A1J;
        r3.A0C(C627336j.A07(r1.A00));
        r3.A0D(r1.A02);
        String str = r4.A01;
        if (str == null) {
            str = r1.A01;
        }
        r3.A0A(str);
    }

    public void AyD(C55032pg r4, C624134x r5) {
        if (r5 instanceof C30441mS) {
            C30441mS r52 = (C30441mS) r5;
            AnonymousClass1A4 r2 = r4.A00;
            C209419x A02 = AnonymousClass1A4.A02(r2);
            AnonymousClass1ET r0 = ((AnonymousClass1EM) A02.A00).key_;
            if (r0 == null) {
                r0 = AnonymousClass1ET.DEFAULT_INSTANCE;
            }
            AnonymousClass1A1 A0X = AnonymousClass0x9.A0X(r0);
            A00(A0X, r52);
            A02.A0A(A0X);
            A02.A09(AnonymousClass23O.REVOKE);
            r2.A0D(A02);
            return;
        }
        throw AnonymousClass001.A0c("FMessageRevokedProtobuf/not supported message");
    }
}
