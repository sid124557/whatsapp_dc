package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.0Zd  reason: invalid class name and case insensitive filesystem */
public final class C06770Zd implements Parcelable {
    public static final Parcelable.Creator CREATOR = C17960wW.A00(19);
    public int A00;
    public String A01 = null;
    public ArrayList A02;
    public ArrayList A03;
    public ArrayList A04 = AnonymousClass001.A0s();
    public ArrayList A05 = AnonymousClass001.A0s();
    public ArrayList A06;
    public C06780Ze[] A07;

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeStringList(this.A02);
        parcel.writeStringList(this.A03);
        parcel.writeTypedArray(this.A07, i);
        parcel.writeInt(this.A00);
        parcel.writeString(this.A01);
        parcel.writeStringList(this.A04);
        parcel.writeTypedList(this.A05);
        parcel.writeTypedList(this.A06);
    }

    public C06770Zd(Parcel parcel) {
        this.A02 = parcel.createStringArrayList();
        this.A03 = parcel.createStringArrayList();
        this.A07 = (C06780Ze[]) parcel.createTypedArray(C06780Ze.CREATOR);
        this.A00 = parcel.readInt();
        this.A01 = parcel.readString();
        this.A04 = parcel.createStringArrayList();
        this.A05 = parcel.createTypedArrayList(AnonymousClass0ZP.CREATOR);
        this.A06 = parcel.createTypedArrayList(C06740Za.CREATOR);
    }

    public C06770Zd() {
    }
}
