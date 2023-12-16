package com.whatsapp.calling.callrating;

import X.AnonymousClass001;
import X.AnonymousClass1VX;
import X.AnonymousClass2F7;
import X.AnonymousClass364;
import X.AnonymousClass487;
import X.AnonymousClass49O;
import X.AnonymousClass4SG;
import X.AnonymousClass5Y0;
import X.AnonymousClass5Z0;
import X.AnonymousClass8FO;
import X.C106155Xv;
import X.C107695bk;
import X.C18260x0;
import X.C18270x1;
import X.C60152y5;
import X.C620633i;
import X.C64333Db;
import X.C86604Kt;
import X.C86644Kx;
import X.C89704el;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.StarRatingBar;
import com.whatsapp.fieldstats.events.WamCall;

public class CallRatingActivity extends C89704el {
    public static final int[] A0L = C86644Kx.A1b();
    public View A00;
    public EditText A01;
    public LinearLayout A02;
    public LinearLayout A03;
    public TextView A04;
    public StarRatingBar A05;
    public AnonymousClass2F7 A06;
    public C106155Xv A07;
    public AnonymousClass5Z0 A08;
    public AnonymousClass364 A09;
    public C620633i A0A;
    public AnonymousClass487 A0B;
    public AnonymousClass5Y0 A0C;
    public AnonymousClass1VX A0D;
    public WamCall A0E;
    public C60152y5 A0F;
    public Integer A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public final AnonymousClass49O A0K;

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00fc, code lost:
        if (r0.longValue() < 1) goto L_0x00fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00ff, code lost:
        if (r1 != null) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0101, code lost:
        r0 = r1.videoEnabled;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0103, code lost:
        if (r0 == null) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0109, code lost:
        if (r0.booleanValue() == false) goto L_0x01ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x010b, code lost:
        r1 = X.C18290x4.A0b();
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0112, code lost:
        if (r5 == false) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0114, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0117, code lost:
        X.C18320x8.A1F(r1, java.lang.Integer.valueOf(r0), r2);
        X.C18320x8.A1F(X.C18290x4.A0c(), java.lang.Integer.valueOf(com.whatsapp.R.string.f11nameremoved), r2);
        r1 = X.C18290x4.A0a();
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0133, code lost:
        if (r5 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0135, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0138, code lost:
        X.C18320x8.A1F(r1, java.lang.Integer.valueOf(r0), r2);
        java.util.Collections.shuffle(r2);
        r6 = new int[]{com.whatsapp.R.id.call_problem_0_checkbox, com.whatsapp.R.id.call_problem_1_checkbox, com.whatsapp.R.id.call_problem_2_checkbox};
        r5 = new int[]{com.whatsapp.R.id.call_problem_0_textview, com.whatsapp.R.id.call_problem_1_textview, com.whatsapp.R.id.call_problem_2_textview};
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0166, code lost:
        r1 = X.C18310x6.A0L(r15, r5[r4]);
        r1.setText(X.C18290x4.A03((android.util.Pair) r2.get(r4)));
        r1.setTag(java.lang.Integer.valueOf(r6[r4]));
        X.C18300x5.A18(r1, r15, 39);
        r1 = findViewById(r6[r4]);
        r1.setTag(((android.util.Pair) r2.get(r4)).first);
        X.C18300x5.A18(r1, r15, 40);
        r4 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x019f, code lost:
        if (r4 < 3) goto L_0x0166;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x01a1, code lost:
        X.C18320x8.A13(r15.A00, r15, 6);
        X.C109095e4.A00(r15.A01, new android.text.InputFilter[1], androidx.core.view.inputmethod.EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH);
        r8 = r15.A01;
        r13 = r15.A0C;
        r8.addTextChangedListener(new X.C137966pY(r8, r9, r15.A0A, r15.A00, r15.A0B, r13, r15.A0F));
        r0 = r15.A06;
        r0.A00.add(r15.A0K);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x01cd, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01ce, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x01d5, code lost:
        if (r5 == false) goto L_0x01da;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x01d7, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x01da, code lost:
        X.C18320x8.A1F(0, java.lang.Integer.valueOf(r0), r2);
        X.C18320x8.A1F(1, java.lang.Integer.valueOf(com.whatsapp.R.string.f11nameremoved), r2);
        r1 = X.C18280x3.A0S();
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x01f6, code lost:
        if (r5 == false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x01f8, code lost:
        r0 = com.whatsapp.R.string.f11nameremoved;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r16) {
        /*
            r15 = this;
            r9 = r15
            r0 = r16
            super.onCreate(r0)
            android.view.Window r1 = r15.getWindow()
            r0 = 2131102197(0x7f0609f5, float:1.7816825E38)
            X.C18310x6.A0x(r15, r1, r0)
            android.view.Window r1 = r15.getWindow()
            r0 = 2621440(0x280000, float:3.67342E-39)
            r1.addFlags(r0)
            android.content.Intent r0 = r15.getIntent()
            java.lang.String r3 = "event"
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            r4 = 0
            if (r0 == 0) goto L_0x007d
            com.whatsapp.fieldstats.events.WamCall r0 = r15.A0E
            if (r0 == 0) goto L_0x0049
            java.lang.String r2 = r0.callRandomId
        L_0x002c:
            X.5Xv r0 = r15.A07
            android.content.SharedPreferences r1 = r0.A03()
            java.lang.String r0 = "call_rating_last_call"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)
            if (r2 == 0) goto L_0x004b
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = "callratingactivity/ignore duplicate ratings"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r15.finish()
            return
        L_0x0049:
            r2 = 0
            goto L_0x002c
        L_0x004b:
            X.1VX r1 = r15.A0D
            r0 = 1939(0x793, float:2.717E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x01fd
            com.whatsapp.fieldstats.extension.WamCallExtended r1 = new com.whatsapp.fieldstats.extension.WamCallExtended
            r1.<init>()
        L_0x005a:
            r15.A0E = r1
            android.content.Intent r0 = r15.getIntent()
            android.os.Bundle r0 = r0.getBundleExtra(r3)
            X.AnonymousClass5Z0.A01(r0, r1)
            com.whatsapp.fieldstats.events.WamCall r1 = r15.A0E
            java.lang.Long r0 = X.AnonymousClass0x2.A0T()
            r1.newEndCallSurveyVersion = r0
            r1.userRating = r0
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "uploadFieldStat"
            boolean r0 = r1.getBooleanExtra(r0, r4)
            r15.A0J = r0
        L_0x007d:
            android.content.Intent r1 = r15.getIntent()
            java.lang.String r0 = "timeSeriesDir"
            java.lang.String r0 = r1.getStringExtra(r0)
            r15.A0H = r0
            r0 = 2131624287(0x7f0e015f, float:1.887575E38)
            r15.setContentView((int) r0)
            r0 = 2131430105(0x7f0b0ad9, float:1.8481902E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.EditText r0 = (android.widget.EditText) r0
            r15.A01 = r0
            r0 = 2131432834(0x7f0b1582, float:1.8487437E38)
            android.view.View r0 = r15.findViewById(r0)
            com.whatsapp.StarRatingBar r0 = (com.whatsapp.StarRatingBar) r0
            r15.A05 = r0
            r0 = 2131432835(0x7f0b1583, float:1.8487439E38)
            android.widget.TextView r0 = X.C18310x6.A0L(r15, r0)
            r15.A04 = r0
            r0 = 2131434077(0x7f0b1a5d, float:1.8489958E38)
            android.view.View r0 = r15.findViewById(r0)
            r15.A00 = r0
            r0 = 2131432838(0x7f0b1586, float:1.8487445E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15.A03 = r0
            r0 = 2131432837(0x7f0b1585, float:1.8487443E38)
            android.view.View r0 = r15.findViewById(r0)
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r15.A02 = r0
            android.view.View r0 = r15.A00
            r0.setEnabled(r4)
            com.whatsapp.StarRatingBar r1 = r15.A05
            X.8E2 r0 = new X.8E2
            r0.<init>(r15)
            r1.A01 = r0
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.view.View r1 = r15.findViewById(r0)
            r0 = 5
            X.C18320x8.A13(r1, r15, r0)
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            com.whatsapp.fieldstats.events.WamCall r1 = r15.A0E
            r3 = 1
            if (r1 == 0) goto L_0x00fe
            java.lang.Long r0 = r1.groupCallSegmentIdx
            if (r0 == 0) goto L_0x00fe
            long r7 = r0.longValue()
            r5 = 1
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r5 = 1
            if (r0 >= 0) goto L_0x0101
        L_0x00fe:
            r5 = 0
            if (r1 == 0) goto L_0x01ce
        L_0x0101:
            java.lang.Boolean r0 = r1.videoEnabled
            if (r0 == 0) goto L_0x01ce
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x01ce
            java.lang.Integer r1 = X.C18290x4.A0b()
            r0 = 2131887394(0x7f120522, float:1.9409394E38)
            if (r5 == 0) goto L_0x0117
            r0 = 2131889794(0x7f120e82, float:1.9414262E38)
        L_0x0117:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18320x8.A1F(r1, r0, r2)
            java.lang.Integer r1 = X.C18290x4.A0c()
            r0 = 2131887396(0x7f120524, float:1.9409398E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18320x8.A1F(r1, r0, r2)
            java.lang.Integer r1 = X.C18290x4.A0a()
            r0 = 2131887212(0x7f12046c, float:1.9409025E38)
            if (r5 == 0) goto L_0x0138
            r0 = 2131889784(0x7f120e78, float:1.9414241E38)
        L_0x0138:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18320x8.A1F(r1, r0, r2)
            java.util.Collections.shuffle(r2)
            r7 = 3
            int[] r6 = new int[r7]
            r0 = 2131428436(0x7f0b0454, float:1.8478516E38)
            r6[r4] = r0
            r0 = 2131428438(0x7f0b0456, float:1.847852E38)
            r6[r3] = r0
            r0 = 2131428440(0x7f0b0458, float:1.8478525E38)
            r1 = 2
            r6[r1] = r0
            int[] r5 = new int[r7]
            r0 = 2131428437(0x7f0b0455, float:1.8478518E38)
            r5[r4] = r0
            r0 = 2131428439(0x7f0b0457, float:1.8478523E38)
            r5[r3] = r0
            r0 = 2131428441(0x7f0b0459, float:1.8478527E38)
            r5[r1] = r0
        L_0x0166:
            r0 = r5[r4]
            android.widget.TextView r1 = X.C18310x6.A0L(r15, r0)
            java.lang.Object r0 = r2.get(r4)
            android.util.Pair r0 = (android.util.Pair) r0
            int r0 = X.C18290x4.A03(r0)
            r1.setText(r0)
            r0 = r6[r4]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1.setTag(r0)
            r0 = 39
            X.C18300x5.A18(r1, r15, r0)
            r0 = r6[r4]
            android.view.View r1 = r15.findViewById(r0)
            java.lang.Object r0 = r2.get(r4)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.first
            r1.setTag(r0)
            r0 = 40
            X.C18300x5.A18(r1, r15, r0)
            int r4 = r4 + 1
            if (r4 < r7) goto L_0x0166
            android.view.View r1 = r15.A00
            r0 = 6
            X.C18320x8.A13(r1, r15, r0)
            android.widget.EditText r2 = r15.A01
            android.text.InputFilter[] r1 = new android.text.InputFilter[r3]
            r0 = 1024(0x400, float:1.435E-42)
            X.C109095e4.A00(r2, r1, r0)
            android.widget.EditText r8 = r15.A01
            X.5Y0 r13 = r15.A0C
            X.33i r10 = r15.A0A
            X.33j r11 = r15.A00
            X.2y5 r14 = r15.A0F
            X.487 r12 = r15.A0B
            X.6pY r7 = new X.6pY
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r8.addTextChangedListener(r7)
            X.2F7 r0 = r15.A06
            X.49O r1 = r15.A0K
            java.util.ArrayList r0 = r0.A00
            r0.add(r1)
            return
        L_0x01ce:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r4)
            r0 = 2131887378(0x7f120512, float:1.9409361E38)
            if (r5 == 0) goto L_0x01da
            r0 = 2131889791(0x7f120e7f, float:1.9414256E38)
        L_0x01da:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18320x8.A1F(r1, r0, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0 = 2131887379(0x7f120513, float:1.9409363E38)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.C18320x8.A1F(r1, r0, r2)
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 2131887380(0x7f120514, float:1.9409365E38)
            if (r5 == 0) goto L_0x0138
            r0 = 2131889792(0x7f120e80, float:1.9414258E38)
            goto L_0x0138
        L_0x01fd:
            com.whatsapp.fieldstats.events.WamCall r1 = new com.whatsapp.fieldstats.events.WamCall
            r1.<init>()
            goto L_0x005a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callrating.CallRatingActivity.onCreate(android.os.Bundle):void");
    }

    public void A5r() {
        if (!this.A0I) {
            this.A0I = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            this.A04 = C64333Db.A8y(A2Y);
            this.A0D = C64333Db.A4B(A2Y);
            this.A0C = C64333Db.A3o(A2Y);
            this.A0A = C64333Db.A2o(A2Y);
            C107695bk r1 = A2Y.A00;
            this.A08 = r1.AJu();
            this.A09 = (AnonymousClass364) r1.AC1.get();
            this.A06 = (AnonymousClass2F7) r1.A24.get();
            this.A07 = (C106155Xv) A2Y.Aa5.get();
            this.A0F = C64333Db.A74(A2Y);
            this.A0B = C107695bk.A1l(r1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r1.codePointCount(0, r1.length()) >= 3) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A6D() {
        /*
            r4 = this;
            com.whatsapp.StarRatingBar r0 = r4.A05
            int r2 = r0.A00
            android.widget.EditText r0 = r4.A01
            java.lang.String r1 = X.C86604Kt.A0o(r0)
            android.view.View r3 = r4.A00
            if (r2 > 0) goto L_0x001a
            int r0 = r1.length()
            r2 = 0
            int r1 = r1.codePointCount(r2, r0)
            r0 = 3
            if (r1 < r0) goto L_0x001b
        L_0x001a:
            r2 = 1
        L_0x001b:
            r3.setEnabled(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callrating.CallRatingActivity.A6D():void");
    }

    public CallRatingActivity(int i) {
        this.A0I = false;
        C86604Kt.A1K(this, 29);
    }

    public void onDestroy() {
        super.onDestroy();
        AnonymousClass2F7 r0 = this.A06;
        r0.A00.remove(this.A0K);
    }

    public void onStop() {
        String str;
        super.onStop();
        WamCall wamCall = this.A0E;
        if (wamCall != null) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("callratingactivity/postCallEvent with rating ");
            C18260x0.A0o(wamCall.userRating, A0o);
            C106155Xv r1 = this.A07;
            WamCall wamCall2 = this.A0E;
            if (wamCall2 != null) {
                str = wamCall2.callRandomId;
            } else {
                str = null;
            }
            C18270x1.A0j(C106155Xv.A00(r1), "call_rating_last_call", str);
            this.A08.A02(this.A0E, this.A0J);
            if (this.A0H != null) {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("callratingactivity/uploadTimeSeries with rating ");
                A0o2.append(this.A0E.userRating);
                A0o2.append("time series dir ");
                C18260x0.A1L(A0o2, this.A0H);
                this.A09.A06(this.A0E, this.A0H);
            }
            this.A0E = null;
        }
        finish();
    }

    public CallRatingActivity() {
        this(0);
        this.A0K = new AnonymousClass8FO(this);
    }
}
