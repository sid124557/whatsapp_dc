package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.31P  reason: invalid class name */
public class AnonymousClass31P {
    public static byte A00(FileInputStream fileInputStream, long j, long j2) {
        fileInputStream.skip(j - j2);
        int read = fileInputStream.read();
        if (read == -1) {
            return 0;
        }
        byte b = (byte) read;
        if (read >= 100) {
            return 99;
        }
        return b;
    }

    public static List A01(File file) {
        FileInputStream A0g;
        float f;
        ArrayList A0s = AnonymousClass001.A0s();
        if (file.length() != 0) {
            long length = file.length();
            try {
                A0g = AnonymousClass0x9.A0g(file);
                for (int i = 0; ((long) i) < length; i++) {
                    byte read = (byte) A0g.read();
                    if (read == -1) {
                        break;
                    }
                    if (read >= 100) {
                        f = 0.99f;
                    } else {
                        f = ((float) read) / 100.0f;
                    }
                    A0s.add(Float.valueOf(f));
                }
                A0g.close();
                return A0s;
            } catch (IOException e) {
                Log.e("WaveformUtil/getWaveformFromFile ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return A0s;
        throw th;
    }

    public static List A02(File file, int i) {
        FileInputStream A0g;
        byte b;
        ArrayList A0s = AnonymousClass001.A0s();
        if (!(file == null || file.length() == 0)) {
            long length = file.length();
            int i2 = i;
            float f = ((float) length) / ((float) i2);
            try {
                A0g = AnonymousClass0x9.A0g(file);
                AnonymousClass001.A1O(A0s, A00(A0g, 0, 0));
                long j = 1;
                for (int i3 = 1; i3 < i2 - 1; i3++) {
                    float f2 = ((float) i3) * f;
                    double d = (double) f2;
                    long floor = (long) Math.floor(d);
                    long ceil = (long) Math.ceil(d);
                    float f3 = f2 - ((float) floor);
                    byte A00 = A00(A0g, floor, j);
                    j = floor + 1;
                    if (ceil != floor) {
                        b = A00(A0g, ceil, j);
                        j = ceil + 1;
                    } else {
                        b = A00;
                    }
                    AnonymousClass001.A1O(A0s, (byte) ((int) (((float) A00) + (((float) (b - A00)) * f3))));
                }
                AnonymousClass001.A1O(A0s, A00(A0g, length - 1, j));
                A0g.close();
                return A0s;
            } catch (IOException e) {
                Log.e("waveformutil/generateDisplayDataPoints/ error reading visualization file data ", e);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
        }
        return A0s;
        throw th;
    }
}
