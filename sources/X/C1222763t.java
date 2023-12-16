package X;

import java.util.HashSet;

/* renamed from: X.63t  reason: invalid class name and case insensitive filesystem */
public class C1222763t extends AnonymousClass5ZP {
    public static final HashSet A01 = C18280x3.A0h(new String[]{"7BIT", "8BIT", "BASE64", "B"});
    public static final HashSet A02 = C18280x3.A0h(new String[]{"BEGIN", "LOGO", "PHOTO", "LABEL", "FN", "TITLE", "SOUND", "VERSION", "TEL", "EMAIL", "TZ", "GEO", "NOTE", "URL", "BDAY", "ROLE", "REV", "UID", "KEY", "MAILER", "NAME", "PROFILE", "SOURCE", "NICKNAME", "CLASS", "SORT-STRING", "CATEGORIES", "PRODID"});
    public static final HashSet A03 = AnonymousClass002.A0K();
    public String A00;

    public void A05(String str) {
        try {
            super.A05(str);
        } catch (C143696zK unused) {
            String[] split = str.split("=", 2);
            if (split.length == 2) {
                String str2 = split[0];
                String str3 = split[1];
                AnonymousClass5QS r0 = this.A0G;
                if (r0 != null) {
                    r0.A01 = str2;
                    r0.A00(str3);
                    return;
                }
                return;
            }
            throw new C143696zK(AnonymousClass000.A0V("Unknown params value: ", str, AnonymousClass001.A0o()));
        }
    }
}
