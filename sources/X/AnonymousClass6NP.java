package X;

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;
import java.util.Map;

/* renamed from: X.6NP  reason: invalid class name */
public abstract class AnonymousClass6NP extends AnonymousClass6NR {
    public AnonymousClass8KN A00;
    public String A01;
    public String[] A02;
    public final Context A03;
    public final Map A04 = AnonymousClass001.A0t();

    public static AnonymousClass8KN A00(File file, File file2, boolean z) {
        AnonymousClass8KN r2;
        if (z) {
            try {
                return new AnonymousClass8KN(file2, false);
            } catch (FileNotFoundException e) {
                if (file.setWritable(true)) {
                    if (z) {
                        r2 = new AnonymousClass8KN(file2, false);
                    } else {
                        r2 = new AnonymousClass8KN(file2, true);
                        if (r2.A01 == null) {
                            r2.close();
                            r2 = null;
                        }
                    }
                    if (!file.setWritable(false)) {
                        AnonymousClass6C7.A1F(file.getCanonicalPath(), " write permission", "SysUtil", AnonymousClass000.A0l("error removing "));
                    }
                    return r2;
                }
                throw e;
            } catch (Throwable th) {
                th = th;
                if (!file.setWritable(false)) {
                    AnonymousClass6C7.A1F(file.getCanonicalPath(), " write permission", "SysUtil", AnonymousClass000.A0l("error removing "));
                    throw th;
                }
            }
        } else {
            AnonymousClass8KN r1 = new AnonymousClass8KN(file2, true);
            if (r1.A01 != null) {
                return r1;
            }
            r1.close();
            return null;
        }
        throw th;
    }

