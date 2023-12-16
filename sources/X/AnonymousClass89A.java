package X;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.89A  reason: invalid class name */
public final class AnonymousClass89A implements C187778xn, C187788xo, C187698xf {
    public int A00 = 0;
    public C127866Tp A01 = null;
    public boolean A02;
    public final int A03;
    public final C187688xe A04;
    public final C151727Wb A05;
    public final AnonymousClass7S7 A06;
    public final AnonymousClass6YT A07;
    public final List A08 = AnonymousClass001.A0s();
    public final Map A09 = AnonymousClass001.A0t();
    public final Queue A0A = AnonymousClass0x9.A18();
    public final Set A0B = AnonymousClass002.A0K();
    public final /* synthetic */ C163007t7 A0C;

    public AnonymousClass89A(AnonymousClass89B r13, C163007t7 r14) {
        this.A0C = r14;
        Handler handler = r14.A06;
        Looper looper = handler.getLooper();
        AnonymousClass7MJ A012 = r13.A01();
        C13570nO r11 = A012.A00;
        AnonymousClass7P4 r6 = new AnonymousClass7P4(A012.A01, A012.A02, A012.A03, (Map) null, r11);
        AnonymousClass6QU r1 = r13.A04.A00;
        C162177rO.A02(r1);
        C187688xe A002 = r1.A00(r13.A01, looper, this, this, r6, r13.A03);
        String str = r13.A09;
        if (str != null && (A002 instanceof C160847oP)) {
            ((C160847oP) A002).A0R = str;
        }
        this.A04 = A002;
        this.A05 = r13.A06;
        this.A06 = new AnonymousClass7S7();
        this.A03 = r13.A00;
        if (A002.Bjs()) {
            Context context = r14.A05;
            AnonymousClass7MJ A013 = r13.A01();
            C13570nO r112 = A013.A00;
            this.A07 = new AnonymousClass6YT(context, handler, new AnonymousClass7P4(A013.A01, A013.A02, A013.A03, (Map) null, r112));
        }
    }

    public final void onConnectionFailed(C127866Tp r2) {
        A07(r2, (Exception) null);
    }

    public final void A00() {
        Queue queue = this.A0A;
        ArrayList A0J = AnonymousClass002.A0J(queue);
        int size = A0J.size();
        int i = 0;
        while (i < size) {
            C158687kO r1 = (C158687kO) A0J.get(i);
            if (this.A04.isConnected()) {
                if (A0C(r1)) {
                    queue.remove(r1);
                }
                i++;
            } else {
                return;
            }
        }
    }

    public final void A01() {
        Handler handler = this.A0C.A06;
        C162177rO.A01(handler);
        this.A01 = null;
        A06(C127866Tp.A04);
        if (this.A02) {
            C151727Wb r1 = this.A05;
            handler.removeMessages(11, r1);
            handler.removeMessages(9, r1);
            this.A02 = false;
        }
        Iterator A0v = AnonymousClass001.A0v(this.A09);
        while (A0v.hasNext()) {
            C148777Jr r0 = ((C148767Jq) A0v.next()).A00;
            try {
                r0.A02.A02.AwC(this.A04, new C152017Xf());
            } catch (DeadObjectException unused) {
                onConnectionSuspended(3);
                this.A04.B1m("DeadObjectException thrown while calling register listener method.");
            } catch (RemoteException unused2) {
                A0v.remove();
            }
        }
        A00();
        A02();
    }

    public final void A02() {
        C163007t7 r4 = this.A0C;
        Handler handler = r4.A06;
        C151727Wb r1 = this.A05;
        handler.removeMessages(12, r1);
        handler.sendMessageDelayed(handler.obtainMessage(12, r1), r4.A00);
    }

