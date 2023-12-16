package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.0A7  reason: invalid class name */
public class AnonymousClass0A7 extends C10560i8 {
    public int A00 = 0;
    public int A01;
    public ArrayList A02 = AnonymousClass001.A0s();
    public boolean A03 = true;
    public boolean A04 = false;

    public /* bridge */ /* synthetic */ C10560i8 A0A(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((C10560i8) arrayList.get(i)).A0A(view);
                i++;
            } else {
                super.A0A(view);
                return this;
            }
        }
    }

    public void A0b(View view) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i < arrayList.size()) {
                ((C10560i8) arrayList.get(i)).A09(view);
                i++;
            } else {
                super.A09(view);
                return;
            }
        }
    }

    public static C10560i8 A00(AnonymousClass0A7 r0, int i) {
        return (C10560i8) r0.A02.get(i);
    }

    public void A0I() {
        ArrayList arrayList;
        if (this.A02.isEmpty()) {
            A0J();
            A0H();
            return;
        }
        AnonymousClass0AB r2 = new AnonymousClass0AB(this);
        Iterator it = this.A02.iterator();
        while (it.hasNext()) {
            ((C10560i8) it.next()).A0B(r2);
        }
        this.A01 = this.A02.size();
        if (!this.A03) {
            int i = 1;
            while (true) {
                arrayList = this.A02;
                if (i >= arrayList.size()) {
                    break;
                }
                ((C10560i8) arrayList.get(i - 1)).A0B(new C17670vx(arrayList.get(i), 2, this));
                i++;
            }
            C10560i8 r0 = (C10560i8) arrayList.get(0);
            if (r0 != null) {
                r0.A0I();
                return;
            }
            return;
        }
        Iterator it2 = this.A02.iterator();
        while (it2.hasNext()) {
            ((C10560i8) it2.next()).A0I();
        }
    }

    public void A0O(ViewGroup viewGroup, AnonymousClass0M8 r17, AnonymousClass0M8 r18, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.A02;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            C10560i8 A002 = A00(this, i);
            if (j > 0 && (this.A03 || i == 0)) {
                long j2 = A002.A02;
                if (j2 > 0) {
                    A002.A02 = j2 + j;
                } else {
                    A002.A02 = j;
                }
            }
            A002.A0O(viewGroup, r17, r18, arrayList, arrayList2);
        }
    }

    public void A0R(C04140My r4) {
        this.A05 = r4;
        this.A00 |= 8;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0R(r4);
        }
    }

    public void A0S(C03000Il r4) {
        this.A06 = r4;
        this.A00 |= 2;
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0S(r4);
        }
    }

    public void A0U(AnonymousClass0U7 r5) {
        View view = r5.A00;
        if (A0W(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C10560i8 r1 = (C10560i8) it.next();
                if (r1.A0W(view)) {
                    r1.A0U(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0V(AnonymousClass0U7 r5) {
        View view = r5.A00;
        if (A0W(view)) {
            Iterator it = this.A02.iterator();
            while (it.hasNext()) {
                C10560i8 r1 = (C10560i8) it.next();
                if (r1.A0W(view)) {
                    r1.A0V(r5);
                    r5.A01.add(r1);
                }
            }
        }
    }

    public void A0Z(long j) {
        ArrayList arrayList;
        this.A01 = j;
        if (j >= 0 && (arrayList = this.A02) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                A00(this, i).A07(j);
            }
        }
    }

    public void A0a(TimeInterpolator timeInterpolator) {
        this.A00 |= 1;
        ArrayList arrayList = this.A02;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                A00(this, i).A08(timeInterpolator);
            }
        }
        this.A03 = timeInterpolator;
    }

    public void A0c(C10560i8 r6) {
        this.A02.add(r6);
        r6.A07 = this;
        long j = this.A01;
        if (j >= 0) {
            r6.A07(j);
        }
        if ((this.A00 & 1) != 0) {
            r6.A08(this.A03);
        }
        if ((this.A00 & 2) != 0) {
            r6.A0S(this.A06);
        }
        if ((this.A00 & 4) != 0) {
            r6.A0Q(this.A04);
        }
        if ((this.A00 & 8) != 0) {
            r6.A0R(this.A05);
        }
    }

    public C10560i8 A06() {
        AnonymousClass0A7 r4 = (AnonymousClass0A7) super.clone();
        r4.A02 = AnonymousClass001.A0s();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            C10560i8 A06 = A00(this, i).clone();
            r4.A02.add(A06);
            A06.A07 = r4;
        }
        return r4;
    }

    public String A0F(String str) {
        String A0F = super.A0F(str);
        int i = 0;
        while (true) {
            ArrayList arrayList = this.A02;
            if (i >= arrayList.size()) {
                return A0F;
            }
            StringBuilder A0l = AnonymousClass000.A0l(A0F);
            A0l.append("\n");
            A0F = AnonymousClass000.A0X(((C10560i8) arrayList.get(i)).A0F(AnonymousClass000.A0X("  ", AnonymousClass000.A0l(str))), A0l);
            i++;
        }
    }

    public void A0G() {
        super.A0G();
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0G();
        }
    }

    public void A0K(View view) {
        super.A0K(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0K(view);
        }
    }

    public void A0L(View view) {
        super.A0L(view);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0L(view);
        }
    }

    public void A0N(ViewGroup viewGroup) {
        super.A0N(viewGroup);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0N(viewGroup);
        }
    }

    public void A0Q(C02990Ik r4) {
        super.A0Q(r4);
        this.A00 |= 4;
        if (this.A02 != null) {
            int i = 0;
            while (true) {
                ArrayList arrayList = this.A02;
                if (i < arrayList.size()) {
                    ((C10560i8) arrayList.get(i)).A0Q(r4);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void A0T(AnonymousClass0U7 r4) {
        super.A0T(r4);
        int size = this.A02.size();
        for (int i = 0; i < size; i++) {
            A00(this, i).A0T(r4);
        }
    }

    public /* bridge */ /* synthetic */ C10560i8 A07(long j) {
        A0Z(j);
        return this;
    }

    public /* bridge */ /* synthetic */ C10560i8 A08(TimeInterpolator timeInterpolator) {
        A0a(timeInterpolator);
        return this;
    }

    public /* bridge */ /* synthetic */ C10560i8 A09(View view) {
        A0b(view);
        return this;
    }

    public /* bridge */ /* synthetic */ C10560i8 A0B(C16980uL r1) {
        super.A0B(r1);
        return this;
    }

    public /* bridge */ /* synthetic */ C10560i8 A0C(C16980uL r1) {
        super.A0C(r1);
        return this;
    }
}
