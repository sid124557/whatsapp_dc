package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* renamed from: X.7yb  reason: invalid class name and case insensitive filesystem */
public final class C166387yb implements Parcelable {
    public static final C166387yb A03 = new C166387yb(new C166377ya[0]);
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(64);
    public int A00;
    public final int A01;
    public final C166377ya[] A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || C166387yb.class != obj.getClass()) {
                return false;
            }
            C166387yb r5 = (C166387yb) obj;
            if (this.A01 != r5.A01 || !Arrays.equals(this.A02, r5.A02)) {
                return false;
            }
        }
        return true;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.A02);
        this.A00 = hashCode;
        return hashCode;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2 = this.A01;
        parcel.writeInt(i2);
        for (int i3 = 0; i3 < i2; i3++) {
            parcel.writeParcelable(this.A02[i3], 0);
        }
    }

    public C166387yb(Parcel parcel) {
        int readInt = parcel.readInt();
        this.A01 = readInt;
        this.A02 = new C166377ya[readInt];
        for (int i = 0; i < this.A01; i++) {
            this.A02[i] = C18280x3.A0C(parcel, C166377ya.class);
        }
    }

    public C166387yb(C166377ya... r2) {
        this.A02 = r2;
        this.A01 = r2.length;
    }
}
