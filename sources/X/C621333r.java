package X;

import android.os.Build;
import android.telephony.SubscriptionInfo;
import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.33r  reason: invalid class name and case insensitive filesystem */
public class C621333r {
    public static String A02(String str) {
        if (str != null) {
            Matcher matcher = Pattern.compile("^([17]|2[07]|3[0123469]|4[013456789]|5[12345678]|6[0123456]|8[1246]|9[0123458]|\\d{3})\\d*?(\\d{4,6})$").matcher(str.replaceAll("\\D", ""));
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return null;
    }

    public static C108685dO A00(C162167rN r6, String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            String replaceAll = str.replaceAll("\\D", "");
            if (!TextUtils.isEmpty(str3) && !str3.equals("ZZ")) {
                try {
                    AnonymousClass8LC A0F = r6.A0F(replaceAll, str3.toUpperCase(Locale.US));
                    return new C108685dO(String.valueOf(A0F.countryCode_), String.valueOf(A0F.nationalNumber_), str2);
                } catch (C143616zC e) {
                    Log.w("parsePhoneNumber/exception", e);
                }
            }
            String A02 = A02(replaceAll);
            if (A02 != null) {
                return new C108685dO(A02, C18320x8.A0f(A02, replaceAll), str2);
            }
        }
        return null;
    }

    public static String A01(C620633i r3, C54292oU r4, AnonymousClass5ZR r5) {
        List<SubscriptionInfo> activeSubscriptionInfoList;
        if (!r5.A0F()) {
            Log.i("verifynumber/getphonennumber/permission denied");
        } else {
            if (Build.VERSION.SDK_INT >= 22 && (activeSubscriptionInfoList = SubscriptionManager.from(r4.A00).getActiveSubscriptionInfoList()) != null) {
                for (SubscriptionInfo number : activeSubscriptionInfoList) {
                    String number2 = number.getNumber();
                    if (number2 != null) {
                        return number2;
                    }
                }
            }
            try {
                TelephonyManager A0N = r3.A0N();
                if (A0N != null) {
                    return A0N.getLine1Number();
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumber/error ", e);
                return null;
            }
        }
        return null;
    }

    public static List A03(C162167rN r6, C620633i r7, AnonymousClass5ZR r8) {
        C108685dO A00;
        List<SubscriptionInfo> activeSubscriptionInfoList;
        C108685dO A002;
        ArrayList A0s = AnonymousClass001.A0s();
        if (!r8.A0F()) {
            Log.i("verifynumber/getphonennumbers/permission denied");
        } else if (Build.VERSION.SDK_INT >= 22) {
            SubscriptionManager A0M = r7.A0M();
            if (!(A0M == null || (activeSubscriptionInfoList = A0M.getActiveSubscriptionInfoList()) == null)) {
                for (SubscriptionInfo next : activeSubscriptionInfoList) {
                    if (!(next.getCarrierName() == null || (A002 = A00(r6, next.getNumber(), next.getCarrierName().toString(), next.getCountryIso())) == null)) {
                        A0s.add(A002);
                    }
                }
            }
        } else {
            try {
                TelephonyManager A0N = r7.A0N();
                if (!(A0N == null || (A00 = A00(r6, A0N.getLine1Number(), A0N.getNetworkOperatorName(), A0N.getSimCountryIso())) == null)) {
                    A0s.add(A00);
                    return A0s;
                }
            } catch (Exception e) {
                Log.w("verifynumber/getphonennumbers/error ", e);
                return A0s;
            }
        }
        return A0s;
    }
}
