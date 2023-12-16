package X;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.SystemClock;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.Status;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7t7  reason: invalid class name and case insensitive filesystem */
public class C163007t7 implements Handler.Callback {
    public static C163007t7 A0F;
    public static final Status A0G = new Status(4, "Sign-out occurred while this API call was in progress.");
    public static final Status A0H = new Status(4, "The user must be signed in to make this API call.");
    public static final Object A0I = AnonymousClass002.A0D();
    public long A00 = 10000;
    public AnonymousClass6R3 A01 = null;
    public C127316Rm A02;
    public C187728xi A03;
    public boolean A04 = false;
    public final Context A05;
    public final Handler A06;
    public final AnonymousClass6Q8 A07;
    public final C157297i4 A08;
    public final Map A09 = new ConcurrentHashMap(5, 0.75f, 1);
    public final Set A0A = new C13570nO(0);
    public final Set A0B = new C13570nO(0);
    public final AtomicInteger A0C = new AtomicInteger(1);
    public final AtomicInteger A0D = new AtomicInteger(0);
    public volatile boolean A0E = true;

    public final void A06(AnonymousClass89B r12, C152017Xf r13, int i) {
        long currentTimeMillis;
        long elapsedRealtime;
        int i2 = i;
        if (i != 0) {
            C151727Wb r4 = r12.A06;
            if (A08()) {
                AnonymousClass6SP r1 = C160017mt.A00().A00;
                if (r1 != null) {
                    if (r1.A03) {
                        boolean z = r1.A04;
                        AnonymousClass89A r2 = (AnonymousClass89A) this.A09.get(r4);
                        if (r2 != null) {
                            C187688xe r14 = r2.A04;
                            if (r14 instanceof C160847oP) {
                                C160847oP r15 = (C160847oP) r14;
                                if (r15.A0Q != null && !r15.BHI()) {
                                    AnonymousClass6SQ A002 = AnonymousClass8BS.A00(r2, r15, i);
                                    if (A002 != null) {
                                        r2.A00++;
                                        z = A002.A03;
                                    } else {
                                        return;
                                    }
                                }
                            } else {
                                return;
                            }
                        }
                        if (!z) {
                            currentTimeMillis = 0;
                            elapsedRealtime = 0;
                            AnonymousClass8BS r3 = new AnonymousClass8BS(r4, this, i2, currentTimeMillis, elapsedRealtime);
                            AnonymousClass6YV r22 = r13.A00;
                            Handler handler = this.A06;
                            handler.getClass();
                            r22.addOnCompleteListener(new C173118Oj(handler), r3);
                        }
                    } else {
                        return;
                    }
                }
                currentTimeMillis = System.currentTimeMillis();
                elapsedRealtime = SystemClock.elapsedRealtime();
                AnonymousClass8BS r32 = new AnonymousClass8BS(r4, this, i2, currentTimeMillis, elapsedRealtime);
                AnonymousClass6YV r222 = r13.A00;
                Handler handler2 = this.A06;
                handler2.getClass();
                r222.addOnCompleteListener(new C173118Oj(handler2), r32);
            }
        }
    }

    public static Status A00(C127866Tp r6, C151727Wb r7) {
        String str = r7.A02.A02;
        C127866Tp r4 = r6;
        String valueOf = String.valueOf(r6);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("API: ");
        A0o.append(str);
        return new Status(r4.A02, r4, AnonymousClass000.A0V(" is not available on this device. Connection failed with: ", valueOf, A0o), 1, 17);
    }

    public static C163007t7 A01(Context context) {
        C163007t7 r3;
        HandlerThread handlerThread;
        synchronized (A0I) {
            r3 = A0F;
            if (r3 == null) {
                synchronized (C161367pV.A07) {
                    handlerThread = C161367pV.A05;
                    if (handlerThread == null) {
                        HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
                        C161367pV.A05 = handlerThread2;
                        handlerThread2.start();
                        handlerThread = C161367pV.A05;
                    }
                }
                r3 = new C163007t7(context.getApplicationContext(), handlerThread.getLooper(), AnonymousClass6Q8.A00);
                A0F = r3;
            }
        }
        return r3;
    }

