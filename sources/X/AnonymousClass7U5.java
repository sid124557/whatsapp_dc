package X;

import android.content.Context;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* renamed from: X.7U5  reason: invalid class name */
public class AnonymousClass7U5 {
    public final Context A00;
    public final C620733j A01;
    public final C118305tK A02;
    public final C118305tK A03;
    public final C118305tK A04;
    public final Calendar A05;

    public AnonymousClass7U5(Context context, C620733j r6) {
        this.A00 = context;
        this.A01 = r6;
        C118305tK r1 = new C118305tK(context, r6, Calendar.getInstance(), 1);
        this.A03 = r1;
        r1.add(6, -2);
        C118305tK r12 = new C118305tK(context, r6, Calendar.getInstance(), 2);
        this.A04 = r12;
        r12.add(6, -7);
        C118305tK r13 = new C118305tK(context, r6, Calendar.getInstance(), 3);
        this.A02 = r13;
        r13.add(6, -28);
        Calendar instance = Calendar.getInstance();
        this.A05 = instance;
        instance.add(6, -366);
    }

    public C118305tK A00(long j) {
        GregorianCalendar gregorianCalendar;
        int i;
        Calendar instance = Calendar.getInstance();
        instance.setTime(new Date(j));
        C118305tK r1 = this.A03;
        if (!instance.after(r1)) {
            r1 = this.A04;
            if (!instance.after(r1)) {
                r1 = this.A02;
                if (!instance.after(r1)) {
                    boolean after = instance.after(this.A05);
                    Context context = this.A00;
                    C620733j r3 = this.A01;
                    if (after) {
                        gregorianCalendar = new GregorianCalendar(instance.get(1), instance.get(2), 1);
                        i = 4;
                    } else {
                        gregorianCalendar = new GregorianCalendar(instance.get(1), 1, 1);
                        i = 5;
                    }
                    return new C118305tK(context, r3, gregorianCalendar, i);
                }
            }
        }
        return r1;
    }
}
