package X;

import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.9Yx  reason: invalid class name */
public abstract class AnonymousClass9Yx implements C187548xO {
    public C203449ni A00;

    public final void B1l() {
        if (this instanceof C1903895p) {
            C1903895p r1 = (C1903895p) this;
            if (r1.A07 != null) {
                AnonymousClass9XQ r3 = r1.A08;
                AnonymousClass9ZJ r2 = r3.A05;
                if (r2.A0C && !r2.A0F) {
                    synchronized (r2.A0A) {
                        r2.A0F = true;
                    }
                }
                r3.A01.sendEmptyMessage(2);
            }
        } else if (this instanceof C1903695n) {
            ((C1903695n) this).A02 = false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: X.9Zk} */
    /* JADX WARNING: type inference failed for: r4v7, types: [X.9mp] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BFy() {
        /*
            r14 = this;
            r4 = r14
            boolean r0 = r14 instanceof X.C1903895p
            if (r0 == 0) goto L_0x001f
            X.95p r4 = (X.C1903895p) r4
            X.71V r2 = X.C203639o4.A01
            X.9ni r1 = r4.A00
            boolean r0 = r1.BHG(r2)
            if (r0 == 0) goto L_0x001e
            X.8xO r0 = r1.B5j(r2)
            X.9o4 r0 = (X.C203639o4) r0
            X.96c r0 = (X.C1904196c) r0
            X.9ZG r0 = r0.A00
            r4.A01(r0)
        L_0x001e:
            return
        L_0x001f:
            boolean r0 = r14 instanceof X.C1903695n
            if (r0 == 0) goto L_0x001e
            X.95n r4 = (X.C1903695n) r4
            X.71V r1 = X.C203639o4.A01
            X.9ni r3 = r4.A00
            boolean r0 = r3.BHG(r1)
            if (r0 == 0) goto L_0x004e
            X.8xO r0 = r3.B5j(r1)
            X.9o4 r0 = (X.C203639o4) r0
            X.96c r0 = (X.C1904196c) r0
            X.9ZG r2 = r0.A00
            X.9MK r0 = new X.9MK
            r0.<init>(r4)
            X.95n r1 = r0.A00
            r1.A01 = r2
            X.9MI r0 = r1.A03
            r2.A09 = r0
            X.9MJ r0 = r1.A04
            r2.A0A = r0
            X.9PV r0 = r1.A00
            r0.A00 = r2
        L_0x004e:
            X.9PV r1 = r4.A00
            X.71V r2 = X.C203629o3.A00
            boolean r0 = r3.BHG(r2)
            if (r0 == 0) goto L_0x0062
            r3.B5j(r2)
            java.lang.String r0 = "addPreviewOutputListener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0062:
            X.71V r2 = X.C203609o1.A00
            boolean r0 = r3.BHG(r2)
            if (r0 == 0) goto L_0x0074
            r3.B5j(r2)
            java.lang.String r0 = "setPreProcessOnTouchListener"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0074:
            X.71V r2 = X.C203599o0.A00
            boolean r0 = r3.BHG(r2)
            if (r0 == 0) goto L_0x001e
            X.8xO r7 = r3.B5j(r2)
            X.9o0 r7 = (X.C203599o0) r7
            X.95o r7 = (X.C1903795o) r7
            java.util.List r0 = r7.A04
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x011d
            X.9LC r2 = new X.9LC
            r2.<init>()
            X.9LD r11 = new X.9LD
            r11.<init>()
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()
            int r2 = r2.availableProcessors()
            java.util.concurrent.ScheduledExecutorService r12 = java.util.concurrent.Executors.newScheduledThreadPool(r2)
            java.util.concurrent.ExecutorService r6 = java.util.concurrent.Executors.newSingleThreadExecutor()
            X.9ni r5 = r7.A00
            android.content.Context r9 = r5.getContext()
            X.5Bv r4 = r7.A03
            X.9MZ r3 = r7.A02
            X.9PA r2 = r7.A01
            X.9P9 r10 = new X.9P9
            r10.<init>(r2, r3, r4)
            X.9Tc r8 = new X.9Tc
            r13 = r12
            r8.<init>(r9, r10, r11, r12, r13)
            X.9LB r3 = new X.9LB
            r3.<init>()
            X.9Pw r4 = new X.9Pw
            r4.<init>()
            android.content.Context r2 = r5.getContext()
            r4.A00 = r2
            r4.A06 = r6
            r4.A04 = r8
            X.9QV r2 = r7.A00
            r4.A02 = r2
            r4.A03 = r3
            X.9LH r2 = X.C203669o7.A00
            X.9lp r2 = r5.B5k(r2)
            X.9o7 r2 = (X.C203669o7) r2
            X.9UZ r3 = new X.9UZ
            r3.<init>(r2)
            X.9MF r2 = new X.9MF
            r2.<init>(r3)
            r4.A01 = r2
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r2 = new com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl
            r2.<init>()
            r4.A05 = r2
            java.util.concurrent.Executor r11 = r4.A06
            r11.getClass()
            android.content.Context r5 = r4.A00
            r5.getClass()
            X.9Tc r9 = r4.A04
            r9.getClass()
            X.9QV r7 = r4.A02
            r7.getClass()
            X.9LB r8 = r4.A03
            r8.getClass()
            X.9MF r6 = r4.A01
            r6.getClass()
            com.facebook.onecamera.components.logging.functionalcorrectness.cppimpl.QPLUserFlowImpl r10 = r4.A05
            r10.getClass()
            X.9Zk r4 = new X.9Zk
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r0.add(r4)
        L_0x011d:
            X.6aY r0 = X.C129586aY.copyOf((java.util.Collection) r0)
            X.C162457s7.A0D(r0)
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)
            java.util.Iterator r2 = r5.iterator()
        L_0x012c:
            boolean r0 = r2.hasNext()
            r4 = 0
            if (r0 == 0) goto L_0x0159
            java.lang.Object r3 = r2.next()
            X.8uH r3 = (X.C185808uH) r3
            boolean r0 = r3 instanceof X.C195759Zk
            if (r0 == 0) goto L_0x012c
            r2 = r3
            X.9Zk r2 = (X.C195759Zk) r2
            boolean r0 = r3 instanceof X.C202919mp
            if (r0 == 0) goto L_0x0147
            r4 = r3
            X.9mp r4 = (X.C202919mp) r4
        L_0x0147:
            r0 = r4
            r4 = r2
        L_0x0149:
            r1.A01 = r4
            r1.A02 = r0
            X.9ZG r1 = r1.A00
            r1.getClass()
            android.os.Handler r0 = r1.A08
            if (r0 != 0) goto L_0x015b
            r1.A0D = r5
            return
        L_0x0159:
            r0 = r4
            goto L_0x0149
        L_0x015b:
            r0 = 0
            r1.A0D = r0
            X.9Zl r0 = new X.9Zl
            r0.<init>(r5)
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9Yx.BFy():void");
    }

    public final void connect() {
        if (this instanceof C1903895p) {
            C1903895p r1 = (C1903895p) this;
            if (r1.A07 != null) {
                r1.A08.A01.sendEmptyMessage(1);
            }
        } else if (this instanceof C1903695n) {
            ((C1903695n) this).A02 = true;
        }
    }

    public final void release() {
        if (this instanceof C1903895p) {
            C1903895p r3 = (C1903895p) this;
            C194849Us r2 = r3.A07;
            if (r2 != null) {
                r3.A0C = new CountDownLatch(1);
                r3.A08.A01.sendEmptyMessage(3);
                C159067l3 r0 = r2.A00;
                if (r0 != null) {
                    r0.A02();
                    r2.A00 = null;
                }
                C194729Ug r22 = r2.A03;
                AnonymousClass9LF r02 = C194729Ug.A04;
                Object obj = Boolean.FALSE;
                Map map = r22.A00;
                Object obj2 = map.get(r02);
                if (obj2 != null) {
                    obj = obj2;
                }
                boolean A1Z = AnonymousClass001.A1Z(obj);
                C159067l3 r03 = (C159067l3) map.remove(C194729Ug.A0A);
                if (A1Z && r03 != null) {
                    r03.A02();
                }
            }
        } else if (this instanceof C1903695n) {
            ((C1903695n) this).A02 = false;
        }
    }

    public AnonymousClass9Yx(C203449ni r1) {
        this.A00 = r1;
    }

    public final void BFn() {
    }
}
