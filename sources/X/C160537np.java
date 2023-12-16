package X;

import android.content.ComponentName;
import android.net.Uri;

/* renamed from: X.7np  reason: invalid class name and case insensitive filesystem */
public final class C160537np {
    public static final Uri A04 = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();
    public final ComponentName A00;
    public final String A01;
    public final String A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C160537np) {
                C160537np r5 = (C160537np) obj;
                if (!AnonymousClass72K.A00(this.A01, r5.A01) || !AnonymousClass72K.A00(this.A02, r5.A02) || !AnonymousClass72K.A00(this.A00, r5.A00) || this.A03 != r5.A03) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A01;
        objArr[1] = this.A02;
        objArr[2] = this.A00;
        AnonymousClass000.A1O(objArr, 4225);
        return C18310x6.A08(Boolean.valueOf(this.A03), objArr, 4);
    }

    public final String toString() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        ComponentName componentName = this.A00;
        C162177rO.A02(componentName);
        return componentName.flattenToString();
    }

    public C160537np(String str, boolean z, String str2) {
        C162177rO.A05(str);
        this.A01 = str;
        C162177rO.A05(str2);
        this.A02 = str2;
        this.A00 = null;
        this.A03 = z;
    }

    public C160537np(ComponentName componentName) {
        this.A01 = null;
        this.A02 = null;
        C162177rO.A02(componentName);
        this.A00 = componentName;
        this.A03 = false;
    }
}
