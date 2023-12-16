package X;

import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.5Ym  reason: invalid class name and case insensitive filesystem */
public class C106315Ym {
    public static final List A00;
    public static final Map A01;

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        if (r3 >= A00.size()) goto L_0x000b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass7L7 A00(int r3) {
        /*
            if (r3 < 0) goto L_0x000b
            java.util.List r0 = A00
            int r0 = r0.size()
            r2 = 1
            if (r3 < r0) goto L_0x000c
        L_0x000b:
            r2 = 0
        L_0x000c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Filter ID does not exist: "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r3)
            X.C626936e.A0E(r2, r0)
            java.util.List r0 = A00
            java.lang.Object r0 = r0.get(r3)
            X.7L7 r0 = (X.AnonymousClass7L7) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106315Ym.A00(int):X.7L7");
    }

    static {
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.add(new AnonymousClass7L7(0, R.string.f11nameremoved, (String) null));
        A0s.add(new AnonymousClass7L7(1, R.string.f11nameremoved, "filter_pop.png"));
        A0s.add(new AnonymousClass7L7(2, R.string.f11nameremoved, "filter_bw.png"));
        A0s.add(new AnonymousClass7L7(3, R.string.f11nameremoved, "filter_cool.png"));
        A0s.add(new AnonymousClass7L7(4, R.string.f11nameremoved, "filter_chrome.png"));
        A0s.add(new AnonymousClass7L7(5, R.string.f11nameremoved, "filter_film.png"));
        List<AnonymousClass7L7> unmodifiableList = Collections.unmodifiableList(A0s);
        A00 = unmodifiableList;
        HashMap A0t = AnonymousClass001.A0t();
        for (AnonymousClass7L7 r1 : unmodifiableList) {
            A0t.put(r1.A02, r1);
        }
        A01 = Collections.unmodifiableMap(A0t);
    }
}
