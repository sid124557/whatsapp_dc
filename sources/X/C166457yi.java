package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.7yi  reason: invalid class name and case insensitive filesystem */
public class C166457yi implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(21);
    public final float A00;
    public final C141256vH A01;
    public final C141256vH A02;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C166457yi)) {
            return false;
        }
        C166457yi r4 = (C166457yi) obj;
        return Float.compare(r4.A00, this.A00) == 0 && this.A01 == r4.A01 && this.A02 == r4.A02;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        C18290x4.A1D(parcel, this.A01);
        C18290x4.A1D(parcel, this.A02);
        parcel.writeFloat(this.A00);
    }

    public C166457yi(Parcel parcel) {
        C141256vH valueOf;
        C141256vH valueOf2;
        String readString = parcel.readString();
        if (readString == null) {
            valueOf = C141256vH.NONE;
        } else {
            valueOf = C141256vH.valueOf(readString);
        }
        this.A01 = valueOf;
        String readString2 = parcel.readString();
        if (readString2 == null) {
            valueOf2 = C141256vH.NONE;
        } else {
            valueOf2 = C141256vH.valueOf(readString2);
        }
        this.A02 = valueOf2;
        this.A00 = parcel.readFloat();
    }

    public int hashCode() {
        Object[] A1X = AnonymousClass0x9.A1X();
        A1X[0] = this.A01;
        A1X[1] = this.A02;
        return C18310x6.A08(Float.valueOf(this.A00), A1X, 2);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AudioFocusLossSettings{mAudioFocusLossBehavior=");
        A0o.append(this.A01);
        A0o.append(", mAudioFocusTransientLossBehavior=");
        A0o.append(this.A02);
        A0o.append(", mAudioFocusTransientLossDuckVolume=");
        A0o.append(this.A00);
        return AnonymousClass000.A0d(A0o);
    }

    public C166457yi() {
        this.A01 = C141256vH.PAUSE;
        this.A02 = C141256vH.NONE;
        this.A00 = 0.0f;
    }
}
