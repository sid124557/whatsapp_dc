package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.07e  reason: invalid class name and case insensitive filesystem */
public class C009107e extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C18240wy(6);
    public int A00;
    public Parcelable A01;
    public ClassLoader A02;

    public C009107e(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
        this.A00 = parcel.readInt();
        this.A01 = parcel.readParcelable(classLoader);
        this.A02 = classLoader;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "FragmentPager.SavedState{", this);
        A0o.append(" position=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A01, i);
    }

    public C009107e(Parcelable parcelable) {
        super(parcelable);
    }
}
