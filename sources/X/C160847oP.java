package X;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.IGmsServiceBroker;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7oP  reason: invalid class name and case insensitive filesystem */
public abstract class C160847oP {
    public static final C127806Tj[] A0T = new C127806Tj[0];
    public int A00;
    public int A01;
    public int A02 = 1;
    public long A03;
    public long A04;
    public long A05;
    public IInterface A06;
    public C127866Tp A07 = null;
    public C180898lo A08;
    public IGmsServiceBroker A09;
    public C162737sf A0A;
    public C148797Jt A0B;
    public AtomicInteger A0C = new AtomicInteger(0);
    public boolean A0D = false;
    public final int A0E;
    public final Context A0F;
    public final Handler A0G;
    public final Looper A0H;
    public final C158267jh A0I;
    public final C178398hT A0J;
    public final C178408hU A0K;
    public final C161367pV A0L;
    public final Object A0M = AnonymousClass002.A0D();
    public final Object A0N = AnonymousClass002.A0D();
    public final String A0O;
    public final ArrayList A0P = AnonymousClass001.A0s();
    public volatile AnonymousClass6TW A0Q = null;
    public volatile String A0R;
    public volatile String A0S = null;

    public final void A06(IInterface iInterface, int i) {
        String str;
        String str2;
        boolean z;
        C148797Jt r0;
        boolean z2 = true;
        if (i != 4) {
            z2 = false;
        }
        boolean z3 = true;
        if (iInterface == null) {
            z3 = false;
        }
        if (z2 == z3) {
            synchronized (this.A0M) {
                this.A02 = i;
                this.A06 = iInterface;
                if (i == 1) {
                    C162737sf r6 = this.A0A;
                    if (r6 != null) {
                        C161367pV r5 = this.A0L;
                        C148797Jt r02 = this.A0B;
                        String str3 = r02.A00;
                        C162177rO.A02(str3);
                        r5.A01(r6, new C160537np(str3, r02.A02, r02.A01));
                        this.A0A = null;
                    }
                } else if (i == 2 || i == 3) {
                    C162737sf r62 = this.A0A;
                    if (!(r62 == null || (r0 = this.A0B) == null)) {
                        String str4 = r0.A00;
                        String str5 = r0.A01;
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Calling connect() while still connected, missing disconnect() for ");
                        A0o.append(str4);
                        A0o.append(" on ");
                        AnonymousClass000.A1D(str5, "GmsClient", A0o);
                        C161367pV r52 = this.A0L;
                        C148797Jt r03 = this.A0B;
                        String str6 = r03.A00;
                        C162177rO.A02(str6);
                        r52.A01(r62, new C160537np(str6, r03.A02, r03.A01));
                        this.A0C.incrementAndGet();
                    }
                    AtomicInteger atomicInteger = this.A0C;
                    C162737sf r8 = new C162737sf(this, atomicInteger.get());
                    this.A0A = r8;
                    if (this instanceof AnonymousClass6RY) {
                        str = "com.google.android.wearable.app.cn";
                        if (!((AnonymousClass6RY) this).A09.A01()) {
                            str = "com.google.android.gms";
                        }
                        str2 = "com.google.android.gms.wearable.BIND";
                    } else {
                        str = "com.google.android.gms";
                        if (this instanceof AnonymousClass6RZ) {
                            str2 = "com.google.android.gms.signin.service.START";
                        } else if (this instanceof AnonymousClass6RL) {
                            str2 = "com.google.android.gms.safetynet.service.START";
                        } else if (this instanceof AnonymousClass6RX) {
                            str2 = "com.google.android.location.internal.GoogleLocationManagerService.START";
                        } else if (this instanceof AnonymousClass6RR) {
                            str2 = "com.google.android.gms.fido.fido2.regular.START";
                        } else if (this instanceof AnonymousClass6RN) {
                            str2 = "com.google.android.gms.fido.u2f.zeroparty.START";
                        } else if (this instanceof AnonymousClass6RJ) {
                            str2 = "com.google.android.gms.clearcut.service.START";
                        } else if (this instanceof AnonymousClass6RQ) {
                            str2 = "com.google.android.gms.auth.blockstore.service.START";
                        } else if (this instanceof AnonymousClass6RU) {
                            str2 = "com.google.android.gms.auth.account.authapi.START";
                        } else if (this instanceof AnonymousClass6RT) {
                            str2 = "com.google.android.gms.auth.service.START";
                        } else if (this instanceof AnonymousClass6RP) {
                            str2 = "com.google.android.gms.auth.api.accounttransfer.service.START";
                        } else if (this instanceof AnonymousClass6RW) {
                            str2 = "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
                        } else if (this instanceof AnonymousClass6RK) {
                            str2 = "com.google.android.gms.auth.api.credentials.service.START";
                        } else if (this instanceof AnonymousClass6RV) {
                            str2 = "com.google.android.gms.auth.api.identity.service.signin.START";
                        } else if (this instanceof AnonymousClass6RM) {
                            str2 = "com.google.android.gms.auth.api.phone.service.SmsRetrieverApiService.START";
                        } else if (this instanceof AnonymousClass6RS) {
                            str2 = "com.google.android.gms.common.telemetry.service.START";
                        } else {
                            str2 = "com.google.android.gms.auth.api.signin.service.START";
                        }
                    }
                    if ((this instanceof AnonymousClass6RQ) || (this instanceof AnonymousClass6RU) || (this instanceof AnonymousClass6RW) || (this instanceof AnonymousClass6RV) || (this instanceof AnonymousClass6RS)) {
                        z = true;
                    } else {
                        z = C18280x3.A1U(B9m(), 211700000);
                    }
                    C148797Jt r2 = new C148797Jt(str, z, str2);
                    this.A0B = r2;
                    boolean z4 = r2.A02;
                    if (!z4 || B9m() >= 17895000) {
                        C161367pV r63 = this.A0L;
                        String str7 = r2.A00;
                        C162177rO.A02(str7);
                        String str8 = r2.A01;
                        String str9 = this.A0O;
                        if (str9 == null) {
                            str9 = AnonymousClass000.A0O(this.A0F);
                        }
                        if (!r63.A02(r8, new C160537np(str7, z4, str8), str9)) {
                            C148797Jt r04 = this.A0B;
                            String str10 = r04.A00;
                            String str11 = r04.A01;
                            StringBuilder A0o2 = AnonymousClass001.A0o();
                            A0o2.append("unable to connect to service: ");
                            A0o2.append(str10);
                            A0o2.append(" on ");
                            A0o2.append(str11);
                            AnonymousClass6C7.A1A(A0o2, "GmsClient");
                            int i2 = atomicInteger.get();
                            Handler handler = this.A0G;
                            handler.sendMessage(handler.obtainMessage(7, i2, -1, new AnonymousClass6UG(this, 16)));
                        }
                    } else {
                        throw AnonymousClass001.A0e("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(r2.A00)));
                    }
                } else if (i == 4) {
                    C162177rO.A02(iInterface);
                    this.A04 = System.currentTimeMillis();
                }
            }
            return;
        }
        throw AnonymousClass6CA.A0N();
    }

    public abstract int B9m();

    public static /* bridge */ /* synthetic */ boolean A01(IInterface iInterface, C160847oP r3, int i, int i2) {
        synchronized (r3.A0M) {
            if (r3.A02 != i) {
                return false;
            }
            r3.A06(iInterface, i2);
            return true;
        }
    }

    public final IInterface A02() {
        IInterface iInterface;
        synchronized (this.A0M) {
            if (this.A02 != 5) {
                A04();
                iInterface = this.A06;
                C162177rO.A03(iInterface, "Client is connected but service is null");
            } else {
                throw new DeadObjectException();
            }
        }
        return iInterface;
    }

    public String A03() {
        if (this instanceof AnonymousClass6RY) {
            return "com.google.android.gms.wearable.internal.IWearableService";
        }
        if (this instanceof AnonymousClass6RZ) {
            return "com.google.android.gms.signin.internal.ISignInService";
        }
        if (this instanceof AnonymousClass6RL) {
            return "com.google.android.gms.safetynet.internal.ISafetyNetService";
        }
        if (this instanceof AnonymousClass6RX) {
            return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
        }
        if (this instanceof AnonymousClass6RR) {
            return "com.google.android.gms.fido.fido2.internal.regular.IFido2AppService";
        }
        if (this instanceof AnonymousClass6RN) {
            return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
        }
        if (this instanceof AnonymousClass6RJ) {
            return "com.google.android.gms.clearcut.internal.IClearcutLoggerService";
        }
        if (this instanceof AnonymousClass6RQ) {
            return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
        }
        if (this instanceof AnonymousClass6RU) {
            return "com.google.android.gms.auth.account.data.IGoogleAuthService";
        }
        if (this instanceof AnonymousClass6RT) {
            return "com.google.android.gms.auth.api.internal.IAuthService";
        }
        if (this instanceof AnonymousClass6RP) {
            return "com.google.android.gms.auth.api.accounttransfer.internal.IAccountTransferService";
        }
        if (this instanceof AnonymousClass6RW) {
            return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
        }
        if (this instanceof AnonymousClass6RK) {
            return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
        }
        if (this instanceof AnonymousClass6RV) {
            return "com.google.android.gms.auth.api.identity.internal.ISignInService";
        }
        if (this instanceof AnonymousClass6RM) {
            return "com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService";
        }
        if (this instanceof AnonymousClass6RS) {
            return "com.google.android.gms.common.internal.service.IClientTelemetryService";
        }
        return "com.google.android.gms.auth.api.signin.internal.ISignInService";
    }

    public void A05(Bundle bundle, IBinder iBinder, int i, int i2) {
        Handler handler = this.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, new AnonymousClass6UH(bundle, iBinder, this, i)));
    }

    public boolean A07() {
        if ((this instanceof AnonymousClass6RY) || (this instanceof AnonymousClass6RL) || (this instanceof AnonymousClass6RX) || (this instanceof AnonymousClass6RR) || (this instanceof AnonymousClass6RN) || (this instanceof AnonymousClass6RQ) || (this instanceof AnonymousClass6RU) || (this instanceof AnonymousClass6RT) || (this instanceof AnonymousClass6RP) || (this instanceof AnonymousClass6RW) || (this instanceof AnonymousClass6RV) || (this instanceof AnonymousClass6RM)) {
            return true;
        }
        return false;
    }

    public void AzV(C180898lo r3) {
        C162177rO.A03(r3, "Connection progress callbacks cannot be null.");
        this.A08 = r3;
        A06((IInterface) null, 2);
    }

    public void B1l() {
        this.A0C.incrementAndGet();
        ArrayList arrayList = this.A0P;
        synchronized (arrayList) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C150897Sq r1 = (C150897Sq) arrayList.get(i);
                synchronized (r1) {
                    r1.A00 = null;
                }
            }
            arrayList.clear();
        }
        synchronized (this.A0N) {
            this.A09 = null;
        }
        A06((IInterface) null, 1);
    }

    public void B1m(String str) {
        this.A0S = str;
        B1l();
    }

    /* JADX INFO: finally extract failed */
    public void BC3(IAccountAccessor iAccountAccessor, Set set) {
        Bundle A082;
        String str;
        String str2;
        C127806Tj[] r7;
        char c;
        C127806Tj r0;
        if (this instanceof AnonymousClass6RZ) {
            AnonymousClass6RZ r3 = (AnonymousClass6RZ) this;
            String str3 = r3.A01.A02;
            if (!r3.A0F.getPackageName().equals(str3)) {
                r3.A00.putString("com.google.android.gms.signin.internal.realClientPackageName", str3);
            }
            A082 = r3.A00;
        } else {
            if (this instanceof AnonymousClass6RX) {
                A082 = AnonymousClass002.A08();
                str = "client_name";
                str2 = ((AnonymousClass6RX) this).A02;
            } else if (this instanceof AnonymousClass6RR) {
                A082 = AnonymousClass002.A08();
                str = "FIDO2_ACTION_START_SERVICE";
                str2 = "com.google.android.gms.fido.fido2.regular.START";
            } else if (this instanceof AnonymousClass6RN) {
                A082 = AnonymousClass002.A08();
                str = "ACTION_START_SERVICE";
                str2 = "com.google.android.gms.fido.u2f.zeroparty.START";
            } else if (this instanceof AnonymousClass6RT) {
                A082 = ((AnonymousClass6RT) this).A00;
            } else if (this instanceof AnonymousClass6RP) {
                A082 = ((AnonymousClass6RP) this).A00;
            } else if (this instanceof AnonymousClass6RW) {
                A082 = ((AnonymousClass6RW) this).A00;
            } else if (this instanceof AnonymousClass6RK) {
                A082 = ((AnonymousClass6RK) this).A00.A00();
            } else if (this instanceof AnonymousClass6RV) {
                A082 = ((AnonymousClass6RV) this).A00;
            } else {
                A082 = AnonymousClass002.A08();
            }
            A082.putString(str, str2);
        }
        int i = this.A0E;
        String str4 = this.A0R;
        Scope[] scopeArr = AnonymousClass6SU.A0F;
        Bundle A083 = AnonymousClass002.A08();
        C127806Tj[] r16 = AnonymousClass6SU.A0E;
        AnonymousClass6SU r10 = new AnonymousClass6SU((Account) null, A083, (IBinder) null, (String) null, str4, r16, r16, scopeArr, 6, i, 12451000, 0, true, false);
        r10.A05 = this.A0F.getPackageName();
        r10.A03 = A082;
        Set set2 = set;
        if (set != null) {
            r10.A0B = (Scope[]) set2.toArray(new Scope[0]);
        }
        if (Bjs()) {
            r10.A02 = new Account("<<default account>>", "com.google");
            if (iAccountAccessor != null) {
                r10.A04 = iAccountAccessor.asBinder();
            }
        }
        r10.A09 = A0T;
        if (this instanceof AnonymousClass6RY) {
            r7 = AnonymousClass79N.A04;
        } else if (this instanceof AnonymousClass6RX) {
            r7 = AnonymousClass79R.A05;
        } else {
            if (this instanceof AnonymousClass6RR) {
                r7 = new C127806Tj[2];
                r7[0] = C1462979p.A07;
                c = 1;
                r0 = C1462979p.A06;
            } else if (this instanceof AnonymousClass6RQ) {
                r7 = C1461979a.A06;
            } else if (this instanceof AnonymousClass6RU) {
                r7 = new C127806Tj[3];
                r7[0] = C1462479h.A09;
                r7[1] = C1462479h.A08;
                c = 2;
                r0 = C1462479h.A00;
            } else if ((this instanceof AnonymousClass6RW) || (this instanceof AnonymousClass6RV)) {
                r7 = C1462179d.A08;
            } else if (this instanceof AnonymousClass6RM) {
                r7 = AnonymousClass79L.A04;
            } else if (this instanceof AnonymousClass6RS) {
                r7 = AnonymousClass78T.A01;
            } else {
                r7 = A0T;
            }
            r7[c] = r0;
        }
        r10.A0A = r7;
        if (A07()) {
            r10.A08 = true;
        }
        try {
            synchronized (this.A0N) {
                IGmsServiceBroker iGmsServiceBroker = this.A09;
                if (iGmsServiceBroker != null) {
                    AnonymousClass6WJ r8 = new AnonymousClass6WJ(this, this.A0C.get());
                    C1694989n r9 = (C1694989n) iGmsServiceBroker;
                    Parcel obtain = Parcel.obtain();
                    Parcel obtain2 = Parcel.obtain();
                    try {
                        obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                        obtain.writeStrongBinder(r8.asBinder());
                        obtain.writeInt(1);
                        C165767xb.A00(obtain, r10, 0);
                        r9.A00.transact(46, obtain, obtain2, 0);
                        obtain2.readException();
                        obtain2.recycle();
                        obtain.recycle();
                    } catch (Throwable th) {
                        obtain2.recycle();
                        obtain.recycle();
                        throw th;
                    }
                } else {
                    Log.w("GmsClient", "mServiceBroker is null, client disconnected");
                }
            }
        } catch (DeadObjectException e) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e);
            Handler handler = this.A0G;
            handler.sendMessage(handler.obtainMessage(6, this.A0C.get(), 3));
        } catch (SecurityException e2) {
            throw e2;
        } catch (RemoteException | RuntimeException e3) {
            Log.w("GmsClient", "IGmsServiceBroker.getService failed", e3);
            A05((Bundle) null, (IBinder) null, 8, this.A0C.get());
        }
    }

    public Intent BD3() {
        throw AnonymousClass002.A0G("Not a sign in API");
    }

    public boolean BHI() {
        boolean z;
        synchronized (this.A0M) {
            int i = this.A02;
            z = true;
            if (!(i == 2 || i == 3)) {
                z = false;
            }
        }
        return z;
    }

    public boolean Bhi() {
        return false;
    }

    public boolean Bjr() {
        return true;
    }

    public boolean Bjs() {
        return false;
    }

    public boolean isConnected() {
        boolean A1U;
        synchronized (this.A0M) {
            A1U = AnonymousClass000.A1U(this.A02, 4);
        }
        return A1U;
    }

    public C160847oP(Context context, Looper looper, C158267jh r6, C178398hT r7, C178408hU r8, C161367pV r9, String str, int i) {
        C162177rO.A03(context, "Context must not be null");
        this.A0F = context;
        C162177rO.A03(looper, "Looper must not be null");
        this.A0H = looper;
        C162177rO.A03(r9, "Supervisor must not be null");
        this.A0L = r9;
        C162177rO.A03(r6, "API availability must not be null");
        this.A0I = r6;
        this.A0G = new AnonymousClass6WM(looper, this);
        this.A0E = i;
        this.A0J = r7;
        this.A0K = r8;
        this.A0O = str;
    }

    public final void A04() {
        if (!isConnected()) {
            throw AnonymousClass001.A0e("Not connected. Call connect() and wait for onConnected() to be called.");
        }
    }
}
