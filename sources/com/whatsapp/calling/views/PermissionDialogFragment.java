package com.whatsapp.calling.views;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass33p;
import X.AnonymousClass5ZR;
import X.AnonymousClass5ZU;
import X.AnonymousClass661;
import X.C08310eF;
import X.C117695sL;
import X.C18260x0;
import X.C187958y5;
import X.C29321id;
import X.C626936e;
import X.C64773Ex;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Arrays;

public class PermissionDialogFragment extends Hilt_PermissionDialogFragment {
    public int A00;
    public Dialog A01;
    public Button A02;
    public TextView A03;
    public AnonymousClass661 A04;
    public C64773Ex A05;
    public AnonymousClass5ZU A06;
    public AnonymousClass5ZR A07;
    public AnonymousClass33p A08;
    public C29321id A09;
    public C187958y5 A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public String[] A0E;

    public static PermissionDialogFragment A00(UserJid userJid, int i, boolean z, boolean z2, boolean z3) {
        PermissionDialogFragment permissionDialogFragment = new PermissionDialogFragment();
        Bundle A082 = AnonymousClass002.A08();
        AnonymousClass0x2.A0v(A082, userJid, "jid");
        A082.putBoolean("microphone", z);
        A082.putBoolean("camera", z2);
        A082.putBoolean("phone", z3);
        A082.putInt("request_code", i);
        permissionDialogFragment.A0u(A082);
        return permissionDialogFragment;
    }

