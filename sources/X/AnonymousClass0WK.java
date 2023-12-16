package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.0WK  reason: invalid class name */
public class AnonymousClass0WK {
    public final C64393Dh A00;
    public final AnonymousClass0WN A01;
    public final AnonymousClass0F1 A02;
    public final C04450Oi A03;
    public final AnonymousClass0QR A04;
    public final C04710Qi A05;
    public final AnonymousClass0Y7 A06;
    public final AnonymousClass310 A07;
    public final C56512s6 A08;
    public final C56612sH A09;
    public final C54292oU A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final AnonymousClass1VX A0D;
    public final AnonymousClass4FV A0E;
    public final C25491ab A0F;
    public final AnonymousClass31C A0G;
    public final String A0H;
    public final List A0I;
    public final Map A0J = new ConcurrentHashMap();
    public final AtomicBoolean A0K = new AtomicBoolean(true);
    public final AtomicLong A0L = new AtomicLong(0);
    public final AtomicLong A0M = new AtomicLong(0);
    public final AtomicLong A0N = new AtomicLong(0);
    public final AtomicLong A0O = new AtomicLong(0);
    public final AtomicLong A0P = new AtomicLong(0);
    public final AtomicLong A0Q = new AtomicLong(0);

    public final AnonymousClass0UO A02(AnonymousClass0UI r12, File file, String str, String str2) {
        File file2 = file;
        String absolutePath = file.getAbsolutePath();
        AnonymousClass310 r4 = this.A07;
        AnonymousClass5ZR r7 = this.A0B;
        if (C06520Ya.A00(r12, r4, r7, absolutePath) != 3 || r12 == null || C06520Ya.A0D(r12)) {
            return null;
        }
        Object[] A0M2 = AnonymousClass002.A0M();
        A0M2[0] = str2;
        A0M2[1] = "remote-file-same-as-local";
        String.format("gdrive/encrypted-re-upload/get-files-to-be-uploaded fileUploadPath is %s, fileStatus is %s.", A0M2);
        C54292oU r6 = this.A0A;
        return new AnonymousClass0UO(this.A00, this.A01, this.A03, r4, this.A08, r6, r7, file2, str, str2);
    }

