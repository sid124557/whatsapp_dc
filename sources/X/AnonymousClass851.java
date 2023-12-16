package X;

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: X.851  reason: invalid class name */
public class AnonymousClass851 implements C180528lD {
    public Boolean A00 = null;
    public Boolean A01 = null;
    public final C54372oc A02;
    public final C180598lK A03;
    public final Map A04 = AnonymousClass0x7.A0y();
    public final Executor A05;

    public /* bridge */ /* synthetic */ void BXh(C157277i2 r8, C150297Qb r9, File file) {
        File file2;
        C126336Nl r5 = (C126336Nl) r9;
        String str = r5.A00;
        C157277i2 r3 = r8;
        if (str == null) {
            str = r8.A00;
        }
        r5.A00 = str;
        Map map = this.A04;
        File file3 = file;
        try {
            file2 = file.getCanonicalFile();
        } catch (IOException unused) {
            file2 = file.getAbsoluteFile();
        }
        map.put(file2, r5);
        this.A05.execute(new C71593cM((Object) this, (Object) r3, (Object) file3, (Object) r5, 2));
    }

    public AnonymousClass851(C180598lK r3) {
        this.A03 = r3;
        this.A02 = ((C180548lF) r3).BDL("eviction.v2");
        this.A05 = ((C180578lI) r3).B7T(C141406vW.CONCURRENT);
    }
}
