package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6et  reason: invalid class name and case insensitive filesystem */
public final class C132216et extends C165837xi {
    public static final Parcelable.Creator CREATOR = new C165147wb();
    public final String A00;
    public final List A01;

    public C132216et(String str, List list) {
        C162457s7.A0J(str, 1);
        this.A00 = str;
        this.A01 = list;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C132216et) {
                C132216et r5 = (C132216et) obj;
                if (!C162457s7.A0P(this.A00, r5.A00) || !C162457s7.A0P(this.A01, r5.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A00);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A01);
        while (A0w.hasNext()) {
            ((C132236ev) A0w.next()).writeToParcel(parcel, i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A01, C18310x6.A09(this.A00));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ThumbnailsVariantType(name=");
        A0o.append(this.A00);
        A0o.append(", options=");
        return C18260x0.A04(this.A01, A0o);
    }
}
