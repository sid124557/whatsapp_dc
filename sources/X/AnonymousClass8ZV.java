package X;

/* renamed from: X.8ZV  reason: invalid class name */
public final class AnonymousClass8ZV extends C829045j implements AnonymousClass4GR {
    public static final AnonymousClass8ZV A00 = new AnonymousClass8ZV();

    public AnonymousClass8ZV() {
        super(2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C138626qj r8 = (C138626qj) obj;
        C138626qj r9 = (C138626qj) obj2;
        boolean A1Y = AnonymousClass0x2.A1Y(r8, r9);
        long A03 = C18320x8.A03((Number) ((C138746qv) r8.A00).A04);
        long A032 = C18320x8.A03((Number) ((C138746qv) r9.A00).A04);
        if (A03 < A032) {
            return AnonymousClass0x7.A0f();
        }
        if (A03 > A032) {
            return Integer.valueOf(A1Y ? 1 : 0);
        }
        return 0;
    }
}
