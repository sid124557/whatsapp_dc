package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.38d  reason: invalid class name and case insensitive filesystem */
public final class C631538d implements Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass38I();
    public final List A00;

    public boolean equals(Object obj) {
        return this == obj || ((obj instanceof C631538d) && C162457s7.A0P(this.A00, ((C631538d) obj).A00));
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        List list = this.A00;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        Iterator A0w = AnonymousClass0x7.A0w(parcel, list);
        while (A0w.hasNext()) {
            ((C632138j) A0w.next()).writeToParcel(parcel, i);
        }
    }

    public int hashCode() {
        return AnonymousClass000.A07(this.A00);
    }

    public C631538d(List list) {
        this.A00 = list;
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AvatarGetProfilePhotoPosesEntity(poses=");
        return C18260x0.A04(this.A00, A0o);
    }
}
