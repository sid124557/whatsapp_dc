package X;

import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.0Xc  reason: invalid class name and case insensitive filesystem */
public class C06320Xc {
    public final C55682qk A00;
    public final C64393Dh A01;
    public final C56492s4 A02;
    public final AnonymousClass0U8 A03;
    public final C06430Xr A04;
    public final AnonymousClass0WN A05;
    public final AnonymousClass0QR A06;
    public final C04710Qi A07;
    public final C29441ip A08;
    public final AnonymousClass310 A09;
    public final C54292oU A0A;
    public final AnonymousClass5ZR A0B;
    public final AnonymousClass33p A0C;
    public final C625835r A0D;
    public final AnonymousClass1VW A0E;
    public final AnonymousClass1VX A0F;
    public final AnonymousClass306 A0G;
    public final AnonymousClass3FI A0H;
    public final AnonymousClass4FS A0I;
    public final WeakReference A0J;
    public final AtomicBoolean A0K;
    public final AtomicBoolean A0L;

    public final boolean A0B(List list) {
        File file;
        try {
            if (AnonymousClass0S8.A00(this.A0E)) {
                if (list.size() > 0) {
                    file = (File) list.get(0);
                }
            }
            file = this.A0D.A0K();
            return file != null && C57202tG.A00(file.getName()) == AnonymousClass22O.CRYPT15;
        } catch (IOException e) {
            Log.e("restore>BackupApiBackupSelector/device unable to access local backup", e);
        }
    }

    /* access modifiers changed from: private */
    public /* synthetic */ void A02(C02030Dj r15, C49272gG r16, Map map, boolean z) {
        long j;
        long j2;
        AnonymousClass33M r7 = new AnonymousClass33M("restore>BackupApiBackupSelector/download-size-calc");
        try {
            C05580Ub r9 = r15.A01;
            long A042 = A04(r9, r16, map, this.A0K, z);
            if (z) {
                JSONObject jSONObject = r9.A0C;
                if (jSONObject == null) {
                    j2 = -1;
                } else {
                    j2 = jSONObject.optLong("chatdbSize", -1);
                }
                j = A042 - j2;
            } else {
                j = A042;
            }
            RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A0J.get();
            if (restoreFromBackupActivity != null) {
                restoreFromBackupActivity.A7l(A042, j);
            }
        } catch (AnonymousClass0GS e) {
            Log.e((Throwable) e);
        }
        r7.A07();
    }

    public static final boolean A03(C05580Ub r4) {
        JSONObject jSONObject = r4.A0C;
        if (jSONObject != null && jSONObject.optLong("chatdbSize", -1) > 0) {
            return true;
        }
        Log.w("restore>BackupApiBackupSelector/backup is not valid, its chat db size is 0");
        return false;
    }

