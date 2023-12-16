package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.32m  reason: invalid class name and case insensitive filesystem */
public class C618432m {
    public static final List A0B;
    public int A00 = 0;
    public int A01 = 0;
    public List A02;
    public final C28791hm A03;
    public final AnonymousClass4FM A04;
    public final C28841hr A05;
    public final AnonymousClass2HB A06;
    public final C83924Ai A07;
    public final C28801hn A08;
    public final List A09 = Collections.unmodifiableList(AnonymousClass002.A0J(A0B));
    public final AtomicInteger A0A = new AtomicInteger(Integer.MIN_VALUE);

    public static /* synthetic */ void A00(C618432m r2, int i) {
        synchronized (r2) {
            C18260x0.A0y("GoogleMigrate/setCurrentScreen = ", AnonymousClass001.A0o(), i);
            r2.A01 = i;
        }
    }

    public void A01(int i, int i2, int i3) {
        double doubleValue;
        double d = (((double) i2) * 1.0d) / ((double) i3);
        synchronized (this) {
            if (this.A02 == null) {
                List list = this.A09;
                ArrayList A0s = AnonymousClass001.A0s();
                double d2 = 0.0d;
                for (int i4 = 0; i4 < list.size(); i4++) {
                    A0s.add(Double.valueOf(d2));
                    d2 += ((Double) list.get(i4)).doubleValue();
                }
                A0s.add(Double.valueOf(d2));
                this.A02 = Collections.unmodifiableList(A0s);
            }
        }
        List list2 = this.A09;
        if (i >= list2.size()) {
            doubleValue = 1.0d;
        } else {
            double min = Math.min(Math.max(0.0d, d), 1.0d);
            doubleValue = (((Number) this.A02.get(i)).doubleValue() + (((Number) list2.get(i)).doubleValue() * min)) / ((Number) this.A02.get(list2.size())).doubleValue();
        }
        int i5 = (int) (doubleValue * 100.0d);
        if (i5 != this.A0A.getAndSet(i5)) {
            Iterator A032 = C61102zi.A03(this.A05);
            while (A032.hasNext()) {
                ((AnonymousClass4FM) A032.next()).BYz(i5);
            }
        }
    }

    public C618432m(C28791hm r3, C28841hr r4, C28801hn r5) {
        this.A05 = r4;
        this.A03 = r3;
        this.A08 = r5;
        this.A06 = new AnonymousClass2HB(this);
        this.A07 = new C67853Qx(this);
        this.A04 = new C67833Qv(this);
    }

    static {
        ArrayList A0s = AnonymousClass001.A0s();
        Double valueOf = Double.valueOf(0.5d);
        A0s.add(valueOf);
        A0s.add(valueOf);
        A0B = Collections.unmodifiableList(A0s);
    }
}
