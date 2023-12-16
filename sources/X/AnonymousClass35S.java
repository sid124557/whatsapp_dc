package X;

import android.content.ContentValues;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.util.Base64;
import android.util.JsonReader;
import com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.crypto.AEADBadTagException;
import javax.crypto.Cipher;
import javax.crypto.CipherOutputStream;

/* renamed from: X.35S  reason: invalid class name */
public class AnonymousClass35S {
    public static final int A0E = 1000;
    public static final int A0F = 131072;
    public static final String A0G = "import/complete/all";
    public static final String A0H = "import/complete/enc_metadata";
    public static final String A0I = "import/complete/file_list";
    public static final String A0J = "import/complete/files";
    public static final String A0K = "import/metadata/data_id";
    public static final String A0L = "import/metadata/key";
    public static final String A0M = "import/metadata/key-jid";
    public static final String A0N = "import/metadata/key/account_hash";
    public static final String A0O = "import/metadata/key/proto_version";
    public static final String A0P = "import/metadata/key/server_salt";
    public static final String A0Q = "import/metadata/scheme";
    public static final String A0R = "import/metadata/source_id";
    public static final String A0S = "migration/prefetcher";
    public static final String A0T = "xpm/file-prefetcher";
    public final C55682qk A00;
    public final C56972sr A01;
    public final C54292oU A02;
    public final C55902r6 A03;
    public final C28791hm A04;
    public final C49102fz A05;
    public final C53222mk A06;
    public final C44432Wa A07;
    public final C44442Wb A08;
    public final C59662xH A09;
    public final C44452Wc A0A;
    public final C619032s A0B;
    public final C183538qC A0C;
    public final AtomicBoolean A0D = C18280x3.A0l();

