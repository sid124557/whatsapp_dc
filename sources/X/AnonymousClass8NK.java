package X;

import java.util.Comparator;

/* renamed from: X.8NK  reason: invalid class name */
public final class AnonymousClass8NK implements Comparator {
    public /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        int i;
        C152657Zu r3 = (C152657Zu) obj;
        C152657Zu r4 = (C152657Zu) obj2;
        int i2 = 0;
        if (r3 == null) {
            i = 0;
        } else {
            i = r3.A01;
        }
        if (r4 != null) {
            i2 = r4.A01;
        }
        return i2 - i;
    }
}
