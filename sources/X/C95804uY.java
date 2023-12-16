package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.4uY  reason: invalid class name and case insensitive filesystem */
public final class C95804uY extends C95814uZ implements Parcelable {
    public static final AnonymousClass34X A02 = AnonymousClass34X.A01();
    public static final C106415Yx A03 = new C106415Yx();
    public static final Parcelable.Creator CREATOR = new C165477x8();
    public boolean A00;
    public final String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95804uY(String str) {
        super(str);
        C162457s7.A0J(str, 1);
        this.A01 = str;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeString(this.A01);
    }

    public static final boolean A00(C95814uZ r1) {
        C95804uY r12;
        if (r1 instanceof C95804uY) {
            r12 = (C95804uY) r1;
        } else {
            r12 = null;
        }
        if (r12 != null) {
            return C18310x6.A1W(r12.A00 ? 1 : 0);
        }
        return false;
    }

    public int describeContents() {
        return 0;
    }

    public String getServer() {
        return "newsletter";
    }

    public int getType() {
        return 21;
    }
}
