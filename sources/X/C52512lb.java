package X;

import android.os.Build;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.whatsapp.util.Log;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

/* renamed from: X.2lb  reason: invalid class name and case insensitive filesystem */
public class C52512lb {
    public InputMethodSubtype A00;
    public Set A01;
    public final C620633i A02;

    public Locale A00() {
        InputMethodManager A0Q = this.A02.A0Q();
        C626936e.A06(A0Q);
        C626936e.A06(A0Q);
        InputMethodSubtype currentInputMethodSubtype = A0Q.getCurrentInputMethodSubtype();
        if (currentInputMethodSubtype == null || !currentInputMethodSubtype.getMode().equals("keyboard")) {
            return null;
        }
        InputMethodSubtype inputMethodSubtype = this.A00;
        if (!(inputMethodSubtype == null || inputMethodSubtype == currentInputMethodSubtype || inputMethodSubtype.equals(currentInputMethodSubtype))) {
            Log.d("KeyboardLanguageExtractor/input method changed, recreate subtype set.");
            A02();
        }
        this.A00 = currentInputMethodSubtype;
        if (this.A01 == null) {
            A02();
        }
        Set set = this.A01;
        if (set == null || !set.contains(currentInputMethodSubtype)) {
            return null;
        }
        String locale = currentInputMethodSubtype.getLocale();
        if (TextUtils.isEmpty(locale)) {
            return null;
        }
        if (Pattern.matches("[a-z]{2}_[A-Z]{2}", locale)) {
            return Locale.forLanguageTag(locale.replace("_", "-"));
        }
        if (Pattern.matches("[a-z]{2}", locale)) {
            return new Locale(locale);
        }
        C18260x0.A0r("keyboardLanguageExtractor/error/cannot parse locale ", locale, AnonymousClass001.A0o());
        return null;
    }

    public TreeSet A01() {
        String str;
        int length;
        TreeSet treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
        InputMethodManager A0Q = this.A02.A0Q();
        C626936e.A06(A0Q);
        for (InputMethodInfo enabledInputMethodSubtypeList : A0Q.getEnabledInputMethodList()) {
            for (InputMethodSubtype next : A0Q.getEnabledInputMethodSubtypeList(enabledInputMethodSubtypeList, true)) {
                if (next.getMode().equals("keyboard")) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        str = next.getLanguageTag();
                    } else {
                        str = "";
                    }
                    if (str.isEmpty()) {
                        str = new Locale(next.getLocale()).getLanguage();
                    }
                    if (str.isEmpty() || (length = str.length()) < 2) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("KeyboardLanguageExtractor/getTwoLetterLanguageCode/unexpected language result from input method, language: '");
                        A0o.append(str);
                        C18260x0.A1M(A0o, "'");
                    } else if (length <= 2 || (str = AnonymousClass0x7.A0r(str, 2)) != null) {
                        treeSet.add(str);
                    }
                }
            }
        }
        return treeSet;
    }

    public C52512lb(C620633i r1) {
        this.A02 = r1;
    }

    public final void A02() {
        this.A01 = AnonymousClass002.A0K();
        InputMethodManager A0Q = this.A02.A0Q();
        C626936e.A06(A0Q);
        C626936e.A06(A0Q);
        for (InputMethodInfo next : A0Q.getEnabledInputMethodList()) {
            if (next.getId().startsWith("com.google.android.inputmethod")) {
                this.A01.addAll(A0Q.getEnabledInputMethodSubtypeList(next, true));
            }
        }
    }
}
