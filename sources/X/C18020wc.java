package X;

/* renamed from: X.0wc  reason: invalid class name and case insensitive filesystem */
public class C18020wc implements AnonymousClass4C9 {
    public Object A00;
    public final int A01;

    public final Object B2K(Object obj, C84814Du r3) {
        switch (this.A01) {
            case 0:
                return A01(this, obj, r3);
            case 1:
                return A02(this, obj, r3);
            default:
                return A00(this, obj);
        }
    }

    public C18020wc(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static final Object A00(C18020wc r0, Object obj) {
        ((C15790rw) r0.A00).AwB(obj);
        return C59022wD.A00;
    }

    public static final Object A01(C18020wc r0, Object obj, C84814Du r2) {
        Object BlD = ((AnonymousClass4FB) r0.A00).BlD(obj, r2);
        if (BlD != C73883gE.A05()) {
            return C59022wD.A00;
        }
        return BlD;
    }

    public static final Object A02(C18020wc r0, Object obj, C84814Du r2) {
        Object B2K = ((C15920sB) r0.A00).B2K(obj, r2);
        if (B2K != C73883gE.A05()) {
            return C59022wD.A00;
        }
        return B2K;
    }
}
