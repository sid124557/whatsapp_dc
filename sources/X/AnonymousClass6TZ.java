package X;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: X.6TZ  reason: invalid class name */
public class AnonymousClass6TZ extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164367vL();
    public long A00;
    public ParcelFileDescriptor A01;
    public DataHolder A02;
    public String A03;
    public byte[] A04;

    public void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A07 = C1695389r.A07(parcel, this.A03);
        C162417s1.A0A(parcel, this.A02, 3, i, A07);
        C162417s1.A0A(parcel, this.A01, 4, i, A07);
        C162417s1.A08(parcel, 5, this.A00);
        C162417s1.A0E(parcel, this.A04, 6, A07);
        C162417s1.A06(parcel, A002);
        this.A01 = null;
    }

    public AnonymousClass6TZ(ParcelFileDescriptor parcelFileDescriptor, DataHolder dataHolder, String str, byte[] bArr, long j) {
        this.A03 = str;
        this.A02 = dataHolder;
        this.A01 = parcelFileDescriptor;
        this.A00 = j;
        this.A04 = bArr;
    }

    public AnonymousClass6TZ() {
        this((ParcelFileDescriptor) null, (DataHolder) null, (String) null, (byte[]) null, 0);
    }
}
