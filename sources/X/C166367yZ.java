package X;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.annotationprocessors.modelgen.iface.ModelgenUtils;

/* renamed from: X.7yZ  reason: invalid class name and case insensitive filesystem */
public class C166367yZ implements Parcelable {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(16);
    public final String A00;
    public final boolean A01;
    public final boolean A02;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C166367yZ) {
                C166367yZ r5 = (C166367yZ) obj;
                if (!ModelgenUtils.equal((Object) null, (Object) null) || !ModelgenUtils.equal((Object) null, (Object) null) || !ModelgenUtils.equal(this.A00, r5.A00) || this.A01 != r5.A01 || this.A02 != r5.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(ModelgenUtils.processHashCode(1, (Object) null), (Object) null), this.A00), this.A01), this.A02);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(0);
        parcel.writeInt(0);
        String str = this.A00;
        if (str == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(str);
        }
        parcel.writeInt(this.A01 ? 1 : 0);
        parcel.writeInt(this.A02 ? 1 : 0);
    }

    public int describeContents() {
        return 0;
    }

    public C166367yZ(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() != 0) {
            parcel.readParcelable(classLoader);
        }
        if (parcel.readInt() == 0) {
            this.A00 = null;
        } else {
            this.A00 = parcel.readString();
        }
        boolean z = false;
        this.A01 = AnonymousClass000.A1U(parcel.readInt(), 1);
        this.A02 = parcel.readInt() == 1 ? true : z;
    }

    public C166367yZ(AnonymousClass7J2 r2) {
        this.A00 = r2.A00;
        this.A01 = r2.A01;
        this.A02 = r2.A02;
    }
}
