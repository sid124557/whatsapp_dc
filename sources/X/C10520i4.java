package X;

import java.util.List;

/* renamed from: X.0i4  reason: invalid class name and case insensitive filesystem */
public class C10520i4 implements Cloneable {
    public long A00 = 0;
    public AnonymousClass0MF A01;
    public C01820Ci A02;
    public C10540i6 A03;
    public C10540i6 A04;
    public C10540i6 A05;
    public AnonymousClass0FZ A06;
    public AnonymousClass0FZ A07;
    public C02250Fl A08;
    public C02260Fm A09;
    public C02270Fn A0A;
    public C02280Fo A0B;
    public C02290Fp A0C;
    public C02370Fx A0D;
    public C02140Fa A0E;
    public C02150Fb A0F;
    public C10510i3 A0G;
    public C10510i3 A0H;
    public C10510i3 A0I;
    public C10510i3 A0J;
    public C10510i3 A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Float A0O;
    public Float A0P;
    public Float A0Q;
    public Float A0R;
    public Float A0S;
    public Float A0T;
    public Float A0U;
    public Integer A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public List A0b;
    public C10540i6[] A0c;

    public static C10520i4 A00() {
        C10520i4 r5 = new C10520i4();
        r5.A00 = -1;
        C01820Ci r7 = C01820Ci.A01;
        r5.A0G = r7;
        AnonymousClass0FZ r6 = AnonymousClass0FZ.NonZero;
        r5.A07 = r6;
        Float valueOf = Float.valueOf(1.0f);
        r5.A0O = valueOf;
        r5.A0J = null;
        r5.A0T = valueOf;
        r5.A05 = new C10540i6(1.0f);
        r5.A09 = C02260Fm.Butt;
        r5.A0A = C02270Fn.Miter;
        r5.A0S = Float.valueOf(4.0f);
        r5.A0c = null;
        r5.A04 = new C10540i6(0.0f);
        r5.A0P = valueOf;
        r5.A02 = r7;
        r5.A0b = null;
        r5.A03 = new C10540i6(AnonymousClass0G3.pt, 12.0f);
        r5.A0V = 400;
        r5.A08 = C02250Fl.Normal;
        r5.A0D = C02370Fx.None;
        r5.A0E = C02140Fa.LTR;
        r5.A0C = C02290Fp.Start;
        Boolean bool = Boolean.TRUE;
        r5.A0M = bool;
        r5.A01 = null;
        r5.A0Z = null;
        r5.A0Y = null;
        r5.A0X = null;
        r5.A0L = bool;
        r5.A0N = bool;
        r5.A0I = r7;
        r5.A0R = valueOf;
        r5.A0W = null;
        r5.A06 = r6;
        r5.A0a = null;
        r5.A0H = null;
        r5.A0Q = valueOf;
        r5.A0K = null;
        r5.A0U = valueOf;
        r5.A0F = C02150Fb.None;
        r5.A0B = C02280Fo.auto;
        return r5;
    }

    public Object clone() {
        C10520i4 r1 = (C10520i4) super.clone();
        C10540i6[] r0 = this.A0c;
        if (r0 != null) {
            r1.A0c = (C10540i6[]) r0.clone();
        }
        return r1;
    }
}
