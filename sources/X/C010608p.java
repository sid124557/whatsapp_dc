package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.08p  reason: invalid class name and case insensitive filesystem */
public class C010608p extends AnonymousClass02J {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(23);
    public Set A00;

    public C010608p(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A00 = AnonymousClass002.A0K();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A00, strArr);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00.size());
        Set set = this.A00;
        parcel.writeStringArray((String[]) set.toArray(new String[set.size()]));
    }

    public C010608p(Parcelable parcelable) {
        super(parcelable);
    }
}