    public static void A01(File file, byte b) {
        RandomAccessFile randomAccessFile;
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
            randomAccessFile.seek(0);
            randomAccessFile.write(b);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
            return;
        } catch (SyncFailedException e) {
            Log.w("fb-UnpackingSoSource", "state file sync failed", e);
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:230:?, code lost:
        r1.close();
        r1 = X.AnonymousClass001.A0o();
        r1.append("Finished regenerating DSO store ");
        X.AnonymousClass000.A1E(r19, "fb-UnpackingSoSource", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:?, code lost:
        r6.close();
     */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0273 A[Catch:{ all -> 0x0483, Exception -> 0x025c, all -> 0x052f }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x04a1 A[Catch:{ all -> 0x00e9, all -> 0x0554 }] */
    /* JADX WARNING: Removed duplicated region for block: B:237:0x04af A[Catch:{ all -> 0x00e9, all -> 0x0554 }] */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0501  */
    /* JADX WARNING: Removed duplicated region for block: B:251:0x050e  */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x051b A[SYNTHETIC, Splitter:B:253:0x051b] */
    /* JADX WARNING: Removed duplicated region for block: B:293:0x056e  */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x057b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b2 A[Catch:{ all -> 0x00e9, all -> 0x0554 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba A[Catch:{ all -> 0x00e9, all -> 0x0554 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A03(int r42) {
        /*
            r41 = this;
            r12 = r41
            java.io.File r11 = r12.A01
            boolean r0 = r11.mkdirs()
            if (r0 != 0) goto L_0x001f
            boolean r0 = r11.isDirectory()
            if (r0 != 0) goto L_0x001f
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "cannot mkdir: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)
            throw r0
        L_0x001f:
            boolean r24 = r11.canWrite()
            java.lang.String r23 = "error removing "
            java.lang.String r21 = "releasing dso store lock for "
            java.lang.String r20 = " (syncer thread started)"
            java.lang.String r22 = "not releasing dso store lock for "
            r13 = 1
            java.lang.String r10 = " write permission"
            r9 = 0
            java.lang.String r8 = "fb-UnpackingSoSource"
            r30 = 0
            if (r24 != 0) goto L_0x004b
            boolean r0 = r11.setWritable(r13)     // Catch:{ all -> 0x0558 }
            if (r0 != 0) goto L_0x004b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = "error adding "
            r1.append(r0)     // Catch:{ all -> 0x0558 }
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x0558 }
            X.AnonymousClass6C7.A1F(r0, r10, r8, r1)     // Catch:{ all -> 0x0558 }
        L_0x004b:
            java.lang.String r32 = "dso_lock"
            r0 = r32
            java.io.File r0 = X.AnonymousClass002.A0A(r11, r0)     // Catch:{ all -> 0x0558 }
            X.8KN r38 = A00(r11, r0, r13)     // Catch:{ all -> 0x0558 }
            X.8KN r0 = r12.A00     // Catch:{ all -> 0x0554 }
            if (r0 != 0) goto L_0x0067
            java.lang.String r0 = "dso_instance_lock"
            java.io.File r0 = X.AnonymousClass002.A0A(r11, r0)     // Catch:{ all -> 0x0554 }
            X.8KN r0 = A00(r11, r0, r9)     // Catch:{ all -> 0x0554 }
            r12.A00 = r0     // Catch:{ all -> 0x0554 }
        L_0x0067:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0554 }
            java.lang.String r0 = "locked dso store "
            X.AnonymousClass000.A18(r11, r0, r8, r1)     // Catch:{ all -> 0x0554 }
            boolean r0 = r12 instanceof X.C126226Na     // Catch:{ all -> 0x0554 }
            if (r0 == 0) goto L_0x00ee
            r4 = r12
            X.6Na r4 = (X.C126226Na) r4     // Catch:{ all -> 0x0554 }
            java.io.File r0 = r4.A00     // Catch:{ all -> 0x0554 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x0554 }
            android.os.Parcel r3 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0554 }
            r2 = 2
            r3.writeByte(r2)     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x00e9 }
            r3.writeString(r0)     // Catch:{ all -> 0x00e9 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x00e9 }
            r3.writeLong(r0)     // Catch:{ all -> 0x00e9 }
            android.content.Context r1 = r4.A03     // Catch:{ all -> 0x00e9 }
            android.content.pm.PackageManager r4 = r1.getPackageManager()     // Catch:{ all -> 0x00e9 }
            if (r4 == 0) goto L_0x00a6
            java.lang.String r0 = r1.getPackageName()     // Catch:{ NameNotFoundException | RuntimeException -> 0x00a6 }
            android.content.pm.PackageInfo r0 = r4.getPackageInfo(r0, r9)     // Catch:{ NameNotFoundException | RuntimeException -> 0x00a6 }
            int r0 = r0.versionCode     // Catch:{ NameNotFoundException | RuntimeException -> 0x00a6 }
            goto L_0x00a7
        L_0x00a6:
            r0 = 0
        L_0x00a7:
            r3.writeInt(r0)     // Catch:{ all -> 0x00e9 }
            android.content.pm.ApplicationInfo r0 = r1.getApplicationInfo()     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = r0.nativeLibraryDir     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x00ba
            r3.writeByte(r13)     // Catch:{ all -> 0x00e9 }
            byte[] r31 = r3.marshall()     // Catch:{ all -> 0x00e9 }
            goto L_0x00e5
        L_0x00ba:
            java.io.File r0 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x00e9 }
            java.io.File r1 = r0.getCanonicalFile()     // Catch:{ all -> 0x00e9 }
            boolean r0 = r1.exists()     // Catch:{ all -> 0x00e9 }
            if (r0 != 0) goto L_0x00d0
            r3.writeByte(r13)     // Catch:{ all -> 0x00e9 }
            byte[] r31 = r3.marshall()     // Catch:{ all -> 0x00e9 }
            goto L_0x00e5
        L_0x00d0:
            r3.writeByte(r2)     // Catch:{ all -> 0x00e9 }
            java.lang.String r0 = r1.getPath()     // Catch:{ all -> 0x00e9 }
            r3.writeString(r0)     // Catch:{ all -> 0x00e9 }
            long r0 = r1.lastModified()     // Catch:{ all -> 0x00e9 }
            r3.writeLong(r0)     // Catch:{ all -> 0x00e9 }
            byte[] r31 = r3.marshall()     // Catch:{ all -> 0x00e9 }
        L_0x00e5:
            r3.recycle()     // Catch:{ all -> 0x0554 }
            goto L_0x014a
        L_0x00e9:
            r0 = move-exception
            r3.recycle()     // Catch:{ all -> 0x0554 }
            throw r0     // Catch:{ all -> 0x0554 }
        L_0x00ee:
            android.os.Parcel r5 = android.os.Parcel.obtain()     // Catch:{ all -> 0x0554 }
            boolean r0 = r12 instanceof X.AnonymousClass6NZ     // Catch:{ all -> 0x0554 }
            if (r0 == 0) goto L_0x00ff
            r0 = r12
            X.6NZ r0 = (X.AnonymousClass6NZ) r0     // Catch:{ all -> 0x0554 }
            X.6NX r4 = new X.6NX     // Catch:{ all -> 0x0554 }
            r4.<init>(r0, r0)     // Catch:{ all -> 0x0554 }
            goto L_0x0107
        L_0x00ff:
            r0 = r12
            X.6Na r0 = (X.C126226Na) r0     // Catch:{ all -> 0x0554 }
            X.6NY r4 = new X.6NY     // Catch:{ all -> 0x0554 }
            r4.<init>(r0, r0)     // Catch:{ all -> 0x0554 }
        L_0x0107:
            boolean r0 = r4 instanceof X.AnonymousClass6NX     // Catch:{ all -> 0x054a }
            if (r0 == 0) goto L_0x011f
            r0 = r4
            X.6NX r0 = (X.AnonymousClass6NX) r0     // Catch:{ all -> 0x054a }
            X.6NT[] r0 = r0.A00     // Catch:{ all -> 0x054a }
            X.7An r1 = new X.7An     // Catch:{ all -> 0x054a }
            r1.<init>(r0)     // Catch:{ all -> 0x054a }
        L_0x0115:
            X.7Fe[] r3 = r1.A00     // Catch:{ all -> 0x054a }
            r5.writeByte(r13)     // Catch:{ all -> 0x054a }
            int r2 = r3.length     // Catch:{ all -> 0x054a }
            r5.writeInt(r2)     // Catch:{ all -> 0x054a }
            goto L_0x012c
        L_0x011f:
            r0 = r4
            X.6NY r0 = (X.AnonymousClass6NY) r0     // Catch:{ all -> 0x054a }
            X.6NU[] r0 = r0.A00()     // Catch:{ all -> 0x054a }
            X.7An r1 = new X.7An     // Catch:{ all -> 0x054a }
            r1.<init>(r0)     // Catch:{ all -> 0x054a }
            goto L_0x0115
        L_0x012c:
            r1 = 0
        L_0x012d:
            if (r1 >= r2) goto L_0x0140
            r0 = r3[r1]     // Catch:{ all -> 0x054a }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x054a }
            r5.writeString(r0)     // Catch:{ all -> 0x054a }
            r0 = r3[r1]     // Catch:{ all -> 0x054a }
            java.lang.String r0 = r0.A00     // Catch:{ all -> 0x054a }
            r5.writeString(r0)     // Catch:{ all -> 0x054a }
            int r1 = r1 + 1
            goto L_0x012d
        L_0x0140:
            r4.close()     // Catch:{ all -> 0x0554 }
            byte[] r31 = r5.marshall()     // Catch:{ all -> 0x0554 }
            r5.recycle()     // Catch:{ all -> 0x0554 }
        L_0x014a:
            java.lang.String r29 = "dso_state"
            r0 = r29
            java.io.File r28 = X.AnonymousClass002.A0A(r11, r0)     // Catch:{ all -> 0x0554 }
            java.lang.String r27 = "rw"
            java.io.RandomAccessFile r26 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0554 }
            r2 = r26
            r1 = r27
            r0 = r28
            r2.<init>(r0, r1)     // Catch:{ all -> 0x0554 }
            byte r2 = r26.readByte()     // Catch:{ EOFException -> 0x0176 }
            if (r2 == r13) goto L_0x0177
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ EOFException -> 0x0176 }
            java.lang.String r0 = "dso store "
            r1.append(r0)     // Catch:{ EOFException -> 0x0176 }
            r1.append(r11)     // Catch:{ EOFException -> 0x0176 }
            java.lang.String r0 = " regeneration interrupted: wiping clean"
            X.AnonymousClass000.A1E(r0, r8, r1)     // Catch:{ EOFException -> 0x0176 }
        L_0x0176:
            r2 = 0
        L_0x0177:
            r26.close()     // Catch:{ all -> 0x0554 }
            java.lang.String r16 = "dso_deps"
            r0 = r16
            java.io.File r25 = X.AnonymousClass002.A0A(r11, r0)     // Catch:{ all -> 0x0554 }
            java.io.RandomAccessFile r26 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0554 }
            r3 = r26
            r1 = r27
            r0 = r25
            r3.<init>(r0, r1)     // Catch:{ all -> 0x0554 }
            long r0 = r26.length()     // Catch:{ all -> 0x0545 }
            int r3 = (int) r0     // Catch:{ all -> 0x0545 }
            byte[] r1 = new byte[r3]     // Catch:{ all -> 0x0545 }
            r0 = r26
            int r0 = r0.read(r1)     // Catch:{ all -> 0x0545 }
            if (r0 == r3) goto L_0x01a2
            java.lang.String r0 = "short read of so store deps file: marking unclean"
            android.util.Log.v(r8, r0)     // Catch:{ all -> 0x0545 }
            r2 = 0
        L_0x01a2:
            r0 = r31
            boolean r0 = java.util.Arrays.equals(r1, r0)     // Catch:{ all -> 0x0545 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "deps mismatch on deps store: regenerating"
            android.util.Log.v(r8, r0)     // Catch:{ all -> 0x0545 }
            r2 = 0
            goto L_0x01bc
        L_0x01b3:
            if (r2 == 0) goto L_0x01bc
            r0 = r42 & 2
            if (r0 != 0) goto L_0x01bc
            r7 = 0
            goto L_0x049c
        L_0x01bc:
            java.lang.String r0 = "so store dirty: regenerating"
            android.util.Log.v(r8, r0)     // Catch:{ all -> 0x0545 }
            r0 = r28
            A01(r0, r9)     // Catch:{ all -> 0x0545 }
            boolean r0 = r12 instanceof X.AnonymousClass6NZ     // Catch:{ all -> 0x0545 }
            if (r0 == 0) goto L_0x01d3
            r0 = r12
            X.6NZ r0 = (X.AnonymousClass6NZ) r0     // Catch:{ all -> 0x0545 }
            X.6NX r6 = new X.6NX     // Catch:{ all -> 0x0545 }
            r6.<init>(r0, r0)     // Catch:{ all -> 0x0545 }
            goto L_0x01db
        L_0x01d3:
            r0 = r12
            X.6Na r0 = (X.C126226Na) r0     // Catch:{ all -> 0x0545 }
            X.6NY r6 = new X.6NY     // Catch:{ all -> 0x0545 }
            r6.<init>(r0, r0)     // Catch:{ all -> 0x0545 }
        L_0x01db:
            boolean r0 = r6 instanceof X.AnonymousClass6NX     // Catch:{ all -> 0x053b }
            if (r0 == 0) goto L_0x01ef
            r1 = r6
            X.6NX r1 = (X.AnonymousClass6NX) r1     // Catch:{ all -> 0x053b }
            X.6NT[] r0 = r1.A00     // Catch:{ all -> 0x053b }
            X.7An r7 = new X.7An     // Catch:{ all -> 0x053b }
            r7.<init>(r0)     // Catch:{ all -> 0x053b }
            X.6NV r5 = new X.6NV     // Catch:{ all -> 0x053b }
            r5.<init>(r1)     // Catch:{ all -> 0x053b }
            goto L_0x0200
        L_0x01ef:
            r1 = r6
            X.6NY r1 = (X.AnonymousClass6NY) r1     // Catch:{ all -> 0x053b }
            X.6NU[] r0 = r1.A00()     // Catch:{ all -> 0x053b }
            X.7An r7 = new X.7An     // Catch:{ all -> 0x053b }
            r7.<init>(r0)     // Catch:{ all -> 0x053b }
            X.6NW r5 = new X.6NW     // Catch:{ all -> 0x053b }
            r5.<init>(r1)     // Catch:{ all -> 0x053b }
        L_0x0200:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = "regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            java.lang.String r19 = X.AnonymousClass000.A0O(r12)     // Catch:{ all -> 0x0539 }
            r0 = r19
            X.AnonymousClass000.A1E(r0, r8, r1)     // Catch:{ all -> 0x0539 }
            java.lang.String r15 = "dso_manifest"
            java.io.File r3 = X.AnonymousClass002.A0A(r11, r15)     // Catch:{ all -> 0x0539 }
            java.io.RandomAccessFile r18 = new java.io.RandomAccessFile     // Catch:{ all -> 0x0539 }
            r1 = r18
            r0 = r27
            r1.<init>(r3, r0)     // Catch:{ all -> 0x0539 }
            if (r2 != r13) goto L_0x0262
            byte r0 = r18.readByte()     // Catch:{ Exception -> 0x025c }
            if (r0 != r13) goto L_0x024e
            int r4 = r18.readInt()     // Catch:{ Exception -> 0x025c }
            if (r4 < 0) goto L_0x0255
            X.7Fe[] r3 = new X.C147667Fe[r4]     // Catch:{ Exception -> 0x025c }
            r2 = 0
        L_0x0232:
            if (r2 >= r4) goto L_0x0246
            java.lang.String r14 = r18.readUTF()     // Catch:{ Exception -> 0x025c }
            java.lang.String r1 = r18.readUTF()     // Catch:{ Exception -> 0x025c }
            X.7Fe r0 = new X.7Fe     // Catch:{ Exception -> 0x025c }
            r0.<init>(r14, r1)     // Catch:{ Exception -> 0x025c }
            r3[r2] = r0     // Catch:{ Exception -> 0x025c }
            int r2 = r2 + 1
            goto L_0x0232
        L_0x0246:
            X.7An r17 = new X.7An     // Catch:{ Exception -> 0x025c }
            r0 = r17
            r0.<init>(r3)     // Catch:{ Exception -> 0x025c }
            goto L_0x026b
        L_0x024e:
            java.lang.String r0 = "wrong dso manifest version"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ Exception -> 0x025c }
            goto L_0x025b
        L_0x0255:
            java.lang.String r0 = "illegal number of shared libraries"
            java.lang.RuntimeException r0 = X.AnonymousClass002.A0E(r0)     // Catch:{ Exception -> 0x025c }
        L_0x025b:
            throw r0     // Catch:{ Exception -> 0x025c }
        L_0x025c:
            r1 = move-exception
            java.lang.String r0 = "error reading existing DSO manifest"
            android.util.Log.i(r8, r0, r1)     // Catch:{ all -> 0x052f }
        L_0x0262:
            X.7Fe[] r1 = new X.C147667Fe[r9]     // Catch:{ all -> 0x052f }
            X.7An r17 = new X.7An     // Catch:{ all -> 0x052f }
            r0 = r17
            r0.<init>(r1)     // Catch:{ all -> 0x052f }
        L_0x026b:
            X.7Fe[] r4 = r7.A00     // Catch:{ all -> 0x052f }
            java.lang.String[] r3 = r11.list()     // Catch:{ all -> 0x052f }
            if (r3 == 0) goto L_0x051b
            r2 = 0
        L_0x0274:
            int r0 = r3.length     // Catch:{ all -> 0x052f }
            if (r2 >= r0) goto L_0x02c3
            r1 = r3[r2]     // Catch:{ all -> 0x052f }
            r0 = r29
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x052f }
            if (r0 != 0) goto L_0x02c0
            r0 = r32
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x052f }
            if (r0 != 0) goto L_0x02c0
            java.lang.String r0 = "dso_instance_lock"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x052f }
            if (r0 != 0) goto L_0x02c0
            r0 = r16
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x052f }
            if (r0 != 0) goto L_0x02c0
            boolean r0 = r1.equals(r15)     // Catch:{ all -> 0x052f }
            if (r0 != 0) goto L_0x02c0
            r0 = 0
        L_0x02a0:
            int r14 = r4.length     // Catch:{ all -> 0x052f }
            if (r0 >= r14) goto L_0x02b0
            r14 = r4[r0]     // Catch:{ all -> 0x052f }
            java.lang.String r14 = r14.A01     // Catch:{ all -> 0x052f }
            boolean r14 = r14.equals(r1)     // Catch:{ all -> 0x052f }
            if (r14 != 0) goto L_0x02c0
            int r0 = r0 + 1
            goto L_0x02a0
        L_0x02b0:
            java.io.File r14 = X.AnonymousClass002.A0A(r11, r1)     // Catch:{ all -> 0x052f }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x052f }
            java.lang.String r0 = "deleting unaccounted-for file "
            X.AnonymousClass000.A18(r14, r0, r8, r1)     // Catch:{ all -> 0x052f }
            X.C159237lU.A00(r14)     // Catch:{ all -> 0x052f }
        L_0x02c0:
            int r2 = r2 + 1
            goto L_0x0274
        L_0x02c3:
            r0 = 32768(0x8000, float:4.5918E-41)
            byte[] r0 = new byte[r0]     // Catch:{ all -> 0x052f }
            r32 = r0
        L_0x02ca:
            boolean r2 = r5 instanceof X.AnonymousClass6NW     // Catch:{ all -> 0x052f }
            if (r2 == 0) goto L_0x02e0
            r1 = r5
            X.6NW r1 = (X.AnonymousClass6NW) r1     // Catch:{ all -> 0x052f }
            X.6NY r0 = r1.A01     // Catch:{ all -> 0x052f }
            r0.A00()     // Catch:{ all -> 0x052f }
            int r1 = r1.A00     // Catch:{ all -> 0x052f }
            X.6NU[] r0 = r0.A00     // Catch:{ all -> 0x052f }
            int r0 = r0.length     // Catch:{ all -> 0x052f }
            boolean r0 = X.AnonymousClass001.A1Y(r1, r0)     // Catch:{ all -> 0x052f }
            goto L_0x02ee
        L_0x02e0:
            r0 = r5
            X.6NV r0 = (X.AnonymousClass6NV) r0     // Catch:{ all -> 0x052f }
            int r1 = r0.A00     // Catch:{ all -> 0x052f }
            X.6NX r0 = r0.A01     // Catch:{ all -> 0x052f }
            X.6NT[] r0 = r0.A00     // Catch:{ all -> 0x052f }
            int r0 = r0.length     // Catch:{ all -> 0x052f }
            boolean r0 = X.AnonymousClass001.A1Y(r1, r0)     // Catch:{ all -> 0x052f }
        L_0x02ee:
            if (r0 == 0) goto L_0x0488
            if (r2 == 0) goto L_0x0312
            r4 = r5
            X.6NW r4 = (X.AnonymousClass6NW) r4     // Catch:{ all -> 0x052f }
            X.6NY r3 = r4.A01     // Catch:{ all -> 0x052f }
            r3.A00()     // Catch:{ all -> 0x052f }
            X.6NU[] r2 = r3.A00     // Catch:{ all -> 0x052f }
            int r1 = r4.A00     // Catch:{ all -> 0x052f }
            int r0 = r1 + 1
            r4.A00 = r0     // Catch:{ all -> 0x052f }
            r2 = r2[r1]     // Catch:{ all -> 0x052f }
            java.util.zip.ZipFile r1 = r3.A03     // Catch:{ all -> 0x052f }
            java.util.zip.ZipEntry r0 = r2.A01     // Catch:{ all -> 0x052f }
            java.io.InputStream r1 = r1.getInputStream(r0)     // Catch:{ all -> 0x052f }
            X.8KO r4 = new X.8KO     // Catch:{ all -> 0x0429 }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x0429 }
            goto L_0x032c
        L_0x0312:
            r3 = r5
            X.6NV r3 = (X.AnonymousClass6NV) r3     // Catch:{ all -> 0x052f }
            X.6NX r0 = r3.A01     // Catch:{ all -> 0x052f }
            X.6NT[] r2 = r0.A00     // Catch:{ all -> 0x052f }
            int r1 = r3.A00     // Catch:{ all -> 0x052f }
            int r0 = r1 + 1
            r3.A00 = r0     // Catch:{ all -> 0x052f }
            r2 = r2[r1]     // Catch:{ all -> 0x052f }
            java.io.File r0 = r2.A00     // Catch:{ all -> 0x052f }
            java.io.FileInputStream r1 = X.AnonymousClass0x9.A0g(r0)     // Catch:{ all -> 0x052f }
            X.8KO r4 = new X.8KO     // Catch:{ all -> 0x052a }
            r4.<init>(r2, r1)     // Catch:{ all -> 0x052a }
        L_0x032c:
            r15 = 1
            r3 = 0
        L_0x032e:
            r0 = r17
            X.7Fe[] r2 = r0.A00     // Catch:{ all -> 0x047e }
            int r0 = r2.length     // Catch:{ all -> 0x047e }
            if (r3 >= r0) goto L_0x0354
            X.7Fe r1 = r4.A00     // Catch:{ all -> 0x047e }
            java.lang.String r14 = r1.A01     // Catch:{ all -> 0x047e }
            r0 = r2[r3]     // Catch:{ all -> 0x047e }
            java.lang.String r0 = r0.A01     // Catch:{ all -> 0x047e }
            boolean r0 = r0.equals(r14)     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x0350
            r0 = r2[r3]     // Catch:{ all -> 0x047e }
            java.lang.String r2 = r0.A00     // Catch:{ all -> 0x047e }
            java.lang.String r0 = r1.A00     // Catch:{ all -> 0x047e }
            boolean r0 = r2.equals(r0)     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x0350
            goto L_0x0353
        L_0x0350:
            int r3 = r3 + 1
            goto L_0x032e
        L_0x0353:
            r15 = 0
        L_0x0354:
            X.7Fe r0 = r4.A00     // Catch:{ all -> 0x047e }
            java.lang.String r1 = r0.A01     // Catch:{ all -> 0x047e }
            java.io.File r0 = X.AnonymousClass002.A0A(r11, r1)     // Catch:{ all -> 0x047e }
            boolean r0 = r0.exists()     // Catch:{ all -> 0x047e }
            if (r0 == 0) goto L_0x0364
            if (r15 == 0) goto L_0x0424
        L_0x0364:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x047e }
            java.lang.String r0 = "extracting DSO "
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r1, r2)     // Catch:{ all -> 0x047e }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x047e }
            boolean r0 = r11.setWritable(r13)     // Catch:{ all -> 0x046b }
            if (r0 == 0) goto L_0x045c
            java.io.File r3 = X.AnonymousClass002.A0A(r11, r1)     // Catch:{ all -> 0x046b }
            r15 = 0
            boolean r0 = r3.exists()     // Catch:{ IOException -> 0x0440 }
            if (r0 == 0) goto L_0x0395
            boolean r0 = r3.setWritable(r13)     // Catch:{ IOException -> 0x0440 }
            if (r0 != 0) goto L_0x0395
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0440 }
            java.lang.String r0 = "error adding write permission to: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ IOException -> 0x0440 }
            android.util.Log.w(r8, r0)     // Catch:{ IOException -> 0x0440 }
        L_0x0395:
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x039d }
            r0 = r27
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x039d }
            goto L_0x03bd
        L_0x039d:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0440 }
            java.lang.String r0 = "error overwriting "
            r1.append(r0)     // Catch:{ IOException -> 0x0440 }
            r1.append(r3)     // Catch:{ IOException -> 0x0440 }
            java.lang.String r0 = " trying to delete and start over"
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ IOException -> 0x0440 }
            android.util.Log.w(r8, r0, r2)     // Catch:{ IOException -> 0x0440 }
            X.C159237lU.A00(r3)     // Catch:{ IOException -> 0x0440 }
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch:{ IOException -> 0x0440 }
            r0 = r27
            r1.<init>(r3, r0)     // Catch:{ IOException -> 0x0440 }
        L_0x03bd:
            r15 = r1
            java.io.InputStream r0 = r4.A01     // Catch:{ IOException -> 0x0440 }
            r29 = r0
            int r0 = r29.available()     // Catch:{ IOException -> 0x0440 }
            if (r0 <= r13) goto L_0x03d0
            java.io.FileDescriptor r2 = r1.getFD()     // Catch:{ IOException -> 0x0440 }
            long r0 = (long) r0     // Catch:{ IOException -> 0x0440 }
            com.facebook.soloader.SysUtil$LollipopSysdeps.fallocateIfSupported(r2, r0)     // Catch:{ IOException -> 0x0440 }
        L_0x03d0:
            r16 = 2147483647(0x7fffffff, float:NaN)
            r14 = 0
        L_0x03d4:
            int r1 = r16 - r14
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ IOException -> 0x0440 }
            r2 = r29
            r1 = r32
            int r1 = r2.read(r1, r9, r0)     // Catch:{ IOException -> 0x0440 }
            r0 = -1
            if (r1 == r0) goto L_0x03f3
            r0 = r32
            r15.write(r0, r9, r1)     // Catch:{ IOException -> 0x0440 }
            int r14 = r14 + r1
            r0 = r16
            if (r14 >= r0) goto L_0x03f3
            goto L_0x03d4
        L_0x03f3:
            long r0 = r15.getFilePointer()     // Catch:{ IOException -> 0x0440 }
            r15.setLength(r0)     // Catch:{ IOException -> 0x0440 }
            boolean r0 = r3.setExecutable(r13, r9)     // Catch:{ IOException -> 0x0440 }
            if (r0 == 0) goto L_0x0431
            boolean r0 = r3.setWritable(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0410
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r23)     // Catch:{ all -> 0x046b }
            r0.append(r3)     // Catch:{ all -> 0x046b }
            X.AnonymousClass000.A1F(r10, r8, r0)     // Catch:{ all -> 0x046b }
        L_0x0410:
            r15.close()     // Catch:{ all -> 0x046b }
            boolean r0 = r11.setWritable(r9)     // Catch:{ all -> 0x047e }
            if (r0 != 0) goto L_0x0424
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)     // Catch:{ all -> 0x047e }
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x047e }
            X.AnonymousClass6C7.A1F(r0, r10, r8, r1)     // Catch:{ all -> 0x047e }
        L_0x0424:
            r4.close()     // Catch:{ all -> 0x052f }
            goto L_0x02ca
        L_0x0429:
            r0 = move-exception
            if (r1 == 0) goto L_0x052e
            r1.close()     // Catch:{ all -> 0x052f }
            goto L_0x052e
        L_0x0431:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IOException -> 0x0440 }
            java.lang.String r0 = "cannot make file executable: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r3, r0, r1)     // Catch:{ IOException -> 0x0440 }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ IOException -> 0x0440 }
            throw r0     // Catch:{ IOException -> 0x0440 }
        L_0x0440:
            r0 = move-exception
            X.C159237lU.A00(r3)     // Catch:{ all -> 0x0445 }
            throw r0     // Catch:{ all -> 0x0445 }
        L_0x0445:
            r1 = move-exception
            boolean r0 = r3.setWritable(r9)     // Catch:{ all -> 0x046b }
            if (r0 != 0) goto L_0x0456
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r23)     // Catch:{ all -> 0x046b }
            r0.append(r3)     // Catch:{ all -> 0x046b }
            X.AnonymousClass000.A1F(r10, r8, r0)     // Catch:{ all -> 0x046b }
        L_0x0456:
            if (r15 == 0) goto L_0x045b
            r15.close()     // Catch:{ all -> 0x046b }
        L_0x045b:
            throw r1     // Catch:{ all -> 0x046b }
        L_0x045c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x046b }
            java.lang.String r0 = "cannot make directory writable for us: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)     // Catch:{ all -> 0x046b }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x046b }
            throw r0     // Catch:{ all -> 0x046b }
        L_0x046b:
            r2 = move-exception
            boolean r0 = r11.setWritable(r9)     // Catch:{ all -> 0x047e }
            if (r0 != 0) goto L_0x047d
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)     // Catch:{ all -> 0x047e }
            java.lang.String r0 = r11.getCanonicalPath()     // Catch:{ all -> 0x047e }
            X.AnonymousClass6C7.A1F(r0, r10, r8, r1)     // Catch:{ all -> 0x047e }
        L_0x047d:
            throw r2     // Catch:{ all -> 0x047e }
        L_0x047e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0483 }
            goto L_0x0487
        L_0x0483:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x052f }
        L_0x0487:
            throw r1     // Catch:{ all -> 0x052f }
        L_0x0488:
            r18.close()     // Catch:{ all -> 0x0539 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0539 }
            java.lang.String r0 = "Finished regenerating DSO store "
            r1.append(r0)     // Catch:{ all -> 0x0539 }
            r0 = r19
            X.AnonymousClass000.A1E(r0, r8, r1)     // Catch:{ all -> 0x0539 }
            r6.close()     // Catch:{ all -> 0x0545 }
        L_0x049c:
            r26.close()     // Catch:{ all -> 0x0554 }
            if (r7 != 0) goto L_0x04af
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0554 }
            java.lang.String r0 = "dso store is up-to-date: "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)     // Catch:{ all -> 0x0554 }
            android.util.Log.i(r8, r0)     // Catch:{ all -> 0x0554 }
            goto L_0x04ea
        L_0x04af:
            r0 = r42 & 4
            if (r0 != 0) goto L_0x04ec
            java.lang.Boolean r39 = java.lang.Boolean.FALSE     // Catch:{ all -> 0x0554 }
            X.3cV r2 = new X.3cV     // Catch:{ all -> 0x0554 }
            r32 = r2
            r33 = r12
            r34 = r25
            r35 = r31
            r36 = r7
            r37 = r28
            r40 = r9
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)     // Catch:{ all -> 0x0554 }
            r0 = r42 & 1
            if (r0 == 0) goto L_0x04e6
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0554 }
            java.lang.String r0 = "SoSync:"
            r1.append(r0)     // Catch:{ all -> 0x0554 }
            java.lang.String r0 = r11.getName()     // Catch:{ all -> 0x0554 }
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0554 }
            java.lang.Thread r0 = new java.lang.Thread     // Catch:{ all -> 0x0554 }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x0554 }
            r0.start()     // Catch:{ all -> 0x0554 }
            goto L_0x04ec
        L_0x04e6:
            r2.run()     // Catch:{ all -> 0x0554 }
            goto L_0x04ec
        L_0x04ea:
            r30 = r38
        L_0x04ec:
            if (r24 != 0) goto L_0x04ff
            boolean r0 = r11.setWritable(r9)
            if (r0 != 0) goto L_0x04ff
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)
            java.lang.String r0 = r11.getCanonicalPath()
            X.AnonymousClass6C7.A1F(r0, r10, r8, r1)
        L_0x04ff:
            if (r30 == 0) goto L_0x050e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r21
            X.AnonymousClass000.A18(r11, r0, r8, r1)
            r30.close()
            return
        L_0x050e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)
            r1.append(r11)
            r0 = r20
            X.AnonymousClass000.A1E(r0, r8, r1)
            return
        L_0x051b:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x052f }
            java.lang.String r0 = "unable to list directory "
            java.lang.String r0 = X.AnonymousClass000.A0P(r11, r0, r1)     // Catch:{ all -> 0x052f }
            java.io.IOException r0 = X.AnonymousClass002.A0C(r0)     // Catch:{ all -> 0x052f }
            goto L_0x052e
        L_0x052a:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x052f }
        L_0x052e:
            throw r0     // Catch:{ all -> 0x052f }
        L_0x052f:
            r1 = move-exception
            r18.close()     // Catch:{ all -> 0x0534 }
            goto L_0x0538
        L_0x0534:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0539 }
        L_0x0538:
            throw r1     // Catch:{ all -> 0x0539 }
        L_0x0539:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x053b }
        L_0x053b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0540 }
            goto L_0x0544
        L_0x0540:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0545 }
        L_0x0544:
            throw r1     // Catch:{ all -> 0x0545 }
        L_0x0545:
            r1 = move-exception
            r26.close()     // Catch:{ all -> 0x054f }
            goto L_0x0553
        L_0x054a:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x054f }
            goto L_0x0553
        L_0x054f:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0554 }
        L_0x0553:
            throw r1     // Catch:{ all -> 0x0554 }
        L_0x0554:
            r2 = move-exception
            r30 = r38
            goto L_0x0559
        L_0x0558:
            r2 = move-exception
        L_0x0559:
            if (r24 != 0) goto L_0x056c
            boolean r0 = r11.setWritable(r9)
            if (r0 != 0) goto L_0x056c
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r23)
            java.lang.String r0 = r11.getCanonicalPath()
            X.AnonymousClass6C7.A1F(r0, r10, r8, r1)
        L_0x056c:
            if (r30 == 0) goto L_0x057b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            r0 = r21
            X.AnonymousClass000.A18(r11, r0, r8, r1)
            r30.close()
            throw r2
        L_0x057b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r22)
            r1.append(r11)
            r0 = r20
            X.AnonymousClass000.A1E(r0, r8, r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NP.A03(int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass6NP(android.content.Context r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            java.lang.String r0 = r0.dataDir
            r1.append(r0)
            java.lang.String r0 = "/"
            java.lang.String r0 = X.AnonymousClass000.A0V(r0, r5, r1)
            java.io.File r2 = X.AnonymousClass002.A0B(r0)
            r1 = 1
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            r3.<init>(r2, r0, r1)
            java.util.HashMap r0 = X.AnonymousClass001.A0t()
            r3.A04 = r0
            r3.A03 = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6NP.<init>(android.content.Context, java.lang.String):void");
    }
}
