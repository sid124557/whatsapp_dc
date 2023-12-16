package X;

import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.debug.tracer.Tracer;
import com.facebook.systrace.Systrace;
import java.io.File;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* renamed from: X.81x  reason: invalid class name and case insensitive filesystem */
public abstract class C1676481x implements C186458vL {
    public int A00;
    public long A01;
    public long A02;
    public long A03 = 0;
    public Object A04 = AnonymousClass002.A0D();
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final Handler A0E;
    public final C187468xG A0F;
    public final File A0G;
    public final ArrayList A0H;
    public final HashMap A0I;
    public final HashMap A0J;
    public final HashMap A0K;
    public final HashMap A0L;
    public final Random A0M;
    public final Set A0N;

    public void A03() {
        C126346Nm r7 = (C126346Nm) this;
        Iterator A0u = AnonymousClass001.A0u(r7.A0I);
        while (A0u.hasNext()) {
            Iterator it = ((AbstractCollection) AnonymousClass0x2.A0W(A0u)).iterator();
            boolean z = true;
            while (it.hasNext()) {
                C172488Li r4 = (C172488Li) it.next();
                if (!r4.A06.exists()) {
                    it.remove();
                    if (r4.A08) {
                        r7.A03 -= r4.A04;
                    }
                    r7.A0A(r4, "file_removed");
                } else {
                    z = false;
                }
            }
            if (z) {
                A0u.remove();
            }
        }
    }

