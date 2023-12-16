package X;

import android.content.Context;
import android.content.Intent;
import android.view.View;

/* renamed from: X.5f3  reason: invalid class name and case insensitive filesystem */
public class C109705f3 implements View.OnClickListener {
    public Object A00;
    public Object A01;
    public final int A02;

    public C109705f3(Context context, Intent intent, int i) {
        this.A02 = i;
        if (i != 0) {
            this.A00 = context;
            this.A01 = intent;
            return;
        }
        this.A00 = context;
        this.A01 = intent;
    }

    public static void A00(View view, Object obj, Object obj2, int i) {
        view.setOnClickListener(new C109705f3(obj, i, obj2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x024c, code lost:
        if (r9.A0I == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0250, code lost:
        if (r9.A0B != false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0252, code lost:
        r1 = r8.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0254, code lost:
        if (r1 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0256, code lost:
        r1.A0M(X.AnonymousClass58J.A03);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x025b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x025e, code lost:
        if (r9.A0F == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0260, code lost:
        r6 = r7.A12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0267, code lost:
        if (r6.size() != 2) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x0269, code lost:
        r5 = X.C18290x4.A11(r6);
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x0272, code lost:
        if (r5.hasNext() == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0274, code lost:
        r3 = r5.next();
        r2 = r6.get(r3);
        X.C626936e.A06(r2);
        r2 = (X.C105175Tw) r2;
        r1 = new X.C105865Ws(r2);
        r1.A0F = !r2.A0F;
        r6.put(r3, r1.A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0295, code lost:
        if (r2.A0F != false) goto L_0x026e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x0297, code lost:
        r7.A07 = r2.A0b;
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029d, code lost:
        if (r4 == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x029f, code lost:
        X.AnonymousClass4VK.A03(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0070, code lost:
        r1 = X.C161097oz.A01(((X.AnonymousClass4X1) r12.A01).A01.A06.A06);
        r1.add(2, r2);
        r3.A1H(new X.C117045rI(r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x03bf, code lost:
        if (r2 == 3) goto L_0x03c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x05a2, code lost:
        r0.invoke(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x05a5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x05ee, code lost:
        r3 = r0.A00;
        r2 = r3.A1D();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05f4, code lost:
        if (r2 != null) goto L_0x05fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05f6, code lost:
        r0 = "voip/CallsFragment no context registered to start conversation";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05fa, code lost:
        X.C57052sz.A00(X.C86634Kw.A0D(r2, X.C86664Kz.A1B(), r4.B8o()), r3);
        r3.A0G.A0J(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x060e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x06f0, code lost:
        X.C06270Wx.A03(r1, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x06f5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x0739, code lost:
        com.whatsapp.util.Log.w(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x073c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:329:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0232, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0234, code lost:
        r8 = r0.A00;
        X.C626936e.A06(r8.A09);
        r7 = r8.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x023f, code lost:
        if (r9.A0K == false) goto L_0x024a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x0243, code lost:
        if (r9.A0B == false) goto L_0x025c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0245, code lost:
        r7.A0U(r9.A0b);
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00ee  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r13) {
        /*
            r12 = this;
            int r0 = r12.A02
            switch(r0) {
                case 0: goto L_0x062f;
                case 1: goto L_0x003f;
                case 2: goto L_0x0054;
                case 3: goto L_0x02ed;
                case 4: goto L_0x02fd;
                case 5: goto L_0x02fd;
                case 6: goto L_0x0309;
                case 7: goto L_0x034d;
                case 8: goto L_0x0359;
                case 9: goto L_0x0365;
                case 10: goto L_0x008b;
                case 11: goto L_0x0371;
                case 12: goto L_0x0371;
                case 13: goto L_0x0379;
                case 14: goto L_0x039e;
                case 15: goto L_0x03e8;
                case 16: goto L_0x0005;
                case 17: goto L_0x0005;
                case 18: goto L_0x00a6;
                case 19: goto L_0x010e;
                case 20: goto L_0x03fc;
                case 21: goto L_0x040f;
                case 22: goto L_0x0134;
                case 23: goto L_0x0152;
                case 24: goto L_0x016d;
                case 25: goto L_0x01b0;
                case 26: goto L_0x06d5;
                case 27: goto L_0x0486;
                case 28: goto L_0x04a1;
                case 29: goto L_0x04d4;
                case 30: goto L_0x04e3;
                case 31: goto L_0x04f2;
                case 32: goto L_0x0528;
                case 33: goto L_0x053e;
                case 34: goto L_0x055e;
                case 35: goto L_0x0572;
                case 36: goto L_0x0586;
                case 37: goto L_0x01d4;
                case 38: goto L_0x059a;
                case 39: goto L_0x01ef;
                case 40: goto L_0x0212;
                case 41: goto L_0x021d;
                case 42: goto L_0x0228;
                case 43: goto L_0x05a6;
                case 44: goto L_0x02a3;
                case 45: goto L_0x05d9;
                case 46: goto L_0x05e4;
                case 47: goto L_0x02c6;
                case 48: goto L_0x060f;
                case 49: goto L_0x061b;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r12.A00
            X.5ZB r3 = (X.AnonymousClass5ZB) r3
            java.lang.Object r2 = r12.A01
            android.content.Intent r2 = (android.content.Intent) r2
            X.5Xy r4 = r3.A0B
            r8 = 3
            X.3ZH r0 = r3.A0F
            if (r0 != 0) goto L_0x003a
            r0 = 0
        L_0x0015:
            java.lang.String r7 = X.C627336j.A07(r0)
            r5 = 0
            java.lang.Integer r6 = r3.A0I
            boolean r9 = r3.A01
            boolean r10 = r3.A00
            r4.A06(r5, r6, r7, r8, r9, r10)
            X.3ZH r0 = r3.A0F
            boolean r0 = r0.A0R()
            if (r0 == 0) goto L_0x0032
            r1 = 8
            X.5dl r0 = r3.A0C
            r4.A01(r0, r1)
        L_0x0032:
            X.5hX r1 = r3.A03
            X.4ea r0 = r3.A04
            r1.A0A(r0, r2)
        L_0x0039:
            return
        L_0x003a:
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass3ZH.A07(r0)
            goto L_0x0015
        L_0x003f:
            java.lang.Object r3 = r12.A00
            com.google.android.material.datepicker.MaterialCalendar r3 = (com.google.android.material.datepicker.MaterialCalendar) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A05
            X.0Xs r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1J()
            int r2 = r0 + -1
            if (r2 < 0) goto L_0x0039
            goto L_0x0070
        L_0x0054:
            java.lang.Object r3 = r12.A00
            com.google.android.material.datepicker.MaterialCalendar r3 = (com.google.android.material.datepicker.MaterialCalendar) r3
            androidx.recyclerview.widget.RecyclerView r0 = r3.A05
            X.0Xs r0 = r0.getLayoutManager()
            androidx.recyclerview.widget.LinearLayoutManager r0 = (androidx.recyclerview.widget.LinearLayoutManager) r0
            int r0 = r0.A1H()
            int r2 = r0 + 1
            androidx.recyclerview.widget.RecyclerView r0 = r3.A05
            X.0R6 r0 = r0.A0N
            int r0 = r0.A0G()
            if (r2 >= r0) goto L_0x0039
        L_0x0070:
            java.lang.Object r0 = r12.A01
            X.4X1 r0 = (X.AnonymousClass4X1) r0
            X.5dI r0 = r0.A01
            X.5rI r0 = r0.A06
            java.util.Calendar r0 = r0.A06
            java.util.Calendar r1 = X.C161097oz.A01(r0)
            r0 = 2
            r1.add(r0, r2)
            X.5rI r0 = new X.5rI
            r0.<init>(r1)
            r3.A1H(r0)
            return
        L_0x008b:
            java.lang.Object r4 = r12.A00
            X.4ea r4 = (X.C89654ea) r4
            java.lang.Object r3 = r12.A01
            X.6e2 r3 = (X.C131696e2) r3
            X.33i r0 = r4.A08
            android.content.ClipboardManager r1 = r0.A0C()
            r2 = 0
            if (r1 == 0) goto L_0x065c
            java.lang.String r0 = r3.A00
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x0039
            goto L_0x0644
        L_0x00a6:
            java.lang.Object r0 = r12.A00
            android.widget.EditText r0 = (android.widget.EditText) r0
            java.lang.Object r1 = r12.A01
            com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment r1 = (com.whatsapp.biz.cart.view.fragment.PromotionApplicationFragment) r1
            if (r0 == 0) goto L_0x0039
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0039
            java.lang.String r4 = r0.toString()
            if (r4 == 0) goto L_0x0039
            X.6Gr r0 = r1.A02
            if (r0 == 0) goto L_0x0039
            X.5Ox r3 = r0.A01
            X.5Uu r1 = r3.A04
            com.whatsapp.jid.UserJid r0 = r3.A07
            X.7OX r0 = X.C105405Uu.A00(r1, r0)
            if (r0 == 0) goto L_0x00fd
            java.util.List r0 = r0.A02
            if (r0 == 0) goto L_0x00fd
            java.util.Iterator r1 = r0.iterator()
        L_0x00d4:
            boolean r0 = r1.hasNext()
            r2 = 0
            if (r0 == 0) goto L_0x00ea
            java.lang.Object r2 = r1.next()
            r0 = r2
            X.5TF r0 = (X.AnonymousClass5TF) r0
            java.lang.String r0 = r0.A06
            boolean r0 = X.C162457s7.A0P(r0, r4)
            if (r0 == 0) goto L_0x00d4
        L_0x00ea:
            X.5TF r2 = (X.AnonymousClass5TF) r2
            if (r2 == 0) goto L_0x00fd
            java.util.Date r1 = new java.util.Date
            r1.<init>()
            java.util.Date r0 = r2.A08
            if (r0 == 0) goto L_0x0103
            boolean r0 = r0.before(r1)
            if (r0 != 0) goto L_0x0103
        L_0x00fd:
            X.4UC r0 = r3.A08
            X.AnonymousClass0x9.A1I(r0)
            return
        L_0x0103:
            java.util.Date r0 = r2.A07
            if (r0 == 0) goto L_0x0665
            boolean r0 = r0.after(r1)
            if (r0 != 0) goto L_0x0665
            goto L_0x00fd
        L_0x010e:
            java.lang.Object r0 = r12.A01
            X.6f9 r0 = (X.C132356f9) r0
            android.content.Context r3 = X.C86664Kz.A0S(r13)
            java.lang.String r2 = r0.A01
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "mailto:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r2, r1)
            android.content.Intent r1 = X.C18300x5.A08(r0)
            android.content.pm.PackageManager r0 = r3.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x0039
            r3.startActivity(r1)
            return
        L_0x0134:
            java.lang.Object r0 = r12.A01
            X.4m9 r0 = (X.C92134m9) r0
            com.whatsapp.bonsai.BonsaiConversationTitleViewModel r0 = X.C89884fR.A00(r0)
            com.whatsapp.jid.UserJid r4 = r0.A01
            if (r4 == 0) goto L_0x0039
            r3 = 0
            java.lang.Object r2 = r12.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.Integer r1 = X.C18280x3.A0S()
            r0 = 1
            android.content.Intent r0 = X.C627736r.A0l(r2, r4, r1, r0, r0)
            X.AnonymousClass0RN.A00(r2, r0, r3)
            return
        L_0x0152:
            java.lang.Object r1 = r12.A00
            X.4Qj r1 = (X.AnonymousClass4Qj) r1
            java.lang.Object r0 = r12.A01
            X.2jL r0 = (X.C51142jL) r0
            X.4V1 r3 = r1.getViewModel()
            X.4uZ r2 = r3.A00
            if (r2 == 0) goto L_0x0039
            X.33m r1 = r3.A07
            java.lang.String r0 = r0.A01
            r1.A0I(r2, r0)
            r3.A0D()
            return
        L_0x016d:
            java.lang.Object r4 = r12.A00
            X.4hi r4 = (X.C90554hi) r4
            java.lang.Object r6 = r12.A01
            com.whatsapp.jid.UserJid r6 = (com.whatsapp.jid.UserJid) r6
            int r1 = r4.A01()
            r0 = -1
            if (r1 == r0) goto L_0x0039
            X.6HX r0 = r4.A05
            java.util.List r0 = r0.A00
            java.lang.Object r2 = r0.get(r1)
            X.7Co r2 = (X.C147037Co) r2
            X.6fI r2 = (X.AnonymousClass6fI) r2
            X.8nP r0 = r4.A04
            X.7KJ r1 = r0.B5f(r1)
            r7 = 0
            android.view.View r0 = r4.A0H
            android.content.Context r5 = r0.getContext()
            java.lang.String r9 = r2.A02
            java.lang.String r10 = r2.A00
            if (r1 != 0) goto L_0x01ad
            r11 = 0
        L_0x019c:
            r8 = r7
            android.content.Intent r3 = X.C627736r.A0k(r5, r6, r7, r8, r9, r10, r11)
            X.5hX r2 = r4.A01
            android.app.Activity r1 = X.C111095hX.A04(r0)
            r0 = 3000(0xbb8, float:4.204E-42)
            r2.A0D(r1, r3, r0)
            return
        L_0x01ad:
            java.lang.String r11 = r1.A01
            goto L_0x019c
        L_0x01b0:
            java.lang.Object r0 = r12.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            java.lang.Object r6 = r12.A01
            X.4Zb r6 = (X.C88524Zb) r6
            X.4U2 r7 = r0.A0N
            if (r7 != 0) goto L_0x01c1
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x01c1:
            X.7yS r2 = r6.A04
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x0039
            X.4Zb r0 = r7.A07
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x066d
            X.4UC r1 = r7.A0i
            goto L_0x06f0
        L_0x01d4:
            java.lang.Object r0 = r12.A00
            X.4ic r0 = (X.C90924ic) r0
            java.lang.Object r2 = r12.A01
            X.4zK r2 = (X.C97834zK) r2
            X.3ZH r1 = r0.A01
            if (r1 == 0) goto L_0x0039
            X.3Cq r0 = r0.A09
            r0.A0A(r1)
            X.4uZ r1 = r1.A0H
            if (r1 == 0) goto L_0x0039
            X.4GQ r0 = r2.A02
            r0.invoke(r1)
            return
        L_0x01ef:
            java.lang.Object r3 = r12.A00
            com.whatsapp.calling.callgrid.view.FocusViewContainer r3 = (com.whatsapp.calling.callgrid.view.FocusViewContainer) r3
            java.lang.Object r0 = r12.A01
            X.7KU r0 = (X.AnonymousClass7KU) r0
            com.whatsapp.calling.callgrid.viewmodel.MenuBottomSheetViewModel r1 = r3.A06
            int r2 = r0.A01
            com.whatsapp.jid.UserJid r0 = r1.A02
            if (r0 == 0) goto L_0x0208
            X.4UC r1 = r1.A0E
            android.util.Pair r0 = X.C18290x4.A0K(r0, r2)
            r1.A0H(r0)
        L_0x0208:
            X.4Z7 r0 = r3.A05
            if (r0 == 0) goto L_0x0039
            android.view.View r0 = r0.A0H
            r0.performClick()
            return
        L_0x0212:
            java.lang.Object r0 = r12.A00
            X.4j4 r0 = (X.C91184j4) r0
            java.lang.Object r9 = r12.A01
            X.5Tw r9 = (X.C105175Tw) r9
            X.5MO r0 = r0.A00
            goto L_0x0232
        L_0x021d:
            java.lang.Object r0 = r12.A00
            X.4j9 r0 = (X.C91234j9) r0
            java.lang.Object r9 = r12.A01
            X.5Tw r9 = (X.C105175Tw) r9
            X.5MO r0 = r0.A03
            goto L_0x0232
        L_0x0228:
            java.lang.Object r0 = r12.A00
            X.4j8 r0 = (X.C91224j8) r0
            java.lang.Object r9 = r12.A01
            X.5Tw r9 = (X.C105175Tw) r9
            X.5MO r0 = r0.A03
        L_0x0232:
            if (r0 == 0) goto L_0x0039
            com.whatsapp.calling.callgrid.view.CallGrid r8 = r0.A00
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r0 = r8.A09
            X.C626936e.A06(r0)
            com.whatsapp.calling.callgrid.viewmodel.CallGridViewModel r7 = r8.A09
            boolean r0 = r9.A0K
            if (r0 == 0) goto L_0x024a
            boolean r0 = r9.A0B
            if (r0 == 0) goto L_0x025c
            com.whatsapp.jid.UserJid r0 = r9.A0b
            r7.A0U(r0)
        L_0x024a:
            boolean r0 = r9.A0I
            if (r0 == 0) goto L_0x0039
            boolean r0 = r9.A0B
            if (r0 != 0) goto L_0x0039
            com.whatsapp.calling.screenshare.ScreenShareViewModel r1 = r8.A0C
            if (r1 == 0) goto L_0x0039
            X.58J r0 = X.AnonymousClass58J.GRID_TILE
            r1.A0M(r0)
            return
        L_0x025c:
            boolean r0 = r9.A0F
            if (r0 == 0) goto L_0x024a
            java.util.LinkedHashMap r6 = r7.A12
            int r1 = r6.size()
            r0 = 2
            if (r1 != r0) goto L_0x024a
            java.util.Iterator r5 = X.C18290x4.A11(r6)
            r4 = 0
        L_0x026e:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x029d
            java.lang.Object r3 = r5.next()
            java.lang.Object r2 = r6.get(r3)
            X.C626936e.A06(r2)
            X.5Tw r2 = (X.C105175Tw) r2
            X.5Ws r1 = new X.5Ws
            r1.<init>(r2)
            boolean r0 = r2.A0F
            r0 = r0 ^ 1
            r1.A0F = r0
            X.5Tw r0 = r1.A00()
            r6.put(r3, r0)
            boolean r0 = r2.A0F
            if (r0 != 0) goto L_0x026e
            com.whatsapp.jid.UserJid r0 = r2.A0b
            r7.A07 = r0
            r4 = 1
            goto L_0x026e
        L_0x029d:
            if (r4 == 0) goto L_0x024a
            X.AnonymousClass4VK.A03(r7)
            goto L_0x024a
        L_0x02a3:
            java.lang.Object r2 = r12.A00
            com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet r2 = (com.whatsapp.calling.callhistory.group.GroupCallParticipantPickerSheet) r2
            java.lang.Object r1 = r12.A01
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.view.View r0 = r2.A04
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0039
            float r1 = r1.y
            android.view.View r0 = r2.A03
            float r0 = r0.getY()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0039
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = r2.A07
            r0 = 5
            r1.A0S(r0)
            return
        L_0x02c6:
            java.lang.Object r1 = r12.A00
            X.4jD r1 = (X.C91244jD) r1
            java.lang.Object r6 = r12.A01
            X.7D6 r6 = (X.AnonymousClass7D6) r6
            X.3ZH r5 = r1.A05
            if (r5 == 0) goto L_0x0737
            X.4uZ r0 = r5.A0H
            if (r0 == 0) goto L_0x0737
            boolean r4 = r1.A06
            long r2 = r1.A01
            int r1 = r1.A00
            if (r1 != 0) goto L_0x02e4
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r6.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A02(r0, r5, r2)
            return
        L_0x02e4:
            r0 = 1
            if (r1 == r0) goto L_0x0039
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r0 = r6.A00
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2.A03(r0, r5, r4)
            return
        L_0x02ed:
            java.lang.Object r1 = r12.A00
            X.7l7 r1 = (X.C159097l7) r1
            java.lang.Object r0 = r12.A01
            android.view.View$OnClickListener r0 = (android.view.View.OnClickListener) r0
            r0.onClick(r13)
            r0 = 1
            r1.A08(r0)
            return
        L_0x02fd:
            java.lang.Object r1 = r12.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.Object r0 = r12.A01
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            r1.onOptionsItemSelected(r0)
            return
        L_0x0309:
            java.lang.Object r0 = r12.A00
            X.4WM r0 = (X.AnonymousClass4WM) r0
            java.lang.Object r4 = r12.A01
            X.5dk r4 = (X.C108905dk) r4
            com.whatsapp.IntentChooserBottomSheetDialogFragment r3 = r0.A01
            java.lang.Integer r0 = r3.A08
            if (r0 != 0) goto L_0x0334
            X.03q r2 = r3.A0R()
            android.content.Intent r1 = r4.A07
            int r0 = r3.A00
            r2.startActivityForResult(r1, r0)
        L_0x0322:
            java.lang.Integer r0 = r4.A03
            if (r0 == 0) goto L_0x0330
            X.2r2 r2 = r3.A05
            int r1 = r0.intValue()
            r0 = 0
            r2.A03(r0, r1)
        L_0x0330:
            r3.A1K()
            return
        L_0x0334:
            X.0df r1 = r3.A0U()
            java.lang.Integer r0 = r3.A08
            int r0 = r0.intValue()
            X.0eF r2 = r1.A0B(r0)
            X.C626936e.A06(r2)
            android.content.Intent r1 = r4.A07
            int r0 = r3.A00
            r2.startActivityForResult(r1, r0)
            goto L_0x0322
        L_0x034d:
            java.lang.Object r1 = r12.A00
            X.4bm r1 = (X.C89144bm) r1
            java.lang.Object r0 = r12.A01
            X.6e3 r0 = (X.C131706e3) r0
            r1.A7B(r0)
            return
        L_0x0359:
            java.lang.Object r1 = r12.A00
            X.4bm r1 = (X.C89144bm) r1
            java.lang.Object r0 = r12.A01
            X.6e4 r0 = (X.C131716e4) r0
            r1.A7A(r0)
            return
        L_0x0365:
            java.lang.Object r1 = r12.A00
            X.4bm r1 = (X.C89144bm) r1
            java.lang.Object r0 = r12.A01
            X.6e3 r0 = (X.C131706e3) r0
            r1.A7C(r0)
            return
        L_0x0371:
            java.lang.Object r0 = r12.A00
            X.4GQ r0 = (X.AnonymousClass4GQ) r0
            java.lang.Object r1 = r12.A01
            goto L_0x05a2
        L_0x0379:
            java.lang.Object r2 = r12.A00
            X.5hg r2 = (X.C111185hg) r2
            java.lang.Object r1 = r12.A01
            android.content.Context r1 = (android.content.Context) r1
            java.lang.String r0 = "https://faq.whatsapp.com/335178174377229"
            android.content.Intent r0 = X.C18300x5.A08(r0)
            r1.startActivity(r0)
            X.7Cp r0 = r2.A02
            X.33p r2 = r0.A00
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r2)
            java.lang.String r1 = "biz_shop_sunset_banner_clicked"
            int r0 = X.C18280x3.A02(r0, r1)
            int r0 = r0 + 1
            X.C18260x0.A0L(r2, r1, r0)
            return
        L_0x039e:
            java.lang.Object r5 = r12.A00
            X.5id r5 = (X.C111755id) r5
            java.lang.Object r0 = r12.A01
            X.3ZH r0 = (X.AnonymousClass3ZH) r0
            X.7SX r4 = r5.A1A
            X.4uZ r2 = r0.A0H
            java.lang.Integer r1 = r5.A1I
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            java.lang.String r3 = r2.getRawString()
            if (r1 == 0) goto L_0x03e6
            int r2 = r1.intValue()
            r1 = 2
            r0 = 1
            if (r2 == r1) goto L_0x03c1
            r0 = 3
            if (r2 != r0) goto L_0x03e6
        L_0x03c1:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x03c5:
            r0 = 1
            r4.A00(r1, r3, r0, r0)
            com.whatsapp.chatinfo.ContactInfoActivity r4 = r5.A0n
            com.whatsapp.jid.UserJid r3 = r5.A02()
            r0 = 0
            X.C162457s7.A0J(r3, r0)
            com.whatsapp.biz.education.VerifiedBusinessEducationBottomSheet r2 = new com.whatsapp.biz.education.VerifiedBusinessEducationBottomSheet
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "biz_owner_jid"
            X.C86604Kt.A18(r1, r2, r3, r0)
            r0 = 0
            r4.Bon(r2, r0)
            return
        L_0x03e6:
            r1 = 0
            goto L_0x03c5
        L_0x03e8:
            java.lang.Object r0 = r12.A00
            X.5id r0 = (X.C111755id) r0
            java.lang.Object r2 = r12.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            X.2nX r1 = r0.A16
            X.1fH r2 = (X.C27981fH) r2
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00(r2, r0)
            return
        L_0x03fc:
            java.lang.Object r1 = r12.A00
            android.content.Context r1 = (android.content.Context) r1
            java.lang.Object r0 = r12.A01
            android.content.Intent r0 = (android.content.Intent) r0
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x0408 }
            goto L_0x040e
        L_0x0408:
            java.lang.String r0 = "BusinessComplianceAdapter/Call action feature is not supported."
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x040e:
            return
        L_0x040f:
            java.lang.Object r3 = r12.A00
            com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment r3 = (com.whatsapp.biz.linkedaccounts.LinkedAccountMediaViewFragment) r3
            java.lang.Object r4 = r12.A01
            X.5df r4 = (X.C108855df) r4
            android.content.Context r0 = r3.A1D()
            if (r0 == 0) goto L_0x0469
            X.3Ex r1 = r3.A08
            com.whatsapp.jid.UserJid r0 = r3.A0E
            X.3ZH r2 = r1.A0A(r0)
            X.36r r1 = X.C86664Kz.A1B()
            android.content.Context r0 = r3.A1D()
            android.content.Intent r6 = r1.A1L(r0, r2)
            int r0 = r3.A02
            r5 = 1
            if (r0 != r5) goto L_0x0460
            java.lang.String r0 = "confirm"
            r6.putExtra(r0, r5)
            java.lang.String r4 = r4.A04
            java.lang.String r0 = "ig_post_url"
            r6.putExtra(r0, r4)
            android.content.Context r2 = r3.A1D()
            r1 = 2131890103(0x7f120fb7, float:1.9414888E38)
            java.lang.Object[] r0 = new java.lang.Object[r5]
            java.lang.String r1 = X.C86614Ku.A0s(r2, r4, r0, r1)
            java.lang.String r0 = "has_share"
            r6.putExtra(r0, r5)
            java.lang.String r0 = "share_msg"
            r6.putExtra(r0, r1)
            android.content.Context r0 = r3.A1D()
            X.C57352tV.A00(r0, r6)
        L_0x0460:
            X.5hX r1 = r3.A04
            android.content.Context r0 = r3.A1D()
            r1.A0B(r0, r6)
        L_0x0469:
            int r0 = r3.A02
            if (r0 != 0) goto L_0x047d
            int r0 = r3.A00
            r2 = 25
            if (r0 != 0) goto L_0x0475
            r2 = 24
        L_0x0475:
            X.5Xy r1 = r3.A06
            X.5dl r0 = r3.A07
            r1.A02(r0, r2)
            return
        L_0x047d:
            X.2XT r2 = r3.A05
            com.whatsapp.jid.UserJid r1 = r3.A0E
            r0 = 2
            r2.A00(r1, r0)
            return
        L_0x0486:
            java.lang.Object r1 = r12.A00
            X.5UV r1 = (X.AnonymousClass5UV) r1
            java.lang.Object r3 = r12.A01
            X.4wK r3 = (X.C96414wK) r3
            android.view.View r0 = r1.A03
            X.5e1 r2 = r3.A0B
            X.5QM r1 = r1.A0Q
            android.app.Activity r0 = X.C111095hX.A04(r0)
            r1.A00(r0, r2)
            X.8rU r0 = r3.A08
            r0.BWV()
            return
        L_0x04a1:
            java.lang.Object r6 = r12.A00
            X.5UV r6 = (X.AnonymousClass5UV) r6
            java.lang.Object r5 = r12.A01
            X.4wK r5 = (X.C96414wK) r5
            android.view.View r4 = r6.A03
            X.5e1 r0 = r5.A0B
            X.8nm r3 = r5.A09
            X.8vB r2 = r5.A0A
            X.5U9 r1 = r6.A0P
            java.lang.String r0 = r0.A0F
            r1.A02(r4, r3, r2, r0)
            X.8rU r4 = r5.A08
            boolean r0 = r5.A0D
            if (r0 == 0) goto L_0x04d2
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
        L_0x04c2:
            java.lang.Integer r2 = r6.A01(r5)
            java.lang.Integer r1 = r6.A03(r5)
            java.lang.Integer r0 = r6.A02(r5)
            r4.BYw(r3, r2, r1, r0)
            return
        L_0x04d2:
            r3 = 0
            goto L_0x04c2
        L_0x04d4:
            java.lang.Object r1 = r12.A00
            X.8rR r1 = (X.C184218rR) r1
            java.lang.Object r0 = r12.A01
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.BVn()
            r0.dismiss()
            return
        L_0x04e3:
            java.lang.Object r1 = r12.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r12.A01
            X.8rR r0 = (X.C184218rR) r0
            r1.dismiss()
            r0.BVo()
            return
        L_0x04f2:
            java.lang.Object r1 = r12.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r1 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r1
            java.lang.Object r3 = r12.A01
            android.app.Dialog r3 = (android.app.Dialog) r3
            X.66d r2 = r1.A02
            if (r2 == 0) goto L_0x0516
            X.5Tn r0 = r1.A00
            if (r0 == 0) goto L_0x0521
            X.5TO r1 = r1.A01
            if (r1 == 0) goto L_0x051a
            X.5ZO r0 = r0.A01()
            if (r0 != 0) goto L_0x0510
            X.5ZO r0 = r1.A00()
        L_0x0510:
            X.C162457s7.A0D(r0)
            r2.BY6(r0)
        L_0x0516:
            r3.dismiss()
            return
        L_0x051a:
            java.lang.String r0 = "defaultSearchLocationProvider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0521:
            java.lang.String r0 = "searchLocationRepository"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0528:
            java.lang.Object r3 = r12.A00
            com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog r3 = (com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryLocationErrorDialog) r3
            java.lang.Object r2 = r12.A01
            android.app.Dialog r2 = (android.app.Dialog) r2
            r1 = 0
            X.66d r0 = r3.A02
            if (r0 == 0) goto L_0x0538
            r0.BSP()
        L_0x0538:
            r3.A03 = r1
            r2.dismiss()
            return
        L_0x053e:
            java.lang.Object r6 = r12.A00
            X.4wu r6 = (X.C96774wu) r6
            java.lang.Object r5 = r12.A01
            X.4wF r5 = (X.C96364wF) r5
            X.7HA r0 = r5.A00
            X.5Xb r4 = r0.A01
            r3 = 4
            X.5dy r2 = r0.A00
            r1 = 0
            r0 = 34
            X.C105955Xb.A00(r2, r4, r0, r3, r1)
            X.5U9 r3 = r6.A06
            java.lang.String r2 = r5.A03
            r1 = 0
            android.view.View r0 = r6.A0H
            r3.A02(r0, r1, r1, r2)
            return
        L_0x055e:
            java.lang.Object r1 = r12.A00
            X.6J2 r1 = (X.AnonymousClass6J2) r1
            java.lang.Object r0 = r12.A01
            X.7Qq r0 = (X.C150417Qq) r0
            X.8u1 r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.BRP(r0)
            return
        L_0x0572:
            java.lang.Object r1 = r12.A00
            X.6J2 r1 = (X.AnonymousClass6J2) r1
            java.lang.Object r0 = r12.A01
            X.7Qq r0 = (X.C150417Qq) r0
            X.8u1 r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.BUG(r0)
            return
        L_0x0586:
            java.lang.Object r1 = r12.A00
            X.6J2 r1 = (X.AnonymousClass6J2) r1
            java.lang.Object r0 = r12.A01
            X.7Qq r0 = (X.C150417Qq) r0
            X.8u1 r1 = r1.A00
            boolean r0 = r0.A00()
            r0 = r0 ^ 1
            r1.BXM(r0)
            return
        L_0x059a:
            java.lang.Object r1 = r12.A01
            X.4zI r1 = (X.C97814zI) r1
            X.4GQ r0 = r1.A01
            X.5dh r1 = r1.A00
        L_0x05a2:
            r0.invoke(r1)
            return
        L_0x05a6:
            java.lang.Object r4 = r12.A00
            com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner r4 = (com.whatsapp.calling.callgrid.view.VoipInCallNotifBanner) r4
            java.lang.Object r3 = r12.A01
            X.5L7 r3 = (X.AnonymousClass5L7) r3
            java.util.List r1 = r3.A07
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x05c3
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r0 = r4.A05
            if (r0 == 0) goto L_0x05bf
            X.4UC r0 = r0.A0C
            r0.A0H(r1)
        L_0x05bf:
            r4.A01()
            return
        L_0x05c3:
            com.whatsapp.calling.callgrid.viewmodel.InCallBannerViewModel r2 = r4.A05
            if (r2 == 0) goto L_0x05bf
            int r1 = r3.A01
            r0 = 12
            if (r1 != r0) goto L_0x05bf
            X.4UC r0 = r2.A09
            X.C86654Ky.A1H(r0)
            X.4UC r1 = r2.A0A
            r0 = 0
            r1.A0H(r0)
            goto L_0x05bf
        L_0x05d9:
            java.lang.Object r0 = r12.A00
            X.4Yf r0 = (X.C88304Yf) r0
            java.lang.Object r4 = r12.A01
            X.8FX r4 = (X.AnonymousClass8FX) r4
            X.5MP r0 = r0.A00
            goto L_0x05ee
        L_0x05e4:
            java.lang.Object r0 = r12.A00
            X.4Yl r0 = (X.C88364Yl) r0
            java.lang.Object r4 = r12.A01
            X.8FY r4 = (X.AnonymousClass8FY) r4
            X.5MP r0 = r0.A04
        L_0x05ee:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragmentV2 r3 = r0.A00
            android.content.Context r2 = r3.A1D()
            if (r2 != 0) goto L_0x05fa
            java.lang.String r0 = "voip/CallsFragment no context registered to start conversation"
            goto L_0x0739
        L_0x05fa:
            X.36r r1 = X.C86664Kz.A1B()
            X.4uZ r0 = r4.B8o()
            android.content.Intent r0 = X.C86634Kw.A0D(r2, r1, r0)
            X.C57052sz.A00(r0, r3)
            com.whatsapp.calling.callhistory.viewmodel.CallsHistoryFragmentV2ViewModel r0 = r3.A0G
            r0.A0J(r4)
            return
        L_0x060f:
            java.lang.Object r1 = r12.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r1 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r1
            java.lang.Object r0 = r12.A01
            X.7yU r0 = (X.C166317yU) r0
            r1.A7D(r0)
            return
        L_0x061b:
            java.lang.Object r4 = r12.A00
            com.whatsapp.calling.calllink.view.CallLinkActivity r4 = (com.whatsapp.calling.calllink.view.CallLinkActivity) r4
            java.lang.Object r0 = r12.A01
            X.7yU r0 = (X.C166317yU) r0
            X.66r r3 = r4.A07
            java.lang.String r2 = r0.A05
            boolean r1 = r0.A06
            r0 = 16
            r3.BhT(r4, r2, r0, r1)
            return
        L_0x062f:
            java.lang.Object r1 = r12.A00     // Catch:{ ActivityNotFoundException -> 0x063b }
            android.content.Context r1 = (android.content.Context) r1     // Catch:{ ActivityNotFoundException -> 0x063b }
            java.lang.Object r0 = r12.A01     // Catch:{ ActivityNotFoundException -> 0x063b }
            android.content.Intent r0 = (android.content.Intent) r0     // Catch:{ ActivityNotFoundException -> 0x063b }
            r1.startActivity(r0)     // Catch:{ ActivityNotFoundException -> 0x063b }
            return
        L_0x063b:
            r2 = move-exception
            java.lang.String r1 = "DeferredLifecycleHelper"
            java.lang.String r0 = "Failed to start resolution intent"
            android.util.Log.e(r1, r0, r2)
            return
        L_0x0644:
            java.lang.String r0 = r3.A00     // Catch:{ NullPointerException | SecurityException -> 0x0656 }
            android.content.ClipData r0 = android.content.ClipData.newPlainText(r0, r0)     // Catch:{ NullPointerException | SecurityException -> 0x0656 }
            r1.setPrimaryClip(r0)     // Catch:{ NullPointerException | SecurityException -> 0x0656 }
            X.3Wi r1 = r4.A05     // Catch:{ NullPointerException | SecurityException -> 0x0656 }
            r0 = 2131890410(0x7f1210ea, float:1.9415511E38)
            r1.A0H(r0, r2)     // Catch:{ NullPointerException | SecurityException -> 0x0656 }
            return
        L_0x0656:
            r1 = move-exception
            java.lang.String r0 = "sharelinkactivity/copylink/npe"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x065c:
            X.3Wi r1 = r4.A05
            r0 = 2131895056(0x7f122310, float:1.9424934E38)
            r1.A0H(r0, r2)
            return
        L_0x0665:
            X.4FS r1 = r3.A09
            r0 = 41
            X.C117165rU.A00(r1, r3, r2, r0)
            return
        L_0x066d:
            X.4Zb r1 = r7.A07
            r5 = 0
            if (r1 == 0) goto L_0x067d
            r0 = 0
            r1.A06(r0)
            r1.A0C()
            X.7yS r0 = r1.A04
            r0.A01 = r5
        L_0x067d:
            X.5e1 r0 = r2.A03
            if (r0 == 0) goto L_0x0684
            r7.A0P(r0)
        L_0x0684:
            r0 = 1065353216(0x3f800000, float:1.0)
            r6.A06(r0)
            r7.A07 = r6
            X.4Lx r1 = r6.A03
            java.lang.String r0 = ""
            r1.A09 = r0
            r1.A0A = r5
            X.5hC r0 = r6.A09
            android.content.Context r0 = r0.A0P
            X.C162457s7.A0J(r0, r5)
            int r0 = X.AnonymousClass5YI.A02(r0)
            r1.A04 = r0
            r1.A01()
            r6.A02()
            r0 = 1
            r2.A01 = r0
            X.5iE r4 = r7.A0V
            java.lang.Integer r3 = r7.A0B
            java.lang.Integer r2 = java.lang.Integer.valueOf(r5)
            X.4sp r1 = new X.4sp
            r1.<init>()
            r0 = 77
            X.C95224sp.A01(r1, r0)
            r1.A09 = r3
            r1.A0B = r2
            r4.A04(r1)
            X.4UC r2 = r7.A0h
            X.5ds r0 = r6.BBX()
            X.7UM r1 = new X.7UM
            r1.<init>()
            r1.A06 = r0
            r0 = 300(0x12c, float:4.2E-43)
            X.C86644Kx.A1E(r2, r1, r0, r5)
            return
        L_0x06d5:
            java.lang.Object r0 = r12.A00
            com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity r0 = (com.whatsapp.businessdirectory.view.activity.BusinessDirectoryMapViewActivity) r0
            java.lang.Object r4 = r12.A01
            X.4Za r4 = (X.C88514Za) r4
            X.4U2 r3 = r0.A0N
            if (r3 != 0) goto L_0x06e6
            java.lang.RuntimeException r0 = X.C86604Kt.A0j()
            throw r0
        L_0x06e6:
            X.4Za r0 = r3.A08
            boolean r0 = X.C162457s7.A0P(r4, r0)
            if (r0 == 0) goto L_0x06f6
            X.4UC r1 = r3.A0i
        L_0x06f0:
            r0 = 11
            X.C06270Wx.A03(r1, r0)
            return
        L_0x06f6:
            X.4Za r2 = r3.A08
            if (r2 == 0) goto L_0x0706
            X.7yS r1 = r2.A0D
            r0 = 0
            r1.A01 = r0
            r0 = 0
            r2.A06(r0)
            r2.A02()
        L_0x0706:
            X.5e1 r0 = r4.A0E
            X.C162457s7.A0D(r0)
            r3.A0P(r0)
            X.7yS r1 = r4.A0D
            r0 = 1
            r1.A01 = r0
            r0 = 1065353216(0x3f800000, float:1.0)
            r4.A06(r0)
            r4.A02()
            r3.A08 = r4
            X.7yk r0 = r3.A02
            if (r0 == 0) goto L_0x0734
            float r1 = r0.A02
        L_0x0723:
            X.4UC r3 = r3.A0h
            X.5ds r0 = r4.BBX()
            X.7UM r2 = X.C153847c7.A01(r0, r1)
            r1 = 300(0x12c, float:4.2E-43)
            r0 = 0
            X.C86644Kx.A1E(r3, r2, r1, r0)
            return
        L_0x0734:
            r1 = 1098383360(0x41780000, float:15.5)
            goto L_0x0723
        L_0x0737:
            java.lang.String r0 = "ScheduledCallItemViewHolder/callTypeIconClicked group contact null"
        L_0x0739:
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109705f3.onClick(android.view.View):void");
    }

    public C109705f3(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }
}
