package X;

import java.util.Map;

/* renamed from: X.9dX  reason: invalid class name and case insensitive filesystem */
public class C197579dX implements AnonymousClass4DQ {
    public final /* synthetic */ AnonymousClass3XA A00;
    public final /* synthetic */ C202839mf A01;
    public final /* synthetic */ C194219Sa A02;

    public C197579dX(AnonymousClass3XA r1, C202839mf r2, C194219Sa r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BSv(C60752z6 r3, Map map) {
        this.A00.A05(Boolean.FALSE);
    }

    public void BdH(Map map) {
        AnonymousClass3XA r1;
        Boolean bool;
        AnonymousClass3XA r12;
        Boolean bool2;
        this.A02.A01.A01.A0P.remove("PaymentData");
        if (map == null) {
            C1899593h.A1Q("BrazilCardPhoenixHelper", "launchPhoenixFlow :: terminalParams is null");
            r12 = this.A00;
            bool2 = Boolean.FALSE;
        } else {
            Object obj = map.get(AnonymousClass21V.A02.key);
            if (obj instanceof C52632ln) {
                this.A01.BTe((int) ((C52632ln) obj).A00);
                r1 = this.A00;
                bool = Boolean.FALSE;
            } else if (obj instanceof Map) {
                this.A01.BTe(AnonymousClass001.A0K(((Map) obj).get(C373621y.ERROR_CODE.key)));
                r12 = this.A00;
                bool2 = Boolean.TRUE;
            } else {
                this.A01.BTe(0);
                r1 = this.A00;
                bool = Boolean.TRUE;
            }
            r1.A05(bool);
            r12 = this.A00;
            bool2 = Boolean.TRUE;
        }
        r12.A05(bool2);
    }
}
