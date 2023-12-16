package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.5bX  reason: invalid class name and case insensitive filesystem */
public class C107575bX {
    public static Spanned A00(Context context, Object[] objArr, int i) {
        String string;
        if (objArr.length == 0) {
            string = context.getString(i);
        } else {
            string = context.getString(i, A0I(objArr));
        }
        return Html.fromHtml(string);
    }

    public static Spanned A01(Context context, Object[] objArr, int i, int i2) {
        String quantityString;
        int length = objArr.length;
        Resources resources = context.getResources();
        if (length == 0) {
            quantityString = resources.getQuantityString(i, i2);
        } else {
            quantityString = resources.getQuantityString(i, i2, A0I(objArr));
        }
        return Html.fromHtml(quantityString);
    }

    public static Spanned A02(String str, Object... objArr) {
        if (objArr.length != 0) {
            str = String.format(str, A0I(objArr));
        }
        return Html.fromHtml(str);
    }

    public static String A0B(String str, int i) {
        int length;
        C626936e.A0B(true);
        if (str == null || (length = str.length()) <= i) {
            return str;
        }
        return str.substring(length - i);
    }

    public static String A0E(byte[] bArr) {
        StringBuilder sb = new StringBuilder(r5 * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b >> 4) & 15, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    public static boolean A0F(CharSequence charSequence) {
        int length;
        if (!(charSequence == null || (length = charSequence.length()) == 0)) {
            for (int i = 0; i < length; i++) {
                char charAt = charSequence.charAt(i);
                if (charAt != 8203 && !Character.isWhitespace(charAt)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static Object[] A0I(Object... objArr) {
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        for (int i = 0; i < copyOf.length; i++) {
            Object obj = copyOf[i];
            if (obj instanceof CharSequence) {
                copyOf[i] = Html.escapeHtml((CharSequence) obj);
            }
        }
        return copyOf;
    }

    public static String A04(Context context, int i) {
        Locale locale = Locale.US;
        Object[] A0L = AnonymousClass002.A0L();
        AnonymousClass000.A1L(A0L, AnonymousClass0Y8.A04(context, i) & 16777215);
        return String.format(locale, "%06X", A0L);
    }

    public static String A06(CharSequence charSequence) {
        String normalize = Normalizer.normalize(charSequence, Normalizer.Form.NFKD);
        Pattern pattern = C1442370o.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            C1442370o.A00 = pattern;
        }
        return pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US).replace(305, 'i');
    }

    public static String A07(CharSequence charSequence) {
        AnonymousClass5NG r0 = C1442270n.A00;
        if (r0 == null) {
            r0 = new AnonymousClass5NG(new String[]{"ı", "i", "ة", "ه", "ـ", "", "ى", "ي", "ٱ", "ا", "ڤ", "ف", "ک", "ك", "ں", "ن", "ھ", "ه", "ۃ", "ۂ", "ی", "ي", "ے", "ي", "ە", "ه", "۰", "٠", "۱", "١", "۲", "٢", "۳", "٣", "۴", "٤", "۵", "٥", "۶", "٦", "۷", "٧", "۸", "٨", "۹", "٩", "ࢻ", "ف", "ࢼ", "ق", "ࢽ", "ن", "‌", ""});
            C1442270n.A00 = r0;
        }
        AnonymousClass5NG r2 = C1442270n.A01;
        if (r2 == null) {
            r2 = new AnonymousClass5NG(new String[]{"ٵ", "ٴا", "ٶ", "ٴو", "ٷ", "ٴۇ", "ٸ", "ٴى", "अॆ", "ऄ", "अा", "आ", "र्इ", "ई", "उु", "ऊ", "एॅ", "ऍ", "एॆ", "ऎ", "एे", "ऐ", "अॉ", "ऑ", "आॅ", "ऑ", "अॊ", "ऒ", "आॆ", "ऒ", "अो", "ओ", "आे", "ओ", "अौ", "औ", "आै", "औ", "अॅ", "ॲ", "अऺ", "ॳ", "अऻ", "ॴ", "आऺ", "ॴ", "अॏ", "ॵ", "अॖ", "ॶ", "अॗ", "ॷ", "অা", "আ", "ঋৃ", "ৠ", "ঌৢ", "ৡ", "ਅਾ", "ਆ", "ੲਿ", "ਇ", "ੲੀ", "ਈ", "ੳੁ", "ਉ", "ੳੂ", "ਊ", "ੲੇ", "ਏ", "ਅੈ", "ਐ", "ੳੋ", "ਓ", "ਅੌ", "ਔ", "અા", "આ", "અૅ", "ઍ", "અે", "એ", "અૈ", "ઐ", "અૉ", "ઑ", "અો", "ઓ", "અાૅ", "ઓ", "અૌ", "ઔ", "અાૈ", "ઔ", "ૅા", "ૉ", "ଅା", "ଆ", "ଏୗ", "ଐ", "ଓୗ", "ଔ", "ஸ்ரீ", "ஶ்ரீ", "ఒౕ", "ఓ", "ఒౌ", "ఔ", "ిౕ", "ీ", "ెౕ", "ే", "ొౕ", "ో", "ಉಾ", "ಊ", "ಒೌ", "ಔ", "ಋಾ", "ೠ", "ഇൗ", "ഈ", "ഉൗ", "ഊ", "എെ", "ഐ", "ഒാ", "ഓ", "ഒൗ", "ഔ", "ണ്‍", "ൺ", "ന്‍", "ൻ", "ര്‍", "ർ", "ല്‍", "ൽ", "ള്‍", "ൾ", "අා", "ආ", "අැ", "ඇ", "අෑ", "ඈ", "උෟ", "ඌ", "ඍෘ", "ඎ", "ඏෟ", "ඐ", "එ්", "ඒ", "එෙ", "ඓ", "ඔෟ", "ඖ"});
            C1442270n.A01 = r2;
        }
        String normalize = Normalizer.normalize(r2.A00(charSequence), Normalizer.Form.NFKD);
        Pattern pattern = C1442370o.A00;
        if (pattern == null) {
            pattern = Pattern.compile("\\p{Mn}+");
            C1442370o.A00 = pattern;
        }
        return r0.A00(pattern.matcher(normalize).replaceAll("").toLowerCase(Locale.US)).toString();
    }

    public static String A0A(String str) {
        return str.replace('+', '-').replace('/', '_');
    }

    public static String A0C(String str, int i) {
        if (str == null || str.codePointCount(0, str.length()) <= i) {
            return str;
        }
        return str.substring(0, str.offsetByCodePoints(0, i));
    }

    public static String A0D(String str, int i) {
        if (str == null) {
            return "";
        }
        String A0C = A0C(str, i);
        if (str != A0C) {
            return AnonymousClass000.A0X("…", AnonymousClass000.A0l(A0C));
        }
        return str;
    }

    public static CharSequence A03(CharSequence charSequence) {
        int i;
        if (!TextUtils.isEmpty(charSequence) && (i = Build.VERSION.SDK_INT) >= 26 && i <= 29) {
            Pattern pattern = C1442370o.A01;
            if (pattern == null) {
                pattern = Pattern.compile("[\\u1680\\u2000-\\u200a\\u205f\\u3000]+\\u0020");
                C1442370o.A01 = pattern;
            }
            Matcher matcher = pattern.matcher(charSequence);
            if (matcher.find()) {
                SpannableStringBuilder A00 = C18330xA.A00(charSequence);
                int i2 = 0;
                int i3 = 0;
                while (matcher.find(i2)) {
                    i2 = matcher.end();
                    int start = matcher.start();
                    A00.replace(start - i3, i2 - i3, " ");
                    i3 += (i2 - start) - 1;
                }
                return A00;
            }
        }
        return charSequence;
    }

    public static String A05(C620733j r3, String str, String str2) {
        String str3;
        String A07 = r3.A07();
        if ("ar".equals(A07) || "fa".equals(A07) || "ur".equals(A07)) {
            str3 = " — ";
        } else {
            str3 = " • ";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append(r3.A0H(str));
        A0o.append(str3);
        return AnonymousClass000.A0X(r3.A0H(str2), A0o);
    }

    public static String A08(CharSequence charSequence, Iterable iterable) {
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            A0o.append((CharSequence) it.next());
            A0o.append(charSequence);
        }
        if (A0o.length() > 0) {
            return A0o.substring(0, A0o.length() - charSequence.length());
        }
        return "";
    }

    public static String A09(CharSequence charSequence, CharSequence... charSequenceArr) {
        StringBuilder A0o = AnonymousClass001.A0o();
        int i = 0;
        while (true) {
            int length = charSequenceArr.length;
            if (i >= length) {
                return A0o.toString();
            }
            A0o.append(charSequenceArr[i]);
            if (i < length - 1) {
                A0o.append(charSequence);
            }
            i++;
        }
    }

    public static boolean A0G(CharSequence charSequence, CharSequence charSequence2) {
        if ((!TextUtils.isEmpty(charSequence) || !TextUtils.isEmpty(charSequence2)) && !TextUtils.equals(charSequence, charSequence2)) {
            return false;
        }
        return true;
    }

    public static byte[] A0H(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            byte[] bArr = new byte[(length / 2)];
            int i = 0;
            while (i < length) {
                char charAt = str.charAt(i);
                int digit = Character.digit(charAt, 16);
                if (digit != -1) {
                    int i2 = i / 2;
                    byte b = bArr[i2];
                    int i3 = 0;
                    if (i % 2 == 0) {
                        i3 = 4;
                    }
                    bArr[i2] = (byte) ((digit << i3) | b);
                    i++;
                } else {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("invalid character; char=");
                    throw AnonymousClass001.A0c(AnonymousClass001.A0j(A0o, charAt));
                }
            }
            return bArr;
        }
        throw AnonymousClass000.A0G("even length input string required; length=", AnonymousClass001.A0o(), length);
    }
}
