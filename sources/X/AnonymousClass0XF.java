package X;

import java.util.Iterator;
import java.util.Map;

/* renamed from: X.0XF  reason: invalid class name */
public final class AnonymousClass0XF {
    public static final AnonymousClass0XF A00 = new AnonymousClass0XF();

    public static final void A01(C186468vN r2, Object obj, String str) {
        C162457s7.A0J(obj, 2);
        if (obj instanceof Number) {
            r2.BKa(str, ((Number) obj).longValue());
        } else if (obj instanceof Boolean) {
            r2.BKc(str, AnonymousClass001.A1Z(obj));
        } else {
            r2.BKb(str, obj.toString());
        }
    }

    public static final void A02(Long l, String str, String str2, Map map, int i) {
        C162457s7.A0J(map, 3);
        AnonymousClass0XF r3 = A00;
        C186468vN A002 = A00(str, i);
        if (A002 != null) {
            if (l == null) {
                A002.BKj(str2);
            } else {
                A002.BKk(str2, l.longValue());
            }
            Iterator A0q = AnonymousClass000.A0q(map);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                A0w.getKey();
                A0w.getValue();
                r3.A03(A002, map);
            }
        }
    }

    public static final C186468vN A00(String str, int i) {
        if (str == null) {
            return null;
        }
        return C157537iT.A05.A00().A00((((long) Integer.parseInt(str)) & 4294967295L) | ((((long) i) << 32) & -4294967296L));
    }

    public final void A03(C186468vN r5, Map map) {
        String str;
        Iterator A0q = AnonymousClass000.A0q(map);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            Object key = A0w.getKey();
            Object value = A0w.getValue();
            if (value != null) {
                if (!(key instanceof Number) || key == null || (str = key.toString()) == null) {
                    str = key.toString();
                }
                A01(r5, value, str);
            }
        }
    }
}
