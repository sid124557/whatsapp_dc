package X;

import android.net.Uri;
import android.os.Handler;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: X.3Uo  reason: invalid class name and case insensitive filesystem */
public abstract class C68803Uo implements C185938uU {
    public RandomAccessFile A00;
    public boolean A01;
    public final Handler A02 = AnonymousClass000.A0A();
    public final AnonymousClass5ZU A03;
    public final C54292oU A04;
    public final C61072zf A05;
    public final C66473Lo A06;
    public final AnonymousClass1nB A07;
    public final C56742sU A08;
    public final C183288pn A09;

    public Uri BE6() {
        return Uri.fromFile(this.A08.A03());
    }

    public void BRZ(int i) {
    }

    public void BRa(C56742sU r4) {
        this.A02.post(new C70153a2(this, 6, r4));
    }

    public void BTP(C56742sU r6) {
        RandomAccessFile randomAccessFile;
        File A032 = this.A08.A03();
        if (this.A01 && (randomAccessFile = this.A00) != null) {
            try {
                long filePointer = randomAccessFile.getFilePointer();
                try {
                    this.A00.close();
                    this.A00 = null;
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(A032, "r");
                    this.A00 = randomAccessFile2;
                    randomAccessFile2.seek(filePointer);
                } catch (IOException e) {
                    Log.e((Throwable) e);
                    this.A00 = null;
                } catch (Throwable th) {
                    this.A00 = null;
                    throw th;
                }
            } catch (IOException e2) {
                Log.e((Throwable) e2);
                Log.e("WhatsappChunkAwareDataSource/hotswap failed");
            }
        }
    }

    public C68803Uo(AnonymousClass5ZU r2, C54292oU r3, C61072zf r4, C66473Lo r5, AnonymousClass1nB r6, C56742sU r7, C183288pn r8) {
        this.A04 = r3;
        this.A05 = r4;
        this.A03 = r2;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = r7;
        this.A09 = r8;
    }

    public void Ba6() {
    }

    public void BNz(C56742sU r1, long j) {
    }

    public void BXg(File file, boolean z) {
    }
}
