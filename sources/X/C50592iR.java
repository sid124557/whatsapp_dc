package X;

import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2iR  reason: invalid class name and case insensitive filesystem */
public class C50592iR {
    public File A00;
    public File A01;
    public File A02;
    public final C56972sr A03;
    public final AnonymousClass310 A04;
    public final C57162tC A05;
    public final AnonymousClass33p A06;
    public final C56542sA A07;
    public final C625835r A08;
    public final C72303dV A09;
    public final C47322d4 A0A;
    public final C66423Lj A0B;
    public final AnonymousClass36W A0C;
    public final C55462qO A0D;
    public final C48152eR A0E;
    public final C28851hs A0F;
    public final C55362qE A0G;
    public final C28901hx A0H;
    public final C55112po A0I;
    public final AnonymousClass2QM A0J;
    public final AnonymousClass2LT A0K;
    public final AnonymousClass317 A0L;
    public final AnonymousClass4FS A0M;
    public final C183538qC A0N;

    public void A00() {
        this.A0G.A04();
        this.A0E.A01();
        this.A00 = null;
        this.A01 = null;
        this.A02 = null;
        Log.i("fpm/ExportHelper/reset()/success");
    }

    public C50592iR(C56972sr r2, AnonymousClass310 r3, C57162tC r4, AnonymousClass33p r5, C56542sA r6, C625835r r7, C72303dV r8, C47322d4 r9, C66423Lj r10, AnonymousClass36W r11, C55462qO r12, C48152eR r13, C28851hs r14, C55362qE r15, C28901hx r16, C55112po r17, AnonymousClass2QM r18, AnonymousClass2LT r19, AnonymousClass317 r20, AnonymousClass4FS r21, C183538qC r22) {
        this.A0M = r21;
        this.A03 = r2;
        this.A07 = r6;
        this.A04 = r3;
        this.A0I = r17;
        this.A0N = r22;
        this.A0C = r11;
        this.A0E = r13;
        this.A0B = r10;
        this.A08 = r7;
        this.A0L = r20;
        this.A06 = r5;
        this.A09 = r8;
        this.A0H = r16;
        this.A0G = r15;
        this.A0J = r18;
        this.A0D = r12;
        this.A0F = r14;
        this.A0A = r9;
        this.A0K = r19;
        this.A05 = r4;
    }

    public final void A01(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isFile() && !file2.getName().startsWith(".")) {
                        long A022 = this.A0G.A02(file2, file2.getPath().replace(AnonymousClass310.A00(this.A04).getPath(), ""), false);
                        if (A022 < 0) {
                            C18260x0.A11("fpm/ExportHelper/exportMessagesWithDb()/Failed to register optional file: ", AnonymousClass001.A0o(), A022);
                        }
                    } else if (file2.isDirectory()) {
                        A01(file2);
                    }
                }
                return;
            }
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("Unable to list files in the directory: ");
            throw AnonymousClass000.A0F(file.getPath(), A0o);
        }
        StringBuilder A0o2 = AnonymousClass001.A0o();
        A0o2.append("The specified path is not a directory: ");
        throw AnonymousClass000.A0F(file.getPath(), A0o2);
    }
}
