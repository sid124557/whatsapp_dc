package X;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Point;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Display;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.regex.Pattern;
import org.wawebrtc.MediaCodecVideoEncoder;

/* renamed from: X.7ry  reason: invalid class name and case insensitive filesystem */
public final class C162387ry {
    public static HashMap A00;
    public static final int A01;
    public static final String A02;
    public static final String A03;
    public static final String A04;
    public static final String A05;
    public static final Pattern A06 = Pattern.compile("%([A-Fa-f0-9]{2})");
    public static final Pattern A07 = Pattern.compile(".*\\.isml?(?:/(manifest(.*))?)?");
    public static final Pattern A08 = Pattern.compile("(\\d\\d\\d\\d)\\-(\\d\\d)\\-(\\d\\d)[Tt](\\d\\d):(\\d\\d):(\\d\\d)([\\.,](\\d+))?([Zz]|((\\+|\\-)(\\d?\\d):?(\\d\\d)))?");
    public static final Pattern A09 = Pattern.compile("^(-)?P(([0-9]*)Y)?(([0-9]*)M)?(([0-9]*)D)?(T(([0-9]*)H)?(([0-9]*)M)?(([0-9.]*)S)?)?$");
    public static final byte[] A0A = new byte[0];
    public static final int[] A0B = {0, 79764919, 159529838, 222504665, 319059676, 398814059, 445009330, 507990021, 638119352, 583659535, 797628118, 726387553, 890018660, 835552979, 1015980042, 944750013, 1276238704, 1221641927, 1167319070, 1095957929, 1595256236, 1540665371, 1452775106, 1381403509, 1780037320, 1859660671, 1671105958, 1733955601, 2031960084, 2111593891, 1889500026, 1952343757, -1742489888, -1662866601, -1851683442, -1788833735, -1960329156, -1880695413, -2103051438, -2040207643, -1104454824, -1159051537, -1213636554, -1284997759, -1389417084, -1444007885, -1532160278, -1603531939, -734892656, -789352409, -575645954, -646886583, -952755380, -1007220997, -827056094, -898286187, -231047128, -151282273, -71779514, -8804623, -515967244, -436212925, -390279782, -327299027, 881225847, 809987520, 1023691545, 969234094, 662832811, 591600412, 771767749, 717299826, 311336399, 374308984, 453813921, 533576470, 25881363, 88864420, 134795389, 214552010, 2023205639, 2086057648, 1897238633, 1976864222, 1804852699, 1867694188, 1645340341, 1724971778, 1587496639, 1516133128, 1461550545, 1406951526, 1302016099, 1230646740, 1142491917, 1087903418, -1398421865, -1469785312, -1524105735, -1578704818, -1079922613, -1151291908, -1239184603, -1293773166, -1968362705, -1905510760, -2094067647, -2014441994, -1716953613, -1654112188, -1876203875, -1796572374, -525066777, -462094256, -382327159, -302564546, -206542021, -143559028, -97365931, -17609246, -960696225, -1031934488, -817968335, -872425850, -709327229, -780559564, -600130067, -654598054, 1762451694, 1842216281, 1619975040, 1682949687, 2047383090, 2127137669, 1938468188, 2001449195, 1325665622, 1271206113, 1183200824, 1111960463, 1543535498, 1489069629, 1434599652, 1363369299, 622672798, 568075817, 748617968, 677256519, 907627842, 853037301, 1067152940, 995781531, 51762726, 131386257, 177728840, 240578815, 269590778, 349224269, 429104020, 491947555, -248556018, -168932423, -122852000, -60002089, -500490030, -420856475, -341238852, -278395381, -685261898, -739858943, -559578920, -630940305, -1004286614, -1058877219, -845023740, -916395085, -1119974018, -1174433591, -1262701040, -1333941337, -1371866206, -1426332139, -1481064244, -1552294533, -1690935098, -1611170447, -1833673816, -1770699233, -2009983462, -1930228819, -2119160460, -2056179517, 1569362073, 1498123566, 1409854455, 1355396672, 1317987909, 1246755826, 1192025387, 1137557660, 2072149281, 2135122070, 1912620623, 1992383480, 1753615357, 1816598090, 1627664531, 1707420964, 295390185, 358241886, 404320391, 483945776, 43990325, 106832002, 186451547, 266083308, 932423249, 861060070, 1041341759, 986742920, 613929101, 542559546, 756411363, 701822548, -978770311, -1050133554, -869589737, -924188512, -693284699, -764654318, -550540341, -605129092, -475935807, -413084042, -366743377, -287118056, -257573603, -194731862, -114850189, -35218492, -1984365303, -1921392450, -2143631769, -2063868976, -1698919467, -1635936670, -1824608069, -1744851700, -1347415887, -1418654458, -1506661409, -1561119128, -1129027987, -1200260134, -1254728445, -1309196108};
    public static final int[] A0C = {0, 7, 14, 9, 28, 27, 18, 21, 56, 63, 54, 49, 36, 35, 42, 45, 112, 119, 126, 121, C627136h.A03, 107, 98, 101, 72, 79, 70, 65, 84, 83, 90, 93, 224, 231, 238, 233, 252, 251, 242, 245, 216, 223, 214, 209, 196, 195, 202, 205, MediaCodecVideoEncoder.MIN_ENCODER_HEIGHT, 151, 158, 153, 140, 139, 130, 133, 168, 175, 166, 161, 180, 179, 186, 189, 199, 192, 201, 206, 219, 220, 213, 210, 255, 248, 241, 246, 227, 228, 237, 234, 183, MediaCodecVideoEncoder.MIN_ENCODER_WIDTH, 185, 190, 171, 172, 165, 162, 143, 136, 129, 134, 147, 148, 157, 154, 39, 32, 41, 46, 59, 60, 53, 50, 31, 24, 17, 22, 3, 4, 13, 10, 87, 80, 89, 94, 75, 76, 69, 66, 111, 104, 97, 102, 115, 116, 125, 122, 137, 142, 135, 128, 149, 146, 155, 156, 177, 182, 191, 184, 173, 170, 163, 164, 249, 254, 247, 240, 229, 226, 235, 236, 193, 198, 207, 200, 221, 218, 211, 212, 105, 110, 103, 96, 117, 114, 123, 124, 81, 86, 95, 88, 77, 74, 67, 68, 25, 30, 23, 16, 5, 2, 11, 12, 33, 38, 47, 40, 61, 58, 51, 52, 78, 73, 64, 71, 82, 85, 92, 91, 118, 113, 120, 127, 106, 109, 100, 99, 62, 57, 48, 55, 34, 37, 44, 43, 6, 1, 8, 15, 26, 29, 20, 19, 174, 169, 160, 167, 178, 181, 188, 187, 150, 145, 152, 159, 138, 141, 132, 131, 222, 217, 208, 215, 194, 197, 204, 203, 230, 225, 232, 239, 250, 253, 244, 243};
    public static final String[] A0D = {"alb", "sq", "arm", "hy", "baq", "eu", "bur", "my", "tib", "bo", "chi", "zh", "cze", "cs", "dut", "nl", "ger", "de", "gre", "el", "fre", "fr", "geo", "ka", "ice", "is", "mac", "mk", "mao", "mi", "may", "ms", "per", "fa", "rum", "ro", "scc", "hbs-srp", "slo", "sk", "wel", "cy", PublicKeyCredentialControllerUtility.JSON_KEY_ID, "ms-ind", "iw", "he", "heb", "he", "ji", "yi", "in", "ms-ind", "ind", "ms-ind", "nb", "no-nob", "nob", "no-nob", "nn", "no-nno", "nno", "no-nno", "tw", "ak-twi", "twi", "ak-twi", "bs", "hbs-bos", "bos", "hbs-bos", "hr", "hbs-hrv", "hrv", "hbs-hrv", "sr", "hbs-srp", "srp", "hbs-srp", "cmn", "zh-cmn", "hak", "zh-hak", "nan", "zh-nan", "hsn", "zh-hsn"};
    public static final String[] A0E;

