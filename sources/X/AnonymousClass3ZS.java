package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.3ZS  reason: invalid class name */
public class AnonymousClass3ZS implements Comparable, Parcelable {
    public static final Parcelable.Creator CREATOR = new AnonymousClass6A9(2);
    public AnonymousClass39K A00;
    public final String A01;
    public transient C95814uZ A02;

    public synchronized C95814uZ A01() {
        C95814uZ r3;
        r3 = this.A02;
        if (r3 == null) {
            String str = this.A01;
            r3 = C18310x6.A0S(str);
            C626936e.A07(r3, AnonymousClass000.A0V("contactRawJid = ", str, AnonymousClass001.A0o()));
            this.A02 = r3;
        }
        return r3;
    }

    /* renamed from: A00 */
    public int compareTo(AnonymousClass3ZS r7) {
        AnonymousClass39K r5 = r7.A00;
        long j = r5.A0I;
        AnonymousClass39K r2 = this.A00;
        int signum = (int) Math.signum((float) (j - r2.A0I));
        if (signum == 0) {
            return (int) Math.signum((float) (r5.A06 - r2.A06));
        }
        return signum;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeParcelable(this.A00, i);
    }

    public AnonymousClass3ZS(Parcel parcel) {
        this.A01 = C18310x6.A0l(parcel);
        Parcelable A0C = C18280x3.A0C(parcel, AnonymousClass39K.class);
        C626936e.A06(A0C);
        this.A00 = (AnonymousClass39K) A0C;
    }

    public int describeContents() {
        return 0;
    }

    public AnonymousClass3ZS(AnonymousClass39K r2, C95814uZ r3) {
        this.A02 = r3;
        this.A01 = r3.getRawString();
        this.A00 = r2;
    }
}
