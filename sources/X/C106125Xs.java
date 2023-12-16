package X;

import android.net.Uri;
import android.util.SparseIntArray;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5Xs  reason: invalid class name and case insensitive filesystem */
public class C106125Xs {
    public final C29171iO A00;
    public final C55682qk A01;
    public final C64393Dh A02;
    public final AnonymousClass310 A03;
    public final C56512s6 A04;
    public final C620633i A05;
    public final C56612sH A06;
    public final C54292oU A07;
    public final AnonymousClass5ZR A08;
    public final AnonymousClass33p A09;
    public final AnonymousClass3DM A0A;
    public final AnonymousClass4FV A0B;
    public final C51072jE A0C;
    public final AtomicBoolean A0D = C18280x3.A0l();

    public final void A03(SparseIntArray sparseIntArray, int i) {
        if (sparseIntArray != null) {
            int i2 = sparseIntArray.get(i, 0);
            sparseIntArray.put(i, i2 + 1);
            if (i2 != 0) {
                return;
            }
        }
        if (i == 2 || i == 3 || i == 4 || i == 6) {
            C55682qk r2 = this.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("externaldirmigration/failed: ");
            r2.A0A(AnonymousClass000.A0X(C18270x1.A0T(Integer.valueOf(i)), A0o), true, (String) null);
        }
        C94714rn r4 = new C94714rn();
        r4.A00 = Integer.valueOf(i);
        C183538qC r7 = this.A09.A01;
        r4.A01 = C86614Ku.A0q(C18300x5.A0B(r7), "external_dir_migration_attempt_n", -1);
        r4.A04 = C86614Ku.A0q(C18300x5.A0B(r7), "ext_dir_migration_rescan_time", -1);
        r4.A03 = C86614Ku.A0q(C18300x5.A0B(r7), "ext_dir_migration_move_time", -1);
        r4.A02 = C18310x6.A0f(System.currentTimeMillis(), AnonymousClass0x2.A0B(C18300x5.A0B(r7), "ext_dir_migration_start_time"));
        this.A0B.Bh7(r4, (AnonymousClass5ZC) null, false);
    }

