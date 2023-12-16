package X;

import com.whatsapp.util.Log;
import java.util.Arrays;

/* renamed from: X.0W0  reason: invalid class name */
public class AnonymousClass0W0 {
    public final byte[] A00;
    public final byte[] A01;

    /* JADX WARNING: Removed duplicated region for block: B:7:0x000f  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A00(byte[] r4) {
        /*
            r3 = 0
        L_0x0001:
            int r2 = r4.length
            if (r3 >= r2) goto L_0x000d
            byte r1 = r4[r3]
            r0 = 45
            if (r1 != r0) goto L_0x000d
            int r3 = r3 + 1
            goto L_0x0001
        L_0x000d:
            if (r3 != r2) goto L_0x0017
            java.lang.String r0 = "BackupFooter/verify-jid/empty-suffix"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.String r0 = ""
            return r0
        L_0x0017:
            int r2 = r2 - r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4, r3, r2)
            java.lang.String r0 = r0.trim()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0W0.A00(byte[]):java.lang.String");
    }

    public static byte[] A01(String str) {
        byte[] bArr = new byte[4];
        Arrays.fill(bArr, (byte) 45);
        if (str != null) {
            int length = str.length();
            if (length < 2) {
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append("BackupFooter/get-jid-suffix/unexpected-phone-number ");
                A0o.append(str);
                A0o.append(" it has less than ");
                A0o.append(2);
                Log.e(AnonymousClass000.A0X(" digits", A0o));
                return bArr;
            }
            System.arraycopy(str.getBytes(), length - 2, bArr, 2, 2);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("BackupFooter/get-jid-suffix ");
        A0o2.append(str);
        A0o2.append(" suffix: ");
        Log.i(AnonymousClass000.A0X(new String(bArr), A0o2));
        return bArr;
    }

    public boolean A03(String str) {
        byte[] bArr = this.A01;
        if (bArr == null) {
            return false;
        }
        String A002 = A00(bArr);
        if (str.endsWith(A002)) {
            return false;
        }
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFooter/has-jid-user-mismatch/expected-jid-user-ends-with: ");
        A0o.append(A002);
        Log.e(AnonymousClass000.A0V("  actual-jid-user: ", str, A0o));
        return true;
    }

    public AnonymousClass0W0(byte[] bArr, byte[] bArr2) {
        this.A00 = bArr;
        this.A01 = bArr2;
    }

    public AnonymousClass0NK A02(C48772fR r6, String str, String str2) {
        int i;
        Log.i(AnonymousClass000.A0V("BackupFooter/verify-integrity/actual-digest/  ", str, AnonymousClass001.A0o()));
        String A07 = C627236i.A07(this.A00);
        Log.i(AnonymousClass000.A0V("BackupFooter/verify-integrity/expected-digest/", A07, AnonymousClass001.A0o()));
        if (str.equals(A07)) {
            Log.i("BackupFooter/verify-integrity/digest-matches/success");
            if (this.A01 == null || str2 == null || !A03(str2)) {
                i = 1;
            } else {
                r6.A01("BackupFooter/verify-integrity/jid-mismatch", 4);
                return new AnonymousClass0NK(4, (String) null);
            }
        } else {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("BackupFooter/verify-integrity/failed expected-digest:");
            A0o.append(A07);
            r6.A01(AnonymousClass000.A0V(" actual-digest:", str, A0o), 4);
            i = 2;
        }
        return new AnonymousClass0NK(i, (String) null);
    }

    public String toString() {
        String str;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("BackupFooter{digest=");
        A0o.append(Arrays.toString(this.A00));
        A0o.append(", jidSuffix=");
        byte[] bArr = this.A01;
        if (bArr != null) {
            str = Arrays.toString(bArr);
        } else {
            str = "null";
        }
        A0o.append(str);
        return AnonymousClass000.A0d(A0o);
    }
}
