package X;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.7r0  reason: invalid class name */
public class AnonymousClass7r0 {
    public final C156947hT A00;
    public final AnonymousClass84O A01;
    public final String A02;

    public static AnonymousClass7r0 A00(C131266dJ r10, AnonymousClass84O r11) {
        Object obj;
        AnonymousClass84O r2 = r11;
        if (r10 == null || r11.A03 != 13901) {
            List list = Collections.EMPTY_LIST;
            Map map = Collections.EMPTY_MAP;
            return new AnonymousClass7r0(r2, AnonymousClass73J.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
        }
        C835248t A0L = r11.A0L(35);
        if (A0L != null) {
            try {
                obj = C154167ci.A00(C157967jD.A01, A0L, r10);
            } catch (C143296ye e) {
                C159737mN.A00(r10.A00, "BloksParseResult", "Exception executing Parse Embedded expression", e);
                obj = A01(new AnonymousClass84O(13320));
            }
            return (AnonymousClass7r0) obj;
        }
        throw AnonymousClass001.A0c("ParseResultWrapper doesn't have a parse result!");
    }

    public static AnonymousClass7r0 A01(AnonymousClass84O r10) {
        List list = Collections.EMPTY_LIST;
        Map map = Collections.EMPTY_MAP;
        return new AnonymousClass7r0(r10, AnonymousClass73J.A00(map), (String) null, list, list, list, list, (List) null, map, (Map) null);
    }

    public static AnonymousClass7r0 A02(AnonymousClass7QF r11) {
        String str = null;
        Map A03 = A03(r11.A06);
        AnonymousClass84O r1 = r11.A00;
        Objects.requireNonNull(r1);
        List list = r11.A05;
        ArrayList A0s = AnonymousClass001.A0s();
        if (list != null) {
            A0s.addAll(list);
        }
        List list2 = r11.A04;
        List list3 = r11.A07;
        if (list3 == null) {
            list3 = Collections.EMPTY_LIST;
        }
        C152047Xi r2 = r11.A02;
        if (r2 == null) {
            r2 = AnonymousClass73J.A00(Collections.EMPTY_MAP);
        }
        List list4 = r11.A08;
        if (list4 == null) {
            list4 = Collections.emptyList();
        }
        Map map = r11.A0D;
        List list5 = r11.A0C;
        C146757Bm r0 = r11.A01;
        if (r0 != null) {
            str = r0.A00;
        }
        return new AnonymousClass7r0(r1, r2, str, A0s, list2, list3, list4, list5, A03, map);
    }

    public static Map A03(List list) {
        if (list == null) {
            return Collections.EMPTY_MAP;
        }
        HashMap hashMap = new HashMap(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C156067fy r1 = (C156067fy) it.next();
            hashMap.put(r1.A01, r1);
        }
        return hashMap;
    }

    public AnonymousClass84O A05() {
        return this.A01;
    }

    public AnonymousClass7r0(C156947hT r1, AnonymousClass84O r2, String str) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = str;
    }

    public static Map A04(List list, Map map) {
        HashMap A0t = AnonymousClass001.A0t();
        HashMap hashMap = new HashMap(map);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C156057fx r2 = (C156057fx) it.next();
            if (map.containsKey(r2.A01)) {
                A0t.put(r2.A00, hashMap.remove(r2.A01));
            }
        }
        A0t.putAll(hashMap);
        return A0t;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7r0(X.AnonymousClass84O r22, X.C152047Xi r23, java.lang.String r24, java.util.List r25, java.util.List r26, java.util.List r27, java.util.List r28, java.util.List r29, java.util.Map r30, java.util.Map r31) {
        /*
            r21 = this;
            r0 = 0
            r3 = r22
            X.C162457s7.A0J(r3, r0)
            if (r26 == 0) goto L_0x00b9
            java.util.ArrayList r4 = X.C73783g4.A0c(r26)
            java.util.Iterator r10 = r26.iterator()
        L_0x0010:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00ba
            java.lang.Object r6 = r10.next()
            X.7Pf r6 = (X.C150117Pf) r6
            java.util.HashMap r1 = r6.A07
            if (r1 == 0) goto L_0x006f
            int r0 = r1.size()
            int r0 = X.AnonymousClass8UG.A0I(r0)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Set r0 = r1.entrySet()
            java.util.Iterator r9 = r0.iterator()
        L_0x0035:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0070
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r9)
            java.lang.Object r8 = r0.getKey()
            java.lang.String r1 = X.AnonymousClass0x9.A12(r0)
            X.8DA r0 = new X.8DA
            r0.<init>(r1)
            X.84O r0 = X.AnonymousClass738.A00(r3, r0)
            if (r0 == 0) goto L_0x00a4
            java.lang.String r7 = r0.A0N()
            X.C162457s7.A0H(r7)
            int r2 = r0.A02
            java.util.List r0 = r0.A07
            if (r0 == 0) goto L_0x006c
            java.util.List r1 = X.C73723fy.A0F(r0)
        L_0x0063:
            X.2kw r0 = new X.2kw
            r0.<init>(r1, r2, r7)
            r5.put(r8, r0)
            goto L_0x0035
        L_0x006c:
            X.3d3 r1 = X.C72023d3.A00
            goto L_0x0063
        L_0x006f:
            r5 = 0
        L_0x0070:
            java.lang.String r2 = r6.A06
            X.C162457s7.A0D(r2)
            X.48t r12 = r6.A00
            X.C162457s7.A0D(r12)
            X.48t r13 = r6.A03
            X.48t r14 = r6.A02
            java.util.Set r1 = r6.A08
            X.48t r15 = r6.A01
            java.lang.Boolean r0 = r6.A04
            X.C162457s7.A0D(r0)
            boolean r19 = r0.booleanValue()
            java.lang.Boolean r0 = r6.A05
            X.C162457s7.A0D(r0)
            boolean r20 = r0.booleanValue()
            X.2np r11 = new X.2np
            r17 = r5
            r18 = r1
            r16 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r4.add(r11)
            goto L_0x0010
        L_0x00a4:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Failed to find async component container for "
            r1.append(r0)
            java.lang.String r0 = r6.A06
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>(r1)
            throw r0
        L_0x00b9:
            r4 = 0
        L_0x00ba:
            X.7hT r1 = new X.7hT
            r6 = r23
            r7 = r25
            r10 = r27
            r8 = r28
            r11 = r29
            r12 = r30
            r13 = r31
            r5 = r1
            r9 = r4
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13)
            r0 = r21
            r2 = r24
            r0.<init>(r1, r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7r0.<init>(X.84O, X.7Xi, java.lang.String, java.util.List, java.util.List, java.util.List, java.util.List, java.util.List, java.util.Map, java.util.Map):void");
    }
}
