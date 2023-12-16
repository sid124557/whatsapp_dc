package X;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;

/* renamed from: X.6SU  reason: invalid class name */
public class AnonymousClass6SU extends C1695389r {
    public static final C127806Tj[] A0E = new C127806Tj[0];
    public static final Scope[] A0F = new Scope[0];
    public static final Parcelable.Creator CREATOR = new C165767xb();
    public int A00;
    public int A01;
    public Account A02;
    public Bundle A03;
    public IBinder A04;
    public String A05;
    public String A06;
    public boolean A07;
    public boolean A08;
    public C127806Tj[] A09;
    public C127806Tj[] A0A;
    public Scope[] A0B;
    public final int A0C;
    public final int A0D;

    public AnonymousClass6SU(Account account, Bundle bundle, IBinder iBinder, String str, String str2, C127806Tj[] r13, C127806Tj[] r14, Scope[] scopeArr, int i, int i2, int i3, int i4, boolean z, boolean z2) {
        Account account2;
        Object r6;
        Parcelable parcelable;
        scopeArr = scopeArr == null ? A0F : scopeArr;
        bundle = bundle == null ? AnonymousClass002.A08() : bundle;
        r13 = r13 == null ? A0E : r13;
        r14 = r14 == null ? A0E : r14;
        int i5 = i;
        this.A0C = i5;
        this.A0D = i2;
        this.A00 = i3;
        if ("com.google.android.gms".equals(str)) {
            this.A05 = "com.google.android.gms";
        } else {
            this.A05 = str;
        }
        if (i5 < 2) {
            if (iBinder != null) {
                IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                if (queryLocalInterface instanceof IAccountAccessor) {
                    r6 = (IAccountAccessor) queryLocalInterface;
                } else {
                    r6 = new AnonymousClass6WH(iBinder);
                }
                account2 = null;
                if (r6 != null) {
                    long clearCallingIdentity = Binder.clearCallingIdentity();
                    try {
                        AnonymousClass6WH r62 = (AnonymousClass6WH) r6;
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r62.A01);
                        Parcel A002 = r62.A00(2, obtain);
                        Parcelable.Creator creator = Account.CREATOR;
                        if (A002.readInt() == 0) {
                            parcelable = null;
                        } else {
                            parcelable = (Parcelable) creator.createFromParcel(A002);
                        }
                        Account account3 = (Account) parcelable;
                        A002.recycle();
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                    } catch (Throwable th) {
                        Binder.restoreCallingIdentity(clearCallingIdentity);
                        throw th;
                    }
                    Binder.restoreCallingIdentity(clearCallingIdentity);
                }
            } else {
                account2 = null;
            }
            this.A02 = account2;
        } else {
            this.A04 = iBinder;
            this.A02 = account;
        }
        this.A0B = scopeArr;
        this.A03 = bundle;
        this.A09 = r13;
        this.A0A = r14;
        this.A07 = z;
        this.A01 = i4;
        this.A08 = z2;
        this.A06 = str2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C165767xb.A00(parcel, this, i);
    }
}