    public static void A02() {
        synchronized (A0I) {
            C163007t7 r1 = A0F;
            if (r1 != null) {
                r1.A0D.incrementAndGet();
                Handler handler = r1.A06;
                handler.sendMessageAtFrontOfQueue(handler.obtainMessage(10));
            }
        }
    }

    public final AnonymousClass89A A03(AnonymousClass89B r4) {
        C151727Wb r2 = r4.A06;
        Map map = this.A09;
        AnonymousClass89A r1 = (AnonymousClass89A) map.get(r2);
        if (r1 == null) {
            r1 = new AnonymousClass89A(r4, this);
            map.put(r2, r1);
        }
        if (r1.A04.Bjs()) {
            this.A0B.add(r2);
        }
        r1.A03();
        return r1;
    }

    public final void A04() {
        C127316Rm r3 = this.A02;
        if (r3 != null) {
            if (r3.A01 > 0 || A08()) {
                C187728xi r2 = this.A03;
                if (r2 == null) {
                    r2 = new C127066Qm(this.A05, AnonymousClass890.A00);
                    this.A03 = r2;
                }
                r2.BJv(r3);
            }
            this.A02 = null;
        }
    }

    public final void A07(AnonymousClass6R3 r4) {
        synchronized (A0I) {
            if (this.A01 != r4) {
                this.A01 = r4;
                this.A0A.clear();
            }
            this.A0A.addAll(r4.A01);
        }
    }

    public final boolean A08() {
        AnonymousClass6SP r0;
        int i;
        if (this.A04 || (((r0 = C160017mt.A00().A00) != null && !r0.A03) || ((i = this.A08.A01.get(203400000, -1)) != -1 && i != 0))) {
            return false;
        }
        return true;
    }