    public static /* synthetic */ void A00(C05580Ub r6, AnonymousClass0WK r7, AnonymousClass0UO r8, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        try {
            if (atomicReference.get() == null) {
                boolean A082 = r7.A08(r6, r8);
                atomicBoolean.compareAndSet(true, A082);
                countDownLatch.countDown();
                if (A082) {
                    return;
                }
                Log.i(AnonymousClass000.A0X("<file>", AnonymousClass000.A0l("gdrive/encrypted-re-upload/backup-file failed on ")));
            }
        } catch (AnonymousClass0EI | AnonymousClass0EL | AnonymousClass0EM | AnonymousClass0EN | AnonymousClass0EV | AnonymousClass0EW | AnonymousClass0EX e) {
            Log.e("gdrive/encrypted-re-upload/backup-file", e);
            atomicReference.set(e);
        } catch (FileNotFoundException e2) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive/encrypted-re-upload/backup-file/file-not-found ");
            Log.e(AnonymousClass000.A0X("<file>", A0o), e2);
        } catch (Throwable th) {
            atomicBoolean.compareAndSet(true, false);
            countDownLatch.countDown();
            Log.i(AnonymousClass000.A0X("<file>", AnonymousClass000.A0l("gdrive/encrypted-re-upload/backup-file failed on ")));
            throw th;
        }
        atomicBoolean.compareAndSet(true, false);
        countDownLatch.countDown();
        Log.i(AnonymousClass000.A0X("<file>", AnonymousClass000.A0l("gdrive/encrypted-re-upload/backup-file failed on ")));
    }

    public static /* synthetic */ void A01(AnonymousClass0WK r10, File file, String str, List list, List list2, CountDownLatch countDownLatch, AtomicReference atomicReference, int i, long j) {
        try {
            String A062 = AnonymousClass0YV.A06(r10.A0A.A06(), r10.A07, file);
            if (A062 == null) {
                Log.e(AnonymousClass000.A0P(file, "gdrive/encrypted-re-upload/collect-files-to-be-uploaded/file-upload-path-is-null/ ", AnonymousClass001.A0o()));
            } else {
                Map map = r10.A0J;
                AnonymousClass0UI r6 = (AnonymousClass0UI) map.get(A062);
                C04710Qi r3 = r10.A05;
                if (r3.A06()) {
                    r10.A0P.incrementAndGet();
                    AnonymousClass0UO A022 = r10.A02(r6, file, str, A062);
                    if (A022 != null) {
                        AtomicLong atomicLong = r10.A0O;
                        if (atomicLong.get() < ((long) i) || r10.A0L.get() < j) {
                            list.add(A022);
                            if (r6 != null && !r6.A06.equals(A022.A06)) {
                                list2.add(r6);
                                map.remove(r6.A01());
                            }
                            atomicLong.incrementAndGet();
                            r10.A0L.addAndGet(A022.A01());
                        } else {
                            r10.A0K.set(false);
                        }
                    } else {
                        r10.A0N.incrementAndGet();
                        r10.A0M.addAndGet(file.length());
                    }
                    r3.A06();
                }
            }
        } catch (AnonymousClass0EV e) {
            Log.e(AnonymousClass000.A0P(file, "gdrive/encrypted-re-upload/get-files-to-be-uploaded problem with a file ", AnonymousClass001.A0o()), e);
            atomicReference.set(e);
        } catch (Throwable th) {
            countDownLatch.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public void A03() {
        if (this.A0C.A0X() != null) {
            C25491ab r4 = this.A0F;
            AtomicLong atomicLong = this.A0N;
            r4.A04 = Long.valueOf(atomicLong.get());
            Double valueOf = Double.valueOf(((double) atomicLong.get()) / ((double) this.A0P.get()));
            r4.A00 = valueOf;
            r4.A01 = valueOf;
            r4.A06 = r4.A04;
            r4.A07 = Long.valueOf(this.A0M.get() / 1048576);
            Log.i(AnonymousClass000.A0P(r4, "gdrive/encrypted-re-upload/", AnonymousClass001.A0o()));
            this.A0E.BhD(r4);
        }
        this.A02.A0B();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0090, code lost:
        if (r2 != null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A04() {
        /*
            r7 = this;
            X.33p r3 = r7.A0C
            java.lang.String r2 = r3.A0X()
            java.util.concurrent.atomic.AtomicBoolean r0 = r7.A0K
            boolean r1 = r0.get()
            r0 = 2
            if (r1 == 0) goto L_0x0088
            if (r2 == 0) goto L_0x0088
            r3.A1a(r2, r0)
            X.1ab r4 = r7.A0F
            java.lang.Integer r0 = X.AnonymousClass001.A0f()
            r4.A02 = r0
        L_0x001c:
            java.util.concurrent.atomic.AtomicLong r6 = r7.A0O
            long r2 = r6.get()
            java.util.concurrent.atomic.AtomicLong r5 = r7.A0N
            long r0 = r5.get()
            long r2 = r2 + r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A04 = r0
            long r2 = r6.get()
            long r0 = r5.get()
            long r2 = r2 + r0
            double r5 = (double) r2
            java.util.concurrent.atomic.AtomicLong r0 = r7.A0P
            long r2 = r0.get()
            double r0 = (double) r2
            double r5 = r5 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r4.A00 = r0
            r4.A01 = r0
            java.lang.Long r0 = r4.A04
            r4.A06 = r0
            java.util.concurrent.atomic.AtomicLong r0 = r7.A0M
            long r2 = r0.get()
            java.util.concurrent.atomic.AtomicLong r0 = r7.A0Q
            long r0 = r0.get()
            long r2 = r2 + r0
            r0 = 1048576(0x100000, double:5.180654E-318)
            long r2 = r2 / r0
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            r4.A07 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "gdrive/encrypted-re-upload/"
            java.lang.String r0 = X.AnonymousClass000.A0P(r4, r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FV r0 = r7.A0E
            r0.BhD(r4)
        L_0x0076:
            X.0QR r1 = r7.A04
            X.0Y7 r0 = r7.A06
            java.lang.String r0 = r0.A0G
            r1.A02(r0)
            X.AnonymousClass0X8.A03()
            X.0F1 r0 = r7.A02
            r0.A0B()
            return
        L_0x0088:
            X.1ab r4 = r7.A0F
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r4.A02 = r0
            if (r2 == 0) goto L_0x0076
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WK.A04():void");
    }

    public final void A05(C05580Ub r9, AnonymousClass0UO r10, CountDownLatch countDownLatch, AtomicBoolean atomicBoolean, AtomicReference atomicReference) {
        AnonymousClass0UO r4 = r10;
        File file = r10.A04;
        CountDownLatch countDownLatch2 = countDownLatch;
        if (!file.exists()) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("gdrive/encrypted-re-upload/backup-file file ");
            A0o.append("<file>");
            Log.i(AnonymousClass000.A0X(" does not exist", A0o));
            countDownLatch.countDown();
        } else if (!file.isDirectory()) {
            C06540Yd.A00.execute(new C13160mj(r9, this, r4, countDownLatch2, atomicBoolean, atomicReference));
        } else {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("gdrive-service/backup-file/expected-file-got-directory-instead/");
            throw AnonymousClass000.A0I("<file>", A0o2);
        }
    }

    public boolean A06() {
        boolean z;
        boolean z2 = false;
        if (!this.A01.A0G()) {
            Log.i("gdrive/encrypted-re-upload/encryption is not enabled so nothing to be done here");
        } else {
            this.A02.A0C();
            AnonymousClass0Y7 r7 = this.A06;
            r7.A08.A00 = 0;
            r7.A0J.set(0);
            try {
                if (C06520Ya.A0C(this.A05, r7)) {
                    z2 = A07();
                } else {
                    Log.i("gdrive/encrypted-re-upload/fetch-token/network-failure-at-token-fetch-stage");
                }
            } catch (AnonymousClass0GS e) {
                Log.e("gdrive/encrypted-re-upload", e);
                z = e instanceof AnonymousClass0EM;
            } catch (C376223j e2) {
                Log.e("gdrive/encrypted-re-upload", e2);
            }
            z = false;
            long currentTimeMillis = System.currentTimeMillis();
            AnonymousClass33p r1 = this.A0C;
            C25491ab r2 = this.A0F;
            Long valueOf = Long.valueOf((currentTimeMillis - r1.A0P(r1.A0X())) / 3600000);
            r2.A08 = valueOf;
            r2.A05 = valueOf;
            if (z2) {
                A04();
                return z2;
            }
            AnonymousClass0X8.A03();
            if (!this.A05.A05()) {
                Log.e("gdrive/encrypted-re-upload/wasn't successful because the needed resources are not available");
                return z2;
            } else if (!r7.A0I()) {
                int i = 3;
                if (z) {
                    i = 10;
                }
                r2.A02 = Integer.valueOf(i);
                A03();
                return z2;
            }
        }
        return z2;
    }

    public final boolean A07() {
        boolean z;
        boolean z2;
        String str;
        Log.i("gdrive/encrypted-re-upload/files");
        AnonymousClass0Y7 r5 = this.A06;
        String str2 = this.A0H;
        C04710Qi r3 = this.A05;
        C05580Ub A012 = C06520Ya.A01(r3, r5, str2, "gdrive/encrypted-re-upload/files");
        if (A012 == null) {
            str = "gdrive/encrypted-re-upload/files backup doesn't exist";
        } else {
            C56612sH r0 = this.A09;
            AnonymousClass1VX r1 = this.A0D;
            if (!C06520Ya.A0B(r3, A012, r0, C06550Ye.A03(r1, false), 16384)) {
                str = "gdrive/encrypted-re-upload/files unable to start transaction";
            } else {
                Log.i("gdrive/encrypted-re-upload/files loading files");
                if (r3.A06()) {
                    List synchronizedList = Collections.synchronizedList(AnonymousClass001.A0s());
                    if (A09(A012, synchronizedList)) {
                        ArrayList A0J2 = AnonymousClass002.A0J(this.A0I);
                        List<AnonymousClass0UO> synchronizedList2 = Collections.synchronizedList(AnonymousClass002.A0I(200));
                        if (!A0B(A0J2, synchronizedList2, synchronizedList, r1.A0N(785), 1048576 * ((long) r1.A0N(786)))) {
                            str = "gdrive/encrypted-re-upload/files failed to generate list of files to be uploaded.";
                        } else if (r3.A06()) {
                            int size = synchronizedList2.size();
                            Log.i(AnonymousClass000.A0Y("gdrive/encrypted-re-upload/files/files-to-be-uploaded/count/", AnonymousClass001.A0o(), size));
                            if (r3.A06()) {
                                this.A0Q.set(0);
                                int size2 = synchronizedList.size();
                                int i = 0;
                                while (true) {
                                    if (i < size2) {
                                        int i2 = i + 2500;
                                        if (AnonymousClass0X8.A01(new AnonymousClass0Dr(A012, r5, synchronizedList.subList(i, Math.min(i2, size2))), r3, "gdrive/backup/files") != Boolean.TRUE) {
                                            z2 = false;
                                            Log.e("gdrive/encrypted-re-upload/files/failed to delete files");
                                            break;
                                        }
                                        i = i2;
                                    } else {
                                        AtomicBoolean atomicBoolean = new AtomicBoolean(true);
                                        AtomicReference atomicReference = new AtomicReference((Object) null);
                                        CountDownLatch countDownLatch = new CountDownLatch(size);
                                        for (AnonymousClass0UO A052 : synchronizedList2) {
                                            A05(A012, A052, countDownLatch, atomicBoolean, atomicReference);
                                        }
                                        Log.i("gdrive/encrypted-re-upload/files waiting for backup to finish...");
                                        try {
                                            z = true & countDownLatch.await(86400000, TimeUnit.MILLISECONDS);
                                        } catch (InterruptedException e) {
                                            Log.e("gdrive/encrypted-re-upload/files upload interrupted", e);
                                            z = false;
                                        }
                                        if (z && atomicBoolean.get()) {
                                            this.A0G.A08(86400000);
                                            Object A013 = AnonymousClass0X8.A01(new AnonymousClass0Du(A012, (Map) null), r3, "gdrive/backup/files");
                                            z2 = true;
                                            if (A013 != Boolean.TRUE) {
                                                z2 = false;
                                                Log.i("gdrive/encrypted-re-upload/files failed to commit backup");
                                            }
                                        } else {
                                            Log.i("gdrive/encrypted-re-upload/files failed to uploadFiles");
                                            return false;
                                        }
                                    }
                                }
                                StringBuilder A0o = AnonymousClass001.A0o();
                                A0o.append("gdrive/encrypted-re-upload/files backup finished (success =");
                                A0o.append(z2);
                                Log.i(AnonymousClass000.A0e(A0o));
                                return z2;
                            }
                        }
                    }
                }
                return false;
            }
        }
        Log.e(str);
        return false;
    }

    public final boolean A09(C05580Ub r4, List list) {
        Map map = this.A0J;
        map.clear();
        Map A062 = C06520Ya.A06(this.A05, r4, list);
        if (A062 == null) {
            Log.e("gdrive/encrypted-re-upload/failed to load files for encrypted re-upload");
            return false;
        }
        map.putAll(A062);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0052, code lost:
        if (r14.length() <= 0) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0A(java.io.File r24, java.util.List r25, java.util.List r26, int r27, long r28) {
        /*
            r23 = this;
            r0 = 1000(0x3e8, float:1.401E-42)
            java.util.ArrayList r7 = X.AnonymousClass002.A0I(r0)
            r13 = r23
            X.5ZR r0 = r13.A0B
            boolean r0 = r0.A0E()
            if (r0 == 0) goto L_0x00ab
            r1 = 0
            r8 = r24
            boolean r0 = X.C06540Yd.A0I(r1, r8, r7)
            r11 = 0
            if (r0 == 0) goto L_0x00aa
            java.util.concurrent.atomic.AtomicReference r6 = new java.util.concurrent.atomic.AtomicReference
            r6.<init>(r1)
            int r0 = r7.size()
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch
            r5.<init>(r0)
            r0 = 1
            java.util.concurrent.atomic.AtomicBoolean r4 = new java.util.concurrent.atomic.AtomicBoolean
            r4.<init>(r0)
            r3 = 0
        L_0x002f:
            int r0 = r7.size()
            if (r3 >= r0) goto L_0x0088
            X.0Qi r0 = r13.A05
            boolean r0 = r0.A06()
            if (r0 == 0) goto L_0x00aa
            java.lang.Object r14 = r7.get(r3)
            java.io.File r14 = (java.io.File) r14
            boolean r0 = r14.exists()
            if (r0 == 0) goto L_0x0054
            long r9 = r14.length()
            r1 = 0
            int r0 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            r2 = 1
            if (r0 > 0) goto L_0x0055
        L_0x0054:
            r2 = 0
        L_0x0055:
            java.lang.String r15 = X.C06520Ya.A02(r14)
            X.0Oi r1 = r13.A03
            boolean r0 = r1.A01(r15)
            if (r0 == 0) goto L_0x0066
            boolean r0 = r1.A00(r14, r15)
            r2 = r2 & r0
        L_0x0066:
            if (r2 == 0) goto L_0x0081
            X.0mm r12 = new X.0mm
            r16 = r25
            r17 = r26
            r20 = r27
            r21 = r28
            r19 = r6
            r18 = r5
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            java.util.concurrent.ThreadPoolExecutor r0 = X.AnonymousClass0K3.A02
            r0.execute(r12)
        L_0x007e:
            int r3 = r3 + 1
            goto L_0x002f
        L_0x0081:
            r14.length()
            r5.countDown()
            goto L_0x007e
        L_0x0088:
            r8.getAbsolutePath()
            r5.await()     // Catch:{ InterruptedException -> 0x008f }
            goto L_0x0093
        L_0x008f:
            r0 = move-exception
            com.whatsapp.util.Log.e((java.lang.Throwable) r0)
        L_0x0093:
            java.lang.Object r1 = r6.get()
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            if (r1 == 0) goto L_0x00a5
            boolean r0 = r1 instanceof X.AnonymousClass0EV
            if (r0 != 0) goto L_0x00b0
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x00a5:
            boolean r0 = r4.get()
            return r0
        L_0x00aa:
            return r11
        L_0x00ab:
            X.0EV r1 = new X.0EV
            r1.<init>()
        L_0x00b0:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0WK.A0A(java.io.File, java.util.List, java.util.List, int, long):boolean");
    }

    public final boolean A0B(Collection collection, List list, List list2, int i, long j) {
        Log.i("gdrive/encrypted-re-upload/files finding filesToBeUploaded");
        AnonymousClass33M r4 = new AnonymousClass33M("gdrive/encrypted-re-upload/perf/files-to-be-uploaded");
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            if (file != null) {
                if (this.A05.A06()) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("gdrive/encrypted-re-upload/files/scanning ");
                    A0o.append(file);
                    AnonymousClass000.A1H(" for files to be uploaded, current upload count: ", A0o, list);
                    Log.d(A0o.toString());
                    if (!A0A(file, list, list2, i, j)) {
                    }
                }
                return false;
            }
        }
        r4.A07();
        return true;
    }

    public final boolean A08(C05580Ub r7, AnonymousClass0UO r8) {
        long j;
        Object[] A0M2 = AnonymousClass002.A0M();
        A0M2[0] = r8.A02();
        A0M2[1] = r8.A06;
        String.format("gdrive/encrypted-re-upload//upload filePath:%s, fileUploadPath:%s", A0M2);
        C04710Qi r4 = this.A05;
        if (!r4.A06()) {
            return false;
        }
        C17710w2 r2 = new C17710w2(r7, this, r8, 1);
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("gdrive/encrypted-re-upload//upload ");
        AnonymousClass0UI r3 = (AnonymousClass0UI) AnonymousClass0X8.A01(r2, r4, AnonymousClass000.A0X("<file>", A0o));
        if (!r4.A06() || r3 == null) {
            return false;
        }
        Log.i("gdrive/encrypted-re-upload/upload/success");
        this.A0J.put(r3.A01(), r3);
        AtomicLong atomicLong = this.A0Q;
        AnonymousClass0UF r0 = r3.A02;
        if (r0 != null) {
            j = r0.A00;
        } else {
            j = r3.A00;
        }
        atomicLong.addAndGet(j);
        return true;
    }

    public AnonymousClass0WK(C64393Dh r4, AnonymousClass0WN r5, AnonymousClass0F1 r6, C04450Oi r7, AnonymousClass0QR r8, C04710Qi r9, AnonymousClass0Y7 r10, AnonymousClass310 r11, C56512s6 r12, C56612sH r13, C54292oU r14, AnonymousClass5ZR r15, AnonymousClass33p r16, AnonymousClass1VX r17, AnonymousClass4FV r18, C25491ab r19, AnonymousClass31C r20, String str, List list) {
        this.A0A = r14;
        this.A09 = r13;
        this.A0D = r17;
        this.A0H = str;
        this.A0I = list;
        this.A00 = r4;
        this.A02 = r6;
        this.A0E = r18;
        this.A07 = r11;
        this.A0G = r20;
        this.A05 = r9;
        this.A01 = r5;
        this.A03 = r7;
        this.A08 = r12;
        this.A06 = r10;
        this.A04 = r8;
        this.A0B = r15;
        this.A0C = r16;
        this.A0F = r19;
    }
}
