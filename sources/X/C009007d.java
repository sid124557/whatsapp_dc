package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07d  reason: invalid class name and case insensitive filesystem */
public class C009007d extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C18240wy(0);
    public boolean A00;

    public C009007d(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = AnonymousClass001.A1Z(parcel.readValue((ClassLoader) null));
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "SearchView.SavedState{", this);
        A0o.append(" isIconified=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.A00));
    }

    public C009007d(Parcelable parcelable) {
        super(parcelable);
    }
}
