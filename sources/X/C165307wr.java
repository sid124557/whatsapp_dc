package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7wr  reason: invalid class name and case insensitive filesystem */
public final class C165307wr implements Parcelable.Creator {
    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        boolean z = false;
        C162457s7.A0J(parcel, 0);
        String A0l = C18310x6.A0l(parcel);
        C162457s7.A0D(A0l);
        String A0l2 = C18310x6.A0l(parcel);
        C162457s7.A0D(A0l2);
        String A0l3 = C18310x6.A0l(parcel);
        C162457s7.A0D(A0l3);
        byte readByte = parcel.readByte();
        Byte valueOf = Byte.valueOf(readByte);
        C626936e.A06(valueOf);
        if (valueOf != null && readByte == 0) {
            z = true;
        }
        String A0l4 = C18310x6.A0l(parcel);
        C162457s7.A0D(A0l4);
        return new C108835dd(A0l, A0l2, A0l3, A0l4, !z);
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new C108835dd[i];
    }
}
