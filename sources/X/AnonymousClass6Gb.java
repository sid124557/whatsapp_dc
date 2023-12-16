package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: X.6Gb  reason: invalid class name */
public class AnonymousClass6Gb extends C06830Zj {
    public static final Parcelable.Creator CREATOR = new C1897092i(8);
    public CharSequence A00;
    public boolean A01;

    public AnonymousClass6Gb(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.A00 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A01 = AnonymousClass001.A1T(parcel.readInt());
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "TextInputLayout.SavedState{", this);
        A0o.append(" error=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.A00, parcel, i);
        parcel.writeInt(this.A01 ? 1 : 0);
    }

    public AnonymousClass6Gb(Parcelable parcelable) {
        super(parcelable);
    }
}
