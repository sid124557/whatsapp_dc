package X;

import android.os.BaseBundle;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.play.core.integrity.IntegrityServiceException;

/* renamed from: X.6Db  reason: invalid class name and case insensitive filesystem */
public abstract class C124576Db extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public C124576Db(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C129146Zj) {
            C129146Zj r1 = (C129146Zj) this;
            if (i == 2) {
                C159697mJ.A00(parcel);
                r1.AyE((Bundle) AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR));
                return true;
            } else if (i != 3) {
                return false;
            } else {
                C159697mJ.A00(parcel);
                r1.Axc((Bundle) AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR));
                return true;
            }
        } else {
            C129106Zf r12 = (C129106Zf) this;
            if (i != 2) {
                return false;
            }
            BaseBundle baseBundle = (BaseBundle) AnonymousClass6C7.A0Q(parcel, Bundle.CREATOR);
            C159697mJ.A00(parcel);
            C158887ki r0 = r12.A02.A00;
            C152017Xf r3 = r12.A00;
            r0.A02(r3);
            r12.A01.A02("onRequestIntegrityToken", AnonymousClass4L0.A0U());
            int i3 = baseBundle.getInt("error");
            if (i3 != 0) {
                r3.A01(new IntegrityServiceException((Throwable) null, i3));
                return true;
            }
            String string = baseBundle.getString("token");
            if (string == null) {
                r3.A01(new IntegrityServiceException((Throwable) null, -100));
                return true;
            }
            r3.A02(new AnonymousClass6ZZ(string));
            return true;
        }
    }
}
