package com.whatsapp.account.remove;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RR;
import X.AnonymousClass36P;
import X.AnonymousClass3DZ;
import X.AnonymousClass3ZH;
import X.AnonymousClass43V;
import X.AnonymousClass4HY;
import X.AnonymousClass4I1;
import X.AnonymousClass4K2;
import X.AnonymousClass5V0;
import X.AnonymousClass5XC;
import X.C107695bk;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C19340zH;
import X.C45472a4;
import X.C45752aW;
import X.C56972sr;
import X.C614930z;
import X.C620733j;
import X.C64333Db;
import X.C69253Wh;
import X.C85804Hr;
import X.C89644eZ;
import android.app.Dialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.companiondevice.LinkedDevicesViewModel;
import com.whatsapp.wds.components.button.WDSButton;

public final class RemoveAccountActivity extends C89644eZ {
    public WaTextView A00;
    public WaTextView A01;
    public C45752aW A02;
    public C614930z A03;
    public AnonymousClass5XC A04;
    public LinkedDevicesViewModel A05;
    public C45472a4 A06;
    public C69253Wh A07;
    public WDSButton A08;
    public WDSButton A09;
    public boolean A0A;

    public Dialog onCreateDialog(int i) {
        C19340zH r3;
        int i2;
        DialogInterface.OnClickListener onClickListener;
        Dialog create;
        if (i != 0) {
            if (i == 1) {
                AnonymousClass1RR A012 = C56972sr.A01(this.A01);
                if (A012 != null) {
                    AnonymousClass36P.A02(A012);
                    r3 = AnonymousClass5V0.A00(this);
                    r3.A0U(R.string.f11nameremoved);
                    AnonymousClass1RR A013 = C56972sr.A01(this.A01);
                    if (A013 != null) {
                        r3.A0g(AnonymousClass36P.A03(AnonymousClass3ZH.A01(A013)));
                        C19340zH.A07(r3, this, 20, R.string.f11nameremoved);
                        i2 = R.string.f11nameremoved;
                        onClickListener = new C85804Hr(this, 21);
                        r3.A0Y(onClickListener, i2);
                        create = r3.create();
                    } else {
                        throw AnonymousClass001.A0e("Required value was null.");
                    }
                } else {
                    throw AnonymousClass001.A0e("Required value was null.");
                }
            } else if (i != 2) {
                create = super.onCreateDialog(i);
            } else {
                AnonymousClass5XC r2 = this.A04;
                if (r2 != null) {
                    r2.A00(14, 11);
                    r3 = AnonymousClass5V0.A00(this);
                    r3.A0U(R.string.f11nameremoved);
                    r3.A0T(R.string.f11nameremoved);
                    r3.A0i(true);
                    i2 = R.string.f11nameremoved;
                    onClickListener = new AnonymousClass4I1(4);
                    r3.A0Y(onClickListener, i2);
                    create = r3.create();
                } else {
                    throw C18270x1.A0S("accountSwitchingLogger");
                }
            }
            C162457s7.A0D(create);
            return create;
        }
        ProgressDialog progressDialog = new ProgressDialog(this);
        C18320x8.A0w(progressDialog, this, R.string.f11nameremoved);
        progressDialog.setIndeterminate(true);
        progressDialog.setCancelable(false);
        return progressDialog;
    }

