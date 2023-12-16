package X;

import android.os.Environment;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.51w  reason: invalid class name */
public abstract class AnonymousClass51w extends AnonymousClass51x {
    public C625435m A00 = null;
    public C105395Ut A01;
    public final C621033m A02;
    public final C105365Uq A03;
    public final AnonymousClass36Y A04;
    public final C56232re A05;
    public final C624134x A06;
    public final C50222hp A07;
    public final C45042Yl A08;
    public final C113995mK A09;
    public final AnonymousClass5X9 A0A;
    public final C103005Lc A0B;
    public final C109665ez A0C = new C989753y(this, 16);
    public final C109665ez A0D = new C989753y(this, 18);
    public final C109665ez A0E = new C989753y(this, 17);

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c2, code lost:
        if (java.lang.Integer.valueOf(r21) != null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0J(int r27, boolean r28) {
        /*
            r26 = this;
            r0 = r26
            r3 = r27
            r8 = r28
            super.A0J(r3, r8)
            X.5mK r5 = r0.A09
            X.34x r7 = r0.A06
            X.36Y r2 = r0.A04
            X.2hp r1 = r0.A07
            X.2Yl r0 = r0.A08
            int r14 = X.AnonymousClass29K.A01(r2, r7, r1, r0)
            r20 = 5
            switch(r27) {
                case 1: goto L_0x014f;
                case 2: goto L_0x0153;
                case 3: goto L_0x0157;
                case 4: goto L_0x015b;
                case 5: goto L_0x001c;
                case 6: goto L_0x015f;
                default: goto L_0x001c;
            }
        L_0x001c:
            r0 = 0
            X.C162457s7.A0J(r7, r0)
            X.5R3 r4 = r5.A01
            if (r4 == 0) goto L_0x003b
            com.whatsapp.jid.UserJid r15 = X.C57572tr.A00(r7)
            if (r15 == 0) goto L_0x003b
            int r6 = r4.A01
            if (r6 >= 0) goto L_0x0046
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "unexpected status: "
            X.2z0 r0 = X.C624134x.A08(r7, r0, r1)
            X.C18270x1.A17(r0, r1)
        L_0x003b:
            X.5Kz r1 = r5.A00
            if (r1 == 0) goto L_0x0045
            int r0 = r1.A03
            int r0 = r0 + 1
            r1.A03 = r0
        L_0x0045:
            return
        L_0x0046:
            java.util.Map r10 = r4.A0D
            java.lang.Object r9 = r10.get(r15)
            X.5Ky r9 = (X.C102965Ky) r9
            if (r9 != 0) goto L_0x0140
            long r2 = r4.A02
            long r0 = r4.A03
            java.lang.Integer r9 = r4.A06
            if (r9 == 0) goto L_0x013a
            int r18 = r9.intValue()
        L_0x005c:
            java.util.List r9 = r4.A0A
            java.util.Iterator r12 = r9.iterator()
        L_0x0062:
            boolean r9 = r12.hasNext()
            r13 = 0
            if (r9 == 0) goto L_0x0137
            java.lang.Object r11 = r12.next()
            r9 = r11
            X.34r r9 = (X.C623534r) r9
            com.whatsapp.jid.UserJid r9 = r9.A0A
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x0062
        L_0x0078:
            X.34r r11 = (X.C623534r) r11
            if (r11 != 0) goto L_0x0132
            java.util.List r9 = r4.A09
            java.util.Iterator r12 = r9.iterator()
        L_0x0082:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x012f
            java.lang.Object r11 = r12.next()
            r9 = r11
            X.34r r9 = (X.C623534r) r9
            com.whatsapp.jid.UserJid r9 = r9.A0A
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x0082
        L_0x0097:
            X.34r r11 = (X.C623534r) r11
            if (r11 != 0) goto L_0x0132
            java.util.List r9 = r4.A08
            java.util.Iterator r12 = r9.iterator()
        L_0x00a1:
            boolean r9 = r12.hasNext()
            if (r9 == 0) goto L_0x012d
            java.lang.Object r11 = r12.next()
            r9 = r11
            X.34r r9 = (X.C623534r) r9
            com.whatsapp.jid.UserJid r9 = r9.A0A
            boolean r9 = r15.equals(r9)
            if (r9 == 0) goto L_0x00a1
        L_0x00b6:
            X.34r r11 = (X.C623534r) r11
            if (r11 == 0) goto L_0x012a
            int r21 = r11.A03()
            java.lang.Integer r9 = java.lang.Integer.valueOf(r21)
            if (r9 == 0) goto L_0x012a
        L_0x00c4:
            java.util.Map r9 = r4.A0C
            java.lang.String r17 = X.C57572tr.A01(r9)
            X.5Ky r9 = new X.5Ky
            r22 = r2
            r24 = r0
            r19 = r6
            r16 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r24)
            r10.put(r15, r9)
        L_0x00da:
            java.util.Map r11 = r9.A08
            X.2z0 r10 = r7.A1J
            java.lang.Object r9 = r11.get(r10)
            X.2w8 r9 = (X.C58982w8) r9
            if (r9 != 0) goto L_0x0119
            java.lang.String r9 = r10.A01
            long r2 = r4.A03
            java.lang.Integer r0 = r4.A06
            if (r0 == 0) goto L_0x0114
            int r18 = r0.intValue()
        L_0x00f2:
            boolean r0 = r4.A01(r7)
            long r0 = (long) r0
            X.C162457s7.A0H(r9)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)
            X.2w8 r14 = new X.2w8
            r22 = r0
            r24 = r8
            r17 = r9
            r19 = r6
            r20 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r22, r24)
            r11.put(r10, r14)
        L_0x0110:
            r4.A00 = r15
            goto L_0x003b
        L_0x0114:
            int r18 = r4.A00(r15)
            goto L_0x00f2
        L_0x0119:
            int r0 = r9.A03
            int r0 = r0 + 1
            r9.A03 = r0
            long r2 = r9.A05
            boolean r0 = r4.A01(r7)
            long r0 = (long) r0
            long r2 = r2 + r0
            r9.A05 = r2
            goto L_0x0110
        L_0x012a:
            r21 = 0
            goto L_0x00c4
        L_0x012d:
            r11 = r13
            goto L_0x00b6
        L_0x012f:
            r11 = r13
            goto L_0x0097
        L_0x0132:
            int r21 = r11.A03()
            goto L_0x00c4
        L_0x0137:
            r11 = r13
            goto L_0x0078
        L_0x013a:
            int r18 = r4.A00(r15)
            goto L_0x005c
        L_0x0140:
            com.whatsapp.jid.UserJid r0 = r4.A00
            boolean r0 = r15.equals(r0)
            if (r0 != 0) goto L_0x00da
            int r0 = r9.A01
            int r0 = r0 + 1
            r9.A01 = r0
            goto L_0x00da
        L_0x014f:
            r20 = 1
            goto L_0x001c
        L_0x0153:
            r20 = 2
            goto L_0x001c
        L_0x0157:
            r20 = 3
            goto L_0x001c
        L_0x015b:
            r20 = 4
            goto L_0x001c
        L_0x015f:
            r20 = 6
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51w.A0J(int, boolean):void");
    }

    public void A01() {
        super.A01();
        AnonymousClass5X9 r2 = this.A0A;
        C624134x r1 = this.A06;
        C162457s7.A0J(r1, 0);
        if (r1 instanceof C30471mV) {
            r2.A05.remove(r1);
        }
    }

    public void A0D() {
        super.A0D();
        C624134x r1 = this.A06;
        if (r1 instanceof C30471mV) {
            AnonymousClass33C A002 = C30471mV.A00((C30471mV) r1);
            if (A002.A0F != null && !A002.A03()) {
                C105025Tg r5 = this.A0W;
                View view = this.A00;
                C626936e.A04(view);
                C89654ea r4 = (C89654ea) C111095hX.A04(view);
                C162457s7.A0J(r4, 0);
                String externalStorageState = Environment.getExternalStorageState();
                if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
                    C69263Wi r2 = r5.A00;
                    boolean A012 = C61072zf.A01();
                    int i = R.string.f11nameremoved;
                    if (A012) {
                        i = R.string.f11nameremoved;
                    }
                    r2.A0H(i, 1);
                }
                if (!r5.A02(r4)) {
                    C69263Wi r22 = r5.A00;
                    boolean A013 = C61072zf.A01();
                    int i2 = R.string.f11nameremoved;
                    if (A013) {
                        i2 = R.string.f11nameremoved;
                    }
                    r22.A0H(i2, 1);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x003b, code lost:
        if (r6 == 0) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0G() {
        /*
            r11 = this;
            X.5LV r3 = r11.A09()
            X.2eP r1 = r11.A0Q
            X.34x r6 = r11.A06
            X.1VX r0 = r11.A0O
            boolean r0 = X.AnonymousClass5VM.A01(r0, r1, r6)
            r2 = 8
            if (r0 != 0) goto L_0x00b6
            boolean r0 = r6.A1N
            if (r0 != 0) goto L_0x00b6
            X.1mV r6 = (X.C30471mV) r6
            X.33C r9 = X.C30471mV.A00(r6)
            boolean r0 = r9.A0c
            r5 = 0
            r4 = 0
            if (r0 == 0) goto L_0x005e
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            android.view.View r0 = r3.A04
            r0.setBackground(r5)
            com.whatsapp.CircularProgressBar r10 = r3.A0D
            long r0 = r9.A0C
            r7 = 0
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L_0x003d
            r7 = 100
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r0 = 0
            if (r6 != 0) goto L_0x003e
        L_0x003d:
            r0 = 1
        L_0x003e:
            r10.setIndeterminate(r0)
            com.whatsapp.CircularProgressBar r7 = r3.A0D
            long r0 = r9.A0C
            int r6 = (int) r0
            r7.setProgress(r6)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r2)
        L_0x0058:
            android.view.View r0 = r3.A00
        L_0x005a:
            r0.setVisibility(r2)
            return
        L_0x005e:
            int r1 = r9.A07
            r0 = 1
            if (r1 != r0) goto L_0x007e
            android.view.View r0 = r3.A04
            r0.setVisibility(r2)
            byte r5 = r6.A1I
            android.widget.TextView r2 = r3.A0C
            r1 = 2
            r0 = 2131889529(0x7f120d79, float:1.9413724E38)
            if (r5 != r1) goto L_0x0075
            r0 = 2131889528(0x7f120d78, float:1.9413722E38)
        L_0x0075:
            r2.setText(r0)
            android.widget.TextView r0 = r3.A0C
            r0.setVisibility(r4)
            return
        L_0x007e:
            boolean r0 = r9.A0R
            if (r0 != 0) goto L_0x00b6
            android.view.View r1 = r3.A04
            r0 = 2131231412(0x7f0802b4, float:1.8078904E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setVisibility(r2)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r4)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131887188(0x7f120454, float:1.9408976E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131231121(0x7f080191, float:1.8078314E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.widget.TextView r1 = r3.A0B
            X.5ez r0 = r11.A0C
            r1.setOnClickListener(r0)
            goto L_0x0058
        L_0x00b6:
            android.view.View r0 = r3.A04
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51w.A0G():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x006b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0I(int r12) {
        /*
            r11 = this;
            super.A0I(r12)
            X.34x r3 = r11.A06
            X.2z0 r2 = r3.A1J
            boolean r0 = r2.A02
            if (r0 != 0) goto L_0x0019
            X.5Ut r0 = r11.A08()
            boolean r0 = r0.A0A()
            if (r0 == 0) goto L_0x0106
            boolean r0 = r11.A04
            if (r0 == 0) goto L_0x0106
        L_0x0019:
            r5 = 1
        L_0x001a:
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "playbackPage/reportStatusExitStats result:"
            r7.append(r0)
            r7.append(r5)
            java.lang.String r0 = " loading:"
            r7.append(r0)
            X.33M r4 = r11.A0X
            long r0 = r4.A06()
            r7.append(r0)
            java.lang.String r0 = " viewed:"
            r7.append(r0)
            X.33M r6 = r11.A0Z
            long r0 = r6.A06()
            r7.append(r0)
            java.lang.String r0 = " paused: "
            r7.append(r0)
            X.33M r0 = r11.A0Y
            long r0 = r0.A06()
            r7.append(r0)
            java.lang.String r0 = " duration:"
            r7.append(r0)
            X.5Ut r0 = r11.A08()
            long r0 = r0.A02()
            r7.append(r0)
            X.AnonymousClass0x2.A18(r7)
            X.5Ut r0 = r11.A08()
            boolean r0 = r0 instanceof X.C985651j
            if (r0 == 0) goto L_0x00c9
            X.5Ut r8 = r11.A08()
            X.51j r8 = (X.C985651j) r8
            java.lang.Integer r1 = r8.A03
            if (r1 == 0) goto L_0x009d
            X.5mK r0 = r11.A09
            int r7 = r1.intValue()
            X.5R3 r0 = r0.A01
            if (r0 == 0) goto L_0x009d
            java.util.Map r1 = r0.A0D
            com.whatsapp.jid.UserJid r0 = X.C57572tr.A00(r3)
            java.lang.Object r0 = r1.get(r0)
            X.5Ky r0 = (X.C102965Ky) r0
            if (r0 == 0) goto L_0x009d
            java.util.Map r0 = r0.A08
            java.lang.Object r1 = r0.get(r2)
            X.2w8 r1 = (X.C58982w8) r1
            if (r1 == 0) goto L_0x009d
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0G = r0
        L_0x009d:
            java.lang.Integer r1 = r8.A02
            if (r1 == 0) goto L_0x00c9
            X.5mK r0 = r11.A09
            int r7 = r1.intValue()
            X.5R3 r0 = r0.A01
            if (r0 == 0) goto L_0x00c9
            java.util.Map r1 = r0.A0D
            com.whatsapp.jid.UserJid r0 = X.C57572tr.A00(r3)
            java.lang.Object r0 = r1.get(r0)
            X.5Ky r0 = (X.C102965Ky) r0
            if (r0 == 0) goto L_0x00c9
            java.util.Map r0 = r0.A08
            java.lang.Object r1 = r0.get(r2)
            X.2w8 r1 = (X.C58982w8) r1
            if (r1 == 0) goto L_0x00c9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            r1.A0F = r0
        L_0x00c9:
            X.5mK r10 = r11.A09
            X.5Ut r0 = r11.A08()
            long r0 = r0.A02()
            long r8 = r4.A06()
            long r6 = r6.A06()
            X.5R3 r4 = r10.A01
            if (r4 == 0) goto L_0x0105
            java.util.Map r4 = r4.A0D
            com.whatsapp.jid.UserJid r3 = X.C57572tr.A00(r3)
            java.lang.Object r3 = r4.get(r3)
            X.5Ky r3 = (X.C102965Ky) r3
            if (r3 == 0) goto L_0x0105
            java.util.Map r3 = r3.A08
            java.lang.Object r2 = r3.get(r2)
            X.2w8 r2 = (X.C58982w8) r2
            if (r2 == 0) goto L_0x0105
            r2.A04 = r5
            r2.A06 = r0
            long r0 = r2.A07
            long r0 = r0 + r8
            r2.A07 = r0
            long r0 = r2.A08
            long r0 = r0 + r6
            r2.A08 = r0
        L_0x0105:
            return
        L_0x0106:
            boolean r0 = r3 instanceof X.C30471mV
            if (r0 == 0) goto L_0x0118
            r0 = r3
            X.1mV r0 = (X.C30471mV) r0
            X.33C r0 = X.C30471mV.A00(r0)
            boolean r0 = r0.A0c
            if (r0 == 0) goto L_0x0118
        L_0x0115:
            r5 = 2
            goto L_0x001a
        L_0x0118:
            X.1VX r1 = r11.A0O
            r0 = 2086(0x826, float:2.923E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 != 0) goto L_0x0125
            r5 = 3
            goto L_0x001a
        L_0x0125:
            X.35m r0 = r11.A00
            if (r0 == 0) goto L_0x017e
            int r0 = r0.A01
            r5 = 3
            switch(r0) {
                case -1: goto L_0x0131;
                case 0: goto L_0x0019;
                case 1: goto L_0x017e;
                case 2: goto L_0x0135;
                case 3: goto L_0x0138;
                case 4: goto L_0x013b;
                case 5: goto L_0x013e;
                case 6: goto L_0x0142;
                case 7: goto L_0x0146;
                case 8: goto L_0x014a;
                case 9: goto L_0x014e;
                case 10: goto L_0x012f;
                case 11: goto L_0x0152;
                case 12: goto L_0x0156;
                case 13: goto L_0x0115;
                case 14: goto L_0x0019;
                case 15: goto L_0x015a;
                case 16: goto L_0x015e;
                case 17: goto L_0x0162;
                case 18: goto L_0x0166;
                case 19: goto L_0x016a;
                case 20: goto L_0x016e;
                case 21: goto L_0x0172;
                case 22: goto L_0x0176;
                case 23: goto L_0x017a;
                case 24: goto L_0x0115;
                case 25: goto L_0x0166;
                case 26: goto L_0x012f;
                case 27: goto L_0x012f;
                case 28: goto L_0x012f;
                case 29: goto L_0x012f;
                case 30: goto L_0x012f;
                case 31: goto L_0x012f;
                case 32: goto L_0x0146;
                default: goto L_0x012f;
            }
        L_0x012f:
            goto L_0x001a
        L_0x0131:
            r5 = 23
            goto L_0x001a
        L_0x0135:
            r5 = 5
            goto L_0x001a
        L_0x0138:
            r5 = 6
            goto L_0x001a
        L_0x013b:
            r5 = 7
            goto L_0x001a
        L_0x013e:
            r5 = 8
            goto L_0x001a
        L_0x0142:
            r5 = 9
            goto L_0x001a
        L_0x0146:
            r5 = 10
            goto L_0x001a
        L_0x014a:
            r5 = 11
            goto L_0x001a
        L_0x014e:
            r5 = 12
            goto L_0x001a
        L_0x0152:
            r5 = 13
            goto L_0x001a
        L_0x0156:
            r5 = 14
            goto L_0x001a
        L_0x015a:
            r5 = 17
            goto L_0x001a
        L_0x015e:
            r5 = 18
            goto L_0x001a
        L_0x0162:
            r5 = 19
            goto L_0x001a
        L_0x0166:
            r5 = 20
            goto L_0x001a
        L_0x016a:
            r5 = 21
            goto L_0x001a
        L_0x016e:
            r5 = 22
            goto L_0x001a
        L_0x0172:
            r5 = 24
            goto L_0x001a
        L_0x0176:
            r5 = 25
            goto L_0x001a
        L_0x017a:
            r5 = 26
            goto L_0x001a
        L_0x017e:
            r5 = 4
            goto L_0x001a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51w.A0I(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0030, code lost:
        if (r5 == 100) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0P() {
        /*
            r11 = this;
            X.5LV r3 = r11.A09()
            X.34x r1 = r11.A06
            boolean r0 = r1 instanceof X.C30471mV
            r5 = 0
            if (r0 == 0) goto L_0x00a6
            X.1mV r1 = (X.C30471mV) r1
            X.33C r10 = r1.A01
        L_0x000f:
            r2 = 8
            r4 = 0
            if (r10 == 0) goto L_0x0093
            boolean r0 = r10.A0R
            if (r0 != 0) goto L_0x0093
            boolean r0 = r10.A0c
            if (r0 == 0) goto L_0x005a
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r9 = r3.A0D
            long r5 = r10.A0C
            r7 = 0
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 == 0) goto L_0x0032
            r7 = 100
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            r9.setIndeterminate(r0)
            com.whatsapp.CircularProgressBar r1 = r3.A0D
            long r5 = r10.A0C
            int r0 = (int) r5
            r1.setProgress(r0)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setVisibility(r4)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r2)
            android.view.View r0 = r3.A00
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r1 = r3.A0D
            X.5ez r0 = r11.A0D
            r1.setOnClickListener(r0)
        L_0x0054:
            android.view.ViewGroup r0 = r3.A08
            r0.setVisibility(r2)
        L_0x0059:
            return
        L_0x005a:
            android.view.View r1 = r3.A04
            r0 = 2131231412(0x7f0802b4, float:1.8078904E38)
            r1.setBackgroundResource(r0)
            android.view.View r0 = r3.A04
            r0.setVisibility(r4)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setVisibility(r2)
            com.whatsapp.CircularProgressBar r0 = r3.A0D
            r0.setOnClickListener(r5)
            android.widget.TextView r0 = r3.A0B
            r0.setVisibility(r4)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131893203(0x7f121bd3, float:1.9421176E38)
            r1.setText(r0)
            android.widget.TextView r1 = r3.A0B
            r0 = 2131231174(0x7f0801c6, float:1.8078422E38)
            r1.setCompoundDrawablesWithIntrinsicBounds(r0, r4, r4, r4)
            android.widget.TextView r1 = r3.A0B
            X.5ez r0 = r11.A0E
            r1.setOnClickListener(r0)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            goto L_0x0054
        L_0x0093:
            android.view.View r0 = r3.A04
            r0.setVisibility(r2)
            android.view.ViewGroup r0 = r3.A08
            int r0 = r0.getVisibility()
            if (r0 != r2) goto L_0x0059
            android.view.ViewGroup r0 = r3.A08
            r0.setVisibility(r4)
            return
        L_0x00a6:
            r10 = r5
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51w.A0P():void");
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1A(this, A0o);
        A0o.append(" for ");
        C624134x r2 = this.A06;
        A0o.append(r2.A1J);
        A0o.append(" ");
        A0o.append(r2.A0n());
        A0o.append(" ");
        return AnonymousClass000.A0h(A0o, r2.A1I);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass51w(X.C184988ss r29, X.C111095hX r30, X.C69263Wi r31, X.AnonymousClass5Ul r32, X.C621033m r33, X.C105365Uq r34, X.C620633i r35, X.C56612sH r36, X.C620733j r37, X.C66543Lv r38, X.C114635nM r39, X.C54012o2 r40, X.C620233e r41, X.AnonymousClass36Y r42, X.AnonymousClass1VX r43, X.C28071fd r44, X.C56232re r45, X.C48132eP r46, X.C624134x r47, X.C50222hp r48, X.C45042Yl r49, X.AnonymousClass1R1 r50, X.C113995mK r51, X.AnonymousClass5X9 r52, X.C103005Lc r53, X.AnonymousClass5SJ r54, X.C55832qz r55, X.C105025Tg r56, X.AnonymousClass4FS r57, X.C105215Ua r58) {
        /*
            r28 = this;
            r4 = r28
            r26 = r57
            r6 = r30
            r7 = r31
            r9 = r33
            r10 = r35
            r11 = r36
            r12 = r37
            r13 = r38
            r14 = r39
            r15 = r40
            r16 = r41
            r8 = r32
            r27 = r58
            r5 = r29
            r3 = r42
            r18 = r43
            r19 = r44
            r20 = r46
            r21 = r50
            r2 = r51
            r23 = r54
            r24 = r55
            r25 = r56
            r22 = r2
            r17 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27)
            r0 = 0
            r4.A00 = r0
            r1 = 16
            X.53y r0 = new X.53y
            r0.<init>(r4, r1)
            r4.A0C = r0
            r1 = 17
            X.53y r0 = new X.53y
            r0.<init>(r4, r1)
            r4.A0E = r0
            r1 = 18
            X.53y r0 = new X.53y
            r0.<init>(r4, r1)
            r4.A0D = r0
            r0 = r47
            r4.A06 = r0
            r4.A02 = r9
            r0 = r52
            r4.A0A = r0
            r0 = r45
            r4.A05 = r0
            r0 = r53
            r4.A0B = r0
            r4.A09 = r2
            r0 = r34
            r4.A03 = r0
            r4.A04 = r3
            r0 = r48
            r4.A07 = r0
            r0 = r49
            r4.A08 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass51w.<init>(X.8ss, X.5hX, X.3Wi, X.5Ul, X.33m, X.5Uq, X.33i, X.2sH, X.33j, X.3Lv, X.5nM, X.2o2, X.33e, X.36Y, X.1VX, X.1fd, X.2re, X.2eP, X.34x, X.2hp, X.2Yl, X.1R1, X.5mK, X.5X9, X.5Lc, X.5SJ, X.2qz, X.5Tg, X.4FS, X.5Ua):void");
    }
}
