package X;

import android.content.LocusId;
import android.os.Build;
import android.text.TextUtils;

/* renamed from: X.0UC  reason: invalid class name */
public final class AnonymousClass0UC {
    public final LocusId A00;
    public final String A01;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnonymousClass0UC.class != obj.getClass()) {
            return false;
        }
        String str = this.A01;
        String str2 = ((AnonymousClass0UC) obj).A01;
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    public static AnonymousClass0UC A00(LocusId locusId) {
        C04890Rb.A01(locusId, "locusId cannot be null");
        String A012 = AnonymousClass0RS.A01(locusId);
        if (!TextUtils.isEmpty(A012)) {
            return new AnonymousClass0UC(A012);
        }
        throw AnonymousClass001.A0c(String.valueOf("id cannot be empty"));
    }

    public LocusId A01() {
        return this.A00;
    }

    public int hashCode() {
        int hashCode;
        String str = this.A01;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return 31 + hashCode;
    }

    public AnonymousClass0UC(String str) {
        LocusId locusId;
        if (!TextUtils.isEmpty(str)) {
            this.A01 = str;
            if (Build.VERSION.SDK_INT >= 29) {
                locusId = AnonymousClass0RS.A00(str);
            } else {
                locusId = null;
            }
            this.A00 = locusId;
            return;
        }
        throw AnonymousClass001.A0c(String.valueOf("id cannot be empty"));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocusIdCompat[");
        int length = this.A01.length();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append(length);
        return AnonymousClass000.A0W(AnonymousClass000.A0X("_chars", A0o2), A0o);
    }
}
