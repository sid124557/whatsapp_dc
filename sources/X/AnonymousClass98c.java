package X;

import android.util.SparseArray;
import android.view.View;
import com.whatsapp.R;
import java.util.LinkedHashMap;
import java.util.Set;

/* renamed from: X.98c  reason: invalid class name */
public final class AnonymousClass98c extends C152077Xl {
    public static C05390Td A00;

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011f, code lost:
        if (r2 == 8) goto L_0x0121;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(android.view.View r11, X.C153427bI r12, X.AnonymousClass84O r13, X.AnonymousClass84O r14) {
        /*
            r10 = this;
            r7 = r12
            java.lang.Object r3 = X.C162377rs.A05(r12, r13)
            X.9O3 r3 = (X.AnonymousClass9O3) r3
            if (r3 == 0) goto L_0x0125
            X.2dA r2 = r12.A02
            java.util.concurrent.atomic.AtomicBoolean r0 = r2.A0A
            boolean r0 = r0.get()
            boolean r4 = X.AnonymousClass000.A1S(r0)
            r1 = 50
            r0 = 0
            boolean r0 = r13.A0W(r1, r0)
            r5 = r11
            if (r0 != 0) goto L_0x00df
            X.2ZM r0 = r2.A02
            X.2Eo r0 = r0.A00()
            X.2IQ r0 = r0.A00
            X.1VX r1 = r0.A00
            r0 = 6190(0x182e, float:8.674E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x00df
            X.0Td r6 = r3.A00
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            int r9 = r14.A02
            r1 = 2131428059(0x7f0b02db, float:1.8477752E38)
            android.util.SparseArray r0 = r12.A01
            java.lang.Object r8 = r0.get(r1)
            X.7Wf r8 = (X.C151767Wf) r8
            if (r8 == 0) goto L_0x0060
            java.util.LinkedHashMap r2 = r8.A03
            monitor-enter(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch:{ all -> 0x0058 }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ all -> 0x0058 }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ all -> 0x0058 }
            r2.remove(r1)     // Catch:{ all -> 0x0058 }
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            goto L_0x005b
        L_0x0058:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0058 }
            throw r1
        L_0x005b:
            if (r0 == 0) goto L_0x0060
            r0.run()
        L_0x0060:
            android.util.SparseArray r0 = r6.A01
            java.lang.Object r3 = r0.get(r9)
            java.util.Set r3 = (java.util.Set) r3
            if (r3 != 0) goto L_0x00db
            java.util.HashSet r3 = X.AnonymousClass002.A0K()
            r0.append(r9, r3)
            if (r8 == 0) goto L_0x00db
            if (r4 == 0) goto L_0x0093
            X.0D8 r4 = new X.0D8
            r4.<init>(r11)
            android.util.SparseArray r0 = r6.A00
            r0.append(r9, r4)
            X.3ZT r2 = r8.A01
            java.util.List r0 = r2.A00
            r0.clear()
            X.2bs r1 = new X.2bs
            r1.<init>(r11, r2)
            X.5U3 r0 = new X.5U3
            r0.<init>()
            r8.A01(r1, r4, r0)
        L_0x0093:
            java.util.WeakHashMap r0 = X.C157977jE.A01
            java.lang.Object r1 = r0.get(r11)
            if (r1 != 0) goto L_0x00a3
            X.7jE r1 = new X.7jE
            r1.<init>(r11)
            r0.put(r11, r1)
        L_0x00a3:
            X.7Gm r0 = r8.A00
            if (r0 == 0) goto L_0x00d4
            X.7Br r2 = r0.A00
            monitor-enter(r2)
            java.util.Map r0 = r2.A00     // Catch:{ all -> 0x00d1 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x00d1 }
            X.5Z2 r1 = (X.AnonymousClass5Z2) r1     // Catch:{ all -> 0x00d1 }
            if (r1 != 0) goto L_0x00b6
            X.5Z2 r1 = X.AnonymousClass5Z2.A03     // Catch:{ all -> 0x00d1 }
        L_0x00b6:
            monitor-exit(r2)
            if (r1 == 0) goto L_0x00d4
            X.5Z2 r0 = X.AnonymousClass5Z2.A03
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x00d4
            X.0ma r4 = new X.0ma
            r4.<init>(r5, r6, r7, r8, r9)
            java.util.LinkedHashMap r0 = r8.A03
            monitor-enter(r0)
            X.AnonymousClass0x2.A1H(r4, r0, r9)     // Catch:{ all -> 0x00ce }
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            goto L_0x00db
        L_0x00ce:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00ce }
            throw r1
        L_0x00d1:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x00d4:
            X.5Z2 r0 = r6.A01(r12, r9)
            r8.A00(r11, r0)
        L_0x00db:
            r3.add(r13)
            return
        L_0x00df:
            r0 = 35
            X.48t r4 = r13.A0L(r0)
            r0 = 36
            X.48t r2 = r13.A0L(r0)
            if (r4 != 0) goto L_0x00f0
            if (r2 != 0) goto L_0x00f0
        L_0x00ef:
            return
        L_0x00f0:
            r0 = 38
            java.lang.String r1 = r13.A0O(r0)
            if (r1 == 0) goto L_0x00ef
            X.9N4 r0 = r3.A01
            X.9Y3 r3 = r0.A00
            r3.A02 = r14
            r3.A00 = r11
            r3.A01 = r12
            r3.A05 = r1
            r3.A03 = r4
            r3.A04 = r2
            android.view.ViewTreeObserver r0 = r11.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
            android.view.ViewParent r0 = r11.getParent()
            if (r0 == 0) goto L_0x0121
            int r2 = r11.getVisibility()
            r0 = 4
            if (r2 == r0) goto L_0x0121
            r1 = 8
            r0 = 1
            if (r2 != r1) goto L_0x0122
        L_0x0121:
            r0 = 0
        L_0x0122:
            r3.A06 = r0
            return
        L_0x0125:
            java.lang.String r0 = "Extension defines a controller but none was found"
            java.lang.RuntimeException r1 = X.AnonymousClass002.A0E(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass98c.A01(android.view.View, X.7bI, X.84O, X.84O):void");
    }

    public void A02(View view, C153427bI r12, AnonymousClass84O r13, AnonymousClass84O r14) {
        int visibility;
        AnonymousClass84O r6 = r13;
        AnonymousClass9O3 r2 = (AnonymousClass9O3) C162377rs.A05(r12, r13);
        if (r2 == null) {
            throw AnonymousClass002.A0E("Extension defines a controller but none was found");
        } else if (r13.A0W(50, false) || !r12.A02.A02.A00().A00.A00.A0X(6190)) {
            AnonymousClass9Y3 r22 = r2.A01.A00;
            View view2 = r22.A00;
            if (view2 != null) {
                if (r22.A06 && (view2.getParent() == null || (visibility = view2.getVisibility()) == 4 || visibility == 8)) {
                    r22.A00();
                }
                r22.A00.getViewTreeObserver().removeOnGlobalLayoutListener(r22);
                r22.A00 = null;
                r22.A01 = null;
                r22.A03 = null;
                r22.A04 = null;
                r22.A06 = false;
            }
        } else {
            C05390Td r5 = r2.A00;
            View view3 = view;
            C162457s7.A0J(view, 0);
            int i = r14.A02;
            SparseArray sparseArray = r5.A01;
            Set set = (Set) sparseArray.get(i);
            if (set != null) {
                SparseArray sparseArray2 = r5.A00;
                AnonymousClass0D8 r0 = (AnonymousClass0D8) sparseArray2.get(i);
                if (r0 != null) {
                    view.removeOnAttachStateChangeListener(r0);
                    sparseArray2.remove(i);
                }
                if (set.size() == 1) {
                    C151767Wf r7 = (C151767Wf) r12.A01.get(R.id.bloks_host_viewpoint_manager);
                    if (r7 != null) {
                        C147987Gm r02 = r7.A00;
                        if (r02 == null || !r02.A01.A01) {
                            r7.A00(view, AnonymousClass5Z2.A03);
                        } else {
                            C13140mh r3 = new C13140mh(view3, r5, r6, r7, set, i);
                            LinkedHashMap linkedHashMap = r7.A03;
                            synchronized (linkedHashMap) {
                                AnonymousClass0x2.A1H(r3, linkedHashMap, i);
                            }
                            return;
                        }
                    }
                    set.remove(r13);
                    sparseArray.remove(i);
                    return;
                }
                set.remove(r13);
            }
        }
    }

    public AnonymousClass98c() {
        super(13538);
    }

    public /* bridge */ /* synthetic */ Object A00(C153427bI r4, AnonymousClass84O r5) {
        C05390Td r2;
        if (r4.A02.A0A.get()) {
            r2 = new C05390Td(new AnonymousClass9YJ(), new AnonymousClass9YL());
        } else {
            r2 = A00;
            if (r2 == null) {
                r2 = new C05390Td(new AnonymousClass9YJ(), new AnonymousClass9YL());
                A00 = r2;
            }
        }
        return new AnonymousClass9O3(r2, new AnonymousClass9N4());
    }
}
