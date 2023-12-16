package X;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.database.Cursor;
import android.location.Location;
import android.os.Handler;
import android.util.Pair;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob;
import com.whatsapp.jobqueue.job.SendLiveLocationKeyJob;
import com.whatsapp.location.FinalLiveLocationBroadcastReceiver;
import com.whatsapp.location.LocationSharingService;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.33o  reason: invalid class name and case insensitive filesystem */
public class C621233o {
    public int A00 = 0;
    public long A01 = 0;
    public C54942pX A02;
    public Long A03 = null;
    public Map A04;
    public Map A05;
    public final Handler A06 = AnonymousClass000.A0A();
    public final C56972sr A07;
    public final C49712gy A08;
    public final C42112Mv A09;
    public final C64773Ex A0A;
    public final C50862it A0B;
    public final C620633i A0C;
    public final C56612sH A0D;
    public final C54292oU A0E;
    public final C621133n A0F;
    public final C48972fm A0G;
    public final C28891hw A0H;
    public final C622534h A0I;
    public final C56472s2 A0J;
    public final C61222zu A0K;
    public final AnonymousClass4FS A0L;
    public final C183538qC A0M;
    public final C183538qC A0N;
    public final C183538qC A0O;
    public final Object A0P = AnonymousClass002.A0D();
    public final Object A0Q = AnonymousClass002.A0D();
    public final Object A0R = AnonymousClass002.A0D();
    public final Runnable A0S = new C71533cG((Object) this, 19);
    public final Runnable A0T = new C71533cG((Object) this, 18);
    public final HashSet A0U = AnonymousClass002.A0K();
    public final List A0V = AnonymousClass001.A0s();
    public final List A0W = AnonymousClass001.A0s();
    public final Map A0X = AnonymousClass001.A0t();
    public final Map A0Y = AnonymousClass001.A0t();
    public final Map A0Z = AnonymousClass001.A0t();
    public final Map A0a = AnonymousClass001.A0t();
    public final Map A0b = AnonymousClass001.A0t();

