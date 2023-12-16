package X;

import android.util.Log;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.0UN  reason: invalid class name */
public abstract class AnonymousClass0UN {
    public boolean A00 = false;
    public boolean A01 = false;
    public final ViewGroup A02;
    public final ArrayList A03 = AnonymousClass001.A0s();
    public final ArrayList A04 = AnonymousClass001.A0s();

    public void A03() {
        String str;
        String str2;
        if (C08270df.A05(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        ViewGroup viewGroup = this.A02;
        boolean A042 = C06360Xi.A04(viewGroup);
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A05();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((AnonymousClass0QW) it.next()).A01();
            }
            Iterator it2 = AnonymousClass002.A0J(this.A04).iterator();
            while (it2.hasNext()) {
                AnonymousClass0QW r4 = (AnonymousClass0QW) it2.next();
                if (C08270df.A05(2)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("SpecialEffectsController: ");
                    if (A042) {
                        str2 = "";
                    } else {
                        StringBuilder A0o2 = AnonymousClass001.A0o();
                        A0o2.append("Container ");
                        A0o2.append(viewGroup);
                        str2 = AnonymousClass000.A0X(" is not attached to window. ", A0o2);
                    }
                    A0o.append(str2);
                    AnonymousClass000.A18(r4, "Cancelling running operation ", "FragmentManager", A0o);
                }
                r4.A02();
            }
            Iterator it3 = AnonymousClass002.A0J(arrayList).iterator();
            while (it3.hasNext()) {
                AnonymousClass0QW r42 = (AnonymousClass0QW) it3.next();
                if (C08270df.A05(2)) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("SpecialEffectsController: ");
                    if (A042) {
                        str = "";
                    } else {
                        StringBuilder A0o4 = AnonymousClass001.A0o();
                        A0o4.append("Container ");
                        A0o4.append(viewGroup);
                        str = AnonymousClass000.A0X(" is not attached to window. ", A0o4);
                    }
                    A0o3.append(str);
                    AnonymousClass000.A18(r42, "Cancelling pending operation ", "FragmentManager", A0o3);
                }
                r42.A02();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0272, code lost:
        if (r0 != null) goto L_0x0274;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0276, code lost:
        if (r13 == null) goto L_0x0278;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0278, code lost:
        r13 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x027c, code lost:
        r11 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x0281, code lost:
        if (r11 >= r13.size()) goto L_0x029e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0283, code lost:
        r16 = r10.indexOf(r13.get(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028f, code lost:
        if (r16 == -1) goto L_0x029b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0291, code lost:
        r10.set(r16, r14.get(r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029b, code lost:
        r11 = r11 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029e, code lost:
        r0 = r12.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a0, code lost:
        if (r0 == null) goto L_0x02a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a2, code lost:
        r11 = r0.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02a4, code lost:
        if (r11 != null) goto L_0x02aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02a6, code lost:
        r11 = X.AnonymousClass001.A0s();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02aa, code lost:
        r16 = r10.size();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02b1, code lost:
        if (r14 >= r16) goto L_0x02c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02b3, code lost:
        r26.put(r10.get(r14), r11.get(r14));
        r14 = r14 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c7, code lost:
        if (X.C08270df.A05(2) == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02c9, code lost:
        android.util.Log.v("FragmentManager", ">>> entering view names <<<");
        r14 = r11.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x02d8, code lost:
        if (r14.hasNext() == false) goto L_0x02e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x02da, code lost:
        android.util.Log.v("FragmentManager", X.AnonymousClass000.A0T("Name: ", X.AnonymousClass001.A0m(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x02e6, code lost:
        android.util.Log.v("FragmentManager", ">>> exiting view names <<<");
        r14 = r10.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x02f3, code lost:
        if (r14.hasNext() == false) goto L_0x0301;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x02f5, code lost:
        android.util.Log.v("FragmentManager", X.AnonymousClass000.A0T("Name: ", X.AnonymousClass001.A0m(r14)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0301, code lost:
        r13 = new X.AnonymousClass05C();
        r7.A08(r18.A0B, r13);
        X.AnonymousClass0UU.A00(r10, r13);
        X.AnonymousClass0UU.A00(r13.keySet(), r26);
        r14 = new X.AnonymousClass05C();
        r7.A08(r12.A0B, r14);
        X.AnonymousClass0UU.A00(r11, r14);
        X.AnonymousClass0UU.A00(r26.values(), r14);
        r12 = r26.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x0331, code lost:
        r12 = r12 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x0333, code lost:
        if (r12 < 0) goto L_0x0347;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x033f, code lost:
        if (r14.containsKey(X.C06290Wz.A00(r26, r12)) != false) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0341, code lost:
        r26.A07(r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0347, code lost:
        X.C010107z.A00(r13, r26.keySet());
        X.C010107z.A00(r14, r26.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0359, code lost:
        if (r26.isEmpty() == false) goto L_0x0364;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x035b, code lost:
        r28.clear();
        r27.clear();
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0364, code lost:
        X.C07000aA.A00(r2, new X.C12930mM(r14, r7, r5, r6));
        r28.addAll(r13.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0379, code lost:
        if (r10.isEmpty() != false) goto L_0x0389;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x037b, code lost:
        r9 = (android.view.View) r13.get(r10.get(0));
        r8.A09(r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0389, code lost:
        r27.addAll(r14.values());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0396, code lost:
        if (r11.isEmpty() != false) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0398, code lost:
        r11 = (android.view.View) r14.get(r11.get(0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x03a3, code lost:
        if (r11 == null) goto L_0x03b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x03a5, code lost:
        X.C07000aA.A00(r2, new X.C12940mN(r29, r11, r7, r8));
        r25 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x03b1, code lost:
        r8.A0B(r0, r1, r28);
        r8.A0E(r1, (java.lang.Object) null, (java.lang.Object) null, r1, (java.util.ArrayList) null, (java.util.ArrayList) null, r27);
        r0 = java.lang.Boolean.TRUE;
        r3.put(r6, r0);
        r3.put(r5, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02() {
        /*
            r41 = this;
            r22 = r41
            r0 = r22
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x001a
            r0 = r22
            android.view.ViewGroup r0 = r0.A02
            boolean r0 = X.C06360Xi.A04(r0)
            if (r0 != 0) goto L_0x001b
            r22.A03()
            r1 = 0
            r0 = r22
            r0.A01 = r1
        L_0x001a:
            return
        L_0x001b:
            r0 = r22
            java.util.ArrayList r0 = r0.A03
            r20 = r0
            monitor-enter(r20)
            boolean r0 = r20.isEmpty()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x079d
            r0 = r22
            java.util.ArrayList r5 = r0.A04     // Catch:{ all -> 0x079f }
            java.util.ArrayList r0 = X.AnonymousClass002.A0J(r5)     // Catch:{ all -> 0x079f }
            r5.clear()     // Catch:{ all -> 0x079f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x079f }
        L_0x0037:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x079f }
            r21 = 2
            if (r0 == 0) goto L_0x0061
            java.lang.Object r3 = r4.next()     // Catch:{ all -> 0x079f }
            X.0QW r3 = (X.AnonymousClass0QW) r3     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0056
            java.lang.String r2 = "FragmentManager"
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "SpecialEffectsController: Cancelling operation "
            X.AnonymousClass000.A18(r3, r0, r2, r1)     // Catch:{ all -> 0x079f }
        L_0x0056:
            r3.A02()     // Catch:{ all -> 0x079f }
            boolean r0 = r3.A03     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x0037
            r5.add(r3)     // Catch:{ all -> 0x079f }
            goto L_0x0037
        L_0x0061:
            r22.A05()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r2 = X.AnonymousClass002.A0J(r20)     // Catch:{ all -> 0x079f }
            r20.clear()     // Catch:{ all -> 0x079f }
            r5.addAll(r2)     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x007b
            java.lang.String r1 = "FragmentManager"
            java.lang.String r0 = "SpecialEffectsController: Executing pending operations"
            android.util.Log.v(r1, r0)     // Catch:{ all -> 0x079f }
        L_0x007b:
            java.util.Iterator r1 = r2.iterator()     // Catch:{ all -> 0x079f }
        L_0x007f:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x008f
            java.lang.Object r0 = r1.next()     // Catch:{ all -> 0x079f }
            X.0QW r0 = (X.AnonymousClass0QW) r0     // Catch:{ all -> 0x079f }
            r0.A01()     // Catch:{ all -> 0x079f }
            goto L_0x007f
        L_0x008f:
            r0 = r22
            boolean r1 = r0.A01     // Catch:{ all -> 0x079f }
            r7 = r22
            X.07z r7 = (X.C010107z) r7     // Catch:{ all -> 0x079f }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x079f }
            r6 = 0
            r5 = r6
        L_0x009d:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x079f }
            r9 = 3
            if (r0 == 0) goto L_0x00d2
            java.lang.Object r8 = r10.next()     // Catch:{ all -> 0x079f }
            X.0QW r8 = (X.AnonymousClass0QW) r8     // Catch:{ all -> 0x079f }
            X.0eF r0 = r8.A04     // Catch:{ all -> 0x079f }
            android.view.View r0 = r0.A0B     // Catch:{ all -> 0x079f }
            X.0GJ r4 = X.AnonymousClass0GJ.A01(r0)     // Catch:{ all -> 0x079f }
            X.0GJ r0 = r8.A01     // Catch:{ all -> 0x079f }
            int r3 = r0.ordinal()     // Catch:{ all -> 0x079f }
            r0 = r21
            if (r3 == r0) goto L_0x00ca
            if (r3 == r9) goto L_0x00ca
            r0 = 0
            if (r3 == r0) goto L_0x00ca
            r0 = 1
            if (r3 != r0) goto L_0x009d
            X.0GJ r0 = X.AnonymousClass0GJ.VISIBLE     // Catch:{ all -> 0x079f }
            if (r4 == r0) goto L_0x009d
            r5 = r8
            goto L_0x009d
        L_0x00ca:
            X.0GJ r0 = X.AnonymousClass0GJ.VISIBLE     // Catch:{ all -> 0x079f }
            if (r4 != r0) goto L_0x009d
            if (r6 != 0) goto L_0x009d
            r6 = r8
            goto L_0x009d
        L_0x00d2:
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            java.lang.String r23 = " to "
            java.lang.String r4 = "FragmentManager"
            if (r0 == 0) goto L_0x00ed
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Executing operations from "
            r3.append(r0)     // Catch:{ all -> 0x079f }
            r3.append(r6)     // Catch:{ all -> 0x079f }
            r0 = r23
            X.AnonymousClass000.A18(r5, r0, r4, r3)     // Catch:{ all -> 0x079f }
        L_0x00ed:
            java.util.ArrayList r32 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r31 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r24 = X.AnonymousClass002.A0J(r2)     // Catch:{ all -> 0x079f }
            int r0 = X.AnonymousClass002.A03(r2)     // Catch:{ all -> 0x079f }
            java.lang.Object r0 = r2.get(r0)     // Catch:{ all -> 0x079f }
            X.0QW r0 = (X.AnonymousClass0QW) r0     // Catch:{ all -> 0x079f }
            X.0eF r8 = r0.A04     // Catch:{ all -> 0x079f }
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x079f }
        L_0x0109:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x012c
            java.lang.Object r0 = r10.next()     // Catch:{ all -> 0x079f }
            X.0QW r0 = (X.AnonymousClass0QW) r0     // Catch:{ all -> 0x079f }
            X.0eF r0 = r0.A04     // Catch:{ all -> 0x079f }
            X.0Mp r3 = r0.A0D     // Catch:{ all -> 0x079f }
            X.0Mp r9 = r8.A0D     // Catch:{ all -> 0x079f }
            int r0 = r9.A01     // Catch:{ all -> 0x079f }
            r3.A01 = r0     // Catch:{ all -> 0x079f }
            int r0 = r9.A02     // Catch:{ all -> 0x079f }
            r3.A02 = r0     // Catch:{ all -> 0x079f }
            int r0 = r9.A04     // Catch:{ all -> 0x079f }
            r3.A04 = r0     // Catch:{ all -> 0x079f }
            int r0 = r9.A05     // Catch:{ all -> 0x079f }
            r3.A05 = r0     // Catch:{ all -> 0x079f }
            goto L_0x0109
        L_0x012c:
            java.util.Iterator r10 = r2.iterator()     // Catch:{ all -> 0x079f }
        L_0x0130:
            boolean r0 = r10.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x017f
            java.lang.Object r3 = r10.next()     // Catch:{ all -> 0x079f }
            X.0QW r3 = (X.AnonymousClass0QW) r3     // Catch:{ all -> 0x079f }
            X.0QU r0 = new X.0QU     // Catch:{ all -> 0x079f }
            r0.<init>()     // Catch:{ all -> 0x079f }
            r3.A01()     // Catch:{ all -> 0x079f }
            java.util.HashSet r9 = r3.A06     // Catch:{ all -> 0x079f }
            r9.add(r0)     // Catch:{ all -> 0x079f }
            X.07h r2 = new X.07h     // Catch:{ all -> 0x079f }
            r2.<init>(r0, r3, r1)     // Catch:{ all -> 0x079f }
            r0 = r32
            r0.add(r2)     // Catch:{ all -> 0x079f }
            X.0QU r8 = new X.0QU     // Catch:{ all -> 0x079f }
            r8.<init>()     // Catch:{ all -> 0x079f }
            r3.A01()     // Catch:{ all -> 0x079f }
            r9.add(r8)     // Catch:{ all -> 0x079f }
            r0 = 0
            if (r1 == 0) goto L_0x0165
            if (r3 != r6) goto L_0x0168
        L_0x0163:
            r0 = 1
            goto L_0x0168
        L_0x0165:
            if (r3 != r5) goto L_0x0168
            goto L_0x0163
        L_0x0168:
            X.07g r2 = new X.07g     // Catch:{ all -> 0x079f }
            r2.<init>(r8, r3, r1, r0)     // Catch:{ all -> 0x079f }
            r0 = r31
            r0.add(r2)     // Catch:{ all -> 0x079f }
            X.0lq r2 = new X.0lq     // Catch:{ all -> 0x079f }
            r0 = r24
            r2.<init>(r7, r3, r0)     // Catch:{ all -> 0x079f }
            java.util.List r0 = r3.A07     // Catch:{ all -> 0x079f }
            r0.add(r2)     // Catch:{ all -> 0x079f }
            goto L_0x0130
        L_0x017f:
            java.util.HashMap r3 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x079f }
            java.util.Iterator r11 = r31.iterator()     // Catch:{ all -> 0x079f }
            r8 = 0
        L_0x0188:
            boolean r0 = r11.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x01f5
            java.lang.Object r10 = r11.next()     // Catch:{ all -> 0x079f }
            X.07g r10 = (X.C009307g) r10     // Catch:{ all -> 0x079f }
            boolean r0 = r10.A01()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x0188
            java.lang.Object r2 = r10.A01     // Catch:{ all -> 0x079f }
            X.0WL r1 = r10.A02(r2)     // Catch:{ all -> 0x079f }
            java.lang.Object r9 = r10.A00     // Catch:{ all -> 0x079f }
            X.0WL r0 = r10.A02(r9)     // Catch:{ all -> 0x079f }
            if (r1 == 0) goto L_0x01ad
            if (r0 == 0) goto L_0x01ae
            if (r1 == r0) goto L_0x01ae
            goto L_0x01b7
        L_0x01ad:
            r1 = r0
        L_0x01ae:
            if (r8 != 0) goto L_0x01b2
            r8 = r1
            goto L_0x0188
        L_0x01b2:
            if (r1 == 0) goto L_0x0188
            if (r8 == r1) goto L_0x0188
            goto L_0x01d6
        L_0x01b7:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            X.0QW r0 = r10.A01     // Catch:{ all -> 0x079f }
            X.0eF r0 = r0.A04     // Catch:{ all -> 0x079f }
            r1.append(r0)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            r1.append(r2)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " which uses a different Transition  type than its shared element transition "
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0E(r9, r0, r1)     // Catch:{ all -> 0x079f }
            goto L_0x01f4
        L_0x01d6:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Mixing framework transitions and AndroidX transitions is not allowed. Fragment "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            X.0QW r0 = r10.A01     // Catch:{ all -> 0x079f }
            X.0eF r0 = r0.A04     // Catch:{ all -> 0x079f }
            r1.append(r0)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " returned Transition "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            r1.append(r2)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " which uses a different Transition  type than other Fragments."
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0F(r0, r1)     // Catch:{ all -> 0x079f }
        L_0x01f4:
            throw r0     // Catch:{ all -> 0x079f }
        L_0x01f5:
            if (r8 != 0) goto L_0x0212
            java.util.Iterator r8 = r31.iterator()     // Catch:{ all -> 0x079f }
        L_0x01fb:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0604
            java.lang.Object r2 = r8.next()     // Catch:{ all -> 0x079f }
            X.0OK r2 = (X.AnonymousClass0OK) r2     // Catch:{ all -> 0x079f }
            X.0QW r1 = r2.A01     // Catch:{ all -> 0x079f }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x079f }
            r3.put(r1, r0)     // Catch:{ all -> 0x079f }
            r2.A00()     // Catch:{ all -> 0x079f }
            goto L_0x01fb
        L_0x0212:
            android.view.ViewGroup r2 = r7.A02     // Catch:{ all -> 0x079f }
            android.content.Context r1 = r2.getContext()     // Catch:{ all -> 0x079f }
            android.view.View r30 = new android.view.View     // Catch:{ all -> 0x079f }
            r0 = r30
            r0.<init>(r1)     // Catch:{ all -> 0x079f }
            android.graphics.Rect r29 = X.AnonymousClass001.A0N()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r28 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r27 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            X.05C r26 = new X.05C     // Catch:{ all -> 0x079f }
            r26.<init>()     // Catch:{ all -> 0x079f }
            java.util.Iterator r17 = r31.iterator()     // Catch:{ all -> 0x079f }
            r1 = 0
            r9 = 0
            r25 = 0
        L_0x0238:
            boolean r0 = r17.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x03d5
            java.lang.Object r0 = r17.next()     // Catch:{ all -> 0x079f }
            X.07g r0 = (X.C009307g) r0     // Catch:{ all -> 0x079f }
            java.lang.Object r0 = r0.A00     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0238
            if (r6 == 0) goto L_0x0238
            if (r5 == 0) goto L_0x0238
            java.lang.Object r0 = r8.A03(r0)     // Catch:{ all -> 0x079f }
            java.lang.Object r1 = r8.A04(r0)     // Catch:{ all -> 0x079f }
            X.0eF r12 = r5.A04     // Catch:{ all -> 0x079f }
            X.0Mp r0 = r12.A0D     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x025e
            java.util.ArrayList r10 = r0.A0C     // Catch:{ all -> 0x079f }
            if (r10 != 0) goto L_0x0262
        L_0x025e:
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
        L_0x0262:
            X.0eF r0 = r6.A04     // Catch:{ all -> 0x079f }
            r18 = r0
            X.0Mp r0 = r0.A0D     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x026e
            java.util.ArrayList r14 = r0.A0C     // Catch:{ all -> 0x079f }
            if (r14 != 0) goto L_0x0274
        L_0x026e:
            java.util.ArrayList r14 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0278
        L_0x0274:
            java.util.ArrayList r13 = r0.A0D     // Catch:{ all -> 0x079f }
            if (r13 != 0) goto L_0x027c
        L_0x0278:
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
        L_0x027c:
            r11 = 0
        L_0x027d:
            int r0 = r13.size()     // Catch:{ all -> 0x079f }
            if (r11 >= r0) goto L_0x029e
            java.lang.Object r0 = r13.get(r11)     // Catch:{ all -> 0x079f }
            int r16 = r10.indexOf(r0)     // Catch:{ all -> 0x079f }
            r0 = -1
            r15 = r0
            r0 = r16
            if (r0 == r15) goto L_0x029b
            java.lang.Object r0 = r14.get(r11)     // Catch:{ all -> 0x079f }
            r15 = r0
            r0 = r16
            r10.set(r0, r15)     // Catch:{ all -> 0x079f }
        L_0x029b:
            int r11 = r11 + 1
            goto L_0x027d
        L_0x029e:
            X.0Mp r0 = r12.A0D     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x02a6
            java.util.ArrayList r11 = r0.A0D     // Catch:{ all -> 0x079f }
            if (r11 != 0) goto L_0x02aa
        L_0x02a6:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
        L_0x02aa:
            int r16 = r10.size()     // Catch:{ all -> 0x079f }
            r14 = 0
        L_0x02af:
            r0 = r16
            if (r14 >= r0) goto L_0x02c3
            java.lang.Object r15 = r10.get(r14)     // Catch:{ all -> 0x079f }
            java.lang.Object r13 = r11.get(r14)     // Catch:{ all -> 0x079f }
            r0 = r26
            r0.put(r15, r13)     // Catch:{ all -> 0x079f }
            int r14 = r14 + 1
            goto L_0x02af
        L_0x02c3:
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0301
            java.lang.String r0 = ">>> entering view names <<<"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            java.util.Iterator r14 = r11.iterator()     // Catch:{ all -> 0x079f }
        L_0x02d2:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x079f }
            java.lang.String r13 = "Name: "
            if (r0 == 0) goto L_0x02e6
            java.lang.String r0 = X.AnonymousClass001.A0m(r14)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = X.AnonymousClass000.A0T(r13, r0)     // Catch:{ all -> 0x079f }
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            goto L_0x02d2
        L_0x02e6:
            java.lang.String r0 = ">>> exiting view names <<<"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            java.util.Iterator r14 = r10.iterator()     // Catch:{ all -> 0x079f }
        L_0x02ef:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0301
            java.lang.String r0 = X.AnonymousClass001.A0m(r14)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = X.AnonymousClass000.A0T(r13, r0)     // Catch:{ all -> 0x079f }
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            goto L_0x02ef
        L_0x0301:
            X.05C r13 = new X.05C     // Catch:{ all -> 0x079f }
            r13.<init>()     // Catch:{ all -> 0x079f }
            r0 = r18
            android.view.View r0 = r0.A0B     // Catch:{ all -> 0x079f }
            r7.A08(r0, r13)     // Catch:{ all -> 0x079f }
            X.AnonymousClass0UU.A00(r10, r13)     // Catch:{ all -> 0x079f }
            java.util.Set r14 = r13.keySet()     // Catch:{ all -> 0x079f }
            r0 = r26
            X.AnonymousClass0UU.A00(r14, r0)     // Catch:{ all -> 0x079f }
            X.05C r14 = new X.05C     // Catch:{ all -> 0x079f }
            r14.<init>()     // Catch:{ all -> 0x079f }
            android.view.View r0 = r12.A0B     // Catch:{ all -> 0x079f }
            r7.A08(r0, r14)     // Catch:{ all -> 0x079f }
            X.AnonymousClass0UU.A00(r11, r14)     // Catch:{ all -> 0x079f }
            java.util.Collection r0 = r26.values()     // Catch:{ all -> 0x079f }
            X.AnonymousClass0UU.A00(r0, r14)     // Catch:{ all -> 0x079f }
            int r12 = r26.size()     // Catch:{ all -> 0x079f }
        L_0x0331:
            int r12 = r12 + -1
            if (r12 < 0) goto L_0x0347
            r0 = r26
            java.lang.Object r0 = X.C06290Wz.A00(r0, r12)     // Catch:{ all -> 0x079f }
            boolean r0 = r14.containsKey(r0)     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x0331
            r0 = r26
            r0.A07(r12)     // Catch:{ all -> 0x079f }
            goto L_0x0331
        L_0x0347:
            java.util.Set r0 = r26.keySet()     // Catch:{ all -> 0x079f }
            X.C010107z.A00(r13, r0)     // Catch:{ all -> 0x079f }
            java.util.Collection r0 = r26.values()     // Catch:{ all -> 0x079f }
            X.C010107z.A00(r14, r0)     // Catch:{ all -> 0x079f }
            boolean r0 = r26.isEmpty()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0364
            r28.clear()     // Catch:{ all -> 0x079f }
            r27.clear()     // Catch:{ all -> 0x079f }
            r1 = 0
            goto L_0x0238
        L_0x0364:
            X.0mM r0 = new X.0mM     // Catch:{ all -> 0x079f }
            r0.<init>(r14, r7, r5, r6)     // Catch:{ all -> 0x079f }
            X.C07000aA.A00(r2, r0)     // Catch:{ all -> 0x079f }
            java.util.Collection r12 = r13.values()     // Catch:{ all -> 0x079f }
            r0 = r28
            r0.addAll(r12)     // Catch:{ all -> 0x079f }
            boolean r0 = r10.isEmpty()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x0389
            r0 = 0
            java.lang.Object r0 = r10.get(r0)     // Catch:{ all -> 0x079f }
            java.lang.Object r9 = r13.get(r0)     // Catch:{ all -> 0x079f }
            android.view.View r9 = (android.view.View) r9     // Catch:{ all -> 0x079f }
            r8.A09(r9, r1)     // Catch:{ all -> 0x079f }
        L_0x0389:
            java.util.Collection r10 = r14.values()     // Catch:{ all -> 0x079f }
            r0 = r27
            r0.addAll(r10)     // Catch:{ all -> 0x079f }
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x03b1
            r0 = 0
            java.lang.Object r0 = r11.get(r0)     // Catch:{ all -> 0x079f }
            java.lang.Object r11 = r14.get(r0)     // Catch:{ all -> 0x079f }
            android.view.View r11 = (android.view.View) r11     // Catch:{ all -> 0x079f }
            if (r11 == 0) goto L_0x03b1
            X.0mN r10 = new X.0mN     // Catch:{ all -> 0x079f }
            r0 = r29
            r10.<init>(r0, r11, r7, r8)     // Catch:{ all -> 0x079f }
            X.C07000aA.A00(r2, r10)     // Catch:{ all -> 0x079f }
            r25 = 1
        L_0x03b1:
            r10 = r30
            r0 = r28
            r8.A0B(r10, r1, r0)     // Catch:{ all -> 0x079f }
            r35 = 0
            r37 = r1
            r38 = r35
            r39 = r35
            r33 = r8
            r34 = r1
            r36 = r35
            r40 = r27
            r33.A0E(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x079f }
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x079f }
            r3.put(r6, r0)     // Catch:{ all -> 0x079f }
            r3.put(r5, r0)     // Catch:{ all -> 0x079f }
            goto L_0x0238
        L_0x03d5:
            java.util.ArrayList r19 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            java.util.Iterator r18 = r31.iterator()     // Catch:{ all -> 0x079f }
            r10 = 0
            r17 = 0
        L_0x03e0:
            boolean r0 = r18.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x04a0
            java.lang.Object r11 = r18.next()     // Catch:{ all -> 0x079f }
            X.07g r11 = (X.C009307g) r11     // Catch:{ all -> 0x079f }
            boolean r0 = r11.A01()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x03fd
            X.0QW r12 = r11.A01     // Catch:{ all -> 0x079f }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x079f }
            r3.put(r12, r0)     // Catch:{ all -> 0x079f }
            r11.A00()     // Catch:{ all -> 0x079f }
            goto L_0x03e0
        L_0x03fd:
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x079f }
            java.lang.Object r12 = r8.A03(r0)     // Catch:{ all -> 0x079f }
            X.0QW r13 = r11.A01     // Catch:{ all -> 0x079f }
            if (r1 == 0) goto L_0x040d
            if (r13 == r6) goto L_0x040b
            if (r13 != r5) goto L_0x040d
        L_0x040b:
            r15 = 1
            goto L_0x040e
        L_0x040d:
            r15 = 0
        L_0x040e:
            if (r12 != 0) goto L_0x041b
            if (r15 != 0) goto L_0x03e0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x079f }
            r3.put(r13, r0)     // Catch:{ all -> 0x079f }
            r11.A00()     // Catch:{ all -> 0x079f }
            goto L_0x03e0
        L_0x041b:
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            X.0eF r14 = r13.A04     // Catch:{ all -> 0x079f }
            android.view.View r0 = r14.A0B     // Catch:{ all -> 0x079f }
            r7.A07(r0, r11)     // Catch:{ all -> 0x079f }
            if (r15 == 0) goto L_0x0435
            if (r13 != r6) goto L_0x0430
            r0 = r28
            r11.removeAll(r0)     // Catch:{ all -> 0x079f }
            goto L_0x0435
        L_0x0430:
            r0 = r27
            r11.removeAll(r0)     // Catch:{ all -> 0x079f }
        L_0x0435:
            boolean r0 = r11.isEmpty()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x044c
            r0 = r30
            r8.A08(r0, r12)     // Catch:{ all -> 0x079f }
        L_0x0440:
            X.0GJ r14 = r13.A01     // Catch:{ all -> 0x079f }
            X.0GJ r0 = X.AnonymousClass0GJ.VISIBLE     // Catch:{ all -> 0x079f }
            if (r14 != r0) goto L_0x0490
            r0 = r19
            r0.addAll(r11)     // Catch:{ all -> 0x079f }
            goto L_0x0488
        L_0x044c:
            r8.A0F(r12, r11)     // Catch:{ all -> 0x079f }
            r35 = r12
            r37 = r10
            r39 = r10
            r40 = r10
            r33 = r8
            r34 = r12
            r36 = r10
            r38 = r11
            r33.A0E(r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x079f }
            X.0GJ r0 = r13.A01     // Catch:{ all -> 0x079f }
            r15 = r0
            X.0GJ r0 = X.AnonymousClass0GJ.GONE     // Catch:{ all -> 0x079f }
            if (r15 != r0) goto L_0x0440
            r0 = r24
            r0.remove(r13)     // Catch:{ all -> 0x079f }
            java.util.ArrayList r16 = X.AnonymousClass002.A0J(r11)     // Catch:{ all -> 0x079f }
            android.view.View r0 = r14.A0B     // Catch:{ all -> 0x079f }
            r15 = r0
            r0 = r16
            r0.remove(r15)     // Catch:{ all -> 0x079f }
            android.view.View r14 = r14.A0B     // Catch:{ all -> 0x079f }
            r8.A0A(r14, r12, r0)     // Catch:{ all -> 0x079f }
            X.0kY r0 = new X.0kY     // Catch:{ all -> 0x079f }
            r0.<init>(r7, r11)     // Catch:{ all -> 0x079f }
            X.C07000aA.A00(r2, r0)     // Catch:{ all -> 0x079f }
            goto L_0x0440
        L_0x0488:
            if (r25 == 0) goto L_0x0493
            r0 = r29
            r8.A07(r0, r12)     // Catch:{ all -> 0x079f }
            goto L_0x0493
        L_0x0490:
            r8.A09(r9, r12)     // Catch:{ all -> 0x079f }
        L_0x0493:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x079f }
            r3.put(r13, r0)     // Catch:{ all -> 0x079f }
            r0 = r17
            java.lang.Object r17 = r8.A06(r0, r12, r10)     // Catch:{ all -> 0x079f }
            goto L_0x03e0
        L_0x04a0:
            r0 = r17
            java.lang.Object r11 = r8.A05(r0, r10, r1)     // Catch:{ all -> 0x079f }
            if (r11 == 0) goto L_0x0604
            java.util.Iterator r15 = r31.iterator()     // Catch:{ all -> 0x079f }
        L_0x04ac:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x04fd
            java.lang.Object r14 = r15.next()     // Catch:{ all -> 0x079f }
            X.07g r14 = (X.C009307g) r14     // Catch:{ all -> 0x079f }
            boolean r0 = r14.A01()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x04ac
            java.lang.Object r9 = r14.A01     // Catch:{ all -> 0x079f }
            X.0QW r13 = r14.A01     // Catch:{ all -> 0x079f }
            if (r1 == 0) goto L_0x04ca
            if (r13 == r6) goto L_0x04c8
            if (r13 != r5) goto L_0x04ca
        L_0x04c8:
            r0 = 1
            goto L_0x04cb
        L_0x04ca:
            r0 = 0
        L_0x04cb:
            if (r9 != 0) goto L_0x04cf
            if (r0 == 0) goto L_0x04ac
        L_0x04cf:
            boolean r0 = X.C06360Xi.A05(r2)     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x04f0
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x04ec
            java.lang.StringBuilder r9 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "SpecialEffectsController: Container "
            r9.append(r0)     // Catch:{ all -> 0x079f }
            r9.append(r2)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " has not been laid out. Completing operation "
            X.AnonymousClass000.A18(r13, r0, r4, r9)     // Catch:{ all -> 0x079f }
        L_0x04ec:
            r14.A00()     // Catch:{ all -> 0x079f }
            goto L_0x04ac
        L_0x04f0:
            X.0eF r12 = r13.A04     // Catch:{ all -> 0x079f }
            X.0QU r9 = r14.A00     // Catch:{ all -> 0x079f }
            X.0lr r0 = new X.0lr     // Catch:{ all -> 0x079f }
            r0.<init>(r14, r7, r13)     // Catch:{ all -> 0x079f }
            r8.A0D(r9, r12, r11, r0)     // Catch:{ all -> 0x079f }
            goto L_0x04ac
        L_0x04fd:
            boolean r0 = X.C06360Xi.A05(r2)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0604
            r12 = 4
            int r9 = r19.size()     // Catch:{ all -> 0x079f }
        L_0x0508:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x0516
            r0 = r19
            android.view.View r0 = X.AnonymousClass001.A0S(r0, r9)     // Catch:{ all -> 0x079f }
            r0.setVisibility(r12)     // Catch:{ all -> 0x079f }
            goto L_0x0508
        L_0x0516:
            java.util.ArrayList r16 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            int r14 = r27.size()     // Catch:{ all -> 0x079f }
            r13 = 0
        L_0x051f:
            if (r13 >= r14) goto L_0x0536
            r0 = r27
            android.view.View r12 = X.AnonymousClass001.A0S(r0, r13)     // Catch:{ all -> 0x079f }
            java.lang.String r9 = X.AnonymousClass0YZ.A06(r12)     // Catch:{ all -> 0x079f }
            r0 = r16
            r0.add(r9)     // Catch:{ all -> 0x079f }
            X.AnonymousClass0YZ.A0F(r12, r10)     // Catch:{ all -> 0x079f }
            int r13 = r13 + 1
            goto L_0x051f
        L_0x0536:
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x058d
            java.lang.String r0 = ">>>>> Beginning transition <<<<<"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = ">>>>> SharedElementFirstOutViews <<<<<"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            java.util.Iterator r14 = r28.iterator()     // Catch:{ all -> 0x079f }
        L_0x054a:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x079f }
            java.lang.String r13 = " Name: "
            java.lang.String r12 = "View: "
            if (r0 == 0) goto L_0x0569
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x079f }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x079f }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0k(r0, r12)     // Catch:{ all -> 0x079f }
            r9.append(r13)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r0)     // Catch:{ all -> 0x079f }
            X.AnonymousClass000.A1E(r0, r4, r9)     // Catch:{ all -> 0x079f }
            goto L_0x054a
        L_0x0569:
            java.lang.String r0 = ">>>>> SharedElementLastInViews <<<<<"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
            java.util.Iterator r14 = r27.iterator()     // Catch:{ all -> 0x079f }
        L_0x0572:
            boolean r0 = r14.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x058d
            java.lang.Object r0 = r14.next()     // Catch:{ all -> 0x079f }
            android.view.View r0 = (android.view.View) r0     // Catch:{ all -> 0x079f }
            java.lang.StringBuilder r9 = X.AnonymousClass000.A0k(r0, r12)     // Catch:{ all -> 0x079f }
            r9.append(r13)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r0)     // Catch:{ all -> 0x079f }
            X.AnonymousClass000.A1E(r0, r4, r9)     // Catch:{ all -> 0x079f }
            goto L_0x0572
        L_0x058d:
            r8.A0C(r2, r11)     // Catch:{ all -> 0x079f }
            int r12 = r27.size()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r15 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            r11 = 0
        L_0x0599:
            if (r11 >= r12) goto L_0x05d4
            r0 = r28
            android.view.View r13 = X.AnonymousClass001.A0S(r0, r11)     // Catch:{ all -> 0x079f }
            java.lang.String r9 = X.AnonymousClass0YZ.A06(r13)     // Catch:{ all -> 0x079f }
            r15.add(r9)     // Catch:{ all -> 0x079f }
            if (r9 == 0) goto L_0x05d1
            X.AnonymousClass0YZ.A0F(r13, r10)     // Catch:{ all -> 0x079f }
            r0 = r26
            java.lang.Object r14 = r0.get(r9)     // Catch:{ all -> 0x079f }
            java.lang.String r14 = (java.lang.String) r14     // Catch:{ all -> 0x079f }
            r13 = 0
        L_0x05b6:
            if (r13 >= r12) goto L_0x05d1
            r0 = r16
            java.lang.Object r0 = r0.get(r13)     // Catch:{ all -> 0x079f }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x05ce
            r0 = r27
            android.view.View r0 = X.AnonymousClass001.A0S(r0, r13)     // Catch:{ all -> 0x079f }
            X.AnonymousClass0YZ.A0F(r0, r9)     // Catch:{ all -> 0x079f }
            goto L_0x05d1
        L_0x05ce:
            int r13 = r13 + 1
            goto L_0x05b6
        L_0x05d1:
            int r11 = r11 + 1
            goto L_0x0599
        L_0x05d4:
            X.0mg r0 = new X.0mg     // Catch:{ all -> 0x079f }
            r33 = r0
            r34 = r8
            r35 = r27
            r36 = r16
            r37 = r28
            r38 = r15
            r39 = r12
            r33.<init>(r34, r35, r36, r37, r38, r39)     // Catch:{ all -> 0x079f }
            X.C07000aA.A00(r2, r0)     // Catch:{ all -> 0x079f }
            int r9 = r19.size()     // Catch:{ all -> 0x079f }
        L_0x05ee:
            int r9 = r9 + -1
            if (r9 < 0) goto L_0x05fd
            r0 = r19
            android.view.View r2 = X.AnonymousClass001.A0S(r0, r9)     // Catch:{ all -> 0x079f }
            r0 = 0
            r2.setVisibility(r0)     // Catch:{ all -> 0x079f }
            goto L_0x05ee
        L_0x05fd:
            r2 = r28
            r0 = r27
            r8.A0G(r1, r2, r0)     // Catch:{ all -> 0x079f }
        L_0x0604:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x079f }
            boolean r17 = r3.containsValue(r0)     // Catch:{ all -> 0x079f }
            android.view.ViewGroup r9 = r7.A02     // Catch:{ all -> 0x079f }
            android.content.Context r8 = r9.getContext()     // Catch:{ all -> 0x079f }
            java.util.ArrayList r12 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x079f }
            java.util.Iterator r16 = r32.iterator()     // Catch:{ all -> 0x079f }
            r15 = 0
        L_0x0619:
            boolean r0 = r16.hasNext()     // Catch:{ all -> 0x079f }
            java.lang.String r2 = " has started."
            if (r0 == 0) goto L_0x06b6
            java.lang.Object r13 = r16.next()     // Catch:{ all -> 0x079f }
            X.07h r13 = (X.C009407h) r13     // Catch:{ all -> 0x079f }
            boolean r0 = r13.A01()     // Catch:{ all -> 0x079f }
            if (r0 != 0) goto L_0x0662
            X.0T0 r0 = r13.A02(r8)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0662
            android.animation.Animator r11 = r0.A00     // Catch:{ all -> 0x079f }
            if (r11 != 0) goto L_0x063b
            r12.add(r13)     // Catch:{ all -> 0x079f }
            goto L_0x0619
        L_0x063b:
            X.0QW r10 = r13.A01     // Catch:{ all -> 0x079f }
            X.0eF r1 = r10.A04     // Catch:{ all -> 0x079f }
            java.lang.Boolean r14 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x079f }
            java.lang.Object r0 = r3.get(r10)     // Catch:{ all -> 0x079f }
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0666
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0662
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Ignoring Animator set on "
            r2.append(r0)     // Catch:{ all -> 0x079f }
            r2.append(r1)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " as this Fragment was involved in a Transition."
            X.AnonymousClass000.A1E(r0, r4, r2)     // Catch:{ all -> 0x079f }
        L_0x0662:
            r13.A00()     // Catch:{ all -> 0x079f }
            goto L_0x0619
        L_0x0666:
            X.0GJ r14 = r10.A01     // Catch:{ all -> 0x079f }
            X.0GJ r0 = X.AnonymousClass0GJ.GONE     // Catch:{ all -> 0x079f }
            r31 = 0
            if (r14 != r0) goto L_0x0675
            r31 = 1
            r0 = r24
            r0.remove(r10)     // Catch:{ all -> 0x079f }
        L_0x0675:
            android.view.View r1 = r1.A0B     // Catch:{ all -> 0x079f }
            r9.startViewTransition(r1)     // Catch:{ all -> 0x079f }
            X.006 r0 = new X.006     // Catch:{ all -> 0x079f }
            r27 = r9
            r28 = r13
            r29 = r7
            r30 = r10
            r25 = r0
            r26 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31)     // Catch:{ all -> 0x079f }
            r11.addListener(r0)     // Catch:{ all -> 0x079f }
            r11.setTarget(r1)     // Catch:{ all -> 0x079f }
            r11.start()     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x06a9
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Animator from operation "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            r1.append(r10)     // Catch:{ all -> 0x079f }
            X.AnonymousClass000.A1E(r2, r4, r1)     // Catch:{ all -> 0x079f }
        L_0x06a9:
            X.0QU r1 = r13.A00     // Catch:{ all -> 0x079f }
            X.0d4 r0 = new X.0d4     // Catch:{ all -> 0x079f }
            r0.<init>(r11, r7, r10)     // Catch:{ all -> 0x079f }
            r1.A03(r0)     // Catch:{ all -> 0x079f }
            r15 = 1
            goto L_0x0619
        L_0x06b6:
            java.util.Iterator r13 = r12.iterator()     // Catch:{ all -> 0x079f }
        L_0x06ba:
            boolean r0 = r13.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0759
            java.lang.Object r11 = r13.next()     // Catch:{ all -> 0x079f }
            X.07h r11 = (X.C009407h) r11     // Catch:{ all -> 0x079f }
            X.0QW r10 = r11.A01     // Catch:{ all -> 0x079f }
            X.0eF r3 = r10.A04     // Catch:{ all -> 0x079f }
            java.lang.String r1 = "Ignoring Animation set on "
            if (r17 == 0) goto L_0x06e1
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x06dd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r3, r1)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " as Animations cannot run alongside Transitions."
        L_0x06da:
            X.AnonymousClass000.A1E(r0, r4, r1)     // Catch:{ all -> 0x079f }
        L_0x06dd:
            r11.A00()     // Catch:{ all -> 0x079f }
            goto L_0x06ba
        L_0x06e1:
            if (r15 == 0) goto L_0x06f0
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x06dd
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0k(r3, r1)     // Catch:{ all -> 0x079f }
            java.lang.String r0 = " as Animations cannot run alongside Animators."
            goto L_0x06da
        L_0x06f0:
            android.view.View r3 = r3.A0B     // Catch:{ all -> 0x079f }
            X.0T0 r0 = r11.A02(r8)     // Catch:{ all -> 0x079f }
            r0.getClass()     // Catch:{ all -> 0x079f }
            android.view.animation.Animation r12 = r0.A01     // Catch:{ all -> 0x079f }
            r12.getClass()     // Catch:{ all -> 0x079f }
            X.0GJ r1 = r10.A01     // Catch:{ all -> 0x079f }
            X.0GJ r0 = X.AnonymousClass0GJ.REMOVED     // Catch:{ all -> 0x079f }
            if (r1 == r0) goto L_0x0721
            r3.startAnimation(r12)     // Catch:{ all -> 0x079f }
            r11.A00()     // Catch:{ all -> 0x079f }
        L_0x070a:
            X.0QU r1 = r11.A00     // Catch:{ all -> 0x079f }
            X.0d5 r0 = new X.0d5     // Catch:{ all -> 0x079f }
            r27 = r9
            r28 = r11
            r29 = r7
            r30 = r10
            r25 = r0
            r26 = r3
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x079f }
            r1.A03(r0)     // Catch:{ all -> 0x079f }
            goto L_0x0756
        L_0x0721:
            r9.startViewTransition(r3)     // Catch:{ all -> 0x079f }
            X.02w r1 = new X.02w     // Catch:{ all -> 0x079f }
            r1.<init>(r3, r9, r12)     // Catch:{ all -> 0x079f }
            X.0ae r0 = new X.0ae     // Catch:{ all -> 0x079f }
            r27 = r9
            r28 = r11
            r29 = r7
            r30 = r10
            r25 = r0
            r26 = r3
            r25.<init>(r26, r27, r28, r29, r30)     // Catch:{ all -> 0x079f }
            r1.setAnimationListener(r0)     // Catch:{ all -> 0x079f }
            r3.startAnimation(r1)     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x070a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Animation from operation "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            r1.append(r10)     // Catch:{ all -> 0x079f }
            X.AnonymousClass000.A1E(r2, r4, r1)     // Catch:{ all -> 0x079f }
            goto L_0x070a
        L_0x0756:
            r15 = 0
            goto L_0x06ba
        L_0x0759:
            java.util.Iterator r3 = r24.iterator()     // Catch:{ all -> 0x079f }
        L_0x075d:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x0773
            java.lang.Object r2 = r3.next()     // Catch:{ all -> 0x079f }
            X.0QW r2 = (X.AnonymousClass0QW) r2     // Catch:{ all -> 0x079f }
            X.0eF r0 = r2.A04     // Catch:{ all -> 0x079f }
            android.view.View r1 = r0.A0B     // Catch:{ all -> 0x079f }
            X.0GJ r0 = r2.A01     // Catch:{ all -> 0x079f }
            r0.A02(r1)     // Catch:{ all -> 0x079f }
            goto L_0x075d
        L_0x0773:
            r24.clear()     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x078d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x079f }
            java.lang.String r0 = "Completed executing operations from "
            r1.append(r0)     // Catch:{ all -> 0x079f }
            r1.append(r6)     // Catch:{ all -> 0x079f }
            r0 = r23
            X.AnonymousClass000.A18(r5, r0, r4, r1)     // Catch:{ all -> 0x079f }
        L_0x078d:
            r1 = 0
            r0 = r22
            r0.A01 = r1     // Catch:{ all -> 0x079f }
            boolean r0 = X.C08270df.A05(r21)     // Catch:{ all -> 0x079f }
            if (r0 == 0) goto L_0x079d
            java.lang.String r0 = "SpecialEffectsController: Finished executing pending operations"
            android.util.Log.v(r4, r0)     // Catch:{ all -> 0x079f }
        L_0x079d:
            monitor-exit(r20)     // Catch:{ all -> 0x079f }
            return
        L_0x079f:
            r0 = move-exception
            monitor-exit(r20)     // Catch:{ all -> 0x079f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UN.A02():void");
    }

    public void A04() {
        boolean z;
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            A05();
            this.A00 = false;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                AnonymousClass0QW r3 = (AnonymousClass0QW) arrayList.get(size);
                AnonymousClass0GJ A012 = AnonymousClass0GJ.A01(r3.A04.A0B);
                AnonymousClass0GJ r1 = r3.A01;
                AnonymousClass0GJ r0 = AnonymousClass0GJ.VISIBLE;
                if (r1 == r0 && A012 != r0) {
                    C04050Mp r02 = r3.A04.A0D;
                    if (r02 == null) {
                        z = false;
                    } else {
                        z = r02.A0E;
                    }
                    this.A00 = z;
                }
            }
        }
    }

    public final void A05() {
        Iterator it = this.A03.iterator();
        while (it.hasNext()) {
            AnonymousClass0QW r2 = (AnonymousClass0QW) it.next();
            if (r2.A00 == C02160Fc.ADDING) {
                r2.A03(C02160Fc.NONE, AnonymousClass0GJ.A00(r2.A04.A0J().getVisibility()));
            }
        }
    }

    public final void A06(AnonymousClass0WE r7, C02160Fc r8, AnonymousClass0GJ r9) {
        ArrayList arrayList = this.A03;
        synchronized (arrayList) {
            AnonymousClass0QU r5 = new AnonymousClass0QU();
            C08310eF r4 = r7.A02;
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    AnonymousClass0QW r2 = new AnonymousClass0QW(r5, r7, r8, r9);
                    arrayList.add(r2);
                    C11860ka r0 = new C11860ka(r2, this);
                    List list = r2.A07;
                    list.add(r0);
                    list.add(new C11870kb(r2, this));
                    break;
                }
                AnonymousClass0QW r1 = (AnonymousClass0QW) it.next();
                if (r1.A04.equals(r4) && !r1.A02) {
                    r1.A03(r8, r9);
                    break;
                }
            }
        }
    }

    public AnonymousClass0UN(ViewGroup viewGroup) {
        this.A02 = viewGroup;
    }

    public static AnonymousClass0UN A01(ViewGroup viewGroup) {
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof AnonymousClass0UN) {
            return (AnonymousClass0UN) tag;
        }
        C010107z r1 = new C010107z(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, r1);
        return r1;
    }
}
