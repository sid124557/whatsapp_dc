package X;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2x0  reason: invalid class name and case insensitive filesystem */
public final class C59492x0 {
    public static final C48302eg A03 = new C48302eg(C817540y.A00);
    public final AnonymousClass31C A00;
    public final C47512dN A01;
    public final C619132t A02;

    public final void A00(C45462a3 r8, C833648c r9, List list, Set set) {
        C833748d A002;
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass3YL r1 = (AnonymousClass3YL) it.next();
            if (set.contains(r1.A0F)) {
                A0s.add(r1);
            }
        }
        if (A0s.isEmpty()) {
            A002 = null;
        } else {
            HashSet A0x = C18300x5.A0x("whatsapp_push_notification_event");
            int i = 0;
            Integer num = ((AnonymousClass3YL) A0s.get(0)).A0B;
            if (num != null) {
                i = num.intValue();
            }
            A002 = A03.A00(this.A01.A00(r9, 11231, Integer.valueOf(i), A0x), A0s);
        }
        r8.A00(A002);
    }

    public C59492x0(AnonymousClass31C r1, C47512dN r2, C619132t r3) {
        C18260x0.A0R(r1, r2);
        this.A00 = r1;
        this.A02 = r3;
        this.A01 = r2;
    }
}
