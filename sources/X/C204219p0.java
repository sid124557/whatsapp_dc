package X;

import android.content.DialogInterface;

/* renamed from: X.9p0  reason: invalid class name and case insensitive filesystem */
public class C204219p0 implements DialogInterface.OnClickListener {
    public Object A00;
    public final int A01;

    public C204219p0(Object obj, int i) {
        this.A01 = i;
        this.A00 = obj;
    }

    public static void A00(C19340zH r1, Object obj, int i, int i2) {
        r1.A0W(new C204219p0(obj, i), i2);
    }

    public static void A01(C19340zH r1, Object obj, int i, int i2) {
        r1.A0Y(new C204219p0(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:144:0x0498, code lost:
        X.C621433s.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x049b, code lost:
        X.C18310x6.A0y(r2, r2.A00, "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x04a2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x04be, code lost:
        r0 = 101;
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x053a, code lost:
        X.C621433s.A00(r1, r0);
        r1.A7H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x0540, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:0x0609, code lost:
        X.C621433s.A00(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x060c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0613, code lost:
        X.C621433s.A00(r1, r0);
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x0616, code lost:
        r1.A7H();
        r1 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0619, code lost:
        r1.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x061c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:208:0x066e, code lost:
        r1.Bj8();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x0671, code lost:
        r1.BWM((X.AnonymousClass3QO) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x0675, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x067a, code lost:
        r0.Bj8();
        r0.B1p();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0680, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        r0.finish();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r16, int r17) {
        /*
            r15 = this;
            int r0 = r15.A01
            switch(r0) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0040;
                case 2: goto L_0x0048;
                case 3: goto L_0x0050;
                case 4: goto L_0x0069;
                case 5: goto L_0x0005;
                case 6: goto L_0x0082;
                case 7: goto L_0x0132;
                case 8: goto L_0x013c;
                case 9: goto L_0x0192;
                case 10: goto L_0x01ac;
                case 11: goto L_0x01b4;
                case 12: goto L_0x01ba;
                case 13: goto L_0x01c2;
                case 14: goto L_0x01ca;
                case 15: goto L_0x01e6;
                case 16: goto L_0x01ee;
                case 17: goto L_0x01f6;
                case 18: goto L_0x01fe;
                case 19: goto L_0x020c;
                case 20: goto L_0x022d;
                case 21: goto L_0x0259;
                case 22: goto L_0x02d5;
                case 23: goto L_0x0005;
                case 24: goto L_0x02db;
                case 25: goto L_0x0306;
                case 26: goto L_0x030e;
                case 27: goto L_0x0005;
                case 28: goto L_0x031f;
                case 29: goto L_0x0341;
                case 30: goto L_0x0349;
                case 31: goto L_0x0005;
                case 32: goto L_0x0374;
                case 33: goto L_0x038c;
                case 34: goto L_0x039a;
                case 35: goto L_0x03ac;
                case 36: goto L_0x03b7;
                case 37: goto L_0x03c4;
                case 38: goto L_0x038c;
                case 39: goto L_0x03cc;
                case 40: goto L_0x03d4;
                case 41: goto L_0x03dc;
                case 42: goto L_0x03e4;
                case 43: goto L_0x0456;
                case 44: goto L_0x0468;
                case 45: goto L_0x0470;
                case 46: goto L_0x0482;
                case 47: goto L_0x048a;
                case 48: goto L_0x0492;
                case 49: goto L_0x04a3;
                case 50: goto L_0x04ab;
                case 51: goto L_0x04b6;
                case 52: goto L_0x04c2;
                case 53: goto L_0x04fc;
                case 54: goto L_0x050b;
                case 55: goto L_0x0516;
                case 56: goto L_0x0524;
                case 57: goto L_0x052c;
                case 58: goto L_0x0534;
                case 59: goto L_0x0541;
                case 60: goto L_0x0593;
                case 61: goto L_0x0005;
                case 62: goto L_0x0005;
                case 63: goto L_0x05b1;
                case 64: goto L_0x0005;
                case 65: goto L_0x05bb;
                case 66: goto L_0x05c5;
                case 67: goto L_0x0005;
                case 68: goto L_0x0005;
                case 69: goto L_0x0005;
                case 70: goto L_0x0492;
                case 71: goto L_0x05d5;
                case 72: goto L_0x05e4;
                case 73: goto L_0x05e4;
                case 74: goto L_0x05eb;
                case 75: goto L_0x05f5;
                case 76: goto L_0x05fc;
                case 77: goto L_0x0603;
                case 78: goto L_0x060d;
                case 79: goto L_0x061d;
                case 80: goto L_0x0005;
                case 81: goto L_0x0017;
                case 82: goto L_0x0637;
                case 83: goto L_0x001e;
                case 84: goto L_0x0005;
                case 85: goto L_0x063f;
                case 86: goto L_0x0647;
                case 87: goto L_0x064f;
                case 88: goto L_0x0657;
                case 89: goto L_0x065f;
                case 90: goto L_0x066a;
                case 91: goto L_0x0676;
                case 92: goto L_0x0681;
                case 93: goto L_0x068c;
                case 94: goto L_0x0694;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
        L_0x0009:
            r0.finish()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r0 = r15.A00
            X.9ms r0 = (X.C202949ms) r0
            if (r0 == 0) goto L_0x000c
            r0.Bal()
            return
        L_0x0017:
            java.lang.Object r0 = r15.A00
            X.9d8 r0 = (X.C197419d8) r0
            X.4eZ r0 = r0.A01
            goto L_0x0009
        L_0x001e:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment r0 = (com.whatsapp.payments.ui.PaymentsUnavailableDialogFragment) r0
            X.03q r2 = r0.A0Q()
            if (r2 == 0) goto L_0x000c
            X.5WY r1 = r0.A00
            X.2mi r0 = r0.A01
            boolean r10 = r0.A00()
            java.lang.String r6 = "payments-blocked"
            r3 = 0
            r5 = r3
            r7 = r3
            r8 = r3
            r9 = r3
            r4 = r3
            android.content.Intent r0 = r1.A00(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            r2.startActivity(r0)
            return
        L_0x0040:
            java.lang.Object r0 = r15.A00
            X.9aC r0 = (X.C196039aC) r0
            X.C196039aC.A00(r0)
            return
        L_0x0048:
            java.lang.Object r0 = r15.A00
            X.9aB r0 = (X.C196029aB) r0
            r0.A01.A05.Bbb()
            return
        L_0x0050:
            java.lang.Object r2 = r15.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10000(0x2710, float:1.4013E-41)
            X.C621433s.A00(r2, r0)
            r1 = 0
            X.AnonymousClass345.A02(r2, r1)
            java.lang.String r0 = "PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.setResult(r1)
            r2.finish()
            return
        L_0x0069:
            java.lang.Object r2 = r15.A00
            android.app.Activity r2 = (android.app.Activity) r2
            r0 = 10001(0x2711, float:1.4014E-41)
            X.C621433s.A00(r2, r0)
            r1 = 0
            X.AnonymousClass345.A02(r2, r1)
            java.lang.String r0 = "PAY: IndiaUpiPayIntentReceiverActivity.finishAndDisableAction result canceled"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.setResult(r1)
            r2.finish()
            return
        L_0x0082:
            java.lang.Object r3 = r15.A00
            X.4ea r3 = (X.C89654ea) r3
            java.util.AbstractMap r1 = X.C1899593h.A0d(r3)
            if (r1 == 0) goto L_0x011e
            java.lang.String r0 = "credential_push_data"
            java.lang.String r4 = X.C18320x8.A0e(r0, r1)
            if (r4 == 0) goto L_0x0125
            java.lang.String r0 = "."
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r5 = 0
            java.util.List r1 = X.C175728Zm.A0P(r4, r0, r5)
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.Object[] r2 = r1.toArray(r0)
            java.lang.String[] r2 = (java.lang.String[]) r2
            int r1 = r2.length
            r0 = 1
            if (r1 <= r0) goto L_0x0125
            r0 = r2[r0]
            byte[] r2 = android.util.Base64.decode(r0, r5)
            X.C162457s7.A0H(r2)     // Catch:{ UnsupportedEncodingException -> 0x0120 }
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ UnsupportedEncodingException -> 0x0120 }
            X.C162457s7.A0F(r1)     // Catch:{ UnsupportedEncodingException -> 0x0120 }
            java.lang.String r0 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0120 }
            r0.<init>(r2, r1)     // Catch:{ UnsupportedEncodingException -> 0x0120 }
            org.json.JSONObject r2 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r0 = "callbackURL"
            java.lang.String r1 = r2.getString(r0)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r0 = "pushAccountReceipts"
            org.json.JSONArray r0 = r2.getJSONArray(r0)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r5 = r0.getString(r5)     // Catch:{ JSONException -> 0x0112 }
            if (r1 == 0) goto L_0x0125
            int r0 = r1.length()     // Catch:{ JSONException -> 0x0112 }
            if (r0 == 0) goto L_0x0125
            android.net.Uri r0 = android.net.Uri.parse(r1)     // Catch:{ JSONException -> 0x0112 }
            android.net.Uri$Builder r2 = r0.buildUpon()     // Catch:{ JSONException -> 0x0112 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r0 = "results["
            r1.append(r0)     // Catch:{ JSONException -> 0x0112 }
            r1.append(r5)     // Catch:{ JSONException -> 0x0112 }
            r0 = 93
            r1.append(r0)     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r1 = r1.toString()     // Catch:{ JSONException -> 0x0112 }
            java.lang.String r0 = "CANCELLED"
            android.net.Uri$Builder r0 = r2.appendQueryParameter(r1, r0)     // Catch:{ JSONException -> 0x0112 }
            android.net.Uri r2 = r0.build()     // Catch:{ JSONException -> 0x0112 }
            if (r2 == 0) goto L_0x0125
            java.lang.String r0 = "android.intent.action.VIEW"
            android.content.Intent r1 = new android.content.Intent
            r1.<init>(r0)
            r1.setData(r2)
            r0 = 1
            r3.A6T(r1, r0)
            return
        L_0x0112:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "JSONException: cannot parse callback url from json, "
            java.lang.String r0 = X.AnonymousClass000.A0a(r0, r1, r2)
            goto L_0x0122
        L_0x011e:
            r4 = 0
            goto L_0x0125
        L_0x0120:
            java.lang.String r0 = "UnsupportedEncodingException: Credential Push data cannot be decoded"
        L_0x0122:
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0125:
            r3.finish()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Credential Push data is invalid. "
            X.C18260x0.A0r(r0, r4, r1)
            return
        L_0x0132:
            java.lang.Object r1 = r15.A00
            X.2m3 r1 = (X.C52792m3) r1
            java.lang.String r0 = "on_failure"
            r1.A00(r0)
            return
        L_0x013c:
            java.lang.Object r0 = r15.A00
            X.9ob r0 = (X.C203969ob) r0
            java.lang.Object r0 = r0.A00
            X.9BX r0 = (X.AnonymousClass9BX) r0
            java.lang.String r5 = X.C1899693i.A0b(r0)
            X.9Fx r1 = r0.A0O
            java.lang.String r0 = "DyiViewModel/delete-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 1
            r1.A0G(r0)
            X.9Sl r7 = r1.A05
            r0 = 8
            X.9pW r8 = new X.9pW
            r8.<init>(r1, r0)
            java.lang.String r4 = r1.A09
            X.9U5 r2 = r7.A05
            r0 = 4
            X.39V[] r3 = new X.AnonymousClass39V[r0]
            java.lang.String r1 = "action"
            java.lang.String r0 = "delete-payments-dyi-report"
            X.AnonymousClass39V.A04(r1, r0, r3)
            java.lang.String r1 = "version"
            java.lang.String r0 = "1"
            X.AnonymousClass39V.A05(r1, r0, r3)
            java.lang.String r0 = "nonce"
            X.AnonymousClass39V.A06(r0, r5, r3)
            java.lang.String r0 = "type"
            X.AnonymousClass39V.A07(r0, r4, r3)
            X.36K r1 = X.C1899693i.A0U(r3)
            android.content.Context r4 = r7.A00
            X.3Wi r6 = r7.A01
            X.2Ha r5 = r7.A03
            r9 = 16
            X.9oU r3 = new X.9oU
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.String r0 = "set"
            r2.A0E(r3, r1, r0)
            return
        L_0x0192:
            java.lang.Object r0 = r15.A00
            X.9ob r0 = (X.C203969ob) r0
            java.lang.Object r0 = r0.A00
            X.9BX r0 = (X.AnonymousClass9BX) r0
            X.9Fx r2 = r0.A0O
            java.lang.String r0 = "DyiViewModel/export-report"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r1 = r2.A08
            X.9gt r0 = new X.9gt
            r0.<init>(r2)
            r1.BkM(r0)
            return
        L_0x01ac:
            java.lang.Object r2 = r15.A00
            X.4eZ r2 = (X.C89644eZ) r2
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0498
        L_0x01b4:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            goto L_0x04be
        L_0x01ba:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 103(0x67, float:1.44E-43)
            goto L_0x0609
        L_0x01c2:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 104(0x68, float:1.46E-43)
            goto L_0x0609
        L_0x01ca:
            java.lang.Object r3 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            r0 = 105(0x69, float:1.47E-43)
            X.C621433s.A00(r3, r0)
            java.lang.Class<com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity> r0 = com.whatsapp.payments.ui.international.IndiaUpiInternationalDeactivationActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            java.lang.String r1 = "extra_bank_account"
            X.6hm r0 = r3.A00
            r2.putExtra(r1, r0)
            r0 = 1020(0x3fc, float:1.43E-42)
            r3.BpY(r2, r0)
            return
        L_0x01e6:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 105(0x69, float:1.47E-43)
            goto L_0x0609
        L_0x01ee:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 200(0xc8, float:2.8E-43)
            goto L_0x0609
        L_0x01f6:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 100
            goto L_0x0609
        L_0x01fe:
            java.lang.Object r1 = r15.A00
            X.9C3 r1 = (X.AnonymousClass9C3) r1
            r0 = 200(0xc8, float:2.8E-43)
            X.C621433s.A00(r1, r0)
            r0 = 1
            r1.A77(r0)
            return
        L_0x020c:
            java.lang.Object r3 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r3 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r3
            r0 = 100
            X.C621433s.A00(r3, r0)
            X.7oG r1 = r3.A0L
            java.lang.String r0 = "unlinking the payment account."
            r1.A06(r0)
            java.lang.Class<com.whatsapp.payments.ui.PaymentDeleteAccountActivity> r0 = com.whatsapp.payments.ui.PaymentDeleteAccountActivity.class
            android.content.Intent r2 = X.AnonymousClass0x9.A08(r3, r0)
            java.lang.String r1 = "extra_remove_payment_account"
            r0 = 1
            r2.putExtra(r1, r0)
            r0 = 0
            r3.startActivityForResult(r2, r0)
            return
        L_0x022d:
            java.lang.Object r2 = r15.A00
            X.9DA r2 = (X.AnonymousClass9DA) r2
            boolean r0 = r2 instanceof X.C191099Bh
            if (r0 == 0) goto L_0x0248
            X.9Bh r2 = (X.C191099Bh) r2
            r0 = 0
            r2.A0m = r0
            X.34V r1 = r2.A02
            if (r1 == 0) goto L_0x0244
            boolean r0 = r2.A07
            r2.A7W(r1, r0)
            return
        L_0x0244:
            r2.A7V()
            return
        L_0x0248:
            boolean r0 = r2 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x0255
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r2 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r2
            r0 = 0
            r2.A0m = r0
            r2.A7V()
            return
        L_0x0255:
            r0 = 0
            r2.A0m = r0
            return
        L_0x0259:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity
            if (r0 == 0) goto L_0x0282
            com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity r1 = (com.whatsapp.payments.ui.IndiaUpiDeviceBindStepActivity) r1
            java.lang.Integer r2 = X.AnonymousClass001.A0f()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A7f(r2, r0)
            X.9ER r0 = r1.A0Q
            r2 = 4
            X.316 r0 = r0.A00
            r0.A0E(r2)
            X.9EQ r0 = r1.A0P
            X.316 r0 = r0.A00
            r0.A0E(r2)
            r0 = 0
            r1.A0m = r0
            goto L_0x0619
        L_0x0282:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity
            if (r0 == 0) goto L_0x0299
            com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity r1 = (com.whatsapp.payments.ui.IndiaUpiBankAccountPickerActivity) r1
            r0 = 0
            r1.A0m = r0
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A7Z(r0)
            X.9ER r0 = r1.A0N
            X.AnonymousClass97T.A11(r0)
            goto L_0x0619
        L_0x0299:
            boolean r0 = r1 instanceof com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld
            if (r0 == 0) goto L_0x02b5
            com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld r1 = (com.whatsapp.payments.ui.IndiaUpiBankPickerActivityOld) r1
            r0 = 0
            r1.A0m = r0
            r1.A7H()
            r1.finish()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A7Z(r0)
            X.9ER r0 = r1.A05
            X.AnonymousClass97T.A11(r0)
            return
        L_0x02b5:
            boolean r0 = r1 instanceof com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity
            if (r0 == 0) goto L_0x02d1
            com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity r1 = (com.whatsapp.payments.onboarding.IndiaUpiBankPickerActivity) r1
            r0 = 0
            r1.A0m = r0
            r1.A7H()
            r1.finish()
            java.lang.Integer r0 = X.C18290x4.A0a()
            r1.A7Z(r0)
            X.9ER r0 = r1.A05
            X.AnonymousClass97T.A11(r0)
            return
        L_0x02d1:
            r0 = 0
            r1.A0m = r0
            return
        L_0x02d5:
            java.lang.Object r2 = r15.A00
            X.4eZ r2 = (X.C89644eZ) r2
            goto L_0x049b
        L_0x02db:
            java.lang.Object r3 = r15.A00
            X.9D7 r3 = (X.AnonymousClass9D7) r3
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.Bp9(r0)
            X.3Wi r4 = r3.A05
            X.4FS r12 = r3.A04
            X.9Se r11 = r3.A0E
            X.9U4 r10 = r3.A0P
            X.3Lv r5 = r3.A08
            X.33l r7 = r3.A0P
            X.9U5 r8 = r3.A0M
            X.9dq r9 = r3.A08
            X.2Ha r6 = r3.A0K
            X.9Sl r2 = new X.9Sl
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 2
            X.9pW r0 = new X.9pW
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0306:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 27
            goto L_0x0613
        L_0x030e:
            java.lang.Object r1 = r15.A00
            X.9D8 r1 = (X.AnonymousClass9D8) r1
            r16.dismiss()
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r1.Bp9(r0)
            X.AnonymousClass97T.A10(r1)
            return
        L_0x031f:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiNumberSettingsActivity) r5
            r0 = 38
            X.C621433s.A00(r5, r0)
            r5.A7H()
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r4 = r5.A0F
            X.9AE r3 = r5.A0C
            X.7yE r2 = r5.A0B
            X.9bS r0 = r5.A0M
            X.7yt r1 = r0.A04()
            X.9bS r0 = r5.A0M
            java.lang.String r0 = r0.A0C()
            r4.A0E(r1, r2, r3, r0)
            return
        L_0x0341:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 38
            goto L_0x053a
        L_0x0349:
            java.lang.Object r3 = r15.A00
            X.9Bs r3 = (X.AnonymousClass9Bs) r3
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.Bp9(r0)
            X.3Wi r4 = r3.A05
            X.4FS r12 = r3.A04
            X.9Se r11 = r3.A0E
            X.9U4 r10 = r3.A0P
            X.3Lv r5 = r3.A08
            X.33l r7 = r3.A0P
            X.9U5 r8 = r3.A0M
            X.9dq r9 = r3.A0C
            X.2Ha r6 = r3.A0K
            X.9Sl r2 = new X.9Sl
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1 = 4
            X.9pW r0 = new X.9pW
            r0.<init>(r3, r1)
            r2.A00(r0)
            return
        L_0x0374:
            java.lang.Object r2 = r15.A00
            X.9Bs r2 = (X.AnonymousClass9Bs) r2
            r16.dismiss()
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r2.Bp9(r0)
            X.9bS r0 = r2.A0M
            java.lang.String r1 = r0.A0B()
            r0 = 0
            r2.BVC(r0, r1)
            return
        L_0x038c:
            java.lang.Object r0 = r15.A00
            X.9DA r0 = (X.AnonymousClass9DA) r0
            r16.dismiss()
            r0.A7H()
            r0.finish()
            return
        L_0x039a:
            java.lang.Object r2 = r15.A00
            X.9Bs r2 = (X.AnonymousClass9Bs) r2
            r0 = 10
            X.C621433s.A00(r2, r0)
            X.7yw r1 = r2.A0B
            X.6hm r1 = (X.C133686hm) r1
            r0 = 1
            X.AnonymousClass97T.A0s(r1, r2, r0)
            return
        L_0x03ac:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 26
            X.C621433s.A00(r1, r0)
            goto L_0x0619
        L_0x03b7:
            java.lang.Object r1 = r15.A00
            X.9D8 r1 = (X.AnonymousClass9D8) r1
            r0 = 13
            X.C621433s.A00(r1, r0)
            r1.A7Y()
            return
        L_0x03c4:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 13
            goto L_0x0613
        L_0x03cc:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 22
            goto L_0x0613
        L_0x03d4:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 34
            goto L_0x053a
        L_0x03dc:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 10
            goto L_0x0613
        L_0x03e4:
            java.lang.Object r3 = r15.A00
            X.9Bs r3 = (X.AnonymousClass9Bs) r3
            r0 = 10
            X.C621433s.A00(r3, r0)
            r0 = 2131892992(0x7f121b00, float:1.9420748E38)
            r3.Bp9(r0)
            X.9bS r0 = r3.A0M
            java.lang.String r6 = r0.A0B()
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            X.99L r1 = r3.A0O
            boolean r0 = X.AnonymousClass000.A1X(r1)
            if (r2 != 0) goto L_0x0452
            if (r0 != 0) goto L_0x044e
            java.lang.String r0 = r3.A7q()
            r1.A0S = r0
            X.7yw r0 = r3.A0B
            X.6hx r2 = r0.A08
            X.99H r2 = (X.AnonymousClass99H) r2
            X.7bd r1 = r3.A05
            java.lang.String r0 = "upi-get-credential"
            r1.A02(r0)
            X.7yw r0 = r3.A0B
            java.lang.String r7 = r0.A0B
            X.7yt r5 = r2.A08
            X.99L r1 = r3.A0O
            X.39Q r4 = r3.A09
            X.7yt r0 = r0.A09
            java.lang.Object r11 = X.C1899593h.A0X(r0)
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r3.A7p()
            X.3ZH r0 = r3.A08
            if (r0 != 0) goto L_0x0449
            r13 = 0
        L_0x0435:
            java.lang.String r0 = r3.A0X
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r14 = 6
            if (r0 != 0) goto L_0x043f
            r14 = 5
        L_0x043f:
            java.lang.String r8 = r1.A0Q
            java.lang.String r9 = r1.A0O
            java.lang.String r10 = r1.A0S
            r3.A7f(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            return
        L_0x0449:
            java.lang.String r13 = X.AnonymousClass36P.A02(r0)
            goto L_0x0435
        L_0x044e:
            r3.A7b()
            return
        L_0x0452:
            X.AnonymousClass97T.A10(r3)
            return
        L_0x0456:
            java.lang.Object r2 = r15.A00
            X.9Bs r2 = (X.AnonymousClass9Bs) r2
            r0 = 11
            X.C621433s.A00(r2, r0)
            X.7yw r1 = r2.A0B
            X.6hm r1 = (X.C133686hm) r1
            r0 = 1
            X.AnonymousClass97T.A0s(r1, r2, r0)
            return
        L_0x0468:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 11
            goto L_0x0613
        L_0x0470:
            java.lang.Object r2 = r15.A00
            X.9Bs r2 = (X.AnonymousClass9Bs) r2
            r0 = 12
            X.C621433s.A00(r2, r0)
            X.7yw r1 = r2.A0B
            X.6hm r1 = (X.C133686hm) r1
            r0 = 1
            X.AnonymousClass97T.A0s(r1, r2, r0)
            return
        L_0x0482:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 12
            goto L_0x0613
        L_0x048a:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 33
            goto L_0x0613
        L_0x0492:
            java.lang.Object r2 = r15.A00
            X.4eZ r2 = (X.C89644eZ) r2
            r0 = 29
        L_0x0498:
            X.C621433s.A00(r2, r0)
        L_0x049b:
            X.5hX r1 = r2.A00
            java.lang.String r0 = "https://faq.whatsapp.com/android/payments/how-to-change-or-set-up-new-upi-pin/?india=1"
            X.C18310x6.A0y(r2, r1, r0)
            return
        L_0x04a3:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 29
            goto L_0x0609
        L_0x04ab:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentSettingsFragment r0 = (com.whatsapp.payments.ui.PaymentSettingsFragment) r0
            X.9bQ r1 = r0.A0u
            r0 = 1
            r1.A00(r0)
            return
        L_0x04b6:
            java.lang.Object r0 = r15.A00
            X.0eF r0 = (X.C08310eF) r0
            X.03q r1 = r0.A0R()
        L_0x04be:
            r0 = 101(0x65, float:1.42E-43)
            goto L_0x0609
        L_0x04c2:
            java.lang.Object r3 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment r3 = (com.whatsapp.payments.ui.IndiaUpiPaymentSettingsFragment) r3
            X.03q r2 = r3.A0R()
            boolean r0 = r2 instanceof X.C89654ea
            if (r0 == 0) goto L_0x04d7
            r1 = r2
            X.4ea r1 = (X.C89654ea) r1
            r0 = 2131891993(0x7f121719, float:1.9418722E38)
            r1.Bp9(r0)
        L_0x04d7:
            android.content.Context r5 = r3.A0G()
            X.3Wi r6 = r3.A0L
            X.4FS r14 = r3.A15
            X.9Se r13 = r3.A0U
            X.9U4 r12 = r3.A0n
            X.3Lv r7 = r3.A0A
            X.33l r9 = r3.A0i
            X.9U5 r10 = r3.A0k
            X.9dq r11 = r3.A0I
            X.2Ha r8 = r3.A0f
            X.9Sl r4 = new X.9Sl
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            r1 = 2
            X.9pU r0 = new X.9pU
            r0.<init>(r2, r1, r3)
            r4.A00(r0)
            return
        L_0x04fc:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity r0 = (com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity) r0
            X.9Fv r1 = r0.A07
            X.9Fp r0 = new X.9Fp
            r0.<init>()
            r1.A0Q(r0)
            return
        L_0x050b:
            java.lang.Object r0 = r15.A00
            android.app.Activity r0 = (android.app.Activity) r0
            r16.dismiss()
            r0.finish()
            return
        L_0x0516:
            java.lang.Object r1 = r15.A00
            X.9D8 r1 = (X.AnonymousClass9D8) r1
            r0 = 19
            X.C621433s.A00(r1, r0)
            r0 = 0
            r1.A0I = r0
            goto L_0x0616
        L_0x0524:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 28
            goto L_0x0613
        L_0x052c:
            java.lang.Object r0 = r15.A00
            X.9D8 r0 = (X.AnonymousClass9D8) r0
            r0.A7a()
            return
        L_0x0534:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 28
        L_0x053a:
            X.C621433s.A00(r1, r0)
            r1.A7H()
            return
        L_0x0541:
            java.lang.Object r5 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity r5 = (com.whatsapp.payments.ui.IndiaUpiProfileDetailsActivity) r5
            r6 = 38
            X.9ca r4 = r5.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0c()
            java.lang.String r1 = "alias_remove_confirm_dialog"
            java.lang.String r0 = "payments_profile"
            r4.BKB(r3, r2, r1, r0)
            X.C621433s.A00(r5, r6)
            r5.A7H()
            X.7bU r0 = r5.A0G
            java.util.List r0 = r0.A01()
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x058e
            com.whatsapp.payments.ui.viewmodel.IndiaUpiNumberSettingsViewModel r4 = r5.A0H
            X.9AE r3 = r5.A0E
            X.7bU r0 = r5.A0G
            java.util.List r0 = r0.A01()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r2 = r0.next()
            X.7yE r2 = (X.C166157yE) r2
            X.9bS r0 = r5.A0M
            X.7yt r1 = r0.A04()
            X.9bS r0 = r5.A0M
            java.lang.String r0 = r0.A0C()
            r4.A0E(r1, r2, r3, r0)
            return
        L_0x058e:
            r0 = 0
            r5.A7X(r0)
            return
        L_0x0593:
            java.lang.Object r6 = r15.A00
            X.9DA r6 = (X.AnonymousClass9DA) r6
            r5 = 38
            X.9ca r4 = r6.A0S
            java.lang.Integer r3 = X.AnonymousClass001.A0f()
            java.lang.Integer r2 = X.C18290x4.A0a()
            java.lang.String r1 = "alias_remove_confirm_dialog"
            java.lang.String r0 = "payments_profile"
            r4.BKB(r3, r2, r1, r0)
            X.C621433s.A00(r6, r5)
            r6.A7H()
            return
        L_0x05b1:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.94u r0 = r0.A06
            r0.A0E()
            return
        L_0x05bb:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.94u r0 = r0.A06
            r0.A0F()
            return
        L_0x05c5:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity r0 = (com.whatsapp.payments.ui.IndiaUpiQrCodeUrlValidationActivity) r0
            X.94u r1 = r0.A06
            r0 = 1
            r1.A02 = r0
            X.4UC r1 = r1.A00
            r0 = 6
            X.C193639Pk.A00(r1, r0)
            return
        L_0x05d5:
            java.lang.Object r1 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 29
            X.C621433s.A00(r1, r0)
            X.9oH r0 = r1.A0N
            r0.BXn()
            return
        L_0x05e4:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 35
            goto L_0x0609
        L_0x05eb:
            java.lang.Object r1 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity r1 = (com.whatsapp.payments.ui.IndiaUpiSendPaymentActivity) r1
            r0 = 0
            r1.A0K = r0
            r0 = 37
            goto L_0x0609
        L_0x05f5:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 39
            goto L_0x0609
        L_0x05fc:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 40
            goto L_0x0609
        L_0x0603:
            java.lang.Object r1 = r15.A00
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 41
        L_0x0609:
            X.C621433s.A00(r1, r0)
            return
        L_0x060d:
            java.lang.Object r1 = r15.A00
            X.9DA r1 = (X.AnonymousClass9DA) r1
            r0 = 32
        L_0x0613:
            X.C621433s.A00(r1, r0)
        L_0x0616:
            r1.A7H()
        L_0x0619:
            r1.finish()
            return
        L_0x061d:
            java.lang.Object r2 = r15.A00
            com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity r2 = (com.whatsapp.payments.ui.IndiaUpiVpaContactInfoActivity) r2
            r6 = 1
            X.9Tt r1 = r2.A05
            X.9U5 r4 = r2.A07
            X.7yt r0 = r2.A03
            java.lang.Object r5 = X.C1899593h.A0X(r0)
            java.lang.String r5 = (java.lang.String) r5
            X.9bI r3 = new X.9bI
            r3.<init>(r2, r6)
            r1.A02(r2, r3, r4, r5, r6)
            return
        L_0x0637:
            java.lang.Object r0 = r15.A00
            com.whatsapp.payments.ui.PaymentTransactionHistoryActivity r0 = (com.whatsapp.payments.ui.PaymentTransactionHistoryActivity) r0
            r0.A75()
            return
        L_0x063f:
            java.lang.Object r1 = r15.A00
            X.9oG r1 = (X.C203759oG) r1
            r1.BjQ()
            goto L_0x066e
        L_0x0647:
            java.lang.Object r0 = r15.A00
            X.9nZ r0 = (X.C203359nZ) r0
            r0.Bj8()
            return
        L_0x064f:
            java.lang.Object r0 = r15.A00
            X.9oG r0 = (X.C203759oG) r0
            r0.BjQ()
            goto L_0x067a
        L_0x0657:
            java.lang.Object r1 = r15.A00
            X.9oG r1 = (X.C203759oG) r1
            r1.BjQ()
            goto L_0x0671
        L_0x065f:
            java.lang.Object r0 = r15.A00
            X.9oG r0 = (X.C203759oG) r0
            r0.BjQ()
            r0.B1p()
            return
        L_0x066a:
            java.lang.Object r1 = r15.A00
            X.9oG r1 = (X.C203759oG) r1
        L_0x066e:
            r1.Bj8()
        L_0x0671:
            r0 = 0
            r1.BWM(r0)
            return
        L_0x0676:
            java.lang.Object r0 = r15.A00
            X.9oG r0 = (X.C203759oG) r0
        L_0x067a:
            r0.Bj8()
            r0.B1p()
            return
        L_0x0681:
            java.lang.Object r0 = r15.A00
            X.9nZ r0 = (X.C203359nZ) r0
            r0.BjQ()
            r0.Bj8()
            return
        L_0x068c:
            java.lang.Object r0 = r15.A00
            X.9nZ r0 = (X.C203359nZ) r0
            r0.BjQ()
            return
        L_0x0694:
            java.lang.Object r0 = r15.A00
            X.9mg r0 = (X.C202849mg) r0
            r0.BTW()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C204219p0.onClick(android.content.DialogInterface, int):void");
    }
}
