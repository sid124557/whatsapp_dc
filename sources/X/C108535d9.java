package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5d9  reason: invalid class name and case insensitive filesystem */
public final class C108535d9 implements Parcelable {
    public static final Parcelable.Creator CREATOR = new C108265ci();
    public final int A00;
    public final String A01;
    public final ArrayList A02;
    public final ArrayList A03;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeInt(this.A00);
        ArrayList arrayList = this.A02;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C108585dE) it.next()).writeToParcel(parcel, i);
            }
        }
        ArrayList arrayList2 = this.A03;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(arrayList2.size());
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            ((C108505d6) it2.next()).writeToParcel(parcel, i);
        }
    }

    public int describeContents() {
        return 0;
    }

    public C108535d9(String str, ArrayList arrayList, ArrayList arrayList2, int i) {
        this.A01 = str;
        this.A00 = i;
        this.A02 = arrayList;
        this.A03 = arrayList2;
    }
}
