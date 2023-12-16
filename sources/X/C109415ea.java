package X;

import android.view.View;

/* renamed from: X.5ea  reason: invalid class name and case insensitive filesystem */
public class C109415ea implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C109415ea(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0274, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0277, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:0x0548, code lost:
        r1.A0H(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x054b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x056c, code lost:
        if (r1.size() != 0) goto L_0x056e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c9, code lost:
        if (r1 == false) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        r1.A05(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onClick(android.view.View r12) {
        /*
            r11 = this;
            int r0 = r11.A01
            switch(r0) {
                case 0: goto L_0x054c;
                case 1: goto L_0x0011;
                case 2: goto L_0x0047;
                case 3: goto L_0x058e;
                case 4: goto L_0x0086;
                case 5: goto L_0x009e;
                case 6: goto L_0x018a;
                case 7: goto L_0x00b2;
                case 8: goto L_0x0010;
                case 9: goto L_0x0192;
                case 10: goto L_0x0192;
                case 11: goto L_0x019c;
                case 12: goto L_0x0270;
                case 13: goto L_0x01a8;
                case 14: goto L_0x00e7;
                case 15: goto L_0x0005;
                case 16: goto L_0x0005;
                case 17: goto L_0x01ed;
                case 18: goto L_0x0203;
                case 19: goto L_0x021c;
                case 20: goto L_0x0230;
                case 21: goto L_0x0250;
                case 22: goto L_0x025a;
                case 23: goto L_0x00f3;
                case 24: goto L_0x0263;
                case 25: goto L_0x0270;
                case 26: goto L_0x0278;
                case 27: goto L_0x0292;
                case 28: goto L_0x030a;
                case 29: goto L_0x032b;
                case 30: goto L_0x0391;
                case 31: goto L_0x03a8;
                case 32: goto L_0x03b1;
                case 33: goto L_0x040e;
                case 34: goto L_0x0416;
                case 35: goto L_0x0428;
                case 36: goto L_0x0447;
                case 37: goto L_0x04b3;
                case 38: goto L_0x04bb;
                case 39: goto L_0x04c3;
                case 40: goto L_0x04cb;
                case 41: goto L_0x04d3;
                case 42: goto L_0x04db;
                case 43: goto L_0x0103;
                case 44: goto L_0x013f;
                case 45: goto L_0x04e3;
                case 46: goto L_0x04f8;
                case 47: goto L_0x050e;
                case 48: goto L_0x052c;
                case 49: goto L_0x0169;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r11.A00
            X.5ZF r0 = (X.AnonymousClass5ZF) r0
            android.view.View r1 = r0.A0D
            r0 = 8
            r1.setVisibility(r0)
        L_0x0010:
            return
        L_0x0011:
            java.lang.Object r5 = r11.A00
            X.4SH r5 = (X.AnonymousClass4SH) r5
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.isShowing()
            if (r0 == 0) goto L_0x0010
            boolean r0 = r5.A08
            if (r0 != 0) goto L_0x003f
            android.content.Context r4 = r5.getContext()
            r3 = 1
            int[] r2 = new int[r3]
            r1 = 16843611(0x101035b, float:2.3695965E-38)
            r0 = 0
            r2[r0] = r1
            android.content.res.TypedArray r1 = r4.obtainStyledAttributes(r2)
            boolean r0 = r1.getBoolean(r0, r3)
            r5.A07 = r0
            r1.recycle()
            r5.A08 = r3
        L_0x003f:
            boolean r0 = r5.A07
            if (r0 == 0) goto L_0x0010
            r5.cancel()
            return
        L_0x0047:
            java.lang.Object r6 = r11.A00
            com.google.android.material.datepicker.MaterialCalendar r6 = (com.google.android.material.datepicker.MaterialCalendar) r6
            X.6vL r2 = r6.A09
            X.6vL r1 = X.C141296vL.YEAR
            X.6vL r0 = X.C141296vL.DAY
            if (r2 != r1) goto L_0x0061
            r6.A09 = r0
            r1 = 8
            r0 = 0
            X.C86644Kx.A1I(r6, r1, r0)
            X.5rI r0 = r6.A0A
            r6.A1H(r0)
            return
        L_0x0061:
            if (r2 != r0) goto L_0x0010
            r6.A09 = r1
            r5 = 8
            r4 = 0
            androidx.recyclerview.widget.RecyclerView r0 = r6.A06
            X.0Xs r3 = r0.getLayoutManager()
            X.0R6 r2 = r0.A0N
            X.4WH r2 = (X.AnonymousClass4WH) r2
            X.5rI r0 = r6.A0A
            int r1 = r0.A04
            com.google.android.material.datepicker.MaterialCalendar r0 = r2.A00
            X.5dI r0 = r0.A07
            X.5rI r0 = r0.A06
            int r0 = r0.A04
            int r1 = r1 - r0
            r3.A0Z(r1)
            X.C86644Kx.A1I(r6, r4, r5)
            return
        L_0x0086:
            X.4PF r12 = (X.AnonymousClass4PF) r12
            X.0d1 r3 = r12.A0H
            java.lang.Object r0 = r11.A00
            X.4Ny r0 = (X.C87084Ny) r0
            X.0cz r2 = r0.A0H
            X.5g8 r1 = r0.A0I
            r0 = 0
            boolean r0 = r2.A0L(r3, r1, r0)
            if (r0 != 0) goto L_0x0010
            r0 = 1
            r3.setChecked(r0)
            return
        L_0x009e:
            java.lang.Object r1 = r11.A00
            X.6ZQ r1 = (X.AnonymousClass6ZQ) r1
            android.widget.EditText r0 = r1.A02
            if (r0 == 0) goto L_0x0010
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x00af
            r0.clear()
        L_0x00af:
            X.6Ff r1 = r1.A02
            goto L_0x00dd
        L_0x00b2:
            java.lang.Object r3 = r11.A00
            X.4ag r3 = (X.C88724ag) r3
            android.widget.EditText r0 = r3.A01
            if (r0 == 0) goto L_0x0010
            int r2 = r0.getSelectionEnd()
            android.widget.EditText r0 = r3.A01
            if (r0 == 0) goto L_0x00cb
            android.text.method.TransformationMethod r0 = r0.getTransformationMethod()
            boolean r1 = r0 instanceof android.text.method.PasswordTransformationMethod
            r0 = 1
            if (r1 != 0) goto L_0x00cc
        L_0x00cb:
            r0 = 0
        L_0x00cc:
            android.widget.EditText r1 = r3.A01
            if (r0 == 0) goto L_0x00e2
            r0 = 0
        L_0x00d1:
            r1.setTransformationMethod(r0)
            if (r2 < 0) goto L_0x00db
            android.widget.EditText r0 = r3.A01
            r0.setSelection(r2)
        L_0x00db:
            X.6Ff r1 = r3.A02
        L_0x00dd:
            r0 = 0
            r1.A05(r0)
            return
        L_0x00e2:
            android.text.method.PasswordTransformationMethod r0 = android.text.method.PasswordTransformationMethod.getInstance()
            goto L_0x00d1
        L_0x00e7:
            java.lang.Object r0 = r11.A00
            X.5ZF r0 = (X.AnonymousClass5ZF) r0
            X.4CE r0 = r0.A02
            if (r0 == 0) goto L_0x0010
            r0.BNH()
            return
        L_0x00f3:
            java.lang.Object r1 = r11.A00
            com.whatsapp.WaButtonWithLoader r1 = (com.whatsapp.WaButtonWithLoader) r1
            boolean r0 = r1.A06
            if (r0 != 0) goto L_0x0010
            android.view.View$OnClickListener r0 = r1.A00
            if (r0 == 0) goto L_0x0010
            r0.onClick(r1)
            return
        L_0x0103:
            java.lang.Object r0 = r11.A00
            X.4PG r0 = (X.AnonymousClass4PG) r0
            X.5Og r4 = r0.getViewModel()
            X.0Wx r1 = r4.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"
            X.C162457s7.A0K(r1, r0)
            r0 = 8
            X.C06270Wx.A04(r1, r0)
            X.4uZ r3 = r4.A00
            if (r3 == 0) goto L_0x0010
            X.2Wf r1 = r4.A05
            r0 = 7
            r1.A00(r0)
            X.4FS r2 = r4.A07
            r0 = 25
            X.C117165rU.A00(r2, r4, r3, r0)
            X.4uZ r1 = r4.A00
            if (r1 == 0) goto L_0x0131
            r0 = 24
            X.C117165rU.A00(r2, r4, r1, r0)
        L_0x0131:
            X.0Wx r1 = r4.A01
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.util.SingleLiveEvent<kotlin.Int>"
            X.C162457s7.A0K(r1, r0)
            r0 = 2131890049(0x7f120f81, float:1.9414779E38)
            X.C06270Wx.A04(r1, r0)
            return
        L_0x013f:
            java.lang.Object r0 = r11.A00
            X.4PG r0 = (X.AnonymousClass4PG) r0
            X.5Og r3 = r0.getViewModel()
            X.0Wx r1 = r3.A02
            java.lang.String r0 = "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"
            X.C162457s7.A0K(r1, r0)
            r0 = 8
            X.C06270Wx.A04(r1, r0)
            X.4uZ r0 = r3.A00
            if (r0 == 0) goto L_0x0010
            X.2Wf r1 = r3.A05
            r0 = 5
            r1.A00(r0)
            X.4uZ r2 = r3.A00
            if (r2 == 0) goto L_0x0010
            X.4FS r1 = r3.A07
            r0 = 24
            X.C117165rU.A00(r1, r3, r2, r0)
            return
        L_0x0169:
            java.lang.Object r3 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r3 = (com.whatsapp.avatar.home.AvatarHomeActivity) r3
            com.whatsapp.bottomsheet.LockableBottomSheetBehavior r2 = r3.A0G
            if (r2 == 0) goto L_0x0010
            int r1 = r2.A0O
            r0 = 5
            if (r1 != r0) goto L_0x05a0
            r0 = 4
            r2.A0S(r0)
            X.C107405bG.A03(r3)
            X.C107405bG.A04(r3)
            X.0R8 r0 = r3.getSupportActionBar()
            if (r0 == 0) goto L_0x0010
            r0.A07()
            return
        L_0x018a:
            java.lang.Object r0 = r11.A00
            X.6ZR r0 = (X.AnonymousClass6ZR) r0
            r0.A09()
            return
        L_0x0192:
            java.lang.Object r1 = r11.A00
            X.03E r1 = (X.AnonymousClass03E) r1
            int r0 = r1.A01
            r1.A01(r0)
            return
        L_0x019c:
            java.lang.Object r1 = r11.A00
            android.widget.EditText r1 = (android.widget.EditText) r1
            int r0 = X.C86624Kv.A03(r1)
            r1.setSelection(r0)
            return
        L_0x01a8:
            java.lang.Object r3 = r11.A00
            com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment r3 = (com.whatsapp.DisplayExceptionDialogFactory$LoginFailedDialogFragment) r3
            java.lang.String r0 = "LoginFailedDialogFragment/onCreateDialog/remove current account"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.03q r4 = r3.A0R()
            X.30z r0 = r3.A05
            X.2nq r0 = r0.A01()
            if (r0 != 0) goto L_0x01d5
            r2 = 0
            X.33p r0 = r3.A08
            int r1 = r0.A0C()
            X.2og r0 = r3.A09
            java.lang.String r0 = r0.A02()
            android.content.Intent r0 = X.C627736r.A11(r4, r2, r0, r1)
        L_0x01ce:
            r4.startActivity(r0)
            X.C05680Um.A00(r4)
            return
        L_0x01d5:
            r5 = 0
            X.33p r0 = r3.A08
            int r7 = r0.A0C()
            r8 = 10
            long r9 = android.os.SystemClock.elapsedRealtime()
            X.2og r0 = r3.A09
            java.lang.String r6 = r0.A02()
            android.content.Intent r0 = X.C627736r.A13(r4, r5, r6, r7, r8, r9)
            goto L_0x01ce
        L_0x01ed:
            java.lang.Object r0 = r11.A00
            X.4LB r0 = (X.AnonymousClass4LB) r0
            android.app.Activity r1 = r0.A01
            java.lang.String r0 = "android.settings.DATE_SETTINGS"
            X.C86654Ky.A0v(r1, r0)
            r1.finish()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return
        L_0x0203:
            java.lang.Object r2 = r11.A00
            X.4LB r2 = (X.AnonymousClass4LB) r2
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            java.lang.String r0 = X.C58152un.A05
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.setData(r0)
            android.app.Activity r0 = r2.A01
            r0.startActivity(r1)
            goto L_0x0274
        L_0x021c:
            java.lang.Object r3 = r11.A00
            com.whatsapp.HomeActivity r3 = (com.whatsapp.HomeActivity) r3
            X.5SY r0 = r3.A07
            X.33p r2 = r0.A00
            java.lang.String r1 = "bottom_nav_tooltip_seen"
            r0 = 1
            X.C18270x1.A0v(r2, r1, r0)
            X.5UY r0 = r3.A1K
            X.C86644Kx.A1P(r0)
            return
        L_0x0230:
            java.lang.Object r2 = r11.A00
            com.whatsapp.HomeActivity r2 = (com.whatsapp.HomeActivity) r2
            android.content.Intent r1 = X.C86634Kw.A0C(r2)
            X.8qC r0 = r2.A1e
            java.lang.Object r0 = r0.get()
            X.5Tc r0 = (X.C104985Tc) r0
            boolean r0 = X.C104985Tc.A00(r0)
            if (r0 == 0) goto L_0x024c
            r0 = 28
            r2.startActivityForResult(r1, r0)
            return
        L_0x024c:
            r2.startActivity(r1)
            return
        L_0x0250:
            java.lang.Object r0 = r11.A00
            com.whatsapp.HomeActivity r0 = (com.whatsapp.HomeActivity) r0
            com.whatsapp.CircleWaImageView r0 = r0.A0g
            r0.callOnClick()
            return
        L_0x025a:
            java.lang.Object r1 = r11.A00
            com.whatsapp.HomeActivity r1 = (com.whatsapp.HomeActivity) r1
            r0 = 1
            r1.A7q(r0)
            return
        L_0x0263:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "acceptlink/confirmation/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r1.finish()
            return
        L_0x0270:
            java.lang.Object r0 = r11.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0274:
            r0.finish()
            return
        L_0x0278:
            java.lang.Object r3 = r11.A00
            android.content.Context r3 = (android.content.Context) r3
            java.lang.String r0 = "delete-account/changenumber"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.ChangeNumberOverview"
            r2.setClassName(r1, r0)
            r3.startActivity(r2)
            return
        L_0x0292:
            java.lang.Object r4 = r11.A00
            com.whatsapp.account.delete.DeleteAccountConfirmation r4 = (com.whatsapp.account.delete.DeleteAccountConfirmation) r4
            boolean r0 = X.AnonymousClass4SG.A40(r4)
            if (r0 != 0) goto L_0x02a6
            java.lang.String r0 = "DeleteAccountConfirmation/no-connectivity"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 2
            X.C621433s.A01(r4, r0)
            return
        L_0x02a6:
            r0 = 1
            X.C621433s.A01(r4, r0)
            android.os.Handler r3 = r4.A01
            r2 = 0
            r0 = 60000(0xea60, double:2.9644E-319)
            r3.sendEmptyMessageDelayed(r2, r0)
            X.33S r2 = r4.A0B
            X.33j r0 = r4.A00
            java.lang.String r8 = r0.A07()
            X.33j r0 = r4.A00
            java.lang.String r7 = r0.A06()
            android.content.Intent r1 = r4.getIntent()
            java.lang.String r0 = "additionalComments"
            java.lang.String r6 = r1.getStringExtra(r0)
            android.content.Intent r0 = r4.getIntent()
            java.lang.String r5 = "deleteReason"
            int r4 = X.C86664Kz.A07(r0, r5)
            java.lang.String r0 = "sendmethods/sendremoveaccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.31C r3 = r2.A04
            r2 = 0
            r1 = 27
            r0 = 0
            android.os.Message r2 = android.os.Message.obtain(r0, r2, r1, r2)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lg"
            r1.putString(r0, r8)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "lc"
            r1.putString(r0, r7)
            android.os.Bundle r1 = r2.getData()
            java.lang.String r0 = "userFeedback"
            r1.putString(r0, r6)
            android.os.Bundle r0 = r2.getData()
            r0.putInt(r5, r4)
            r3.A0J(r2)
            return
        L_0x030a:
            java.lang.Object r2 = r11.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r2 = (com.whatsapp.account.delete.DeleteAccountFeedback) r2
            android.widget.EditText r0 = r2.A03
            r0.clearFocus()
            android.view.View r0 = r2.getCurrentFocus()
            if (r0 == 0) goto L_0x0322
            X.5Wv r1 = r2.A0B
            android.view.View r0 = r2.getCurrentFocus()
            r1.A02(r0)
        L_0x0322:
            r0 = 1
            r2.A07 = r0
            X.0Th r0 = r2.A05
            r0.A00()
            return
        L_0x032b:
            java.lang.Object r5 = r11.A00
            com.whatsapp.account.delete.DeleteAccountFeedback r5 = (com.whatsapp.account.delete.DeleteAccountFeedback) r5
            android.widget.EditText r0 = r5.A03
            int r0 = X.C86624Kv.A03(r0)
            if (r0 <= 0) goto L_0x034a
            android.widget.EditText r0 = r5.A03
            int r1 = X.C86624Kv.A03(r0)
            r0 = 5
            if (r1 >= r0) goto L_0x034a
            X.3Wi r2 = r5.A05
            r1 = 2131888586(0x7f1209ca, float:1.9411812E38)
            r0 = 0
            r2.A0H(r1, r0)
            return
        L_0x034a:
            int r4 = r5.A01
            r1 = 1
            android.widget.EditText r0 = r5.A03
            if (r4 != r1) goto L_0x0372
            java.lang.String r4 = X.C18290x4.A0m(r0)
            r3 = 1
            com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment r2 = new com.whatsapp.account.delete.DeleteAccountFeedback$ChangeNumberMessageDialogFragment
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "deleteReason"
            r1.putInt(r0, r3)
            java.lang.String r0 = "additionalComments"
            r1.putString(r0, r4)
            r2.A0u(r1)
            r5.A06 = r2
            X.C18270x1.A0t(r2, r5)
            return
        L_0x0372:
            java.lang.String r3 = X.C18290x4.A0m(r0)
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r5.getPackageName()
            java.lang.String r0 = "com.whatsapp.account.delete.DeleteAccountConfirmation"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "deleteReason"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "additionalComments"
            r2.putExtra(r0, r3)
            r5.startActivity(r2)
            return
        L_0x0391:
            java.lang.Object r4 = r11.A00
            X.4eZ r4 = (X.C89644eZ) r4
            X.5hX r3 = r4.A00
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r4.getPackageName()
            java.lang.String r0 = "com.whatsapp.backup.google.SettingsGoogleDrive"
            r2.setClassName(r1, r0)
            r3.A0A(r4, r2)
            return
        L_0x03a8:
            java.lang.Object r1 = r11.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 1
            X.C621433s.A01(r1, r0)
            return
        L_0x03b1:
            java.lang.Object r4 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet r4 = (com.whatsapp.accountswitching.ui.AccountSwitchingBottomSheet) r4
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAddAccount/add account tapped"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.5XC r2 = r4.A09
            if (r2 == 0) goto L_0x0407
            int r1 = r4.A00
            r0 = 3
            r2.A00(r1, r0)
            X.33p r0 = r4.A0D
            if (r0 == 0) goto L_0x0400
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)
            java.lang.String r0 = "c2dm_reg_id"
            java.lang.String r3 = X.C18280x3.A0Z(r1, r0)
            if (r3 != 0) goto L_0x03e1
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAddAccount/pushId is null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r0 = X.C18290x4.A0F(r12)
            r4.A1b(r0)
            return
        L_0x03e1:
            java.lang.String r0 = "AccountSwitchingBottomSheet/setupAddAccount/pushId is not null"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            android.content.Context r2 = X.C18290x4.A0F(r12)
            java.lang.String r0 = "AccountSwitchingBottomSheet/updatePushConfigForCurrentAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r4.A0I
            if (r1 == 0) goto L_0x03f9
            r0 = 8
            X.C117715sN.A00(r1, r4, r2, r3, r0)
            return
        L_0x03f9:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0400:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0407:
            java.lang.String r0 = "accountSwitchingLogger"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x040e:
            java.lang.Object r0 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r0 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r0
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment.A00(r0)
            return
        L_0x0416:
            java.lang.Object r3 = r11.A00
            com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment r3 = (com.whatsapp.accountswitching.ui.AccountSwitchingNotAvailableFragment) r3
            X.5XC r2 = r3.A1Y()
            r1 = 7
            r0 = 21
            r2.A00(r1, r0)
            r3.A1L()
            return
        L_0x0428:
            java.lang.Object r2 = r11.A00
            com.whatsapp.audiopicker.AudioPickerActivity r2 = (com.whatsapp.audiopicker.AudioPickerActivity) r2
            android.widget.RelativeLayout r1 = r2.A05
            r0 = 8
            r1.setVisibility(r0)
            java.util.LinkedHashMap r0 = r2.A0R
            boolean r0 = r0.isEmpty()
            r1 = 1
            if (r0 != 0) goto L_0x0441
            android.widget.ImageButton r0 = r2.A03
            X.AnonymousClass5VQ.A01(r0, r1, r1)
        L_0x0441:
            X.5Ub r0 = r2.A0K
            r0.A01(r1)
            return
        L_0x0447:
            java.lang.Object r5 = r11.A00
            com.whatsapp.audiopicker.AudioPickerActivity r5 = (com.whatsapp.audiopicker.AudioPickerActivity) r5
            X.5ZU r1 = r5.A0C
            X.3ZH r0 = r5.A0I
            java.lang.String r8 = r1.A0H(r0)
            java.util.LinkedHashMap r0 = r5.A0R
            int r10 = r0.size()
            r7 = 0
            r9 = 2
            r6 = 1
            if (r10 != r6) goto L_0x0496
            java.util.Iterator r0 = X.C18290x4.A10(r0)
            java.lang.Object r0 = r0.next()
            X.5Kq r0 = (X.C102885Kq) r0
            java.lang.String r2 = r0.A07
            X.3ZH r0 = r5.A0I
            boolean r0 = r0.A0U()
            r1 = 2131888098(0x7f1207e2, float:1.9410822E38)
            if (r0 == 0) goto L_0x0478
            r1 = 2131889799(0x7f120e87, float:1.9414272E38)
        L_0x0478:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r7] = r2
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r8, r0, r6, r1)
        L_0x0480:
            X.0zH r2 = X.AnonymousClass5V0.A00(r5)
            r2.A0g(r0)
            r1 = 2131893474(0x7f121ce2, float:1.9421726E38)
            r0 = 8
            X.C1235268t.A03(r2, r5, r0, r1)
            X.C19340zH.A05(r2)
            X.C18280x3.A0q(r2)
            return
        L_0x0496:
            X.33j r4 = r5.A00
            X.3ZH r0 = r5.A0I
            boolean r0 = r0.A0U()
            r3 = 2131755051(0x7f10002b, float:1.914097E38)
            if (r0 == 0) goto L_0x04a6
            r3 = 2131755139(0x7f100083, float:1.9141149E38)
        L_0x04a6:
            long r1 = (long) r10
            java.lang.Object[] r0 = new java.lang.Object[r9]
            X.AnonymousClass000.A1P(r0, r10, r7)
            r0[r6] = r8
            java.lang.String r0 = r4.A0L(r0, r3, r1)
            goto L_0x0480
        L_0x04b3:
            java.lang.Object r0 = r11.A00
            X.5UB r0 = (X.AnonymousClass5UB) r0
            r0.A02(r12)
            return
        L_0x04bb:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0L(r0)
            return
        L_0x04c3:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthSettingsActivity r0 = (com.whatsapp.authentication.AppAuthSettingsActivity) r0
            com.whatsapp.authentication.AppAuthSettingsActivity.A0C(r0)
            return
        L_0x04cb:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.AppAuthenticationActivity r0 = (com.whatsapp.authentication.AppAuthenticationActivity) r0
            com.whatsapp.authentication.AppAuthenticationActivity.A0L(r0)
            return
        L_0x04d3:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            com.whatsapp.authentication.FingerprintBottomSheet.A02(r0)
            return
        L_0x04db:
            java.lang.Object r0 = r11.A00
            com.whatsapp.authentication.FingerprintBottomSheet r0 = (com.whatsapp.authentication.FingerprintBottomSheet) r0
            r0.A1L()
            return
        L_0x04e3:
            java.lang.Object r2 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r2 = (com.whatsapp.avatar.home.AvatarHomeActivity) r2
            X.4Fm r1 = r2.A0A
            if (r1 == 0) goto L_0x04f1
            java.lang.String r0 = "https://faq.whatsapp.com/general/account-and-profile/how-to-use-avatars-on-whatsapp/"
            X.C86604Kt.A12(r2, r1, r0)
            return
        L_0x04f1:
            java.lang.String r0 = "linkLauncher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x04f8:
            java.lang.Object r0 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r0 = (com.whatsapp.avatar.home.AvatarHomeActivity) r0
            X.66R r0 = r0.A0L
            java.lang.Object r1 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r1 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r1
            java.lang.String r0 = "AvatarHomeViewModel/onBrowserStickersClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4UC r1 = r1.A05
            X.6eb r0 = X.C132046eb.A00
            goto L_0x0548
        L_0x050e:
            java.lang.Object r0 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r0 = (com.whatsapp.avatar.home.AvatarHomeActivity) r0
            X.66R r0 = r0.A0L
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r3
            java.lang.String r0 = "AvatarHomeViewModel/onCreateProfilePhotoClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2r2 r2 = r3.A04
            r1 = 0
            r0 = 18
            r2.A03(r1, r0)
            X.4UC r1 = r3.A05
            X.6ea r0 = X.C132036ea.A00
            goto L_0x0548
        L_0x052c:
            java.lang.Object r0 = r11.A00
            com.whatsapp.avatar.home.AvatarHomeActivity r0 = (com.whatsapp.avatar.home.AvatarHomeActivity) r0
            X.66R r0 = r0.A0L
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.avatar.home.AvatarHomeViewModel r3 = (com.whatsapp.avatar.home.AvatarHomeViewModel) r3
            java.lang.String r0 = "onDeleteAvatarClicked"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2r2 r2 = r3.A04
            r1 = 0
            r0 = 6
            r2.A03(r1, r0)
            X.4UC r1 = r3.A05
            X.6ec r0 = X.C132056ec.A00
        L_0x0548:
            r1.A0H(r0)
            return
        L_0x054c:
            java.lang.Object r3 = r11.A00
            com.google.android.exoplayer2.ui.TrackSelectionView r3 = (com.google.android.exoplayer2.ui.TrackSelectionView) r3
            android.widget.CheckedTextView r2 = r3.A08
            if (r12 != r2) goto L_0x0579
            r1 = 1
        L_0x0555:
            r3.A04 = r1
            android.util.SparseArray r1 = r3.A05
            r1.clear()
            boolean r0 = r3.A04
            r2.setChecked(r0)
            android.widget.CheckedTextView r2 = r3.A07
            boolean r0 = r3.A04
            if (r0 != 0) goto L_0x056e
            int r1 = r1.size()
            r0 = 1
            if (r1 == 0) goto L_0x056f
        L_0x056e:
            r0 = 0
        L_0x056f:
            r2.setChecked(r0)
            java.lang.String r0 = "array-length"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0579:
            android.widget.CheckedTextView r0 = r3.A07
            r1 = 0
            if (r12 == r0) goto L_0x0555
            r3.A04 = r1
            java.lang.Object r0 = r12.getTag()
            r0.getClass()
            java.lang.String r0 = "groupIndex"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x058e:
            java.lang.Object r0 = r11.A00
            X.0eF r0 = (X.C08310eF) r0
            android.os.Bundle r1 = r0.A06
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r1.getParcelable(r0)
            java.lang.String r0 = "isSelectionComplete"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x05a0:
            r2.A0S(r0)
            r3.A75()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C109415ea.onClick(android.view.View):void");
    }
}
