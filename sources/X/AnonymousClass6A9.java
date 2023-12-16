package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* renamed from: X.6A9  reason: invalid class name */
public class AnonymousClass6A9 implements Parcelable.Creator {
    public final int A00;

    public AnonymousClass6A9(int i) {
        this.A00 = i;
    }

    public /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        switch (this.A00) {
            case 0:
                C108645dK r1 = new C108645dK(parcel.readString());
                r1.A04 = parcel.readString();
                r1.A0B = parcel.readString();
                r1.A02 = parcel.readString();
                r1.A0A = parcel.readString();
                r1.A03 = parcel.readString();
                r1.A05 = parcel.readString();
                r1.A06 = parcel.readString();
                r1.A07 = parcel.readString();
                r1.A00 = parcel.readFloat();
                r1.A01 = parcel.readFloat();
                ArrayList A0s = AnonymousClass001.A0s();
                r1.A0C = A0s;
                parcel.readStringList(A0s);
                r1.A09 = parcel.readString();
                return r1;
            case 1:
                int A04 = C18310x6.A04(parcel);
                C626936e.A06(Integer.valueOf(A04));
                double readDouble = parcel.readDouble();
                C626936e.A06(Double.valueOf(readDouble));
                double readDouble2 = parcel.readDouble();
                C626936e.A06(Double.valueOf(readDouble2));
                String readString = parcel.readString();
                C626936e.A06(readString);
                C162457s7.A0D(readString);
                return new C108765dW(readString, readDouble, readDouble2, A04);
            default:
                return new AnonymousClass3ZS(parcel);
        }
    }

    public /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new C108645dK[i];
            case 1:
                return new C108765dW[i];
            default:
                return new AnonymousClass3ZS[i];
        }
    }
}
