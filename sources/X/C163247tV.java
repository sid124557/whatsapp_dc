package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.HashSet;

/* renamed from: X.7tV  reason: invalid class name and case insensitive filesystem */
public final class C163247tV implements Parcelable.Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new C128106Uu[i];
    }

    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int A02 = C162447s6.A02(parcel);
        HashSet A0K = AnonymousClass002.A0K();
        C128116Uv r4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        int i = 0;
        while (parcel.dataPosition() < A02) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            int i2 = 1;
            if (c != 1) {
                i2 = 2;
                if (c != 2) {
                    i2 = 3;
                    if (c != 3) {
                        i2 = 4;
                        if (c != 4) {
                            i2 = 5;
                            if (c != 5) {
                                C162447s6.A0I(parcel, readInt);
                            } else {
                                str3 = C162447s6.A0D(parcel, readInt);
                            }
                        } else {
                            str2 = C162447s6.A0D(parcel, readInt);
                        }
                    } else {
                        str = C162447s6.A0D(parcel, readInt);
                    }
                } else {
                    r4 = (C128116Uv) C162447s6.A0A(parcel, C128116Uv.CREATOR, readInt);
                }
            } else {
                i = C162447s6.A03(parcel, readInt);
            }
            C18270x1.A1K(A0K, i2);
        }
        if (parcel.dataPosition() == A02) {
            return new C128106Uu(r4, str, str2, str3, A0K, i);
        }
        throw new AnonymousClass8RI(parcel, AnonymousClass000.A0Y("Overread allowed size end=", AnonymousClass001.A0o(), A02));
    }
}
