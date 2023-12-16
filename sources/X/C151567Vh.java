package X;

import java.util.List;

/* renamed from: X.7Vh  reason: invalid class name and case insensitive filesystem */
public final class C151567Vh {
    public final Object A00;
    public final List A01 = AnonymousClass001.A0s();

    public void A00(Object obj, String str) {
        List list = this.A01;
        C162177rO.A02(str);
        list.add(AnonymousClass000.A0V("=", String.valueOf(obj), AnonymousClass000.A0l(str)));
    }

    public String toString() {
        StringBuilder A0Y = AnonymousClass6CA.A0Y(100);
        AnonymousClass000.A1A(this.A00, A0Y);
        A0Y.append('{');
        List list = this.A01;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            A0Y.append(AnonymousClass001.A0n(list, i));
            if (i < size - 1) {
                AnonymousClass001.A1M(A0Y);
            }
        }
        return AnonymousClass000.A0d(A0Y);
    }

    public /* synthetic */ C151567Vh(Object obj) {
        this.A00 = obj;
    }
}
