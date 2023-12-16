package X;

/* renamed from: X.6pw  reason: invalid class name and case insensitive filesystem */
public class C138206pw extends AnonymousClass5ZM {
    public final AnonymousClass33p A00;
    public final C56912sl A01;
    public final C153017aX A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final boolean A06 = true;
    public final boolean A07;

    public C138206pw(AnonymousClass33p r2, C56912sl r3, C153017aX r4, String str, String str2, String str3, boolean z) {
        this.A07 = z;
        this.A04 = str;
        this.A05 = str2;
        this.A03 = str3;
        this.A02 = r4;
        this.A00 = r2;
        this.A01 = r3;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0155, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x015a, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:?, code lost:
        r7.A04.A0A(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0161, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        X.AnonymousClass6C9.A1B(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0165, code lost:
        throw r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0166, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:?, code lost:
        com.whatsapp.util.Log.e("AutoconfManager/acquireVerifier", r1);
        r10.A01.A0A("AutoconfManager/acquireVerifier/error", true, r1.getMessage());
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0166 A[ExcHandler: 6yP | RemoteException | IllegalArgumentException | SecurityException (r1v15 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:46:0x011d] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A08(java.lang.Object[] r25) {
        /*
            r24 = this;
            java.lang.String r11 = "/failureReason="
            r3 = r24
            X.2sl r12 = r3.A01     // Catch:{ Exception -> 0x0240 }
            boolean r5 = r3.A06     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = r3.A04     // Catch:{ Exception -> 0x0240 }
            r19 = r0
            java.lang.String r15 = r3.A05     // Catch:{ Exception -> 0x0240 }
            java.lang.String r2 = r3.A03     // Catch:{ Exception -> 0x0240 }
            X.7aX r10 = r3.A02     // Catch:{ Exception -> 0x0240 }
            byte[] r23 = r10.A01()     // Catch:{ Exception -> 0x0240 }
            r6 = 0
            r1 = 0
            if (r23 != 0) goto L_0x0020
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfRequest/null clientCapabilities"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0240 }
            goto L_0x0067
        L_0x0020:
            boolean r0 = r12.A0F()     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x0067
            r0 = 1
            r12.A0E(r0)     // Catch:{ Exception -> 0x0240 }
            java.util.HashMap r4 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x0240 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "consent_shown"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0240 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "create_verifier"
            r4.put(r0, r1)     // Catch:{ Exception -> 0x0240 }
            r12.A09(r4)     // Catch:{ Exception -> 0x0240 }
            r12.A08(r4)     // Catch:{ Exception -> 0x0240 }
            X.5Zj r1 = r12.A0P     // Catch:{ Exception -> 0x0240 }
            X.2Ic r0 = r12.A0N     // Catch:{ Exception -> 0x0240 }
            X.6qb r16 = new X.6qb     // Catch:{ Exception -> 0x0240 }
            r18 = r1
            r20 = r15
            r21 = r2
            r22 = r4
            r17 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r1 = X.C105935Wz.A00(r16)     // Catch:{ Exception -> 0x0240 }
            X.7O3 r1 = (X.AnonymousClass7O3) r1     // Catch:{ Exception -> 0x0240 }
        L_0x0067:
            if (r1 != 0) goto L_0x0071
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0240 }
            return r0
        L_0x0071:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "AutoconfTask/autoconf entrypoint response/status="
            r2.append(r0)     // Catch:{ Exception -> 0x0240 }
            int r0 = r1.A04     // Catch:{ Exception -> 0x0240 }
            r2.append(r0)     // Catch:{ Exception -> 0x0240 }
            r2.append(r11)     // Catch:{ Exception -> 0x0240 }
            int r0 = r1.A00     // Catch:{ Exception -> 0x0240 }
            r2.append(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "/non-null registerStartMessage="
            r2.append(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = r1.A03     // Catch:{ Exception -> 0x0240 }
            r13 = 0
            r9 = 1
            boolean r0 = X.AnonymousClass000.A1W(r0)
            X.C18260x0.A1V(r2, r0)     // Catch:{ Exception -> 0x0240 }
            boolean r2 = r3.A07     // Catch:{ Exception -> 0x0240 }
            int r14 = X.C18280x3.A00(r2)
            X.33p r0 = r3.A00     // Catch:{ Exception -> 0x0240 }
            android.content.SharedPreferences r3 = X.AnonymousClass0x2.A0F(r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "registration_code_request_method"
            java.lang.String r3 = X.C18280x3.A0Z(r3, r0)     // Catch:{ Exception -> 0x0240 }
            r8 = 0
            if (r3 == 0) goto L_0x00ea
            int r0 = r3.hashCode()     // Catch:{ Exception -> 0x0240 }
            r8 = 5
            switch(r0) {
                case -795576526: goto L_0x00b5;
                case 97513456: goto L_0x00bf;
                case 112386354: goto L_0x00c9;
                case 1439178067: goto L_0x00d3;
                case 2120743944: goto L_0x00dd;
                default: goto L_0x00b4;
            }     // Catch:{ Exception -> 0x0240 }
        L_0x00b4:
            goto L_0x00e7
        L_0x00b5:
            java.lang.String r0 = "wa_old"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x00e7
            r8 = 2
            goto L_0x00ea
        L_0x00bf:
            java.lang.String r0 = "flash"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x00e7
            r8 = 4
            goto L_0x00ea
        L_0x00c9:
            java.lang.String r0 = "voice"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x00e7
            r8 = 7
            goto L_0x00ea
        L_0x00d3:
            java.lang.String r0 = "autoconf"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x00e7
            r8 = 1
            goto L_0x00ea
        L_0x00dd:
            java.lang.String r0 = "email_otp"
            boolean r0 = r3.equals(r0)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x00e7
            r8 = 3
            goto L_0x00ea
        L_0x00e7:
            if (r2 != 0) goto L_0x00ea
            r8 = 6
        L_0x00ea:
            java.lang.String r1 = r1.A03     // Catch:{ Exception -> 0x0240 }
            r20 = 0
            if (r1 != 0) goto L_0x00f7
            java.lang.String r0 = "AutoconfManager/acquireVerifier/null registerStartMessage"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0240 }
            goto L_0x018f
        L_0x00f7:
            X.7OM r0 = r10.A00     // Catch:{ Exception -> 0x0240 }
            if (r0 != 0) goto L_0x00fe
            r10.A00()     // Catch:{ Exception -> 0x0240 }
        L_0x00fe:
            r0 = 8
            byte[] r3 = android.util.Base64.decode(r1, r0)     // Catch:{ Exception -> 0x0240 }
            X.7RC r2 = new X.7RC     // Catch:{ Exception -> 0x0240 }
            r2.<init>()     // Catch:{ Exception -> 0x0240 }
            android.os.Bundle r1 = r2.A00     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "requestMessage"
            r1.putByteArray(r0, r3)     // Catch:{ Exception -> 0x0240 }
            r2.A00()     // Catch:{ Exception -> 0x0240 }
            X.7Ab r0 = new X.7Ab     // Catch:{ Exception -> 0x0240 }
            r0.<init>(r1)     // Catch:{ Exception -> 0x0240 }
            android.os.Bundle r1 = new android.os.Bundle     // Catch:{ Exception -> 0x0240 }
            r1.<init>()     // Catch:{ Exception -> 0x0240 }
            X.7OM r1 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.C626936e.A06(r1)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.7OM r7 = r10.A00     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            r6 = 0
            X.7bm r5 = r7.A04     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            r5.A04(r0)     // Catch:{ Exception -> 0x012b, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            goto L_0x012f
        L_0x012b:
            r1 = move-exception
            X.AnonymousClass6C9.A1B(r1)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
        L_0x012f:
            android.net.Uri r4 = r7.A01     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.7Sj r3 = r7.A02     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            android.content.ContentResolver r2 = r7.A00     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            java.lang.String r1 = "register"
            android.os.Bundle r0 = r0.A00     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            android.os.Bundle r0 = X.C160857oT.A00(r0)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            android.os.Bundle r2 = X.C153907cE.A00(r2, r4, r0, r3, r1)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.7R9 r0 = r7.A03     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.C153907cE.A01(r2, r0, r1)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            if (r2 == 0) goto L_0x0151
            android.os.Bundle r0 = X.C160857oT.A00(r2)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            X.7Ac r6 = new X.7Ac     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            r6.<init>(r0)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
        L_0x0151:
            r5.A05(r6)     // Catch:{ Exception -> 0x0155, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            goto L_0x0179
        L_0x0155:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ Exception -> 0x015a, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            goto L_0x0179
        L_0x015a:
            r1 = move-exception
            X.7bm r0 = r7.A04     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            r0.A0A(r1)     // Catch:{ Exception -> 0x0161, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166, 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
            goto L_0x0165
        L_0x0161:
            r0 = move-exception
            X.AnonymousClass6C9.A1B(r0)     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
        L_0x0165:
            throw r1     // Catch:{ 6yP | RemoteException | IllegalArgumentException | SecurityException -> 0x0166 }
        L_0x0166:
            r1 = move-exception
            java.lang.String r0 = "AutoconfManager/acquireVerifier"
            com.whatsapp.util.Log.e(r0, r1)     // Catch:{ Exception -> 0x0240 }
            X.2qk r2 = r10.A01     // Catch:{ Exception -> 0x0240 }
            java.lang.String r1 = r1.getMessage()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "AutoconfManager/acquireVerifier/error"
            r2.A0A(r0, r9, r1)     // Catch:{ Exception -> 0x0240 }
            r6 = r20
        L_0x0179:
            if (r6 == 0) goto L_0x018f
            android.os.Bundle r2 = r6.A00     // Catch:{ Exception -> 0x0240 }
            java.lang.String r1 = "verifier"
            boolean r0 = r2.containsKey(r1)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x018a
            byte[] r20 = r2.getByteArray(r1)     // Catch:{ Exception -> 0x0240 }
            goto L_0x018f
        L_0x018a:
            java.lang.IllegalStateException r0 = X.AnonymousClass6CA.A0O()     // Catch:{ Exception -> 0x0240 }
            throw r0     // Catch:{ Exception -> 0x0240 }
        L_0x018f:
            r3 = 0
            if (r20 != 0) goto L_0x0199
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/null verifier"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0240 }
            goto L_0x0218
        L_0x0199:
            boolean r0 = r12.A0F()     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x0218
            r12.A0E(r9)     // Catch:{ Exception -> 0x0240 }
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "RegistrationHttpManager/makeAutoconfVerifierRequest/codeEntryMethod="
            r1.append(r0)     // Catch:{ Exception -> 0x0240 }
            r1.append(r14)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "/registrationMethod="
            X.C18260x0.A0y(r0, r1, r8)     // Catch:{ Exception -> 0x0240 }
            java.util.HashMap r2 = X.AnonymousClass001.A0t()     // Catch:{ Exception -> 0x0240 }
            X.33p r0 = r12.A0A     // Catch:{ Exception -> 0x0240 }
            X.8qC r4 = r0.A01     // Catch:{ Exception -> 0x0240 }
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r4)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "registration_code"
            java.lang.String r3 = X.C18280x3.A0Z(r1, r0)     // Catch:{ Exception -> 0x0240 }
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0240 }
            if (r0 != 0) goto L_0x01e0
            android.content.SharedPreferences r1 = X.C18300x5.A0B(r4)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "pref_autoconf_secure_verifier"
            boolean r0 = r1.getBoolean(r0, r13)     // Catch:{ Exception -> 0x0240 }
            if (r0 == 0) goto L_0x01e0
            java.lang.String r1 = "code"
            byte[] r0 = r3.getBytes()     // Catch:{ Exception -> 0x0240 }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x0240 }
        L_0x01e0:
            java.lang.String r0 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x0240 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "entered"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = java.lang.String.valueOf(r8)     // Catch:{ Exception -> 0x0240 }
            byte[] r1 = r0.getBytes()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "registration_method"
            r2.put(r0, r1)     // Catch:{ Exception -> 0x0240 }
            r12.A09(r2)     // Catch:{ Exception -> 0x0240 }
            r12.A08(r2)     // Catch:{ Exception -> 0x0240 }
            X.5Zj r1 = r12.A0P     // Catch:{ Exception -> 0x0240 }
            X.2Ic r0 = r12.A0N     // Catch:{ Exception -> 0x0240 }
            X.6qa r14 = new X.6qa     // Catch:{ Exception -> 0x0240 }
            r16 = r1
            r17 = r19
            r18 = r15
            r19 = r2
            r15 = r0
            r14.<init>(r15, r16, r17, r18, r19, r20)     // Catch:{ Exception -> 0x0240 }
            java.lang.Object r3 = X.C105935Wz.A00(r14)     // Catch:{ Exception -> 0x0240 }
            X.7ZN r3 = (X.AnonymousClass7ZN) r3     // Catch:{ Exception -> 0x0240 }
        L_0x0218:
            if (r3 != 0) goto L_0x0222
            java.lang.String r0 = "AutoconfTask/doInBackground/null autoconfVerifierResult"
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ Exception -> 0x0240 }
            java.lang.Boolean r0 = java.lang.Boolean.FALSE     // Catch:{ Exception -> 0x0240 }
            return r0
        L_0x0222:
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ Exception -> 0x0240 }
            java.lang.String r0 = "AutoconfTask/autoconf_verifier entrypoint response/status="
            r2.append(r0)     // Catch:{ Exception -> 0x0240 }
            int r1 = r3.A03     // Catch:{ Exception -> 0x0240 }
            r2.append(r1)     // Catch:{ Exception -> 0x0240 }
            r2.append(r11)     // Catch:{ Exception -> 0x0240 }
            int r0 = r3.A00     // Catch:{ Exception -> 0x0240 }
            X.C18260x0.A1G(r2, r0)     // Catch:{ Exception -> 0x0240 }
            if (r1 != r9) goto L_0x023b
            r13 = 1
        L_0x023b:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r13)     // Catch:{ Exception -> 0x0240 }
            return r0
        L_0x0240:
            r1 = move-exception
            java.lang.String r0 = "AutoconfTask/entrypoint call error: "
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C138206pw.A08(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        String str;
        String str2;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("AutoconfTask/onPostExecute/autoconf verifier creation ");
        boolean booleanValue = ((Boolean) obj).booleanValue();
        if (booleanValue) {
            str = "succeeded";
        } else {
            str = "failed";
        }
        C18260x0.A1L(A0o, str);
        AnonymousClass33p r0 = this.A00;
        if (booleanValue) {
            str2 = "autoconf_verifier_creation_successful";
        } else {
            str2 = "autoconf_verifier_creation_failed";
        }
        C18270x1.A0j(C18270x1.A03(r0), "pref_autoconf_status", str2);
    }
}
