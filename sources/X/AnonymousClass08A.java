package X;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.08A  reason: invalid class name */
public class AnonymousClass08A extends AnonymousClass0O9 {
    public int A00 = 0;
    public C004304k A01 = new C004304k();
    public AnonymousClass0GC A02;
    public ArrayList A03 = AnonymousClass001.A0s();
    public boolean A04 = false;
    public boolean A05 = false;
    public final WeakReference A06;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r8.A04 != false) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A00(X.C15110qn r9) {
        /*
            r8 = this;
            java.lang.String r0 = "addObserver"
            r8.A07(r0)
            X.0GC r1 = r8.A02
            X.0GC r0 = X.AnonymousClass0GC.DESTROYED
            if (r1 == r0) goto L_0x000d
            X.0GC r0 = X.AnonymousClass0GC.INITIALIZED
        L_0x000d:
            X.0NC r6 = new X.0NC
            r6.<init>(r0, r9)
            X.04k r0 = r8.A01
            java.lang.Object r0 = r0.A02(r9, r6)
            if (r0 != 0) goto L_0x008c
            java.lang.ref.WeakReference r0 = r8.A06
            java.lang.Object r5 = r0.get()
            X.0sA r5 = (X.C15910sA) r5
            if (r5 == 0) goto L_0x008c
            int r0 = r8.A00
            r4 = 1
            if (r0 != 0) goto L_0x002e
            boolean r0 = r8.A04
            r7 = 0
            if (r0 == 0) goto L_0x002f
        L_0x002e:
            r7 = 1
        L_0x002f:
            X.0GC r1 = r8.A02(r9)
            int r0 = r8.A00
            int r0 = r0 + 1
            r8.A00 = r0
        L_0x0039:
            X.0GC r0 = r6.A00
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L_0x0082
            X.04k r0 = r8.A01
            java.util.HashMap r0 = r0.A00
            boolean r0 = r0.containsKey(r9)
            if (r0 == 0) goto L_0x0082
            X.0GC r3 = r6.A00
            java.util.ArrayList r2 = r8.A03
            r2.add(r3)
            int r1 = r3.ordinal()
            r0 = 2
            if (r1 == r0) goto L_0x006c
            r0 = 3
            if (r1 == r0) goto L_0x0069
            if (r1 == r4) goto L_0x006f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "no event up from "
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0H(r3, r0, r1)
            throw r0
        L_0x0069:
            X.0GH r0 = X.AnonymousClass0GH.ON_RESUME
            goto L_0x0071
        L_0x006c:
            X.0GH r0 = X.AnonymousClass0GH.ON_START
            goto L_0x0071
        L_0x006f:
            X.0GH r0 = X.AnonymousClass0GH.ON_CREATE
        L_0x0071:
            r6.A00(r0, r5)
            int r0 = r2.size()
            int r0 = r0 + -1
            r2.remove(r0)
            X.0GC r1 = r8.A02(r9)
            goto L_0x0039
        L_0x0082:
            if (r7 != 0) goto L_0x0087
            r8.A03()
        L_0x0087:
            int r0 = r8.A00
            int r0 = r0 - r4
            r8.A00 = r0
        L_0x008c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass08A.A00(X.0qn):void");
    }

    public void A01(C15110qn r2) {
        A07("removeObserver");
        this.A01.A01(r2);
    }

    public final AnonymousClass0GC A02(C15110qn r5) {
        C13540nL r0;
        AnonymousClass0GC r3;
        C004304k r1 = this.A01;
        if (r1.A00.containsKey(r5)) {
            r0 = ((C13540nL) r1.A00.get(r5)).A01;
        } else {
            r0 = null;
        }
        AnonymousClass0GC r2 = null;
        if (r0 != null) {
            r3 = ((AnonymousClass0NC) r0.getValue()).A00;
        } else {
            r3 = null;
        }
        ArrayList arrayList = this.A03;
        if (!arrayList.isEmpty()) {
            r2 = (AnonymousClass0GC) arrayList.get(arrayList.size() - 1);
        }
        AnonymousClass0GC r12 = this.A02;
        if (r3 != null && r3.compareTo(r12) < 0) {
            r12 = r3;
        }
        if (r2 == null || r2.compareTo(r12) >= 0) {
            return r12;
        }
        return r2;
    }

    public final void A03() {
        AnonymousClass0GH r0;
        AnonymousClass0GC r1;
        C15910sA r3 = (C15910sA) this.A06.get();
        if (r3 == null) {
            throw AnonymousClass001.A0e("LifecycleOwner of this LifecycleRegistry is alreadygarbage collected. It is too late to change lifecycle state.");
        }
        while (true) {
            C004304k r5 = this.A01;
            boolean z = true;
            if (!(r5.A00 == 0 || (((AnonymousClass0NC) r5.A02.getValue()).A00 == (r1 = ((AnonymousClass0NC) r5.A01.getValue()).A00) && this.A02 == r1))) {
                z = false;
            }
            this.A05 = false;
            if (!z) {
                if (this.A02.compareTo(((AnonymousClass0NC) r5.A02.getValue()).A00) < 0) {
                    C004304k r2 = this.A01;
                    C004204j r7 = new C004204j(r2.A01, r2.A02);
                    r2.A03.put(r7, Boolean.FALSE);
                    while (r7.hasNext() && !this.A05) {
                        Map.Entry entry = (Map.Entry) r7.next();
                        AnonymousClass0NC r52 = (AnonymousClass0NC) entry.getValue();
                        while (r52.A00.compareTo(this.A02) > 0 && !this.A05) {
                            C004304k r02 = this.A01;
                            if (!r02.A00.containsKey(entry.getKey())) {
                                continue;
                                break;
                            }
                            AnonymousClass0GC r4 = r52.A00;
                            AnonymousClass0GH A002 = AnonymousClass0GH.A00(r4);
                            if (A002 != null) {
                                AnonymousClass0GC A012 = A002.A01();
                                ArrayList arrayList = this.A03;
                                arrayList.add(A012);
                                r52.A00(A002, r3);
                                arrayList.remove(arrayList.size() - 1);
                            } else {
                                throw AnonymousClass000.A0H(r4, "no event down from ", AnonymousClass001.A0o());
                            }
                        }
                    }
                }
                C13540nL r22 = this.A01.A01;
                if (!this.A05 && r22 != null && this.A02.compareTo(((AnonymousClass0NC) r22.getValue()).A00) > 0) {
                    C004304k r03 = this.A01;
                    C13500nH r72 = new C13500nH(r03);
                    r03.A03.put(r72, Boolean.FALSE);
                    while (r72.hasNext() && !this.A05) {
                        Map.Entry entry2 = (Map.Entry) r72.next();
                        AnonymousClass0NC r53 = (AnonymousClass0NC) entry2.getValue();
                        while (r53.A00.compareTo(this.A02) < 0 && !this.A05) {
                            C004304k r04 = this.A01;
                            if (!r04.A00.containsKey(entry2.getKey())) {
                                continue;
                                break;
                            }
                            AnonymousClass0GC r42 = r53.A00;
                            ArrayList arrayList2 = this.A03;
                            arrayList2.add(r42);
                            int ordinal = r42.ordinal();
                            if (ordinal == 2) {
                                r0 = AnonymousClass0GH.ON_START;
                            } else if (ordinal == 3) {
                                r0 = AnonymousClass0GH.ON_RESUME;
                            } else if (ordinal != 1) {
                                throw AnonymousClass000.A0H(r42, "no event up from ", AnonymousClass001.A0o());
                            } else {
                                r0 = AnonymousClass0GH.ON_CREATE;
                            }
                            r53.A00(r0, r3);
                            arrayList2.remove(arrayList2.size() - 1);
                        }
                    }
                }
            } else {
                return;
            }
        }
    }

    public void A04(AnonymousClass0GH r2) {
        A07("handleLifecycleEvent");
        A06(r2.A01());
    }

    public void A05(AnonymousClass0GC r2) {
        A07("setCurrentState");
        A06(r2);
    }

    public final void A06(AnonymousClass0GC r4) {
        AnonymousClass0GC r2 = this.A02;
        if (r2 == r4) {
            return;
        }
        if (r2 == AnonymousClass0GC.INITIALIZED && r4 == AnonymousClass0GC.DESTROYED) {
            throw AnonymousClass000.A0H(r2, "no event down from ", AnonymousClass001.A0o());
        }
        this.A02 = r4;
        if (this.A04 || this.A00 != 0) {
            this.A05 = true;
            return;
        }
        this.A04 = true;
        A03();
        this.A04 = false;
        if (this.A02 == AnonymousClass0GC.DESTROYED) {
            this.A01 = new C004304k();
        }
    }

    public AnonymousClass08A(C15910sA r2) {
        this.A06 = new WeakReference(r2);
        this.A02 = AnonymousClass0GC.INITIALIZED;
    }

    public final void A07(String str) {
        if (!C004004h.A00().A03()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Method ");
            A0o.append(str);
            throw AnonymousClass000.A0I(" must be called on the main thread", A0o);
        }
    }
}
