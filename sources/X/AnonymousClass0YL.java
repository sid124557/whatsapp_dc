package X;

import com.google.android.gms.auth.UserRecoverableAuthException;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;

/* renamed from: X.0YL  reason: invalid class name */
public class AnonymousClass0YL {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public final C55682qk A0A;
    public final C64393Dh A0B;
    public final AnonymousClass0U8 A0C;
    public final C06430Xr A0D;
    public final AnonymousClass0WN A0E;
    public final AnonymousClass0WF A0F;
    public final C10240hc A0G;
    public final AnonymousClass0F1 A0H;
    public final C04450Oi A0I;
    public final AnonymousClass0QR A0J;
    public final C04710Qi A0K;
    public final AnonymousClass0Y7 A0L;
    public final C16420tN A0M;
    public final AnonymousClass310 A0N;
    public final C56512s6 A0O;
    public final C56612sH A0P;
    public final C54292oU A0Q;
    public final AnonymousClass5ZR A0R;
    public final AnonymousClass33p A0S;
    public final C613830m A0T;
    public final C625835r A0U;
    public final C72303dV A0V;
    public final AnonymousClass1VX A0W;
    public final AnonymousClass4FV A0X;
    public final C26041bU A0Y;
    public final AnonymousClass31C A0Z;
    public final C34171uL A0a;
    public final C183538qC A0b;
    public final String A0c;
    public final List A0d;
    public final Map A0e = new ConcurrentHashMap();
    public final AtomicInteger A0f = new AtomicInteger(0);
    public final AtomicLong A0g = new AtomicLong(0);
    public final AtomicLong A0h;
    public final AtomicLong A0i = new AtomicLong(0);
    public final AtomicLong A0j;
    public final boolean A0k;

    public AnonymousClass0UO A0A(AnonymousClass0UI r12, File file, String str, String str2) {
        String str3;
        File file2 = file;
        String absolutePath = file.getAbsolutePath();
        AnonymousClass310 r4 = this.A0N;
        AnonymousClass5ZR r7 = this.A0R;
        int A002 = C06520Ya.A00(r12, r4, r7, absolutePath);
        if (A002 == 3 || A002 == 1) {
            return null;
        }
        Object[] A0M2 = AnonymousClass002.A0M();
        String str4 = str2;
        A0M2[0] = str2;
        if (A002 == 2) {
            str3 = "remote-file-does-not-exist";
        } else if (A002 != 3) {
            str3 = "remote-file-different-from-local";
        } else {
            str3 = "remote-file-same-as-local";
        }
        A0M2[1] = str3;
        String.format("gdrive/backup/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", A0M2);
        return new AnonymousClass0UO(this.A0B, this.A0E, this.A0I, r4, this.A0O, this.A0Q, r7, file2, str, str4);
    }

    public static double A00(AtomicLong atomicLong, AtomicLong atomicLong2) {
        return (((double) atomicLong.get()) * 100.0d) / ((double) atomicLong2.get());
    }

    public static String A05(C26041bU r6) {
        int i;
        int i2;
        int i3;
        int i4;
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[9];
        Double d = r6.A09;
        if (d != null) {
            i = (int) d.doubleValue();
        } else {
            i = -1;
        }
        AnonymousClass000.A1L(objArr, i);
        Double d2 = r6.A05;
        if (d2 != null) {
            i2 = (int) d2.doubleValue();
        } else {
            i2 = -1;
        }
        AnonymousClass000.A1M(objArr, i2);
        Double d3 = r6.A07;
        if (d3 != null) {
            i3 = (int) d3.doubleValue();
        } else {
            i3 = -1;
        }
        AnonymousClass000.A1N(objArr, i3);
        Double d4 = r6.A06;
        if (d4 != null) {
            i4 = (int) d4.doubleValue();
        } else {
            i4 = -1;
        }
        AnonymousClass000.A1O(objArr, i4);
        objArr[4] = r6.A0e;
        objArr[5] = r6.A00;
        objArr[6] = r6.A0b;
        objArr[7] = r6.A0V;
        objArr[8] = r6.A0U;
        return String.format(locale, "total size:%d, chat size:%d, media size:%d, media files count:%d retryCount:%d includeVideos:%b wifi-on-finish:%b backup-stage:%d result:%d", objArr);
    }

