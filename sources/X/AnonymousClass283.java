package X;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.283  reason: invalid class name */
public final class AnonymousClass283 {
    public static final Map A00(Uri uri) {
        C162457s7.A0J(uri, 0);
        String query = uri.getQuery();
        if (query == null) {
            return null;
        }
        List A02 = AnonymousClass2AB.A02(query, "&");
        LinkedHashMap A0C = C18330xA.A0C(C57692u3.A01(A02));
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            List A022 = AnonymousClass2AB.A02(AnonymousClass001.A0m(it), "=");
            A0C.put(A022.get(0), AnonymousClass0x9.A0u(A022));
        }
        return A0C;
    }
}
