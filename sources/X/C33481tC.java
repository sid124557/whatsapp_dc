package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1tC  reason: invalid class name and case insensitive filesystem */
public class C33481tC extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final C53592nL A01;
    public final WeakReference A02;
    public final ArrayList A03;
    public final List A04;

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        C89634eX r0 = (C89634eX) this.A02.get();
        if (r0 != null) {
            r0.A7X(list);
        }
    }

    public C33481tC(AnonymousClass5ZU r2, C89634eX r3, C53592nL r4, List list, List list2) {
        ArrayList arrayList;
        this.A00 = r2;
        this.A01 = r4;
        if (list != null) {
            arrayList = AnonymousClass002.A0J(list);
        } else {
            arrayList = null;
        }
        this.A03 = arrayList;
        this.A04 = list2;
        this.A02 = AnonymousClass0x9.A14(r3);
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = this.A04.iterator();
        while (it.hasNext()) {
            AnonymousClass3ZH A0R = C18310x6.A0R(it);
            if (this.A00.A0f(A0R, this.A03, true)) {
                A0s.add(A0R);
            }
        }
        if (A0s.isEmpty()) {
            C53592nL r3 = this.A01;
            if (r3.A04.A0Y(C58422vE.A02, 1666)) {
                r3.A05.BhD(new C23841Vc());
            }
        }
        return A0s;
    }
}