    public void A0l(int i, String[] strArr, int[] iArr) {
        boolean z = false;
        if (i != 100) {
            C626936e.A0D(false, "Unknown request code");
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("PermissionDialogFragment/onRequestPermissionsResult permissions: ");
        A0o.append(Arrays.toString(strArr));
        A0o.append(", grantResults: ");
        C18260x0.A1L(A0o, Arrays.toString(iArr));
        int length = iArr.length;
        boolean z2 = false;
        if (length > 0) {
            z2 = true;
            int i2 = 0;
            while (true) {
                if (iArr[i2] == 0) {
                    i2++;
                    if (i2 >= length) {
                        break;
                    }
                } else {
                    break;
                }
            }
        } else {
            z = z2;
        }
        AnonymousClass661 r1 = this.A04;
        if (r1 != null) {
            int i3 = this.A00;
            if (z) {
                r1.BY3(strArr, i3);
            } else {
                r1.BY2(i3);
            }
        }
    }

    public void A0a() {
        super.A0a();
        Dialog dialog = this.A01;
        if (dialog != null) {
            dialog.dismiss();
        }
    }

    public void A0d() {
        super.A0d();
        this.A04 = null;
    }

    public void A0f() {
        super.A0f();
        if (this.A0B) {
            Log.d("PermissionDialogFragment/handlePermissionChangesAfterReturningFromSettings ");
            String[] strArr = this.A0E;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (this.A07.A02(strArr[i]) != 0) {
                        break;
                    }
                    i++;
                } else {
                    this.A01.dismiss();
                    if (this.A04 != null) {
                        new Handler().post(C117695sL.A00(this, 40));
                    }
                }
            }
            this.A0B = false;
        }
    }

    public void A0g() {
        super.A0g();
        Window window = this.A01.getWindow();
        C626936e.A06(window);
        window.setLayout(C08310eF.A09(this).getDisplayMetrics().widthPixels, C08310eF.A09(this).getDisplayMetrics().heightPixels);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0034, code lost:
        if (r5 != false) goto L_0x0036;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01f0, code lost:
        if (r0 == false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x01f3, code lost:
        if (r6 != false) goto L_0x01f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01f5, code lost:
        r2 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0201, code lost:
        if (r10.A0D != false) goto L_0x01cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x0204, code lost:
        r2 = com.whatsapp.R.string.f11nameremoved;
     */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0p(android.os.Bundle r11) {
        /*
            r10 = this;
            super.A0p(r11)
            X.03q r7 = r10.A0R()
            android.os.Bundle r6 = r10.A0H()
            java.lang.String r0 = "microphone"
            boolean r0 = r6.getBoolean(r0)
            r10.A0D = r0
            java.lang.String r0 = "camera"
            boolean r0 = r6.getBoolean(r0)
            r10.A0C = r0
            java.lang.String r0 = "phone"
            boolean r5 = r6.getBoolean(r0)
            java.lang.String r0 = "request_code"
            int r0 = r6.getInt(r0)
            r10.A00 = r0
            boolean r0 = r10.A0D
            r4 = 1
            r3 = 0
            if (r0 != 0) goto L_0x0036
            boolean r0 = r10.A0C
            if (r0 != 0) goto L_0x0036
            r1 = 0
            if (r5 == 0) goto L_0x0037
        L_0x0036:
            r1 = 1
        L_0x0037:
            java.lang.String r0 = "either microphone or camera or phone permission should be needed"
            X.C626936e.A0D(r1, r0)
            boolean r9 = r10.A0C
            java.lang.String r8 = "android.permission.CAMERA"
            java.lang.String r2 = "android.permission.RECORD_AUDIO"
            if (r9 == 0) goto L_0x0265
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0265
            java.lang.String[] r0 = new java.lang.String[]{r8, r2}
            java.util.ArrayList r1 = X.C162197rQ.newArrayList((java.lang.Object[]) r0)
        L_0x0050:
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0059
            X.3d3 r0 = X.C72023d3.A00
            r1.addAll(r0)
        L_0x0059:
            java.lang.String[] r0 = X.C18300x5.A1b(r1)
            r10.A0E = r0
            X.03q r1 = r10.A0R()
            android.app.Dialog r0 = new android.app.Dialog
            r0.<init>(r1)
            r10.A01 = r0
            r0.requestWindowFeature(r4)
            android.app.Dialog r0 = r10.A01
            android.view.Window r0 = r0.getWindow()
            X.C626936e.A06(r0)
            X.C86644Kx.A17(r0, r3)
            android.app.Dialog r0 = r10.A01
            r0.setCancelable(r3)
            android.app.Dialog r0 = r10.A01
            r0.setCanceledOnTouchOutside(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131625734(0x7f0e0706, float:1.8878684E38)
            r1.setContentView(r0)
            boolean r0 = r10.A0C
            if (r0 == 0) goto L_0x0221
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0221
            android.app.Dialog r0 = r10.A01
            r2 = 2131432383(0x7f0b13bf, float:1.8486522E38)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233413(0x7f080a85, float:1.8082963E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432384(0x7f0b13c0, float:1.8486524E38)
            android.view.View r1 = r1.findViewById(r0)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233415(0x7f080a87, float:1.8082967E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            r2 = 2131432385(0x7f0b13c1, float:1.8486526E38)
            android.view.View r1 = r0.findViewById(r2)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r0 = 2131233403(0x7f080a7b, float:1.8082943E38)
            r1.setImageResource(r0)
            android.app.Dialog r0 = r10.A01
            android.view.View r0 = r0.findViewById(r2)
            r0.setVisibility(r3)
        L_0x00d8:
            android.app.Dialog r1 = r10.A01
            r0 = 2131428506(0x7f0b049a, float:1.8478658E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            X.C18320x8.A13(r1, r10, r0)
            java.lang.String r0 = "jid"
            com.whatsapp.jid.UserJid r2 = X.C86634Kw.A0l(r6, r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131434077(0x7f0b1a5d, float:1.8489958E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.Button r0 = (android.widget.Button) r0
            r10.A02 = r0
            android.app.Dialog r1 = r10.A01
            r0 = 2131432386(0x7f0b13c2, float:1.8486528E38)
            android.view.View r0 = r1.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r10.A03 = r0
            X.1id r0 = r10.A09
            boolean r6 = r0.A09()
            java.lang.String[] r0 = r10.A0E
            boolean r8 = com.whatsapp.RequestPermissionActivity.A0p(r7, r0)
            X.33p r1 = r10.A08
            java.lang.String[] r0 = r10.A0E
            boolean r7 = com.whatsapp.RequestPermissionActivity.A0t(r1, r0)
            if (r8 != 0) goto L_0x021e
            if (r7 != 0) goto L_0x021e
        L_0x011e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PermissionDialogFragment/permissions needMicPermission="
            r1.append(r0)
            boolean r0 = r10.A0D
            r1.append(r0)
            java.lang.String r0 = ", needCameraPermission="
            r1.append(r0)
            boolean r0 = r10.A0C
            r1.append(r0)
            java.lang.String r0 = ", needPhonePermission="
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = ", isScreenLocked="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = ", showRational="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = ", isFistTimeRequest="
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = ", permanentDenial="
            X.C18260x0.A1E(r0, r1, r4)
            if (r2 == 0) goto L_0x020c
            X.5ZU r1 = r10.A06
            X.3Ex r0 = r10.A05
            java.lang.String r5 = X.AnonymousClass5ZU.A01(r0, r1, r2)
        L_0x0165:
            r0 = 1
            if (r4 == 0) goto L_0x01b2
            boolean r0 = r10.A0C
            boolean r1 = r10.A0D
            if (r6 == 0) goto L_0x019e
            if (r0 == 0) goto L_0x019a
            r0 = 2131892313(0x7f121859, float:1.941937E38)
            if (r1 == 0) goto L_0x0178
            r0 = 2131892393(0x7f1218a9, float:1.9419533E38)
        L_0x0178:
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = X.C18310x6.A0m(r10, r5, r0)
            r1.setText(r0)
            android.widget.Button r1 = r10.A02
            r0 = 2131892416(0x7f1218c0, float:1.941958E38)
            r1.setText(r0)
        L_0x0189:
            android.widget.Button r2 = r10.A02
            r1 = 2
            X.542 r0 = new X.542
            r0.<init>(r1, r10, r4)
            r2.setOnClickListener(r0)
            android.app.Dialog r0 = r10.A01
            r0.show()
            return
        L_0x019a:
            r0 = 2131892386(0x7f1218a2, float:1.9419519E38)
            goto L_0x01ac
        L_0x019e:
            if (r0 == 0) goto L_0x01a9
            r0 = 2131892312(0x7f121858, float:1.9419369E38)
            if (r1 == 0) goto L_0x0178
            r0 = 2131892392(0x7f1218a8, float:1.941953E38)
            goto L_0x0178
        L_0x01a9:
            r0 = 2131892385(0x7f1218a1, float:1.9419517E38)
        L_0x01ac:
            if (r1 != 0) goto L_0x0178
            r0 = 2131892404(0x7f1218b4, float:1.9419555E38)
            goto L_0x0178
        L_0x01b2:
            int r2 = r10.A00
            if (r2 == 0) goto L_0x01e5
            if (r2 == r0) goto L_0x01dc
            r0 = 2
            if (r2 == r0) goto L_0x01f3
            r0 = 3
            if (r2 == r0) goto L_0x01d8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "UNKNOWN REQUEST CODE "
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r2)
            X.C626936e.A0D(r3, r0)
        L_0x01cb:
            r2 = 2131892395(0x7f1218ab, float:1.9419537E38)
        L_0x01ce:
            android.widget.TextView r1 = r10.A03
            java.lang.String r0 = X.C18310x6.A0m(r10, r5, r2)
            r1.setText(r0)
            goto L_0x0189
        L_0x01d8:
            r2 = 2131892405(0x7f1218b5, float:1.9419557E38)
            goto L_0x01ce
        L_0x01dc:
            r2 = 2131892317(0x7f12185d, float:1.9419379E38)
            if (r6 == 0) goto L_0x01ce
            r2 = 2131892316(0x7f12185c, float:1.9419377E38)
            goto L_0x01ce
        L_0x01e5:
            boolean r0 = r10.A0C
            if (r6 == 0) goto L_0x01fd
            if (r0 == 0) goto L_0x01f9
            boolean r0 = r10.A0D
            r2 = 2131892394(0x7f1218aa, float:1.9419535E38)
            if (r0 != 0) goto L_0x01ce
            goto L_0x01f5
        L_0x01f3:
            if (r6 == 0) goto L_0x0204
        L_0x01f5:
            r2 = 2131892314(0x7f12185a, float:1.9419373E38)
            goto L_0x01ce
        L_0x01f9:
            r2 = 2131892387(0x7f1218a3, float:1.941952E38)
            goto L_0x01ce
        L_0x01fd:
            if (r0 == 0) goto L_0x0208
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0204
            goto L_0x01cb
        L_0x0204:
            r2 = 2131892315(0x7f12185b, float:1.9419375E38)
            goto L_0x01ce
        L_0x0208:
            r2 = 2131892388(0x7f1218a4, float:1.9419523E38)
            goto L_0x01ce
        L_0x020c:
            java.lang.String r0 = "PermissionDialogFragment/permissions/jid is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r1 = 2131894596(0x7f122144, float:1.9424001E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r10)
            java.lang.String r5 = r0.getString(r1)
            goto L_0x0165
        L_0x021e:
            r4 = 0
            goto L_0x011e
        L_0x0221:
            android.app.Dialog r1 = r10.A01
            r0 = 2131432384(0x7f0b13c0, float:1.8486524E38)
            android.view.View r8 = r1.findViewById(r0)
            android.widget.ImageView r8 = (android.widget.ImageView) r8
            android.content.res.Resources r2 = X.C08310eF.A09(r10)
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x025a
            r1 = 2131233413(0x7f080a85, float:1.8082963E38)
        L_0x0237:
            android.graphics.drawable.Drawable r0 = r2.getDrawable(r1)
            r8.setImageDrawable(r0)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432383(0x7f0b13bf, float:1.8486522E38)
            android.view.View r0 = r1.findViewById(r0)
            r2 = 8
            r0.setVisibility(r2)
            android.app.Dialog r1 = r10.A01
            r0 = 2131432385(0x7f0b13c1, float:1.8486526E38)
            android.view.View r0 = r1.findViewById(r0)
            r0.setVisibility(r2)
            goto L_0x00d8
        L_0x025a:
            boolean r0 = r10.A0C
            r1 = 2131233401(0x7f080a79, float:1.8082938E38)
            if (r0 == 0) goto L_0x0237
            r1 = 2131233403(0x7f080a7b, float:1.8082943E38)
            goto L_0x0237
        L_0x0265:
            java.lang.String[] r1 = new java.lang.String[r4]
            boolean r0 = r10.A0D
            if (r0 == 0) goto L_0x0274
            r8 = r2
        L_0x026c:
            r1[r3] = r8
            java.util.ArrayList r1 = X.C162197rQ.newArrayList((java.lang.Object[]) r1)
            goto L_0x0050
        L_0x0274:
            if (r9 != 0) goto L_0x026c
            java.lang.String r8 = "android.permission.READ_PHONE_STATE"
            goto L_0x026c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.views.PermissionDialogFragment.A0p(android.os.Bundle):void");
    }

    public void A1G(Context context) {
        super.A1G(context);
        this.A04 = (AnonymousClass661) context;
    }
}
