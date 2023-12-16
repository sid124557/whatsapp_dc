package X;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.ByteArrayOutputStream;

/* renamed from: X.6hn  reason: invalid class name and case insensitive filesystem */
public final class C133696hn extends C166587yw {
    public static final Parcelable.Creator CREATOR = AnonymousClass91V.A00(98);
    public final C166557yt A00;

    public void writeToParcel(Parcel parcel, int i) {
        C162457s7.A0J(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        super.writeToParcel(parcel, i);
    }

    public int describeContents() {
        return 0;
    }

    public C133696hn(Bitmap bitmap, String str, String str2) {
        C18260x0.A0Q(str, str2);
        this.A00 = new C166557yt(AnonymousClass3QD.A00(), String.class, str, "upiAppPackageName");
        if (bitmap != null) {
            ByteArrayOutputStream A0e = AnonymousClass0x9.A0e();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, A0e);
            this.A0D = A0e.toByteArray();
            A0e.close();
        }
        A0D(str2);
        this.A0A = str;
    }

    public C133696hn(Parcel parcel) {
        Parcelable A0C = C18280x3.A0C(parcel, C166557yt.class);
        if (A0C != null) {
            this.A00 = (C166557yt) A0C;
            A0C(parcel);
            return;
        }
        throw AnonymousClass001.A0e("Required value was null.");
    }
}
