package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2hE  reason: invalid class name and case insensitive filesystem */
public abstract class C49872hE {
    public String A00;
    public boolean A01;
    public boolean A02;
    public final ArrayList A03 = AnonymousClass001.A0s();
    public final List A04 = AnonymousClass001.A0s();

    public abstract boolean A01(String str);

    public final void A00(String str, Collection collection, boolean z) {
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gif/search/updating result ");
        A0o.append(str);
        if (z) {
            str2 = " failed";
        } else {
            str2 = "";
        }
        C18260x0.A1J(A0o, str2);
        C626936e.A01();
        this.A01 = z;
        if (collection != null) {
            this.A04.addAll(collection);
        }
        this.A00 = str;
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            ((AnonymousClass4AL) it.next()).BaV(this);
        }
        this.A02 = false;
    }
}
