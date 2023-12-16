package X;

import android.view.View;
import android.widget.AbsListView;
import com.whatsapp.R;

/* renamed from: X.5ft  reason: invalid class name and case insensitive filesystem */
public class C110225ft implements AbsListView.OnScrollListener {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final /* synthetic */ C113245l7 A04;

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007d, code lost:
        if (X.AnonymousClass320.A00 != false) goto L_0x007f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x007f, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0084, code lost:
        if (r2 >= r3.getChildCount()) goto L_0x0099;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0086, code lost:
        r1 = r3.getChildAt(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        if ((r1 instanceof X.C183138pY) == false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x008e, code lost:
        ((X.C183138pY) r1).BpZ();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0093, code lost:
        r2 = r2 + 1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScrollStateChanged(android.widget.AbsListView r10, int r11) {
        /*
            r9 = this;
            r1 = 1
            if (r11 == 0) goto L_0x0023
            if (r11 != r1) goto L_0x000c
            X.5l7 r0 = r9.A04
            X.5Tq r0 = r0.A4n
            r0.A01(r1)
        L_0x000c:
            X.5l7 r4 = r9.A04
            android.os.Handler r1 = r4.A6p
            java.lang.Runnable r0 = r4.A7J
            r1.removeCallbacks(r0)
        L_0x0015:
            r4.A03 = r11
            if (r11 == 0) goto L_0x0020
            long r0 = java.lang.System.currentTimeMillis()
        L_0x001d:
            X.C1441870j.A00 = r0
            return
        L_0x0020:
            r0 = 0
            goto L_0x001d
        L_0x0023:
            X.5l7 r4 = r9.A04
            X.5Tq r0 = r4.A4n
            r0.A00()
            com.whatsapp.conversation.ConversationListView r3 = r4.A2f
            X.676 r0 = r4.A2z
            java.util.HashSet r8 = r0.getSeenMessages()
            X.4On r0 = r3.getConversationCursorAdapter()
            if (r0 == 0) goto L_0x0099
            X.4On r0 = r3.getConversationCursorAdapter()
            android.database.Cursor r0 = r0.getCursor()
            if (r0 == 0) goto L_0x0099
            int r7 = r3.getChildCount()
            r6 = 0
        L_0x0047:
            if (r6 >= r7) goto L_0x007f
            android.view.View r1 = r3.getChildAt(r6)
            boolean r0 = r1 instanceof X.C183138pY
            if (r0 == 0) goto L_0x0096
            boolean r0 = r1 instanceof X.C93314oJ
            if (r0 == 0) goto L_0x0096
            X.8pY r1 = (X.C183138pY) r1
            X.4oK r1 = (X.C93324oK) r1
            X.34x r5 = r1.getFMessage()
            X.2z0 r0 = r5.A1J
            boolean r0 = r8.contains(r0)
            if (r0 != 0) goto L_0x0096
            X.4On r2 = r3.getConversationCursorAdapter()
            int r1 = r2.A03(r5)
            int r0 = r2.A01()
            if (r1 > r0) goto L_0x007b
            X.6aY r0 = r2.A08
            boolean r0 = r0.contains(r5)
            if (r0 == 0) goto L_0x0096
        L_0x007b:
            boolean r0 = X.AnonymousClass320.A00
            if (r0 == 0) goto L_0x0099
        L_0x007f:
            r2 = 0
        L_0x0080:
            int r0 = r3.getChildCount()
            if (r2 >= r0) goto L_0x0099
            android.view.View r1 = r3.getChildAt(r2)
            boolean r0 = r1 instanceof X.C183138pY
            if (r0 == 0) goto L_0x0093
            X.8pY r1 = (X.C183138pY) r1
            r1.BpZ()
        L_0x0093:
            int r2 = r2 + 1
            goto L_0x0080
        L_0x0096:
            int r6 = r6 + 1
            goto L_0x0047
        L_0x0099:
            boolean r0 = X.C113245l7.A0Q(r4)
            if (r0 == 0) goto L_0x00b7
            X.5LO r0 = X.C113245l7.A0C(r4)
            X.8qC r0 = r0.A07
            java.lang.Object r1 = r0.get()
            X.5UP r1 = (X.AnonymousClass5UP) r1
            r0 = 2
            boolean r0 = r1.A03(r0)
            if (r0 == 0) goto L_0x00b7
            com.whatsapp.conversation.ConversationListView r0 = r4.A2f
            r0.A01()
        L_0x00b7:
            android.os.Handler r3 = r4.A6p
            java.lang.Runnable r2 = r4.A7J
            r0 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r2, r0)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110225ft.onScrollStateChanged(android.widget.AbsListView, int):void");
    }

    public C110225ft(C113245l7 r1) {
        this.A04 = r1;
    }

    public final void A00(int i, int i2) {
        C185698u6 r0;
        C624134x A05;
        C113245l7 r2 = this.A04;
        C87234On A0A = C113245l7.A0A(r2);
        int count = A0A.getCount();
        boolean z = false;
        while (i <= i2) {
            int headerViewsCount = i - r2.A2f.getHeaderViewsCount();
            if (headerViewsCount >= 0 && headerViewsCount <= count - 1 && (A05 = A0A.getItem(headerViewsCount)) != null && (A05 instanceof C30341mI) && ((C30341mI) A05).A00 == 129) {
                z = true;
            }
            i++;
        }
        View findViewById = r2.A2z.findViewById(R.id.footer_container);
        if (z) {
            C185698u6 r02 = r2.A31.A04;
            if (!(r02 == null || !r02.isVisible() || (r0 = r2.A31.A04) == null)) {
                r0.BFg();
            }
            C86604Kt.A1A(findViewById);
            return;
        }
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        C185698u6 r03 = r2.A31.A04;
        if (r03 == null || !r03.isVisible()) {
            C117625sE.A02(C113245l7.A07(r2), this, 0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x025b, code lost:
        if (r6.A01 == r8) goto L_0x0348;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025d, code lost:
        if (r31 == 0) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025f, code lost:
        r0 = r30 - r5.A2f.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0267, code lost:
        if (r0 < 0) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0269, code lost:
        r11 = r9.A05(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x026d, code lost:
        if (r11 == null) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x026f, code lost:
        r9 = r11.A0K;
        r5.A2z.getTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027e, code lost:
        if (X.C107175ap.A05(r9, java.lang.System.currentTimeMillis()) != false) goto L_0x0340;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0280, code lost:
        r10 = (android.widget.TextView) r5.A5c.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x028e, code lost:
        if (r5.A2f.getClipToPadding() == false) goto L_0x029a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0290, code lost:
        r10.setY((float) r5.A2f.getPaddingTop());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x029a, code lost:
        r5.A2z.getTime();
        r10.setText(X.C107565bW.A0E(r5.A3L, r11.A0K));
        r10.setTextSize(r5.A2d.A01(r5.A2z.getResources()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x02bd, code lost:
        if (r10.getVisibility() == 0) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02bf, code lost:
        r10.setVisibility(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02cc, code lost:
        if (X.AnonymousClass5KY.A00(r5).BH4(r5.A4J) != false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ce, code lost:
        r11 = new android.view.animation.TranslateAnimation(1, 0.0f, 1, 0.0f, 1, -1.0f, 1, 0.0f);
        r11.setDuration(200);
        r10.startAnimation(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02e7, code lost:
        r11 = r6.A03;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02e9, code lost:
        if (r11 == 0) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x02eb, code lost:
        r10 = r6.A01;
        r0 = r6.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02ef, code lost:
        if (r0 != 0) goto L_0x02f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02f1, code lost:
        r6.A00 = r3;
        r0 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:121:0x02f4, code lost:
        if (r0 >= r3) goto L_0x02fb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f6, code lost:
        r10 = r10 + (r3 - r0);
        r6.A00 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fb, code lost:
        r4 = r4 - 1;
        r11 = (r11 + r10) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0300, code lost:
        if (r10 >= r8) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0302, code lost:
        if (r8 > r11) goto L_0x0334;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:126:0x0304, code lost:
        r11 = r30 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0306, code lost:
        r12 = X.C113245l7.A0A(r5);
        r13 = r12.getCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x030e, code lost:
        if (r10 > r11) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0310, code lost:
        r1 = r10 - r5.A2f.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x0318, code lost:
        if (r1 < 0) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x031c, code lost:
        if (r1 > (r13 - 1)) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x031e, code lost:
        r9 = r12.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x0322, code lost:
        if (r9 == null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0328, code lost:
        if (r9.A1I != 13) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x032a, code lost:
        r5.A2z.B1j(r9.A1J);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0331, code lost:
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x0334, code lost:
        if (r4 >= r11) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0336, code lost:
        if (r10 > r4) goto L_0x033b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x0338, code lost:
        r10 = r4 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x033b, code lost:
        if (r4 < r10) goto L_0x0306;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x033d, code lost:
        if (r8 <= r11) goto L_0x0350;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0340, code lost:
        r5.A5c.A06(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0348, code lost:
        if (r31 == 0) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034b, code lost:
        r12.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0352, code lost:
        if (r5.A7Q != null) goto L_0x0386;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x0354, code lost:
        X.C113245l7.A0G(r5).BkM(new X.C70273aE(r6, r8, r4, 3));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0363, code lost:
        if (r6.A01 == r8) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x0367, code lost:
        if (r5.A03 == 0) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0369, code lost:
        X.C1441870j.A00 = java.lang.System.currentTimeMillis();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x036f, code lost:
        r6.A01 = r8;
        r6.A03 = r7;
        r4 = r5.A3B;
        r4.A08 = (long) r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0380, code lost:
        if (r8 >= (java.lang.Math.min(100, r3) / 2)) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0382, code lost:
        r4.A0V(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x0385, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x038c, code lost:
        if (r5.A7Q.booleanValue() == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x038e, code lost:
        A00(r8, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00eb, code lost:
        if (r0.A0B(r1) != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ef, code lost:
        if (r5.A6X != false) goto L_0x00f1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f1, code lost:
        r12 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f2, code lost:
        r11 = r5.A5g;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00fc, code lost:
        if (r12 == false) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0102, code lost:
        if (r11.A03() != 0) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0104, code lost:
        r10 = X.C86614Ku.A0G(new android.view.animation.ScaleAnimation(1.0f, 0.5f, 1.0f, 0.5f, 1, 0.5f, 1, 0.5f), 1.0f, 0.0f);
        r10.setDuration(100);
        r5.A5g.A04().startAnimation(r10);
        r5.A2f.post(new X.C117615sD((java.lang.Object) r6, 49));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0131, code lost:
        r5.A3B.A04 = 0;
        r1 = r5.A0m;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0137, code lost:
        if (r1 == null) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0139, code lost:
        r1.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0146, code lost:
        if (X.AnonymousClass0x7.A1S(r5.A3B.A1H) == false) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0148, code lost:
        r1 = ((r30 - r5.A2f.getHeaderViewsCount()) + r31) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0156, code lost:
        if (r6.A02 == r1) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0158, code lost:
        if (r1 < 0) goto L_0x01fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x015a, code lost:
        r6.A02 = r1;
        r13 = r5.A3B;
        r12 = r9.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0162, code lost:
        if (r12 == null) goto L_0x01e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0164, code lost:
        r11 = X.AnonymousClass001.A0s();
        r19 = r13.A1H;
        r17 = r19.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0174, code lost:
        if (r17.hasNext() == false) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0176, code lost:
        r10 = X.C18300x5.A0T(r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0180, code lost:
        if (r10.A1M > r12.A1M) goto L_0x0170;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0182, code lost:
        r11.add(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x018c, code lost:
        if (r11.A03() != 8) goto L_0x013e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x018e, code lost:
        r5.A5g.A06(0);
        r5.A3B.A03 = 0;
        r5.A2N(false);
        r10 = X.C86614Ku.A0G(new android.view.animation.ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 1, 0.5f), 0.0f, 1.0f);
        r10.setDuration(100);
        r5.A5g.A04().startAnimation(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x01cc, code lost:
        if ((r30 + r1) < (r5.A2f.getHeaderViewsCount() + r3)) goto L_0x00ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01e1, code lost:
        r13.A1H.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01eb, code lost:
        if (r11.isEmpty() != false) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ed, code lost:
        r19.removeAll(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f2, code lost:
        r13.A0V.A0G(X.C103975Pd.A00(r13, r13.A1H));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01ff, code lost:
        if (r5.A03 != 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0201, code lost:
        r12 = r5.A7O;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0207, code lost:
        if (r12.isEmpty() != false) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0209, code lost:
        r13 = ((X.C148947Ki) r12.peek()).A01;
        r1 = ((r30 - r5.A2f.getHeaderViewsCount()) + r31) - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0221, code lost:
        if (r1 != r9.A01()) goto L_0x0225;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0223, code lost:
        r1 = r1 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0225, code lost:
        if (r1 < 0) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0227, code lost:
        r0 = r9.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x022b, code lost:
        if (r0 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0233, code lost:
        if (r13.A1M > r0.A1M) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0235, code lost:
        r1 = r30 - r5.A2f.getHeaderViewsCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0241, code lost:
        if (r1 != r9.A01()) goto L_0x0245;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0243, code lost:
        r1 = r1 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x0245, code lost:
        if (r1 < 0) goto L_0x0255;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x0247, code lost:
        r0 = r9.A05(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x024b, code lost:
        if (r0 == null) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0253, code lost:
        if (r13.A1M < r0.A1M) goto L_0x034b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0257, code lost:
        if (r5.A03 == 0) goto L_0x0348;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onScroll(android.widget.AbsListView r29, int r30, int r31, int r32) {
        /*
            r28 = this;
            r6 = r28
            X.5l7 r5 = r6.A04
            X.4On r9 = X.C113245l7.A0A(r5)
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x0392
            com.whatsapp.conversation.ConversationListView r3 = r5.A2f
            r8 = r30
            r3.A00 = r8
            r7 = r31
            int r4 = r30 + r31
            X.4On r0 = r3.getConversationCursorAdapter()
            int r1 = r0.getCount()
            int r0 = r3.getHeaderViewsCount()
            int r1 = r1 + r0
            r2 = 0
            boolean r0 = X.C18280x3.A1U(r4, r1)
            r3.A0K = r0
            X.5rC r1 = r3.A03
            boolean r0 = r1.A07()
            if (r0 == 0) goto L_0x0046
            java.lang.Object r0 = r1.A04()
            X.2sS r0 = (X.C56722sS) r0
            X.2m4 r0 = r0.A01
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0046
            boolean r0 = r3.A0B(r2)
            r3.A0K = r0
        L_0x0046:
            boolean r0 = r3.A0K
            if (r0 != 0) goto L_0x0053
            boolean r0 = r3.isInLayout()
            if (r0 != 0) goto L_0x0053
            r3.setTranscriptMode(r2)
        L_0x0053:
            X.66o r1 = X.AnonymousClass5KY.A00(r5)
            X.4uZ r0 = r5.A4J
            boolean r0 = r1.BH4(r0)
            if (r0 == 0) goto L_0x00bf
            X.5KY r0 = X.C113245l7.A0B(r5)
            X.8qC r0 = r0.A05
            r0.get()
            X.4fR r10 = r5.A2Z
            android.view.Window r3 = X.C113245l7.A03(r5)
            com.whatsapp.conversation.ConversationListView r1 = r5.A2f
            X.C18260x0.A0Q(r3, r1)
            boolean r0 = r10 instanceof X.C92134m9
            if (r0 == 0) goto L_0x00bf
            int r0 = r1.getPaddingTop()
            if (r0 == 0) goto L_0x00bf
            boolean r11 = X.C112185jK.A01(r1, r8)
            X.4m9 r10 = (X.C92134m9) r10
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r2 = X.C89884fR.A00(r10)
            android.content.res.Configuration r0 = r10.A00
            int r1 = r0.orientation
            r0 = 2
            if (r1 == r0) goto L_0x00a4
            if (r11 == 0) goto L_0x01dd
            X.66o r1 = r2.A06
            com.whatsapp.jid.UserJid r0 = r2.A01
            boolean r0 = r1.BH3(r0)
            if (r0 == 0) goto L_0x01dd
            X.57i r0 = X.C996157i.CENTER
        L_0x009c:
            r2.A0E(r0)
            r2.A00 = r0
            r2.A0D()
        L_0x00a4:
            android.view.View r10 = X.C86634Kw.A0N(r3)
            X.55z r10 = (X.C995055z) r10
            if (r10 == 0) goto L_0x00bf
            int r0 = r10.A09
            r3 = 2
            if (r0 == r3) goto L_0x00bf
            int r1 = r10.A06
            r0 = 1
            boolean r2 = X.AnonymousClass001.A1W(r1)
            r1 = r2 ^ 1
            if (r11 == 0) goto L_0x01d0
            r10.A0D(r0, r1)
        L_0x00bf:
            int r3 = r9.getCount()
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r1 = r0.getAdjustedVisibleItemCount()
            int r1 = r1 + r31
            X.5KY r0 = X.C113245l7.A0B(r5)
            X.2m4 r0 = r0.A00
            boolean r0 = r0.A00()
            r12 = 0
            if (r0 == 0) goto L_0x01c3
            android.content.res.Resources r1 = X.C113245l7.A02(r5)
            r0 = 2131168282(0x7f070c1a, float:1.7950861E38)
            int r1 = r1.getDimensionPixelOffset(r0)
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            if (r0 == 0) goto L_0x00ed
            boolean r0 = r0.A0B(r1)
            if (r0 != 0) goto L_0x00f1
        L_0x00ed:
            boolean r0 = r5.A6X
            if (r0 == 0) goto L_0x00f2
        L_0x00f1:
            r12 = 1
        L_0x00f2:
            r0 = 100
            r10 = 0
            r14 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
            r18 = 1
            X.5UY r11 = r5.A5g
            if (r12 == 0) goto L_0x0186
            int r11 = r11.A03()
            if (r11 != 0) goto L_0x0131
            r15 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r13 = new android.view.animation.ScaleAnimation
            r19 = r15
            r21 = r15
            r16 = r14
            r17 = r15
            r20 = r18
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            android.view.animation.AnimationSet r10 = X.C86614Ku.A0G(r13, r14, r10)
            r10.setDuration(r0)
            X.5UY r0 = r5.A5g
            android.view.View r0 = r0.A04()
            r0.startAnimation(r10)
            com.whatsapp.conversation.ConversationListView r10 = r5.A2f
            r1 = 49
            X.5sD r0 = new X.5sD
            r0.<init>((java.lang.Object) r6, (int) r1)
            r10.post(r0)
        L_0x0131:
            X.4VQ r0 = r5.A3B
            r0.A04 = r2
            android.widget.TextView r1 = r5.A0m
            if (r1 == 0) goto L_0x013e
            r0 = 8
            r1.setVisibility(r0)
        L_0x013e:
            X.4VQ r0 = r5.A3B
            java.util.ArrayList r0 = r0.A1H
            boolean r0 = X.AnonymousClass0x7.A1S(r0)
            if (r0 == 0) goto L_0x01fd
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r1 = r30 - r0
            int r1 = r1 + r31
            int r1 = r1 - r18
            int r0 = r6.A02
            if (r0 == r1) goto L_0x01fd
            if (r1 < 0) goto L_0x01fd
            r6.A02 = r1
            X.4VQ r13 = r5.A3B
            X.34x r12 = r9.getItem(r1)
            if (r12 == 0) goto L_0x01e1
            java.util.ArrayList r11 = X.AnonymousClass001.A0s()
            java.util.ArrayList r0 = r13.A1H
            r19 = r0
            java.util.Iterator r17 = r19.iterator()
        L_0x0170:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x01e7
            X.34x r10 = X.C18300x5.A0T(r17)
            long r14 = r10.A1M
            long r0 = r12.A1M
            int r16 = (r14 > r0 ? 1 : (r14 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x0170
            r11.add(r10)
            goto L_0x0170
        L_0x0186:
            int r12 = r11.A03()
            r11 = 8
            if (r12 != r11) goto L_0x013e
            X.5UY r11 = r5.A5g
            r11.A06(r2)
            X.4VQ r11 = r5.A3B
            r11.A03 = r2
            r5.A2N(r2)
            r20 = 1056964608(0x3f000000, float:0.5)
            android.view.animation.ScaleAnimation r11 = new android.view.animation.ScaleAnimation
            r23 = r14
            r25 = r20
            r26 = r18
            r27 = r20
            r19 = r11
            r21 = r14
            r22 = r20
            r24 = r18
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27)
            android.view.animation.AnimationSet r10 = X.C86614Ku.A0G(r11, r10, r14)
            r10.setDuration(r0)
            X.5UY r0 = r5.A5g
            android.view.View r0 = r0.A04()
            r0.startAnimation(r10)
            goto L_0x013e
        L_0x01c3:
            int r1 = r30 + r1
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r0 = r0 + r3
            if (r1 >= r0) goto L_0x00f1
            goto L_0x00ed
        L_0x01d0:
            boolean r0 = r10.A0E()
            if (r0 != 0) goto L_0x01d8
            if (r2 != 0) goto L_0x00bf
        L_0x01d8:
            r10.A0D(r3, r1)
            goto L_0x00bf
        L_0x01dd:
            X.57i r0 = X.C996157i.END
            goto L_0x009c
        L_0x01e1:
            java.util.ArrayList r0 = r13.A1H
            r0.clear()
            goto L_0x01f2
        L_0x01e7:
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto L_0x01f2
            r0 = r19
            r0.removeAll(r11)
        L_0x01f2:
            java.util.ArrayList r0 = r13.A1H
            X.5Pd r1 = X.C103975Pd.A00(r13, r0)
            X.08M r0 = r13.A0V
            r0.A0G(r1)
        L_0x01fd:
            int r0 = r5.A03
            if (r0 != 0) goto L_0x0255
            java.util.Stack r12 = r5.A7O
            boolean r0 = r12.isEmpty()
            if (r0 != 0) goto L_0x0255
            java.lang.Object r0 = r12.peek()
            X.7Ki r0 = (X.C148947Ki) r0
            X.34x r13 = r0.A01
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r1 = r30 - r0
            int r1 = r1 + r31
            int r1 = r1 - r18
            int r0 = r9.A01()
            if (r1 != r0) goto L_0x0225
            int r1 = r1 + -1
        L_0x0225:
            if (r1 < 0) goto L_0x034b
            X.34x r0 = r9.getItem(r1)
            if (r0 == 0) goto L_0x034b
            long r10 = r13.A1M
            long r0 = r0.A1M
            int r14 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r14 > 0) goto L_0x034b
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r1 = r30 - r0
            int r0 = r9.A01()
            if (r1 != r0) goto L_0x0245
            int r1 = r1 + 1
        L_0x0245:
            if (r1 < 0) goto L_0x0255
            X.34x r0 = r9.getItem(r1)
            if (r0 == 0) goto L_0x034b
            long r10 = r13.A1M
            long r0 = r0.A1M
            int r13 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r13 < 0) goto L_0x034b
        L_0x0255:
            int r0 = r5.A03
            if (r0 == 0) goto L_0x0348
            int r0 = r6.A01
            if (r0 == r8) goto L_0x0348
            if (r31 == 0) goto L_0x0361
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r0 = r30 - r0
            if (r0 < 0) goto L_0x0340
            X.34x r11 = r9.getItem(r0)
            if (r11 == 0) goto L_0x0340
            long r9 = r11.A0K
            X.676 r0 = r5.A2z
            r0.getTime()
            long r0 = java.lang.System.currentTimeMillis()
            boolean r0 = X.C107175ap.A05(r9, r0)
            if (r0 != 0) goto L_0x0340
            X.5UY r0 = r5.A5c
            android.view.View r10 = r0.A04()
            android.widget.TextView r10 = (android.widget.TextView) r10
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            boolean r0 = r0.getClipToPadding()
            if (r0 == 0) goto L_0x029a
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getPaddingTop()
            float r0 = (float) r0
            r10.setY(r0)
        L_0x029a:
            X.676 r0 = r5.A2z
            r0.getTime()
            X.33j r9 = r5.A3L
            long r0 = r11.A0K
            java.lang.String r0 = X.C107565bW.A0E(r9, r0)
            r10.setText(r0)
            X.5ST r1 = r5.A2d
            X.676 r0 = r5.A2z
            android.content.res.Resources r0 = r0.getResources()
            float r0 = r1.A01(r0)
            r10.setTextSize(r0)
            int r0 = r10.getVisibility()
            if (r0 == 0) goto L_0x02e7
            r10.setVisibility(r2)
            X.66o r1 = X.AnonymousClass5KY.A00(r5)
            X.4uZ r0 = r5.A4J
            boolean r0 = r1.BH4(r0)
            if (r0 != 0) goto L_0x02e7
            r13 = 0
            r17 = -1082130432(0xffffffffbf800000, float:-1.0)
            android.view.animation.TranslateAnimation r9 = new android.view.animation.TranslateAnimation
            r12 = r18
            r14 = r12
            r16 = r12
            r19 = r13
            r15 = r13
            r11 = r9
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            r0 = 200(0xc8, double:9.9E-322)
            r9.setDuration(r0)
            r10.startAnimation(r9)
        L_0x02e7:
            int r11 = r6.A03
            if (r11 == 0) goto L_0x0361
            int r10 = r6.A01
            int r0 = r6.A00
            if (r0 != 0) goto L_0x02f4
            r6.A00 = r3
            r0 = r3
        L_0x02f4:
            if (r0 >= r3) goto L_0x02fb
            int r0 = r3 - r0
            int r10 = r10 + r0
            r6.A00 = r3
        L_0x02fb:
            int r4 = r4 - r18
            int r11 = r11 + r10
            int r11 = r11 - r18
            if (r10 >= r8) goto L_0x0334
            if (r8 > r11) goto L_0x0334
            int r11 = r30 + -1
        L_0x0306:
            X.4On r12 = X.C113245l7.A0A(r5)
            int r13 = r12.getCount()
        L_0x030e:
            if (r10 > r11) goto L_0x0350
            com.whatsapp.conversation.ConversationListView r0 = r5.A2f
            int r0 = r0.getHeaderViewsCount()
            int r1 = r10 - r0
            if (r1 < 0) goto L_0x0331
            int r0 = r13 + -1
            if (r1 > r0) goto L_0x0331
            X.34x r9 = r12.getItem(r1)
            if (r9 == 0) goto L_0x0331
            byte r1 = r9.A1I
            r0 = 13
            if (r1 != r0) goto L_0x0331
            X.676 r1 = r5.A2z
            X.2z0 r0 = r9.A1J
            r1.B1j(r0)
        L_0x0331:
            int r10 = r10 + 1
            goto L_0x030e
        L_0x0334:
            if (r4 >= r11) goto L_0x033b
            if (r10 > r4) goto L_0x033b
            int r10 = r4 + 1
            goto L_0x0306
        L_0x033b:
            if (r4 < r10) goto L_0x0306
            if (r8 <= r11) goto L_0x0350
            goto L_0x0306
        L_0x0340:
            X.5UY r1 = r5.A5c
            r0 = 8
            r1.A06(r0)
            goto L_0x02e7
        L_0x0348:
            if (r31 == 0) goto L_0x0361
            goto L_0x02e7
        L_0x034b:
            r12.clear()
            goto L_0x0255
        L_0x0350:
            java.lang.Boolean r0 = r5.A7Q
            if (r0 != 0) goto L_0x0386
            X.4FS r9 = X.C113245l7.A0G(r5)
            r1 = 3
            X.3aE r0 = new X.3aE
            r0.<init>(r6, r8, r4, r1)
            r9.BkM(r0)
        L_0x0361:
            int r0 = r6.A01
            if (r0 == r8) goto L_0x036f
            int r0 = r5.A03
            if (r0 == 0) goto L_0x036f
            long r0 = java.lang.System.currentTimeMillis()
            X.C1441870j.A00 = r0
        L_0x036f:
            r6.A01 = r8
            r6.A03 = r7
            X.4VQ r4 = r5.A3B
            long r0 = (long) r8
            r4.A08 = r0
            r0 = 100
            int r0 = java.lang.Math.min(r0, r3)
            int r0 = r0 / 2
            if (r8 >= r0) goto L_0x0392
            r4.A0V(r2)
            return
        L_0x0386:
            java.lang.Boolean r0 = r5.A7Q
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0361
            r6.A00(r8, r4)
            goto L_0x0361
        L_0x0392:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110225ft.onScroll(android.widget.AbsListView, int, int, int):void");
    }
}
