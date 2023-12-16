package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8zn  reason: invalid class name and case insensitive filesystem */
public class C188978zn extends AnonymousClass7Uu {
    public Object A00;
    public final int A01;

    public C188978zn(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public /* bridge */ /* synthetic */ void A00(Object obj) {
        int intValue;
        int intValue2;
        int intValue3;
        AnonymousClass84O r5 = (AnonymousClass84O) obj;
        switch (this.A01) {
            case 0:
                Integer A012 = C158977kt.A00().A0B.A01(r5);
                if (A012 != null && (intValue3 = A012.intValue()) != -1) {
                    r5.A0T(intValue3, AnonymousClass002.A0J(C159387lk.A02((List) this.A00)));
                    return;
                }
                return;
            case 1:
                Integer A013 = C158977kt.A00().A0B.A01(r5);
                if (A013 != null && (intValue2 = A013.intValue()) != -1) {
                    ArrayList A0J = AnonymousClass002.A0J(r5.A0R(intValue2));
                    A0J.addAll(0, C159387lk.A02((List) this.A00));
                    r5.A0T(intValue2, A0J);
                    return;
                }
                return;
            case 2:
                Integer A014 = C158977kt.A00().A0B.A01(r5);
                if (A014 != null && (intValue = A014.intValue()) != -1) {
                    ArrayList A0J2 = AnonymousClass002.A0J(r5.A0R(intValue));
                    A0J2.addAll(C159387lk.A02((List) this.A00));
                    r5.A0T(intValue, A0J2);
                    return;
                }
                return;
            default:
                r5.A0T(35, AnonymousClass0x2.A0T());
                return;
        }
    }
}
