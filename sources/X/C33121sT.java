package X;

import java.io.File;
import org.json.JSONObject;

/* renamed from: X.1sT  reason: invalid class name and case insensitive filesystem */
public final class C33121sT extends AnonymousClass3CR {
    public final C04840Qw A00 = new C04840Qw(100);
    public final C04840Qw A01 = new C04840Qw(100);
    public final C04840Qw A02 = new C04840Qw(100);
    public final AnonymousClass2DP A03;
    public final AnonymousClass1VX A04;
    public final AnonymousClass4FV A05;

    public final AnonymousClass0QL A06(String str, String str2) {
        AnonymousClass0QL r1 = (AnonymousClass0QL) AnonymousClass0YR.A02(new C01700Bw(new C173338Pf(C1453975i.A00(AnonymousClass0x9.A0d(str.getBytes())))), (String) null, true).A00;
        if (r1 == null) {
            return null;
        }
        this.A00.A08(str2, r1);
        return r1;
    }

    public final AnonymousClass0QL A05(File file, String str) {
        if (str == null) {
            str = A07(file);
        }
        AnonymousClass0QL r0 = (AnonymousClass0QL) this.A00.A04(str);
        if (r0 != null) {
            return r0;
        }
        JSONObject A08 = A08(file, str);
        if (A08 == null) {
            return null;
        }
        return A06(C18290x4.A0o(A08), str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0031, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0032, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0035, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A07(java.io.File r5) {
        /*
            r4 = this;
            X.0Qw r3 = r4.A02
            java.lang.String r0 = r5.getAbsolutePath()
            java.lang.Object r1 = r3.A04(r0)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 != 0) goto L_0x0036
            java.io.FileInputStream r2 = X.AnonymousClass0x9.A0g(r5)
            java.security.MessageDigest r0 = X.AnonymousClass0x7.A0t()     // Catch:{ all -> 0x002f }
            X.C615131b.A02(r2, r0)     // Catch:{ all -> 0x002f }
            byte[] r0 = r0.digest()     // Catch:{ all -> 0x002f }
            java.lang.String r1 = X.C18290x4.A0t(r0)     // Catch:{ all -> 0x002f }
            r2.close()
            X.C162457s7.A0D(r1)
            java.lang.String r0 = r5.getAbsolutePath()
            r3.A08(r0, r1)
            return r1
        L_0x002f:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0031 }
        L_0x0031:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        L_0x0036:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33121sT.A07(java.io.File):java.lang.String");
    }

    public final JSONObject A08(File file, String str) {
        if (str == null) {
            str = A07(file);
        }
        JSONObject jSONObject = (JSONObject) this.A01.A04(str);
        if (jSONObject == null) {
            return A09(AnonymousClass0x9.A0g(file), str, file.length());
        }
        return jSONObject;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        X.AnonymousClass2A8.A00(r7, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00c2, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00c5, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c6, code lost:
        X.AnonymousClass2A8.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c9, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject A09(java.io.InputStream r10, java.lang.String r11, long r12) {
        /*
            r9 = this;
            java.lang.String r0 = "LottieCache/getJsonObjectFromStream"
            X.33M r5 = X.AnonymousClass33M.A01(r0)
            r5.A09()
            X.2DP r0 = r9.A03
            r8 = 0
            X.3dX r0 = r0.A00
            X.3Db r0 = r0.A01
            X.1VX r2 = X.C64333Db.A4B(r0)
            X.4C1 r0 = r0.AS1
            java.lang.Object r0 = r0.get()
            X.3Dh r0 = (X.C64393Dh) r0
            X.1bi r1 = new X.1bi
            r1.<init>(r0, r2)
            java.io.ByteArrayOutputStream r7 = X.AnonymousClass0x9.A0e()
            java.util.zip.ZipInputStream r2 = new java.util.zip.ZipInputStream
            r2.<init>(r10)
            boolean r0 = r1.A04(r2)
            if (r0 != 0) goto L_0x0055
            r3 = -1
        L_0x0032:
            r1 = 0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L_0x0060
            X.1VX r2 = r9.A04
            r1 = 6787(0x1a83, float:9.51E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x0054
            X.1Wk r1 = new X.1Wk
            r1.<init>()
            java.lang.Integer r0 = X.C18280x3.A0S()
            r1.A00 = r0
            X.4FV r0 = r9.A05
            r0.BhD(r1)
        L_0x0054:
            return r8
        L_0x0055:
            long r3 = r1.A03(r7, r2)     // Catch:{ all -> 0x00bc }
            r7.close()     // Catch:{ all -> 0x00c3 }
            r2.close()
            goto L_0x0032
        L_0x0060:
            long r3 = r5.A07()
            X.1VX r2 = r9.A04
            r1 = 6787(0x1a83, float:9.51E-42)
            X.2vE r0 = X.C58422vE.A02
            boolean r0 = r2.A0Y(r0, r1)
            if (r0 == 0) goto L_0x009d
            X.1Yf r6 = new X.1Yf
            r6.<init>()
            java.lang.Integer r0 = X.C18280x3.A0S()
            r6.A00 = r0
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            r6.A02 = r0
            double r2 = (double) r12
            r4 = 5000(0x1388, double:2.4703E-320)
            double r0 = (double) r4
            double r2 = r2 / r0
            double r4 = java.lang.Math.ceil(r2)
            r0 = 5
            double r0 = (double) r0
            double r4 = r4 * r0
            r2 = 1000(0x3e8, double:4.94E-321)
            double r0 = (double) r2
            double r4 = r4 * r0
            long r0 = (long) r4
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r6.A01 = r0
            X.4FV r0 = r9.A05
            r0.BhD(r6)
        L_0x009d:
            byte[] r2 = r7.toByteArray()     // Catch:{ JSONException -> 0x00b5 }
            X.C162457s7.A0D(r2)     // Catch:{ JSONException -> 0x00b5 }
            java.nio.charset.Charset r1 = X.AnonymousClass79X.A05     // Catch:{ JSONException -> 0x00b5 }
            java.lang.String r0 = new java.lang.String     // Catch:{ JSONException -> 0x00b5 }
            r0.<init>(r2, r1)     // Catch:{ JSONException -> 0x00b5 }
            org.json.JSONObject r1 = X.AnonymousClass0x9.A1H(r0)     // Catch:{ JSONException -> 0x00b5 }
            X.0Qw r0 = r9.A01     // Catch:{ JSONException -> 0x00b5 }
            r0.A08(r11, r1)     // Catch:{ JSONException -> 0x00b5 }
            return r1
        L_0x00b5:
            r1 = move-exception
            java.lang.String r0 = "LottieCache/getJsonObjectFromStream failed to create lottie json"
            com.whatsapp.util.Log.w(r0, r1)
            return r8
        L_0x00bc:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00be }
        L_0x00be:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r7, r1)     // Catch:{ all -> 0x00c3 }
            throw r0     // Catch:{ all -> 0x00c3 }
        L_0x00c3:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00c5 }
        L_0x00c5:
            r0 = move-exception
            X.AnonymousClass2A8.A00(r2, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C33121sT.A09(java.io.InputStream, java.lang.String, long):org.json.JSONObject");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33121sT(AnonymousClass2DP r3, AnonymousClass1VX r4, AnonymousClass4FV r5, AnonymousClass2MO r6) {
        super(r6);
        C18260x0.A0c(r6, r4, r5, r3);
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        A04();
    }
}
