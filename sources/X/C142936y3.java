package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

/* renamed from: X.6y3  reason: invalid class name and case insensitive filesystem */
public enum C142936y3 implements Parcelable {
    GREEN(1),
    YELLOW(2),
    RED(3);
    
    public static final SparseArray A00 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final int mValue;

    /* access modifiers changed from: public */
    static {
        int i;
        A00 = AnonymousClass6CA.A0I();
        for (C142936y3 r2 : values()) {
            A00.put(r2.mValue, r2);
        }
        CREATOR = AnonymousClass91V.A00(29);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.mValue);
    }

    /* access modifiers changed from: public */
    C142936y3(int i) {
        this.mValue = i;
    }
}
