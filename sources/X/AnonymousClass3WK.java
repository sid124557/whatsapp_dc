package X;

import android.app.ActivityManager;
import android.app.NotificationManager;
import android.app.usage.UsageEvents;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.whatsapp.util.Log;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* renamed from: X.3WK  reason: invalid class name */
public final class AnonymousClass3WK implements C84944Ei {
    public final C56972sr A00;
    public final C620633i A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final AnonymousClass5ZR A04;
    public final AnonymousClass33p A05;

    public void BK1(String str) {
        NotificationManager A0A;
        C162457s7.A0J(str, 0);
        C615631i.A01();
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("/settings/notifications-enabled: ");
        Context context = this.A03.A00;
        C18260x0.A1V(A0l, new C05540Tx(context).A01());
        StringBuilder A0l2 = AnonymousClass000.A0l(str);
        A0l2.append("/google-play-services: ");
        C18260x0.A1V(A0l2, AnonymousClass000.A1T(C159787mS.A00(context)));
        C620633i r3 = this.A01;
        PowerManager A0J = r3.A0J();
        if (A0J != null) {
            StringBuilder A0l3 = AnonymousClass000.A0l(str);
            A0l3.append("/power-save-mode:");
            C18260x0.A1V(A0l3, A0J.isPowerSaveMode());
        }
        if (C107385bE.A06() && (A0A = r3.A0A()) != null) {
            int currentInterruptionFilter = A0A.getCurrentInterruptionFilter();
            StringBuilder A0l4 = AnonymousClass000.A0l(str);
            A0l4.append("/do-not-disturb:");
            boolean z = true;
            if (currentInterruptionFilter == 1 || currentInterruptionFilter == 0) {
                z = false;
            }
            C18260x0.A1V(A0l4, z);
        }
        if (C107385bE.A06()) {
            ActivityManager A06 = r3.A06();
            if (A06 != null) {
                StringBuilder A0l5 = AnonymousClass000.A0l(str);
                A0l5.append("/background-restricted:");
                C18260x0.A1V(A0l5, A06.isBackgroundRestricted());
            }
            A01(str);
        }
    }

