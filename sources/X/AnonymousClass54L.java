package X;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.54L  reason: invalid class name */
public abstract class AnonymousClass54L extends AnonymousClass5ZM {
    public final AnonymousClass5ZU A00;
    public final C620733j A01;
    public final WeakReference A02;
    public final Set A03 = AnonymousClass002.A0K();

    public AnonymousClass54L(AnonymousClass5ZU r4, C89634eX r5, C620733j r6, List list) {
        super(r5, true);
        this.A02 = AnonymousClass0x9.A14(r5);
        this.A00 = r4;
        this.A01 = r6;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A03.add(AnonymousClass4L0.A0M(C18310x6.A0R(it)));
        }
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        List list = (List) obj;
        C89634eX r0 = (C89634eX) this.A02.get();
        if (r0 != null) {
            r0.A7Y(list);
        }
    }
}