    /* JADX WARNING: type inference failed for: r0v12, types: [X.8xe, X.8xd] */
    public final void A03() {
        C163007t7 r5 = this.A0C;
        C162177rO.A01(r5.A06);
        C187688xe r4 = this.A04;
        if (!r4.isConnected() && !r4.BHI()) {
            try {
                int A002 = r5.A08.A00(r5.A05, r4);
                if (A002 != 0) {
                    C127866Tp r52 = new C127866Tp(A002, (PendingIntent) null);
                    String A0O = AnonymousClass000.A0O(r4);
                    String obj = r52.toString();
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("The service for ");
                    A0o.append(A0O);
                    A0o.append(" is not available: ");
                    A0o.append(obj);
                    AnonymousClass6C7.A1A(A0o, "GoogleApiManager");
                    A07(r52, (Exception) null);
                    return;
                }
                C1694889m r3 = new C1694889m(r4, this.A05, r5);
                if (r4.Bjs()) {
                    AnonymousClass6YT r8 = this.A07;
                    C162177rO.A02(r8);
                    C187678xd r0 = r8.A01;
                    if (r0 != null) {
                        r0.B1l();
                    }
                    AnonymousClass7P4 r10 = r8.A05;
                    r10.A00 = Integer.valueOf(System.identityHashCode(r8));
                    AnonymousClass6QU r53 = r8.A04;
                    Context context = r8.A02;
                    Handler handler = r8.A03;
                    r8.A01 = r53.A00(context, handler.getLooper(), r8, r8, r10, r10.A01);
                    r8.A00 = r3;
                    Set set = r8.A06;
                    if (set == null || set.isEmpty()) {
                        C172668Mf.A00(handler, r8, 28);
                    } else {
                        C160847oP r1 = (C160847oP) r8.A01;
                        r1.AzV(new C1694689k(r1));
                    }
                }
                try {
                    r4.AzV(r3);
                } catch (SecurityException e) {
                    A07(new C127866Tp(10), e);
                }
            } catch (IllegalStateException e2) {
                A07(new C127866Tp(10), e2);
            }
        }
    }

