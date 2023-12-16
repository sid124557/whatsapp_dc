package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.IAccountAccessor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: X.89d  reason: invalid class name and case insensitive filesystem */
public final class C1693989d implements C186118um {
    public int A00;
    public int A01 = 0;
    public int A02;
    public C127866Tp A03;
    public IAccountAccessor A04;
    public C187678xd A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final Bundle A0C = AnonymousClass002.A08();
    public final C158267jh A0D;
    public final AnonymousClass6QU A0E;
    public final C1694389h A0F;
    public final AnonymousClass7P4 A0G;
    public final ArrayList A0H = AnonymousClass001.A0s();
    public final Map A0I;
    public final Set A0J = AnonymousClass002.A0K();
    public final Lock A0K;

    public final void A00() {
        this.A07 = false;
        C1694389h r6 = this.A0F;
        r6.A05.A03 = Collections.emptySet();
        for (Object next : this.A0J) {
            Map map = r6.A0A;
            if (!map.containsKey(next)) {
                map.put(next, new C127866Tp(17, (PendingIntent) null));
            }
        }
    }

    public final void Bt3(Bundle bundle) {
        if (A07(1)) {
            if (bundle != null) {
                this.A0C.putAll(bundle);
            }
            if (A06()) {
                A01();
            }
        }
    }

    public final void Bt4(C127866Tp r2, C148727Jm r3, boolean z) {
        if (A07(1)) {
            A04(r2, r3, z);
            if (A06()) {
                A01();
            }
        }
    }

    /* JADX INFO: finally extract failed */
    public final void A01() {
        IBinder iBinder;
        C1694389h r3 = this.A0F;
        Lock lock = r3.A0D;
        lock.lock();
        try {
            r3.A05.A08();
            r3.A0E = new C1693789b(r3);
            r3.A0E.Bsx();
            r3.A0C.signalAll();
            lock.unlock();
            C1456076n.A00.execute(new C172668Mf(this, 25));
            C187678xd r1 = this.A05;
            if (r1 != null) {
                if (this.A09) {
                    IAccountAccessor iAccountAccessor = this.A04;
                    C162177rO.A02(iAccountAccessor);
                    boolean z = this.A0A;
                    AnonymousClass6RZ r12 = (AnonymousClass6RZ) r1;
                    try {
                        C163107tH r4 = (C163107tH) r12.A02();
                        Integer num = r12.A02;
                        C162177rO.A02(num);
                        int intValue = num.intValue();
                        Parcel obtain = Parcel.obtain();
                        obtain.writeInterfaceToken(r4.A01);
                        if (iAccountAccessor == null) {
                            iBinder = null;
                        } else {
                            iBinder = iAccountAccessor.asBinder();
                        }
                        obtain.writeStrongBinder(iBinder);
                        obtain.writeInt(intValue);
                        obtain.writeInt(z ? 1 : 0);
                        r4.A00(9, obtain);
                    } catch (RemoteException unused) {
                        Log.w("SignInClientImpl", "Remote service probably died when saveDefaultAccount is called");
                    }
                }
                A05(false);
            }
            Iterator A0i = C18280x3.A0i(r3.A0A);
            while (A0i.hasNext()) {
                Object obj = r3.A09.get(A0i.next());
                C162177rO.A02(obj);
                ((C187688xe) obj).B1l();
            }
            Bundle bundle = this.A0C;
            if (bundle.isEmpty()) {
                bundle = null;
            }
            r3.A07.Bst(bundle);
        } catch (Throwable th) {
            lock.unlock();
            throw th;
        }
    }

    public final void A02() {
        if (this.A02 != 0) {
            return;
        }
        if (!this.A07 || this.A08) {
            ArrayList A0s = AnonymousClass001.A0s();
            this.A01 = 1;
            C1694389h r4 = this.A0F;
            Map map = r4.A09;
            this.A02 = map.size();
            Iterator A0i = C18280x3.A0i(map);
            while (A0i.hasNext()) {
                Object next = A0i.next();
                if (!r4.A0A.containsKey(next)) {
                    A0s.add(map.get(next));
                } else if (A06()) {
                    A01();
                }
            }
            if (!A0s.isEmpty()) {
                this.A0H.add(C1456076n.A00.submit(new AnonymousClass6R6(this, A0s)));
            }
        }
    }

    public final void A03(C127866Tp r6) {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(!r6.A01());
        C1694389h r0 = this.A0F;
        r0.A00(r6);
        r0.A07.Bsr(r6);
    }