    public void BK5(AnonymousClass2P4 r18) {
        String str;
        String str2;
        String str3;
        String str4;
        StringBuilder A0l;
        String str5;
        String str6;
        AnonymousClass2P4 r10 = r18;
        C162457s7.A0J(r10, 0);
        Context context = r10.A00;
        Locale locale = AnonymousClass001.A0M(context).locale;
        AnonymousClass33p r5 = this.A05;
        String A0Z = r5.A0Z();
        C162457s7.A0D(A0Z);
        String A0b = r5.A0b();
        C162457s7.A0D(A0b);
        C620633i r7 = this.A01;
        TelephonyManager A0N = r7.A0N();
        if (A0N != null) {
            str = AnonymousClass34d.A01(A0N.getNetworkOperator(), "N/A");
            C162457s7.A0D(str);
            str3 = AnonymousClass34d.A01(A0N.getSimOperator(), "N/A");
            C162457s7.A0D(str3);
            str2 = A0N.getNetworkOperatorName();
            C162457s7.A0D(str2);
        } else {
            str = "N/A (no telephony manager)";
            str2 = "UNKNOWN (no telephony manager)";
            str3 = str;
        }
        Integer valueOf = Integer.valueOf(this.A00.A0D());
        Map map = r10.A01;
        map.put("Device ID", valueOf);
        map.put("Description", "2.23.26.14");
        map.put("Version", AnonymousClass000.A0X("", AnonymousClass000.A0l("2.23.26.14")));
        map.put("App", "com.whatsapp");
        String str7 = "zz";
        if (locale != null) {
            str4 = locale.getCountry();
        } else {
            str4 = str7;
        }
        map.put("LC", str4);
        if (locale != null) {
            str7 = locale.getLanguage();
        }
        map.put("LG", str7);
        map.put("Carrier", str2);
        map.put("Manufacturer", Build.MANUFACTURER);
        map.put("Model", Build.MODEL);
        map.put("CPU ABI", AnonymousClass321.A02());
        map.put("OS", Build.VERSION.RELEASE);
        map.put("Radio MCC-MNC", str);
        map.put("SIM MCC-MNC", str3);
        if (r10.A02) {
            A0l = AnonymousClass000.A0m("", A0Z);
        } else {
            A0l = AnonymousClass000.A0l(A0Z);
            A0l.append(' ');
            A0l.append(A0b);
        }
        map.put("CCode", A0l.toString());
        TelephonyManager A0N2 = r7.A0N();
        if (A0N2 != null) {
            int phoneType = A0N2.getPhoneType();
            if (phoneType == 0) {
                str5 = "NONE";
            } else if (phoneType == 1) {
                str5 = "GSM";
            } else if (phoneType == 2) {
                str5 = "CDMA";
            } else if (phoneType != 3) {
                str5 = "UNKNOWN";
            } else {
                str5 = "SIP";
            }
            switch (AnonymousClass321.A01(A0N2, this.A04)) {
                case 1:
                    str6 = "GPRS";
                    break;
                case 2:
                    str6 = "EDGE";
                    break;
                case 3:
                    str6 = "UMTS";
                    break;
                case 4:
                    str6 = "CDMA";
                    break;
                case 5:
                    str6 = "CDMA - EvDo rev. 0";
                    break;
                case 6:
                    str6 = "CDMA - EvDo rev. A";
                    break;
                case 7:
                    str6 = "CDMA - 1xRTT";
                    break;
                case 8:
                    str6 = "HSDPA";
                    break;
                case 9:
                    str6 = "HSUPA";
                    break;
                case 10:
                    str6 = "HSPA";
                    break;
                case 11:
                    str6 = "iDEN";
                    break;
                case 12:
                    str6 = "CDMA - EvDo rev. B";
                    break;
                case 13:
                    str6 = "LTE";
                    break;
                case 14:
                    str6 = "CDMA - eHRPD";
                    break;
                case 15:
                    str6 = "HSPA+";
                    break;
                default:
                    str6 = "UNKNOWN";
                    break;
            }
        } else {
            str5 = "UNKNOWN (no telephony manager)";
            str6 = str5;
        }
        map.put("Target", "beta");
        map.put("Product", Build.PRODUCT);
        map.put("Device", Build.DEVICE);
        map.put("Build", Build.FINGERPRINT);
        map.put("Board", Build.BOARD);
        map.put("Kernel", C627236i.A00());
        map.put("Device ISO8601", AnonymousClass0x7.A0u("yyyy-MM-dd HH:mm:ss.SSSZ").format(new Date()));
        int length = str5.length();
        StringBuilder sb = new StringBuilder(length * 2);
        for (int i = 0; i < length; i = AnonymousClass0x7.A09(str5, sb, i)) {
        }
        map.put("Phone Type", sb.toString());
        int length2 = str6.length();
        StringBuilder sb2 = new StringBuilder(length2 * 2);
        for (int i2 = 0; i2 < length2; i2 = AnonymousClass0x7.A09(str6, sb2, i2)) {
        }
        map.put("Network Type", sb2.toString());
        if (C107385bE.A02()) {
            map.put("Missing Permissions", A00(context));
        }
        map.put("Architecture", System.getProperty("os.arch"));
        if (C107385bE.A06()) {
            C183538qC r4 = r5.A01;
            if (C18300x5.A0B(r4).getString("pref_primary_flash_call_status", (String) null) != null) {
                map.put("Primary flash call status", C18300x5.A0B(r4).getString("pref_primary_flash_call_status", (String) null));
            }
        }
        if (C107385bE.A02()) {
            C183538qC r42 = r5.A01;
            if (C18300x5.A0B(r42).getString("pref_secondary_flash_call_status", (String) null) != null) {
                map.put("Secondary flash call status", C18300x5.A0B(r42).getString("pref_secondary_flash_call_status", (String) null));
            }
        }
        C183538qC r43 = r5.A01;
        map.put("AutoConf status", C18280x3.A0Z(C18300x5.A0B(r43), "pref_autoconf_status"));
        if (C18300x5.A0B(r43).getString("pref_wa_old_status", (String) null) != null) {
            map.put("WA old status", C18300x5.A0B(r43).getString("pref_wa_old_status", (String) null));
        }
        if (C18300x5.A0B(r43).getString("pref_email_otp_status", (String) null) != null) {
            map.put("Email OTP status", C18300x5.A0B(r43).getString("pref_email_otp_status", (String) null));
        }
        if (C18300x5.A0B(r43).getString("pref_captcha_status", (String) null) != null) {
            map.put("Captcha status", C18300x5.A0B(r43).getString("pref_captcha_status", (String) null));
        }
        if (C18300x5.A0B(r43).getString("pref_silent_auth_status", (String) null) != null) {
            map.put("Silent auth status", C18300x5.A0B(r43).getString("pref_silent_auth_status", (String) null));
        }
    }

