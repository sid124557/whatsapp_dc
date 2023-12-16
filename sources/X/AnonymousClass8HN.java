package X;

import android.os.Parcel;

/* renamed from: X.8HN  reason: invalid class name */
public class AnonymousClass8HN implements C182518oY {
    public String AxA(String str, Object obj) {
        throw AnonymousClass001.A0g("get");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        throw AnonymousClass001.A0g("equals");
    }

    public AnonymousClass8HN(Parcel parcel) {
        Object readValue = parcel.readValue(Class.class.getClassLoader());
        C626936e.A06(readValue);
        parcel.readParcelable(((Class) readValue).getClassLoader());
        C626936e.A06((Object) null);
    }

    public int hashCode() {
        return C18310x6.A08((Object) null, AnonymousClass002.A0L(), 0);
    }
}
