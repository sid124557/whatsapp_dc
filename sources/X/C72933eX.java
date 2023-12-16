package X;

import java.util.ArrayList;

/* renamed from: X.3eX  reason: invalid class name and case insensitive filesystem */
public abstract class C72933eX implements C85554Gs {
    public final int A00;
    public final C85494Gl A01;
    public final C369720l A02;

    public abstract Object A00(C84814Du r1, AnonymousClass4Gm r2);

    public Object Az8(C84814Du r3, AnonymousClass4C9 r4) {
        return AnonymousClass218.A00(AnonymousClass349.A00(r3, new C74863nw((C84814Du) null, r4, this)));
    }

    public String toString() {
        ArrayList A0I = AnonymousClass002.A0I(4);
        if (this instanceof C833046x) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("channel=");
            String A0R = AnonymousClass000.A0R(((C833046x) this).A00, A0o);
            if (A0R != null) {
                A0I.add(A0R);
            }
        }
        C85494Gl r2 = this.A01;
        if (r2 != C72553du.A00) {
            A0I.add(AnonymousClass000.A0P(r2, "context=", AnonymousClass001.A0o()));
        }
        int i = this.A00;
        if (i != -3) {
            A0I.add(AnonymousClass000.A0Y("capacity=", AnonymousClass001.A0o(), i));
        }
        C369720l r22 = this.A02;
        if (r22 != C369720l.SUSPEND) {
            A0I.add(AnonymousClass000.A0P(r22, "onBufferOverflow=", AnonymousClass001.A0o()));
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o2);
        A0o2.append('[');
        A0o2.append(C73723fy.A09(", ", A0I));
        return AnonymousClass0x2.A0f(A0o2);
    }

    public AnonymousClass4FH A01(AnonymousClass4C6 r8) {
        C85494Gl r1 = this.A01;
        int i = this.A00;
        if (i == -3) {
            i = -2;
        }
        C369720l r5 = this.A02;
        return C57732u7.A01(r1, new C74813mm((C84814Du) null, this), r8, AnonymousClass20D.ATOMIC, r5, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001f, code lost:
        if (r1 >= 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass4C8 B3e(X.C85494Gl r15, X.C369720l r16, int r17) {
        /*
            r14 = this;
            r7 = r17
            r5 = r16
            X.4Gl r2 = r14.A01
            X.4Gl r3 = r15.plus(r2)
            X.20l r0 = X.C369720l.SUSPEND
            if (r5 != r0) goto L_0x0024
            int r1 = r14.A00
            r0 = -3
            if (r1 == r0) goto L_0x0022
            if (r7 == r0) goto L_0x0021
            r0 = -2
            if (r1 == r0) goto L_0x0022
            if (r7 == r0) goto L_0x0021
            int r1 = r1 + r17
            r7 = 2147483647(0x7fffffff, float:NaN)
            if (r1 < 0) goto L_0x0022
        L_0x0021:
            r7 = r1
        L_0x0022:
            X.20l r5 = r14.A02
        L_0x0024:
            boolean r0 = X.C162457s7.A0P(r3, r2)
            if (r0 == 0) goto L_0x0033
            int r0 = r14.A00
            if (r7 != r0) goto L_0x0033
            X.20l r0 = r14.A02
            if (r5 != r0) goto L_0x0033
            return r14
        L_0x0033:
            r1 = r14
            boolean r0 = r14 instanceof X.C832646t
            if (r0 == 0) goto L_0x0042
            X.46t r1 = (X.C832646t) r1
            java.lang.Iterable r0 = r1.A00
            X.46t r2 = new X.46t
            r2.<init>(r0, r3, r5, r7)
            return r2
        L_0x0042:
            boolean r0 = r14 instanceof X.C832746u
            if (r0 == 0) goto L_0x0052
            X.46u r1 = (X.C832746u) r1
            X.4GS r4 = r1.A00
            X.4C8 r6 = r1.A00
            X.46u r2 = new X.46u
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L_0x0052:
            boolean r0 = r14 instanceof X.C832846v
            if (r0 == 0) goto L_0x0060
            X.46w r1 = (X.C832946w) r1
            X.4C8 r0 = r1.A00
            X.46v r2 = new X.46v
            r2.<init>(r3, r5, r0, r7)
            return r2
        L_0x0060:
            boolean r0 = r14 instanceof X.C833046x
            if (r0 == 0) goto L_0x0074
            X.46x r1 = (X.C833046x) r1
            X.4FH r11 = r1.A00
            boolean r13 = r1.A01
            X.46x r2 = new X.46x
            r8 = r2
            r9 = r3
            r10 = r5
            r12 = r7
            r8.<init>(r9, r10, r11, r12, r13)
            return r2
        L_0x0074:
            X.46s r1 = (X.C832546s) r1
            boolean r0 = r1 instanceof X.C831946m
            if (r0 == 0) goto L_0x0084
            X.46m r1 = (X.C831946m) r1
            X.4GR r0 = r1.A00
            X.46m r2 = new X.46m
            r2.<init>(r3, r0, r5, r7)
            return r2
        L_0x0084:
            X.4GR r0 = r1.A00
            X.46s r2 = new X.46s
            r2.<init>(r3, r0, r5, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72933eX.B3e(X.4Gl, X.20l, int):X.4C8");
    }

    public C72933eX(C85494Gl r1, C369720l r2, int i) {
        this.A01 = r1;
        this.A00 = i;
        this.A02 = r2;
    }
}
