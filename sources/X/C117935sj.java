package X;

import java.util.concurrent.Callable;

/* renamed from: X.5sj  reason: invalid class name and case insensitive filesystem */
public abstract class C117935sj implements Callable {
    public final AnonymousClass0QU A00 = new AnonymousClass0QU();

    /* JADX WARNING: Code restructure failed: missing block: B:211:0x059e, code lost:
        if (r1 != null) goto L_0x05a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x002d, code lost:
        r13 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0094, code lost:
        if (r2.A0c == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0200, code lost:
        if (r3.A09 == true) goto L_0x0202;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r56 = this;
            r0 = r56
            X.0QU r1 = r0.A00
            r55 = r1
            boolean r1 = r55.A04()
            if (r1 != 0) goto L_0x061b
            boolean r1 = r0 instanceof X.AnonymousClass4q7
            if (r1 == 0) goto L_0x0034
            X.4q7 r0 = (X.AnonymousClass4q7) r0
            X.33p r3 = r0.A00
            android.content.SharedPreferences r2 = X.AnonymousClass0x2.A0F(r3)
            java.lang.String r1 = "show_statuses_education"
            boolean r1 = X.C86654Ky.A1T(r2, r1)
            if (r1 == 0) goto L_0x002b
            X.33e r0 = r0.A01
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x002b
            r3.A0z()
        L_0x002b:
            X.2wD r13 = X.C59022wD.A00
        L_0x002d:
            boolean r0 = r55.A04()
            if (r0 != 0) goto L_0x061b
            return r13
        L_0x0034:
            boolean r1 = r0 instanceof X.C94164qC
            if (r1 == 0) goto L_0x00c0
            X.4qC r0 = (X.C94164qC) r0
            X.2pt r2 = r0.A00
            X.1fY r1 = X.AnonymousClass1fY.A00
            java.util.List r6 = r2.A01(r1)
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "GetMyStatusStateTask/getStatusMessages "
            X.C18260x0.A1R(r2, r1, r6)
            java.util.Iterator r4 = r6.iterator()
        L_0x004f:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x009c
            X.34x r3 = X.C18300x5.A0T(r4)
            int r2 = r3.A0D
            r1 = 20
            if (r2 == r1) goto L_0x0096
            boolean r1 = X.C627636p.A0l(r3)
            if (r1 != 0) goto L_0x0081
            r1 = 4
            int r1 = X.AnonymousClass358.A00(r2, r1)
            boolean r1 = X.AnonymousClass001.A1U(r1)
            if (r1 == 0) goto L_0x0084
            boolean r1 = X.C627636p.A0m(r3)
            if (r1 != 0) goto L_0x0081
            java.util.Set r2 = r0.A06
        L_0x0078:
            X.2z0 r1 = r3.A1J
            X.C162457s7.A0C(r1)
            r2.add(r1)
            goto L_0x004f
        L_0x0081:
            java.util.Set r2 = r0.A03
            goto L_0x0078
        L_0x0084:
            boolean r1 = r3 instanceof X.C30471mV
            if (r1 == 0) goto L_0x0099
            X.1mV r3 = (X.C30471mV) r3
            X.33C r2 = r3.A01
            if (r2 == 0) goto L_0x0099
            boolean r1 = r2.A0R
            if (r1 != 0) goto L_0x0099
            boolean r1 = r2.A0c
            if (r1 != 0) goto L_0x0099
        L_0x0096:
            java.util.Set r2 = r0.A04
            goto L_0x0078
        L_0x0099:
            java.util.Set r2 = r0.A05
            goto L_0x0078
        L_0x009c:
            java.util.Set r5 = r0.A04
            java.util.Set r4 = r0.A05
            java.util.Set r3 = r0.A03
            java.util.Set r1 = r0.A06
            X.5Nx r2 = new X.5Nx
            r2.<init>(r5, r4, r3, r1)
            X.33e r1 = r0.A01
            X.34r r1 = r1.A04()
            if (r1 == 0) goto L_0x00be
            X.34r r1 = r1.A06()
        L_0x00b5:
            X.5Sb r0 = r0.A02
            X.5Ny r13 = new X.5Ny
            r13.<init>(r1, r0, r2, r6)
            goto L_0x002d
        L_0x00be:
            r1 = 0
            goto L_0x00b5
        L_0x00c0:
            boolean r1 = r0 instanceof X.AnonymousClass4qB
            if (r1 == 0) goto L_0x0213
            X.4qB r0 = (X.AnonymousClass4qB) r0
            X.2se r2 = r0.A03
            r2.A02()
            r1 = 0
            r2.A0D(r1)
            X.2ss r1 = r0.A01
            java.util.Collection r1 = r1.A0E()
            r13 = 0
            if (r1 == 0) goto L_0x002d
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.Iterator r4 = r1.iterator()
        L_0x00e0:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x0103
            java.lang.Object r3 = r4.next()
            r2 = r3
            X.31A r2 = (X.AnonymousClass31A) r2
            boolean r1 = r2 instanceof X.AnonymousClass1RL
            if (r1 == 0) goto L_0x00e0
            X.1RL r2 = (X.AnonymousClass1RL) r2
            if (r2 == 0) goto L_0x00e0
            X.21q r2 = r2.A07
            X.21q r1 = X.C372821q.GUEST
            boolean r1 = X.AnonymousClass000.A1Y(r2, r1)
            if (r1 != 0) goto L_0x00e0
            r5.add(r3)
            goto L_0x00e0
        L_0x0103:
            java.util.ArrayList r7 = X.C73783g4.A0c(r5)
            java.util.Iterator r16 = r5.iterator()
        L_0x010b:
            boolean r1 = r16.hasNext()
            if (r1 == 0) goto L_0x0206
            java.lang.Object r6 = r16.next()
            X.31A r6 = (X.AnonymousClass31A) r6
            java.lang.String r1 = "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo"
            X.C162457s7.A0K(r6, r1)
            X.1RL r6 = (X.AnonymousClass1RL) r6
            X.2rV r2 = r0.A02
            X.4uZ r1 = r6.A05()
            X.34x r5 = r2.A00(r1)
            if (r5 == 0) goto L_0x01f4
            long r1 = r5.A0K
            boolean r3 = r5 instanceof X.C30471mV
            if (r3 == 0) goto L_0x01f7
            r3 = r5
            X.1mV r3 = (X.C30471mV) r3
            boolean r52 = X.C627636p.A10(r3)
        L_0x0137:
            long r3 = r6.A00
            r36 = r3
            X.31A r3 = r6.A0P
            r54 = r3
            java.lang.String r3 = r6.A0H
            r27 = r3
            long r3 = r6.A02
            r38 = r3
            java.lang.String r3 = r6.A0E
            r28 = r3
            long r3 = r6.A01
            r40 = r3
            java.lang.String r3 = r6.A0J
            r29 = r3
            long r3 = r6.A03
            r42 = r3
            java.lang.String r3 = r6.A0I
            r30 = r3
            long r14 = r6.A04
            long r8 = r6.A0O
            java.lang.String r3 = r6.A0F
            r31 = r3
            java.lang.String r3 = r6.A0G
            r32 = r3
            long r3 = r6.A05
            X.21q r13 = r6.A07
            X.21c r10 = r6.A0A
            r53 = r10
            X.21e r10 = r6.A0C
            r25 = r10
            boolean r10 = r6.A0L
            r24 = r10
            java.util.List r10 = r6.A0Q
            r23 = r10
            boolean r10 = r6.A0M
            r22 = r10
            X.21l r12 = r6.A0B
            boolean r10 = r6.A0K
            r21 = r10
            X.21r r11 = r6.A09
            X.6aY r10 = r6.A06
            r20 = r10
            java.lang.Long r10 = r6.A0D
            r19 = r10
            boolean r10 = r6.A0N
            r18 = r10
            X.599 r10 = r6.A08
            X.C86654Ky.A1P(r13, r12, r11)
            X.1RL r17 = new X.1RL
            r26 = r19
            r33 = r23
            r34 = r36
            r36 = r38
            r38 = r40
            r40 = r42
            r42 = r14
            r44 = r8
            r46 = r3
            r48 = r24
            r49 = r22
            r50 = r21
            r51 = r18
            r18 = r20
            r19 = r54
            r20 = r13
            r21 = r10
            r22 = r11
            r23 = r53
            r24 = r12
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r36, r38, r40, r42, r44, r46, r48, r49, r50, r51)
            X.3Ex r4 = r0.A00
            X.4uZ r3 = r6.A05()
            X.3ZH r45 = r4.A0A(r3)
            X.3ZH r3 = r45.A0G()
            if (r3 == 0) goto L_0x01d7
            r45 = r3
        L_0x01d7:
            X.5Pl r3 = r0.A04
            java.lang.CharSequence r47 = r3.A00(r1)
            int r3 = r6.A08
            long r3 = (long) r3
            X.536 r6 = new X.536
            r44 = r17
            r46 = r5
            r48 = r1
            r50 = r3
            r43 = r6
            r43.<init>(r44, r45, r46, r47, r48, r50, r52)
            r7.add(r6)
            goto L_0x010b
        L_0x01f4:
            long r1 = r6.A0O
            goto L_0x0202
        L_0x01f7:
            X.2qb r3 = r5.A0l
            r4 = 1
            if (r3 == 0) goto L_0x0202
            boolean r3 = r3.A09
            r52 = 0
            if (r3 != r4) goto L_0x0137
        L_0x0202:
            r52 = 1
            goto L_0x0137
        L_0x0206:
            r1 = 12
            X.6A6 r0 = new X.6A6
            r0.<init>(r1)
            java.util.List r13 = X.C73723fy.A0L(r7, r0)
            goto L_0x002d
        L_0x0213:
            boolean r1 = r0 instanceof X.AnonymousClass4q6
            if (r1 == 0) goto L_0x0237
            X.4q6 r0 = (X.AnonymousClass4q6) r0
            X.5Wh r1 = r0.A00
            java.util.List r1 = r1.A01
            java.util.ArrayList r13 = X.AnonymousClass001.A0s()
            java.util.Iterator r5 = r1.iterator()
        L_0x0225:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L_0x002d
            X.34r r4 = X.C86664Kz.A19(r5)
            X.5Nv r3 = r0.A01
            r2 = 1
            r1 = 0
            X.C103655Nv.A00(r4, r3, r13, r2, r1)
            goto L_0x0225
        L_0x0237:
            boolean r1 = r0 instanceof X.AnonymousClass4q5
            if (r1 == 0) goto L_0x024c
            X.4q5 r0 = (X.AnonymousClass4q5) r0
            java.util.List r2 = r0.A01
            java.util.List r1 = r0.A00
            X.4Vt r0 = new X.4Vt
            r0.<init>(r2, r1)
            X.0U0 r13 = X.AnonymousClass0SC.A00(r0)
            goto L_0x002d
        L_0x024c:
            boolean r1 = r0 instanceof X.AnonymousClass4q4
            if (r1 == 0) goto L_0x0261
            X.4q4 r0 = (X.AnonymousClass4q4) r0
            java.util.List r2 = r0.A01
            java.util.List r1 = r0.A00
            X.4Vs r0 = new X.4Vs
            r0.<init>(r2, r1)
            X.0U0 r13 = X.AnonymousClass0SC.A00(r0)
            goto L_0x002d
        L_0x0261:
            boolean r1 = r0 instanceof X.C94144py
            if (r1 == 0) goto L_0x02b8
            X.4py r0 = (X.C94144py) r0
            com.whatsapp.status.viewmodels.StatusesViewModel r3 = r0.A00
            X.33e r0 = r3.A0A
            java.util.Map r13 = r0.A09()
            X.C162457s7.A0D(r13)
            java.lang.String r0 = "Got statuses from the status store"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.concurrent.atomic.AtomicBoolean r2 = r3.A0H
            r1 = 0
            r0 = 1
            boolean r0 = r2.compareAndSet(r1, r0)
            if (r0 == 0) goto L_0x002d
            X.0Wx r0 = r3.A04
            java.lang.Object r0 = r0.A07()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 != 0) goto L_0x028f
            java.util.Map r0 = X.C73813g7.A0A()
        L_0x028f:
            java.util.Set r0 = r0.keySet()
            java.util.Set r3 = r3.A0G
            monitor-enter(r3)
            java.util.Iterator r2 = r0.iterator()     // Catch:{ all -> 0x060e }
        L_0x029a:
            boolean r0 = r2.hasNext()     // Catch:{ all -> 0x060e }
            if (r0 == 0) goto L_0x02ae
            com.whatsapp.jid.UserJid r1 = X.C18310x6.A0T(r2)     // Catch:{ all -> 0x060e }
            boolean r0 = r13.containsKey(r1)     // Catch:{ all -> 0x060e }
            if (r0 != 0) goto L_0x029a
            r3.add(r1)     // Catch:{ all -> 0x060e }
            goto L_0x029a
        L_0x02ae:
            java.util.Set r0 = r13.keySet()     // Catch:{ all -> 0x060e }
            r3.addAll(r0)     // Catch:{ all -> 0x060e }
            monitor-exit(r3)
            goto L_0x002d
        L_0x02b8:
            boolean r1 = r0 instanceof X.AnonymousClass4q3
            if (r1 == 0) goto L_0x02c2
            java.lang.Integer r13 = X.C18290x4.A0Z()
            goto L_0x002d
        L_0x02c2:
            boolean r1 = r0 instanceof X.AnonymousClass4qA
            if (r1 == 0) goto L_0x02f6
            X.4qA r0 = (X.AnonymousClass4qA) r0
            X.2pt r1 = r0.A00
            X.1fY r0 = X.AnonymousClass1fY.A00
            java.util.List r0 = r1.A01(r0)
            X.6aO r3 = new X.6aO
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L_0x02d9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x02ed
            X.34x r1 = X.C18300x5.A0T(r2)
            boolean r0 = X.C627636p.A0l(r1)
            if (r0 != 0) goto L_0x02d9
            X.C162457s7.A0H(r1)
            goto L_0x02d9
        L_0x02ed:
            X.6aY r13 = r3.build()
            X.C162457s7.A0D(r13)
            goto L_0x002d
        L_0x02f6:
            boolean r1 = r0 instanceof X.AnonymousClass4q2
            if (r1 == 0) goto L_0x0326
            X.4q2 r0 = (X.AnonymousClass4q2) r0
            X.0QU r1 = r0.A00
            boolean r1 = r1.A04()
            X.4qG r3 = r0.A01
            if (r1 == 0) goto L_0x030b
            r13 = 0
            r3.A00 = r13
            goto L_0x002d
        L_0x030b:
            X.2oU r1 = r3.A02
            android.content.Context r4 = r1.A00
            android.content.res.Resources r2 = r4.getResources()
            r1 = 2131165416(0x7f0700e8, float:1.7945048E38)
            int r7 = r2.getDimensionPixelSize(r1)
            X.30g r3 = r3.A01
            X.3ZH r5 = r0.A00
            r6 = 0
            r8 = 0
            android.graphics.Bitmap r13 = r3.A03(r4, r5, r6, r7, r8)
            goto L_0x002d
        L_0x0326:
            boolean r1 = r0 instanceof X.AnonymousClass4q1
            if (r1 == 0) goto L_0x033b
            X.4q1 r0 = (X.AnonymousClass4q1) r0
            java.util.List r2 = r0.A01
            java.util.List r1 = r0.A00
            X.4Vr r0 = new X.4Vr
            r0.<init>(r2, r1)
            X.0U0 r13 = X.AnonymousClass0SC.A00(r0)
            goto L_0x002d
        L_0x033b:
            boolean r1 = r0 instanceof X.AnonymousClass4qD
            if (r1 == 0) goto L_0x0396
            X.4qD r0 = (X.AnonymousClass4qD) r0
            android.content.Context r8 = r0.A01
            X.5Zz r10 = r0.A06
            X.5nM r9 = r0.A04
            X.34x r11 = r0.A07
            int r12 = r0.A00
            r13 = 0
            X.5WD r5 = X.AnonymousClass5WD.A00(r8, r9, r10, r11, r12, r13)
            X.0QU r6 = r0.A00
            r6.A02()
            java.lang.String r3 = r5.A02
            if (r3 != 0) goto L_0x037f
            r1 = 2131895073(0x7f122321, float:1.9424969E38)
            java.lang.String r7 = r8.getString(r1)
        L_0x0360:
            r6.A02()
            java.lang.String r1 = r5.A04
            java.util.List r4 = r0.A08
            X.33j r3 = r0.A03
            X.5ae r2 = X.C107075ae.A03
            java.lang.CharSequence r1 = X.C86644Kx.A0d(r8, r3, r2, r1, r4)
            java.lang.String r0 = r5.A03
            java.lang.CharSequence r0 = X.C86644Kx.A0d(r8, r3, r2, r0, r4)
            r6.A02()
            X.7Mq r13 = new X.7Mq
            r13.<init>(r5, r1, r0, r7)
            goto L_0x002d
        L_0x037f:
            android.widget.TextView r1 = r0.A02
            android.text.TextPaint r2 = r1.getPaint()
            X.5Y0 r1 = r0.A05
            java.lang.CharSequence r4 = X.C107345b9.A03(r8, r2, r1, r3)
            java.util.List r3 = r0.A08
            X.33j r2 = r0.A03
            X.5ae r1 = X.C107075ae.A03
            java.lang.CharSequence r7 = X.C86644Kx.A0d(r8, r2, r1, r4, r3)
            goto L_0x0360
        L_0x0396:
            boolean r1 = r0 instanceof X.AnonymousClass4q9
            if (r1 == 0) goto L_0x03c2
            X.4q9 r0 = (X.AnonymousClass4q9) r0
            X.3Ex r4 = r0.A01
            X.34x r3 = r0.A02
            X.2z0 r1 = r3.A1J
            X.4uZ r1 = r1.A00
            X.3ZH r2 = X.C64773Ex.A00(r4, r1)
            X.0QU r1 = r0.A00
            r1.A02()
            X.2sr r0 = r0.A00
            X.4uZ r0 = X.C106795aB.A00(r0, r2, r3)
            if (r0 != 0) goto L_0x03bd
            r0 = 0
        L_0x03b6:
            X.7Kj r13 = new X.7Kj
            r13.<init>(r2, r0, r3)
            goto L_0x002d
        L_0x03bd:
            X.3ZH r0 = r4.A0A(r0)
            goto L_0x03b6
        L_0x03c2:
            boolean r1 = r0 instanceof X.AnonymousClass4qE
            if (r1 == 0) goto L_0x0485
            X.4qE r0 = (X.AnonymousClass4qE) r0
            java.lang.CharSequence r2 = r0.A08
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r13 = ""
            if (r1 != 0) goto L_0x002d
            java.lang.String r3 = r2.toString()
            java.lang.String r2 = "\n"
            java.lang.String r1 = " "
            java.lang.String r3 = r3.replace(r2, r1)
            X.33i r2 = r0.A04
            X.2y5 r1 = r0.A07
            java.lang.CharSequence r17 = X.C107635bd.A07(r2, r1, r3)
            android.content.Context r14 = r0.A02
            java.util.List r1 = r0.A09
            X.33j r15 = r0.A05
            X.5ae r16 = X.C107075ae.A01
            r4 = 1
            r18 = r1
            r19 = r4
            X.7IU r2 = X.C107075ae.A00(r14, r15, r16, r17, r18, r19)
            X.0QU r8 = r0.A00
            r8.A02()
            java.lang.Object r7 = r2.A00
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x002d
            java.lang.Object r3 = r2.A01
            java.util.List r3 = (java.util.List) r3
            r1 = 460(0x1cc, float:6.45E-43)
            X.8GU r10 = new X.8GU
            r10.<init>(r4, r1)
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L_0x047b
            android.graphics.Paint r6 = r0.A03
            int r1 = r7.length()
            r5 = 0
            float r9 = r6.measureText(r7, r5, r1)
            int r2 = r0.A00
            int r1 = r0.A01
            int r2 = r2 * r1
            float r4 = (float) r2
            int r1 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r1 <= 0) goto L_0x047b
            java.text.BreakIterator r10 = X.C107155an.A02(r15)
            java.lang.String r1 = r7.toString()
            r10.setText(r1)
            r2 = 20
            int r1 = r7.length()
            java.util.List r9 = X.AnonymousClass4qE.A00(r10, r3, r2, r1)
            android.text.SpannableStringBuilder r13 = new android.text.SpannableStringBuilder
            r13.<init>()
            r0.A01(r13, r7, r9)
            r8.A02()
            r3 = 10
        L_0x044e:
            int r1 = r13.length()
            float r1 = r6.measureText(r13, r5, r1)
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 > 0) goto L_0x002d
            int r2 = r13.length()
            int r1 = r7.length()
            if (r2 >= r1) goto L_0x002d
            r8.A02()
            r13.clear()
            int r1 = r7.length()
            java.util.List r9 = X.AnonymousClass4qE.A00(r10, r9, r3, r1)
            r0.A01(r13, r7, r9)
            r8.A02()
            int r3 = r3 + 10
            goto L_0x044e
        L_0x047b:
            android.graphics.Paint r1 = r0.A03
            X.5Y0 r0 = r0.A06
            java.lang.CharSequence r13 = X.C107345b9.A02(r14, r1, r10, r0, r7)
            goto L_0x002d
        L_0x0485:
            boolean r1 = r0 instanceof X.AnonymousClass4q8
            if (r1 == 0) goto L_0x05d1
            X.4q8 r0 = (X.AnonymousClass4q8) r0
            X.4px r5 = r0.A02
            X.2so r2 = r5.A0A
            X.4uZ r6 = r0.A00
            boolean r1 = r2.A0E(r6)
            X.0QU r4 = r0.A00
            r4.A02()
            r3 = 1
            r7 = 0
            r15 = 0
            if (r1 == 0) goto L_0x05c5
            X.1fJ r1 = X.AnonymousClass34R.A01(r6)
            java.util.List r2 = r2.A04(r1)
            int r1 = X.C86654Ky.A06(r2, r3)
            java.util.List r2 = r2.subList(r7, r1)
            int r1 = r2.size()
            if (r1 != r3) goto L_0x05c2
            java.lang.Object r1 = r2.get(r7)
            X.2mC r1 = (X.C52882mC) r1
            if (r1 == 0) goto L_0x05bf
            com.whatsapp.jid.GroupJid r8 = r1.A02
            if (r8 == 0) goto L_0x05bf
            boolean r1 = r5.A0L(r8)
            if (r1 == 0) goto L_0x05b7
            X.8qC r1 = r5.A0P
            java.lang.Object r1 = r1.get()
            X.34o r1 = (X.C623234o) r1
            X.2sW r1 = r1.A05
            java.util.Map r1 = r1.A0O
            java.lang.Object r8 = r1.get(r8)
            X.34x r8 = (X.C624134x) r8
        L_0x04d9:
            r4.A02()
            X.1R1 r1 = r5.A0O
            X.2sa r19 = X.AnonymousClass1R1.A00(r6, r1)
            r4.A02()
            boolean r0 = r0.A01
            if (r0 == 0) goto L_0x05b4
            if (r8 == 0) goto L_0x05b4
            X.33f r12 = r5.A0K
            X.2z0 r0 = r8.A1J
            X.4uZ r10 = r0.A00
            if (r10 != 0) goto L_0x054d
            java.lang.String r0 = "MessageAddOnManager/getChatInfo/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x04f8:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnManager/getLastChatsListDisplayedMessageAddOnPreview/no chat for "
            X.C18260x0.A1S(r1, r0, r10)
            r1 = 0
        L_0x0502:
            r4.A02()
            X.3Ex r9 = r5.A05
            X.3ZH r14 = r9.A0A(r6)
            X.2sr r10 = r5.A02
            X.2sS r7 = r5.A09
            if (r8 == 0) goto L_0x0544
            X.4uZ r6 = r8.A0n()
            if (r6 == 0) goto L_0x0544
            boolean r0 = X.C155477ey.A00(r6)
            if (r0 == 0) goto L_0x0544
            X.2m4 r0 = r7.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0544
        L_0x0525:
            X.3ZH r16 = r9.A0A(r6)
        L_0x0529:
            r4.A02()
            r4.A02()
            X.5OF r0 = r5.A04
            java.lang.Boolean r21 = java.lang.Boolean.valueOf(r3)
            X.5Kt r13 = new X.5Kt
            r17 = r8
            r18 = r1
            r20 = r0
            r22 = r2
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22)
            goto L_0x002d
        L_0x0544:
            X.4uZ r6 = X.C106795aB.A00(r10, r14, r8)
            if (r6 != 0) goto L_0x0525
            r16 = 0
            goto L_0x0529
        L_0x054d:
            X.2ss r0 = r12.A08
            X.31A r9 = r0.A0A(r10, r7)
            if (r9 != 0) goto L_0x055f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "MessageAddOnManager/getChatInfo/no chat for "
            X.C18260x0.A1S(r1, r0, r10)
            goto L_0x04f8
        L_0x055f:
            X.2Lw r1 = r9.A0f
            if (r1 != 0) goto L_0x05a0
            long r13 = r9.A00()
            r10 = 0
            int r0 = (r13 > r10 ? 1 : (r13 == r10 ? 0 : -1))
            if (r0 <= 0) goto L_0x059c
            X.3dV r0 = r12.A0G
            X.4GK r7 = r0.get()
            long r0 = r9.A00()     // Catch:{ all -> 0x0611 }
            X.1mH r11 = r12.A06(r7, r0)     // Catch:{ all -> 0x0611 }
            r10 = 0
            if (r11 == 0) goto L_0x0597
            boolean r0 = r12.A0I(r11)     // Catch:{ all -> 0x0611 }
            if (r0 == 0) goto L_0x0597
            X.3Lv r0 = r12.A09     // Catch:{ all -> 0x0611 }
            X.2z0 r1 = r11.A1v()     // Catch:{ all -> 0x0611 }
            X.2qz r0 = r0.A2D     // Catch:{ all -> 0x0611 }
            X.34x r0 = r0.A05(r1)     // Catch:{ all -> 0x0611 }
            if (r0 == 0) goto L_0x0597
            X.2Lw r10 = new X.2Lw     // Catch:{ all -> 0x0611 }
            r10.<init>(r0, r11)     // Catch:{ all -> 0x0611 }
        L_0x0597:
            r9.A0f = r10     // Catch:{ all -> 0x0611 }
            r7.close()
        L_0x059c:
            X.2Lw r1 = r9.A0f
            if (r1 == 0) goto L_0x0502
        L_0x05a0:
            X.1mH r9 = r1.A01
            com.whatsapp.jid.UserJid r0 = r9.A0o()
            if (r0 == 0) goto L_0x0502
            X.3Ex r7 = r5.A05
            com.whatsapp.jid.UserJid r0 = r9.A0o()
            X.3ZH r15 = r7.A0A(r0)
            goto L_0x0502
        L_0x05b4:
            r1 = r15
            goto L_0x0502
        L_0x05b7:
            X.2rV r1 = r5.A0J
            X.34x r8 = r1.A00(r8)
            goto L_0x04d9
        L_0x05bf:
            r8 = 0
            goto L_0x04d9
        L_0x05c2:
            r8 = r15
            goto L_0x04d9
        L_0x05c5:
            X.2rV r1 = r5.A0J
            X.34x r8 = r1.A00(r6)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            goto L_0x04d9
        L_0x05d1:
            boolean r1 = r0 instanceof X.AnonymousClass4q0
            if (r1 == 0) goto L_0x05ed
            X.4q0 r0 = (X.AnonymousClass4q0) r0
            X.4px r2 = r0.A01
            X.2rn r1 = r2.A0I
            com.whatsapp.jid.GroupJid r0 = r0.A00
            X.2mt r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x060b
            X.2sW r2 = r2.A0G
            long r0 = r0.A00
            X.3ZF r13 = r2.A01(r0)
            goto L_0x002d
        L_0x05ed:
            X.4pz r0 = (X.C94154pz) r0
            X.0QU r1 = r0.A00
            boolean r1 = r1.A04()
            if (r1 != 0) goto L_0x060b
            X.4qF r1 = r0.A01
            X.30g r2 = r1.A01
            X.2oU r1 = r1.A02
            android.content.Context r3 = r1.A00
            X.3ZH r4 = r0.A00
            r6 = 640(0x280, float:8.97E-43)
            r5 = 0
            r7 = 0
            android.graphics.Bitmap r13 = r2.A03(r3, r4, r5, r6, r7)
            goto L_0x002d
        L_0x060b:
            r13 = 0
            goto L_0x002d
        L_0x060e:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0611:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0616 }
            throw r1
        L_0x0616:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x061b:
            X.0nr r0 = new X.0nr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117935sj.call():java.lang.Object");
    }
}
