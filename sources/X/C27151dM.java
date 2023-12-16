package X;

/* renamed from: X.1dM  reason: invalid class name and case insensitive filesystem */
public abstract class C27151dM extends C48642fE {
    public Object A02(C618532n r6) {
        if (this instanceof C29711ky) {
            C29711ky r2 = (C29711ky) this;
            C162457s7.A0J(r6, 0);
            int i = r6.A01;
            if (i == -20) {
                return new C29791lG(AnonymousClass001.A0e(r6.A03));
            }
            switch (i) {
                case 3847001:
                    return AnonymousClass1lP.A00;
                case 3847002:
                    return C29841lL.A00;
                case 3847003:
                    return AnonymousClass1lN.A00;
                default:
                    switch (i) {
                        case 3847006:
                            return C29831lK.A00;
                        case 3847007:
                            return AnonymousClass1lM.A00;
                        case 3847008:
                            String str = r6.A05;
                            if (str == null) {
                                str = "unknown";
                            }
                            return new C29801lH(str);
                        case 3847009:
                            boolean A01 = r2.A01.A01();
                            boolean z = false;
                            if (r2.A00.A00.A01((C84644Dd) null, "meta-avatar", false) != null) {
                                z = true;
                            }
                            return new C29821lJ(A01, z);
                        case 3847010:
                            return AnonymousClass1lO.A00;
                        default:
                            return new C29811lI(i);
                    }
            }
        } else if (this instanceof C29701kx) {
            C162457s7.A0J(r6, 0);
            int i2 = r6.A01;
            switch (i2) {
                case 3847001:
                    return C29781lF.A00;
                case 3847002:
                    return C29771lE.A00;
                default:
                    return new C29741lB(i2);
            }
        } else if (this instanceof C29691kw) {
            C162457s7.A0J(r6, 0);
            int i3 = r6.A01;
            switch (i3) {
                case 3847001:
                    return AnonymousClass1l8.A00;
                case 3847002:
                    return AnonymousClass1l6.A00;
                case 3847004:
                    return AnonymousClass1l5.A00;
                case 3847005:
                    return AnonymousClass1l4.A00;
                default:
                    return new AnonymousClass1l3(i3);
            }
        } else if (this instanceof C29681kv) {
            C162457s7.A0J(r6, 0);
            return new AnonymousClass1Mw(r6.A01);
        } else {
            C162457s7.A0J(r6, 0);
            return new AnonymousClass1Mw(r6.A01);
        }
    }
}
