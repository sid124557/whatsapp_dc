package X;

import android.os.Parcel;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.7g1  reason: invalid class name and case insensitive filesystem */
public class C156097g1 {
    public long A00;
    public final Map A01;

    public C156097g1(Parcel parcel) {
        this.A00 = parcel.readLong();
        HashMap A0t = AnonymousClass001.A0t();
        int readInt = parcel.readInt();
        for (int i = 0; i < readInt; i++) {
            A0t.put(AnonymousClass6CA.A0P(parcel), parcel.readString());
        }
        this.A01 = A0t;
    }

    public C156097g1() {
        this.A00 = 0;
        this.A01 = AnonymousClass001.A0t();
    }
}