    public static int A00(int i) {
        switch (i) {
            case 1:
                return 4;
            case 2:
                return 12;
            case 3:
                return 28;
            case 4:
                return 204;
            case 5:
                return 220;
            case 6:
                return 252;
            case 7:
                return 1276;
            case 8:
                return 6396;
            default:
                return 0;
        }
    }

    public static int A02(int i, int i2) {
        if (i != 2) {
            if (i == 3) {
                return i2;
            }
            if (i != 4) {
                if (i != 268435456) {
                    if (i == 536870912) {
                        return i2 * 3;
                    }
                    if (i != 805306368) {
                        throw AnonymousClass6CA.A0N();
                    }
                }
            }
            return i2 * 4;
        }
        return i2 * 2;
    }

    public static int A03(Context context) {
        int i = 0;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                i = 1;
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    int type = activeNetworkInfo.getType();
                    if (type != 0) {
                        if (type == 1) {
                            return 2;
                        }
                        if (type != 4) {
                            i = 5;
                            if (type != 5) {
                                if (type != 6) {
                                    if (type != 9) {
                                        return 8;
                                    }
                                    return 7;
                                }
                            }
                        }
                    }
                    switch (activeNetworkInfo.getSubtype()) {
                        case 1:
                        case 2:
                            return 3;
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 14:
                        case 15:
                        case 17:
                            return 4;
                        case 13:
                            return 5;
                        case 18:
                            return 2;
                        case 20:
                            if (A01 >= 29) {
                                return 9;
                            }
                            return 0;
                        default:
                            return 6;
                    }
                }
            } catch (SecurityException unused) {
            }
            return i;
        }
        return i;
    }

    public static boolean A0C(int i) {
        if (i == 3 || i == 2 || i == 268435456 || i == 536870912 || i == 805306368 || i == 4) {
            return true;
        }
        return false;
    }

    static {
        int i;
        String str = Build.VERSION.CODENAME;
        if ("S".equals(str)) {
            i = 31;
        } else if ("R".equals(str)) {
            i = 30;
        } else {
            i = Build.VERSION.SDK_INT;
        }
        A01 = i;
        String str2 = Build.DEVICE;
        A02 = str2;
        String str3 = Build.MANUFACTURER;
        A04 = str3;
        String str4 = Build.MODEL;
        A05 = str4;
        StringBuilder A0l = AnonymousClass000.A0l(str2);
        A0l.append(", ");
        AnonymousClass001.A1K(str4, ", ", str3, A0l);
        A03 = AnonymousClass000.A0Y(", ", A0l, i);
        String str5 = "zh-hak";
        A0E = new String[]{"i-lux", "lb", "i-hak", str5, "i-navajo", "nv", "no-bok", "no-nob", "no-nyn", "no-nno", "zh-guoyu", "zh-cmn", "zh-hakka", str5, "zh-min-nan", "zh-nan", "zh-xiang", "zh-hsn"};
    }

    public static int A01(int i) {
        if (i == 8) {
            return 3;
        }
        if (i == 16) {
            return 2;
        }
        if (i == 24) {
            return 536870912;
        }
        if (i != 32) {
            return 0;
        }
        return 805306368;
    }

    public static long A05(long j, long j2, long j3) {
        if (j3 >= j2) {
            if (j3 % j2 == 0) {
                return j / (j3 / j2);
            }
        } else if (j2 % j3 == 0) {
            return j * (j2 / j3);
        }
        return (long) (((double) j) * (((double) j2) / ((double) j3)));
    }

    public static String A08(String str) {
        if (str == null) {
            return null;
        }
        String replace = str.replace('_', '-');
        if (!replace.isEmpty() && !"und".equals(replace)) {
            str = replace;
        }
        String A0z = AnonymousClass0x9.A0z(str);
        String str2 = A0z.split("-", 2)[0];
        HashMap hashMap = A00;
        if (hashMap == null) {
            String[] strArr = A0D;
            int length = strArr.length;
            hashMap = new HashMap(r9 + length);
            for (String str3 : Locale.getISOLanguages()) {
                try {
                    String iSO3Language = new Locale(str3).getISO3Language();
                    if (!TextUtils.isEmpty(iSO3Language)) {
                        hashMap.put(iSO3Language, str3);
                    }
                } catch (MissingResourceException unused) {
                }
            }
            for (int i = 0; i < length; i += 2) {
                hashMap.put(strArr[i], strArr[i + 1]);
            }
            A00 = hashMap;
        }
        String A0e = C18320x8.A0e(str2, hashMap);
        if (A0e != null) {
            A0z = AnonymousClass000.A0X(A0z.substring(str2.length()), AnonymousClass000.A0l(A0e));
            str2 = A0e;
        }
        if (!"no".equals(str2) && !"i".equals(str2) && !"zh".equals(str2)) {
            return A0z;
        }
        int i2 = 0;
        while (true) {
            String[] strArr2 = A0E;
            if (i2 >= strArr2.length) {
                return A0z;
            }
            String str4 = strArr2[i2];
            if (A0z.startsWith(str4)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(strArr2[i2 + 1]);
                return AnonymousClass000.A0X(A0z.substring(str4.length()), A0o);
            }
            i2 += 2;
        }
    }

    public static boolean A0D(Object obj, Object obj2) {
        if (obj == null) {
            return AnonymousClass000.A1X(obj2);
        }
        return obj.equals(obj2);
    }

    public static int A04(long[] jArr, long j, boolean z) {
        int i;
        int binarySearch = Arrays.binarySearch(jArr, j);
        if (binarySearch < 0) {
            i = -(binarySearch + 2);
        } else {
            do {
                binarySearch--;
                if (binarySearch < 0 || jArr[binarySearch] != j) {
                    i = binarySearch + 1;
                }
                binarySearch--;
                break;
            } while (jArr[binarySearch] != j);
            i = binarySearch + 1;
        }
        if (z) {
            return Math.max(0, i);
        }
        return i;
    }

    public static C166527yp A06(int i, int i2, int i3) {
        C157057he A002 = C157057he.A00();
        A002.A0R = "audio/raw";
        A002.A04 = i2;
        A002.A0D = i3;
        A002.A09 = i;
        return C166527yp.A00(A002);
    }

    public static String A07(Context context, String str) {
        String str2;
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "?";
        }
        StringBuilder A0l = AnonymousClass000.A0l(str);
        A0l.append("/");
        A0l.append(str2);
        A0l.append(" (Linux;Android ");
        A0l.append(Build.VERSION.RELEASE);
        A0l.append(") ");
        return AnonymousClass000.A0X("ExoPlayerLib/2.13.3", A0l);
    }

    public static void A09(Point point, Display display) {
        Display.Mode mode = display.getMode();
        point.x = mode.getPhysicalWidth();
        point.y = mode.getPhysicalHeight();
    }

    public static void A0A(Handler handler, Runnable runnable) {
        if (!handler.getLooper().getThread().isAlive()) {
            return;
        }
        if (handler.getLooper() == Looper.myLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    public static void A0B(long[] jArr, long j) {
        int i = 0;
        if (j >= SearchActionVerificationClientService.MS_TO_NS) {
            if (j % SearchActionVerificationClientService.MS_TO_NS == 0) {
                long j2 = j / SearchActionVerificationClientService.MS_TO_NS;
                while (i < jArr.length) {
                    jArr[i] = jArr[i] / j2;
                    i++;
                }
                return;
            }
        } else if (SearchActionVerificationClientService.MS_TO_NS % j == 0) {
            long j3 = SearchActionVerificationClientService.MS_TO_NS / j;
            while (i < jArr.length) {
                jArr[i] = jArr[i] * j3;
                i++;
            }
            return;
        }
        double d = ((double) SearchActionVerificationClientService.MS_TO_NS) / ((double) j);
        while (i < jArr.length) {
            jArr[i] = (long) (((double) jArr[i]) * d);
            i++;
        }
    }

    public static String[] A0E(Configuration configuration) {
        return AnonymousClass6CA.A0j(configuration.getLocales().toLanguageTags(), ",");
    }
}