    public void A0J() {
        C54942pX r4;
        int i;
        synchronized (this) {
            r4 = this.A02;
        }
        if (r4 != null) {
            if (A0a()) {
                synchronized (this.A0R) {
                    Iterator A0v = AnonymousClass001.A0v(A0C());
                    boolean z = false;
                    while (A0v.hasNext()) {
                        AnonymousClass2QE r11 = (AnonymousClass2QE) A0v.next();
                        long j = r11.A01;
                        AnonymousClass2z0 r6 = r11.A02;
                        C30801n8 A082 = A08(r6);
                        if (!(A082 == null || j == 0)) {
                            C54942pX r9 = r11.A00;
                            if (r9 == null) {
                                r9 = A082.A02;
                                if (r9 != null) {
                                    r11.A00 = r9;
                                    z = true;
                                } else {
                                    long j2 = r4.A05;
                                    if (j >= j2 && j <= j2 + 240000) {
                                        r9 = new C54942pX(r4.A06);
                                        r11.A00 = r9;
                                        r9.A00(r4);
                                        this.A08.A02(new SendFinalLiveLocationNotificationJob(r6, r4, (int) C18280x3.A08(r4.A05, A082.A0K)));
                                        z = true;
                                    }
                                }
                            }
                            if (r9.A05 + C625635p.A0L < j) {
                                long j3 = r4.A05;
                                if (j >= j3 && j <= j3 + C625635p.A0L) {
                                    r9.A00(r4);
                                    this.A08.A02(new SendFinalLiveLocationNotificationJob(r6, r4, (int) C18280x3.A08(r4.A05, A082.A0K)));
                                    z = true;
                                }
                            }
                        }
                    }
                    if (z) {
                        A0O();
                    }
                }
                if (!A0a()) {
                    synchronized (this.A0P) {
                        i = (~1) & this.A00;
                        this.A00 = i;
                    }
                    if (i == 0) {
                        LocationSharingService.A02(this.A0E.A00);
                    }
                }
            }
            C71353by.A01(this.A0L, this, r4, 19);
            return;
        }
        Log.w("LocationSharingManager/sendLatestLocation/try to send location, but no location available");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
        r4 = r10.A0X;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
        monitor-enter(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        r8 = X.C56612sH.A08(r10);
        r7 = (android.util.Pair) r4.get(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005e, code lost:
        if (r7 == null) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0060, code lost:
        r0 = r8 - X.C18320x8.A05(r7.first);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006d, code lost:
        if (r0 >= 60000) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0075, code lost:
        if (X.AnonymousClass0x7.A05(r7.second) < r13) goto L_0x008a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r3 = X.AnonymousClass001.A0o();
        r3.append("LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource=");
        r3.append(r11);
        X.C18260x0.A12("; timeElapsed=", r3, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0088, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0089, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008a, code lost:
        r1 = X.AnonymousClass001.A0o();
        r1.append("LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource=");
        r1.append(r11);
        X.C18260x0.A0y("; retryCount=", r1, r13);
        r4.put(r11, X.C18300x5.A0E(java.lang.Long.valueOf(r8), r13));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00a6, code lost:
        monitor-exit(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00a7, code lost:
        r3 = r10.A0K.A02;
        r5 = new X.AnonymousClass39V[3];
        r7 = X.AnonymousClass39V.A0F(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_ID, r3.A03(), r5);
        r5[1] = new X.AnonymousClass39V((com.whatsapp.jid.Jid) r11, "to");
        r5[2] = new X.AnonymousClass39V(androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "location");
        r4 = new X.AnonymousClass36K[2];
        r2 = new X.AnonymousClass39V[1];
        X.AnonymousClass39V.A0B("retry", java.lang.String.valueOf(r13), r2, r7 ? 1 : 0);
        X.AnonymousClass36K.A0U("request", r2, r4, r7);
        X.AnonymousClass36K.A0T("registration", r12, r4, 1);
        r3.A0G(X.AnonymousClass36K.A0F(X.AnonymousClass36K.A0J("encrypt", (X.AnonymousClass39V[]) null, r4), "notification", r5), 125);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00fd, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0U(com.whatsapp.jid.UserJid r11, byte[] r12, int r13) {
        /*
            r10 = this;
            r0 = 4
            if (r13 <= r0) goto L_0x0015
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = "; retryCount="
            X.C18260x0.A0z(r0, r1, r13)
            return
        L_0x0015:
            java.lang.Object r4 = r10.A0Q
            monitor-enter(r4)
            java.util.Map r0 = r10.A0B()     // Catch:{ all -> 0x0101 }
            java.util.Iterator r3 = X.AnonymousClass000.A0q(r0)     // Catch:{ all -> 0x0101 }
            r2 = 0
        L_0x0021:
            boolean r0 = r3.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0043
            java.lang.Object r0 = X.AnonymousClass0x2.A0W(r3)     // Catch:{ all -> 0x0101 }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ all -> 0x0101 }
            java.util.Iterator r1 = X.C18280x3.A0i(r0)     // Catch:{ all -> 0x0101 }
        L_0x0031:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0021
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)     // Catch:{ all -> 0x0101 }
            boolean r0 = r11.equals(r0)     // Catch:{ all -> 0x0101 }
            if (r0 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0021
        L_0x0043:
            if (r2 != 0) goto L_0x0050
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0101 }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/should not receive location updates from this user; jid="
            X.C18260x0.A1R(r1, r0, r11)     // Catch:{ all -> 0x0101 }
            monitor-exit(r4)     // Catch:{ all -> 0x0101 }
            return
        L_0x0050:
            monitor-exit(r4)     // Catch:{ all -> 0x0101 }
            java.util.Map r4 = r10.A0X
            monitor-enter(r4)
            long r8 = X.C56612sH.A08(r10)     // Catch:{ all -> 0x00fe }
            java.lang.Object r7 = r4.get(r11)     // Catch:{ all -> 0x00fe }
            android.util.Pair r7 = (android.util.Pair) r7     // Catch:{ all -> 0x00fe }
            if (r7 == 0) goto L_0x008a
            java.lang.Object r0 = r7.first     // Catch:{ all -> 0x00fe }
            long r2 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x00fe }
            long r0 = r8 - r2
            r5 = 60000(0xea60, double:2.9644E-319)
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 >= 0) goto L_0x008a
            java.lang.Object r2 = r7.second     // Catch:{ all -> 0x00fe }
            int r2 = X.AnonymousClass0x7.A05(r2)     // Catch:{ all -> 0x00fe }
            if (r2 < r13) goto L_0x008a
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "LocationSharingManager/sendLocationKeyRetryRequest/retry too soon; remote_resource="
            r3.append(r2)     // Catch:{ all -> 0x00fe }
            r3.append(r11)     // Catch:{ all -> 0x00fe }
            java.lang.String r2 = "; timeElapsed="
            X.C18260x0.A12(r2, r3, r0)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            return
        L_0x008a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "LocationSharingManager/sendLocationKeyRetryRequest/send; remote_resource="
            r1.append(r0)     // Catch:{ all -> 0x00fe }
            r1.append(r11)     // Catch:{ all -> 0x00fe }
            java.lang.String r0 = "; retryCount="
            X.C18260x0.A0y(r0, r1, r13)     // Catch:{ all -> 0x00fe }
            java.lang.Long r0 = java.lang.Long.valueOf(r8)     // Catch:{ all -> 0x00fe }
            android.util.Pair r0 = X.C18300x5.A0E(r0, r13)     // Catch:{ all -> 0x00fe }
            r4.put(r11, r0)     // Catch:{ all -> 0x00fe }
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            X.2zu r0 = r10.A0K
            X.31C r3 = r0.A02
            java.lang.String r1 = r3.A03()
            r0 = 3
            X.39V[] r5 = new X.AnonymousClass39V[r0]
            java.lang.String r0 = "id"
            boolean r7 = X.AnonymousClass39V.A0F(r0, r1, r5)
            java.lang.String r1 = "to"
            X.39V r0 = new X.39V
            r0.<init>((com.whatsapp.jid.Jid) r11, (java.lang.String) r1)
            r6 = 1
            r5[r6] = r0
            java.lang.String r2 = "type"
            java.lang.String r0 = "location"
            X.39V r1 = new X.39V
            r1.<init>((java.lang.String) r2, (java.lang.String) r0)
            r0 = 2
            r5[r0] = r1
            X.36K[] r4 = new X.AnonymousClass36K[r0]
            X.39V[] r2 = new X.AnonymousClass39V[r6]
            java.lang.String r1 = "retry"
            java.lang.String r0 = java.lang.String.valueOf(r13)
            X.AnonymousClass39V.A0B(r1, r0, r2, r7)
            java.lang.String r0 = "request"
            X.AnonymousClass36K.A0U(r0, r2, r4, r7)
            java.lang.String r0 = "registration"
            r1 = 0
            X.AnonymousClass36K.A0T(r0, r12, r4, r6)
            java.lang.String r0 = "encrypt"
            X.36K r1 = X.AnonymousClass36K.A0J(r0, r1, r4)
            java.lang.String r0 = "notification"
            X.36K r1 = X.AnonymousClass36K.A0F(r1, r0, r5)
            r0 = 125(0x7d, float:1.75E-43)
            r3.A0G(r1, r0)
            return
        L_0x00fe:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00fe }
            throw r0
        L_0x0101:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0101 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0U(com.whatsapp.jid.UserJid, byte[], int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0059, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005b, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0e(com.whatsapp.jid.UserJid r9, int r10) {
        /*
            r8 = this;
            r0 = 4
            r7 = 0
            if (r10 <= r0) goto L_0x0016
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/reached max retry; remote_resource="
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = "; retryCount="
            X.C18260x0.A0z(r0, r1, r10)
            return r7
        L_0x0016:
            java.lang.Object r5 = r8.A0R
            monitor-enter(r5)
            java.util.Set r0 = r8.A0D()     // Catch:{ all -> 0x005d }
            boolean r0 = r0.contains(r9)     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0058
            long r1 = X.C56612sH.A08(r8)     // Catch:{ all -> 0x005f }
            java.util.Map r0 = r8.A0Y     // Catch:{ all -> 0x005f }
            java.lang.Object r6 = r0.get(r9)     // Catch:{ all -> 0x005f }
            android.util.Pair r6 = (android.util.Pair) r6     // Catch:{ all -> 0x005f }
            if (r6 == 0) goto L_0x005a
            java.lang.Object r0 = r6.first     // Catch:{ all -> 0x005f }
            long r3 = X.C18320x8.A05(r0)     // Catch:{ all -> 0x005f }
            long r1 = r1 - r3
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x005a
            java.lang.Object r0 = r6.second     // Catch:{ all -> 0x005f }
            int r0 = X.AnonymousClass0x7.A05(r0)     // Catch:{ all -> 0x005f }
            if (r0 < r10) goto L_0x005a
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "LocationSharingManager/shouldUserGetLocationKeyRetry/retry too soon; remote_resource="
            r3.append(r0)     // Catch:{ all -> 0x005f }
            r3.append(r9)     // Catch:{ all -> 0x005f }
            java.lang.String r0 = "; timeElapsed="
            X.C18260x0.A12(r0, r3, r1)     // Catch:{ all -> 0x005f }
        L_0x0058:
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            return r7
        L_0x005a:
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            r0 = 1
            return r0
        L_0x005d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x005f }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0e(com.whatsapp.jid.UserJid, int):boolean");
    }

    public static final C54942pX A00(UserJid userJid, AnonymousClass1EU r7, C30801n8 r8) {
        C21921Dr r5 = r7.liveLocationMessage_;
        if (r5 == null) {
            r5 = C21921Dr.DEFAULT_INSTANCE;
        }
        C54942pX r4 = new C54942pX(userJid);
        r4.A00 = r5.degreesLatitude_;
        r4.A01 = r5.degreesLongitude_;
        r4.A03 = r5.accuracyInMeters_;
        int i = r5.bitField0_;
        if ((i & 8) != 0) {
            float f = r5.speedInMps_;
            if (!Float.isNaN(f)) {
                r4.A02 = f;
            }
        }
        r4.A04 = r5.degreesClockwiseFromMagneticNorth_;
        if (!((i & 128) == 0 || r8 == null)) {
            r4.A05 = r8.A0K + C18290x4.A0A(r5.timeOffset_);
        }
        return r4;
    }

    public static boolean A02(long j, long j2) {
        if (j == 0 || j > j2) {
            return true;
        }
        return false;
    }

    public final long A03() {
        long j;
        synchronized (this.A0R) {
            C183538qC r8 = this.A0O;
            long A0A2 = AnonymousClass0x2.A0A(C18270x1.A05(r8), "live_location_sequence_number");
            long A0D2 = this.A0D.A0D() * 1000;
            if (A0D2 > A0A2) {
                C18260x0.A12("LocationSharingManager/getNextSequenceNumber; got a new sequence number; currentSequenceNumber=", AnonymousClass001.A0o(), A0D2);
                A0A2 = A0D2;
            }
            j = A0A2 + 1;
            C18260x0.A0M(C18320x8.A0J(r8), "live_location_sequence_number", j);
        }
        return j;
    }

    public long A04(C95814uZ r4) {
        synchronized (this.A0R) {
            AnonymousClass2QE r0 = (AnonymousClass2QE) A0C().get(r4);
            if (r0 == null) {
                return -1;
            }
            long j = r0.A01;
            return j;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A05(X.C30801n8 r5) {
        /*
            r4 = this;
            java.lang.Object r3 = r4.A0Q
            monitor-enter(r3)
            java.util.Map r1 = r4.A0B()     // Catch:{ all -> 0x002d }
            X.2z0 r2 = r5.A1J     // Catch:{ all -> 0x002d }
            X.4uZ r0 = r2.A00     // Catch:{ all -> 0x002d }
            java.util.Map r1 = X.AnonymousClass0x9.A1B(r0, r1)     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0029
            com.whatsapp.jid.UserJid r0 = r5.A0o()     // Catch:{ all -> 0x002d }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x002d }
            X.2OP r1 = (X.AnonymousClass2OP) r1     // Catch:{ all -> 0x002d }
            if (r1 == 0) goto L_0x0029
            X.2z0 r0 = r1.A02     // Catch:{ all -> 0x002d }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x002d }
            if (r0 == 0) goto L_0x0029
            long r0 = r1.A00     // Catch:{ all -> 0x002d }
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            return r0
        L_0x0029:
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            r0 = -1
            return r0
        L_0x002d:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A05(X.1n8):long");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public long A06(X.C30801n8 r5) {
        /*
            r4 = this;
            X.2z0 r3 = r5.A1J
            X.4uZ r1 = X.AnonymousClass2z0.A01(r3)
            java.lang.Object r2 = r4.A0R
            monitor-enter(r2)
            java.util.Map r0 = r4.A0C()     // Catch:{ all -> 0x0025 }
            java.lang.Object r1 = r0.get(r1)     // Catch:{ all -> 0x0025 }
            X.2QE r1 = (X.AnonymousClass2QE) r1     // Catch:{ all -> 0x0025 }
            if (r1 == 0) goto L_0x0021
            X.2z0 r0 = r1.A02     // Catch:{ all -> 0x0025 }
            boolean r0 = r0.equals(r3)     // Catch:{ all -> 0x0025 }
            if (r0 == 0) goto L_0x0021
            long r0 = r1.A01     // Catch:{ all -> 0x0025 }
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            return r0
        L_0x0021:
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            r0 = -1
            return r0
        L_0x0025:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0025 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A06(X.1n8):long");
    }

    public final C45442a1 A07(AnonymousClass1EU r5) {
        return new C45442a1(this.A0F.A07(C54422oh.A00(AnonymousClass36G.A02(C56972sr.A02(this.A07)), C135156kD.A00), r5.A0F()).A02, 2, 3);
    }

    public final C30801n8 A08(AnonymousClass2z0 r4) {
        C624134x A052 = ((C55832qz) this.A0N.get()).A05(r4);
        if (!(A052 instanceof C30801n8) || A052.A1N) {
            return null;
        }
        return (C30801n8) A052;
    }

    public List A09() {
        ArrayList A0J2;
        synchronized (this.A0R) {
            A0C();
            Set A0D2 = A0D();
            A0D2.removeAll(this.A0U);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingManager/getJidsNeedingSenderKey; jids.size=");
            C18260x0.A1G(A0o, A0D2.size());
            A0J2 = AnonymousClass002.A0J(A0D2);
        }
        return A0J2;
    }

    public final Map A0B() {
        Map map;
        Cursor A012;
        AnonymousClass2H1 r0;
        synchronized (this.A0Q) {
            if (this.A04 == null) {
                Map map2 = this.A0b;
                C56472s2 r8 = this.A0J;
                long currentTimeMillis = System.currentTimeMillis();
                HashMap A0t = AnonymousClass001.A0t();
                try {
                    AnonymousClass4GK A0B2 = r8.A00.get();
                    try {
                        A012 = C56862sg.A01(((AnonymousClass3H0) A0B2).A03, C39032Ak.A00, "getAllUserLocations/QUERY_LOCATION_CACHE");
                        while (A012.moveToNext()) {
                            UserJid A002 = AnonymousClass32Y.A00(A012, 0);
                            if (A002 == null) {
                                r0 = null;
                            } else {
                                r0 = new AnonymousClass2H1(A012, A002);
                            }
                            if (r0 != null) {
                                C54942pX r1 = r0.A00;
                                A0t.put(r1.A06, r1);
                            }
                        }
                        A012.close();
                        A0B2.close();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append(AnonymousClass0x7.A0A("LocationSharingStore/getAllUserLocations/returned ", A0o, A0t));
                        C18260x0.A13(" user locations sharer | time: ", A0o, currentTimeMillis);
                        map2.putAll(A0t);
                        HashSet A0s = C18310x6.A0s(map2);
                        this.A04 = AnonymousClass001.A0t();
                        r8.A01(C56612sH.A08(this), false);
                        List<C58712vh> A003 = r8.A00(0, false);
                        HashMap A0t2 = AnonymousClass001.A0t();
                        for (C58712vh r3 : A003) {
                            C95814uZ r12 = r3.A01;
                            if (!A0t2.containsKey(r12)) {
                                A0t2.put(r12, AnonymousClass001.A0t());
                            }
                            UserJid userJid = r3.A02;
                            ((Map) A0t2.get(r12)).put(userJid, new AnonymousClass2OP(userJid, r3.A03, r3.A00));
                        }
                        HashSet A0K2 = AnonymousClass002.A0K();
                        Iterator A11 = C18290x4.A11(A0t2);
                        while (A11.hasNext()) {
                            C95814uZ A0P2 = C18300x5.A0P(A11);
                            if (this.A0A.A09(A0P2) != null) {
                                if (!this.A04.containsKey(A0P2)) {
                                    this.A04.put(A0P2, AnonymousClass001.A0t());
                                }
                                Map map3 = (Map) A0t2.get(A0P2);
                                C626936e.A06(map3);
                                Map A1B = AnonymousClass0x9.A1B(A0P2, this.A04);
                                C626936e.A06(A1B);
                                Iterator A0i = C18280x3.A0i(map3);
                                while (A0i.hasNext()) {
                                    UserJid A0T2 = C18310x6.A0T(A0i);
                                    A1B.put(A0T2, (AnonymousClass2OP) map3.get(A0T2));
                                    A0s.remove(A0T2);
                                }
                            } else {
                                A0K2.add(A0P2);
                            }
                        }
                        if (!A0K2.isEmpty()) {
                            r8.A04(A0K2, false);
                        }
                        if (!A0s.isEmpty()) {
                            r8.A05(A0s);
                        }
                        A0N();
                    } catch (Throwable th) {
                        A0B2.close();
                        throw th;
                    }
                } catch (Exception e) {
                    throw C18310x6.A0i("LocationSharingStore/getAllUserLocations/error getting user locations", e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            map = this.A04;
        }
        return map;
        throw th;
    }

    public final Map A0C() {
        Map map;
        Cursor A0E2;
        synchronized (this.A0R) {
            if (this.A05 == null) {
                this.A05 = AnonymousClass001.A0t();
                C56612sH r6 = this.A0D;
                long A0H2 = r6.A0H();
                C56472s2 r5 = this.A0J;
                r5.A01(A0H2 - 604800000, true);
                List<C58712vh> A002 = r5.A00(r6.A0H(), true);
                HashMap hashMap = new HashMap(A002.size());
                for (C58712vh r8 : A002) {
                    C95814uZ r9 = r8.A01;
                    if (!hashMap.containsKey(r9)) {
                        hashMap.put(r9, new AnonymousClass2QE(r8.A03, (List) null, r8.A00));
                    }
                    if (r8.A03.equals(((AnonymousClass2QE) C18290x4.A0i(r9, hashMap)).A02)) {
                        ((AnonymousClass2QE) hashMap.get(r9)).A03.add(r8.A02);
                    }
                }
                HashSet A0K2 = AnonymousClass002.A0K();
                Iterator A11 = C18290x4.A11(hashMap);
                while (A11.hasNext()) {
                    C95814uZ A0P2 = C18300x5.A0P(A11);
                    if (this.A0A.A09(A0P2) != null) {
                        this.A05.put(A0P2, (AnonymousClass2QE) hashMap.get(A0P2));
                    } else {
                        A0K2.add(A0P2);
                    }
                }
                if (!A0K2.isEmpty()) {
                    r5.A04(A0K2, true);
                }
                HashSet hashSet = this.A0U;
                long currentTimeMillis = System.currentTimeMillis();
                HashSet A0K3 = AnonymousClass002.A0K();
                try {
                    AnonymousClass4GK A0B2 = r5.A00.get();
                    try {
                        A0E2 = ((AnonymousClass3H0) A0B2).A03.A0E("SELECT jid FROM location_key_distribution WHERE sent_to_server = ?", "getAllLocationReceiverHasKey/QUERY_LOCATION_KEY_DISTRIBUTION", new String[]{"1"});
                        int A012 = AnonymousClass0x9.A01(A0E2);
                        while (A0E2.moveToNext()) {
                            AnonymousClass32Y.A0C(UserJid.Companion, A0E2.getString(A012), A0K3);
                        }
                        A0E2.close();
                        A0B2.close();
                        StringBuilder A0o = AnonymousClass001.A0o();
                        C18260x0.A19("LocationSharingStore/getAllLocationReceiverHasKey/returned ", A0o, A0K3);
                        C18260x0.A13(" location receivers has key | time: ", A0o, currentTimeMillis);
                        hashSet.addAll(A0K3);
                        HashSet A15 = AnonymousClass0x9.A15(hashSet);
                        A15.removeAll(A0D());
                        if (!A15.isEmpty()) {
                            A0I();
                        }
                        A0O();
                    } catch (Throwable th) {
                        A0B2.close();
                        throw th;
                    }
                } catch (Exception e) {
                    throw C18310x6.A0i("LocationSharingStore/getAllLocationReceiverHasKey/error reading database", e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            map = this.A05;
        }
        return map;
        throw th;
    }

    public void A0E() {
        Log.i("LocationSharingManager/cancelShareLocation");
        synchronized (this.A0R) {
            Iterator it = AnonymousClass002.A0J(A0C().keySet()).iterator();
            while (it.hasNext()) {
                A0Q(C18300x5.A0P(it));
            }
        }
    }

    public void A0F() {
        Log.d("LocationSharingManager/checkIfNeedToSendFinalLiveLocationUpdate");
        if (A0a()) {
            boolean z = true;
            Object obj = this.A0P;
            synchronized (obj) {
                if ((this.A00 & 1) != 1) {
                    z = false;
                }
            }
            if (!z) {
                Context context = this.A0E.A00;
                Log.d("LocationSharingService/start-location-reporting");
                LocationSharingService.A03(context, AnonymousClass0x9.A08(context, LocationSharingService.class).setAction("com.whatsapp.ShareLocationService.START_LOCATION_REPORTING").putExtra("duration", 40000));
                synchronized (obj) {
                    this.A00 = 1 | this.A00;
                }
            }
        }
    }

    public void A0H() {
        Log.i("LocationSharingManager/onStopLocationReporting");
        synchronized (this.A0P) {
            this.A00 = (~2) & this.A00;
        }
        LocationSharingService.A02(this.A0E.A00);
    }

    public void A0I() {
        C85284Fq A0C2;
        Log.i("LocationSharingManager/removeMyLocationSenderKey");
        C54562ov A022 = AnonymousClass36G.A02(C56972sr.A02(this.A07));
        synchronized (this.A0R) {
            if (this.A0F.A0X()) {
                C71353by.A01(this.A0L, this, A022, 20);
            } else {
                C48972fm.A02(this.A0G, new C71353by(this, 10, A022));
            }
            this.A0U.clear();
            this.A0a.clear();
            try {
                A0C2 = this.A0J.A00.A0C();
                int A072 = ((AnonymousClass3H0) A0C2).A03.A07("location_key_distribution", (String) null, "deleteAllLocationReceiverHasKey/DELETE_LOCATION_KEY_DISTRIBUTION", (String[]) null);
                A0C2.close();
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("LocationSharingStore/deleteAllLocationReceiverHasKey/deleted ");
                A0o.append(A072);
                C18260x0.A1L(A0o, " rows");
            } catch (Exception e) {
                throw C18310x6.A0i("LocationSharingStore/deleteAllLocationReceiverHasKey/delete failed", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        C42112Mv r1 = this.A09;
        new AnonymousClass2US();
        r1.A00.A00();
        return;
        throw th;
    }

    public final void A0K() {
        Context context = this.A0E.A00;
        PendingIntent A012 = C624735e.A01(context, 0, AnonymousClass0x9.A08(context, FinalLiveLocationBroadcastReceiver.class), 536870912);
        if (A012 != null) {
            AlarmManager A072 = this.A0C.A07();
            if (A072 != null) {
                A072.cancel(A012);
            } else {
                Log.w("LocationSharingManager/cancelFinalLiveLocationUpdateAlarm/AlarmManager is null");
            }
            A012.cancel();
        }
    }

    public final void A0M() {
        synchronized (this.A0R) {
            Set A0D2 = A0D();
            HashSet A15 = AnonymousClass0x9.A15(this.A0U);
            A15.removeAll(A0D2);
            if (!A15.isEmpty()) {
                A0I();
            }
        }
    }

    public final void A0N() {
        Long l;
        Handler handler = this.A06;
        Runnable runnable = this.A0S;
        handler.removeCallbacks(runnable);
        synchronized (this.A0Q) {
            Iterator A0v = AnonymousClass001.A0v(A0B());
            l = null;
            while (A0v.hasNext()) {
                Iterator A0v2 = AnonymousClass001.A0v((Map) A0v.next());
                while (A0v2.hasNext()) {
                    AnonymousClass2OP r5 = (AnonymousClass2OP) A0v2.next();
                    if (l == null || r5.A00 < l.longValue()) {
                        l = Long.valueOf(r5.A00);
                    }
                }
            }
        }
        if (l != null) {
            long A082 = C56612sH.A08(this);
            long longValue = l.longValue();
            if (longValue > A082) {
                handler.postDelayed(runnable, longValue - A082);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006a, code lost:
        if (r0 < r22.longValue()) goto L_0x006c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d3  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0122  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0O() {
        /*
            r32 = this;
            r10 = r32
            android.os.Handler r0 = r10.A06
            r31 = r0
            java.lang.Runnable r0 = r10.A0T
            r30 = r0
            r1 = r31
            r1.removeCallbacks(r0)
            X.2sH r0 = r10.A0D
            r29 = r0
            long r8 = r29.A0H()
            X.8qC r0 = r10.A0O
            r28 = r0
            android.content.SharedPreferences r1 = X.C18270x1.A05(r28)
            java.lang.String r27 = "live_location_sharing_session_total_time"
            r6 = 0
            r0 = r27
            long r25 = r1.getLong(r0, r6)
            android.content.SharedPreferences r1 = X.C18270x1.A05(r28)
            java.lang.String r24 = "live_location_sharing_session_start_time"
            r0 = r24
            long r13 = r1.getLong(r0, r6)
            android.content.SharedPreferences r1 = X.C18270x1.A05(r28)
            java.lang.String r23 = "live_location_sharing_session_end_time"
            r0 = r23
            long r20 = r1.getLong(r0, r6)
            java.lang.Object r15 = r10.A0R
            monitor-enter(r15)
            java.util.Map r0 = r10.A0C()     // Catch:{ all -> 0x0181 }
            java.util.Iterator r19 = X.AnonymousClass001.A0v(r0)     // Catch:{ all -> 0x0181 }
            r18 = 0
            r22 = r18
            r4 = 0
            r2 = 0
        L_0x0054:
            boolean r0 = r19.hasNext()     // Catch:{ all -> 0x0181 }
            if (r0 == 0) goto L_0x00a6
            java.lang.Object r12 = r19.next()     // Catch:{ all -> 0x0181 }
            X.2QE r12 = (X.AnonymousClass2QE) r12     // Catch:{ all -> 0x0181 }
            if (r22 == 0) goto L_0x006c
            long r0 = r12.A01     // Catch:{ all -> 0x0181 }
            long r16 = r22.longValue()     // Catch:{ all -> 0x0181 }
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 >= 0) goto L_0x0072
        L_0x006c:
            long r0 = r12.A01     // Catch:{ all -> 0x0181 }
            java.lang.Long r22 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0181 }
        L_0x0072:
            if (r18 == 0) goto L_0x007c
            long r16 = r18.longValue()     // Catch:{ all -> 0x0181 }
            int r11 = (r0 > r16 ? 1 : (r0 == r16 ? 0 : -1))
            if (r11 <= 0) goto L_0x0080
        L_0x007c:
            java.lang.Long r18 = java.lang.Long.valueOf(r0)     // Catch:{ all -> 0x0181 }
        L_0x0080:
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0054
            X.2pX r12 = r12.A00     // Catch:{ all -> 0x0181 }
            if (r12 != 0) goto L_0x0090
            boolean r11 = A02(r2, r0)     // Catch:{ all -> 0x0181 }
            if (r11 == 0) goto L_0x0054
            r2 = r0
            goto L_0x0054
        L_0x0090:
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x0054
            long r11 = r12.A05     // Catch:{ all -> 0x0181 }
            r16 = 30000(0x7530, double:1.4822E-319)
            long r11 = r11 + r16
            int r16 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r16 >= 0) goto L_0x0054
            boolean r11 = A02(r4, r0)     // Catch:{ all -> 0x0181 }
            if (r11 == 0) goto L_0x0054
            r4 = r0
            goto L_0x0054
        L_0x00a6:
            if (r18 == 0) goto L_0x00b6
            long r0 = r18.longValue()     // Catch:{ all -> 0x0181 }
            int r11 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r11 <= 0) goto L_0x00b6
            int r11 = (r13 > r6 ? 1 : (r13 == r6 ? 0 : -1))
            if (r11 != 0) goto L_0x00c6
            r13 = r8
            goto L_0x00c6
        L_0x00b6:
            r0 = r20
            long r0 = java.lang.Math.min(r8, r0)     // Catch:{ all -> 0x0181 }
            long r0 = X.C18280x3.A08(r0, r13)     // Catch:{ all -> 0x0181 }
            long r25 = r25 + r0
            r13 = 0
            r0 = 0
        L_0x00c6:
            long r20 = r29.A0H()     // Catch:{ all -> 0x0181 }
            int r12 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r12 >= 0) goto L_0x00d3
            int r11 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r11 >= 0) goto L_0x00d3
            goto L_0x0105
        L_0x00d3:
            r18 = 30000(0x7530, double:1.4822E-319)
            if (r12 >= 0) goto L_0x00e0
            java.lang.Long r2 = java.lang.Long.valueOf(r4)     // Catch:{ all -> 0x017f }
            r10.A03 = r2     // Catch:{ all -> 0x017f }
            long r4 = r4 - r18
            goto L_0x0102
        L_0x00e0:
            r16 = 180000(0x2bf20, double:8.8932E-319)
            int r11 = (r4 > r20 ? 1 : (r4 == r20 ? 0 : -1))
            if (r11 >= 0) goto L_0x00f0
            java.lang.Long r4 = java.lang.Long.valueOf(r2)     // Catch:{ all -> 0x017f }
            r10.A03 = r4     // Catch:{ all -> 0x017f }
            long r4 = r2 - r16
            goto L_0x0102
        L_0x00f0:
            long r11 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x017f }
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch:{ all -> 0x017f }
            r10.A03 = r11     // Catch:{ all -> 0x017f }
            long r2 = r2 - r16
            long r4 = r4 - r18
            long r4 = java.lang.Math.min(r2, r4)     // Catch:{ all -> 0x017f }
        L_0x0102:
            r10.A01 = r4     // Catch:{ all -> 0x017f }
            goto L_0x0110
        L_0x0105:
            java.lang.Long r2 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x017f }
            r10.A03 = r2     // Catch:{ all -> 0x017f }
            r10.A01 = r6     // Catch:{ all -> 0x017f }
            r10.A0K()     // Catch:{ all -> 0x017f }
        L_0x0110:
            long r4 = r10.A01     // Catch:{ all -> 0x017f }
            long r4 = r4 - r20
            java.lang.Long r2 = r10.A03     // Catch:{ all -> 0x017f }
            long r11 = r2.longValue()     // Catch:{ all -> 0x017f }
            int r2 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r2 >= 0) goto L_0x0122
            r10.A0K()     // Catch:{ all -> 0x017f }
            goto L_0x0154
        L_0x0122:
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 > 0) goto L_0x012a
            r10.A0F()     // Catch:{ all -> 0x017f }
            goto L_0x0154
        L_0x012a:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x017f }
            long r2 = r2 + r4
            X.33i r4 = r10.A0C     // Catch:{ all -> 0x017f }
            android.app.AlarmManager r4 = r4.A07()     // Catch:{ all -> 0x017f }
            if (r4 == 0) goto L_0x014f
            X.2oU r4 = r10.A0E     // Catch:{ all -> 0x017f }
            android.content.Context r7 = r4.A00     // Catch:{ all -> 0x017f }
            java.lang.Class<com.whatsapp.location.FinalLiveLocationBroadcastReceiver> r4 = com.whatsapp.location.FinalLiveLocationBroadcastReceiver.class
            android.content.Intent r6 = X.AnonymousClass0x9.A08(r7, r4)     // Catch:{ all -> 0x017f }
            r5 = 134217728(0x8000000, float:3.85186E-34)
            r4 = 0
            android.app.PendingIntent r6 = X.C624735e.A01(r7, r4, r6, r5)     // Catch:{ all -> 0x017f }
            X.2it r5 = r10.A0B     // Catch:{ all -> 0x017f }
            r4 = 2
            r5.A02(r6, r4, r2)     // Catch:{ all -> 0x017f }
            goto L_0x0154
        L_0x014f:
            java.lang.String r2 = "LocationSharingManager/startFinalLiveLocationUpdateAlarm/AlarmManager is null"
            com.whatsapp.util.Log.w((java.lang.String) r2)     // Catch:{ all -> 0x017f }
        L_0x0154:
            android.content.SharedPreferences$Editor r5 = X.C18300x5.A0A(r28)     // Catch:{ all -> 0x0181 }
            r4 = r27
            r2 = r25
            android.content.SharedPreferences$Editor r3 = r5.putLong(r4, r2)     // Catch:{ all -> 0x0181 }
            r2 = r24
            android.content.SharedPreferences$Editor r3 = r3.putLong(r2, r13)     // Catch:{ all -> 0x0181 }
            r2 = r23
            X.C18270x1.A0i(r3, r2, r0)     // Catch:{ all -> 0x0181 }
            monitor-exit(r15)     // Catch:{ all -> 0x0181 }
            if (r22 == 0) goto L_0x017e
            long r2 = r22.longValue()
            int r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x017e
            long r2 = r2 - r8
            r1 = r31
            r0 = r30
            r1.postDelayed(r0, r2)
        L_0x017e:
            return
        L_0x017f:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0181 }
        L_0x0181:
            r0 = move-exception
            monitor-exit(r15)     // Catch:{ all -> 0x0181 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0O():void");
    }

    public void A0P(Location location) {
        C622534h r2 = this.A0I;
        C54942pX r6 = new C54942pX(C56972sr.A05(r2.A02));
        r6.A00 = ((double) Math.round(location.getLatitude() * 1000000.0d)) / 1000000.0d;
        r6.A01 = ((double) Math.round(location.getLongitude() * 1000000.0d)) / 1000000.0d;
        if (location.hasAccuracy()) {
            r6.A03 = (int) location.getAccuracy();
        }
        if (location.hasSpeed()) {
            r6.A02 = ((float) ((int) (location.getSpeed() * 100.0f))) / 100.0f;
        }
        if (location.hasBearing()) {
            r6.A04 = (int) location.getBearing();
        }
        long time = location.getTime();
        r6.A05 = time;
        C56612sH r3 = r2.A04;
        if (time > r3.A0H()) {
            r6.A05 = r3.A0H();
        }
        synchronized (this) {
            C54942pX r0 = this.A02;
            if (r0 == null || r6.A05 > r0.A05) {
                this.A02 = r6;
            }
        }
    }

    public void A0V(AnonymousClass4D8 r3) {
        List list = this.A0V;
        if (!list.contains(r3)) {
            list.add(r3);
        }
    }

    public void A0W(C54942pX r7, C30801n8 r8) {
        UserJid A032;
        AnonymousClass2z0 r1 = r8.A1J;
        C95814uZ r5 = r1.A00;
        boolean z = r1.A02;
        if (z) {
            A032 = null;
        } else if (C627336j.A0K(r5)) {
            A032 = AnonymousClass32Y.A07(r8);
        } else {
            A032 = AnonymousClass32Y.A03(r5);
        }
        String str = r1.A01;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationSharingManager/storeFinalLiveLocation/jid=");
        A0o.append(r5);
        A0o.append("; fromMe=");
        A0o.append(z);
        A0o.append("; msgId=");
        A0o.append(str);
        A0o.append("; participant=");
        A0o.append(A032);
        A0o.append("; location.time=");
        C18260x0.A1I(A0o, r7.A05);
        r8.A02 = r7;
        AnonymousClass0x9.A0M(this.A0M).A0b(r8, 18);
    }

    public final void A0Z(Map map) {
        HashSet A0s = C18310x6.A0s(this.A0b);
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            Iterator A0v2 = AnonymousClass001.A0v((Map) A0v.next());
            while (A0v2.hasNext()) {
                A0s.remove(((AnonymousClass2OP) A0v2.next()).A01);
            }
        }
        if (!A0s.isEmpty()) {
            this.A0J.A05(A0s);
        }
    }

    public boolean A0b() {
        synchronized (this.A0R) {
            Map A0C2 = A0C();
            long A082 = C56612sH.A08(this);
            Iterator A0v = AnonymousClass001.A0v(A0C2);
            while (A0v.hasNext()) {
                if (A02(((AnonymousClass2QE) A0v.next()).A01, A082)) {
                    return true;
                }
            }
            return false;
        }
    }

    public boolean A0c() {
        synchronized (this.A0R) {
            List A092 = A09();
            Map map = this.A0a;
            A092.removeAll(map.keySet());
            if (A092.isEmpty()) {
                return false;
            }
            Iterator it = A092.iterator();
            while (it.hasNext()) {
                C18280x3.A1D(C18310x6.A0T(it), map, 0);
            }
            this.A08.A02(new SendLiveLocationKeyJob(A092));
            return true;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0d(X.C95814uZ r6) {
        /*
            r5 = this;
            java.lang.Object r4 = r5.A0R
            monitor-enter(r4)
            java.util.Map r0 = r5.A0C()     // Catch:{ all -> 0x0024 }
            java.lang.Object r0 = r0.get(r6)     // Catch:{ all -> 0x0024 }
            X.2QE r0 = (X.AnonymousClass2QE) r0     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x0021
            long r2 = r0.A01     // Catch:{ all -> 0x0024 }
            long r0 = X.C56612sH.A08(r5)     // Catch:{ all -> 0x0024 }
            boolean r0 = A02(r2, r0)     // Catch:{ all -> 0x0024 }
            if (r0 == 0) goto L_0x001e
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            r0 = 1
            return r0
        L_0x001e:
            r5.A0Q(r6)     // Catch:{ all -> 0x0024 }
        L_0x0021:
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            r0 = 0
            return r0
        L_0x0024:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0024 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0d(X.4uZ):boolean");
    }

    public boolean A0f(C54942pX r13) {
        boolean z;
        C30801n8 A082;
        synchronized (this.A0Q) {
            Map map = this.A0b;
            UserJid userJid = r13.A06;
            C54942pX r4 = (C54942pX) map.get(userJid);
            z = false;
            if (r4 == null || r4.A05 <= r13.A05) {
                Iterator A0v = AnonymousClass001.A0v(A0B());
                while (A0v.hasNext()) {
                    AnonymousClass2OP r9 = (AnonymousClass2OP) ((Map) A0v.next()).get(userJid);
                    if (!(r9 == null || r13.A05 > r9.A00 || (A082 = A08(r9.A02)) == null)) {
                        A0W(r13, A082);
                        z = true;
                    }
                }
                if (z) {
                    if (r4 == null) {
                        map.put(userJid, r13);
                    } else {
                        r4.A00(r13);
                    }
                    this.A0J.A03(r13);
                }
            }
        }
        return z;
    }

    public C621233o(C56972sr r3, C49712gy r4, C42112Mv r5, C64773Ex r6, C50862it r7, C620633i r8, C56612sH r9, C54292oU r10, C621133n r11, C48972fm r12, C28891hw r13, C622534h r14, C56472s2 r15, C61222zu r16, AnonymousClass4FS r17, C183538qC r18, C183538qC r19, C183538qC r20) {
        this.A0E = r10;
        this.A0D = r9;
        this.A0B = r7;
        this.A07 = r3;
        this.A0L = r17;
        this.A08 = r4;
        this.A0A = r6;
        this.A0G = r12;
        this.A0C = r8;
        this.A0I = r14;
        this.A0F = r11;
        this.A09 = r5;
        this.A0K = r16;
        this.A0O = r19;
        this.A0J = r15;
        this.A0H = r13;
        this.A0N = r18;
        this.A0M = r20;
    }

    public static void A01(C621233o r1, AnonymousClass2z0 r2) {
        C30801n8 A082 = r1.A08(r2);
        if (A082 != null) {
            r1.A0X(A082);
        }
    }

    public List A0A(C95814uZ r9) {
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this.A0Q) {
            Map A1B = AnonymousClass0x9.A1B(r9, A0B());
            long A082 = C56612sH.A08(this);
            if (A1B != null) {
                Iterator A0v = AnonymousClass001.A0v(A1B);
                while (A0v.hasNext()) {
                    AnonymousClass2OP r4 = (AnonymousClass2OP) A0v.next();
                    if (A02(r4.A00, A082)) {
                        A0s.add(r4.A01);
                    }
                }
            }
        }
        return A0s;
    }

    public final Set A0D() {
        Map A0C2 = A0C();
        HashSet A0K2 = AnonymousClass002.A0K();
        long A082 = C56612sH.A08(this);
        Iterator A0v = AnonymousClass001.A0v(A0C2);
        while (A0v.hasNext()) {
            AnonymousClass2QE r2 = (AnonymousClass2QE) A0v.next();
            if (A02(r2.A01, A082)) {
                A0K2.addAll(r2.A03);
            }
        }
        return A0K2;
    }

    public void A0G() {
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this.A0R) {
            Map A0C2 = A0C();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingManager/updateSendingEnd; sendingMap.size=");
            C18260x0.A1F(A0o, A0C2.size());
            long A082 = C56612sH.A08(this);
            Iterator A0q = AnonymousClass000.A0q(A0C2);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                long j = ((AnonymousClass2QE) A0w.getValue()).A01;
                if (j != 0 && j <= A082) {
                    A0s.add(C18320x8.A0N(A0w));
                }
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            A0Q(C18300x5.A0P(it));
        }
        A0O();
    }

    public final void A0L() {
        ArrayList A0s = AnonymousClass001.A0s();
        synchronized (this.A0Q) {
            Map A0B2 = A0B();
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("LocationSharingManager/receivingEndRunnable/run; receivingMap.size=");
            C18260x0.A1F(A0o, A0B2.size());
            long A082 = C56612sH.A08(this);
            Iterator A0q = AnonymousClass000.A0q(A0B2);
            while (A0q.hasNext()) {
                Map.Entry A0w = AnonymousClass001.A0w(A0q);
                Iterator A0v = AnonymousClass001.A0v((Map) A0w.getValue());
                while (A0v.hasNext()) {
                    AnonymousClass2OP r5 = (AnonymousClass2OP) A0v.next();
                    long j = r5.A00;
                    if (j != 0 && j <= A082) {
                        C18320x8.A1F(C18320x8.A0N(A0w), r5.A01, A0s);
                    }
                }
            }
        }
        Iterator it = A0s.iterator();
        while (it.hasNext()) {
            Pair A0D2 = AnonymousClass0x9.A0D(it);
            A0R((C95814uZ) A0D2.first, (UserJid) A0D2.second);
        }
        A0N();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004e, code lost:
        r1 = r6.A0V.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0058, code lost:
        if (r1.hasNext() == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005a, code lost:
        ((X.AnonymousClass4D8) r1.next()).Bcr(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        A0O();
        X.C71353by.A00(r6.A06, r6, r7, 11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0072, code lost:
        if (A0b() != false) goto L_0x0077;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0074, code lost:
        A0H();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0077, code lost:
        r6.A08.A02(new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob(r7, r2));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Q(X.C95814uZ r7) {
        /*
            r6 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/cancelShareLocation; jid="
            X.C18260x0.A1R(r1, r0, r7)
            java.lang.Object r4 = r6.A0R
            monitor-enter(r4)
            java.util.Map r0 = r6.A0C()     // Catch:{ all -> 0x0082 }
            java.lang.Object r5 = r0.remove(r7)     // Catch:{ all -> 0x0082 }
            X.2QE r5 = (X.AnonymousClass2QE) r5     // Catch:{ all -> 0x0082 }
            if (r5 != 0) goto L_0x001a
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            return
        L_0x001a:
            X.2z0 r0 = r5.A02     // Catch:{ all -> 0x0082 }
            A01(r6, r0)     // Catch:{ all -> 0x0082 }
            X.2s2 r3 = r6.A0J     // Catch:{ all -> 0x0082 }
            java.util.List r2 = java.util.Collections.singletonList(r5)     // Catch:{ all -> 0x0082 }
            long r0 = X.C56612sH.A08(r6)     // Catch:{ all -> 0x0082 }
            r3.A06(r2, r0)     // Catch:{ all -> 0x0082 }
            java.util.Set r2 = r6.A0D()     // Catch:{ all -> 0x0082 }
            java.util.List r0 = r5.A03     // Catch:{ all -> 0x0082 }
            java.util.Iterator r1 = r0.iterator()     // Catch:{ all -> 0x0082 }
        L_0x0036:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0082 }
            if (r0 == 0) goto L_0x0049
            com.whatsapp.jid.UserJid r0 = X.C18310x6.A0T(r1)     // Catch:{ all -> 0x0082 }
            boolean r0 = r2.contains(r0)     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0036
            r6.A0I()     // Catch:{ all -> 0x0082 }
        L_0x0049:
            long r2 = r6.A03()     // Catch:{ all -> 0x0082 }
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            java.util.List r0 = r6.A0V
            java.util.Iterator r1 = r0.iterator()
        L_0x0054:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0064
            java.lang.Object r0 = r1.next()
            X.4D8 r0 = (X.AnonymousClass4D8) r0
            r0.Bcr(r7)
            goto L_0x0054
        L_0x0064:
            r6.A0O()
            android.os.Handler r1 = r6.A06
            r0 = 11
            X.C71353by.A00(r1, r6, r7, r0)
            boolean r0 = r6.A0b()
            if (r0 != 0) goto L_0x0077
            r6.A0H()
        L_0x0077:
            X.2gy r1 = r6.A08
            com.whatsapp.jobqueue.job.SendDisableLiveLocationJob r0 = new com.whatsapp.jobqueue.job.SendDisableLiveLocationJob
            r0.<init>(r7, r2)
            r1.A02(r0)
            return
        L_0x0082:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0082 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0Q(X.4uZ):void");
    }

    public final void A0R(C95814uZ r7, UserJid userJid) {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationSharingManager/onReceiveStopSharing; jid=");
        A0o.append(r7);
        C18260x0.A1R(A0o, "; participant=", userJid);
        synchronized (this.A0Q) {
            Map A0B2 = A0B();
            Map A1B = AnonymousClass0x9.A1B(r7, A0B2);
            if (A1B != null) {
                UserJid userJid2 = userJid;
                if (userJid == null) {
                    userJid2 = r7;
                }
                AnonymousClass2OP r0 = (AnonymousClass2OP) A1B.remove(userJid2);
                if (r0 != null) {
                    A01(this, r0.A02);
                }
                C56472s2 r2 = this.A0J;
                C626936e.A06(r7);
                if (userJid != null) {
                    r2.A02(r7, Collections.singletonList(userJid), false);
                } else {
                    r2.A04(Collections.singletonList(r7), false);
                }
                if (A1B.isEmpty()) {
                    A0B2.remove(r7);
                }
            }
            A0Z(A0B2);
        }
        for (AnonymousClass4EU BZa : this.A0W) {
            BZa.BZa(r7, userJid);
        }
        A0N();
        C71353by.A00(this.A06, this, r7, 14);
    }

    public void A0S(C95814uZ r9, List list) {
        boolean z;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("LocationSharingManager/onParticipantsLeftGroup; gjid=");
        A0o.append(r9);
        C18260x0.A1C("; participants.size=", A0o, list);
        synchronized (this.A0R) {
            Map A0C2 = A0C();
            AnonymousClass2QE r6 = (AnonymousClass2QE) A0C2.get(r9);
            z = false;
            if (r6 != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    UserJid A0T2 = C18310x6.A0T(it);
                    List list2 = r6.A03;
                    if (list2.contains(A0T2)) {
                        list2.remove(A0T2);
                        z = true;
                    }
                }
                if (r6.A03.isEmpty()) {
                    AnonymousClass2QE r0 = (AnonymousClass2QE) A0C2.remove(r9);
                    C626936e.A06(r0);
                    A01(this, r0.A02);
                }
                this.A0J.A02(r9, list, true);
                A0M();
            }
        }
        if (z) {
            A0O();
            C71353by.A00(this.A06, this, r9, 13);
        }
        synchronized (this.A0Q) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                A0R(r9, C18310x6.A0T(it2));
            }
        }
    }

    public void A0T(C27991fJ r3) {
        Map map;
        C18260x0.A1R(AnonymousClass001.A0o(), "LocationSharingManager/onMeLeftGroup; gjid=", r3);
        A0Q(r3);
        synchronized (this.A0Q) {
            map = (Map) A0B().remove(r3);
        }
        if (map != null) {
            Iterator A0v = AnonymousClass001.A0v(map);
            while (A0v.hasNext()) {
                A0R(r3, ((AnonymousClass2OP) A0v.next()).A01);
            }
        }
    }

    public final void A0X(C30801n8 r5) {
        int A082 = (int) C18280x3.A08(C56612sH.A08(this), r5.A0K);
        if (A082 < r5.A00) {
            r5.A00 = A082;
            if (r5.A02 == 1) {
                r5.A02 = 0;
            }
            AnonymousClass0x9.A0M(this.A0M).A0b(r5, 19);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00e4, code lost:
        r1 = r6.A0W.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ee, code lost:
        if (r1.hasNext() == false) goto L_0x00fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f0, code lost:
        ((X.AnonymousClass4EU) r1.next()).BZZ(r14, r15);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fa, code lost:
        A0N();
        X.C71353by.A00(r6.A06, r6, r14, 12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0104, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0Y(X.C30801n8 r20, long r21) {
        /*
            r19 = this;
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; message.key.remote_jid="
            r7 = r20
            X.2z0 r8 = X.C624134x.A08(r7, r0, r2)
            X.4uZ r14 = r8.A00
            r2.append(r14)
            java.lang.String r0 = "; message.remote_resource="
            X.C624134x.A0R(r7, r0, r2)
            java.lang.String r0 = "; expiration="
            r2.append(r0)
            r9 = r21
            r2.append(r9)
            java.lang.String r0 = "; message.sequenceNumber="
            r2.append(r0)
            long r0 = r7.A01
            X.C18260x0.A1I(r2, r0)
            X.4uZ r0 = r7.A0n()
            if (r0 != 0) goto L_0x003a
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A03(r14)
        L_0x0034:
            r6 = r19
            java.lang.Object r5 = r6.A0Q
            monitor-enter(r5)
            goto L_0x003f
        L_0x003a:
            com.whatsapp.jid.UserJid r15 = X.AnonymousClass32Y.A03(r0)
            goto L_0x0034
        L_0x003f:
            java.util.Map r11 = r6.A0B()     // Catch:{ all -> 0x0105 }
            android.util.Pair r13 = android.util.Pair.create(r14, r15)     // Catch:{ all -> 0x0105 }
            java.util.Map r12 = r6.A0Z     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r12.get(r13)     // Catch:{ all -> 0x0105 }
            java.lang.Long r0 = (java.lang.Long) r0     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0062
            long r3 = r0.longValue()     // Catch:{ all -> 0x0105 }
            long r0 = r7.A01     // Catch:{ all -> 0x0105 }
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x0062
            java.lang.String r0 = "LocationSharingManager/onReceiveSharing; received message with old sequence number; not set receiving"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0105 }
            monitor-exit(r5)     // Catch:{ all -> 0x0105 }
            return
        L_0x0062:
            r12.remove(r13)     // Catch:{ all -> 0x0105 }
            boolean r0 = r11.containsKey(r14)     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x0072
            java.util.HashMap r0 = X.AnonymousClass001.A0t()     // Catch:{ all -> 0x0105 }
            r11.put(r14, r0)     // Catch:{ all -> 0x0105 }
        L_0x0072:
            java.util.Map r1 = X.AnonymousClass0x9.A1B(r14, r11)     // Catch:{ all -> 0x0105 }
            X.C626936e.A06(r1)     // Catch:{ all -> 0x0105 }
            java.lang.Object r0 = r1.get(r15)     // Catch:{ all -> 0x0105 }
            X.2OP r0 = (X.AnonymousClass2OP) r0     // Catch:{ all -> 0x0105 }
            if (r0 == 0) goto L_0x0086
            X.2z0 r0 = r0.A02     // Catch:{ all -> 0x0105 }
            A01(r6, r0)     // Catch:{ all -> 0x0105 }
        L_0x0086:
            X.C626936e.A06(r15)     // Catch:{ all -> 0x0105 }
            X.2OP r0 = new X.2OP     // Catch:{ all -> 0x0105 }
            r0.<init>(r15, r8, r9)     // Catch:{ all -> 0x0105 }
            r1.put(r15, r0)     // Catch:{ all -> 0x0105 }
            java.util.Map r1 = r6.A0b     // Catch:{ all -> 0x0105 }
            boolean r0 = r1.containsKey(r15)     // Catch:{ all -> 0x0105 }
            if (r0 != 0) goto L_0x00a4
            X.C626936e.A06(r15)     // Catch:{ all -> 0x0105 }
            X.2pX r0 = new X.2pX     // Catch:{ all -> 0x0105 }
            r0.<init>(r15)     // Catch:{ all -> 0x0105 }
            r1.put(r15, r0)     // Catch:{ all -> 0x0105 }
        L_0x00a4:
            java.lang.Object r4 = r1.get(r15)     // Catch:{ all -> 0x0105 }
            X.2pX r4 = (X.C54942pX) r4     // Catch:{ all -> 0x0105 }
            X.C626936e.A06(r4)     // Catch:{ all -> 0x0105 }
            long r0 = r4.A05     // Catch:{ all -> 0x0105 }
            long r2 = r7.A0K     // Catch:{ all -> 0x0105 }
            int r11 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r11 > 0) goto L_0x00c4
            double r0 = r7.A00     // Catch:{ all -> 0x0105 }
            r4.A00 = r0     // Catch:{ all -> 0x0105 }
            double r0 = r7.A01     // Catch:{ all -> 0x0105 }
            r4.A01 = r0     // Catch:{ all -> 0x0105 }
            r4.A05 = r2     // Catch:{ all -> 0x0105 }
            X.2s2 r0 = r6.A0J     // Catch:{ all -> 0x0105 }
            r0.A03(r4)     // Catch:{ all -> 0x0105 }
        L_0x00c4:
            X.2s2 r1 = r6.A0J     // Catch:{ all -> 0x0105 }
            X.C626936e.A06(r14)     // Catch:{ all -> 0x0105 }
            X.C626936e.A06(r15)     // Catch:{ all -> 0x0105 }
            java.lang.String r0 = r8.A01     // Catch:{ all -> 0x0105 }
            X.2z0 r16 = X.AnonymousClass2z0.A03(r14, r0)     // Catch:{ all -> 0x0105 }
            X.2vh r13 = new X.2vh     // Catch:{ all -> 0x0105 }
            r17 = r9
            r13.<init>(r14, r15, r16, r17)     // Catch:{ all -> 0x0105 }
            java.util.List r0 = java.util.Collections.singletonList(r13)     // Catch:{ all -> 0x0105 }
            r1.A07(r0)     // Catch:{ all -> 0x0105 }
            r6.A0W(r4, r7)     // Catch:{ all -> 0x0105 }
            monitor-exit(r5)     // Catch:{ all -> 0x0105 }
            java.util.List r0 = r6.A0W
            java.util.Iterator r1 = r0.iterator()
        L_0x00ea:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00fa
            java.lang.Object r0 = r1.next()
            X.4EU r0 = (X.AnonymousClass4EU) r0
            r0.BZZ(r14, r15)
            goto L_0x00ea
        L_0x00fa:
            r6.A0N()
            android.os.Handler r1 = r6.A06
            r0 = 12
            X.C71353by.A00(r1, r6, r14, r0)
            return
        L_0x0105:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0105 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0Y(X.1n8, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r6 != null) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0037, code lost:
        if (r0 > 0) goto L_0x0039;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        if (r7 <= r2) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0a() {
        /*
            r9 = this;
            long r2 = X.C56612sH.A08(r9)
            java.lang.Object r1 = r9.A0R
            monitor-enter(r1)
            java.lang.Long r6 = r9.A03     // Catch:{ all -> 0x0054 }
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            if (r6 == 0) goto L_0x001a
            long r7 = r6.longValue()
            r4 = 0
            int r0 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0024
            int r0 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0024
        L_0x001a:
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/triggered clearing"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.A0G()
            if (r6 == 0) goto L_0x0039
        L_0x0024:
            long r4 = r6.longValue()
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0039
            monitor-enter(r1)
            long r4 = r9.A01     // Catch:{ all -> 0x0031 }
            monitor-exit(r1)     // Catch:{ all -> 0x0031 }
            goto L_0x0034
        L_0x0031:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0031 }
            throw r0
        L_0x0034:
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r4 = 1
            if (r0 <= 0) goto L_0x003a
        L_0x0039:
            r4 = 0
        L_0x003a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "LocationSharingManager/hasExpiringLocationReceivers/nextLiveLocationExpiration="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = "; now="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = "; result="
            X.C18260x0.A1D(r0, r1, r4)
            return r4
        L_0x0054:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0054 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C621233o.A0a():boolean");
    }
}
