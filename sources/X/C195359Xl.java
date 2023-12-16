package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9Xl  reason: invalid class name and case insensitive filesystem */
public class C195359Xl implements Parcelable, Serializable {
    public static final Parcelable.Creator CREATOR = new C204589pb(3);
    public static final long serialVersionUID = 0;
    public List mIdentifiers;

    public static C129586aY A00(C195359Xl r0) {
        List list = r0.mIdentifiers;
        if (list == null) {
            return null;
        }
        return C129586aY.copyOf((Collection) list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        return C1447372t.A00(A00(this), A00((C195359Xl) obj));
    }

    public String toString() {
        List list = this.mIdentifiers;
        if (list == null || C129586aY.copyOf((Collection) list) == null || A00(this).isEmpty()) {
            return "";
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        Iterator it = A00(this).iterator();
        while (it.hasNext()) {
            A0o.append(AnonymousClass001.A0m(it));
            A0o.append(", ");
        }
        A0o.deleteCharAt(A00(this).size() - 1);
        return A0o.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        C129586aY r0;
        List list;
        List list2 = this.mIdentifiers;
        if (list2 == null || C129586aY.copyOf((Collection) list2) == null || (list = this.mIdentifiers) == null) {
            r0 = null;
        } else {
            r0 = C129586aY.copyOf((Collection) list);
        }
        parcel.writeStringList(r0);
    }

    public C195359Xl(Parcel parcel) {
        this.mIdentifiers = null;
        this.mIdentifiers = (List) parcel.readValue(List.class.getClassLoader());
    }

    public int hashCode() {
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = A00(this);
        return Arrays.hashCode(A0L);
    }

    public int describeContents() {
        return 0;
    }

    public C195359Xl() {
        this.mIdentifiers = null;
        this.mIdentifiers = AnonymousClass001.A0s();
    }
}