    public final boolean A09(C127866Tp r9, int i) {
        PendingIntent activity;
        AnonymousClass6Q8 r4 = this.A07;
        Context context = this.A05;
        if (C155327eg.A00(context)) {
            return false;
        }
        if (r9.A01()) {
            activity = r9.A02;
        } else {
            Intent A052 = r4.A05(context, (String) null, r9.A01);
            if (A052 == null) {
                return false;
            }
            activity = PendingIntent.getActivity(context, 0, A052, C1456876w.A00 | 134217728);
        }
        if (activity == null) {
            return false;
        }
        int i2 = r9.A01;
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", activity);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", true);
        r4.A07(PendingIntent.getActivity(context, 0, intent, C1456476s.A00 | 134217728), context, i2);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0234, code lost:
        if (r1.A02 != false) goto L_0x0236;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0236, code lost:
        r1.A03();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0239, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0380, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r11) {
        /*
            r10 = this;
            int r5 = r11.what
            r8 = 13
            r1 = 300000(0x493e0, double:1.482197E-318)
            java.lang.String r4 = "GoogleApiManager"
            r6 = 17
            r7 = 0
            r3 = 1
            switch(r5) {
                case 1: goto L_0x0021;
                case 2: goto L_0x001a;
                case 3: goto L_0x004e;
                case 4: goto L_0x034c;
                case 5: goto L_0x006e;
                case 6: goto L_0x00d2;
                case 7: goto L_0x0122;
                case 8: goto L_0x034c;
                case 9: goto L_0x0219;
                case 10: goto L_0x012a;
                case 11: goto L_0x014c;
                case 12: goto L_0x019f;
                case 13: goto L_0x034c;
                case 14: goto L_0x01e4;
                case 15: goto L_0x01eb;
                case 16: goto L_0x023a;
                case 17: goto L_0x02c8;
                case 18: goto L_0x02cc;
                case 19: goto L_0x0387;
                default: goto L_0x0010;
            }
        L_0x0010:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Unknown message id: "
            X.AnonymousClass6C7.A1I(r0, r4, r1, r5)
            return r7
        L_0x001a:
            java.lang.String r0 = "zab"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x0021:
            java.lang.Object r0 = r11.obj
            boolean r0 = X.AnonymousClass001.A1Z(r0)
            if (r3 != r0) goto L_0x002b
            r1 = 10000(0x2710, double:4.9407E-320)
        L_0x002b:
            r10.A00 = r1
            android.os.Handler r6 = r10.A06
            r5 = 12
            r6.removeMessages(r5)
            java.util.Map r0 = r10.A09
            java.util.Iterator r4 = X.C18280x3.A0i(r0)
        L_0x003a:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r4.next()
            android.os.Message r2 = r6.obtainMessage(r5, r0)
            long r0 = r10.A00
            r6.sendMessageDelayed(r2, r0)
            goto L_0x003a
        L_0x004e:
            java.util.Map r0 = r10.A09
            java.util.Iterator r2 = X.AnonymousClass001.A0v(r0)
        L_0x0054:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0380
            java.lang.Object r1 = r2.next()
            X.89A r1 = (X.AnonymousClass89A) r1
            X.7t7 r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C162177rO.A01(r0)
            r0 = 0
            r1.A01 = r0
            r1.A03()
            goto L_0x0054
        L_0x006e:
            int r7 = r11.arg1
            java.lang.Object r2 = r11.obj
            X.6Tp r2 = (X.C127866Tp) r2
            java.util.Map r0 = r10.A09
            java.util.Iterator r1 = X.AnonymousClass001.A0v(r0)
        L_0x007a:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b4
            java.lang.Object r5 = r1.next()
            X.89A r5 = (X.AnonymousClass89A) r5
            int r0 = r5.A03
            if (r0 != r7) goto L_0x007a
            int r0 = r2.A01
            if (r0 != r8) goto L_0x00ad
            java.lang.String r4 = "CANCELED"
            java.lang.String r2 = r2.A03
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Error resolution was canceled by the user, original error message: "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ": "
            java.lang.String r1 = X.AnonymousClass000.A0V(r0, r2, r1)
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r6, r1)
        L_0x00a9:
            r5.A08(r0)
            return r3
        L_0x00ad:
            X.7Wb r0 = r5.A05
            com.google.android.gms.common.api.Status r0 = A00(r2, r0)
            goto L_0x00a9
        L_0x00b4:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Could not find API instance "
            r2.append(r0)
            r2.append(r7)
            java.lang.String r0 = " while trying to fail enqueued calls."
            r2.append(r0)
            java.lang.Exception r1 = new java.lang.Exception
            r1.<init>()
            java.lang.String r0 = r2.toString()
            android.util.Log.wtf(r4, r0, r1)
            return r3
        L_0x00d2:
            android.content.Context r4 = r10.A05
            android.content.Context r0 = r4.getApplicationContext()
            boolean r0 = r0 instanceof android.app.Application
            if (r0 == 0) goto L_0x0380
            android.content.Context r0 = r4.getApplicationContext()
            android.app.Application r0 = (android.app.Application) r0
            X.C162637sV.A00(r0)
            X.7sV r6 = X.C162637sV.A04
            X.89F r4 = new X.89F
            r4.<init>(r10)
            monitor-enter(r6)
            java.util.ArrayList r0 = r6.A01     // Catch:{ all -> 0x011f }
            r0.add(r4)     // Catch:{ all -> 0x011f }
            monitor-exit(r6)     // Catch:{ all -> 0x011f }
            java.util.concurrent.atomic.AtomicBoolean r5 = r6.A03
            boolean r0 = r5.get()
            if (r0 != 0) goto L_0x0114
            android.app.ActivityManager$RunningAppProcessInfo r4 = new android.app.ActivityManager$RunningAppProcessInfo
            r4.<init>()
            android.app.ActivityManager.getMyMemoryState(r4)
            boolean r0 = r5.getAndSet(r3)
            if (r0 != 0) goto L_0x0114
            int r4 = r4.importance
            r0 = 100
            if (r4 <= r0) goto L_0x0114
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            r0.set(r3)
        L_0x0114:
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A02
            boolean r0 = r0.get()
            if (r0 != 0) goto L_0x0380
            r10.A00 = r1
            return r3
        L_0x011f:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x011f }
            throw r0
        L_0x0122:
            java.lang.Object r0 = r11.obj
            X.89B r0 = (X.AnonymousClass89B) r0
            r10.A03(r0)
            return r3
        L_0x012a:
            java.util.Set r4 = r10.A0B
            java.util.Iterator r2 = r4.iterator()
        L_0x0130:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0148
            java.lang.Object r1 = r2.next()
            java.util.Map r0 = r10.A09
            java.lang.Object r0 = r0.remove(r1)
            X.89A r0 = (X.AnonymousClass89A) r0
            if (r0 == 0) goto L_0x0130
            r0.A04()
            goto L_0x0130
        L_0x0148:
            r4.clear()
            return r3
        L_0x014c:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r11.obj
            java.lang.Object r4 = r1.get(r0)
            X.89A r4 = (X.AnonymousClass89A) r4
            X.7t7 r5 = r4.A0C
            android.os.Handler r2 = r5.A06
            X.C162177rO.A01(r2)
            boolean r0 = r4.A02
            if (r0 == 0) goto L_0x0380
            r0 = 11
            X.7Wb r1 = r4.A05
            r2.removeMessages(r0, r1)
            r0 = 9
            r2.removeMessages(r0, r1)
            r4.A02 = r7
            X.6Q8 r2 = r5.A07
            android.content.Context r1 = r5.A05
            r0 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r1 = r2.A04(r1, r0)
            r0 = 18
            if (r1 != r0) goto L_0x019a
            r2 = 21
            java.lang.String r1 = "Connection timed out waiting for Google Play services update to complete."
        L_0x018a:
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r1)
            r4.A08(r0)
            X.8xe r1 = r4.A04
            java.lang.String r0 = "Timing out connection while resuming."
            r1.B1m(r0)
            return r3
        L_0x019a:
            r2 = 22
            java.lang.String r1 = "API failed to connect while resuming due to an unknown error."
            goto L_0x018a
        L_0x019f:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r11.obj
            java.lang.Object r4 = r1.get(r0)
            X.89A r4 = (X.AnonymousClass89A) r4
            X.7t7 r0 = r4.A0C
            android.os.Handler r0 = r0.A06
            X.C162177rO.A01(r0)
            X.8xe r2 = r4.A04
            boolean r0 = r2.isConnected()
            if (r0 == 0) goto L_0x0380
            java.util.Map r0 = r4.A09
            int r0 = r0.size()
            if (r0 != 0) goto L_0x0380
            X.7S7 r1 = r4.A06
            java.util.Map r0 = r1.A00
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01e0
            java.util.Map r0 = r1.A01
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x01e0
            java.lang.String r0 = "Timing out service connection."
            r2.B1m(r0)
            return r3
        L_0x01e0:
            r4.A02()
            return r3
        L_0x01e4:
            java.lang.String r0 = "zaa"
            java.lang.NullPointerException r0 = X.AnonymousClass001.A0g(r0)
            throw r0
        L_0x01eb:
            java.lang.Object r2 = r11.obj
            X.7Xx r2 = (X.C152187Xx) r2
            java.util.Map r1 = r10.A09
            X.7Wb r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0380
            X.7Wb r0 = r2.A01
            java.lang.Object r1 = r1.get(r0)
            X.89A r1 = (X.AnonymousClass89A) r1
            java.util.List r0 = r1.A08
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L_0x0380
            boolean r0 = r1.A02
            if (r0 != 0) goto L_0x0380
            X.8xe r0 = r1.A04
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L_0x0236
            r1.A00()
            return r3
        L_0x0219:
            java.util.Map r1 = r10.A09
            java.lang.Object r0 = r11.obj
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0380
            java.lang.Object r0 = r11.obj
            java.lang.Object r1 = r1.get(r0)
            X.89A r1 = (X.AnonymousClass89A) r1
            X.7t7 r0 = r1.A0C
            android.os.Handler r0 = r0.A06
            X.C162177rO.A01(r0)
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0380
        L_0x0236:
            r1.A03()
            return r3
        L_0x023a:
            java.lang.Object r2 = r11.obj
            X.7Xx r2 = (X.C152187Xx) r2
            java.util.Map r1 = r10.A09
            X.7Wb r0 = r2.A01
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0380
            X.7Wb r0 = r2.A01
            java.lang.Object r4 = r1.get(r0)
            X.89A r4 = (X.AnonymousClass89A) r4
            java.util.List r0 = r4.A08
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto L_0x0380
            X.7t7 r0 = r4.A0C
            android.os.Handler r1 = r0.A06
            r0 = 15
            r1.removeMessages(r0, r2)
            r0 = 16
            r1.removeMessages(r0, r2)
            X.6Tj r7 = r2.A00
            java.util.Queue r6 = r4.A0A
            int r0 = r6.size()
            java.util.ArrayList r5 = X.AnonymousClass002.A0I(r0)
            java.util.Iterator r8 = r6.iterator()
        L_0x0276:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x02ad
            java.lang.Object r1 = r8.next()
            X.7kO r1 = (X.C158687kO) r1
            boolean r0 = r1 instanceof X.AnonymousClass6RH
            if (r0 == 0) goto L_0x0276
            r2 = r1
            X.6RH r2 = (X.AnonymousClass6RH) r2
            boolean r0 = r2 instanceof X.AnonymousClass6RG
            if (r0 == 0) goto L_0x029f
            X.6RG r2 = (X.AnonymousClass6RG) r2
            X.7Sp r0 = r2.A01
            X.6Tj[] r0 = r0.A02
            if (r0 == 0) goto L_0x0276
            boolean r0 = X.AnonymousClass72L.A00(r7, r0)
            if (r0 == 0) goto L_0x0276
            r5.add(r1)
            goto L_0x0276
        L_0x029f:
            boolean r0 = r2 instanceof X.AnonymousClass6RE
            if (r0 == 0) goto L_0x0276
            X.6RE r2 = (X.AnonymousClass6RE) r2
            java.util.Map r1 = r4.A09
            X.7Vg r0 = r2.A00
            r1.get(r0)
            goto L_0x0276
        L_0x02ad:
            int r4 = r5.size()
            r2 = 0
        L_0x02b2:
            if (r2 >= r4) goto L_0x0380
            java.lang.Object r1 = r5.get(r2)
            X.7kO r1 = (X.C158687kO) r1
            r6.remove(r1)
            X.8SH r0 = new X.8SH
            r0.<init>(r7)
            r1.A02(r0)
            int r2 = r2 + 1
            goto L_0x02b2
        L_0x02c8:
            r10.A04()
            return r3
        L_0x02cc:
            java.lang.Object r5 = r11.obj
            X.7MI r5 = (X.AnonymousClass7MI) r5
            long r0 = r5.A02
            r8 = 0
            int r2 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r2 != 0) goto L_0x02fa
            int r2 = r5.A00
            X.6ST[] r1 = new X.AnonymousClass6ST[r3]
            X.6ST r0 = r5.A03
            java.util.List r0 = X.AnonymousClass0x9.A1A(r0, r1, r7)
            X.6Rm r4 = new X.6Rm
            r4.<init>(r0, r2)
            X.8xi r2 = r10.A03
            if (r2 != 0) goto L_0x02f6
            android.content.Context r1 = r10.A05
            X.890 r0 = X.AnonymousClass890.A00
            X.6Qm r2 = new X.6Qm
            r2.<init>(r1, r0)
            r10.A03 = r2
        L_0x02f6:
            r2.BJv(r4)
            return r3
        L_0x02fa:
            X.6Rm r0 = r10.A02
            if (r0 == 0) goto L_0x0318
            java.util.List r2 = r0.A00
            int r1 = r0.A01
            int r0 = r5.A00
            if (r1 != r0) goto L_0x0310
            if (r2 == 0) goto L_0x033a
            int r1 = r2.size()
            int r0 = r5.A01
            if (r1 < r0) goto L_0x033a
        L_0x0310:
            android.os.Handler r0 = r10.A06
            r0.removeMessages(r6)
            r10.A04()
        L_0x0318:
            X.6Rm r0 = r10.A02
            if (r0 != 0) goto L_0x0380
            java.util.ArrayList r2 = X.AnonymousClass001.A0s()
            X.6ST r0 = r5.A03
            r2.add(r0)
            int r1 = r5.A00
            X.6Rm r0 = new X.6Rm
            r0.<init>(r2, r1)
            r10.A02 = r0
            android.os.Handler r4 = r10.A06
            android.os.Message r2 = r4.obtainMessage(r6)
            long r0 = r5.A02
            r4.sendMessageDelayed(r2, r0)
            return r3
        L_0x033a:
            X.6Rm r2 = r10.A02
            X.6ST r1 = r5.A03
            java.util.List r0 = r2.A00
            if (r0 != 0) goto L_0x0348
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            r2.A00 = r0
        L_0x0348:
            r0.add(r1)
            goto L_0x0318
        L_0x034c:
            java.lang.Object r4 = r11.obj
            X.7Jp r4 = (X.C148757Jp) r4
            java.util.Map r1 = r10.A09
            X.89B r0 = r4.A01
            X.7Wb r0 = r0.A06
            java.lang.Object r2 = r1.get(r0)
            X.89A r2 = (X.AnonymousClass89A) r2
            if (r2 != 0) goto L_0x0364
            X.89B r0 = r4.A01
            X.89A r2 = r10.A03(r0)
        L_0x0364:
            X.8xe r0 = r2.A04
            boolean r0 = r0.Bjs()
            if (r0 == 0) goto L_0x0381
            java.util.concurrent.atomic.AtomicInteger r0 = r10.A0D
            int r1 = r0.get()
            int r0 = r4.A00
            if (r1 == r0) goto L_0x0381
            X.7kO r1 = r4.A02
            com.google.android.gms.common.api.Status r0 = A0G
            r1.A01(r0)
            r2.A04()
        L_0x0380:
            return r3
        L_0x0381:
            X.7kO r0 = r4.A02
            r2.A0A(r0)
            return r3
        L_0x0387:
            r10.A04 = r7
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163007t7.handleMessage(android.os.Message):boolean");
    }

    public C163007t7(Context context, Looper looper, AnonymousClass6Q8 r8) {
        this.A05 = context;
        C124806Dy r3 = new C124806Dy(looper, this);
        this.A06 = r3;
        this.A07 = r8;
        this.A08 = new C157297i4(r8);
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = C155557f6.A03;
        if (bool == null) {
            boolean z = false;
            if (C154017cR.A00() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            C155557f6.A03 = bool;
        }
        if (bool.booleanValue()) {
            this.A0E = false;
        }
        r3.sendMessage(r3.obtainMessage(6));
    }

    public final void A05(C127866Tp r4, int i) {
        if (!A09(r4, i)) {
            Handler handler = this.A06;
            handler.sendMessage(handler.obtainMessage(5, i, 0, r4));
        }
    }
}
