package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2jM  reason: invalid class name and case insensitive filesystem */
public final class C51152jM {
    public final C54292oU A00;
    public final C183538qC A01;

    public static File A00(C51152jM r2) {
        return new File(r2.A00.A00.getDir("account_switching", 0), "checkpoint");
    }

    public C51152jM(C54292oU r1, C183538qC r2) {
        C18260x0.A0Q(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void A01() {
        File A002 = A00(this);
        if (A002.exists()) {
            C18260x0.A1E("AccountSwitchingRecoveryManager/deleteCheckpointFile = ", AnonymousClass001.A0o(), A002.delete());
            return;
        }
        Log.e("AccountSwitchingRecoveryManager/deleteCheckpointFile/checkpointFile not found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0262, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0263, code lost:
        X.AnonymousClass2A8.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0266, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0133, code lost:
        if (r10.equals("moving") != false) goto L_0x0135;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(boolean r21) {
        /*
            r20 = this;
            java.lang.String r5 = "staging"
            r19 = r20
            java.io.File r2 = A00(r19)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile found = "
            r1.append(r0)
            boolean r0 = r2.exists()
            r1.append(r0)
            java.lang.String r0 = " recoveryOnAppStartup: "
            r6 = r21
            X.C18260x0.A1E(r0, r1, r6)
            boolean r0 = r2.exists()
            if (r0 == 0) goto L_0x0267
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r4 = new java.io.RandomAccessFile
            r4.<init>(r2, r0)
            long r1 = r4.length()     // Catch:{ all -> 0x0260 }
            r12 = 1
            int r0 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r0 >= 0) goto L_0x0042
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpointFile is empty, nothing to recover"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0260 }
            r19.A01()     // Catch:{ all -> 0x0260 }
            goto L_0x0255
        L_0x0042:
            long r7 = r4.length()     // Catch:{ all -> 0x0260 }
            r0 = 0
            int r2 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x0259
            java.lang.StringBuilder r7 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r2 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint file length: "
            r7.append(r2)     // Catch:{ all -> 0x0260 }
            long r2 = r4.length()     // Catch:{ all -> 0x0260 }
            X.C18260x0.A1I(r7, r2)     // Catch:{ all -> 0x0260 }
            long r2 = r4.length()     // Catch:{ all -> 0x0260 }
            long r2 = r2 - r12
        L_0x0061:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0074
            r4.seek(r2)     // Catch:{ all -> 0x0260 }
            byte r8 = r4.readByte()     // Catch:{ all -> 0x0260 }
            r7 = 10
            if (r8 == r7) goto L_0x0074
            r7 = -1
            long r2 = r2 + r7
            goto L_0x0061
        L_0x0074:
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x007a
            long r0 = r2 + r12
        L_0x007a:
            java.lang.StringBuilder r11 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            long r9 = r4.length()     // Catch:{ all -> 0x0260 }
        L_0x0082:
            int r7 = (r0 > r9 ? 1 : (r0 == r9 ? 0 : -1))
            if (r7 >= 0) goto L_0x0097
            r4.seek(r0)     // Catch:{ all -> 0x0260 }
            int r8 = r4.read()     // Catch:{ all -> 0x0260 }
            r7 = 10
            if (r8 == r7) goto L_0x0097
            char r7 = (char) r8     // Catch:{ all -> 0x0260 }
            r11.append(r7)     // Catch:{ all -> 0x0260 }
            long r0 = r0 + r12
            goto L_0x0082
        L_0x0097:
            java.lang.String r11 = X.C18290x4.A0o(r11)     // Catch:{ all -> 0x0260 }
            int r0 = r11.length()     // Catch:{ all -> 0x0260 }
            r7 = 1
            r10 = 0
            if (r0 != 0) goto L_0x00ae
            r4.seek(r2)     // Catch:{ all -> 0x0260 }
            long r0 = r4.getFilePointer()     // Catch:{ all -> 0x0260 }
            r4.setLength(r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0042
        L_0x00ae:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/checkpoint line: "
            X.C18260x0.A0s(r0, r11, r1)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = ":"
            java.lang.String[] r0 = new java.lang.String[]{r0}     // Catch:{ all -> 0x0260 }
            r8 = 0
            r9 = 6
            java.util.List r13 = X.C175728Zm.A0P(r11, r0, r10)     // Catch:{ all -> 0x0260 }
            java.lang.String r10 = X.AnonymousClass001.A0n(r13, r10)     // Catch:{ all -> 0x0260 }
            int r12 = r10.hashCode()     // Catch:{ all -> 0x0260 }
            r0 = -1068259250(0xffffffffc053a84e, float:-3.3071475)
            java.lang.String r1 = "moved"
            java.lang.String r15 = "moving"
            if (r12 == r0) goto L_0x012f
            r0 = 104087219(0x6343eb3, float:3.39003E-35)
            if (r12 == r0) goto L_0x0127
            r0 = 2038719204(0x798462e4, float:8.592362E34)
            if (r12 != r0) goto L_0x0232
            java.lang.String r0 = "accounts_backup_created"
            boolean r0 = r10.equals(r0)     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x0232
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/restoring accounts backup file, recoveryOnAppStartUp="
            X.C18260x0.A1E(r0, r1, r6)     // Catch:{ all -> 0x0260 }
            r0 = r19
            X.8qC r1 = r0.A01     // Catch:{ all -> 0x0260 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0260 }
            X.30k r0 = (X.C613630k) r0     // Catch:{ all -> 0x0260 }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/retrying restoring accounts backup file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0260 }
            java.lang.Object r0 = r1.get()     // Catch:{ all -> 0x0260 }
            X.30k r0 = (X.C613630k) r0     // Catch:{ all -> 0x0260 }
            boolean r0 = r0.A08()     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x011b
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x0260 }
            if (r21 != 0) goto L_0x011b
            goto L_0x0236
        L_0x011b:
            r4.seek(r2)     // Catch:{ all -> 0x0260 }
            long r0 = r4.getFilePointer()     // Catch:{ all -> 0x0260 }
            r4.setLength(r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0232
        L_0x0127:
            boolean r0 = r10.equals(r1)     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x0135
            goto L_0x0232
        L_0x012f:
            boolean r0 = r10.equals(r15)     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x0232
        L_0x0135:
            int r0 = r13.size()     // Catch:{ all -> 0x0260 }
            boolean r0 = X.AnonymousClass000.A1U(r0, r9)
            X.C626936e.A0B(r0)     // Catch:{ all -> 0x0260 }
            java.lang.String r14 = X.AnonymousClass001.A0n(r13, r7)     // Catch:{ all -> 0x0260 }
            r0 = 3
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)     // Catch:{ all -> 0x0260 }
            java.io.File r12 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0260 }
            r0 = 5
            java.lang.String r0 = X.AnonymousClass001.A0n(r13, r0)     // Catch:{ all -> 0x0260 }
            java.io.File r10 = X.AnonymousClass002.A0B(r0)     // Catch:{ all -> 0x0260 }
            java.io.File r7 = X.AnonymousClass002.A0A(r12, r14)     // Catch:{ all -> 0x0260 }
            java.io.File r9 = X.AnonymousClass002.A0A(r10, r14)     // Catch:{ all -> 0x0260 }
            boolean r0 = r9.exists()     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x017e
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/toDir: "
            X.AnonymousClass000.A10(r9, r0, r1)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = " doesn't exist"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0260 }
        L_0x0172:
            r4.seek(r2)     // Catch:{ all -> 0x0260 }
            long r0 = r4.getFilePointer()     // Catch:{ all -> 0x0260 }
            r4.setLength(r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0232
        L_0x017e:
            java.lang.Object r0 = r13.get(r8)     // Catch:{ all -> 0x0260 }
            boolean r0 = X.C162457s7.A0P(r0, r15)     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x0201
            java.lang.String r0 = r10.getAbsolutePath()     // Catch:{ all -> 0x0260 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0260 }
            boolean r0 = X.C175728Zm.A0S(r0, r5, r8)     // Catch:{ all -> 0x0260 }
            java.lang.String r8 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVING case for "
            java.lang.String r13 = " is not moved"
            java.lang.String r1 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/record was moving but "
            java.lang.String r15 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/Skipping as "
            if (r0 == 0) goto L_0x01c9
            boolean r0 = r9.exists()     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x01be
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r14)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = " was successfully moved from data dir"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0260 }
            r15 = r4
            r16 = r2
            r18 = r6
            r11 = r12
            r12 = r7
            r13 = r10
            r14 = r9
            r10 = r19
            boolean r0 = r10.A03(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x0232
            goto L_0x01c6
        L_0x01be:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r15)     // Catch:{ all -> 0x0260 }
            X.C18260x0.A0s(r11, r13, r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0172
        L_0x01c6:
            if (r21 != 0) goto L_0x0232
            goto L_0x023c
        L_0x01c9:
            java.lang.String r0 = r12.getAbsolutePath()     // Catch:{ all -> 0x0260 }
            X.C162457s7.A0D(r0)     // Catch:{ all -> 0x0260 }
            boolean r0 = X.AnonymousClass2AB.A04(r0, r5)     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x0232
            boolean r0 = r7.exists()     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x01f9
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0m(r1, r14)     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = " was successfully moved from staging"
            X.C18260x0.A1L(r1, r0)     // Catch:{ all -> 0x0260 }
            r15 = r4
            r16 = r2
            r18 = r6
            r11 = r12
            r12 = r7
            r13 = r10
            r14 = r9
            r10 = r19
            boolean r0 = r10.A03(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x0232
            if (r21 != 0) goto L_0x0232
            goto L_0x0244
        L_0x01f9:
            java.lang.StringBuilder r0 = X.AnonymousClass000.A0l(r15)     // Catch:{ all -> 0x0260 }
            X.C18260x0.A0s(r11, r13, r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0228
        L_0x0201:
            java.lang.Object r0 = r13.get(r8)     // Catch:{ all -> 0x0260 }
            boolean r0 = X.C162457s7.A0P(r0, r1)     // Catch:{ all -> 0x0260 }
            if (r0 == 0) goto L_0x021f
            r15 = r4
            r16 = r2
            r18 = r6
            r11 = r12
            r12 = r7
            r13 = r10
            r14 = r9
            r10 = r19
            boolean r0 = r10.A03(r11, r12, r13, r14, r15, r16, r18)     // Catch:{ all -> 0x0260 }
            if (r0 != 0) goto L_0x0232
            if (r21 != 0) goto L_0x0232
            goto L_0x024c
        L_0x021f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/invalid record: "
            X.C18260x0.A0r(r0, r11, r1)     // Catch:{ all -> 0x0260 }
        L_0x0228:
            r4.seek(r2)     // Catch:{ all -> 0x0260 }
            long r0 = r4.getFilePointer()     // Catch:{ all -> 0x0260 }
            r4.setLength(r0)     // Catch:{ all -> 0x0260 }
        L_0x0232:
            r12 = 1
            goto L_0x0042
        L_0x0236:
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to restore accounts backup file, retrying on app startup"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x0260 }
            goto L_0x0255
        L_0x023c:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            X.C18260x0.A1Q(r0, r8, r7)     // Catch:{ all -> 0x0260 }
            goto L_0x0255
        L_0x0244:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            X.C18260x0.A1Q(r0, r8, r7)     // Catch:{ all -> 0x0260 }
            goto L_0x0255
        L_0x024c:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0260 }
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromAccountSwitchingFailure/failed to recover from MOVED case for "
            X.C18260x0.A1Q(r1, r0, r7)     // Catch:{ all -> 0x0260 }
        L_0x0255:
            r4.close()
            return
        L_0x0259:
            r4.close()
            r19.A01()
            return
        L_0x0260:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0262 }
        L_0x0262:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r4, r1)
            throw r0
        L_0x0267:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51152jM.A02(boolean):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A03(java.io.File r10, java.io.File r11, java.io.File r12, java.io.File r13, java.io.RandomAccessFile r14, long r15, boolean r17) {
        /*
            r9 = this;
            boolean r0 = r10.exists()
            java.lang.String r4 = "staging"
            r2 = 0
            if (r0 != 0) goto L_0x003b
            java.lang.String r0 = r10.getAbsolutePath()
            X.C162457s7.A0D(r0)
            boolean r0 = X.C175728Zm.A0S(r0, r4, r2)
            if (r0 == 0) goto L_0x003b
            boolean r3 = r10.mkdirs()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/"
            X.AnonymousClass000.A10(r10, r0, r1)
            java.lang.String r0 = " dirCreated: "
            X.C18260x0.A1E(r0, r1, r3)
            if (r3 != 0) goto L_0x003b
            if (r17 != 0) goto L_0x003b
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to create "
            java.lang.String r0 = X.AnonymousClass0x7.A0o(r11, r0, r1)
            X.C18260x0.A1L(r1, r0)
            return r2
        L_0x003b:
            boolean r0 = r11.exists()
            java.lang.String r8 = " found. Deleting it: "
            java.lang.String r5 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/fromDir: "
            if (r0 == 0) goto L_0x0053
            boolean r1 = X.C174438Un.A00(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A10(r11, r5, r0)
            X.C18260x0.A1E(r8, r0, r1)
        L_0x0053:
            boolean r3 = r13.renameTo(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A10(r11, r5, r0)
            java.lang.String r7 = ", toDir: "
            X.AnonymousClass000.A10(r13, r7, r0)
            java.lang.String r6 = ":, moveDir:"
            X.C18260x0.A1E(r6, r0, r3)
            if (r3 != 0) goto L_0x00cd
            boolean r0 = r11.exists()
            java.lang.String r5 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/attempting again fromDir: "
            if (r0 == 0) goto L_0x0080
            boolean r1 = X.C174438Un.A00(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A10(r11, r5, r0)
            X.C18260x0.A1E(r8, r0, r1)
        L_0x0080:
            boolean r3 = r13.renameTo(r11)
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()
            X.AnonymousClass000.A10(r11, r5, r0)
            X.AnonymousClass000.A10(r13, r7, r0)
            X.C18260x0.A1E(r6, r0, r3)
            if (r3 != 0) goto L_0x00cd
            if (r17 != 0) goto L_0x00cd
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/failed to recover "
            X.C18260x0.A1Q(r1, r0, r11)
        L_0x009e:
            boolean r0 = r12.exists()
            if (r0 == 0) goto L_0x00cc
            java.lang.String r0 = r12.getAbsolutePath()
            X.C162457s7.A0D(r0)
            boolean r0 = X.C175728Zm.A0S(r0, r4, r2)
            if (r0 == 0) goto L_0x00cc
            java.io.File[] r0 = r12.listFiles()
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.length
            if (r0 != 0) goto L_0x00cc
        L_0x00ba:
            boolean r2 = X.C174438Un.A00(r12)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/toPath: "
            X.AnonymousClass000.A10(r12, r0, r1)
            java.lang.String r0 = " is empty. Deleting it:"
            X.C18260x0.A1E(r0, r1, r2)
        L_0x00cc:
            return r3
        L_0x00cd:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/recoverFromMovedDirectories/recovered "
            r1.append(r0)
            r1.append(r11)
            java.lang.String r0 = " successfully: "
            X.C18260x0.A1E(r0, r1, r3)
            r0 = r15
            r14.seek(r0)
            long r0 = r14.getFilePointer()
            r14.setLength(r0)
            goto L_0x009e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C51152jM.A03(java.io.File, java.io.File, java.io.File, java.io.File, java.io.RandomAccessFile, long, boolean):boolean");
    }
}
