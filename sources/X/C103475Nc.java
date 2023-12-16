package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Nc  reason: invalid class name and case insensitive filesystem */
public final class C103475Nc {
    public final C105765Wh A00;
    public final AnonymousClass590 A01;
    public final C103655Nv A02;

    public C103475Nc(C105765Wh r1, AnonymousClass590 r2, C103655Nv r3) {
        C18260x0.A0S(r1, r2);
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public final List A00(List list, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C103655Nv.A00(C86664Kz.A19(it), this.A02, A0s, false, z);
        }
        return A0s;
    }
}
