package X;

/* renamed from: X.2xg  reason: invalid class name and case insensitive filesystem */
public class C59902xg {
    public C21721Cx A00;

    public C60012xr A00() {
        C21361Bn r1 = this.A00.senderChainKey_;
        C21361Bn r0 = r1;
        if (r1 == null) {
            r1 = C21361Bn.DEFAULT_INSTANCE;
        }
        int i = r1.iteration_;
        if (r0 == null) {
            r0 = C21361Bn.DEFAULT_INSTANCE;
        }
        return new C60012xr(i, r0.seed_.A07());
    }

    public void A01(C60012xr r5) {
        C208819r r1 = (C208819r) C21361Bn.DEFAULT_INSTANCE.A0G();
        r1.A09(r5.A00);
        r1.A0A(AnonymousClass0x9.A0J(r5.A01));
        C21361Bn r3 = (C21361Bn) r1.A06();
        C130546c9 A0H = this.A00.A0H();
        C21721Cx r12 = (C21721Cx) C18320x8.A0C(A0H);
        r3.getClass();
        r12.senderChainKey_ = r3;
        r12.bitField0_ |= 2;
        this.A00 = (C21721Cx) A0H.A06();
    }

    public C59902xg(AnonymousClass3ZK r6, AnonymousClass3Z4 r7, byte[] bArr, int i, int i2) {
        C208819r r2 = (C208819r) C21361Bn.DEFAULT_INSTANCE.A0G();
        r2.A09(i2);
        r2.A0A(C172548Lq.A02(bArr, 0, bArr.length));
        C21361Bn r4 = (C21361Bn) r2.A06();
        C130546c9 A0G = C21381Bp.DEFAULT_INSTANCE.A0G();
        C172548Lq A0H = C18280x3.A0H(A0G, r6.A00());
        C21381Bp r1 = (C21381Bp) A0G.A00;
        r1.bitField0_ |= 1;
        r1.public_ = A0H;
        if (r7 instanceof AnonymousClass47r) {
            C172548Lq A0H2 = C18280x3.A0H(A0G, ((AnonymousClass2JA) r7.A00()).A00);
            C21381Bp r12 = (C21381Bp) A0G.A00;
            r12.bitField0_ |= 2;
            r12.private_ = A0H2;
        }
        C130546c9 A0K = C18300x5.A0K(C21721Cx.DEFAULT_INSTANCE);
        C21721Cx r13 = (C21721Cx) A0K.A00;
        r13.bitField0_ |= 1;
        r13.senderKeyId_ = i;
        C21721Cx r14 = (C21721Cx) C18320x8.A0C(A0K);
        r4.getClass();
        r14.senderChainKey_ = r4;
        r14.bitField0_ |= 2;
        C21721Cx r15 = (C21721Cx) C18320x8.A0C(A0K);
        C21381Bp r0 = (C21381Bp) A0G.A06();
        r0.getClass();
        r15.senderSigningKey_ = r0;
        r15.bitField0_ |= 4;
        this.A00 = (C21721Cx) A0K.A06();
    }

    public C59902xg(C21721Cx r1) {
        this.A00 = r1;
    }
}
