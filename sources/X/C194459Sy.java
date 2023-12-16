package X;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Sy  reason: invalid class name and case insensitive filesystem */
public class C194459Sy {
    public final C620733j A00;

    public C194459Sy(C620733j r1) {
        this.A00 = r1;
    }

    public AnonymousClass9EU A00(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new AnonymousClass9EU(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), 1), instance.get(6));
    }

    public C201719kc A01(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        return new C201719kc(this.A00, new GregorianCalendar(instance.get(1), instance.get(2), instance.get(5)), instance.get(6));
    }

    public List A02(List list) {
        ArrayList A0s = AnonymousClass001.A0s();
        Iterator it = list.iterator();
        C201719kc r2 = null;
        while (it.hasNext()) {
            C201719kc A01 = A01(C1899693i.A0E(it).A05);
            if (r2 != null) {
                if (!r2.equals(A01)) {
                    A0s.add(r2);
                } else {
                    r2.count++;
                }
            }
            A01.count = 0;
            r2 = A01;
            r2.count++;
        }
        if (r2 != null) {
            A0s.add(r2);
        }
        return A0s;
    }
}
