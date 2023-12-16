package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.5UT  reason: invalid class name */
public final class AnonymousClass5UT {
    public int A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public AnonymousClass5ZO A04;
    public Set A05 = AnonymousClass0x9.A17();
    public AnonymousClass3Z6 A06;
    public final AnonymousClass08M A07 = AnonymousClass08M.A01();
    public final C110885hC A08;
    public final AnonymousClass5MM A09;
    public final C151167Tr A0A;
    public final AnonymousClass5ZH A0B;
    public final AnonymousClass4Lw A0C;
    public final List A0D = AnonymousClass001.A0s();
    public final List A0E = AnonymousClass001.A0s();

    public AnonymousClass5UT(C110885hC r4, AnonymousClass5MM r5, C151167Tr r6) {
        C162457s7.A0J(r4, 1);
        this.A08 = r4;
        this.A0A = r6;
        this.A09 = r5;
        this.A0B = new AnonymousClass5ZH(r4);
        Context context = r4.A0P;
        Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), R.drawable.avatar_contact);
        C162457s7.A0D(decodeResource);
        this.A02 = decodeResource;
        Bitmap decodeResource2 = BitmapFactory.decodeResource(context.getResources(), R.drawable.ic_business_cat);
        C162457s7.A0D(decodeResource2);
        this.A03 = decodeResource2;
        this.A0C = new AnonymousClass4Lw(context);
        r4.A0W.add(new C1893390x(this, 0));
    }

    public final void A01() {
        this.A06 = null;
        this.A0D.clear();
        AnonymousClass5ZH r3 = this.A0B;
        AnonymousClass7PK r1 = r3.A03.A00;
        r1.A07.clear();
        r1.A04 = true;
        r1.A01 = null;
        r1.A00 = null;
        r1.A03 = null;
        r1.A02 = null;
        Map map = r3.A05;
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            ((C110815h5) A0v.next()).A05();
        }
        r3.A06.clear();
        map.clear();
        this.A0E.clear();
    }

    public final void A03(C166477yk r31) {
        C166477yk r29;
        Number A0i;
        this.A01 = 0;
        this.A00 = 0;
        C110885hC r6 = this.A08;
        C106725a3 r28 = r6.A0S;
        C108995du r8 = r28.A06().A04;
        AnonymousClass5ZH r5 = this.A0B;
        AnonymousClass5X3 r4 = r5.A03;
        C157467iL A032 = r5.A03(r8, 60);
        HashSet A0K = AnonymousClass002.A0K();
        AnonymousClass7PK r3 = r4.A00;
        r4.A00(r3, A032, A0K);
        Iterator it = A0K.iterator();
        while (true) {
            r29 = r31;
            if (!it.hasNext()) {
                break;
            }
            C109075e2 r9 = (C109075e2) ((AnonymousClass8Le) it.next()).A03;
            float f = r9.A06;
            float f2 = r29.A02;
            if (f > f2 && r9.A05 > f2) {
                Map map = r5.A05;
                C110815h5 r1 = (C110815h5) map.get(r9);
                if (r1 != null) {
                    r6.A0D(r1);
                    this.A0E.add(r1);
                    r5.A06.remove(r9);
                    map.remove(r9);
                }
                it.remove();
            }
        }
        ArrayList<AnonymousClass8Le> A0d = C86624Kv.A0d(C86654Ky.A0q(C73723fy.A0F(A0K), 27));
        for (AnonymousClass8Le r0 : A0d) {
            C180238ki r12 = r0.A03;
            C109075e2 r11 = (C109075e2) r12;
            Set set = r5.A06;
            if (set.size() < 5) {
                if (r5.A02.A02().A02 >= r11.A06) {
                    Iterator it2 = set.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            set.add(r11);
                            break;
                        }
                        C109075e2 r13 = (C109075e2) it2.next();
                        if (!r13.equals(r11)) {
                            double A022 = r5.A02(r5.A00);
                            if (AnonymousClass5ZH.A01(r5.A06(r13, A022), r5.A06(r11, A022))) {
                                break;
                            }
                        }
                    }
                } else {
                    set.remove(r11);
                }
            }
            r11.A0A = set.contains(r12);
        }
        Set<C109075e2> set2 = r5.A06;
        for (C109075e2 r02 : set2) {
            double[] A082 = r5.A08(r02.BBX());
            Context context = r5.A01;
            float A002 = r02.A00(context);
            C162457s7.A0J(context, 0);
            float f3 = r02.A07;
            if (f3 == -1.0f) {
                f3 = AnonymousClass5YI.A00(context);
                r02.A07 = f3;
            }
            float f4 = r02.A02;
            if (f4 == -1.0f) {
                f4 = (float) AnonymousClass5YI.A02(context);
                r02.A02 = f4;
            }
            float A012 = r02.A03 + r02.A00 + AnonymousClass5YI.A01(context, 3.0f);
            float A013 = AnonymousClass5YI.A01(context, 20.0f);
            float f5 = A013 / 2.0f;
            double A023 = r5.A02((f3 * 2.0f) + f5 + A002 + f4 + A013);
            double A024 = r5.A02(f5 + A012);
            double d = A082[0];
            double d2 = A082[1];
            C157467iL r18 = new C157467iL(d - A023, d2 - A024, d + A023, d2 + A024);
            HashSet A0K2 = AnonymousClass002.A0K();
            r4.A00(r3, r18, A0K2);
            C157467iL A052 = r5.A05(r02);
            Set A072 = r5.A07(r5.A04(r02), r02, A0K2);
            Set A073 = r5.A07(A052, r02, A0K2);
            int size = A072.size();
            int size2 = A073.size();
            int i = 1;
            int i2 = r02.A08;
            if (size2 == 0 || size == 0) {
                if ((i2 == -1 && size2 == 0) || (size != 0 && i2 == 1)) {
                    i = 2;
                } else if (!(i2 == -1 && size == 0) && (size2 == 0 || i2 != 2)) {
                    i = i2;
                }
            } else if (i2 == -1) {
                if (size >= size2) {
                    AnonymousClass5ZH.A00(A0d, A073);
                    r02.A08 = 2;
                } else {
                    AnonymousClass5ZH.A00(A0d, A072);
                }
            } else if (i2 == 1) {
                AnonymousClass5ZH.A00(A0d, A072);
            } else {
                AnonymousClass5ZH.A00(A0d, A073);
            }
            r02.A08 = i;
        }
        ArrayList A0c = C73783g4.A0c(A0d);
        for (AnonymousClass8Le r03 : A0d) {
            A0c.add(r03.A03);
        }
        Set A0O = C73723fy.A0O(A0c);
        this.A05 = A0O;
        AnonymousClass3Z6 r04 = this.A06;
        if (r04 != null) {
            A0O.add(r04.first);
        }
        Set set3 = this.A05;
        Iterator A0q = AnonymousClass000.A0q(r5.A05);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            if (!set3.contains(A0w.getKey())) {
                r6.A0D((C110815h5) A0w.getValue());
                List list = this.A0E;
                Object value = A0w.getValue();
                C162457s7.A0D(value);
                list.add(value);
                set2.remove(A0w.getKey());
                A0q.remove();
            }
        }
        for (C109075e2 r32 : this.A05) {
            int A003 = A00(r29, r32);
            boolean A025 = r8.A02(r32.BBX());
            if (A003 == 1) {
                if (A025) {
                    this.A01++;
                }
            } else if (A025) {
                this.A00++;
            }
        }
        AnonymousClass5ZO r14 = this.A04;
        if (r14 != null) {
            C108995du r2 = r28.A06().A04;
            C108975ds A004 = r2.A00();
            Double d3 = r14.A04;
            C626936e.A06(d3);
            C162457s7.A0D(d3);
            double doubleValue = d3.doubleValue();
            Double d4 = r14.A05;
            C626936e.A06(d4);
            C162457s7.A0D(d4);
            if (AnonymousClass5ZZ.A00(A004, C108975ds.A00(doubleValue, d4.doubleValue())) > 3000.0f || ((A0i = C86654Ky.A0i(this.A07)) != null && A0i.intValue() == 3)) {
                for (C109075e2 BBX : this.A05) {
                    if (r2.A02(BBX.BBX())) {
                        AnonymousClass08M r22 = this.A07;
                        Number A0i2 = C86654Ky.A0i(r22);
                        if (A0i2 != null && A0i2.intValue() == 3) {
                            C06270Wx.A03(r22, 0);
                            return;
                        }
                        return;
                    }
                }
                C06270Wx.A03(this.A07, 3);
            }
        }
    }

    public final void A04(AnonymousClass5ZO r7, List list) {
        C162457s7.A0J(r7, 0);
        this.A04 = r7;
        this.A0D.addAll(list);
        AnonymousClass5ZH r5 = this.A0B;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass5X3 r2 = r5.A03;
            r2.A01(new AnonymousClass8Le((C109075e2) it.next(), new AnonymousClass91S(28)), r2.A00);
        }
        C110885hC r1 = this.A08;
        A03(r1.A02());
        r1.A0R.invalidate();
    }

    public final void A05(C109075e2 r14, Integer num) {
        Object obj;
        AnonymousClass4Zh r0;
        C162457s7.A0J(r14, 0);
        AnonymousClass3Z6 r02 = this.A06;
        if (r02 != null) {
            obj = r02.first;
        } else {
            obj = null;
        }
        if (!C162457s7.A0P(obj, r14)) {
            AnonymousClass3Z6 r03 = this.A06;
            if (!(r03 == null || (r0 = (AnonymousClass4Zh) r03.second) == null)) {
                r0.A0D();
            }
            AnonymousClass5ZH r3 = this.A0B;
            Map map = r3.A05;
            if (map.get(r14) == null) {
                A00(this.A08.A02(), r14);
            }
            AnonymousClass4Zh r2 = (AnonymousClass4Zh) map.get(r14);
            if (r2 != null) {
                int i = 1;
                r2.A02.A09 = true;
                r2.A04 = true;
                Bitmap bitmap = r2.A01;
                if (bitmap == null) {
                    AnonymousClass4Lw r5 = r2.A03;
                    float A012 = AnonymousClass5YI.A01(r5.A0A, 22.0f);
                    r5.A06 = null;
                    r5.A03 = A012;
                    r5.A02 = A012 + (0.083333f * A012);
                    r5.A00();
                    r2.A0F();
                } else {
                    r2.A03.A01(bitmap);
                }
                if (r2.A00 == 2) {
                    i = 0;
                }
                float f = (float) i;
                if (r2.A02.A09) {
                    f = 2.0f;
                }
                r2.A06(f);
                r2.A02();
                this.A06 = AnonymousClass3Z6.A02(r14, r2);
                if (num != null) {
                    int intValue = num.intValue();
                    C110885hC r10 = this.A08;
                    C157467iL A032 = r3.A03(r10.A0S.A06().A04, 0);
                    double A022 = r3.A02((float) intValue);
                    double A023 = r3.A02((float) AnonymousClass5YI.A02(r10.A0P));
                    double d = A032.A00 - A032.A03;
                    double d2 = (double) 2;
                    C109055e0 r04 = r2.A02.A0B;
                    double d3 = r04.A07;
                    double d4 = r04.A08;
                    C108975ds A002 = C108975ds.A00(C106725a3.A02((C106725a3.A00(C108975ds.A00(d3, d4).A00) - (((d - A022) / d2) + (A023 / d2))) + (d / d2)), C108975ds.A00(d3, d4).A01);
                    AnonymousClass7UM r22 = new AnonymousClass7UM();
                    r22.A06 = A002;
                    r10.A0B(r22, new AnonymousClass822(), 300);
                }
            }
        }
    }

    public final int A00(C166477yk r16, C109075e2 r17) {
        C109075e2 r13 = r17;
        int i = 2;
        if (r16.A02 >= r13.A06) {
            i = 1;
        }
        if (!r13.A09) {
            Map map = this.A0B.A05;
            AnonymousClass4Zh r7 = (AnonymousClass4Zh) map.get(r13);
            if (r7 == null) {
                List list = this.A0E;
                if (C18310x6.A1X(list)) {
                    r7 = (AnonymousClass4Zh) list.remove(0);
                    r7.A02 = r13;
                    r7.A01 = null;
                    r7.A0G(3);
                    C109055e0 r5 = r7.A02.A0B;
                    r7.A00 = C106725a3.A01(r5.A08);
                    r7.A01 = C106725a3.A00(r5.A07);
                    r7.A0C();
                    C86784Lu r52 = r7.A0D;
                    r52.A0I = false;
                    r52.A0B = -1;
                    r52.A0C = -1;
                    r52.A0E = null;
                    r7.A0E();
                    String str = r13.A0B.A09.A02;
                    if (str != null) {
                        r52.A08 = Color.parseColor(str);
                    }
                    map.put(r13, r7);
                    this.A08.A0C(r7);
                } else {
                    C110885hC r10 = this.A08;
                    r7 = new AnonymousClass4Zh(this.A02, this.A03, r10, this.A09, this.A0A, r13, this.A0C);
                    map.put(r13, r7);
                    r10.A0C(r7);
                }
            }
            r7.A0G(i);
            boolean z = r13.A0A;
            C86784Lu r1 = r7.A0D;
            r1.A0I = z;
            r1.A0A = r13.A08;
            r7.A0C();
        }
        return i;
    }

    public final void A02() {
        AnonymousClass4Zh r0;
        AnonymousClass3Z6 r02 = this.A06;
        if (!(r02 == null || (r0 = (AnonymousClass4Zh) r02.second) == null)) {
            Bitmap bitmap = r0.A01;
            if (bitmap == null) {
                r0.A0F();
            } else {
                r0.A03.A01(bitmap);
            }
        }
        C110885hC r1 = this.A08;
        A03(r1.A02());
        r1.A0R.invalidate();
    }

    public final void A06(List list) {
        LinkedHashSet A17 = AnonymousClass0x9.A17();
        A17.addAll(C73723fy.A0J(C86654Ky.A0q(list, 26), 1));
        AnonymousClass5WO r4 = AnonymousClass5WO.A00;
        C110885hC r3 = this.A08;
        ArrayList A0c = C73783g4.A0c(A17);
        Iterator it = A17.iterator();
        while (it.hasNext()) {
            A0c.add(((C109075e2) it.next()).BBX());
        }
        r4.A00(r3, A0c, false);
    }
}
