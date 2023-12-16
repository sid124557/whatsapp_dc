package X;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: X.6T0  reason: invalid class name */
public final class AnonymousClass6T0 extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164597vi();
    public final int A00;
    public final int A01;
    public final int A02;
    public final C127886Tr A03;

    public final void A00(C185378tY r4) {
        int i = this.A00;
        if (i == 1) {
            r4.BOi(this.A03);
        } else if (i == 2) {
            r4.BOh(this.A03, this.A01, this.A02);
        } else if (i == 3) {
            r4.BUc(this.A03, this.A01, this.A02);
        } else if (i != 4) {
            StringBuilder A0Y = AnonymousClass6CA.A0Y(25);
            A0Y.append("Unknown type: ");
            A0Y.append(i);
            AnonymousClass6C7.A1A(A0Y, "ChannelEventParcelable");
        } else {
            r4.BXX(this.A03, this.A01, this.A02);
        }
    }

    public final String toString() {
        String str;
        String str2;
        String valueOf = String.valueOf(this.A03);
        int i = this.A00;
        if (i == 1) {
            str = "CHANNEL_OPENED";
        } else if (i == 2) {
            str = "CHANNEL_CLOSED";
        } else if (i == 3) {
            str = "INPUT_CLOSED";
        } else if (i != 4) {
            str = Integer.toString(i);
        } else {
            str = "OUTPUT_CLOSED";
        }
        int i2 = this.A01;
        if (i2 == 0) {
            str2 = "CLOSE_REASON_NORMAL";
        } else if (i2 == 1) {
            str2 = "CLOSE_REASON_DISCONNECTED";
        } else if (i2 == 2) {
            str2 = "CLOSE_REASON_REMOTE_CLOSE";
        } else if (i2 != 3) {
            str2 = Integer.toString(i2);
        } else {
            str2 = "CLOSE_REASON_LOCAL_CLOSE";
        }
        int i3 = this.A02;
        int length = valueOf.length();
        StringBuilder A0Y = AnonymousClass6CA.A0Y(length + 81 + AnonymousClass6C7.A06(str) + AnonymousClass6C7.A06(str2));
        A0Y.append("ChannelEventParcelable[, channel=");
        A0Y.append(valueOf);
        A0Y.append(", type=");
        A0Y.append(str);
        A0Y.append(", closeReason=");
        A0Y.append(str2);
        A0Y.append(", appErrorCode=");
        A0Y.append(i3);
        return AnonymousClass000.A0f(A0Y);
    }

    public AnonymousClass6T0(C127886Tr r1, int i, int i2, int i3) {
        this.A03 = r1;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        C162417s1.A0A(parcel, this.A03, 2, i, false);
        C162417s1.A07(parcel, 3, this.A00);
        C162417s1.A07(parcel, 4, this.A01);
        C162417s1.A07(parcel, 5, this.A02);
        C162417s1.A06(parcel, A002);
    }
}
