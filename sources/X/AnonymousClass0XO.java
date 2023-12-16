package X;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.0XO  reason: invalid class name */
public class AnonymousClass0XO {
    public static final String A09 = C06240Wu.A01("WorkContinuationImpl");
    public C17140ud A00;
    public boolean A01;
    public final C02320Fs A02;
    public final C06310Xb A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public static boolean A01(AnonymousClass0XO r5, Set set) {
        List list = r5.A06;
        set.addAll(list);
        Set A002 = A00(r5);
        for (Object contains : set) {
            if (A002.contains(contains)) {
                return true;
            }
        }
        List<AnonymousClass0XO> list2 = r5.A07;
        if (list2 != null && !list2.isEmpty()) {
            for (AnonymousClass0XO A012 : list2) {
                if (A01(A012, set)) {
                    return true;
                }
            }
        }
        set.removeAll(list);
        return false;
    }

    public C17140ud A02() {
        if (!this.A01) {
            C13360n3 r1 = new C13360n3(this);
            this.A03.A06.B2t(r1);
            this.A00 = r1.A00;
        } else {
            C06240Wu.A00();
            String str = A09;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Already enqueued work ids (");
            A0o.append(TextUtils.join(", ", this.A06));
            AnonymousClass000.A1F(")", str, A0o);
        }
        return this.A00;
    }

    public AnonymousClass0XO(C02320Fs r4, C06310Xb r5, String str, List list, List list2) {
        this.A03 = r5;
        this.A04 = str;
        this.A02 = r4;
        this.A08 = list;
        this.A07 = list2;
        this.A06 = AnonymousClass000.A0p(list);
        this.A05 = AnonymousClass001.A0s();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.A05.addAll(((AnonymousClass0XO) it.next()).A05);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            String A002 = ((AnonymousClass0NS) list.get(i)).A00();
            this.A06.add(A002);
            this.A05.add(A002);
        }
    }

    public static Set A00(AnonymousClass0XO r3) {
        HashSet A0K = AnonymousClass002.A0K();
        List<AnonymousClass0XO> list = r3.A07;
        if (list != null && !list.isEmpty()) {
            for (AnonymousClass0XO r0 : list) {
                A0K.addAll(r0.A06);
            }
        }
        return A0K;
    }

    public final AnonymousClass0XO A03(C01460Ay r7) {
        List singletonList = Collections.singletonList(r7);
        if (singletonList.isEmpty()) {
            return this;
        }
        return new AnonymousClass0XO(C02320Fs.KEEP, this.A03, this.A04, singletonList, Collections.singletonList(this));
    }

    public AnonymousClass0XO() {
    }
}
