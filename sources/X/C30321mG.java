package X;

import java.util.List;

/* renamed from: X.1mG  reason: invalid class name and case insensitive filesystem */
public abstract class C30321mG extends C624134x {
    public boolean A00 = false;
    public boolean A01;
    public final List A02 = AnonymousClass001.A0s();

    public void A1G(int i) {
        super.A1G(6);
    }

    public AnonymousClass3ZF A1v() {
        AnonymousClass3ZF r0;
        int i;
        AnonymousClass3ZF r02;
        if (this instanceof C30691mr) {
            C30691mr r2 = (C30691mr) this;
            synchronized (r2.A1K) {
                r02 = r2.A00;
                if (r02 == null) {
                    r02 = AnonymousClass3ZF.A00(r2, 0, 2, 0, r2.A01, true);
                    r2.A00 = r02;
                }
            }
            return r02;
        }
        C30701ms r22 = (C30701ms) this;
        synchronized (r22.A1K) {
            r0 = r22.A03;
            if (r0 == null) {
                boolean z = r22.A01;
                int i2 = r22.A00;
                if (i2 <= 0) {
                    if (r22.A1J.A02) {
                        switch (r22.A01) {
                            case 1:
                                break;
                            case 2:
                            case 22:
                                i = 4;
                                break;
                            case 3:
                            case 6:
                            case 7:
                            case 15:
                            case 16:
                            case 19:
                                i = 7;
                                break;
                            case 4:
                            case 5:
                            case 9:
                            case 26:
                                break;
                            case 8:
                            case 10:
                            case 17:
                            case 25:
                                i = 3;
                                break;
                            case 11:
                            case 12:
                            case 13:
                            case 14:
                            case 18:
                                i = 1;
                                break;
                            case 21:
                                i = 6;
                                break;
                            case 24:
                                i = 8;
                                break;
                            default:
                                i = 0;
                                break;
                        }
                    }
                    i = 2;
                    r0 = AnonymousClass3ZF.A00(r22, i2, i, r22.A02, z, false);
                    r22.A03 = r0;
                }
                i = 5;
                r0 = AnonymousClass3ZF.A00(r22, i2, i, r22.A02, z, false);
                r22.A03 = r0;
            }
        }
        return r0;
    }

    public List A1w() {
        AnonymousClass3ZF A1v;
        List list = this.A02;
        if (list.isEmpty() && this.A00 && (A1v = A1v()) != null) {
            list.add(A1v);
        }
        return AnonymousClass002.A0J(list);
    }

    public void A1x(List list) {
        List list2 = this.A02;
        list2.clear();
        list2.addAll(list);
        AnonymousClass4IU.A00(list2, 35);
    }

    public C30321mG(AnonymousClass2z0 r2, byte b, long j) {
        super(r2, b, j);
        A1G(6);
    }
}
