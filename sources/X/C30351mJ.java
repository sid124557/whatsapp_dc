package X;

/* renamed from: X.1mJ  reason: invalid class name and case insensitive filesystem */
public class C30351mJ extends C624134x {
    public int A00;
    public int A01;
    public byte[] A02;

    public C30351mJ(AnonymousClass2z0 r2, long j) {
        super(r2, (byte) 12, j);
    }

    public static C30351mJ A00(C170198Cg r4, AnonymousClass2z0 r5, long j) {
        return new C30351mJ(r5, r4.A0F(), 2, j);
    }

    public C30351mJ(AnonymousClass2z0 r3, byte[] bArr, int i, long j) {
        this(r3, j);
        Object valueOf;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("FMessageFuture/futureproof/size=");
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        C18270x1.A17(valueOf, A0o);
        A1j(bArr);
        this.A01 = i;
    }
}
