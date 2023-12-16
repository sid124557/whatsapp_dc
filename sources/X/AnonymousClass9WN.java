package X;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiPaymentTransactionDetailsActivity;
import com.whatsapp.util.Log;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.9WN  reason: invalid class name */
public class AnonymousClass9WN {
    public final C69263Wi A00;
    public final C56612sH A01;
    public final C54292oU A02;
    public final C620733j A03;
    public final AnonymousClass36F A04;
    public final C197109ca A05;
    public final AnonymousClass4FS A06;

    public void A07(Context context, C195179Wl r15, C202849mg r16, String str, boolean z) {
        String str2;
        Context context2 = context;
        C195179Wl r8 = r15;
        C202849mg r9 = r16;
        String str3 = str;
        boolean z2 = z;
        if (r15 == null) {
            str2 = "isValidMandateMetadata: Unable to parse ";
        } else {
            String str4 = r15.A0L;
            if (str4 != null && z) {
                str2 = "isValidMandateMetadata: Update mandate is only supported through deeplink URL";
            } else if (!AnonymousClass9MA.A02.contains(r15.A0C) || !C194759Uj.A00(r15.A0O)) {
                Log.w("isValidMandateMetadata: Purpose code invalid");
                this.A05.BKB(0, (Integer) null, "qr_code_scan_error", str3);
                this.A00.BkS(new C201149jb(context, r9, z2));
            } else {
                String str5 = r15.A0N;
                String str6 = r15.A0M;
                if (!(str5 == null || str6 == null)) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
                    try {
                        Date parse = simpleDateFormat.parse(str5);
                        Date parse2 = simpleDateFormat.parse(str6);
                        if (!(parse == null || parse2 == null || parse.after(parse2))) {
                            Object[] objArr = {r15.A0A, r15.A03, r15.A0K};
                            int i = 0;
                            while (objArr[i] != null) {
                                i++;
                                if (i >= 3) {
                                    C626936e.A06(r15);
                                    C193749Pv r6 = new C193749Pv(context2, r8, r9, this, str3, z2);
                                    if (TextUtils.isEmpty(str4)) {
                                        Context context3 = r6.A00;
                                        Intent A08 = AnonymousClass0x9.A08(context3, IndiaUpiPaymentTransactionDetailsActivity.class);
                                        A08.setFlags(268435456);
                                        AnonymousClass9WY.A03(A08, r6.A01, r6.A04);
                                        context3.startActivity(A08);
                                        r6.A02.BTW();
                                        return;
                                    }
                                    this.A06.BkM(new C201139ja(r6, this, str4));
                                    return;
                                }
                            }
                            str2 = "isValidMandateMetadata: missing mandatory fields";
                        }
                    } catch (ParseException unused) {
                    }
                }
                str2 = "isValidMandateMetadata: start and end date invalid";
            }
        }
        Log.w(str2);
        this.A05.BKB(0, (Integer) null, "qr_code_scan_error", str3);
        this.A00.BkS(new C201149jb(context, r9, z2));
    }

    public static String A00(C56612sH r2, C620733j r3, long j) {
        return C107505bQ.A06(r3, r2.A0I(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset())));
    }

    public static boolean A01(AnonymousClass1VX r1, String str) {
        if (r1.A0X(1433)) {
            String A0Q = r1.A0Q(2834);
            if (TextUtils.isEmpty(A0Q) || TextUtils.isEmpty(str) || !A0Q.contains(str)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A02(String str) {
        if (str == null || str.equals("ONETIME") || str.equals("UNKNOWN")) {
            return false;
        }
        return true;
    }

    public long A03(String str, boolean z) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ddMMyyyy", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("Asia/Kolkata"));
        try {
            Date parse = simpleDateFormat.parse(str);
            if (parse != null) {
                if (!z) {
                    Calendar instance = Calendar.getInstance(TimeZone.getTimeZone("Asia/Kolkata"));
                    instance.setTime(parse);
                    instance.set(11, 23);
                    instance.set(12, 59);
                    instance.set(13, 59);
                    instance.set(14, 999);
                    parse = instance.getTime();
                }
                return parse.getTime();
            }
        } catch (ParseException unused) {
        }
        Log.e("PAY: IndiaMandateUtils/getTimestamp, unexpected date format");
        return 0;
    }

    public String A04(long j) {
        return C86614Ku.A0s(this.A02.A00, C107505bQ.A06(this.A03, this.A01.A0I(j - ((long) TimeZone.getTimeZone("Asia/Kolkata").getRawOffset()))), AnonymousClass002.A0L(), R.string.f11nameremoved);
    }

    public String A05(AnonymousClass39Q r4, String str) {
        String B3V = AnonymousClass1S3.A05.B3V(this.A03, r4);
        if ("MAX".equals(str)) {
            return C86604Kt.A0m(this.A02.A00, B3V, R.string.f11nameremoved);
        }
        return B3V;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(java.lang.String r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0009
            int r0 = r3.hashCode()
            switch(r0) {
                case -1738378111: goto L_0x00a7;
                case -1681232246: goto L_0x0096;
                case -602281453: goto L_0x0085;
                case 64808441: goto L_0x0075;
                case 1134556285: goto L_0x0065;
                case 1271097434: goto L_0x0055;
                case 1297843654: goto L_0x0045;
                case 1720567065: goto L_0x0035;
                case 1896178312: goto L_0x0025;
                case 1954618349: goto L_0x0015;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894596(0x7f122144, float:1.9424001E38)
        L_0x0010:
            java.lang.String r0 = r1.getString(r0)
            return r0
        L_0x0015:
            java.lang.String r0 = "MONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894758(0x7f1221e6, float:1.942433E38)
            goto L_0x0010
        L_0x0025:
            java.lang.String r0 = "ASPRESENTED"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894753(0x7f1221e1, float:1.942432E38)
            goto L_0x0010
        L_0x0035:
            java.lang.String r0 = "QUARTERLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894760(0x7f1221e8, float:1.9424334E38)
            goto L_0x0010
        L_0x0045:
            java.lang.String r0 = "BIMONTHLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894754(0x7f1221e2, float:1.9424322E38)
            goto L_0x0010
        L_0x0055:
            java.lang.String r0 = "FORTNIGHTLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894756(0x7f1221e4, float:1.9424326E38)
            goto L_0x0010
        L_0x0065:
            java.lang.String r0 = "HALFYEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894757(0x7f1221e5, float:1.9424328E38)
            goto L_0x0010
        L_0x0075:
            java.lang.String r0 = "DAILY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894755(0x7f1221e3, float:1.9424324E38)
            goto L_0x0010
        L_0x0085:
            java.lang.String r0 = "ONETIME"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894759(0x7f1221e7, float:1.9424332E38)
            goto L_0x0010
        L_0x0096:
            java.lang.String r0 = "YEARLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894762(0x7f1221ea, float:1.9424338E38)
            goto L_0x0010
        L_0x00a7:
            java.lang.String r0 = "WEEKLY"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0009
            X.2oU r0 = r2.A02
            android.content.Context r1 = r0.A00
            r0 = 2131894761(0x7f1221e9, float:1.9424336E38)
            goto L_0x0010
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9WN.A06(java.lang.String):java.lang.String");
    }

    public AnonymousClass9WN(C69263Wi r1, C56612sH r2, C54292oU r3, C620733j r4, AnonymousClass36F r5, C197109ca r6, AnonymousClass4FS r7) {
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
        this.A06 = r7;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
