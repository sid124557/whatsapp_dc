package X;

import java.util.List;

/* renamed from: X.2AB  reason: invalid class name */
public class AnonymousClass2AB {
    public static List A02(CharSequence charSequence, String str) {
        return C175728Zm.A0P(charSequence, new String[]{str}, 0);
    }

    public static boolean A04(CharSequence charSequence, CharSequence charSequence2) {
        return C175728Zm.A0S(charSequence, charSequence2, false);
    }

    public static boolean A05(String str, String str2) {
        return C175738Zn.A0Y(str, str2, false);
    }

    public static final void A03(Appendable appendable, Object obj, AnonymousClass4GQ r3) {
        CharSequence valueOf;
        if (r3 != null) {
            obj = r3.invoke(obj);
        } else if (obj != null && !(obj instanceof CharSequence)) {
            if (obj instanceof Character) {
                appendable.append(((Character) obj).charValue());
                return;
            }
            valueOf = String.valueOf(obj);
            appendable.append(valueOf);
        }
        valueOf = (CharSequence) obj;
        appendable.append(valueOf);
    }

    public static String A00(CharSequence charSequence) {
        return C175728Zm.A0I(charSequence).toString();
    }

    public static List A01(CharSequence charSequence, String str) {
        return C175728Zm.A0P(charSequence, new String[]{str}, 0);
    }
}
