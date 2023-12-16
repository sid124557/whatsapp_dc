package X;

import android.net.Uri;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.7WS  reason: invalid class name */
public class AnonymousClass7WS {
    public final Uri A00;
    public final List A01;
    public final List A02;
    @Deprecated
    public final List A03;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass7WS)) {
            return false;
        }
        AnonymousClass7WS r4 = (AnonymousClass7WS) obj;
        return this.A00.equals(r4.A00) && this.A01.equals(r4.A01) && this.A02.equals(r4.A02);
    }

    public int hashCode() {
        return ((((C18300x5.A04(this.A00) * 31 * 31 * 31) + this.A01.hashCode()) * 31 * 31) + this.A02.hashCode()) * 31;
    }

    public AnonymousClass7WS(Uri uri, List list, List list2) {
        this.A00 = uri;
        this.A01 = list;
        this.A02 = list2;
        LinkedList A18 = AnonymousClass0x9.A18();
        for (int i = 0; i < list2.size(); i++) {
            A18.add(new AnonymousClass6JU(new C149977Oq((AnonymousClass7X3) list2.get(i))));
        }
        this.A03 = AnonymousClass002.A0J(A18);
    }
}
