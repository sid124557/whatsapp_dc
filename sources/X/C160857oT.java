package X;

import android.os.BaseBundle;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;

/* renamed from: X.7oT  reason: invalid class name and case insensitive filesystem */
public class C160857oT {
    public static Bundle A00(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 26) {
            return bundle.deepCopy();
        }
        Parcel obtain = Parcel.obtain();
        try {
            int dataPosition = obtain.dataPosition();
            obtain.writeBundle(bundle);
            obtain.setDataPosition(dataPosition);
            Bundle readBundle = obtain.readBundle(C160857oT.class.getClassLoader());
            readBundle.getClass();
            return readBundle;
        } finally {
            obtain.recycle();
        }
    }

    public static void A02(Class cls, Object obj, String str) {
        Class<?> cls2;
        if (obj != null && (cls2 = obj.getClass()) != cls) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Expecting: ");
            A0o.append(cls);
            A0o.append(" under key ");
            A0o.append(str);
            throw AnonymousClass000.A0E(cls2, " but was: ", A0o);
        }
    }

    public static void A03(String str, Bundle bundle) {
        Class<byte[]> cls = byte[].class;
        Object obj = bundle.get(str);
        if (obj != null) {
            A02(cls, obj, str);
            return;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Missing required key: ");
        throw AnonymousClass000.A0F(str, A0o);
    }

    public static void A01(BaseBundle baseBundle, Class cls, String str) {
        A02(cls, baseBundle.get(str), str);
    }
}
