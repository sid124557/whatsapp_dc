package X;

import com.whatsapp.HomeActivity;

/* renamed from: X.5sG  reason: invalid class name and case insensitive filesystem */
public class C117645sG implements Runnable {
    public Object A00;
    public final int A01;

    public C117645sG(HomeActivity homeActivity, int i) {
        this.A01 = i;
        switch (i) {
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 40:
                this.A00 = homeActivity;
                return;
            default:
                this.A00 = homeActivity;
                return;
        }
    }

    public static void A00(C69263Wi r1, HomeActivity homeActivity, int i) {
        r1.A0S(new C117645sG(homeActivity, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0454, code lost:
        A00(r1, r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0457, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x04c8, code lost:
        if (r1.A01.A0X(6541) == false) goto L_0x04ca;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x070d, code lost:
        if (r3 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x070f, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0712, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x0720, code lost:
        r1.postFrameCallback(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:386:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:182:0x03b9  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x03fe  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            int r0 = r10.A01
            switch(r0) {
                case 0: goto L_0x001c;
                case 1: goto L_0x0028;
                case 2: goto L_0x0065;
                case 3: goto L_0x006d;
                case 4: goto L_0x0075;
                case 5: goto L_0x007d;
                case 6: goto L_0x0085;
                case 7: goto L_0x008d;
                case 8: goto L_0x00ae;
                case 9: goto L_0x00b6;
                case 10: goto L_0x00c2;
                case 11: goto L_0x00ca;
                case 12: goto L_0x00d2;
                case 13: goto L_0x00e8;
                case 14: goto L_0x010a;
                case 15: goto L_0x0118;
                case 16: goto L_0x0730;
                case 17: goto L_0x013f;
                case 18: goto L_0x015f;
                case 19: goto L_0x0181;
                case 20: goto L_0x01ab;
                case 21: goto L_0x01bb;
                case 22: goto L_0x01cb;
                case 23: goto L_0x01d3;
                case 24: goto L_0x0737;
                case 25: goto L_0x01dc;
                case 26: goto L_0x01f2;
                case 27: goto L_0x0246;
                case 28: goto L_0x0405;
                case 29: goto L_0x0441;
                case 30: goto L_0x0449;
                case 31: goto L_0x0458;
                case 32: goto L_0x0471;
                case 33: goto L_0x048c;
                case 34: goto L_0x04f8;
                case 35: goto L_0x0544;
                case 36: goto L_0x054c;
                case 37: goto L_0x0564;
                case 38: goto L_0x05a4;
                case 39: goto L_0x05d7;
                case 40: goto L_0x0632;
                case 41: goto L_0x0645;
                case 42: goto L_0x066c;
                case 43: goto L_0x0679;
                case 44: goto L_0x06ac;
                case 45: goto L_0x06bc;
                case 46: goto L_0x06cc;
                case 47: goto L_0x06dc;
                case 48: goto L_0x06ea;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r10.A00
            X.1i9 r1 = (X.C29021i9) r1
            X.30x r0 = r1.A0G
            X.3fe r3 = r0.A03()
            X.33n r0 = r1.A0E     // Catch:{ all -> 0x0724 }
            r0.A0I()     // Catch:{ all -> 0x0724 }
            r0.A0J()     // Catch:{ all -> 0x0724 }
            r1.A0C()     // Catch:{ all -> 0x0724 }
            goto L_0x070d
        L_0x001c:
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            java.lang.Object r0 = r10.A00
            X.7hI r0 = (X.C156837hI) r0
            android.view.Choreographer$FrameCallback r0 = r0.A02
            goto L_0x0720
        L_0x0028:
            java.lang.Object r2 = r10.A00
            X.7hI r2 = (X.C156837hI) r2
            boolean r0 = r2.A00
            if (r0 == 0) goto L_0x0045
            X.66R r0 = r2.A05
            java.lang.Object r0 = r0.getValue()
            android.os.Handler r0 = (android.os.Handler) r0
            r0.removeCallbacks(r10)
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
            r1.removeFrameCallback(r0)
            return
        L_0x0045:
            r0 = 1
            r2.A01 = r0
            java.util.LinkedList r0 = r2.A04
            java.util.Iterator r1 = r0.iterator()
            X.C162457s7.A0D(r1)
        L_0x0051:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0713
            java.lang.Object r0 = r1.next()
            X.C162457s7.A0D(r0)
            X.AnonymousClass0x9.A1K(r0)
            r1.remove()
            goto L_0x0051
        L_0x0065:
            java.lang.Object r0 = r10.A00
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r0.invoke()
            return
        L_0x006d:
            java.lang.Object r0 = r10.A00
            com.whatsapp.AbstractAppShellDelegate r0 = (com.whatsapp.AbstractAppShellDelegate) r0
            r0.lambda$installAnrDetector$0()
            return
        L_0x0075:
            java.lang.Object r0 = r10.A00
            X.2VW r0 = (X.AnonymousClass2VW) r0
            r0.A00()
            return
        L_0x007d:
            java.lang.Object r0 = r10.A00
            com.whatsapp.AbstractAppShellDelegate r0 = (com.whatsapp.AbstractAppShellDelegate) r0
            r0.lambda$installAnrDetector$2()
            return
        L_0x0085:
            java.lang.Object r0 = r10.A00
            X.2VW r0 = (X.AnonymousClass2VW) r0
            r0.A00()
            return
        L_0x008d:
            java.lang.Object r2 = r10.A00
            X.4Mp r2 = (X.C86974Mp) r2
            com.whatsapp.CodeInputField r1 = r2.A04
            java.lang.String r0 = r1.getCode()
            r1.setCode(r0)
            android.os.Handler r0 = r1.getHandler()
            if (r0 == 0) goto L_0x0723
            java.lang.Runnable r0 = r2.A02
            if (r0 == 0) goto L_0x0723
            android.os.Handler r1 = r1.getHandler()
            java.lang.Runnable r0 = r2.A02
            r1.removeCallbacks(r0)
            return
        L_0x00ae:
            java.lang.Object r0 = r10.A00
            java.util.Set r0 = (java.util.Set) r0
            r0.clear()
            return
        L_0x00b6:
            java.lang.Object r0 = r10.A00
            X.4bs r0 = (X.C89174bs) r0
            X.4eZ r0 = r0.getWaBaseActivity()
            r0.onBackPressed()
            return
        L_0x00c2:
            java.lang.Object r0 = r10.A00
            X.64F r0 = (X.AnonymousClass64F) r0
            r0.BQn()
            return
        L_0x00ca:
            java.lang.Object r0 = r10.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.BjL()
            return
        L_0x00d2:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A06
            r0 = 400(0x190, float:5.6E-43)
            if (r1 != r0) goto L_0x0723
            X.8qC r0 = r2.A1s
            java.lang.Object r0 = r0.get()
            X.3XI r0 = (X.AnonymousClass3XI) r0
            r0.A02()
            return
        L_0x00e8:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A06
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L_0x0723
            X.8qC r0 = r2.A1q
            java.lang.Object r1 = r0.get()
            X.33b r1 = (X.C619933b) r1
            r0 = 1
            r1.A0D(r0)
            X.8qC r0 = r2.A1s
            java.lang.Object r0 = r0.get()
            X.3XI r0 = (X.AnonymousClass3XI) r0
            r0.A03()
            return
        L_0x010a:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            int r1 = r2.A06
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 != r0) goto L_0x0723
            r2.A7R()
            return
        L_0x0118:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            int r0 = r3.A06
            r2 = 600(0x258, float:8.41E-43)
            if (r0 != r2) goto L_0x0723
            java.util.List r0 = com.whatsapp.HomeActivity.A2Z
            boolean r0 = X.AnonymousClass0x7.A1U(r0, r2)
            if (r0 == 0) goto L_0x0723
            X.4Tb r1 = r3.A0l
            int r0 = com.whatsapp.HomeActivity.A0C(r2)
            X.5KQ r1 = r1.A0I(r0)
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0723
            r0 = 0
            r1.A00 = r0
            r3.A7E()
            return
        L_0x013f:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            X.8qC r0 = r1.A1h
            java.lang.Object r0 = r0.get()
            X.0WN r0 = (X.AnonymousClass0WN) r0
            X.8JL r4 = new X.8JL
            r4.<init>(r1)
            X.4FS r3 = r0.A06
            X.7qP r2 = r0.A04
            X.2zM r1 = r0.A05
            X.0Di r0 = new X.0Di
            r0.<init>(r4, r2, r1, r3)
            r0.A05()
            return
        L_0x015f:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            X.2eW r0 = r2.A1B
            int r1 = r0.A00
            r0 = 3
            if (r1 == r0) goto L_0x016d
            r0 = 2
            if (r1 != r0) goto L_0x0723
        L_0x016d:
            X.8qC r0 = r2.A27
            java.lang.Object r0 = r0.get()
            X.30e r0 = (X.C613130e) r0
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x0723
            X.3Wi r1 = r2.A05
            r0 = 31
            goto L_0x0454
        L_0x0181:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            r0 = 2131428125(0x7f0b031d, float:1.8477886E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0723
            android.view.ViewParent r0 = r2.getParent()
            if (r0 == 0) goto L_0x0723
            X.5UY r1 = new X.5UY
            r1.<init>(r2)
            r3.A1K = r1
            r0 = 0
            r1.A06(r0)
            X.5UY r0 = r3.A1K
            android.view.View r1 = r0.A04()
            r0 = 19
            X.C18280x3.A0p(r1, r3, r0)
            return
        L_0x01ab:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.66q r1 = X.AnonymousClass4SG.A2a(r0)
            if (r1 == 0) goto L_0x0723
            X.8s5 r0 = r0.A2S
            r1.Awb(r0)
            return
        L_0x01bb:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.8qC r0 = r0.A1S
            java.lang.Object r0 = r0.get()
            X.5Ts r0 = (X.C105135Ts) r0
            r0.A00()
            return
        L_0x01cb:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            r1.A1E = r0
            return
        L_0x01d3:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            r1.A7q(r0)
            return
        L_0x01dc:
            java.lang.Object r3 = r10.A00
            X.4ea r3 = (X.C89654ea) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoReminder"
            r2.setClassName(r1, r0)
            r0 = 0
            r3.A6T(r2, r0)
            return
        L_0x01f2:
            java.lang.Object r4 = r10.A00
            com.whatsapp.HomeActivity r4 = (com.whatsapp.HomeActivity) r4
            X.8qC r0 = r4.A1e
            java.lang.Object r0 = r0.get()
            X.5Tc r0 = (X.C104985Tc) r0
            boolean r0 = X.C104985Tc.A00(r0)
            if (r0 == 0) goto L_0x0723
            X.8qC r0 = r4.A1e
            java.lang.Object r0 = r0.get()
            X.5Tc r0 = (X.C104985Tc) r0
            X.33p r0 = r0.A01
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r3 = "one_of_create_group_tool_tip_activated"
            r2 = 0
            boolean r1 = r0.getBoolean(r3, r2)
            X.8qC r0 = r4.A1e
            java.lang.Object r0 = r0.get()
            X.5Tc r0 = (X.C104985Tc) r0
            X.33p r0 = r0.A01
            if (r1 == 0) goto L_0x022e
            X.C18270x1.A0v(r0, r3, r2)
        L_0x0228:
            X.5ZE r0 = r4.A04
            r0.A02()
            return
        L_0x022e:
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "create_group_tool_tip_temp_dismissed"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 != 0) goto L_0x0723
            X.8qC r0 = r4.A1e
            java.lang.Object r0 = r0.get()
            X.5Tc r0 = (X.C104985Tc) r0
            r0.A02()
            goto L_0x0228
        L_0x0246:
            java.lang.Object r8 = r10.A00
            com.whatsapp.HomeActivity r8 = (com.whatsapp.HomeActivity) r8
            java.lang.String r0 = "Update nav menu and badges"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            int r0 = r8.A06
            int r7 = com.whatsapp.HomeActivity.A0C(r0)
            r6 = 0
        L_0x0256:
            X.4Tb r1 = r8.A0l
            int r0 = r1.A00
            if (r6 >= r0) goto L_0x0723
            X.5KQ r5 = r1.A0I(r6)
            boolean r4 = X.AnonymousClass000.A1U(r6, r7)
            int r3 = r8.A7L(r6)
            r9 = 200(0xc8, float:2.8E-43)
            if (r3 == r9) goto L_0x0374
            r9 = 300(0x12c, float:4.2E-43)
            if (r3 == r9) goto L_0x0359
            r1 = 400(0x190, float:5.6E-43)
            if (r3 == r1) goto L_0x0309
            r9 = 600(0x258, float:8.41E-43)
            if (r3 != r9) goto L_0x02ac
            X.5Xt r0 = r8.A7D()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0389
            int r0 = r5.A00
            r2 = 0
            boolean r1 = X.AnonymousClass001.A1W(r0)
            boolean r0 = X.C1001059l.A03
            if (r0 == 0) goto L_0x0300
            android.widget.ImageView r0 = r5.A03
            if (r0 == 0) goto L_0x0296
            if (r1 != 0) goto L_0x0293
            r2 = 8
        L_0x0293:
            r0.setVisibility(r2)
        L_0x0296:
            r2 = 2131233987(0x7f080cc3, float:1.8084127E38)
            if (r4 == 0) goto L_0x029e
            r2 = 2131233982(0x7f080cbe, float:1.8084117E38)
        L_0x029e:
            android.content.res.Resources r1 = r8.getResources()
            r0 = 0
            X.0AQ r1 = X.AnonymousClass0AQ.A03(r0, r1, r2)
            android.widget.ImageView r0 = r5.A04
            r0.setImageDrawable(r1)
        L_0x02ac:
            X.5Xt r0 = r8.A7D()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x02d5
            X.5Xt r0 = r8.A09
            X.4P2 r1 = r0.A01
            if (r1 == 0) goto L_0x02d2
            if (r4 == 0) goto L_0x02d2
            X.4Ny r0 = r1.A04
            int r0 = r0.A0A
            if (r0 == r3) goto L_0x02d2
            r0 = 0
            r1.A02 = r0
            r1.A01 = r0
            r1.setSelectedItemId(r3)
            X.8iF r0 = r8.A2M
            r1.A02 = r0
            X.8iE r0 = r8.A2L
            r1.A01 = r0
        L_0x02d2:
            int r6 = r6 + 1
            goto L_0x0256
        L_0x02d5:
            android.view.View r0 = r5.A01
            r0.setSelected(r4)
            boolean r0 = X.C1001059l.A03
            if (r0 != 0) goto L_0x02d2
            android.widget.ImageView r0 = r5.A04
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L_0x02eb
            android.widget.ImageView r0 = r5.A04
            r0.setSelected(r4)
        L_0x02eb:
            android.widget.TextView r2 = r5.A06
            r0 = 2131101244(0x7f06063c, float:1.7814892E38)
            if (r4 == 0) goto L_0x02fc
            r1 = 2130969753(0x7f040499, float:1.7548197E38)
            r0 = 2131101243(0x7f06063b, float:1.781489E38)
            int r0 = X.AnonymousClass5Yj.A02(r8, r1, r0)
        L_0x02fc:
            X.AnonymousClass0x2.A0q(r8, r2, r0)
            goto L_0x02d2
        L_0x0300:
            r2 = 2131233985(0x7f080cc1, float:1.8084123E38)
            if (r1 == 0) goto L_0x029e
            r2 = 2131233986(0x7f080cc2, float:1.8084125E38)
            goto L_0x029e
        L_0x0309:
            X.5Xt r0 = r8.A7D()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x0335
            int r9 = com.whatsapp.HomeActivity.A0C(r1)
            int r0 = X.AnonymousClass4SG.A2J(r8)
            if (r0 <= 0) goto L_0x0328
            X.6jQ r2 = X.C134666jQ.A00
        L_0x031d:
            X.6jS r1 = new X.6jS
            r1.<init>(r2)
        L_0x0322:
            X.5Xt r0 = r8.A09
            r0.A04(r8, r1, r9)
            goto L_0x02ac
        L_0x0328:
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0332
            X.6jP r2 = new X.6jP
            r2.<init>(r0)
            goto L_0x031d
        L_0x0332:
            X.6jT r1 = X.C134696jT.A00
            goto L_0x0322
        L_0x0335:
            int r0 = X.AnonymousClass4SG.A2J(r8)
            r1 = 8
            if (r0 <= 0) goto L_0x039f
            android.widget.TextView r0 = r5.A05
            r0.setVisibility(r1)
            android.widget.ImageView r1 = r5.A04
            r0 = 0
            r1.setVisibility(r0)
            X.0AR r0 = r8.A0Q
            if (r0 == 0) goto L_0x02ac
            boolean r0 = r0.isRunning()
            if (r0 != 0) goto L_0x02ac
            X.0AR r0 = r8.A0Q
            r0.start()
            goto L_0x02ac
        L_0x0359:
            X.5Xt r0 = r8.A7D()
            boolean r0 = r0.A08
            if (r0 != 0) goto L_0x0389
            android.widget.TextView r0 = r5.A05
            r2 = 8
            r0.setVisibility(r2)
            android.widget.ImageView r1 = r5.A04
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x036f
            r2 = 0
        L_0x036f:
            r1.setVisibility(r2)
            goto L_0x02ac
        L_0x0374:
            X.5Xt r0 = r8.A7D()
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x03b3
            int r1 = r5.A00
            if (r1 <= 0) goto L_0x0386
            X.6jP r0 = new X.6jP
            r0.<init>(r1)
            goto L_0x038f
        L_0x0386:
            X.6jT r2 = X.C134696jT.A00
            goto L_0x0394
        L_0x0389:
            int r0 = r5.A00
            if (r0 <= 0) goto L_0x0386
            X.6jR r0 = X.C134676jR.A00
        L_0x038f:
            X.6jS r2 = new X.6jS
            r2.<init>(r0)
        L_0x0394:
            X.5Xt r1 = r8.A09
            int r0 = com.whatsapp.HomeActivity.A0C(r9)
            r1.A04(r8, r2, r0)
            goto L_0x02ac
        L_0x039f:
            android.widget.ImageView r0 = r5.A04
            r0.setVisibility(r1)
            X.0AR r0 = r8.A0Q
            if (r0 == 0) goto L_0x03b3
            boolean r0 = r0.isRunning()
            if (r0 == 0) goto L_0x03b3
            X.0AR r0 = r8.A0Q
            r0.stop()
        L_0x03b3:
            int r0 = r5.A00
            android.widget.TextView r1 = r5.A05
            if (r0 <= 0) goto L_0x03fe
            r0 = 0
            r1.setVisibility(r0)
            android.widget.TextView r9 = r5.A05
            X.33j r0 = r8.A00
            java.text.NumberFormat r2 = r0.A0M()
            int r0 = r5.A00
            long r0 = (long) r0
            X.C86634Kw.A1K(r9, r2, r0)
            r1 = 2130969753(0x7f040499, float:1.7548197E38)
            r0 = 2131101243(0x7f06063b, float:1.781489E38)
            int r1 = X.AnonymousClass5Yj.A02(r8, r1, r0)
            boolean r0 = X.C1001059l.A03
            if (r0 != 0) goto L_0x03de
            if (r4 != 0) goto L_0x03de
            r1 = 2131101244(0x7f06063c, float:1.7814892E38)
        L_0x03de:
            int r0 = X.AnonymousClass0Y8.A04(r8, r1)
            X.4Ln r2 = new X.4Ln
            r2.<init>(r0)
            android.content.res.Resources r1 = r8.getResources()
            r0 = 2131168405(0x7f070c95, float:1.795111E38)
            int r1 = r1.getDimensionPixelSize(r0)
            android.graphics.Rect r0 = r2.A03
            r0.set(r1, r1, r1, r1)
            android.widget.TextView r0 = r5.A05
            r0.setBackground(r2)
            goto L_0x02ac
        L_0x03fe:
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x02ac
        L_0x0405:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 0
            r1.A7b(r0)
            X.66q r3 = X.AnonymousClass4SG.A2a(r1)
            boolean r0 = r3 instanceof com.whatsapp.conversationslist.ConversationsFragment
            if (r0 == 0) goto L_0x0723
            com.whatsapp.conversationslist.ConversationsFragment r3 = (com.whatsapp.conversationslist.ConversationsFragment) r3
            boolean r0 = X.AnonymousClass5N3.A00(r3)
            if (r0 == 0) goto L_0x0723
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0L
            if (r0 == 0) goto L_0x0723
            android.view.View r0 = r3.A08
            if (r0 == 0) goto L_0x0723
            r1 = 0
            r0.setVisibility(r1)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0L
            r0.setVisibility(r1)
            int r2 = r3.A01
            r1 = -1
            if (r2 == r1) goto L_0x0723
            androidx.recyclerview.widget.RecyclerView r0 = r3.A0L
            X.0R6 r0 = r0.A0N
            if (r0 == 0) goto L_0x0723
            X.4Wl r0 = (X.C87874Wl) r0
            r0.A0K(r2)
            r3.A01 = r1
            return
        L_0x0441:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            r0.A7Y()
            return
        L_0x0449:
            java.lang.Object r2 = r10.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            r2.A7S()
            X.3Wi r1 = r2.A05
            r0 = 27
        L_0x0454:
            A00(r1, r2, r0)
            return
        L_0x0458:
            java.lang.Object r2 = r10.A00
            X.4ea r2 = (X.C89654ea) r2
            X.08A r0 = r2.A06
            X.0GC r1 = r0.A02
            X.0GC r0 = X.AnonymousClass0GC.STARTED
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0723
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = new com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment
            r0.<init>()
            r2.Boo(r0)
            return
        L_0x0471:
            java.lang.Object r3 = r10.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.66q r2 = X.AnonymousClass4SG.A2a(r3)
            if (r2 == 0) goto L_0x0723
            X.5ZE r1 = r3.A04
            r0 = r2
            X.66n r0 = (X.C1229666n) r0
            X.C626936e.A06(r0)
            r1.A04(r0)
            X.8s5 r0 = r3.A2S
            r2.Awb(r0)
            return
        L_0x048c:
            java.lang.Object r3 = r10.A00
            X.4uI r3 = (X.C95704uI) r3
            r0 = 2131428122(0x7f0b031a, float:1.847788E38)
            android.view.View r2 = r3.findViewById(r0)
            if (r2 == 0) goto L_0x0723
            X.5SY r0 = r3.A07
            if (r0 == 0) goto L_0x04f1
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0723
            X.5SY r1 = r3.A07
            if (r1 == 0) goto L_0x04ea
            boolean r0 = r1.A01()
            if (r0 == 0) goto L_0x04de
            X.1VX r1 = r1.A01
            r0 = 6540(0x198c, float:9.164E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x04de
            X.5SY r1 = r3.A07
            if (r1 == 0) goto L_0x04e3
            boolean r0 = r1.A03
            if (r0 == 0) goto L_0x04ca
            X.1VX r1 = r1.A01
            r0 = 6541(0x198d, float:9.166E-42)
            boolean r0 = r1.A0X(r0)
            r2 = 1
            if (r0 != 0) goto L_0x04cb
        L_0x04ca:
            r2 = 0
        L_0x04cb:
            android.content.res.Resources r1 = r3.getResources()
            r0 = 2131165437(0x7f0700fd, float:1.7945091E38)
            if (r2 == 0) goto L_0x04d7
            r0 = 2131165438(0x7f0700fe, float:1.7945093E38)
        L_0x04d7:
            int r0 = r1.getDimensionPixelSize(r0)
        L_0x04db:
            r3.A00 = r0
            return
        L_0x04de:
            int r0 = r2.getHeight()
            goto L_0x04db
        L_0x04e3:
            java.lang.String r0 = "bottomNavHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04ea:
            java.lang.String r0 = "bottomNavHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f1:
            java.lang.String r0 = "bottomNavHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f8:
            java.lang.Object r3 = r10.A00
            X.4uI r3 = (X.C95704uI) r3
            android.view.Window r1 = r3.getWindow()
            r0 = 0
            X.AnonymousClass0ID.A00(r1, r0)
            X.4TF r1 = new X.4TF
            r1.<init>()
            r0 = 2131431149(0x7f0b0eed, float:1.848402E38)
            android.view.View r0 = r3.findViewById(r0)
            X.C05820Vc.A01(r0, r1)
            X.AnonymousClass0YZ.A0E(r0, r1)
            android.view.View r2 = r3.A01
            java.util.ArrayList r1 = X.C86614Ku.A0x(r3)
            if (r2 == 0) goto L_0x052a
            r0 = 2131428121(0x7f0b0319, float:1.8477878E38)
            android.view.View r0 = r2.findViewById(r0)
            if (r0 == 0) goto L_0x052a
            r1.add(r2)
        L_0x052a:
            java.util.Iterator r3 = r1.iterator()
        L_0x052e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0723
            android.view.View r2 = X.C86654Ky.A0H(r3)
            if (r2 == 0) goto L_0x052e
            r1 = 1
            X.4TE r0 = new X.4TE
            r0.<init>(r2, r1, r1)
            X.C05820Vc.A01(r2, r0)
            goto L_0x052e
        L_0x0544:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            r0.A7U()
            return
        L_0x054c:
            java.lang.Object r1 = r10.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            java.lang.String r0 = "home/loginFailed companionMode"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.8qC r0 = r1.A1a
            java.lang.Object r3 = r0.get()
            X.2dy r3 = (X.C47872dy) r3
            r2 = 0
            r1 = 1
            r0 = 0
            r3.A01(r2, r0, r1)
            return
        L_0x0564:
            java.lang.Object r0 = r10.A00
            X.6AN r0 = (X.AnonymousClass6AN) r0
            java.lang.Object r1 = r0.A00
            X.4ea r1 = (X.C89654ea) r1
            java.lang.String r0 = "HomeActivity/asyncInitFragment"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.util.Iterator r3 = X.C89654ea.A4M(r1)
        L_0x0575:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0723
            X.0eF r2 = X.AnonymousClass4L0.A0D(r3)
            boolean r0 = r2 instanceof X.C1229966q
            if (r0 == 0) goto L_0x0575
            X.66q r2 = (X.C1229966q) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "HomeActivity/asyncInitFragment fragment id "
            r1.append(r0)
            int r0 = r2.BDV()
            X.C18260x0.A1F(r1, r0)
            boolean r0 = r2.B3Y()
            if (r0 == 0) goto L_0x0575
            java.lang.String r0 = "HomeActivity/asyncInitFragment/isEnabled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            r2.BTn()
            goto L_0x0575
        L_0x05a4:
            java.lang.Object r6 = r10.A00
            com.whatsapp.HomeActivity r6 = (com.whatsapp.HomeActivity) r6
            boolean r0 = r6.A7z()
            if (r0 == 0) goto L_0x0723
            X.1VX r1 = r6.A0D
            X.2zf r0 = r6.A07
            long r2 = X.AnonymousClass35X.A01(r0, r1)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            boolean r1 = X.AnonymousClass001.A1W(r0)
            java.lang.String r0 = "required free space should be > 0"
            X.C626936e.A0D(r1, r0)
            android.content.Intent r1 = X.C627736r.A0D(r6, r2)
            boolean r0 = r6.BHW()
            if (r0 != 0) goto L_0x05d1
            r6.startActivity(r1)
            return
        L_0x05d1:
            java.lang.String r0 = "home/show-low-free-space-on-internal-storage/cannot-start/home-activity-ended"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x05d7:
            java.lang.Object r8 = r10.A00
            X.4ea r8 = (X.C89654ea) r8
            boolean r0 = X.C107385bE.A04()
            r7 = 2131892372(0x7f121894, float:1.941949E38)
            r6 = 2131891313(0x7f121471, float:1.9417343E38)
            r5 = 2131891315(0x7f121473, float:1.9417347E38)
            r4 = 2131232709(0x7f0807c5, float:1.8081535E38)
            r3 = 2131232681(0x7f0807a9, float:1.8081478E38)
            r2 = 2131232794(0x7f08081a, float:1.8081707E38)
            if (r0 == 0) goto L_0x0605
            r7 = 2131891311(0x7f12146f, float:1.9417338E38)
            r6 = 2131891312(0x7f121470, float:1.941734E38)
            r5 = 2131891314(0x7f121472, float:1.9417345E38)
            r4 = 2131231722(0x7f0803ea, float:1.8079533E38)
            r3 = 2131231651(0x7f0803a3, float:1.807939E38)
            r2 = 2131232709(0x7f0807c5, float:1.8081535E38)
        L_0x0605:
            X.2d7 r1 = new X.2d7
            r1.<init>()
            r0 = 2131891317(0x7f121475, float:1.941735E38)
            r1.A08 = r0
            r0 = 2131891316(0x7f121474, float:1.9417349E38)
            r1.A07 = r0
            r0 = 2131232681(0x7f0807a9, float:1.8081478E38)
            r1.A00 = r0
            r1.A01 = r4
            r1.A03 = r3
            r1.A05 = r2
            r1.A02 = r7
            r1.A04 = r6
            r1.A06 = r5
            r0 = 1
            r1.A09 = r0
            com.whatsapp.permissions.NotificationPermissionBottomSheet r1 = r1.A00()
            java.lang.String r0 = "notification_bottomsheet"
            r8.Bon(r1, r0)
            return
        L_0x0632:
            java.lang.Object r0 = r10.A00
            X.4uI r0 = (X.C95704uI) r0
            X.66n r2 = r0.A7C()
            if (r2 == 0) goto L_0x0723
            X.5ZE r1 = r0.A04
            r0 = 0
            r1.A03 = r0
            r1.A04(r2)
            return
        L_0x0645:
            java.lang.Object r0 = r10.A00
            X.67u r0 = (X.C1232767u) r0
            java.lang.Object r1 = r0.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            X.1VX r0 = r1.A0D
            boolean r0 = X.C86634Kw.A1b(r0)
            if (r0 == 0) goto L_0x0668
            X.5UY r0 = r1.A1L
            if (r0 == 0) goto L_0x0668
            X.8qC r0 = r1.A1Q
            r0.get()
            X.5UY r1 = r1.A1L
            r0 = 0
            X.C162457s7.A0J(r1, r0)
            r1.A06(r0)
            return
        L_0x0668:
            r0 = 1
            r1.A2H = r0
            return
        L_0x066c:
            java.lang.Object r0 = r10.A00
            com.whatsapp.IntentChooserBottomSheetDialogFragment r0 = (com.whatsapp.IntentChooserBottomSheetDialogFragment) r0
            X.30V r2 = r0.A06
            r1 = 72
            r0 = 0
            r2.A03(r0, r1)
            return
        L_0x0679:
            java.lang.Object r4 = r10.A00
            X.4Rn r4 = (X.AnonymousClass4Rn) r4
            X.8my r3 = r4.A05
            r1 = r3
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A07 = r0
            android.app.Activity r2 = r4.A03
            int r0 = X.C86604Kt.A02(r2)
            r1 = 1
            if (r0 != r1) goto L_0x06a6
            boolean r0 = r4.A07()
            if (r0 != 0) goto L_0x06a6
            android.content.res.Configuration r0 = X.AnonymousClass001.A0M(r2)
            int r0 = r0.keyboard
            if (r0 != r1) goto L_0x06a6
            java.lang.String r1 = "samsung"
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L_0x0723
        L_0x06a6:
            android.view.View r3 = (android.view.View) r3
            r3.requestLayout()
            return
        L_0x06ac:
            java.lang.Object r2 = r10.A00
            X.8my r2 = (X.C181568my) r2
            r1 = r2
            com.whatsapp.KeyboardPopupLayout r1 = (com.whatsapp.KeyboardPopupLayout) r1
            r0 = 0
            r1.A07 = r0
            android.view.View r2 = (android.view.View) r2
            r2.requestLayout()
            return
        L_0x06bc:
            java.lang.Object r0 = r10.A00
            X.4Rn r0 = (X.AnonymousClass4Rn) r0
            X.8my r3 = r0.A05
            android.view.View r3 = (android.view.View) r3
            java.lang.Runnable r2 = r0.A09
            r0 = 100
            r3.postDelayed(r2, r0)
            return
        L_0x06cc:
            java.lang.Object r0 = r10.A00
            com.whatsapp.Main r0 = (com.whatsapp.Main) r0
            X.8qC r0 = r0.A0G
            java.lang.Object r0 = r0.get()
            X.3DP r0 = (X.AnonymousClass3DP) r0
            r0.A03()
            return
        L_0x06dc:
            java.lang.Object r2 = r10.A00
            X.1t5 r2 = (X.C33451t5) r2
            X.3Go r0 = r2.A01
            X.1in r1 = r0.A0D
            X.2sG r0 = r2.A00
            r1.A06(r0)
            return
        L_0x06ea:
            java.lang.Object r2 = r10.A00
            X.1i9 r2 = (X.C29021i9) r2
            X.30x r0 = r2.A0G
            X.3fe r3 = r0.A03()
            X.33n r1 = r2.A0E     // Catch:{ all -> 0x0724 }
            boolean r0 = r1.A0Y()     // Catch:{ all -> 0x0724 }
            if (r0 == 0) goto L_0x0705
            java.lang.String r0 = "pre key is not yet sent to server; scheduling pre key sending"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0724 }
            r2.A0C()     // Catch:{ all -> 0x0724 }
            goto L_0x070d
        L_0x0705:
            java.lang.String r0 = "no prekeys to send on new axolotl store, generating more keys"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0724 }
            r1.A0J()     // Catch:{ all -> 0x0724 }
        L_0x070d:
            if (r3 == 0) goto L_0x0723
            r3.close()
            return
        L_0x0713:
            r0 = 0
            r2.A01 = r0
            boolean r0 = r2.A00
            if (r0 != 0) goto L_0x0723
            android.view.Choreographer r1 = android.view.Choreographer.getInstance()
            android.view.Choreographer$FrameCallback r0 = r2.A02
        L_0x0720:
            r1.postFrameCallback(r0)
        L_0x0723:
            return
        L_0x0724:
            r1 = move-exception
            if (r3 == 0) goto L_0x072f
            r3.close()     // Catch:{ all -> 0x072b }
            throw r1
        L_0x072b:
            r0 = move-exception
            r1.addSuppressed(r0)
        L_0x072f:
            throw r1
        L_0x0730:
            java.lang.String r0 = "reverse"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0737:
            java.lang.Object r0 = r10.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            X.5rC r0 = r0.A0U
            r0.A04()
            java.lang.String r0 = "getOnboardingActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C117645sG.run():void");
    }

    public C117645sG(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
