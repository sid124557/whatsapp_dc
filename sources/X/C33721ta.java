package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.1ta  reason: invalid class name and case insensitive filesystem */
public class C33721ta extends AnonymousClass5ZM {
    public final C43972Ue A00;
    public final C56932sn A01;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        C56932sn r6 = this.A01;
        List A07 = r6.A07();
        List A06 = r6.A06();
        C71843cl r3 = new C71843cl();
        ArrayList A0I = AnonymousClass002.A0I(A07.size() + A06.size());
        A0I.addAll(A07);
        A0I.addAll(A06);
        Collections.sort(A0I, r3);
        A0F(A0I);
        List A09 = r6.A09((AnonymousClass2IB) null);
        ArrayList A0J = AnonymousClass002.A0J(A07);
        A0J.addAll(A09);
        Collections.sort(A0J, r3);
        return A0J;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        C626936e.A06(list);
        this.A00.A00(list);
    }

    public C33721ta(C43972Ue r1, C56932sn r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
