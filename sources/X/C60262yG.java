package X;

import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.ArrayList;

/* renamed from: X.2yG  reason: invalid class name and case insensitive filesystem */
public class C60262yG {
    public static final byte[] A08 = {87, 65, 77, 80, 83, 73, 68, 1};
    public int A00;
    public int A01;
    public C59672xI A02;
    public String A03 = "00000000-0000-0000-0000-000000000000";
    public ArrayList A04 = AnonymousClass001.A0s();
    public final int A05;
    public final C26071bX A06;
    public final RandomAccessFile A07;

    public boolean A01(byte[] bArr, int i) {
        int i2;
        ArrayList arrayList = this.A04;
        int i3 = this.A00;
        if (AnonymousClass0x9.A0P(arrayList, i3).A01 <= 8 && AnonymousClass0x9.A0P(arrayList, i3).A02) {
            Log.e("queuefile/writeBytes in privatestats see locked empty mini event buffer");
            i3 = this.A00;
            AnonymousClass0x9.A0P(arrayList, i3).A02 = false;
        }
        if (AnonymousClass0x9.A0P(arrayList, i3).A02) {
            Log.d("queufile/writebytes in privatestats cur evt buffer is locked, cannot write");
        } else {
            int length = bArr.length;
            if (length < i) {
                i = length;
            }
            C59672xI r2 = this.A02;
            if (i <= r2.A00 - r2.A02) {
                AnonymousClass0x9.A0P(arrayList, this.A00).A01 += r2.A00(bArr, i);
                A00();
                return true;
            } else if (AnonymousClass0x9.A0P(arrayList, i3).A00 < 65536) {
                try {
                    this.A07.setLength(65792);
                    AnonymousClass0x9.A0P(arrayList, this.A00).A00 = 65536;
                    C59672xI r1 = this.A02;
                    r1.A00 = 65536;
                    if (i <= 65536 - r1.A02) {
                        i2 = r1.A00(bArr, i);
                        AnonymousClass0x9.A0P(arrayList, this.A00).A01 += i2;
                    } else {
                        i2 = 0;
                    }
                    A00();
                    if (i2 > 0) {
                        return true;
                    }
                } catch (IOException e) {
                    C18260x0.A16("queuefile/writeBytes failed to write ", AnonymousClass001.A0o(), e);
                    return false;
                }
            }
        }
        return false;
    }

    public final void A00() {
        try {
            RandomAccessFile randomAccessFile = this.A07;
            randomAccessFile.seek(54);
            randomAccessFile.writeByte(this.A01);
            randomAccessFile.writeByte(this.A00);
            for (int i = 0; i < this.A01; i++) {
                ArrayList arrayList = this.A04;
                randomAccessFile.writeInt(AnonymousClass0x9.A0P(arrayList, i).A01);
                randomAccessFile.writeInt(AnonymousClass0x9.A0P(arrayList, i).A00);
                randomAccessFile.writeBoolean(AnonymousClass0x9.A0P(arrayList, i).A02);
            }
        } catch (IOException e) {
            C18260x0.A16("queuefile/flushMetaToFile failed to write ", AnonymousClass001.A0o(), e);
        }
    }

    public C60262yG(C26071bX r2, RandomAccessFile randomAccessFile, int i) {
        this.A05 = i;
        this.A07 = randomAccessFile;
        this.A06 = r2;
    }
}
