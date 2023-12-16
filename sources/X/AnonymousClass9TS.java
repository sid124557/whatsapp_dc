package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.9TS  reason: invalid class name */
public class AnonymousClass9TS {
    public final C193279Nv A00 = new C193279Nv();
    public final AnonymousClass9RC A01 = new AnonymousClass9RC();
    public final HashMap A02 = AnonymousClass001.A0t();

    public void A00(C203279nQ r4) {
        AnonymousClass22N r0;
        AnonymousClass9RC r2 = this.A01;
        C203279nQ[] r1 = r2.A01;
        switch (((C195269Wx) r4).A01) {
            case 0:
                r0 = AnonymousClass22N.INPUT_PREVIEW;
                break;
            case 1:
                r0 = AnonymousClass22N.EXTERNAL_WORLD_TRACKING_EVENT;
                break;
            default:
                r0 = AnonymousClass22N.PLATFORM_ALGORITHM_DATA_EVENT;
                break;
        }
        r1[r0.ordinal()] = r4;
        r2.A00();
    }

    public void A02(C202919mp r7, AnonymousClass22N r8) {
        C193269Nu r1;
        C194439Sw r5 = this.A00.A00;
        List list = r5.A00;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                r1 = new C193269Nu(r7);
                r5.A01(r1);
                break;
            }
            r1 = (C193269Nu) list.get(i);
            if (r1.A00 == r7) {
                break;
            }
            i++;
        }
        r1.A01.add(r8);
        AnonymousClass9RC r3 = this.A01;
        if (r8.shouldNotifyEventListenerRegistration) {
            int ordinal = r8.ordinal();
            r3.A02[ordinal] = true;
            C203279nQ[] r12 = r3.A01;
            if (r12[ordinal] != null && r3.A00.get()) {
                r12[ordinal].B2L();
            }
        }
        C183818qi r0 = (C183818qi) this.A02.get(r8);
        if (r0 != null) {
            r7.BZu(r0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0048, code lost:
        r4 = r8.ordinal();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(X.C202919mp r7, X.AnonymousClass22N r8) {
        /*
            r6 = this;
            X.9Nv r0 = r6.A00
            X.9Sw r5 = r0.A00
            java.util.List r4 = r5.A00
            int r3 = r4.size()
            r2 = 0
        L_0x000b:
            if (r2 >= r3) goto L_0x0025
            java.lang.Object r1 = r4.get(r2)
            X.9Nu r1 = (X.C193269Nu) r1
            X.9mp r0 = r1.A00
            if (r0 != r7) goto L_0x003f
            java.util.HashSet r0 = r1.A01
            r0.remove(r8)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0025
            r5.A02(r1)
        L_0x0025:
            java.util.List r3 = r5.A00
            int r2 = r3.size()
            r1 = 0
        L_0x002c:
            if (r1 >= r2) goto L_0x0042
            java.lang.Object r0 = r3.get(r1)
            X.9Nu r0 = (X.C193269Nu) r0
            java.util.HashSet r0 = r0.A01
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x0083
            int r1 = r1 + 1
            goto L_0x002c
        L_0x003f:
            int r2 = r2 + 1
            goto L_0x000b
        L_0x0042:
            X.9RC r1 = r6.A01
            boolean r0 = r8.shouldNotifyEventListenerRegistration
            if (r0 == 0) goto L_0x0083
            int r4 = r8.ordinal()
            X.9nQ[] r0 = r1.A01
            r2 = r0[r4]
            if (r2 == 0) goto L_0x0083
            boolean[] r1 = r1.A02
            boolean r0 = r1[r4]
            if (r0 == 0) goto L_0x0083
            r3 = 0
            r1[r4] = r3
            X.9Wx r2 = (X.C195269Wx) r2
            int r0 = r2.A01
            if (r0 != 0) goto L_0x0083
            java.lang.Object r0 = r2.A00
            X.9ZG r0 = (X.AnonymousClass9ZG) r0
            X.9ZE r2 = r0.A0G
            if (r2 == 0) goto L_0x0083
            boolean r0 = r2.A03
            if (r0 == 0) goto L_0x0083
            X.9XL r0 = r2.A05
            r0.A0D = r3
            android.os.Handler r1 = r0.A05
            java.lang.Runnable r0 = r0.A0A
            r1.post(r0)
            X.83y r1 = r2.A00
            if (r1 == 0) goto L_0x0081
            X.9ZF r0 = r2.A01
            r0.A02(r1)
        L_0x0081:
            r2.A03 = r3
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9TS.A03(X.9mp, X.22N):void");
    }

    public void A01(C183818qi r7, C202919mp r8) {
        AnonymousClass22N BDx = r7.BDx();
        if (BDx.isCacheableEvent) {
            this.A02.put(BDx, r7);
        }
        C193279Nv r1 = this.A00;
        if (r1.A01.get()) {
            List list = r1.A00.A00;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                C193269Nu r12 = (C193269Nu) list.get(i);
                if ((r8 == null || r8 == r12.A00) && r12.A01.contains(BDx)) {
                    r12.A00.BZu(r7);
                }
            }
        }
    }
}
