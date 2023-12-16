package X;

import android.os.CancellationSignal;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.3RA  reason: invalid class name */
public class AnonymousClass3RA implements AnonymousClass4DD {
    public boolean A00;
    public final CancellationSignal A01 = new CancellationSignal();
    public final C56612sH A02;
    public final C57162tC A03;
    public final AnonymousClass1VX A04;
    public final C56022rI A05;
    public final C48152eR A06;
    public final C55362qE A07;
    public final C50592iR A08;
    public final C28901hx A09;
    public final C55112po A0A;
    public final InputStream A0B;
    public final OutputStream A0C;

    public final void A00(AnonymousClass2SO r7) {
        File file = r7.A02;
        if (file.exists()) {
            String str = r7.A04;
            C28321ge r0 = new C28321ge(str.getBytes(C58152un.A0B), A01(), 204);
            OutputStream outputStream = this.A0C;
            CancellationSignal cancellationSignal = this.A01;
            AnonymousClass36H.A02(cancellationSignal, r0, outputStream);
            AnonymousClass36H.A02(cancellationSignal, new C28331gf(file, A01(), 205), outputStream);
        }
    }

    public byte[] A01() {
        AnonymousClass2SN A002 = this.A05.A00();
        if (A002 != null) {
            return AnonymousClass0x7.A1X(A002.A03);
        }
        throw AnonymousClass002.A0C("Failed to initiate encryption, key is missing.");
    }

