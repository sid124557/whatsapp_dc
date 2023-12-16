package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* renamed from: X.7rO  reason: invalid class name and case insensitive filesystem */
public final class C162177rO {
    public static void A02(Object obj) {
        if (obj == null) {
            throw AnonymousClass001.A0g("null reference");
        }
    }

    public static void A03(Object obj, Object obj2) {
        if (obj == null) {
            throw AnonymousClass001.A0g(String.valueOf(obj2));
        }
    }

    public static void A04(Object obj, boolean z) {
        if (!z) {
            throw AnonymousClass001.A0e(String.valueOf(obj));
        }
    }

    public static SafeParcelable A00(Parcelable.Creator creator, byte[] bArr) {
        A02(creator);
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        SafeParcelable safeParcelable = (SafeParcelable) creator.createFromParcel(obtain);
        obtain.recycle();
        return safeParcelable;
    }

    public static void A01(Handler handler) {
        String str;
        Looper myLooper = Looper.myLooper();
        if (myLooper != handler.getLooper()) {
            if (myLooper != null) {
                str = myLooper.getThread().getName();
            } else {
                str = "null current looper";
            }
            String name = handler.getLooper().getThread().getName();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Must be called on ");
            A0o.append(name);
            A0o.append(" thread, but got ");
            A0o.append(str);
            throw AnonymousClass000.A0I(".", A0o);
        }
    }

    public static void A05(String str) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass001.A0c("Given String is empty or null");
        }
    }

    public static void A06(String str) {
        if (Looper.getMainLooper() == Looper.myLooper()) {
            throw AnonymousClass001.A0e(str);
        }
    }

    public static void A07(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw AnonymousClass6C7.A0U(obj);
        }
    }
}
