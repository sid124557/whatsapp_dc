package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7g2  reason: invalid class name and case insensitive filesystem */
public class C156107g2 {
    public final Map A00;
    public final Map A01;

    public C156107g2(Parcel parcel) {
        HashMap A0t = AnonymousClass001.A0t();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0t.put(AnonymousClass6CA.A0P(parcel), parcel.readString());
        }
        this.A01 = A0t;
        HashMap A0t2 = AnonymousClass001.A0t();
        int readInt2 = parcel.readInt();
        for (int i2 = 0; i2 < readInt2; i2++) {
            A0t2.put(AnonymousClass6CA.A0P(parcel), parcel.readString());
        }
        this.A00 = A0t2;
    }

    public C156107g2() {
        this.A01 = AnonymousClass001.A0t();
        this.A00 = AnonymousClass001.A0t();
    }
}
