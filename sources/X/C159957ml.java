package X;

import java.util.EnumSet;

/* renamed from: X.7ml  reason: invalid class name and case insensitive filesystem */
public class C159957ml {
    public final C151637Vo A00;

    public static C157307i5 A00(Object obj) {
        AnonymousClass7TU r2 = new AnonymousClass7TU();
        r2.A00 = new C170598Du();
        r2.A03.addAll(EnumSet.noneOf(C141926wM.class));
        AnonymousClass7TV A002 = r2.A00();
        C160947oi.A03(obj, "json object can not be null");
        return new C157307i5(A002, obj);
    }

    public static C157307i5 A01(String str) {
        AnonymousClass7TU r2 = new AnonymousClass7TU();
        r2.A00 = new C170598Du();
        r2.A03.addAll(EnumSet.noneOf(C141926wM.class));
        AnonymousClass7TV A002 = r2.A00();
        if (str == null || str.length() == 0) {
            throw AnonymousClass001.A0c("json string can not be null or empty");
        }
        try {
            return new C157307i5(A002, new C175808Zu(-1).A0D(str, ((C170598Du) A002.A00).A00));
        } catch (C143816zW e) {
            throw new C131306dN(e);
        }
    }

    public C159957ml(String str, C181468mo[] r3) {
        this.A00 = C158347jp.A00(str, r3);
    }
}
