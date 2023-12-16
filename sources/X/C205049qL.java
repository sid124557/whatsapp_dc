package X;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity;
import com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.payments.ui.PaymentBottomSheet;
import com.whatsapp.payments.ui.invites.PaymentInviteFragment;
import com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment;
import com.whatsapp.util.Log;
import java.util.TimeZone;

/* renamed from: X.9qL  reason: invalid class name and case insensitive filesystem */
public class C205049qL implements C15930sC {
    public Object A00;
    public final int A01;

    public C205049qL(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C205049qL A00(Object obj, int i) {
        return new C205049qL(obj, i);
    }

    public static void A01(C08310eF r2) {
        r2.A0H().getString("screen_name");
        r2.A0H().getString("screen_params");
    }

    public static void A02(C15910sA r1, C06270Wx r2, int i) {
        r2.A0B(r1, new C205049qL(r1, i));
    }

    public static void A03(C15910sA r1, C06270Wx r2, Object obj, int i) {
        r2.A0B(r1, new C205049qL(obj, i));
    }

    public static final void A04(C205049qL r16, Object obj) {
        int i;
        AnonymousClass38V r0;
        IndiaUpiMandatePaymentActivity indiaUpiMandatePaymentActivity = (IndiaUpiMandatePaymentActivity) r16.A00;
        AnonymousClass9QE r2 = (AnonymousClass9QE) obj;
        switch (r2.A01) {
            case 0:
                int i2 = indiaUpiMandatePaymentActivity.A00;
                if (i2 == 3) {
                    i = 10;
                } else if (i2 == 8) {
                    i = 8;
                } else if (i2 != 5) {
                    i = 12;
                    if (i2 != 6) {
                        i = 7;
                    }
                } else {
                    i = 11;
                }
                String str = r2.A0A;
                String str2 = r2.A09;
                C166557yt r8 = r2.A04;
                AnonymousClass99L r02 = r2.A05;
                indiaUpiMandatePaymentActivity.A7f(r2.A02, r8, str, str2, r02.A0Q, r02.A0O, r02.A0S, r2.A0C, r2.A0B, (String) null, i);
                return;
            case 1:
                indiaUpiMandatePaymentActivity.overridePendingTransition(0, 0);
                indiaUpiMandatePaymentActivity.finish();
                return;
            case 2:
                indiaUpiMandatePaymentActivity.A7b();
                return;
            case 3:
                indiaUpiMandatePaymentActivity.Bov(r2.A08, r2.A07);
                return;
            case 4:
                C19340zH A002 = AnonymousClass5V0.A00(indiaUpiMandatePaymentActivity);
                A002.A0T(R.string.f11nameremoved);
                A002.A0Y((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                A002.A0W((DialogInterface.OnClickListener) null, R.string.f11nameremoved);
                A002.A00.A0L(new C204629pf(indiaUpiMandatePaymentActivity, 12));
                AnonymousClass043 create = A002.create();
                create.setOnShowListener(new C195199Wn(indiaUpiMandatePaymentActivity, 1));
                create.show();
                return;
            case 5:
                indiaUpiMandatePaymentActivity.A7q(r2.A00);
                return;
            case 6:
            case 12:
                C624034w r1 = r2.A03;
                indiaUpiMandatePaymentActivity.A05 = r1;
                if (AnonymousClass97T.A12(indiaUpiMandatePaymentActivity)) {
                    indiaUpiMandatePaymentActivity.Bp9(R.string.f11nameremoved);
                    indiaUpiMandatePaymentActivity.A04.BkM(new C200979jK(indiaUpiMandatePaymentActivity, new C200279i4(r1, indiaUpiMandatePaymentActivity), false));
                    return;
                }
                indiaUpiMandatePaymentActivity.BjL();
                Intent A05 = C1899593h.A05(indiaUpiMandatePaymentActivity);
                A05.putExtra("extra_payments_entry_type", 6);
                A05.putExtra("extra_is_first_payment_method", true);
                A05.putExtra("extra_skip_value_props_display", false);
                indiaUpiMandatePaymentActivity.A6T(A05, true);
                return;
            case 8:
                return;
            case 9:
                Parcelable parcelableExtra = indiaUpiMandatePaymentActivity.getIntent().getParcelableExtra("payment_transaction_info");
                C626936e.A06(parcelableExtra);
                C624034w r3 = ((AnonymousClass38V) parcelableExtra).A00;
                Intent A08 = AnonymousClass0x9.A08(indiaUpiMandatePaymentActivity, IndiaUpiPauseMandateActivity.class);
                A08.putExtra("extra_transaction_detail_data", new AnonymousClass38V(r3));
                indiaUpiMandatePaymentActivity.startActivityForResult(A08, 1);
                return;
            case 10:
                AnonymousClass9W2 r03 = ((AnonymousClass99L) r2.A03.A0A).A0G;
                AnonymousClass9WN r5 = indiaUpiMandatePaymentActivity.A0B;
                String A06 = C107505bQ.A06(r5.A03, indiaUpiMandatePaymentActivity.A06.A0I(r03.A01 - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
                C19340zH A003 = AnonymousClass5V0.A00(indiaUpiMandatePaymentActivity);
                Object[] A0L = AnonymousClass002.A0L();
                A0L[0] = A06;
                C86624Kv.A0i(indiaUpiMandatePaymentActivity, A003, A0L, R.string.f11nameremoved);
                C204219p0.A01(A003, indiaUpiMandatePaymentActivity, 26, R.string.f11nameremoved);
                A003.A0i(false);
                C204219p0.A00(A003, indiaUpiMandatePaymentActivity, 27, R.string.f11nameremoved);
                C18280x3.A0q(A003);
                return;
            case 11:
                indiaUpiMandatePaymentActivity.Bp9(R.string.f11nameremoved);
                AnonymousClass97T.A10(indiaUpiMandatePaymentActivity);
                return;
            case 13:
                C626936e.A07(r2.A03, "Expected transaction");
                C626936e.A07(r2.A03.A0K, "Expected transaction id");
                String str3 = r2.A03.A0K;
                Intent A082 = AnonymousClass0x9.A08(indiaUpiMandatePaymentActivity, IndiaUpiPaymentTransactionDetailsActivity.class);
                A082.putExtra("extra_transaction_id", str3);
                A082.putExtra("referral_screen", indiaUpiMandatePaymentActivity.A04);
                A082.putExtra("extra_payment_flow_entry_point", indiaUpiMandatePaymentActivity.A01);
                A082.setFlags(67108864);
                indiaUpiMandatePaymentActivity.startActivity(A082);
                indiaUpiMandatePaymentActivity.A7H();
                return;
            default:
                C626936e.A06(r2.A03);
                C624034w r52 = r2.A03;
                PaymentBottomSheet paymentBottomSheet = indiaUpiMandatePaymentActivity.A02;
                MandateUpdateBottomSheetFragment mandateUpdateBottomSheetFragment = new MandateUpdateBottomSheetFragment();
                Bundle A083 = AnonymousClass002.A08();
                if (r52 == null) {
                    r0 = null;
                } else {
                    r0 = new AnonymousClass38V(r52);
                }
                A083.putParcelable("transaction", r0);
                mandateUpdateBottomSheetFragment.A0u(A083);
                paymentBottomSheet.A02 = mandateUpdateBottomSheetFragment;
                PaymentBottomSheet paymentBottomSheet2 = indiaUpiMandatePaymentActivity.A02;
                paymentBottomSheet2.A01 = new C204629pf(indiaUpiMandatePaymentActivity, 13);
                indiaUpiMandatePaymentActivity.Bon(paymentBottomSheet2, "MandateUpdateBottomSheetFragment");
                return;
        }
    }

    public static void A05(PaymentInviteFragment paymentInviteFragment) {
        Log.i("dismiss()");
        paymentInviteFragment.A02.A0D(3);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v27, resolved type: com.whatsapp.payments.ui.IncentiveValuePropsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v83, resolved type: com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v132, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v177, resolved type: X.97d} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v147, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v148, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v149, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v150, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v151, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v180, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v181, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v182, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v183, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v184, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v185, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v186, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v187, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v188, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v152, resolved type: com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v190, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v191, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r12v15, resolved type: com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v192, resolved type: com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity} */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0584, code lost:
        r2.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x0587, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x08d7, code lost:
        r1.setText(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x08da, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:324:0x090a, code lost:
        r0.setVisibility(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x090d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x09a9, code lost:
        r12.startActivity(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x09ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a0c, code lost:
        if (r0.booleanValue() == false) goto L_0x0e19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a0e, code lost:
        r0 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:446:0x0c21, code lost:
        if (r6.getText().equals(r8) == false) goto L_0x0b9e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:467:0x0c9c, code lost:
        r0.show();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:468:0x0c9f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:529:0x0e19, code lost:
        r0 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:530:0x0e1b, code lost:
        r1.setVisibility(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:531:0x0e1e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:751:0x156e, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:752:0x1571, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01ec, code lost:
        r1 = new android.content.Intent(r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01f9, code lost:
        if (r1.resolveActivity(r12.getPackageManager()) == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01fb, code lost:
        r12.startActivity(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01fe, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:800:0x16a1, code lost:
        r0.setVisibility(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:801:0x16a4, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:803:0x16a8, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:804:0x16ab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:834:0x180c, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:835:0x180f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:846:0x185b, code lost:
        r0.setEnabled(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:847:0x185e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:851:0x186d, code lost:
        X.C621433s.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:852:0x1870, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:886:0x19b5, code lost:
        com.whatsapp.util.Log.i("startPaymentFlow()");
        r5.A02.A0D(1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:887:0x19c0, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:888:0x19c1, code lost:
        r0 = "handleContactSync() parameters are null";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:890:0x19c6, code lost:
        com.whatsapp.util.Log.e(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:891:0x19c9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:898:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:262:0x078e  */
    /* JADX WARNING: Removed duplicated region for block: B:799:0x1697  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void BOf(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r23
            r2 = r22
            int r1 = r2.A01
            switch(r1) {
                case 0: goto L_0x0e1f;
                case 1: goto L_0x0e1f;
                case 2: goto L_0x0140;
                case 3: goto L_0x0168;
                case 4: goto L_0x01a8;
                case 5: goto L_0x0e6e;
                case 6: goto L_0x01ff;
                case 7: goto L_0x0427;
                case 8: goto L_0x045a;
                case 9: goto L_0x046b;
                case 10: goto L_0x0481;
                case 11: goto L_0x0024;
                case 12: goto L_0x006e;
                case 13: goto L_0x0571;
                case 14: goto L_0x0062;
                case 15: goto L_0x0588;
                case 16: goto L_0x165a;
                case 17: goto L_0x05a4;
                case 18: goto L_0x0f65;
                case 19: goto L_0x05c4;
                case 20: goto L_0x10f4;
                case 21: goto L_0x11f0;
                case 22: goto L_0x00bd;
                case 23: goto L_0x0603;
                case 24: goto L_0x1142;
                case 25: goto L_0x11ad;
                case 26: goto L_0x11bb;
                case 27: goto L_0x0603;
                case 28: goto L_0x11ec;
                case 29: goto L_0x1264;
                case 30: goto L_0x0616;
                case 31: goto L_0x07b9;
                case 32: goto L_0x049d;
                case 33: goto L_0x07e9;
                case 34: goto L_0x0818;
                case 35: goto L_0x0852;
                case 36: goto L_0x12bc;
                case 37: goto L_0x086d;
                case 38: goto L_0x13d0;
                case 39: goto L_0x0110;
                case 40: goto L_0x089d;
                case 41: goto L_0x08ab;
                case 42: goto L_0x011e;
                case 43: goto L_0x13ff;
                case 44: goto L_0x1414;
                case 45: goto L_0x08b9;
                case 46: goto L_0x0110;
                case 47: goto L_0x08db;
                case 48: goto L_0x090e;
                case 49: goto L_0x183f;
                case 50: goto L_0x1428;
                case 51: goto L_0x0944;
                case 52: goto L_0x0603;
                case 53: goto L_0x1432;
                case 54: goto L_0x11ad;
                case 55: goto L_0x185f;
                case 56: goto L_0x14ae;
                case 57: goto L_0x0a00;
                case 58: goto L_0x0a11;
                case 59: goto L_0x14c6;
                case 60: goto L_0x0a6a;
                case 61: goto L_0x0a84;
                case 62: goto L_0x14d6;
                case 63: goto L_0x11ad;
                case 64: goto L_0x14e2;
                case 65: goto L_0x14ec;
                case 66: goto L_0x18f8;
                case 67: goto L_0x0c55;
                case 68: goto L_0x0ca0;
                case 69: goto L_0x1551;
                case 70: goto L_0x155c;
                case 71: goto L_0x1572;
                case 72: goto L_0x0d4b;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.Object r4 = r2.A00
            X.2Jg r4 = (X.C41182Jg) r4
            android.content.DialogInterface r0 = (android.content.DialogInterface) r0
            if (r4 == 0) goto L_0x0020
            X.6dJ r1 = r4.A00
            X.7bI r1 = r1.A00
            X.2dA r3 = r1.A02
            r2 = 5
            X.9po r1 = new X.9po
            r1.<init>(r4, r2)
            X.AnonymousClass8DJ.A0B(r3, r1)
        L_0x0020:
            r0.dismiss()
        L_0x0023:
            return
        L_0x0024:
            java.lang.Object r2 = r2.A00
            X.97d r2 = (X.C1905197d) r2
            android.content.DialogInterface r0 = (android.content.DialogInterface) r0
            X.94s r3 = r2.A07
            X.9no r4 = r3.A07
            java.lang.Integer r6 = X.AnonymousClass001.A0f()
            r1 = 115(0x73, float:1.61E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.lang.String r8 = r3.A0D()
            r9 = 0
            X.303 r5 = X.C1899593h.A0K()
            java.lang.String r3 = "product_flow"
            java.lang.String r1 = "p2m"
            r5.A03(r3, r1)
            r4.BKE(r5, r6, r7, r8, r9)
            r0.dismiss()
            X.94s r0 = r2.A07
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x180c
            java.lang.Class<com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity> r0 = com.whatsapp.payments.ui.BrazilPaymentTransactionDetailActivity.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r2, r0)
            r0 = 603979776(0x24000000, float:2.7755576E-17)
            android.content.Intent r0 = r1.addFlags(r0)
            goto L_0x0584
        L_0x0062:
            java.lang.Object r4 = r2.A00
            X.97d r4 = (X.C1905197d) r4
            X.9OV r0 = (X.AnonymousClass9OV) r0
            if (r0 != 0) goto L_0x0e74
            android.widget.TextView r1 = r4.A03
            goto L_0x0e19
        L_0x006e:
            java.lang.Object r2 = r2.A00
            X.97d r2 = (X.C1905197d) r2
            X.9OU r0 = (X.AnonymousClass9OU) r0
            int r3 = r0.A01
            r1 = 1
            if (r3 == r1) goto L_0x0f35
            r1 = 2
            if (r3 == r1) goto L_0x0f4c
            r1 = 3
            if (r3 == r1) goto L_0x0f24
            r1 = 4
            if (r3 == r1) goto L_0x0eb9
            X.9PN r6 = r0.A00
            android.view.View r1 = r2.A00
            if (r6 == 0) goto L_0x0e19
            r0 = 2131431505(0x7f0b1051, float:1.8484741E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r1, r0)
            android.view.View r1 = r2.A00
            r0 = 2131434391(0x7f0b1b97, float:1.8490595E38)
            android.widget.TextView r4 = X.C18300x5.A0G(r1, r0)
            android.view.View r1 = r2.A00
            r0 = 2131434430(0x7f0b1bbe, float:1.8490674E38)
            android.widget.TextView r3 = X.C18300x5.A0G(r1, r0)
            java.lang.String r0 = r6.A02
            r5.setText(r0)
            java.lang.String r0 = r6.A03
            r4.setText(r0)
            int r0 = r6.A00
            r3.setText(r0)
            android.content.res.Resources r1 = r2.getResources()
            int r0 = r6.A01
            X.C18320x8.A11(r1, r3, r0)
            android.view.View r1 = r2.A00
            goto L_0x0a0e
        L_0x00bd:
            java.lang.Object r4 = r2.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r4 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r4
            X.9PO r0 = (X.AnonymousClass9PO) r0
            android.view.View r1 = r4.A01
            r6 = 0
            r5 = 8
            r1.setVisibility(r5)
            boolean r1 = r0.A02
            if (r1 == 0) goto L_0x00fe
            android.widget.Button r3 = r4.A02
            r2 = 22
        L_0x00d3:
            X.C204249p3.A02(r3, r4, r2)
            int r2 = r0.A00
            if (r2 > 0) goto L_0x00f8
            java.lang.String r1 = "PAY: There's no valid CTA for this market"
            com.whatsapp.util.Log.e((java.lang.String) r1)
            android.widget.Button r2 = r4.A02
            java.lang.String r1 = ""
            r2.setText(r1)
        L_0x00e6:
            boolean r1 = r0.A01
            android.view.View r0 = r4.A00
            if (r1 == 0) goto L_0x0109
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r0 = r4.A04
            r0.setVisibility(r5)
            android.view.View r0 = r4.A01
            goto L_0x16a1
        L_0x00f8:
            android.widget.Button r1 = r4.A02
            r1.setText(r2)
            goto L_0x00e6
        L_0x00fe:
            boolean r1 = r0.A01
            android.widget.Button r3 = r4.A02
            r2 = 24
            if (r1 == 0) goto L_0x00d3
            r2 = 23
            goto L_0x00d3
        L_0x0109:
            r0.setVisibility(r6)
            com.whatsapp.WaImageView r0 = r4.A04
            goto L_0x090a
        L_0x0110:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r1
            android.widget.TextView r1 = r1.A0A
            goto L_0x08d7
        L_0x011e:
            java.lang.Object r2 = r2.A00
            X.9oL r2 = (X.C203809oL) r2
            java.lang.String r0 = (java.lang.String) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x0138
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r3 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r3
            android.widget.TextView r2 = r3.A09
            r1 = 0
            r2.setVisibility(r1)
            android.widget.TextView r1 = r3.A09
            goto L_0x08d7
        L_0x0138:
            java.lang.Object r0 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r0
            android.widget.TextView r1 = r0.A09
            goto L_0x0e19
        L_0x0140:
            java.lang.Object r3 = r2.A00
            X.9DC r3 = (X.AnonymousClass9DC) r3
            X.9WE r0 = (X.AnonymousClass9WE) r0
            boolean r1 = r3 instanceof X.AnonymousClass9Bs
            if (r1 == 0) goto L_0x0023
            X.9Bs r3 = (X.AnonymousClass9Bs) r3
            int r1 = r0.A00
            r2 = 1
            if (r1 == 0) goto L_0x0158
            if (r1 != r2) goto L_0x0023
            r0 = 0
        L_0x0154:
            r3.A89(r0, r2)
            return
        L_0x0158:
            java.lang.Object r0 = r0.A01
            X.9VG r0 = (X.AnonymousClass9VG) r0
            r3.A88(r0)
            int r1 = r3.A01
            X.39Q r0 = r3.A09
            X.2xk r0 = r3.A7m(r0, r1)
            goto L_0x0154
        L_0x0168:
            java.lang.Object r2 = r2.A00
            X.9DC r2 = (X.AnonymousClass9DC) r2
            X.9WE r0 = (X.AnonymousClass9WE) r0
            java.lang.Object r1 = r0.A01
            X.9VG r1 = (X.AnonymousClass9VG) r1
            boolean r0 = r2 instanceof X.AnonymousClass9Bs
            if (r0 == 0) goto L_0x017f
            X.9Bs r2 = (X.AnonymousClass9Bs) r2
            r2.A7t()
            r2.A88(r1)
            return
        L_0x017f:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentActivity
            if (r0 == 0) goto L_0x0023
            com.whatsapp.payments.ui.BrazilPaymentActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentActivity) r2
            if (r1 == 0) goto L_0x01a4
            int r0 = r1.A00
            r2.A01 = r0
            r2.A0U = r1
        L_0x018d:
            int r0 = r2.A01
            r0 = r0 ^ 1
            r2.A01 = r0
            r2.A7I()
            if (r1 == 0) goto L_0x01a2
            X.9Uu r0 = r1.A01
            if (r0 == 0) goto L_0x01a2
            java.lang.String r0 = r0.A0F
        L_0x019e:
            r2.A7E(r0)
            return
        L_0x01a2:
            r0 = 0
            goto L_0x019e
        L_0x01a4:
            r0 = 6
            r2.A01 = r0
            goto L_0x018d
        L_0x01a8:
            java.lang.Object r12 = r2.A00
            com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity r12 = (com.whatsapp.payments.ui.BrazilMerchantDetailsListActivity) r12
            X.9Q9 r0 = (X.AnonymousClass9Q9) r0
            int r1 = r0.A01
            switch(r1) {
                case 0: goto L_0x01c6;
                case 1: goto L_0x15d1;
                case 2: goto L_0x01e5;
                case 3: goto L_0x01d9;
                case 4: goto L_0x15aa;
                case 5: goto L_0x1598;
                case 6: goto L_0x1592;
                default: goto L_0x01b3;
            }
        L_0x01b3:
            X.9bc r11 = r12.A03
            X.1VX r13 = r12.A0D
            X.34V r0 = r0.A04
            int r15 = r0.A00
            r16 = 2131891948(0x7f1216ec, float:1.941863E38)
            X.9TZ r14 = r12.A05
            X.043 r0 = r11.A01(r12, r13, r14, r15, r16)
            goto L_0x0c9c
        L_0x01c6:
            android.content.Context r0 = r12.getApplicationContext()
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity"
            r3.setClassName(r1, r0)
            goto L_0x09a9
        L_0x01d9:
            java.lang.String r2 = r0.A05
            r1 = 0
            java.lang.String r0 = "tel"
            android.net.Uri r2 = android.net.Uri.fromParts(r0, r2, r1)
            java.lang.String r0 = "android.intent.action.DIAL"
            goto L_0x01ec
        L_0x01e5:
            android.net.Uri r2 = r0.A03
            X.C626936e.A06(r2)
            java.lang.String r0 = "android.intent.action.VIEW"
        L_0x01ec:
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0, r2)
            android.content.pm.PackageManager r0 = r12.getPackageManager()
            android.content.ComponentName r0 = r1.resolveActivity(r0)
            if (r0 == 0) goto L_0x0023
            r12.startActivity(r1)
            return
        L_0x01ff:
            java.lang.Object r8 = r2.A00
            com.whatsapp.payments.ui.BrazilOrderDetailsActivity r8 = (com.whatsapp.payments.ui.BrazilOrderDetailsActivity) r8
            X.9WE r0 = (X.AnonymousClass9WE) r0
            if (r0 == 0) goto L_0x0023
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0023
            r8.A0F = r0
            X.2zR r3 = (X.C60952zR) r3
            java.lang.Boolean r1 = r3.A05
            if (r1 == 0) goto L_0x0291
            boolean r2 = r1.booleanValue()
        L_0x0217:
            int r1 = r0.A00
            if (r1 == 0) goto L_0x02c3
            r0 = 1
            if (r1 == r0) goto L_0x0293
            if (r2 == 0) goto L_0x1612
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r3 = r8.A0A
            X.2sr r7 = r8.A01
            X.2oU r12 = r3.A0R
            X.1VX r14 = r3.A0T
            X.5a2 r2 = r3.A0Y
            X.5mM r10 = r3.A0P
            X.9Wq r1 = r3.A0X
            X.33i r11 = r3.A0Q
            X.7aS r9 = r3.A0L
            X.99n r15 = r3.A0W
            X.33j r13 = r3.A0S
            X.1sV r0 = r3.A0Z
            X.2nc r8 = r3.A0G
            X.95C r6 = new X.95C
            r16 = r1
            r17 = r2
            r18 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            java.util.List r5 = r6.A0C
            r5.clear()
            r1 = 2131167679(0x7f0709bf, float:1.7949638E38)
            r4 = 0
            X.9E2 r0 = new X.9E2
            r0.<init>(r4, r1, r4)
            r5.add(r0)
            r1 = 8
            X.9NY r0 = new X.9NY
            r0.<init>(r1)
            r5.add(r0)
            r1 = 9
            X.9NY r0 = new X.9NY
            r0.<init>(r1)
            r5.add(r0)
            r1 = 10
            X.9NY r0 = new X.9NY
            r0.<init>(r1)
            r5.add(r0)
            r1 = 11
            X.9NY r0 = new X.9NY
            r0.<init>(r1)
            r5.add(r0)
            r2 = 180(0xb4, float:2.52E-43)
            r1 = 2131167680(0x7f0709c0, float:1.794964E38)
            X.9E2 r0 = new X.9E2
            r0.<init>(r2, r4, r1)
            r5.add(r0)
            androidx.recyclerview.widget.RecyclerView r0 = r3.A06
            r0.setAdapter(r6)
            return
        L_0x0291:
            r2 = 0
            goto L_0x0217
        L_0x0293:
            if (r2 != 0) goto L_0x0298
            r8.BjL()
        L_0x0298:
            X.39I r5 = r3.A02
            X.C626936e.A06(r5)
            int r0 = r5.A01
            java.lang.String r4 = r8.getString(r0)
            java.lang.String r3 = r8.A0L
            X.5ZU r2 = r8.A05
            X.3Lo r1 = r8.A07
            com.whatsapp.jid.UserJid r0 = r8.A0G
            X.3ZH r0 = r1.A01(r0)
            java.lang.String r0 = r2.A0H(r0)
            java.lang.String r2 = X.AnonymousClass11I.A01(r8, r5, r3, r0)
            r1 = 2
            X.9pf r0 = new X.9pf
            r0.<init>(r8, r1)
            X.043 r0 = X.AnonymousClass9WM.A01(r8, r0, r4, r2)
            goto L_0x0c9c
        L_0x02c3:
            if (r2 != 0) goto L_0x02c8
            r8.BjL()
        L_0x02c8:
            X.1n7 r11 = r3.A04
            X.C626936e.A06(r11)
            X.39W r0 = r11.A00
            X.C626936e.A06(r0)
            X.39S r0 = r0.A01
            X.C626936e.A06(r0)
            r0.A04()
            X.34w r9 = r3.A00
            X.213 r10 = r3.A03
            if (r10 != 0) goto L_0x02e2
            X.213 r10 = X.AnonymousClass213.NONE
        L_0x02e2:
            java.util.List r12 = r3.A06
            r8.BjL()
            X.9Rj r0 = r8.A09
            r0.A00 = r11
            X.9U4 r1 = r8.A0P
            java.lang.String r0 = "FBPAY"
            X.9oC r0 = r1.A0H(r0)
            X.C626936e.A06(r0)
            X.9Vt r0 = r0.B9W()
            if (r0 == 0) goto L_0x0300
            long r0 = r11.A1L
            r8.A02 = r0
        L_0x0300:
            X.9G5 r7 = r8.A08
            X.9QL r14 = r7.A01(r8, r9, r10, r11, r12)
            r8.A0I = r11
            r8.A0D = r14
            X.99n r0 = r8.A0O
            java.lang.String r2 = "pay_with_card_flow_enabled"
            boolean r0 = r0.A0J(r2)
            if (r0 == 0) goto L_0x0323
            X.213 r0 = X.AnonymousClass213.ACTIVE
            if (r10 != r0) goto L_0x0323
            r3 = 1
            X.4FS r1 = r8.A04
            X.9jI r0 = new X.9jI
            r0.<init>(r8, r11, r3)
            r1.BkM(r0)
        L_0x0323:
            boolean r0 = r8.A0Q
            if (r0 != 0) goto L_0x033b
            java.util.Set r1 = r8.A0R
            java.lang.String r0 = r8.A0N
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L_0x033b
            java.util.Set r1 = r8.A0S
            int r0 = r8.A00
            boolean r0 = X.C18300x5.A1X(r1, r0)
            if (r0 == 0) goto L_0x034a
        L_0x033b:
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r12 = r8.A0A
            r17 = 3
            java.lang.String r15 = "WhatsappPay"
            r16 = 0
            r13 = r10
            X.9Rl r0 = r12.A00(r13, r14, r15, r16, r17)
            r8.A0C = r0
        L_0x034a:
            boolean r0 = r8.A0Q
            if (r0 == 0) goto L_0x03a1
            X.99n r0 = r8.A0O
            boolean r0 = r0.A0J(r2)
            r4 = 0
            if (r0 == 0) goto L_0x0392
            X.213 r0 = X.AnonymousClass213.ACTIVE
            if (r10 == r0) goto L_0x0392
            X.4FS r1 = r8.A04
            X.9jI r0 = new X.9jI
            r0.<init>(r8, r11, r4)
            r1.BkM(r0)
            X.0zH r2 = X.AnonymousClass5V0.A00(r8)
            r0 = 2131891440(0x7f1214f0, float:1.94176E38)
            r2.A0U(r0)
            r0 = 2131891439(0x7f1214ef, float:1.9417598E38)
            r2.A0T(r0)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 5
            X.9qL r0 = A00(r8, r0)
            r2.A0d(r8, r0, r1)
            X.C18280x3.A0q(r2)
        L_0x0383:
            X.1n7 r0 = r8.A0I
            X.39W r0 = r0.A00
            if (r0 == 0) goto L_0x0023
            X.39S r0 = r0.A01
            if (r0 == 0) goto L_0x0023
            java.util.List r0 = r0.A0H
            r8.A0O = r0
            return
        L_0x0392:
            X.39L r3 = r14.A06
            X.4DV r2 = r14.A0B
            X.9XZ r1 = r14.A09
            java.lang.String r0 = r8.A0d
            r8.A7V(r3, r1, r2, r0)
            r8.A7W(r11, r4)
            goto L_0x0383
        L_0x03a1:
            java.util.Set r1 = r8.A0S
            int r0 = r8.A00
            boolean r0 = X.C18300x5.A1X(r1, r0)
            if (r0 == 0) goto L_0x0410
            java.util.Set r1 = r8.A0R
            java.lang.String r0 = r8.A0N
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x03d0
            java.lang.String r1 = r8.A0N
            java.lang.String r0 = "canceled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x03c8
            int r0 = r8.A00
            r8.Ba7(r0)
        L_0x03c4:
            X.C86624Kv.A0f(r8)
            goto L_0x0383
        L_0x03c8:
            X.4uZ r1 = r14.A08
            int r0 = r8.A00
            r8.BPj(r1, r0)
            goto L_0x03c4
        L_0x03d0:
            int r0 = r8.A00
            r3 = 6
            if (r0 != r3) goto L_0x03f9
            java.util.HashMap r0 = r14.A0M
            java.lang.Object r0 = X.C18290x4.A0j(r0, r3)
            X.9Rl r0 = (X.C194069Rl) r0
            X.4uZ r15 = r14.A08
            java.lang.String r2 = r14.A0D
            X.39L r14 = r14.A06
            X.394 r0 = r0.A03
            X.4Fg r1 = r0.A00
            X.3SR r1 = (X.AnonymousClass3SR) r1
            java.lang.String r0 = r8.A0d
            r13 = r8
            r16 = r1
            r17 = r2
            r18 = r0
            r13.A7U(r14, r15, r16, r17, r18)
            r8.A7W(r11, r3)
            goto L_0x0383
        L_0x03f9:
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r2 = r8.A0A
            int r1 = r14.A00
            X.9Rl r0 = r8.A0C
            boolean r0 = r2.A03(r0, r14, r1)
            if (r0 == 0) goto L_0x0383
            com.whatsapp.payments.ui.orderdetails.PaymentCheckoutOrderDetailsViewV2 r2 = r8.A0A
            X.9Rl r1 = r8.A0C
            java.lang.String r0 = r8.A0d
            r2.A01(r8, r1, r14, r0)
            goto L_0x0383
        L_0x0410:
            X.4FS r7 = r8.A04
            X.3Lv r2 = r8.A08
            X.9b0 r4 = r8.A07
            X.36F r3 = r8.A05
            X.4DV r6 = r14.A0B
            X.3Wi r1 = r8.A05
            r0 = 0
            X.9ol r5 = new X.9ol
            r5.<init>(r8, r10, r14, r0)
            X.AnonymousClass35F.A02(r1, r2, r3, r4, r5, r6, r7)
            goto L_0x0383
        L_0x0427:
            java.lang.Object r2 = r2.A00
            com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity r2 = (com.whatsapp.payments.ui.BrazilPaymentCardDetailsActivity) r2
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            r2.BjL()
            java.lang.Object r1 = r0.A00
            if (r1 != 0) goto L_0x0438
            java.lang.String r0 = "BrazilPaymentCardDetailsActivity/on-network-error error is null"
            goto L_0x19c6
        L_0x0438:
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x0458
            X.34V r0 = (X.AnonymousClass34V) r0
            int r5 = r0.A00
        L_0x0440:
            r6 = 2131893926(0x7f121ea6, float:1.9422642E38)
            int r0 = X.AnonymousClass001.A0K(r1)
            if (r0 != 0) goto L_0x044c
            r6 = 2131891750(0x7f121626, float:1.9418229E38)
        L_0x044c:
            X.9bc r1 = r2.A04
            X.1VX r3 = r2.A0D
            X.9TZ r4 = r2.A08
            X.043 r0 = r1.A01(r2, r3, r4, r5, r6)
            goto L_0x0c9c
        L_0x0458:
            r5 = -1
            goto L_0x0440
        L_0x045a:
            java.lang.Object r1 = r2.A00
            X.4ea r1 = (X.C89654ea) r1
            int r0 = X.AnonymousClass001.A0K(r0)
            if (r0 != 0) goto L_0x0023
            r0 = 2131891753(0x7f121629, float:1.9418235E38)
            r1.Bot(r0)
            return
        L_0x046b:
            java.lang.Object r3 = r2.A00
            X.9By r3 = (X.C191109By) r3
            X.34V r0 = (X.AnonymousClass34V) r0
            r3.BjL()
            X.9WM r2 = r3.A06
            int r1 = r0.A00
            r0 = 0
            X.043 r0 = r2.A04(r3, r0, r0, r1)
            if (r0 == 0) goto L_0x0023
            goto L_0x0c9c
        L_0x0481:
            java.lang.Object r1 = r2.A00
            X.9C3 r1 = (X.AnonymousClass9C3) r1
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r0 == 0) goto L_0x0023
            X.9NB r3 = new X.9NB
            r3.<init>(r1)
            X.4FS r2 = r1.A0I
            X.9U4 r1 = r1.A0D
            X.9GP r0 = new X.9GP
            r0.<init>(r3, r1)
            X.C18270x1.A0w(r0, r2)
            return
        L_0x049d:
            java.lang.Object r2 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r2
            X.7kF r0 = (X.C158597kF) r0
            X.34V r1 = r0.A01
            if (r1 != 0) goto L_0x1649
            X.34V r1 = r0.A00
            if (r1 != 0) goto L_0x1649
            boolean r1 = r0.A05
            if (r1 != 0) goto L_0x163f
            boolean r1 = r0.A03
            if (r1 != 0) goto L_0x163f
            X.7yE r1 = r2.A0B
            if (r1 == 0) goto L_0x0023
            java.lang.String r3 = r1.A03
            java.lang.String r1 = "numeric_id"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0561
            java.lang.String r1 = "mobile_number"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0567
            java.lang.String r1 = "Unexpected value received"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x04ce:
            android.widget.TextView r3 = r2.A05
            X.7yE r1 = r2.A0B
            X.7yt r1 = r1.A00
            java.lang.Object r1 = r1.A00
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r3.setText(r1)
            android.widget.TextView r3 = r2.A05
            r1 = 2130970871(0x7f0408f7, float:1.7550464E38)
            r4 = 2131102551(0x7f060b57, float:1.7817543E38)
            X.AnonymousClass5Yj.A0B(r2, r3, r1, r4)
            X.7yE r1 = r2.A0B
            java.lang.String r3 = r1.A02
            java.lang.String r1 = "active"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0532
            java.lang.String r1 = "inactive"
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L_0x0548
            java.lang.String r1 = "Unexpected value received"
            com.whatsapp.util.Log.i((java.lang.String) r1)
        L_0x04ff:
            boolean r1 = r0.A04
            r5 = 8
            r3 = 0
            if (r1 != 0) goto L_0x1619
            boolean r0 = r0.A02
            if (r0 != 0) goto L_0x1619
            r0 = 2131102581(0x7f060b75, float:1.7817604E38)
            int r1 = X.AnonymousClass0Y8.A04(r2, r0)
            android.widget.ImageView r0 = r2.A01
            X.C107335b8.A0E(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.A07
            r0.setVisibility(r5)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.A08
            r0.setVisibility(r3)
            android.widget.TextView r1 = r2.A06
            r0 = 2130970871(0x7f0408f7, float:1.7550464E38)
            X.AnonymousClass5Yj.A0B(r2, r1, r0, r4)
            android.widget.LinearLayout r0 = r2.A03
            r1 = 1
            r0.setEnabled(r1)
            android.widget.LinearLayout r0 = r2.A02
            goto L_0x185b
        L_0x0532:
            android.widget.TextView r3 = r2.A04
            r1 = 2131894839(0x7f122237, float:1.9424494E38)
            r3.setText(r1)
            android.widget.TextView r3 = r2.A06
            r1 = 2131894841(0x7f122239, float:1.9424498E38)
            r3.setText(r1)
            android.widget.ImageView r3 = r2.A01
            r1 = 2131232813(0x7f08082d, float:1.8081746E38)
            goto L_0x055d
        L_0x0548:
            android.widget.TextView r3 = r2.A04
            r1 = 2131894845(0x7f12223d, float:1.9424506E38)
            r3.setText(r1)
            android.widget.TextView r3 = r2.A06
            r1 = 2131894837(0x7f122235, float:1.942449E38)
            r3.setText(r1)
            android.widget.ImageView r3 = r2.A01
            r1 = 2131232812(0x7f08082c, float:1.8081744E38)
        L_0x055d:
            r3.setImageResource(r1)
            goto L_0x04ff
        L_0x0561:
            android.widget.ImageView r3 = r2.A00
            r1 = 2131232809(0x7f080829, float:1.8081738E38)
            goto L_0x056c
        L_0x0567:
            android.widget.ImageView r3 = r2.A00
            r1 = 2131232691(0x7f0807b3, float:1.8081498E38)
        L_0x056c:
            r3.setImageResource(r1)
            goto L_0x04ce
        L_0x0571:
            java.lang.Object r2 = r2.A00
            android.content.Context r2 = (android.content.Context) r2
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L_0x0023
            java.lang.String r3 = "android.intent.action.VIEW"
            android.net.Uri r1 = android.net.Uri.parse(r0)
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r3, r1)
        L_0x0584:
            r2.startActivity(r0)
            return
        L_0x0588:
            java.lang.Object r3 = r2.A00
            X.9BX r3 = (X.AnonymousClass9BX) r3
            X.34V r0 = (X.AnonymousClass34V) r0
            r3.BjL()
            X.9WM r2 = r3.A0G
            int r1 = r0.A00
            r0 = 0
            X.043 r0 = r2.A04(r3, r0, r0, r1)
            if (r0 != 0) goto L_0x0c9c
            r1 = -1
            r0 = 2131893926(0x7f121ea6, float:1.9422642E38)
            r3.A7A(r1, r0)
            return
        L_0x05a4:
            java.lang.Object r4 = r2.A00
            X.9BX r4 = (X.AnonymousClass9BX) r4
            boolean r1 = X.AnonymousClass001.A1Z(r0)
            boolean r0 = r4 instanceof com.whatsapp.payments.ui.BrazilDyiReportActivity
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0023
            X.9NB r3 = new X.9NB
            r3.<init>(r4)
            X.4FS r2 = r4.A04
            X.9U4 r1 = r4.A0I
            X.9GP r0 = new X.9GP
            r0.<init>(r3, r1)
            X.C18270x1.A0w(r0, r2)
            return
        L_0x05c4:
            java.lang.Object r9 = r2.A00
            X.9BX r9 = (X.AnonymousClass9BX) r9
            X.9Oy r0 = (X.C193519Oy) r0
            if (r0 == 0) goto L_0x0023
            long r4 = r0.A00
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 <= 0) goto L_0x0023
            long r2 = r0.A01
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 <= 0) goto L_0x05f9
            com.whatsapp.WaTextView r8 = r9.A06
            r7 = 2131889542(0x7f120d86, float:1.941375E38)
            java.lang.Object[] r6 = X.AnonymousClass002.A0M()
            X.33j r0 = r9.A0B
            java.lang.String r1 = X.C107505bQ.A05(r0, r4)
            r0 = 0
            r6[r0] = r1
            X.33j r0 = r9.A0B
            java.lang.String r1 = X.AnonymousClass35V.A03(r0, r2)
            r0 = 1
            r6[r0] = r1
            X.AnonymousClass001.A0y(r9, r8, r6, r7)
            return
        L_0x05f9:
            com.whatsapp.WaTextView r1 = r9.A06
            X.33j r0 = r9.A0B
            java.lang.String r0 = X.C107505bQ.A05(r0, r4)
            goto L_0x08d7
        L_0x0603:
            java.lang.Object r2 = r2.A00
            X.4ea r2 = (X.C89654ea) r2
            X.9OX r0 = (X.AnonymousClass9OX) r0
            r2.BjL()
            boolean r1 = r0.A01
            if (r1 != 0) goto L_0x0023
            java.lang.String r0 = r0.A00
            r2.A6f(r0)
            return
        L_0x0616:
            java.lang.Object r7 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiMyQrFragment r7 = (com.whatsapp.payments.ui.IndiaUpiMyQrFragment) r7
            X.9Of r0 = (X.C193369Of) r0
            int r4 = r0.A01
            r1 = 3
            r6 = 1
            if (r4 == 0) goto L_0x0667
            if (r4 == r6) goto L_0x06c0
            if (r4 != r1) goto L_0x06c7
            int r0 = r0.A00
            if (r0 != 0) goto L_0x0023
            com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView r2 = r7.A0C
            r1 = 8
            android.widget.TextView r0 = r2.A05
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r1)
            android.widget.TextView r0 = r2.A08
            r0.setVisibility(r1)
            r0 = 0
            r7.A1J(r0)
            android.view.View r0 = r7.A00
            r0.setDrawingCacheEnabled(r6)
            X.5I4 r1 = r7.A0E
            X.03q r0 = r7.A0R()
            android.content.Context r5 = r0.getApplicationContext()
            android.view.View r4 = r7.A00
            X.9dz r3 = new X.9dz
            r3.<init>(r7)
            X.4FS r2 = r1.A01
            X.3Dh r1 = r1.A00
            X.9Gm r0 = new X.9Gm
            r0.<init>(r5, r4, r1, r3)
            X.C18270x1.A0w(r0, r2)
            r7.A1J(r6)
            return
        L_0x0667:
            X.7ae r1 = r7.A0B
            X.4Fi r10 = r1.A01()
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = r7.A0D
            X.9Wl r1 = r1.A0D()
            java.lang.String r1 = r1.A0A
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r5 = 0
            if (r1 != 0) goto L_0x06ae
            if (r10 == 0) goto L_0x06ae
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = r7.A0D
            X.9Wl r1 = r1.A0D()
            java.lang.String r1 = r1.A0A
            X.39Q r9 = X.C1899693i.A0B(r10, r1)
            android.widget.TextView r8 = r7.A03
            r3 = 2131893288(0x7f121c28, float:1.9421348E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.33j r1 = r7.A0A
            java.lang.String r1 = r10.B3V(r1, r9)
            r2[r5] = r1
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = r7.A0D
            X.9Wl r1 = r1.A0D()
            java.lang.String r1 = r1.A09
            r2[r6] = r1
        L_0x06a5:
            X.C1899693i.A0l(r8, r7, r2, r3)
            android.widget.TextView r1 = r7.A03
            r1.setVisibility(r5)
            goto L_0x06c7
        L_0x06ae:
            android.widget.TextView r8 = r7.A03
            r3 = 2131893289(0x7f121c29, float:1.942135E38)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = r7.A0D
            X.9Wl r1 = r1.A0D()
            java.lang.String r1 = r1.A09
            r2[r5] = r1
            goto L_0x06a5
        L_0x06c0:
            android.widget.TextView r2 = r7.A03
            r1 = 8
            r2.setVisibility(r1)
        L_0x06c7:
            com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView r2 = r7.A0C
            int r7 = r0.A00
            r5 = 0
            r3 = 8
            if (r4 == 0) goto L_0x0725
            if (r4 == r6) goto L_0x0700
            r0 = 2
            if (r4 != r0) goto L_0x0023
            android.widget.FrameLayout r0 = r2.A01
            r0.setVisibility(r5)
            com.whatsapp.QrImageView r0 = r2.A0A
            r0.setVisibility(r3)
            android.view.View r0 = r2.A00
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r2.A03
            r0.setVisibility(r3)
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r2.A0F
            r0.A05()
        L_0x06ee:
            X.3Mh r1 = r2.A0B
            X.1Ei r0 = X.C66663Mh.A0i
            r1.A08(r0)
            android.widget.LinearLayout r0 = r2.A04
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A08
        L_0x06fc:
            r0.setVisibility(r3)
            return
        L_0x0700:
            com.whatsapp.QrImageView r0 = r2.A0A
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r2.A03
            r0.setVisibility(r3)
            android.widget.FrameLayout r0 = r2.A01
            r0.setVisibility(r3)
            android.widget.TextView r1 = r2.A07
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r0 = r2.A00
            r0.setVisibility(r5)
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r2.A0F
            r0.requestFocus()
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r2.A0F
            r0.A07(r6)
            goto L_0x06ee
        L_0x0725:
            android.widget.FrameLayout r0 = r2.A01
            r0.setVisibility(r3)
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r2.A0F
            r0.A05()
            com.whatsapp.QrImageView r0 = r2.A0A
            r0.setVisibility(r5)
            android.view.View r0 = r2.A00
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r2.A03
            r0.setVisibility(r5)
            java.lang.Class<X.6vY> r0 = X.C141426vY.class
            java.util.EnumMap r4 = new java.util.EnumMap     // Catch:{ 6zg -> 0x0762 }
            r4.<init>(r0)     // Catch:{ 6zg -> 0x0762 }
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r2.A0G     // Catch:{ 6zg -> 0x0762 }
            X.9Wl r0 = r0.A0D()     // Catch:{ 6zg -> 0x0762 }
            java.lang.String r1 = r0.A06()     // Catch:{ 6zg -> 0x0762 }
            X.21X r0 = X.AnonymousClass21X.L     // Catch:{ 6zg -> 0x0762 }
            X.7To r4 = X.C159727mM.A00(r0, r1, r4)     // Catch:{ 6zg -> 0x0762 }
            r2.A09 = r4     // Catch:{ 6zg -> 0x0762 }
            com.whatsapp.QrImageView r1 = r2.A0A     // Catch:{ 6zg -> 0x0762 }
            X.9a6 r0 = new X.9a6     // Catch:{ 6zg -> 0x0762 }
            r0.<init>(r2, r7)     // Catch:{ 6zg -> 0x0762 }
            r1.setQrCode(r4, r0)     // Catch:{ 6zg -> 0x0762 }
            goto L_0x076a
        L_0x0762:
            r4 = move-exception
            X.7oG r1 = r2.A0J
            java.lang.String r0 = "display-qrcode/"
            r1.A0A(r0, r4)
        L_0x076a:
            X.3Mh r1 = r2.A0B
            X.1Ei r0 = X.C66663Mh.A0i
            boolean r0 = r1.A08(r0)
            if (r0 != 0) goto L_0x079a
            android.widget.LinearLayout r0 = r2.A04
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A08
        L_0x077b:
            r0.setVisibility(r3)
        L_0x077e:
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r2.A0G
            X.9Wl r0 = r0.A0D()
            java.lang.String r0 = r0.A0A
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r0 = r2.A06
            if (r1 != 0) goto L_0x1697
            r0.setVisibility(r5)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r5)
            android.widget.TextView r0 = r2.A05
            goto L_0x06fc
        L_0x079a:
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r2.A0G
            X.9Wl r0 = r0.A0D()
            java.lang.String r0 = r0.A0I
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            android.widget.TextView r0 = r2.A08
            if (r1 != 0) goto L_0x07b3
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r2.A04
            r0.setVisibility(r5)
            goto L_0x077e
        L_0x07b3:
            r0.setVisibility(r5)
            android.widget.LinearLayout r0 = r2.A04
            goto L_0x077b
        L_0x07b9:
            java.lang.Object r0 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiMyQrFragment r0 = (com.whatsapp.payments.ui.IndiaUpiMyQrFragment) r0
            com.whatsapp.payments.ui.widget.IndiaUpiDisplaySecureQrCodeView r5 = r0.A0C
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r0 = r5.A0G
            X.9Wl r0 = r0.A0D()
            java.lang.String r1 = r0.A0A
            if (r1 == 0) goto L_0x0023
            X.7ae r0 = r5.A0E
            X.4Fi r0 = r0.A01()
            X.39Q r4 = X.C1899693i.A0B(r0, r1)
            android.widget.TextView r3 = r5.A06
            android.content.Context r2 = r5.getContext()
            X.33j r1 = r5.A0C
            X.7ae r0 = r5.A0E
            X.4Fi r0 = r0.A01()
            android.text.SpannableStringBuilder r0 = X.AnonymousClass9UO.A00(r2, r1, r0, r4)
            r3.setText(r0)
            return
        L_0x07e9:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r3 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r3
            X.9QA r0 = (X.AnonymousClass9QA) r0
            int r2 = r0.A00
            if (r2 == 0) goto L_0x16ac
            r1 = 2
            if (r2 == r1) goto L_0x16a5
            r1 = 3
            if (r2 != r1) goto L_0x0023
            r3.BjL()
            X.34V r0 = r0.A04
            r2 = 0
            if (r0 == 0) goto L_0x080b
            X.9WM r1 = r3.A05
            int r0 = r0.A00
            X.043 r0 = r1.A03(r3, r2, r2, r0)
            if (r0 != 0) goto L_0x0c9c
        L_0x080b:
            r0 = 2131891948(0x7f1216ec, float:1.941863E38)
            java.lang.String r0 = r3.getString(r0)
            X.043 r0 = X.AnonymousClass9WM.A00(r3, r2, r0)
            goto L_0x0c9c
        L_0x0818:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r3 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            android.widget.FrameLayout r1 = r3.A0B
            r1.removeAllViews()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0023
            android.widget.FrameLayout r0 = r3.A0B
            android.view.LayoutInflater r2 = X.C18280x3.A0D(r0)
            r1 = 2131625172(0x7f0e04d4, float:1.8877544E38)
            android.widget.FrameLayout r0 = r3.A0B
            android.view.View r2 = X.C86664Kz.A0h(r2, r0, r1)
            android.content.Context r1 = r3.A0G()
            r0 = 2131102437(0x7f060ae5, float:1.7817312E38)
            int r1 = X.AnonymousClass0Y8.A04(r1, r0)
            r0 = 2131431162(0x7f0b0efa, float:1.8484045E38)
            X.C1899593h.A0m(r2, r0, r1)
            r0 = 68
            X.C204249p3.A02(r2, r3, r0)
            android.widget.FrameLayout r1 = r3.A0B
            goto L_0x0a0e
        L_0x0852:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r3 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            android.widget.FrameLayout r1 = r3.A0B
            if (r1 == 0) goto L_0x0023
            r2 = 2131432360(0x7f0b13a8, float:1.8486475E38)
            android.view.View r1 = r1.findViewById(r2)
            if (r1 == 0) goto L_0x0023
            android.widget.FrameLayout r1 = r3.A0B
            android.view.View r1 = r1.findViewById(r2)
            goto L_0x0a08
        L_0x086d:
            java.lang.Object r4 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r4 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r4
            X.7kF r0 = (X.C158597kF) r0
            X.34V r1 = r0.A01
            if (r1 != 0) goto L_0x16cc
            X.34V r1 = r0.A00
            if (r1 != 0) goto L_0x16cc
            boolean r1 = r0.A02
            r3 = 1
            if (r1 == 0) goto L_0x0884
            r4.A7X(r3)
            return
        L_0x0884:
            boolean r1 = r0.A03
            r2 = 0
            if (r1 == 0) goto L_0x088d
            r4.A7X(r2)
            return
        L_0x088d:
            boolean r1 = r0.A04
            if (r1 == 0) goto L_0x0895
            r4.A7Y(r3)
            return
        L_0x0895:
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x0023
            r4.A7Y(r2)
            return
        L_0x089d:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r1
            android.widget.LinearLayout r1 = r1.A05
            goto L_0x0a08
        L_0x08ab:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r1
            android.view.View r1 = r1.A00
            goto L_0x0a08
        L_0x08b9:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            X.9Uk r0 = (X.C194769Uk) r0
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r3 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r3
            android.widget.LinearLayout r2 = r3.A04
            int r1 = r0.A00
            r2.setVisibility(r1)
            if (r1 != 0) goto L_0x0023
            android.view.View r2 = r3.A01
            r1 = 2131432117(0x7f0b12b5, float:1.8485982E38)
            android.widget.TextView r1 = X.AnonymousClass002.A09(r2, r1)
            java.lang.String r0 = r0.A01
        L_0x08d7:
            r1.setText(r0)
            return
        L_0x08db:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            X.9P7 r0 = (X.AnonymousClass9P7) r0
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r3 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r3
            int r2 = r0.A00
            java.lang.String r8 = "qr_code_scan_prompt"
            r1 = 1
            if (r2 == 0) goto L_0x1708
            r7 = 0
            r6 = 0
            if (r2 == r1) goto L_0x16d2
            r0 = 10
            if (r2 != r0) goto L_0x0023
            X.9ca r4 = r3.A0M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            java.lang.String r1 = "qr_code_scan_error"
            java.lang.String r0 = r3.A0P
            r4.BKB(r2, r7, r1, r0)
            android.widget.Button r1 = r3.A02
            r0 = 8
            r1.setVisibility(r0)
            android.widget.TextView r0 = r3.A0A
        L_0x090a:
            r0.setVisibility(r6)
            return
        L_0x090e:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            X.9Pk r0 = (X.C193639Pk) r0
            java.lang.Object r2 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r2 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r2
            int r1 = r0.A00
            r3 = 0
            switch(r1) {
                case 0: goto L_0x180c;
                case 1: goto L_0x0926;
                case 2: goto L_0x1828;
                case 3: goto L_0x182b;
                case 4: goto L_0x182e;
                case 5: goto L_0x17bb;
                case 6: goto L_0x1813;
                case 7: goto L_0x1831;
                case 8: goto L_0x1838;
                default: goto L_0x091e;
            }
        L_0x091e:
            java.lang.String r0 = r0.A02
            r2.A08 = r0
            r0 = 41
            goto L_0x186d
        L_0x0926:
            X.34V r0 = r0.A01
            if (r0 == 0) goto L_0x1825
            X.9WM r5 = r2.A03
            int r4 = r0.A00
            r0 = 17
            X.9pf r3 = new X.9pf
            r3.<init>(r2, r0)
            r1 = 18
            X.9pf r0 = new X.9pf
            r0.<init>(r2, r1)
            X.043 r0 = r5.A03(r2, r3, r0, r4)
            if (r0 == 0) goto L_0x1825
            goto L_0x0c9c
        L_0x0944:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r3 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r3
            X.9Ut r0 = (X.C194859Ut) r0
            boolean r1 = r0.A07
            if (r1 == 0) goto L_0x0956
            com.whatsapp.jid.UserJid r1 = r0.A00
            X.7yt r0 = r0.A03
            r3.A1K(r1, r0)
            return
        L_0x0956:
            X.5Wv r2 = r3.A0O
            android.widget.EditText r1 = r3.A00
            r2.A02(r1)
            X.9Rz r1 = r3.A0J
            if (r1 == 0) goto L_0x0023
            boolean r1 = r0.A0A
            if (r1 == 0) goto L_0x09ad
            X.7yt r6 = r0.A03
            boolean r1 = X.C161527pr.A02(r6)
            if (r1 != 0) goto L_0x09ad
            X.7yt r5 = r0.A01
            boolean r1 = X.C161527pr.A02(r5)
            if (r1 != 0) goto L_0x09ad
            X.9Rz r4 = r3.A0J
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r4.A01
            if (r0 == 0) goto L_0x097e
            r0.A1K()
        L_0x097e:
            X.9Zz r2 = r4.A05
            android.content.Context r12 = r4.A03
            r0 = 0
            r1 = 1
            android.content.Intent r3 = r2.A01(r12, r0, r1)
            X.C626936e.A06(r6)
            java.lang.String r0 = "extra_payment_handle"
            r3.putExtra(r0, r6)
            X.C626936e.A06(r5)
            java.lang.String r0 = "extra_payee_name"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "verify-vpa-in-background"
            r3.putExtra(r0, r1)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = r4.A07
            r3.putExtra(r1, r0)
        L_0x09a4:
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r3.addFlags(r0)
        L_0x09a9:
            r12.startActivity(r3)
            return
        L_0x09ad:
            X.9Rz r7 = r3.A0J
            X.7yt r11 = r0.A03
            java.lang.String r10 = r0.A05
            X.7yt r9 = r0.A01
            X.7yt r8 = r0.A02
            boolean r5 = r0.A08
            boolean r4 = r0.A09
            java.lang.String r6 = r0.A06
            java.lang.String r2 = r0.A04
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r7.A01
            if (r0 == 0) goto L_0x09c6
            r0.A1K()
        L_0x09c6:
            X.9Zz r3 = r7.A05
            android.content.Context r12 = r7.A03
            r1 = 0
            r0 = 1
            android.content.Intent r3 = r3.A01(r12, r1, r0)
            java.lang.String r0 = "extra_payment_handle"
            r3.putExtra(r0, r11)
            java.lang.String r0 = "extra_payment_handle_id"
            r3.putExtra(r0, r10)
            java.lang.String r0 = "extra_payee_name"
            r3.putExtra(r0, r9)
            java.lang.String r0 = "extra_payment_upi_number"
            r3.putExtra(r0, r8)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = r7.A07
            r3.putExtra(r1, r0)
            java.lang.String r0 = "extra_transaction_token"
            r3.putExtra(r0, r6)
            java.lang.String r0 = "extra_transaction_is_merchant"
            r3.putExtra(r0, r5)
            java.lang.String r0 = "extra_transaction_is_valid_merchant"
            r3.putExtra(r0, r4)
            java.lang.String r0 = "extra_merchant_code"
            r3.putExtra(r0, r2)
            goto L_0x09a4
        L_0x0a00:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity r1 = (com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity) r1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            android.widget.FrameLayout r1 = r1.A00
        L_0x0a08:
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0e19
        L_0x0a0e:
            r0 = 0
            goto L_0x0e1b
        L_0x0a11:
            java.lang.Object r2 = r2.A00
            X.9d8 r2 = (X.C197419d8) r2
            X.9WE r0 = (X.AnonymousClass9WE) r0
            if (r0 == 0) goto L_0x0023
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x0023
            X.2zR r3 = (X.C60952zR) r3
            java.lang.Boolean r1 = r3.A05
            if (r1 == 0) goto L_0x0a39
            boolean r4 = r1.booleanValue()
        L_0x0a27:
            int r1 = r0.A00
            if (r1 == 0) goto L_0x1871
            r0 = 1
            if (r1 == r0) goto L_0x0a3b
            if (r4 != 0) goto L_0x0023
            X.4eZ r1 = r2.A01
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r1.Bp9(r0)
            return
        L_0x0a39:
            r4 = 0
            goto L_0x0a27
        L_0x0a3b:
            if (r4 != 0) goto L_0x0a42
            X.4eZ r0 = r2.A01
            r0.BjL()
        L_0x0a42:
            X.39I r6 = r3.A02
            X.C626936e.A06(r6)
            X.4eZ r5 = r2.A01
            int r0 = r6.A01
            java.lang.String r4 = r5.getString(r0)
            X.4eZ r3 = r2.A01
            java.lang.String r1 = r2.A0D
            X.9nk r0 = r2.A03
            java.lang.String r0 = r0.BBy()
            java.lang.String r3 = X.AnonymousClass11I.A01(r3, r6, r1, r0)
            r1 = 22
            X.9pf r0 = new X.9pf
            r0.<init>(r2, r1)
            X.043 r0 = X.AnonymousClass9WM.A01(r5, r0, r4, r3)
            goto L_0x0c9c
        L_0x0a6a:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r3 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r3
            X.9WE r0 = (X.AnonymousClass9WE) r0
            int r1 = r0.A00
            if (r1 != 0) goto L_0x0023
            java.lang.Object r2 = r0.A01
            X.9VG r2 = (X.AnonymousClass9VG) r2
            r3.A0q = r2
            X.94t r1 = r3.A0x
            if (r1 == 0) goto L_0x0023
            X.9W0 r0 = r3.A0y
            r1.A0J(r2, r0)
            return
        L_0x0a84:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r5 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r5
            X.9W0 r0 = (X.AnonymousClass9W0) r0
            if (r0 == 0) goto L_0x0c3c
            android.widget.LinearLayout r2 = r5.A0E
            int r1 = r0.A00
            android.view.View r1 = r2.findViewById(r1)
            if (r1 != 0) goto L_0x0ad7
            X.9G2 r2 = r5.A0z
            if (r2 == 0) goto L_0x0a9f
            android.widget.LinearLayout r1 = r5.A0E
            r1.removeView(r2)
        L_0x0a9f:
            int r3 = r0.A01
            r1 = 1
            X.03q r2 = r5.A0R()
            if (r3 != r1) goto L_0x0c28
            X.9G9 r1 = new X.9G9
            r1.<init>(r2)
            r5.A0z = r1
            java.lang.String r7 = r5.A16
            java.lang.String r6 = "incentive_banner"
            X.9VG r4 = r5.A0q
        L_0x0ab5:
            X.94t r3 = r5.A0x
            if (r3 == 0) goto L_0x0ac8
            android.os.Bundle r2 = r5.A06
            if (r2 == 0) goto L_0x0c25
            java.lang.String r1 = "extra_deep_link_url"
            android.os.Parcelable r1 = r2.getParcelable(r1)
            android.net.Uri r1 = (android.net.Uri) r1
        L_0x0ac5:
            r3.A0I(r1, r4, r7, r6)
        L_0x0ac8:
            android.widget.LinearLayout r6 = r5.A0E
            X.9G2 r4 = r5.A0z
            r3 = -1
            r1 = -2
            android.view.ViewGroup$LayoutParams r2 = new android.view.ViewGroup$LayoutParams
            r2.<init>(r3, r1)
            r1 = 0
            r6.addView(r4, r1, r2)
        L_0x0ad7:
            r5.A0y = r0
            android.widget.LinearLayout r2 = r5.A0E
            int r1 = r0.A02
            r2.setVisibility(r1)
            if (r1 != 0) goto L_0x0c38
            X.9G2 r1 = r5.A0z
            if (r1 == 0) goto L_0x0c38
            android.view.View r2 = r5.A04
            r1 = 0
            r2.setVisibility(r1)
            X.9OP r4 = new X.9OP
            r4.<init>(r5, r0)
            X.9G2 r7 = r5.A0z
            android.content.Context r9 = r7.getContext()
            android.widget.ImageButton r3 = r7.A03
            int r5 = r0.A03
            r3.setVisibility(r5)
            X.9VI r10 = r0.A06
            if (r10 == 0) goto L_0x0b3a
            int r1 = r10.A01
            android.graphics.drawable.Drawable r1 = X.AnonymousClass0RP.A00(r9, r1)
            X.C626936e.A06(r1)
            android.widget.ImageView r8 = r7.A04
            r8.setImageDrawable(r1)
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.content.res.Resources r2 = r7.getResources()
            int r1 = r10.A00
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            r6.height = r1
            android.view.ViewGroup$LayoutParams r6 = r8.getLayoutParams()
            android.content.res.Resources r2 = r7.getResources()
            int r1 = r10.A03
            float r1 = r2.getDimension(r1)
            int r1 = (int) r1
            r6.width = r1
            int r2 = r10.A02
            r1 = -1
            if (r2 == r1) goto L_0x0b3a
            X.C1899593h.A0i(r9, r8, r2)
        L_0x0b3a:
            android.widget.TextView r6 = r7.A05
            r10 = 1
            if (r6 == 0) goto L_0x0b5a
            X.9WK r2 = r0.A0C
            int r1 = r2.A01
            r6.setVisibility(r1)
            if (r1 != 0) goto L_0x0b5a
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r1 = r2.A00(r1)
            r6.setText(r1)
            android.graphics.Typeface r1 = r6.getTypeface()
            r6.setTypeface(r1, r10)
        L_0x0b5a:
            com.whatsapp.TextEmojiLabel r6 = r7.A06
            X.9WK r8 = r0.A0B
            int r1 = r8.A01
            r6.setVisibility(r1)
            r2 = 0
            if (r1 != 0) goto L_0x0ba1
            java.lang.String r9 = r8.A02
            if (r9 == 0) goto L_0x0c11
            X.5a2 r11 = r7.A02
            android.content.Context r12 = r6.getContext()
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r13 = r8.A00(r1)
            java.lang.String r1 = "learn-more"
            java.lang.String[] r15 = new java.lang.String[]{r1}
            java.lang.String[] r8 = new java.lang.String[r10]
            r8[r2] = r9
            java.lang.Runnable[] r14 = new java.lang.Runnable[r10]
            java.util.Objects.requireNonNull(r4)
            X.9h7 r1 = new X.9h7
            r1.<init>(r4)
            r14[r2] = r1
            r16 = r8
            android.text.SpannableString r8 = r11.A04(r12, r13, r14, r15, r16)
            X.33i r1 = r7.A00
            X.AnonymousClass0x2.A12(r6, r1)
            X.1VX r1 = r7.A01
            X.AnonymousClass0x2.A14(r1, r6)
        L_0x0b9e:
            r6.setText(r8)
        L_0x0ba1:
            com.whatsapp.wds.components.button.WDSButton r9 = r7.A07
            int r1 = r0.A04
            r9.setVisibility(r1)
            r8 = 0
            if (r1 != 0) goto L_0x0c0d
            X.9WK r6 = r0.A0A
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r6 = r6.A00(r1)
            java.lang.CharSequence r1 = r9.getText()
            boolean r1 = r1.equals(r6)
            if (r1 != 0) goto L_0x0bc2
            r9.setText(r6)
        L_0x0bc2:
            X.9VI r1 = r0.A07
            if (r1 == 0) goto L_0x0c09
            int r1 = r1.A01
            r9.setIcon((int) r1)
        L_0x0bcb:
            r6 = 32
            X.9pJ r1 = new X.9pJ
            r1.<init>((X.AnonymousClass9OP) r4, (X.AnonymousClass9W0) r0, (int) r6)
            r9.setOnClickListener(r1)
        L_0x0bd5:
            com.whatsapp.wds.components.button.WDSButton r6 = r7.A08
            int r1 = r0.A05
            r6.setVisibility(r1)
            if (r1 != 0) goto L_0x0c05
            X.9VI r1 = r0.A08
            if (r1 == 0) goto L_0x0c01
            int r1 = r1.A01
            r6.setIcon((int) r1)
        L_0x0be7:
            r2 = 33
            X.9pJ r1 = new X.9pJ
            r1.<init>((X.AnonymousClass9OP) r4, (X.AnonymousClass9W0) r0, (int) r2)
            r6.setOnClickListener(r1)
        L_0x0bf1:
            r3.setVisibility(r5)
            if (r5 != 0) goto L_0x0bfd
            r1 = 34
            X.9pJ r8 = new X.9pJ
            r8.<init>((X.AnonymousClass9OP) r4, (X.AnonymousClass9W0) r0, (int) r1)
        L_0x0bfd:
            r3.setOnClickListener(r8)
            return
        L_0x0c01:
            r6.setIcon((int) r2)
            goto L_0x0be7
        L_0x0c05:
            r6.setOnClickListener(r8)
            goto L_0x0bf1
        L_0x0c09:
            r9.setIcon((int) r2)
            goto L_0x0bcb
        L_0x0c0d:
            r9.setOnClickListener(r8)
            goto L_0x0bd5
        L_0x0c11:
            android.content.res.Resources r1 = r7.getResources()
            java.lang.String r8 = r8.A00(r1)
            java.lang.CharSequence r1 = r6.getText()
            boolean r1 = r1.equals(r8)
            if (r1 != 0) goto L_0x0ba1
            goto L_0x0b9e
        L_0x0c25:
            r1 = 0
            goto L_0x0ac5
        L_0x0c28:
            X.9G2 r1 = new X.9G2
            r1.<init>(r2)
            r5.A0z = r1
            java.lang.String r7 = r5.A16
            java.lang.String r6 = r5.A1X()
            r4 = 0
            goto L_0x0ab5
        L_0x0c38:
            android.view.View r1 = r5.A04
            goto L_0x0e19
        L_0x0c3c:
            java.lang.String r4 = r5.A16
            r3 = 0
            X.94t r2 = r5.A0x
            if (r2 == 0) goto L_0x0023
            android.os.Bundle r1 = r5.A06
            if (r1 == 0) goto L_0x0c53
            java.lang.String r0 = "extra_deep_link_url"
            android.os.Parcelable r0 = r1.getParcelable(r0)
            android.net.Uri r0 = (android.net.Uri) r0
        L_0x0c4f:
            r2.A0I(r0, r3, r4, r3)
            return
        L_0x0c53:
            r0 = 0
            goto L_0x0c4f
        L_0x0c55:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r3 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r3
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            java.lang.Object r1 = r0.A00
            if (r1 == 0) goto L_0x19c4
            java.lang.Object r2 = r0.A01
            if (r2 == 0) goto L_0x19c4
            A05(r3)
            X.03q r0 = r3.A0Q()
            if (r0 == 0) goto L_0x0023
            X.03q r5 = r3.A0R()
            X.4ea r5 = (X.C89654ea) r5
            r6 = 0
            java.lang.String r8 = "upi-get-vpa"
            X.34V r1 = (X.AnonymousClass34V) r1
            int r9 = r1.A00
            r10 = 0
            r7 = r6
            boolean r0 = X.C196719bd.A01(r5, r6, r7, r8, r9, r10)
            if (r0 != 0) goto L_0x0023
            X.9WM r4 = r3.A09
            android.content.Context r5 = r3.A0G()
            int r10 = r1.A00
            X.5ZU r1 = r3.A02
            X.3Ex r0 = r3.A00
            X.4uZ r2 = (X.C95814uZ) r2
            X.3ZH r0 = r0.A0A(r2)
            java.lang.String r9 = r1.A0M(r0)
            r8 = r6
            X.043 r0 = r4.A05(r5, r6, r7, r8, r9, r10)
        L_0x0c9c:
            r0.show()
            return
        L_0x0ca0:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r5 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r5
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            X.1VX r2 = r5.A05
            r1 = 3619(0xe23, float:5.071E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x0023
            java.lang.Object r6 = r0.A00
            if (r6 == 0) goto L_0x19c1
            java.lang.Object r3 = r0.A01
            if (r3 == 0) goto L_0x19c1
            X.9TG r6 = (X.AnonymousClass9TG) r6
            X.99D r7 = r6.A01
            boolean r0 = r7.A04
            if (r0 == 0) goto L_0x19b5
            boolean r0 = r7.A05
            if (r0 != 0) goto L_0x19b5
            boolean r0 = r7.A06
            if (r0 == 0) goto L_0x1974
            X.7yt r0 = r7.A02
            if (r0 == 0) goto L_0x0023
            A05(r5)
            com.whatsapp.jid.UserJid r3 = (com.whatsapp.jid.UserJid) r3
            X.9Zz r2 = r5.A06
            android.content.Context r1 = r5.A1D()
            r0 = 0
            r4 = 1
            android.content.Intent r2 = r2.A01(r1, r0, r4)
            X.7yt r1 = r7.A02
            java.lang.String r0 = "extra_payment_handle"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_handle_id"
            java.lang.String r0 = r7.A03
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_payee_name"
            X.7yt r0 = r7.A01
            r2.putExtra(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = r5.A04
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_token"
            java.lang.String r0 = r6.A03
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_is_merchant"
            boolean r0 = r6.A04
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_transaction_is_valid_merchant"
            boolean r0 = r6.A05
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_merchant_code"
            java.lang.String r0 = r6.A02
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_upi_number"
            X.7yt r0 = r6.A00
            r2.putExtra(r1, r0)
            java.lang.String r0 = "extra_mapper_alias_resolved"
            r2.putExtra(r0, r4)
            X.2rx r0 = r5.A01
            X.2qS r1 = r0.A00(r3)
            if (r1 == 0) goto L_0x0d48
            boolean r0 = r1.A03()
            if (r0 == 0) goto L_0x0d3f
            java.lang.String r1 = "smb"
        L_0x0d31:
            java.lang.String r0 = "extra_receiver_platform"
            r2.putExtra(r0, r1)
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            r2.addFlags(r0)
            r5.A0m(r2)
            return
        L_0x0d3f:
            boolean r0 = r1.A02()
            if (r0 == 0) goto L_0x0d48
            java.lang.String r1 = "ent"
            goto L_0x0d31
        L_0x0d48:
            java.lang.String r1 = "consumer"
            goto L_0x0d31
        L_0x0d4b:
            java.lang.Object r3 = r2.A00
            com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens r3 = (com.whatsapp.wabloks.base.BkScreenFragmentWithCustomPreloadScreens) r3
            X.9Lw r0 = (X.C192849Lw) r0
            boolean r1 = r0 instanceof X.AnonymousClass9HD
            if (r1 == 0) goto L_0x0db7
            X.9HD r0 = (X.AnonymousClass9HD) r0
            int r4 = r0.A00
            android.view.View r0 = r3.A0B
            if (r0 == 0) goto L_0x0dac
            java.util.Map r2 = r3.A07
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0db1
            A01(r3)
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r0 = new com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment
            r0.<init>()
            android.os.Bundle r1 = r0.A06
            if (r1 == 0) goto L_0x0d80
            java.lang.String r0 = "layout_error_status"
            r1.putInt(r0, r4)
        L_0x0d80:
            A01(r3)
            com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment r2 = new com.whatsapp.wabloks.base.DefaultBkPreloadFragment$BkCustomReloadFragment
            r2.<init>()
            android.os.Bundle r1 = r2.A06
            if (r1 == 0) goto L_0x0d91
            java.lang.String r0 = "layout_error_status"
            r1.putInt(r0, r4)
        L_0x0d91:
            android.widget.FrameLayout r0 = r3.A00
            X.C86604Kt.A1A(r0)
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x0dac
            X.0df r0 = r3.A0T()
            X.0dc r1 = new X.0dc
            r1.<init>(r0)
            r0 = 2131432592(0x7f0b1490, float:1.8486946E38)
            r1.A0A(r2, r0)
            r1.A02()
        L_0x0dac:
            r0 = 0
            r3.A1N(r0)
            return
        L_0x0db1:
            X.8qC r0 = r3.A08
            r0.get()
            goto L_0x0d80
        L_0x0db7:
            boolean r0 = r0 instanceof X.AnonymousClass9HE
            if (r0 == 0) goto L_0x0e0d
            android.view.View r0 = r3.A0B
            if (r0 == 0) goto L_0x0023
            java.util.Map r2 = r3.A07
            android.os.Bundle r1 = r3.A0H()
            java.lang.String r0 = "screen_name"
            java.lang.String r0 = r1.getString(r0)
            java.lang.Object r0 = r2.get(r0)
            if (r0 == 0) goto L_0x0e07
            A01(r3)
            r1 = 2131624162(0x7f0e00e2, float:1.8875496E38)
            X.0eF r0 = new X.0eF
            r0.<init>()
            r0.A02 = r1
        L_0x0dde:
            A01(r3)
            r0 = 2131624162(0x7f0e00e2, float:1.8875496E38)
            X.0eF r2 = new X.0eF
            r2.<init>()
            r2.A02 = r0
            android.widget.FrameLayout r0 = r3.A00
            X.C86604Kt.A1A(r0)
            android.widget.FrameLayout r0 = r3.A01
            if (r0 == 0) goto L_0x0023
            X.0df r0 = r3.A0T()
            X.0dc r1 = new X.0dc
            r1.<init>(r0)
            r0 = 2131432592(0x7f0b1490, float:1.8486946E38)
            r1.A0A(r2, r0)
            r1.A02()
            return
        L_0x0e07:
            X.8qC r0 = r3.A08
            r0.get()
            goto L_0x0dde
        L_0x0e0d:
            android.widget.FrameLayout r1 = r3.A00
            if (r1 == 0) goto L_0x0e15
            r0 = 0
            r1.setVisibility(r0)
        L_0x0e15:
            android.widget.FrameLayout r1 = r3.A01
            if (r1 == 0) goto L_0x0023
        L_0x0e19:
            r0 = 8
        L_0x0e1b:
            r1.setVisibility(r0)
            return
        L_0x0e1f:
            java.lang.Object r8 = r2.A00
            X.9TY r8 = (X.AnonymousClass9TY) r8
            java.lang.String r5 = "chat"
            X.33p r7 = r8.A01
            java.lang.String r6 = "payments_merchant_upsell_start_cool_off_timestamp"
            android.content.SharedPreferences r0 = X.AnonymousClass0x2.A0F(r7)
            long r3 = X.AnonymousClass0x2.A0A(r0, r6)
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            long r3 = java.lang.System.currentTimeMillis()
            if (r0 != 0) goto L_0x0e44
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.DAYS
            r0 = 30
            long r0 = r2.toMillis(r0)
            long r3 = r3 + r0
        L_0x0e44:
            X.33l r9 = r8.A04
            android.content.SharedPreferences r0 = r9.A03()
            java.lang.String r2 = "payment_smb_upsell_view_count"
            int r0 = X.C18280x3.A02(r0, r2)
            int r1 = r0 + 1
            android.content.SharedPreferences r0 = r9.A03()
            X.C86604Kt.A15(r0, r2, r1)
            r7.A1f(r6, r3)
            X.9no r3 = r8.A05
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            r0 = 10
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "merchant_upsell_prompt"
            r3.BKB(r2, r1, r0, r5)
            return
        L_0x0e6e:
            java.lang.Object r0 = r2.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x156e
        L_0x0e74:
            java.lang.String r6 = r0.A00
            java.lang.String r3 = r0.A01
            boolean r0 = X.AnonymousClass36S.A07(r3)
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L_0x0eb1
            r1 = 2131888212(0x7f120854, float:1.9411053E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r6, r5)
            r0[r2] = r3
        L_0x0e89:
            java.lang.String r3 = r4.getString(r1, r0)
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r3)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "tel:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)
            X.C1899693i.A0k(r2, r0, r3, r6)
            android.widget.TextView r0 = r4.A03
            r0.setText(r2)
            android.widget.TextView r1 = r4.A03
            android.text.method.MovementMethod r0 = android.text.method.LinkMovementMethod.getInstance()
            r1.setMovementMethod(r0)
            android.widget.TextView r0 = r4.A03
            goto L_0x16a1
        L_0x0eb1:
            r1 = 2131888213(0x7f120855, float:1.9411055E38)
            java.lang.Object[] r0 = new java.lang.Object[r2]
            r0[r5] = r6
            goto L_0x0e89
        L_0x0eb9:
            X.0zH r4 = X.AnonymousClass5V0.A00(r2)
            boolean r1 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentDPOActivity
            if (r1 == 0) goto L_0x0ec7
            r0 = 2131893196(0x7f121bcc, float:1.9421162E38)
            r4.A0U(r0)
        L_0x0ec7:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentReportPaymentActivity
            if (r0 == 0) goto L_0x0f0e
            r3 = 2131893087(0x7f121b5f, float:1.942094E38)
        L_0x0ece:
            r4.A0T(r3)
            r1 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r0 = 11
            X.9qL r0 = A00(r2, r0)
            r4.A0d(r2, r0, r1)
            r4.A0S()
            android.content.res.Resources r0 = r2.getResources()
            java.lang.CharSequence r0 = r0.getText(r3)
            java.lang.String r3 = r0.toString()
            X.94s r2 = r2.A07
            X.303 r4 = X.C1899593h.A0K()
            java.lang.String r1 = "product_flow"
            java.lang.String r0 = "p2m"
            r4.A03(r1, r0)
            java.lang.String r0 = "dialog_text"
            r4.A03(r0, r3)
            X.9no r3 = r2.A07
            java.lang.Integer r5 = X.C18290x4.A0Z()
            r6 = 0
            java.lang.String r7 = r2.A0D()
            r8 = r6
            r3.BKE(r4, r5, r6, r7, r8)
            return
        L_0x0f0e:
            if (r1 == 0) goto L_0x0f14
            r3 = 2131893194(0x7f121bca, float:1.9421158E38)
            goto L_0x0ece
        L_0x0f14:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentContactSupportP2pActivity
            if (r0 != 0) goto L_0x0f20
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.BrazilPaymentContactSupportActivity
            if (r0 != 0) goto L_0x0f20
            r3 = 2131888155(0x7f12081b, float:1.9410937E38)
            goto L_0x0ece
        L_0x0f20:
            r3 = 2131888215(0x7f120857, float:1.941106E38)
            goto L_0x0ece
        L_0x0f24:
            android.widget.EditText r1 = r2.A02
            r0 = 2131231372(0x7f08028c, float:1.8078823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r0)
            r1.setBackground(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 8
            goto L_0x0f5b
        L_0x0f35:
            android.widget.EditText r1 = r2.A02
            r0 = 2131231372(0x7f08028c, float:1.8078823E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r0)
            r1.setBackground(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 8
            r1.setVisibility(r0)
            android.widget.Button r1 = r2.A01
            r0 = 0
            goto L_0x0f61
        L_0x0f4c:
            android.widget.EditText r1 = r2.A02
            r0 = 2131231370(0x7f08028a, float:1.807882E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r2, r0)
            r1.setBackground(r0)
            android.widget.TextView r1 = r2.A04
            r0 = 0
        L_0x0f5b:
            r1.setVisibility(r0)
            android.widget.Button r1 = r2.A01
            r0 = 1
        L_0x0f61:
            r1.setEnabled(r0)
            return
        L_0x0f65:
            java.lang.Object r3 = r2.A00
            X.9BX r3 = (X.AnonymousClass9BX) r3
            int r7 = X.AnonymousClass001.A0K(r0)
            r1 = 0
            r4 = 1
            r2 = 8
            r5 = 0
            if (r7 == r4) goto L_0x10d4
            r0 = 2
            if (r7 == r0) goto L_0x100b
            r0 = 3
            if (r7 == r0) goto L_0x0fe3
            r0 = 4
            com.whatsapp.WaTextView r6 = r3.A08
            if (r7 == r0) goto L_0x106d
            java.lang.String r5 = r3.A0S
            java.lang.String r0 = "business"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0fdf
            java.lang.String r0 = "personal"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L_0x0fdb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDefaultReportFooterBottomTextRes - this payment account type is not supported. Payment account type = "
            X.C18260x0.A0r(r0, r5, r1)
            r0 = -1
        L_0x0f9b:
            r6.setText(r0)
            com.whatsapp.WaTextView r1 = r3.A07
            int r0 = r3.A75()
            r1.setText(r0)
            com.whatsapp.WaTextView r5 = r3.A07
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.AnonymousClass5Yj.A0B(r3, r5, r1, r0)
            com.whatsapp.WaTextView r0 = r3.A06
            r0.setVisibility(r2)
            android.widget.FrameLayout r0 = r3.A01
            r0.setVisibility(r2)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            android.widget.FrameLayout r0 = r3.A02
            r0.setEnabled(r4)
            android.widget.FrameLayout r1 = r3.A02
            r0 = 3
            X.C203969ob.A00(r1, r3, r0)
            com.whatsapp.WaImageView r2 = r3.A05
            X.33j r1 = r3.A0B
            r0 = 2131232717(0x7f0807cd, float:1.8081551E38)
        L_0x0fd3:
            X.6dx r0 = X.AnonymousClass0x7.A0J(r3, r1, r0)
            r2.setImageDrawable(r0)
            return
        L_0x0fdb:
            r0 = 2131892045(0x7f12174d, float:1.9418827E38)
            goto L_0x0f9b
        L_0x0fdf:
            r0 = 2131891896(0x7f1216b8, float:1.9418525E38)
            goto L_0x0f9b
        L_0x0fe3:
            android.widget.FrameLayout r0 = r3.A02
            r0.setEnabled(r5)
            android.widget.FrameLayout r0 = r3.A02
            r0.setOnClickListener(r1)
            com.whatsapp.WaTextView r1 = r3.A07
            int r0 = r3.A77()
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r3.A07
            r0 = 2131101128(0x7f0605c8, float:1.7814657E38)
            X.AnonymousClass0x2.A0q(r3, r1, r0)
            com.whatsapp.WaTextView r0 = r3.A06
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r2 = r3.A05
            X.33j r1 = r3.A0B
            r0 = 2131231774(0x7f08041e, float:1.8079639E38)
            goto L_0x0fd3
        L_0x100b:
            r3.BjL()
            com.whatsapp.WaTextView r7 = r3.A08
            java.lang.String r6 = r3.A0S
            java.lang.String r0 = "business"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x1069
            java.lang.String r0 = "personal"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x1065
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiReportFooterBottomTextRes - this payment account type is not supported. Payment account type = "
            X.C18260x0.A0r(r0, r6, r1)
            r0 = -1
        L_0x102c:
            r7.setText(r0)
            android.widget.FrameLayout r0 = r3.A01
            r0.setVisibility(r2)
            android.view.View r0 = r3.A00
            r0.setVisibility(r2)
            android.widget.FrameLayout r0 = r3.A02
            r0.setEnabled(r4)
            android.widget.FrameLayout r0 = r3.A02
            X.C203969ob.A00(r0, r3, r4)
            com.whatsapp.WaTextView r1 = r3.A07
            int r0 = r3.A76()
            r1.setText(r0)
            com.whatsapp.WaTextView r2 = r3.A07
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.AnonymousClass5Yj.A0B(r3, r2, r1, r0)
            com.whatsapp.WaTextView r0 = r3.A06
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r2 = r3.A05
            X.33j r1 = r3.A0B
            r0 = 2131231734(0x7f0803f6, float:1.8079557E38)
            goto L_0x0fd3
        L_0x1065:
            r0 = 2131892044(0x7f12174c, float:1.9418825E38)
            goto L_0x102c
        L_0x1069:
            r0 = 2131891895(0x7f1216b7, float:1.9418523E38)
            goto L_0x102c
        L_0x106d:
            java.lang.String r2 = r3.A0S
            java.lang.String r0 = "business"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x10d0
            java.lang.String r0 = "personal"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x10cc
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY: DyiReportBaseActivity/getDyiDownloadedBottomLabelTextRes - this payment account type is not supported. Payment account type = "
            X.C18260x0.A0r(r0, r2, r1)
            r0 = -1
        L_0x1089:
            r6.setText(r0)
            android.widget.FrameLayout r0 = r3.A02
            r0.setEnabled(r4)
            android.widget.FrameLayout r1 = r3.A02
            r0 = 2
            X.C203969ob.A00(r1, r3, r0)
            com.whatsapp.WaTextView r1 = r3.A07
            int r0 = r3.A78()
            r1.setText(r0)
            com.whatsapp.WaTextView r2 = r3.A07
            r1 = 2130970568(0x7f0407c8, float:1.754985E38)
            r0 = 2131102439(0x7f060ae7, float:1.7817316E38)
            X.AnonymousClass5Yj.A0B(r3, r2, r1, r0)
            com.whatsapp.WaTextView r0 = r3.A06
            r0.setVisibility(r5)
            com.whatsapp.WaImageView r2 = r3.A05
            X.33j r1 = r3.A0B
            r0 = 2131231784(0x7f080428, float:1.8079659E38)
            X.6dx r0 = X.AnonymousClass0x7.A0J(r3, r1, r0)
            r2.setImageDrawable(r0)
            android.widget.FrameLayout r0 = r3.A02
            r0.setVisibility(r5)
            android.widget.FrameLayout r0 = r3.A01
            r0.setVisibility(r5)
            android.view.View r0 = r3.A00
            goto L_0x16a1
        L_0x10cc:
            r0 = 2131892044(0x7f12174c, float:1.9418825E38)
            goto L_0x1089
        L_0x10d0:
            r0 = 2131891895(0x7f1216b7, float:1.9418523E38)
            goto L_0x1089
        L_0x10d4:
            android.widget.FrameLayout r0 = r3.A02
            r0.setEnabled(r5)
            android.widget.FrameLayout r0 = r3.A02
            r0.setOnClickListener(r1)
            com.whatsapp.WaTextView r0 = r3.A06
            r0.setVisibility(r2)
            com.whatsapp.WaTextView r1 = r3.A07
            r0 = 2131888775(0x7f120a87, float:1.9412195E38)
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r3.A07
            r0 = 2131101128(0x7f0605c8, float:1.7814657E38)
            X.AnonymousClass0x2.A0q(r3, r1, r0)
            return
        L_0x10f4:
            java.lang.Object r4 = r2.A00
            X.9BX r4 = (X.AnonymousClass9BX) r4
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r5 = "personal"
            java.lang.String r1 = r4.A0S
            boolean r2 = r5.equals(r1)
            r1 = 2131888759(0x7f120a77, float:1.9412162E38)
            if (r2 == 0) goto L_0x110a
            r1 = 2131888768(0x7f120a80, float:1.941218E38)
        L_0x110a:
            java.lang.String r3 = r4.getString(r1)
            java.lang.String r1 = "android.intent.action.SEND"
            android.content.Intent r2 = new android.content.Intent
            r2.<init>(r1)
            java.lang.String r1 = "application/zip"
            r2.setType(r1)
            java.lang.String r1 = r4.A0S
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x113f
            java.lang.String r1 = "personal_dyi_report"
        L_0x1124:
            android.net.Uri r1 = com.whatsapp.contentprovider.MediaProvider.A06(r1, r0)
            java.lang.String r0 = "android.intent.extra.STREAM"
            r2.putExtra(r0, r1)
            java.lang.String r0 = "android.intent.extra.SUBJECT"
            r2.putExtra(r0, r3)
            r0 = 524288(0x80000, float:7.34684E-40)
            r2.addFlags(r0)
            android.content.Intent r0 = android.content.Intent.createChooser(r2, r3)
            r4.startActivity(r0)
            return
        L_0x113f:
            java.lang.String r1 = "business_dyi_report"
            goto L_0x1124
        L_0x1142:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity r5 = (com.whatsapp.payments.ui.IndiaUpiCheckBalanceActivity) r5
            X.9PP r0 = (X.AnonymousClass9PP) r0
            int r1 = r0.A03
            if (r1 == 0) goto L_0x118a
            X.34V r2 = r0.A00
            android.os.Bundle r3 = X.AnonymousClass002.A08()
            int r1 = r2.A00
            java.lang.String r0 = "error_code"
            r3.putInt(r0, r1)
            int r2 = r2.A00
            r0 = 11459(0x2cc3, float:1.6057E-41)
            r1 = 10
            if (r2 == r0) goto L_0x1186
            r0 = 11468(0x2ccc, float:1.607E-41)
            r1 = 11
            if (r2 == r0) goto L_0x1186
            r0 = 11454(0x2cbe, float:1.605E-41)
            r1 = 12
            if (r2 == r0) goto L_0x1186
            r0 = 11487(0x2cdf, float:1.6097E-41)
            if (r2 == r0) goto L_0x1184
            r0 = 20697(0x50d9, float:2.9003E-41)
            if (r2 == r0) goto L_0x1184
            r0 = 20682(0x50ca, float:2.8982E-41)
            if (r2 == r0) goto L_0x1184
            X.7oG r1 = r5.A06
            java.lang.String r0 = " onCheckBalance failed; showErrorAndFinish"
            r1.A06(r0)
            r5.A7b()
            return
        L_0x1184:
            r1 = 27
        L_0x1186:
            X.C621433s.A02(r5, r3, r1)
            return
        L_0x118a:
            X.6hm r4 = r5.A01
            java.lang.String r3 = r0.A01
            java.lang.String r2 = r0.A02
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiBalanceDetailsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiBalanceDetailsActivity.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r0 = "payment_bank_account"
            r1.putExtra(r0, r4)
            java.lang.String r0 = "balance"
            r1.putExtra(r0, r3)
            java.lang.String r0 = "usable_balance"
            r1.putExtra(r0, r2)
            r5.finish()
            r0 = 0
            r5.A6T(r1, r0)
            return
        L_0x11ad:
            java.lang.Object r1 = r2.A00
            X.9Bz r1 = (X.AnonymousClass9Bz) r1
            java.util.List r0 = (java.util.List) r0
            X.955 r1 = r1.A03
            r1.A00 = r0
            r1.A05()
            return
        L_0x11bb:
            java.lang.Object r4 = r2.A00
            android.content.Context r4 = (android.content.Context) r4
            X.9P4 r0 = (X.AnonymousClass9P4) r0
            java.lang.Class<com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity> r1 = com.whatsapp.payments.ui.IndiaPaymentTransactionHistoryActivity.class
            android.content.Intent r3 = X.AnonymousClass0x9.A08(r4, r1)
            java.lang.String r2 = "extra_disable_search"
            boolean r1 = r0.A01
            r3.putExtra(r2, r1)
            java.lang.String r2 = "extra_predefined_search_filter"
            X.38i r1 = r0.A00
            r3.putExtra(r2, r1)
            java.lang.String r2 = "extra_for_mandates"
            r1 = 1
            r3.putExtra(r2, r1)
            java.lang.String r1 = "extra_show_mandate_pending_requests"
            boolean r0 = r0.A02
            r3.putExtra(r1, r0)
            java.lang.String r1 = "extra_payment_flow_entry_point"
            r0 = 4
            r3.putExtra(r1, r0)
            r4.startActivity(r3)
            return
        L_0x11ec:
            A04(r2, r0)
            return
        L_0x11f0:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r3 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r3
            X.9WE r0 = (X.AnonymousClass9WE) r0
            java.lang.Object r0 = r0.A01
            X.9VG r0 = (X.AnonymousClass9VG) r0
            if (r0 == 0) goto L_0x16a8
            X.9Uu r4 = r0.A01
            if (r4 == 0) goto L_0x16a8
            java.lang.String r2 = r4.A0F
            if (r2 == 0) goto L_0x16a8
            java.lang.String r1 = r4.A0B
            if (r1 == 0) goto L_0x16a8
            com.whatsapp.WaTextView r0 = r3.A05
            r0.setText(r2)
            java.lang.String r6 = r4.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x125e
            X.5a2 r7 = r3.A08
            com.whatsapp.TextEmojiLabel r0 = r3.A03
            android.content.Context r8 = r0.getContext()
            r5 = 2131890154(0x7f120fea, float:1.9414992E38)
            java.lang.Object[] r4 = X.AnonymousClass002.A0M()
            r2 = 0
            r4[r2] = r1
            r1 = 1
            java.lang.String r0 = "learn-more"
            java.lang.String r9 = X.AnonymousClass002.A0F(r3, r0, r4, r1, r5)
            java.lang.String[] r11 = new java.lang.String[]{r0}
            java.lang.String[] r12 = new java.lang.String[r1]
            X.5X8 r0 = r3.A03
            android.net.Uri r0 = r0.A00(r6)
            X.AnonymousClass0x7.A1E(r0, r12, r2)
            java.lang.Runnable[] r10 = new java.lang.Runnable[r1]
            X.9fw r0 = new X.9fw
            r0.<init>(r3)
            r10[r2] = r0
            android.text.SpannableString r2 = r7.A04(r8, r9, r10, r11, r12)
            com.whatsapp.TextEmojiLabel r1 = r3.A03
            X.33i r0 = r3.A08
            X.AnonymousClass0x2.A12(r1, r0)
            com.whatsapp.TextEmojiLabel r1 = r3.A03
            X.1VX r0 = r3.A0D
            X.AnonymousClass0x2.A14(r0, r1)
            com.whatsapp.TextEmojiLabel r0 = r3.A03
            r0.setText(r2)
            return
        L_0x125e:
            com.whatsapp.TextEmojiLabel r0 = r3.A03
            r0.setText(r1)
            return
        L_0x1264:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity r3 = (com.whatsapp.payments.ui.IndiaUpiMandatePaymentActivity) r3
            X.9OW r0 = (X.AnonymousClass9OW) r0
            int r5 = r0.A01
            java.lang.String r4 = "MandateUpdateBottomSheetFragment"
            r2 = 0
            r6 = 1
            if (r5 == r6) goto L_0x128e
            r1 = 2
            if (r5 == r1) goto L_0x1279
            r0 = 3
            if (r5 == r0) goto L_0x16a8
            return
        L_0x1279:
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r3.A02
            r1.A01 = r2
            r3.A6c(r4)
            int r0 = r0.A00
            r3.A7q(r0)
            X.9ca r1 = r3.A0S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x12b0
        L_0x128e:
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r3.A02
            r0.A01 = r2
            r3.A6c(r4)
            X.94n r4 = r3.A03
            X.08M r2 = r4.A01
            X.2oU r0 = r4.A04
            android.content.Context r1 = r0.A00
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            X.AnonymousClass9OX.A00(r1, r2, r0)
            X.9AL r0 = r4.A0J
            r0.A00()
            X.9ca r1 = r3.A0S
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r0 = 104(0x68, float:1.46E-43)
        L_0x12b0:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "approve_mandate_update_request_prompt"
            java.lang.String r5 = "payment_transaction_details"
            r1.BKC(r2, r3, r4, r5, r6)
            return
        L_0x12bc:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r5 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r5
            int r1 = X.AnonymousClass001.A0K(r0)
            if (r1 == 0) goto L_0x13aa
            r0 = 1
            if (r1 == r0) goto L_0x1392
            r0 = 2
            if (r1 == r0) goto L_0x12e0
            r0 = 3
            if (r1 != r0) goto L_0x12da
            X.9R6 r1 = r5.A0A
            if (r1 == 0) goto L_0x12da
            java.lang.String r0 = r5.A0G
            if (r0 == 0) goto L_0x12da
            r1.A00(r0)
        L_0x12da:
            r1 = 0
        L_0x12db:
            r0 = 0
            r5.A1J(r0, r0, r1)
            return
        L_0x12e0:
            com.airbnb.lottie.LottieAnimationView r0 = r5.A03
            r2 = 180(0xb4, float:2.52E-43)
            r1 = 269(0x10d, float:3.77E-43)
            X.01G r0 = r0.A0F
            r0.A0A(r2, r1)
            com.airbnb.lottie.LottieAnimationView r0 = r5.A03
            r3 = 0
            X.01G r0 = r0.A0F
            X.00H r0 = r0.A0K
            r0.setRepeatCount(r3)
            r4 = 2131894891(0x7f12226b, float:1.94246E38)
            android.widget.TextView r2 = r5.A01
            java.lang.Object[] r1 = X.AnonymousClass002.A0L()
            X.7yt r0 = r5.A08
            java.lang.Object r0 = r0.A00
            r1[r3] = r0
            X.C1899693i.A0l(r2, r5, r1, r4)
            android.content.Context r2 = r5.A1D()
            r1 = 2130968582(0x7f040006, float:1.7545822E38)
            r0 = 2131099679(0x7f06001f, float:1.7811718E38)
            int r2 = X.AnonymousClass5Yj.A02(r2, r1, r0)
            r1 = 2131894892(0x7f12226c, float:1.9424602E38)
            android.widget.TextView r0 = r5.A02
            r0.setText(r1)
            android.widget.TextView r1 = r5.A02
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            X.C18320x8.A11(r0, r1, r2)
            android.widget.TextView r7 = r5.A00
            X.2oU r0 = r5.A05
            android.content.Context r6 = r0.A00
            r4 = 2131894343(0x7f122047, float:1.9423488E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.33j r8 = r5.A06
            X.2sH r9 = r5.A04
            long r0 = r9.A0D()
            long r0 = r9.A0I(r0)
            java.lang.String r11 = X.C107505bQ.A03(r8, r0)
            X.33j r10 = r5.A06
            X.2sH r9 = r5.A04
            long r0 = r9.A0D()
            long r0 = r9.A0I(r0)
            java.lang.String r0 = X.C107145am.A00(r10, r0)
            java.lang.String r0 = X.C107175ap.A04(r8, r11, r0)
            r2[r3] = r0
            X.AnonymousClass001.A0y(r6, r7, r2, r4)
            android.widget.TextView r0 = r5.A00
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0E
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r5.A0D
            r0.setVisibility(r3)
            X.1VX r1 = r5.A07
            r0 = 3708(0xe7c, float:5.196E-42)
            boolean r0 = r1.A0X(r0)
            if (r0 == 0) goto L_0x138e
            X.2yL r2 = r5.A0C
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = X.C58152un.A04
            r1.append(r0)
            r0 = 2132017210(0x7f14003a, float:1.9672692E38)
            java.lang.String r0 = X.AnonymousClass000.A0h(r1, r0)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r2.A01(r0)
        L_0x138e:
            java.lang.String r1 = "SUCCESS"
            goto L_0x12db
        L_0x1392:
            r1 = 2131894893(0x7f12226d, float:1.9424604E38)
            r2 = 2131102351(0x7f060a8f, float:1.7817137E38)
            android.widget.TextView r0 = r5.A02
            r0.setText(r1)
            android.widget.TextView r1 = r5.A02
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            X.C18320x8.A11(r0, r1, r2)
            java.lang.String r1 = "PROCESSING_LONG_WAIT"
            goto L_0x12db
        L_0x13aa:
            r4 = 2131894895(0x7f12226f, float:1.9424608E38)
            android.widget.TextView r3 = r5.A01
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.7yt r0 = r5.A08
            java.lang.Object r1 = r0.A00
            r0 = 0
            r2[r0] = r1
            X.C1899693i.A0l(r3, r5, r2, r4)
            com.airbnb.lottie.LottieAnimationView r0 = r5.A03
            r2 = 0
            r1 = 89
            X.01G r0 = r0.A0F
            r0.A0A(r2, r1)
            com.airbnb.lottie.LottieAnimationView r0 = r5.A03
            r0.A01()
            java.lang.String r1 = "PROCESSING"
            goto L_0x12db
        L_0x13d0:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r5 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r5 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r5
            int r4 = r0.intValue()
            android.widget.ProgressBar r1 = r5.A07
            r3 = 0
            r0 = 8
            if (r4 != 0) goto L_0x13e6
            r0 = 0
        L_0x13e6:
            r1.setVisibility(r0)
            android.widget.LinearLayout r2 = r5.A03
            r1 = 1
            r0 = 8
            if (r4 != r1) goto L_0x13f1
            r0 = 0
        L_0x13f1:
            r2.setVisibility(r0)
            android.widget.TextView r1 = r5.A0A
            r0 = 3
            if (r4 == r0) goto L_0x13fb
            r3 = 8
        L_0x13fb:
            r1.setVisibility(r3)
            return
        L_0x13ff:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.Object r3 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r3 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r3
            android.widget.TextView r2 = r3.A08
            r1 = 2131895429(0x7f122485, float:1.942569E38)
            java.lang.Object[] r0 = X.AnonymousClass000.A1b(r0)
            X.C1899693i.A0l(r2, r3, r0, r1)
            return
        L_0x1414:
            java.lang.Object r1 = r2.A00
            X.9oL r1 = (X.C203809oL) r1
            java.lang.Number r0 = (java.lang.Number) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r1
            android.widget.Button r1 = r1.A02
            int r0 = r0.intValue()
            r1.setText(r0)
            return
        L_0x1428:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r1
            X.9VW r0 = (X.AnonymousClass9VW) r0
            r1.A1L(r0)
            return
        L_0x1432:
            java.lang.Object r4 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiStepUpActivity r4 = (com.whatsapp.payments.ui.IndiaUpiStepUpActivity) r4
            X.9Q3 r0 = (X.AnonymousClass9Q3) r0
            int r2 = r0.A00
            if (r2 == 0) goto L_0x149f
            r1 = 1
            if (r2 == r1) goto L_0x149b
            r1 = 2
            if (r2 == r1) goto L_0x1458
            java.lang.String r3 = r0.A07
            java.lang.String r2 = r0.A03
            r4.A7I()
            X.C626936e.A05(r3)
            r1 = 1
            r0 = 0
            android.content.Intent r1 = X.C627736r.A17(r4, r3, r2, r1, r0)
            r0 = 1014(0x3f6, float:1.421E-42)
            r4.startActivityForResult(r1, r0)
            return
        L_0x1458:
            X.34V r0 = r0.A02
            java.lang.String r3 = " onStepUp failed; showErrorAndFinish"
            if (r0 == 0) goto L_0x1492
            int r2 = r0.A00
            r0 = 11459(0x2cc3, float:1.6057E-41)
            r1 = 10
            if (r2 == r0) goto L_0x148e
            r0 = 11468(0x2ccc, float:1.607E-41)
            r1 = 11
            if (r2 == r0) goto L_0x148e
            r0 = 11454(0x2cbe, float:1.605E-41)
            r1 = 12
            if (r2 == r0) goto L_0x148e
            r0 = 455(0x1c7, float:6.38E-43)
            if (r2 != r0) goto L_0x1492
            r0 = 32
            X.C621433s.A01(r4, r0)
            X.33l r0 = r4.A0P
            r0.A0A()
            X.30K r1 = r4.A0C
            java.util.List r0 = r4.A08
            r1.A05(r0)
            X.9Ta r1 = r4.A02
            r0 = 0
            r1.A01(r0)
            return
        L_0x148e:
            X.C621433s.A01(r4, r1)
            return
        L_0x1492:
            X.7oG r0 = r4.A07
            r0.A06(r3)
            r4.A7b()
            return
        L_0x149b:
            X.C86624Kv.A0f(r4)
            return
        L_0x149f:
            java.lang.String r6 = r0.A05
            java.lang.String r7 = r0.A04
            java.lang.String r8 = r4.A05
            X.99H r5 = r0.A01
            r10 = 3
            java.lang.String r9 = r0.A06
            r4.A7g(r5, r6, r7, r8, r9, r10)
            return
        L_0x14ae:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity r1 = (com.whatsapp.payments.ui.MerchantPayoutTransactionHistoryActivity) r1
            android.util.Pair r0 = (android.util.Pair) r0
            X.95F r2 = r1.A02
            java.lang.Object r1 = r0.first
            java.util.List r1 = (java.util.List) r1
            r2.A02 = r1
            java.lang.Object r0 = r0.second
            java.util.List r0 = (java.util.List) r0
            r2.A01 = r0
            r2.A05()
            return
        L_0x14c6:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.PaymentContactPickerFragment r1 = (com.whatsapp.payments.ui.PaymentContactPickerFragment) r1
            X.9WE r0 = (X.AnonymousClass9WE) r0
            java.lang.Object r0 = r0.A01
            X.9VG r0 = (X.AnonymousClass9VG) r0
            r1.A04 = r0
            r1.A2K()
            return
        L_0x14d6:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            int r0 = X.AnonymousClass001.A0K(r0)
            r1.A1c(r0)
            return
        L_0x14e2:
            java.lang.Object r1 = r2.A00
            com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity r1 = (com.whatsapp.payments.ui.PaymentTransactionDetailsListActivity) r1
            X.9QJ r0 = (X.AnonymousClass9QJ) r0
            r1.A78(r0)
            return
        L_0x14ec:
            java.lang.Object r4 = r2.A00
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r4 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r4
            X.9WE r0 = (X.AnonymousClass9WE) r0
            int r3 = r0.A00
            r2 = 2
            android.view.View r1 = r4.A03
            if (r3 != r2) goto L_0x150a
            r0 = 0
            r1.setVisibility(r0)
            android.view.View r0 = r4.A04
            r1 = 8
            r0.setVisibility(r1)
            android.view.View r0 = r4.A02
            r0.setVisibility(r1)
            return
        L_0x150a:
            r5 = 8
            r1.setVisibility(r5)
            android.view.View r1 = r4.A04
            r3 = 0
            r1.setVisibility(r3)
            android.view.View r1 = r4.A02
            r1.setVisibility(r3)
            java.lang.Object r2 = r0.A01
            X.C626936e.A06(r2)
            X.9Pu r2 = (X.C193739Pu) r2
            int r1 = r2.A03
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0I
            if (r1 == 0) goto L_0x154d
            r0.setVisibility(r3)
            com.whatsapp.wds.components.button.WDSButton r0 = r4.A0I
            r0.setText(r1)
        L_0x152f:
            com.whatsapp.WaTextView r1 = r4.A08
            int r0 = r2.A05
            r1.setText(r0)
            com.whatsapp.WaTextView r1 = r4.A07
            int r0 = r2.A01
            r1.setText(r0)
            com.whatsapp.wds.components.button.WDSButton r1 = r4.A0H
            int r0 = r2.A00
            r1.setText(r0)
            int r0 = r2.A04
            r4.A01 = r0
            int r0 = r2.A02
            r4.A00 = r0
            return
        L_0x154d:
            r0.setVisibility(r5)
            goto L_0x152f
        L_0x1551:
            java.lang.Object r2 = r2.A00
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r2 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r2
            java.lang.String r0 = (java.lang.String) r0
            r1 = -1
            r2.A0F(r0, r1)
            return
        L_0x155c:
            java.lang.Object r3 = r2.A00
            X.0eF r3 = (X.C08310eF) r3
            android.content.Intent r0 = (android.content.Intent) r0
            X.03q r2 = r3.A0R()
            r1 = -1
            r2.setResult(r1, r0)
            X.03q r0 = r3.A0R()
        L_0x156e:
            r0.finish()
            return
        L_0x1572:
            java.lang.Object r3 = r2.A00
            com.whatsapp.wabloks.base.BkScreenFragment r3 = (com.whatsapp.wabloks.base.BkScreenFragment) r3
            int r1 = X.AnonymousClass001.A0K(r0)
            android.view.View r2 = r3.A0B
            if (r2 == 0) goto L_0x158e
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r1 = r0.getString(r1)
            r0 = 0
            X.4ab r0 = X.C88694ab.A01(r2, r1, r0)
            r0.A05()
        L_0x158e:
            r3.A1S()
            return
        L_0x1592:
            int r0 = r0.A00
            r12.Bot(r0)
            return
        L_0x1598:
            boolean r1 = r0.A08
            if (r1 == 0) goto L_0x15a6
            int r0 = r0.A02
            java.lang.String r0 = r12.getString(r0)
            r12.A6f(r0)
            return
        L_0x15a6:
            r12.BjL()
            return
        L_0x15aa:
            r12.BjL()
            android.content.Context r1 = r12.getApplicationContext()
            java.util.HashMap r4 = r0.A07
            java.lang.String r3 = r0.A06
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r0 = "com.whatsapp.payments.ui.BrazilPayBloksActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "screen_params"
            r2.putExtra(r0, r4)
            java.lang.String r0 = "screen_name"
            r2.putExtra(r0, r3)
            r0 = 1
            r12.BpY(r2, r0)
            return
        L_0x15d1:
            X.4FS r4 = r12.A04
            X.9H2 r0 = r12.A06
            if (r0 == 0) goto L_0x15e4
            int r1 = r0.A06()
            r0 = 1
            if (r1 != r0) goto L_0x15e4
            X.9H2 r1 = r12.A06
            r0 = 0
            r1.A0D(r0)
        L_0x15e4:
            android.os.Bundle r11 = X.AnonymousClass002.A08()
            java.lang.String r0 = "com.whatsapp.support.DescribeProblemActivity.from"
            java.lang.String r3 = "payments:settings"
            r11.putString(r0, r3)
            X.2s4 r15 = r12.A01
            X.3Mh r14 = r12.A06
            X.5WY r13 = r12.A00
            X.33j r2 = r12.A00
            X.33K r1 = r12.A02
            X.7ae r0 = r12.A04
            r17 = 0
            X.9H2 r10 = new X.9H2
            r16 = r2
            r18 = r17
            r19 = r1
            r20 = r0
            r21 = r3
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r12.A06 = r10
            X.C18270x1.A0w(r10, r4)
            return
        L_0x1612:
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r8.Bp9(r0)
            return
        L_0x1619:
            r4 = 2131102320(0x7f060a70, float:1.7817075E38)
            int r1 = X.AnonymousClass0Y8.A04(r2, r4)
            android.widget.ImageView r0 = r2.A01
            X.C107335b8.A0E(r0, r1)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.A08
            r0.setVisibility(r5)
            androidx.constraintlayout.widget.ConstraintLayout r0 = r2.A07
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r2.A03
            r0.setEnabled(r3)
            android.widget.TextView r0 = r2.A06
            X.AnonymousClass0x2.A0q(r2, r0, r4)
            android.widget.LinearLayout r0 = r2.A02
            r0.setEnabled(r3)
            return
        L_0x163f:
            android.content.Intent r1 = X.C18320x8.A07()
            r0 = -1
            r2.setResult(r0, r1)
            goto L_0x180c
        L_0x1649:
            android.content.Intent r3 = X.C18320x8.A07()
            java.lang.String r1 = "error"
            java.lang.String r0 = "1"
            r3.putExtra(r1, r0)
            r0 = 0
            r2.setResult(r0, r3)
            goto L_0x180c
        L_0x165a:
            java.lang.Object r4 = r2.A00
            X.9BX r4 = (X.AnonymousClass9BX) r4
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            r4.BjL()
            java.lang.Object r1 = r0.A00
            if (r1 != 0) goto L_0x166b
            java.lang.String r0 = "DyiReportBaseActivity/on-network-error error code is null"
            goto L_0x19c6
        L_0x166b:
            java.lang.Object r0 = r0.A01
            if (r0 == 0) goto L_0x1695
            X.34V r0 = (X.AnonymousClass34V) r0
            int r3 = r0.A00
        L_0x1673:
            int r2 = X.AnonymousClass001.A0K(r1)
            r1 = 2131892059(0x7f12175b, float:1.9418856E38)
            if (r2 == 0) goto L_0x1691
            r0 = 3
            r1 = 2131891934(0x7f1216de, float:1.9418602E38)
            if (r0 == r2) goto L_0x1691
            r0 = 1
            r1 = 2131891924(0x7f1216d4, float:1.9418582E38)
            if (r0 == r2) goto L_0x1691
            r0 = 2
            r1 = 2131893926(0x7f121ea6, float:1.9422642E38)
            if (r0 != r2) goto L_0x1691
            r1 = 2131891942(0x7f1216e6, float:1.9418618E38)
        L_0x1691:
            r4.A7A(r3, r1)
            return
        L_0x1695:
            r3 = -1
            goto L_0x1673
        L_0x1697:
            r0.setVisibility(r3)
            android.widget.ImageView r0 = r2.A02
            r0.setVisibility(r3)
            android.widget.TextView r0 = r2.A05
        L_0x16a1:
            r0.setVisibility(r5)
            return
        L_0x16a5:
            r3.BjL()
        L_0x16a8:
            r3.finish()
            return
        L_0x16ac:
            X.99L r1 = r0.A03
            X.C626936e.A06(r1)
            java.lang.String r6 = r0.A06
            java.lang.String r7 = r0.A05
            X.7yt r5 = r0.A02
            X.99L r1 = r0.A03
            java.lang.String r8 = r1.A0Q
            java.lang.String r9 = r1.A0O
            java.lang.String r10 = r3.A07
            X.39Q r4 = r0.A01
            java.lang.String r11 = r0.A08
            java.lang.String r12 = r0.A07
            r13 = 0
            r14 = 11
            r3.A7f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x16cc:
            r0 = 28
            X.C621433s.A01(r4, r0)
            return
        L_0x16d2:
            X.9ca r5 = r3.A0M
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r1 = 47
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.String r1 = r3.A0P
            r5.BKB(r4, r2, r8, r1)
            android.widget.Button r1 = r3.A02
            r1.setClickable(r6)
            android.widget.Button r1 = r3.A02
            r1.setText(r7)
            android.widget.ProgressBar r1 = r3.A06
            r1.setVisibility(r6)
            X.1VX r2 = r3.A0F
            r1 = 1933(0x78d, float:2.709E-42)
            boolean r1 = r2.A0X(r1)
            if (r1 == 0) goto L_0x1786
            java.lang.String r1 = r3.A0P
            boolean r1 = X.AnonymousClass9WY.A05(r1)
            if (r1 == 0) goto L_0x1786
            r3.A1Y()
            return
        L_0x1708:
            X.9ca r4 = r3.A0M
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r1 = X.C18290x4.A0c()
            java.lang.String r0 = r3.A0P
            r4.BKB(r2, r1, r8, r0)
            X.94m r0 = r3.A0O
            X.08M r0 = r0.A06
            java.lang.Object r6 = r0.A07()
            X.C626936e.A06(r6)
            X.9Wl r6 = (X.C195179Wl) r6
            X.99n r2 = r3.A0L
            X.4uZ r1 = r3.A0G
            java.lang.String r0 = r6.A06
            java.lang.String r5 = r6.A02
            boolean r0 = r2.A0I(r1, r0, r5)
            if (r0 == 0) goto L_0x175a
            X.9bk r4 = r3.A0H
            X.03q r2 = r3.A0R()
            java.lang.String r0 = r6.A08
            X.C626936e.A06(r0)
            X.4uZ r7 = r3.A0G
            java.lang.String r9 = r3.A0P
            r1 = 1001(0x3e9, float:1.403E-42)
            X.9Wl r8 = X.C195179Wl.A01(r0, r5)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity> r0 = com.whatsapp.payments.ui.IndiaUpiInterOpHybridActivity.class
            android.content.Intent r5 = X.AnonymousClass0x9.A08(r2, r0)
            X.3Mh r6 = r4.A00
            r10 = 0
            X.AnonymousClass9WY.A02(r5, r6, r7, r8, r9, r10)
            r2.startActivityForResult(r5, r1)
            r3.A1K()
            return
        L_0x175a:
            X.03q r1 = r3.A0Q()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentsAccountSetupActivity.class
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r1 = "extra_setup_mode"
            r0 = 1
            r4.putExtra(r1, r0)
            X.4uZ r2 = r3.A0G
            X.94m r0 = r3.A0O
            X.08M r0 = r0.A06
            java.lang.Object r1 = r0.A07()
            X.C626936e.A06(r1)
            X.9Wl r1 = (X.C195179Wl) r1
            X.3Mh r0 = r3.A0B
            X.AnonymousClass9WY.A01(r4, r0, r2, r1)
            java.lang.String r0 = "camera"
            X.AnonymousClass5VI.A00(r4, r0)
            r0 = 1001(0x3e9, float:1.403E-42)
            goto L_0x17b4
        L_0x1786:
            X.03q r2 = r3.A0Q()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity> r1 = com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity.class
            android.content.Intent r4 = X.AnonymousClass0x9.A08(r2, r1)
            java.lang.String r2 = "ARG_URL"
            java.lang.String r1 = r0.A01
            r4.putExtra(r2, r1)
            X.4uZ r1 = r3.A0G
            if (r1 == 0) goto L_0x17b8
            java.lang.String r2 = r1.getRawString()
        L_0x179f:
            java.lang.String r1 = "ARG_JID"
            r4.putExtra(r1, r2)
            java.lang.String r1 = "external_payment_source"
            java.lang.String r0 = r0.A02
            r4.putExtra(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = r3.A0P
            r4.putExtra(r1, r0)
            r0 = 1002(0x3ea, float:1.404E-42)
        L_0x17b4:
            r3.startActivityForResult(r4, r0)
            return
        L_0x17b8:
            java.lang.String r2 = ""
            goto L_0x179f
        L_0x17bb:
            X.1VX r1 = r2.A0D
            boolean r1 = X.C154437dA.A00(r1)
            if (r1 == 0) goto L_0x1810
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet> r1 = com.whatsapp.payments.ui.IndiaUpiSendPaymentActivityBottomSheet.class
        L_0x17c5:
            android.content.Intent r5 = X.AnonymousClass0x9.A08(r2, r1)
            X.1VX r3 = r2.A0D
            r1 = 1955(0x7a3, float:2.74E-42)
            boolean r1 = r3.A0X(r1)
            if (r1 == 0) goto L_0x17e0
            X.94u r1 = r2.A06
            X.9Wl r1 = r1.A0D()
            boolean r3 = r1.A0P
            java.lang.String r1 = "extra_transaction_is_valid_merchant"
            r5.putExtra(r1, r3)
        L_0x17e0:
            X.4uZ r4 = r2.A01
            X.94u r1 = r2.A06
            X.9Wl r3 = r1.A0D()
            X.3Mh r1 = r2.A06
            X.AnonymousClass9WY.A01(r5, r1, r4, r3)
            android.content.Intent r3 = r2.getIntent()
            java.lang.String r1 = "referral_screen"
            X.C1899693i.A0j(r3, r5, r1)
            java.lang.String r3 = "extra_is_pay_money_only"
            boolean r1 = r0.A03
            r5.putExtra(r3, r1)
            java.lang.String r1 = "return-after-pay"
            boolean r0 = r0.A04
            r5.putExtra(r1, r0)
            r0 = 33554432(0x2000000, float:9.403955E-38)
            r5.addFlags(r0)
            r2.startActivity(r5)
        L_0x180c:
            r2.finish()
            return
        L_0x1810:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity> r1 = com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity.class
            goto L_0x17c5
        L_0x1813:
            X.5hX r1 = r2.A00
            X.94u r0 = r2.A06
            X.9Wl r0 = r0.A0D()
            java.lang.String r0 = r0.A0F
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r1.BkW(r2, r0, r3)
            return
        L_0x1825:
            r0 = 21
            goto L_0x186d
        L_0x1828:
            r0 = 22
            goto L_0x186d
        L_0x182b:
            r0 = 25
            goto L_0x186d
        L_0x182e:
            r0 = 24
            goto L_0x186d
        L_0x1831:
            java.lang.String r0 = r0.A02
            r2.A08 = r0
            r0 = 26
            goto L_0x186d
        L_0x1838:
            java.lang.String r0 = r0.A02
            r2.A08 = r0
            r0 = 40
            goto L_0x186d
        L_0x183f:
            java.lang.Object r3 = r2.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r3 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r3
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            android.widget.ProgressBar r2 = r3.A01
            boolean r1 = r0.booleanValue()
            int r0 = X.AnonymousClass001.A08(r1)
            r2.setVisibility(r0)
            com.whatsapp.wds.components.button.WDSButton r0 = r3.A0R
            r1 = r1 ^ 1
            r0.setEnabled(r1)
            android.widget.EditText r0 = r3.A00
        L_0x185b:
            r0.setEnabled(r1)
            return
        L_0x185f:
            java.lang.Object r2 = r2.A00
            android.app.Activity r2 = (android.app.Activity) r2
            X.9Nb r0 = (X.C193079Nb) r0
            int r1 = r0.A00
            r0 = 201(0xc9, float:2.82E-43)
            if (r1 == 0) goto L_0x186d
            r0 = 200(0xc8, float:2.8E-43)
        L_0x186d:
            X.C621433s.A01(r2, r0)
            return
        L_0x1871:
            if (r4 != 0) goto L_0x1878
            X.4eZ r0 = r2.A01
            r0.BjL()
        L_0x1878:
            X.1n7 r10 = r3.A04
            X.C626936e.A06(r10)
            X.39W r0 = r10.A00
            X.C626936e.A06(r0)
            X.39S r4 = r0.A01
            X.34w r8 = r3.A00
            X.C626936e.A06(r4)
            X.9Wq r5 = r2.A0V
            java.lang.String r6 = r5.A0c(r4)
            java.util.List r0 = r4.A0I
            if (r0 == 0) goto L_0x18b1
            java.util.Iterator r7 = r0.iterator()
        L_0x1897:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x18b1
            java.lang.Object r0 = r7.next()
            X.399 r0 = (X.AnonymousClass399) r0
            java.lang.String r1 = "payment_instruction"
            java.lang.String r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x1897
            java.lang.String r0 = "CustomPaymentInstructions"
            r2.A0A = r0
        L_0x18b1:
            X.213 r9 = X.AnonymousClass213.NONE
            java.lang.String r0 = "GlobalPayment"
            java.lang.String r1 = r2.A0A
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x18c5
            java.lang.String r0 = "CustomPaymentInstructions"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x18c7
        L_0x18c5:
            X.213 r9 = X.AnonymousClass213.INACTIVE
        L_0x18c7:
            java.util.List r11 = r3.A06
            r2.A0E = r6
            X.9Tf r3 = new X.9Tf
            r3.<init>()
            X.33j r1 = r2.A0J
            r3.A01 = r1
            r3.A02 = r8
            r3.A03 = r5
            X.3Ex r0 = r2.A0G
            r3.A00 = r0
            r2.A02 = r3
            X.9Rj r0 = r2.A04
            r0.A00 = r10
            X.9U0 r6 = r2.A08
            X.4eZ r7 = r2.A01
            X.9QL r0 = r6.A01(r7, r8, r9, r10, r11)
            r2.A01(r9, r0)
            X.39H r0 = r4.A07
            X.39G r0 = r0.A03
            java.lang.String r0 = r4.A06(r1, r0)
            r2.A0C = r0
            return
        L_0x18f8:
            java.lang.Object r5 = r2.A00
            com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment r5 = (com.whatsapp.payments.ui.invites.IndiaUpiPaymentInviteFragment) r5
            X.0PJ r0 = (X.AnonymousClass0PJ) r0
            java.lang.Object r1 = r0.A00
            if (r1 == 0) goto L_0x19c1
            java.lang.Object r6 = r0.A01
            if (r6 == 0) goto L_0x19c1
            X.99D r1 = (X.AnonymousClass99D) r1
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x19b5
            boolean r0 = r1.A05
            if (r0 != 0) goto L_0x19b5
            boolean r0 = r1.A06
            r4 = 0
            if (r0 == 0) goto L_0x1934
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "showProgress("
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ")"
            X.C18260x0.A1L(r1, r0)
            X.9am r3 = r5.A01
            r2 = 2
            java.util.List r1 = r5.A05
            X.7HR r0 = new X.7HR
            r0.<init>(r2, r1)
            r3.Axq(r0)
            return
        L_0x1934:
            A05(r5)
            android.content.Context r0 = r5.A0G()
            X.0zH r3 = X.AnonymousClass5V0.A00(r0)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.5ZU r1 = r5.A02
            X.3Ex r0 = r5.A00
            X.4uZ r6 = (X.C95814uZ) r6
            X.3ZH r0 = r0.A0A(r6)
            java.lang.String r0 = r1.A0M(r0)
            r2[r4] = r0
            r1 = 2131892008(0x7f121728, float:1.9418752E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1, r2)
            r3.A0g(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 5
            X.9pE r0 = new X.9pE
            r0.<init>(r1)
            r3.A0Y(r0, r2)
            r3.A0i(r4)
            r3.A0S()
            return
        L_0x1974:
            A05(r5)
            android.content.Context r0 = r5.A0G()
            X.0zH r4 = X.AnonymousClass5V0.A00(r0)
            java.lang.Object[] r2 = X.AnonymousClass002.A0L()
            X.5ZU r1 = r5.A02
            X.3Ex r0 = r5.A00
            X.4uZ r3 = (X.C95814uZ) r3
            X.3ZH r0 = r0.A0A(r3)
            java.lang.String r0 = r1.A0M(r0)
            r3 = 0
            r2[r3] = r0
            r1 = 2131892008(0x7f121728, float:1.9418752E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r5)
            java.lang.String r0 = r0.getString(r1, r2)
            r4.A0g(r0)
            r2 = 2131891392(0x7f1214c0, float:1.9417503E38)
            r1 = 4
            X.9pE r0 = new X.9pE
            r0.<init>(r1)
            r4.A0Y(r0, r2)
            r4.A0i(r3)
            r4.A0S()
            return
        L_0x19b5:
            java.lang.String r0 = "startPaymentFlow()"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.94j r1 = r5.A02
            r0 = 1
            r1.A0D(r0)
            return
        L_0x19c1:
            java.lang.String r0 = "handleContactSync() parameters are null"
            goto L_0x19c6
        L_0x19c4:
            java.lang.String r0 = "handleError() parameters are null"
        L_0x19c6:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C205049qL.BOf(java.lang.Object):void");
    }
}
