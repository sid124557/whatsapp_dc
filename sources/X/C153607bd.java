package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.7bd  reason: invalid class name and case insensitive filesystem */
public class C153607bd {
    public int A00 = -1;
    public int A01 = -1;
    public int A02 = -1;
    public C182828p3 A03;
    public String A04;
    public final ArrayList A05 = AnonymousClass001.A0s();
    public final HashMap A06 = AnonymousClass001.A0t();
    public final CopyOnWriteArrayList A07 = new CopyOnWriteArrayList();

    public synchronized void A01(String str) {
        C182828p3 r1 = this.A03;
        if (r1 != null) {
            r1.BKh(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A02(String str) {
        C182828p3 r1 = this.A03;
        if (r1 != null) {
            r1.BKh(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A03(String str) {
        C182828p3 r1 = this.A03;
        if (r1 != null) {
            r1.BKh(str, 123);
        }
        this.A07.add(str);
    }

    public synchronized void A04(String str) {
        this.A05.add(str);
        this.A07.add(AnonymousClass000.A0X("-success", AnonymousClass000.A0l(str)));
    }

    public synchronized void A05(String str, int i) {
        int i2;
        HashMap hashMap = this.A06;
        Integer num = (Integer) hashMap.get(str);
        if (num == null) {
            i2 = 0;
        } else {
            i2 = num.intValue();
        }
        Integer valueOf = Integer.valueOf(Integer.valueOf(i2).intValue() + 1);
        hashMap.put(str, valueOf);
        this.A00 = i;
        this.A04 = str;
        CopyOnWriteArrayList copyOnWriteArrayList = this.A07;
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("-error-");
        A0l.append(valueOf);
        copyOnWriteArrayList.add(AnonymousClass000.A0Y("-", A0l, i));
    }

    public int A00(String str) {
        return C18310x6.A06(AnonymousClass0x9.A0p(str, this.A06));
    }

    public boolean A06(String str) {
        Number A0p = AnonymousClass0x9.A0p(str, this.A06);
        if (this.A05.contains(str)) {
            return false;
        }
        if (A0p == null || A0p.intValue() < 3) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.A07.toString();
    }
}
