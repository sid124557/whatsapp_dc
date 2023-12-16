package X;

import android.content.SharedPreferences;
import com.whatsapp.util.Log;

/* renamed from: X.5UQ  reason: invalid class name */
public final class AnonymousClass5UQ {
    public final SharedPreferences A00;
    public final C56612sH A01;

    public final void A06(String str, String str2, String str3) {
        C162457s7.A0J(str, 0);
        C18260x0.A0Q(str2, str3);
        SharedPreferences.Editor edit = this.A00.edit();
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", str);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", str2);
        edit.putString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", str3);
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumberPrefs/saveSmsVerificationCode/commit failed");
        }
    }

    public final void A02() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.code_verification_retry_time");
        if (!edit.commit()) {
            Log.e("VerifyPhoneNumberPrefs/clearEnterCodeRetryTime/error");
        }
    }

    public final void A03() {
        SharedPreferences.Editor edit = this.A00.edit();
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_code");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_cc");
        edit.remove("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number");
        if (!edit.commit()) {
            Log.w("VerifyPhoneNumberPrefs/clearSavedSmsVerificationCode/commit failed");
        }
    }

    public AnonymousClass5UQ(SharedPreferences sharedPreferences, C56612sH r2) {
        C18260x0.A0Q(r2, sharedPreferences);
        this.A01 = r2;
        this.A00 = sharedPreferences;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        r1 = r3.getLong(r0, -1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long A00(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r5.hashCode()
            r1 = -1
            switch(r0) {
                case -795576526: goto L_0x0034;
                case 114009: goto L_0x0027;
                case 112386354: goto L_0x001a;
                case 2120743944: goto L_0x000d;
                default: goto L_0x0009;
            }
        L_0x0009:
            java.lang.System.currentTimeMillis()
            return r1
        L_0x000d:
            java.lang.String r0 = "email_otp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
            goto L_0x003e
        L_0x001a:
            java.lang.String r0 = "voice"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x003e
        L_0x0027:
            java.lang.String r0 = "sms"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x003e
        L_0x0034:
            boolean r0 = X.AnonymousClass4L0.A0S(r5)
            if (r0 == 0) goto L_0x0009
            android.content.SharedPreferences r3 = r4.A00
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
        L_0x003e:
            long r1 = r3.getLong(r0, r1)
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UQ.A00(java.lang.String):long");
    }

    public final String A01(String str, String str2) {
        C18260x0.A0O(str, str2);
        SharedPreferences sharedPreferences = this.A00;
        if (!str.equals(sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_cc", (String) null)) || !str2.equals(sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_phone_number", (String) null))) {
            return null;
        }
        return sharedPreferences.getString("com.whatsapp.registration.VerifyPhoneNumber.sms_code", (String) null);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004f, code lost:
        r1.remove(r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clearRequestCodeRetryTime/method="
            X.C18260x0.A0s(r0, r3, r1)
            android.content.SharedPreferences r0 = r2.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x0047;
                case 114009: goto L_0x003c;
                case 112386354: goto L_0x0031;
                case 2120743944: goto L_0x0026;
                default: goto L_0x0016;
            }
        L_0x0016:
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x0025
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/clearRequestCodeRetryTime error/method="
            X.C18260x0.A0r(r0, r3, r1)
        L_0x0025:
            return
        L_0x0026:
            java.lang.String r0 = "email_otp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
            goto L_0x004f
        L_0x0031:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x004f
        L_0x003c:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x004f
        L_0x0047:
            boolean r0 = X.AnonymousClass4L0.A0S(r3)
            if (r0 == 0) goto L_0x0016
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
        L_0x004f:
            r1.remove(r0)
            goto L_0x0016
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UQ.A04(java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0057, code lost:
        r1.putLong(r0, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(java.lang.String r3, long r4) {
        /*
            r2 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/saveRequestCodeRetryTime/method="
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = "/endTimeInMs="
            X.C18260x0.A12(r0, r1, r4)
            android.content.SharedPreferences r0 = r2.A00
            android.content.SharedPreferences$Editor r1 = r0.edit()
            int r0 = r3.hashCode()
            switch(r0) {
                case -795576526: goto L_0x004f;
                case 114009: goto L_0x0044;
                case 112386354: goto L_0x0039;
                case 2120743944: goto L_0x002e;
                default: goto L_0x001e;
            }
        L_0x001e:
            boolean r0 = r1.commit()
            if (r0 != 0) goto L_0x002d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "VerifyPhoneNumberPrefs/saveCodeRetryTime error/method="
            X.C18260x0.A0r(r0, r3, r1)
        L_0x002d:
            return
        L_0x002e:
            java.lang.String r0 = "email_otp"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.email_retry_time"
            goto L_0x0057
        L_0x0039:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.call_countdown_end_time"
            goto L_0x0057
        L_0x0044:
            java.lang.String r0 = "sms"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.sms_request_failed_retry_time"
            goto L_0x0057
        L_0x004f:
            boolean r0 = X.AnonymousClass4L0.A0S(r3)
            if (r0 == 0) goto L_0x001e
            java.lang.String r0 = "com.whatsapp.registration.VerifyPhoneNumber.wa_old_request_failed_retry_time"
        L_0x0057:
            r1.putLong(r0, r4)
            goto L_0x001e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5UQ.A05(java.lang.String, long):void");
    }
}