    private OutputStream A00(OutputStream outputStream, String str, String str2) {
        if (str2 == null) {
            return outputStream;
        }
        String A002 = this.A06.A00(A0L);
        if (A002 != null) {
            byte[] decode = Base64.decode(A002, 2);
            byte[] decode2 = Base64.decode(str2, 2);
            try {
                Cipher A0v = C18320x8.A0v();
                A0v.init(2, C18300x5.A0y(decode), C18330xA.A0D(decode2));
                return new CipherOutputStream(outputStream, A0v);
            } catch (GeneralSecurityException e) {
                throw new C36811zv(AnonymousClass000.A0V("Failed to decrypt: ", str, AnonymousClass001.A0o()), e, 105);
            }
        } else {
            throw AnonymousClass002.A0C("Cannot create decryption stream due to a missing key.");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0157, code lost:
        if (r2 == null) goto L_0x016b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02(android.os.CancellationSignal r23, byte[] r24) {
        /*
            r22 = this;
            r8 = r22
            X.2Wa r0 = r8.A07
            X.2fz r0 = r0.A00
            X.4GK r4 = r0.A00()
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x019e }
            X.2sg r2 = r0.A03     // Catch:{ all -> 0x019e }
            java.lang.String r1 = "SELECT COUNT(*) as count FROM prefetched_files"
            java.lang.String r0 = "XPM_FILE_PREFETCHER_FILE_COUNT"
            android.database.Cursor r2 = X.C56862sg.A01(r2, r1, r0)     // Catch:{ all -> 0x019e }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0192 }
            if (r0 == 0) goto L_0x0022
            int r3 = X.AnonymousClass0x2.A03(r2)     // Catch:{ all -> 0x0192 }
            goto L_0x0023
        L_0x0022:
            r3 = 0
        L_0x0023:
            r2.close()     // Catch:{ all -> 0x019e }
            r4.close()
            X.2Wa r0 = r8.A07
            int r2 = r0.A00()
            int r4 = r3 - r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); pending="
            r1.append(r0)
            r1.append(r2)
            java.lang.String r0 = ", moved="
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = ", total="
            X.C18260x0.A0y(r0, r1, r3)
            X.2r6 r0 = r8.A03     // Catch:{ OperationCanceledException -> 0x0176 }
            X.3Yn r15 = r0.A02()     // Catch:{ OperationCanceledException -> 0x0176 }
            X.2Wa r0 = r8.A07     // Catch:{ all -> 0x016c }
            r1 = 1000(0x3e8, float:1.401E-42)
            X.2fz r0 = r0.A00     // Catch:{ all -> 0x016c }
            X.4GK r7 = r0.A00()     // Catch:{ all -> 0x016c }
            r0 = r7
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0162 }
            X.2sg r6 = r0.A03     // Catch:{ all -> 0x0162 }
            java.lang.String r5 = "SELECT   file._id, file.remote_file_path, file.file_size, file.required,  enc.enc_iv FROM prefetched_files AS file LEFT JOIN encrypted_files AS enc ON file.remote_file_path =   enc.remote_file_path WHERE file.prefetched = 0 ORDER BY   file.required DESC , file._id ASC  LIMIT ?"
            java.lang.String[] r2 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x0162 }
            long r0 = (long) r1     // Catch:{ all -> 0x0162 }
            X.C18260x0.A1Y(r2, r0)     // Catch:{ all -> 0x0162 }
            java.lang.String r0 = "XPM_FILE_PREFETCHER_PENDING"
            android.database.Cursor r2 = r6.A0E(r5, r0, r2)     // Catch:{ all -> 0x0162 }
            r7.close()     // Catch:{ all -> 0x016c }
            java.lang.String r0 = "remote_file_path"
            int r7 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "enc_iv"
            int r6 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "required"
            int r5 = r2.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x0156 }
            X.1hm r0 = r8.A04     // Catch:{ all -> 0x0156 }
            java.util.Iterator r9 = X.C61102zi.A03(r0)     // Catch:{ all -> 0x0156 }
        L_0x008d:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0156 }
            X.2HB r0 = (X.AnonymousClass2HB) r0     // Catch:{ all -> 0x0156 }
            X.32m r1 = r0.A00     // Catch:{ all -> 0x0156 }
            r0 = 0
            r1.A01(r0, r4, r3)     // Catch:{ all -> 0x0156 }
            goto L_0x008d
        L_0x00a0:
            r14 = 0
        L_0x00a1:
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x014f
            r9 = r23
            r9.throwIfCanceled()     // Catch:{ all -> 0x0156 }
            java.lang.String r11 = r2.getString(r7)     // Catch:{ all -> 0x0156 }
            java.lang.String r1 = r2.getString(r6)     // Catch:{ all -> 0x0156 }
            int r0 = r2.getInt(r5)     // Catch:{ all -> 0x0156 }
            boolean r13 = X.AnonymousClass000.A1S(r0)
            r0 = r24
            r8.A0H(r9, r11, r1, r0)     // Catch:{ OperationCanceledException -> 0x014d, all -> 0x00cc }
            int r4 = r4 + 1
            X.2Wb r1 = r8.A08     // Catch:{ OperationCanceledException -> 0x014d, all -> 0x00cc }
            java.lang.String r0 = "prefetched/file/success"
            X.C44442Wb.A01(r1, r0)     // Catch:{ OperationCanceledException -> 0x014d, all -> 0x00cc }
            goto L_0x0120
        L_0x00cc:
            r12 = move-exception
            int r14 = r14 + 1
            X.2Wb r1 = r8.A08     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "prefetched/file/failed"
            X.C44442Wb.A01(r1, r0)     // Catch:{ all -> 0x0156 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0156 }
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); failed to import file "
            X.C18260x0.A0u(r0, r11, r1, r12)     // Catch:{ all -> 0x0156 }
            X.2qk r10 = r8.A00     // Catch:{ all -> 0x0156 }
            java.lang.String r9 = "xpm-file-prefetcher-import-failed"
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r11)     // Catch:{ all -> 0x014b }
            java.lang.String r0 = ", "
            java.lang.String r0 = X.AnonymousClass000.A0P(r12, r0, r1)     // Catch:{ all -> 0x014b }
            r10.A09(r9, r0, r12)     // Catch:{ all -> 0x014b }
            A03(r11, r12)     // Catch:{ all -> 0x014b }
            if (r13 != 0) goto L_0x0145
            X.2Wa r0 = r8.A07     // Catch:{ all -> 0x014b }
            X.2fz r0 = r0.A00     // Catch:{ all -> 0x014b }
            X.4Fq r9 = r0.A01()     // Catch:{ all -> 0x014b }
            android.content.ContentValues r10 = X.AnonymousClass0x9.A06()     // Catch:{ all -> 0x013b }
            java.lang.String r1 = "prefetched"
            r0 = -1
            X.2sg r16 = X.AnonymousClass3H0.A01(r10, r9, r1, r0)     // Catch:{ all -> 0x013b }
            java.lang.String r18 = "prefetched_files"
            java.lang.String r19 = "remote_file_path = ?"
            java.lang.String[] r21 = X.C18270x1.A1b(r11)     // Catch:{ all -> 0x013b }
            java.lang.String r20 = "XPM_FILE_PREFETCHER_MARK_FILE_FAILED"
            r17 = r10
            r16.A05(r17, r18, r19, r20, r21)     // Catch:{ all -> 0x013b }
            r9.close()     // Catch:{ all -> 0x014b }
        L_0x0120:
            X.1hm r0 = r8.A04     // Catch:{ all -> 0x0156 }
            int r10 = r14 + r4
            java.util.Iterator r9 = X.C61102zi.A03(r0)     // Catch:{ all -> 0x0156 }
        L_0x0128:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0156 }
            if (r0 == 0) goto L_0x00a1
            java.lang.Object r0 = r9.next()     // Catch:{ all -> 0x0156 }
            X.2HB r0 = (X.AnonymousClass2HB) r0     // Catch:{ all -> 0x0156 }
            X.32m r1 = r0.A00     // Catch:{ all -> 0x0156 }
            r0 = 0
            r1.A01(r0, r10, r3)     // Catch:{ all -> 0x0156 }
            goto L_0x0128
        L_0x013b:
            r1 = move-exception
            r9.close()     // Catch:{ all -> 0x0140 }
            goto L_0x0144
        L_0x0140:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x014b }
        L_0x0144:
            throw r1     // Catch:{ all -> 0x014b }
        L_0x0145:
            X.1zv r0 = new X.1zv     // Catch:{ all -> 0x014b }
            r0.<init>(r12)     // Catch:{ all -> 0x014b }
            throw r0     // Catch:{ all -> 0x014b }
        L_0x014b:
            r1 = move-exception
            goto L_0x0159
        L_0x014d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x0156 }
        L_0x014f:
            r2.close()     // Catch:{ all -> 0x016c }
            r15.close()     // Catch:{ OperationCanceledException -> 0x0176 }
            return
        L_0x0156:
            r1 = move-exception
            if (r2 == 0) goto L_0x016b
        L_0x0159:
            r2.close()     // Catch:{ all -> 0x015d }
            goto L_0x016b
        L_0x015d:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016c }
            goto L_0x016b
        L_0x0162:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x016c }
        L_0x016b:
            throw r1     // Catch:{ all -> 0x016c }
        L_0x016c:
            r1 = move-exception
            r15.close()     // Catch:{ all -> 0x0171 }
            goto L_0x0175
        L_0x0171:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x0176 }
        L_0x0175:
            throw r1     // Catch:{ OperationCanceledException -> 0x0176 }
        L_0x0176:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "xpm/file-prefetcher/importFilesNextBatch(); cancelled after "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = "/"
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = " has been imported."
            X.C18260x0.A1L(r1, r0)
            throw r2
        L_0x0192:
            r1 = move-exception
            if (r2 == 0) goto L_0x019d
            r2.close()     // Catch:{ all -> 0x0199 }
            goto L_0x019d
        L_0x0199:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x019e }
        L_0x019d:
            throw r1     // Catch:{ all -> 0x019e }
        L_0x019e:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x01a3 }
            throw r1
        L_0x01a3:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35S.A02(android.os.CancellationSignal, byte[]):void");
    }

    public File A04() {
        return AnonymousClass002.A0A(C54292oU.A03(this.A02), A0S);
    }

    public File A06(String str) {
        Cursor A0E2;
        FileNotFoundException fileNotFoundException;
        C44432Wa r0 = this.A07;
        C626936e.A06(str);
        AnonymousClass4GK A002 = r0.A00.A00();
        try {
            boolean z = true;
            A0E2 = ((AnonymousClass3H0) A002).A03.A0E("SELECT prefetched_file_path, prefetched FROM prefetched_files WHERE remote_file_path = ?", "XPM_FILE_PREFETCHER_GET_PREFETCHED_PATH", C18300x5.A1a(str, 1));
            if (!A0E2.moveToFirst()) {
                fileNotFoundException = C18330xA.A05(AnonymousClass000.A0V("Unknown remote file: ", str, AnonymousClass001.A0o()));
            } else if (A0E2.getCount() <= 1) {
                int columnIndexOrThrow = A0E2.getColumnIndexOrThrow("prefetched");
                int columnIndexOrThrow2 = A0E2.getColumnIndexOrThrow("prefetched_file_path");
                long j = A0E2.getLong(columnIndexOrThrow);
                boolean A1T = AnonymousClass000.A1T((j > -1 ? 1 : (j == -1 ? 0 : -1)));
                if (j != 1) {
                    z = false;
                }
                String string = A0E2.getString(columnIndexOrThrow2);
                if (!z || TextUtils.isEmpty(string)) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("File was not prefetched: ");
                    A0o.append(str);
                    fileNotFoundException = C18330xA.A05(AnonymousClass000.A0b(", prefetch failed: ", A0o, A1T));
                } else {
                    File A0B2 = AnonymousClass002.A0B(string);
                    A0E2.close();
                    A002.close();
                    if (A0B2.exists()) {
                        return A0B2;
                    }
                    throw C18330xA.A05(AnonymousClass000.A0V("Not found in file prefetcher sandbox: ", str, AnonymousClass001.A0o()));
                }
            } else {
                StringBuilder A0o2 = AnonymousClass001.A0o();
                fileNotFoundException = C18330xA.A05(AnonymousClass000.A0h(A0o2, AnonymousClass0x9.A02(A0E2, "Multiple prefetched files match: ", A0o2)));
            }
            throw fileNotFoundException;
        } catch (Throwable th) {
            try {
                A002.close();
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
        throw th;
    }

    public void A07() {
        this.A06.A02(A0G);
    }

    public void A08() {
        this.A0D.get();
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void A09() {
        /*
            r6 = this;
            X.2mk r5 = r6.A06
            monitor-enter(r5)
            r0 = 0
            r5.A00 = r0     // Catch:{ all -> 0x0055 }
            X.2Wa r0 = r5.A04     // Catch:{ all -> 0x0055 }
            X.2fz r0 = r0.A00     // Catch:{ all -> 0x0055 }
            X.4Fq r4 = r0.A01()     // Catch:{ all -> 0x0055 }
            r0 = r4
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x004b }
            X.2sg r3 = r0.A03     // Catch:{ all -> 0x004b }
            java.lang.String r2 = "properties"
            java.lang.String r0 = "XPM_DELETE_ALL_PROPERTIES"
            r1 = 0
            r3.A07(r2, r1, r0, r1)     // Catch:{ all -> 0x004b }
            r4.close()     // Catch:{ all -> 0x0055 }
            monitor-exit(r5)
            X.2fz r2 = r6.A05
            monitor-enter(r2)
            monitor-enter(r2)     // Catch:{ all -> 0x0048 }
            X.1R6 r0 = r2.A00     // Catch:{ all -> 0x0045 }
            if (r0 == 0) goto L_0x002d
            r0.close()     // Catch:{ all -> 0x0045 }
            r2.A00 = r1     // Catch:{ all -> 0x0045 }
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            android.content.Context r1 = r2.A01     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "migration_prefetcher.db"
            r1.deleteDatabase(r0)     // Catch:{ all -> 0x0048 }
            java.lang.String r0 = "FilePrefetcher/removeDatabase/deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0048 }
            monitor-exit(r2)
            java.io.File r1 = r6.A04()
            r0 = 0
            X.C627536m.A0G(r1, r0)
            return
        L_0x0045:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0048 }
            throw r0     // Catch:{ all -> 0x0048 }
        L_0x0048:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x004b:
            r1 = move-exception
            r4.close()     // Catch:{ all -> 0x0050 }
            goto L_0x0054
        L_0x0050:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0055 }
        L_0x0054:
            throw r1     // Catch:{ all -> 0x0055 }
        L_0x0055:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass35S.A09():void");
    }

    public void A0B(CancellationSignal cancellationSignal) {
        if (this.A06.A02(A0J)) {
            Log.i("xpm/file-prefetcher/importAllFiles(); file were already imported, skipping.");
            return;
        }
        byte[] bArr = new byte[A0F];
        while (this.A07.A00() > 0) {
            cancellationSignal.throwIfCanceled();
            A02(cancellationSignal, bArr);
        }
        this.A06.A01(A0J, Boolean.toString(true));
    }

    public void A0D(CancellationSignal cancellationSignal) {
        C32481qh A012;
        C85284Fq A013;
        Log.i("xpm/file-prefetcher/importFileList(); ");
        C85284Fq A014 = this.A07.A00.A01();
        try {
            C69833Yo Axl = A014.Axl();
            try {
                if (this.A06.A02(A0I)) {
                    Log.i("xpm/file-prefetcher/importFileList(); file list was already imported, skipping.");
                    Axl.close();
                    A014.close();
                    return;
                }
                C55902r6 r4 = this.A03;
                Log.d("GoogleMigrateClient/getAvailableFiles()");
                try {
                    A012 = r4.A01();
                    ParcelFileDescriptor B7e = ((IAppDataReaderService) A012.A00()).B7e();
                    AnonymousClass1gY r42 = new AnonymousClass1gY(B7e, new JsonReader(new BufferedReader(new FileReader(B7e.getFileDescriptor()))), (C619032s) r4.A06.A00.A01.AMw.get());
                    A012.close();
                    int i = 0;
                    while (r42.A01()) {
                        try {
                            cancellationSignal.throwIfCanceled();
                            C51842kT r1 = (C51842kT) r42.A00();
                            C44432Wa r2 = this.A07;
                            ContentValues A062 = AnonymousClass0x9.A06();
                            String str = r1.A01;
                            A062.put("remote_file_path", str);
                            A062.put("file_size", Long.valueOf(r1.A00));
                            A062.putNull("prefetched_file_path");
                            A062.put("required", 0);
                            A062.put("prefetched", 0);
                            A013 = r2.A00.A01();
                            long A082 = ((AnonymousClass3H0) A013).A03.A08("prefetched_files", "XPM_FILE_PREFETCHER_INSERT_FILE", A062);
                            A013.close();
                            if (A082 < 0) {
                                C18260x0.A0r("xpm/file-prefetcher/importFileList(); failed to import metadata for ", str, AnonymousClass001.A0o());
                                this.A00.A0A("xpm-file-prefetcher-cannot-add-metadata", false, str);
                            } else {
                                i++;
                            }
                        } catch (Throwable th) {
                            r42.close();
                            throw th;
                        }
                    }
                    r42.close();
                    this.A06.A01(A0I, Boolean.toString(true));
                    Axl.A00();
                    Axl.close();
                    StringBuilder A0f = C18280x3.A0f(A014);
                    A0f.append("xpm/file-prefetcher/importFileList(); imported ");
                    A0f.append(i);
                    C18260x0.A1L(A0f, " entries.");
                    return;
                } catch (Exception e) {
                    throw new IOException(e);
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
                throw th;
            } catch (Throwable th3) {
                Axl.close();
                throw th3;
            }
        } catch (Throwable th4) {
            try {
                A014.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }

    public void A0E(CancellationSignal cancellationSignal) {
        if (!this.A0D.getAndSet(true)) {
            try {
                A0F(cancellationSignal);
            } finally {
                this.A0D.set(false);
            }
        } else {
            Log.e("xpm/file-prefetcher/prefetchAllFiles()concurrent prefetch requested, not supported");
            throw AnonymousClass001.A0e("Multiple concurrent operations are not supported.");
        }
    }

    public void A0I(String str) {
        C85284Fq A012 = this.A07.A00.A01();
        try {
            ContentValues A062 = AnonymousClass0x9.A06();
            int A052 = AnonymousClass3H0.A01(A062, A012, "required", 1).A05(A062, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_REQUIRED", C18300x5.A1a(str, 1));
            A012.close();
            if (A052 <= 0) {
                throw new C36811zv(200, AnonymousClass000.A0X(" is not present in remote sandbox.", AnonymousClass000.A0l(str)));
            }
        } catch (Throwable th) {
            th.addSuppressed(th);
            throw th;
        }
    }

    public boolean A0J() {
        try {
            ParcelFileDescriptor A002 = this.A03.A00("migration/enc.zip");
            if (A002 == null) {
                return true;
            }
            A002.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public AnonymousClass35S(C55682qk r2, C56972sr r3, C54292oU r4, C59662xH r5, C44452Wc r6, C44442Wb r7, C619032s r8, C183538qC r9, C44432Wa r10, C55902r6 r11, C28791hm r12, C49102fz r13, C53222mk r14) {
        this.A00 = r2;
        this.A01 = r3;
        this.A02 = r4;
        this.A08 = r7;
        this.A09 = r5;
        this.A0A = r6;
        this.A0C = r9;
        this.A0B = r8;
        this.A03 = r11;
        this.A07 = r10;
        this.A04 = r12;
        this.A05 = r13;
        this.A06 = r14;
    }

    private void A01() {
        A0I("migration/messages_export.zip");
    }

    public static void A03(String str, Throwable th) {
        Throwable cause = th.getCause();
        if (cause instanceof AEADBadTagException) {
            throw new C36811zv(AnonymousClass000.A0V("Failed to decrypt: ", str, AnonymousClass001.A0o()), cause, 104);
        }
    }

    public File A05(String str) {
        File canonicalFile = A04().getCanonicalFile();
        File canonicalFile2 = AnonymousClass002.A0A(canonicalFile, str).getCanonicalFile();
        for (File parentFile = canonicalFile2.getParentFile(); parentFile != null; parentFile = parentFile.getParentFile()) {
            if (canonicalFile.equals(parentFile)) {
                return canonicalFile2;
            }
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("Remote path '");
        A0o.append(str);
        A0o.append("' escaped prefetch sandbox: '");
        A0o.append(canonicalFile2);
        throw new SecurityException(AnonymousClass000.A0X("'", A0o));
    }

    public void A0A(CancellationSignal cancellationSignal) {
        String str;
        Log.i("xpm/file-prefetcher/importEncryptionKey(); ");
        PhoneUserJid A042 = C56972sr.A04(this.A01);
        if (A042 != null) {
            String rawString = A042.getRawString();
            String A002 = this.A06.A00(A0M);
            if (!rawString.equals(A002)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("xpm/file-prefetcher/importEncryptionKey(); key was cached for a different jid, removing (old jid: ");
                A0o.append(A002);
                C18260x0.A1L(A0o, ") ");
                this.A09.A04.A00.clear();
                this.A06.A01(A0M, (String) null);
                this.A06.A01(A0L, (String) null);
            }
            if (this.A06.A00(A0L) != null) {
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key has already been fetched from the server, skipping.";
            } else {
                String A003 = this.A06.A00(A0O);
                String A004 = this.A06.A00(A0N);
                String A005 = this.A06.A00(A0P);
                if (A003 == null || A004 == null || A005 == null) {
                    StringBuilder A0o2 = AnonymousClass001.A0o();
                    C18260x0.A0p("Missing key identifier: version=", A003, ", account_hash=", A004, A0o2);
                    throw new C36801zu(AnonymousClass000.A0V(", server_salt=", A005, A0o2));
                }
                StringBuilder A0o3 = AnonymousClass001.A0o();
                C18260x0.A0p("xpm/file-prefetcher/importEncryptionKey(); key, version=", A003, ", account_hash=", A004, A0o3);
                C18260x0.A0s(", server_salt=", A005, A0o3);
                AnonymousClass2SN A012 = this.A09.A01(cancellationSignal, A003, A004, A005);
                this.A06.A01(A0L, A012.A03);
                this.A06.A01(A0M, A012.A01.getRawString());
                str = "xpm/file-prefetcher/importEncryptionKey(); encryption key imported successfully";
            }
            Log.i(str);
            return;
        }
        throw new C36811zv(301, "Cannot identify current logged in user.");
    }

    public void A0C(CancellationSignal cancellationSignal) {
        C36811zv th;
        Throwable th2;
        C36811zv r2;
        ZipInputStream zipInputStream;
        ZipEntry nextEntry;
        C85284Fq A012;
        Log.i("xpm/file-prefetcher/importEncryptionMetadata(); ");
        PhoneUserJid A042 = C56972sr.A04(this.A01);
        if (A042 != null) {
            try {
                String A0V = C18270x1.A0V(AnonymousClass0x7.A0t(), A042.user.getBytes(AnonymousClass79T.A05));
                C69823Yn A022 = this.A03.A02();
                try {
                    C85284Fq A013 = this.A07.A00.A01();
                    try {
                        C69833Yo Axl = A013.Axl();
                        try {
                            int i = 0;
                            if (this.A06.A02(A0H)) {
                                Log.i("xpm/file-prefetcher/importEncryptionMetadata(); encryption metadata is already imported, skipping.");
                                Axl.close();
                                A013.close();
                                A022.close();
                                return;
                            } else if (A0J()) {
                                ParcelFileDescriptor A002 = this.A03.A00("migration/enc.zip");
                                try {
                                    FileInputStream fileInputStream = new FileInputStream(A002.getFileDescriptor());
                                    try {
                                        C59552x6 A003 = this.A0A.A00(fileInputStream);
                                        String str = A003.A03;
                                        if (str == null || str.equals(A0V)) {
                                            String str2 = A003.A02;
                                            if (str2.equals("AES-GCM-v1")) {
                                                this.A06.A01(A0Q, str2);
                                                this.A06.A01(A0K, A003.A01);
                                                this.A06.A01(A0R, str);
                                                C53222mk r22 = this.A06;
                                                C45352Zs r4 = A003.A00;
                                                r22.A01(A0O, r4.A02);
                                                this.A06.A01(A0N, r4.A00);
                                                this.A06.A01(A0P, r4.A01);
                                                fileInputStream.close();
                                                A002.close();
                                                A002 = this.A03.A00("migration/enc.zip");
                                                FileInputStream fileInputStream2 = new FileInputStream(A002.getFileDescriptor());
                                                try {
                                                    C44452Wc r3 = this.A0A;
                                                    zipInputStream = new ZipInputStream(fileInputStream2);
                                                    do {
                                                        nextEntry = zipInputStream.getNextEntry();
                                                        if (nextEntry == null) {
                                                            throw C18330xA.A05("metadata.json was not found in zip file.");
                                                        }
                                                    } while (!"metadata.json".equals(nextEntry.getName()));
                                                    C28271gZ r6 = new C28271gZ(C18300x5.A0D(zipInputStream), r3.A00, zipInputStream);
                                                    while (r6.A01()) {
                                                        try {
                                                            cancellationSignal.throwIfCanceled();
                                                            AnonymousClass2YU r32 = (AnonymousClass2YU) r6.A00();
                                                            C44432Wa r23 = this.A07;
                                                            ContentValues A062 = AnonymousClass0x9.A06();
                                                            A062.put("remote_file_path", r32.A01);
                                                            A062.put("enc_iv", r32.A00);
                                                            A012 = r23.A00.A01();
                                                            ((AnonymousClass3H0) A012).A03.A08("encrypted_files", "XPM_FILE_PREFETCHER_INSERT_ENC_INFO", A062);
                                                            A012.close();
                                                            i++;
                                                        } catch (Throwable th3) {
                                                            r6.close();
                                                            throw th3;
                                                        }
                                                    }
                                                    r6.close();
                                                    fileInputStream2.close();
                                                    A002.close();
                                                    this.A06.A01(A0H, Boolean.toString(true));
                                                    Axl.A00();
                                                    Axl.close();
                                                    A013.close();
                                                    A022.close();
                                                    StringBuilder A0o = AnonymousClass001.A0o();
                                                    A0o.append("xpm/file-prefetcher/importEncryptionMetadata(); imported ");
                                                    A0o.append(i);
                                                    C18260x0.A1L(A0o, " encrypted file metadata entries.");
                                                    return;
                                                } catch (Throwable th4) {
                                                    th2 = th4;
                                                    fileInputStream2.close();
                                                    throw th2;
                                                }
                                            } else {
                                                r2 = new C36811zv(100, AnonymousClass000.A0V("Unsupported: ", str2, AnonymousClass001.A0o()));
                                            }
                                        } else {
                                            StringBuilder A0o2 = AnonymousClass001.A0o();
                                            A0o2.append("Source id mismatch: current=");
                                            A0o2.append(str);
                                            r2 = new C36811zv(106, AnonymousClass000.A0V(", expected=", A0V, A0o2));
                                        }
                                        throw r2;
                                    } catch (Throwable th5) {
                                        th2.addSuppressed(th5);
                                    }
                                } catch (Throwable th6) {
                                    th = th6;
                                    if (A002 != null) {
                                        try {
                                            A002.close();
                                        } catch (Throwable th7) {
                                            th.addSuppressed(th7);
                                        }
                                    }
                                }
                            } else {
                                th = new C36811zv(200, "Missing encryption metadata: migration/enc.zip");
                                throw th;
                            }
                        } catch (Throwable th8) {
                            Axl.close();
                            throw th8;
                        }
                    } catch (Throwable th9) {
                        A013.close();
                        throw th9;
                    }
                } catch (Throwable th10) {
                    try {
                        A022.close();
                        throw th10;
                    } catch (Throwable th11) {
                        th10.addSuppressed(th11);
                        throw th10;
                    }
                }
            } catch (NoSuchAlgorithmException e) {
                throw new IOException(e);
            }
        } else {
            throw new C36811zv(301, "Cannot identify current logged in user.");
        }
        throw th;
    }

    public void A0F(CancellationSignal cancellationSignal) {
        C69823Yn A022;
        Log.i("xpm/file-prefetcher/prefetchAllFilesLocked()");
        if (this.A06.A02(A0G)) {
            Log.i("xpm/file-prefetcher/prefetchAllFilesLocked() already marked as completed, nothing to do.");
            return;
        }
        try {
            A022 = this.A03.A02();
            if (A0J()) {
                A0C(cancellationSignal);
                A0A(cancellationSignal);
            }
            A0D(cancellationSignal);
            A01();
            A0B(cancellationSignal);
            this.A0C.get();
            this.A03.A03();
            this.A06.A01(A0G, Boolean.toString(true));
            A022.close();
            return;
        } catch (OperationCanceledException e) {
            Log.w("xpm/file-prefetcher/prefetchAllFilesLocked()cancelled");
            throw e;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public void A0G(CancellationSignal cancellationSignal, File file, String str, byte[] bArr) {
        this.A0B.A03(cancellationSignal, A06(str), file, bArr);
    }

    public void A0H(CancellationSignal cancellationSignal, String str, String str2, byte[] bArr) {
        OutputStream A002;
        Parcel obtain;
        Parcel obtain2;
        File A052 = A05(str);
        File parentFile = A052.getParentFile();
        if (parentFile != null) {
            parentFile.mkdirs();
        }
        try {
            ParcelFileDescriptor A003 = this.A03.A00(str);
            try {
                FileInputStream fileInputStream = new FileInputStream(A003.getFileDescriptor());
                try {
                    FileOutputStream A0h = AnonymousClass0x9.A0h(A052);
                    try {
                        A002 = A00(A0h, str, str2);
                        C619032s.A01(cancellationSignal, fileInputStream, A002, bArr);
                        if (A002 != null) {
                            A002.close();
                        }
                        A0h.close();
                        fileInputStream.close();
                        A003.close();
                        C44432Wa r0 = this.A07;
                        String canonicalPath = A052.getCanonicalPath();
                        C85284Fq A012 = r0.A00.A01();
                        try {
                            ContentValues A062 = AnonymousClass0x9.A06();
                            C18270x1.A0b(A062, "prefetched", 1);
                            AnonymousClass3H0.A03(A062, A012, "prefetched_file_path", canonicalPath).A05(A062, "prefetched_files", "remote_file_path = ?", "XPM_FILE_PREFETCHER_MARK_FILE_PREFETCHED", C18300x5.A1a(str, 1));
                            A012.close();
                            this.A0C.get();
                            if (!str.equals("migration/metadata.json")) {
                                C55902r6 r2 = this.A03;
                                C18260x0.A0q("GoogleMigrateClient/deleteRemoteFile(); ", str, AnonymousClass001.A0o());
                                try {
                                    C32481qh A013 = r2.A01();
                                    try {
                                        C10050hB r1 = (C10050hB) ((IAppDataReaderService) A013.A00());
                                        obtain = Parcel.obtain();
                                        obtain2 = Parcel.obtain();
                                        obtain.writeInterfaceToken("com.google.android.apps.pixelmigrate.migrate.ios.appdatareader.IAppDataReaderService");
                                        obtain.writeString(str);
                                        AnonymousClass000.A0w(r1.A00, obtain, obtain2, 3);
                                        obtain2.recycle();
                                        obtain.recycle();
                                        A013.close();
                                        return;
                                    } catch (Throwable th) {
                                        A013.close();
                                        throw th;
                                    }
                                } catch (Exception e) {
                                    throw new IOException(str, e);
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                            } else {
                                return;
                            }
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                            throw th;
                        }
                    } catch (Throwable th4) {
                        A0h.close();
                        throw th4;
                    }
                    throw th;
                } catch (Throwable th5) {
                    fileInputStream.close();
                    throw th5;
                }
            } catch (Throwable th6) {
                if (A003 != null) {
                    A003.close();
                }
                throw th6;
            }
        } catch (OperationCanceledException e2) {
            A052.delete();
            C18260x0.A0s("xpm/file-prefetcher/importFile(); cancelled while importing ", str, AnonymousClass001.A0o());
            throw e2;
        } catch (Throwable th7) {
            th6.addSuppressed(th7);
        }
    }
}
