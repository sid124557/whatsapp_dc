package com.whatsapp.accountswitching;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x9;
import X.AnonymousClass1RI;
import X.AnonymousClass33S;
import X.AnonymousClass33p;
import X.AnonymousClass35Q;
import X.AnonymousClass4FS;
import X.AnonymousClass5SO;
import X.C107575bX;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18320x8;
import X.C183538qC;
import X.C18530xp;
import X.C18630y0;
import X.C29411im;
import X.C43162Ra;
import X.C53892nq;
import X.C57072t2;
import X.C61072zf;
import X.C613630k;
import X.C614930z;
import X.C66523Lt;
import X.C69253Wh;
import X.C72303dV;
import X.C73723fy;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class AccountSwitchingContentProvider extends C18530xp {
    public C29411im A00;
    public AnonymousClass33p A01;
    public C61072zf A02;
    public C72303dV A03;
    public C66523Lt A04;
    public AnonymousClass33S A05;
    public C43162Ra A06;
    public C69253Wh A07;
    public AnonymousClass4FS A08;
    public AnonymousClass1RI A09;
    public C183538qC A0A;
    public C183538qC A0B;
    public C183538qC A0C;
    public C183538qC A0D;
    public C183538qC A0E;
    public C183538qC A0F;
    public C183538qC A0G;
    public C183538qC A0H;
    public C183538qC A0I;
    public C183538qC A0J;
    public C183538qC A0K;
    public C183538qC A0L;
    public C183538qC A0M;
    public C183538qC A0N;
    public C183538qC A0O;
    public C183538qC A0P;

    public static final void A03(C614930z r8, C613630k r9, AnonymousClass35Q r10, AnonymousClass33p r11, C61072zf r12) {
        String str;
        String str2;
        C18260x0.A0b(r8, r9, r10, 2);
        StringBuilder A0l = AnonymousClass000.A0l("AccountSwitchingContentProvider/healthState");
        A0l.append("/current account lid: ");
        C53892nq A012 = r8.A01();
        if (A012 != null) {
            str = C57072t2.A01(A012.A07);
        } else {
            str = null;
        }
        C18260x0.A1L(A0l, str);
        StringBuilder A0l2 = AnonymousClass000.A0l("AccountSwitchingContentProvider/healthState");
        A0l2.append("/numberOfInactiveAccounts: ");
        C18260x0.A1G(A0l2, r11.A0C());
        StringBuilder A0l3 = AnonymousClass000.A0l("AccountSwitchingContentProvider/healthState");
        A0l3.append("/available internal phone storage: ");
        AnonymousClass0x9.A1M(A0l3, r12.A03(), SearchActionVerificationClientService.MS_TO_NS);
        C18260x0.A1L(A0l3, " MB");
        C57072t2.A02(r10, "/stagingDirLogString/", AnonymousClass000.A0l("AccountSwitchingContentProvider/healthState"));
        StringBuilder A0l4 = AnonymousClass000.A0l("AccountSwitchingContentProvider/healthState");
        A0l4.append("/accounts file content: ");
        synchronized (r9) {
            AnonymousClass5SO A022 = r9.A02();
            try {
                JSONArray A1F = AnonymousClass0x9.A1F();
                for (C53892nq r7 : A022.A01) {
                    JSONObject A0l5 = AnonymousClass0x2.A0l(r7);
                    A0l5.put("lid", C57072t2.A01(r7.A07));
                    String str3 = r7.A06;
                    C162457s7.A0J(str3, 0);
                    String A0B2 = C107575bX.A0B(str3, 4);
                    if (A0B2 != null) {
                        str3 = A0B2;
                    }
                    A0l5.put("jid", str3);
                    A0l5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, r7.A08);
                    A0l5.put("badge_count", r7.A00);
                    A0l5.put("is_logged_in", r7.A03);
                    A0l5.put("unread_message_count", r7.A01);
                    A0l5.put("last_active_timestamp_ms", r7.A04);
                    A0l5.put("last_buzzed_timestamp_ms", r7.A05);
                    A1F.put(C18290x4.A0o(A0l5));
                }
                JSONObject A1G = AnonymousClass0x9.A1G();
                A1G.put("inactiveAccounts", A1F);
                String str4 = A022.A00;
                if (!(str4 == null || str4.length() == 0)) {
                    A1G.put("paymentsOnboardedLid", C57072t2.A01(str4));
                }
                A1G.put("shownMeTabMenuItemToolTip", A022.A03);
                A1G.put("isCompanionModeEnabled", A022.A02);
                str2 = C18290x4.A0o(A1G);
            } catch (JSONException e) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "AccountSwitchingDataRepo/readDataForLogging/JSONException : ", e);
                str2 = "";
            }
        }
        C18260x0.A1L(A0l4, str2);
        return;
    }

    public static final void A04(C18630y0 r5) {
        try {
            boolean tryLock = r5.A05.writeLock().tryLock(5, TimeUnit.SECONDS);
            StringBuilder A0l = AnonymousClass000.A0l("AccountSwitchingContentProvider/disconnect/");
            A0l.append(r5.getDatabaseName());
            C18260x0.A1E(" lock acquired: ", A0l, tryLock);
        } catch (InterruptedException e) {
            StringBuilder A0l2 = AnonymousClass000.A0l("AccountSwitchingContentProvider/disconnect/");
            A0l2.append(r5.getDatabaseName());
            C18260x0.A15(" lock exception", A0l2, e);
        }
    }

    public final C183538qC A09() {
        C183538qC r0 = this.A0B;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("accountSwitchingDataRepo");
    }

    public final String A0A() {
        String obj;
        Log.i("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid");
        C183538qC r0 = this.A0C;
        if (r0 != null) {
            String str = (String) C73723fy.A04(((AnonymousClass35Q) r0.get()).A04());
            if (str == null) {
                obj = "AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/null";
            } else {
                StringBuilder A0o = AnonymousClass001.A0o();
                C57072t2.A03("AccountSwitchingFileManager/getMakeActiveLidFromStagedDir/", str, A0o);
                obj = A0o.toString();
            }
            Log.i(obj);
            if (str == null || str.length() == 0) {
                throw AnonymousClass001.A0e("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid isNullOrEmpty");
            }
            C57072t2.A04("AccountSwitchingContentProvider/maybeCorrectMakeActiveLid/correctMakeActiveLid ", str, AnonymousClass001.A0o());
            return str;
        }
        throw C18270x1.A0S("accountSwitchingFileManager");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:78:0x016f, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0170, code lost:
        X.AnonymousClass2A8.A00(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0173, code lost:
        throw r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0B(X.AnonymousClass66S r9, java.lang.String r10, X.AnonymousClass4GP r11) {
        /*
            r8 = this;
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing preCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.BhF()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed preCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r8.A0D
            if (r0 == 0) goto L_0x017b
            java.lang.Object r0 = r0.get()
            X.2jM r0 = (X.C51152jM) r0
            java.io.File r3 = X.C51152jM.A00(r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L_0x0174
            boolean r2 = r3.createNewFile()
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingRecoveryManager/createCheckpointFile = "
            X.C18260x0.A1E(r0, r1, r2)
            java.lang.String r0 = "rws"
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            r2.<init>(r3, r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file created"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            X.30k r6 = X.C18530xp.A01(r8)     // Catch:{ all -> 0x016d }
            monitor-enter(r6)     // Catch:{ all -> 0x016d }
            r5 = 0
            java.lang.String r0 = "accounts"
            java.io.File r7 = r6.A04(r0)     // Catch:{ SecurityException -> 0x008c }
            boolean r0 = r7.exists()     // Catch:{ SecurityException -> 0x008c }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/accounts file does not exist, attempting to create an empty one"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x008c }
            X.3d3 r3 = X.C72023d3.A00     // Catch:{ SecurityException -> 0x008c }
            r1 = 0
            X.5SO r0 = new X.5SO     // Catch:{ SecurityException -> 0x008c }
            r0.<init>(r1, r3, r5, r5)     // Catch:{ SecurityException -> 0x008c }
            boolean r0 = r6.A09(r0)     // Catch:{ SecurityException -> 0x008c }
            if (r0 != 0) goto L_0x0066
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/unable to create accounts file"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x008c }
            goto L_0x0092
        L_0x0066:
            java.lang.String r0 = "accounts.bak"
            java.io.File r4 = r6.A04(r0)     // Catch:{ SecurityException -> 0x008c }
            boolean r0 = r4.exists()     // Catch:{ SecurityException -> 0x008c }
            if (r0 == 0) goto L_0x007f
            boolean r3 = r4.delete()     // Catch:{ SecurityException -> 0x008c }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x008c }
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/deleted previous backup file: "
            X.C18260x0.A1E(r0, r1, r3)     // Catch:{ SecurityException -> 0x008c }
        L_0x007f:
            X.8qC r0 = r6.A02     // Catch:{ SecurityException -> 0x008c }
            java.lang.Object r0 = r0.get()     // Catch:{ SecurityException -> 0x008c }
            X.2eK r0 = (X.C48092eK) r0     // Catch:{ SecurityException -> 0x008c }
            boolean r5 = X.C627536m.A0N(r0, r7, r4)     // Catch:{ SecurityException -> 0x008c }
            goto L_0x0092
        L_0x008c:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingDataRepo/createBackup/"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ all -> 0x016a }
        L_0x0092:
            monitor-exit(r6)     // Catch:{ all -> 0x016d }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/accounts file backed up:"
            X.C18260x0.A1E(r0, r1, r5)     // Catch:{ all -> 0x016d }
            if (r5 == 0) goto L_0x014f
            X.8qC r0 = r8.A0D     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0148
            r0.get()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "accounts_backup_created\n"
            r2.writeBytes(r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing data repo ops..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            r11.invoke()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed data repo ops"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing checkpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            r9.Ayo(r2)     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed checkpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ all -> 0x016d }
            r2.close()
            X.8qC r0 = r8.A0D
            if (r0 == 0) goto L_0x0141
            java.lang.Object r0 = r0.get()
            X.2jM r0 = (X.C51152jM) r0
            r0.A01()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/checkpoint file deleted"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executing postCheckpointOps..."
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r9.Bh6()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/executed postCheckpointOps"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.30k r5 = X.C18530xp.A01(r8)
            monitor-enter(r5)
            java.lang.String r4 = "AccountSwitchingDataRepo/deleteBackup/"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ all -> 0x013e }
            r3 = 0
            java.lang.String r0 = "accounts.bak"
            java.io.File r1 = r5.A04(r0)     // Catch:{ SecurityException -> 0x0111 }
            boolean r0 = r1.exists()     // Catch:{ SecurityException -> 0x0111 }
            if (r0 == 0) goto L_0x010b
            boolean r2 = r1.delete()     // Catch:{ SecurityException -> 0x0111 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ SecurityException -> 0x0111 }
            java.lang.String r0 = "AccountSwitchingDataRepo/deleteBackup/deleted backup file: "
            X.C18260x0.A1E(r0, r1, r2)     // Catch:{ SecurityException -> 0x0111 }
            goto L_0x0116
        L_0x010b:
            java.lang.String r0 = "AccountSwitchingDataRepo/deleteBackup/backup file does not exist"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ SecurityException -> 0x0111 }
            goto L_0x0117
        L_0x0111:
            r0 = move-exception
            com.whatsapp.util.Log.e(r4, r0)     // Catch:{ all -> 0x013e }
            goto L_0x0117
        L_0x0116:
            r3 = 1
        L_0x0117:
            monitor-exit(r5)
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "AccountSwitchingContentProvider/executeAccountSwitchingOps/deleteBackupResult:"
            X.C18260x0.A1E(r0, r1, r3)
            if (r10 == 0) goto L_0x0136
            int r0 = r10.length()
            if (r0 == 0) goto L_0x0136
            X.8qC r0 = r8.A0J
            if (r0 == 0) goto L_0x0137
            java.lang.Object r0 = r0.get()
            X.30A r0 = (X.AnonymousClass30A) r0
            r0.A04(r10)
        L_0x0136:
            return
        L_0x0137:
            java.lang.String r0 = "inactiveAccountNotificationManagerLazy"
            java.lang.RuntimeException r1 = X.C18270x1.A0S(r0)
            throw r1
        L_0x013e:
            r1 = move-exception
            monitor-exit(r5)
            throw r1
        L_0x0141:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0148:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x016d }
        L_0x014f:
            X.8qC r0 = r8.A0D     // Catch:{ all -> 0x016d }
            if (r0 == 0) goto L_0x0163
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x016d }
            X.2jM r0 = (X.C51152jM) r0     // Catch:{ all -> 0x016d }
            r0.A01()     // Catch:{ all -> 0x016d }
            java.lang.String r0 = "Could not create backup for accounts file"
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r0)     // Catch:{ all -> 0x016d }
            goto L_0x016c
        L_0x0163:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ all -> 0x016d }
            throw r0     // Catch:{ all -> 0x016d }
        L_0x016a:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x016d }
        L_0x016c:
            throw r0     // Catch:{ all -> 0x016d }
        L_0x016d:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x016f }
        L_0x016f:
            r1 = move-exception
            X.AnonymousClass2A8.A00(r2, r0)
            throw r1
        L_0x0174:
            java.lang.String r0 = "Checkpoint file already exists"
            java.lang.IllegalStateException r1 = X.AnonymousClass001.A0e(r0)
            throw r1
        L_0x017b:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.A0B(X.66S, java.lang.String, X.4GP):void");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:38|39|40|41|42|(2:43|44)) */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x0348, code lost:
        com.whatsapp.util.Log.i("AccountSwitchingContentProvider/call/kill process");
        com.whatsapp.util.Log.flush();
        android.os.Process.killProcess(android.os.Process.myPid());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x0357, code lost:
        return null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x05d3, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x05d4, code lost:
        com.whatsapp.util.Log.e("AccountSwitchingContentProvider/call/exception when handling account switching", r5);
        com.whatsapp.util.Log.i("AccountSwitchingContentProvider/recoverFromAccountSwitchingFailure");
        r0 = r10.A0D;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x05e0, code lost:
        if (r0 != null) goto L_0x05e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x05e2, code lost:
        ((X.C51152jM) r0.get()).A02(false);
        r4 = r10.A02;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x05ee, code lost:
        if (r4 != null) goto L_0x05f0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x05f0, code lost:
        r0 = r10.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x05f2, code lost:
        if (r0 != null) goto L_0x05f4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x05f4, code lost:
        r3 = (X.C614930z) X.C18300x5.A0b(r0);
        r2 = r10.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x05fc, code lost:
        if (r2 != null) goto L_0x05fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x05fe, code lost:
        r1 = (X.C613630k) X.C18300x5.A0b(A09());
        r0 = r10.A0C;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x060a, code lost:
        if (r0 != null) goto L_0x060c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:287:0x060c, code lost:
        A03(r3, r1, (X.AnonymousClass35Q) X.C18300x5.A0b(r0), r2, r4);
        r0 = getContext();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0619, code lost:
        if (r0 == null) goto L_0x061b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x061f, code lost:
        throw X.AnonymousClass001.A0e("Required value was null.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x0620, code lost:
        X.C38982Af.A00(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x0623, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x062a, code lost:
        throw X.C18270x1.A0S("accountSwitchingFileManager");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:296:0x0632, code lost:
        throw X.C18270x1.A0S("waSharedPreferences");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:298:0x0639, code lost:
        throw X.C18270x1.A0S("accountSwitcher");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x0641, code lost:
        throw X.C18270x1.A0S("storageUtils");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x0648, code lost:
        throw X.C18270x1.A0S("accountSwitchingRecoveryManager");
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:121:0x0220 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x00cd */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x0232 A[Catch:{ IllegalStateException -> 0x05d3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x02a5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.os.Bundle call(java.lang.String r11, java.lang.String r12, android.os.Bundle r13) {
        /*
            r10 = this;
            java.lang.String r3 = "AccountSwitchingContentProvider/call/remove account action/lid: "
            java.lang.String r6 = "kill_process"
            java.lang.String r9 = "Required value was null."
            r0 = 0
            X.C162457s7.A0J(r11, r0)
            java.lang.String r0 = "AccountSwitchingContentProvider/call"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r10.A08()
            X.2zf r5 = r10.A02     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r5 == 0) goto L_0x05c4
            X.8qC r0 = r10.A0A     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x05bd
            java.lang.Object r4 = X.C18300x5.A0b(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30z r4 = (X.C614930z) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            X.33p r2 = r10.A01     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r2 == 0) goto L_0x05b5
            X.8qC r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r1 = X.C18300x5.A0b(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30k r1 = (X.C613630k) r1     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0C     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x05ae
            java.lang.Object r0 = X.C18300x5.A0b(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.35Q r0 = (X.AnonymousClass35Q) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            A03(r4, r1, r0, r2, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r8 = r11.equals(r6)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r8 != 0) goto L_0x033d
            java.util.concurrent.CountDownLatch r6 = X.C18290x4.A14()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1im r0 = r10.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0324
            int r0 = r0.A04     // Catch:{ IllegalStateException -> 0x05d3 }
            r2 = 2
            boolean r4 = X.AnonymousClass000.A1U(r0, r2)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/isXmppConnected: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            r1.append(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = ", isXmppConnecting: "
            r1.append(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1im r0 = r10.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x031b
            int r0 = r0.A04     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = X.AnonymousClass001.A1T(r0)
            X.C18260x0.A1V(r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Wh r4 = r10.A07     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x0313
            r1 = 10
            X.5rU r0 = new X.5rU     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r10, r1, r6)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.C69253Wh.A01(r4, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.33S r0 = r10.A05     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x030a
            r0.A00()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Lt r1 = r10.A04     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r1 == 0) goto L_0x0302
            r0 = 12
            r5 = 0
            r1.A0F(r5, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0098 }
            r0 = 5
            boolean r0 = r6.await(r0, r4)     // Catch:{ InterruptedException -> 0x0098 }
            r5 = r0 ^ 1
            goto L_0x009e
        L_0x0098:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/exception while waiting for xmpp disconnect"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/xmpp disconnect timed out: "
            X.C18260x0.A1E(r0, r1, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0P     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x02f9
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2gy r0 = (X.C49712gy) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2d0 r6 = r0.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r6 == 0) goto L_0x00e3
            boolean r0 = r6.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 != 0) goto L_0x00e3
            r0 = 1
            r6.A00 = r0     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.ExecutorService r5 = r6.A02     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.shutdown()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00cd }
            r0 = 5
            r5.awaitTermination(r0, r4)     // Catch:{ InterruptedException -> 0x00cd }
        L_0x00cd:
            X.3f7 r0 = r6.A05     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.ThreadPoolExecutor r5 = r0.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.shutdown()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.5sm r0 = new X.5sm     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.setRejectedExecutionHandler(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x00e3 }
            r0 = 5
            r5.awaitTermination(r0, r4)     // Catch:{ InterruptedException -> 0x00e3 }
        L_0x00e3:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown waJobManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 5
            X.3dV r4 = r10.A03     // Catch:{ InterruptedException -> 0x010a }
            if (r4 == 0) goto L_0x0103
            r4.A05()     // Catch:{ InterruptedException -> 0x010a }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r4.A06     // Catch:{ InterruptedException -> 0x010a }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x010a }
            boolean r6 = r5.tryLock(r0, r4)     // Catch:{ InterruptedException -> 0x010a }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x010a }
            java.lang.String r4 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock acquired: "
            X.C18260x0.A1E(r4, r5, r6)     // Catch:{ InterruptedException -> 0x010a }
            goto L_0x0110
        L_0x0103:
            java.lang.String r4 = "messageStoreManager"
            java.lang.RuntimeException r4 = X.C18270x1.A0S(r4)     // Catch:{ InterruptedException -> 0x010a }
            throw r4     // Catch:{ InterruptedException -> 0x010a }
        L_0x010a:
            r5 = move-exception
            java.lang.String r4 = "AccountSwitchingContentProvider/disconnect/messageStoreManager lock exception"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0110:
            X.8qC r4 = r10.A0P     // Catch:{ InterruptedException -> 0x013e }
            if (r4 == 0) goto L_0x0136
            java.lang.Object r4 = r4.get()     // Catch:{ InterruptedException -> 0x013e }
            X.2gy r4 = (X.C49712gy) r4     // Catch:{ InterruptedException -> 0x013e }
            X.2d0 r4 = r4.A01()     // Catch:{ InterruptedException -> 0x013e }
            X.2xK r4 = r4.A08     // Catch:{ InterruptedException -> 0x013e }
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.A03     // Catch:{ InterruptedException -> 0x013e }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r4.writeLock()     // Catch:{ InterruptedException -> 0x013e }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x013e }
            boolean r6 = r5.tryLock(r0, r4)     // Catch:{ InterruptedException -> 0x013e }
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x013e }
            java.lang.String r4 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock acquired: "
            X.C18260x0.A1E(r4, r5, r6)     // Catch:{ InterruptedException -> 0x013e }
            goto L_0x0144
        L_0x0136:
            java.lang.String r4 = "waJobManager"
            java.lang.RuntimeException r4 = X.C18270x1.A0S(r4)     // Catch:{ InterruptedException -> 0x013e }
            throw r4     // Catch:{ InterruptedException -> 0x013e }
        L_0x013e:
            r5 = move-exception
            java.lang.String r4 = "AccountSwitchingContentProvider/disconnect/waJobManagerLockAcquired lock exception"
            com.whatsapp.util.Log.e(r4, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0144:
            X.8qC r4 = r10.A0O     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02f0
            java.lang.Object r4 = X.C18300x5.A0b(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.0y0 r4 = (X.C18630y0) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0L     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02e8
            java.lang.Object r4 = X.C18300x5.A0b(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.0y0 r4 = (X.C18630y0) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0F     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02e0
            java.lang.Object r4 = X.C18300x5.A0b(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.0y0 r4 = (X.C18630y0) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0K     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02d8
            java.lang.Object r4 = X.C18300x5.A0b(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.0y0 r4 = (X.C18630y0) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0N     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02cf
            java.lang.Object r4 = X.C18300x5.A0b(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.0y0 r4 = (X.C18630y0) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1RI r4 = r10.A09     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02c6
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0G     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02be
            java.lang.Object r4 = r4.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1R1 r4 = (X.AnonymousClass1R1) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1RG r4 = r4.A0G()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.C162457s7.A0D(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0H     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r4 == 0) goto L_0x02b6
            java.lang.Object r4 = r4.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2h8 r4 = (X.C49812h8) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            X.1RB r4 = r4.A00()     // Catch:{ IllegalStateException -> 0x05d3 }
            A04(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r4 = r10.A0M     // Catch:{ InterruptedException -> 0x01ea }
            if (r4 == 0) goto L_0x01e2
            java.lang.Object r6 = r4.get()     // Catch:{ InterruptedException -> 0x01ea }
            X.8EA r6 = (X.AnonymousClass8EA) r6     // Catch:{ InterruptedException -> 0x01ea }
            monitor-enter(r6)     // Catch:{ InterruptedException -> 0x01ea }
            X.1RD r4 = r6.A00     // Catch:{ all -> 0x01df }
            if (r4 != 0) goto L_0x01c8
            java.lang.String r0 = "PAY: PaymentStore/acquireWriteLock/dbHelper is null"
            com.whatsapp.util.Log.d((java.lang.String) r0)     // Catch:{ all -> 0x01df }
            monitor-exit(r6)     // Catch:{ InterruptedException -> 0x01ea }
            r4 = 0
            goto L_0x01d5
        L_0x01c8:
            java.util.concurrent.locks.ReentrantReadWriteLock r4 = r4.A05     // Catch:{ all -> 0x01df }
            java.util.concurrent.locks.ReentrantReadWriteLock$WriteLock r5 = r4.writeLock()     // Catch:{ all -> 0x01df }
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x01df }
            boolean r4 = r5.tryLock(r0, r4)     // Catch:{ all -> 0x01df }
            monitor-exit(r6)     // Catch:{ InterruptedException -> 0x01ea }
        L_0x01d5:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ InterruptedException -> 0x01ea }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/paymentStore lock acquired: "
            X.C18260x0.A1E(r0, r1, r4)     // Catch:{ InterruptedException -> 0x01ea }
            goto L_0x01f0
        L_0x01df:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ InterruptedException -> 0x01ea }
            goto L_0x01e9
        L_0x01e2:
            java.lang.String r0 = "paymentStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ InterruptedException -> 0x01ea }
        L_0x01e9:
            throw r0     // Catch:{ InterruptedException -> 0x01ea }
        L_0x01ea:
            r1 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/paymentStore lock exception"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x01f0:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.4FS r0 = r10.A08     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x02ad
            X.5sl r0 = new X.5sl     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8Tz r4 = X.C69423Wy.A05     // Catch:{ IllegalStateException -> 0x05d3 }
            r4.setRejectedExecutionHandler(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.ThreadPoolExecutor r7 = X.C69423Wy.A09     // Catch:{ IllegalStateException -> 0x05d3 }
            r7.setRejectedExecutionHandler(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            r4.shutdown()     // Catch:{ IllegalStateException -> 0x05d3 }
            r7.shutdown()     // Catch:{ IllegalStateException -> 0x05d3 }
            r6 = 0
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0220 }
            r0 = 1
            boolean r4 = r4.awaitTermination(r0, r5)     // Catch:{ InterruptedException -> 0x0220 }
            if (r4 == 0) goto L_0x0220
            boolean r0 = r7.awaitTermination(r0, r5)     // Catch:{ InterruptedException -> 0x0220 }
            if (r0 == 0) goto L_0x0220
            r6 = 1
        L_0x0220:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown worker threads terminated: "
            X.C18260x0.A1E(r0, r1, r6)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0E     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x02a5
            java.lang.Object r6 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2m9 r6 = (X.C52852m9) r6     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AsyncCommitManager/shutdown"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.<init>(r2)     // Catch:{ IllegalStateException -> 0x05d3 }
            r4 = 25
            X.3Zi r0 = X.C69963Zi.A00(r5, r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            r2 = 72
            r6.A01(r0, r2)     // Catch:{ IllegalStateException -> 0x05d3 }
            android.os.HandlerThread r1 = r6.A02     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0258
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0258:
            X.3Zi r0 = X.C69963Zi.A00(r5, r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.A02(r0, r2)     // Catch:{ IllegalStateException -> 0x05d3 }
            android.os.HandlerThread r1 = r6.A03     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x026a
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x026a:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x0271 }
            r0 = 1
            r5.await(r0, r2)     // Catch:{ InterruptedException -> 0x0271 }
        L_0x0271:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown asyncCommitManager completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref writes"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2Ra r6 = r10.A06     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r6 == 0) goto L_0x05cc
            boolean r0 = r6.A04     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 != 0) goto L_0x0338
            r0 = 1
            r6.A04 = r0     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.CountDownLatch r5 = new java.util.concurrent.CountDownLatch     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.<init>(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            android.os.Handler r4 = r6.A00     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 25
            X.3Zi r2 = X.C69963Zi.A00(r5, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 100
            r4.postDelayed(r2, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x032d }
            r0 = 1
            long r0 = r2.toMillis(r0)     // Catch:{ InterruptedException -> 0x032d }
            r5.await(r0, r2)     // Catch:{ InterruptedException -> 0x032d }
            goto L_0x032d
        L_0x02a5:
            java.lang.String r0 = "asyncCommitManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02ad:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02b6:
            java.lang.String r0 = "commerceDbManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02be:
            java.lang.String r0 = "chatSettingsStore"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02c6:
            java.lang.String r0 = "waDatabaseHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02cf:
            java.lang.String r0 = "stickersDbHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02d8:
            java.lang.String r0 = "locationDbHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02e0:
            java.lang.String r0 = "axolotlDbHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02e8:
            java.lang.String r0 = "mediaDbHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02f0:
            java.lang.String r0 = "syncDbHelper"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x02f9:
            java.lang.String r0 = "waJobManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x0302:
            java.lang.String r0 = "messageHandlerBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x030a:
            java.lang.String r0 = "sendMethods"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x0313:
            java.lang.String r0 = "mainThreadHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x031b:
            java.lang.String r0 = "xmppStateManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x0324:
            java.lang.String r0 = "xmppStateManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x032d:
            android.os.HandlerThread r1 = r6.A01     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = r1.isAlive()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0338
            r1.quitSafely()     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0338:
            java.lang.String r0 = "AccountSwitchingContentProvider/disconnect/shutdown light shared pref completed"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x033d:
            int r0 = r11.hashCode()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r1 = "switch_to_account_lid"
            r2 = 0
            switch(r0) {
                case -478190222: goto L_0x0358;
                case -274828254: goto L_0x0424;
                case 141981839: goto L_0x049c;
                case 318873029: goto L_0x04de;
                case 1594147470: goto L_0x0545;
                default: goto L_0x0348;
            }
        L_0x0348:
            java.lang.String r0 = "AccountSwitchingContentProvider/call/kill process"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            com.whatsapp.util.Log.flush()
            int r0 = android.os.Process.myPid()
            android.os.Process.killProcess(r0)
            return r2
        L_0x0358:
            java.lang.String r0 = "remove_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "AccountSwitchingContentProvider/call/remove account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Yy r6 = new X.3Yy     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30k r0 = X.C18530xp.A01(r10)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r1 = r0.A05()     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.element = r1     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r1 == 0) goto L_0x0572
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.C57072t2.A04(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Yy r5 = new X.3Yy     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r13 == 0) goto L_0x0386
            goto L_0x0388
        L_0x0386:
            r1 = r2
            goto L_0x038f
        L_0x0388:
            java.lang.String r0 = "remove_account_lid"
            java.lang.String r1 = r13.getString(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x038f:
            r5.element = r1     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r1 != 0) goto L_0x03a7
            X.8qC r0 = r10.A0A     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x056b
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30z r0 = (X.C614930z) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2nq r0 = r0.A01()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0566
            java.lang.String r1 = r0.A07     // Catch:{ IllegalStateException -> 0x05d3 }
            r5.element = r1     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x03a7:
            java.lang.StringBuilder r0 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.C57072t2.A04(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r1 = r6.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r0 = r5.element     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = X.C162457s7.A0P(r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x03be
            java.lang.String r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.element = r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x03be:
            X.8qC r0 = r10.A0C     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x055f
            java.lang.Object r7 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.35Q r7 = (X.AnonymousClass35Q) r7     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r4 = r6.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r3 = r5.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ IllegalStateException -> 0x05d3 }
            X.C18260x0.A0O(r4, r3)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/removeAndSwitchAccount/active:"
            X.C57072t2.A03(r0, r4, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "/removeLid:"
            X.C57072t2.A04(r0, r3, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/switchAccount/active:"
            X.C57072t2.A03(r0, r4, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "/inactive:"
            X.C57072t2.A04(r0, r3, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.5i8 r0 = new X.5i8     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r7, r3, r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Cw r1 = new X.3Cw     // Catch:{ IllegalStateException -> 0x05d3 }
            r1.<init>(r7, r0, r3)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3zi r0 = new X.3zi     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r10, r6, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
            r10.A0B(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 26
            if (r1 < r0) goto L_0x0348
            X.8qC r0 = r10.A09()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.util.List r0 = X.C613630k.A00(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = r0.isEmpty()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0348
            X.8qC r0 = r10.A0I     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0558
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2zr r0 = (X.C61192zr) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.A02()     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x0348
        L_0x0424:
            java.lang.String r0 = "switch_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Yy r7 = new X.3Yy     // Catch:{ IllegalStateException -> 0x05d3 }
            r7.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r13 == 0) goto L_0x043a
            goto L_0x043c
        L_0x043a:
            r3 = r2
            goto L_0x0440
        L_0x043c:
            java.lang.String r3 = r13.getString(r1)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0440:
            r7.element = r3     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r3 == 0) goto L_0x058a
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/call/switch account action/lid: "
            X.C57072t2.A04(r0, r3, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0A     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0583
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30z r0 = (X.C614930z) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2nq r8 = r0.A01()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r8 == 0) goto L_0x057e
            java.lang.Object r0 = r7.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r6 = r8.A07     // Catch:{ IllegalStateException -> 0x05d3 }
            boolean r0 = X.C162457s7.A0P(r0, r6)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x046d
            java.lang.String r0 = r10.A0A()     // Catch:{ IllegalStateException -> 0x05d3 }
            r7.element = r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x046d:
            X.8qC r0 = r10.A0C     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0577
            java.lang.Object r5 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.35Q r5 = (X.AnonymousClass35Q) r5     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r4 = r7.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/switchAccount/active:"
            X.C57072t2.A03(r0, r4, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "/inactive:"
            X.C57072t2.A04(r0, r6, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.5i8 r3 = new X.5i8     // Catch:{ IllegalStateException -> 0x05d3 }
            r3.<init>(r5, r6, r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r1 = r7.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3zh r0 = new X.3zh     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r10, r8, r7)     // Catch:{ IllegalStateException -> 0x05d3 }
            r10.A0B(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x0348
        L_0x049c:
            java.lang.String r0 = "add_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "AccountSwitchingContentProvider/call/add new account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0A     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x059b
            java.lang.Object r0 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.30z r0 = (X.C614930z) r0     // Catch:{ IllegalStateException -> 0x05d3 }
            X.2nq r5 = r0.A01()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r5 == 0) goto L_0x0596
            X.8qC r0 = r10.A0C     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x058f
            java.lang.Object r4 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.35Q r4 = (X.AnonymousClass35Q) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r3 = r5.A07     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/prepForAddingNewAccount/"
            X.C57072t2.A04(r0, r3, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 0
            X.4Iw r1 = new X.4Iw     // Catch:{ IllegalStateException -> 0x05d3 }
            r1.<init>(r4, r3, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.5yx r0 = new X.5yx     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r10, r5)     // Catch:{ IllegalStateException -> 0x05d3 }
            r10.A0B(r1, r2, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x0348
        L_0x04de:
            java.lang.String r0 = "abandon_add_account"
            boolean r0 = r11.equals(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x0348
            java.lang.String r0 = "AccountSwitchingContentProvider/call/abandon add account action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.3Yy r6 = new X.3Yy     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.<init>()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r13 == 0) goto L_0x04f3
            goto L_0x04f5
        L_0x04f3:
            r3 = r2
            goto L_0x04f9
        L_0x04f5:
            java.lang.String r3 = r13.getString(r1)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x04f9:
            r6.element = r3     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r3 == 0) goto L_0x0503
            int r0 = r3.length()     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 != 0) goto L_0x0511
        L_0x0503:
            X.30k r0 = X.C18530xp.A01(r10)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r3 = r0.A05()     // Catch:{ IllegalStateException -> 0x05d3 }
            r6.element = r3     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r3 != 0) goto L_0x0511
            goto L_0x05a2
        L_0x0511:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingContentProvider/call/abandon add account action/restore lid: "
            X.C57072t2.A04(r0, r3, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            X.8qC r0 = r10.A0C     // Catch:{ IllegalStateException -> 0x05d3 }
            if (r0 == 0) goto L_0x05a7
            java.lang.Object r5 = r0.get()     // Catch:{ IllegalStateException -> 0x05d3 }
            X.35Q r5 = (X.AnonymousClass35Q) r5     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r4 = r6.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.StringBuilder r1 = X.C18270x1.A0X(r4)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r0 = "AccountSwitchingFileManager/restoreAccount/"
            X.C57072t2.A04(r0, r4, r1)     // Catch:{ IllegalStateException -> 0x05d3 }
            r0 = 1
            X.4Iw r3 = new X.4Iw     // Catch:{ IllegalStateException -> 0x05d3 }
            r3.<init>(r5, r4, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.Object r1 = r6.element     // Catch:{ IllegalStateException -> 0x05d3 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ IllegalStateException -> 0x05d3 }
            X.5yy r0 = new X.5yy     // Catch:{ IllegalStateException -> 0x05d3 }
            r0.<init>(r10, r6)     // Catch:{ IllegalStateException -> 0x05d3 }
            r10.A0B(r3, r1, r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x0348
        L_0x0545:
            if (r8 == 0) goto L_0x0348
            java.lang.String r0 = "AccountSwitchingContentProvider/call/kill process action"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            com.whatsapp.util.Log.flush()     // Catch:{ IllegalStateException -> 0x05d3 }
            int r0 = android.os.Process.myPid()     // Catch:{ IllegalStateException -> 0x05d3 }
            android.os.Process.killProcess(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x0348
        L_0x0558:
            java.lang.String r0 = "inactiveAccountNotification"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x055f:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0566:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x056b:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0572:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x0577:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x057e:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x0583:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x058a:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x058f:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x0596:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x059b:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05a2:
            java.lang.IllegalStateException r0 = X.AnonymousClass001.A0e(r9)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x05a7:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05ae:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05b5:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x05bd:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05c4:
            java.lang.String r0 = "storageUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
            goto L_0x05d2
        L_0x05cc:
            java.lang.String r0 = "lightPreferencesDiskIoHandler"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05d2:
            throw r0     // Catch:{ IllegalStateException -> 0x05d3 }
        L_0x05d3:
            r5 = move-exception
            java.lang.String r0 = "AccountSwitchingContentProvider/call/exception when handling account switching"
            com.whatsapp.util.Log.e(r0, r5)
            java.lang.String r0 = "AccountSwitchingContentProvider/recoverFromAccountSwitchingFailure"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.8qC r0 = r10.A0D
            if (r0 == 0) goto L_0x0642
            java.lang.Object r1 = r0.get()
            X.2jM r1 = (X.C51152jM) r1
            r0 = 0
            r1.A02(r0)
            X.2zf r4 = r10.A02
            if (r4 == 0) goto L_0x063a
            X.8qC r0 = r10.A0A
            if (r0 == 0) goto L_0x0633
            java.lang.Object r3 = X.C18300x5.A0b(r0)
            X.30z r3 = (X.C614930z) r3
            X.33p r2 = r10.A01
            if (r2 == 0) goto L_0x062b
            X.8qC r0 = r10.A09()
            java.lang.Object r1 = X.C18300x5.A0b(r0)
            X.30k r1 = (X.C613630k) r1
            X.8qC r0 = r10.A0C
            if (r0 == 0) goto L_0x0624
            java.lang.Object r0 = X.C18300x5.A0b(r0)
            X.35Q r0 = (X.AnonymousClass35Q) r0
            A03(r3, r1, r0, r2, r4)
            android.content.Context r0 = r10.getContext()
            if (r0 != 0) goto L_0x0620
            java.lang.IllegalStateException r5 = X.AnonymousClass001.A0e(r9)
            throw r5
        L_0x0620:
            X.C38982Af.A00(r0, r5)
            throw r5
        L_0x0624:
            java.lang.String r0 = "accountSwitchingFileManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x062b:
            java.lang.String r0 = "waSharedPreferences"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0633:
            java.lang.String r0 = "accountSwitcher"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x063a:
            java.lang.String r0 = "storageUtils"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0642:
            java.lang.String r0 = "accountSwitchingRecoveryManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.accountswitching.AccountSwitchingContentProvider.call(java.lang.String, java.lang.String, android.os.Bundle):android.os.Bundle");
    }

    public int delete(Uri uri, String str, String[] strArr) {
        throw C18320x8.A0m();
    }

    public String getType(Uri uri) {
        throw C18320x8.A0m();
    }

    public Uri insert(Uri uri, ContentValues contentValues) {
        throw C18320x8.A0m();
    }

    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw C18320x8.A0m();
    }

    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw C18320x8.A0m();
    }
}
