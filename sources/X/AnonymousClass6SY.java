package X;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.6SY  reason: invalid class name */
public final class AnonymousClass6SY extends C1695389r {
    public static final Parcelable.Creator CREATOR = new C164657vo();
    public byte[] A00;
    public final Uri A01;
    public final Map A02;

    public final String toString() {
        Object valueOf;
        String str;
        boolean A1Q = AnonymousClass6C9.A1Q("DataItem");
        StringBuilder A0A = C18330xA.A0A("DataItemParcelable[");
        A0A.append("@");
        AnonymousClass001.A1N(A0A, hashCode());
        byte[] bArr = this.A00;
        if (bArr == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(bArr.length);
        }
        String valueOf2 = String.valueOf(valueOf);
        StringBuilder A0Y = AnonymousClass6CA.A0Y(valueOf2.length() + 8);
        A0Y.append(",dataSz=");
        C18270x1.A1C(valueOf2, A0Y, A0A);
        Map map = this.A02;
        A0A.append(AnonymousClass000.A0Y(", numAssets=", AnonymousClass6CA.A0Y(23), map.size()));
        String valueOf3 = String.valueOf(this.A01);
        StringBuilder A0Y2 = AnonymousClass6CA.A0Y(valueOf3.length() + 6);
        A0Y2.append(", uri=");
        C18270x1.A1C(valueOf3, A0Y2, A0A);
        if (!A1Q) {
            str = "]";
        } else {
            A0A.append("]\n  assets: ");
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                String A0m = AnonymousClass001.A0m(A0i);
                String valueOf4 = String.valueOf(map.get(A0m));
                StringBuilder A0Y3 = AnonymousClass6CA.A0Y(AnonymousClass6C7.A06(A0m) + 7 + valueOf4.length());
                A0Y3.append("\n    ");
                A0Y3.append(A0m);
                A0Y3.append(": ");
                C18270x1.A1C(valueOf4, A0Y3, A0A);
            }
            str = "\n  ]";
        }
        return AnonymousClass000.A0X(str, A0A);
    }

    public AnonymousClass6SY(Uri uri, Bundle bundle, byte[] bArr) {
        this.A01 = uri;
        HashMap A0t = AnonymousClass001.A0t();
        bundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            A0t.put(A0m, bundle.getParcelable(A0m));
        }
        this.A02 = A0t;
        this.A00 = bArr;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A002 = C162417s1.A00(parcel);
        boolean A06 = C1695389r.A06(parcel, this.A01, i);
        Bundle A08 = AnonymousClass002.A08();
        A08.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
        Iterator A0q = AnonymousClass000.A0q(this.A02);
        while (A0q.hasNext()) {
            Map.Entry A0w = AnonymousClass001.A0w(A0q);
            A08.putParcelable(C18310x6.A0q(A0w), new DataItemAssetParcelable((C178738i1) A0w.getValue()));
        }
        C162417s1.A02(A08, parcel, 4);
        C162417s1.A0E(parcel, this.A00, 5, A06);
        C162417s1.A06(parcel, A002);
    }
}