    public long A04(C05580Ub r16, C49272gG r17, Map map, AtomicBoolean atomicBoolean, boolean z) {
        long j;
        C05580Ub r8 = r16;
        JSONObject jSONObject = r8.A0C;
        long j2 = -1;
        if (jSONObject != null) {
            j2 = jSONObject.optLong("chatdbSize", -1);
        }
        C49272gG r9 = r17;
        boolean z2 = z;
        if (z) {
            j = j2;
            if (j2 > 0) {
                r9.A01(Boolean.FALSE);
            }
        } else {
            j = 0;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("restore>BackupApiBackupSelector/calc-approx-total-download total size:");
        long j3 = r8.A04;
        A0o.append(j3);
        A0o.append(" dbSize: ");
        A0o.append(j2);
        Log.i(AnonymousClass000.A0b(" includeDbSize: ", A0o, z2));
        if (j3 < 0) {
            Log.e("restore>BackupApiBackupSelector/calc-approx-total-download totalSize is negative.");
        }
        if (j2 < 0) {
            Log.e("restore>BackupApiBackupSelector/calc-approx-total-download dbSize is negative.");
        }
        long A052 = j + A05(r9, map, atomicBoolean, j3 - j2, z2);
        r9.A01(Boolean.valueOf(AnonymousClass000.A1T((A052 > 0 ? 1 : (A052 == 0 ? 0 : -1)))));
        return A052;
    }

    public final long A05(C49272gG r21, Map map, AtomicBoolean atomicBoolean, long j, boolean z) {
        long j2;
        C64393Dh r15 = this.A01;
        long j3 = j;
        if (!r15.A0G().exists()) {
            return j;
        }
        Map map2 = map;
        String[] strArr = (String[]) map2.keySet().toArray(new String[0]);
        int i = 20;
        if (map2.size() < 10) {
            i = 1;
        }
        long j4 = 0;
        long j5 = 0;
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (atomicBoolean.get()) {
                Log.i("restore>BackupApiBackupSelector/calc-approx-media-download-size/interrupted");
                return -1;
            }
            String str = strArr[i2];
            if (str == null) {
                Log.e("restore>BackupApiBackupSelector/calc-approx-media-download-size file upload path is null, unexpected.");
            } else {
                C55682qk r8 = this.A00;
                AnonymousClass310 r14 = this.A09;
                String A042 = AnonymousClass0YV.A04(this.A0A.A06(), r8, r14, str);
                if (A042 == null) {
                    Log.i(AnonymousClass000.A0V("restore>BackupApiBackupSelector/calc-approx-media-download-size/no-local-path-mapping ", str, AnonymousClass001.A0o()));
                } else {
                    Object obj = map2.get(str);
                    C626936e.A06(obj);
                    AnonymousClass0UI r9 = (AnonymousClass0UI) obj;
                    File A0B2 = AnonymousClass002.A0B(A042);
                    if (C06540Yd.A0H(r15, A0B2)) {
                        if (!A0B2.exists() || A0B2.length() == 0) {
                            j2 = r9.A00;
                            j5 += j2;
                        } else if (!z) {
                            j5 += r9.A00;
                        } else if (i2 % i == 0) {
                            j2 = r9.A00;
                            j5 += j2;
                            if (C06520Ya.A00(r9, r14, this.A0B, A042) != 4) {
                            }
                        }
                        j4 += j2;
                        r21.A01(Boolean.FALSE);
                    }
                }
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("restore>BackupApiBackupSelector/calc-approx-media-download toBeDownloadedSampleSize: ");
        A0o.append(j4);
        A0o.append(" totalSampleSize:");
        A0o.append(j5);
        Log.d(AnonymousClass000.A0Z(" totalSize: ", A0o, j3));
        if (j5 != 0) {
            return (long) (((((double) j4) * 1.0d) / ((double) j5)) * ((double) j3));
        }
        if (j4 > 0) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("restore>BackupApiBackupSelector/calc-approx-media-download unexpected situation, how can toBeDownloadedSampleSize=");
            A0o2.append(j4);
            Log.e(AnonymousClass000.A0Z(" be greater than totalSampleSize=", A0o2, j5));
        }
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0048, code lost:
        if (r1 == false) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AnonymousClass0UH A06(java.lang.String r23, java.lang.String r24) {
        /*
            r22 = this;
            r2 = r22
            X.2oU r0 = r2.A0A
            android.content.Context r7 = r0.A06()
            X.1VX r4 = r2.A0F
            X.2qk r8 = r2.A00
            X.3FI r3 = r2.A0H
            X.2s4 r9 = r2.A02
            X.310 r14 = r2.A09
            X.0WN r11 = r2.A05
            X.0QR r12 = r2.A06
            X.5ZR r15 = r2.A0B
            X.306 r1 = r2.A0G
            X.0U8 r10 = r2.A03
            X.1ip r13 = r2.A08
            X.4FS r0 = r2.A0I
            java.lang.String r21 = "restore"
            X.0Y7 r6 = new X.0Y7
            r20 = r23
            r16 = r4
            r17 = r1
            r18 = r3
            r19 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0Qi r5 = r2.A07     // Catch:{ all -> 0x0076 }
            r3 = 5
            X.0Dp r1 = new X.0Dp     // Catch:{ all -> 0x0076 }
            r1.<init>(r6)     // Catch:{ all -> 0x0076 }
            java.lang.String r0 = "gdrive-backup-util/fetch-token"
            java.lang.Object r0 = X.AnonymousClass0X8.A02(r1, r5, r0, r3)     // Catch:{ all -> 0x0076 }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x004a
            boolean r1 = r0.booleanValue()     // Catch:{ all -> 0x0076 }
            r0 = 1
            if (r1 != 0) goto L_0x004b
        L_0x004a:
            r0 = 0
        L_0x004b:
            r4 = 0
            if (r0 == 0) goto L_0x0070
            java.lang.String r0 = "restore>BackupApiBackupSelector/create-internal-data"
            r1 = r24
            X.0Ub r3 = X.C06520Ya.A01(r5, r6, r1, r0)     // Catch:{ all -> 0x0076 }
            if (r3 == 0) goto L_0x006f
            boolean r0 = A03(r3)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            X.0Xr r1 = r2.A04     // Catch:{ all -> 0x0076 }
            org.json.JSONObject r0 = r3.A03()     // Catch:{ all -> 0x0076 }
            boolean r0 = r1.A0D(r0)     // Catch:{ all -> 0x0076 }
            if (r0 == 0) goto L_0x006f
            X.0Dj r4 = new X.0Dj     // Catch:{ all -> 0x0076 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0076 }
        L_0x006f:
            return r4
        L_0x0070:
            X.0EX r0 = new X.0EX     // Catch:{ all -> 0x0076 }
            r0.<init>(r4)     // Catch:{ all -> 0x0076 }
            throw r0     // Catch:{ all -> 0x0076 }
        L_0x0076:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06320Xc.A06(java.lang.String, java.lang.String):X.0UH");
    }

    public final AnonymousClass0UI A07(Map map) {
        File[] A0c = this.A0D.A0c();
        int length = A0c.length;
        int i = 0;
        while (i < length) {
            File file = A0c[i];
            String A062 = AnonymousClass0YV.A06(this.A0A.A06(), this.A09, file);
            if (A062 != null) {
                AnonymousClass0UI r0 = (AnonymousClass0UI) map.get(A062);
                if (r0 != null) {
                    return r0;
                }
                i++;
            } else {
                throw AnonymousClass000.A0H(file, "restore>BackupApiBackupSelector/decide upload title is null for ", AnonymousClass001.A0o());
            }
        }
        return null;
    }

    public final Map A08(C05580Ub r3) {
        try {
            return C06520Ya.A05(this.A07, r3);
        } catch (AnonymousClass0GS e) {
            Log.e("restore>BackupApiBackupSelector/decide", e);
            return null;
        }
    }

    public boolean A0A(AnonymousClass0UI r15) {
        File file;
        String str;
        int i;
        try {
            file = this.A0D.A0K();
        } catch (IOException e) {
            Log.e("restore>BackupApiBackupSelector/device unable to access local backup", e);
            file = null;
        }
        boolean z = this.A0L.get();
        AnonymousClass33p r7 = this.A0C;
        String A0a = r7.A0a();
        C625835r r6 = this.A0D;
        int i2 = 2;
        if (!C06540Yd.A0O(r6, file, A0a, z)) {
            r7.A1q(true);
            if (r15 == null) {
                i2 = 4;
            }
            RestoreFromBackupActivity.A1Y(r6, i2);
            return true;
        }
        if (r15 == null) {
            Log.e("restore>BackupApiBackupSelector/decide remote dbFile does not exist");
            r7.A1q(false);
            i = 3;
        } else {
            AnonymousClass0UF r0 = r15.A02;
            if (r0 != null) {
                str = r0.A03;
            } else {
                str = r15.A03;
            }
            if (str.equals(AnonymousClass0YV.A07(this.A09, this.A0B, file))) {
                Log.i("restore>BackupApiBackupSelector/decide Local message backup has same md5 as google drive.");
                r7.A1q(false);
                i = 5;
            } else {
                DateFormat dateInstance = DateFormat.getDateInstance(2, Locale.getDefault());
                long lastModified = file.lastModified();
                long j = r15.A01;
                if (lastModified < j) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("restore>BackupApiBackupSelector/decide/choose-remote Google Drive (timestamp ");
                    A0o.append(j);
                    A0o.append(", time: ");
                    A0o.append(dateInstance.format(Long.valueOf(j)));
                    A0o.append(") is newer than local message backup (timestamp ");
                    A0o.append(file.lastModified());
                    A0o.append(", time: ");
                    A0o.append(dateInstance.format(Long.valueOf(file.lastModified())));
                    Log.i(AnonymousClass000.A0e(A0o));
                    r7.A1q(true);
                    RestoreFromBackupActivity.A1Y(r6, 6);
                    return true;
                }
                StringBuilder A0o2 = AnonymousClass001.A0o();
                A0o2.append("restore>BackupApiBackupSelector/decide/choose-local local backup file (timestamp ");
                A0o2.append(file.lastModified());
                A0o2.append(", time: ");
                A0o2.append(dateInstance.format(Long.valueOf(file.lastModified())));
                A0o2.append(") and is newer than one on Google Drive (timestamp ");
                A0o2.append(j);
                A0o2.append(", time: ");
                A0o2.append(dateInstance.format(Long.valueOf(j)));
                Log.i(AnonymousClass000.A0X(") and the two files are different as well, therefore, we will use the local", A0o2));
                r7.A1q(false);
                i = 7;
            }
        }
        RestoreFromBackupActivity.A1Y(r6, i);
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0071, code lost:
        com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r6.A0D, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0076, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r6.A0D, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0030, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A0C(java.util.List r7, java.util.List r8) {
        /*
            r6 = this;
            X.310 r1 = r6.A09
            X.5ZR r0 = r6.A0B
            int r5 = A00(r1, r0, r7, r8)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "restore>BackupApiBackupSelector/decideLocalVsRemotePreference/backup state: "
            r1.append(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            if (r0 != 0) goto L_0x0038
            r0 = 0
        L_0x0018:
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r4 = 4
            r2 = 1
            r3 = 0
            switch(r5) {
                case 2: goto L_0x0059;
                case 3: goto L_0x003d;
                case 4: goto L_0x0060;
                case 5: goto L_0x0031;
                case 6: goto L_0x006b;
                default: goto L_0x0025;
            }
        L_0x0025:
            X.33p r0 = r6.A0C
            r0.A1q(r3)
            r1 = 7
        L_0x002b:
            X.35r r0 = r6.A0D
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r0, r1)
            return r3
        L_0x0031:
            X.33p r0 = r6.A0C
            r0.A1q(r3)
            r1 = 5
            goto L_0x002b
        L_0x0038:
            java.lang.String r0 = r0.toString()
            goto L_0x0018
        L_0x003d:
            X.33p r1 = r6.A0C
            r1.A1q(r3)
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.A0L
            boolean r2 = r0.get()
            java.lang.String r0 = r1.A0a()
            X.35r r1 = r6.A0D
            boolean r0 = X.C06540Yd.A0P(r1, r0, r7, r2)
            if (r0 == 0) goto L_0x0055
            r4 = 3
        L_0x0055:
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r1, r4)
            return r3
        L_0x0059:
            X.33p r0 = r6.A0C
            r0.A1q(r2)
            r1 = 2
            goto L_0x0071
        L_0x0060:
            X.35r r0 = r6.A0D
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r0, r4)
            X.33p r0 = r6.A0C
            r0.A1q(r2)
            return r2
        L_0x006b:
            X.33p r0 = r6.A0C
            r0.A1q(r2)
            r1 = 6
        L_0x0071:
            X.35r r0 = r6.A0D
            com.whatsapp.backup.google.RestoreFromBackupActivity.A1Y(r0, r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C06320Xc.A0C(java.util.List, java.util.List):boolean");
    }

    public C06320Xc(C55682qk r3, C64393Dh r4, C56492s4 r5, AnonymousClass0U8 r6, AnonymousClass0WN r7, RestoreFromBackupActivity restoreFromBackupActivity, AnonymousClass0QR r9, C04710Qi r10, C29441ip r11, AnonymousClass310 r12, C54292oU r13, AnonymousClass5ZR r14, AnonymousClass33p r15, C625835r r16, C48602fA r17, AnonymousClass1VW r18, AnonymousClass1VX r19, AnonymousClass306 r20, AnonymousClass3FI r21, AnonymousClass4FS r22, AtomicBoolean atomicBoolean, AtomicBoolean atomicBoolean2) {
        this.A0A = r13;
        AnonymousClass1VX r1 = r19;
        this.A0F = r1;
        this.A00 = r3;
        this.A0H = r21;
        this.A0I = r22;
        this.A01 = r4;
        this.A02 = r5;
        this.A09 = r12;
        this.A0E = r18;
        this.A05 = r7;
        this.A0D = r16;
        this.A06 = r9;
        this.A0B = r14;
        this.A0C = r15;
        this.A0G = r20;
        this.A03 = r6;
        this.A0J = new WeakReference(restoreFromBackupActivity);
        this.A0L = atomicBoolean;
        this.A0K = atomicBoolean2;
        this.A07 = r10;
        this.A08 = r11;
        this.A04 = C06430Xr.A02(r17, r1);
    }

    public static int A00(AnonymousClass310 r6, AnonymousClass5ZR r7, List list, List list2) {
        String str;
        if (list.isEmpty() && list2.isEmpty()) {
            return 4;
        }
        if (list.isEmpty()) {
            return 2;
        }
        if (list2.isEmpty()) {
            return 3;
        }
        if (list2.size() == list.size()) {
            ArrayList A0s = AnonymousClass001.A0s();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    A0s.add(AnonymousClass0YV.A07(r6, r7, (File) it.next()));
                } catch (AnonymousClass0EV unused) {
                }
            }
            if (list2.size() == A0s.size()) {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    AnonymousClass0UI r1 = (AnonymousClass0UI) it2.next();
                    AnonymousClass0UF r0 = r1.A02;
                    if (r0 != null) {
                        str = r0.A03;
                    } else {
                        str = r1.A03;
                    }
                    if (!A0s.remove(str)) {
                        break;
                    }
                }
                if (A0s.isEmpty()) {
                    Log.i("GoogleBackupUtils/isRemoteTheLatest local and remote are the same");
                    return 5;
                }
            }
        }
        Iterator it3 = list2.iterator();
        long j = 0;
        long j2 = 0;
        while (it3.hasNext()) {
            long j3 = ((AnonymousClass0UI) it3.next()).A01;
            if (j3 > j2) {
                j2 = j3;
            }
        }
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            long lastModified = ((File) it4.next()).lastModified();
            if (lastModified > j) {
                j = lastModified;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("GoogleBackupUtils/isRemoteTheLatest remote: ");
        A0o.append(j2);
        Log.i(AnonymousClass000.A0Z(" local: ", A0o, j));
        if (j2 > j) {
            return 6;
        }
        return 7;
    }

    public boolean A09(C02030Dj r16) {
        boolean optBoolean;
        boolean z;
        boolean z2;
        long j;
        C626936e.A00();
        AnonymousClass33M r6 = new AnonymousClass33M("restore>BackupApiBackupSelector/decide");
        C02030Dj r11 = r16;
        C05580Ub r2 = r11.A01;
        JSONObject jSONObject = r2.A0C;
        if (jSONObject == null) {
            optBoolean = false;
        } else {
            optBoolean = jSONObject.optBoolean("encryptedBackupEnabled", false);
        }
        Map A082 = A08(r2);
        if (A082 != null) {
            List<File> A0s = AnonymousClass001.A0s();
            try {
                AnonymousClass1VW r4 = this.A0E;
                if (AnonymousClass0S8.A00(r4)) {
                    A0s = this.A0D.A0R();
                    z = A0C(A0s, C06520Ya.A04(A082));
                } else {
                    z = A0A(A07(A082));
                }
                if (!z) {
                    optBoolean = A0B(A0s);
                }
                r6.A07();
                C49272gG r12 = new C49272gG();
                this.A0I.BkM(new C13120mf(this, r11, r12, A082, z));
                try {
                    z2 = AnonymousClass001.A1Z(r12.A00());
                } catch (InterruptedException e) {
                    Log.e((Throwable) e);
                    z2 = false;
                }
                long j2 = r2.A04;
                if (!z) {
                    if (AnonymousClass0S8.A00(r4)) {
                        j = 0;
                        for (File length : A0s) {
                            j += length.length();
                        }
                    } else {
                        j = this.A0D.A0L().length();
                    }
                    long j3 = -1;
                    if (jSONObject != null) {
                        j3 = jSONObject.optLong("chatdbSize", -1);
                    }
                    j2 += j - j3;
                }
                this.A0C.A1x(optBoolean);
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("restore>BackupApiBackupSelector/overwrite local files: ");
                A0o.append(z);
                Log.i(AnonymousClass000.A0b(", isEncrypted: ", A0o, optBoolean));
                synchronized (r11) {
                    r11.A00 = A082;
                    r11.A00 = j2;
                    r11.A03 = z;
                    r11.A01 = z2;
                    r11.A02 = optBoolean;
                }
                return true;
            } catch (AnonymousClass0EV e2) {
                Log.e("restore>BackupApiBackupSelector/one-time-setup/read-storage-permission-withdrawn/exiting", e2);
                RestoreFromBackupActivity restoreFromBackupActivity = (RestoreFromBackupActivity) this.A0J.get();
                if (restoreFromBackupActivity != null) {
                    restoreFromBackupActivity.A7K();
                    restoreFromBackupActivity.finish();
                }
            }
        }
        return false;
    }
}
