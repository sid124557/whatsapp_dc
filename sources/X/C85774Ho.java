package X;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.4Ho  reason: invalid class name and case insensitive filesystem */
public class C85774Ho implements C184018r7 {
    public Object A00;
    public Object A01;
    public final int A02;

    public C85774Ho(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj2;
        this.A01 = obj;
    }

    public /* bridge */ /* synthetic */ void BSs(Object obj, int i) {
        C49282gH r0 = (C49282gH) this.A00;
        r0.A01.A07(r0.A00, C72043d5.A00(), false);
    }

    public /* bridge */ /* synthetic */ void BdC(Object obj, Object obj2) {
        C49282gH r4;
        Map A04;
        String str;
        AnonymousClass3Z6 A022;
        switch (this.A02) {
            case 0:
                C64553Dy r15 = (C64553Dy) obj2;
                C162457s7.A0J(r15, 1);
                r4 = (C49282gH) this.A00;
                C34331uu r8 = (C34331uu) this.A01;
                boolean isEmpty = r8.A00().isEmpty();
                HashMap A0t = AnonymousClass001.A0t();
                HashMap A0t2 = AnonymousClass001.A0t();
                HashMap A0t3 = AnonymousClass001.A0t();
                for (AnonymousClass2XS r2 : r15.A01) {
                    C43072Qq r1 = r2.A00;
                    String str2 = r1.A01;
                    if (A0t2.get(str2) == null) {
                        C162457s7.A0C(str2);
                        A0t2.put(str2, r8.A00.A03(r1));
                    }
                    if (A0t3.get(str2) == null) {
                        C162457s7.A0C(str2);
                        A0t3.put(str2, AnonymousClass001.A0s());
                    }
                    HashSet A0K = AnonymousClass002.A0K();
                    for (C43072Qq r22 : r2.A01) {
                        String str3 = r22.A01;
                        if (A0t2.get(str3) == null) {
                            C162457s7.A0C(str3);
                            A0t2.put(str3, r8.A00.A03(r22));
                        }
                        A0K.add(str3);
                    }
                    AbstractCollection abstractCollection = (AbstractCollection) A0t3.get(str2);
                    if (abstractCollection != null) {
                        abstractCollection.addAll(A0K);
                    }
                }
                A0t.put("categories_map", A0t2);
                A0t.put("sub_categories", A0t3);
                if (isEmpty) {
                    HashSet A15 = AnonymousClass0x9.A15(A0t3.keySet());
                    Iterator A10 = C18290x4.A10(A0t3);
                    while (A10.hasNext()) {
                        ArrayList arrayList = (ArrayList) A10.next();
                        C162457s7.A0H(arrayList);
                        A15.removeAll(C73723fy.A0P(arrayList));
                    }
                    A0t.put("top_categories", C73723fy.A0F(A15));
                }
                A022 = AnonymousClass3Z6.A02("categories", A0t);
                break;
            case 1:
            case 2:
                C64523Dv r152 = (C64523Dv) obj2;
                C162457s7.A0J(r152, 1);
                r4 = (C49282gH) this.A00;
                A04 = ((C34341uv) this.A01).A00.A01(r152);
                str = "product_catalog";
                break;
            case 3:
                C109015dw r153 = (C109015dw) obj2;
                C162457s7.A0J(r153, 1);
                r4 = (C49282gH) this.A00;
                A04 = ((C34351uw) this.A01).A00.A04(r153);
                str = "product_detail";
                break;
            case 6:
                C64543Dx r154 = (C64543Dx) obj2;
                C162457s7.A0J(r154, 1);
                ArrayList A0s = AnonymousClass001.A0s();
                List<C109015dw> list = r154.A02;
                if (list != null) {
                    C34371uy r3 = (C34371uy) this.A01;
                    for (C109015dw r12 : list) {
                        C105985Xe r0 = r3.A00;
                        C162457s7.A0H(r12);
                        A0s.add(r0.A04(r12));
                    }
                }
                ((C49282gH) this.A00).A00(C57692u3.A04("products", A0s));
                return;
            default:
                C64533Dw r155 = (C64533Dw) obj2;
                C162457s7.A0J(r155, 1);
                r4 = (C49282gH) this.A00;
                A04 = ((C34361ux) this.A01).A00.A02(r155);
                str = "product_list";
                break;
        }
        A022 = AnonymousClass3Z6.A02(str, A04);
        C162457s7.A0J(A022, 0);
        Map singletonMap = Collections.singletonMap(A022.first, A022.second);
        C162457s7.A0D(singletonMap);
        r4.A00(singletonMap);
    }
}
