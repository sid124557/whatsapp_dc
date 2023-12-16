package X;

import android.view.View;
import com.whatsapp.group.view.custom.GroupDetailsCard;

/* renamed from: X.39q  reason: invalid class name and case insensitive filesystem */
public class C635439q implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C635439q(GroupDetailsCard groupDetailsCard, int i) {
        this.A01 = i;
        switch (i) {
            case 16:
            case 17:
                this.A00 = groupDetailsCard;
                return;
            default:
                this.A00 = groupDetailsCard;
                return;
        }
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnClickListener(new C635439q(obj, i));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:148:0x030a, code lost:
        r3.A0d(r13, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0440, code lost:
        r3.A0S();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0443, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x08a0, code lost:
        if (r0 == false) goto L_0x08a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0925, code lost:
        r0.Bjp();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:384:0x0928, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x010d, code lost:
        r3.BkW(r2, android.net.Uri.parse(r0), (X.C624134x) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0115, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r19) {
        /*
            r18 = this;
            r1 = r18
            int r0 = r1.A01
            r4 = r19
            switch(r0) {
                case 0: goto L_0x04d0;
                case 1: goto L_0x048f;
                case 2: goto L_0x0777;
                case 3: goto L_0x076f;
                case 4: goto L_0x0754;
                case 5: goto L_0x046d;
                case 6: goto L_0x0444;
                case 7: goto L_0x074a;
                case 8: goto L_0x073e;
                case 9: goto L_0x0728;
                case 10: goto L_0x071e;
                case 11: goto L_0x03f9;
                case 12: goto L_0x02ce;
                case 13: goto L_0x0057;
                case 14: goto L_0x02a7;
                case 15: goto L_0x0716;
                case 16: goto L_0x070e;
                case 17: goto L_0x0706;
                case 18: goto L_0x0229;
                case 19: goto L_0x0716;
                case 20: goto L_0x06fe;
                case 21: goto L_0x06ee;
                case 22: goto L_0x06e6;
                case 23: goto L_0x06de;
                case 24: goto L_0x06c2;
                case 25: goto L_0x06fe;
                case 26: goto L_0x01f9;
                case 27: goto L_0x06a2;
                case 28: goto L_0x0648;
                case 29: goto L_0x0144;
                case 30: goto L_0x0116;
                case 31: goto L_0x0640;
                case 32: goto L_0x0009;
                case 33: goto L_0x0630;
                case 34: goto L_0x0009;
                case 35: goto L_0x05cf;
                case 36: goto L_0x00ed;
                case 37: goto L_0x06fe;
                case 38: goto L_0x05c7;
                case 39: goto L_0x00b3;
                case 40: goto L_0x0047;
                case 41: goto L_0x05b8;
                case 42: goto L_0x05af;
                case 43: goto L_0x0574;
                case 44: goto L_0x0716;
                case 45: goto L_0x055a;
                case 46: goto L_0x0092;
                case 47: goto L_0x006b;
                case 48: goto L_0x054a;
                case 49: goto L_0x0514;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r1.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r4 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r4
            X.1ip r0 = r4.A07
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x0506
            r3 = 2131892913(0x7f121ab1, float:1.9420588E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            r0 = 2131888105(0x7f1207e9, float:1.9410836E38)
            java.lang.String r1 = r4.getString(r0)
            r0 = 0
            r2[r0] = r1
            X.2iE r3 = com.whatsapp.LegacyMessageDialogFragment.A00(r2, r3)
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 2131891207(0x7f121407, float:1.9417128E38)
            r3.A05 = r0
            r3.A0B = r1
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 0
            X.4I1 r0 = new X.4I1
            r0.<init>(r1)
            r3.A01(r0, r2)
            androidx.fragment.app.DialogFragment r0 = r3.A00()
            X.C18270x1.A0t(r0, r4)
        L_0x0046:
            return
        L_0x0047:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r0 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r0
            X.4Fm r3 = r0.A02
            if (r3 == 0) goto L_0x05c0
            android.content.Context r2 = r0.A0G()
            java.lang.String r0 = "https://faq.whatsapp.com/"
            goto L_0x010d
        L_0x0057:
            java.lang.Object r13 = r1.A00
            X.00M r13 = (X.AnonymousClass00M) r13
            X.0zH r3 = X.AnonymousClass5V0.A00(r13)
            r0 = 2131894159(0x7f121f8f, float:1.9423115E38)
            X.C19340zH.A01(r13, r3, r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 0
            goto L_0x030a
        L_0x006b:
            java.lang.Object r0 = r1.A00
            com.whatsapp.instrumentation.ui.PermissionsFragment r0 = (com.whatsapp.instrumentation.ui.PermissionsFragment) r0
            X.48F r3 = r0.A03
            if (r3 == 0) goto L_0x0046
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r3 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r3
            java.lang.String r0 = "InstrumentationAuthActivity/nextButtonClicked"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.3Mh r1 = r3.A06
            X.1Ei r0 = X.C66663Mh.A0T
            boolean r0 = r1.A08(r0)
            if (r0 == 0) goto L_0x0782
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0782
            com.whatsapp.deviceauth.BiometricAuthPlugin r0 = r3.A03
            r0.A02()
            return
        L_0x0092:
            java.lang.Object r0 = r1.A00
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = (com.whatsapp.instrumentation.ui.ConfirmFragment) r0
            X.48E r4 = r0.A02
            if (r4 == 0) goto L_0x0046
            com.whatsapp.instrumentation.ui.InstrumentationAuthActivity r4 = (com.whatsapp.instrumentation.ui.InstrumentationAuthActivity) r4
            java.lang.String r0 = "InstrumentationAuthActivity/allowButtonClicked"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            java.lang.String r0 = r4.A0C
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r6 = r4.getCallingPackage()
            X.C626936e.A06(r6)
            X.2eN r8 = r4.A09
            monitor-enter(r8)
            goto L_0x0796
        L_0x00b3:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupport.ui.SupportBkScreenFragment r0 = (com.whatsapp.inappsupport.ui.SupportBkScreenFragment) r0
            X.03q r4 = r0.A0Q()
            if (r4 == 0) goto L_0x0046
            X.4FS r1 = r0.A0A
            if (r1 == 0) goto L_0x08e3
            X.4ea r4 = (X.C89654ea) r4
            X.5WY r5 = r0.A03
            if (r5 == 0) goto L_0x08db
            X.33i r7 = r0.A06
            if (r7 == 0) goto L_0x08d3
            X.2mi r10 = r0.A08
            if (r10 == 0) goto L_0x08cb
            X.5ZR r8 = r0.A07
            if (r8 == 0) goto L_0x08c3
            X.2sl r11 = r0.A09
            if (r11 == 0) goto L_0x08bb
            X.1ip r6 = r0.A05
            if (r6 == 0) goto L_0x08b4
            r13 = 0
            r14 = 1
            java.lang.String r12 = "csf/Bloks_fails_to_load"
            r3 = 0
            X.1tq r2 = new X.1tq
            r9 = r3
            r15 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String[] r0 = new java.lang.String[r13]
            r1.BkL(r2, r0)
            return
        L_0x00ed:
            java.lang.Object r2 = r1.A00
            com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment r2 = (com.whatsapp.inappsupport.ui.ContextualHelpBkScreenFragment) r2
            java.lang.String r1 = r2.A1S()
            if (r1 == 0) goto L_0x0046
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x0046
            X.2nM r0 = r2.A03
            if (r0 == 0) goto L_0x08f2
            java.lang.String r0 = r0.A00(r1)
            X.4Fm r3 = r2.A02
            if (r3 == 0) goto L_0x08eb
            android.content.Context r2 = r2.A0G()
        L_0x010d:
            android.net.Uri r1 = android.net.Uri.parse(r0)
            r0 = 0
            r3.BkW(r2, r1, r0)
            return
        L_0x0116:
            java.lang.Object r1 = r1.A00
            X.4Rx r1 = (X.AnonymousClass4Rx) r1
            r0 = 0
            r1.setRetryLayoutVisibility(r0)
            X.8j5 r1 = r1.A04
            if (r1 == 0) goto L_0x0046
            X.3Pg r1 = (X.C67433Pg) r1
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r3 = r1.A01
            android.net.Uri[] r0 = r3.A0P
            int r2 = r1.A00
            r1 = r0[r2]
            if (r1 == 0) goto L_0x0139
            X.66R r0 = r3.A0Q
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            r0.A0D(r1, r2)
        L_0x0139:
            X.2WS r2 = r3.A74()
            r1 = 0
            r0 = 15
            r2.A00(r0, r1)
            return
        L_0x0144:
            java.lang.Object r3 = r1.A00
            X.4Rx r3 = (X.AnonymousClass4Rx) r3
            r2 = 0
            X.1ZO r1 = new X.1ZO
            r1.<init>()
            java.lang.Integer r0 = X.C18290x4.A0c()
            r1.A01 = r0
            X.4FV r0 = r3.getWamRuntime()
            r0.BhA(r1)
            r3.A00()
            r3.setRetryLayoutVisibility(r2)
            X.8j4 r0 = r3.A03
            if (r0 == 0) goto L_0x0046
            X.3Pf r0 = (X.C67423Pf) r0
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r2 = r0.A01
            android.net.Uri[] r1 = r2.A0P
            int r7 = r0.A00
            r0 = 0
            r1[r7] = r0
            X.66R r5 = r2.A0Q
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.1VX r3 = r0.A0A
            r1 = 4697(0x1259, float:6.582E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r3.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0046
            java.lang.Object r1 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r1 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r1
            if (r7 != 0) goto L_0x01f0
            X.08M r0 = r1.A02
        L_0x018e:
            java.lang.Object r1 = r0.A07()
            X.6jc r0 = X.C134786jc.A00
            boolean r0 = X.C162457s7.A0P(r1, r0)
            java.lang.Object r6 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r6 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r6
            if (r0 == 0) goto L_0x01d5
            X.2cv r0 = r6.A0D
            java.util.HashMap r4 = r0.A00
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)
            boolean r0 = r4.containsKey(r3)
            if (r0 == 0) goto L_0x01bc
            java.lang.Object r1 = r4.get(r3)
            X.3QO r1 = (X.AnonymousClass3QO) r1
            if (r1 == 0) goto L_0x01b9
            r0 = 1
            r1.A03 = r0
        L_0x01b9:
            r4.remove(r3)
        L_0x01bc:
            X.6ja r0 = X.C134766ja.A00
            r6.A0E(r0, r7)
        L_0x01c1:
            java.lang.Object r0 = r5.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r0 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r0
            X.0Wx r0 = r0.A07
            java.lang.Object r0 = r0.A07()
            boolean r0 = X.AnonymousClass0x9.A1Q(r0)
            com.whatsapp.inappbugreporting.InAppBugReportingActivity.A0L(r2, r0)
            return
        L_0x01d5:
            X.7Zc[] r1 = r6.A06
            r0 = 0
            r1[r7] = r0
            if (r7 == 0) goto L_0x01ed
            r0 = 1
            if (r7 == r0) goto L_0x01ea
            r0 = 2
            if (r7 != r0) goto L_0x01c1
            X.08M r1 = r6.A01
        L_0x01e4:
            X.6ja r0 = X.C134766ja.A00
            r1.A0H(r0)
            goto L_0x01c1
        L_0x01ea:
            X.08M r1 = r6.A00
            goto L_0x01e4
        L_0x01ed:
            X.08M r1 = r6.A02
            goto L_0x01e4
        L_0x01f0:
            r0 = 1
            if (r7 != r0) goto L_0x01f6
            X.08M r0 = r1.A00
            goto L_0x018e
        L_0x01f6:
            X.08M r0 = r1.A01
            goto L_0x018e
        L_0x01f9:
            java.lang.Object r3 = r1.A00
            com.whatsapp.identity.ScanQrCodeActivity r3 = (com.whatsapp.identity.ScanQrCodeActivity) r3
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0C
            if (r0 != 0) goto L_0x0209
            java.lang.String r0 = "qrScannerView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0209:
            int r0 = r0.getVisibility()
            if (r0 == 0) goto L_0x0046
            X.5O5 r0 = r3.A05
            if (r0 == 0) goto L_0x092d
            X.5ZR r1 = r0.A01
            java.lang.String r0 = "android.permission.CAMERA"
            int r0 = r1.A02(r0)
            if (r0 != 0) goto L_0x0929
            com.whatsapp.qrcode.QrScannerOverlay r0 = r3.A0B
            if (r0 != 0) goto L_0x08f9
            java.lang.String r0 = "qrScannerOverlay"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0229:
            r3 = 0
            X.C162457s7.A0J(r4, r3)
            java.lang.Object r5 = r1.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r5 = (com.whatsapp.group.view.custom.GroupDetailsCard) r5
            com.whatsapp.group.GroupCallButtonController r2 = r5.A0R
            if (r2 == 0) goto L_0x0046
            X.4sb r1 = r5.A0P
            if (r1 != 0) goto L_0x0241
            java.lang.String r0 = "wamGroupInfo"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0241:
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A02 = r0
            X.58W r0 = r5.A0Q
            if (r0 == 0) goto L_0x0046
            int r1 = r0.ordinal()
            r8 = 1
            r0 = 4
            if (r1 == r0) goto L_0x0284
            r6 = 2
            r0 = 3
            if (r1 == r0) goto L_0x025d
            if (r1 == r8) goto L_0x0968
            if (r1 == r6) goto L_0x0934
            r0 = 5
            if (r1 == r0) goto L_0x0934
            return
        L_0x025d:
            X.3ZF r4 = r2.A08
            X.2i6 r2 = r2.A02
            r3 = 11
            if (r4 == 0) goto L_0x0276
            X.66r r2 = r5.getCallsManager()
            android.content.Context r1 = r5.getContext()
            int r0 = r4.A0H
            if (r0 == r6) goto L_0x0272
            r8 = 0
        L_0x0272:
            r2.BJS(r1, r4, r3, r8)
            return
        L_0x0276:
            if (r2 == 0) goto L_0x0046
            X.66r r1 = r5.getCallsManager()
            android.content.Context r0 = r5.getContext()
            r1.Bpq(r0, r2, r3)
            return
        L_0x0284:
            android.content.Context r0 = r5.getContext()
            boolean r0 = r0 instanceof X.C003203q
            if (r0 == 0) goto L_0x0046
            android.content.Context r1 = r5.getContext()
            java.lang.Class<X.03q> r0 = X.C003203q.class
            android.app.Activity r2 = X.C111095hX.A03(r1, r0)
            X.03q r2 = (X.C003203q) r2
            X.3Ex r3 = r5.getContactManager()
            X.1fJ r4 = r5.A0U
            java.lang.String r0 = "gid"
            if (r4 != 0) goto L_0x096c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x02a7:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            android.os.Bundle r4 = r0.A04
            if (r4 == 0) goto L_0x0046
            X.0O1 r3 = r0.A0m
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupPermissionsActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "setting_values"
            r2.putExtra(r0, r4)
            java.lang.String r1 = "entry_point"
            r0 = 0
            r2.putExtra(r1, r0)
            r3.A01(r2)
            return
        L_0x02ce:
            java.lang.Object r13 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r13 = (com.whatsapp.group.newgroup.NewGroup) r13
            java.util.List r0 = r13.A0e
            java.util.List r8 = X.AnonymousClass3ZH.A09(r0)
            com.whatsapp.WaEditText r0 = r13.A0B
            java.lang.String r7 = X.C18290x4.A0m(r0)
            X.1fJ r1 = r13.A0V
            if (r1 == 0) goto L_0x030f
            X.2so r0 = r13.A0C
            boolean r0 = r0.A0H(r1)
            if (r0 != 0) goto L_0x030f
            X.1VX r0 = r13.A0D
            boolean r1 = X.C56952sp.A0D(r0)
            r0 = 2131890573(0x7f12118d, float:1.9415842E38)
            if (r1 == 0) goto L_0x02f8
            r0 = 2131890574(0x7f12118e, float:1.9415844E38)
        L_0x02f8:
            java.lang.String r0 = r13.getString(r0)
            X.0zH r3 = X.C19340zH.A00(r13, r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 124(0x7c, float:1.74E-43)
            X.4K2 r0 = new X.4K2
            r0.<init>(r13, r1)
        L_0x030a:
            r3.A0d(r13, r0, r2)
            goto L_0x0440
        L_0x030f:
            r0 = 0
            boolean r0 = r13.A7D(r7, r0)
            if (r0 == 0) goto L_0x0046
            boolean r0 = r13.A0f
            r4 = -1
            if (r0 == 0) goto L_0x035b
            java.io.File r0 = r13.A74()
            if (r0 == 0) goto L_0x0359
            android.net.Uri r6 = android.net.Uri.fromFile(r0)
        L_0x0325:
            X.3Lq r0 = r13.A0T
            X.1fK r1 = r0.A05()
            android.content.Intent r5 = X.C18320x8.A07()
            int r3 = r13.A00
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "key_raw_jid"
            X.AnonymousClass0x2.A0v(r2, r1, r0)
            java.lang.String r1 = "key_raw_photo_uri"
            java.lang.String r0 = X.AnonymousClass0x7.A0q(r6)
            r2.putString(r1, r0)
            java.lang.String r0 = "key_group_name"
            r2.putString(r0, r7)
            java.lang.String r0 = "key_ephemeral_duration"
            r2.putInt(r0, r3)
            java.lang.String r0 = "group_created"
            r5.putExtra(r0, r2)
            r13.setResult(r4, r5)
        L_0x0355:
            r13.finish()
            return
        L_0x0359:
            r6 = 0
            goto L_0x0325
        L_0x035b:
            X.3Lq r0 = r13.A0T
            X.1fK r6 = r0.A05()
            X.3Lq r2 = r13.A0T
            r1 = 1
            r0 = 0
            r2.A0N(r6, r8, r1, r0)
            X.1ip r0 = r13.A07
            boolean r0 = r0.A0F()
            if (r0 == 0) goto L_0x03b3
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "newgroup/go create group:"
            X.C18260x0.A1R(r1, r0, r6)
            r0 = 2131888362(0x7f1208ea, float:1.9411357E38)
            r13.Bp9(r0)
            r17 = 22
            X.3cN r12 = new X.3cN
            r14 = r6
            r15 = r8
            r16 = r7
            r12.<init>(r13, r14, r15, r16, r17)
            X.0PJ r0 = X.AnonymousClass0x9.A0G(r6, r12)
            r13.A07 = r0
            X.3Lv r1 = r13.A0M
            X.2sd r5 = r13.A0a
            X.2sH r0 = r13.A06
            long r11 = r0.A0H()
            r9 = 2
            int r10 = r13.A00
            X.1mI r0 = r5.A02(r6, r7, r8, r9, r10, r11)
            r1.A0V(r0)
            X.3Wi r3 = r13.A05
            r0 = 20
            X.3Zm r2 = X.C70003Zm.A00(r13, r0)
            r0 = 10000(0x2710, double:4.9407E-320)
            r3.A0T(r2, r0)
            return
        L_0x03b3:
            java.lang.String r0 = "newgroup/no network access, fail to create group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.3Lv r1 = r13.A0M
            X.2sd r5 = r13.A0a
            X.2sH r0 = r13.A06
            long r11 = r0.A0H()
            r9 = 3
            int r10 = r13.A00
            X.1mI r0 = r5.A02(r6, r7, r8, r9, r10, r11)
            r1.A0V(r0)
            java.io.File r0 = r13.A74()
            if (r0 == 0) goto L_0x03f4
            X.1m3 r1 = r13.A0Z     // Catch:{ IOException -> 0x03ed }
            byte[] r0 = X.C627536m.A0U(r0)     // Catch:{ IOException -> 0x03ed }
            X.2Lq r5 = r1.A0D(r0)     // Catch:{ IOException -> 0x03ed }
            X.3Ex r0 = r13.A0D     // Catch:{ IOException -> 0x03ed }
            X.3ZH r3 = r0.A0A(r6)     // Catch:{ IOException -> 0x03ed }
            X.2pi r2 = r13.A0G     // Catch:{ IOException -> 0x03ed }
            byte[] r1 = r5.A00     // Catch:{ IOException -> 0x03ed }
            byte[] r0 = r5.A01     // Catch:{ IOException -> 0x03ed }
            r2.A01(r3, r1, r0)     // Catch:{ IOException -> 0x03ed }
            goto L_0x03f4
        L_0x03ed:
            r1 = move-exception
            java.lang.String r0 = "newgroup/failed to update photo"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x03f4:
            r13.setResult(r4)
            goto L_0x0355
        L_0x03f9:
            java.lang.Object r4 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r4 = (com.whatsapp.group.newgroup.NewGroup) r4
            com.whatsapp.WaEditText r0 = r4.A0B
            java.lang.String r6 = X.C18290x4.A0m(r0)
            r0 = 1
            boolean r0 = r4.A7D(r6, r0)
            if (r0 == 0) goto L_0x0046
            com.whatsapp.WaEditText r0 = r4.A0A
            android.text.Editable r1 = r0.getText()
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0415
            r1 = r0
        L_0x0415:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r0 = r1.toString()
            java.lang.String r5 = r0.trim()
            X.1ip r0 = r4.A07
            boolean r0 = r0.A0F()
            if (r0 != 0) goto L_0x098e
            java.lang.String r0 = "newgroup/no network access, fail to suggest group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2131890926(0x7f1212ee, float:1.9416558E38)
            java.lang.String r0 = r4.getString(r0)
            X.0zH r3 = X.C19340zH.A00(r4, r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 124(0x7c, float:1.74E-43)
            X.C19340zH.A04(r4, r3, r0, r1)
        L_0x0440:
            r3.A0S()
            return
        L_0x0444:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.ReportGroupPrivacyTipDialogFragment r3 = (com.whatsapp.group.ReportGroupPrivacyTipDialogFragment) r3
            r0 = 2
            r3.A00 = r0
            r3.A1K()
            X.03q r0 = r3.A0R()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r2 = "privacy_groupadd"
            android.content.Intent r1 = X.C627736r.A06(r0)
            java.lang.String r0 = "target_setting"
            r1.putExtra(r0, r2)
            X.03q r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0046
            r0.startActivity(r1)
            return
        L_0x046d:
            java.lang.Object r1 = r1.A00
            com.whatsapp.WaEditText r1 = (com.whatsapp.WaEditText) r1
            r1.requestFocus()
            r1.A06()
            int r0 = r1.getSelectionStart()
            if (r0 <= 0) goto L_0x0483
            int r0 = r1.getSelectionEnd()
            if (r0 > 0) goto L_0x0046
        L_0x0483:
            android.text.Editable r0 = r1.getText()
            int r0 = r0.length()
            r1.setSelection(r0)
            return
        L_0x048f:
            java.lang.Object r2 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r2 = (com.whatsapp.group.GroupChatInfoActivity) r2
            X.4sb r1 = r2.A1K
            if (r1 == 0) goto L_0x049b
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A03 = r0
        L_0x049b:
            X.2sj r1 = r2.A0O
            X.1fJ r0 = r2.A1h
            boolean r0 = r1.A0C(r0)
            if (r0 == 0) goto L_0x0046
            X.2lX r1 = r2.A0P
            X.3ZH r0 = r2.A19
            boolean r0 = r1.A01(r0)
            if (r0 != 0) goto L_0x0046
            X.2lX r1 = r2.A0P
            X.3ZH r0 = r2.A19
            boolean r0 = r1.A00(r0)
            if (r0 != 0) goto L_0x0046
            X.2sj r1 = r2.A0O
            X.1fJ r0 = r2.A1h
            boolean r0 = r1.A0D(r0)
            if (r0 != 0) goto L_0x09ba
            X.3ZH r0 = r2.A19
            boolean r0 = r0.A14
            if (r0 == 0) goto L_0x09ba
            r0 = 2131889326(0x7f120cae, float:1.9413312E38)
            r2.Bot(r0)
            return
        L_0x04d0:
            java.lang.Object r4 = r1.A00
            com.whatsapp.group.GroupChatInfoActivity r4 = (com.whatsapp.group.GroupChatInfoActivity) r4
            X.2eb r1 = r4.A1v
            X.3ZH r0 = r4.A19
            boolean r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0046
            X.2Wy r2 = r4.A1u
            X.1fJ r0 = r4.A7G()
            java.lang.String r1 = r0.getRawString()
            r0 = 0
            r2.A00(r0, r1)
            X.1fJ r3 = r4.A7G()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity"
            X.C627336j.A0E(r2, r3, r1, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            r2.addFlags(r0)
            r4.startActivity(r2)
            return
        L_0x0506:
            X.5Y5 r1 = r4.A0H
            boolean r0 = r1.A03()
            int r0 = X.C18280x3.A00(r0)
            r1.A01(r0)
            return
        L_0x0514:
            java.lang.Object r4 = r1.A00
            com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity r4 = (com.whatsapp.insufficientstoragespace.InsufficientStorageSpaceActivity) r4
            X.33p r1 = r4.A09
            java.lang.String r0 = "insufficient_storage_prompt_timestamp"
            r1.A1Y(r0)
            X.1YO r3 = new X.1YO
            r3.<init>()
            long r0 = r4.A00
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r3.A02 = r1
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r3.A00 = r0
            java.lang.Integer r0 = X.C18280x3.A0S()
            r3.A01 = r0
            java.util.Locale r2 = java.util.Locale.ENGLISH
            java.lang.Object[] r1 = X.AnonymousClass000.A1b(r1)
            java.lang.String r0 = "insufficient-storage-activity/skipped space-required: %,d"
            X.C18320x8.A1J(r0, r2, r1)
            X.4FV r0 = r4.A02
            r0.BhB(r3)
            r4.finish()
            return
        L_0x054a:
            java.lang.Object r2 = r1.A00
            X.4eZ r2 = (X.C89644eZ) r2
            X.5hX r1 = r2.A00
            java.lang.String r0 = "android.settings.INTERNAL_STORAGE_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            r1.A0A(r2, r0)
            return
        L_0x055a:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet r0 = (com.whatsapp.inappsupportai.component.AboutAiSupportAssistantBottomSheet) r0
            X.2nM r2 = r0.A00
            if (r2 == 0) goto L_0x056d
            java.lang.String r1 = "saga-help-article"
            X.03q r0 = r0.A0R()
            r2.A01(r0, r1)
            return
        L_0x056d:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0574:
            java.lang.Object r3 = r1.A00
            com.whatsapp.inappsupport.ui.SupportVideoActivity r3 = (com.whatsapp.inappsupport.ui.SupportVideoActivity) r3
            com.whatsapp.videoplayback.ExoPlaybackControlView r0 = r3.A07
            java.lang.String r2 = "exoPlayerControlView"
            if (r0 != 0) goto L_0x0583
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0583:
            boolean r1 = r0.A0G()
            com.whatsapp.videoplayback.ExoPlaybackControlView r0 = r3.A07
            if (r1 == 0) goto L_0x0596
            if (r0 != 0) goto L_0x0592
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0592:
            r0.A04()
            return
        L_0x0596:
            if (r0 != 0) goto L_0x059d
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x059d:
            r0.A05()
            com.whatsapp.videoplayback.ExoPlaybackControlView r1 = r3.A07
            if (r1 != 0) goto L_0x05a9
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x05a9:
            r0 = 3000(0xbb8, float:4.204E-42)
            r1.A0E(r0)
            return
        L_0x05af:
            java.lang.Object r1 = r1.A00
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r1 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r1
            r0 = 0
            r1.A74(r0)
            return
        L_0x05b8:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupport.ui.SupportTopicsActivity r0 = (com.whatsapp.inappsupport.ui.SupportTopicsActivity) r0
            r0.onBackPressed()
            return
        L_0x05c0:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x05c7:
            java.lang.Object r0 = r1.A00
            android.app.Activity r0 = (android.app.Activity) r0
            X.C18290x4.A18(r0)
            return
        L_0x05cf:
            java.lang.Object r6 = r1.A00
            com.whatsapp.inappsupport.ui.ContactUsWithAiActivity r6 = (com.whatsapp.inappsupport.ui.ContactUsWithAiActivity) r6
            X.1ip r0 = r6.A07
            boolean r0 = r0.A0F()
            r5 = 0
            if (r0 != 0) goto L_0x060d
            java.lang.String r0 = "ContactUsWithAiActivity/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.0zH r3 = X.AnonymousClass5V0.A00(r6)
            r0 = 2131891207(0x7f121407, float:1.9417128E38)
            r3.A0U(r0)
            r0 = 2131890731(0x7f12122b, float:1.9416162E38)
            r3.A0T(r0)
            r0 = 1
            r3.A0i(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 3
            X.4K6 r0 = new X.4K6
            r0.<init>(r1)
            r3.A0d(r6, r0, r2)
            r3.A0S()
            X.2oX r1 = r6.A74()
            r0 = 6
        L_0x0609:
            r1.A01(r0, r5)
            return
        L_0x060d:
            X.66R r0 = r6.A07
            java.lang.Object r4 = r0.getValue()
            com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel r4 = (com.whatsapp.inappsupport.ui.ContactUsWithAiViewModel) r4
            X.38h r3 = r6.A02
            X.08M r1 = r4.A03
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1.A0H(r0)
            X.4FS r2 = r4.A0D
            r1 = 45
            X.3Zx r0 = new X.3Zx
            r0.<init>(r4, r1, r3)
            r2.BkM(r0)
            X.2oX r1 = r6.A74()
            r0 = 2
            goto L_0x0609
        L_0x0630:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r0
            androidx.appcompat.widget.AppCompatCheckBox r1 = r0.A02
            boolean r0 = r1.isChecked()
            r0 = r0 ^ 1
            r1.setChecked(r0)
            return
        L_0x0640:
            java.lang.Object r0 = r1.A00
            com.whatsapp.inappsupport.ui.ContactUsActivity r0 = (com.whatsapp.inappsupport.ui.ContactUsActivity) r0
            r0.onBackPressed()
            return
        L_0x0648:
            java.lang.Object r1 = r1.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r1 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r1
            r7 = 0
            X.33i r0 = r1.A08
            android.view.inputmethod.InputMethodManager r2 = r0.A0Q()
            if (r2 == 0) goto L_0x0668
            android.view.View r0 = r1.getCurrentFocus()
            if (r0 == 0) goto L_0x0668
            android.view.View r0 = r1.getCurrentFocus()
            if (r0 == 0) goto L_0x069c
            android.os.IBinder r0 = r0.getWindowToken()
        L_0x0665:
            r2.hideSoftInputFromWindow(r0, r7)
        L_0x0668:
            X.2sr r0 = r1.A01
            com.whatsapp.Me r0 = X.C56972sr.A00(r0)
            if (r0 == 0) goto L_0x069e
            X.2jE r0 = r1.A09
            boolean r0 = r0.A02()
            if (r0 == 0) goto L_0x069e
            X.66R r0 = r1.A0Q
            java.lang.Object r2 = r0.getValue()
            com.whatsapp.inappbugreporting.InAppBugReportingViewModel r2 = (com.whatsapp.inappbugreporting.InAppBugReportingViewModel) r2
            com.whatsapp.WaEditText r0 = r1.A0A
            if (r0 == 0) goto L_0x069a
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x069a
            java.lang.String r3 = r0.toString()
        L_0x068e:
            java.lang.String r4 = r1.A75()
            android.net.Uri[] r6 = r1.A0P
            java.lang.String r5 = r1.A0N
            r2.A0F(r3, r4, r5, r6, r7)
            return
        L_0x069a:
            r3 = 0
            goto L_0x068e
        L_0x069c:
            r0 = 0
            goto L_0x0665
        L_0x069e:
            r1.A76()
            return
        L_0x06a2:
            java.lang.Object r4 = r1.A00
            com.whatsapp.inappbugreporting.InAppBugReportingActivity r4 = (com.whatsapp.inappbugreporting.InAppBugReportingActivity) r4
            r3 = 0
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.inappbugreporting.BugReportingCategoriesActivity"
            r2.setClassName(r1, r0)
            r0 = 3
            r4.startActivityForResult(r2, r0)
            X.2WS r1 = r4.A74()
            r0 = 21
            r1.A00(r0, r3)
            return
        L_0x06c2:
            java.lang.Object r2 = r1.A00
            com.whatsapp.identity.ScanQrCodeActivity r2 = (com.whatsapp.identity.ScanQrCodeActivity) r2
            com.whatsapp.qrcode.WaQrScannerView r0 = r2.A0C
            java.lang.String r1 = "qrScannerView"
            if (r0 != 0) goto L_0x06d2
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x06d2:
            r0.Bpb()
            com.whatsapp.qrcode.WaQrScannerView r0 = r2.A0C
            if (r0 != 0) goto L_0x0925
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x06de:
            java.lang.Object r0 = r1.A00
            com.whatsapp.identity.ScanQrCodeActivity r0 = (com.whatsapp.identity.ScanQrCodeActivity) r0
            com.whatsapp.identity.ScanQrCodeActivity.A0C(r0)
            return
        L_0x06e6:
            java.lang.Object r0 = r1.A00
            com.whatsapp.identity.IdentityVerificationActivity r0 = (com.whatsapp.identity.IdentityVerificationActivity) r0
            r0.A76()
            return
        L_0x06ee:
            java.lang.Object r2 = r1.A00
            X.4ea r2 = (X.C89654ea) r2
            X.3Wi r1 = r2.A05
            r0 = 26
            X.3Zm r0 = X.C70003Zm.A00(r2, r0)
            r1.A0S(r0)
            return
        L_0x06fe:
            java.lang.Object r0 = r1.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
            return
        L_0x0706:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$2(r0, r4)
            return
        L_0x070e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.view.custom.GroupDetailsCard r0 = (com.whatsapp.group.view.custom.GroupDetailsCard) r0
            com.whatsapp.group.view.custom.GroupDetailsCard.setupClickListeners$lambda$1(r0, r4)
            return
        L_0x0716:
            java.lang.Object r0 = r1.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x071e:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r0 = (com.whatsapp.group.newgroup.NewGroup) r0
            com.whatsapp.WaEditText r0 = r0.A0A
            r0.requestFocus()
            return
        L_0x0728:
            java.lang.Object r3 = r1.A00
            com.whatsapp.group.newgroup.NewGroup r3 = (com.whatsapp.group.newgroup.NewGroup) r3
            X.3ZH r2 = r3.A0p
            com.whatsapp.WaEditText r0 = r3.A0B
            java.lang.String r0 = X.C18290x4.A0m(r0)
            r2.A0P = r0
            X.1m3 r1 = r3.A0Z
            r0 = 12
            r1.A07(r3, r2, r0)
            return
        L_0x073e:
            java.lang.Object r0 = r1.A00
            X.2mI r0 = (X.C52942mI) r0
            X.4GQ r1 = r0.A02
            X.3ZH r0 = r0.A01
            r1.invoke(r0)
            return
        L_0x074a:
            java.lang.Object r0 = r1.A00
            X.2j1 r0 = (X.C50942j1) r0
            X.4GP r0 = r0.A00
            r0.invoke()
            return
        L_0x0754:
            java.lang.Object r0 = r1.A00
            com.whatsapp.group.HistorySettingActivity r0 = (com.whatsapp.group.HistorySettingActivity) r0
            X.66R r0 = r0.A06
            java.lang.Object r0 = r0.getValue()
            com.whatsapp.group.HistorySettingViewModel r0 = (com.whatsapp.group.HistorySettingViewModel) r0
            X.4C6 r3 = X.AnonymousClass0IV.A00(r0)
            r2 = 0
            com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1 r1 = new com.whatsapp.group.HistorySettingViewModel$onEnabledClick$1
            r1.<init>(r0, r2)
            r0 = 3
            X.C616131n.A02(r2, r1, r3, r2, r0)
            return
        L_0x076f:
            java.lang.Object r0 = r1.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.dismiss()
            return
        L_0x0777:
            java.lang.Object r0 = r1.A00
            X.1sn r0 = (X.C33311sn) r0
            com.whatsapp.group.GroupMembersSelector r1 = r0.A00
            r0 = 1
            r1.A7d(r0)
            return
        L_0x0782:
            X.0dc r2 = X.AnonymousClass0x2.A0J(r3)
            r1 = 2131430250(0x7f0b0b6a, float:1.8482196E38)
            com.whatsapp.instrumentation.ui.ConfirmFragment r0 = r3.A05
            r2.A0A(r0, r1)
            r0 = 0
            r2.A0I(r0)
            r2.A01()
            return
        L_0x0796:
            boolean r0 = r8.A01(r6, r0)     // Catch:{ all -> 0x08b1 }
            if (r0 != 0) goto L_0x079f
            monitor-exit(r8)
            r5 = 0
            goto L_0x081a
        L_0x079f:
            X.2yy r12 = r8.A00     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "request/token"
            java.lang.String r2 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "request/token_ts"
            java.lang.String r1 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences r0 = r12.A01()     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = X.C18310x6.A0E(r0, r2)     // Catch:{ all -> 0x08b1 }
            X.C18270x1.A0g(r0, r1)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "auth/encryption_key"
            java.lang.String r1 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences r0 = r12.A01()     // Catch:{ all -> 0x08b1 }
            X.C18270x1.A0n(r0, r1)     // Catch:{ all -> 0x08b1 }
            java.security.SecureRandom r1 = new java.security.SecureRandom     // Catch:{ all -> 0x08b1 }
            r1.<init>()     // Catch:{ all -> 0x08b1 }
            r0 = 16
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x08b1 }
            r1.nextBytes(r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r5 = X.AnonymousClass0x7.A0s(r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "auth/token"
            java.lang.String r11 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "auth/token_ts"
            java.lang.String r10 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "metadata/last_active_time"
            java.lang.String r9 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            X.2sH r0 = r12.A01     // Catch:{ all -> 0x08b1 }
            long r1 = r0.A0H()     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "metadata/last_call_ranking_time"
            java.lang.String r7 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            java.lang.String r0 = "metadata/last_message_ranking_time"
            java.lang.String r6 = X.C60692yy.A00(r6, r0)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences r0 = r12.A01()     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = r0.putString(r11, r5)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r10, r1)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = r0.putLong(r9, r1)     // Catch:{ all -> 0x08b1 }
            android.content.SharedPreferences$Editor r0 = r0.remove(r7)     // Catch:{ all -> 0x08b1 }
            X.C18270x1.A0g(r0, r6)     // Catch:{ all -> 0x08b1 }
            monitor-exit(r8)
        L_0x081a:
            X.2oU r0 = r4.A02
            android.content.Context r0 = r0.A00
            android.content.Context r9 = r0.getApplicationContext()
            java.lang.Class<com.whatsapp.instrumentation.notification.DelayedNotificationReceiver> r10 = com.whatsapp.instrumentation.notification.DelayedNotificationReceiver.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r9, r10)
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r8 = 0
            android.app.PendingIntent r0 = X.C624735e.A01(r9, r8, r1, r0)
            if (r0 == 0) goto L_0x083f
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification already scheduled"
            com.whatsapp.util.Log.d((java.lang.String) r0)
        L_0x0836:
            if (r5 != 0) goto L_0x0881
            r1 = 4
            java.lang.String r0 = "Request is not authorized!"
            r4.A74(r1, r0)
            return
        L_0x083f:
            java.util.Random r0 = X.AnonymousClass0x9.A1C()
            double r0 = r0.nextDouble()
            r6 = 4712059816451768320(0x4164997000000000, double:1.08E7)
            double r0 = r0 * r6
            long r6 = (long) r0
            r0 = 3600000(0x36ee80, double:1.7786363E-317)
            long r6 = r6 + r0
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 + r6
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification whenMillis "
            X.C18260x0.A10(r0, r6, r1)
            X.33i r0 = r4.A08
            android.app.AlarmManager r0 = r0.A07()
            if (r0 == 0) goto L_0x087b
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r9, r10)
            android.app.PendingIntent r6 = X.C624735e.A03(r9, r0, r8)
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification setExact"
            com.whatsapp.util.Log.d((java.lang.String) r0)
            X.2it r0 = r4.A01
            r0.A01(r6, r8, r1)
            goto L_0x0836
        L_0x087b:
            java.lang.String r0 = "InstrumentationAuthActivity/scheduleDelayedNotification AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x0836
        L_0x0881:
            X.2sr r0 = r4.A01
            X.1RR r0 = X.C56972sr.A01(r0)
            if (r0 == 0) goto L_0x08a2
            X.4uZ r0 = X.AnonymousClass3ZH.A01(r0)
            java.lang.String r1 = X.AnonymousClass36P.A04(r0)
            if (r1 == 0) goto L_0x08a2
            X.8qC r0 = X.C619332v.A03
            java.lang.Object r0 = r0.get()
            java.util.regex.Pattern r0 = (java.util.regex.Pattern) r0
            boolean r0 = X.C18280x3.A1X(r1, r0)
            r1 = 1
            if (r0 != 0) goto L_0x08a3
        L_0x08a2:
            r1 = 0
        L_0x08a3:
            java.lang.String r0 = "authorization_token"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "is_test_user"
            r3.putExtra(r0, r1)
            X.AnonymousClass0x2.A0m(r4, r3)
            return
        L_0x08b1:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        L_0x08b4:
            java.lang.String r0 = "connectivityStateProvider"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08bb:
            java.lang.String r0 = "registrationHttpManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08c3:
            java.lang.String r0 = "waPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08cb:
            java.lang.String r0 = "supportGatingUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08d3:
            java.lang.String r0 = "systemServices"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08db:
            java.lang.String r0 = "sendFeedback"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08e3:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08eb:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08f2:
            java.lang.String r0 = "contextualHelpHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x08f9:
            r1 = 0
            r0.setVisibility(r1)
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0C
            java.lang.String r2 = "qrScannerView"
            if (r0 != 0) goto L_0x0909
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0909:
            r0.setVisibility(r1)
            com.whatsapp.WaTextView r1 = r3.A03
            if (r1 != 0) goto L_0x0917
            java.lang.String r0 = "errorIndicatorView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0917:
            r0 = 8
            r1.setVisibility(r0)
            com.whatsapp.qrcode.WaQrScannerView r0 = r3.A0C
            if (r0 != 0) goto L_0x0925
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0925:
            r0.Bjp()
            return
        L_0x0929:
            X.AnonymousClass0x9.A1J(r3)
            return
        L_0x092d:
            java.lang.String r0 = "cameraPermissionsHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0934:
            X.66r r4 = r5.getCallsManager()
            X.3ZH r3 = r5.A0M
            if (r3 != 0) goto L_0x0943
            java.lang.String r0 = "groupChat"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0943:
            X.2sj r2 = r5.getGroupParticipantsManager()
            X.2sr r1 = r5.getMeManager()
            X.3Ex r0 = r5.getContactManager()
            java.util.List r3 = X.AnonymousClass36T.A03(r1, r0, r2, r3)
            android.content.Context r2 = r5.getContext()
            X.1fJ r1 = r5.A0U
            if (r1 != 0) goto L_0x0962
            java.lang.String r0 = "gid"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0962:
            r0 = 10
            r4.BKz(r2, r1, r3, r0)
            return
        L_0x0968:
            r5.A05(r4, r3)
            return
        L_0x096c:
            X.2sj r0 = r5.getGroupParticipantsManager()
            X.2sr r1 = r5.getMeManager()
            X.33k r0 = X.C56892sj.A01(r0, r4)
            X.6aS r0 = r0.A02()
            java.util.ArrayList r5 = X.AnonymousClass002.A0J(r0)
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r1)
            r5.remove(r0)
            r6 = 0
            r7 = 24
            X.C107305b5.A07(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x098e:
            java.lang.String r0 = "newgroup/go suggest group:"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r3 = X.C18320x8.A07()
            android.os.Bundle r2 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_group_name"
            r2.putString(r0, r6)
            X.1fJ r0 = r4.A0V
            java.lang.String r1 = X.C627336j.A07(r0)
            java.lang.String r0 = "extra_parent_group_jid"
            r2.putString(r0, r1)
            java.lang.String r0 = "extra_group_description"
            r2.putString(r0, r5)
            java.lang.String r0 = "group_suggested"
            r3.putExtra(r0, r2)
            X.AnonymousClass0x2.A0m(r4, r3)
            return
        L_0x09ba:
            r0 = 7
            X.C621433s.A01(r2, r0)
            X.2sA r1 = r2.A14
            X.1fJ r0 = r2.A1h
            r1.A03(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C635439q.onClick(android.view.View):void");
    }

    public C635439q(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }
}
