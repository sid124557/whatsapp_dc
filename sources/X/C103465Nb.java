package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.5Nb  reason: invalid class name and case insensitive filesystem */
public final class C103465Nb {
    public final C105765Wh A00;
    public final C103655Nv A01;
    public final String A02;

    public C103465Nb(C105765Wh r2, C103655Nv r3, String str) {
        C162457s7.A0J(str, 3);
        this.A01 = r3;
        this.A00 = r2;
        this.A02 = str;
    }

    public final List A00(List list, boolean z) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C103655Nv.A00(C86664Kz.A19(it), this.A01, A0s, false, z);
        }
        return A0s;
    }
}
