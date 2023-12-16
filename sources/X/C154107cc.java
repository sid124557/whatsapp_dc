package X;

import com.whatsapp.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.7cc  reason: invalid class name and case insensitive filesystem */
public class C154107cc {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v4, resolved type: X.84O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: X.84O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v12, resolved type: X.84O} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v13, resolved type: X.84O} */
    /* JADX WARNING: type inference failed for: r0v62, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x031f, code lost:
        if (r10.A05 != r11) goto L_0x0321;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass84O A01(X.C151267Ub r37, X.AnonymousClass84O r38, X.AnonymousClass84O r39, java.util.Map r40, java.util.Set r41) {
        /*
            r11 = r38
            r3 = r11
            int r0 = r11.A00
            r0 = r0 & 1
            if (r0 == 0) goto L_0x03a7
            r12 = r37
            r10 = r39
            r39 = r41
            if (r10 == 0) goto L_0x002e
            X.84O r0 = r10.A05
            if (r0 != r11) goto L_0x002e
            java.util.Set r4 = r12.A0D
            if (r4 == 0) goto L_0x002e
            X.7K6 r5 = r12.A05
            android.util.SparseArray r0 = r5.A02
            int r3 = r10.A02
            java.lang.Object r2 = r0.get(r3)
            java.util.Set r2 = (java.util.Set) r2
            if (r2 != 0) goto L_0x0037
            java.lang.String r1 = "BindEvaluator"
            java.lang.String r0 = "A previously bound node has a null variable dependency map"
            X.C159737mN.A01(r1, r0)
        L_0x002e:
            X.7XT r0 = X.C159567m6.A00
            boolean r21 = r0.A02()
            if (r21 == 0) goto L_0x0060
            goto L_0x004c
        L_0x0037:
            java.util.Iterator r1 = r2.iterator()
        L_0x003b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0357
            java.lang.Object r0 = r1.next()
            boolean r0 = r4.contains(r0)
            if (r0 == 0) goto L_0x003b
            goto L_0x002e
        L_0x004c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "Bloks Bind Subtree"
            r1.append(r0)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = X.C159397ll.A02(r11)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0350 }
            X.C159567m6.A01(r0)     // Catch:{ all -> 0x0350 }
        L_0x0060:
            java.util.HashSet r9 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0350 }
            java.util.HashMap r20 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0350 }
            r8 = r11
            r0 = 135(0x87, float:1.89E-43)
            X.48t r13 = r11.A0L(r0)     // Catch:{ all -> 0x0350 }
            if (r13 == 0) goto L_0x00f8
            java.util.List r6 = r11.A07     // Catch:{ all -> 0x0350 }
            r37 = r6
            if (r6 != 0) goto L_0x007b
            java.util.List r37 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0350 }
        L_0x007b:
            r0 = r13
            X.8DF r0 = (X.AnonymousClass8DF) r0     // Catch:{ all -> 0x0350 }
            X.7fz r0 = r0.A01     // Catch:{ all -> 0x0350 }
            r16 = r0
            java.util.Map r15 = r12.A0B     // Catch:{ all -> 0x0350 }
            X.7ke r14 = r12.A02     // Catch:{ all -> 0x0350 }
            X.48u r5 = r12.A08     // Catch:{ all -> 0x0350 }
            X.7e8 r4 = r12.A00     // Catch:{ all -> 0x0350 }
            java.lang.String r3 = r12.A09     // Catch:{ all -> 0x0350 }
            X.7dc r2 = r12.A01     // Catch:{ all -> 0x0350 }
            X.7e7 r1 = r12.A04     // Catch:{ all -> 0x0350 }
            r7 = 0
            X.6va r29 = X.C141446va.Bind     // Catch:{ all -> 0x0350 }
            X.6dJ r0 = new X.6dJ     // Catch:{ all -> 0x0350 }
            r25 = r7
            r33 = r7
            r22 = r0
            r23 = r2
            r24 = r7
            r26 = r14
            r27 = r1
            r28 = r4
            r30 = r16
            r31 = r5
            r32 = r3
            r34 = r6
            r35 = r15
            r36 = r9
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36)     // Catch:{ all -> 0x0350 }
            X.7jD r1 = X.C157967jD.A01     // Catch:{ 6ye -> 0x00c2 }
            java.lang.Object r13 = X.C154167ci.A00(r1, r13, r0)     // Catch:{ 6ye -> 0x00c2 }
            if (r13 == 0) goto L_0x00bf
            java.util.List r13 = (java.util.List) r13     // Catch:{ 6ye -> 0x00c2 }
            goto L_0x00ce
        L_0x00bf:
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ 6ye -> 0x00c2 }
            goto L_0x00ce
        L_0x00c2:
            r4 = move-exception
            java.lang.String r3 = "Exception evaluating onBind"
            X.7bI r2 = r0.A00     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = "BindEvaluator"
            X.C159737mN.A00(r2, r1, r3, r4)     // Catch:{ all -> 0x0350 }
            java.util.List r13 = java.util.Collections.EMPTY_LIST     // Catch:{ all -> 0x0350 }
        L_0x00ce:
            r0.A02 = r7     // Catch:{ all -> 0x0350 }
            X.8DE r0 = r0.A03     // Catch:{ all -> 0x0350 }
            java.util.concurrent.CopyOnWriteArraySet r0 = r0.A00     // Catch:{ all -> 0x0350 }
            r0.clear()     // Catch:{ all -> 0x0350 }
            boolean r0 = r13.isEmpty()     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x00f8
            r6 = 0
            java.lang.Object r0 = r13.get(r6)     // Catch:{ all -> 0x0350 }
            boolean r0 = r0 instanceof java.lang.String     // Catch:{ all -> 0x0350 }
            r17 = r0
            java.lang.String r5 = "BindEvaluator"
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0100
            int r0 = r13.size()     // Catch:{ all -> 0x0350 }
            int r0 = r0 % r4
            if (r0 != r3) goto L_0x0100
            java.lang.String r0 = "Encountered odd number of elements in interleaved binding array"
            X.C159737mN.A01(r5, r0)     // Catch:{ all -> 0x0350 }
        L_0x00f8:
            boolean r19 = X.C154137cf.A00(r8)     // Catch:{ all -> 0x0350 }
            int r0 = r8.A00     // Catch:{ all -> 0x0350 }
            goto L_0x0219
        L_0x0100:
            r0 = 0
        L_0x0101:
            int r1 = r13.size()     // Catch:{ all -> 0x0350 }
            if (r0 >= r1) goto L_0x020c
            if (r17 == 0) goto L_0x0116
            int r16 = r0 + 1
            java.lang.String r15 = X.AnonymousClass001.A0n(r13, r0)     // Catch:{ all -> 0x0350 }
            r0 = r16
            java.lang.Object r14 = r13.get(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x013d
        L_0x0116:
            java.lang.Object r2 = r13.get(r0)     // Catch:{ all -> 0x0350 }
            java.util.List r2 = (java.util.List) r2     // Catch:{ all -> 0x0350 }
            java.lang.String r14 = X.AnonymousClass73M.A00(r2, r6)     // Catch:{ all -> 0x0350 }
            java.lang.String r1 = r8.A0N()     // Catch:{ all -> 0x0350 }
            if (r1 == 0) goto L_0x0133
            boolean r1 = r14.equals(r1)     // Catch:{ all -> 0x0350 }
            if (r1 != 0) goto L_0x0133
            java.lang.String r1 = "Encountered binding targeted for a descendant "
            X.C159737mN.A01(r5, r1)     // Catch:{ all -> 0x0350 }
            goto L_0x0206
        L_0x0133:
            java.lang.String r15 = X.AnonymousClass001.A0n(r2, r3)     // Catch:{ all -> 0x0350 }
            java.lang.Object r14 = r2.get(r4)     // Catch:{ all -> 0x0350 }
            r16 = r0
        L_0x013d:
            int r2 = X.AnonymousClass73G.A00(r15)     // Catch:{ all -> 0x0350 }
            r0 = 32
            if (r2 >= r0) goto L_0x015c
            java.lang.Object[] r1 = X.AnonymousClass0x9.A1X()     // Catch:{ all -> 0x0350 }
            X.AnonymousClass000.A1P(r1, r2, r6)     // Catch:{ all -> 0x0350 }
            r1[r3] = r15     // Catch:{ all -> 0x0350 }
            int r0 = r8.A03     // Catch:{ all -> 0x0350 }
            X.AnonymousClass000.A1P(r1, r0, r4)     // Catch:{ all -> 0x0350 }
            java.lang.String r0 = "Encountered invalid minified key: %s, raw: %s for styleId: %s while unwrapping binding expression"
            java.lang.String r0 = java.lang.String.format(r0, r1)     // Catch:{ all -> 0x0350 }
            X.C159737mN.A01(r5, r0)     // Catch:{ all -> 0x0350 }
        L_0x015c:
            X.7nR r1 = X.C158977kt.A01()     // Catch:{ all -> 0x0350 }
            int r0 = r8.A03     // Catch:{ all -> 0x0350 }
            int[] r15 = r1.A00(r0)     // Catch:{ all -> 0x0350 }
            int r0 = r15.length     // Catch:{ all -> 0x0350 }
            r18 = r0
            r1 = 0
        L_0x016a:
            r0 = r18
            if (r1 >= r0) goto L_0x01bb
            r0 = r15[r1]     // Catch:{ all -> 0x0350 }
            if (r0 != r2) goto L_0x0179
            java.util.List r14 = (java.util.List) r14     // Catch:{ all -> 0x0350 }
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()     // Catch:{ all -> 0x0350 }
            goto L_0x017c
        L_0x0179:
            int r1 = r1 + 1
            goto L_0x016a
        L_0x017c:
            if (r14 == 0) goto L_0x019e
            java.util.Iterator r14 = r14.iterator()     // Catch:{ all -> 0x0350 }
        L_0x0182:
            boolean r1 = r14.hasNext()     // Catch:{ all -> 0x0350 }
            if (r1 == 0) goto L_0x019e
            java.lang.Object r36 = r14.next()     // Catch:{ all -> 0x0350 }
            r33 = r12
            r34 = r8
            r35 = r10
            r38 = r20
            X.84O r1 = X.AnonymousClass73C.A00(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0350 }
            if (r1 == 0) goto L_0x0182
            r0.add(r1)     // Catch:{ all -> 0x0350 }
            goto L_0x0182
        L_0x019e:
            r14 = r0
            java.util.Iterator r15 = r0.iterator()     // Catch:{ all -> 0x0350 }
        L_0x01a3:
            boolean r0 = r15.hasNext()     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x01f0
            java.lang.Object r1 = r15.next()     // Catch:{ all -> 0x0350 }
            X.84O r1 = (X.AnonymousClass84O) r1     // Catch:{ all -> 0x0350 }
            if (r7 != 0) goto L_0x01b5
            android.util.SparseArray r7 = X.AnonymousClass6CA.A0I()     // Catch:{ all -> 0x0350 }
        L_0x01b5:
            int r0 = r1.A02     // Catch:{ all -> 0x0350 }
            r7.put(r0, r1)     // Catch:{ all -> 0x0350 }
            goto L_0x01a3
        L_0x01bb:
            X.7nR r1 = X.C158977kt.A01()     // Catch:{ all -> 0x0350 }
            int r0 = r8.A03     // Catch:{ all -> 0x0350 }
            int[] r15 = r1.A01(r0)     // Catch:{ all -> 0x0350 }
            int r0 = r15.length     // Catch:{ all -> 0x0350 }
            r18 = r0
            r1 = 0
        L_0x01c9:
            r0 = r18
            if (r1 >= r0) goto L_0x01f0
            r0 = r15[r1]     // Catch:{ all -> 0x0350 }
            if (r0 != r2) goto L_0x01e2
            r33 = r12
            r34 = r8
            r35 = r10
            r36 = r14
            r38 = r20
            X.84O r14 = X.AnonymousClass73C.A00(r33, r34, r35, r36, r37, r38)     // Catch:{ all -> 0x0350 }
            if (r14 == 0) goto L_0x01f0
            goto L_0x01e5
        L_0x01e2:
            int r1 = r1 + 1
            goto L_0x01c9
        L_0x01e5:
            if (r7 != 0) goto L_0x01eb
            android.util.SparseArray r7 = X.AnonymousClass6CA.A0I()     // Catch:{ all -> 0x0350 }
        L_0x01eb:
            int r0 = r14.A02     // Catch:{ all -> 0x0350 }
            r7.put(r0, r14)     // Catch:{ all -> 0x0350 }
        L_0x01f0:
            int r1 = r8.A03     // Catch:{ all -> 0x0350 }
            r0 = 13688(0x3578, float:1.9181E-41)
            if (r1 == r0) goto L_0x01fb
            X.84O r8 = X.C159397ll.A00(r8, r11, r14, r2)     // Catch:{ all -> 0x0350 }
            goto L_0x0208
        L_0x01fb:
            java.util.List r1 = r12.A0A     // Catch:{ all -> 0x0350 }
            X.7K7 r0 = new X.7K7     // Catch:{ all -> 0x0350 }
            r0.<init>(r8, r14, r2)     // Catch:{ all -> 0x0350 }
            r1.add(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x0208
        L_0x0206:
            r16 = r0
        L_0x0208:
            int r0 = r16 + 1
            goto L_0x0101
        L_0x020c:
            X.7K6 r0 = r12.A06     // Catch:{ all -> 0x0350 }
            if (r7 == 0) goto L_0x00f8
            android.util.SparseArray r1 = r0.A01     // Catch:{ all -> 0x0350 }
            int r0 = r8.A02     // Catch:{ all -> 0x0350 }
            r1.put(r0, r7)     // Catch:{ all -> 0x0350 }
            goto L_0x00f8
        L_0x0219:
            r0 = r0 & 2
            boolean r18 = X.AnonymousClass000.A1S(r0)
            java.util.HashSet r5 = X.AnonymousClass002.A0K()     // Catch:{ all -> 0x0350 }
            boolean r0 = X.C154137cf.A01(r8)     // Catch:{ all -> 0x0350 }
            if (r0 == 0) goto L_0x022e
            int r0 = r8.A02     // Catch:{ all -> 0x0350 }
            X.C18270x1.A1K(r5, r0)     // Catch:{ all -> 0x0350 }
        L_0x022e:
            X.7nR r1 = X.C158977kt.A01()     // Catch:{ all -> 0x0350 }
            int r0 = r8.A03     // Catch:{ all -> 0x0350 }
            int[] r6 = r1.A01(r0)     // Catch:{ all -> 0x0350 }
            int r4 = r6.length     // Catch:{ all -> 0x0350 }
            r3 = 0
        L_0x023a:
            if (r3 >= r4) goto L_0x027b
            r2 = r6[r3]     // Catch:{ all -> 0x0350 }
            X.84O r7 = r8.A0K(r2)     // Catch:{ all -> 0x0350 }
            if (r7 == 0) goto L_0x0278
            if (r10 == 0) goto L_0x0247
            goto L_0x0249
        L_0x0247:
            r1 = 0
            goto L_0x024d
        L_0x0249:
            X.84O r1 = r10.A0K(r2)     // Catch:{ all -> 0x0350 }
        L_0x024d:
            r0 = r20
            X.84O r7 = A01(r12, r7, r1, r0, r9)     // Catch:{ all -> 0x0350 }
            boolean r0 = X.C18300x5.A1W(r7, r1)
            r19 = r19 | r0
            int r0 = r7.A00     // Catch:{ all -> 0x0350 }
            r0 = r0 & 2
            boolean r0 = X.AnonymousClass000.A1S(r0)
            r18 = r18 | r0
            java.util.Set r1 = r7.A01     // Catch:{ all -> 0x0350 }
            if (r1 != 0) goto L_0x026b
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0350 }
        L_0x026b:
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0350 }
            if (r0 != 0) goto L_0x0274
            r5.addAll(r1)     // Catch:{ all -> 0x0350 }
        L_0x0274:
            X.84O r8 = X.C159397ll.A00(r8, r11, r7, r2)     // Catch:{ all -> 0x0350 }
        L_0x0278:
            int r3 = r3 + 1
            goto L_0x023a
        L_0x027b:
            X.7nR r1 = X.C158977kt.A01()     // Catch:{ all -> 0x0350 }
            int r0 = r8.A03     // Catch:{ all -> 0x0350 }
            int[] r6 = r1.A00(r0)     // Catch:{ all -> 0x0350 }
            int r0 = r6.length     // Catch:{ all -> 0x0350 }
            r22 = r0
            r7 = 0
            r17 = 0
        L_0x028b:
            r0 = r22
            if (r7 >= r0) goto L_0x0318
            r15 = r6[r7]     // Catch:{ all -> 0x0350 }
            java.util.List r14 = r8.A0R(r15)     // Catch:{ all -> 0x0350 }
            if (r10 == 0) goto L_0x029c
            java.util.List r13 = r10.A0R(r15)     // Catch:{ all -> 0x0350 }
            goto L_0x029d
        L_0x029c:
            r13 = 0
        L_0x029d:
            r4 = r14
            r3 = 0
        L_0x029f:
            int r0 = r14.size()     // Catch:{ all -> 0x0350 }
            if (r3 >= r0) goto L_0x02ff
            X.84O r2 = X.AnonymousClass6C9.A0V(r14, r3)     // Catch:{ all -> 0x0350 }
            if (r2 == 0) goto L_0x02fc
            X.84O r1 = X.C159397ll.A01(r2, r13, r3)     // Catch:{ all -> 0x0350 }
            r0 = r20
            X.84O r0 = A01(r12, r2, r1, r0, r9)     // Catch:{ all -> 0x0350 }
            boolean r1 = X.C18300x5.A1W(r0, r1)
            r19 = r19 | r1
            int r1 = r0.A00     // Catch:{ all -> 0x0350 }
            r1 = r1 & 2
            boolean r1 = X.AnonymousClass000.A1S(r1)
            r18 = r18 | r1
            java.util.Set r1 = r0.A01     // Catch:{ all -> 0x0350 }
            if (r1 != 0) goto L_0x02cd
            java.util.Set r1 = java.util.Collections.emptySet()     // Catch:{ all -> 0x0350 }
        L_0x02cd:
            boolean r16 = r1.isEmpty()     // Catch:{ all -> 0x0350 }
            if (r16 != 0) goto L_0x02d6
            r5.addAll(r1)     // Catch:{ all -> 0x0350 }
        L_0x02d6:
            if (r0 == r2) goto L_0x02fc
            if (r4 != r14) goto L_0x02de
            java.util.ArrayList r4 = X.AnonymousClass002.A0J(r14)     // Catch:{ all -> 0x0350 }
        L_0x02de:
            int r2 = r0.A03     // Catch:{ all -> 0x0350 }
            r1 = 16851(0x41d3, float:2.3613E-41)
            if (r2 != r1) goto L_0x02f7
            java.util.List r1 = r0.A0Q()     // Catch:{ all -> 0x0350 }
            int r0 = r3 + r17
            r4.remove(r0)     // Catch:{ all -> 0x0350 }
            r4.addAll(r0, r1)     // Catch:{ all -> 0x0350 }
            int r0 = r1.size()     // Catch:{ all -> 0x0350 }
            int r17 = r17 + r0
            goto L_0x02fc
        L_0x02f7:
            int r1 = r3 + r17
            r4.set(r1, r0)     // Catch:{ all -> 0x0350 }
        L_0x02fc:
            int r3 = r3 + 1
            goto L_0x029f
        L_0x02ff:
            if (r4 == r14) goto L_0x0305
            X.84O r8 = X.C159397ll.A00(r8, r11, r4, r15)     // Catch:{ all -> 0x0350 }
        L_0x0305:
            if (r8 == r11) goto L_0x0314
            int r0 = r8.A00     // Catch:{ all -> 0x0350 }
            if (r18 == 0) goto L_0x030e
            r0 = r0 | 2
            goto L_0x0310
        L_0x030e:
            r0 = r0 & -3
        L_0x0310:
            r8.A00 = r0     // Catch:{ all -> 0x0350 }
            r8.A01 = r5     // Catch:{ all -> 0x0350 }
        L_0x0314:
            int r7 = r7 + 1
            goto L_0x028b
        L_0x0318:
            if (r19 != 0) goto L_0x0321
            if (r10 == 0) goto L_0x0321
            X.84O r0 = r10.A05     // Catch:{ all -> 0x0350 }
            r3 = r10
            if (r0 == r11) goto L_0x0322
        L_0x0321:
            r3 = r8
        L_0x0322:
            X.7K6 r4 = r12.A06     // Catch:{ all -> 0x0350 }
            boolean r0 = r20.isEmpty()     // Catch:{ all -> 0x0350 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0335
            android.util.SparseArray r2 = r4.A00     // Catch:{ all -> 0x0350 }
            int r1 = r3.A02     // Catch:{ all -> 0x0350 }
            r0 = r20
            r2.put(r1, r0)     // Catch:{ all -> 0x0350 }
        L_0x0335:
            java.util.Set r0 = r20.keySet()     // Catch:{ all -> 0x0350 }
            r9.removeAll(r0)     // Catch:{ all -> 0x0350 }
            android.util.SparseArray r1 = r4.A02     // Catch:{ all -> 0x0350 }
            int r0 = r3.A02     // Catch:{ all -> 0x0350 }
            r1.put(r0, r9)     // Catch:{ all -> 0x0350 }
            r0 = r39
            r0.addAll(r9)     // Catch:{ all -> 0x0350 }
            r1 = r40
            r0 = r20
            r1.putAll(r0)     // Catch:{ all -> 0x0350 }
            goto L_0x03a2
        L_0x0350:
            r0 = move-exception
            if (r21 == 0) goto L_0x0356
            X.C159567m6.A00()
        L_0x0356:
            throw r0
        L_0x0357:
            r0 = r39
            r0.addAll(r2)
            X.7K6 r2 = r12.A06
            r1 = 0
            X.74L r0 = new X.74L
            r0.<init>(r5, r1, r2)
            r10.A0X(r0)
            android.util.SparseArray r0 = r5.A00
            java.lang.Object r1 = r0.get(r3)
            java.util.Map r1 = (java.util.Map) r1
            if (r1 == 0) goto L_0x03a1
            r0 = r40
            r0.putAll(r1)
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r1)
        L_0x037a:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x03a1
            java.util.Map$Entry r0 = X.AnonymousClass001.A0w(r3)
            java.lang.Object r2 = r0.getKey()
            java.lang.Object r1 = r0.getValue()
            java.util.Map r0 = r12.A0B
            r0.put(r2, r1)
            java.util.Map r0 = r12.A0C
            java.lang.Object r0 = r0.get(r2)
            boolean r0 = X.AnonymousClass736.A00(r0, r1)
            if (r0 != 0) goto L_0x037a
            r4.add(r2)
            goto L_0x037a
        L_0x03a1:
            return r10
        L_0x03a2:
            if (r21 == 0) goto L_0x03a7
            X.C159567m6.A00()
        L_0x03a7:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C154107cc.A01(X.7Ub, X.84O, X.84O, java.util.Map, java.util.Set):X.84O");
    }

    public static AnonymousClass7P6 A00(C154707dc r14, C153427bI r15, C158847ke r16, C154997e7 r17, AnonymousClass7P6 r18, AnonymousClass84O r19, C155007e8 r20, C184958sp r21) {
        AnonymousClass84O r0;
        C154707dc r5 = r14;
        C158847ke r6 = r16;
        C154997e7 r8 = r17;
        AnonymousClass7P6 r9 = r18;
        C155007e8 r10 = r20;
        C184958sp r11 = r21;
        C151267Ub r4 = new C151267Ub(r5, r6, (AnonymousClass7SC) r15.A02(R.id.bk_context_key_scoped_client_id_mapper), r8, r9, r10, r11, C162377rs.A04(r15), (String) r15.A01.get(R.id.bk_context_key_logging_id));
        HashSet A0K = AnonymousClass002.A0K();
        HashMap A0t = AnonymousClass001.A0t();
        if (r18 == null) {
            r0 = null;
        } else {
            r0 = r9.A01;
        }
        AnonymousClass84O r62 = r19;
        AnonymousClass84O A01 = A01(r4, r62, r0, A0t, A0K);
        HashMap hashMap = new HashMap(A0K.size());
        Iterator it = A0K.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            hashMap.put(next, r4.A02.A07.get(next));
        }
        Map map = r4.A02.A07;
        Map map2 = r4.A0B;
        return new AnonymousClass7P6(r4.A06, r62, A01, r4.A0A, map, map2, hashMap);
    }
}
