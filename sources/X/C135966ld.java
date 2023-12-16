package X;

import java.util.Iterator;
import java.util.List;

/* renamed from: X.6ld  reason: invalid class name and case insensitive filesystem */
public class C135966ld extends C136186lz {
    public final C112315jX A00;
    public final List A01 = AnonymousClass001.A0s();

    public C135966ld(C112315jX r5, List list) {
        super(39);
        this.A00 = r5;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.A01.add(new AnonymousClass7Vr(r5, (C91824lC) it.next()));
        }
    }
}
