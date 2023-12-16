package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.2hC  reason: invalid class name and case insensitive filesystem */
public final class C49852hC {
    public AnonymousClass2RE A00;
    public boolean A01;
    public Map[] A02;
    public final C186568vZ A03;
    public final AnonymousClass4C1 A04;

    public final void A01() {
        Throwable th;
        List list;
        synchronized (this) {
            if (!this.A01) {
                C186568vZ r5 = this.A03;
                r5.markerStart(314515949);
                AnonymousClass3U8.A00.A00(r5, 314515949);
                r5.markerPoint(314515949, "get_regs");
                Iterable<C52932mH> iterable = (Iterable) this.A04.get();
                r5.markerPoint(314515949, "config_regs");
                C162457s7.A0H(iterable);
                for (C52932mH r2 : iterable) {
                    synchronized (r2) {
                        try {
                            if (!r2.A00) {
                                r2.A09();
                                r2.A00 = true;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                        }
                    }
                }
                r5.markerPoint(314515949, "process_regs");
                AnonymousClass2RE r7 = new AnonymousClass2RE();
                ArrayList A0s = AnonymousClass001.A0s();
                Iterator it = iterable.iterator();
                loop1:
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        C52932mH r1 = (C52932mH) next;
                        synchronized (next) {
                            if (!r1.A00) {
                                r1.A09();
                                r1.A00 = true;
                            }
                            list = r1.A03;
                        }
                        Iterator it2 = list.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                C26501cE r22 = (C26501cE) it2.next();
                                Integer num = r22.A05;
                                C85424Ge r12 = r22.A06;
                                if (r12 == null) {
                                    th = C18270x1.A0S("messageClass");
                                    break loop1;
                                } else if (num != null) {
                                    AnonymousClass3Z6.A03(num, r12, r7.A01);
                                    int intValue = num.intValue();
                                    if (intValue > r7.A00) {
                                        r7.A00 = intValue;
                                    }
                                    C26441c8 r6 = r22.A04;
                                    if (r6 == null) {
                                        th = C18270x1.A0S("integrationPointsBuilder");
                                        break loop1;
                                    }
                                    LinkedHashMap A0r = C18320x8.A0r();
                                    Iterator it3 = r6.A01.iterator();
                                    while (it3.hasNext()) {
                                        AnonymousClass3Z6.A0A(A0r, it3);
                                    }
                                    Iterator it4 = r6.A00.iterator();
                                    while (it4.hasNext()) {
                                        AnonymousClass3Z6.A0A(A0r, it4);
                                    }
                                    AnonymousClass3Z6.A03(Integer.valueOf(intValue), A0r, A0s);
                                } else {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("Configuration error in builder=");
                                    A0o.append(AnonymousClass0x9.A1E(C26501cE.class).BBo());
                                    A0o.append(", message type=");
                                    A0o.append(r22.A05);
                                    A0o.append(",, message class=");
                                    C85424Ge r0 = r22.A06;
                                    if (r0 != null) {
                                        th = new C73253fB(AnonymousClass000.A0R(r0, A0o));
                                    } else {
                                        th = C18270x1.A0S("messageClass");
                                    }
                                }
                            }
                        }
                    } else {
                        r5.markerPoint(314515949, "init_state");
                        this.A00 = r7;
                        int i = r7.A00 + 1;
                        Map[] mapArr = new Map[i];
                        for (int i2 = 0; i2 < i; i2++) {
                            mapArr[i2] = null;
                        }
                        this.A02 = mapArr;
                        Iterator it5 = A0s.iterator();
                        while (it5.hasNext()) {
                            AnonymousClass3Z6 r02 = (AnonymousClass3Z6) it5.next();
                            int A002 = AnonymousClass3Z6.A00(r02);
                            Object obj = r02.second;
                            Object[] objArr = this.A02;
                            if (objArr == null) {
                                th = C18270x1.A0S("integrationPointsFast");
                            } else {
                                objArr[A002] = obj;
                            }
                        }
                        r5.markerPoint(314515949, "init_complete");
                        this.A01 = true;
                        r5.markerEnd(314515949, 2);
                    }
                }
                throw th;
            }
        }
    }

    public C49852hC(C186568vZ r1, AnonymousClass4C1 r2) {
        C18260x0.A0Q(r1, r2);
        this.A03 = r1;
        this.A04 = r2;
    }

    public final AnonymousClass4C1 A00(C85424Ge r3, int i) {
        A01();
        AnonymousClass2RE r1 = this.A00;
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