    public static void A06(AnonymousClass0GS r2, C16420tN r3) {
        int i;
        Log.e("gdrive/backup/exception-during-backup", r2);
        if (r2 instanceof AnonymousClass0EX) {
            Throwable cause = r2.getCause();
            if (cause instanceof C126936Px) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/google-play-services-unavailable");
                i = 21;
            } else if (cause instanceof UserRecoverableAuthException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/user-recoverable-exception");
                i = 28;
            } else if (cause instanceof SecurityException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/security-exception");
                i = 30;
            } else if (cause instanceof NullPointerException) {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/null-pointer-exception");
                i = 31;
            } else {
                Log.e("gdrive/backup/exception-during-backup/auth-failed/unknown-cause", cause);
                i = 11;
            }
        } else if (r2 instanceof AnonymousClass0EW) {
            i = 12;
        } else {
            i = 18;
            if (!(r2 instanceof AnonymousClass0EK) && !(r2 instanceof AnonymousClass0EI)) {
                if (r2 instanceof AnonymousClass0EP) {
                    i = 15;
                } else {
                    i = 19;
                    if (!(r2 instanceof AnonymousClass0EN) && !(r2 instanceof AnonymousClass0EJ)) {
                        if (r2 instanceof AnonymousClass0EM) {
                            i = 13;
                        } else if (r2 instanceof AnonymousClass0EO) {
                            i = 16;
                        } else if (r2 instanceof AnonymousClass0EV) {
                            i = 23;
                        } else if (r2 instanceof AnonymousClass0EL) {
                            i = 25;
                        } else {
                            i = 27;
                            if (!(r2 instanceof AnonymousClass0EQ)) {
                                r3.onError(26);
                                Log.e("gdrive/backup/exception-during-backup/unexpected-failure", r2);
                                return;
                            }
                        }
                    }
                }
            }
        }
        r3.onError(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A07(X.C05580Ub r6, X.AnonymousClass0YL r7, X.AnonymousClass0UO r8, java.util.concurrent.CountDownLatch r9, java.util.concurrent.atomic.AtomicBoolean r10, java.util.concurrent.atomic.AtomicReference r11) {
        /*
            java.lang.String r5 = "gdrive/backup/backup-file failed on "
            r3 = 1
            r4 = 0
            java.lang.Object r0 = r11.get()     // Catch:{ 0EI | 0EL | 0EM | 0EN | 0EV | 0EW | 0EX -> 0x002b, FileNotFoundException -> 0x0017 }
            if (r0 != 0) goto L_0x0034
            boolean r0 = r7.A0N(r6, r8)     // Catch:{ 0EI | 0EL | 0EM | 0EN | 0EV | 0EW | 0EX -> 0x002b, FileNotFoundException -> 0x0017 }
            r10.compareAndSet(r3, r0)
            r9.countDown()
            if (r0 != 0) goto L_0x004f
            goto L_0x003a
        L_0x0017:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "gdrive/backup/upload/file-not-found "
            r1.append(r0)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0050 }
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x0050 }
            goto L_0x0034
        L_0x002b:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/backup-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x0050 }
            r11.set(r1)     // Catch:{ all -> 0x0050 }
        L_0x0034:
            r10.compareAndSet(r3, r4)
            r9.countDown()
        L_0x003a:
            X.0hc r0 = r7.A0G
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x004f
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x004f:
            return
        L_0x0050:
            r2 = move-exception
            r10.compareAndSet(r3, r4)
            r9.countDown()
            X.0hc r0 = r7.A0G
            boolean r0 = r0.A0b()
            if (r0 == 0) goto L_0x006c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = "<file>"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x006c:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YL.A07(X.0Ub, X.0YL, X.0UO, java.util.concurrent.CountDownLatch, java.util.concurrent.atomic.AtomicBoolean, java.util.concurrent.atomic.AtomicReference):void");
    }

    public static /* synthetic */ void A08(AnonymousClass0YL r5, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, boolean z) {
        try {
            String A062 = AnonymousClass0YV.A06(r5.A0Q.A06(), r5.A0N, file);
            if (A062 == null) {
                Log.e(AnonymousClass000.A0P(file, "gdrive/backup/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass001.A0o()));
            } else {
                Map map = r5.A0e;
                AnonymousClass0UI r2 = (AnonymousClass0UI) map.get(A062);
                C04710Qi r3 = r5.A0K;
                if (r3.A06()) {
                    AnonymousClass0UO A0A2 = r5.A0A(r2, file, str, A062);
                    if (A0A2 != null) {
                        list.add(A0A2);
                        String str2 = A0A2.A06;
                        map.remove(str2);
                        if (r2 != null && !r2.A06.equals(str2)) {
                            list2.add(r2);
                            map.remove(r2.A01());
                        }
                    }
                    AtomicLong atomicLong = r5.A0g;
                    atomicLong.addAndGet(file.length());
                    if (r3.A06() && r5.A0G.A0b() && z) {
                        r5.A0H.A0Q(atomicLong.get(), r5.A05);
                    }
                }
            }
        } catch (AnonymousClass0EV e) {
            Log.e(AnonymousClass000.A0P(file, "gdrive/backup/get-files-to-be-uploaded problem with a file ", AnonymousClass001.A0o()), e);
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public final long A09(C05580Ub r7, List list) {
        long j = 0;
        if (!this.A0W.A0X(4777)) {
            return 0;
        }
        AnonymousClass33M r3 = new AnonymousClass33M("backup-size-estimation");
        try {
            ArrayList A0s = AnonymousClass001.A0s();
            A0s.addAll(list);
            A0s.addAll(A0C());
            Iterator it = A0s.iterator();
            while (it.hasNext()) {
                j += ((File) it.next()).length();
            }
            return (j + this.A0F.A03(this.A0I, this.A0E.A0G())) - r7.A04;
        } finally {
            r3.A07();
        }
    }

    public final Map A0D(long j) {
        AnonymousClass33M r3 = new AnonymousClass33M("gdrive/backup/perf/build-metadata/metadata");
        HashMap A0t = AnonymousClass001.A0t();
        A0t.put("numOfMessages", Long.valueOf(j));
        AnonymousClass33p r4 = this.A0S;
        A0t.put("backupFrequency", Integer.valueOf(r4.A05()));
        A0t.put("backupNetworkSettings", Integer.valueOf(r4.A06()));
        A0t.put("includeVideosInBackup", Boolean.valueOf(r4.A27()));
        A0t.put("numOfPhotos", Integer.valueOf(this.A01));
        A0t.put("numOfMediaFiles", Integer.valueOf(this.A00));
        A0t.put("mediaSize", Long.valueOf(this.A06));
        A0t.put("videoSize", Long.valueOf(this.A09));
        A0t.put("localSettings", r4.A0d());
        AnonymousClass0WN r42 = this.A0E;
        if (r42.A0G()) {
            String A032 = r42.A03(C06520Ya.A03(A0t));
            A0t.clear();
            A0t.put("encryptedData", A032);
        }
        A0t.put("encryptedBackupEnabled", Boolean.valueOf(r42.A0G()));
        A0t.put("backupVersion", AnonymousClass001.A0f());
        A0t.put("backupSize", Long.valueOf(this.A02));
        A0t.put("chatdbSize", Long.valueOf(this.A03));
        A0t.put("versionOfAppWhenBackup", AnonymousClass5V3.A00());
        A0t.put("backupExpiry", this.A0D.A06().toString());
        r3.A07();
        return A0t;
    }

    public void A0E() {
        C26041bU r1;
        int i;
        C04710Qi r12 = this.A0K;
        if (!r12.A03()) {
            r1 = this.A0Y;
            i = 34;
        } else if (!r12.A01()) {
            r1 = this.A0Y;
            i = 37;
        } else if (!r12.A02()) {
            r1 = this.A0Y;
            i = 35;
        } else {
            if (!r12.A04()) {
                r1 = this.A0Y;
                i = 36;
            }
            A0K(true);
        }
        r1.A0U = Integer.valueOf(i);
        A0K(true);
    }

    public final void A0F() {
        long j;
        AnonymousClass33M r7 = new AnonymousClass33M("gdrive/backup/perf/build-metadata/filter-files-and-build-stats");
        HashSet hashSet = new HashSet(Arrays.asList(this.A0U.A0c()));
        Pattern compile = Pattern.compile("msgstore.db.crypt(\\d+)|msgstore-increment-(\\d+).db.crypt(\\d+)");
        HashSet hashSet2 = new HashSet(A0C());
        Map map = this.A0e;
        C626936e.A06(map);
        Iterator A0v = AnonymousClass001.A0v(map);
        while (A0v.hasNext()) {
            AnonymousClass0UI r12 = (AnonymousClass0UI) A0v.next();
            String A042 = AnonymousClass0YV.A04(this.A0Q.A06(), this.A0A, this.A0N, r12.A01());
            if (A042 != null) {
                File A0B2 = AnonymousClass002.A0B(A042);
                String canonicalPath = A0B2.getCanonicalPath();
                AnonymousClass0UF r0 = r12.A02;
                if (r0 != null) {
                    j = r0.A00;
                } else {
                    j = r12.A00;
                }
                if (j < 0) {
                    Log.e(AnonymousClass000.A0P(r12, "gdrive/backup/build-stats/file-size-is-not-positive", AnonymousClass001.A0o()));
                } else {
                    if (AnonymousClass0S8.A01(this.A0W)) {
                        if (compile.matcher(A0B2.getName()).matches()) {
                            this.A03 += j;
                        }
                    } else if (hashSet.contains(A0B2)) {
                        this.A03 = j;
                    }
                    C04450Oi r10 = this.A0I;
                    if (r10.A01(canonicalPath)) {
                        this.A06 += j;
                        this.A00++;
                    }
                    if (canonicalPath != null) {
                        if (canonicalPath.startsWith(r10.A07) || canonicalPath.startsWith(r10.A05)) {
                            this.A09 += j;
                        }
                        if (canonicalPath.startsWith(r10.A03)) {
                            this.A01++;
                        }
                    }
                    if (hashSet2.contains(A0B2)) {
                        this.A08 += j;
                    }
                    this.A02 += j;
                }
            }
        }
        r7.A07();
    }

    public final void A0G() {
        this.A0Y.A0U = 39;
        this.A0H.A08();
        A0I();
        this.A05 = 0;
        this.A0S.A17(0);
    }

    public final void A0H() {
        long j;
        C26041bU r7 = this.A0Y;
        r7.A0U = 1;
        r7.A05 = Double.valueOf((double) this.A03);
        r7.A0C = Double.valueOf((double) this.A08);
        r7.A07 = Double.valueOf((double) this.A06);
        r7.A09 = Double.valueOf((double) this.A02);
        r7.A04 = Double.valueOf((double) this.A04);
        r7.A06 = Double.valueOf((double) this.A00);
        r7.A0Z = Long.valueOf(this.A07);
        AnonymousClass33p r5 = this.A0S;
        r7.A0e = Long.valueOf((long) r5.A0E());
        r7.A00 = Boolean.valueOf(r5.A27());
        C10240hc r9 = this.A0G;
        if (r9.A06() == 1) {
            j = 1;
        } else {
            j = 0;
        }
        r7.A0b = Long.valueOf(j);
        if (r7.A0V == null) {
            r7.A0V = 1;
        }
        AnonymousClass0Y7 r4 = this.A0L;
        int i = r4.A08.A00 + r4.A0J.get();
        Log.i(AnonymousClass000.A0Y("gdrive/backup/total-requests-in-backup-session/", AnonymousClass001.A0o(), i));
        r7.A08 = Double.valueOf((double) i);
        String A0X2 = r5.A0X();
        r5.A1c(A0X2, System.currentTimeMillis());
        r5.A1d(A0X2, this.A02);
        r5.A1b(A0X2, this.A06);
        r5.A1e(A0X2, this.A09);
        r5.A1l(A0X2, this.A0E.A0G());
        r5.A0u();
        r5.A0e();
        this.A0J.A02(r4.A0G);
        this.A0h.set(0);
        this.A0j.set(0);
        this.A0i.set(0);
        this.A0f.set(0);
        r9.A0T();
        AnonymousClass0X8.A03();
        boolean A0I2 = r4.A0I();
        AnonymousClass0F1 r0 = this.A0H;
        if (A0I2) {
            r0.A08();
        } else {
            r0.A0c(true);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive/backup ");
            Log.i(AnonymousClass000.A0X(A05(r7), A0o));
            for (C56772sX r02 : (Set) this.A0b.get()) {
                r02.A0B(r7);
                r02.A0A();
            }
            this.A0X.BhD(r7);
        }
        this.A05 = 0;
    }

    public final void A0I() {
        C26041bU r2;
        long j;
        double d;
        double d2 = 0.0d;
        try {
            if (AnonymousClass0S8.A01(this.A0W)) {
                d = 0.0d;
                for (File length : this.A0U.A0S(3)) {
                    d += (double) length.length();
                }
            } else {
                File A0K2 = this.A0U.A0K();
                if (A0K2 != null) {
                    d = (double) A0K2.length();
                } else {
                    d = 0.0d;
                }
            }
            r2 = this.A0Y;
            r2.A05 = Double.valueOf(d);
        } catch (IOException e) {
            Log.e("gdrive/backup", e);
            r2 = this.A0Y;
            r2.A05 = Double.valueOf(0.0d);
        }
        AtomicLong atomicLong = this.A0h;
        if (((double) atomicLong.get()) > r2.A05.doubleValue()) {
            d2 = ((double) atomicLong.get()) - r2.A05.doubleValue();
        }
        r2.A07 = Double.valueOf(d2);
        r2.A09 = Double.valueOf((double) this.A05);
        long j2 = 0;
        for (File A012 : this.A0d) {
            j2 += A01(A012);
        }
        r2.A06 = Double.valueOf((double) j2);
        AnonymousClass33p r3 = this.A0S;
        r2.A0e = Long.valueOf((long) r3.A0E());
        r2.A00 = Boolean.valueOf(r3.A27());
        if (this.A0G.A06() == 1) {
            j = 1;
        } else {
            j = 0;
        }
        r2.A0b = Long.valueOf(j);
        if (r2.A0V == null) {
            r2.A0V = 1;
        }
        AnonymousClass0Y7 r32 = this.A0L;
        r2.A08 = Double.valueOf((double) (r32.A08.A00 + r32.A0J.get()));
        Integer num = r2.A0U;
        if (num == null || num.intValue() == 1) {
            r2.A0U = 2;
        }
        for (C56772sX A0B2 : (Set) this.A0b.get()) {
            A0B2.A0B(r2);
        }
        this.A0X.BhB(r2);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/backup ");
        Log.i(AnonymousClass000.A0X(A05(r2), A0o));
    }

    public void A0K(boolean z) {
        this.A0H.A0c(false);
        if (z) {
            AnonymousClass33p r2 = this.A0S;
            r2.A0o();
            if (r2.A0E() >= 4) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gdrive/backup ");
                A0o.append(r2.A0E());
                Log.e(AnonymousClass000.A0X(" successive backups have failed, this is probably unusual.", A0o));
            }
        }
        A0I();
        this.A05 = 0;
        this.A0S.A17(0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c6, code lost:
        if (r11 == false) goto L_0x00d8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0L() {
        /*
            r12 = this;
            X.0F1 r0 = r12.A0H
            r0.A0A()
            X.33p r4 = r12.A0S
            r7 = 1
            r4.A17(r7)
            X.0hc r6 = r12.A0G
            boolean r0 = r12.A0k
            r6.A0a(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive/backup/force-backup-over-cellular/"
            r1.append(r0)
            boolean r0 = r6.A0e()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.1bU r1 = r12.A0Y
            X.0WN r0 = r12.A0E
            boolean r0 = r0.A0G()
            r2 = 0
            if (r0 == 0) goto L_0x006d
            r8 = 1
        L_0x0037:
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r1.A0a = r0
            X.0Y7 r8 = r12.A0L
            X.0nk r0 = r8.A08
            r5 = 0
            r0.A00 = r5
            java.util.concurrent.atomic.AtomicInteger r0 = r8.A0J
            r0.set(r5)
            java.util.concurrent.atomic.AtomicLong r10 = r12.A0i
            r10.set(r2)
            java.util.concurrent.atomic.AtomicInteger r9 = r12.A0f
            r9.set(r5)
            java.util.concurrent.atomic.AtomicLong r0 = r12.A0g
            r0.set(r2)
            r12.A05 = r2
            r12.A01 = r5
            r12.A00 = r5
            r12.A07 = r2
            r12.A02 = r2
            r12.A03 = r2
            r12.A08 = r2
            r12.A06 = r2
            r12.A09 = r2
            r12.A04 = r2
            goto L_0x0070
        L_0x006d:
            r8 = 0
            goto L_0x0037
        L_0x0070:
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            r1.A0V = r0     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            X.0Qi r0 = r12.A0K     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            boolean r0 = X.C06520Ya.A0C(r0, r8)     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            boolean r11 = r12.A0M()     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            if (r11 == 0) goto L_0x009e
            r4.A17(r5)     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            X.0tN r1 = r12.A0M     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            r0 = 10
            r1.onError(r0)     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            goto L_0x00c8
        L_0x0090:
            r0 = 31
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            r1.A0U = r0     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            java.lang.String r0 = "gdrive/backup/fetch-token/network-failure-at-token-fetch-stage"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 0GS -> 0x00b0, 23j -> 0x00b8 }
            r11 = 0
        L_0x009e:
            boolean r0 = r6.A0b()     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            if (r0 == 0) goto L_0x00d8
            X.0tN r1 = r12.A0M     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            r0 = 14
            r1.onError(r0)     // Catch:{ 0GS -> 0x00ae, 23j -> 0x00ac }
            goto L_0x00d8
        L_0x00ac:
            r1 = move-exception
            goto L_0x00ba
        L_0x00ae:
            r1 = move-exception
            goto L_0x00b2
        L_0x00b0:
            r1 = move-exception
            r11 = 0
        L_0x00b2:
            X.0tN r0 = r12.A0M
            A06(r1, r0)
            goto L_0x00c6
        L_0x00b8:
            r1 = move-exception
            r11 = 0
        L_0x00ba:
            java.lang.String r0 = "gdrive/backup"
            com.whatsapp.util.Log.e(r0, r1)
            X.0tN r1 = r12.A0M
            r0 = 20
            r1.onError(r0)
        L_0x00c6:
            if (r11 == 0) goto L_0x00d8
        L_0x00c8:
            r12.A0H()
        L_0x00cb:
            r6.A0w(r5)
            X.1VX r2 = r12.A0W
            X.1uL r1 = r12.A0a
            X.0U8 r0 = r12.A0C
            com.whatsapp.backup.google.workers.BackupGpbSignalWorker.A04(r0, r4, r2, r1)
            return r11
        L_0x00d8:
            X.AnonymousClass0X8.A03()
            r10.set(r2)
            r9.set(r5)
            monitor-enter(r8)
            boolean r0 = r8.A01     // Catch:{ all -> 0x010a }
            monitor-exit(r8)
            if (r0 == 0) goto L_0x00f0
            java.lang.String r0 = "gdrive/backup was canceled"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            r12.A0G()
            goto L_0x00cb
        L_0x00f0:
            X.0Qi r0 = r12.A0K
            boolean r0 = r0.A05()
            if (r0 != 0) goto L_0x0101
            java.lang.String r0 = "gdrive/backup failed on unavailable resource conditions"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r12.A0E()
            goto L_0x00cb
        L_0x0101:
            java.lang.String r0 = "gdrive/backup failed"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r12.A0K(r7)
            goto L_0x00cb
        L_0x010a:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YL.A0L():boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:116:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x01e2  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0229  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0M() {
        /*
            r36 = this;
            java.lang.String r25 = "gdrive/backup/files"
            com.whatsapp.util.Log.i((java.lang.String) r25)
            r7 = r36
            X.0F1 r10 = r7.A0H
            r10.A09()
            X.1bU r6 = r7.A0Y
            r0 = 11
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            java.util.List r12 = r7.A0B()
            boolean r1 = X.C57202tG.A01(r12)
            r0 = 31
            java.lang.Integer r5 = java.lang.Integer.valueOf(r0)
            r2 = 0
            if (r1 != 0) goto L_0x002f
            java.lang.String r0 = "gdrive/backup/files/chatdb doesn't exist"
            com.whatsapp.util.Log.i((java.lang.String) r0)
        L_0x002c:
            r6.A0U = r5
        L_0x002e:
            return r2
        L_0x002f:
            X.0hc r0 = r7.A0G
            r35 = r0
            boolean r0 = r35.A0b()
            java.lang.String r24 = "gdrive/backup/files/cancelled"
            if (r0 == 0) goto L_0x0338
            r0 = 3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r6.A0V = r3
            java.lang.String r9 = r7.A0c
            X.0Qi r11 = r7.A0K
            X.0Y7 r8 = r7.A0L
            r0 = r25
            X.0Ub r4 = X.C06520Ya.A01(r11, r8, r9, r0)
            if (r4 != 0) goto L_0x006b
            X.0w1 r1 = new X.0w1
            r1.<init>(r8, r9, r2)
            java.lang.Object r4 = X.AnonymousClass0X8.A01(r1, r11, r0)
            X.0Ub r4 = (X.C05580Ub) r4
            if (r4 != 0) goto L_0x006b
            r0 = 30
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0U = r0
            java.lang.String r0 = "gdrive/backup/files unable to create backup"
        L_0x0067:
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r2
        L_0x006b:
            boolean r0 = r35.A0b()
            if (r0 == 0) goto L_0x0338
            r0 = 4
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            X.2sH r1 = r7.A0P
            X.1VX r9 = r7.A0W
            boolean r0 = r7.A0k
            long r16 = X.C06550Ye.A03(r9, r0)
            long r18 = r7.A09(r4, r12)
            r13 = r11
            r14 = r4
            r15 = r1
            boolean r0 = X.C06520Ya.A0B(r13, r14, r15, r16, r18)
            if (r0 != 0) goto L_0x0094
            r6.A0U = r5
            java.lang.String r0 = "gdrive/backup/files unable to start transaction"
            goto L_0x0067
        L_0x0094:
            java.lang.String r0 = "gdrive/backup/files loading files"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x002e
            r0 = 5
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            java.util.ArrayList r0 = X.AnonymousClass001.A0s()
            java.util.List r9 = java.util.Collections.synchronizedList(r0)
            boolean r0 = r7.A0P(r4, r9)
            if (r0 == 0) goto L_0x002c
            boolean r0 = r35.A0b()
            if (r0 == 0) goto L_0x0338
            X.3dV r0 = r7.A0V
            int r0 = r0.A01()
            long r0 = (long) r0
            r33 = r0
            java.util.concurrent.atomic.AtomicLong r0 = r7.A0h
            r32 = r0
            r0 = 0
            r13 = r32
            r13.set(r0)
            java.util.concurrent.atomic.AtomicLong r13 = r7.A0g
            r13.set(r0)
            r13 = 6
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6.A0V = r13
            r13 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r13 = X.AnonymousClass002.A0I(r13)
            java.util.List r23 = java.util.Collections.synchronizedList(r13)
            r13 = r23
            boolean r13 = r7.A0S(r12, r13, r9)
            if (r13 == 0) goto L_0x002e
            boolean r13 = r11.A06()
            if (r13 == 0) goto L_0x002e
            X.33p r13 = r7.A0S
            long r16 = r13.A0I()
            int r14 = (r16 > r0 ? 1 : (r16 == r0 ? 0 : -1))
            if (r14 >= 0) goto L_0x0100
            long r16 = r13.A0N()
        L_0x0100:
            r0 = 8
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            int r14 = r9.size()
            r15 = 0
        L_0x010d:
            if (r15 >= r14) goto L_0x0130
            int r1 = r15 + 2500
            int r0 = java.lang.Math.min(r1, r14)
            java.util.List r0 = r9.subList(r15, r0)
            X.0Dr r15 = new X.0Dr
            r15.<init>(r4, r8, r0)
            r0 = r25
            java.lang.Object r15 = X.AnonymousClass0X8.A01(r15, r11, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            if (r15 != r0) goto L_0x012a
            r15 = r1
            goto L_0x010d
        L_0x012a:
            r6.A0U = r5
            java.lang.String r0 = "gdrive/backup/files/failed to delete files"
            goto L_0x0067
        L_0x0130:
            r0 = 7
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            int r8 = r23.size()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive/backup/files/files-to-be-uploaded/count/"
            java.lang.String r0 = X.AnonymousClass000.A0Y(r0, r1, r8)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.util.Iterator r22 = r23.iterator()
            r15 = 0
            r20 = 0
        L_0x014f:
            boolean r0 = r22.hasNext()
            r18 = 1
            if (r0 == 0) goto L_0x018d
            java.lang.Object r14 = r22.next()
            X.0UO r14 = (X.AnonymousClass0UO) r14
            java.lang.String r1 = r14.A06
            java.lang.String r0 = "-increment-"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x017b
            long r20 = r20 + r18
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0Y = r0
            r2 = 1
        L_0x0171:
            long r0 = r14.A01()
            r14 = r32
            r14.addAndGet(r0)
            goto L_0x014f
        L_0x017b:
            java.lang.String r0 = "msgstore.db"
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0171
            long r20 = r20 + r18
            r15 = 1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r15)
            r6.A0Y = r0
            goto L_0x0171
        L_0x018d:
            java.lang.Long r0 = java.lang.Long.valueOf(r20)
            r6.A0g = r0
            if (r15 == 0) goto L_0x0199
            if (r2 == 0) goto L_0x0199
            r6.A0Y = r3
        L_0x0199:
            boolean r0 = r11.A06()
            if (r0 == 0) goto L_0x0263
            int r1 = r35.A06()
            r0 = 1
            if (r1 != r0) goto L_0x0200
            java.lang.Long r0 = java.lang.Long.valueOf(r18)
        L_0x01aa:
            r6.A0d = r0
        L_0x01ac:
            long r0 = r13.A0K()
            java.util.concurrent.atomic.AtomicLong r2 = r7.A0j
            r20 = r2
            r2.set(r0)
            r2 = r32
            r2.addAndGet(r0)
            long r2 = r20.get()
            r13 = 1
            long r0 = r32.get()
            r10.A0R(r2, r0)
            java.util.concurrent.atomic.AtomicBoolean r14 = new java.util.concurrent.atomic.AtomicBoolean
            r14.<init>(r13)
            r10 = 0
            java.util.concurrent.atomic.AtomicReference r15 = new java.util.concurrent.atomic.AtomicReference
            r15.<init>(r10)
            java.util.concurrent.CountDownLatch r1 = new java.util.concurrent.CountDownLatch
            r1.<init>(r8)
            java.util.Iterator r3 = r23.iterator()
        L_0x01dc:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x020a
            java.lang.Object r2 = r3.next()
            X.0UO r2 = (X.AnonymousClass0UO) r2
            boolean r0 = r7.A0T(r15, r8)
            if (r0 != 0) goto L_0x0263
            r26 = r7
            r27 = r4
            r28 = r2
            r29 = r1
            r30 = r14
            r31 = r15
            boolean r0 = r26.A0O(r27, r28, r29, r30, r31)
            r13 = r13 & r0
            goto L_0x01dc
        L_0x0200:
            r0 = 2
            if (r1 != r0) goto L_0x01ac
            r0 = 0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            goto L_0x01aa
        L_0x020a:
            java.lang.String r0 = "gdrive/backup/files waiting for backup to finish..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ InterruptedException -> 0x021a }
            boolean r0 = r1.await(r2, r0)     // Catch:{ InterruptedException -> 0x021a }
            r13 = r13 & r0
            goto L_0x0223
        L_0x021a:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/files upload interrupted"
            com.whatsapp.util.Log.e(r0, r1)
            r6.A0U = r5
            r13 = 0
        L_0x0223:
            boolean r0 = r7.A0T(r15, r8)
            if (r0 != 0) goto L_0x0263
            boolean r0 = r14.get()
            r13 = r13 & r0
            if (r13 == 0) goto L_0x024e
            java.lang.String r0 = "message-store-backups-not-uploaded"
            r7.A0J(r0, r12)
            r0 = 9
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            java.lang.String r0 = "gdrive/backup/perf/build-metadata"
            X.33M r8 = new X.33M
            r8.<init>((java.lang.String) r0)
            r7.A0F()     // Catch:{ IOException -> 0x02b9 }
            r0 = r33
            java.util.Map r10 = r7.A0D(r0)     // Catch:{ IOException -> 0x02b9 }
            goto L_0x02bf
        L_0x024e:
            java.lang.String r0 = "gdrive/backup/files failed to uploadFiles"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Integer r0 = r6.A0U
            if (r0 != 0) goto L_0x0263
            r6.A0U = r5
            goto L_0x0263
        L_0x025a:
            boolean r0 = r35.A0b()
            if (r0 != 0) goto L_0x0265
            com.whatsapp.util.Log.i((java.lang.String) r24)
        L_0x0263:
            r8 = 0
            return r8
        L_0x0265:
            r8 = 0
            boolean r0 = r35.A0b()
            if (r0 != 0) goto L_0x0270
            com.whatsapp.util.Log.i((java.lang.String) r24)
            return r8
        L_0x0270:
            java.util.Iterator r13 = r9.iterator()
        L_0x0274:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x028e
            java.lang.Object r8 = r13.next()
            X.0UI r8 = (X.AnonymousClass0UI) r8
            long r0 = r7.A04
            long r8 = r8.A00
            long r0 = r0 + r8
            r7.A04 = r0
            long r0 = r7.A07
            long r0 = r0 + r18
            r7.A07 = r0
            goto L_0x0274
        L_0x028e:
            java.lang.String r0 = "message-store-backups-deleted"
            r7.A0J(r0, r12)
            X.31C r0 = r7.A0Z
            r0.A08(r2)
            r0 = 10
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r6.A0V = r0
            X.0Du r1 = new X.0Du
            r1.<init>(r4, r10)
            r0 = r25
            java.lang.Object r1 = X.AnonymousClass0X8.A01(r1, r11, r0)
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8 = 1
            if (r1 == r0) goto L_0x02cc
            r8 = 0
            r6.A0U = r5
            java.lang.String r0 = "gdrive/backup/files failed to commit backup"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x02cc
        L_0x02b9:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/build-metadata"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x02bf:
            r8.A07()
            if (r10 != 0) goto L_0x025a
            java.lang.String r0 = "gdrive/backup/files/failed to build metadata"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r6.A0U = r5
            r8 = 0
        L_0x02cc:
            long r1 = java.lang.System.currentTimeMillis()
            java.util.Locale r11 = java.util.Locale.ENGLISH
            java.lang.Object[] r5 = X.AnonymousClass002.A0L()
            long r1 = r1 - r16
            double r9 = (double) r1
            r3 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r9 = r9 / r3
            java.lang.Double r3 = java.lang.Double.valueOf(r9)
            r0 = 0
            r5[r0] = r3
            java.lang.String r0 = "gdrive/backup/files total wall time for backup: %2f seconds."
            java.lang.String r0 = java.lang.String.format(r11, r0, r5)
            com.whatsapp.util.Log.d((java.lang.String) r0)
            long r9 = r20.get()
            java.util.concurrent.atomic.AtomicLong r5 = r7.A0i
            long r3 = r5.get()
            long r9 = r9 + r3
            double r3 = (double) r9
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r6.A0B = r0
            long r9 = r5.get()
            double r3 = (double) r9
            java.lang.Double r0 = java.lang.Double.valueOf(r3)
            r6.A0A = r0
            long r9 = r32.get()
            long r3 = r7.A05
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1T(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r6.A01 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r6.A0f = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive/backup/files backup finished (success ="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.AnonymousClass000.A0e(r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return r8
        L_0x0338:
            com.whatsapp.util.Log.i((java.lang.String) r24)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YL.A0M():boolean");
    }

    public boolean A0N(C05580Ub r18, AnonymousClass0UO r19) {
        long j;
        AnonymousClass0UO r1 = r19;
        String.format("gdrive-service/upload-file filePath:%s, fileUploadPath:%s", new Object[]{r1.A02(), r1.A06});
        AtomicLong atomicLong = this.A0h;
        if (atomicLong.get() <= 0 || A00(this.A0i, atomicLong) <= 1.0d) {
            C04710Qi r9 = this.A0K;
            if (r9.A06()) {
                C10240hc r2 = this.A0G;
                if (r2.A06() == 2) {
                    this.A0Y.A0d = 0L;
                }
                try {
                    C17710w2 r11 = new C17710w2(r18, this, r1, 0);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("gdrive-service/upload ");
                    AnonymousClass0UI r10 = (AnonymousClass0UI) AnonymousClass0X8.A01(r11, r9, AnonymousClass000.A0X("<file>", A0o));
                    if (r10 == null) {
                    }
                    if (r9.A06() && r10 != null) {
                        Log.i("gdrive/backup/upload/success");
                        this.A0e.put(r10.A01(), r10);
                        AtomicLong atomicLong2 = this.A0j;
                        AnonymousClass0UF r0 = r10.A02;
                        if (r0 != null) {
                            j = r0.A00;
                        } else {
                            j = r10.A00;
                        }
                        atomicLong2.addAndGet(j);
                        this.A0S.A1H(atomicLong2.get());
                        if (r2.A0b()) {
                            this.A0H.A0R(atomicLong2.get(), atomicLong.get());
                            return true;
                        }
                        Locale locale = Locale.ENGLISH;
                        Object[] objArr = new Object[2];
                        AnonymousClass000.A1Q(objArr, 0, atomicLong2.get());
                        AnonymousClass000.A1Q(objArr, 1, atomicLong.get());
                        Log.i(String.format(locale, "gdrive-service/upload/success gdrive file map is null, notify backup progress suppressed: %d/%d", objArr));
                        return true;
                    }
                } finally {
                    AtomicLong atomicLong3 = this.A0i;
                    atomicLong3.addAndGet(r1.A01());
                    this.A0f.incrementAndGet();
                    Log.i(AnonymousClass001.A0k(AnonymousClass000.A0l("gdrive/backup/upload/failed-bytes/"), atomicLong3.get()));
                    StringBuilder A0l = AnonymousClass000.A0l("gdrive/backup/upload/failure-percentage/");
                    A0l.append(A00(atomicLong3, atomicLong));
                    Log.i(AnonymousClass000.A0X("% bytes", A0l));
                }
            }
        } else {
            Log.i("gdrive/backup/upload-file/too-many-failures");
            this.A0Y.A0U = 38;
        }
        return false;
    }

    public boolean A0O(C05580Ub r19, AnonymousClass0UO r20, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        AnonymousClass0UO r14 = r20;
        File file = r14.A04;
        CountDownLatch countDownLatch2 = countDownLatch;
        if (!file.exists()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive/backup/backup-file file ");
            A0o.append("<file>");
            Log.i(AnonymousClass000.A0X(" does not exist", A0o));
            countDownLatch2.countDown();
            return true;
        }
        if (file.isDirectory()) {
            this.A0Y.A0U = 31;
            Log.e(AnonymousClass000.A0V("gdrive-service/backup-file/expected-file-got-directory-instead/", "<file>", AnonymousClass001.A0o()));
        } else if (!this.A0G.A0b()) {
            Log.i("gdrive/backup/backup-file backup has been cancelled.");
        } else {
            AtomicLong atomicLong = this.A0h;
            if (atomicLong.get() > 0) {
                AtomicLong atomicLong2 = this.A0i;
                if ((((double) atomicLong2.get()) * 100.0d) / ((double) atomicLong.get()) > 1.0d) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    A0o2.append("gdrive/backup/backup-file/too-many-failures upload-failed:");
                    A0o2.append(atomicLong2.get());
                    Log.i(AnonymousClass000.A0P(atomicLong, " upload-total:", A0o2));
                    countDownLatch2.countDown();
                    this.A0Y.A0U = 38;
                    return false;
                }
            }
            C06540Yd.A00.execute(new C13150mi(r19, this, r14, countDownLatch2, atomicBoolean, atomicReference));
            return true;
        }
        countDownLatch2.countDown();
        return false;
    }

    public boolean A0P(C05580Ub r4, List list) {
        Map map = this.A0e;
        map.clear();
        Map A062 = C06520Ya.A06(this.A0K, r4, list);
        if (A062 == null) {
            Log.e("gdrive/backup/failed to load files for backup");
            return false;
        }
        map.putAll(A062);
        C06520Ya.A08(this.A0E, A062.values());
        return true;
    }

    public boolean A0R(List list, List list2, List list3) {
        AnonymousClass33M r3 = new AnonymousClass33M("gdrive/backup/perf/collect-referenced-files-with-constraints");
        ArrayList A0s = AnonymousClass001.A0s();
        A0s.addAll(list);
        A0s.addAll(A0C());
        Iterator it = A0s.iterator();
        long j = 0;
        while (it.hasNext()) {
            j += ((File) it.next()).length();
        }
        AnonymousClass0WF r9 = this.A0F;
        long A042 = j + r9.A04(r9.A05());
        this.A05 = A042;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/backup/collectReferencedFilesToBackupWithConstraints essential files size ");
        A0o.append(j);
        Log.i(AnonymousClass000.A0Z(", estimated total size ", A0o, A042));
        List list4 = list2;
        List list5 = list3;
        if (!A0Q(A0s, list4, list5)) {
            Log.e("gdrive/backup/collectReferencedFilesToBackupWithConstraints processing essential files failed");
            r3.A07();
            return false;
        }
        try {
            r9.A06(this.A0I, this, list4, list5, this.A0e);
            r3.A07();
            return true;
        } catch (AnonymousClass0EH unused) {
            Log.e("gdrive/backup/collectReferencedFilesToBackupWithConstraints processing referenced media files failed");
            r3.A07();
            return false;
        }
    }

    public final boolean A0S(List list, List list2, List list3) {
        long j;
        Log.i("gdrive/backup/collectFilesToBackupAndRemove/collect media files referenced from messages");
        boolean A0R2 = A0R(list, list2, list3);
        if (!A0R2) {
            this.A0Y.A0U = 25;
            Log.e("gdrive/backup/collectFilesToBackupAndRemove/files failed to generate list of files to be uploaded.");
        } else {
            Iterator it = list2.iterator();
            long j2 = 0;
            while (it.hasNext()) {
                j2 += ((AnonymousClass0UO) it.next()).A01();
            }
            Iterator A0v = AnonymousClass001.A0v(this.A0e);
            long j3 = 0;
            while (A0v.hasNext()) {
                AnonymousClass0UI r3 = (AnonymousClass0UI) A0v.next();
                AnonymousClass0UF r0 = r3.A02;
                if (r0 != null) {
                    j = r0.A00;
                } else {
                    j = r3.A00;
                }
                j3 += j;
            }
            long j4 = j2 + j3;
            this.A05 = j4;
            Log.i(AnonymousClass000.A0Z("gdrive/backup/collectFilesToBackupAndRemove/files/estimated total size of backup ", AnonymousClass001.A0o(), j4));
        }
        Map map = this.A0e;
        Iterator A0v2 = AnonymousClass001.A0v(map);
        while (A0v2.hasNext()) {
            AnonymousClass0UI r6 = (AnonymousClass0UI) A0v2.next();
            C55682qk r2 = this.A0A;
            AnonymousClass310 r1 = this.A0N;
            String A012 = r6.A01();
            String A042 = AnonymousClass0YV.A04(this.A0Q.A06(), r2, r1, A012);
            if (A042 == null || !AnonymousClass002.A0B(A042).exists()) {
                map.remove(A012);
                list3.add(r6);
            } else {
                try {
                    File A0B2 = AnonymousClass002.A0B(A042);
                    String canonicalPath = A0B2.getCanonicalPath();
                    C04450Oi r12 = this.A0I;
                    if (r12.A01(canonicalPath) && !r12.A00(A0B2, canonicalPath)) {
                        A0B2.length();
                        map.remove(A012);
                        list3.add(r6);
                    }
                } catch (IOException e) {
                    Log.e("gdrive/backup/collectFilesToBackupAndRemove/failed to get canonical path", e);
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1H("gdrive/backup/collectFilesToBackupAndRemove/files/ file to upload: ", A0o, list2);
        AnonymousClass000.A1H(" and remove: ", A0o, list3);
        Log.i(A0o.toString());
        return A0R2;
    }

    public final boolean A0T(AtomicReference atomicReference, int i) {
        StringBuilder A0l;
        String str;
        if (!this.A0G.A0b()) {
            Log.i("gdrive/backup/cancelled.");
            return true;
        }
        Throwable th = (Throwable) atomicReference.get();
        if (th != null) {
            Log.i("gdrive/backup", th);
            if ((th instanceof AnonymousClass0EX) || (th instanceof AnonymousClass0EW) || (th instanceof AnonymousClass0EM) || (th instanceof AnonymousClass0EK) || (th instanceof AnonymousClass0EN) || (th instanceof AnonymousClass0EV) || (th instanceof AnonymousClass0EL) || (th instanceof AnonymousClass0EJ)) {
                throw th;
            }
        }
        AtomicLong atomicLong = this.A0h;
        if (atomicLong.get() > 0) {
            AtomicLong atomicLong2 = this.A0i;
            if (A00(atomicLong2, atomicLong) > 1.0d) {
                A0l = AnonymousClass000.A0l("gdrive/backup/too-many-failures/");
                A0l.append(A00(atomicLong2, atomicLong));
                str = "% bytes";
                Log.i(AnonymousClass000.A0X(str, A0l));
                this.A0Y.A0U = 38;
                return true;
            }
        }
        if (i <= 0) {
            return false;
        }
        AtomicInteger atomicInteger = this.A0f;
        double d = (double) i;
        if ((((double) atomicInteger.get()) * 100.0d) / d <= 1.0d) {
            return false;
        }
        A0l = AnonymousClass000.A0l("gdrive/backup/too-many-failures/");
        A0l.append((((double) atomicInteger.get()) * 100.0d) / d);
        str = "% files";
        Log.i(AnonymousClass000.A0X(str, A0l));
        this.A0Y.A0U = 38;
        return true;
    }

    public static long A01(File file) {
        long j;
        if (!file.exists()) {
            return 0;
        }
        if (file.isDirectory()) {
            LinkedList linkedList = new LinkedList();
            linkedList.add(file);
            long j2 = 0;
            while (linkedList.peek() != null) {
                Object poll = linkedList.poll();
                C626936e.A06(poll);
                File[] listFiles = ((File) poll).listFiles();
                if (listFiles != null) {
                    for (File file2 : listFiles) {
                        if (file2.exists()) {
                            if (file2.isDirectory()) {
                                linkedList.add(file2);
                            } else {
                                if (file2.length() > 0) {
                                    j = 1;
                                } else {
                                    j = 0;
                                }
                                j2 += j;
                            }
                        }
                    }
                }
            }
            return j2;
        } else if (file.length() > 0) {
            return 1;
        } else {
            return 0;
        }
    }

    public List A0B() {
        List<File> synchronizedList = Collections.synchronizedList(AnonymousClass001.A0s());
        try {
            Boolean bool = (Boolean) AnonymousClass0X8.A01(new AnonymousClass0Dn(this, synchronizedList), this.A0K, "gdrive/backup/getLatestMessageStoreBackupFiles looking for message store backup files");
            if (bool == null || !bool.booleanValue()) {
                Log.e("gdrive/backup/getLatestMessageStoreBackupFiles message store base backup file does not exist. The user deleted it or local backup is currently running.");
                throw new AnonymousClass0EO("Message store base backup file does not exist.");
            }
            for (File name : synchronizedList) {
                name.getName();
            }
            return synchronizedList;
        } catch (AnonymousClass0GS e) {
            throw new IllegalStateException("Unexpected failure: ", e);
        }
    }

    public final List A0C() {
        ArrayList A0s = AnonymousClass001.A0s();
        C06540Yd.A0I(this.A0G, this.A0N.A02(), A0s);
        return A0s;
    }

    public void A0J(String str, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass310 r1 = this.A0N;
            String A062 = AnonymousClass0YV.A06(this.A0Q.A06(), r1, (File) it.next());
            if (this.A0e.get(A062) == null) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("gdrive/backup/files/");
                A0o.append(str);
                Log.e(AnonymousClass000.A0X("/cancel-backup", A0o));
                throw new AnonymousClass0EO(AnonymousClass000.A0V("Message store backup files are not backed up, file: ", A062, AnonymousClass001.A0o()));
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0058, code lost:
        if (r7.length() <= 0) goto L_0x005a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0Q(java.util.Collection r26, java.util.List r27, java.util.List r28) {
        /*
            r25 = this;
            r26.size()
            r0 = 0
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>(r0)
            int r0 = r26.size()
            java.util.concurrent.CountDownLatch r8 = new java.util.concurrent.CountDownLatch
            r8.<init>(r0)
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r5 = new java.util.concurrent.atomic.AtomicBoolean
            r5.<init>(r0)
            int r1 = r26.size()
            r0 = 100
            if (r1 <= r0) goto L_0x0095
            int r15 = r26.size()
            int r15 = r15 / r0
        L_0x0025:
            java.util.Iterator r14 = r26.iterator()
            r13 = 0
            r12 = 0
        L_0x002b:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0097
            java.lang.Object r7 = r14.next()
            java.io.File r7 = (java.io.File) r7
            r4 = r25
            X.0Qi r0 = r4.A0K
            boolean r0 = r0.A06()
            if (r0 != 0) goto L_0x0042
            return r13
        L_0x0042:
            int r0 = r12 % r15
            boolean r24 = X.AnonymousClass000.A1T(r0)
            boolean r0 = r7.exists()
            r11 = 1
            if (r0 == 0) goto L_0x005a
            long r9 = r7.length()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r3 = 1
            if (r0 > 0) goto L_0x005b
        L_0x005a:
            r3 = 0
        L_0x005b:
            java.lang.String r2 = X.C06520Ya.A02(r7)
            X.0Oi r1 = r4.A0I
            boolean r0 = r1.A01(r2)
            if (r0 == 0) goto L_0x006e
            boolean r0 = r1.A00(r7, r2)
            if (r0 != 0) goto L_0x006e
            r11 = 0
        L_0x006e:
            r3 = r3 & r11
            if (r3 == 0) goto L_0x008e
            X.0ml r1 = new X.0ml
            r20 = r27
            r21 = r28
            r22 = r8
            r23 = r6
            r19 = r2
            r18 = r7
            r17 = r4
            r16 = r1
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24)
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass0K3.A02
            r0.execute(r1)
        L_0x008b:
            int r12 = r12 + 1
            goto L_0x002b
        L_0x008e:
            r7.length()
            r8.countDown()
            goto L_0x008b
        L_0x0095:
            r15 = 1
            goto L_0x0025
        L_0x0097:
            r8.await()     // Catch:{ InterruptedException -> 0x009b }
            goto L_0x00a1
        L_0x009b:
            r1 = move-exception
            java.lang.String r0 = "gdrive/backup/collect-files-to-be-uploaded/waiting for files to be processed was interrupted"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x00a1:
            java.lang.Object r1 = r6.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00b4
            boolean r0 = r1 instanceof X.AnonymousClass0EV
            if (r0 == 0) goto L_0x00ae
            throw r1
        L_0x00ae:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00b4:
            boolean r0 = r5.get()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0YL.A0Q(java.util.Collection, java.util.List, java.util.List):boolean");
    }

    public AnonymousClass0YL(C55682qk r5, C64393Dh r6, AnonymousClass0U8 r7, C06430Xr r8, AnonymousClass0WN r9, AnonymousClass0WF r10, C10240hc r11, AnonymousClass0F1 r12, C04450Oi r13, AnonymousClass0QR r14, C04710Qi r15, AnonymousClass0Y7 r16, C16420tN r17, AnonymousClass310 r18, C56512s6 r19, C56612sH r20, C54292oU r21, AnonymousClass5ZR r22, AnonymousClass33p r23, C613830m r24, C625835r r25, C72303dV r26, AnonymousClass1VX r27, AnonymousClass4FV r28, C26041bU r29, AnonymousClass31C r30, C34171uL r31, C183538qC r32, String str, List list, AtomicLong atomicLong, AtomicLong atomicLong2, boolean z) {
        this.A0Q = r21;
        this.A0c = str;
        this.A0P = r20;
        this.A0W = r27;
        this.A0A = r5;
        this.A0d = list;
        this.A0B = r6;
        this.A0H = r12;
        this.A0X = r28;
        this.A0N = r18;
        this.A0j = atomicLong;
        this.A0Z = r30;
        this.A0b = r32;
        this.A0K = r15;
        this.A0a = r31;
        this.A0E = r9;
        this.A0I = r13;
        this.A0O = r19;
        this.A0L = r16;
        this.A0k = z;
        this.A0h = atomicLong2;
        this.A0U = r25;
        this.A0V = r26;
        this.A0J = r14;
        this.A0R = r22;
        this.A0S = r23;
        this.A0T = r24;
        this.A0C = r7;
        this.A0F = r10;
        this.A0G = r11;
        this.A0Y = r29;
        this.A0D = r8;
        this.A0M = r17;
    }
}
