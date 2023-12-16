package X;

import java.util.List;

/* renamed from: X.0Dn  reason: invalid class name */
public class AnonymousClass0Dn extends AnonymousClass0Do {
    public final /* synthetic */ AnonymousClass0YL A00;
    public final /* synthetic */ List A01;

    public AnonymousClass0Dn(AnonymousClass0YL r1, List list) {
        this.A00 = r1;
        this.A01 = list;
    }

    public Boolean A02() {
        AnonymousClass0YL r3 = this.A00;
        boolean A0X = r3.A0W.A0X(2997);
        List list = this.A01;
        C625835r A03 = r3.A0U;
        if (!A0X) {
            list.add(A03.A0L());
        } else {
            list.addAll(A03.A0S(3));
        }
        if (C57202tG.A01(list)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public /* bridge */ /* synthetic */ Object A01(int i) {
        return A02();
    }
}
