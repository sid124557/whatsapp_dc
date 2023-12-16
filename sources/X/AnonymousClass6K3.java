package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/* renamed from: X.6K3  reason: invalid class name */
public class AnonymousClass6K3 extends AnonymousClass6K4 implements C180168kb {
    public int A00;
    public int A01;
    public C153737br A02;
    public C186088uj A03;
    public boolean A04;
    public final C1672580j A05;
    public final AnonymousClass8LX A06;
    public final List A07;
    public final List A08;
    public final List A09;
    public final Map A0A;

    public final synchronized void A01(C153737br r6, boolean z) {
        super.A01(r6, z);
        this.A02 = r6;
        List<AnonymousClass8LX> list = this.A08;
        if (list.isEmpty()) {
            A04();
        } else {
            this.A03 = this.A03.Ayy(0, list.size());
            int i = 0;
            for (AnonymousClass8LX A072 : list) {
                A07(A072, i);
                i++;
            }
            if (!this.A04) {
                C153097af A042 = this.A02.A04(this);
                A042.A01(5);
                A042.A00();
                this.A04 = true;
            }
        }
    }

    public final void A04() {
        List A0J;
        this.A04 = false;
        List list = this.A09;
        if (list.isEmpty()) {
            A0J = Collections.emptyList();
        } else {
            A0J = AnonymousClass002.A0J(list);
        }
        list.clear();
        A02(new AnonymousClass6JP(this.A03, this.A07, this.A01, this.A00), (Object) null);
        if (!A0J.isEmpty()) {
            C153097af A042 = this.A02.A04(this);
            A042.A01(6);
            A042.A02(A0J);
            A042.A00();
        }
    }