    public final void A05(boolean z) {
        C187678xd r4 = this.A05;
        if (r4 != null) {
            if (r4.isConnected() && z) {
                AnonymousClass6RZ r0 = (AnonymousClass6RZ) r4;
                try {
                    C163107tH r3 = (C163107tH) r0.A02();
                    Integer num = r0.A02;
                    C162177rO.A02(num);
                    int intValue = num.intValue();
                    Parcel obtain = Parcel.obtain();
                    obtain.writeInterfaceToken(r3.A01);
                    obtain.writeInt(intValue);
                    r3.A00(7, obtain);
                } catch (RemoteException unused) {
                    Log.w("SignInClientImpl", "Remote service probably died when clearAccountFromSessionStore is called");
                }
            }
            r4.B1l();
            C162177rO.A02(this.A0G);
            this.A04 = null;
        }
    }

    public final boolean A06() {
        C127866Tp r2;
        int i = this.A02 - 1;
        this.A02 = i;
        if (i <= 0) {
            if (i < 0) {
                Log.w("GACConnecting", this.A0F.A05.A06());
                Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
                r2 = new C127866Tp(8, (PendingIntent) null);
            } else {
                r2 = this.A03;
                if (r2 == null) {
                    return true;
                }
                this.A0F.A00 = this.A00;
            }
            A03(r2);
        }
        return false;
    }

    public final boolean A07(int i) {
        String str;
        String str2;
        if (this.A01 == i) {
            return true;
        }
        Log.w("GACConnecting", this.A0F.A05.A06());
        AnonymousClass6C9.A13("Unexpected callback in ", toString(), "GACConnecting");
        AnonymousClass6C7.A1I("mRemainingConnections=", "GACConnecting", AnonymousClass001.A0o(), this.A02);
        int i2 = this.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleApiClient connecting is in step ");
        if (i2 != 0) {
            str = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        A0o.append(str);
        A0o.append(" but received callback for step ");
        if (i != 0) {
            str2 = "STEP_GETTING_REMOTE_SERVICE";
        } else {
            str2 = "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
        }
        A0o.append(str2);
        Log.e("GACConnecting", A0o.toString(), new Exception());
        A03(new C127866Tp(8, (PendingIntent) null));
        return false;
    }

    public final C127186Qz Bsq(C127186Qz r2) {
        this.A0F.A05.A0I.add(r2);
        return r2;
    }

    public final C127186Qz Bss(C127186Qz r2) {
        throw AnonymousClass001.A0e("GoogleApiClient is not connected yet.");
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.8xe, X.8xd] */
    public final void Bsx() {
        C1694389h r2 = this.A0F;
        r2.A0A.clear();
        this.A07 = false;
        this.A03 = null;
        this.A01 = 0;
        this.A06 = true;
        this.A08 = false;
        this.A09 = false;
        HashMap A0t = AnonymousClass001.A0t();
        Map map = this.A0I;
        Iterator A0i = C18280x3.A0i(map);
        while (A0i.hasNext()) {
            C148727Jm r6 = (C148727Jm) A0i.next();
            Map map2 = r2.A09;
            AnonymousClass72H r5 = r6.A01;
            Object obj = map2.get(r5);
            C162177rO.A02(obj);
            C187688xe r4 = (C187688xe) obj;
            boolean A1Z = AnonymousClass001.A1Z(map.get(r6));
            if (r4.Bjs()) {
                this.A07 = true;
                if (A1Z) {
                    this.A0J.add(r5);
                } else {
                    this.A06 = false;
                }
            }
            A0t.put(r4, new C1694789l(r6, this, A1Z));
        }
        if (this.A07) {
            AnonymousClass7P4 r9 = this.A0G;
            C162177rO.A02(r9);
            AnonymousClass6QU r42 = this.A0E;
            C162177rO.A02(r42);
            C127086Qo r1 = r2.A05;
            r9.A00 = Integer.valueOf(System.identityHashCode(r1));
            AnonymousClass897 r7 = new AnonymousClass897(this);
            this.A05 = r42.A00(this.A0B, r1.A06, r7, r7, r9, r9.A01);
        }
        this.A02 = r2.A09.size();
        this.A0H.add(C1456076n.A00.submit(new AnonymousClass6R6(this, (Map) A0t)));
    }

    public final void Bt0() {
    }

    public final void Bt5(int i) {
        A03(new C127866Tp(8, (PendingIntent) null));
    }

    public final boolean Bt6() {
        ArrayList arrayList = this.A0H;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        arrayList.clear();
        A05(true);
        this.A0F.A00((C127866Tp) null);
        return true;
    }

    public C1693989d(Context context, C158267jh r3, AnonymousClass6QU r4, C1694389h r5, AnonymousClass7P4 r6, Map map, Lock lock) {
        this.A0F = r5;
        this.A0G = r6;
        this.A0I = map;
        this.A0D = r3;
        this.A0E = r4;
        this.A0K = lock;
        this.A0B = context;
    }

    public final void A04(C127866Tp r5, C148727Jm r6, boolean z) {
        if ((!z || r5.A01() || this.A0D.A05((Context) null, (String) null, r5.A01) != null) && this.A03 == null) {
            this.A03 = r5;
            this.A00 = Integer.MAX_VALUE;
        }
        this.A0F.A0A.put(r6.A01, r5);
    }
}