    public void A5r() {
        if (!this.A0A) {
            this.A0A = true;
            C64333Db A002 = AnonymousClass3DZ.A00(this);
            AnonymousClass1Hf.A2G(A002, this);
            C107695bk r0 = A002.A00;
            AnonymousClass1Ha.A23(A002, r0, r0, this);
            AnonymousClass1Ha.A24(A002, this);
            this.A03 = C64333Db.A0E(A002);
            this.A06 = (C45472a4) A002.ASi.get();
            this.A07 = (C69253Wh) A002.AJO.get();
            this.A02 = A002.AgW();
            this.A04 = (AnonymousClass5XC) A002.A0U.get();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001e  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A74() {
        /*
            r9 = this;
            X.33p r0 = r9.A09
            java.lang.String r6 = r0.A0X()
            X.33p r0 = r9.A09
            long r3 = r0.A0R(r6)
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0032
            r0 = 2131890931(0x7f1212f3, float:1.9416568E38)
        L_0x0015:
            java.lang.String r5 = r9.getString(r0)
        L_0x0019:
            X.C162457s7.A0H(r5)
            if (r6 == 0) goto L_0x002f
            X.33p r0 = r9.A09
            long r3 = r0.A0S(r6)
        L_0x0024:
            com.whatsapp.WaTextView r2 = r9.A01
            if (r2 != 0) goto L_0x0043
            java.lang.String r0 = "googleBackupTimeView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x002f:
            r3 = -1
            goto L_0x0024
        L_0x0032:
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x003c
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
            goto L_0x0015
        L_0x003c:
            X.33j r0 = r9.A00
            java.lang.String r5 = X.C107565bW.A08(r0, r3)
            goto L_0x0019
        L_0x0043:
            r1 = 2131889682(0x7f120e12, float:1.9414034E38)
            r8 = 1
            java.lang.Object[] r0 = new java.lang.Object[r8]
            r7 = 0
            r0[r7] = r5
            X.AnonymousClass001.A0y(r9, r2, r0, r1)
            r5 = 0
            java.lang.String r2 = "googleBackupSizeView"
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            com.whatsapp.WaTextView r1 = r9.A00
            if (r0 <= 0) goto L_0x007d
            if (r1 != 0) goto L_0x0060
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0060:
            r1.setVisibility(r7)
            com.whatsapp.WaTextView r5 = r9.A00
            if (r5 != 0) goto L_0x006c
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x006c:
            r2 = 2131889681(0x7f120e11, float:1.9414032E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            X.33j r0 = r9.A00
            java.lang.String r0 = X.AnonymousClass35V.A04(r0, r3)
            r1[r7] = r0
            X.AnonymousClass001.A0y(r9, r5, r1, r2)
            return
        L_0x007d:
            if (r1 != 0) goto L_0x0084
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r2)
            throw r0
        L_0x0084:
            r0 = 8
            r1.setVisibility(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.account.remove.RemoveAccountActivity.A74():void");
    }

    public RemoveAccountActivity(int i) {
        this.A0A = false;
        AnonymousClass4HY.A00(this, 9);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        setTitle(R.string.f11nameremoved);
        AnonymousClass1Hf.A2E(this);
        this.A05 = (LinkedDevicesViewModel) AnonymousClass0x9.A0H(this).A01(LinkedDevicesViewModel.class);
        this.A08 = (WDSButton) C18280x3.A0E(this.A00, R.id.remove_account_backup_submit);
        this.A09 = (WDSButton) C18280x3.A0E(this.A00, R.id.remove_account_submit);
        this.A01 = (WaTextView) C18280x3.A0E(this.A00, R.id.gdrive_backup_time);
        this.A00 = (WaTextView) C18280x3.A0E(this.A00, R.id.gdrive_backup_size);
        TextView A0I = AnonymousClass0x2.A0I(this.A00, R.id.remove_whatsapp_account_group_text);
        TextView A0I2 = AnonymousClass0x2.A0I(this.A00, R.id.remove_whatsapp_account_backup_text);
        TextView A0I3 = AnonymousClass0x2.A0I(this.A00, R.id.remove_whatsapp_account_device_text);
        WaTextView waTextView = (WaTextView) C18280x3.A0E(this.A00, R.id.remove_whatsapp_account_linked_devices_text);
        TextView A0I4 = AnonymousClass0x2.A0I(this.A00, R.id.remove_account_number_confirmation_text);
        AnonymousClass1Ha.A1v(this, A0I3, C18290x4.A0l(this, R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, A0I, C18290x4.A0l(this, R.string.f11nameremoved));
        AnonymousClass1Ha.A1v(this, A0I2, C18290x4.A0l(this, R.string.f11nameremoved));
        LinkedDevicesViewModel linkedDevicesViewModel = this.A05;
        if (linkedDevicesViewModel == null) {
            throw C18270x1.A0S("linkedDevicesViewModel");
        }
        linkedDevicesViewModel.A0E();
        LinkedDevicesViewModel linkedDevicesViewModel2 = this.A05;
        if (linkedDevicesViewModel2 == null) {
            throw C18270x1.A0S("linkedDevicesViewModel");
        }
        AnonymousClass4K2.A00(this, linkedDevicesViewModel2.A09, new AnonymousClass43V(waTextView, this), 1);
        C620733j r1 = this.A00;
        AnonymousClass1RR A012 = C56972sr.A01(this.A01);
        if (A012 != null) {
            A0I4.setText(r1.A0I(AnonymousClass36P.A03(AnonymousClass3ZH.A01(A012))));
            WDSButton wDSButton = this.A08;
            if (wDSButton == null) {
                throw C18270x1.A0S("backupChatsButton");
            }
            C18280x3.A0p(wDSButton, this, 30);
            WDSButton wDSButton2 = this.A09;
            if (wDSButton2 == null) {
                throw C18270x1.A0S("removeAccountButton");
            }
            C18280x3.A0p(wDSButton2, this, 31);
            A74();
            return;
        }
        throw C18290x4.A0Y();
    }

    public void onResume() {
        super.onResume();
        A74();
    }

    public RemoveAccountActivity() {
        this(0);
    }
}
