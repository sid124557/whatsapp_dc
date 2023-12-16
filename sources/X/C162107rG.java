package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.7rG  reason: invalid class name and case insensitive filesystem */
public final class C162107rG {
    public static final ArrayList A00 = AnonymousClass001.A0s();
    public static final Pattern A01 = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static AnonymousClass7GG A01(String str) {
        int i;
        Matcher matcher = A01.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String A0f = AnonymousClass6C8.A0f(matcher, 1);
        String group = matcher.group(2);
        try {
            int parseInt = Integer.parseInt(A0f, 16);
            if (group != null) {
                i = Integer.parseInt(group);
            } else {
                i = 0;
            }
            return new AnonymousClass7GG(parseInt, i);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static String A02(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static boolean A03(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = AnonymousClass0x7.A0r(str, indexOf);
        }
        return "audio".equals(str2);
    }

    public static boolean A04(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = AnonymousClass0x7.A0r(str, indexOf);
        }
        if ("text".equals(str2) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return true;
        }
        return false;
    }

    public static boolean A05(String str) {
        int indexOf;
        String str2 = null;
        if (!(str == null || (indexOf = str.indexOf(47)) == -1)) {
            str2 = AnonymousClass0x7.A0r(str, indexOf);
        }
        return "video".equals(str2);
    }

    public static int A00(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (A03(str)) {
            return 1;
        }
        if (A05(str)) {
            return 2;
        }
        if (A04(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = A00;
        if (0 >= arrayList.size()) {
            return -1;
        }
        arrayList.get(0);
        throw AnonymousClass001.A0g("mimeType");
    }
}
