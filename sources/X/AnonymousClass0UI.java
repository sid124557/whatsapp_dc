package X;

import java.util.Arrays;

/* renamed from: X.0UI  reason: invalid class name */
public final class AnonymousClass0UI {
    public final long A00;
    public final long A01;
    public final AnonymousClass0UF A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0004, code lost:
        if (r14 != null) goto L_0x0006;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.AnonymousClass0UI A00(X.AnonymousClass0WN r12, java.lang.String r13, java.lang.String r14, org.json.JSONObject r15, long r16) {
        /*
            r4 = r14
            if (r13 != 0) goto L_0x0006
            r1 = 0
            if (r14 == 0) goto L_0x0007
        L_0x0006:
            r1 = 1
        L_0x0007:
            java.lang.String r0 = "Either prefix or file upload path must be non-null"
            X.C626936e.A0E(r1, r0)
            java.lang.String r0 = "name"
            java.lang.String r5 = r15.optString(r0)
            java.lang.String r0 = "mimeType"
            java.lang.String r6 = r15.optString(r0)
            java.lang.String r0 = "md5Hash"
            java.lang.String r1 = r15.optString(r0)
            java.lang.String r0 = "sizeBytes"
            java.lang.String r3 = r15.optString(r0)
            java.lang.String r0 = "updateTime"
            java.lang.String r2 = r15.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x0078
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0078
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0078
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0078
            r0 = 2
            byte[] r0 = android.util.Base64.decode(r1, r0)
            java.lang.String r7 = X.C627236i.A07(r0)
            if (r14 != 0) goto L_0x0055
            int r0 = r13.length()
            java.lang.String r4 = r5.substring(r0)
        L_0x0055:
            r0 = r16
            long r8 = X.C615531h.A04(r3, r0)
            android.text.format.Time r1 = new android.text.format.Time
            r1.<init>()
            r1.parse3339(r2)
            r0 = 1
            long r10 = r1.toMillis(r0)
            java.lang.String r0 = "metadata"
            java.lang.String r0 = r15.optString(r0)
            X.0UF r3 = X.AnonymousClass0UF.A00(r12, r0)
            X.0UI r2 = new X.0UI
            r2.<init>(r3, r4, r5, r6, r7, r8, r10)
            return r2
        L_0x0078:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0UI.A00(X.0WN, java.lang.String, java.lang.String, org.json.JSONObject, long):X.0UI");
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || AnonymousClass0UI.class != obj.getClass()) {
                return false;
            }
            AnonymousClass0UI r7 = (AnonymousClass0UI) obj;
            if (this.A00 != r7.A00 || this.A01 != r7.A01 || !this.A05.equals(r7.A05) || !this.A06.equals(r7.A06) || !this.A04.equals(r7.A04) || !this.A03.equals(r7.A03) || !AnonymousClass75J.A00(this.A02, r7.A02)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A04, this.A03, Long.valueOf(this.A00), Long.valueOf(this.A01), this.A02});
    }

    public String A01() {
        AnonymousClass0UF r0 = this.A02;
        if (r0 != null) {
            return r0.A04;
        }
        return this.A06;
    }

    public AnonymousClass0UI(AnonymousClass0UF r1, String str, String str2, String str3, String str4, long j, long j2) {
        C626936e.A06(str);
        this.A06 = str;
        C626936e.A06(str2);
        this.A05 = str2;
        C626936e.A06(str3);
        this.A04 = str3;
        C626936e.A06(str4);
        this.A03 = str4;
        this.A00 = j;
        this.A01 = j2;
        this.A02 = r1;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("RemoteFile{name='");
        A0o.append(this.A05);
        A0o.append('\'');
        A0o.append(", uploadTitle='");
        A0o.append(this.A06);
        A0o.append('\'');
        A0o.append(", mimeType='");
        A0o.append(this.A04);
        A0o.append('\'');
        A0o.append(", md5Hash='");
        A0o.append(this.A03);
        A0o.append('\'');
        A0o.append(", sizeBytes=");
        A0o.append(this.A00);
        A0o.append(", updateTime=");
        A0o.append(this.A01);
        A0o.append(", metadata=");
        return AnonymousClass000.A0Q(this.A02, A0o);
    }
}
