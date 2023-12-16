package X;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Iterator;

/* renamed from: X.6UM  reason: invalid class name */
public abstract class AnonymousClass6UM extends AnonymousClass7o5 implements SafeParcelable {
    public boolean equals(Object obj) {
        if (obj != null) {
            if (this != obj) {
                if (getClass().isInstance(obj)) {
                    AnonymousClass7o5 r7 = (AnonymousClass7o5) obj;
                    Iterator A0v = AnonymousClass001.A0v(A04());
                    while (A0v.hasNext()) {
                        C127856To r2 = (C127856To) A0v.next();
                        boolean A05 = A05(r2);
                        boolean A052 = r7.A05(r2);
                        if (A05) {
                            if (A052 && AnonymousClass72K.A00(A03(r2), r7.A03(r2))) {
                            }
                        } else if (A052) {
                            return false;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public int hashCode() {
        Iterator A0v = AnonymousClass001.A0v(A04());
        int i = 0;
        while (A0v.hasNext()) {
            C127856To r2 = (C127856To) A0v.next();
            if (A05(r2)) {
                Object A03 = A03(r2);
                C162177rO.A02(A03);
                i = AnonymousClass002.A02(A03, i * 31);
            }
        }
        return i;
    }
}