    public final void BF2(int i, Object obj) {
        switch (i) {
            case 0:
                AnonymousClass7F8 r11 = (AnonymousClass7F8) obj;
                C186088uj r0 = this.A03;
                int i2 = r11.A00;
                this.A03 = r0.Ayy(i2, 1);
                A07((AnonymousClass8LX) r11.A01, i2);
                break;
            case 1:
                AnonymousClass7F8 r112 = (AnonymousClass7F8) obj;
                C186088uj r3 = this.A03;
                int i3 = r112.A00;
                Collection<AnonymousClass8LX> collection = (Collection) r112.A01;
                this.A03 = r3.Ayy(i3, collection.size());
                for (AnonymousClass8LX A072 : collection) {
                    A07(A072, i3);
                    i3++;
                }
                break;
            case 2:
                C186088uj r32 = this.A03;
                int i4 = ((AnonymousClass7F8) obj).A00;
                this.A03 = r32.Az0(i4, i4 + 1);
                A05(i4);
                break;
            case 3:
                AnonymousClass7F8 r113 = (AnonymousClass7F8) obj;
                C186088uj r1 = this.A03;
                int i5 = r113.A00;
                C186088uj Az0 = r1.Az0(i5, i5 + 1);
                this.A03 = Az0;
                int A0K = AnonymousClass001.A0K(r113.A01);
                this.A03 = Az0.Ayy(A0K, 1);
                int min = Math.min(i5, A0K);
                int max = Math.max(i5, A0K);
                List list = this.A07;
                int i6 = ((AnonymousClass8LX) list.get(min)).A02;
                int i7 = ((AnonymousClass8LX) list.get(min)).A01;
                list.add(A0K, list.remove(i5));
                while (min <= max) {
                    AnonymousClass8LX r02 = (AnonymousClass8LX) list.get(min);
                    r02.A02 = i6;
                    r02.A01 = i7;
                    AnonymousClass6K6 r12 = r02.A03;
                    i6 += r12.A01();
                    i7 += r12.A00();
                    min++;
                }
                break;
            case 4:
                int size = this.A07.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    } else {
                        A05(size);
                    }
                }
            case 5:
                A04();
                return;
            case 6:
                List list2 = (List) obj;
                if (0 < list2.size()) {
                    list2.get(0);
                    throw AnonymousClass001.A0g("dispatchEvent");
                }
                return;
            default:
                throw AnonymousClass6CA.A0O();
        }
        if (!this.A04) {
            C153097af A042 = this.A02.A04(this);
            A042.A01(5);
            A042.A00();
            this.A04 = true;
        }
    }

    public final void A05(int i) {
        AnonymousClass8LX r3 = (AnonymousClass8LX) this.A07.remove(i);
        AnonymousClass6K6 r1 = r3.A03;
        A06(i, -1, -r1.A01(), -r1.A00());
        r3.A06 = true;
        if (r3.A04.isEmpty()) {
            C148547Iu r2 = (C148547Iu) this.A02.remove(r3);
            C185778uE r12 = r2.A01;
            r12.Bix(r2.A00);
            r12.Bj9(r2.A02);
        }
    }

    public final void A06(int i, int i2, int i3, int i4) {
        this.A01 += i3;
        this.A00 += i4;
        while (true) {
            List list = this.A07;
            if (i < list.size()) {
                ((AnonymousClass8LX) list.get(i)).A00 += i2;
                ((AnonymousClass8LX) list.get(i)).A02 += i3;
                ((AnonymousClass8LX) list.get(i)).A01 += i4;
                i++;
            } else {
                return;
            }
        }
    }

    public final void A07(AnonymousClass8LX r5, int i) {
        boolean z;
        if (i > 0) {
            AnonymousClass8LX r1 = (AnonymousClass8LX) this.A07.get(i - 1);
            int i2 = r1.A02;
            AnonymousClass6K6 r2 = r1.A03;
            int A012 = i2 + r2.A01();
            r5.A00 = i;
            r5.A02 = A012;
            r5.A01 = r1.A01 + r2.A00();
            z = false;
        } else {
            z = false;
            r5.A00 = i;
            r5.A02 = 0;
            r5.A01 = 0;
        }
        r5.A05 = z;
        r5.A06 = z;
        r5.A04.clear();
        AnonymousClass6K6 r0 = r5.A03;
        A06(i, 1, r0.A01(), r0.A00());
        this.A07.add(i, r5);
        A03(r5.A08, r5);
    }

    public final C187418xB B0v(AnonymousClass7Z2 r7, AnonymousClass7ZV r8, long j) {
        int i = r7.A02;
        AnonymousClass8LX r0 = this.A06;
        r0.A01 = i;
        List list = this.A07;
        int binarySearch = Collections.binarySearch(list, r0);
        if (binarySearch >= 0) {
            while (binarySearch < AnonymousClass002.A03(list)) {
                int i2 = binarySearch + 1;
                if (((AnonymousClass8LX) list.get(i2)).A01 != i) {
                    break;
                }
                binarySearch = i2;
            }
        } else {
            binarySearch = (-binarySearch) - 2;
        }
        AnonymousClass8LX r2 = (AnonymousClass8LX) list.get(binarySearch);
        AnonymousClass81T r5 = new AnonymousClass81T(r7.A00(i - r2.A01), r2.A08, r8);
        this.A0A.put(r5, r2);
        r2.A04.add(r5);
        if (r2.A05) {
            C187418xB B0v = r5.A05.B0v(r5.A04, r5.A06, r5.A01);
            r5.A03 = B0v;
            if (r5.A02 != null) {
                B0v.BhH(r5, r5.A01);
            }
        }
        return r5;
    }

    public final void Biu(C187418xB r4) {
        AnonymousClass8LX r2 = (AnonymousClass8LX) this.A0A.remove(r4);
        AnonymousClass81T r0 = (AnonymousClass81T) r4;
        C187418xB r1 = r0.A03;
        if (r1 != null) {
            r0.A05.Biu(r1);
        }
        List list = r2.A04;
        list.remove(r4);
        if (list.isEmpty() && r2.A06) {
            C148547Iu r22 = (C148547Iu) this.A02.remove(r2);
            C185778uE r12 = r22.A01;
            r12.Bix(r22.A00);
            r12.Bj9(r22.A02);
        }
    }

    public AnonymousClass6K3(C186088uj r9, C185778uE... r10) {
        for (C185778uE r0 : r10) {
            r0.getClass();
        }
        this.A03 = r9.getLength() > 0 ? r9.Ayw() : r9;
        this.A0A = new IdentityHashMap();
        this.A08 = AnonymousClass001.A0s();
        this.A07 = AnonymousClass001.A0s();
        this.A09 = AnonymousClass001.A0s();
        this.A06 = new AnonymousClass8LX((C185778uE) null);
        this.A05 = new C1672580j();
        List<C185778uE> asList = Arrays.asList(r10);
        synchronized (this) {
            List list = this.A08;
            int size = list.size();
            for (C185778uE r02 : asList) {
                r02.getClass();
            }
            ArrayList A0I = AnonymousClass002.A0I(asList.size());
            for (C185778uE r1 : asList) {
                A0I.add(new AnonymousClass8LX(r1));
            }
            list.addAll(size, A0I);
            if (this.A02 != null && !asList.isEmpty()) {
                C153097af A042 = this.A02.A04(this);
                A042.A01(1);
                A042.A02(new AnonymousClass7F8(A0I, size));
                A042.A00();
            }
        }
    }

    public final void A00() {
        super.A00();
        this.A07.clear();
        this.A02 = null;
        this.A03 = this.A03.Ayw();
        this.A01 = 0;
        this.A00 = 0;
    }

    public AnonymousClass6K3() {
        this(new C1674681e(new Random(), new int[0]), new C185778uE[0]);
    }
}
