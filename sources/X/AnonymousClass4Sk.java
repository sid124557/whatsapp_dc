package X;

import android.content.Context;
import com.whatsapp.bridge.wfal.WfalManager;

/* renamed from: X.4Sk  reason: invalid class name */
public class AnonymousClass4Sk extends C05430Th {
    public final Context A00;
    public final C116985rC A01;
    public final WfalManager A02;
    public final C624134x A03;
    public final C102335Il A04;
    public final C105105Tp A05;
    public final C113995mK A06;
    public final C45662aN A07;
    public final AnonymousClass5YA A08;
    public final C104745Se A09;
    public final C183538qC A0A;
    public final boolean A0B;

    /* JADX WARNING: Removed duplicated region for block: B:11:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x00be A[LOOP:0: B:13:0x00b8->B:15:0x00be, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass4Sk(android.content.Context r13, android.view.View r14, X.C116985rC r15, com.whatsapp.bridge.wfal.WfalManager r16, X.C624134x r17, X.C102335Il r18, X.C105105Tp r19, X.C113995mK r20, X.C45662aN r21, X.AnonymousClass5YA r22, X.C104745Se r23, X.C183538qC r24, boolean r25) {
        /*
            r12 = this;
            r9 = 0
            r10 = 2130970339(0x7f0406e3, float:1.7549385E38)
            r6 = r12
            r7 = r13
            r8 = r14
            r11 = r9
            r6.<init>(r7, r8, r9, r10, r11)
            r12.A00 = r13
            r0 = r17
            r12.A03 = r0
            r0 = r23
            r12.A09 = r0
            r12.A01 = r15
            r0 = r16
            r12.A02 = r0
            r0 = r19
            r12.A05 = r0
            r0 = r20
            r12.A06 = r0
            r0 = r22
            r12.A08 = r0
            r0 = r21
            r12.A07 = r0
            r0 = r24
            r12.A0A = r0
            r0 = r25
            r12.A0B = r0
            r0 = r18
            r12.A04 = r0
            X.0cz r4 = r12.A04
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            r0 = 2131431441(0x7f0b1011, float:1.8484611E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890698(0x7f12120a, float:1.9416095E38)
            java.lang.String r0 = r13.getString(r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
            r0 = 2131431477(0x7f0b1035, float:1.8484684E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890699(0x7f12120b, float:1.9416097E38)
            java.lang.String r0 = r13.getString(r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
            com.whatsapp.bridge.wfal.WfalManager r0 = r12.A02
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x00dc
            X.2aN r5 = r12.A07
            X.34x r2 = r12.A03
            X.223 r0 = X.AnonymousClass223.FACEBOOK
            boolean r0 = r5.A00(r0, r2)
            if (r0 == 0) goto L_0x0084
            r0 = 2131431475(0x7f0b1033, float:1.848468E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890700(0x7f12120c, float:1.94161E38)
            java.lang.String r0 = r13.getString(r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
        L_0x0084:
            X.223 r0 = X.AnonymousClass223.INSTAGRAM
            boolean r0 = r5.A00(r0, r2)
            if (r0 == 0) goto L_0x009d
            r0 = 2131431476(0x7f0b1034, float:1.8484682E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890701(0x7f12120d, float:1.9416101E38)
        L_0x0096:
            java.lang.String r0 = r13.getString(r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
        L_0x009d:
            X.34x r0 = r12.A03
            X.C162457s7.A0J(r0, r9)
            boolean r0 = r12.A0B
            if (r0 != 0) goto L_0x00b7
            r0 = 2131431437(0x7f0b100d, float:1.8484603E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890697(0x7f121209, float:1.9416093E38)
            java.lang.String r0 = r13.getString(r0)
            X.AnonymousClass0x2.A1G(r1, r0, r3)
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x010d
            java.lang.Object r1 = r3.get(r2)
            X.0PJ r1 = (X.AnonymousClass0PJ) r1
            java.lang.Object r0 = r1.A00
            X.C626936e.A06(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r1 = r1.A01
            X.C626936e.A06(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r0 = r0.intValue()
            r4.add((int) r9, (int) r0, (int) r9, (java.lang.CharSequence) r1)
            int r2 = r2 + 1
            goto L_0x00b8
        L_0x00dc:
            X.5Se r0 = r12.A09
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x00fe
            X.5YA r2 = r12.A08
            X.34x r0 = r12.A03
            java.util.List r1 = java.util.Collections.singletonList(r0)
            r0 = 4
            boolean r0 = X.AnonymousClass5O0.A00(r2, r1, r0)
            if (r0 == 0) goto L_0x009d
        L_0x00f3:
            r0 = 2131431475(0x7f0b1033, float:1.848468E38)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 2131890700(0x7f12120c, float:1.94161E38)
            goto L_0x0096
        L_0x00fe:
            X.5Tp r0 = r12.A05
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x009d
            X.34x r0 = r12.A03
            boolean r0 = r0 instanceof X.C30721mu
            if (r0 != 0) goto L_0x009d
            goto L_0x00f3
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4Sk.<init>(android.content.Context, android.view.View, X.5rC, com.whatsapp.bridge.wfal.WfalManager, X.34x, X.5Il, X.5Tp, X.5mK, X.2aN, X.5YA, X.5Se, X.8qC, boolean):void");
    }
}
