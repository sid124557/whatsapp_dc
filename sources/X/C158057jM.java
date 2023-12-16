package X;

import java.util.Collections;
import java.util.List;

/* renamed from: X.7jM  reason: invalid class name and case insensitive filesystem */
public class C158057jM {
    public final String A00;
    public final List A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C158057jM r5 = (C158057jM) obj;
            if (this.A02 != r5.A02 || !this.A01.equals(r5.A01)) {
                return false;
            }
            String str = this.A00;
            String str2 = r5.A00;
            return str != null ? str.equals(str2) : str2 == null;
        }
    }

    public C158057jM(String str, List list, boolean z) {
        this.A01 = AnonymousClass002.A0J(list);
        this.A00 = str;
        this.A02 = z;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CaptionsState{availableTextLanguages=");
        A0o.append(this.A01);
        A0o.append(", selectedTextLanguage='");
        A0o.append(this.A00);
        A0o.append('\'');
        A0o.append(", isEnabled=");
        A0o.append(this.A02);
        return AnonymousClass000.A0d(A0o);
    }

    public C158057jM() {
        this((String) null, Collections.emptyList(), false);
    }
}
