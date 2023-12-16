package X;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.Timeline;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

/* renamed from: X.7bR  reason: invalid class name and case insensitive filesystem */
public final class C153507bR {
    public C186108ul A00 = new AnonymousClass889(new Random(), new int[0]);
    public C178288hI A01;
    public boolean A02;
    public final C177998gn A03;
    public final C156317gQ A04;
    public final C159017kx A05;
    public final HashMap A06;
    public final IdentityHashMap A07 = new IdentityHashMap();
    public final List A08 = AnonymousClass001.A0s();
    public final Map A09 = AnonymousClass001.A0t();
    public final Set A0A;

    public final void A03(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            List list = this.A08;
            C1685385u r4 = (C1685385u) list.remove(i3);
            this.A09.remove(r4.A03);
            int i4 = -r4.A02.A01.A01();
            for (int i5 = i3; i5 < list.size(); i5++) {
                ((C1685385u) list.get(i5)).A00 += i4;
            }
            r4.A01 = true;
            if (this.A02) {
                A04(r4);
            }
        }
    }

    public Timeline A00() {
        List list = this.A08;
        if (list.isEmpty()) {
            return Timeline.A00;
        }
        int i = 0;
        for (int i2 = 0; i2 < list.size(); i2++) {
            C1685385u r0 = (C1685385u) list.get(i2);
            r0.A00 = i;
            i += r0.A02.A01.A01();
        }
        return new AnonymousClass6OB(this.A00, list);
    }

    public final void A02() {
        Iterator it = this.A0A.iterator();
        while (it.hasNext()) {
            C1685385u r1 = (C1685385u) it.next();
            if (r1.A04.isEmpty()) {
                AnonymousClass7JW r0 = (AnonymousClass7JW) this.A06.get(r1);
                if (r0 != null) {
                    r0.A01.B1g(r0.A00);
                }
                it.remove();
            }
        }
    }

    public final void A04(C1685385u r4) {
        if (r4.A01 && r4.A04.isEmpty()) {
            Object remove = this.A06.remove(r4);
            remove.getClass();
            AnonymousClass7JW r2 = (AnonymousClass7JW) remove;
            C186428vI r1 = r2.A01;
            r1.Biy(r2.A00);
            r1.BjA(r2.A02);
            this.A0A.remove(r4);
        }
    }

    public final void A05(C1685385u r7) {
        AnonymousClass6PN r4 = r7.A02;
        C1690387s r3 = new C1690387s(this);
        C1690687v r5 = new C1690687v(r7, this);
        this.A06.put(r7, new AnonymousClass7JW(r3, r4, r5));
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        r4.A03.A02.add(new AnonymousClass7G4(new Handler(myLooper, (Handler.Callback) null), r5));
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        r4.A02.A02.add(new C147817Fv(new Handler(myLooper2, (Handler.Callback) null), r5));
        r4.BhQ(r3, this.A01);
    }

    public void A06(C187628xY r5) {
        IdentityHashMap identityHashMap = this.A07;
        Object remove = identityHashMap.remove(r5);
        remove.getClass();
        C1685385u r2 = (C1685385u) remove;
        r2.A02.Biv(r5);
        r2.A04.remove(((C1690187q) r5).A05);
        if (!identityHashMap.isEmpty()) {
            A02();
        }
        A04(r2);
    }

    public C153507bR(Handler handler, C177998gn r5, C1685685x r6) {
        this.A03 = r5;
        C159017kx r1 = new C159017kx();
        this.A05 = r1;
        C156317gQ r2 = new C156317gQ();
        this.A04 = r2;
        this.A06 = AnonymousClass001.A0t();
        this.A0A = AnonymousClass002.A0K();
        r1.A02.add(new AnonymousClass7G4(handler, r6));
        r2.A02.add(new C147817Fv(handler, r6));
    }

    public Timeline A01(C186108ul r7, List list, int i) {
        int i2;
        List list2;
        if (!list.isEmpty()) {
            this.A00 = r7;
            for (int i3 = i; i3 < list.size() + i; i3++) {
                C1685385u r3 = (C1685385u) list.get(i3 - i);
                if (i3 > 0) {
                    C1685385u r1 = (C1685385u) this.A08.get(i3 - 1);
                    i2 = r1.A00 + r1.A02.A01.A01();
                } else {
                    i2 = 0;
                }
                r3.A00 = i2;
                r3.A01 = false;
                r3.A04.clear();
                int A012 = r3.A02.A01.A01();
                int i4 = i3;
                while (true) {
                    list2 = this.A08;
                    if (i4 >= list2.size()) {
                        break;
                    }
                    ((C1685385u) list2.get(i4)).A00 += A012;
                    i4++;
                }
                list2.add(i3, r3);
                this.A09.put(r3.A03, r3);
                if (this.A02) {
                    A05(r3);
                    if (this.A07.isEmpty()) {
                        this.A0A.add(r3);
                    } else {
                        AnonymousClass7JW r0 = (AnonymousClass7JW) this.A06.get(r3);
                        if (r0 != null) {
                            r0.A01.B1g(r0.A00);
                        }
                    }
                }
            }
        }
        return A00();
    }
}
