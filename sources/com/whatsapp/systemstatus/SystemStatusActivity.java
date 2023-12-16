package com.whatsapp.systemstatus;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass5WY;
import X.C107695bk;
import X.C53202mi;
import X.C64333Db;
import X.C89644eZ;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SystemStatusActivity extends C89644eZ {
    public int A00;
    public AnonymousClass5WY A01;
    public C53202mi A02;
    public String A03;
    public String A04;
    public ArrayList A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public final List A0A;

    public void A5r() {
        if (!this.A08) {
            this.A08 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A01 = (AnonymousClass5WY) A002.AUS.get();
            this.A02 = (C53202mi) A002.AXV.get();
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0345, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0355, code lost:
        r0 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0359, code lost:
        if (r0 == null) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x035b, code lost:
        r4 = X.AnonymousClass000.A0m(r0, " ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0361, code lost:
        if (r12.A07 == false) goto L_0x0368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x0363, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0368, code lost:
        r1 = r12.A0A.contains(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x007b, code lost:
        if (r1 == null) goto L_0x007d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01fc, code lost:
        r5 = getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0200, code lost:
        if (r5 == null) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0202, code lost:
        r6.append("  • ");
        r6.append(r5);
        r6.append(10);
        r9 = r9 + 1;
        r2 = r7;
     */
    /* JADX WARNING: Removed duplicated region for block: B:149:0x0374  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r22) {
        /*
            r21 = this;
            r12 = r21
            r0 = r22
            super.onCreate(r0)
            r2 = 2131894299(0x7f12201b, float:1.9423399E38)
            X.0R8 r0 = X.AnonymousClass1Ha.A1l(r12, r2)
            r10 = 1
            r0.A0N(r10)
            X.0R8 r0 = r12.getSupportActionBar()
            r0.A0O(r10)
            r0 = 2131626168(0x7f0e08b8, float:1.8879565E38)
            r12.setContentView((int) r0)
            android.content.Intent r1 = r12.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.from"
            java.lang.String r0 = r1.getStringExtra(r0)
            r12.A03 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.type"
            r4 = 0
            int r0 = r1.getIntExtra(r0, r4)
            r12.A00 = r0
            X.0R8 r0 = r12.getSupportActionBar()
            r0.A0B(r2)
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.email"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A07 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.version"
            boolean r0 = r1.getBooleanExtra(r0, r10)
            r12.A09 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.statusonly"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r12.A06 = r0
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.serverfeaturesunavailable"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            r12.A05 = r0
            java.lang.String r5 = "registration"
            boolean r2 = r0.remove(r5)
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x010d
            r0 = 2131892936(0x7f121ac8, float:1.9420634E38)
            java.lang.String r2 = r12.getString(r0)
            boolean r1 = r12.A07
            r0 = 2131894300(0x7f12201c, float:1.94234E38)
            if (r1 == 0) goto L_0x0077
            r0 = 2131894301(0x7f12201d, float:1.9423403E38)
        L_0x0077:
            java.lang.String r1 = X.AnonymousClass0x2.A0X(r12, r2, r10, r0)
        L_0x007b:
            if (r1 != 0) goto L_0x0088
        L_0x007d:
            boolean r0 = r12.A06
            if (r0 == 0) goto L_0x00dc
            r0 = 2131893685(0x7f121db5, float:1.9422154E38)
            java.lang.String r1 = r12.getString(r0)
        L_0x0088:
            r0 = 2131434151(0x7f0b1aa7, float:1.8490108E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r12, r0)
            r0.setText(r1)
            boolean r0 = r12.A06
            if (r0 != 0) goto L_0x0374
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0374
            java.lang.String r0 = r12.A04
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "+"
            r2.append(r1)
            java.util.ArrayList r0 = r12.A05
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r2)
            r12.A04 = r1
            boolean r0 = r12.A09
            if (r0 != 0) goto L_0x00c3
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r1)
            java.lang.String r0 = "+version"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            r12.A04 = r0
        L_0x00c3:
            r0 = 2131434153(0x7f0b1aa9, float:1.8490112E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 25
            X.C18280x3.A0o(r1, r12, r0)
            r0 = 2131434152(0x7f0b1aa8, float:1.849011E38)
            android.view.View r1 = r12.findViewById(r0)
            r0 = 26
            X.C18280x3.A0o(r1, r12, r0)
            return
        L_0x00dc:
            X.5WY r11 = r12.A01
            X.2mi r0 = r12.A02
            boolean r20 = r0.A00()
            java.lang.String r4 = r12.A03
            java.lang.String r3 = r12.A04
            int r0 = r12.A00
            java.lang.Integer r15 = java.lang.Integer.valueOf(r0)
            r14 = 0
            android.content.Intent r2 = r12.getIntent()
            java.lang.String r0 = "com.whatsapp.SystemStatusActivity.describeProblemBundle"
            android.os.Bundle r13 = r2.getBundleExtra(r0)
            r19 = r14
            r16 = r4
            r17 = r3
            r18 = r14
            android.content.Intent r0 = r11.A00(r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r12.startActivity(r0)
            r12.finish()
            goto L_0x0088
        L_0x010d:
            int r0 = r12.A00
            java.lang.String r3 = " "
            r1 = 0
            if (r0 == r10) goto L_0x013e
            if (r2 == 0) goto L_0x007d
            boolean r0 = r12.A07
            if (r0 != 0) goto L_0x0370
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            r0 = 2131894292(0x7f122014, float:1.9423385E38)
            X.AnonymousClass0x2.A0s(r12, r4, r0)
            r4.append(r3)
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r5)
        L_0x012d:
            r0 = 2131894266(0x7f121ffa, float:1.9423332E38)
            if (r1 == 0) goto L_0x0135
            r0 = 2131894268(0x7f121ffc, float:1.9423336E38)
        L_0x0135:
            X.AnonymousClass0x2.A0s(r12, r4, r0)
            java.lang.String r1 = r4.toString()
            goto L_0x007b
        L_0x013e:
            java.util.ArrayList r2 = r12.A05
            java.lang.String r0 = "chat"
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x0158
            boolean r1 = r12.A07
            r0 = 2131894264(0x7f121ff8, float:1.9423328E38)
            if (r1 == 0) goto L_0x0152
            r0 = 2131894265(0x7f121ff9, float:1.942333E38)
        L_0x0152:
            java.lang.String r1 = r12.getString(r0)
            goto L_0x007b
        L_0x0158:
            java.util.ArrayList r2 = r12.A05
            int r0 = r2.size()
            if (r0 <= 0) goto L_0x007d
            r2.size()
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.util.Iterator r11 = r2.iterator()
            r2 = r1
            r9 = 0
        L_0x016d:
            boolean r0 = r11.hasNext()
            r8 = 10
            if (r0 == 0) goto L_0x0212
            java.lang.String r7 = X.AnonymousClass001.A0m(r11)
            int r0 = r7.hashCode()
            switch(r0) {
                case -1618876223: goto L_0x01f1;
                case -1012222381: goto L_0x01e4;
                case -892481550: goto L_0x01d7;
                case -309425751: goto L_0x01ca;
                case 3314326: goto L_0x01be;
                case 3452698: goto L_0x01b1;
                case 3545755: goto L_0x01a4;
                case 98629247: goto L_0x0198;
                case 1262089803: goto L_0x018b;
                default: goto L_0x0180;
            }
        L_0x0180:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sysstatus/create/m-down/string-not-found "
            X.C18260x0.A0r(r0, r7, r5)
            goto L_0x016d
        L_0x018b:
            java.lang.String r0 = "multimedia"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894278(0x7f122006, float:1.9423356E38)
            goto L_0x01fc
        L_0x0198:
            java.lang.String r0 = "group"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894272(0x7f122000, float:1.9423344E38)
            goto L_0x01fc
        L_0x01a4:
            java.lang.String r0 = "sync"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894298(0x7f12201a, float:1.9423397E38)
            goto L_0x01fc
        L_0x01b1:
            java.lang.String r0 = "push"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894291(0x7f122013, float:1.9423383E38)
            goto L_0x01fc
        L_0x01be:
            java.lang.String r0 = "last"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894275(0x7f122003, float:1.942335E38)
            goto L_0x01fc
        L_0x01ca:
            java.lang.String r0 = "profile"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894288(0x7f122010, float:1.9423377E38)
            goto L_0x01fc
        L_0x01d7:
            java.lang.String r0 = "status"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894295(0x7f122017, float:1.942339E38)
            goto L_0x01fc
        L_0x01e4:
            java.lang.String r0 = "online"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894285(0x7f12200d, float:1.942337E38)
            goto L_0x01fc
        L_0x01f1:
            java.lang.String r0 = "broadcast"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0180
            r0 = 2131894263(0x7f121ff7, float:1.9423326E38)
        L_0x01fc:
            java.lang.String r5 = r12.getString(r0)
            if (r5 == 0) goto L_0x0180
            java.lang.String r0 = "  • "
            r6.append(r0)
            r6.append(r5)
            r6.append(r8)
            int r9 = r9 + 1
            r2 = r7
            goto L_0x016d
        L_0x0212:
            if (r9 <= r10) goto L_0x023d
            r6.append(r8)
            boolean r0 = r12.A07
            java.lang.String r1 = "\n\n"
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()
            if (r0 == 0) goto L_0x022f
            r0 = 2131894280(0x7f122008, float:1.942336E38)
            X.AnonymousClass0x2.A0s(r12, r4, r0)
            X.C18270x1.A1H(r4, r1, r6)
            r0 = 2131894282(0x7f12200a, float:1.9423364E38)
            goto L_0x0135
        L_0x022f:
            r0 = 2131894279(0x7f122007, float:1.9423358E38)
            X.AnonymousClass0x2.A0s(r12, r4, r0)
            X.C18270x1.A1H(r4, r1, r6)
            r0 = 2131894281(0x7f122009, float:1.9423362E38)
            goto L_0x0135
        L_0x023d:
            if (r9 <= 0) goto L_0x007d
            boolean r5 = r12.A07
            int r0 = r2.hashCode()
            if (r5 == 0) goto L_0x02cf
            switch(r0) {
                case -1618876223: goto L_0x034a;
                case -1012222381: goto L_0x02c1;
                case -892481550: goto L_0x02b3;
                case -309425751: goto L_0x02a5;
                case 3314326: goto L_0x0298;
                case 3452698: goto L_0x028a;
                case 3545755: goto L_0x027c;
                case 98629247: goto L_0x026f;
                case 1262089803: goto L_0x0261;
                default: goto L_0x024a;
            }
        L_0x024a:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sysstatus/create/down/string-not-found "
            r2.append(r0)
            java.util.ArrayList r0 = r12.A05
            java.lang.Object r0 = r0.get(r4)
            java.lang.String r0 = (java.lang.String) r0
            X.C18260x0.A1K(r2, r0)
            goto L_0x007d
        L_0x0261:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894277(0x7f122005, float:1.9423354E38)
            goto L_0x0355
        L_0x026f:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894271(0x7f121fff, float:1.9423342E38)
            goto L_0x0355
        L_0x027c:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894297(0x7f122019, float:1.9423395E38)
            goto L_0x0355
        L_0x028a:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894290(0x7f122012, float:1.942338E38)
            goto L_0x0355
        L_0x0298:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894274(0x7f122002, float:1.9423348E38)
            goto L_0x0355
        L_0x02a5:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894287(0x7f12200f, float:1.9423375E38)
            goto L_0x0355
        L_0x02b3:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894294(0x7f122016, float:1.9423389E38)
            goto L_0x0355
        L_0x02c1:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894284(0x7f12200c, float:1.9423368E38)
            goto L_0x0355
        L_0x02cf:
            switch(r0) {
                case -1618876223: goto L_0x033a;
                case -1012222381: goto L_0x032d;
                case -892481550: goto L_0x0320;
                case -309425751: goto L_0x0313;
                case 3314326: goto L_0x0307;
                case 3452698: goto L_0x02fa;
                case 3545755: goto L_0x02ed;
                case 98629247: goto L_0x02e1;
                case 1262089803: goto L_0x02d4;
                default: goto L_0x02d2;
            }
        L_0x02d2:
            goto L_0x024a
        L_0x02d4:
            java.lang.String r0 = "multimedia"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894276(0x7f122004, float:1.9423352E38)
            goto L_0x0345
        L_0x02e1:
            java.lang.String r0 = "group"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894270(0x7f121ffe, float:1.942334E38)
            goto L_0x0345
        L_0x02ed:
            java.lang.String r0 = "sync"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894296(0x7f122018, float:1.9423393E38)
            goto L_0x0345
        L_0x02fa:
            java.lang.String r0 = "push"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894289(0x7f122011, float:1.9423379E38)
            goto L_0x0345
        L_0x0307:
            java.lang.String r0 = "last"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894273(0x7f122001, float:1.9423346E38)
            goto L_0x0345
        L_0x0313:
            java.lang.String r0 = "profile"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894286(0x7f12200e, float:1.9423372E38)
            goto L_0x0345
        L_0x0320:
            java.lang.String r0 = "status"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894293(0x7f122015, float:1.9423387E38)
            goto L_0x0345
        L_0x032d:
            java.lang.String r0 = "online"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894283(0x7f12200b, float:1.9423366E38)
            goto L_0x0345
        L_0x033a:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894261(0x7f121ff5, float:1.9423322E38)
        L_0x0345:
            java.lang.String r0 = r12.getString(r0)
            goto L_0x0359
        L_0x034a:
            java.lang.String r0 = "broadcast"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x024a
            r0 = 2131894262(0x7f121ff6, float:1.9423324E38)
        L_0x0355:
            java.lang.String r0 = r12.getString(r0)
        L_0x0359:
            if (r0 == 0) goto L_0x024a
            java.lang.StringBuilder r4 = X.AnonymousClass000.A0m(r0, r3)
            boolean r0 = r12.A07
            if (r0 == 0) goto L_0x0368
            r0 = 2131894267(0x7f121ffb, float:1.9423334E38)
            goto L_0x0135
        L_0x0368:
            java.util.List r0 = r12.A0A
            boolean r1 = r0.contains(r2)
            goto L_0x012d
        L_0x0370:
            r12.A04 = r5
            goto L_0x007d
        L_0x0374:
            r0 = 2131434150(0x7f0b1aa6, float:1.8490106E38)
            X.AnonymousClass1Ha.A20(r12, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.systemstatus.SystemStatusActivity.onCreate(android.os.Bundle):void");
    }

    public SystemStatusActivity(int i) {
        this.A08 = false;
        AnonymousClass4HY.A00(this, 124);
    }

    public SystemStatusActivity() {
        this(0);
        this.A0A = Arrays.asList(new String[]{"broadcast", "registration", "sync", "status"});
    }
}
