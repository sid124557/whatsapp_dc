package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: X.2XN  reason: invalid class name */
public abstract class AnonymousClass2XN {
    public final String A00;
    public final String A01;

    public void A00(SharedPreferences.Editor editor, Map map) {
        String str;
        if (this instanceof C22061Ej) {
            String A0o = C18310x6.A0o(this.A01, map);
            if (!TextUtils.isEmpty(A0o)) {
                editor.putString(this.A00, A0o);
                return;
            }
            str = this.A00;
        } else if (this instanceof C22071Ek) {
            C22071Ek r5 = (C22071Ek) this;
            String A0o2 = C18310x6.A0o(r5.A01, map);
            if (TextUtils.isEmpty(A0o2)) {
                str = r5.A00;
            } else {
                try {
                    int parseInt = Integer.parseInt(A0o2);
                    Integer num = r5.A02;
                    if (num != null) {
                        parseInt = Math.max(num.intValue(), parseInt);
                    }
                    Integer num2 = r5.A01;
                    if (num2 != null) {
                        parseInt = Math.min(num2.intValue(), parseInt);
                    }
                    editor.putInt(r5.A00, parseInt);
                    return;
                } catch (NumberFormatException e) {
                    StringBuilder A0o3 = AnonymousClass001.A0o();
                    A0o3.append("ServerPropInteger/invalid number format for property; prefKey=");
                    String str2 = r5.A00;
                    A0o3.append(str2);
                    C18260x0.A0v("; value=", A0o2, A0o3, e);
                    editor.remove(str2);
                    return;
                }
            }
        } else {
            boolean z = this instanceof C22041Eh;
            String A0o4 = C18310x6.A0o(this.A01, map);
            boolean isEmpty = TextUtils.isEmpty(A0o4);
            if (z) {
                if (!isEmpty) {
                    try {
                        editor.putFloat(this.A00, Float.parseFloat(A0o4));
                        return;
                    } catch (NumberFormatException e2) {
                        StringBuilder A0o5 = AnonymousClass001.A0o();
                        A0o5.append("ServerPropFloat/invalid number format for property; prefKey=");
                        String str3 = this.A00;
                        A0o5.append(str3);
                        C18260x0.A0v("; value=", A0o4, A0o5, e2);
                        editor.remove(str3);
                        return;
                    }
                }
            } else if (!isEmpty) {
                try {
                    editor.putBoolean(this.A00, AnonymousClass000.A1S(Integer.parseInt(A0o4)));
                    return;
                } catch (NumberFormatException e3) {
                    StringBuilder A0o6 = AnonymousClass001.A0o();
                    A0o6.append("ServerPropBoolean/invalid number format for property; prefKey=");
                    String str4 = this.A00;
                    A0o6.append(str4);
                    C18260x0.A0v("; value=", A0o4, A0o6, e3);
                    editor.remove(str4);
                    return;
                }
            }
            str = this.A00;
        }
        editor.remove(str);
    }

    public AnonymousClass2XN(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
