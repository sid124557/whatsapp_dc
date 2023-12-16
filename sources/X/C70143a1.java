package X;

/* renamed from: X.3a1  reason: invalid class name and case insensitive filesystem */
public class C70143a1 implements Runnable {
    public Object A00;
    public Object A01;
    public final int A02;

    public C70143a1(Object obj, int i, Object obj2) {
        this.A02 = i;
        this.A00 = obj;
        this.A01 = obj2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:105:0x02eb, code lost:
        r6.A7E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x02ee, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:128:0x03e5, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x03e8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0474, code lost:
        r2.A0O(r1, r3.getString(r0));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x047b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x05ea, code lost:
        r3.A02.A02(new X.AnonymousClass3M4(r3, new X.C124366Bz(r6, r0)));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x05f9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x05fa, code lost:
        r2 = X.C18320x8.A07();
        r2.setClassName(r6.getPackageName(), "com.whatsapp.passkey.PasskeyCreateEducationScreen");
        r6.startActivityForResult(r2, 21);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x060c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x0643, code lost:
        r6.A7E();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x0646, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x065c, code lost:
        r1.A0C(r2, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0660, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a22, code lost:
        ((X.C89654ea) r1).Bon(r2, "CommunityExitDialogFragment");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a29, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0274, code lost:
        if (r1 != 403) goto L_0x0276;
     */
    /* JADX WARNING: Removed duplicated region for block: B:235:0x0688  */
    /* JADX WARNING: Removed duplicated region for block: B:245:0x06be  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r21 = this;
            r7 = r21
            int r0 = r7.A02
            switch(r0) {
                case 0: goto L_0x0105;
                case 1: goto L_0x023f;
                case 2: goto L_0x0250;
                case 3: goto L_0x02b2;
                case 4: goto L_0x028c;
                case 5: goto L_0x02ef;
                case 6: goto L_0x0377;
                case 7: goto L_0x03e9;
                case 8: goto L_0x0455;
                case 9: goto L_0x0465;
                case 10: goto L_0x047c;
                case 11: goto L_0x0495;
                case 12: goto L_0x04ab;
                case 13: goto L_0x04cb;
                case 14: goto L_0x0007;
                case 15: goto L_0x0007;
                case 16: goto L_0x04e6;
                case 17: goto L_0x056b;
                case 18: goto L_0x057b;
                case 19: goto L_0x060d;
                case 20: goto L_0x05cf;
                case 21: goto L_0x0647;
                case 22: goto L_0x0652;
                case 23: goto L_0x0661;
                case 24: goto L_0x06c2;
                case 25: goto L_0x070d;
                case 26: goto L_0x0726;
                case 27: goto L_0x0749;
                case 28: goto L_0x0755;
                case 29: goto L_0x0813;
                case 30: goto L_0x0834;
                case 31: goto L_0x0844;
                case 32: goto L_0x0864;
                case 33: goto L_0x0879;
                case 34: goto L_0x0899;
                case 35: goto L_0x08ab;
                case 36: goto L_0x08b9;
                case 37: goto L_0x08c5;
                case 38: goto L_0x0915;
                case 39: goto L_0x0934;
                case 40: goto L_0x0965;
                case 41: goto L_0x0973;
                case 42: goto L_0x097f;
                case 43: goto L_0x0999;
                case 44: goto L_0x09bc;
                case 45: goto L_0x09eb;
                case 46: goto L_0x0a04;
                case 47: goto L_0x0a2a;
                case 48: goto L_0x0a3e;
                case 49: goto L_0x0a58;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r2 = r7.A00
            com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller r2 = (com.whatsapp.registration.accountdefence.AccountDefenceFetchDeviceConfirmationPoller) r2
            java.lang.Object r1 = r7.A01
            X.7LJ r1 = (X.AnonymousClass7LJ) r1
            X.2oU r0 = r2.A04
            android.content.Context r0 = r0.A00
            java.lang.String r13 = r1.A02
            java.lang.String r14 = X.C57922uQ.A00(r0, r13)
            java.lang.String r0 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r7 = r2.A05
            X.8qC r5 = r7.A01
            android.content.SharedPreferences r4 = X.C18300x5.A0B(r5)
            java.lang.String r3 = "com.whatsapp.registration.RegisterPhone.mistyped_state"
            r0 = 0
            java.lang.String r10 = r4.getString(r3, r0)
            X.33i r3 = r2.A02
            android.telephony.TelephonyManager r4 = r3.A0N()
            if (r4 == 0) goto L_0x0061
            java.lang.String r3 = r4.getNetworkOperator()
        L_0x0039:
            X.34d r11 = X.AnonymousClass34d.A00(r3)
            if (r4 == 0) goto L_0x005f
            java.lang.String r3 = r4.getSimOperator()
        L_0x0043:
            X.34d r9 = X.AnonymousClass34d.A00(r3)
            android.content.SharedPreferences r6 = X.C18300x5.A0B(r5)
            r3 = 0
            java.lang.String r4 = "reg_attempts_fetch_device_confirmation"
            int r3 = r6.getInt(r4, r3)
            int r3 = r3 + 1
            X.C18260x0.A0L(r7, r4, r3)
            X.7Rl r8 = new X.7Rl
            r8.<init>(r3)
            r3 = -1
            goto L_0x0063
        L_0x005f:
            r3 = r0
            goto L_0x0043
        L_0x0061:
            r3 = r0
            goto L_0x0039
        L_0x0063:
            X.2sl r7 = r2.A06     // Catch:{ Exception -> 0x0952 }
            java.lang.String r12 = r1.A01     // Catch:{ Exception -> 0x0952 }
            android.content.SharedPreferences r5 = X.C18300x5.A0B(r5)     // Catch:{ Exception -> 0x0952 }
            java.lang.String r4 = "registration_failure_reason"
            java.lang.String r6 = X.AnonymousClass0x9.A0v(r5, r4)     // Catch:{ Exception -> 0x0952 }
            boolean r4 = r7.A0F()     // Catch:{ Exception -> 0x0952 }
            if (r4 != 0) goto L_0x007c
            r10 = 14
            r12 = 0
            goto L_0x00d9
        L_0x007c:
            r4 = 1
            r7.A0E(r4)     // Catch:{ Exception -> 0x0952 }
            byte[] r18 = r7.A0H(r12, r13)     // Catch:{ Exception -> 0x0952 }
            java.lang.String r4 = "fetchAccountDefenceDeviceConfirmation"
            byte[] r19 = r7.A0G(r4)     // Catch:{ Exception -> 0x0952 }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0952 }
            if (r10 == 0) goto L_0x0096
            java.lang.String r5 = "mistyped"
            X.C18280x3.A1B(r5, r10, r4)     // Catch:{ Exception -> 0x0952 }
        L_0x0096:
            java.lang.String r5 = "reason"
            X.C18280x3.A1B(r5, r6, r4)     // Catch:{ Exception -> 0x0952 }
            org.json.JSONObject r5 = r8.A00()     // Catch:{ Exception -> 0x0952 }
            byte[] r6 = X.AnonymousClass0x9.A1R(r5)     // Catch:{ Exception -> 0x0952 }
            java.lang.String r5 = "client_metrics"
            X.C56912sl.A00(r11, r9, r5, r6, r4)     // Catch:{ Exception -> 0x0952 }
            r7.A08(r4)     // Catch:{ Exception -> 0x0952 }
            X.5Zj r11 = r7.A0P     // Catch:{ Exception -> 0x0952 }
            java.lang.String r5 = "fetch_device_confirm_entrypoint"
            java.lang.String r15 = r7.A04(r12, r5)     // Catch:{ Exception -> 0x0952 }
            java.util.List r16 = r7.A05()     // Catch:{ Exception -> 0x0952 }
            X.2Ic r10 = r7.A0N     // Catch:{ Exception -> 0x0952 }
            r20 = 2
            X.68P r9 = new X.68P     // Catch:{ Exception -> 0x0952 }
            r17 = r4
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0952 }
            java.lang.Object r7 = X.C105935Wz.A00(r9)     // Catch:{ Exception -> 0x0952 }
            X.5Sz r7 = (X.C104955Sz) r7     // Catch:{ Exception -> 0x0952 }
            if (r7 != 0) goto L_0x00e2
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/result is null"
            com.whatsapp.util.Log.e((java.lang.String) r4)     // Catch:{ Exception -> 0x0952 }
            r2.A01(r0, r1)     // Catch:{ Exception -> 0x0952 }
            X.4DZ r4 = r1.A00     // Catch:{ Exception -> 0x0952 }
            r4.onError(r3)     // Catch:{ Exception -> 0x0952 }
            return
        L_0x00d9:
            X.5Sz r7 = new X.5Sz     // Catch:{ Exception -> 0x0952 }
            r9 = r0
            r8 = r0
            r11 = r3
            r13 = r12
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch:{ Exception -> 0x0952 }
        L_0x00e2:
            int r6 = r7.A00     // Catch:{ Exception -> 0x0952 }
            r5 = 14
            if (r6 != r5) goto L_0x00f3
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/wamsys initialization fails"
            com.whatsapp.util.Log.i((java.lang.String) r4)     // Catch:{ Exception -> 0x0952 }
            X.4DZ r4 = r1.A00     // Catch:{ Exception -> 0x0952 }
            r4.onError(r5)     // Catch:{ Exception -> 0x0952 }
            return
        L_0x00f3:
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0952 }
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/success status:"
            X.C18260x0.A0y(r4, r5, r6)     // Catch:{ Exception -> 0x0952 }
            r2.A01(r7, r1)     // Catch:{ Exception -> 0x0952 }
            X.4DZ r4 = r1.A00     // Catch:{ Exception -> 0x0952 }
            r4.BPS(r7)     // Catch:{ Exception -> 0x0952 }
            return
        L_0x0105:
            java.lang.Object r4 = r7.A00
            com.whatsapp.registration.EULA r4 = (com.whatsapp.registration.EULA) r4
            java.lang.Object r3 = r7.A01
            X.89B r3 = (X.AnonymousClass89B) r3
            X.5Gg r1 = r4.A0T
            java.lang.String r0 = "FoaBackupTokenRequester/requestFoaBackupToken"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2fQ r5 = r1.A00
            boolean r0 = r5.A01()
            if (r0 == 0) goto L_0x012a
            X.0xV r2 = new X.0xV
            r2.<init>()
            android.os.Bundle r1 = X.AnonymousClass002.A08()
            java.lang.String r0 = "com.facebook.GET_FOA_BACKUP_TOKEN"
            r5.A00(r2, r1, r0)
        L_0x012a:
            java.lang.String r0 = "EULA/retrieveBackupToken/try to retrieve token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r8 = r4.A09
            X.6Qj r7 = new X.6Qj
            r7.<init>(r4)
            r5 = 0
            X.7iN r6 = new X.7iN
            r6.<init>(r5)
            r0 = 1
            X.6Tj[] r1 = new X.C127806Tj[r0]
            X.6Tj r0 = X.C1461979a.A00
            r2 = 0
            r1[r2] = r0
            r6.A03 = r1
            X.89P r0 = new X.89P
            r0.<init>(r7)
            r6.A01 = r0
            r6.A02 = r2
            r0 = 1570(0x622, float:2.2E-42)
            r6.A00 = r0
            X.7Sp r0 = r6.A00()
            com.google.android.gms.tasks.Task r7 = r7.A02(r0, r2)
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0163 }
            r0 = 10
            com.google.android.gms.tasks.Tasks.await(r7, r0, r6)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0163 }
            goto L_0x0169
        L_0x0163:
            r1 = move-exception
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/exception receiving bytes"
            com.whatsapp.util.Log.e(r0, r1)
        L_0x0169:
            boolean r0 = r7.isSuccessful()
            r1 = 0
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r0 = r7.getResult()
            byte[] r0 = (byte[]) r0
            if (r0 == 0) goto L_0x01fe
            int r0 = r0.length
            if (r0 == 0) goto L_0x01fe
            java.lang.Object r7 = r7.getResult()
            byte[] r7 = (byte[]) r7
            java.lang.StringBuilder r6 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token success/saved token size is "
            r6.append(r0)
            int r1 = r7.length
            r6.append(r1)
            java.lang.String r0 = " bytes"
            X.C18260x0.A1L(r6, r0)
            X.AnonymousClass36Q.A04(r8, r5, r1)
            r0 = 1
            X.AnonymousClass36Q.A03(r4, r5, r7, r0)
        L_0x019a:
            r6 = 1
            java.io.File r1 = r4.getFilesDir()
            java.lang.String r0 = "backup_token"
            java.io.File r0 = X.AnonymousClass002.A0A(r1, r0)
            boolean r0 = r0.exists()
            if (r0 == 0) goto L_0x01be
            java.lang.String r0 = "EULA/retrieveBackupToken/successfully retrieved token from block store"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.33p r0 = r4.A09
            java.lang.String r2 = "block_store"
        L_0x01b4:
            android.content.SharedPreferences$Editor r1 = X.C18270x1.A03(r0)
            java.lang.String r0 = "backup_token_source"
            X.C18270x1.A0j(r1, r0, r2)
            return
        L_0x01be:
            if (r3 != 0) goto L_0x01c4
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/accountTransferClient is null"
            goto L_0x03e5
        L_0x01c4:
            java.lang.String r0 = "com.whatsapp"
            X.6Rd r1 = new X.6Rd
            r1.<init>(r0)
            X.6Q2 r0 = new X.6Q2
            r0.<init>(r1)
            com.google.android.gms.tasks.Task r3 = r3.A02(r0, r2)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0215 }
            r0 = 10
            com.google.android.gms.tasks.Tasks.await(r3, r0, r2)     // Catch:{ InterruptedException | ExecutionException | TimeoutException -> 0x0215 }
            boolean r0 = r3.isSuccessful()
            if (r0 == 0) goto L_0x0964
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/import successful"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r3.getResult()
            byte[] r1 = (byte[]) r1
            if (r1 == 0) goto L_0x0211
            int r0 = r1.length
            if (r0 == 0) goto L_0x0211
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/save imported token to backup_token file"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.AnonymousClass36Q.A03(r4, r5, r1, r6)
            X.33p r0 = r4.A09
            java.lang.String r2 = "device_to_device_transfer"
            goto L_0x01b4
        L_0x01fe:
            boolean r0 = r7.isSuccessful()
            if (r0 != 0) goto L_0x0208
            java.lang.Exception r1 = r7.getException()
        L_0x0208:
            X.AnonymousClass36Q.A04(r8, r1, r2)
            java.lang.String r0 = "BackupTokenUtils/retrieveBlockStore/Block Store token not retrieved"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x019a
        L_0x0211:
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/imported empty data"
            goto L_0x03e5
        L_0x0215:
            r2 = move-exception
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/error during import"
            com.whatsapp.util.Log.e(r0, r2)
            boolean r0 = r2 instanceof java.util.concurrent.ExecutionException
            if (r0 == 0) goto L_0x0239
            java.lang.Throwable r0 = r2.getCause()
            boolean r0 = r0 instanceof X.AnonymousClass6QV
            if (r0 == 0) goto L_0x0239
            java.lang.Throwable r0 = r2.getCause()
            com.google.android.gms.common.api.ApiException r0 = (com.google.android.gms.common.api.ApiException) r0
            com.google.android.gms.common.api.Status r0 = r0.mStatus
            int r1 = r0.A01
            r0 = 20501(0x5015, float:2.8728E-41)
            if (r1 != r0) goto L_0x0239
            java.lang.String r0 = "EULA/retrieveBackupToken/account transfer/NO_DATA_AVAILABLE exception"
            goto L_0x03e5
        L_0x0239:
            java.lang.String r0 = "EULA/create/exception during retrieving data from account transfer"
            com.whatsapp.util.Log.e(r0, r2)
            return
        L_0x023f:
            java.lang.Object r1 = r7.A00
            android.app.Dialog r1 = (android.app.Dialog) r1
            java.lang.Object r0 = r7.A01
            X.4GP r0 = (X.AnonymousClass4GP) r0
            r1.hide()
            if (r0 == 0) goto L_0x0964
            r0.invoke()
            return
        L_0x0250:
            java.lang.Object r4 = r7.A00
            com.whatsapp.registration.RegisterEmail r4 = (com.whatsapp.registration.RegisterEmail) r4
            java.lang.Object r1 = r7.A01
            java.lang.Number r1 = (java.lang.Number) r1
            r0 = 1
            X.C621433s.A00(r4, r0)
            if (r1 == 0) goto L_0x0276
            int r1 = r1.intValue()
            r0 = 533(0x215, float:7.47E-43)
            if (r1 != r0) goto L_0x0271
            X.5UY r1 = r4.A09
            if (r1 != 0) goto L_0x027b
            java.lang.String r0 = "invalidEmailViewStub"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0271:
            r0 = 403(0x193, float:5.65E-43)
            r2 = 3
            if (r1 == r0) goto L_0x0277
        L_0x0276:
            r2 = 2
        L_0x0277:
            X.C621433s.A01(r4, r2)
            goto L_0x027f
        L_0x027b:
            r0 = 0
            r1.A06(r0)
        L_0x027f:
            X.2eI r3 = r4.A74()
            java.lang.String r2 = r4.A0E
            int r1 = r4.A00
            r0 = 5
            r3.A01(r2, r1, r0)
            return
        L_0x028c:
            java.lang.Object r6 = r7.A00
            com.whatsapp.registration.RegisterName r6 = (com.whatsapp.registration.RegisterName) r6
            java.lang.Object r1 = r7.A01
            r0 = 22
            X.C621433s.A00(r6, r0)
            X.587 r0 = X.AnonymousClass587.DOES_NOT_HAVE_PASSKEY
            if (r1 == r0) goto L_0x05fa
            X.2hB r0 = r6.A0o
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x02eb
            java.lang.String r0 = "RegisterName//maybeShowRegistrationEmailCaptureScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r0 = 22
            X.C621433s.A01(r6, r0)
            X.2hB r3 = r6.A0o
            r0 = 7
            goto L_0x05ea
        L_0x02b2:
            java.lang.Object r6 = r7.A00
            com.whatsapp.registration.RegisterName r6 = (com.whatsapp.registration.RegisterName) r6
            java.lang.Object r2 = r7.A01
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "RegisterName//maybeShowRegistrationEmailCaptureScreen/result : "
            X.C18260x0.A1R(r1, r0, r2)
            r5 = 22
            X.C621433s.A00(r6, r5)
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x02eb
            if (r1 == 0) goto L_0x02eb
            java.lang.String r4 = X.C18280x3.A0Y()
            r3 = 8
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterEmail"
            r2.setClassName(r1, r0)
            X.C18310x6.A10(r2, r4, r3)
            r6.startActivityForResult(r2, r5)
            return
        L_0x02eb:
            r6.A7E()
            return
        L_0x02ef:
            java.lang.Object r4 = r7.A00
            X.317 r4 = (X.AnonymousClass317) r4
            java.lang.Object r3 = r7.A01
            com.whatsapp.Me r3 = (com.whatsapp.Me) r3
            X.2sr r0 = r4.A0I
            com.whatsapp.Me r10 = X.C56972sr.A00(r0)
            X.3Wi r7 = r4.A0H
            X.4FU r6 = r7.A00
            X.2oU r0 = r4.A0a
            android.content.Context r5 = r0.A00
            r8 = 2131887594(0x7f1205ea, float:1.94098E38)
            java.lang.Object[] r2 = X.AnonymousClass002.A0M()
            X.33j r9 = r4.A0e
            java.lang.String r1 = r3.cc
            java.lang.String r0 = r3.number
            java.lang.String r0 = X.AnonymousClass36l.A0C(r1, r0)
            java.lang.String r1 = r9.A0I(r0)
            r0 = 0
            r2[r0] = r1
            java.lang.String r1 = r10.cc
            java.lang.String r0 = r10.number
            java.lang.String r0 = X.AnonymousClass36l.A0C(r1, r0)
            java.lang.String r1 = r9.A0I(r0)
            r0 = 1
            java.lang.String r0 = X.AnonymousClass002.A0F(r5, r1, r2, r0, r8)
            r7.A0O(r6, r0)
            boolean r0 = X.AnonymousClass0YV.A0F(r5)
            if (r0 == 0) goto L_0x0964
            X.33p r0 = r4.A0c
            java.lang.String r0 = r0.A0X()
            if (r0 == 0) goto L_0x0964
            X.0N6 r0 = r4.A0Q
            java.lang.String r7 = r3.jabber_id
            X.0vR r5 = r0.A00()
            X.0hV r5 = (X.C10170hV) r5
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0964
            r0 = 0
            android.os.ConditionVariable r4 = new android.os.ConditionVariable
            r4.<init>(r0)
            X.0Z5 r3 = new X.0Z5
            r3.<init>(r4, r5)
            X.36r r6 = new X.36r
            r6.<init>()
            X.2oU r0 = r5.A06
            android.content.Context r2 = r0.A00
            r0 = 0
            android.content.Intent r1 = X.C627736r.A0t(r2, r0)
            r0 = 1
            r2.bindService(r1, r3, r0)
            X.4FS r0 = r5.A0A
            X.0md r2 = new X.0md
            r2.<init>(r3, r4, r5, r6, r7)
            r0.BkM(r2)
            return
        L_0x0377:
            java.lang.Object r5 = r7.A00
            X.317 r5 = (X.AnonymousClass317) r5
            java.lang.Object r7 = r7.A01
            android.content.Context r7 = (android.content.Context) r7
            X.33p r4 = r5.A0c
            r6 = 0
            X.8qC r2 = r4.A01
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r2)
            java.lang.String r0 = "migration_state_on_provider_side"
            int r0 = r1.getInt(r0, r6)
            r8 = 1
            boolean r3 = X.AnonymousClass000.A1S(r0)
            X.C626936e.A00()
            android.content.SharedPreferences r0 = X.C18300x5.A0B(r2)
            java.lang.String r2 = "registration_biz_registered_on_device"
            boolean r0 = r0.getBoolean(r2, r6)
            if (r0 == 0) goto L_0x03b1
            android.content.pm.PackageManager r1 = r7.getPackageManager()
            java.lang.String r0 = "com.whatsapp.w4b"
            r1.getPackageInfo(r0, r6)     // Catch:{ NameNotFoundException -> 0x03ae }
            goto L_0x03e3
        L_0x03ae:
            X.C18270x1.A0v(r4, r2, r6)
        L_0x03b1:
            if (r3 != 0) goto L_0x03e3
            X.1iO r0 = r5.A0F
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0964
            r0 = 2131891321(0x7f121479, float:1.9417359E38)
            java.lang.String r4 = r7.getString(r0)
            r0 = 2131891319(0x7f121477, float:1.9417355E38)
            java.lang.String r3 = r7.getString(r0)
            r2 = 2131891318(0x7f121476, float:1.9417353E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r0 = 2131895980(0x7f1226ac, float:1.9426808E38)
            java.lang.String r0 = r7.getString(r0)
            java.lang.String r0 = X.AnonymousClass002.A0F(r7, r0, r1, r6, r2)
            X.0Ue r2 = r5.A02(r4, r3, r0)
            X.33T r1 = r5.A0b
            r0 = 20
            X.AnonymousClass33T.A03(r2, r1, r0)
            return
        L_0x03e3:
            java.lang.String r0 = "RegistrationManager/showLoginFailureNotificationIfNeeded/notification was suppressed by smb registration"
        L_0x03e5:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            return
        L_0x03e9:
            java.lang.Object r3 = r7.A00
            X.317 r3 = (X.AnonymousClass317) r3
            java.lang.Object r5 = r7.A01
            X.2fb r5 = (X.C48862fb) r5
            X.3Wi r2 = r3.A0H
            X.4FU r1 = r2.A00
            if (r1 == 0) goto L_0x0442
            boolean r0 = r1.BHW()
            if (r0 != 0) goto L_0x0442
            boolean r0 = r1 instanceof X.C89654ea
            if (r0 == 0) goto L_0x0442
            boolean r0 = r1 instanceof X.AnonymousClass47t
            r4 = r0 ^ 1
            if (r4 == 0) goto L_0x0443
            X.4FU r0 = r2.A00
            boolean r0 = X.C621533t.A00(r0, r5)
            if (r0 == 0) goto L_0x0443
            java.lang.ref.WeakReference r0 = r3.A00
            if (r0 == 0) goto L_0x0432
            X.1VX r2 = r3.A0m
            r1 = 3159(0xc57, float:4.427E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0432
            java.lang.ref.WeakReference r0 = r3.A00
            java.lang.Object r1 = r0.get()
            androidx.fragment.app.DialogFragment r1 = (androidx.fragment.app.DialogFragment) r1
            if (r1 == 0) goto L_0x0432
            boolean r0 = r1.A19()
            if (r0 == 0) goto L_0x0432
            r1.A1L()
        L_0x0432:
            X.2dr r1 = r3.A0O
            r0 = 0
            r1.A01(r0)
            X.33T r2 = r3.A0b
            r1 = 52
            java.lang.String r0 = "NewRequestDisplayed"
            r2.A05(r1, r0)
            return
        L_0x0442:
            r4 = 0
        L_0x0443:
            java.lang.String r0 = "RegistrationManager/showDeviceConfirmationOverlayAlertOrNotify/Couldn't show account logout dialog - showing system notification instead"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.4FS r2 = r3.A0z
            r1 = 39
            X.5sI r0 = new X.5sI
            r0.<init>(r3, r5, r1, r4)
            r2.BkM(r0)
            return
        L_0x0455:
            java.lang.Object r0 = r7.A00
            X.317 r0 = (X.AnonymousClass317) r0
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            X.3Wi r2 = r0.A0H
            X.4FU r1 = r2.A00
            r0 = 2131887593(0x7f1205e9, float:1.9409797E38)
            goto L_0x0474
        L_0x0465:
            java.lang.Object r0 = r7.A00
            X.317 r0 = (X.AnonymousClass317) r0
            java.lang.Object r3 = r7.A01
            android.content.Context r3 = (android.content.Context) r3
            X.3Wi r2 = r0.A0H
            X.4FU r1 = r2.A00
            r0 = 2131887559(0x7f1205c7, float:1.9409729E38)
        L_0x0474:
            java.lang.String r0 = r3.getString(r0)
            r2.A0O(r1, r0)
            return
        L_0x047c:
            java.lang.Object r2 = r7.A01
            com.whatsapp.registration.VerifyPhoneNumber r2 = (com.whatsapp.registration.VerifyPhoneNumber) r2
            int r1 = r2.A74()
            r0 = 13
            if (r1 == r0) goto L_0x048c
            r0 = 14
            if (r1 != r0) goto L_0x0490
        L_0x048c:
            r0 = 2
            r2.A7T(r0)
        L_0x0490:
            r0 = 1
            r2.A88(r0)
            return
        L_0x0495:
            java.lang.Object r2 = r7.A00
            com.whatsapp.registration.VerifyPhoneNumber r2 = (com.whatsapp.registration.VerifyPhoneNumber) r2
            java.lang.Object r1 = r7.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            java.lang.String r0 = "VerifyPhoneNumber/edit"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            if (r1 == 0) goto L_0x04a7
            r1.run()
        L_0x04a7:
            r2.A7L()
            return
        L_0x04ab:
            java.lang.Object r1 = r7.A00
            X.6Bj r1 = (X.C124206Bj) r1
            java.lang.Object r0 = r7.A01
            X.5Sz r0 = (X.C104955Sz) r0
            java.lang.Object r1 = r1.A00
            com.whatsapp.registration.VerifyPhoneNumber r1 = (com.whatsapp.registration.VerifyPhoneNumber) r1
            java.lang.String r2 = r1.A1B
            java.lang.String r3 = r1.A1E
            java.lang.String r4 = r0.A02
            boolean r7 = r0.A05
            boolean r8 = r0.A04
            r5 = 0
            r9 = 0
            r6 = -1
            r1.A86(r2, r3, r4, r5, r6, r7, r8, r9)
            r1.A7Q()
            return
        L_0x04cb:
            java.lang.Object r3 = r7.A00
            com.whatsapp.registration.VerifyTwoFactorAuth r3 = (com.whatsapp.registration.VerifyTwoFactorAuth) r3
            java.lang.Object r2 = r7.A01
            X.5LR r2 = (X.AnonymousClass5LR) r2
            java.lang.String r0 = "VerifyTwoFactorAuth/onSecurityCheckResponse/dismiss-verification-complete-dialog"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            boolean r0 = r2.A0E
            if (r0 == 0) goto L_0x04e4
            java.lang.String r1 = r3.A0X
        L_0x04de:
            java.lang.String r0 = r2.A07
            r3.A79(r1, r0)
            return
        L_0x04e4:
            r1 = 0
            goto L_0x04de
        L_0x04e6:
            java.lang.Object r3 = r7.A00
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment r3 = (com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment) r3
            java.lang.Object r0 = r7.A01
            X.2fb r0 = (X.C48862fb) r0
            com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06 = r0
            android.view.View r1 = r3.A00
            r0 = 2131431578(0x7f0b109a, float:1.848489E38)
            android.widget.TextView r5 = X.C18300x5.A0G(r1, r0)
            X.2fb r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            long r1 = r0.A00
            java.util.Date r0 = new java.util.Date
            r0.<init>(r1)
            X.2sH r4 = r3.A04
            X.33j r2 = r3.A01
            long r0 = r0.getTime()
            long r0 = r4.A0I(r0)
            java.lang.CharSequence r0 = X.C107565bW.A03(r2, r0)
            r5.setText(r0)
            android.view.View r1 = r3.A00
            r0 = 2131431579(0x7f0b109b, float:1.8484891E38)
            android.widget.TextView r4 = X.C18300x5.A0G(r1, r0)
            X.2fb r0 = com.whatsapp.registration.accountdefence.ui.DeviceConfirmationRegAlertDialogFragment.A06
            java.lang.String r0 = r0.A01
            if (r0 != 0) goto L_0x055b
            r1 = 2131886216(0x7f120088, float:1.9407005E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r0 = r0.getString(r1)
        L_0x052f:
            r4.setText(r0)
            android.view.View r1 = r3.A00
            r0 = 2131431084(0x7f0b0eac, float:1.8483887E38)
            android.view.View r1 = X.C06560Yg.A02(r1, r0)
            r0 = 4
            r1.setVisibility(r0)
            android.view.View r1 = r3.A00
            r0 = 2131431581(0x7f0b109d, float:1.8484895E38)
            android.view.View r0 = X.C06560Yg.A02(r1, r0)
            r1 = 0
            r0.setVisibility(r1)
            android.widget.Button r0 = r3.A02
            if (r0 == 0) goto L_0x0553
            r0.setVisibility(r1)
        L_0x0553:
            android.widget.Button r0 = r3.A01
            if (r0 == 0) goto L_0x0964
            r0.setVisibility(r1)
            return
        L_0x055b:
            java.lang.Object[] r2 = X.AnonymousClass000.A1b(r0)
            r1 = 2131886215(0x7f120087, float:1.9407003E38)
            android.content.res.Resources r0 = X.C08310eF.A09(r3)
            java.lang.String r0 = r0.getString(r1, r2)
            goto L_0x052f
        L_0x056b:
            java.lang.Object r0 = r7.A00
            com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver r0 = (com.whatsapp.registration.directmigration.MigrationProviderOrderedBroadcastReceiver) r0
            java.lang.Object r2 = r7.A01
            android.content.Context r2 = (android.content.Context) r2
            X.0XM r1 = r0.A03
            X.2fR r0 = r0.A07
            X.C06550Ye.A0D(r2, r1, r0)
            return
        L_0x057b:
            java.lang.Object r4 = r7.A00
            X.2s5 r4 = (X.C56502s5) r4
            java.lang.Object r3 = r7.A01
            X.2eZ r3 = (X.C48232eZ) r3
            X.8qC r0 = r4.A03
            java.lang.Object r2 = r0.get()
            X.2sl r2 = (X.C56912sl) r2
            monitor-enter(r4)
            X.8qC r1 = r4.A04     // Catch:{ all -> 0x05cc }
            X.33p r0 = X.C18320x8.A0J(r1)     // Catch:{ all -> 0x05cc }
            java.lang.String r5 = r0.A0Z()     // Catch:{ all -> 0x05cc }
            android.text.TextUtils.isEmpty(r5)     // Catch:{ all -> 0x05cc }
            monitor-exit(r4)
            monitor-enter(r4)
            X.33p r0 = X.C18320x8.A0J(r1)     // Catch:{ all -> 0x05cc }
            java.lang.String r6 = r0.A0b()     // Catch:{ all -> 0x05cc }
            android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x05cc }
            monitor-exit(r4)
            java.lang.String r7 = "unknown"
            java.util.Map r10 = r3.A00
            boolean r0 = r2.A0F()
            if (r0 == 0) goto L_0x0964
            byte[] r11 = r2.A0H(r5, r6)
            java.lang.String r0 = "sendClientFunnelLog"
            byte[] r12 = r2.A0G(r0)
            X.5Zj r4 = r2.A0P
            X.2Ic r3 = r2.A0N
            X.6qc r2 = new X.6qc
            r9 = r7
            r8 = r7
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            X.C105935Wz.A00(r2)
            return
        L_0x05cc:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x05cf:
            java.lang.Object r6 = r7.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r6 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r6
            java.lang.Object r1 = r7.A01
            X.587 r0 = X.AnonymousClass587.DOES_NOT_HAVE_PASSKEY
            if (r1 == r0) goto L_0x05fa
            X.2hB r0 = r6.A0Z
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x0643
            java.lang.String r0 = "ProfileCheckpointRegisterName/maybeShowRegistrationEmailCaptureScreen"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2hB r3 = r6.A0Z
            r0 = 12
        L_0x05ea:
            X.6Bz r2 = new X.6Bz
            r2.<init>(r6, r0)
            X.5TX r1 = r3.A02
            X.3M4 r0 = new X.3M4
            r0.<init>(r3, r2)
            r1.A02(r0)
            return
        L_0x05fa:
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.passkey.PasskeyCreateEducationScreen"
            r2.setClassName(r1, r0)
            r0 = 21
            r6.startActivityForResult(r2, r0)
            return
        L_0x060d:
            java.lang.Object r6 = r7.A00
            com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName r6 = (com.whatsapp.registration.profilecheckpoint.ProfileCheckpointRegisterName) r6
            java.lang.Object r2 = r7.A01
            java.lang.Number r2 = (java.lang.Number) r2
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "ProfileCheckpointRegisterName/maybeShowRegistrationEmailCaptureScreen/result : "
            X.C18260x0.A1R(r1, r0, r2)
            int r1 = r2.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0643
            if (r1 == 0) goto L_0x0643
            java.lang.String r4 = X.C18280x3.A0Y()
            r3 = 8
            android.content.Intent r2 = X.C18320x8.A07()
            java.lang.String r1 = r6.getPackageName()
            java.lang.String r0 = "com.whatsapp.registration.RegisterEmail"
            r2.setClassName(r1, r0)
            X.C18310x6.A10(r2, r4, r3)
            r0 = 22
            r6.startActivityForResult(r2, r0)
            return
        L_0x0643:
            r6.A7E()
            return
        L_0x0647:
            java.lang.Object r0 = r7.A00
            X.3Lm r0 = (X.C66453Lm) r0
            java.lang.Object r2 = r7.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A0B
            goto L_0x065c
        L_0x0652:
            java.lang.Object r0 = r7.A00
            X.1gH r0 = (X.AnonymousClass1gH) r0
            java.lang.Object r2 = r7.A01
            X.34x r2 = (X.C624134x) r2
            X.1io r1 = r0.A02
        L_0x065c:
            r0 = -1
            r1.A0C(r2, r0)
            return
        L_0x0661:
            java.lang.Object r5 = r7.A00
            com.whatsapp.report.ReportActivity r5 = (com.whatsapp.report.ReportActivity) r5
            java.lang.Object r3 = r7.A01
            X.20h r3 = (X.C369320h) r3
            X.3Wi r0 = r5.A05
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0964
            X.20h r4 = X.C369320h.ACCOUNT
            r2 = r4
            if (r3 != r4) goto L_0x06b9
            X.20h r4 = X.C369320h.NEWSLETTER
        L_0x0678:
            X.8qC r0 = r5.A0F
        L_0x067a:
            java.lang.Object r0 = r0.get()
            X.3Lm r0 = (X.C66453Lm) r0
            X.21u r1 = r0.A04()
            X.21u r0 = X.C373221u.NONE
            if (r1 == r0) goto L_0x06be
            X.0zH r3 = X.AnonymousClass5V0.A00(r5)
            r0 = 2131887431(0x7f120547, float:1.9409469E38)
            if (r4 != r2) goto L_0x0694
            r0 = 2131887426(0x7f120542, float:1.9409459E38)
        L_0x0694:
            r3.A0U(r0)
            r0 = 2131887430(0x7f120546, float:1.9409467E38)
            if (r4 != r2) goto L_0x069f
            r0 = 2131887425(0x7f120541, float:1.9409457E38)
        L_0x069f:
            r3.A0T(r0)
            r2 = 2131887433(0x7f120549, float:1.9409473E38)
            r1 = 4
            X.92o r0 = new X.92o
            r0.<init>(r4, r1, r5)
            r3.A0d(r5, r0, r2)
            r1 = 2131888728(0x7f120a58, float:1.94121E38)
            r0 = 0
            r3.A0c(r5, r0, r1)
            r3.A0S()
            return
        L_0x06b9:
            if (r3 == r4) goto L_0x0678
            X.8qC r0 = r5.A0E
            goto L_0x067a
        L_0x06be:
            r5.A77(r3)
            return
        L_0x06c2:
            java.lang.Object r5 = r7.A00
            com.whatsapp.report.ReportActivity r5 = (com.whatsapp.report.ReportActivity) r5
            java.lang.Object r6 = r7.A01
            X.3Lm r6 = (X.C66453Lm) r6
            X.3Wi r0 = r5.A05
            boolean r0 = r0.A0Y()
            if (r0 == 0) goto L_0x0964
            X.20h r1 = r6.A0H
            r0 = 2
            r5.A78(r1, r0)
            X.20h r0 = X.C369320h.NEWSLETTER
            if (r1 != r0) goto L_0x0709
            X.1nF r0 = r6.A02()
            if (r0 == 0) goto L_0x0706
            long r3 = r0.A00
        L_0x06e4:
            int r0 = r6.A01
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0709
            X.1nF r0 = r6.A02()
            if (r0 == 0) goto L_0x0703
            long r2 = r0.A00
        L_0x06f3:
            r1 = 2
            X.6By r0 = new X.6By
            r0.<init>(r6, r1, r5)
            com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment r1 = new com.whatsapp.report.DownloadLargeNewsletterReportFileConfirmationDialogFragment
            r1.<init>(r0, r2)
            r0 = 0
            r5.Bon(r1, r0)
            return
        L_0x0703:
            r2 = 0
            goto L_0x06f3
        L_0x0706:
            r3 = 0
            goto L_0x06e4
        L_0x0709:
            r6.A0A(r5)
            return
        L_0x070d:
            java.lang.Object r3 = r7.A00
            com.whatsapp.report.ReportActivity r3 = (com.whatsapp.report.ReportActivity) r3
            java.lang.Object r2 = r7.A01
            X.20h r2 = (X.C369320h) r2
            com.whatsapp.report.ShareReportConfirmationDialogFragment r1 = new com.whatsapp.report.ShareReportConfirmationDialogFragment
            r1.<init>()
            X.3UM r0 = new X.3UM
            r0.<init>(r2, r3)
            r1.A00 = r0
            r0 = 0
            r3.Bon(r1, r0)
            return
        L_0x0726:
            java.lang.Object r0 = r7.A00
            X.3T6 r0 = (X.AnonymousClass3T6) r0
            java.lang.Object r4 = r7.A01
            X.7xn r4 = (X.C165887xn) r4
            X.5Gj r0 = r0.A00
            com.whatsapp.report.BusinessActivityReportViewModel r3 = r0.A00
            X.2qI r2 = r3.A05
            int r1 = r2.A00()
            r0 = 4
            if (r1 == r0) goto L_0x0745
            r2.A03(r4)
            X.08M r1 = r3.A02
            r0 = 2
            X.C06270Wx.A03(r1, r0)
            return
        L_0x0745:
            com.whatsapp.report.BusinessActivityReportViewModel.A00(r3)
            return
        L_0x0749:
            java.lang.Object r1 = r7.A00
            X.4BI r1 = (X.AnonymousClass4BI) r1
            java.lang.Object r0 = r7.A01
            X.2i6 r0 = (X.C50392i6) r0
            r1.Ban(r0)
            return
        L_0x0755:
            java.lang.Object r10 = r7.A00
            X.30F r10 = (X.AnonymousClass30F) r10
            java.lang.Object r3 = r7.A01
            X.1mX r3 = (X.C30491mX) r3
            java.lang.String r0 = "scheduled-call/onScheduledCallMessageAdded execute on worker thread"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.2qK r6 = r10.A08
            X.2z0 r9 = r3.A1J
            X.4uZ r7 = r9.A00
            java.lang.String r0 = "chat jid shouldn't be null"
            X.C626936e.A07(r7, r0)
            boolean r15 = r9.A02
            if (r15 == 0) goto L_0x0785
            X.2sr r0 = r6.A00
            com.whatsapp.jid.PhoneUserJid r4 = X.C56972sr.A04(r0)
        L_0x0778:
            java.lang.String r0 = "sender jid shouldn't be null"
            X.C626936e.A07(r4, r0)
            X.3dV r0 = r6.A05
            X.4Fq r8 = r0.A04()
            goto L_0x078a
        L_0x0785:
            com.whatsapp.jid.UserJid r4 = r3.A0o()
            goto L_0x0778
        L_0x078a:
            r0 = 9
            android.content.ContentValues r5 = X.AnonymousClass0x9.A07(r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r2 = "creation_message_row_id"
            long r0 = r3.A1L     // Catch:{ all -> 0x0809 }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r1 = "key_id"
            java.lang.String r0 = r9.A01     // Catch:{ all -> 0x0809 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r0 = "key_from_me"
            X.AnonymousClass0x2.A0o(r5, r0, r15)     // Catch:{ all -> 0x0809 }
            java.lang.String r2 = "key_chat_row_id"
            X.2sm r0 = r6.A03     // Catch:{ all -> 0x0809 }
            long r0 = r0.A07(r7)     // Catch:{ all -> 0x0809 }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r1 = "call_type"
            int r0 = r3.A00     // Catch:{ all -> 0x0809 }
            X.C18270x1.A0b(r5, r1, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r2 = "scheduled_timestamp"
            long r0 = r3.A01     // Catch:{ all -> 0x0809 }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r1 = "call_title"
            java.lang.String r0 = r3.A02     // Catch:{ all -> 0x0809 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r2 = "creator_jid_row_id"
            X.34p r0 = r6.A04     // Catch:{ all -> 0x0809 }
            long r0 = r0.A05(r4)     // Catch:{ all -> 0x0809 }
            X.C18270x1.A0c(r5, r2, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r1 = "is_upcoming"
            java.lang.Boolean r0 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0809 }
            r5.put(r1, r0)     // Catch:{ all -> 0x0809 }
            java.lang.String r0 = "call_log_row_id"
            r5.putNull(r0)     // Catch:{ all -> 0x0809 }
            r0 = r8
            X.3H0 r0 = (X.AnonymousClass3H0) r0     // Catch:{ all -> 0x0809 }
            X.2sg r4 = r0.A03     // Catch:{ all -> 0x0809 }
            java.lang.String r2 = "scheduled_calls"
            r1 = 5
            java.lang.String r0 = "ScheduledCallsStore/insert"
            r4.A0C(r2, r0, r5, r1)     // Catch:{ all -> 0x0809 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ all -> 0x0809 }
            java.lang.String r0 = "ScheduledCallsStore/insertOnCurrentThread/inserted; messageScheduledCall.row_id="
            r2.append(r0)     // Catch:{ all -> 0x0809 }
            long r0 = r3.A1L     // Catch:{ all -> 0x0809 }
            X.C18260x0.A1I(r2, r0)     // Catch:{ all -> 0x0809 }
            r8.close()
            long r11 = r3.A1L
            long r13 = r3.A01
            r10.A01(r11, r13, r15)
            X.3Wi r1 = r10.A00
            r0 = 29
            X.C69263Wi.A05(r1, r10, r3, r0)
            return
        L_0x0809:
            r1 = move-exception
            r8.close()     // Catch:{ all -> 0x080e }
            throw r1
        L_0x080e:
            r0 = move-exception
            r1.addSuppressed(r0)
            throw r1
        L_0x0813:
            java.lang.Object r0 = r7.A00
            X.30F r0 = (X.AnonymousClass30F) r0
            java.lang.Object r1 = r7.A01
            X.34x r1 = (X.C624134x) r1
            X.1iZ r0 = r0.A0A
            long r3 = r1.A1L
            r2 = 0
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0824:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0964
            java.lang.Object r0 = r1.next()
            X.4Ee r0 = (X.C84904Ee) r0
            r0.Avq(r3, r2)
            goto L_0x0824
        L_0x0834:
            java.lang.Object r1 = r7.A00
            X.1id r1 = (X.C29321id) r1
            java.lang.Object r0 = r7.A01
            X.33i r0 = (X.C620633i) r0
            boolean r0 = X.C18520xo.A00(r0)
            r1.A08(r0)
            return
        L_0x0844:
            java.lang.Object r4 = r7.A00
            com.whatsapp.search.SearchFragment r4 = (com.whatsapp.search.SearchFragment) r4
            java.lang.Object r3 = r7.A01
            X.4uZ r3 = (X.C95814uZ) r3
            com.whatsapp.search.SearchViewModel r0 = r4.A1c
            int r1 = r0.A0G(r3)
            r0 = 5
            if (r1 != r0) goto L_0x0861
            java.lang.String r2 = "business_search"
        L_0x0857:
            X.2n3 r1 = r4.A0x
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A03(r3)
            X.C53412n3.A00(r1, r0, r2)
            return
        L_0x0861:
            java.lang.String r2 = "global_search_new_chat"
            goto L_0x0857
        L_0x0864:
            java.lang.Object r2 = r7.A00
            com.whatsapp.search.SearchFragment r2 = (com.whatsapp.search.SearchFragment) r2
            java.lang.Object r0 = r7.A01
            java.lang.Number r0 = (java.lang.Number) r0
            androidx.recyclerview.widget.RecyclerView r1 = r2.A04
            int r0 = r0.intValue()
            r1.A0Z(r0)
            r2.A1L()
            return
        L_0x0879:
            java.lang.Object r0 = r7.A00
            X.69r r0 = (X.C1237669r) r0
            java.lang.Object r1 = r7.A01
            X.4uZ r1 = (X.C95814uZ) r1
            java.lang.Object r0 = r0.A00
            com.whatsapp.search.SearchFragment r0 = (com.whatsapp.search.SearchFragment) r0
            com.whatsapp.search.SearchFragment.A00(r1, r0)
            com.whatsapp.search.SearchViewModel r2 = r0.A1c
            X.5dZ r0 = r2.A0M()
            if (r0 == 0) goto L_0x0964
            r1 = 2
            int r0 = r0.A01
            if (r1 != r0) goto L_0x0964
            r2.A0P()
            return
        L_0x0899:
            java.lang.Object r0 = r7.A00
            com.whatsapp.search.SearchViewModel r0 = (com.whatsapp.search.SearchViewModel) r0
            java.lang.Object r2 = r7.A01
            X.08J r1 = r0.A02
            java.lang.Object r0 = r1.A07()
            if (r0 != 0) goto L_0x0964
            r1.A0H(r2)
            return
        L_0x08ab:
            java.lang.Object r0 = r7.A00
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r7.A01
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            android.os.Handler r0 = r0.A00
            r0.removeCallbacks(r1)
            return
        L_0x08b9:
            java.lang.Object r0 = r7.A00
            com.whatsapp.service.RestoreChatConnectionWorker r0 = (com.whatsapp.service.RestoreChatConnectionWorker) r0
            java.lang.Object r1 = r7.A01
            X.1im r0 = r0.A03
            r0.A07(r1)
            return
        L_0x08c5:
            java.lang.Object r0 = r7.A00
            com.whatsapp.settings.SettingsSetupUserProxyActivity r0 = (com.whatsapp.settings.SettingsSetupUserProxyActivity) r0
            java.lang.Object r1 = r7.A01
            X.3Z6 r1 = (X.AnonymousClass3Z6) r1
            X.66R r0 = r0.A05
            java.lang.Object r3 = r0.getValue()
            com.whatsapp.settings.SettingsSetupUserProxyViewModel r3 = (com.whatsapp.settings.SettingsSetupUserProxyViewModel) r3
            java.lang.Object r2 = r1.second
            X.2zS r2 = (X.C60962zS) r2
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            X.2yZ r1 = r3.A03
            java.lang.String r6 = r2.A05
            boolean r0 = X.C106585Zo.A00(r6)
            if (r0 != 0) goto L_0x08f5
            java.lang.String r0 = r2.A02
            boolean r0 = X.C106585Zo.A01(r0)
            if (r0 != 0) goto L_0x08f5
            java.lang.String r0 = "SettingsSetupUserProxyViewModel/saveUserProxySettings/Unable to save proxy setting"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x08f5:
            java.lang.String r5 = r2.A02
            int r7 = r2.A00
            int r8 = r2.A01
            boolean r9 = r2.A06
            X.2zS r4 = new X.2zS
            r4.<init>(r5, r6, r7, r8, r9)
            r3.A01 = r4
            r1.A01(r2)
            X.08M r1 = r3.A02
            java.lang.Integer r0 = X.C18280x3.A0S()
            X.3Z6 r0 = X.AnonymousClass3Z6.A02(r0, r2)
            r1.A0G(r0)
            return
        L_0x0915:
            java.lang.Object r2 = r7.A00
            com.whatsapp.settings.SettingsUserProxyActivity r2 = (com.whatsapp.settings.SettingsUserProxyActivity) r2
            java.lang.Object r0 = r7.A01
            android.widget.EditText r0 = (android.widget.EditText) r0
            com.whatsapp.settings.SettingsUserProxyViewModel r1 = r2.A09
            java.lang.String r0 = X.C18290x4.A0m(r0)
            boolean r0 = r1.A0I(r0)
            if (r0 == 0) goto L_0x0964
            com.whatsapp.settings.SettingsUserProxyViewModel r2 = r2.A09
            r1 = 1
            r0 = 0
            r2.A0G(r1, r0)
            r2.A0D()
            return
        L_0x0934:
            java.lang.Object r0 = r7.A00
            X.1R1 r0 = (X.AnonymousClass1R1) r0
            java.lang.Object r2 = r7.A01
            X.4uZ r2 = (X.C95814uZ) r2
            X.1iF r0 = r0.A0R
            java.util.Iterator r1 = X.C61102zi.A03(r0)
        L_0x0942:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0964
            java.lang.Object r0 = r1.next()
            X.65a r0 = (X.C1226065a) r0
            r0.BcT(r2)
            goto L_0x0942
        L_0x0952:
            r6 = move-exception
            java.lang.StringBuilder r5 = X.AnonymousClass001.A0o()
            java.lang.String r4 = "FetchDeviceConfirmationPoller/fetchDeviceConfirmation/error "
            X.C18260x0.A1Q(r5, r4, r6)
            r2.A01(r0, r1)
            X.4DZ r0 = r1.A00
            r0.onError(r3)
        L_0x0964:
            return
        L_0x0965:
            java.lang.Object r0 = r7.A00
            X.1R1 r0 = (X.AnonymousClass1R1) r0
            java.lang.Object r1 = r7.A01
            X.4uZ r1 = (X.C95814uZ) r1
            X.1hw r0 = r0.A0K
            r0.A0A(r1)
            return
        L_0x0973:
            java.lang.Object r1 = r7.A00
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r1 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r1
            java.lang.Object r0 = r7.A01
            X.4uZ r0 = (X.C95814uZ) r0
            r1.A77(r0)
            return
        L_0x097f:
            java.lang.Object r3 = r7.A00
            com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview r3 = (com.whatsapp.settings.chat.wallpaper.GalleryWallpaperPreview) r3
            java.lang.Object r2 = r7.A01
            com.whatsapp.jid.Jid r2 = (com.whatsapp.jid.Jid) r2
            android.content.Intent r1 = X.C18320x8.A07()
            android.net.Uri r0 = r3.A01
            r1.setData(r0)
            java.lang.String r0 = "chat_jid"
            X.C627336j.A0D(r1, r2, r0)
            X.AnonymousClass0x2.A0m(r3, r1)
            return
        L_0x0999:
            java.lang.Object r3 = r7.A00
            com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity r3 = (com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity) r3
            java.lang.Object r0 = r7.A01
            java.lang.Integer r0 = (java.lang.Integer) r0
            X.1XN r2 = new X.1XN
            r2.<init>()
            r2.A00 = r0
            X.2rN r1 = r3.A0E
            X.1fJ r0 = r3.A0B
            int r0 = r1.A00(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.A01 = r0
            X.4FV r0 = r3.A09
            r0.BhD(r2)
            return
        L_0x09bc:
            java.lang.Object r3 = r7.A00
            com.whatsapp.spamreport.ReportSpamDialogFragment r3 = (com.whatsapp.spamreport.ReportSpamDialogFragment) r3
            java.lang.Object r2 = r7.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.2so r0 = r3.A1X()
            java.util.Set r1 = r0.A05(r2)
            X.5mF r0 = r3.A03
            if (r0 == 0) goto L_0x09e4
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.community.CommunityExitDialogFragment r2 = com.whatsapp.community.CommunityExitDialogFragment.A00(r2, r1)
            X.03q r0 = r3.A0Q()
            android.app.Activity r1 = X.C111095hX.A02(r0)
            X.AnonymousClass0x9.A1L(r1)
            goto L_0x0a22
        L_0x09e4:
            java.lang.String r0 = "communityExitDialogFragmentBridge"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x09eb:
            java.lang.Object r1 = r7.A00
            android.view.View r1 = (android.view.View) r1
            java.lang.Object r2 = r7.A01
            android.widget.CompoundButton r2 = (android.widget.CompoundButton) r2
            r0 = 2131428028(0x7f0b02bc, float:1.8477689E38)
            android.view.View r1 = r1.findViewById(r0)
            r0 = 8
            r1.setVisibility(r0)
            r0 = 0
            r2.setChecked(r0)
            return
        L_0x0a04:
            java.lang.Object r3 = r7.A00
            com.whatsapp.spamreport.ReportSpamDialogFragmentOld r3 = (com.whatsapp.spamreport.ReportSpamDialogFragmentOld) r3
            java.lang.Object r2 = r7.A01
            X.1fJ r2 = (X.C27991fJ) r2
            X.2so r0 = r3.A03
            java.util.Set r1 = r0.A05(r2)
            r0 = 0
            X.C162457s7.A0J(r2, r0)
            com.whatsapp.community.CommunityExitDialogFragment r2 = com.whatsapp.community.CommunityExitDialogFragment.A00(r2, r1)
            android.content.Context r0 = r3.A1D()
            android.app.Activity r1 = X.C111095hX.A02(r0)
        L_0x0a22:
            X.4ea r1 = (X.C89654ea) r1
            java.lang.String r0 = "CommunityExitDialogFragment"
            r1.Bon(r2, r0)
            return
        L_0x0a2a:
            java.lang.Object r2 = r7.A00
            X.4GP r2 = (X.AnonymousClass4GP) r2
            java.lang.Object r1 = r7.A01
            X.2Yr r1 = (X.C45102Yr) r1
            java.lang.String r0 = "SparkRetryHandler Retrying after 5000 ms"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            r2.invoke()
            r1.A00()
            return
        L_0x0a3e:
            java.lang.Object r4 = r7.A00
            X.4Yw r4 = (X.C88474Yw) r4
            java.lang.Object r3 = r7.A01
            X.34x r3 = (X.C624134x) r3
            X.3Db r0 = r4.A0E
            X.4C1 r0 = r0.AMe
            java.lang.Object r2 = r0.get()
            X.1sV r2 = (X.C33141sV) r2
            android.widget.ImageView r1 = r4.A0C
            X.3Wj r0 = r4.A0I
            r2.A09(r1, r3, r0)
            return
        L_0x0a58:
            java.lang.Object r4 = r7.A00
            X.4Yw r4 = (X.C88474Yw) r4
            java.lang.Object r3 = r7.A01
            X.34x r3 = (X.C624134x) r3
            X.3Db r0 = r4.A0E
            X.4C1 r0 = r0.AMe
            java.lang.Object r2 = r0.get()
            X.1sV r2 = (X.C33141sV) r2
            android.widget.ImageView r1 = r4.A0C
            X.3Wj r0 = r4.A0I
            r2.A0A(r1, r3, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70143a1.run():void");
    }
}
