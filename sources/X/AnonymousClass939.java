package X;

import com.whatsapp.util.Log;

/* renamed from: X.939  reason: invalid class name */
public class AnonymousClass939 implements AnonymousClass4EZ {
    public Object A00;
    public Object A01;
    public Object A02;
    public final int A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v0, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: java.net.URL} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v6, resolved type: java.net.URL} */
    /* JADX WARNING: type inference failed for: r2v34, types: [byte[]] */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b6, code lost:
        X.C18260x0.A1K(r8, r2);
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A00(X.AnonymousClass939 r18, X.AnonymousClass36K r19) {
        /*
            r0 = 1
            r4 = r19
            X.C162457s7.A0J(r4, r0)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r7 = r18
            java.lang.Object r2 = r7.A01
            X.2Ir r2 = (X.C41032Ir) r2
            X.36K r3 = X.C41032Ir.A02(r4, r2)
            r2 = 22
            boolean r3 = X.AnonymousClass92Z.A03(r3, r4, r2)
            r2 = 131(0x83, float:1.84E-43)
            java.lang.Object r2 = X.C1896292a.A0L(r4, r2, r3)
            X.6qj r2 = (X.C138626qj) r2
            java.util.ArrayList r6 = X.AnonymousClass001.A0s()
            java.lang.Object r2 = r2.A00
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r11 = r2.iterator()
        L_0x002e:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L_0x0149
            java.lang.Object r2 = r11.next()
            X.6rH r2 = (X.C138956rH) r2
            java.lang.Object r2 = r2.A01
            X.8k2 r2 = (X.C179988k2) r2
            X.2Iq r2 = (X.C41022Iq) r2
            X.36K r10 = r2.A00
            X.C162457s7.A0D(r10)
            java.lang.String r2 = "sub_group_jid"
            r15 = 0
            java.lang.String r2 = r10.A0r(r2, r15)
            if (r2 == 0) goto L_0x002e
            X.1fJ r13 = X.AnonymousClass34R.A05(r2)
            X.3Yy r5 = new X.3Yy
            r5.<init>()
            X.3Yy r3 = new X.3Yy
            r3.<init>()
            java.lang.String r2 = "status"
            java.lang.String r8 = r10.A0r(r2, r15)
            r4 = 0
            if (r8 == 0) goto L_0x00c6
            java.lang.String r2 = "304"
            boolean r2 = r8.equals(r2)
            java.lang.String r9 = "GetGroupProfilePicturesProtocolHelper/"
            if (r2 == 0) goto L_0x0081
            java.lang.StringBuilder r3 = X.AnonymousClass000.A0m(r9, r8)
            java.lang.String r2 = " photo didn't change for jid "
            r3.append(r2)
            r3.append(r13)
            java.lang.String r2 = ". skipping"
            X.C18260x0.A1J(r3, r2)
            goto L_0x002e
        L_0x0081:
            X.6rs r2 = new X.6rs     // Catch:{ 24Y -> 0x00ba }
            r2.<init>(r10)     // Catch:{ 24Y -> 0x00ba }
            X.6qp r2 = r2.A00     // Catch:{ 24Y -> 0x00ba }
            if (r2 == 0) goto L_0x00c2
            X.7g0 r8 = new X.7g0     // Catch:{ 24Y -> 0x00ba }
            r8.<init>(r5, r3)     // Catch:{ 24Y -> 0x00ba }
            int r2 = r2.A00     // Catch:{ 24Y -> 0x00ba }
            switch(r2) {
                case 0: goto L_0x009f;
                case 1: goto L_0x00ab;
                case 2: goto L_0x00c2;
                default: goto L_0x0094;
            }     // Catch:{ 24Y -> 0x00ba }
        L_0x0094:
            X.3Yy r2 = r8.A00     // Catch:{ 24Y -> 0x00ba }
            r2.element = r15     // Catch:{ 24Y -> 0x00ba }
            X.3Yy r8 = r8.A01     // Catch:{ 24Y -> 0x00ba }
            java.lang.String r2 = "preview"
            r8.element = r2     // Catch:{ 24Y -> 0x00ba }
            goto L_0x00c2
        L_0x009f:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00ba }
            java.lang.String r2 = "GetGroupProfilePicturesProtocolHelper/Fetching group photos partially failed: "
            r8.append(r2)     // Catch:{ 24Y -> 0x00ba }
            java.lang.String r2 = "405"
            goto L_0x00b6
        L_0x00ab:
            java.lang.StringBuilder r8 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x00ba }
            java.lang.String r2 = "GetGroupProfilePicturesProtocolHelper/Fetching group photos partially failed: "
            r8.append(r2)     // Catch:{ 24Y -> 0x00ba }
            java.lang.String r2 = "500"
        L_0x00b6:
            X.C18260x0.A1K(r8, r2)     // Catch:{ 24Y -> 0x00ba }
            goto L_0x00c2
        L_0x00ba:
            r8 = move-exception
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            X.C18260x0.A1Q(r2, r9, r8)
        L_0x00c2:
            r16 = r15
            r14 = r15
            goto L_0x0102
        L_0x00c6:
            java.lang.String r2 = "id"
            java.lang.String r2 = r10.A0r(r2, r15)
            r5.element = r2
            java.lang.String r2 = "type"
            java.lang.String r2 = r10.A0r(r2, r15)
            r3.element = r2
            java.lang.String r2 = "url"
            java.lang.String r9 = r10.A0r(r2, r15)
            java.lang.String r2 = "direct_path"
            java.lang.String r14 = r10.A0r(r2, r15)
            java.lang.Object r2 = r7.A02
            X.2vN r2 = (X.C58512vN) r2
            X.1VX r8 = r2.A00
            r2 = 4406(0x1136, float:6.174E-42)
            boolean r2 = r8.A0X(r2)
            if (r2 == 0) goto L_0x00f6
            java.lang.String r2 = "hash"
            java.lang.String r15 = r10.A0r(r2, r15)
        L_0x00f6:
            if (r9 == 0) goto L_0x00fd
            java.net.URL r4 = new java.net.URL     // Catch:{ MalformedURLException -> 0x012a }
            r4.<init>(r9)     // Catch:{ MalformedURLException -> 0x012a }
        L_0x00fd:
            byte[] r2 = r10.A01
            r16 = r4
            r4 = r2
        L_0x0102:
            java.lang.Object r2 = r5.element     // Catch:{ NumberFormatException -> 0x0132 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ NumberFormatException -> 0x0132 }
            if (r2 == 0) goto L_0x010f
            int r18 = java.lang.Integer.parseInt(r2)     // Catch:{ NumberFormatException -> 0x0132 }
        L_0x010c:
            java.lang.Object r3 = r3.element     // Catch:{ NumberFormatException -> 0x0132 }
            goto L_0x0112
        L_0x010f:
            r18 = -1
            goto L_0x010c
        L_0x0112:
            if (r3 == 0) goto L_0x002e
            java.lang.String r2 = "preview"
            boolean r2 = r2.equals(r3)     // Catch:{ NumberFormatException -> 0x0132 }
            int r19 = X.C18280x3.A00(r2)
            X.2T0 r12 = new X.2T0     // Catch:{ NumberFormatException -> 0x0132 }
            r17 = r4
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ NumberFormatException -> 0x0132 }
            r6.add(r12)     // Catch:{ NumberFormatException -> 0x0132 }
            goto L_0x002e
        L_0x012a:
            java.lang.String r1 = "handleGroupPicture/Malformed picture url"
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0132:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "Malformed photo id="
            r1.append(r0)
            java.lang.Object r0 = r5.element
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = X.AnonymousClass000.A0X(r0, r1)
            X.24Y r0 = new X.24Y
            r0.<init>((java.lang.String) r1)
            throw r0
        L_0x0149:
            java.lang.Object r5 = r7.A00
            X.2FH r5 = (X.AnonymousClass2FH) r5
            java.util.Iterator r4 = r6.iterator()
        L_0x0151:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0165
            java.lang.Object r3 = r4.next()
            X.2T0 r3 = (X.AnonymousClass2T0) r3
            X.11H r2 = r5.A00
            X.2s0 r2 = r2.A0v
            r2.A04(r3, r0)
            goto L_0x0151
        L_0x0165:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass939.A00(X.939, X.36K):void");
    }

    public AnonymousClass939(Object obj, Object obj2, Object obj3, int i) {
        this.A03 = i;
        this.A00 = obj2;
        this.A02 = obj;
        this.A01 = obj3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0045, code lost:
        X.C18260x0.A0r(r0, r5, r1);
        r3 = (X.C10350hn) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x005a, code lost:
        X.C18260x0.A0r(r0, r5, r1);
        r3 = (X.C10350hn) r4.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0061, code lost:
        r3.BSG("delivery failure", 3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0068, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        r3.BSG("delivery failure", 3, -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0019, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BQs(java.lang.String r5) {
        /*
            r4 = this;
            int r0 = r4.A03
            switch(r0) {
                case 0: goto L_0x0028;
                case 1: goto L_0x002e;
                case 2: goto L_0x0038;
                case 3: goto L_0x003f;
                case 4: goto L_0x004d;
                case 5: goto L_0x0054;
                case 6: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/onDeliveryFailure id="
            X.C18260x0.A0r(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.8pD r3 = (X.C182928pD) r3
        L_0x0012:
            r2 = 3
            r1 = -1
            java.lang.String r0 = "delivery failure"
            r3.BSG(r0, r2, r1)
            return
        L_0x001a:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendDeleteAccountIq/onDeliveryFailure id="
            X.C18260x0.A0r(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.8pD r3 = (X.C182928pD) r3
            goto L_0x0012
        L_0x0028:
            java.lang.String r0 = "GetGroupProfilePicturesProtocolHelper/delivery-error"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return
        L_0x002e:
            java.lang.Object r1 = r4.A02
            X.3XA r1 = (X.AnonymousClass3XA) r1
            X.6zM r0 = X.C143716zM.A00
            r1.A06(r0)
            return
        L_0x0038:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitRegIq/onDeliveryFailure id="
            goto L_0x0045
        L_0x003f:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendFinishRegIq/onDeliveryFailure id="
        L_0x0045:
            X.C18260x0.A0r(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.0hn r3 = (X.C10350hn) r3
            goto L_0x0061
        L_0x004d:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/sendInitLoginIq/onDeliveryFailure id="
            goto L_0x005a
        L_0x0054:
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess/onDeliveryFailure id="
        L_0x005a:
            X.C18260x0.A0r(r0, r5, r1)
            java.lang.Object r3 = r4.A01
            X.0hn r3 = (X.C10350hn) r3
        L_0x0061:
            r2 = 3
            r1 = -1
            java.lang.String r0 = "delivery failure"
            r3.BSG(r0, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass939.BQs(java.lang.String):void");
    }

    public void BSN(AnonymousClass36K r8, String str) {
        C142656xY r1;
        C182928pD r0;
        switch (this.A03) {
            case 0:
                C162457s7.A0J(r8, 1);
                try {
                    AnonymousClass4B7[] r12 = new AnonymousClass4B7[6];
                    C1896292a.A0U(r12, 125, AnonymousClass92Z.A03(C41032Ir.A02(r8, (C41032Ir) this.A01), r8, 21) ? 1 : 0);
                    C1896292a.A0U(r12, 126, 1);
                    C1896292a.A0Q(r12, 127);
                    C1896292a.A0R(r12, 128);
                    C1896292a.A0S(r12, 129);
                    C1896292a.A0T(r12, 130);
                    StringBuilder A0o = AnonymousClass001.A0o();
                    A0o.append("GetGroupProfilePicturesProtocolHelper/Fetching group photos failed: ");
                    Log.e(AnonymousClass001.A0k(A0o, ((C183428q1) C626836d.A07(r8, "IQErrorItemNotFound|IQErrorForbidden|IQErrorNotAllowed|IQErrorBadRequest|IQErrorRateOverlimit|IQErrorFallbackClient", AnonymousClass0x2.A0i(r12), AnonymousClass6CA.A0i())).B5b().longValue()));
                    return;
                } catch (AnonymousClass24Y e) {
                    C18260x0.A1Q(AnonymousClass001.A0o(), "GetGroupProfilePicturesProtocolHelper/", e);
                    return;
                }
            case 1:
                C162457s7.A0J(r8, 1);
                int A0a = r8.A0m("error").A0a("code");
                AnonymousClass3XA r5 = (AnonymousClass3XA) this.A02;
                C142656xY[] values = C142656xY.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        r1 = values[i];
                        if (r1.code != A0a) {
                            i++;
                        }
                    } else {
                        r1 = C142656xY.A03;
                    }
                }
                r5.A06(new C143636zE(r1));
                return;
            case 6:
            case 7:
                r0 = (C182928pD) this.A01;
                break;
            default:
                r0 = (C10350hn) this.A01;
                break;
        }
        C161767qP.A02(r8, r0, str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: X.8yF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v20, resolved type: X.8yG} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v21, resolved type: X.8yF} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v22, resolved type: X.8yF} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:31|32|33|34|35|36|37|(2:39|40)(2:41|(2:43|44)(2:45|(2:47|48)(2:49|(2:51|52)(5:53|1fe|58|59|60))))) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:36:0x0174 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x017b A[Catch:{ 24Y -> 0x0211 }] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x018a A[Catch:{ 24Y -> 0x0211 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void BdM(X.AnonymousClass36K r26, java.lang.String r27) {
        /*
            r25 = this;
            r3 = r25
            int r0 = r3.A03
            r13 = r26
            r1 = r27
            switch(r0) {
                case 0: goto L_0x004b;
                case 1: goto L_0x004f;
                case 2: goto L_0x00d3;
                case 3: goto L_0x021e;
                case 4: goto L_0x0285;
                case 5: goto L_0x03f1;
                case 6: goto L_0x046b;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.Object r4 = r3.A02
            X.2Ir r4 = (X.C41032Ir) r4
            java.lang.Object r5 = r3.A01
            X.8yG r5 = (X.C188068yG) r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess id="
            X.C18260x0.A0s(r0, r1, r2)
            r7 = -1
            r6 = 1
            X.36K r2 = X.C41032Ir.A02(r13, r4)     // Catch:{ 24Y -> 0x04af }
            r0 = 100
            X.AnonymousClass92Z.A02(r2, r13, r0)     // Catch:{ 24Y -> 0x04af }
            java.lang.String r3 = "success"
            java.lang.String[] r2 = new java.lang.String[]{r3}     // Catch:{ 24Y -> 0x04af }
            r0 = 453(0x1c5, float:6.35E-43)
            X.C1896292a.A0O(r13, r2, r0)     // Catch:{ 24Y -> 0x04af }
            X.36K r0 = r13.A0l(r3)     // Catch:{ 24Y -> 0x04af }
            if (r0 != 0) goto L_0x0047
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x04af }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess was empty id="
            X.C18260x0.A0r(r0, r1, r2)     // Catch:{ 24Y -> 0x04af }
            java.lang.String r0 = "success was empty"
            r5.BSG(r0, r6, r7)     // Catch:{ 24Y -> 0x04af }
            return
        L_0x0047:
            r5.onSuccess()     // Catch:{ 24Y -> 0x04af }
            return
        L_0x004b:
            A00(r3, r13)
            return
        L_0x004f:
            r0 = 1
            X.C162457s7.A0J(r13, r0)
            java.lang.Class<com.whatsapp.jid.GroupJid> r1 = com.whatsapp.jid.GroupJid.class
            java.lang.String r0 = "from"
            com.whatsapp.jid.Jid r1 = r13.A0h(r1, r0)
            java.lang.Object r0 = r3.A00
            boolean r1 = X.C162457s7.A0P(r1, r0)
            java.lang.String r0 = "Group Jid in request and response don't match."
            X.C626936e.A0D(r1, r0)
            if (r1 != 0) goto L_0x0072
            java.lang.Object r1 = r3.A02
            X.3XA r1 = (X.AnonymousClass3XA) r1
            X.6zL r0 = X.C143706zL.A00
            r1.A06(r0)
            return
        L_0x0072:
            java.lang.String r0 = "cancel_membership_requests"
            X.36K r1 = r13.A0m(r0)
            java.lang.String r0 = "participant"
            X.36K r2 = r1.A0m(r0)
            java.lang.Class<com.whatsapp.jid.UserJid> r1 = com.whatsapp.jid.UserJid.class
            java.lang.String r0 = "jid"
            com.whatsapp.jid.Jid r1 = r2.A0h(r1, r0)
            java.lang.Object r0 = r3.A01
            boolean r1 = X.C162457s7.A0P(r1, r0)
            java.lang.String r0 = "Requester Jid in request and response don't match."
            X.C626936e.A0D(r1, r0)
            if (r1 != 0) goto L_0x009c
            java.lang.Object r1 = r3.A02
            X.3XA r1 = (X.AnonymousClass3XA) r1
            X.6zL r0 = X.C143706zL.A00
            r1.A06(r0)
        L_0x009c:
            java.lang.String r1 = "error"
            r0 = 0
            java.lang.String r0 = r2.A0r(r1, r0)
            if (r0 != 0) goto L_0x00af
            java.lang.Object r1 = r3.A02
            X.3XA r1 = (X.AnonymousClass3XA) r1
            X.2wD r0 = X.C59022wD.A00
            r1.A05(r0)
            return
        L_0x00af:
            java.lang.Object r6 = r3.A02
            X.3XA r6 = (X.AnonymousClass3XA) r6
            int r5 = java.lang.Integer.parseInt(r0)
            X.6xL[] r4 = X.C142526xL.values()
            int r3 = r4.length
            r2 = 0
        L_0x00bd:
            if (r2 >= r3) goto L_0x00c8
            r1 = r4[r2]
            int r0 = r1.code
            if (r0 == r5) goto L_0x00ca
            int r2 = r2 + 1
            goto L_0x00bd
        L_0x00c8:
            X.6xL r1 = X.C142526xL.DEFAULT
        L_0x00ca:
            X.6zF r0 = new X.6zF
            r0.<init>(r1)
            r6.A06(r0)
            return
        L_0x00d3:
            java.lang.Object r4 = r3.A02
            X.2Ir r4 = (X.C41032Ir) r4
            java.lang.Object r2 = r3.A01
            X.0Dh r2 = (X.C02010Dh) r2
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess id="
            X.C18260x0.A0s(r0, r1, r3)
            r0 = -1
            r17 = 0
            X.36K r10 = X.C41032Ir.A02(r13, r4)     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r4 = "hk_pub"
            java.lang.String r3 = "#elementValue"
            java.lang.String[] r18 = new java.lang.String[]{r4, r3}     // Catch:{ 24Y -> 0x0211 }
            java.lang.Class<byte[]> r14 = byte[].class
            r9 = 0
            java.lang.Long r15 = X.AnonymousClass0x2.A0U()     // Catch:{ 24Y -> 0x0211 }
            r4 = 1024(0x400, double:5.06E-321)
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ 24Y -> 0x0211 }
            r19 = r9
            java.lang.Object r4 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x0211 }
            byte[] r4 = (byte[]) r4     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r5 = "hk_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r5, r3}     // Catch:{ 24Y -> 0x0211 }
            r5 = 384(0x180, double:1.897E-321)
            java.lang.Long r15 = java.lang.Long.valueOf(r5)     // Catch:{ 24Y -> 0x0211 }
            r16 = r15
            java.lang.Object r5 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x0211 }
            byte[] r5 = (byte[]) r5     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r6 = "ok_pub"
            java.lang.String[] r23 = new java.lang.String[]{r6, r3}     // Catch:{ 24Y -> 0x0211 }
            r6 = 32
            java.lang.Long r20 = java.lang.Long.valueOf(r6)     // Catch:{ 24Y -> 0x0211 }
            r18 = r13
            r19 = r14
            r21 = r20
            r22 = r17
            r24 = r9
            java.lang.Object r6 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 24Y -> 0x0211 }
            byte[] r6 = (byte[]) r6     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r7 = "ok_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r7, r3}     // Catch:{ 24Y -> 0x0211 }
            r19 = r9
            java.lang.Object r8 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x0211 }
            byte[] r8 = (byte[]) r8     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r7 = "ed_pub"
            java.lang.String[] r23 = new java.lang.String[]{r7, r3}     // Catch:{ 24Y -> 0x0211 }
            r18 = r13
            r19 = r14
            java.lang.Object r7 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 24Y -> 0x0211 }
            byte[] r7 = (byte[]) r7     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r11 = "ed_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r11, r3}     // Catch:{ 24Y -> 0x0211 }
            r19 = r9
            java.lang.Object r11 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x0211 }
            byte[] r11 = (byte[]) r11     // Catch:{ 24Y -> 0x0211 }
            r3 = 99
            X.AnonymousClass92Z.A01(r10, r13, r3)     // Catch:{ 24Y -> 0x0211 }
            r3 = 452(0x1c4, float:6.33E-43)
            X.92a r10 = X.C1896292a.A00(r3)     // Catch:{ 24Y -> 0x0211 }
            java.lang.String[] r3 = new java.lang.String[r9]     // Catch:{ 24Y -> 0x0211 }
            X.C626836d.A04(r13, r10, r3)     // Catch:{ 24Y -> 0x0174 }
        L_0x0174:
            boolean r3 = X.AnonymousClass0YS.A05(r4, r5)     // Catch:{ 24Y -> 0x0211 }
            r5 = 2
            if (r3 != 0) goto L_0x018a
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r3 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/hk_pub cannot be verified with hk_key_signature id="
            X.C18260x0.A0r(r3, r1, r4)     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r1 = "hk_pub cannot be verified with hk_key_signature"
            r2.BSG(r1, r5, r0)     // Catch:{ 24Y -> 0x0211 }
            return
        L_0x018a:
            boolean r3 = X.AnonymousClass0YS.A05(r6, r8)     // Catch:{ 24Y -> 0x0211 }
            if (r3 != 0) goto L_0x019f
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r3 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/ok_pub cannot be verified with ok_key_signature id="
            X.C18260x0.A0r(r3, r1, r4)     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r1 = "ok_pub cannot be verified with ok_key_signature"
            r2.BSG(r1, r5, r0)     // Catch:{ 24Y -> 0x0211 }
            return
        L_0x019f:
            boolean r3 = X.AnonymousClass0YS.A05(r7, r11)     // Catch:{ 24Y -> 0x0211 }
            if (r3 != 0) goto L_0x01b4
            java.lang.StringBuilder r4 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r3 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/ed_pub cannot be verified with ed_key_signature id="
            X.C18260x0.A0r(r3, r1, r4)     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r1 = "ed_pub cannot be verified with ed_key_signature"
            r2.BSG(r1, r5, r0)     // Catch:{ 24Y -> 0x0211 }
            return
        L_0x01b4:
            X.2zM r1 = r2.A00     // Catch:{ 24Y -> 0x0211 }
            r1.A02()     // Catch:{ 24Y -> 0x0211 }
            java.lang.String r3 = r2.A0D     // Catch:{ 24Y -> 0x0211 }
            r1 = 10
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOOO(r1, r3, r6)     // Catch:{ 24Y -> 0x0211 }
            com.facebook.simplejni.NativeHolder r1 = (com.facebook.simplejni.NativeHolder) r1     // Catch:{ 24Y -> 0x0211 }
            X.2HX r10 = new X.2HX     // Catch:{ 24Y -> 0x0211 }
            r10.<init>(r1)     // Catch:{ 24Y -> 0x0211 }
            r3 = 30
            com.facebook.simplejni.NativeHolder r1 = r10.A00     // Catch:{ 24Y -> 0x0211 }
            java.lang.Object r3 = com.whatsapp.wamsys.JniBridge.jvidispatchOO(r3, r1)     // Catch:{ 24Y -> 0x0211 }
            com.facebook.simplejni.NativeHolder r3 = (com.facebook.simplejni.NativeHolder) r3     // Catch:{ 24Y -> 0x0211 }
            X.7EJ r1 = new X.7EJ     // Catch:{ 24Y -> 0x0211 }
            r1.<init>(r3)     // Catch:{ 24Y -> 0x0211 }
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 24Y -> 0x0211 }
            com.facebook.simplejni.NativeHolder r3 = r1.A00     // Catch:{ 24Y -> 0x0211 }
            r1 = 94
            r8 = 1
            long r5 = (long) r1     // Catch:{ 24Y -> 0x0211 }
            long r5 = com.whatsapp.wamsys.JniBridge.jvidispatchIIO(r8, r5, r3)     // Catch:{ 24Y -> 0x0211 }
            int r1 = (int) r5     // Catch:{ 24Y -> 0x0211 }
            if (r1 == 0) goto L_0x01f0
            X.0Ku r1 = r2.A08     // Catch:{ 24Y -> 0x0211 }
            r3 = 4
            com.whatsapp.backup.encryptedbackup.EncBackupViewModel r1 = r1.A00     // Catch:{ 24Y -> 0x0211 }
            r1.A0U(r3)     // Catch:{ 24Y -> 0x0211 }
            return
        L_0x01f0:
            com.whatsapp.wamsys.JniBridge.getInstance()     // Catch:{ 24Y -> 0x0211 }
            r1 = 95
            long r5 = (long) r1     // Catch:{ 24Y -> 0x0211 }
            java.lang.Object r1 = com.whatsapp.wamsys.JniBridge.jvidispatchOIO(r9, r5, r3)     // Catch:{ 24Y -> 0x0211 }
            byte[] r1 = (byte[]) r1     // Catch:{ 24Y -> 0x0211 }
            java.lang.Object r3 = r2.A0C     // Catch:{ 24Y -> 0x0211 }
            monitor-enter(r3)     // Catch:{ 24Y -> 0x0211 }
            r2.A01 = r10     // Catch:{ all -> 0x020e }
            r2.A05 = r4     // Catch:{ all -> 0x020e }
            r2.A03 = r7     // Catch:{ all -> 0x020e }
            r2.A06 = r1     // Catch:{ all -> 0x020e }
            r2.A00 = r8     // Catch:{ all -> 0x020e }
            monitor-exit(r3)     // Catch:{ all -> 0x020e }
            r2.A05()     // Catch:{ 24Y -> 0x0211 }
            return
        L_0x020e:
            r1 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x020e }
            throw r1     // Catch:{ 24Y -> 0x0211 }
        L_0x0211:
            r3 = move-exception
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initRegOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r1, r3)
            java.lang.String r3 = "invalid server response"
            r1 = 1
            r2.BSG(r3, r1, r0)
            return
        L_0x021e:
            java.lang.Object r6 = r3.A02
            X.2Ir r6 = (X.C41032Ir) r6
            java.lang.Object r5 = r3.A01
            X.0Dh r5 = (X.C02010Dh) r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess id="
            X.C18260x0.A0s(r0, r1, r2)
            r4 = -1
            r3 = 1
            X.36K r2 = X.C41032Ir.A02(r13, r6)     // Catch:{ 24Y -> 0x0279 }
            r0 = 97
            X.AnonymousClass92Z.A02(r2, r13, r0)     // Catch:{ 24Y -> 0x0279 }
            java.lang.String r6 = "success"
            java.lang.String[] r2 = new java.lang.String[]{r6}     // Catch:{ 24Y -> 0x0279 }
            r0 = 448(0x1c0, float:6.28E-43)
            X.C1896292a.A0O(r13, r2, r0)     // Catch:{ 24Y -> 0x0279 }
            X.36K r0 = r13.A0l(r6)     // Catch:{ 24Y -> 0x0279 }
            if (r0 != 0) goto L_0x025a
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x0279 }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess was empty id="
            X.C18260x0.A0r(r0, r1, r2)     // Catch:{ 24Y -> 0x0279 }
            java.lang.String r0 = "success was empty"
            r5.BSG(r0, r3, r4)     // Catch:{ 24Y -> 0x0279 }
            return
        L_0x025a:
            X.2zM r0 = r5.A00     // Catch:{ 24Y -> 0x0279 }
            r0.A02()     // Catch:{ 24Y -> 0x0279 }
            X.33p r1 = r5.A09     // Catch:{ 24Y -> 0x0279 }
            r1.A1u(r3)     // Catch:{ 24Y -> 0x0279 }
            r0 = 0
            r1.A1v(r0)     // Catch:{ 24Y -> 0x0279 }
            r1.A1B(r0)     // Catch:{ 24Y -> 0x0279 }
            r1.A1w(r0)     // Catch:{ 24Y -> 0x0279 }
            X.4FS r1 = r5.A01     // Catch:{ 24Y -> 0x0279 }
            X.0jX r0 = new X.0jX     // Catch:{ 24Y -> 0x0279 }
            r0.<init>(r5)     // Catch:{ 24Y -> 0x0279 }
            r1.BkM(r0)     // Catch:{ 24Y -> 0x0279 }
            return
        L_0x0279:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishRegOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "invalid server response"
            r5.BSG(r0, r3, r4)
            return
        L_0x0285:
            java.lang.Object r4 = r3.A02
            X.2Ir r4 = (X.C41032Ir) r4
            java.lang.Object r0 = r3.A01
            X.0Dg r0 = (X.C02000Dg) r0
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()
            java.lang.String r2 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess id="
            X.C18260x0.A0s(r2, r1, r3)
            r10 = -1
            r17 = 0
            X.36K r7 = X.C41032Ir.A02(r13, r4)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "hk_pub"
            java.lang.String r3 = "#elementValue"
            java.lang.String[] r18 = new java.lang.String[]{r2, r3}     // Catch:{ 24Y -> 0x03e4 }
            java.lang.Class<byte[]> r14 = byte[].class
            r6 = 0
            java.lang.Long r15 = X.AnonymousClass0x2.A0U()     // Catch:{ 24Y -> 0x03e4 }
            r4 = 1024(0x400, double:5.06E-321)
            java.lang.Long r16 = java.lang.Long.valueOf(r4)     // Catch:{ 24Y -> 0x03e4 }
            r19 = r6
            java.lang.Object r9 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r9 = (byte[]) r9     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "hk_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r2, r3}     // Catch:{ 24Y -> 0x03e4 }
            r4 = 384(0x180, double:1.897E-321)
            java.lang.Long r15 = java.lang.Long.valueOf(r4)     // Catch:{ 24Y -> 0x03e4 }
            r16 = r15
            java.lang.Object r8 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r8 = (byte[]) r8     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "ok_pub"
            java.lang.String[] r23 = new java.lang.String[]{r2, r3}     // Catch:{ 24Y -> 0x03e4 }
            r4 = 32
            java.lang.Long r20 = java.lang.Long.valueOf(r4)     // Catch:{ 24Y -> 0x03e4 }
            r18 = r13
            r19 = r14
            r21 = r20
            r22 = r17
            r24 = r6
            java.lang.Object r2 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r2 = (byte[]) r2     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r4 = "ok_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r4, r3}     // Catch:{ 24Y -> 0x03e4 }
            r19 = r6
            java.lang.Object r4 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r4 = (byte[]) r4     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r5 = "ed_pub"
            java.lang.String[] r23 = new java.lang.String[]{r5, r3}     // Catch:{ 24Y -> 0x03e4 }
            r18 = r13
            r19 = r14
            java.lang.Object r5 = X.C626836d.A06(r18, r19, r20, r21, r22, r23, r24)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r5 = (byte[]) r5     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r11 = "ed_key_signature"
            java.lang.String[] r18 = new java.lang.String[]{r11, r3}     // Catch:{ 24Y -> 0x03e4 }
            r19 = r6
            java.lang.Object r3 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x03e4 }
            byte[] r3 = (byte[]) r3     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r12 = "count"
            java.lang.String r11 = "value"
            java.lang.String[] r18 = new java.lang.String[]{r12, r11}     // Catch:{ 24Y -> 0x03e4 }
            java.lang.Class<java.lang.Long> r14 = java.lang.Long.class
            java.lang.Long r15 = X.AnonymousClass0x2.A0T()     // Catch:{ 24Y -> 0x03e4 }
            r11 = 128(0x80, double:6.32E-322)
            java.lang.Long r16 = java.lang.Long.valueOf(r11)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.Object r11 = X.C626836d.A06(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.Number r11 = (java.lang.Number) r11     // Catch:{ 24Y -> 0x03e4 }
            r12 = 98
            X.AnonymousClass92Z.A01(r7, r13, r12)     // Catch:{ 24Y -> 0x03e4 }
            r7 = 449(0x1c1, float:6.29E-43)
            X.92a r12 = X.C1896292a.A00(r7)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String[] r7 = new java.lang.String[r6]     // Catch:{ 24Y -> 0x03e4 }
            X.C626836d.A04(r13, r12, r7)     // Catch:{ 24Y -> 0x03e4 }
            r7 = 450(0x1c2, float:6.3E-43)
            X.92a r7 = X.C1896292a.A00(r7)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String[] r6 = new java.lang.String[r6]     // Catch:{ 24Y -> 0x03e4 }
            X.C626836d.A04(r13, r7, r6)     // Catch:{ 24Y -> 0x034b }
        L_0x034b:
            java.lang.String r6 = "backoff"
            java.lang.String[] r7 = new java.lang.String[]{r6}     // Catch:{ 24Y -> 0x03e4 }
            r6 = 451(0x1c3, float:6.32E-43)
            X.92a r6 = X.C1896292a.A00(r6)     // Catch:{ 24Y -> 0x03e4 }
            X.C626836d.A03(r13, r6, r7)     // Catch:{ 24Y -> 0x03e4 }
            long r6 = r11.longValue()     // Catch:{ 24Y -> 0x03e4 }
            boolean r11 = X.AnonymousClass0YS.A05(r2, r4)     // Catch:{ 24Y -> 0x03e4 }
            r4 = 2
            if (r11 != 0) goto L_0x0374
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/ok_pub cannot be verified with ok_key_signature id="
            X.C18260x0.A0r(r2, r1, r3)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r1 = "ok_pub cannot be verified with ok_key_signature"
            r0.BSG(r1, r4, r10)     // Catch:{ 24Y -> 0x03e4 }
            return
        L_0x0374:
            boolean r8 = X.AnonymousClass0YS.A05(r9, r8)     // Catch:{ 24Y -> 0x03e4 }
            if (r8 != 0) goto L_0x0389
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/hk_pub cannot be verified with hk_key_signature id="
            X.C18260x0.A0r(r2, r1, r3)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r1 = "hk_pub cannot be verified with hk_key_signature"
            r0.BSG(r1, r4, r10)     // Catch:{ 24Y -> 0x03e4 }
            return
        L_0x0389:
            boolean r3 = X.AnonymousClass0YS.A05(r5, r3)     // Catch:{ 24Y -> 0x03e4 }
            if (r3 != 0) goto L_0x039e
            java.lang.StringBuilder r3 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r2 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/ed_pub cannot be verified with ed_key_signature id="
            X.C18260x0.A0r(r2, r1, r3)     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r1 = "ed_pub cannot be verified with ed_key_signature"
            r0.BSG(r1, r4, r10)     // Catch:{ 24Y -> 0x03e4 }
            return
        L_0x039e:
            int r8 = (int) r6     // Catch:{ 24Y -> 0x03e4 }
            X.2zM r1 = r0.A00     // Catch:{ 24Y -> 0x03e4 }
            r1.A02()     // Catch:{ 24Y -> 0x03e4 }
            com.whatsapp.wamsys.JniBridge r3 = r0.A0B     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r1 = r0.A0D     // Catch:{ 24Y -> 0x03e4 }
            X.2HW r4 = r3.WESOpaqueClientLoginCreateState(r1, r2)     // Catch:{ 24Y -> 0x03e4 }
            X.2eS r1 = r3.WESOpaqueClientCreateLoginStart(r4)     // Catch:{ 24Y -> 0x03e4 }
            int r3 = r1.A00()     // Catch:{ 24Y -> 0x03e4 }
            if (r3 == 0) goto L_0x03ca
            X.0u2 r4 = r0.A08     // Catch:{ 24Y -> 0x03e4 }
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x03e4 }
            java.lang.String r1 = "WESOpaqueClientCreateLoginStart failed with WESOpaqueStatusType="
            java.lang.String r5 = X.AnonymousClass000.A0Y(r1, r2, r3)     // Catch:{ 24Y -> 0x03e4 }
            r6 = 4
            r7 = 1
            r9 = r10
            r8 = r10
            r4.BSH(r5, r6, r7, r8, r9)     // Catch:{ 24Y -> 0x03e4 }
            return
        L_0x03ca:
            byte[] r1 = r1.A01()     // Catch:{ 24Y -> 0x03e4 }
            java.lang.Object r2 = r0.A0C     // Catch:{ 24Y -> 0x03e4 }
            monitor-enter(r2)     // Catch:{ 24Y -> 0x03e4 }
            r0.A06 = r1     // Catch:{ all -> 0x03e1 }
            r0.A05 = r5     // Catch:{ all -> 0x03e1 }
            r0.A03 = r4     // Catch:{ all -> 0x03e1 }
            r0.A01 = r8     // Catch:{ all -> 0x03e1 }
            r1 = 1
            r0.A00 = r1     // Catch:{ all -> 0x03e1 }
            monitor-exit(r2)     // Catch:{ all -> 0x03e1 }
            r0.A05()     // Catch:{ 24Y -> 0x03e4 }
            return
        L_0x03e1:
            r1 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x03e1 }
            throw r1     // Catch:{ 24Y -> 0x03e4 }
        L_0x03e4:
            r2 = move-exception
            java.lang.String r1 = "encb/EncryptedBackupProtocolHelper/initLoginOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r1, r2)
            java.lang.String r2 = "invalid server response"
            r1 = 1
            r0.BSG(r2, r1, r10)
            return
        L_0x03f1:
            java.lang.Object r7 = r3.A02
            X.2Ir r7 = (X.C41032Ir) r7
            java.lang.Object r6 = r3.A01
            X.0Dg r6 = (X.C02000Dg) r6
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess id="
            X.C18260x0.A0s(r0, r1, r2)
            r5 = -1
            r4 = 1
            X.36K r2 = X.C41032Ir.A02(r13, r7)     // Catch:{ 24Y -> 0x045f }
            r0 = 96
            X.AnonymousClass92Z.A02(r2, r13, r0)     // Catch:{ 24Y -> 0x045f }
            java.lang.String r0 = "success"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ 24Y -> 0x045f }
            r0 = 446(0x1be, float:6.25E-43)
            java.lang.Object r3 = X.C86614Ku.A0r(r13, r2, r0)     // Catch:{ 24Y -> 0x045f }
            X.1vs r3 = (X.C34821vs) r3     // Catch:{ 24Y -> 0x045f }
            java.lang.String r0 = "count"
            java.lang.String[] r2 = new java.lang.String[]{r0}     // Catch:{ 24Y -> 0x045f }
            r0 = 447(0x1bf, float:6.26E-43)
            X.92a r0 = X.C1896292a.A00(r0)     // Catch:{ 24Y -> 0x045f }
            X.C626836d.A03(r13, r0, r2)     // Catch:{ 24Y -> 0x045f }
            if (r3 != 0) goto L_0x043b
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x045f }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess success was empty id="
            X.C18260x0.A0r(r0, r1, r2)     // Catch:{ 24Y -> 0x045f }
            java.lang.String r0 = "success was empty"
            r6.BSG(r0, r4, r5)     // Catch:{ 24Y -> 0x045f }
            return
        L_0x043b:
            java.lang.Object r7 = r3.A00     // Catch:{ 24Y -> 0x045f }
            byte[] r7 = (byte[]) r7     // Catch:{ 24Y -> 0x045f }
            X.2zM r0 = r6.A00     // Catch:{ 24Y -> 0x045f }
            r0.A02()     // Catch:{ 24Y -> 0x045f }
            java.lang.String r0 = "encb/LoginUserHandler/finishLogin saving backup key"
            com.whatsapp.util.Log.i((java.lang.String) r0)     // Catch:{ 24Y -> 0x045f }
            java.lang.Object r1 = r6.A0C     // Catch:{ 24Y -> 0x045f }
            monitor-enter(r1)     // Catch:{ 24Y -> 0x045f }
            X.2oa r3 = r6.A02     // Catch:{ all -> 0x045c }
            monitor-exit(r1)     // Catch:{ all -> 0x045c }
            X.0u2 r2 = r6.A08     // Catch:{ 24Y -> 0x045f }
            X.4FS r1 = r6.A01     // Catch:{ 24Y -> 0x045f }
            X.0mS r0 = new X.0mS     // Catch:{ 24Y -> 0x045f }
            r0.<init>(r2, r6, r3, r7)     // Catch:{ 24Y -> 0x045f }
            r1.BkM(r0)     // Catch:{ 24Y -> 0x045f }
            return
        L_0x045c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x045c }
            throw r0     // Catch:{ 24Y -> 0x045f }
        L_0x045f:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/finishLoginOnSuccess/invalid server response"
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "invalid server response"
            r6.BSG(r0, r4, r5)
            return
        L_0x046b:
            java.lang.Object r4 = r3.A02
            X.2Ir r4 = (X.C41032Ir) r4
            java.lang.Object r5 = r3.A01
            X.8yF r5 = (X.C188058yF) r5
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess id="
            X.C18260x0.A0s(r0, r1, r2)
            r7 = -1
            r6 = 1
            X.36K r2 = X.C41032Ir.A02(r13, r4)     // Catch:{ 24Y -> 0x04ab }
            r0 = 95
            X.AnonymousClass92Z.A02(r2, r13, r0)     // Catch:{ 24Y -> 0x04ab }
            java.lang.String r3 = "success"
            java.lang.String[] r2 = new java.lang.String[]{r3}     // Catch:{ 24Y -> 0x04ab }
            r0 = 445(0x1bd, float:6.24E-43)
            X.C1896292a.A0O(r13, r2, r0)     // Catch:{ 24Y -> 0x04ab }
            X.36K r0 = r13.A0l(r3)     // Catch:{ 24Y -> 0x04ab }
            if (r0 != 0) goto L_0x04a7
            java.lang.StringBuilder r2 = X.AnonymousClass001.A0o()     // Catch:{ 24Y -> 0x04ab }
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess was empty id="
            X.C18260x0.A0r(r0, r1, r2)     // Catch:{ 24Y -> 0x04ab }
            java.lang.String r0 = "success was empty"
            r5.BSG(r0, r6, r7)     // Catch:{ 24Y -> 0x04ab }
            return
        L_0x04a7:
            r5.onSuccess()     // Catch:{ 24Y -> 0x04ab }
            return
        L_0x04ab:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/deleteAccountOnSuccess/invalid server response"
            goto L_0x04b2
        L_0x04af:
            r1 = move-exception
            java.lang.String r0 = "encb/EncryptedBackupProtocolHelper/updateMigrationOnSuccess/invalid server response"
        L_0x04b2:
            com.whatsapp.util.Log.e(r0, r1)
            java.lang.String r0 = "invalid server response"
            r5.BSG(r0, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass939.BdM(X.36K, java.lang.String):void");
    }
}