    public synchronized NavigableSet AwW(C184778sV r3, String str) {
        HashMap hashMap = this.A0K;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            hashMap.put(str, arrayList);
        }
        arrayList.add(r3);
        return B55(str);
    }

    public synchronized void AwX(String str) {
        Set set = this.A0N;
        if (set != null) {
            set.add(str);
        }
    }

    public synchronized void AzA(File file) {
        C172488Li A002 = C162087rC.A00(file, 0, 0, false, false);
        C159197lM.A02(AnonymousClass000.A1W(A002));
        C159197lM.A02(this.A0L.containsKey(A002.A07));
        if (file.exists()) {
            if (file.length() == 0) {
                file.delete();
            } else {
                A05(A002);
                notifyAll();
            }
        }
    }

    public synchronized long B52() {
        return this.A03;
    }

    public synchronized NavigableSet B55(String str) {
        TreeSet treeSet;
        TreeSet treeSet2 = (TreeSet) this.A0I.get(str);
        if (treeSet2 == null) {
            treeSet = null;
        } else {
            treeSet = new TreeSet(treeSet2);
        }
        return treeSet;
    }

    public synchronized Set B8z() {
        return AnonymousClass0x9.A15(this.A0I.keySet());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004d, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized boolean BH8(java.lang.String r11, long r12, long r14) {
        /*
            r10 = this;
            monitor-enter(r10)
            java.util.HashMap r0 = r10.A0I     // Catch:{ all -> 0x0050 }
            java.lang.Object r6 = r0.get(r11)     // Catch:{ all -> 0x0050 }
            java.util.TreeSet r6 = (java.util.TreeSet) r6     // Catch:{ all -> 0x0050 }
            r7 = 0
            if (r6 == 0) goto L_0x004e
            X.8Li r0 = X.C162087rC.A02(r11, r12)     // Catch:{ all -> 0x0050 }
            java.lang.Object r5 = r6.floor(r0)     // Catch:{ all -> 0x0050 }
            X.8Li r5 = (X.C172488Li) r5     // Catch:{ all -> 0x0050 }
            if (r5 == 0) goto L_0x004e
            long r1 = r5.A05     // Catch:{ all -> 0x0050 }
            long r3 = r5.A04     // Catch:{ all -> 0x0050 }
            long r1 = r1 + r3
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 <= 0) goto L_0x004e
            long r12 = r12 + r14
            r9 = 1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x004c
            java.util.NavigableSet r0 = r6.tailSet(r5, r7)     // Catch:{ all -> 0x0050 }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ all -> 0x0050 }
        L_0x002f:
            boolean r0 = r8.hasNext()     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x004e
            java.lang.Object r3 = r8.next()     // Catch:{ all -> 0x0050 }
            X.8Li r3 = (X.C172488Li) r3     // Catch:{ all -> 0x0050 }
            long r5 = r3.A05     // Catch:{ all -> 0x0050 }
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x004e
            long r3 = r3.A04     // Catch:{ all -> 0x0050 }
            long r5 = r5 + r3
            long r1 = java.lang.Math.max(r1, r5)     // Catch:{ all -> 0x0050 }
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 < 0) goto L_0x002f
        L_0x004c:
            monitor-exit(r10)
            return r9
        L_0x004e:
            monitor-exit(r10)
            return r7
        L_0x0050:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676481x.BH8(java.lang.String, long, long):boolean");
    }

    public synchronized void Bip(C172488Li r3) {
        C159197lM.A02(AnonymousClass000.A1Y(r3, this.A0L.remove(r3.A07)));
        notifyAll();
    }

    public synchronized void BjD(C184778sV r3, String str) {
        HashMap hashMap = this.A0K;
        ArrayList arrayList = (ArrayList) hashMap.get(str);
        if (arrayList != null) {
            arrayList.remove(r3);
            if (arrayList.isEmpty()) {
                hashMap.remove(str);
            }
        }
    }

    public synchronized void BjO(C172488Li r3) {
        C126346Nm r1 = (C126346Nm) this;
        synchronized (r1) {
            r1.BjP(r3, "not_provided");
        }
    }

    private C172488Li A00(C172488Li r10) {
        String str = r10.A07;
        long j = r10.A05;
        TreeSet treeSet = (TreeSet) this.A0I.get(str);
        if (treeSet != null) {
            C172488Li r6 = (C172488Li) treeSet.floor(r10);
            if (r6 != null) {
                long j2 = r6.A05;
                if (j2 <= j && j < j2 + r6.A04) {
                    if (r6.A06.exists()) {
                        return r6;
                    }
                    A03();
                    return A00(r10);
                }
            }
            C172488Li r0 = (C172488Li) treeSet.ceiling(r10);
            if (r0 != null) {
                return C162087rC.A04(str, j, r0.A05 - j);
            }
        }
        return C162087rC.A03(str, j);
    }

    public static void A01(C1676481x r4) {
        try {
            C153827c5.A01("VPS-SimpleCacheInit");
            File file = r4.A0G;
            if (!file.exists()) {
                file.mkdirs();
            }
            if (!r4.A0C) {
                r4.A06(file, true);
            } else if (Build.VERSION.SDK_INT >= 26) {
                r4.A08(file.toPath(), true);
            } else {
                r4.A07(file, true);
            }
        } finally {
            C153827c5.A00();
        }
    }

    public final synchronized C172488Li A02(C140846uc r18, C172488Li r19) {
        synchronized (this) {
            try {
                C153827c5.A01("exo-startReadWriteNonBlocking");
                C172488Li r1 = r19;
                C172488Li A002 = A00(r1);
                if (A002.A08) {
                    HashMap hashMap = this.A0I;
                    String str = A002.A07;
                    TreeSet treeSet = (TreeSet) hashMap.get(str);
                    if (treeSet == null || !treeSet.remove(A002)) {
                        C187468xG r8 = this.A0F;
                        if (r8 != null) {
                            r8.BSI("startReadWriteNonBlocking", str, (int) A002.A05, (int) A002.A04);
                        }
                        Iterator it = this.A0H.iterator();
                        while (it.hasNext()) {
                            ((C187468xG) it.next()).BSI("startReadWriteNonBlocking", str, (int) A002.A05, (int) A002.A04);
                        }
                    }
                    boolean z = this.A0A;
                    long currentTimeMillis = System.currentTimeMillis();
                    File file = A002.A06;
                    File parentFile = file.getParentFile();
                    long j = A002.A05;
                    File A052 = C162087rC.A05(parentFile, str, j, currentTimeMillis, z);
                    file.renameTo(A052);
                    C172488Li A012 = C162087rC.A01(A052, str, j, currentTimeMillis, 0);
                    treeSet.add(A012);
                    ArrayList arrayList = (ArrayList) this.A0K.get(str);
                    C140846uc r6 = r18;
                    if (arrayList != null) {
                        int size = arrayList.size();
                        while (true) {
                            size--;
                            if (size < 0) {
                                break;
                            }
                            ((C184778sV) arrayList.get(size)).Bbt(r6, this, A002, A012);
                        }
                    }
                    C187468xG r0 = this.A0F;
                    if (r0 != null) {
                        r0.Bbt(r6, this, A002, A012);
                    }
                    Iterator it2 = this.A0H.iterator();
                    while (it2.hasNext()) {
                        ((C184778sV) it2.next()).Bbt(r6, this, A002, A012);
                    }
                    C153827c5.A00();
                    return A012;
                }
                HashMap hashMap2 = this.A0L;
                String str2 = r1.A07;
                if (!hashMap2.containsKey(str2)) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    A002.A01 = elapsedRealtime;
                    A002.A09 = elapsedRealtime;
                    hashMap2.put(str2, A002);
                    C153827c5.A00();
                    return A002;
                }
                C153827c5.A00();
                return null;
            } catch (Throwable th) {
                C153827c5.A00();
                throw th;
            }
        }
    }

    public void A04() {
        Object obj = this.A04;
        synchronized (obj) {
            if (!this.A07) {
                obj.wait();
            }
        }
    }

    public final void A05(C172488Li r6) {
        HashMap hashMap = this.A0I;
        String str = r6.A07;
        AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(str);
        if (abstractCollection == null) {
            abstractCollection = new TreeSet();
            hashMap.put(str, abstractCollection);
        }
        abstractCollection.add(r6);
        this.A03 += r6.A04;
        AbstractList abstractList = (AbstractList) this.A0K.get(str);
        if (abstractList != null) {
            int size = abstractList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ((C184778sV) abstractList.get(size)).Bbr(this, r6);
            }
        }
        C187468xG r0 = this.A0F;
        if (r0 != null) {
            r0.Bbr(this, r6);
        }
        Iterator it = this.A0H.iterator();
        while (it.hasNext()) {
            ((C184778sV) it.next()).Bbr(this, r6);
        }
    }

    public final void A07(File file, boolean z) {
        File file2 = file;
        File[] listFiles = file2.listFiles();
        if (listFiles != null) {
            if (z || listFiles.length != 0) {
                int length = listFiles.length;
                C172488Li r7 = null;
                for (int i = 0; i < length; i++) {
                    File file3 = listFiles[i];
                    if (file3.getName().indexOf(46) == -1) {
                        A07(file3, false);
                    } else {
                        long length2 = file3.length();
                        if (length2 == 0) {
                            AnonymousClass8MF.A00(this.A0E, this, file3, 17);
                        } else {
                            if (!this.A08) {
                                file3 = C162087rC.A06(file3, this.A0A);
                            }
                            if (this.A09) {
                                r7 = C162087rC.A00(file3, length2, -9223372036854775807L, this.A0A, this.A0B);
                            } else {
                                r7 = C162087rC.A00(file3, 0, -9223372036854775807L, this.A0A, this.A0B);
                            }
                        }
                        if (r7 == null) {
                            AnonymousClass8MF.A00(this.A0E, this, file3, 17);
                        } else {
                            A05(r7);
                        }
                    }
                }
                return;
            }
            AnonymousClass8MF.A00(this.A0E, this, file2, 17);
        }
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A08(java.nio.file.Path r19, boolean r20) {
        /*
            r18 = this;
            r5 = r19
            java.nio.file.DirectoryStream r10 = java.nio.file.Files.newDirectoryStream(r5)     // Catch:{ IOException -> 0x00bb }
            if (r10 != 0) goto L_0x0009
            return
        L_0x0009:
            java.util.Iterator r9 = r10.iterator()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r4 = 0
            r7 = 0
            r8 = 0
        L_0x0010:
            boolean r0 = r9.hasNext()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r3 = r18
            if (r0 == 0) goto L_0x00a4
            java.lang.Object r2 = r9.next()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = (java.nio.file.Path) r2     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r8 = r8 + 1
            java.nio.file.Path r0 = r2.getFileName()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.lang.String r1 = r0.toString()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = 46
            int r1 = r1.indexOf(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0 = -1
            if (r1 != r0) goto L_0x0035
            r3.A08(r2, r4)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x0035:
            java.io.File r0 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r12 = r0.length()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            long r0 = r3.A01     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            int r6 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r6 > 0) goto L_0x004e
            android.os.Handler r1 = r3.A0E     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.8MA r0 = new X.8MA     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x004e:
            boolean r0 = r3.A08     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 != 0) goto L_0x0060
            java.io.File r1 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.io.File r0 = X.C162087rC.A06(r1, r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            java.nio.file.Path r2 = r0.toPath()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0060:
            boolean r0 = r3.A09     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            if (r0 == 0) goto L_0x007a
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r16 = r1
            X.8Li r7 = X.C162087rC.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0091
        L_0x007a:
            java.io.File r11 = r2.toFile()     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            boolean r1 = r3.A0A     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r12 = 0
            boolean r0 = r3.A0B     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r17 = r0
            r16 = r1
            X.8Li r7 = X.C162087rC.A00(r11, r12, r14, r16, r17)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x0091:
            if (r7 != 0) goto L_0x009f
            android.os.Handler r1 = r3.A0E     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.8MA r0 = new X.8MA     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r2)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x009f:
            r3.A05(r7)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            goto L_0x0010
        L_0x00a4:
            if (r20 != 0) goto L_0x00b2
            if (r8 != 0) goto L_0x00b2
            android.os.Handler r1 = r3.A0E     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            X.8MA r0 = new X.8MA     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r0.<init>(r3, r5)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
            r1.post(r0)     // Catch:{ DirectoryIteratorException -> 0x00b2, all -> 0x00b6 }
        L_0x00b2:
            r10.close()     // Catch:{ IOException -> 0x00bb }
            return
        L_0x00b6:
            r0 = move-exception
            r10.close()     // Catch:{ IOException -> 0x00ba }
        L_0x00ba:
            throw r0
        L_0x00bb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1676481x.A08(java.nio.file.Path, boolean):void");
    }

    public boolean A09() {
        return this.A07;
    }

    public boolean BH9(String str, long j, long j2) {
        if (!this.A0D || this.A07) {
            return BH8(str, j, j2);
        }
        return false;
    }

    public boolean BHz(String str) {
        Set set = this.A0N;
        if (set == null) {
            return false;
        }
        return set.contains(str);
    }

    public synchronized File Bpd(String str, long j, long j2) {
        File file;
        synchronized (this) {
            String str2 = str;
            C159197lM.A02(this.A0L.containsKey(str2));
            File file2 = this.A0G;
            if (!file2.exists()) {
                A03();
                file2.mkdirs();
            }
            C187468xG r1 = this.A0F;
            long j3 = j;
            long j4 = j2;
            if (r1 != null) {
                r1.BcC(this, str2, j3, j4);
            }
            Iterator it = this.A0H.iterator();
            while (it.hasNext()) {
                ((C187468xG) it.next()).BcC(this, str2, j3, j4);
            }
            if (this.A05) {
                File A0A2 = AnonymousClass002.A0A(file2, Integer.toString(this.A0M.nextInt(this.A00)));
                if (!A0A2.exists()) {
                    A0A2.mkdir();
                }
                file = C162087rC.A05(A0A2, str2, j3, System.currentTimeMillis(), this.A0A);
            } else {
                file = C162087rC.A05(file2, str2, j3, System.currentTimeMillis(), this.A0A);
            }
        }
        return file;
    }

    public synchronized C172488Li Bpt(C140846uc r20, String str, long j, long j2) {
        synchronized (this) {
            Tracer.A01("SimpleCache.startReadWrite");
            try {
                C172488Li A022 = C162087rC.A02(str, j);
                long elapsedRealtime = SystemClock.elapsedRealtime() + j2;
                boolean A1T = AnonymousClass000.A1T((j2 > 0 ? 1 : (j2 == 0 ? 0 : -1)));
                while (true) {
                    C140846uc r2 = r20;
                    C172488Li A023 = A02(r2, A022);
                    if (A023 != null) {
                        Systrace.A00();
                        return A023;
                    } else if (!this.A06 || !A1T) {
                        long elapsedRealtime2 = elapsedRealtime - SystemClock.elapsedRealtime();
                        HashMap hashMap = this.A0L;
                        String str2 = A022.A07;
                        if (hashMap.containsKey(str2)) {
                            long j3 = ((C172488Li) hashMap.get(str2)).A01;
                            if (j3 > 0) {
                                long elapsedRealtime3 = SystemClock.elapsedRealtime() - j3;
                                if (elapsedRealtime3 > j2) {
                                    StringBuilder A0o = AnonymousClass001.A0o();
                                    A0o.append("lock expired after ");
                                    A0o.append(elapsedRealtime2);
                                    AnonymousClass6C7.A1F("ms for span: ", str2, "SimpleCache", A0o);
                                    break;
                                }
                                elapsedRealtime2 = j2 - elapsedRealtime3;
                            }
                        }
                        if (!A1T) {
                            if (elapsedRealtime2 <= 0) {
                                break;
                            }
                        } else {
                            elapsedRealtime2 = 0;
                        }
                        wait(elapsedRealtime2);
                    } else {
                        HashMap hashMap2 = this.A0L;
                        String str3 = A022.A07;
                        if (hashMap2.containsKey(str3)) {
                            C172488Li r9 = (C172488Li) hashMap2.get(str3);
                            long j4 = this.A02;
                            if (j4 > 0 && r2 != C140846uc.PREFETCH && r2 != C140846uc.INIT_SEGMENT && r9.A09 > 0 && SystemClock.elapsedRealtime() - r9.A09 > j4) {
                                AnonymousClass6C7.A1G("Ignore expired cache lock when retry ", str3, "SimpleCache", AnonymousClass001.A0o());
                                break;
                            }
                            r9.A00++;
                        }
                        wait();
                        if (hashMap2.containsKey(str3)) {
                            ((C172488Li) hashMap2.get(str3)).A00--;
                        }
                    }
                }
                return null;
            } finally {
                Systrace.A00();
            }
        }
    }

    public C1676481x(Handler handler, C187468xG r4, File file, int i, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        try {
            C153827c5.A01("VPS-SimpleCacheConstructor");
            this.A08 = z2;
            this.A0A = z3;
            this.A0B = z4;
            this.A09 = z5;
            this.A06 = z6;
            this.A0G = file;
            this.A0F = r4;
            this.A0L = AnonymousClass001.A0t();
            this.A0I = AnonymousClass001.A0t();
            this.A0N = AnonymousClass002.A0K();
            this.A0J = AnonymousClass001.A0t();
            this.A0K = AnonymousClass001.A0t();
            this.A0H = AnonymousClass001.A0s();
            this.A0M = new Random();
            this.A05 = z7;
            this.A00 = i;
            this.A0D = z;
            this.A02 = j;
            this.A0C = z8;
            this.A01 = j2;
            this.A0E = handler;
            new AnonymousClass8Rk(this).start();
        } finally {
            C153827c5.A00();
        }
    }

    public final void A06(File file, boolean z) {
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        if (z || listFiles.length != 0) {
            C172488Li r7 = null;
            for (File file2 : listFiles) {
                if (file2.getName().indexOf(46) == -1) {
                    A06(file2, false);
                } else {
                    long length = file2.length();
                    if (length <= this.A01) {
                        file2.delete();
                    } else {
                        if (!this.A08) {
                            file2 = C162087rC.A06(file2, this.A0A);
                        }
                        boolean z2 = this.A09;
                        boolean z3 = this.A0A;
                        if (!z2) {
                            length = 0;
                        }
                        r7 = C162087rC.A00(file2, length, -9223372036854775807L, z3, this.A0B);
                    }
                    if (r7 == null) {
                        file2.delete();
                    } else {
                        A05(r7);
                    }
                }
            }
            return;
        }
        file.delete();
    }
}
