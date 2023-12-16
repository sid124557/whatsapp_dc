package X;

import android.os.Build;
import android.os.Environment;
import java.io.File;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2s6  reason: invalid class name and case insensitive filesystem */
public class C56512s6 {
    public final AnonymousClass310 A00;
    public final C54292oU A01;
    public final AnonymousClass5ZR A02;
    public final C61072zf A03;
    public final C48092eK A04;
    public final AnonymousClass4FS A05;
    public final C183538qC A06;
    public final List A07 = new CopyOnWriteArrayList();

    public C49692gw A00() {
        return (C49692gw) ((AnonymousClass2NX) this.A06.get()).A02.get();
    }

    public File A03(File file) {
        C49692gw r1;
        if (this.A00.A0C(file)) {
            r1 = A00();
        } else {
            r1 = this.A04.A00;
        }
        return r1.A00("");
    }

    public void A04(C836649h r2) {
        if (r2 != null) {
            this.A07.add(r2);
        }
    }

    public void A05(C836649h r2) {
        if (r2 != null) {
            this.A07.remove(r2);
        }
    }

    public boolean A06() {
        C183538qC r1 = this.A06;
        if (((AnonymousClass2NX) r1.get()).A00 || ((AnonymousClass2NX) r1.get()).A01) {
            return true;
        }
        return false;
    }

    public C56512s6(AnonymousClass310 r3, C54292oU r4, AnonymousClass5ZR r5, C61072zf r6, C48092eK r7, AnonymousClass4FS r8) {
        this.A01 = r4;
        this.A05 = r8;
        this.A00 = r3;
        this.A03 = r6;
        this.A02 = r5;
        this.A04 = r7;
        this.A06 = C72333dY.A06(new AnonymousClass4KH(r3, r5, r6, 0));
    }

    public File A01() {
        C49692gw A002 = A00();
        A002.A01();
        return A002.A03;
    }

    public File A02() {
        return A00().A00("");
    }

    public boolean A07(C85014Ep r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if (!"mounted".equals(externalStorageState) && !"mounted_ro".equals(externalStorageState)) {
            r4.Beo(externalStorageState);
            return false;
        } else if (Build.VERSION.SDK_INT < 23 || C107385bE.A08() || this.A02.A03(C107035aa.A04()) != -1) {
            return true;
        } else {
            r4.Bep();
            return false;
        }
    }

    public boolean A08(C85014Ep r4) {
        String externalStorageState = Environment.getExternalStorageState();
        if ("mounted_ro".equals(externalStorageState)) {
            r4.BZP(externalStorageState);
            return false;
        } else if (!"mounted".equals(externalStorageState)) {
            r4.Beo(externalStorageState);
            return false;
        } else if (C107385bE.A08() || this.A02.A02("android.permission.WRITE_EXTERNAL_STORAGE") != -1) {
            return true;
        } else {
            r4.BZQ();
            return false;
        }
    }
}
