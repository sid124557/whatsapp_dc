package X;

import android.view.View;

/* renamed from: X.9p3  reason: invalid class name and case insensitive filesystem */
public class C204249p3 implements View.OnClickListener {
    public Object A00;
    public final int A01;

    public C204249p3(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static C204249p3 A00(Object obj, int i) {
        return new C204249p3(obj, i);
    }

    public static final void A01(View view, C204249p3 r4) {
        AnonymousClass9F0 r2 = (AnonymousClass9F0) r4.A00;
        view.setVisibility(8);
        r2.A03.setVisibility(0);
        r2.A00 = true;
        C203499no r3 = r2.A04;
        if (r3 != null) {
            C1899593h.A1E(r3, 112, "payment_transaction_details", (String) null);
        }
    }

    public static void A02(View view, Object obj, int i) {
        view.setOnClickListener(new C204249p3(obj, i));
    }

    public static final void A03(C204249p3 r1) {
        ((AnonymousClass9E8) r1.A00).A05.BXN("wa_p2m_lite_receipt_support");
    }

    public static final void A04(C204249p3 r3) {
        AnonymousClass9E8 r0 = (AnonymousClass9E8) r3.A00;
        r0.A05.BXP(r0.A04, r0.A06, r0.A08);
    }

    public static final void A05(C204249p3 r4) {
        C95814uZ r2;
        AnonymousClass9E8 r1 = (AnonymousClass9E8) r4.A00;
        C203479nl r42 = r1.A05;
        AnonymousClass4DV r3 = r1.A06;
        AnonymousClass9O6 r0 = r1.A02;
        if (r0 != null) {
            r2 = r0.A00;
        } else {
            r2 = r1.A04;
        }
        r42.BWT(r2, r3, r1.A00);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v59, resolved type: X.9DA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v64, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v66, resolved type: X.9Ba} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v78, resolved type: X.9D7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v75, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v79, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v54, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v119, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v121, resolved type: com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v122, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v141, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v123, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v124, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v142, resolved type: com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v125, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v126, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v127, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v128, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v129, resolved type: com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v81, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v82, resolved type: X.9Q9} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v593, resolved type: X.03q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v83, resolved type: X.9Of} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v84, resolved type: X.9QJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v85, resolved type: X.9Fq} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v86, resolved type: X.9P4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v89, resolved type: X.9QJ} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v90, resolved type: X.9P7} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v594, resolved type: com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x03af, code lost:
        r1.A1Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x03b2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x03c7, code lost:
        r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x03c9, code lost:
        if (r0 == null) goto L_0x03ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x03cb, code lost:
        r0.A1J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x03ce, code lost:
        r0 = r2.A0E;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x03d7, code lost:
        r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03d9, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03db, code lost:
        r0.A1Y();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0088, code lost:
        r1 = new int[r1];
        r1[r3] = 40;
        r0 = X.AnonymousClass36F.A04(r2, r1);
        r4.A00 = new X.C632038i((java.lang.String) r0.second, (java.lang.String[]) r0.first);
        r0 = r5.A02;
        r4 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x03de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0450, code lost:
        r0.A0H(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0453, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x072d, code lost:
        if (r0 != false) goto L_0x072f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0910, code lost:
        X.C621433s.A01(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0913, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0b05, code lost:
        r3.A1J(1, r2, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0b0a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0b4d, code lost:
        r2 = java.lang.Integer.valueOf(r0);
        r1 = "two_factor_nudge_prompt";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:382:0x0ba8, code lost:
        r4.BKB(r3, r2, r1, (java.lang.String) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:383:0x0bac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        r0.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0d18, code lost:
        r1.A1J(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0d1b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:420:0x0d39, code lost:
        r3.startActivityForResult(r2, 501);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0d3e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:424:0x0d4a, code lost:
        r1.A1i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:425:0x0d4d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:429:0x0d6a, code lost:
        r3.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:430:0x0d6d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:448:0x0dce, code lost:
        r4.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:449:0x0dd1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:490:0x0f28, code lost:
        r3.A1Y(r2, r3.A08, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:491:0x0f2e, code lost:
        r3.A1K();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0f31, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:503:0x0f51, code lost:
        r1 = new X.AnonymousClass9Q9(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:504:0x0f56, code lost:
        r3.A0H(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:505:0x0f59, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:516:0x0f90, code lost:
        r1.A01 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:518:0x0fa4, code lost:
        r2.A07.A00.A0G(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:519:0x0fab, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:554:0x1060, code lost:
        r1.startActivity(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:555:0x1063, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:558:0x1077, code lost:
        r1 = new X.AnonymousClass5XB(r14, (X.C95814uZ) r0, r2);
        r1.A04 = X.AnonymousClass0YZ.A06(r3.A05);
        r1.A02(X.C111095hX.A02(r3.getContext()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:559:0x108f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:571:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:591:?, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r14) {
        /*
            r13 = this;
            int r0 = r13.A01
            switch(r0) {
                case 0: goto L_0x0498;
                case 1: goto L_0x04a0;
                case 2: goto L_0x04ae;
                case 3: goto L_0x04b6;
                case 4: goto L_0x04be;
                case 5: goto L_0x04c6;
                case 6: goto L_0x04dd;
                case 7: goto L_0x04e5;
                case 8: goto L_0x0502;
                case 9: goto L_0x00d5;
                case 10: goto L_0x0510;
                case 11: goto L_0x051b;
                case 12: goto L_0x00e1;
                case 13: goto L_0x0526;
                case 14: goto L_0x010b;
                case 15: goto L_0x053b;
                case 16: goto L_0x0552;
                case 17: goto L_0x0562;
                case 18: goto L_0x0593;
                case 19: goto L_0x05a1;
                case 20: goto L_0x062f;
                case 21: goto L_0x0132;
                case 22: goto L_0x0643;
                case 23: goto L_0x065b;
                case 24: goto L_0x0695;
                case 25: goto L_0x06d5;
                case 26: goto L_0x0711;
                case 27: goto L_0x0733;
                case 28: goto L_0x0005;
                case 29: goto L_0x0005;
                case 30: goto L_0x0746;
                case 31: goto L_0x0005;
                case 32: goto L_0x0005;
                case 33: goto L_0x0751;
                case 34: goto L_0x076c;
                case 35: goto L_0x077b;
                case 36: goto L_0x076c;
                case 37: goto L_0x078f;
                case 38: goto L_0x07d8;
                case 39: goto L_0x07e0;
                case 40: goto L_0x07ee;
                case 41: goto L_0x0010;
                case 42: goto L_0x07fd;
                case 43: goto L_0x0835;
                case 44: goto L_0x0847;
                case 45: goto L_0x0156;
                case 46: goto L_0x01a1;
                case 47: goto L_0x084f;
                case 48: goto L_0x0868;
                case 49: goto L_0x0880;
                case 50: goto L_0x089b;
                case 51: goto L_0x08a5;
                case 52: goto L_0x0b71;
                case 53: goto L_0x08c5;
                case 54: goto L_0x08db;
                case 55: goto L_0x0914;
                case 56: goto L_0x0968;
                case 57: goto L_0x0990;
                case 58: goto L_0x0990;
                case 59: goto L_0x0998;
                case 60: goto L_0x09a4;
                case 61: goto L_0x023d;
                case 62: goto L_0x0498;
                case 63: goto L_0x09bf;
                case 64: goto L_0x09cd;
                case 65: goto L_0x09d9;
                case 66: goto L_0x0a1c;
                case 67: goto L_0x0a31;
                case 68: goto L_0x0260;
                case 69: goto L_0x0a61;
                case 70: goto L_0x0a6a;
                case 71: goto L_0x0a84;
                case 72: goto L_0x0ad1;
                case 73: goto L_0x0ae3;
                case 74: goto L_0x0af5;
                case 75: goto L_0x0b0b;
                case 76: goto L_0x0b2f;
                case 77: goto L_0x0b3e;
                case 78: goto L_0x03df;
                case 79: goto L_0x0b54;
                case 80: goto L_0x0b71;
                case 81: goto L_0x0b71;
                case 82: goto L_0x0b79;
                case 83: goto L_0x0b91;
                case 84: goto L_0x0bad;
                case 85: goto L_0x0bf4;
                case 86: goto L_0x029d;
                case 87: goto L_0x02c2;
                case 88: goto L_0x02f7;
                case 89: goto L_0x0c0f;
                case 90: goto L_0x0c2c;
                case 91: goto L_0x0339;
                case 92: goto L_0x0c2c;
                case 93: goto L_0x0018;
                case 94: goto L_0x0345;
                case 95: goto L_0x036c;
                case 96: goto L_0x0c95;
                case 97: goto L_0x0043;
                case 98: goto L_0x037f;
                case 99: goto L_0x0ccf;
                case 100: goto L_0x0cd7;
                case 101: goto L_0x0cdf;
                case 102: goto L_0x0cfb;
                case 103: goto L_0x0cfb;
                case 104: goto L_0x0d03;
                case 105: goto L_0x03a0;
                case 106: goto L_0x0d0d;
                case 107: goto L_0x0d13;
                case 108: goto L_0x03d1;
                case 109: goto L_0x0d1c;
                case 110: goto L_0x0d3f;
                case 111: goto L_0x0d45;
                case 112: goto L_0x0d4e;
                case 113: goto L_0x03b3;
                case 114: goto L_0x03bd;
                case 115: goto L_0x03d1;
                case 116: goto L_0x0d56;
                case 117: goto L_0x0d6e;
                case 118: goto L_0x03df;
                case 119: goto L_0x0d76;
                case 120: goto L_0x0db3;
                case 121: goto L_0x0e2c;
                case 122: goto L_0x0e35;
                case 123: goto L_0x03e5;
                case 124: goto L_0x0e42;
                case 125: goto L_0x0f03;
                case 126: goto L_0x0f0e;
                case 127: goto L_0x0f17;
                case 128: goto L_0x0f32;
                case 129: goto L_0x0f36;
                case 130: goto L_0x0f3a;
                case 131: goto L_0x0f3e;
                case 132: goto L_0x0049;
                case 133: goto L_0x0405;
                case 134: goto L_0x0f42;
                case 135: goto L_0x0f4a;
                case 136: goto L_0x042c;
                case 137: goto L_0x0049;
                case 138: goto L_0x005d;
                case 139: goto L_0x0073;
                case 140: goto L_0x0f5a;
                case 141: goto L_0x00a5;
                case 142: goto L_0x0f62;
                case 143: goto L_0x00b4;
                case 144: goto L_0x0f6a;
                case 145: goto L_0x00c6;
                case 146: goto L_0x0f72;
                case 147: goto L_0x0f7b;
                case 148: goto L_0x0f86;
                case 149: goto L_0x0f93;
                case 150: goto L_0x0fac;
                case 151: goto L_0x0454;
                case 152: goto L_0x0454;
                case 153: goto L_0x0fd3;
                case 154: goto L_0x0fe0;
                case 155: goto L_0x0460;
                case 156: goto L_0x0ff6;
                case 157: goto L_0x1052;
                case 158: goto L_0x1064;
                case 159: goto L_0x106e;
                case 160: goto L_0x1090;
                case 161: goto L_0x0475;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A7X()
        L_0x000c:
            r0.finish()
        L_0x000f:
            return
        L_0x0010:
            java.lang.Object r0 = r13.A00
            X.9D7 r0 = (X.AnonymousClass9D7) r0
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = r0.A09
            goto L_0x03db
        L_0x0018:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeScannedDialogFragment) r0
            X.94m r1 = r0.A0O
            X.99l r0 = r1.A0G
            boolean r0 = r0.A0C()
            if (r0 == 0) goto L_0x0c8b
            r0 = 1
            X.9P7 r4 = new X.9P7
            r4.<init>(r0)
            X.08M r0 = r1.A06
            java.lang.Object r0 = r0.A07()
            X.C626936e.A06(r0)
            X.9Wl r0 = (X.C195179Wl) r0
            java.lang.String r0 = r0.A08
            r4.A01 = r0
            java.lang.String r0 = r1.A0B
            r4.A02 = r0
            X.4UC r0 = r1.A0A
            goto L_0x0450
        L_0x0043:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0
            goto L_0x03db
        L_0x0049:
            java.lang.Object r1 = r13.A00
            X.94y r1 = (X.AnonymousClass94y) r1
            r0 = 201(0xc9, float:2.82E-43)
            X.9QJ r4 = X.AnonymousClass9QJ.A00(r0)
            X.9Pj r0 = r1.A06
            X.34w r0 = r0.A01
            r4.A05 = r0
            X.4UC r0 = r1.A08
            goto L_0x0450
        L_0x005d:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r5 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r5
            r3 = 0
            X.9P4 r4 = new X.9P4
            r4.<init>()
            r1 = 1
            r4.A01 = r1
            r4.A02 = r3
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {417, 418} // fill-array
            goto L_0x0088
        L_0x0073:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel r5 = (com.whatsapp.payments.ui.viewmodel.IndiaUpiMandateHistoryViewModel) r5
            r3 = 0
            X.9P4 r4 = new X.9P4
            r4.<init>()
            r1 = 1
            r4.A01 = r1
            r4.A02 = r1
            r0 = 2
            int[] r2 = new int[r0]
            r2 = {20, 401} // fill-array
        L_0x0088:
            int[] r1 = new int[r1]
            r0 = 40
            r1[r3] = r0
            android.util.Pair r0 = X.AnonymousClass36F.A04(r2, r1)
            java.lang.Object r2 = r0.second
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.first
            java.lang.String[] r1 = (java.lang.String[]) r1
            X.38i r0 = new X.38i
            r0.<init>(r2, r1)
            r4.A00 = r0
            X.4UC r0 = r5.A02
            goto L_0x0450
        L_0x00a5:
            java.lang.Object r1 = r13.A00
            X.94y r1 = (X.AnonymousClass94y) r1
            r0 = 107(0x6b, float:1.5E-43)
            X.9Fq r4 = new X.9Fq
            r4.<init>(r0)
            X.4UC r0 = r1.A08
            goto L_0x0450
        L_0x00b4:
            java.lang.Object r1 = r13.A00
            X.94y r1 = (X.AnonymousClass94y) r1
            r0 = 17
            X.9QJ r4 = X.AnonymousClass9QJ.A00(r0)
            X.34w r0 = r1.A04
            r4.A05 = r0
            X.4UC r0 = r1.A08
            goto L_0x0450
        L_0x00c6:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r2 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r2
            r1 = -1
            r0 = 1
            X.9Of r4 = new X.9Of
            r4.<init>(r0, r1)
            X.08J r0 = r2.A01
            goto L_0x0450
        L_0x00d5:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r0 = (com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment) r0
            X.9nB r0 = r0.A0B
            if (r0 == 0) goto L_0x000f
            r0.BTk(r14)
            return
        L_0x00e1:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r4 = (com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r4
            r4.A1K()
            r0 = 159(0x9f, float:2.23E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "prompt_recover_payments"
            java.lang.String r1 = r4.A06
            X.9no r0 = r4.A04
            X.C1899593h.A1E(r0, r3, r2, r1)
            X.9PR r0 = r4.A05
            if (r0 == 0) goto L_0x000f
            X.9W1 r4 = r0.A01
            X.4eZ r3 = r0.A00
            r2 = 0
            X.9Rg r1 = r4.A0G
            X.9cR r0 = new X.9cR
            r0.<init>(r3, r4, r2)
            r1.A00(r0, r2)
            return
        L_0x010b:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r4 = (com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r4
            r4.A1K()
            r0 = 160(0xa0, float:2.24E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "prompt_recover_payments"
            java.lang.String r1 = r4.A06
            X.9no r0 = r4.A04
            X.C1899593h.A1E(r0, r3, r2, r1)
            X.9PR r0 = r4.A05
            if (r0 == 0) goto L_0x000f
            X.9W1 r4 = r0.A01
            X.4eZ r3 = r0.A00
            java.lang.String r2 = r0.A03
            java.lang.String r1 = r0.A02
            r0 = 0
            r4.A03(r3, r2, r1, r0)
            return
        L_0x0132:
            java.lang.Object r0 = r13.A00
            X.9BY r0 = (X.AnonymousClass9BY) r0
            X.9S2 r3 = r0.A0G
            boolean r0 = r3.A00
            if (r0 == 0) goto L_0x000f
            X.9W3 r0 = r3.A05
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x1098
            com.whatsapp.payments.pin.ui.PinBottomSheetDialogFragment r2 = X.AnonymousClass9SH.A00()
            r1 = 0
            X.9qQ r0 = new X.9qQ
            r0.<init>(r2, r1, r3)
            r2.A0B = r0
            X.4eZ r0 = r3.A01
            r0.Boo(r2)
            return
        L_0x0156:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            X.0eF r4 = r5.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r4 = (com.whatsapp.payments.ui.PaymentBottomSheet) r4
            if (r4 == 0) goto L_0x000f
            com.whatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x019e
            com.whatsapp.WaEditText r0 = r5.A01
            java.lang.String r1 = X.C18290x4.A0m(r0)
        L_0x016e:
            r0 = 0
            X.303[] r0 = new X.AnonymousClass303[r0]
            r10 = 0
            X.303 r6 = new X.303
            r6.<init>(r10, r0)
            java.lang.String r0 = r5.A0B
            boolean r0 = r1.equals(r0)
            r3 = 1
            r2 = r0 ^ 1
            boolean r1 = X.C18320x8.A1U(r1)
            java.lang.String r0 = "has_description"
            r6.A04(r0, r1)
            java.lang.String r0 = "is_description_modified"
            r6.A04(r0, r2)
            X.9ca r5 = r5.A07
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.String r9 = "payment_description"
            r8 = r7
            r5.BKE(r6, r7, r8, r9, r10)
            r4.A1Y()
            return
        L_0x019e:
            java.lang.String r1 = ""
            goto L_0x016e
        L_0x01a1:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment r5 = (com.whatsapp.payments.ui.IndiaUpiEditTransactionDescriptionFragment) r5
            X.9nK r0 = r5.A08
            r3 = 0
            if (r0 == 0) goto L_0x01d0
            X.9pg r0 = (X.C204639pg) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x01cb
            X.9cu r0 = (X.C197309cu) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
        L_0x01b6:
            X.9Pc r0 = r0.A0F
            if (r0 != 0) goto L_0x01d0
            X.3Wi r2 = r5.A00
            android.content.res.Resources r1 = X.C08310eF.A09(r5)
            r0 = 2131891718(0x7f121606, float:1.9418164E38)
            java.lang.String r0 = r1.getString(r0)
            r2.A0P(r0, r3)
            return
        L_0x01cb:
            X.9cw r0 = (X.C197329cw) r0
            X.9Bs r0 = r0.A04
            goto L_0x01b6
        L_0x01d0:
            com.whatsapp.WaEditText r0 = r5.A01
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0234
            com.whatsapp.WaEditText r0 = r5.A01
            java.lang.String r0 = X.C86604Kt.A0o(r0)
        L_0x01de:
            r5.A0B = r0
            X.303[] r0 = new X.AnonymousClass303[r3]
            r11 = 0
            X.303 r7 = new X.303
            r7.<init>(r11, r0)
            java.lang.String r0 = r5.A0B
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r0 = "has_description"
            r7.A04(r0, r1)
            X.9ca r6 = r5.A07
            java.lang.Integer r8 = X.AnonymousClass001.A0f()
            r0 = 4
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.String r10 = "payment_description"
            r6.BKE(r7, r8, r9, r10, r11)
            r0 = 1
            X.0eF r4 = r5.A0P(r0)
            X.0eF r3 = r5.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r3 = (com.whatsapp.payments.ui.PaymentBottomSheet) r3
            X.9nK r0 = r5.A08
            if (r0 == 0) goto L_0x0225
            java.lang.String r2 = r5.A0B
            X.9pg r0 = (X.C204639pg) r0
            int r1 = r0.A01
            java.lang.Object r0 = r0.A00
            if (r1 == 0) goto L_0x022f
            X.9cu r0 = (X.C197309cu) r0
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r0 = r0.A00
        L_0x021e:
            r0.A0R = r2
            com.whatsapp.payments.ui.widget.PaymentDescriptionRow r0 = r0.A0M
            r0.A01(r2)
        L_0x0225:
            boolean r0 = r4 instanceof X.C203229nK
            if (r0 == 0) goto L_0x0237
            if (r3 == 0) goto L_0x000f
            r3.A1b(r4)
            return
        L_0x022f:
            X.9cw r0 = (X.C197329cw) r0
            X.9Bs r0 = r0.A04
            goto L_0x021e
        L_0x0234:
            java.lang.String r0 = ""
            goto L_0x01de
        L_0x0237:
            if (r3 == 0) goto L_0x000f
            r3.A1Y()
            return
        L_0x023d:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity r1 = (com.whatsapp.payments.ui.IndiaUpiPauseMandateActivity) r1
            r1.A7r()
            com.google.android.material.textfield.TextInputLayout r0 = r1.A04
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            com.google.android.material.textfield.TextInputLayout r0 = r1.A03
            java.lang.CharSequence r0 = r0.getError()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x000f
            X.AnonymousClass97T.A10(r1)
            return
        L_0x0260:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r2
            android.content.Context r1 = r2.A0G()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity> r0 = com.whatsapp.payments.ui.IndiaUpiMandateHistoryActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r1, r0)
            r2.A0m(r0)
            com.whatsapp.payments.ui.viewmodel.IndiaPaymentSettingsViewModel r1 = r2.A0T
            X.9VG r8 = r2.A0q
            X.9no r7 = r1.A0B
            boolean r0 = r7 instanceof X.C197109ca
            if (r0 == 0) goto L_0x000f
            X.9ca r7 = (X.C197109ca) r7
            java.lang.Integer r6 = X.AnonymousClass001.A0f()
            r0 = 103(0x67, float:1.44E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "payment_home"
            r3 = 0
            boolean r2 = r1.A0P()
            X.2sH r1 = r1.A05
            r0 = 0
            X.303 r1 = X.AnonymousClass9Wg.A00(r1, r3, r8, r3, r0)
            X.6ig r0 = r7.A05(r6, r5, r4, r3)
            X.C197109ca.A02(r0, r1, r7, r2)
            return
        L_0x029d:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "payments_profile"
            java.lang.String r0 = r5.A0K
            r4.BKB(r3, r2, r1, r0)
            r0 = 13
            boolean r0 = r5.A7a(r0)
            if (r0 == 0) goto L_0x000f
            r0 = 38
            X.C621433s.A01(r5, r0)
            return
        L_0x02c2:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r5.A0K
            java.lang.String r1 = "payments_profile"
            r4.BKB(r3, r2, r1, r0)
            r0 = 12
            boolean r0 = r5.A7a(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r5, r0)
            java.lang.String r0 = "extra_referral_screen"
            r2.putExtra(r0, r1)
            java.lang.String r1 = "extra_payment_name"
            X.7yt r0 = r5.A0D
            r2.putExtra(r1, r0)
            r5.startActivity(r2)
            return
        L_0x02f7:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r4 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r4
            X.9ca r5 = r4.A0S
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            r0 = 127(0x7f, float:1.78E-43)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = r4.A0K
            java.lang.String r3 = "payments_profile"
            r5.BKB(r2, r1, r3, r0)
            r0 = 12
            boolean r0 = r4.A7a(r0)
            if (r0 == 0) goto L_0x000f
            X.7bU r0 = r4.A0G
            boolean r0 = r0.A06()
            java.lang.String r2 = "extra_payment_name"
            if (r0 == 0) goto L_0x0336
            java.lang.String r3 = r4.A0K
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiCreateCustomNumberActivity.class
        L_0x0324:
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r4, r0)
            java.lang.String r0 = "extra_referral_screen"
            r1.putExtra(r0, r3)
            X.7yt r0 = r4.A0D
            r1.putExtra(r2, r0)
            r4.startActivity(r1)
            return
        L_0x0336:
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            goto L_0x0324
        L_0x0339:
            java.lang.Object r0 = r13.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r0 = r0.A0Q()
            if (r0 == 0) goto L_0x000f
            goto L_0x000c
        L_0x0345:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r1 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r1
            X.03q r3 = r1.A0Q()
            boolean r0 = r3 instanceof com.whatsapp.payments.ui.IndiaUpiQrTabActivity
            if (r0 == 0) goto L_0x000f
            X.5Q3 r1 = r1.A05
            r0 = 4
            r1.A01(r0)
            X.4el r3 = (X.C89704el) r3
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r3.getPackageName()
            java.lang.String r0 = "com.whatsapp.gallerypicker.GalleryPickerLauncher"
            r2.setClassName(r1, r0)
            r0 = 203(0xcb, float:2.84E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x036c:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment r2 = (com.whatsapp.payments.ui.IndiaUpiScanQrCodeFragment) r2
            com.whatsapp.qrcode.WaQrScannerView r1 = r2.A06
            boolean r0 = r1.BqT()
            if (r0 == 0) goto L_0x000f
            r1.Bqx()
            r2.A1K()
            return
        L_0x037f:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r4 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r4
            X.9ca r3 = r4.A0I
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            java.lang.String r1 = "enter_user_payment_id"
            java.lang.String r0 = r4.A0S
            r3.BKB(r2, r2, r1, r0)
            X.9Rz r0 = r4.A0J
            if (r0 == 0) goto L_0x000f
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r0.A01
            if (r1 == 0) goto L_0x000f
            boolean r0 = r0.A08
            if (r0 == 0) goto L_0x03af
            r1.A1K()
            return
        L_0x03a0:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.0eF r1 = r0.A0E
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = (com.whatsapp.payments.ui.PaymentBottomSheet) r1
            if (r1 == 0) goto L_0x000f
            X.9nr r0 = r0.A07
            r0.BNF()
        L_0x03af:
            r1.A1Y()
            return
        L_0x03b3:
            java.lang.Object r2 = r13.A00
            X.0eF r2 = (X.C08310eF) r2
            r1 = 1
            X.0eF r0 = r2.A0P(r1)
            goto L_0x03c7
        L_0x03bd:
            java.lang.Object r2 = r13.A00
            X.0eF r2 = (X.C08310eF) r2
            r1 = 0
            r0 = 1
            X.0eF r0 = r2.A0P(r0)
        L_0x03c7:
            com.whatsapp.payments.ui.ConfirmPaymentFragment r0 = (com.whatsapp.payments.ui.ConfirmPaymentFragment) r0
            if (r0 == 0) goto L_0x03ce
            r0.A1J(r1)
        L_0x03ce:
            X.0eF r0 = r2.A0E
            goto L_0x03d7
        L_0x03d1:
            java.lang.Object r0 = r13.A00
            X.0eF r0 = (X.C08310eF) r0
            X.0eF r0 = r0.A0E
        L_0x03d7:
            com.whatsapp.payments.ui.PaymentBottomSheet r0 = (com.whatsapp.payments.ui.PaymentBottomSheet) r0
            if (r0 == 0) goto L_0x000f
        L_0x03db:
            r0.A1Y()
            return
        L_0x03df:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            goto L_0x000c
        L_0x03e5:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet r2 = (com.whatsapp.payments.ui.instructions.PaymentCustomInstructionsBottomSheet) r2
            X.03q r1 = r2.A0Q()
            boolean r0 = r1 instanceof X.C202799mb
            if (r0 == 0) goto L_0x000f
            X.9mb r1 = (X.C202799mb) r1
            X.4uZ r0 = r2.A03
            X.C626936e.A06(r0)
            r1.BPf(r0)
            r0 = 4
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r0 = 1
            r2.A1e(r0, r1)
            return
        L_0x0405:
            java.lang.Object r3 = r13.A00
            X.94o r3 = (X.C1902194o) r3
            X.6ho r0 = r3.A01
            X.6hx r1 = r0.A08
            X.6hv r1 = (X.C133776hv) r1
            java.lang.String r0 = r1.A0C
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000f
            r0 = 3
            X.9Q9 r4 = new X.9Q9
            r4.<init>(r0)
            java.lang.String r2 = r1.A0C
            java.lang.String r1 = "[^\\d]"
            java.lang.String r0 = ""
            java.lang.String r0 = r2.replaceAll(r1, r0)
            r4.A05 = r0
            X.4UC r0 = r3.A03
            goto L_0x0450
        L_0x042c:
            java.lang.Object r2 = r13.A00
            X.94o r2 = (X.C1902194o) r2
            X.6ho r0 = r2.A01
            X.6hx r1 = r0.A08
            X.6hv r1 = (X.C133776hv) r1
            if (r1 == 0) goto L_0x000f
            java.lang.String r0 = r1.A06
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x000f
            r0 = 2
            X.9Q9 r4 = new X.9Q9
            r4.<init>(r0)
            java.lang.String r0 = r1.A06
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r4.A03 = r0
            X.4UC r0 = r2.A03
        L_0x0450:
            r0.A0H(r4)
            return
        L_0x0454:
            java.lang.Object r0 = r13.A00
            X.9ak r0 = (X.C196379ak) r0
            android.view.View$OnClickListener r0 = r0.A00
            if (r0 == 0) goto L_0x000f
            r0.onClick(r14)
            return
        L_0x0460:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            X.9oH r0 = r1.A10
            r0.BXt()
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x000f
            X.4qx r0 = r1.A0n
            r0.A07()
            return
        L_0x0475:
            java.lang.Object r2 = r13.A00
            com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment r2 = (com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContentFragment) r2
            X.9N5 r0 = r2.A01
            if (r0 == 0) goto L_0x000f
            r1 = 11
            X.9po r0 = new X.9po
            r0.<init>(r13, r1)
            r2.A1L(r0)
            X.0eF r1 = r2.A0E
            boolean r0 = r1 instanceof com.whatsapp.wabloks.ui.bottomsheet.BkBottomSheetContainerFragment
            if (r0 == 0) goto L_0x000f
            java.lang.String r2 = r2.A04
            X.0df r1 = r1.A0T()
            r0 = 1
            r1.A0m(r2, r0)
            return
        L_0x0498:
            java.lang.Object r0 = r13.A00
            android.app.Dialog r0 = (android.app.Dialog) r0
            r0.show()
            return
        L_0x04a0:
            java.lang.Object r0 = r13.A00
            X.7Sw r0 = (X.C150957Sw) r0
            r1 = 0
            r2 = 0
            r5 = 0
            r4 = r2
            r3 = r2
            r0.A00(r1, r2, r3, r4, r5)
            return
        L_0x04ae:
            java.lang.Object r0 = r13.A00
            X.98s r0 = (X.AnonymousClass98s) r0
            r0.onBackPressed()
            return
        L_0x04b6:
            java.lang.Object r0 = r13.A00
            com.whatsapp.dmsetting.ChangeDMSettingActivity r0 = (com.whatsapp.dmsetting.ChangeDMSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x04be:
            java.lang.Object r0 = r13.A00
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r0 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r0
            r0.onBackPressed()
            return
        L_0x04c6:
            java.lang.Object r2 = r13.A00
            com.whatsapp.ephemeral.ChangeEphemeralSettingActivity r2 = (com.whatsapp.ephemeral.ChangeEphemeralSettingActivity) r2
            X.4uZ r0 = r2.A0I
            boolean r0 = r0 instanceof com.whatsapp.jid.UserJid
            r1 = 4
            if (r0 == 0) goto L_0x04d2
            r1 = 3
        L_0x04d2:
            android.content.Intent r0 = X.C18320x8.A07()
            X.C627736r.A1G(r2, r0, r1)
            r2.startActivity(r0)
            return
        L_0x04dd:
            java.lang.Object r0 = r13.A00
            X.4ea r0 = (X.C89654ea) r0
            r0.onBackPressed()
            return
        L_0x04e5:
            java.lang.Object r3 = r13.A00
            android.view.View r3 = (android.view.View) r3
            android.content.Context r0 = r3.getContext()
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r0.getPackageName()
            java.lang.String r0 = "com.whatsapp.framework.alerts.ui.AlertCardListActivity"
            r2.setClassName(r1, r0)
            android.content.Context r0 = r3.getContext()
            r0.startActivity(r2)
            return
        L_0x0502:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r0 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r0
            r0.A7I()
            X.5Ub r1 = r0.A08
            r0 = 1
            r1.A01(r0)
            return
        L_0x0510:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.BasePaymentIncentiveFragment r0 = (com.whatsapp.payments.ui.BasePaymentIncentiveFragment) r0
            r0.A1K()
            r0.A1a()
            return
        L_0x051b:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.BasePaymentIncentiveFragment r0 = (com.whatsapp.payments.ui.BasePaymentIncentiveFragment) r0
            r0.A1K()
            r0.A1Z()
            return
        L_0x0526:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet r0 = (com.whatsapp.payments.ui.BrazilAccountRecoveryEligibilityBottomSheet) r0
            r0.A1K()
            java.lang.Integer r3 = X.C18290x4.A0a()
            java.lang.String r2 = "prompt_recover_payments"
            java.lang.String r1 = r0.A06
            X.9no r0 = r0.A04
            X.C1899593h.A1E(r0, r3, r2, r1)
            return
        L_0x053b:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity r4 = (com.whatsapp.payments.ui.BrazilAccountRecoveryPinActivity) r4
            r4.finish()
            r0 = 10
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "recover_payments_registration"
            java.lang.String r1 = "wa_registration"
            X.9no r0 = r4.A02
            X.C1899593h.A1E(r0, r3, r2, r1)
            return
        L_0x0552:
            java.lang.Object r0 = r13.A00
            X.97d r0 = (X.C1905197d) r0
            X.94s r1 = r0.A07
            android.widget.EditText r0 = r0.A02
            java.lang.String r0 = X.C18290x4.A0m(r0)
            r1.A0H(r0)
            return
        L_0x0562:
            java.lang.Object r0 = r13.A00
            X.97d r0 = (X.C1905197d) r0
            X.94s r2 = r0.A07
            X.9no r3 = r2.A07
            java.lang.Integer r5 = X.AnonymousClass001.A0f()
            r0 = 113(0x71, float:1.58E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = r2.A0E()
            r8 = 0
            X.303 r4 = X.C1899593h.A0K()
            java.lang.String r1 = "product_flow"
            java.lang.String r0 = "p2m"
            r4.A03(r1, r0)
            r3.BKE(r4, r5, r6, r7, r8)
            X.4UC r3 = r2.A09
            X.3Mh r1 = r2.A02
            X.1Ej r0 = X.C66663Mh.A26
            java.lang.String r1 = r1.A06(r0)
            goto L_0x0f56
        L_0x0593:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity r0 = (com.whatsapp.payments.ui.BrazilPaymentCareTransactionSelectorActivity) r0
            X.4FS r1 = r0.A04
            X.9H2 r0 = r0.A79()
            X.C18270x1.A0w(r0, r1)
            return
        L_0x05a1:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.BrazilPaymentDPOActivity r1 = (com.whatsapp.payments.ui.BrazilPaymentDPOActivity) r1
            X.9Fh r3 = r1.A00
            android.widget.EditText r0 = r1.A02
            java.lang.String r4 = X.C18290x4.A0m(r0)
            java.util.ArrayList r5 = X.AnonymousClass001.A0s()
            java.util.List r0 = r1.A01
            java.util.Iterator r2 = r0.iterator()
        L_0x05b7:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x05d5
            java.lang.Object r1 = r2.next()
            android.widget.CompoundButton r1 = (android.widget.CompoundButton) r1
            boolean r0 = r1.isChecked()
            if (r0 == 0) goto L_0x05b7
            java.lang.CharSequence r0 = r1.getText()
            java.lang.String r0 = r0.toString()
            r5.add(r0)
            goto L_0x05b7
        L_0x05d5:
            X.303 r2 = r3.A06
            r6 = 0
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r1 = r5.toArray(r0)
            java.lang.CharSequence[] r1 = (java.lang.CharSequence[]) r1
            java.lang.String r0 = "|"
            java.lang.String r1 = X.C107575bX.A09(r0, r1)
            java.lang.String r0 = "list_of_selected_conditions"
            r2.A03(r0, r1)
            byte[] r0 = r4.getBytes()
            int r1 = r0.length
            r0 = 10
            if (r1 < r0) goto L_0x0620
            java.lang.String r0 = "[a-zA-Z\\u0080-\\u00ff]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r4)
            r1 = 0
        L_0x05ff:
            boolean r0 = r2.find()
            if (r0 == 0) goto L_0x0620
            int r1 = r1 + 1
            r0 = 3
            if (r1 < r0) goto L_0x05ff
            java.lang.String[] r0 = new java.lang.String[r6]
            java.lang.Object[] r0 = r5.toArray(r0)
            java.lang.CharSequence[] r0 = (java.lang.CharSequence[]) r0
            java.lang.String r1 = "\n\n"
            java.lang.String r0 = X.C107575bX.A09(r1, r0)
            java.lang.String r0 = X.C18260x0.A06(r0, r1, r4)
            r3.A0H(r0)
            return
        L_0x0620:
            java.lang.String r0 = "failed"
            r3.A0G(r0)
            X.08M r3 = r3.A01
            r0 = 2
            X.9OU r1 = new X.9OU
            r1.<init>(r0)
            goto L_0x0f56
        L_0x062f:
            java.lang.Object r3 = r13.A00
            X.4ea r3 = (X.C89654ea) r3
            android.content.Intent r2 = X.C1899693i.A03(r3)
            java.lang.String r1 = "screen_name"
            java.lang.String r0 = "brpay_p_pin_change_verify"
            r2.putExtra(r1, r0)
            r0 = 0
            r3.A6T(r2, r0)
            return
        L_0x0643:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r1 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r1
            X.94k r0 = r1.A06
            X.9U4 r0 = r0.A02
            X.9Tz r0 = X.AnonymousClass9U4.A05(r0)
            if (r0 != 0) goto L_0x0656
            r0 = 0
        L_0x0652:
            r0.show()
            return
        L_0x0656:
            X.043 r0 = r0.A01(r1)
            goto L_0x0652
        L_0x065b:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r2 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r2
            X.94k r3 = r2.A06
            r9 = 1
            java.lang.Integer r6 = X.C18290x4.A0c()
            java.lang.String r7 = "incentive_value_prop"
            r8 = 0
            X.303 r4 = X.C1899593h.A0K()
            X.99l r0 = r3.A01
            boolean r1 = r0.A0C()
            java.lang.String r0 = "is_payment_account_setup"
            r4.A04(r0, r1)
            X.9U4 r0 = r3.A02
            X.9no r5 = X.AnonymousClass9U4.A06(r0)
            X.AnonymousClass9Wg.A02(r4, r5, r6, r7, r8, r9)
            java.lang.Class<com.whatsapp.payments.ui.PaymentContactPicker> r0 = com.whatsapp.payments.ui.PaymentContactPicker.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r2, r0)
            java.lang.String r0 = "referral_screen"
            r1.putExtra(r0, r7)
            java.lang.String r0 = "for_payments"
            r1.putExtra(r0, r9)
            r2.A6T(r1, r9)
            return
        L_0x0695:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IncentiveValuePropsActivity r2 = (com.whatsapp.payments.ui.IncentiveValuePropsActivity) r2
            X.94k r3 = r2.A06
            r9 = 1
            r0 = 36
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "incentive_value_prop"
            r8 = 0
            X.303 r4 = X.C1899593h.A0K()
            X.99l r0 = r3.A01
            boolean r1 = r0.A0C()
            java.lang.String r0 = "is_payment_account_setup"
            r4.A04(r0, r1)
            X.9U4 r0 = r3.A02
            X.9no r5 = X.AnonymousClass9U4.A06(r0)
            X.AnonymousClass9Wg.A02(r4, r5, r6, r7, r8, r9)
            X.94k r0 = r2.A06
            X.9U4 r0 = r0.A02
            X.9oC r0 = r0.A0G()
            android.content.Intent r0 = r0.B45(r2)
            if (r0 != 0) goto L_0x06d1
            java.lang.String r0 = "PAY: IncentiveValuePropsActivity/oncreate : accountSetupIntent is null"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x06d1:
            r2.A6T(r0, r9)
            return
        L_0x06d5:
            java.lang.Object r6 = r13.A00
            X.9DA r6 = (X.AnonymousClass9DA) r6
            X.9ca r5 = r6.A0S
            java.lang.Integer r4 = X.AnonymousClass001.A0f()
            r3 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            java.lang.String r1 = "notify_verification_complete"
            java.lang.String r0 = r6.A0e
            r5.BKB(r4, r2, r1, r0)
            int r1 = r6.A02
            if (r1 == r3) goto L_0x0703
            r0 = 12
            if (r1 != r0) goto L_0x06ff
            java.lang.Class<com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity> r0 = com.whatsapp.payments.ui.mapper.register.IndiaUpiMapperValuePropsActivity.class
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r6, r0)
        L_0x06f9:
            r6.A7O(r1)
            r6.startActivity(r1)
        L_0x06ff:
            r6.finish()
            return
        L_0x0703:
            X.1VX r0 = r6.A0D
            java.lang.Class r0 = X.C192799Lp.A00(r0)
            android.content.Intent r1 = X.AnonymousClass0x9.A08(r6, r0)
            r0 = 0
            r6.A0k = r0
            goto L_0x06f9
        L_0x0711:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A7X()
            int r1 = r3.A02
            r0 = 3
            if (r1 == r0) goto L_0x072f
            r0 = 6
            if (r1 == r0) goto L_0x0d6a
            switch(r1) {
                case 8: goto L_0x072b;
                case 9: goto L_0x0d6a;
                case 10: goto L_0x072f;
                case 11: goto L_0x0d6a;
                default: goto L_0x0723;
            }
        L_0x0723:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.whatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            goto L_0x08ba
        L_0x072b:
            boolean r0 = r3.A0s
            if (r0 == 0) goto L_0x0d6a
        L_0x072f:
            r3.A7Z()
            return
        L_0x0733:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r1
            r1.A7X()
            boolean r0 = r1.A0s
            if (r0 == 0) goto L_0x0742
            r1.A7Z()
            return
        L_0x0742:
            r1.finish()
            return
        L_0x0746:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r0
            r0.A7Y()
            r0.A7Z()
            return
        L_0x0751:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A7X()
            X.6hm r2 = r3.A0A
            r1 = 0
            java.lang.String r0 = r3.A0a
            android.content.Intent r2 = com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity.A0C(r3, r2, r0, r1)
            r3.A7O(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r3.A0b
            X.C1899593h.A0k(r2, r3, r1, r0)
            return
        L_0x076c:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r3
            r3.A7Y()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.whatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            goto L_0x08ba
        L_0x077b:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountAddedLandingActivity) r1
            r1.A7X()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity> r0 = com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r1, r0)
            r1.finish()
            r1.startActivity(r0)
            return
        L_0x078f:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            X.6hm r0 = r3.A00
            X.6hx r0 = r0.A08
            X.99H r0 = (X.AnonymousClass99H) r0
            if (r0 == 0) goto L_0x07a7
            boolean r0 = X.AnonymousClass99H.A00(r0)
            if (r0 != 0) goto L_0x07a7
            r0 = 101(0x65, float:1.42E-43)
            X.C621433s.A01(r3, r0)
            return
        L_0x07a7:
            java.lang.String r1 = "upi_p2p_check_balance"
            r0 = 0
            X.2lm r7 = new X.2lm
            r7.<init>(r1, r0, r0)
            java.util.HashMap r9 = X.AnonymousClass001.A0t()
            X.6hm r0 = r3.A00
            java.lang.String r1 = r0.A0A
            java.lang.String r0 = "credential_id"
            r9.put(r0, r1)
            X.3Wi r2 = r3.A04
            r1 = 0
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r2.A0G(r1, r0)
            X.2YZ r4 = r3.A0F
            java.lang.String r8 = "payment_bank_account_details"
            r0 = 4
            X.9qV r5 = new X.9qV
            r5.<init>(r3, r0)
            X.9UK r6 = new X.9UK
            r6.<init>(r3, r1)
            r4.A00(r5, r6, r7, r8, r9)
            return
        L_0x07d8:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r0 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r0
            r0.A7W()
            return
        L_0x07e0:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r0 = (com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld) r0
            r0.A7I()
            X.5Ub r1 = r0.A0A
            r0 = 1
            r1.A01(r0)
            return
        L_0x07ee:
            java.lang.Object r2 = r13.A00
            X.9D7 r2 = (X.AnonymousClass9D7) r2
            com.whatsapp.payments.ui.PaymentBottomSheet r1 = r2.A09
            java.lang.String r0 = "ConfirmPaymentFragment"
            r2.A7p(r1, r0)
            r0 = 34
            goto L_0x0910
        L_0x07fd:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiContactPickerFragment r1 = (com.whatsapp.payments.ui.IndiaUpiContactPickerFragment) r1
            X.03q r3 = r1.A0R()
            X.03q r4 = r1.A0R()
            X.4FU r4 = (X.AnonymousClass4FU) r4
            java.lang.String r7 = "payment_contact_picker"
            X.9Re r6 = r1.A02
            X.9Zz r5 = r1.A01
            r8 = 0
            X.9Rz r2 = new X.9Rz
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r0 = 0
            r2.A00(r0)
            X.9ca r4 = r1.A04
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 132(0x84, float:1.85E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.os.Bundle r1 = r1.A1K()
            java.lang.String r0 = "referral_screen"
            java.lang.String r0 = r1.getString(r0)
            r4.BKB(r3, r2, r7, r0)
            return
        L_0x0835:
            java.lang.Object r2 = r13.A00
            X.0eF r2 = (X.C08310eF) r2
            android.content.Context r1 = r2.A1D()
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity> r0 = com.whatsapp.payments.ui.IndiaUpiQrCodeScanActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r1, r0)
            r2.A0m(r0)
            return
        L_0x0847:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity) r0
            r0.A7q()
            return
        L_0x084f:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.9nY r0 = r1.A07
            if (r0 == 0) goto L_0x085a
            r0.BQ9()
        L_0x085a:
            X.9ca r4 = r1.A06
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "forgot_pin_prompt"
            goto L_0x0ba8
        L_0x0868:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.9nY r0 = r1.A07
            if (r0 == 0) goto L_0x0873
            r0.BTm()
        L_0x0873:
            X.9ca r3 = r1.A06
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            java.lang.String r1 = "forgot_pin_prompt"
            r0 = 0
            r3.BKB(r2, r2, r1, r0)
            return
        L_0x0880:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiForgotPinDialogFragment) r1
            X.9nY r0 = r1.A07
            if (r0 == 0) goto L_0x088b
            r0.BTl()
        L_0x088b:
            X.9ca r4 = r1.A06
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "forgot_pin_prompt"
            goto L_0x0ba8
        L_0x089b:
            java.lang.Object r0 = r13.A00
            X.9cy r0 = (X.C197349cy) r0
            X.9Cu r0 = r0.A00
            r0.A7r()
            return
        L_0x08a5:
            java.lang.Object r3 = r13.A00
            X.9Ba r3 = (X.AnonymousClass9Ba) r3
            r0 = 0
            r3.A7a(r0)
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiContactPicker> r0 = com.whatsapp.payments.ui.IndiaUpiContactPicker.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "incentive_value_prop"
            r2.putExtra(r1, r0)
        L_0x08ba:
            java.lang.String r1 = "for_payments"
            r0 = 1
            r2.putExtra(r1, r0)
            r3.startActivity(r2)
            goto L_0x0d6a
        L_0x08c5:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity r2 = (com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity) r2
            java.lang.String r6 = "chat"
            X.9Re r5 = r2.A01
            X.9Zz r4 = r2.A00
            r7 = 0
            X.9Rz r1 = new X.9Rz
            r3 = r2
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0 = 0
            r1.A00(r0)
            return
        L_0x08db:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r2 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r2
            X.7yE r0 = r2.A0B
            if (r0 == 0) goto L_0x090e
            X.303 r4 = X.C1899593h.A0K()
            X.7yE r0 = r2.A0B
            java.lang.String r1 = r0.A02
            java.lang.String r0 = "alias_status"
            r4.A03(r0, r1)
            X.7yE r0 = r2.A0B
            java.lang.String r1 = r0.A03
            java.lang.String r0 = "alias_type"
            r4.A03(r0, r1)
            X.9ca r3 = r2.A0S
            java.lang.Integer r5 = X.AnonymousClass001.A0f()
            r0 = 130(0x82, float:1.82E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            java.lang.String r7 = "alias_info"
            java.lang.String r8 = X.C1899593h.A0a(r2)
            r3.BKE(r4, r5, r6, r7, r8)
        L_0x090e:
            r0 = 38
        L_0x0910:
            X.C621433s.A01(r2, r0)
            return
        L_0x0914:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r1 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r1
            X.7yE r0 = r1.A0B
            java.lang.String r2 = r0.A02
            java.lang.String r8 = "active"
            boolean r0 = r2.equals(r8)
            java.lang.String r9 = "inactive"
            if (r0 != 0) goto L_0x094d
            boolean r0 = r2.equals(r9)
            if (r0 != 0) goto L_0x0932
            java.lang.String r0 = "Unexpected status"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x0932:
            r1.A7V(r8)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r2 = r1.A0F
            X.6na r6 = r1.A0D
            X.7yE r5 = r1.A0B
            X.9bS r0 = r1.A0M
            X.7yt r3 = r0.A04()
            X.9bS r0 = r1.A0M
            java.lang.String r7 = r0.A0C()
            X.7yt r4 = r1.A0A
            r2.A0D(r3, r4, r5, r6, r7, r8)
            return
        L_0x094d:
            r1.A7V(r9)
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r3 = r1.A0F
            X.6na r7 = r1.A0D
            X.7yE r6 = r1.A0B
            X.9bS r0 = r1.A0M
            X.7yt r4 = r0.A04()
            X.9bS r0 = r1.A0M
            java.lang.String r8 = r0.A0C()
            X.7yt r5 = r1.A0A
            r3.A0D(r4, r5, r6, r7, r8, r9)
            return
        L_0x0968:
            java.lang.Object r3 = r13.A00
            X.9DA r3 = (X.AnonymousClass9DA) r3
            android.content.Intent r1 = r3.getIntent()
            java.lang.String r0 = "extra_selected_bank"
            android.os.Parcelable r0 = r1.getParcelableExtra(r0)
            if (r0 == 0) goto L_0x0989
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            r3.A7O(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = "error"
            X.C1899593h.A0k(r2, r3, r1, r0)
            return
        L_0x0989:
            java.lang.String r0 = "User Selected bank object not found in intent bundle extras"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            goto L_0x0d6a
        L_0x0990:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r0
            r0.onBackPressed()
            return
        L_0x0998:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity r1 = (com.whatsapp.payments.ui.IndiaUpiOnboardingErrorEducationActivity) r1
            r0 = 5
            r1.A7W(r0)
            r1.A7V()
            return
        L_0x09a4:
            java.lang.Object r1 = r13.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 0
            r1.A0a = r0
            X.1VX r0 = r1.A0D
            java.lang.Class r0 = X.C192799Lp.A00(r0)
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r1, r0)
            r1.A7O(r0)
            r1.startActivity(r0)
            r1.finish()
            return
        L_0x09bf:
            java.lang.Object r0 = r13.A00
            X.9cs r0 = (X.C197289cs) r0
            X.9Bs r1 = r0.A05
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity> r0 = com.whatsapp.payments.ui.IndiaUpiInteropSendToUpiActivity.class
            android.content.Intent r0 = X.AnonymousClass0x9.A08(r1, r0)
            goto L_0x1060
        L_0x09cd:
            java.lang.Object r0 = r13.A00
            X.9cs r0 = (X.C197289cs) r0
            X.9Bs r1 = r0.A05
            r0 = 34
            X.C621433s.A01(r1, r0)
            return
        L_0x09d9:
            java.lang.Object r6 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r6 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r6
            r6.A1K()
            X.9lP r0 = r6.A01
            if (r0 == 0) goto L_0x0a0e
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.9Fv r5 = r0.A07
            boolean r0 = r5.A0p()
            if (r0 == 0) goto L_0x0a0e
            X.9Pj r0 = r5.A06
            X.34w r4 = r0.A01
            X.1S4 r3 = r4.A0A
            X.99L r3 = (X.AnonymousClass99L) r3
            X.9U4 r0 = r5.A0b
            X.9oC r0 = X.AnonymousClass9U4.A07(r0)
            X.9no r2 = r0.B7b()
            r0 = 1
            r5.A0c(r0)
            X.4FS r1 = r5.A0l
            X.9jp r0 = new X.9jp
            r0.<init>(r4, r3, r2, r5)
            r1.BkM(r0)
        L_0x0a0e:
            X.9ca r4 = r6.A00
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "raise_complaint_prompt"
            goto L_0x0ba8
        L_0x0a1c:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentRaiseComplaintFragment) r0
            r0.A1K()
            X.9ca r4 = r0.A00
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r1 = "raise_complaint_prompt"
            goto L_0x0ba8
        L_0x0a31:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r3
            android.content.Context r1 = r3.A1D()
            java.lang.Class<com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity> r0 = com.whatsapp.payments.IndiaUpiPaymentInvitePickerActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r0 = "referral_screen"
            java.lang.String r7 = "payment_home"
            r2.putExtra(r0, r7)
            java.lang.String r1 = "extra_multi_invite_picker_title"
            r0 = 2131891988(0x7f121714, float:1.9418712E38)
            r2.putExtra(r1, r0)
            X.9ca r4 = r3.A0M
            java.lang.Integer r5 = X.AnonymousClass001.A0f()
            r0 = 144(0x90, float:2.02E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r8 = 0
            r9 = 1
            r4.BKC(r5, r6, r7, r8, r9)
            goto L_0x0d39
        L_0x0a61:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            r1.A1g(r0)
            return
        L_0x0a6a:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r5 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r5
            X.94t r4 = r5.A0x
            if (r4 == 0) goto L_0x0a80
            r0 = 97
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            java.lang.String r2 = "payment_home"
            r1 = 0
            X.9no r0 = r4.A0B
            X.C1899593h.A1E(r0, r3, r2, r1)
        L_0x0a80:
            r5.A1o()
            return
        L_0x0a84:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r5 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r5
            java.util.List r0 = r5.A17
            int r4 = r0.size()
            r3 = 0
            r1 = 1
            X.03q r0 = r5.A0R()
            X.0zH r2 = X.AnonymousClass5V0.A00(r0)
            if (r4 <= 0) goto L_0x0ab3
            r0 = 2131891820(0x7f12166c, float:1.941837E38)
            r2.A0U(r0)
            r0 = 2131891819(0x7f12166b, float:1.9418369E38)
            r2.A0T(r0)
            r2.A0i(r1)
            r0 = 2131891818(0x7f12166a, float:1.9418367E38)
            r2.A0Y(r3, r0)
        L_0x0aaf:
            X.C18280x3.A0q(r2)
            return
        L_0x0ab3:
            r0 = 2131891817(0x7f121669, float:1.9418365E38)
            r2.A0U(r0)
            r0 = 2131891816(0x7f121668, float:1.9418363E38)
            r2.A0T(r0)
            r2.A0i(r1)
            r0 = 2131895731(0x7f1225b3, float:1.9426303E38)
            r2.A0W(r3, r0)
            r1 = 2131891815(0x7f121667, float:1.941836E38)
            r0 = 52
            X.C204219p0.A01(r2, r5, r0, r1)
            goto L_0x0aaf
        L_0x0ad1:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9R6 r1 = r3.A0A
            if (r1 == 0) goto L_0x0ae0
            java.lang.String r0 = r3.A0G
            if (r0 == 0) goto L_0x0ae0
            r1.A00(r0)
        L_0x0ae0:
            r2 = 44
            goto L_0x0b05
        L_0x0ae3:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9R6 r0 = r3.A0A
            if (r0 == 0) goto L_0x0af2
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity r1 = r0.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A6c(r0)
        L_0x0af2:
            r2 = 121(0x79, float:1.7E-43)
            goto L_0x0b05
        L_0x0af5:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionConfirmationFragment) r3
            X.9R6 r0 = r3.A0A
            if (r0 == 0) goto L_0x0b04
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsActivity r1 = r0.A00
            java.lang.String r0 = "IndiaUpiPaymentTransactionConfirmationFragment"
            r1.A6c(r0)
        L_0x0b04:
            r2 = 3
        L_0x0b05:
            r1 = 0
            r0 = 1
            r3.A1J(r0, r2, r1)
            return
        L_0x0b0b:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r3
            r3.A1K()
            X.9lQ r2 = r3.A02
            if (r2 == 0) goto L_0x0b27
            android.content.Context r2 = (android.content.Context) r2
            r0 = 2
            int[] r1 = new int[r0]
            r1 = {1, 2} // fill-array
            java.lang.String r0 = "CONTINUE"
            android.content.Intent r0 = X.C627736r.A19(r2, r0, r1)
            r2.startActivity(r0)
        L_0x0b27:
            X.9ca r4 = r3.A01
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 5
            goto L_0x0b4d
        L_0x0b2f:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1K()
            X.9ca r4 = r0.A01
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 3
            goto L_0x0b4d
        L_0x0b3e:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTwoFactorNudgeFragment) r0
            r0.A1K()
            X.9ca r4 = r0.A01
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 96
        L_0x0b4d:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "two_factor_nudge_prompt"
            goto L_0x0ba8
        L_0x0b54:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity r2 = (com.whatsapp.payments.ui.IndiaUpiPaymentsTosActivity) r2
            X.5hX r1 = r2.A00
            java.lang.String r0 = "https://faq.whatsapp.com/payments/security-and-privacy/about-payments-data/"
            X.C18310x6.A0y(r2, r1, r0)
            X.6ig r1 = r2.A08
            java.lang.Integer r0 = X.C18300x5.A0Y()
            r1.A07 = r0
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r1.A08 = r0
            X.AnonymousClass97T.A0t(r1, r2)
            return
        L_0x0b71:
            java.lang.Object r0 = r13.A00
            X.9Ba r0 = (X.AnonymousClass9Ba) r0
            r0.A7W()
            return
        L_0x0b79:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.9nC r0 = r1.A06
            if (r0 == 0) goto L_0x0b84
            r0.BQ3()
        L_0x0b84:
            X.9ca r4 = r1.A05
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "setup_pin_prompt"
            goto L_0x0ba8
        L_0x0b91:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment r1 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerDialogFragment) r1
            X.9nC r0 = r1.A06
            if (r0 == 0) goto L_0x0b9c
            r0.BPI()
        L_0x0b9c:
            X.9ca r4 = r1.A05
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r1 = "setup_pin_prompt"
        L_0x0ba8:
            r0 = 0
            r4.BKB(r3, r2, r1, r0)
            return
        L_0x0bad:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity r4 = (com.whatsapp.payments.ui.IndiaUpiPinPrimerFullSheetActivity) r4
            X.9W6 r1 = r4.A0N
            X.6hm r0 = r4.A01
            boolean r0 = r1.A05(r0)
            r3 = 1
            if (r0 == 0) goto L_0x0bf1
            int r0 = r4.A00
            if (r0 != r3) goto L_0x0bf1
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiAadhaarCardVerificationActivity.class
        L_0x0bc2:
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r4, r0)
            java.lang.String r1 = "extra_bank_account"
            X.6hm r0 = r4.A01
            r2.putExtra(r1, r0)
            r4.A7O(r2)
            java.lang.String r1 = "extra_previous_screen"
            java.lang.String r0 = r4.A03
            r2.putExtra(r1, r0)
            r0 = 1012(0x3f4, float:1.418E-42)
            r4.startActivityForResult(r2, r0)
            X.9ca r5 = r4.A0S
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r8 = X.C18290x4.A0c()
            java.lang.String r9 = r4.A0b
            java.lang.String r10 = r4.A03
            java.lang.String r11 = r4.A0e
            r6 = 0
            r5.A09(r6, r7, r8, r9, r10, r11)
            return
        L_0x0bf1:
            java.lang.Class<com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity> r0 = com.whatsapp.payments.ui.IndiaUpiDebitCardVerificationActivity.class
            goto L_0x0bc2
        L_0x0bf4:
            java.lang.Object r5 = r13.A00
            X.9DA r5 = (X.AnonymousClass9DA) r5
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "pin_created"
            r0 = 0
            r4.BKB(r3, r2, r1, r0)
            r5.A7H()
            r5.finish()
            return
        L_0x0c0f:
            java.lang.Object r5 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            r0 = 176(0xb0, float:2.47E-43)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = X.C1899593h.A0a(r5)
            java.lang.String r0 = "payments_profile"
            r4.BKB(r3, r2, r0, r1)
            r5.A7W()
            return
        L_0x0c2c:
            java.lang.Object r5 = r13.A00
            X.9Bb r5 = (X.AnonymousClass9Bb) r5
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r5.Bp9(r0)
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            boolean r0 = r5 instanceof com.whatsapp.payments.ui.IndiaUpiProvideMoreInfoBottomSheetActivity
            if (r0 == 0) goto L_0x0c88
            java.lang.String r1 = "notify_verification_prompt"
        L_0x0c46:
            java.lang.String r0 = r5.A0e
            r4.BKB(r3, r2, r1, r0)
            X.9AA r5 = r5.A03
            java.lang.String r0 = "PAY: IndiaUpiPaymentSetup sendGetPspRoutingAndListKeys called"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.31C r6 = r5.A04
            java.lang.String r9 = r6.A03()
            r10 = 204(0xcc, float:2.86E-43)
            r0 = 13
            X.1wl r4 = new X.1wl
            r4.<init>((java.lang.String) r9, (int) r0)
            X.2rL r3 = X.C56052rL.A01()
            X.2rL r2 = X.C1899593h.A0U()
            java.lang.String r1 = "action"
            java.lang.String r0 = "upi-get-psp-routing-and-list-keys"
            X.C56052rL.A0D(r2, r1, r0)
            X.36K r8 = X.C41032Ir.A03(r2, r3, r4)
            android.content.Context r1 = r5.A01
            X.3Wi r2 = r5.A02
            X.2Ha r3 = r5.A06
            X.7bd r4 = r5.A00
            X.9oW r0 = new X.9oW
            r0.<init>((android.content.Context) r1, (X.C69263Wi) r2, (X.C40602Ha) r3, (X.C153607bd) r4, (X.AnonymousClass9AA) r5)
            r11 = 0
            r7 = r0
            r6.A0D(r7, r8, r9, r10, r11)
            return
        L_0x0c88:
            java.lang.String r1 = "notify_verification_screen"
            goto L_0x0c46
        L_0x0c8b:
            X.4UC r3 = r1.A0A
            r0 = 0
            X.9P7 r1 = new X.9P7
            r1.<init>(r0)
            goto L_0x0f56
        L_0x0c95:
            java.lang.Object r4 = r13.A00
            X.9DA r4 = (X.AnonymousClass9DA) r4
            r0 = 185(0xb9, float:2.59E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r2 = 0
            X.9ca r1 = r4.A0S
            java.lang.String r0 = "new_payment"
            X.C1899593h.A1E(r1, r3, r0, r2)
            X.7yJ r0 = r4.A0U
            X.C626936e.A06(r0)
            java.lang.String r3 = r0.A01
            X.7yJ r0 = r4.A0U
            X.C626936e.A06(r0)
            java.lang.String r2 = r0.A03
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "extra_base_currency"
            r1.putString(r0, r3)
            java.lang.String r0 = "extra_exchange_rate"
            r1.putString(r0, r2)
            com.whatsapp.payments.ui.international.IndiaUpiInternationalExchangeDialogFragment r0 = new com.whatsapp.payments.ui.international.IndiaUpiInternationalExchangeDialogFragment
            r0.<init>()
            r0.A0u(r1)
            r4.Boo(r0)
            return
        L_0x0ccf:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment r0 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentToVpaFragment) r0
            r0.A1J()
            return
        L_0x0cd7:
            java.lang.Object r0 = r13.A00
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            r0.A1K()
            return
        L_0x0cdf:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiSimVerificationActivity) r0
            r0.A7V()
            X.9ca r1 = r0.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r4 = X.C18290x4.A0c()
            java.lang.String r5 = r0.A0b
            java.lang.String r6 = "verify_number"
            java.lang.String r7 = r0.A0e
            r2 = 0
            r1.A09(r2, r3, r4, r5, r6, r7)
            return
        L_0x0cfb:
            java.lang.Object r0 = r13.A00
            X.9C3 r0 = (X.AnonymousClass9C3) r0
            r0.A75()
            return
        L_0x0d03:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.PaymentMethodsListPickerFragment r0 = (com.whatsapp.payments.ui.PaymentMethodsListPickerFragment) r0
            X.9nr r0 = r0.A07
            r0.BMC()
            return
        L_0x0d0d:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.PaymentRailPickerFragment r1 = (com.whatsapp.payments.ui.PaymentRailPickerFragment) r1
            r0 = 0
            goto L_0x0d18
        L_0x0d13:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.PaymentRailPickerFragment r1 = (com.whatsapp.payments.ui.PaymentRailPickerFragment) r1
            r0 = 1
        L_0x0d18:
            r1.A1J(r0)
            return
        L_0x0d1c:
            java.lang.Object r3 = r13.A00
            X.0eF r3 = (X.C08310eF) r3
            android.content.Context r1 = r3.A1D()
            java.lang.Class<com.whatsapp.payments.ui.PaymentInvitePickerActivity> r0 = com.whatsapp.payments.ui.PaymentInvitePickerActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r1, r0)
            java.lang.String r1 = "referral_screen"
            java.lang.String r0 = "payment_invite_others"
            r2.putExtra(r1, r0)
            java.lang.String r1 = "extra_multi_invite_picker_title"
            r0 = 2131891988(0x7f121714, float:1.9418712E38)
            r2.putExtra(r1, r0)
        L_0x0d39:
            r0 = 501(0x1f5, float:7.02E-43)
            r3.startActivityForResult(r2, r0)
            return
        L_0x0d3f:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 0
            goto L_0x0d4a
        L_0x0d45:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r1 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r1
            r0 = 1
        L_0x0d4a:
            r1.A1i(r0)
            return
        L_0x0d4e:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A76()
            return
        L_0x0d56:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity r3 = (com.whatsapp.payments.ui.PaymentsUpdateRequiredActivity) r3
            X.2i5 r0 = r3.A00
            android.net.Uri r2 = r0.A00()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
            r3.startActivity(r0)
        L_0x0d6a:
            r3.finish()
            return
        L_0x0d6e:
            java.lang.Object r0 = r13.A00
            com.whatsapp.payments.ui.ReTosFragment r0 = (com.whatsapp.payments.ui.ReTosFragment) r0
            com.whatsapp.payments.ui.ReTosFragment.A00(r0)
            return
        L_0x0d76:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r4 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r4
            int r2 = r4.A01
            X.94v r3 = r4.A0E
            X.9U4 r0 = r3.A06
            X.9oC r1 = r0.A0G()
            r0 = 1
            if (r2 != r0) goto L_0x0dce
            X.9Vt r0 = r1.B9W()
            if (r0 == 0) goto L_0x0dce
            X.99n r0 = r3.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0dce
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r3.A09
            r2.put(r1, r0)
            java.lang.String r1 = "skip_value_prop"
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r2.put(r1, r0)
            X.5rC r0 = r3.A01
            r0.A04()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0db3:
            java.lang.Object r4 = r13.A00
            com.whatsapp.payments.ui.ViralityLinkVerifierActivity r4 = (com.whatsapp.payments.ui.ViralityLinkVerifierActivity) r4
            int r5 = r4.A01
            int r2 = r4.A00
            if (r2 == 0) goto L_0x0ddb
            r0 = 405(0x195, float:5.68E-43)
            if (r2 == r0) goto L_0x0dd2
            r0 = 443(0x1bb, float:6.21E-43)
            if (r2 == r0) goto L_0x0e1b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "PAY ViralityLinkViewModel onPrimaryButtonClicked default run with errorCode : "
            X.C18260x0.A0x(r0, r1, r2)
        L_0x0dce:
            r4.finish()
            return
        L_0x0dd2:
            X.2X5 r1 = r4.A0G
            java.lang.String r0 = "smb_linking_back2wa"
            android.content.Intent r0 = r1.A00(r0)
            goto L_0x0e28
        L_0x0ddb:
            X.94v r3 = r4.A0E
            X.9U4 r0 = r3.A06
            X.9oC r2 = r0.A0G()
            java.lang.String r1 = "alt_virality"
            r0 = 1
            if (r5 != r0) goto L_0x0e14
            X.9Vt r0 = r2.B9W()
            if (r0 == 0) goto L_0x0e14
            X.99n r0 = r3.A05
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0e14
            java.util.HashMap r2 = X.AnonymousClass001.A0t()
            java.lang.String r1 = "campaign_id"
            java.lang.String r0 = r3.A09
            r2.put(r1, r0)
            java.lang.String r1 = "skip_value_prop"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r2.put(r1, r0)
            X.5rC r0 = r3.A01
            r0.A04()
            java.lang.String r0 = "getOrdersActivity"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0e14:
            java.lang.String r0 = "p2p_context"
            android.content.Intent r0 = r2.BBE(r4, r0, r1)
            goto L_0x0e28
        L_0x0e1b:
            X.2i5 r0 = r4.A06
            android.net.Uri r2 = r0.A00()
            java.lang.String r1 = "android.intent.action.VIEW"
            android.content.Intent r0 = new android.content.Intent
            r0.<init>(r1, r2)
        L_0x0e28:
            r4.startActivity(r0)
            goto L_0x0dce
        L_0x0e2c:
            java.lang.Object r1 = r13.A00
            X.97C r1 = (X.AnonymousClass97C) r1
            r0 = 1
            r1.A0B(r0)
            return
        L_0x0e35:
            java.lang.Object r0 = r13.A00
            X.97C r0 = (X.AnonymousClass97C) r0
            r0.dismiss()
            com.whatsapp.payments.ui.widget.PaymentAmountInputField r0 = r0.A0H
            r0.callOnClick()
            return
        L_0x0e42:
            java.lang.Object r0 = r13.A00
            X.9am r0 = (X.C196399am) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r8 = r0.A0B
            X.9Sk r10 = r8.A00
            java.util.List r2 = r8.A05
            android.os.Bundle r1 = r8.A0H()
            java.lang.String r0 = "payment_service"
            int r9 = r1.getInt(r0)
            java.util.Iterator r12 = r2.iterator()
        L_0x0e5a:
            boolean r0 = r12.hasNext()
            if (r0 == 0) goto L_0x0ef2
            java.lang.Object r6 = r12.next()
            X.4uZ r6 = (X.C95814uZ) r6
            X.2sH r0 = r10.A01
            long r2 = r0.A0H()
            r0 = 7776000000(0x1cf7c5800, double:3.841854462E-314)
            long r2 = r2 + r0
            X.33l r1 = r10.A03
            android.content.SharedPreferences r4 = r1.A03()
            java.lang.String r11 = "payments_invitee_jids_with_expiry"
            java.lang.String r0 = ""
            java.lang.String r0 = r4.getString(r11, r0)
            java.util.Map r7 = r1.A09(r0)
            java.lang.Object r0 = r7.get(r6)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0e94
            long r4 = r0.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x0ea6
        L_0x0e94:
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r7.put(r6, r0)
            android.content.SharedPreferences$Editor r1 = X.C620933l.A00(r1)
            java.lang.String r0 = X.C620933l.A02(r7)
            X.C18270x1.A0j(r1, r11, r0)
        L_0x0ea6:
            X.9U5 r7 = r10.A04
            X.7oG r1 = r7.A0H
            java.lang.String r0 = "userActionSendPaymentInvite"
            r1.A06(r0)
            X.35J r0 = r7.A0K
            X.2z0 r5 = X.AnonymousClass35J.A01(r6, r0)
            X.2sH r0 = r7.A03
            long r0 = r0.A0H()
            X.1mR r4 = new X.1mR
            r4.<init>(r5, r0)
            r4.A00 = r9
            r4.A01 = r2
            r0 = 8192(0x2000, float:1.14794E-41)
            r4.A1B(r0)
            X.3Lv r0 = r7.A05
            r0.A0V(r4)
            X.9Th r0 = r7.A0G
            X.2YY r7 = r0.A04
            java.lang.String r6 = r6.getRawString()
            monitor-enter(r7)
            X.7WN r5 = r7.A01     // Catch:{ all -> 0x0eef }
            X.7pP r4 = r5.A00()     // Catch:{ all -> 0x0eef }
            long r2 = r4.A01     // Catch:{ all -> 0x0eef }
            r0 = 1
            long r2 = r2 + r0
            r4.A01 = r2     // Catch:{ all -> 0x0eef }
            java.util.Set r0 = r4.A0D     // Catch:{ all -> 0x0eef }
            r0.add(r6)     // Catch:{ all -> 0x0eef }
            r5.A01(r4)     // Catch:{ all -> 0x0eef }
            monitor-exit(r7)
            goto L_0x0e5a
        L_0x0eef:
            r0 = move-exception
            monitor-exit(r7)
            throw r0
        L_0x0ef2:
            X.94j r1 = r8.A02
            r0 = 2
            r1.A0D(r0)
            java.util.List r0 = r8.A05
            int r1 = r0.size()
            r0 = 1
            r8.A1J(r1, r0)
            return
        L_0x0f03:
            java.lang.Object r0 = r13.A00
            X.9am r0 = (X.C196399am) r0
            com.whatsapp.payments.ui.invites.PaymentInviteFragment r1 = r0.A0B
            r0 = 0
            r1.A1K(r0)
            return
        L_0x0f0e:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            java.lang.Integer r2 = X.C18290x4.A0a()
            goto L_0x0f28
        L_0x0f17:
            java.lang.Object r3 = r13.A00
            com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet r3 = (com.whatsapp.payments.ui.orderdetails.PaymentOptionsBottomSheet) r3
            X.9mc r1 = r3.A06
            if (r1 == 0) goto L_0x0f2e
            java.lang.String r0 = r3.A08
            r1.Avp(r0)
            java.lang.Integer r2 = X.C18290x4.A0c()
        L_0x0f28:
            java.lang.String r1 = r3.A08
            r0 = 1
            r3.A1Y(r2, r1, r0)
        L_0x0f2e:
            r3.A1K()
            return
        L_0x0f32:
            A03(r13)
            return
        L_0x0f36:
            A04(r13)
            return
        L_0x0f3a:
            A05(r13)
            return
        L_0x0f3e:
            A01(r14, r13)
            return
        L_0x0f42:
            java.lang.Object r0 = r13.A00
            X.94o r0 = (X.C1902194o) r0
            X.4UC r3 = r0.A03
            r0 = 1
            goto L_0x0f51
        L_0x0f4a:
            java.lang.Object r0 = r13.A00
            X.94o r0 = (X.C1902194o) r0
            X.4UC r3 = r0.A03
            r0 = 0
        L_0x0f51:
            X.9Q9 r1 = new X.9Q9
            r1.<init>(r0)
        L_0x0f56:
            r3.A0H(r1)
            return
        L_0x0f5a:
            java.lang.Object r0 = r13.A00
            X.9Fv r0 = (X.C191669Fv) r0
            r0.A0g()
            return
        L_0x0f62:
            java.lang.Object r0 = r13.A00
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            r0.run()
            return
        L_0x0f6a:
            java.lang.Object r0 = r13.A00
            X.94y r0 = (X.AnonymousClass94y) r0
            r0.A0J()
            return
        L_0x0f72:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel r1 = (com.whatsapp.payments.viewmodel.IndiaUpiSecureQrCodeViewModel) r1
            r0 = -1
            r1.A0E(r0)
            return
        L_0x0f7b:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9OW r1 = new X.9OW
            r1.<init>()
            r0 = 3
            goto L_0x0f90
        L_0x0f86:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9OW r1 = new X.9OW
            r1.<init>()
            r0 = 1
        L_0x0f90:
            r1.A01 = r0
            goto L_0x0fa4
        L_0x0f93:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment r2 = (com.whatsapp.payments.ui.widget.MandateUpdateBottomSheetFragment) r2
            X.9OW r1 = new X.9OW
            r1.<init>()
            r0 = 2
            r1.A01 = r0
            r0 = 2131894832(0x7f122230, float:1.942448E38)
            r1.A00 = r0
        L_0x0fa4:
            X.94c r0 = r2.A07
            X.08M r0 = r0.A00
            r0.A0G(r1)
            return
        L_0x0fac:
            java.lang.Object r2 = r13.A00
            com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow r2 = (com.whatsapp.payments.ui.widget.PaymentInteropShimmerRow) r2
            X.9U4 r1 = r2.A03
            X.34w r0 = r2.A02
            java.lang.String r0 = r0.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x0fd1
            X.34w r0 = r2.A02
            java.lang.String r0 = r0.A0I
            X.9oC r4 = r1.A01(r0)
        L_0x0fc4:
            android.content.Context r3 = r2.getContext()
            X.34w r2 = r2.A02
            java.lang.String r1 = "payment_home"
            r0 = 0
            X.AnonymousClass9Lt.A00(r3, r2, r4, r1, r0)
            return
        L_0x0fd1:
            r4 = 0
            goto L_0x0fc4
        L_0x0fd3:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            X.9oH r0 = r1.A10
            r0.BbH()
            r1.A04()
            return
        L_0x0fe0:
            java.lang.Object r1 = r13.A00
            com.whatsapp.payments.ui.widget.PaymentView r1 = (com.whatsapp.payments.ui.widget.PaymentView) r1
            boolean r0 = r1.A0H()
            if (r0 == 0) goto L_0x0fef
            X.4qx r0 = r1.A0n
            r0.A03()
        L_0x0fef:
            X.9Su r1 = r1.A14
            r0 = 1
            r1.A01(r0)
            return
        L_0x0ff6:
            java.lang.Object r6 = r13.A00
            X.9G3 r6 = (X.AnonymousClass9G3) r6
            X.34w r2 = r6.A0N
            int r1 = r2.A01
            r0 = 4
            if (r1 != r0) goto L_0x103f
            X.9U4 r1 = r6.A0T
            java.lang.String r0 = "P2M_LITE"
            X.9oC r5 = r1.A0H(r0)
            if (r5 == 0) goto L_0x103f
        L_0x100b:
            android.content.Context r4 = r6.getContext()
            X.34w r3 = r6.A0N
            java.lang.String r9 = r6.A0X
            int r2 = r6.A00
            r11 = 1
            java.lang.Integer r7 = java.lang.Integer.valueOf(r11)
            boolean r1 = r3.A0L()
            r0 = 44
            if (r1 == 0) goto L_0x1024
            r0 = 43
        L_0x1024:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r0)
            int r1 = r3.A03
            r0 = 40
            if (r1 == r0) goto L_0x102f
            r11 = 0
        L_0x102f:
            if (r5 == 0) goto L_0x103b
            X.9no r6 = r5.B7b()
            if (r6 == 0) goto L_0x103b
            r10 = 0
            r6.BKC(r7, r8, r9, r10, r11)
        L_0x103b:
            X.AnonymousClass9Lt.A00(r4, r3, r5, r9, r2)
            return
        L_0x103f:
            X.9U4 r1 = r6.A0T
            java.lang.String r0 = r2.A0G
            X.9SU r1 = r1.A0F(r0)
            if (r1 == 0) goto L_0x1050
            java.lang.String r0 = r2.A0I
            X.9oC r5 = r1.A01(r0)
            goto L_0x100b
        L_0x1050:
            r5 = 0
            goto L_0x100b
        L_0x1052:
            java.lang.Object r0 = r13.A00
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            java.lang.String r0 = "market://details?id=com.whatsapp"
            android.content.Intent r0 = X.C18300x5.A08(r0)
        L_0x1060:
            r1.startActivity(r0)
            return
        L_0x1064:
            java.lang.Object r3 = r13.A00
            X.9G3 r3 = (X.AnonymousClass9G3) r3
            r2 = 0
            X.34w r0 = r3.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0D
            goto L_0x1077
        L_0x106e:
            java.lang.Object r3 = r13.A00
            X.9G3 r3 = (X.AnonymousClass9G3) r3
            r2 = 0
            X.34w r0 = r3.A0N
            com.whatsapp.jid.UserJid r0 = r0.A0E
        L_0x1077:
            X.5XB r1 = new X.5XB
            r1.<init>((android.view.View) r14, (X.C95814uZ) r0, (java.lang.Integer) r2)
            android.widget.ImageView r0 = r3.A05
            java.lang.String r0 = X.AnonymousClass0YZ.A06(r0)
            r1.A04 = r0
            android.content.Context r0 = r3.getContext()
            android.app.Activity r0 = X.C111095hX.A02(r0)
            r1.A02(r0)
            return
        L_0x1090:
            java.lang.Object r0 = r13.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r0.onBackPressed()
            return
        L_0x1098:
            X.4eZ r3 = r3.A01
            r2 = 2131891694(0x7f1215ee, float:1.9418115E38)
            r1 = 2131891693(0x7f1215ed, float:1.9418113E38)
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3.Box(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204249p3.onClick(android.view.View):void");
    }
}
