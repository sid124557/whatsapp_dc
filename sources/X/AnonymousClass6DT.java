package X;

import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.6DT  reason: invalid class name */
public abstract class AnonymousClass6DT extends Binder implements IInterface {
    public final IBinder asBinder() {
        return this;
    }

    public AnonymousClass6DT(String str) {
        attachInterface(this, str);
    }

    public static Parcel A00(Parcelable parcelable, C163097tG r3, AnonymousClass6DT r4) {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(r3.A01);
        obtain.writeStrongBinder(r4.asBinder());
        C161597q1.A01(obtain, parcelable);
        return obtain;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Status status;
        BasePendingResult basePendingResult;
        BasePendingResult A01;
        BasePendingResult A012;
        Status status2;
        Parcelable A0Q;
        C152017Xf r0;
        if (i <= 16777215) {
            AnonymousClass6C8.A0w(this, parcel);
        } else if (super.onTransact(i, parcel, parcel2, i2)) {
            return true;
        }
        if (this instanceof C127966Ug) {
            C127966Ug r2 = (C127966Ug) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            A0Q = AnonymousClass6C7.A0Q(parcel, AnonymousClass6SW.CREATOR);
            C161597q1.A00(parcel);
            r0 = r2.A00;
        } else if (this instanceof C127956Uf) {
            C127956Uf r22 = (C127956Uf) this;
            if (i != 1) {
                return false;
            }
            status2 = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
            A0Q = AnonymousClass6C7.A0Q(parcel, AnonymousClass6T5.CREATOR);
            C161597q1.A00(parcel);
            r0 = r22.A00;
        } else if (this instanceof C127976Uh) {
            C127976Uh r23 = (C127976Uh) this;
            if (i == 1) {
                r23.A00();
                Context context = r23.A00;
                C161417pa A00 = C161417pa.A00(context);
                GoogleSignInAccount A013 = A00.A01();
                GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.A0D;
                if (A013 != null) {
                    googleSignInOptions = A00.A02();
                }
                C162177rO.A02(googleSignInOptions);
                C126976Qd r02 = new C126976Qd(context, googleSignInOptions);
                C159087l6 r4 = r02.A05;
                Context context2 = r02.A01;
                boolean A1U = AnonymousClass000.A1U(r02.A04(), 3);
                C151737Wc r24 = C154827do.A00;
                Object[] A0U = AnonymousClass4L0.A0U();
                if (A013 != null) {
                    r24.A00("Revoking access", A0U);
                    String A03 = C161417pa.A00(context2).A03("refreshToken");
                    C154827do.A00(context2);
                    if (!A1U) {
                        A012 = r4.A01(new AnonymousClass6Q6(r4));
                    } else if (A03 == null) {
                        Status status3 = new Status(4, (String) null);
                        A012 = new AnonymousClass6Qy(status3);
                        A012.A05(status3);
                    } else {
                        C172678Mg r1 = new C172678Mg(A03);
                        new Thread(r1).start();
                        A012 = r1.A00;
                    }
                    C154837dp.A00(A012, new C1695089o());
                    return true;
                }
                r24.A00("Signing out", A0U);
                C154827do.A00(context2);
                if (A1U) {
                    Status status4 = Status.A09;
                    C162177rO.A03(status4, "Result must not be null");
                    A01 = new C127176Qx(r4);
                    A01.A05(status4);
                } else {
                    A01 = r4.A01(new AnonymousClass6Q5(r4));
                }
                C154837dp.A00(A01, new C1695089o());
                return true;
            } else if (i != 2) {
                return false;
            } else {
                r23.A00();
                C157437iI.A00(r23.A00).A01();
                return true;
            }
        } else {
            C127986Ui r25 = (C127986Ui) this;
            switch (i) {
                case 101:
                    AnonymousClass6C7.A0Q(parcel, GoogleSignInAccount.CREATOR);
                    AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                    C161597q1.A00(parcel);
                    throw C18320x8.A0m();
                case 102:
                    status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                    C161597q1.A00(parcel);
                    if (r25 instanceof AnonymousClass6Q3) {
                        basePendingResult = ((AnonymousClass6Q3) r25).A00;
                        break;
                    } else {
                        throw C18320x8.A0m();
                    }
                case 103:
                    status = (Status) AnonymousClass6C7.A0Q(parcel, Status.CREATOR);
                    C161597q1.A00(parcel);
                    if (r25 instanceof AnonymousClass6Q4) {
                        basePendingResult = ((AnonymousClass6Q4) r25).A00;
                        break;
                    } else {
                        throw C18320x8.A0m();
                    }
                default:
                    return false;
            }
            basePendingResult.A05(status);
            parcel2.writeNoException();
            return true;
        }
        AnonymousClass72I.A00(status2, r0, A0Q);
        return true;
    }
}