    public final void A04() {
        C162177rO.A01(this.A0C.A06);
        Status status = C163007t7.A0G;
        A08(status);
        this.A06.A00(status, false);
        for (C151557Vg r2 : (C151557Vg[]) this.A09.keySet().toArray(new C151557Vg[0])) {
            A0A(new AnonymousClass6RE(r2, new C152017Xf()));
        }
        A06(new C127866Tp(4));
        if (this.A04.isConnected()) {
            AnonymousClass7BN r22 = new AnonymousClass7BN(this);
            C172668Mf.A00(r22.A00.A0C.A06, r22, 27);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:5:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0067 A[LOOP:0: B:7:0x0061->B:9:0x0067, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A05(int r8) {
        /*
            r7 = this;
            X.7t7 r5 = r7.A0C
            android.os.Handler r4 = r5.A06
            X.C162177rO.A01(r4)
            r0 = 0
            r7.A01 = r0
            r0 = 1
            r7.A02 = r0
            X.7S7 r6 = r7.A06
            X.8xe r0 = r7.A04
            X.7oP r0 = (X.C160847oP) r0
            java.lang.String r2 = r0.A0S
            java.lang.String r0 = "The connection to Google Play services was lost"
            java.lang.StringBuilder r1 = X.C18330xA.A0A(r0)
            r3 = 1
            if (r8 != r3) goto L_0x0073
            java.lang.String r0 = " due to service disconnection."
        L_0x0020:
            r1.append(r0)
        L_0x0023:
            if (r2 == 0) goto L_0x002d
            java.lang.String r0 = " Last reason for disconnect: "
            r1.append(r0)
            r1.append(r2)
        L_0x002d:
            r2 = 20
            java.lang.String r1 = r1.toString()
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            r6.A00(r0, r3)
            r0 = 9
            X.7Wb r3 = r7.A05
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.sendMessageDelayed(r2, r0)
            r0 = 11
            android.os.Message r2 = android.os.Message.obtain(r4, r0, r3)
            r0 = 120000(0x1d4c0, double:5.9288E-319)
            r4.sendMessageDelayed(r2, r0)
            X.7i4 r0 = r5.A08
            android.util.SparseIntArray r0 = r0.A01
            r0.clear()
            java.util.Map r0 = r7.A09
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)
        L_0x0061:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r0 = r1.next()
            X.7Jq r0 = (X.C148767Jq) r0
            java.lang.Runnable r0 = r0.A02
            r0.run()
            goto L_0x0061
        L_0x0073:
            r0 = 3
            if (r8 != r0) goto L_0x0023
            java.lang.String r0 = " due to dead object exception."
            goto L_0x0020
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass89A.A05(int):void");
    }

    public final void A06(C127866Tp r4) {
        Set set = this.A0B;
        Iterator it = set.iterator();
        if (it.hasNext()) {
            it.next();
            if (AnonymousClass72K.A00(r4, C127866Tp.A04)) {
                C160847oP r1 = (C160847oP) this.A04;
                if (!r1.isConnected() || r1.A0B == null) {
                    throw AnonymousClass002.A0E("Failed to connect when checking package");
                }
            }
            throw AnonymousClass001.A0g("zac");
        }
        set.clear();
    }

    public final void A07(C127866Tp r9, Exception exc) {
        Status A002;
        C187678xd r0;
        C163007t7 r5 = this.A0C;
        Handler handler = r5.A06;
        C162177rO.A01(handler);
        AnonymousClass6YT r02 = this.A07;
        if (!(r02 == null || (r0 = r02.A01) == null)) {
            r0.B1l();
        }
        C162177rO.A01(handler);
        this.A01 = null;
        r5.A08.A01.clear();
        A06(r9);
        if ((this.A04 instanceof AnonymousClass6RS) && r9.A01 != 24) {
            r5.A04 = true;
            handler.sendMessageDelayed(handler.obtainMessage(19), 300000);
        }
        int i = r9.A01;
        if (i == 4) {
            A002 = C163007t7.A0H;
        } else {
            Queue queue = this.A0A;
            if (queue.isEmpty()) {
                this.A01 = r9;
                return;
            } else if (exc != null) {
                C162177rO.A01(handler);
                A09((Status) null, exc, false);
                return;
            } else {
                boolean z = r5.A0E;
                C151727Wb r1 = this.A05;
                if (z) {
                    A09(C163007t7.A00(r9, r1), (Exception) null, true);
                    if (!queue.isEmpty() && !A0B(r9) && !r5.A09(r9, this.A03)) {
                        if (i == 18) {
                            this.A02 = true;
                        }
                        if (this.A02) {
                            handler.sendMessageDelayed(Message.obtain(handler, 9, r1), 5000);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                A002 = C163007t7.A00(r9, r1);
            }
        }
        A08(A002);
    }

    public final void A08(Status status) {
        C162177rO.A01(this.A0C.A06);
        A09(status, (Exception) null, false);
    }

    public final void A09(Status status, Exception exc, boolean z) {
        C162177rO.A01(this.A0C.A06);
        boolean z2 = false;
        boolean z3 = true;
        if (status != null) {
            z3 = false;
        }
        if (exc == null) {
            z2 = true;
        }
        if (z3 != z2) {
            Iterator it = this.A0A.iterator();
            while (it.hasNext()) {
                C158687kO r2 = (C158687kO) it.next();
                if (!z || r2.A00 == 2) {
                    if (status != null) {
                        r2.A01(status);
                    } else {
                        r2.A02(exc);
                    }
                    it.remove();
                }
            }
            return;
        }
        throw AnonymousClass001.A0c("Status XOR exception should be null");
    }

    public final void A0A(C158687kO r3) {
        C162177rO.A01(this.A0C.A06);
        if (!this.A04.isConnected()) {
            this.A0A.add(r3);
            C127866Tp r1 = this.A01;
            if (r1 == null || !r1.A01()) {
                A03();
            } else {
                A07(r1, (Exception) null);
            }
        } else if (A0C(r3)) {
            A02();
        } else {
            this.A0A.add(r3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0038, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0B(X.C127866Tp r6) {
        /*
            r5 = this;
            java.lang.Object r4 = X.C163007t7.A0I
            monitor-enter(r4)
            X.7t7 r2 = r5.A0C     // Catch:{ all -> 0x003a }
            X.6R3 r0 = r2.A01     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0037
            java.util.Set r1 = r2.A0A     // Catch:{ all -> 0x003a }
            X.7Wb r0 = r5.A05     // Catch:{ all -> 0x003a }
            boolean r0 = r1.contains(r0)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x0037
            X.6R3 r3 = r2.A01     // Catch:{ all -> 0x003a }
            int r0 = r5.A03     // Catch:{ all -> 0x003a }
            X.7GK r2 = new X.7GK     // Catch:{ all -> 0x003a }
            r2.<init>(r6, r0)     // Catch:{ all -> 0x003a }
            java.util.concurrent.atomic.AtomicReference r1 = r3.A04     // Catch:{ all -> 0x003a }
        L_0x001e:
            r0 = 0
            boolean r0 = X.AnonymousClass0IR.A00(r0, r2, r1)     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x002e
            android.os.Handler r1 = r3.A00     // Catch:{ all -> 0x003a }
            r0 = 38
            X.AnonymousClass8MF.A00(r1, r3, r2, r0)     // Catch:{ all -> 0x003a }
        L_0x002c:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            goto L_0x0035
        L_0x002e:
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x003a }
            if (r0 == 0) goto L_0x001e
            goto L_0x002c
        L_0x0035:
            r0 = 1
            return r0
        L_0x0037:
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            r0 = 0
            return r0
        L_0x003a:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x003a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass89A.A0B(X.6Tp):boolean");
    }

    public final boolean A0C(C158687kO r21) {
        C152017Xf r0;
        AnonymousClass6RF r6;
        AnonymousClass6RG r62;
        Parcel parcel;
        int i;
        IBinder iBinder;
        IBinder iBinder2;
        int length;
        C127806Tj[] r14;
        C127806Tj r2;
        C158687kO r63 = r21;
        if (r63 instanceof AnonymousClass6RH) {
            AnonymousClass6RH r3 = (AnonymousClass6RH) r63;
            if (r3 instanceof AnonymousClass6RG) {
                C150887Sp r7 = ((AnonymousClass6RG) r3).A01;
                C127806Tj[] r11 = r7.A02;
                if (r11 != null && (length = r11.length) != 0) {
                    C187688xe r19 = this.A04;
                    AnonymousClass6TW r02 = ((C160847oP) r19).A0Q;
                    if (r02 == null) {
                        r14 = null;
                    } else {
                        r14 = r02.A03;
                    }
                    int i2 = 0;
                    if (r14 == null) {
                        r14 = new C127806Tj[0];
                    }
                    AnonymousClass05C r9 = new AnonymousClass05C(r13);
                    for (C127806Tj r15 : r14) {
                        String str = r15.A02;
                        long j = r15.A01;
                        if (j == -1) {
                            j = (long) r15.A00;
                        }
                        r9.put(str, Long.valueOf(j));
                    }
                    while (true) {
                        r2 = r11[i2];
                        Number number = (Number) r9.get(r2.A02);
                        if (number == null) {
                            break;
                        }
                        long longValue = number.longValue();
                        long j2 = r2.A01;
                        if (j2 == -1) {
                            j2 = (long) r2.A00;
                        }
                        if (longValue < j2) {
                            break;
                        }
                        i2++;
                        if (i2 >= length) {
                            break;
                        }
                    }
                    String A0O = AnonymousClass000.A0O(r19);
                    String str2 = r2.A02;
                    long j3 = r2.A01;
                    if (j3 == -1) {
                        j3 = (long) r2.A00;
                    }
                    StringBuilder A0l = AnonymousClass000.A0l(A0O);
                    A0l.append(" could not execute call because it requires feature (");
                    A0l.append(str2);
                    AnonymousClass001.A1M(A0l);
                    A0l.append(j3);
                    A0l.append(").");
                    AnonymousClass6C7.A1A(A0l, "GoogleApiManager");
                    C163007t7 r64 = this.A0C;
                    if (!r64.A0E || !r7.A01) {
                        r3.A02(new AnonymousClass8SH(r2));
                        return true;
                    }
                    C152187Xx r72 = new C152187Xx(r2, this.A05);
                    List list = this.A08;
                    int indexOf = list.indexOf(r72);
                    if (indexOf >= 0) {
                        Object obj = list.get(indexOf);
                        Handler handler = r64.A06;
                        handler.removeMessages(15, obj);
                        handler.sendMessageDelayed(Message.obtain(handler, 15, obj), 5000);
                        return false;
                    }
                    list.add(r72);
                    Handler handler2 = r64.A06;
                    handler2.sendMessageDelayed(Message.obtain(handler2, 15, r72), 5000);
                    handler2.sendMessageDelayed(Message.obtain(handler2, 16, r72), 120000);
                    C127866Tp r1 = new C127866Tp(2, (PendingIntent) null);
                    if (A0B(r1)) {
                        return false;
                    }
                    r64.A09(r1, this.A03);
                    return false;
                }
            } else if (r3 instanceof AnonymousClass6RE) {
                this.A09.get(((AnonymousClass6RE) r3).A00);
            }
        }
        AnonymousClass7S7 r8 = this.A06;
        C187688xe r32 = this.A04;
        boolean Bjs = r32.Bjs();
        boolean z = r63 instanceof AnonymousClass6RG;
        if (z) {
            C152017Xf r22 = ((AnonymousClass6RG) r63).A02;
            r8.A01.put(r22, Boolean.valueOf(Bjs));
            r22.A00.addOnCompleteListener(new AnonymousClass8BM(r8, r22));
        } else if (!(r63 instanceof AnonymousClass6RE) && !(r63 instanceof AnonymousClass6RD)) {
            C127186Qz r23 = ((AnonymousClass6RI) r63).A00;
            r8.A00.put(r23, Boolean.valueOf(Bjs));
            r23.A00(new AnonymousClass89C(r23, r8));
        }
        try {
            if (r63 instanceof AnonymousClass6RI) {
                AnonymousClass6RI r65 = (AnonymousClass6RI) r63;
                try {
                    r65.A00.A08(r32);
                    return true;
                } catch (RuntimeException e) {
                    r65.A02(e);
                    return true;
                }
            } else if (z) {
                r62 = (AnonymousClass6RG) r63;
                C150887Sp r82 = r62.A01;
                C152017Xf r12 = r62.A02;
                if (r82 instanceof AnonymousClass6R4) {
                    ((AnonymousClass6R4) r82).A00.A01.AwC(r32, r12);
                    return true;
                }
                AnonymousClass6R5 r83 = (AnonymousClass6R5) r82;
                r83.A00 = r12;
                C127996Uj r73 = (C127996Uj) ((C160847oP) r32).A02();
                if (r83 instanceof AnonymousClass6Q2) {
                    AnonymousClass6Q2 r84 = (AnonymousClass6Q2) r83;
                    C128046Uo r24 = new C128046Uo(r84, r84);
                    C127226Rd r13 = r84.A00;
                    parcel = Parcel.obtain();
                    parcel.writeInterfaceToken(r73.A01);
                    r13.writeToParcel(parcel, AnonymousClass6C8.A1Q(r24.asBinder(), parcel) ? 1 : 0);
                    i = 6;
                } else if (r83 instanceof AnonymousClass6Q0) {
                    AnonymousClass6Q0 r85 = (AnonymousClass6Q0) r83;
                    C128076Ur r25 = r85.A00;
                    C127326Rn r16 = r85.A00;
                    parcel = Parcel.obtain();
                    parcel.writeInterfaceToken(r73.A01);
                    if (r25 == null) {
                        iBinder2 = null;
                    } else {
                        iBinder2 = r25.asBinder();
                    }
                    r16.writeToParcel(parcel, AnonymousClass6C8.A1Q(iBinder2, parcel) ? 1 : 0);
                    i = 9;
                } else {
                    C126946Pz r86 = (C126946Pz) r83;
                    C128076Ur r26 = r86.A00;
                    C127336Ro r17 = r86.A00;
                    parcel = Parcel.obtain();
                    parcel.writeInterfaceToken(r73.A01);
                    if (r26 == null) {
                        iBinder = null;
                    } else {
                        iBinder = r26.asBinder();
                    }
                    r17.writeToParcel(parcel, AnonymousClass6C8.A1Q(iBinder, parcel) ? 1 : 0);
                    i = 5;
                }
                r73.A01(i, parcel);
                return true;
            } else {
                r6 = (AnonymousClass6RF) r63;
                if (r6 instanceof AnonymousClass6RE) {
                    AnonymousClass6RE r74 = (AnonymousClass6RE) r6;
                    C148767Jq r27 = (C148767Jq) this.A09.remove(r74.A00);
                    if (r27 != null) {
                        r27.A01.A01.A03.AwC(r32, r74.A00);
                        C148737Jn r18 = r27.A00.A01;
                        r18.A02 = null;
                        r18.A01 = null;
                        return true;
                    }
                    r74.A00.A02(Boolean.FALSE);
                    return true;
                }
                AnonymousClass6RD r03 = (AnonymousClass6RD) r6;
                C148767Jq r75 = r03.A00;
                C148777Jr r28 = r75.A00;
                r28.A02.A02.AwC(r32, r03.A00);
                C151557Vg r110 = r28.A01.A01;
                if (r110 != null) {
                    this.A09.put(r110, r75);
                    return true;
                }
                return true;
            }
        } catch (DeadObjectException e2) {
            r6.A01(C158687kO.A00(e2));
            throw e2;
        } catch (RemoteException e3) {
            r6.A01(C158687kO.A00(e3));
            return true;
        } catch (RuntimeException e4) {
            e = e4;
            r0 = r6.A00;
        } catch (DeadObjectException e5) {
            throw e5;
        } catch (RemoteException e6) {
            r62.A01(C158687kO.A00(e6));
            return true;
        } catch (RuntimeException e7) {
            e = e7;
            r0 = r62.A02;
        } catch (DeadObjectException unused) {
            onConnectionSuspended(1);
            r32.B1m("DeadObjectException thrown while running ApiCallRunner.");
            return true;
        }
        r0.A01(e);
        return true;
    }

    public final void onConnected(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A01();
        } else {
            C172668Mf.A00(handler, this, 26);
        }
    }

    public final void onConnectionSuspended(int i) {
        Looper myLooper = Looper.myLooper();
        Handler handler = this.A0C.A06;
        if (myLooper == handler.getLooper()) {
            A05(i);
        } else {
            handler.post(new C117705sM((Object) this, i, 2));
        }
    }
}
