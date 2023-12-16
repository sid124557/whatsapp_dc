package X;

import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.6tU  reason: invalid class name and case insensitive filesystem */
public class C140286tU extends FileInputStream {
    public long A00;
    public final /* synthetic */ C135406kc A01;
    public final /* synthetic */ C622934l A02;

    public int read(byte[] bArr, int i, int i2) {
        C162457s7.A0J(bArr, 0);
        while (getChannel().size() < this.A00 + ((long) i2) && (!this.A01.A01)) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException unused) {
                return 0;
            }
        }
        int read = super.read(bArr, i, i2);
        if (read >= 0) {
            this.A00 += (long) read;
        }
        return read;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140286tU(C135406kc r1, C622934l r2, File file) {
        super(file);
        this.A02 = r2;
        this.A01 = r1;
    }
}
