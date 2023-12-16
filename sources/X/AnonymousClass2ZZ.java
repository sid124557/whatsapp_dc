package X;

import android.util.Pair;

/* renamed from: X.2ZZ  reason: invalid class name */
public class AnonymousClass2ZZ {
    public final C72303dV A00;
    public final C55332qB A01;
    public final C66443Ll A02;

    public Pair A00(C624134x r14) {
        C85284Fq A04;
        boolean z = r14 instanceof C30351mJ;
        Integer A0g = AnonymousClass0x7.A0g();
        if (z) {
            return AnonymousClass0x9.A0C(A0g, -1L);
        }
        if (!C624134x.A0d(r14) || r14.A11() == null) {
            return AnonymousClass0x9.A0C(C18290x4.A0d(), -1L);
        }
        C30531mb r8 = new C30531mb(r14.A11().A02, r14.A11().A00);
        AnonymousClass2z0 r1 = r14.A1J;
        C30331mH.A03(r14.A0n(), r8, r1);
        long j = r14.A1L;
        r8.A02 = j;
        C85284Fq A042 = this.A00.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                long A002 = this.A02.A00(r8);
                if (A002 == -1) {
                    StringBuilder A0o = AnonymousClass001.A0o();
                    C18260x0.A1L(A0o, AnonymousClass2z0.A07(r8, "MessageAddOnEditManager/storeEditOriginalAndCopyReceipts duplicate addon message ", A0o));
                    Pair A0C = AnonymousClass0x9.A0C(A0g, -1L);
                    Axl.close();
                    A042.close();
                    return A0C;
                }
                if (r1.A02) {
                    A04 = this.A01.A02.A04();
                    C56862sg r7 = ((AnonymousClass3H0) A04).A03;
                    String[] A1Z = AnonymousClass0x9.A1Z();
                    C18260x0.A1X(A1Z, A002);
                    C18270x1.A1R(A1Z, j);
                    r7.A0I("INSERT INTO message_add_on_receipt_device(message_add_on_row_id, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp)SELECT ?, receipt_device_jid_row_id, primary_device_version, receipt_device_timestamp FROM receipt_device WHERE message_row_id = ?", "RECEIPT_COPY_QUERY", A1Z);
                    A04.close();
                }
                Axl.A00();
                Axl.close();
                A042.close();
                return AnonymousClass0x9.A0C(AnonymousClass001.A0f(), Long.valueOf(A002));
            } catch (Throwable th) {
                Axl.close();
                throw th;
            }
        } catch (Throwable th2) {
            try {
                A042.close();
                throw th2;
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
                throw th2;
            }
        }
        throw th;
    }

    public AnonymousClass2ZZ(C72303dV r1, C55332qB r2, C66443Ll r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }
}
