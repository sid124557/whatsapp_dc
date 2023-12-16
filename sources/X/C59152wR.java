package X;

/* renamed from: X.2wR  reason: invalid class name and case insensitive filesystem */
public class C59152wR {
    public AnonymousClass1CY A00;

    public void A00(AnonymousClass35L r8) {
        byte[][] bArr = r8.A01;
        int i = r8.A00;
        int length = bArr.length;
        int[] A002 = AnonymousClass2AX.A00(i, length);
        C207919i r3 = (C207919i) this.A00.A0H();
        ((AnonymousClass1CY) C18320x8.A0C(r3)).senderChainKeys_ = C130236bd.A02;
        for (int i2 = 0; i2 < length; i2++) {
            C208819r r1 = (C208819r) C21361Bn.DEFAULT_INSTANCE.A0G();
            r1.A09(A002[i2]);
            r1.A0A(AnonymousClass0x9.A0J(bArr[i2]));
            r3.A09((C21361Bn) r1.A06());
        }
        this.A00 = (AnonymousClass1CY) r3.A06();
    }

    public C59152wR(AnonymousClass3ZK r9, AnonymousClass3Z4 r10, byte[][] bArr, int i, int i2) {
        C130546c9 A0G = C21381Bp.DEFAULT_INSTANCE.A0G();
        byte[] A002 = r9.A00();
        C172548Lq A0J = C18300x5.A0J(A0G, A002, A002.length);
        C21381Bp r1 = (C21381Bp) A0G.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A0J;
        if (r10 instanceof AnonymousClass47r) {
            C172548Lq A0H = C18280x3.A0H(A0G, ((AnonymousClass2JA) r10.A00()).A00);
            C21381Bp r12 = (C21381Bp) A0G.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A0H;
        }
        C207919i r7 = (C207919i) AnonymousClass1CY.DEFAULT_INSTANCE.A0G();
        AnonymousClass1CY r13 = (AnonymousClass1CY) C18320x8.A0C(r7);
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        AnonymousClass1CY r14 = (AnonymousClass1CY) C18320x8.A0C(r7);
        C21381Bp r0 = (C21381Bp) A0G.A06();
        r0.getClass();
        r14.senderSigningKey_ = r0;
        r14.bitField0_ |= 2;
        int length = bArr.length;
        int[] A003 = AnonymousClass2AX.A00(i2, length);
        for (int i3 = 0; i3 < length; i3++) {
            C208819r r2 = (C208819r) C21361Bn.DEFAULT_INSTANCE.A0G();
            r2.A09(A003[i3]);
            byte[] bArr2 = bArr[i3];
            r2.A0A(C172548Lq.A02(bArr2, 0, bArr2.length));
            r7.A09((C21361Bn) r2.A06());
        }
        this.A00 = (AnonymousClass1CY) r7.A06();
    }

    public C59152wR(AnonymousClass1CY r1) {
        this.A00 = r1;
    }
}
