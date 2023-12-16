package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38e  reason: invalid class name and case insensitive filesystem */
public final class C631638e implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38N();
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C631638e) && C162457s7.A0P(this.A00, ((C631638e) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, this.A00);
        while (A0w.hasNext()) {
            parcel.writeParcelable((Parcelable) A0w.next(), i);
        }
    }

    public int hashCode() {
        return this.A00.hashCode();
    }

    public C631638e(List list) {
        this.A00 = list;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("CarouselContent(cards=");
        return C18260x0.A04(this.A00, A0o);
    }
}
