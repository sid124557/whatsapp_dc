package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2hD  reason: invalid class name and case insensitive filesystem */
public final class C49862hD {
    public AnonymousClass2RG A00;
    public boolean A01;
    public Map[] A02;
    public final C186568vZ A03;
    public final AnonymousClass4C1 A04;

    public final void A01() {
        RuntimeException th;
        List list;
        synchronized (this) {
            if (!this.A01) {
                C186568vZ r5 = this.A03;
                r5.markerStart(314520282);
                AnonymousClass3U8.A00.A00(r5, 314520282);
                r5.markerPoint(314520282, "get_regs");
                Iterable<C53292mr> iterable = (Iterable) this.A04.get();
                r5.markerPoint(314520282, "config_regs");
                C162457s7.A0H(iterable);
                for (C53292mr A06 : iterable) {
                    A06.A06();
                }
                r5.markerPoint(314520282, "process_regs");
                AnonymousClass2RG r2 = new AnonymousClass2RG();
                ArrayList A0I = AnonymousClass002.A0I(167);
                Iterator it = iterable.iterator();
                loop1:
                while (true) {
                    if (it.hasNext()) {
                        C53292mr r1 = (C53292mr) it.next();
                        synchronized (r1) {
                            try {
                                r1.A06();
                                list = r1.A03;
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C26511cF r10 = (C26511cF) it2.next();
                                C26421c6 r0 = r10.A06;
                                if (r0 == null) {
                                    th = C18270x1.A0S("systemActionsBuilder");
                                    break loop1;
                                }
                                ArrayList arrayList = r0.A00;
                                C85424Ge r9 = r10.A07;
                                if (r9 == null) {
                                    th = C18270x1.A0S("messageClass");
                                    break loop1;
                                }
                                Iterator it3 = arrayList.iterator();
                                while (it3.hasNext()) {
                                    int A05 = C18280x3.A05(it3);
                                    AnonymousClass3Z6.A03(Integer.valueOf(A05), r9, r2.A01);
                                    if (A05 > r2.A00) {
                                        r2.A00 = A05;
                                    }
                                }
                                C26441c8 r7 = r10.A05;
                                if (r7 == null) {
                                    th = C18270x1.A0S("integrationPointsBuilder");
                                    break loop1;
                                }
                                LinkedHashMap A0r = C18320x8.A0r();
                                Iterator it4 = r7.A01.iterator();
                                while (it4.hasNext()) {
                                    AnonymousClass3Z6.A0A(A0r, it4);
                                }
                                Iterator it5 = r7.A00.iterator();
                                while (it5.hasNext()) {
                                    AnonymousClass3Z6.A0A(A0r, it5);
                                }
                                Iterator it6 = arrayList.iterator();
                                while (it6.hasNext()) {
                                    AnonymousClass3Z6.A03(Integer.valueOf(C18280x3.A05(it6)), A0r, A0I);
                                }
                            }
                        }
                    } else {
                        r5.markerPoint(314520282, "init_state");
                        this.A00 = r2;
                        int i = r2.A00 + 1;
                        Map[] mapArr = new Map[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            mapArr[i2] = null;
                        }
                        this.A02 = mapArr;
                        Iterator it7 = A0I.iterator();
                        while (it7.hasNext()) {
                            AnonymousClass3Z6 r02 = (AnonymousClass3Z6) it7.next();
                            int A002 = AnonymousClass3Z6.A00(r02);
                            Object obj = r02.second;
                            Object[] objArr = this.A02;
                            if (objArr == null) {
                                th = C18270x1.A0S("integrationPointsFast");
                            } else {
                                objArr[A002] = obj;
                            }
                        }
                        r5.markerPoint(314520282, "init_complete");
                        this.A01 = true;
                        r5.markerEnd(314520282, 2);
                    }
                }
                throw th;
            }
        }
    }

    public C49862hD(C186568vZ r1, AnonymousClass4C1 r2) {
        C18260x0.A0Q(r1, r2);
        this.A03 = r1;
        this.A04 = r2;
    }

    public final AnonymousClass4C1 A00(C85424Ge r3, int i) {
        A01();
        AnonymousClass2RG r1 = this.A00;
        if (r1 == null) {
            throw C18270x1.A0S("metadata");
        } else if (i > r1.A00) {
            return null;
        } else {
            Map[] mapArr = this.A02;
            if (mapArr == null) {
                throw C18270x1.A0S("integrationPointsFast");
            }
            Map map = mapArr[i];
            if (map != null) {
                return (AnonymousClass4C1) map.get(r3);
            }
            return null;
        }
    }
}
