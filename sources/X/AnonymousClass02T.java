package X;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* renamed from: X.02T  reason: invalid class name */
public class AnonymousClass02T extends View.BaseSavedState {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(15);
    public int A00;

    public AnonymousClass02T(Parcel parcel) {
        super(parcel);
        this.A00 = parcel.readInt();
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1J(A0o, "HorizontalScrollView.SavedState{", this);
        A0o.append(" scrollPosition=");
        A0o.append(this.A00);
        return AnonymousClass000.A0g(A0o);
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A00);
    }

    public AnonymousClass02T(Parcelable parcelable) {
        super(parcelable);
    }
}
