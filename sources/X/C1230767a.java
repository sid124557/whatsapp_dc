package X;

import android.view.View;

/* renamed from: X.67a  reason: invalid class name and case insensitive filesystem */
public class C1230767a extends AnonymousClass0WH {
    public Object A00;
    public final int A01;

    public C1230767a(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public void A05(View view, int i) {
        switch (this.A01) {
            case 10:
            case 16:
                if (i == 4) {
                    return;
                }
                break;
        }
        super.A05(view, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x008c, code lost:
        r0 = (X.AnonymousClass52T) r8.A00;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A06(android.view.View r9, android.view.accessibility.AccessibilityEvent r10) {
        /*
            r8 = this;
            int r0 = r8.A01
            switch(r0) {
                case 3: goto L_0x0009;
                case 9: goto L_0x0049;
                case 12: goto L_0x0067;
                case 14: goto L_0x0081;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A06(r9, r10)
        L_0x0008:
            return
        L_0x0009:
            int r1 = r10.getEventType()
            r0 = 32768(0x8000, float:4.5918E-41)
            if (r1 != r0) goto L_0x0008
            java.lang.Object r1 = r8.A00
            X.4Rs r1 = (X.AnonymousClass4Rs) r1
            android.content.Context r0 = r1.getContext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r0 = r9.getTag()
            if (r0 == 0) goto L_0x0008
            android.content.Context r7 = r1.getContext()
            X.33i r6 = r1.A06
            android.content.Context r5 = r1.getContext()
            r4 = 2131886559(0x7f1201df, float:1.94077E38)
            java.lang.Object[] r3 = X.AnonymousClass002.A0L()
            X.33j r2 = r1.A07
            java.lang.Object r0 = r9.getTag()
            long r0 = X.C18310x6.A0B(r0)
            java.lang.String r0 = X.C107565bW.A0B(r2, r0)
            java.lang.String r0 = X.C86614Ku.A0s(r5, r0, r3, r4)
            X.C107295b4.A00(r7, r6, r0)
            return
        L_0x0049:
            super.A06(r9, r10)
            java.lang.Object r0 = r8.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.676 r0 = r0.A2z
            X.5mA r0 = r0.getMessageAudioPlayerProvider()
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x0008
            r0 = -1
            r10.setFromIndex(r0)
            r10.setToIndex(r0)
            r10.setItemCount(r0)
            return
        L_0x0067:
            super.A06(r9, r10)
            java.lang.Object r2 = r8.A00
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            X.33i r0 = r2.A0B
            boolean r0 = X.C107295b4.A09(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = r10.getEventType()
            r0 = 1
            if (r1 != r0) goto L_0x0008
            com.whatsapp.search.views.TokenizedSearchInput.A00(r9, r2)
            return
        L_0x0081:
            super.A06(r9, r10)
            int r1 = r10.getEventType()
            r0 = 65536(0x10000, float:9.18355E-41)
            if (r1 != r0) goto L_0x0008
            java.lang.Object r0 = r8.A00
            X.52T r0 = (X.AnonymousClass52T) r0
            java.lang.Runnable r1 = r0.A01
            if (r1 == 0) goto L_0x0008
            android.widget.TextView r0 = r0.A05
            r0.removeCallbacks(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230767a.A06(android.view.View, android.view.accessibility.AccessibilityEvent):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0086, code lost:
        r1 = r1.getString(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x008a, code lost:
        r2 = new X.C06220Ws(16, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0091, code lost:
        r8.A07(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0198, code lost:
        r8.A09(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x019b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x01bf, code lost:
        r0 = X.C06220Ws.A0L;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01c1, code lost:
        r8.A08(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x01c4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0D(android.view.View r7, X.C05650Ui r8) {
        /*
            r6 = this;
            int r0 = r6.A01
            switch(r0) {
                case 0: goto L_0x0186;
                case 1: goto L_0x00fc;
                case 2: goto L_0x0163;
                case 3: goto L_0x015d;
                case 4: goto L_0x01ae;
                case 5: goto L_0x0034;
                case 6: goto L_0x019c;
                case 7: goto L_0x00cc;
                case 8: goto L_0x0025;
                case 9: goto L_0x0005;
                case 10: goto L_0x0095;
                case 11: goto L_0x014c;
                case 12: goto L_0x0049;
                case 13: goto L_0x0016;
                case 14: goto L_0x0005;
                case 15: goto L_0x012b;
                case 16: goto L_0x0095;
                case 17: goto L_0x0009;
                default: goto L_0x0005;
            }
        L_0x0005:
            super.A0D(r7, r8)
        L_0x0008:
            return
        L_0x0009:
            super.A0D(r7, r8)
            java.lang.Object r0 = r6.A00
            X.5ZT r0 = (X.AnonymousClass5ZT) r0
            X.03q r1 = r0.A0a
            r0 = 2131895228(0x7f1223bc, float:1.9425283E38)
            goto L_0x0086
        L_0x0016:
            super.A0D(r7, r8)
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131893474(0x7f121ce2, float:1.9421726E38)
            java.lang.CharSequence r1 = r1.getText(r0)
            goto L_0x008a
        L_0x0025:
            super.A0D(r7, r8)
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131886118(0x7f120026, float:1.9406806E38)
            goto L_0x0086
        L_0x0034:
            super.A0D(r7, r8)
            r1 = 0
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setLongClickable(r1)
            X.0Ws r0 = X.C06220Ws.A0L
            r8.A08(r0)
            r0 = 1
            r8.A0H(r0)
            X.0Ws r2 = X.C06220Ws.A08
            goto L_0x0091
        L_0x0049:
            super.A0D(r7, r8)
            java.lang.Object r2 = r6.A00
            com.whatsapp.search.views.TokenizedSearchInput r2 = (com.whatsapp.search.views.TokenizedSearchInput) r2
            X.33i r0 = r2.A0B
            boolean r0 = X.C107295b4.A09(r0)
            if (r0 == 0) goto L_0x0008
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x006c
            android.content.Context r1 = r2.getContext()
            r0 = 2131886184(0x7f120068, float:1.940694E38)
            java.lang.String r0 = r1.getString(r0)
            r8.A0C(r0)
        L_0x006c:
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getName()
            android.view.accessibility.AccessibilityNodeInfo r1 = r8.A01
            r1.setClassName(r0)
            r0 = 0
            r1.setCheckable(r0)
            r0 = 1
            r8.A0H(r0)
            android.content.Context r1 = r2.getContext()
            r0 = 2131886119(0x7f120027, float:1.9406808E38)
        L_0x0086:
            java.lang.String r1 = r1.getString(r0)
        L_0x008a:
            r0 = 16
            X.0Ws r2 = new X.0Ws
            r2.<init>((int) r0, (java.lang.CharSequence) r1)
        L_0x0091:
            r8.A07(r2)
            return
        L_0x0095:
            super.A0D(r7, r8)
            r1 = 0
            r8.A0H(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setSelected(r1)
            java.util.List r0 = r8.A02()
            java.util.Iterator r4 = r0.iterator()
        L_0x00a9:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0008
            java.lang.Object r3 = r4.next()
            X.0Ws r3 = (X.C06220Ws) r3
            java.lang.Object r2 = r3.A03
            android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction r2 = (android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction) r2
            int r1 = r2.getId()
            r0 = 16
            if (r1 == r0) goto L_0x00c8
            int r1 = r2.getId()
            r0 = 4
            if (r1 != r0) goto L_0x00a9
        L_0x00c8:
            r8.A08(r3)
            goto L_0x00a9
        L_0x00cc:
            super.A0D(r7, r8)
            r0 = 0
            r8.A0H(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            boolean r0 = r0.isLongClickable()
            if (r0 == 0) goto L_0x0008
            android.content.res.Resources r1 = r7.getResources()
            r0 = 2131886126(0x7f12002e, float:1.9406822E38)
            java.lang.String r1 = r1.getString(r0)
            r0 = 32
            X.C86644Kx.A1B(r8, r1, r0)
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            boolean r0 = r0.hasOnClickListeners()
            r8.A0H(r0)
            if (r0 != 0) goto L_0x0008
            X.0Ws r0 = X.C06220Ws.A08
            goto L_0x01c1
        L_0x00fc:
            super.A0D(r7, r8)
            java.lang.Object r5 = r6.A00
            X.7Go[] r5 = (X.C148007Go[]) r5
            int r4 = r5.length
            r3 = 0
        L_0x0105:
            if (r3 >= r4) goto L_0x0008
            r2 = r5[r3]
            boolean r0 = r2 instanceof X.C131956eS
            if (r0 == 0) goto L_0x011c
            r0 = r2
            X.6eS r0 = (X.C131956eS) r0
            java.lang.String r1 = r0.A00
        L_0x0112:
            if (r1 == 0) goto L_0x0119
            int r0 = r2.A00
            X.C86644Kx.A1B(r8, r1, r0)
        L_0x0119:
            int r3 = r3 + 1
            goto L_0x0105
        L_0x011c:
            int r0 = r2.A01
            if (r0 == 0) goto L_0x0119
            android.content.Context r1 = r7.getContext()
            int r0 = r2.A01
            java.lang.String r1 = r1.getString(r0)
            goto L_0x0112
        L_0x012b:
            super.A0D(r7, r8)
            r1 = 0
            r8.A0H(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setLongClickable(r1)
            X.0Ws r0 = X.C06220Ws.A08
            r8.A08(r0)
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            r0 = 2131893991(0x7f121ee7, float:1.9422774E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0198
        L_0x014c:
            super.A0D(r7, r8)
            r0 = 0
            r8.A0I(r0)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r0 = r0.getSimpleName()
            r8.A0C(r0)
            return
        L_0x015d:
            super.A0D(r7, r8)
            java.lang.String r0 = ""
            goto L_0x0198
        L_0x0163:
            super.A0D(r7, r8)
            java.lang.Class<android.widget.Button> r0 = android.widget.Button.class
            java.lang.String r3 = r0.getName()
            r2 = 2131886184(0x7f120068, float:1.940694E38)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 >= r0) goto L_0x0180
            java.lang.Object r0 = r6.A00
            android.view.View r0 = (android.view.View) r0
            java.lang.String r0 = X.C86624Kv.A0b(r0, r2)
            r8.A0C(r0)
        L_0x0180:
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setClassName(r3)
            return
        L_0x0186:
            super.A0D(r7, r8)
            java.lang.Object r0 = r6.A00
            android.content.Context r0 = (android.content.Context) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131886563(0x7f1201e3, float:1.9407708E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x0198:
            r8.A09(r0)
            return
        L_0x019c:
            super.A0D(r7, r8)
            r1 = 0
            r8.A0H(r1)
            X.0Ws r0 = X.C06220Ws.A08
            r8.A08(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setLongClickable(r1)
            goto L_0x01bf
        L_0x01ae:
            super.A0D(r7, r8)
            r1 = 0
            r8.A0H(r1)
            android.view.accessibility.AccessibilityNodeInfo r0 = r8.A01
            r0.setLongClickable(r1)
            X.0Ws r0 = X.C06220Ws.A08
            r8.A08(r0)
        L_0x01bf:
            X.0Ws r0 = X.C06220Ws.A0L
        L_0x01c1:
            r8.A08(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1230767a.A0D(android.view.View, X.0Ui):void");
    }
}
