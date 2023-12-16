package X;

import java.io.File;

/* renamed from: X.1eA  reason: invalid class name and case insensitive filesystem */
public class C27591eA extends AnonymousClass3P2 {
    public final /* synthetic */ C66493Lq A00;
    public final /* synthetic */ File A01;
    public final /* synthetic */ File A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27591eA(C56612sH r9, C28891hw r10, C66543Lv r11, C66493Lq r12, C66493Lq r13, AnonymousClass2U1 r14, C56832sd r15, File file, File file2) {
        super(r9, r10, r11, r13, r14, r15);
        this.A00 = r12;
        this.A01 = file;
        this.A02 = file2;
    }

    public void BdP(AnonymousClass2RJ r9, C27991fJ r10) {
        super.BdP(r9, r10);
        C66493Lq r7 = this.A00;
        AnonymousClass3ZH A0A = r7.A0F.A0A(r10);
        C56332ro r5 = r7.A0I;
        File A002 = r5.A00(A0A);
        C626936e.A06(A002);
        File file = this.A01;
        if (!file.renameTo(A002)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            AnonymousClass000.A10(file, "group/create again, failed to rename ", A0o);
            AnonymousClass000.A10(A002, " to ", A0o);
            AnonymousClass0x2.A19(A0o);
        }
        File A012 = r5.A01(A0A);
        C626936e.A06(A012);
        File file2 = this.A02;
        if (!file2.renameTo(A012)) {
            StringBuilder A0o2 = AnonymousClass001.A0o();
            AnonymousClass000.A10(file2, "group/create again, failed to rename ", A0o2);
            AnonymousClass000.A10(A012, " to ", A0o2);
            AnonymousClass0x2.A19(A0o2);
        }
        r7.A15.A0F(A0A);
    }
}
