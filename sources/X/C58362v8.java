package X;

/* renamed from: X.2v8  reason: invalid class name and case insensitive filesystem */
public class C58362v8 {
    public AnonymousClass1DQ A00;

    public C58362v8(byte[] bArr) {
        this.A00 = (AnonymousClass1DQ) C130786cX.A05(AnonymousClass1DQ.DEFAULT_INSTANCE, bArr);
    }

    public C58362v8(C42012Ml r5, byte[] bArr, int i, long j) {
        AnonymousClass1A2 r3 = (AnonymousClass1A2) AnonymousClass1DQ.DEFAULT_INSTANCE.A0G();
        r3.A09(i);
        byte[] A002 = r5.A01.A00();
        r3.A0C(C172548Lq.A02(A002, 0, A002.length));
        byte[] bArr2 = r5.A00.A00;
        r3.A0B(C172548Lq.A02(bArr2, 0, bArr2.length));
        r3.A0D(C172548Lq.A02(bArr, 0, bArr.length));
        r3.A0A(j);
        this.A00 = (AnonymousClass1DQ) r3.A06();
    }
}
