package X;

import java.io.File;

/* renamed from: X.6Nf  reason: invalid class name and case insensitive filesystem */
public class C126276Nf extends AnonymousClass854 {
    public C158107jR A00;
    public C180538lE A01;

    public File A01() {
        File A002 = A00((AnonymousClass7JI) null, 110);
        A002.mkdirs();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            A002.setLastModified(currentTimeMillis);
        }
        C1443671g.A00(this.A01, new C157277i2(), A002);
        return A002;
    }
}
