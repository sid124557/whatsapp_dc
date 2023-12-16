package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.72p  reason: invalid class name and case insensitive filesystem */
public final class C1447072p {
    public static final List A00(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Bundle A08 = AnonymousClass002.A08();
            C129116Zg r2 = (C129116Zg) ((C1447172q) it.next());
            A08.putInt("event_type", r2.A00);
            A08.putLong("event_timestamp", r2.A01);
            A0s.add(A08);
        }
        return A0s;
    }
}
