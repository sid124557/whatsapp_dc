package X;

import android.media.MediaDataSource;
import java.io.DataInputStream;
import java.io.IOException;

/* renamed from: X.01N  reason: invalid class name */
public class AnonymousClass01N extends MediaDataSource {
    public long A00;
    public final /* synthetic */ C009207f A01;
    public final /* synthetic */ AnonymousClass0YU A02;

    public AnonymousClass01N(C009207f r1, AnonymousClass0YU r2) {
        this.A02 = r2;
        this.A01 = r1;
    }

    public void close() {
    }

    public long getSize() {
        return -1;
    }

    public int readAt(long j, byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        if (j < 0) {
            return -1;
        }
        try {
            long j2 = this.A00;
            if (j2 != j) {
                if (j2 >= 0 && j >= j2 + ((long) this.A01.A03.available())) {
                    return -1;
                }
                this.A01.A01(j);
                this.A00 = j;
            }
            C009207f r2 = this.A01;
            DataInputStream dataInputStream = r2.A03;
            if (i2 > dataInputStream.available()) {
                i2 = dataInputStream.available();
            }
            int read = r2.read(bArr, i, i2);
            if (read >= 0) {
                this.A00 += (long) read;
                return read;
            }
        } catch (IOException unused) {
        }
        this.A00 = -1;
        return -1;
    }
}
