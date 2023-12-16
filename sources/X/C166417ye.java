package X;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: X.7ye  reason: invalid class name and case insensitive filesystem */
public class C166417ye implements Parcelable {
    @Deprecated
    public static final C166417ye A06;
    public static final C166417ye A07;
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(67);
    public final int A00;
    public final int A01;
    public final int A02;
    public final C129586aY A03;
    public final C129586aY A04;
    public final boolean A05;

    public C166417ye(C129586aY r2, C129586aY r3, int i) {
        this.A03 = r2;
        this.A01 = 0;
        this.A04 = r3;
        this.A02 = i;
        this.A05 = false;
        this.A00 = 0;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C166417ye r5 = (C166417ye) obj;
            if (!(this.A03.equals(r5.A03) && this.A01 == r5.A01 && this.A04.equals(r5.A04) && this.A02 == r5.A02 && this.A05 == r5.A05 && this.A00 == r5.A00)) {
                return false;
            }
        }
        return true;
    }

    static {
        C166417ye r3;
        C150877So r32 = new C150877So();
        if (r32 instanceof C126796Pi) {
            r3 = ((C126796Pi) r32).A00();
        } else {
            r3 = new C166417ye(r32.A01, r32.A02, r32.A00);
        }
        A07 = r3;
        A06 = r3;
    }

    public int describeContents() {
        return 0;
    }

    public int hashCode() {
        return ((((AnonymousClass000.A08(this.A04, (((this.A03.hashCode() + 31) * 31) + this.A01) * 31) + this.A02) * 31) + (this.A05 ? 1 : 0)) * 31) + this.A00;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeList(this.A03);
        parcel.writeInt(this.A01);
        parcel.writeList(this.A04);
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A05 ? 1 : 0);
        parcel.writeInt(this.A00);
    }

    public C166417ye(Parcel parcel) {
        ArrayList A0s = AnonymousClass001.A0s();
        parcel.readList(A0s, (ClassLoader) null);
        this.A03 = C129586aY.copyOf((Collection) A0s);
        this.A01 = parcel.readInt();
        this.A04 = C174098Sy.A00(parcel, (ClassLoader) null);
        this.A02 = parcel.readInt();
        this.A05 = AnonymousClass6C7.A1W(parcel);
        this.A00 = parcel.readInt();
    }
}