    public final void A01(String str) {
        StringBuilder sb;
        UsageStatsManager A0B = this.A01.A0B();
        if (A0B != null) {
            long currentTimeMillis = System.currentTimeMillis();
            UsageEvents queryEventsForSelf = A0B.queryEventsForSelf(currentTimeMillis - TimeUnit.HOURS.toMillis(12), currentTimeMillis);
            C162457s7.A0D(queryEventsForSelf);
            UsageEvents.Event event = new UsageEvents.Event();
            while (queryEventsForSelf.getNextEvent(event)) {
                if (event.getEventType() == 11) {
                    StringBuilder A0l = AnonymousClass000.A0l(str);
                    A0l.append("/app-standby bucket:");
                    A0l.append(event.getAppStandbyBucket());
                    A0l.append(" time:");
                    C18260x0.A1I(A0l, event.getTimeStamp());
                }
            }
            sb = AnonymousClass000.A0l(str);
            sb.append("/current app-standby bucket:");
            sb.append(A0B.getAppStandbyBucket());
        } else {
            sb = AnonymousClass000.A0l(str);
            sb.append("/usage-stats-manager null");
        }
        C18280x3.A14(sb);
    }

    public /* synthetic */ void BKL(String str) {
    }

    public AnonymousClass3WK(C56972sr r2, C620633i r3, C56612sH r4, C54292oU r5, AnonymousClass5ZR r6, AnonymousClass33p r7) {
        C18260x0.A0f(r4, r5, r2, r3, r7);
        C162457s7.A0J(r6, 6);
        this.A02 = r4;
        this.A03 = r5;
        this.A00 = r2;
        this.A01 = r3;
        this.A05 = r7;
        this.A04 = r6;
    }

    public static final String A00(Context context) {
        Object obj;
        PackageManager packageManager = context.getPackageManager();
        if (packageManager == null) {
            Log.e("findmissingpermissions/no-package-manager");
        } else {
            try {
                obj = packageManager.getPackageInfo("com.whatsapp", ZipDecompressor.UNZIP_BUFFER_SIZE);
            } catch (Throwable th) {
                obj = AnonymousClass3Z0.A01(th);
            }
            Throwable A002 = AnonymousClass3Z9.A00(obj);
            if (A002 == null) {
                C162457s7.A0G(obj);
                PackageInfo packageInfo = (PackageInfo) obj;
                String[] strArr = packageInfo.requestedPermissions;
                if (strArr != null) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    int[] iArr = packageInfo.requestedPermissionsFlags;
                    C162457s7.A0C(iArr);
                    int length = iArr.length;
                    int i = 0;
                    int i2 = 0;
                    while (i < length) {
                        int i3 = i2 + 1;
                        if ((iArr[i] & 2) == 0) {
                            if (AnonymousClass001.A1W(A0o.length())) {
                                AnonymousClass001.A1M(A0o);
                            }
                            A0o.append(strArr[i2]);
                        }
                        i++;
                        i2 = i3;
                    }
                    return C18290x4.A0o(A0o);
                }
            } else {
                Log.e(A002);
                return "";
            }
        }
        return "";
    }
}