    public void cancel() {
        this.A01.cancel();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v16, resolved type: java.util.zip.ZipOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v31, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v32, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v33, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v34, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v35, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v36, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v37, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v38, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v39, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v40, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v41, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v42, resolved type: java.io.FileOutputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v43, resolved type: java.io.FileOutputStream} */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x03c0, code lost:
        X.AnonymousClass36H.A02(r2, r6, r4.A0C);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x04ff, code lost:
        r4.A09.A09();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0566, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x05a0, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x05a1, code lost:
        X.AnonymousClass36H.A04(r4.A09, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:255:0x05a6, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x05a0 A[ExcHandler: 24Z | IOException | InterruptedException (r1v0 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:250:0x058f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r31 = this;
            r4 = r31
            X.2po r3 = r4.A0A
            r0 = 9
            r3.A01(r0)
        L_0x0009:
            java.io.InputStream r8 = r4.A0B     // Catch:{ OperationCanceledException -> 0x058a }
            android.os.CancellationSignal r2 = r4.A01     // Catch:{ OperationCanceledException -> 0x058a }
            X.32w r1 = X.AnonymousClass36H.A00(r2, r8)     // Catch:{ OperationCanceledException -> 0x058a }
            int r5 = r1.A01     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 250(0xfa, float:3.5E-43)
            r7 = 0
            r13 = 1
            if (r5 == r0) goto L_0x0505
            r0 = 251(0xfb, float:3.52E-43)
            if (r5 == r0) goto L_0x057b
            switch(r5) {
                case 100: goto L_0x0366;
                case 101: goto L_0x026f;
                case 102: goto L_0x03c7;
                case 103: goto L_0x002b;
                case 104: goto L_0x029c;
                default: goto L_0x0020;
            }     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0020:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "fpm/DonorChatTransferTask/Received unexpected message with type: "
            X.C18260x0.A0x(r0, r1, r5)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x04ff
        L_0x002b:
            X.2iR r9 = r4.A08     // Catch:{ OperationCanceledException -> 0x058a }
            X.2rI r0 = r4.A05     // Catch:{ OperationCanceledException -> 0x058a }
            boolean r11 = r0.A05()     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.File r0 = r9.A02     // Catch:{ OperationCanceledException -> 0x058a }
            if (r0 != 0) goto L_0x01e9
            X.2po r8 = r9.A0I     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 10
            r8.A01(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            X.2sr r0 = r9.A03     // Catch:{ OperationCanceledException -> 0x058a }
            r30 = r0
            com.whatsapp.jid.PhoneUserJid r0 = X.C56972sr.A04(r30)     // Catch:{ OperationCanceledException -> 0x058a }
            if (r0 != 0) goto L_0x006b
            java.lang.String r0 = "fpm/ExportHelper/Temporarily setting me object for export"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x058a }
            X.33p r0 = r9.A06     // Catch:{ OperationCanceledException -> 0x058a }
            android.content.SharedPreferences r1 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "saved_user_before_logout"
            java.lang.String r10 = X.C18280x3.A0Z(r1, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r6 = X.C621333r.A02(r10)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r5 = X.C107195ar.A03(r10)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = ""
            if (r6 != 0) goto L_0x0067
            r6 = r0
        L_0x0067:
            if (r5 != 0) goto L_0x006e
            r5 = r0
            goto L_0x006e
        L_0x006b:
            r18 = 0
            goto L_0x0086
        L_0x006e:
            com.whatsapp.Me r1 = new com.whatsapp.Me     // Catch:{ OperationCanceledException -> 0x058a }
            r1.<init>(r6, r5, r10)     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = r30
            r0.A0R(r1)     // Catch:{ OperationCanceledException -> 0x058a }
            X.3dV r0 = r9.A09     // Catch:{ OperationCanceledException -> 0x058a }
            r18 = 1
            r0.A05()     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A09 = r13     // Catch:{ OperationCanceledException -> 0x058a }
            X.2sA r0 = r9.A07     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A08(r7)     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0086:
            java.lang.String r17 = "fpm/ExportHelper/Clearing me object"
            if (r11 == 0) goto L_0x018d
            r12 = 505(0x1f9, float:7.08E-43)
            X.2eR r0 = r9.A0E     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            android.content.Context r0 = r0.A00     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.io.File r1 = r0.getFilesDir()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.lang.String r0 = "migration/export/sandbox"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.lang.String r11 = X.AnonymousClass36H.A00     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.io.File r14 = X.AnonymousClass002.A0A(r0, r11)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r9.A02 = r14     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.35r r10 = r9.A08     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.27L r6 = new X.27L     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r6.<init>(r9, r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.lang.String r0 = "MessageStoreBackup/backupDatabase/to "
            java.lang.String r0 = X.AnonymousClass0x7.A0p(r14, r0, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.C18260x0.A1L(r1, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.22O r5 = X.AnonymousClass22O.UNENCRYPTED     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.34i r0 = r10.A0h     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r27 = r0
            X.2sr r0 = r10.A07     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r19 = r0
            X.2f0 r0 = r10.A0I     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r23 = r0
            X.0WN r0 = r10.A08     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r21 = r0
            X.2s6 r0 = r10.A0C     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r16 = r0
            X.2fR r15 = r10.A0g     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.2eK r1 = r10.A0b     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.8qC r0 = r10.A0l     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.lang.Object r0 = r0.get()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.0Xr r0 = (X.C06430Xr) r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r29 = 0
            r20 = r0
            r22 = r16
            r24 = r1
            r25 = r15
            r26 = r5
            r28 = r14
            X.0UR r14 = X.AnonymousClass0S7.A00(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.3dV r0 = r10.A0R     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r0.A05()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.io.File r15 = r0.A05     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r0.A05()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            long r0 = r15.length()     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.io.File r0 = r10.A0O(r15, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r14.A06(r6, r0)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            X.2qE r14 = r9.A0G     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            java.io.File r0 = r9.A02     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            long r15 = r14.A02(r0, r11, r13)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r10 = 0
            int r0 = (r15 > r10 ? 1 : (r15 == r10 ? 0 : -1))
            if (r0 < 0) goto L_0x017d
            X.8qC r0 = r9.A0N     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.util.Iterator r12 = X.AnonymousClass0x2.A0j(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
        L_0x0114:
            boolean r0 = r12.hasNext()     // Catch:{ OperationCanceledException -> 0x01d1 }
            if (r0 == 0) goto L_0x016d
            java.lang.Object r10 = r12.next()     // Catch:{ OperationCanceledException -> 0x01d1 }
            X.2sX r10 = (X.C56772sX) r10     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r6 = r10.A08()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "fpm/ExportHelper/backup/local/"
            X.C18260x0.A0s(r0, r6, r1)     // Catch:{ OperationCanceledException -> 0x01d1 }
            X.2zK r1 = r10.A06(r5)     // Catch:{ OperationCanceledException -> 0x01d1 }
            if (r1 == 0) goto L_0x0114
            boolean r0 = r1.A04     // Catch:{ OperationCanceledException -> 0x01d1 }
            if (r0 == 0) goto L_0x0160
            java.io.File r1 = r1.A01     // Catch:{ OperationCanceledException -> 0x01d1 }
            if (r1 == 0) goto L_0x0159
            java.lang.String r0 = r1.getName()     // Catch:{ OperationCanceledException -> 0x01d1 }
            long r0 = r14.A02(r1, r0, r7)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r10 = 0
            int r6 = (r0 > r10 ? 1 : (r0 == r10 ? 0 : -1))
            if (r6 >= 0) goto L_0x0114
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r6 = "fpm/ExportHelper/exportOtherSettings()/Failed to register optional file: "
            r10.append(r6)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r10.append(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
        L_0x0155:
            X.C18280x3.A13(r10)     // Catch:{ OperationCanceledException -> 0x01d1 }
            goto L_0x0114
        L_0x0159:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "fpm/ExportHelper/exportOtherSettings()/file not included in successful result with name: "
            goto L_0x0166
        L_0x0160:
            java.lang.StringBuilder r10 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "fpm/ExportHelper/exportOtherSettings()/failed-to-generate-backup "
        L_0x0166:
            r10.append(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r10.append(r6)     // Catch:{ OperationCanceledException -> 0x01d1 }
            goto L_0x0155
        L_0x016d:
            X.310 r0 = r9.A04     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.io.File r1 = X.AnonymousClass310.A00(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "Media"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r9.A01(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            goto L_0x01d7
        L_0x017d:
            java.lang.String r1 = "exportMessageStore()/Failed to register message store db file"
            X.1zv r0 = new X.1zv     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            r0.<init>(r12, r1)     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
            throw r0     // Catch:{ InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | NoSuchPaddingException -> 0x0185 }
        L_0x0185:
            java.lang.String r0 = "exportMessageStore()/Failed to create backup"
            X.1zv r1 = new X.1zv     // Catch:{ OperationCanceledException -> 0x01d1 }
            r1.<init>(r12, r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            goto L_0x01d0
        L_0x018d:
            X.2eR r1 = r9.A0E     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "messages"
            java.io.File r1 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r9.A02 = r1     // Catch:{ OperationCanceledException -> 0x01d1 }
            X.36W r0 = r9.A0C     // Catch:{ OperationCanceledException -> 0x01d1 }
            r0.A0J(r2, r1)     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "fpm/ExportHelper/exportMessagesWithProtobuf()/data-exported"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            X.2qE r5 = r9.A0G     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.io.File r1 = r9.A02     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r0 = "migration/messages_export.zip"
            long r0 = r5.A02(r1, r0, r13)     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r5 = "fpm/ExportHelper/exportMessagesWithProtobuf()/master-file: "
            X.C18260x0.A10(r5, r6, r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r6 = 0
            int r5 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x01d7
            r9.A00()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x01d1 }
            java.lang.String r5 = "exportMessagesWithProtobuf()/Failed to register master file: "
            java.lang.String r5 = X.AnonymousClass000.A0Z(r5, r6, r0)     // Catch:{ OperationCanceledException -> 0x01d1 }
            r0 = 504(0x1f8, float:7.06E-43)
            X.1zv r1 = new X.1zv     // Catch:{ OperationCanceledException -> 0x01d1 }
            r1.<init>(r0, r5)     // Catch:{ OperationCanceledException -> 0x01d1 }
        L_0x01d0:
            throw r1     // Catch:{ OperationCanceledException -> 0x01d1 }
        L_0x01d1:
            r0 = 0
            r9.A02 = r0     // Catch:{ all -> 0x050e }
            r2.throwIfCanceled()     // Catch:{ all -> 0x050e }
        L_0x01d7:
            if (r18 == 0) goto L_0x01e4
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ OperationCanceledException -> 0x058a }
            r30.A0M()     // Catch:{ OperationCanceledException -> 0x058a }
            X.2d4 r0 = r9.A0A     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x01e4:
            r0 = 11
            r8.A01(r0)     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x01e9:
            r0 = 12
            r3.A01(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.File r0 = r9.A02     // Catch:{ OperationCanceledException -> 0x058a }
            if (r0 == 0) goto L_0x0531
            java.io.File r5 = r9.A01     // Catch:{ OperationCanceledException -> 0x058a }
            if (r5 != 0) goto L_0x0262
            X.2eR r1 = r9.A0E     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "manifest"
            java.io.File r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            r9.A01 = r0     // Catch:{ OperationCanceledException -> 0x058a }
            X.2qE r8 = r9.A0G     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.FileOutputStream r5 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ all -> 0x0571 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0571 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x0571 }
            android.util.JsonWriter r6 = new android.util.JsonWriter     // Catch:{ all -> 0x0571 }
            r6.<init>(r0)     // Catch:{ all -> 0x0571 }
            long r0 = r8.A01()     // Catch:{ all -> 0x0527 }
            r6.beginObject()     // Catch:{ all -> 0x0527 }
            java.lang.String r7 = "totalSize"
            android.util.JsonWriter r7 = r6.name(r7)     // Catch:{ all -> 0x0527 }
            r7.value(r0)     // Catch:{ all -> 0x0527 }
            java.lang.String r0 = "relativePaths"
            r6.name(r0)     // Catch:{ all -> 0x0527 }
            r6.beginArray()     // Catch:{ all -> 0x0527 }
            X.3cu r7 = r8.A03()     // Catch:{ all -> 0x0527 }
        L_0x0230:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x051d }
            if (r0 == 0) goto L_0x024d
            java.lang.Object r1 = r7.next()     // Catch:{ all -> 0x051d }
            X.2SO r1 = (X.AnonymousClass2SO) r1     // Catch:{ all -> 0x051d }
            java.lang.String r0 = r1.A04     // Catch:{ all -> 0x051d }
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x051d }
            if (r0 != 0) goto L_0x0230
            X.2wv r0 = new X.2wv     // Catch:{ all -> 0x051d }
            r0.<init>(r1)     // Catch:{ all -> 0x051d }
            r0.A00(r6)     // Catch:{ all -> 0x051d }
            goto L_0x0230
        L_0x024d:
            r7.close()     // Catch:{ all -> 0x0527 }
            r6.endArray()     // Catch:{ all -> 0x0527 }
            android.util.JsonWriter r0 = r6.endObject()     // Catch:{ all -> 0x0527 }
            r0.flush()     // Catch:{ all -> 0x0527 }
            r6.close()     // Catch:{ all -> 0x0571 }
            r5.close()     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.File r5 = r9.A01     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0262:
            byte[] r1 = r4.A01()     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 203(0xcb, float:2.84E-43)
            X.1gf r6 = new X.1gf     // Catch:{ OperationCanceledException -> 0x058a }
            r6.<init>(r5, r1, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x03c0
        L_0x026f:
            X.2iR r6 = r4.A08     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.File r5 = r6.A00     // Catch:{ OperationCanceledException -> 0x058a }
            if (r5 != 0) goto L_0x0292
            X.2eR r1 = r6.A0E     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "enc-metadata"
            java.io.File r0 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            r6.A00 = r0     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.FileOutputStream r0 = X.AnonymousClass0x9.A0h(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.util.zip.ZipOutputStream r5 = new java.util.zip.ZipOutputStream     // Catch:{ OperationCanceledException -> 0x058a }
            r5.<init>(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            X.2qO r0 = r6.A0D     // Catch:{ all -> 0x0571 }
            r0.A03(r2, r5, r7)     // Catch:{ all -> 0x0571 }
            r5.close()     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.File r5 = r6.A00     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0292:
            r1 = 201(0xc9, float:2.82E-43)
            r0 = 0
            X.1gf r6 = new X.1gf     // Catch:{ OperationCanceledException -> 0x058a }
            r6.<init>(r5, r0, r1)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x03c0
        L_0x029c:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x058a }
            r5 = 0
            int r9 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x02ca
            X.2qE r0 = r4.A07     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A01()     // Catch:{ OperationCanceledException -> 0x058a }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ OperationCanceledException -> 0x058a }
            X.3cu r7 = r0.A03()     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x02b1:
            boolean r0 = r7.hasNext()     // Catch:{ all -> 0x053c }
            if (r0 == 0) goto L_0x02c1
            java.lang.Object r0 = r7.next()     // Catch:{ all -> 0x053c }
            X.2SO r0 = (X.AnonymousClass2SO) r0     // Catch:{ all -> 0x053c }
            r4.A00(r0)     // Catch:{ all -> 0x053c }
            goto L_0x02b1
        L_0x02c1:
            long r0 = X.AnonymousClass0x9.A05(r8)     // Catch:{ all -> 0x053c }
            X.AnonymousClass36H.A01(r5, r0)     // Catch:{ all -> 0x053c }
            goto L_0x0355
        L_0x02ca:
            X.2eR r6 = r4.A06     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r5 = "missing"
            java.io.File r12 = r6.A00(r5)     // Catch:{ OperationCanceledException -> 0x058a }
            byte[] r14 = r4.A01()     // Catch:{ OperationCanceledException -> 0x058a }
            r11 = 0
            r10 = r2
            r13 = r8
            r15 = r0
            X.AnonymousClass36H.A03(r10, r11, r12, r13, r14, r15)     // Catch:{ OperationCanceledException -> 0x058a }
            X.2qE r11 = r4.A07     // Catch:{ OperationCanceledException -> 0x058a }
            java.util.ArrayList r10 = X.AnonymousClass001.A0s()     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.FileInputStream r6 = X.AnonymousClass0x9.A0g(r12)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r1 = X.C58152un.A0B     // Catch:{ all -> 0x0561 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ all -> 0x0561 }
            r0.<init>(r6, r1)     // Catch:{ all -> 0x0561 }
            android.util.JsonReader r8 = new android.util.JsonReader     // Catch:{ all -> 0x0561 }
            r8.<init>(r0)     // Catch:{ all -> 0x0561 }
            X.1gX r12 = new X.1gX     // Catch:{ all -> 0x0557 }
            r12.<init>(r8)     // Catch:{ all -> 0x0557 }
        L_0x02f9:
            boolean r0 = r12.A01()     // Catch:{ all -> 0x0557 }
            if (r0 == 0) goto L_0x033b
            java.lang.Object r0 = r12.A00()     // Catch:{ all -> 0x0557 }
            X.2wv r0 = (X.C59442wv) r0     // Catch:{ all -> 0x0557 }
            java.lang.String r14 = r0.A01     // Catch:{ all -> 0x0557 }
            if (r14 == 0) goto L_0x02f9
            X.4GK r13 = X.C49112g0.A00(r11)     // Catch:{ all -> 0x0557 }
            r0 = r13
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x054d }
            X.2sg r9 = r0.A03     // Catch:{ all -> 0x054d }
            java.lang.String r5 = "SELECT   f._id, f.local_path, f.exported_path, f.file_size, f.required, f.encryption_iv FROM exported_files_metadata AS f WHERE f.exported_path = ?"
            java.lang.String[] r1 = X.AnonymousClass0x9.A1Y()     // Catch:{ all -> 0x054d }
            r1[r7] = r14     // Catch:{ all -> 0x054d }
            java.lang.String r0 = "XPM_EXPORT_FILE_METADATA_SELECT_INTERNAL_BY_EXPORTED_PATH_SINGLE"
            android.database.Cursor r5 = r9.A0E(r5, r0, r1)     // Catch:{ all -> 0x054d }
            boolean r0 = r5.moveToFirst()     // Catch:{ all -> 0x0541 }
            if (r0 != 0) goto L_0x032d
            r5.close()     // Catch:{ all -> 0x054d }
            r13.close()     // Catch:{ all -> 0x0557 }
            goto L_0x02f9
        L_0x032d:
            X.2SO r0 = X.C59112wN.A00(r5)     // Catch:{ all -> 0x0541 }
            r5.close()     // Catch:{ all -> 0x054d }
            r13.close()     // Catch:{ all -> 0x0557 }
            r10.add(r0)     // Catch:{ all -> 0x0557 }
            goto L_0x02f9
        L_0x033b:
            r8.close()     // Catch:{ all -> 0x0561 }
            r6.close()     // Catch:{ OperationCanceledException -> 0x058a }
            java.util.Iterator r1 = r10.iterator()     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0345:
            boolean r0 = r1.hasNext()     // Catch:{ OperationCanceledException -> 0x058a }
            if (r0 == 0) goto L_0x0358
            java.lang.Object r0 = r1.next()     // Catch:{ OperationCanceledException -> 0x058a }
            X.2SO r0 = (X.AnonymousClass2SO) r0     // Catch:{ OperationCanceledException -> 0x058a }
            r4.A00(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0345
        L_0x0355:
            r7.close()     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0358:
            r0 = 250(0xfa, float:3.5E-43)
            X.32w r1 = new X.32w     // Catch:{ OperationCanceledException -> 0x058a }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.OutputStream r0 = r4.A0C     // Catch:{ OperationCanceledException -> 0x058a }
            X.AnonymousClass36H.A02(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0009
        L_0x0366:
            long r0 = r1.A02     // Catch:{ OperationCanceledException -> 0x058a }
            X.1VX r9 = r4.A04     // Catch:{ OperationCanceledException -> 0x058a }
            r6 = 6448(0x1930, float:9.036E-42)
            X.2vE r5 = X.C58422vE.A02     // Catch:{ OperationCanceledException -> 0x058a }
            int r6 = r9.A0O(r5, r6)     // Catch:{ OperationCanceledException -> 0x058a }
            int r5 = (int) r0     // Catch:{ OperationCanceledException -> 0x058a }
            byte[] r5 = new byte[r5]     // Catch:{ OperationCanceledException -> 0x058a }
            int r1 = r8.read(r5)     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = -1
            if (r1 == r0) goto L_0x0583
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r5, r7, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            int r0 = r0.getInt()     // Catch:{ OperationCanceledException -> 0x058a }
            int r6 = java.lang.Math.min(r6, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            X.2rI r0 = r4.A05     // Catch:{ OperationCanceledException -> 0x058a }
            X.8qC r5 = r0.A02     // Catch:{ OperationCanceledException -> 0x058a }
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r5)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "/export/protocolVersion"
            X.C18270x1.A0h(r1, r0, r6)     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 3
            if (r6 >= r0) goto L_0x039a
            r13 = 0
        L_0x039a:
            android.content.SharedPreferences$Editor r1 = X.AnonymousClass0x2.A0E(r5)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "/export/usingDbForTransfer"
            X.C18270x1.A0l(r1, r0, r13)     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "fpm/DonorChatTransferTask/setProtocolVersion: "
            X.C18260x0.A0w(r0, r1, r6)     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            r0.putInt(r6)     // Catch:{ OperationCanceledException -> 0x058a }
            byte[] r5 = r0.array()     // Catch:{ OperationCanceledException -> 0x058a }
            r1 = 0
            r0 = 200(0xc8, float:2.8E-43)
            X.1ge r6 = new X.1ge     // Catch:{ OperationCanceledException -> 0x058a }
            r6.<init>(r5, r1, r0)     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x03c0:
            java.io.OutputStream r0 = r4.A0C     // Catch:{ OperationCanceledException -> 0x058a }
            X.AnonymousClass36H.A02(r2, r6, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0009
        L_0x03c7:
            X.2iR r7 = r4.A08     // Catch:{ OperationCanceledException -> 0x058a }
            X.2eR r1 = r7.A0E     // Catch:{ OperationCanceledException -> 0x058a }
            java.lang.String r0 = "logging"
            java.io.File r6 = r1.A00(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.FileOutputStream r5 = X.AnonymousClass0x9.A0h(r6)     // Catch:{ OperationCanceledException -> 0x058a }
            X.2QM r8 = r7.A0J     // Catch:{ all -> 0x0571 }
            java.io.OutputStreamWriter r0 = new java.io.OutputStreamWriter     // Catch:{ all -> 0x0571 }
            r0.<init>(r5)     // Catch:{ all -> 0x0571 }
            android.util.JsonWriter r7 = new android.util.JsonWriter     // Catch:{ all -> 0x0571 }
            r7.<init>(r0)     // Catch:{ all -> 0x0571 }
            r7.beginObject()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "attemptID"
            android.util.JsonWriter r9 = r7.name(r0)     // Catch:{ all -> 0x0567 }
            X.2rI r0 = r8.A01     // Catch:{ all -> 0x0567 }
            X.8qC r0 = r0.A02     // Catch:{ all -> 0x0567 }
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "/export/logging/attemptId"
            java.lang.String r0 = X.C18280x3.A0Z(r1, r0)     // Catch:{ all -> 0x0567 }
            r9.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "donorInfo"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            r7.beginObject()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "deviceName"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = android.os.Build.MANUFACTURER     // Catch:{ all -> 0x0567 }
            r1.append(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "-"
            r1.append(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = android.os.Build.MODEL     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = X.AnonymousClass000.A0X(r0, r1)     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "appVersion"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "2.23.26.14"
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "osVersion"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "buildType"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Integer r0 = X.C18290x4.A0a()     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "yearClass2016"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            X.2y5 r1 = r8.A03     // Catch:{ all -> 0x0567 }
            X.33i r0 = r8.A00     // Catch:{ all -> 0x0567 }
            int r0 = X.AnonymousClass34G.A02(r0, r1)     // Catch:{ all -> 0x0567 }
            long r0 = (long) r0     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            r7.endObject()     // Catch:{ all -> 0x0567 }
            X.2po r0 = r8.A02     // Catch:{ all -> 0x0567 }
            java.util.List r1 = r0.A0C     // Catch:{ all -> 0x0567 }
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x0567 }
            if (r0 != 0) goto L_0x04df
            java.lang.String r0 = "loggingEvents"
            android.util.JsonWriter r0 = r7.name(r0)     // Catch:{ all -> 0x0567 }
            r0.beginArray()     // Catch:{ all -> 0x0567 }
            java.util.Iterator r9 = r1.iterator()     // Catch:{ all -> 0x0567 }
        L_0x046c:
            boolean r0 = r9.hasNext()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x04dc
            java.lang.Object r8 = r9.next()     // Catch:{ all -> 0x0567 }
            X.1bP r8 = (X.C25991bP) r8     // Catch:{ all -> 0x0567 }
            java.lang.Integer r0 = r8.A09     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x046c
            int r0 = r0.intValue()     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x046c
            r7.beginObject()     // Catch:{ all -> 0x0567 }
            java.lang.String r0 = "eventTypeCode"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Integer r0 = r8.A09     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Long r0 = r8.A0B     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x049d
            java.lang.String r0 = "duration"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Long r0 = r8.A0B     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
        L_0x049d:
            java.lang.Long r0 = r8.A0I     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x04ac
            java.lang.String r0 = "progress"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Long r0 = r8.A0I     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
        L_0x04ac:
            java.lang.Double r0 = r8.A00     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x04ba
            java.lang.String r0 = "exportedDbSize"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Double r0 = r8.A00     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
        L_0x04ba:
            java.lang.Long r0 = r8.A0K     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x04c9
            java.lang.String r0 = "storageAvailableSize"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Long r0 = r8.A0K     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
        L_0x04c9:
            java.lang.Double r0 = r8.A02     // Catch:{ all -> 0x0567 }
            if (r0 == 0) goto L_0x04d8
            java.lang.String r0 = "waDbSize"
            r7.name(r0)     // Catch:{ all -> 0x0567 }
            java.lang.Double r0 = r8.A02     // Catch:{ all -> 0x0567 }
            r7.value(r0)     // Catch:{ all -> 0x0567 }
        L_0x04d8:
            r7.endObject()     // Catch:{ all -> 0x0567 }
            goto L_0x046c
        L_0x04dc:
            r7.endArray()     // Catch:{ all -> 0x0567 }
        L_0x04df:
            r7.endObject()     // Catch:{ all -> 0x0567 }
            r1.clear()     // Catch:{ all -> 0x0567 }
            r7.close()     // Catch:{ all -> 0x0571 }
            r5.close()     // Catch:{ OperationCanceledException -> 0x058a }
            byte[] r5 = r4.A01()     // Catch:{ OperationCanceledException -> 0x058a }
            r0 = 202(0xca, float:2.83E-43)
            X.1gf r1 = new X.1gf     // Catch:{ OperationCanceledException -> 0x058a }
            r1.<init>(r6, r5, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.OutputStream r0 = r4.A0C     // Catch:{ OperationCanceledException -> 0x058a }
            X.AnonymousClass36H.A02(r2, r1, r0)     // Catch:{ OperationCanceledException -> 0x058a }
            boolean r0 = r4.A00     // Catch:{ OperationCanceledException -> 0x058a }
            if (r0 == 0) goto L_0x0009
        L_0x04ff:
            X.1hx r0 = r4.A09     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A09()     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0566
        L_0x0505:
            r0 = 13
            r3.A01(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            r4.A00 = r13     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0009
        L_0x050e:
            r1 = move-exception
            if (r18 == 0) goto L_0x057a
            com.whatsapp.util.Log.i((java.lang.String) r17)     // Catch:{ OperationCanceledException -> 0x058a }
            r30.A0M()     // Catch:{ OperationCanceledException -> 0x058a }
            X.2d4 r0 = r9.A0A     // Catch:{ OperationCanceledException -> 0x058a }
            r0.A00()     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x057a
        L_0x051d:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0522 }
            goto L_0x0526
        L_0x0522:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0527 }
        L_0x0526:
            throw r1     // Catch:{ all -> 0x0527 }
        L_0x0527:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x052c }
            goto L_0x0570
        L_0x052c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0571 }
            goto L_0x0570
        L_0x0531:
            java.lang.String r0 = "fpm/ExportHelper/getManifestFile()/manifest file requested before messages exported"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ OperationCanceledException -> 0x058a }
            java.io.IOException r1 = new java.io.IOException     // Catch:{ OperationCanceledException -> 0x058a }
            r1.<init>()     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0589
        L_0x053c:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x0576 }
            goto L_0x057a
        L_0x0541:
            r1 = move-exception
            if (r5 == 0) goto L_0x054c
            r5.close()     // Catch:{ all -> 0x0548 }
            goto L_0x054c
        L_0x0548:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x054d }
        L_0x054c:
            throw r1     // Catch:{ all -> 0x054d }
        L_0x054d:
            r1 = move-exception
            r13.close()     // Catch:{ all -> 0x0552 }
            goto L_0x0556
        L_0x0552:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0557 }
        L_0x0556:
            throw r1     // Catch:{ all -> 0x0557 }
        L_0x0557:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x055c }
            goto L_0x0560
        L_0x055c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0561 }
        L_0x0560:
            throw r1     // Catch:{ all -> 0x0561 }
        L_0x0561:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0576 }
            goto L_0x057a
        L_0x0566:
            return
        L_0x0567:
            r1 = move-exception
            r7.close()     // Catch:{ all -> 0x056c }
            goto L_0x0570
        L_0x056c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ all -> 0x0571 }
        L_0x0570:
            throw r1     // Catch:{ all -> 0x0571 }
        L_0x0571:
            r1 = move-exception
            r5.close()     // Catch:{ all -> 0x0576 }
            goto L_0x057a
        L_0x0576:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x057a:
            throw r1     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x057b:
            int r0 = r1.A00     // Catch:{ OperationCanceledException -> 0x058a }
            X.24Z r1 = new X.24Z     // Catch:{ OperationCanceledException -> 0x058a }
            r1.<init>(r0)     // Catch:{ OperationCanceledException -> 0x058a }
            goto L_0x0589
        L_0x0583:
            java.lang.String r0 = "No bytes to read"
            java.io.IOException r1 = X.AnonymousClass002.A0C(r0)     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x0589:
            throw r1     // Catch:{ OperationCanceledException -> 0x058a }
        L_0x058a:
            r5 = 2
            r3 = 251(0xfb, float:3.52E-43)
            r0 = 0
            X.32w r2 = new X.32w     // Catch:{ 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0 }
            r2.<init>((int) r3, (long) r0, (int) r5)     // Catch:{ 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0 }
            java.io.OutputStream r1 = r4.A0C     // Catch:{ 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0 }
            r0 = 0
            X.AnonymousClass36H.A02(r0, r2, r1)     // Catch:{ 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0 }
            java.lang.String r0 = "fpm/DonorChatTransferTask/cancel successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0, 24Z | IOException | InterruptedException -> 0x05a0 }
            return
        L_0x05a0:
            r1 = move-exception
            X.1hx r0 = r4.A09
            X.AnonymousClass36H.A04(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3RA.run():void");
    }

    public AnonymousClass3RA(C56612sH r2, C57162tC r3, AnonymousClass1VX r4, C56022rI r5, C48152eR r6, C55362qE r7, C50592iR r8, C28901hx r9, C55112po r10, InputStream inputStream, OutputStream outputStream) {
        this.A02 = r2;
        this.A04 = r4;
        this.A0B = inputStream;
        this.A0C = outputStream;
        this.A08 = r8;
        this.A0A = r10;
        this.A06 = r6;
        this.A09 = r9;
        this.A07 = r7;
        this.A05 = r5;
        this.A03 = r3;
    }
}
