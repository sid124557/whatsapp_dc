package X;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: X.6DW  reason: invalid class name */
public abstract class AnonymousClass6DW extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DW(String str) {
        attachInterface(this, str);
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable.Creator creator;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof AnonymousClass6VS) {
            AnonymousClass6VS r1 = (AnonymousClass6VS) this;
            switch (i) {
                case 3:
                    Parcelable.Creator creator2 = C127866Tp.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator2.createFromParcel(parcel);
                    }
                    creator = C127926Tw.CREATOR;
                    break;
                case 4:
                case 6:
                    creator = Status.CREATOR;
                    break;
                case 7:
                    Parcelable.Creator creator3 = Status.CREATOR;
                    if (parcel.readInt() != 0) {
                        creator3.createFromParcel(parcel);
                    }
                    creator = GoogleSignInAccount.CREATOR;
                    break;
                case 8:
                    C159627mC.A00(parcel);
                    r1.Bsv((AnonymousClass6SF) AnonymousClass6C7.A0Q(parcel, AnonymousClass6SF.CREATOR));
                    break;
                case 9:
                    creator = C127916Tv.CREATOR;
                    break;
                default:
                    return false;
            }
            if (parcel.readInt() != 0) {
                creator.createFromParcel(parcel);
            }
            C159627mC.A00(parcel);
            parcel2.writeNoException();
            return true;
        }
        AnonymousClass6VR r12 = (AnonymousClass6VR) this;
        if (i != 1) {
            return false;
        }
        C159627mC.A00(parcel);
        r12.BaG((Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR));
        return true;
    }
}
