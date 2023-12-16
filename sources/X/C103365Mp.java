package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5Mp  reason: invalid class name and case insensitive filesystem */
public final class C103365Mp {
    public static volatile AnonymousClass5J0 A01;
    public static volatile boolean A02;
    public final Map A00;

    public C103365Mp(Map map) {
        C162457s7.A0J(map, 1);
        this.A00 = map;
    }

    public final AnonymousClass5J0 A01() {
        if (!A02) {
            A02 = true;
            if (A01 == null) {
                try {
                    C101685Fs r0 = (C101685Fs) AnonymousClass001.A0i(this.A00, 0);
                    if (r0 != null) {
                        A01 = r0.A00;
                    }
                } catch (Exception e) {
                    Log.e("wfs-bridge-factory", e);
                    return null;
                }
            }
        }
        return A01;
    }

    public static void A00(C183538qC r0) {
        C626936e.A06(((C103365Mp) r0.get()).A01());
    }
}
