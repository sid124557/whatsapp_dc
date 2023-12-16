package X;

/* renamed from: X.0gY  reason: invalid class name and case insensitive filesystem */
public class C09660gY implements C15530rW {
    public Object A00;
    public final int A01;

    public C09660gY(C08270df r1, int i) {
        this.A01 = i;
        this.A00 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0069, code lost:
        r1.append(r0);
        r1.append(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e6, code lost:
        r2.A0k(r3, r8.A00, r8.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ed, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        r1.append(r0);
        r1.append(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0023, code lost:
        android.util.Log.w(r5, r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void BM2(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 0: goto L_0x0070;
                case 1: goto L_0x002b;
                default: goto L_0x0005;
            }
        L_0x0005:
            X.0Zg r8 = (X.C06800Zg) r8
            java.lang.Object r1 = r7.A00
            X.0df r1 = (X.C08270df) r1
            java.util.ArrayDeque r0 = r1.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Za r0 = (X.C06740Za) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0057
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No IntentSenders were started for "
        L_0x001d:
            r1.append(r0)
            r1.append(r7)
        L_0x0023:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r5, r0)
            return
        L_0x002b:
            X.0Zg r8 = (X.C06800Zg) r8
            java.lang.Object r1 = r7.A00
            X.0df r1 = (X.C08270df) r1
            java.util.ArrayDeque r0 = r1.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Za r0 = (X.C06740Za) r0
            java.lang.String r5 = "FragmentManager"
            if (r0 != 0) goto L_0x0044
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No Activities were started for result for "
            goto L_0x001d
        L_0x0044:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.0Qo r0 = r1.A0Y
            X.0eF r2 = r0.A03(r4)
            if (r2 != 0) goto L_0x00e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Activity result delivered for unknown Fragment "
            goto L_0x0069
        L_0x0057:
            java.lang.String r4 = r0.A01
            int r3 = r0.A00
            X.0Qo r0 = r1.A0Y
            X.0eF r2 = r0.A03(r4)
            if (r2 != 0) goto L_0x00e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Intent Sender result delivered for unknown Fragment "
        L_0x0069:
            r1.append(r0)
            r1.append(r4)
            goto L_0x0023
        L_0x0070:
            java.util.Map r8 = (java.util.Map) r8
            java.util.Set r1 = r8.keySet()
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.Object[] r5 = r1.toArray(r0)
            java.lang.String[] r5 = (java.lang.String[]) r5
            java.util.Collection r0 = r8.values()
            java.util.ArrayList r3 = X.AnonymousClass002.A0J(r0)
            int r0 = r3.size()
            int[] r6 = new int[r0]
            r2 = 0
        L_0x008e:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00a5
            java.lang.Object r0 = r3.get(r2)
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            r0 = -1
            if (r1 == 0) goto L_0x00a0
            r0 = 0
        L_0x00a0:
            r6[r2] = r0
            int r2 = r2 + 1
            goto L_0x008e
        L_0x00a5:
            java.lang.Object r4 = r7.A00
            X.0df r4 = (X.C08270df) r4
            java.util.ArrayDeque r0 = r4.A0D
            java.lang.Object r0 = r0.pollFirst()
            X.0Za r0 = (X.C06740Za) r0
            java.lang.String r3 = "FragmentManager"
            if (r0 != 0) goto L_0x00c9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "No permissions were requested for "
            r1.append(r0)
            r1.append(r7)
        L_0x00c1:
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r3, r0)
            return
        L_0x00c9:
            java.lang.String r2 = r0.A01
            int r1 = r0.A00
            X.0Qo r0 = r4.A0Y
            X.0eF r0 = r0.A03(r2)
            if (r0 != 0) goto L_0x00e2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Permission request result delivered for unknown Fragment "
            r1.append(r0)
            r1.append(r2)
            goto L_0x00c1
        L_0x00e2:
            r0.A0l(r1, r5, r6)
            return
        L_0x00e6:
            int r1 = r8.A00
            android.content.Intent r0 = r8.A01
            r2.A0k(r3, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09660gY.BM2(java.lang.Object):void");
    }
}
