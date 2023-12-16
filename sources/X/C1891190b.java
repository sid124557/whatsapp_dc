package X;

import android.content.DialogInterface;

/* renamed from: X.90b  reason: invalid class name and case insensitive filesystem */
public class C1891190b implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C1891190b(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:110:0x02b4, code lost:
        X.C621433s.A00(r1, r0);
        r1.A7L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x02ba, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02d9, code lost:
        r8.dismiss();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02dc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f8, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02fb, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c2, code lost:
        r0.A1L();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00cf, code lost:
        r0.A02();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00fe, code lost:
        r1.A1V(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0101, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x014d, code lost:
        r0 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0163, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0166, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0170, code lost:
        r1.setResult(0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x019d, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x01a0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x01a9, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0216, code lost:
        r4.BKB(r3, r2, r0, r1);
        r5.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x021c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r8, int r9) {
        /*
            r7 = this;
            int r0 = r7.A01
            switch(r0) {
                case 10: goto L_0x000d;
                case 11: goto L_0x003b;
                case 12: goto L_0x0043;
                case 13: goto L_0x0043;
                case 14: goto L_0x004b;
                case 15: goto L_0x0199;
                case 16: goto L_0x0199;
                case 17: goto L_0x0053;
                case 18: goto L_0x005a;
                case 19: goto L_0x0073;
                case 20: goto L_0x005f;
                case 21: goto L_0x0067;
                case 22: goto L_0x0073;
                case 23: goto L_0x0084;
                case 24: goto L_0x0098;
                case 25: goto L_0x00a8;
                case 26: goto L_0x00b1;
                case 27: goto L_0x00bb;
                case 28: goto L_0x00c6;
                case 29: goto L_0x00d3;
                case 30: goto L_0x00dc;
                case 31: goto L_0x00e7;
                case 32: goto L_0x00f3;
                case 33: goto L_0x00f9;
                case 34: goto L_0x0102;
                case 35: goto L_0x0199;
                case 36: goto L_0x0199;
                case 37: goto L_0x001b;
                case 38: goto L_0x010b;
                case 39: goto L_0x011e;
                case 40: goto L_0x013b;
                case 41: goto L_0x0150;
                case 42: goto L_0x015a;
                case 43: goto L_0x0199;
                case 44: goto L_0x0167;
                case 45: goto L_0x0175;
                case 46: goto L_0x0199;
                case 47: goto L_0x0183;
                case 48: goto L_0x0189;
                case 49: goto L_0x0191;
                case 50: goto L_0x0199;
                case 51: goto L_0x01a1;
                case 52: goto L_0x01a1;
                case 53: goto L_0x01a1;
                case 54: goto L_0x01ad;
                case 55: goto L_0x01c4;
                case 56: goto L_0x0200;
                case 57: goto L_0x021d;
                case 58: goto L_0x0225;
                case 59: goto L_0x0233;
                case 60: goto L_0x023a;
                case 61: goto L_0x0242;
                case 62: goto L_0x024a;
                case 63: goto L_0x0252;
                case 64: goto L_0x025a;
                case 65: goto L_0x0262;
                case 66: goto L_0x026a;
                case 67: goto L_0x0272;
                case 68: goto L_0x0279;
                case 69: goto L_0x0280;
                case 70: goto L_0x0287;
                case 71: goto L_0x028e;
                case 72: goto L_0x0295;
                case 73: goto L_0x029d;
                case 74: goto L_0x02a4;
                case 75: goto L_0x02ae;
                case 76: goto L_0x02bb;
                case 77: goto L_0x02c2;
                case 78: goto L_0x02c9;
                case 79: goto L_0x02d0;
                case 80: goto L_0x02dd;
                case 81: goto L_0x02e4;
                case 82: goto L_0x02eb;
                case 83: goto L_0x02f2;
                case 84: goto L_0x002f;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r7.A00
            X.8mw r0 = (X.C181548mw) r0
            r0.BP1()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r1 = r7.A00
            com.whatsapp.SingleSelectionDialogFragment r1 = (com.whatsapp.SingleSelectionDialogFragment) r1
            r1.A03 = r9
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x000c
            r1.A1W()
            return
        L_0x001b:
            java.lang.Object r2 = r7.A00
            X.5i6 r2 = (X.C111445i6) r2
            android.app.Activity r1 = r2.A0E
            r0 = 0
            X.C621433s.A00(r1, r0)
            X.4uZ r1 = r2.A0c
            if (r1 == 0) goto L_0x000c
            X.33o r0 = r2.A1J
            r0.A0Q(r1)
            return
        L_0x002f:
            java.lang.Object r0 = r7.A00
            com.whatsapp.report.DeleteReportConfirmationDialogFragment r0 = (com.whatsapp.report.DeleteReportConfirmationDialogFragment) r0
            X.8pI r0 = r0.A00
            if (r0 == 0) goto L_0x000c
            r0.B1P()
            return
        L_0x003b:
            java.lang.Object r0 = r7.A00
            com.whatsapp.SingleSelectionDialogFragment r0 = (com.whatsapp.SingleSelectionDialogFragment) r0
            r0.A1W()
            return
        L_0x0043:
            java.lang.Object r0 = r7.A00
            com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment r0 = (com.whatsapp.authentication.VerifyTwoFactorAuthCodeDialogFragment) r0
            r0.A1V()
            return
        L_0x004b:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 106(0x6a, float:1.49E-43)
            goto L_0x02f8
        L_0x0053:
            java.lang.Object r0 = r7.A00
            com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment r0 = (com.whatsapp.biz.product.view.fragment.ProductReportReasonDialogFragment) r0
            r0.A00 = r9
            return
        L_0x005a:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            goto L_0x00c2
        L_0x005f:
            java.lang.Object r0 = r7.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            r0.A74()
            return
        L_0x0067:
            java.lang.Object r0 = r7.A00
            X.925 r0 = (X.AnonymousClass925) r0
            java.lang.Object r0 = r0.A00
            com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity r0 = (com.whatsapp.businessdirectory.view.activity.DirectorySetLocationMapActivity) r0
            r0.A7C()
            return
        L_0x0073:
            java.lang.Object r2 = r7.A00
            X.4el r2 = (X.C89704el) r2
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            r0 = 35
            r2.startActivityForResult(r1, r0)
            goto L_0x02d9
        L_0x0084:
            java.lang.Object r3 = r7.A00
            X.5cT r3 = (X.C108135cT) r3
            X.4eZ r2 = r3.A07
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.4eZ r1 = r3.A07
            goto L_0x014d
        L_0x0098:
            java.lang.Object r0 = r7.A00
            X.5jZ r0 = (X.C112335jZ) r0
            X.0O1 r1 = r0.A01
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r0 = X.AnonymousClass0x9.A09(r0)
            r1.A01(r0)
            return
        L_0x00a8:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r8.dismiss()
            goto L_0x0170
        L_0x00b1:
            java.lang.Object r0 = r7.A00
            com.whatsapp.contact.contactform.ContactFormActivity r0 = (com.whatsapp.contact.contactform.ContactFormActivity) r0
            r8.dismiss()
            X.2qh r0 = r0.A0F
            goto L_0x00cf
        L_0x00bb:
            java.lang.Object r0 = r7.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r8.dismiss()
        L_0x00c2:
            r0.A1L()
            return
        L_0x00c6:
            java.lang.Object r0 = r7.A00
            com.whatsapp.contact.contactform.ContactFormBottomSheetFragment r0 = (com.whatsapp.contact.contactform.ContactFormBottomSheetFragment) r0
            r8.dismiss()
            X.2qh r0 = r0.A0D
        L_0x00cf:
            r0.A02()
            return
        L_0x00d3:
            java.lang.Object r0 = r7.A00
            X.5iA r0 = (X.C111485iA) r0
            android.app.Activity r1 = r0.A02
            r0 = 1
            goto L_0x02f8
        L_0x00dc:
            java.lang.Object r0 = r7.A00
            X.5l7 r0 = (X.C113245l7) r0
            X.2hj r1 = r0.A5O
            r0 = 2
            r1.A01(r0)
            return
        L_0x00e7:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r1.finish()
            r0 = 0
            r1.overridePendingTransition(r0, r0)
            return
        L_0x00f3:
            java.lang.Object r1 = r7.A00
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 1
            goto L_0x00fe
        L_0x00f9:
            java.lang.Object r1 = r7.A00
            com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment r1 = (com.whatsapp.group.reporttoadmin.ConfirmClearAdminReviewsDialogFragment) r1
            r0 = 0
        L_0x00fe:
            r1.A1V(r0)
            return
        L_0x0102:
            java.lang.Object r0 = r7.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r8.dismiss()
            goto L_0x019d
        L_0x010b:
            java.lang.Object r3 = r7.A00
            X.5i6 r3 = (X.C111445i6) r3
            android.app.Activity r2 = r3.A0E
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            android.app.Activity r1 = r3.A0E
            goto L_0x014d
        L_0x011e:
            java.lang.Object r3 = r7.A00
            X.4ea r3 = (X.C89654ea) r3
            X.33p r0 = r3.A09
            r2 = 1
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "live_location_is_new_user"
            X.C18270x1.A0l(r1, r0, r2)
            X.4FS r2 = r3.A04
            r1 = 13
            X.3cG r0 = new X.3cG
            r0.<init>((java.lang.Object) r3, (int) r1)
            r2.BkM(r0)
            return
        L_0x013b:
            java.lang.Object r3 = r7.A00
            X.5cU r3 = (X.C108145cU) r3
            X.07r r2 = r3.A0X
            java.lang.String r0 = "android.settings.LOCATION_SOURCE_SETTINGS"
            android.content.Intent r1 = X.AnonymousClass0x9.A09(r0)
            r0 = 0
            r2.startActivityForResult(r1, r0)
            X.07r r1 = r3.A0X
        L_0x014d:
            r0 = 2
            goto L_0x02f8
        L_0x0150:
            java.lang.Object r0 = r7.A00
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r0 = (com.whatsapp.mediacomposer.dialog.DataWarningDialog) r0
            r8.dismiss()
            X.4GP r0 = r0.A02
            goto L_0x0163
        L_0x015a:
            java.lang.Object r0 = r7.A00
            com.whatsapp.mediacomposer.dialog.DataWarningDialog r0 = (com.whatsapp.mediacomposer.dialog.DataWarningDialog) r0
            r8.dismiss()
            X.4GP r0 = r0.A01
        L_0x0163:
            r0.invoke()
            return
        L_0x0167:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "ExportMigrationActivity/cancelMigrationAndReturn/unknown/resultCode: 0"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x0170:
            r0 = 0
            r1.setResult(r0)
            goto L_0x01a9
        L_0x0175:
            java.lang.Object r0 = r7.A00
            com.whatsapp.migration.export.ui.ExportMigrationActivity r0 = (com.whatsapp.migration.export.ui.ExportMigrationActivity) r0
            X.2j6 r2 = r0.A0G
            java.lang.String r1 = r0.A0J
            r0 = 9
            r2.A00(r1, r0)
            return
        L_0x0183:
            r0 = 1
            X.C162457s7.A0J(r8, r0)
            goto L_0x02d9
        L_0x0189:
            java.lang.Object r0 = r7.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A00(r8, r0)
            return
        L_0x0191:
            java.lang.Object r0 = r7.A00
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment r0 = (com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment) r0
            com.whatsapp.payments.ui.P2mLitePaymentSettingsFragment.A03(r0)
            return
        L_0x0199:
            java.lang.Object r0 = r7.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x019d:
            r0.finish()
            return
        L_0x01a1:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 0
            X.C162457s7.A0J(r1, r0)
        L_0x01a9:
            r1.finish()
            return
        L_0x01ad:
            java.lang.Object r5 = r7.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.9ca r4 = r5.A74()
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "error"
            goto L_0x0216
        L_0x01c4:
            java.lang.Object r6 = r7.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r6 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r6
            r5 = 1
            r6.A04 = r5
            android.widget.TextView r1 = r6.A00
            if (r1 == 0) goto L_0x01f9
            r0 = 2131890600(0x7f1211a8, float:1.9415896E38)
            r1.setText(r0)
            X.9ca r4 = r6.A74()
            java.lang.Integer r3 = java.lang.Integer.valueOf(r5)
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r6)
            java.lang.String r0 = "alias_switch_confirm_dialog"
            r4.BKB(r3, r2, r0, r1)
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkViewModel r0 = r6.A03
            if (r0 == 0) goto L_0x01f2
            r0.A0D(r5)
            return
        L_0x01f2:
            java.lang.String r0 = "indiaUpiMapperLinkViewModel"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x01f9:
            java.lang.String r0 = "titleTextView"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0200:
            java.lang.Object r5 = r7.A00
            com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity r5 = (com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperLinkActivity) r5
            X.9ca r4 = r5.A74()
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r1 = X.AnonymousClass6C7.A0h(r5)
            java.lang.String r0 = "alias_switch_confirm_dialog"
        L_0x0216:
            r4.BKB(r3, r2, r0, r1)
            r5.finish()
            return
        L_0x021d:
            java.lang.Object r0 = r7.A00
            com.whatsapp.registration.ChangeNumber r0 = (com.whatsapp.registration.ChangeNumber) r0
            r0.A7B()
            return
        L_0x0225:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.RegisterPhone r1 = (com.whatsapp.registration.RegisterPhone) r1
            java.lang.String r0 = "RegisterPhone/createNumberConfirmationDialog/ok"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 0
            r1.A7K(r0)
            return
        L_0x0233:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 21
            goto L_0x02b4
        L_0x023a:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 40
            goto L_0x02f8
        L_0x0242:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 48
            goto L_0x02f8
        L_0x024a:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 37
            goto L_0x02f8
        L_0x0252:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 36
            goto L_0x02f8
        L_0x025a:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 38
            goto L_0x02f8
        L_0x0262:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 49
            goto L_0x02f8
        L_0x026a:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 27
            goto L_0x02f8
        L_0x0272:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 31
            goto L_0x02b4
        L_0x0279:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 30
            goto L_0x02b4
        L_0x0280:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 28
            goto L_0x02b4
        L_0x0287:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 29
            goto L_0x02f8
        L_0x028e:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 41
            goto L_0x02b4
        L_0x0295:
            java.lang.Object r0 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r0 = (com.whatsapp.registration.VerifyPhoneNumber) r0
            r0.A7I()
            return
        L_0x029d:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 53
            goto L_0x02f8
        L_0x02a4:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            int r0 = r1.A04
            r1.A7U(r0)
            return
        L_0x02ae:
            java.lang.Object r1 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            r0 = 34
        L_0x02b4:
            X.C621433s.A00(r1, r0)
            r1.A7L()
            return
        L_0x02bb:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            goto L_0x02f8
        L_0x02c2:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 39
            goto L_0x02f8
        L_0x02c9:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 32
            goto L_0x02f8
        L_0x02d0:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 11
            X.C621433s.A00(r1, r0)
        L_0x02d9:
            r8.dismiss()
            return
        L_0x02dd:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 13
            goto L_0x02f8
        L_0x02e4:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 14
            goto L_0x02f8
        L_0x02eb:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 15
            goto L_0x02f8
        L_0x02f2:
            java.lang.Object r1 = r7.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 17
        L_0x02f8:
            X.C621433s.A00(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1891190b.onClick(android.content.DialogInterface, int):void");
    }
}