    public final int A01() {
        int A022 = C18280x3.A02(AnonymousClass0x2.A0F(this.A09), "external_dir_migration_stage");
        if (A022 >= 0 && A022 <= 5) {
            return A022;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("externaldirmigration/unexpected stage (");
        A0o.append(A022);
        C18260x0.A1K(A0o, ") resetting to not started");
        return 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005a, code lost:
        if ((!X.C18300x5.A1V(r12, ".nomedia")) == false) goto L_0x005c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x012c  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x012d A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int A02(android.util.SparseIntArray r25, X.C102455Ix r26, java.io.File r27, java.io.File r28, boolean r29) {
        /*
            r24 = this;
            r13 = r27
            boolean r0 = r13.exists()
            r1 = 0
            if (r0 == 0) goto L_0x0170
            java.lang.String r0 = ".migrated"
            java.io.File r17 = X.AnonymousClass002.A0A(r13, r0)
            boolean r0 = r17.exists()
            r1 = 1
            if (r0 != 0) goto L_0x0170
            r12 = r28
            boolean r0 = r12.exists()
            r2 = 2
            r11 = r24
            r14 = r25
            if (r0 != 0) goto L_0x0037
            boolean r0 = r12.mkdir()
            if (r0 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "externaldirmigration/move/can't create to="
            X.C18260x0.A1P(r1, r0, r12)
            r0 = 3
            r11.A03(r14, r0)
        L_0x0036:
            return r2
        L_0x0037:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "externaldirmigration/move from="
            r1.append(r0)
            r1.append(r13)
            java.lang.String r10 = " to="
            X.C18260x0.A1P(r1, r10, r12)
            java.lang.String r1 = ".nomedia"
            boolean r0 = X.C18300x5.A1V(r13, r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x005c
            boolean r0 = X.C18300x5.A1V(r12, r1)
            r0 = r0 ^ 1
            r16 = 1
            if (r0 != 0) goto L_0x005e
        L_0x005c:
            r16 = 0
        L_0x005e:
            java.io.File[] r9 = r13.listFiles()
            java.lang.String r8 = "externaldirmigration/move/can't delete from="
            r23 = r29
            if (r9 == 0) goto L_0x0159
            int r15 = r9.length
            r7 = 0
            r6 = 0
        L_0x006b:
            if (r6 >= r15) goto L_0x0131
            r3 = r9[r6]
            java.lang.String r0 = r3.getName()
            java.io.File r5 = X.AnonymousClass002.A0A(r12, r0)
            com.whatsapp.util.StatResult r2 = com.whatsapp.ExternalDirMigration$Utils.lstatOpenFile(r3)     // Catch:{ IOException -> 0x0121 }
            if (r2 == 0) goto L_0x012d
            boolean r1 = r2.A05     // Catch:{ IOException -> 0x0121 }
            r0 = r26
            if (r1 != 0) goto L_0x00bb
            boolean r1 = r3.isDirectory()     // Catch:{ IOException -> 0x0121 }
            if (r1 == 0) goto L_0x009c
            r20 = r0
            r21 = r3
            r22 = r5
            r18 = r11
            r19 = r14
            int r0 = r18.A02(r19, r20, r21, r22, r23)     // Catch:{ IOException -> 0x0121 }
            if (r0 <= r7) goto L_0x012d
            r7 = r0
            goto L_0x012d
        L_0x009c:
            int r2 = r2.A01     // Catch:{ IOException -> 0x0121 }
            r1 = 1
            if (r2 <= r1) goto L_0x00bb
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "externaldirmigration/can't migrate "
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            r1.append(r3)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "(too many hard links: "
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            r1.append(r2)     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = ")"
            X.C18260x0.A1K(r1, r0)     // Catch:{ IOException -> 0x0121 }
            goto L_0x0129
        L_0x00bb:
            boolean r1 = r5.exists()     // Catch:{ IOException -> 0x0121 }
            if (r1 == 0) goto L_0x00d8
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "externaldirmigration/file already exists, to="
            X.C18260x0.A1S(r1, r0, r5)     // Catch:{ IOException -> 0x0121 }
            boolean r0 = r3.delete()     // Catch:{ IOException -> 0x0121 }
            if (r0 != 0) goto L_0x012d
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0121 }
            X.C18260x0.A1S(r0, r8, r3)     // Catch:{ IOException -> 0x0121 }
            goto L_0x0129
        L_0x00d8:
            X.2s6 r1 = r11.A04     // Catch:{ IOException -> 0x0121 }
            boolean r1 = X.C627536m.A0M(r1, r3, r5)     // Catch:{ IOException -> 0x0121 }
            if (r1 == 0) goto L_0x0105
            X.5Xs r4 = r0.A00     // Catch:{ IOException -> 0x0121 }
            java.util.List r3 = r0.A01     // Catch:{ IOException -> 0x0121 }
            boolean r2 = r0.A03     // Catch:{ IOException -> 0x0121 }
            java.util.concurrent.atomic.AtomicBoolean r1 = r0.A02     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "scoped"
            if (r16 == 0) goto L_0x00ef
            r3.add(r5)     // Catch:{ IOException -> 0x0121 }
        L_0x00ef:
            if (r2 == 0) goto L_0x012d
            r3 = 0
            r2 = 1
            boolean r1 = r1.compareAndSet(r3, r2)     // Catch:{ IOException -> 0x0121 }
            if (r1 == 0) goto L_0x012d
            X.310 r1 = r4.A03     // Catch:{ IOException -> 0x0121 }
            r1.A0A(r0)     // Catch:{ IOException -> 0x0121 }
            X.33p r1 = r4.A09     // Catch:{ IOException -> 0x0121 }
            r0 = 2
            r1.A13(r0)     // Catch:{ IOException -> 0x0121 }
            goto L_0x012d
        L_0x0105:
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0121 }
            if (r0 == 0) goto L_0x012d
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0121 }
            java.lang.String r0 = "externaldirmigration/can't rename from="
            r1.append(r0)     // Catch:{ IOException -> 0x0121 }
            r1.append(r3)     // Catch:{ IOException -> 0x0121 }
            X.C18260x0.A1Q(r1, r10, r5)     // Catch:{ IOException -> 0x0121 }
            if (r29 != 0) goto L_0x0127
            r0 = 4
            r11.A03(r14, r0)     // Catch:{ IOException -> 0x0121 }
            goto L_0x0127
        L_0x0121:
            r1 = move-exception
            java.lang.String r0 = "Failed to read a file"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0127:
            r7 = 2
            goto L_0x012d
        L_0x0129:
            r0 = 1
            if (r7 >= r0) goto L_0x012d
            r7 = 1
        L_0x012d:
            int r6 = r6 + 1
            goto L_0x006b
        L_0x0131:
            if (r7 == 0) goto L_0x0159
            r2 = 1
            r4 = 2
            if (r7 != r2) goto L_0x016d
            X.310 r0 = r11.A03
            boolean r0 = r0.A0B()
            if (r0 == 0) goto L_0x016d
            boolean r0 = r17.exists()     // Catch:{ IOException -> 0x014c }
            if (r0 != 0) goto L_0x0036
            boolean r0 = r17.createNewFile()     // Catch:{ IOException -> 0x014c }
            if (r0 == 0) goto L_0x016d
            return r2
        L_0x014c:
            r3 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r1 = "externaldirmigration/ensureFileExists failed to create "
            r0 = r17
            X.C18260x0.A0k(r0, r1, r2, r3)
            return r4
        L_0x0159:
            boolean r0 = r13.delete()
            if (r0 != 0) goto L_0x016e
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r0, r8, r13)
            if (r29 != 0) goto L_0x016c
            r0 = 6
            r11.A03(r14, r0)
        L_0x016c:
            r4 = 2
        L_0x016d:
            return r4
        L_0x016e:
            r4 = 0
            return r4
        L_0x0170:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C106125Xs.A02(android.util.SparseIntArray, X.5Ix, java.io.File, java.io.File, boolean):int");
    }

    public C106125Xs(C29171iO r2, C55682qk r3, C64393Dh r4, AnonymousClass310 r5, C56512s6 r6, C620633i r7, C56612sH r8, C54292oU r9, AnonymousClass5ZR r10, AnonymousClass33p r11, AnonymousClass3DM r12, AnonymousClass4FV r13, C51072jE r14) {
        this.A07 = r9;
        this.A06 = r8;
        this.A01 = r3;
        this.A02 = r4;
        this.A0B = r13;
        this.A03 = r5;
        this.A05 = r7;
        this.A0A = r12;
        this.A04 = r6;
        this.A08 = r10;
        this.A09 = r11;
        this.A0C = r14;
        this.A00 = r2;
    }

    public static void A00(Uri uri, C620633i r6, File file) {
        try {
            AnonymousClass5UR A022 = C620633i.A02(r6);
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(file.getAbsolutePath());
            int A012 = A022.A01(uri, "_data LIKE ?", new String[]{AnonymousClass001.A0j(A0o, '%')});
            StringBuilder A0o2 = AnonymousClass001.A0o();
            A0o2.append("externaldirmigration/unscanned ");
            A0o2.append(A012);
            A0o2.append(" files in ");
            A0o2.append(uri);
            C18260x0.A1P(A0o2, " rootDir=", file);
        } catch (RuntimeException e) {
            C18260x0.A0k(file, "externaldirmigration/unscan failed for ", AnonymousClass001.A0o(), e);
        }
    }

    public final void A04(File file, List list, Set set) {
        File[] listFiles;
        if (file.exists() && (listFiles = file.listFiles()) != null) {
            boolean z = !C18300x5.A1V(file, ".nomedia");
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    if (set.add(file2)) {
                        A04(file2, list, set);
                    }
                } else if (z) {
                    list.add(file2);
                }
            }
        }
    }
}
