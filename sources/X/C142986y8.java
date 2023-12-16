package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6y8  reason: invalid class name and case insensitive filesystem */
public enum C142986y8 implements Parcelable {
    ;
    
    public static final Parcelable.Creator CREATOR = null;
    public final String zzb;

    /* access modifiers changed from: public */
    static {
        CREATOR = new C163807uP();
    }

    /* access modifiers changed from: public */
    C142986y8() {
        this.zzb = "public-key";
    }

    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.zzb;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.zzb);
    }

    public static C142986y8 A00(String str) {
        for (C142986y8 r1 : values()) {
            if (str.equals(r1.zzb)) {
                return r1;
            }
        }
        Object[] A0L = AnonymousClass002.A0L();
        A0L[0] = str;
        throw new C143236yY(String.format("PublicKeyCredentialType %s not supported", A0L));
    }
}
