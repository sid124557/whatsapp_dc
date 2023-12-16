package X;

import android.os.SystemClock;
import java.util.Set;

/* renamed from: X.2o2  reason: invalid class name and case insensitive filesystem */
public class C54012o2 {
    public final C04840Qw A00 = new C04840Qw(250);
    public final C116985rC A01;
    public final C116985rC A02;
    public final C56612sH A03;
    public final C49472ga A04;
    public final C66483Lp A05;
    public final C72303dV A06;
    public final C55332qB A07;
    public final C49512ge A08;
    public final C46692c3 A09;
    public final C55832qz A0A;
    public final Set A0B = AnonymousClass002.A0K();

    public void A02(C624134x r6, Set set) {
        this.A05.A07(r6, set);
        C56632sJ A002 = C55332qB.A00(this.A07, r6);
        StringBuilder A0o = AnonymousClass001.A0o();
        C624134x.A0S(r6, "BaseReceiptDeviceStore/resetAndAddBlankReceiptsForTargetDevices: msg_key=", A0o);
        A0o.append("device count=");
        C18260x0.A1F(A0o, set.size());
        A002.A00.A05(Long.valueOf(r6.A1L));
        A002.A03(r6, set, true);
    }

    public C54012o2(C116985rC r3, C116985rC r4, C56612sH r5, C49472ga r6, C66483Lp r7, C72303dV r8, C55332qB r9, C49512ge r10, C46692c3 r11, C55832qz r12) {
        this.A03 = r5;
        this.A0A = r12;
        this.A08 = r10;
        this.A04 = r6;
        this.A06 = r8;
        this.A01 = r3;
        this.A07 = r9;
        this.A09 = r11;
        this.A05 = r7;
        this.A02 = r4;
    }

    public AnonymousClass2W3 A00(C624134x r9) {
        long uptimeMillis = SystemClock.uptimeMillis();
        AnonymousClass2z0 r5 = r9.A1J;
        C04840Qw r3 = this.A00;
        AnonymousClass2W3 r0 = (AnonymousClass2W3) r3.A04(r5);
        if (r0 != null) {
            return r0;
        }
        AnonymousClass2W3 A002 = this.A08.A00(r9.A1L);
        r3.A08(r5, A002);
        this.A04.A02("ReceiptManager/getMessageReceipts", C18310x6.A0A(uptimeMillis));
        return A002;
    }

    public void A01(C624134x r15) {
        Throwable th;
        long uptimeMillis = SystemClock.uptimeMillis();
        C85284Fq A042 = this.A06.A04();
        try {
            C69833Yo Axl = A042.Axl();
            try {
                C49512ge r9 = this.A08;
                long j = r15.A1L;
                C85284Fq A043 = r9.A02.A04();
                try {
                    C69833Yo Axl2 = A043.Axl();
                    String[] strArr = new String[1];
                    C18260x0.A1X(strArr, j);
                    ((AnonymousClass3H0) A043).A03.A07("receipt_user", "message_row_id=?", "deleteMessageReceipts/DELETE_RECEIPT_USER", strArr);
                    Axl2.A00();
                    A043.B25(new C70083Zv(r9, j, 12));
                    Axl2.close();
                    A043.close();
                    C55332qB r0 = this.A07;
                    long j2 = r15.A1L;
                    AnonymousClass1R3 r92 = r0.A01;
                    A043 = r92.A04.A04();
                    Axl2 = A043.Axl();
                    String[] strArr2 = new String[1];
                    C18260x0.A1X(strArr2, j2);
                    ((AnonymousClass3H0) A043).A03.A07("receipt_device", "message_row_id = ?", "MessageReceiptDeviceStore/deleteMessageReceipts/DELETE_RECEIPT_DEVICE", strArr2);
                    Axl2.A00();
                    A043.B25(new C70083Zv(r92, j2, 11));
                    Axl2.close();
                    A043.close();
                    C46692c3 r02 = this.A09;
                    AnonymousClass2z0 r1 = r15.A1J;
                    C85284Fq A044 = r02.A05.A04();
                    try {
                        C95814uZ r03 = r1.A00;
                        if (r03 != null) {
                            String[] A1Z = AnonymousClass0x9.A1Z();
                            C18280x3.A0v(r03, A1Z);
                            AnonymousClass3H0.A04(r1.A01, A044, A1Z, 1).A07("receipts", "key_remote_jid = ? AND key_id = ?", "deleteMessageReceipts/DELETE_RECEIPTS", A1Z);
                        }
                        A044.close();
                        Axl.A00();
                        C70093Zw.A01(A042, this, r15, 47);
                        Axl.close();
                        A042.close();
                        this.A04.A02("ReceiptManager/deleteMessageReceiptsOnRevoke", C18310x6.A0A(uptimeMillis));
                        return;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    A043.close();
                    throw th;
                }
                throw th;
            } finally {
                Axl.close();
            }
        } catch (Throwable th4) {
            try {
                A042.close();
                throw th4;
            } catch (Throwable th5) {
                th4.addSuppressed(th5);
                throw th4;
            }
        }
    }
}
