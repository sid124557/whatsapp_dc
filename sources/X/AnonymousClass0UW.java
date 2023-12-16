package X;

import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONObject;

/* renamed from: X.0UW  reason: invalid class name */
public class AnonymousClass0UW {
    public final Context A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final AnonymousClass0WN A03;
    public final C10240hc A04;
    public final C06260Ww A05;
    public final AnonymousClass0F1 A06;
    public final C04710Qi A07;
    public final AnonymousClass0Y7 A08;
    public final AnonymousClass310 A09;
    public final C56612sH A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final AnonymousClass319 A0D;
    public final AnonymousClass4FV A0E;
    public final C25911bH A0F;
    public final C59302wh A0G;
    public final C618232j A0H;
    public final String A0I;
    public final AtomicInteger A0J = new AtomicInteger(1);
    public final AtomicLong A0K = new AtomicLong(0);
    public final AtomicLong A0L;
    public final AtomicLong A0M;

    public static /* synthetic */ void A00(AnonymousClass0UW r6, AnonymousClass0UI r7, File file, String str, List list, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference, boolean z) {
        try {
            if (!r6.A07.A06()) {
                atomicBoolean.set(false);
            } else if (z || !file.exists() || file.length() <= 0) {
                int A002 = C06520Ya.A00(r7, r6.A09, r6.A0B, file.getAbsolutePath());
                if (A002 != 1) {
                    if (A002 == 2) {
                        Log.e(String.format("restore>MediaRestoreAction/get-files-to-be-downloaded received '%s' from gdrive file map which does not exist.", new Object[]{str}));
                    } else if (A002 == 3) {
                        C25911bH r1 = r6.A0F;
                        C626936e.A06(r1);
                        r1.A01 = Boolean.FALSE;
                    }
                }
                list.add(str);
            }
        } catch (AnonymousClass0EV e) {
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public final File A01(AnonymousClass0UI r8, File file) {
        StringBuilder A0o;
        String obj;
        AnonymousClass0WN r4 = this.A03;
        if (!r4.A0G()) {
            obj = "restore>MediaRestoreAction/decrypt-media/failed encryption disabled";
        } else {
            String name = file.getName();
            if (!name.endsWith(".mcrypt1")) {
                A0o = AnonymousClass001.A0o();
                A0o.append("restore>MediaRestoreAction/decrypt-media/failed no extension ");
                A0o.append(name);
            } else {
                C55682qk r3 = this.A01;
                AnonymousClass310 r2 = this.A09;
                String A012 = r8.A01();
                String A042 = AnonymousClass0YV.A04(this.A00, r3, r2, A012);
                if (A042 == null) {
                    A0o = AnonymousClass001.A0o();
                    A0o.append("restore>MediaRestoreAction/decrypt-media/failed to get path for ");
                    A0o.append(A012);
                } else {
                    File A0B2 = AnonymousClass002.A0B(A042);
                    File parentFile = A0B2.getParentFile();
                    if (parentFile == null || (!parentFile.exists() && !parentFile.mkdirs())) {
                        Log.w(AnonymousClass000.A0P(parentFile, "restore>MediaRestoreAction/decrypt-media/failed to create parent ", AnonymousClass001.A0o()));
                    }
                    if (r4.A0I(file, A0B2, C107575bX.A0H(name.substring(0, name.length() - 8)))) {
                        return A0B2;
                    }
                    return null;
                }
            }
            obj = A0o.toString();
        }
        Log.e(obj);
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(X.AnonymousClass0UI r9, java.util.ArrayList r10, java.util.concurrent.CountDownLatch r11, java.util.concurrent.atomic.AtomicInteger r12, java.util.concurrent.atomic.AtomicReference r13) {
        /*
            r8 = this;
            X.2qk r1 = r8.A01     // Catch:{ all -> 0x00f5 }
            X.310 r0 = r8.A09     // Catch:{ all -> 0x00f5 }
            java.lang.String r6 = r9.A06     // Catch:{ all -> 0x00f5 }
            android.content.Context r2 = r8.A00     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = X.AnonymousClass0YV.A04(r2, r1, r0, r6)     // Catch:{ all -> 0x00f5 }
            if (r0 != 0) goto L_0x001d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/null-local-path relative path:"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r6, r1)     // Catch:{ all -> 0x00f5 }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f1
        L_0x001d:
            java.io.File r4 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x00f5 }
            X.0Qi r3 = r8.A07     // Catch:{ all -> 0x00f5 }
            boolean r0 = r3.A06()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00f1
            java.lang.Object r0 = r13.get()     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0036
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/another-thread-failed/aborting-restore"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00f1
        L_0x0036:
            java.util.concurrent.atomic.AtomicLong r7 = r8.A0L     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            java.util.Objects.requireNonNull(r7)     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            X.0hW r1 = new X.0hW     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            r1.<init>(r7)     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            X.0Y7 r0 = r8.A08     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            boolean r0 = X.C06520Ya.A0A(r1, r3, r0, r9, r4)     // Catch:{ 0EY -> 0x00a2, 0EL | 0EN | 0EP | 0EV | 0EW | 0EX -> 0x00a0 }
            if (r0 == 0) goto L_0x00c2
            X.0UF r0 = r9.A02     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x006c
            long r0 = r0.A00     // Catch:{ all -> 0x00f5 }
        L_0x004e:
            r7.addAndGet(r0)     // Catch:{ all -> 0x00f5 }
            X.33p r5 = r8.A0C     // Catch:{ all -> 0x00f5 }
            long r0 = r7.get()     // Catch:{ all -> 0x00f5 }
            r5.A1G(r0)     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = ".mcrypt1"
            boolean r0 = r6.endsWith(r0)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x0070
            java.io.File r0 = r8.A01(r9, r4)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00cc
            r4.delete()     // Catch:{ all -> 0x00f5 }
            goto L_0x006f
        L_0x006c:
            long r0 = r9.A00     // Catch:{ all -> 0x00f5 }
            goto L_0x004e
        L_0x006f:
            r4 = r0
        L_0x0070:
            java.util.concurrent.atomic.AtomicInteger r5 = r8.A0J     // Catch:{ all -> 0x00f5 }
            int r0 = r5.getAndDecrement()     // Catch:{ all -> 0x00f5 }
            if (r0 <= 0) goto L_0x0092
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/About to regenerate thumbnails. Files left before limit: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r5, r0, r1)     // Catch:{ all -> 0x00f5 }
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x00f5 }
            r8.A03(r4)     // Catch:{ RuntimeException -> 0x0089 }
            goto L_0x0092
        L_0x0089:
            r1 = move-exception
            r5.incrementAndGet()     // Catch:{ all -> 0x00f5 }
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/thumbnail regeneration failed."
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f5 }
        L_0x0092:
            boolean r0 = r8.A05(r4)     // Catch:{ all -> 0x00f5 }
            if (r0 == 0) goto L_0x00cc
            android.net.Uri r0 = android.net.Uri.fromFile(r4)     // Catch:{ all -> 0x00f5 }
            X.C107655bf.A0Y(r2, r0)     // Catch:{ all -> 0x00f5 }
            goto L_0x00cc
        L_0x00a0:
            r1 = move-exception
            goto L_0x00ba
        L_0x00a2:
            r2 = move-exception
            int r1 = r12.incrementAndGet()     // Catch:{ all -> 0x00f5 }
            r0 = 20
            if (r1 <= r0) goto L_0x00b4
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file"
            com.whatsapp.util.Log.e(r0, r2)     // Catch:{ all -> 0x00f5 }
            r13.set(r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c2
        L_0x00b4:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file/missing file (non-critical)"
            com.whatsapp.util.Log.w(r0, r2)     // Catch:{ all -> 0x00f5 }
            goto L_0x00c2
        L_0x00ba:
            java.lang.String r0 = "restore>MediaRestoreAction/restore-file"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x00f5 }
            r13.set(r1)     // Catch:{ all -> 0x00f5 }
        L_0x00c2:
            r10.add(r9)     // Catch:{ all -> 0x00f5 }
            java.util.concurrent.atomic.AtomicLong r2 = r8.A0K     // Catch:{ all -> 0x00f5 }
            long r0 = r9.A00     // Catch:{ all -> 0x00f5 }
            r2.addAndGet(r0)     // Catch:{ all -> 0x00f5 }
        L_0x00cc:
            r11.countDown()
            boolean r0 = r3.A06()
            if (r0 == 0) goto L_0x00f0
            java.util.concurrent.atomic.AtomicLong r5 = r8.A0M
            long r3 = r5.get()
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f0
            X.0F1 r4 = r8.A06
            java.util.concurrent.atomic.AtomicLong r0 = r8.A0L
            long r2 = r0.get()
            long r0 = r5.get()
            r4.A0Y(r2, r0)
        L_0x00f0:
            return
        L_0x00f1:
            r11.countDown()
            return
        L_0x00f5:
            r0 = move-exception
            r11.countDown()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UW.A02(X.0UI, java.util.ArrayList, java.util.concurrent.CountDownLatch, java.util.concurrent.atomic.AtomicInteger, java.util.concurrent.atomic.AtomicReference):void");
    }

    public final void A03(File file) {
        for (C624134x A012 : this.A0D.A0G(file)) {
            this.A0G.A01(A012);
        }
    }

    public void A04(Map map) {
        String str;
        boolean z;
        long j;
        Map map2 = map;
        AnonymousClass33p r22 = this.A0C;
        if (!C06540Yd.A0K(r22)) {
            Log.i("restore>MediaRestoreAction/restore media called but media restore is not pending, request ignored.");
            return;
        }
        C10240hc r11 = this.A04;
        if (r11.A0y(true)) {
            Log.e("restore>MediaRestoreAction/media restore is already running, request ignored.");
            return;
        }
        if (r22.A07() != 10) {
            this.A05.A0C(10);
        }
        this.A0H.A02();
        AnonymousClass0F1 r21 = this.A06;
        r21.A0E();
        C25911bH r8 = this.A0F;
        r8.A01 = Boolean.TRUE;
        try {
            if (r22.A0L() <= 0) {
                r22.A0y();
            }
            AnonymousClass0Y7 r3 = this.A08;
            C13790nk r15 = r3.A08;
            r15.A00 = 0;
            AtomicInteger atomicInteger = r3.A0J;
            AtomicInteger atomicInteger2 = atomicInteger;
            atomicInteger.set(0);
            C06540Yd.A0D(r22);
            Log.i("restore>MediaRestoreAction/stage: authenticating with google servers");
            C04710Qi r5 = this.A07;
            if (!C06520Ya.A0C(r5, r3)) {
                this.A05.A0C(11);
            } else {
                Log.i("restore>MediaRestoreAction/stage: requesting backup");
                C05580Ub A012 = C06520Ya.A01(r5, r3, this.A0I, "gdrive/restore-media");
                if (A012 != null && (map == null || map2.isEmpty())) {
                    JSONObject jSONObject = A012.A0C;
                    if (jSONObject == null || !jSONObject.optBoolean("encryptedBackupEnabled", false)) {
                        j = 0;
                    } else {
                        j = 1;
                    }
                    r8.A0B = Long.valueOf(j);
                    Log.i("restore>MediaRestoreAction/stage: loading files from backup");
                    map2 = C06520Ya.A05(r11.A0L, A012);
                }
                if (map2 == null) {
                    this.A05.A0C(14);
                } else {
                    C06520Ya.A08(this.A03, map2.values());
                    boolean A072 = A07(map2);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("restore>MediaRestoreAction/stage: restoring files finished with ");
                    if (A072) {
                        str = "success";
                    } else {
                        str = "failure";
                    }
                    Log.i(AnonymousClass000.A0X(str, A0o));
                    if (A072) {
                        r8.A0A = 1;
                    } else {
                        this.A05.A0C(14);
                    }
                    int A062 = r11.A06();
                    if (A062 == 1) {
                        r8.A0C = 1L;
                    } else if (A062 == 2) {
                        r8.A0C = 0L;
                    }
                    r8.A0D = Long.valueOf(System.currentTimeMillis() - r22.A0L());
                    r8.A08 = Double.valueOf((double) this.A0M.get());
                    r8.A07 = Double.valueOf((double) this.A0K.get());
                    Log.d(String.format(Locale.ENGLISH, "restore>MediaRestoreAction/total wall time for media + message restore: %.1f seconds.", new Object[]{Double.valueOf(((double) r8.A0D.longValue()) / 1000.0d)}));
                    if (A012 != null) {
                        double d = (double) A012.A04;
                        r8.A06 = Double.valueOf(d);
                        JSONObject jSONObject2 = A012.A0C;
                        long j2 = -1;
                        if (jSONObject2 != null) {
                            j2 = jSONObject2.optLong("chatdbSize", -1);
                        }
                        r8.A02 = Double.valueOf((double) j2);
                        long j3 = -1;
                        if (jSONObject2 != null) {
                            j3 = jSONObject2.optLong("chatdbSize", -1);
                        }
                        r8.A04 = Double.valueOf(d - ((double) j3));
                        int i = r15.A00 + atomicInteger2.get();
                        r8.A05 = Double.valueOf((double) i);
                        if (jSONObject2 != null) {
                            if (jSONObject2.has("includeVideosInBackup")) {
                                z = jSONObject2.optBoolean("includeVideosInBackup", true);
                            } else {
                                JSONObject A052 = A012.A05();
                                if (A052 != null) {
                                    z = A052.optBoolean("includeVideosInBackup", true);
                                }
                            }
                            r8.A00 = Boolean.valueOf(z);
                            Log.i(AnonymousClass000.A0Y("restore>MediaRestoreAction/total-requests-in-restore-session/", AnonymousClass001.A0o(), i));
                        }
                        z = true;
                        r8.A00 = Boolean.valueOf(z);
                        Log.i(AnonymousClass000.A0Y("restore>MediaRestoreAction/total-requests-in-restore-session/", AnonymousClass001.A0o(), i));
                    }
                    if (A072) {
                        r22.A0f();
                    }
                    if (!r11.A0g()) {
                        r21.A0D();
                    } else if (r22.A07() == 10) {
                        r21.A0a(this.A0L.get(), A072);
                    }
                }
            }
        } catch (AnonymousClass0EW e) {
            this.A05.A0C(12);
            Log.e("restore>MediaRestoreAction/failure: account not present on the device anymore", e);
        } catch (AnonymousClass0EX e2) {
            Log.e("restore>MediaRestoreAction/failure: access permission is mission for the provided google account", e2);
            Throwable cause = e2.getCause();
            if (cause == null) {
                Log.e("restore>MediaRestoreAction/failure: auth-failed/unknown-cause");
                this.A05.A0C(11);
            } else if (cause instanceof C126936Px) {
                this.A05.A0C(21);
            } else {
                this.A05.A0C(11);
            }
        } catch (AnonymousClass0EP e3) {
            this.A05.A0C(15);
            Log.e("restore>MediaRestoreAction/failure: local storage is full", e3);
        } catch (AnonymousClass0EN e4) {
            this.A05.A0C(19);
            Log.e("restore>MediaRestoreAction/failure: google servers' are not working", e4);
        } catch (AnonymousClass0EV e5) {
            this.A05.A0C(23);
            Log.e("restore>MediaRestoreAction/failure: access denied to external storage", e5);
        } catch (AnonymousClass0EL e6) {
            this.A05.A0C(25);
            Log.e("restore>MediaRestoreAction/failure: google drive service is disabled", e6);
        } catch (Throwable th) {
            this.A0E.BhD(r8);
            r11.A0y(false);
            throw th;
        }
        this.A0E.BhD(r8);
        r11.A0y(false);
    }

    public final boolean A05(File file) {
        try {
            return this.A02.A0f(file);
        } catch (IOException unused) {
            return false;
        }
    }

    public boolean A06(List list, Map map, Set set, boolean z) {
        Throwable th;
        Throwable illegalStateException;
        if (!this.A0B.A0H()) {
            AtomicReference atomicReference = new AtomicReference((Object) null);
            Map map2 = map;
            Set keySet = map2.keySet();
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            CountDownLatch countDownLatch = new CountDownLatch(keySet.size());
            int size = keySet.size();
            Iterator it = keySet.iterator();
            int i = 0;
            while (it.hasNext()) {
                String A0m = AnonymousClass001.A0m(it);
                if (i % 100 == 0) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("restore>MediaRestoreAction/get-files-to-be-downloaded ");
                    A0o.append(i);
                    Log.i(AnonymousClass000.A0Y("/", A0o, size));
                }
                i++;
                if (!this.A07.A06()) {
                    return false;
                }
                illegalStateException = (Throwable) atomicReference.get();
                if (illegalStateException != null) {
                    if (!(illegalStateException instanceof AnonymousClass0EV)) {
                        th = new IllegalStateException(illegalStateException);
                        throw th;
                    }
                    throw illegalStateException;
                }
                this.A06.A0X((long) i, (long) size);
                AnonymousClass0UI r2 = (AnonymousClass0UI) map2.get(A0m);
                String A042 = AnonymousClass0YV.A04(this.A00, this.A01, this.A09, A0m);
                if (A042 == null) {
                    Log.e(AnonymousClass000.A0V("restore>MediaRestoreAction/get-files-to-be-downloaded/skipping-null-download-path relative path: ", A0m, AnonymousClass001.A0o()));
                } else {
                    File A0B2 = AnonymousClass002.A0B(A042);
                    Set set2 = set;
                    Iterator it2 = set2.iterator();
                    while (it2.hasNext()) {
                        if (A0m.startsWith(AnonymousClass001.A0m(it2))) {
                            String str = A0m;
                            CountDownLatch countDownLatch2 = countDownLatch;
                            AnonymousClass0UI r16 = r2;
                            AnonymousClass0K3.A02.execute(new C13200mn(this, r16, A0B2, str, list, countDownLatch2, atomicBoolean, atomicReference, z));
                            break;
                        }
                    }
                    TextUtils.join(",", set2);
                }
                countDownLatch.countDown();
            }
            th = (Throwable) atomicReference.get();
            if (th != null) {
                if (!(th instanceof AnonymousClass0EV)) {
                    illegalStateException = new IllegalStateException(th);
                    throw illegalStateException;
                }
                throw th;
            }
            try {
                Log.i("restore>MediaRestoreAction/get-files-to-be-downloaded waiting for all files to be processed.");
                countDownLatch.await();
                return atomicBoolean.get();
            } catch (InterruptedException e) {
                Log.e((Throwable) e);
                return false;
            }
        } else {
            throw new AnonymousClass0EV();
        }
    }

    public boolean A07(Map map) {
        AnonymousClass33p r3 = this.A0C;
        boolean A25 = r3.A25();
        HashSet A0K2 = AnonymousClass002.A0K();
        A0K2.add(this.A02.A0G().getName());
        boolean A082 = A08(map, A0K2, A25);
        r3.A17(0);
        return A082;
    }

    public boolean A08(Map map, Set set, boolean z) {
        C10240hc r11 = this.A04;
        if (r11.A06() == 2) {
            C25911bH r1 = this.A0F;
            C626936e.A06(r1);
            r1.A0C = 0L;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("restore>MediaRestoreAction/restore-files called with filePathPrefix [");
        Set set2 = set;
        Log.d(AnonymousClass000.A0W(TextUtils.join(",", set2), A0o));
        Log.i("restore>MediaRestoreAction/stage: collect files to download from the backup");
        List<Object> synchronizedList = Collections.synchronizedList(AnonymousClass001.A0s());
        AnonymousClass33M r2 = new AnonymousClass33M("restore>MediaRestoreAction/get-files-to-be-downloaded");
        Map map2 = map;
        if (!A06(synchronizedList, map2, set2, z)) {
            Log.e("restore>MediaRestoreAction/restore-files failed to get list of files to be restored.");
            r2.A07();
            return false;
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        AnonymousClass000.A1H("restore>MediaRestoreAction/restore-files/num-files-to-be-downloaded/", A0o2, synchronizedList);
        Log.i(A0o2.toString());
        this.A0J.set(synchronizedList.size() / 10);
        r2.A07();
        long A0J2 = this.A0C.A0J();
        AtomicLong atomicLong = this.A0M;
        atomicLong.set(A0J2);
        for (Object obj : synchronizedList) {
            AnonymousClass0UI r0 = (AnonymousClass0UI) map2.get(obj);
            if (r0 != null) {
                atomicLong.addAndGet(r0.A00);
            }
        }
        Collections.sort(synchronizedList, new C13460nD());
        int A052 = r11.A05();
        C25911bH r12 = this.A0F;
        r12.A03 = Double.valueOf((double) synchronizedList.size());
        r12.A0F = Long.valueOf((long) A052);
        ArrayList A0s = AnonymousClass001.A0s();
        AtomicInteger atomicInteger = new AtomicInteger(0);
        AtomicLong atomicLong2 = this.A0L;
        atomicLong2.set(A0J2);
        AtomicLong atomicLong3 = this.A0K;
        atomicLong3.set(0);
        CountDownLatch countDownLatch = new CountDownLatch(synchronizedList.size());
        AtomicReference atomicReference = new AtomicReference((Object) null);
        Executor A032 = C06540Yd.A03(A052);
        Log.i("restore>MediaRestoreAction/stage: start downloading files from google");
        Iterator it = synchronizedList.iterator();
        int i = 0;
        while (it.hasNext()) {
            String A0m = AnonymousClass001.A0m(it);
            i++;
            if (i % 100 == 0) {
                StringBuilder A0o3 = AnonymousClass001.A0o();
                A0o3.append("restore>MediaRestoreAction/restore-files enqueuing download  ");
                A0o3.append(i);
                AnonymousClass000.A1H("/", A0o3, synchronizedList);
                Log.i(AnonymousClass000.A0V(": ", A0m, A0o3));
            }
            AnonymousClass0UI r13 = (AnonymousClass0UI) map2.get(A0m);
            if (r13 != null) {
                A032.execute(new C13170mk(this, r13, A0s, countDownLatch, atomicInteger, atomicReference));
            } else {
                Log.e("restore>MediaRestoreAction/restore-files resId cannot be null, skipping.");
                countDownLatch.countDown();
            }
        }
        try {
            Log.i("restore>MediaRestoreAction/restore-files waiting for all files to be restored.");
            countDownLatch.await();
            Throwable th = (Throwable) atomicReference.get();
            if (th == null || (!(th instanceof AnonymousClass0EX) && !(th instanceof AnonymousClass0EW) && !(th instanceof AnonymousClass0EP) && !(th instanceof AnonymousClass0EN) && !(th instanceof AnonymousClass0EL) && !(th instanceof AnonymousClass0EV))) {
                if (A0s.size() > 0) {
                    StringBuilder A0o4 = AnonymousClass001.A0o();
                    A0o4.append("restore>MediaRestoreAction/restore-files/failed-files/");
                    Log.i(AnonymousClass000.A0h(A0o4, A0s.size()));
                    C55682qk r6 = this.A01;
                    StringBuilder A0o5 = AnonymousClass001.A0o();
                    A0o5.append(A0s.size());
                    AnonymousClass000.A1H(" files  out of total ", A0o5, synchronizedList);
                    r6.A0A("gdrive/restore-media/failed to restore files", true, A0o5.toString());
                }
                StringBuilder A0o6 = AnonymousClass001.A0o();
                A0o6.append("restore>MediaRestoreAction/restore-files waiting for restore to finish: ");
                A0o6.append(atomicLong2.get());
                A0o6.append("/");
                A0o6.append(atomicLong.get());
                A0o6.append(" (");
                A0o6.append(atomicLong3.get());
                Log.i(AnonymousClass000.A0X(" failed)", A0o6));
                if ((atomicLong2.get() > 0 || atomicLong3.get() > 0) && atomicLong.get() > 0) {
                    this.A06.A0Y(atomicLong2.get(), atomicLong.get());
                }
                return true;
            }
            throw th;
        } catch (InterruptedException e) {
            Log.e((Throwable) e);
            return false;
        }
    }

    public AnonymousClass0UW(Context context, C55682qk r5, C64393Dh r6, AnonymousClass0WN r7, C10240hc r8, C06260Ww r9, AnonymousClass0F1 r10, C04710Qi r11, AnonymousClass0Y7 r12, AnonymousClass310 r13, C56612sH r14, AnonymousClass5ZR r15, AnonymousClass33p r16, AnonymousClass319 r17, AnonymousClass4FV r18, C25911bH r19, C59302wh r20, C618232j r21, String str, AtomicLong atomicLong, AtomicLong atomicLong2) {
        this.A0A = r14;
        this.A01 = r5;
        this.A02 = r6;
        this.A0E = r18;
        this.A09 = r13;
        this.A08 = r12;
        this.A0G = r20;
        this.A03 = r7;
        this.A0D = r17;
        this.A0H = r21;
        this.A05 = r9;
        this.A0B = r15;
        this.A0C = r16;
        this.A0I = str;
        this.A06 = r10;
        this.A00 = context;
        this.A0L = atomicLong2;
        this.A0M = atomicLong;
        this.A07 = r11;
        this.A04 = r8;
        this.A0F = r19;
    }
}
