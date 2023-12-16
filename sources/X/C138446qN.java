package X;

import android.os.Handler;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.6qN  reason: invalid class name and case insensitive filesystem */
public class C138446qN extends C68803Uo implements C185788uF {
    public long A00;
    public long A01;
    public long A02;

    public void Awq(C184768sU r1) {
    }

    public long Bfw(C161387pX r10) {
        this.A00 = 0;
        long j = r10.A03;
        this.A02 = j;
        C56742sU r8 = this.A08;
        r8.A08(this);
        AnonymousClass7TB r1 = r8.A0F;
        long j2 = this.A02;
        Handler handler = r1.A02;
        handler.removeCallbacks(r1.A01);
        C70083Zv r2 = new C70083Zv(r1, j2, 23);
        r1.A01 = r2;
        handler.postDelayed(r2, 200);
        long A012 = r8.A01() - j;
        this.A01 = A012;
        return A012;
    }

    public /* synthetic */ void cancel() {
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.A00;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.A00 = null;
                if (this.A01) {
                    this.A01 = false;
                }
            } catch (IOException e) {
                throw new C140416th(e);
            } catch (Throwable th) {
                this.A00 = null;
                if (this.A01) {
                    this.A01 = false;
                }
                throw th;
            }
        }
        C56742sU r1 = this.A08;
        synchronized (r1) {
            r1.A0G.remove(this);
        }
    }

    public int read(byte[] bArr, int i, int i2) {
        C56742sU r6 = this.A08;
        if (!(r6.A00() == 0 || r6.A00() == 2)) {
            C626936e.A0D(AnonymousClass000.A1W(r6.A03()), "downloadFile is null");
            if (!this.A01) {
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(r6.A03(), "r");
                    this.A00 = randomAccessFile;
                    randomAccessFile.seek(this.A02);
                    this.A01 = true;
                } catch (IOException e) {
                    throw new C140416th(e);
                }
            }
            int A022 = AnonymousClass6CA.A02((long) i2, this.A01 - this.A00);
            if (A022 != 0) {
                RandomAccessFile randomAccessFile2 = this.A00;
                C626936e.A06(randomAccessFile2);
                if (r6.A0B(randomAccessFile2.getFilePointer())) {
                    long A023 = r6.A02(this.A00.getFilePointer());
                    if (A023 != 0) {
                        int read = this.A00.read(bArr, i, AnonymousClass6CA.A02((long) A022, A023));
                        if (read != -1) {
                            this.A00 += (long) read;
                            return read;
                        } else if (this.A01 != this.A00) {
                            throw AnonymousClass6CA.A0M();
                        }
                    }
                }
            }
            return -1;
        }
        return 0;
    }

    public C138446qN(AnonymousClass5ZU r1, C54292oU r2, C61072zf r3, C66473Lo r4, AnonymousClass1nB r5, C56742sU r6, C183288pn r7) {
        super(r1, r2, r3, r4, r5, r6, r7);
    }
}
