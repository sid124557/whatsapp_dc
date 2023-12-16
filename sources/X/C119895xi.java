package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.5xi  reason: invalid class name and case insensitive filesystem */
public final class C119895xi extends C829045j implements AnonymousClass4GP {
    public final /* synthetic */ AnonymousClass4rH this$0;

    public /* bridge */ /* synthetic */ Object invoke() {
        Set A06 = C73833g9.A06(AnonymousClass59L.TEXT, AnonymousClass59L.PHOTO, AnonymousClass59L.URL);
        List A01 = AnonymousClass2AB.A01(C56952sp.A08(this.this$0.A01, 6443), ",");
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = A01.iterator();
        while (it.hasNext()) {
            Integer A062 = C829745q.A06(AnonymousClass2AB.A00(AnonymousClass001.A0m(it)));
            if (A062 != null) {
                A0s.add(A062);
            }
        }
        ArrayList A0s2 = AnonymousClass001.A0s();
        Iterator it2 = A0s.iterator();
        while (it2.hasNext()) {
            int A05 = C18280x3.A05(it2);
            AnonymousClass59L[] values = AnonymousClass59L.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                AnonymousClass59L r1 = values[i];
                if (r1.type == A05) {
                    A0s2.add(r1);
                    break;
                }
                i++;
            }
        }
        Collection A0P = C73723fy.A0P(A0s2);
        C18270x1.A14(A06, A0P);
        Set A0O = C73723fy.A0O(A06);
        C162457s7.A0J(A0O, 0);
        if (!(A0P instanceof Collection)) {
            A0P = C73723fy.A0F(A0P);
        }
        A0O.retainAll(A0P);
        return A0O;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C119895xi(AnonymousClass4rH r2) {
        super(0);
        this.this$0 = r2;
    }
}
