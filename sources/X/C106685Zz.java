package X;

import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.URLSpan;
import android.util.Pair;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5Zz  reason: invalid class name and case insensitive filesystem */
public class C106685Zz {
    public final AnonymousClass1VX A00;

    public static String A01(String str) {
        StringBuilder A0o;
        String str2 = str;
        String[] strArr = C100885Cq.A03;
        int length = strArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                A0o = AnonymousClass001.A0o();
                A0o.append("https://");
                A0o.append(str);
                break;
            }
            String str3 = strArr[i];
            if (!A02(str, str3)) {
                i++;
            } else if (str3.equals("https") && str2.regionMatches(false, 0, str3, 0, str3.length())) {
                return str2;
            } else {
                A0o = AnonymousClass000.A0l("https");
                A0o.append(C18320x8.A0f(str3, str2));
            }
        }
        return A0o.toString();
    }

    public static boolean A02(String str, String str2) {
        int length = str2.length();
        String str3 = str;
        if (!str3.regionMatches(true, 0, str2, 0, length) || !str3.regionMatches(false, length, "://", 0, 3)) {
            return false;
        }
        return true;
    }

    public String A03(String str) {
        String str2;
        ArrayList A05 = A05(str, true);
        if (A05 == null || (str2 = (String) AnonymousClass0x9.A0t(A05)) == null) {
            return null;
        }
        return A01(str2);
    }

    public ArrayList A04(String str) {
        ArrayList A05 = A05(str, false);
        if (A05 == null) {
            return null;
        }
        ArrayList A0I = AnonymousClass002.A0I(A05.size());
        Iterator it = A05.iterator();
        while (it.hasNext()) {
            C86614Ku.A1T(A01(AnonymousClass001.A0m(it)), A0I);
        }
        return A0I;
    }

    public static Pair A00(CharSequence charSequence, int i, int i2) {
        if (i != 0 && charSequence.charAt(i - 1) == '@') {
            return null;
        }
        if (charSequence.length() <= i2 || charSequence.charAt(i2) != '/') {
            while (".,!?".indexOf(charSequence.charAt(i2 - 1)) != -1) {
                i2--;
            }
        } else {
            i2++;
        }
        return C106335Yo.A00(C86604Kt.A0C(i, i2), C106335Yo.A01, charSequence);
    }

    public void A06(Spannable spannable) {
        CharSequence charSequence;
        Pair A002;
        Pattern pattern = C100885Cq.A00;
        if (spannable.length() > 4096) {
            charSequence = spannable.subSequence(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
        } else {
            charSequence = spannable;
        }
        Matcher matcher = pattern.matcher(charSequence);
        while (matcher.find()) {
            String group = matcher.group(5);
            String group2 = matcher.group(6);
            if ((TextUtils.isEmpty(group) || TextUtils.isEmpty(group2) || C18280x3.A1X(group2, C100885Cq.A02)) && (A002 = A00(spannable, matcher.start(), matcher.end())) != null) {
                String A01 = A01(spannable.subSequence(C18280x3.A03(A002), C18290x4.A03(A002)).toString());
                spannable.setSpan(new URLSpan(A01), C18280x3.A03(A002), C18290x4.A03(A002), 33);
            }
        }
    }

    public C106685Zz(AnonymousClass1VX r1) {
        this.A00 = r1;
    }

    public ArrayList A05(String str, boolean z) {
        Pattern pattern;
        String str2;
        ArrayList arrayList = null;
        if (!TextUtils.isEmpty(str)) {
            boolean A0X = this.A00.A0X(6517);
            if (A0X) {
                pattern = C100885Cq.A00;
            } else {
                pattern = C100885Cq.A01;
            }
            if (str.length() > 4096) {
                str2 = str.substring(0, ZipDecompressor.UNZIP_BUFFER_SIZE);
            } else {
                str2 = str;
            }
            Matcher matcher = pattern.matcher(str2);
            while (matcher.find()) {
                Pair A002 = A00(str, matcher.start(), matcher.end());
                if (A002 != null) {
                    String substring = str.substring(C18280x3.A03(A002), C18290x4.A03(A002));
                    if (!A0X) {
                        String[] strArr = C100885Cq.A03;
                        int length = strArr.length;
                        int i = 0;
                        while (true) {
                            if (i < length) {
                                if (A02(substring, strArr[i])) {
                                    break;
                                }
                                i++;
                            } else {
                                continue;
                                break;
                            }
                        }
                    }
                    if (arrayList == null) {
                        arrayList = C18300x5.A0s(substring);
                        if (z) {
                            return arrayList;
                        }
                    } else {
                        C86614Ku.A1T(substring, arrayList);
                    }
                }
            }
        }
        return arrayList;
    }
}
