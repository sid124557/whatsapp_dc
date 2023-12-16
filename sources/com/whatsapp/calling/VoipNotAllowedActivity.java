package com.whatsapp.calling;

import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass3DZ;
import X.AnonymousClass4HY;
import X.AnonymousClass4ID;
import X.AnonymousClass5ZU;
import X.C005205m;
import X.C107695bk;
import X.C185958uW;
import X.C64333Db;
import X.C64773Ex;
import X.C66433Lk;
import X.C89644eZ;
import X.C97094xc;
import android.content.res.Configuration;
import android.widget.LinearLayout;
import com.whatsapp.R;

public class VoipNotAllowedActivity extends C89644eZ {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C66433Lk A02;
    public C97094xc A03;
    public boolean A04;
    public final C185958uW A05;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = (C97094xc) r0.A29.get();
            this.A00 = C64333Db.A26(A002);
            this.A01 = C64333Db.A28(A002);
            this.A02 = C64333Db.A8X(A002);
        }
    }

    public VoipNotAllowedActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 24);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LinearLayout linearLayout = (LinearLayout) C005205m.A00(this, R.id.content);
        int i = 1;
        if (configuration.orientation != 1) {
            i = 0;
        }
        linearLayout.setOrientation(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0083, code lost:
        r0 = r10.A0L(new java.lang.Object[]{r9}, r6, (long) r7.size());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0090, code lost:
        r2.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0093, code lost:
        r5 = X.C005205m.A01(r11, com.whatsapp.R.id.ok);
        r2 = X.C005205m.A00(r11, com.whatsapp.R.id.more);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00a1, code lost:
        if (r8 != null) goto L_0x00d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00a3, code lost:
        r2.setVisibility(8);
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00ab, code lost:
        r5.setText(r0);
        X.C18300x5.A18(r5, r11, 25);
        r1 = (android.widget.LinearLayout) X.C005205m.A00(r11, com.whatsapp.R.id.content);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00c2, code lost:
        if (X.AnonymousClass001.A0M(r11).orientation != 1) goto L_0x00cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c4, code lost:
        r1.setOrientation(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c7, code lost:
        r11.A03.A06(r11.A05);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00ce, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00cf, code lost:
        r1.setOrientation(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00d3, code lost:
        r2.setVisibility(0);
        r2.setOnClickListener(new X.C109455ee(4, r8, r11));
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fc, code lost:
        r8 = X.C66433Lk.A00(r11.A02, "28030008").toString();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x015c, code lost:
        r0 = X.AnonymousClass0x2.A0X(r11, r9, 1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r12) {
        /*
            r11 = this;
            super.onCreate(r12)
            r0 = 2131626319(0x7f0e094f, float:1.887987E38)
            r11.setContentView((int) r0)
            android.view.Window r1 = r11.getWindow()
            r0 = 524288(0x80000, float:7.34684E-40)
            r1.addFlags(r0)
            r0 = 2131434290(0x7f0b1b32, float:1.849039E38)
            android.widget.TextView r5 = X.C005205m.A01(r11, r0)
            X.C106905aM.A04(r5)
            java.lang.Class<com.whatsapp.jid.UserJid> r2 = com.whatsapp.jid.UserJid.class
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "jids"
            java.util.ArrayList r0 = r1.getStringArrayListExtra(r0)
            java.util.List r7 = X.C627336j.A0B(r2, r0)
            boolean r0 = r7.isEmpty()
            r4 = 1
            r1 = r0 ^ 1
            java.lang.String r0 = "Missing jids"
            X.C626936e.A0D(r1, r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "reason"
            r3 = 0
            int r6 = r1.getIntExtra(r0, r3)
            java.util.ArrayList r8 = X.AnonymousClass000.A0p(r7)
            if (r6 == 0) goto L_0x0162
            r0 = 12
            if (r6 == r0) goto L_0x0162
            r0 = 14
            if (r6 == r0) goto L_0x0162
            int r0 = r7.size()
            boolean r1 = X.AnonymousClass000.A1U(r0, r4)
            java.lang.String r0 = "Incorrect number of arguments"
            X.C626936e.A0D(r1, r0)
            X.3Ex r1 = r11.A00
            java.lang.Object r0 = r7.get(r3)
            X.4uZ r0 = (X.C95814uZ) r0
            X.3ZH r1 = r1.A0A(r0)
            X.5ZU r0 = r11.A01
            java.lang.String r9 = X.C18300x5.A0h(r0, r1)
        L_0x0071:
            r0 = 2131431506(0x7f0b1052, float:1.8484743E38)
            android.widget.TextView r2 = X.C005205m.A01(r11, r0)
            java.lang.String r10 = "28030008"
            r8 = 0
            switch(r6) {
                case 1: goto L_0x00e3;
                case 2: goto L_0x00e7;
                case 3: goto L_0x00eb;
                case 4: goto L_0x00f2;
                case 5: goto L_0x0107;
                case 6: goto L_0x0119;
                case 7: goto L_0x0123;
                case 8: goto L_0x012b;
                case 9: goto L_0x012f;
                case 10: goto L_0x0133;
                case 11: goto L_0x0133;
                case 12: goto L_0x0137;
                case 13: goto L_0x013e;
                case 14: goto L_0x0142;
                case 15: goto L_0x0155;
                case 16: goto L_0x0159;
                default: goto L_0x007e;
            }
        L_0x007e:
            X.33j r10 = r11.A00
            r6 = 2131755415(0x7f100197, float:1.9141709E38)
        L_0x0083:
            int r0 = r7.size()
            long r0 = (long) r0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r5[r3] = r9
            java.lang.String r0 = r10.A0L(r5, r6, r0)
        L_0x0090:
            r2.setText(r0)
        L_0x0093:
            r0 = 2131431928(0x7f0b11f8, float:1.84856E38)
            android.widget.TextView r5 = X.C005205m.A01(r11, r0)
            r0 = 2131431563(0x7f0b108b, float:1.8484859E38)
            android.view.View r2 = X.C005205m.A00(r11, r0)
            if (r8 != 0) goto L_0x00d3
            r0 = 8
            r2.setVisibility(r0)
            r0 = 2131891392(0x7f1214c0, float:1.9417503E38)
        L_0x00ab:
            r5.setText(r0)
            r0 = 25
            X.C18300x5.A18(r5, r11, r0)
            r0 = 2131429057(0x7f0b06c1, float:1.8479776E38)
            android.view.View r1 = X.C005205m.A00(r11, r0)
            android.widget.LinearLayout r1 = (android.widget.LinearLayout) r1
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r11)
            int r0 = r0.orientation
            if (r0 != r4) goto L_0x00cf
            r1.setOrientation(r4)
        L_0x00c7:
            X.4xc r1 = r11.A03
            X.8uW r0 = r11.A05
            r1.A06(r0)
            return
        L_0x00cf:
            r1.setOrientation(r3)
            goto L_0x00c7
        L_0x00d3:
            r2.setVisibility(r3)
            r1 = 4
            X.5ee r0 = new X.5ee
            r0.<init>(r1, r8, r11)
            r2.setOnClickListener(r0)
            r0 = 2131891393(0x7f1214c1, float:1.9417505E38)
            goto L_0x00ab
        L_0x00e3:
            r0 = 2131895381(0x7f122455, float:1.9425593E38)
            goto L_0x015c
        L_0x00e7:
            r0 = 2131895382(0x7f122456, float:1.9425595E38)
            goto L_0x015c
        L_0x00eb:
            r0 = 2131895380(0x7f122454, float:1.9425591E38)
            r2.setText(r0)
            goto L_0x00fc
        L_0x00f2:
            r1 = 2131895379(0x7f122453, float:1.942559E38)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r0[r3] = r9
            X.AnonymousClass001.A0y(r11, r2, r0, r1)
        L_0x00fc:
            X.3Lk r0 = r11.A02
            android.net.Uri r0 = X.C66433Lk.A00(r0, r10)
            java.lang.String r8 = r0.toString()
            goto L_0x0093
        L_0x0107:
            r0 = 2131895387(0x7f12245b, float:1.9425606E38)
            r5.setText(r0)
            android.content.Intent r1 = r11.getIntent()
            java.lang.String r0 = "message"
            java.lang.String r0 = r1.getStringExtra(r0)
            goto L_0x0090
        L_0x0119:
            r0 = 2131895387(0x7f12245b, float:1.9425606E38)
            r5.setText(r0)
            r0 = 2131895386(0x7f12245a, float:1.9425604E38)
            goto L_0x015c
        L_0x0123:
            r0 = 2131895424(0x7f122480, float:1.942568E38)
            r2.setText(r0)
            goto L_0x0093
        L_0x012b:
            r0 = 2131895423(0x7f12247f, float:1.9425679E38)
            goto L_0x015c
        L_0x012f:
            r0 = 2131895421(0x7f12247d, float:1.9425675E38)
            goto L_0x015c
        L_0x0133:
            r0 = 2131895422(0x7f12247e, float:1.9425677E38)
            goto L_0x015c
        L_0x0137:
            X.33j r10 = r11.A00
            r6 = 2131755409(0x7f100191, float:1.9141696E38)
            goto L_0x0083
        L_0x013e:
            r0 = 2131895294(0x7f1223fe, float:1.9425417E38)
            goto L_0x015c
        L_0x0142:
            X.33j r9 = r11.A00
            r7 = 2131755410(0x7f100192, float:1.9141698E38)
            r6 = 64
            long r0 = (long) r6
            java.lang.Object[] r5 = new java.lang.Object[r4]
            X.AnonymousClass000.A1P(r5, r6, r3)
            java.lang.String r0 = r9.A0L(r5, r7, r0)
            goto L_0x0090
        L_0x0155:
            r0 = 2131894544(0x7f122110, float:1.9423896E38)
            goto L_0x015c
        L_0x0159:
            r0 = 2131895401(0x7f122469, float:1.9425634E38)
        L_0x015c:
            java.lang.String r0 = X.AnonymousClass0x2.A0X(r11, r9, r4, r0)
            goto L_0x0090
        L_0x0162:
            java.util.Iterator r2 = r7.iterator()
        L_0x0166:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0180
            X.4uZ r1 = X.C18300x5.A0P(r2)
            X.3Ex r0 = r11.A00
            X.3ZH r1 = r0.A0A(r1)
            X.5ZU r0 = r11.A01
            java.lang.String r0 = X.C18300x5.A0h(r0, r1)
            r8.add(r0)
            goto L_0x0166
        L_0x0180:
            X.5ZU r0 = r11.A01
            X.33j r0 = r0.A03
            java.lang.String r9 = X.AnonymousClass5VS.A00(r0, r8, r4)
            goto L_0x0071
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.VoipNotAllowedActivity.onCreate(android.os.Bundle):void");
    }

    public void onDestroy() {
        super.onDestroy();
        this.A03.A07(this.A05);
    }

    public VoipNotAllowedActivity() {
        this(0);
        this.A05 = new AnonymousClass4ID(this, 0);
    }
}
