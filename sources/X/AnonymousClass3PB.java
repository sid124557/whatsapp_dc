package X;

/* renamed from: X.3PB  reason: invalid class name */
public abstract class AnonymousClass3PB implements AnonymousClass4G3, AnonymousClass4D3 {
    public void AyB(C52952mJ r5, AnonymousClass1A3 r6, C624134x r7) {
        C30441mS r72;
        C18270x1.A14(r7, r6);
        if (!(r7 instanceof C30441mS) || (r72 = (C30441mS) r7) == null) {
            throw AnonymousClass24A.A00(0);
        }
        AnonymousClass1A3.A00(r72.A0n(), r6);
        long A0B = C18290x4.A0B(r72.A00);
        AnonymousClass1ES A0O = C18280x3.A0O(r6);
        A0O.bitField1_ |= 32;
        A0O.revokeMessageTimestamp_ = A0B;
    }

    public final AnonymousClass21E B88() {
        return AnonymousClass21E.STUB_MESSAGE;
    }
}
