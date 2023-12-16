package X;

import android.util.Log;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.3CH  reason: invalid class name */
public class AnonymousClass3CH implements C835348u {
    public final C835348u A00;
    public final Set A01;

    public /* bridge */ /* synthetic */ Object B2m(C157967jD r5, C146787Bp r6, C151147Tp r7) {
        for (AnonymousClass3CG r2 : this.A01) {
            if (r2.A00.contains(r6.A00)) {
                return r2.B2m(r5, r6, r7);
            }
        }
        C835348u r0 = this.A00;
        if (r0 != null) {
            return r0.B2m(r5, r6, r7);
        }
        return null;
    }

    public AnonymousClass3CH(C835348u r9, Set set) {
        HashMap A0t = AnonymousClass001.A0t();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            AnonymousClass3CG r5 = (AnonymousClass3CG) it.next();
            Iterator it2 = r5.A00.iterator();
            while (it2.hasNext()) {
                String A0m = AnonymousClass001.A0m(it2);
                if (A0t.containsKey(A0m)) {
                    String A0n = C18310x6.A0n(this);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("Duplicate support for action=");
                    A0o.append(A0m);
                    A0o.append(" by ");
                    A0o.append(r5);
                    A0o.append(" and ");
                    Log.e(A0n, AnonymousClass000.A0R(A0t.get(A0m), A0o));
                }
                A0t.put(A0m, r5);
            }
        }
        this.A01 = set;
        this.A00 = r9;
    }
}
