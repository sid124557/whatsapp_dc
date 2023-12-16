package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.34Y  reason: invalid class name */
public class AnonymousClass34Y {
    public static final List A04 = AnonymousClass001.A0s();
    public final List A00 = AnonymousClass001.A0s();
    public final List A01 = AnonymousClass001.A0s();
    public final List A02 = AnonymousClass001.A0s();
    public final List A03 = AnonymousClass001.A0s();

    public AnonymousClass34Y(AnonymousClass36K r11) {
        List list;
        Object obj;
        List list2;
        Object A012;
        AnonymousClass36K[] r0;
        C42732Ph r4;
        AnonymousClass36K A0l;
        AnonymousClass36K[] r02;
        AnonymousClass36K A0l2 = r11.A0l("sync");
        if (A0l2 != null) {
            Iterator A0M = AnonymousClass36K.A0M(A0l2, "collection");
            while (A0M.hasNext()) {
                AnonymousClass36K A0Y = C18310x6.A0Y(A0M);
                if ("error".equals(A0Y.A0r(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, (String) null))) {
                    AnonymousClass36K A0l3 = A0Y.A0l("error");
                    C626936e.A06(A0l3);
                    try {
                        int A0b = A0l3.A0b("code", -1);
                        String A0r = A0l3.A0r("text", (String) null);
                        if (A0b != 409 || (A0l = A0Y.A0l("patches")) == null || (r02 = A0l.A03) == null || r02.length <= 0) {
                            r4 = new C42732Ph((AnonymousClass1DW) null, A01(A0Y), A04, AnonymousClass36K.A0X(A0Y, "has_more_patches", (String) null));
                        } else {
                            r4 = A00(A0Y);
                        }
                        list = this.A01;
                        obj = new C45832ae(r4, A0r, A01(A0Y), A0b);
                    } catch (AnonymousClass24Y e) {
                        StringBuilder A0o = AnonymousClass001.A0o();
                        A0o.append("Expected attribute code in ");
                        A0o.append(A0l3);
                        throw new C23331Se(true, AnonymousClass000.A0a(" exception", A0o, e));
                    }
                } else if (A0Y.A0r("version", (String) null) != null) {
                    try {
                        long A0e = A0Y.A0e("version", -1);
                        if (A0e != -1) {
                            list = this.A03;
                            obj = new AnonymousClass2K2(A0e, A01(A0Y));
                        } else {
                            throw new C23331Se(true, AnonymousClass000.A0k(A0Y, "Expected attribute version in ").toString());
                        }
                    } catch (AnonymousClass24Y e2) {
                        throw new C23331Se(true, AnonymousClass000.A0a(" exception", AnonymousClass000.A0k(A0Y, "Expected attribute version in "), e2));
                    }
                } else {
                    AnonymousClass36K A0l4 = A0Y.A0l("patches");
                    if ((A0l4 == null || (r0 = A0l4.A03) == null || r0.length <= 0) && A0Y.A0l("snapshot") == null) {
                        list2 = this.A00;
                        A012 = A01(A0Y);
                    } else {
                        list2 = this.A02;
                        A012 = A00(A0Y);
                    }
                    list2.add(A012);
                }
                list.add(obj);
            }
            return;
        }
        throw new C23331Se(true, "Expected node sync in response, but not found");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r2 != null) goto L_0x0013;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00ef, code lost:
        if (r5 != 101) goto L_0x00f1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C42732Ph A00(X.AnonymousClass36K r9) {
        /*
            r8 = this;
            java.lang.String r4 = "snapshot"
            X.36K r3 = r9.A0l(r4)
            java.lang.String r0 = "patches"
            X.36K r2 = r9.A0l(r0)
            if (r3 != 0) goto L_0x0013
            r1 = 0
            if (r2 == 0) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            java.lang.String r0 = "SyncResponse/parseCollectionWithPatches both snapshot and patches node is null"
            X.C626936e.A0E(r1, r0)
            if (r3 == 0) goto L_0x005c
            X.36K r0 = r9.A0l(r4)
            X.C626936e.A06(r0)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x004b
            int r0 = r1.length
            if (r0 == 0) goto L_0x004b
            X.1DW r0 = X.AnonymousClass1DW.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0032 }
            X.6cX r4 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0032 }
            X.1DW r4 = (X.AnonymousClass1DW) r4     // Catch:{ 6u5 -> 0x0032 }
            goto L_0x005d
        L_0x0032:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-response/parseCollectionWithSnapshot failed to parse patch data in "
            X.C18260x0.A0k(r9, r0, r1, r2)
            r1 = 69
            java.lang.String r0 = "name"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r9, r0)
            X.1Sf r0 = X.C23341Sf.A00(r0, r1)
            throw r0
        L_0x004b:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r4)
            java.lang.String r0 = " body was empty."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r1 = 1
            X.1Se r0 = new X.1Se
            r0.<init>(r1, r2)
            throw r0
        L_0x005c:
            r4 = 0
        L_0x005d:
            java.util.ArrayList r3 = X.AnonymousClass001.A0s()
            if (r2 == 0) goto L_0x013e
            java.lang.String r5 = "patch"
            java.util.Iterator r2 = X.AnonymousClass36K.A0M(r2, r5)
        L_0x006a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00af
            X.36K r0 = X.C18310x6.A0Y(r2)
            byte[] r1 = r0.A01
            if (r1 == 0) goto L_0x009e
            int r0 = r1.length
            if (r0 == 0) goto L_0x009e
            X.1Do r0 = X.C21891Do.DEFAULT_INSTANCE     // Catch:{ 6u5 -> 0x0085 }
            X.6cX r0 = X.C130786cX.A05(r0, r1)     // Catch:{ 6u5 -> 0x0085 }
            r3.add(r0)     // Catch:{ 6u5 -> 0x0085 }
            goto L_0x006a
        L_0x0085:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass001.A0o()
            java.lang.String r0 = "sync-response/parseCollectionWithPatches failed to parse patch data in "
            X.C18260x0.A0k(r9, r0, r1, r2)
            r1 = 18
            java.lang.String r0 = "name"
            java.lang.String r0 = X.AnonymousClass36K.A0L(r9, r0)
            X.1Sf r0 = X.C23341Sf.A00(r0, r1)
            throw r0
        L_0x009e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A0l(r5)
            java.lang.String r0 = " body was empty."
            java.lang.String r2 = X.AnonymousClass000.A0X(r0, r1)
            r1 = 1
            X.1Se r0 = new X.1Se
            r0.<init>(r1, r2)
            throw r0
        L_0x00af:
            java.lang.String r0 = "name"
            java.lang.String r2 = X.AnonymousClass36K.A0L(r9, r0)
            java.util.HashSet r5 = X.C18310x6.A0r(r3)
            java.util.Iterator r7 = r3.iterator()
        L_0x00be:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x013e
            java.lang.Object r6 = r7.next()
            X.1Do r6 = (X.C21891Do) r6
            int r1 = r6.bitField0_
            r0 = r1 & 32
            if (r0 == 0) goto L_0x00fb
            X.1Ba r0 = r6.exitCode_
            r1 = r0
            if (r0 != 0) goto L_0x00d7
            X.1Ba r0 = X.C21231Ba.DEFAULT_INSTANCE
        L_0x00d7:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x00f1
            if (r1 != 0) goto L_0x00e1
            X.1Ba r1 = X.C21231Ba.DEFAULT_INSTANCE
        L_0x00e1:
            long r5 = r1.code_
            r3 = 100
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x00f8
            r3 = 101(0x65, double:5.0E-322)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r0 = 37
            if (r1 == 0) goto L_0x00f3
        L_0x00f1:
            r0 = 38
        L_0x00f3:
            X.1Sf r0 = X.C23341Sf.A00(r2, r0)
            throw r0
        L_0x00f8:
            r0 = 36
            goto L_0x00f3
        L_0x00fb:
            r0 = r1 & 1
            if (r0 == 0) goto L_0x0137
            X.1Ab r0 = r6.version_
            if (r0 != 0) goto L_0x0105
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0105:
            int r0 = r0.bitField0_
            r0 = r0 & 1
            if (r0 == 0) goto L_0x0137
            r0 = r1 & 2
            if (r0 == 0) goto L_0x011e
            X.8ya r0 = r6.mutations_
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x011e
            r0 = 14
            X.1Sf r0 = X.C23341Sf.A00(r2, r0)
            throw r0
        L_0x011e:
            X.1Ab r0 = r6.version_
            if (r0 != 0) goto L_0x0124
            X.1Ab r0 = X.C20981Ab.DEFAULT_INSTANCE
        L_0x0124:
            long r0 = r0.version_
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            boolean r0 = r5.add(r0)
            if (r0 != 0) goto L_0x00be
            r0 = 9
            X.1Sf r0 = X.C23341Sf.A00(r2, r0)
            throw r0
        L_0x0137:
            r0 = 8
            X.1Sf r0 = X.C23341Sf.A00(r2, r0)
            throw r0
        L_0x013e:
            java.lang.String r0 = "has_more_patches"
            java.lang.String r1 = X.AnonymousClass36K.A0L(r9, r0)
            java.lang.String r0 = "true"
            boolean r2 = r0.equals(r1)
            java.lang.String r1 = r8.A01(r9)
            X.2Ph r0 = new X.2Ph
            r0.<init>(r4, r1, r3, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass34Y.A00(X.36K):X.2Ph");
    }

    public final String A01(AnonymousClass36K r4) {
        String A0L = AnonymousClass36K.A0L(r4, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        if (A0L != null) {
            return A0L;
        }
        throw new C23331Se(true, AnonymousClass000.A0P(r4, "Expected attribute name in ", AnonymousClass001.A0o()));
    }

    public AnonymousClass34Y() {
    }
}
