package X;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7RN  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7RN {
    public final /* synthetic */ AnonymousClass8A5 A00;

    public final Object A00() {
        Map map;
        AnonymousClass8A5 r0 = this.A00;
        Cursor query = r0.A00.query(r0.A02, AnonymousClass8A5.A08, (String) null, (String[]) null, (String) null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                map = new AnonymousClass05C(count);
            } else {
                map = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                map.put(query.getString(0), query.getString(1));
            }
            query.close();
            return map;
        } finally {
            query.close();
        }
    }

    public /* synthetic */ AnonymousClass7RN(AnonymousClass8A5 r1) {
        this.A00 = r1;
    }
}
