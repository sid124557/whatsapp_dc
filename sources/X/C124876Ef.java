package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.6Ef  reason: invalid class name and case insensitive filesystem */
public class C124876Ef extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(70);
    public int A00;

    public C124876Ef(Parcel parcel) {
        super(parcel);
        this.A00 = AnonymousClass001.A0K(parcel.readValue(getClass().getClassLoader()));
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "MaterialCheckBox.SavedState{", this);
        A0o.append(" CheckedState=");
        int i = this.A00;
        if (i == 1) {
            str = "checked";
        } else if (i != 2) {
            str = "unchecked";
        } else {
            str = "indeterminate";
        }
        A0o.append(str);
        return AnonymousClass000.A0g(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Integer.valueOf(this.A00));
    }

    public C124876Ef(Parcelable parcelable) {
        super(parcelable);
    }
}
