package X;

import com.whatsapp.businessproductlist.view.fragment.BusinessProductListBaseFragment;
import com.whatsapp.jid.UserJid;

/* renamed from: X.8zt  reason: invalid class name and case insensitive filesystem */
public class C189038zt extends C50642iX {
    public Object A00;
    public final int A01;

    public C189038zt(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A00(String str) {
        C109015dw A08;
        C90254gy r0;
        int i = this.A01;
        Object obj = this.A00;
        switch (i) {
            case 0:
                C90504hW r2 = (C90504hW) obj;
                C109015dw A082 = r2.A0A.A08((UserJid) null, str);
                if (A082 != null) {
                    r2.A0H.A0T(A082);
                    return;
                }
                return;
            case 1:
                C90514ha r22 = (C90514ha) obj;
                C109015dw A083 = r22.A0T.A08(r22.A0r, str);
                if (r22.A10.equals(str)) {
                    C109015dw r02 = r22.A0V;
                    if (r02 == null || !r02.equals(A083)) {
                        r22.A00 = 0;
                        if (str.equals(r22.A10)) {
                            r22.A0V = r22.A0T.A08(r22.A0r, str);
                        }
                        r22.A74();
                        return;
                    }
                    return;
                }
                return;
            case 2:
                C90604hu r23 = (C90604hu) obj;
                A08 = r23.A0B.A08((UserJid) null, str);
                if (A08 != null) {
                    r0 = r23.A0I;
                    break;
                } else {
                    return;
                }
            default:
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) obj;
                A08 = businessProductListBaseFragment.A1J().A08((UserJid) null, str);
                if (A08 != null) {
                    r0 = businessProductListBaseFragment.A1K();
                    break;
                } else {
                    return;
                }
        }
        r0.A0R(A08);
    }

    public void A01(String str) {
        C109015dw A08;
        C90254gy r0;
        switch (this.A01) {
            case 0:
                C90504hW r2 = (C90504hW) this.A00;
                C109015dw A082 = r2.A0A.A08((UserJid) null, str);
                if (A082 != null) {
                    r2.A0H.A0T(A082);
                    return;
                }
                return;
            case 1:
                C90514ha r22 = (C90514ha) this.A00;
                if (str.equals(r22.A10)) {
                    r22.A0V = r22.A0T.A08(r22.A0r, str);
                    r22.A74();
                    return;
                }
                return;
            case 2:
                C90604hu r23 = (C90604hu) this.A00;
                A08 = r23.A0B.A08((UserJid) null, str);
                if (A08 != null) {
                    r0 = r23.A0I;
                    break;
                } else {
                    return;
                }
            default:
                C162457s7.A0J(str, 0);
                BusinessProductListBaseFragment businessProductListBaseFragment = (BusinessProductListBaseFragment) this.A00;
                A08 = businessProductListBaseFragment.A1J().A08((UserJid) null, str);
                if (A08 != null) {
                    r0 = businessProductListBaseFragment.A1K();
                    break;
                } else {
                    return;
                }
        }
        r0.A0R(A08);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        if (r5 == 404) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(java.lang.String r4, int r5) {
        /*
            r3 = this;
            int r0 = r3.A01
            int r0 = 1 - r0
            if (r0 == 0) goto L_0x000a
            super.A02(r4, r5)
        L_0x0009:
            return
        L_0x000a:
            java.lang.Object r2 = r3.A00
            X.4ha r2 = (X.C90514ha) r2
            java.lang.String r0 = r2.A10
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0009
            r0 = 406(0x196, float:5.69E-43)
            if (r5 == r0) goto L_0x001f
            r1 = 404(0x194, float:5.66E-43)
            r0 = 3
            if (r5 != r1) goto L_0x0020
        L_0x001f:
            r0 = 2
        L_0x0020:
            r2.A00 = r0
            r2.A74()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C189038zt.A02(java.lang.String, int):void");
    }
}
