package X;

import java.io.OutputStream;
import java.util.List;
import javax.net.ssl.SSLException;

/* renamed from: X.6uT  reason: invalid class name and case insensitive filesystem */
public class C140776uT extends OutputStream {
    public boolean A00 = false;
    public final C179538jJ A01;

    public void close() {
        this.A00 = true;
    }

    public void write(byte[] bArr, int i, int i2) {
        List list;
        if (!this.A00) {
            AnonymousClass8U6 r8 = (AnonymousClass8U6) this.A01;
            try {
                int i3 = i2;
                AnonymousClass7T8 r6 = new AnonymousClass7T8(bArr, i, i3);
                if (r8.A0E && !r8.A0D) {
                    C171558Hn r10 = r8.A04;
                    if (!(!r10.A0Y || r10.A0R == null || (list = r10.A0S) == null)) {
                        r10.A0Z = true;
                        long j = (long) i3;
                        long j2 = r10.A0C.A03.maxEarlyDataSize;
                        if (r10.A04 + j > j2) {
                            r10.A04 = j2;
                            long j3 = r10.A05 + j;
                            long j4 = r10.A06;
                            if (j3 <= j4) {
                                r10.A05 = j3;
                                list.add(r6);
                                return;
                            }
                            StringBuilder A0o = AnonymousClass001.A0o();
                            A0o.append("Client request exceeded the max spillover limit ");
                            A0o.append(j3);
                            throw C143806zV.A01(AnonymousClass000.A0Z(" > ", A0o, j4), (byte) 80);
                        }
                        r8.A08.A00(new C136556mr(r6));
                        r8.A04.A0R.add(r6);
                        r8.A04.A04 += j;
                        return;
                    }
                }
                r8.A08.A00(new C136506mm(r6));
            } catch (C143806zV e) {
                r8.A0C(e.ex, (byte) 2, e.description, e.errorTransient);
            } catch (Exception e2) {
                r8.A0C(new SSLException(AnonymousClass6C8.A0h(e2)), (byte) 2, (byte) 80, false);
            }
        } else {
            throw AnonymousClass002.A0C("Stream is closed.");
        }
    }

    public C140776uT(C179538jJ r2) {
        this.A01 = r2;
    }

    public void write(int i) {
        if (!this.A00) {
            write(new byte[]{(byte) (i & 255)}, 0, 1);
            return;
        }
        throw AnonymousClass002.A0C("Stream is closed.");
    }

    public void write(byte[] bArr) {
        if (!this.A00) {
            write(bArr, 0, bArr.length);
            return;
        }
        throw AnonymousClass002.A0C("Stream is closed.");
    }
}
