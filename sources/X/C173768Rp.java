package X;

import android.os.Process;
import com.facebook.profilo.mmapbuf.core.Buffer;
import com.facebook.profilo.writer.NativeTraceWriter;
import com.facebook.profilo.writer.NativeTraceWriterCallbacks;

/* renamed from: X.8Rp  reason: invalid class name and case insensitive filesystem */
public class C173768Rp extends Thread {
    public final long A00;
    public final AnonymousClass845 A01;
    public final NativeTraceWriter A02;
    public final String A03;
    public final String A04;
    public final Buffer[] A05;

    public void run() {
        try {
            Process.setThreadPriority(5);
            this.A02.loop();
            Buffer[] bufferArr = this.A05;
            int length = bufferArr.length;
            if (length > 1) {
                String str = this.A04;
                StringBuilder A0Y = AnonymousClass6CA.A0Y(str.length() + 2);
                int i = 1;
                while (true) {
                    A0Y.setLength(0);
                    A0Y.append(str);
                    A0Y.append('-');
                    A0Y.append(i);
                    new NativeTraceWriter(bufferArr[i], this.A03, A0Y.toString(), (NativeTraceWriterCallbacks) null).dump(this.A00);
                    i++;
                    if (i >= length) {
                        break;
                    }
                }
            }
        } catch (RuntimeException e) {
            this.A01.onTraceWriteException(this.A00, e);
        } catch (Throwable th) {
            this.A01.A00();
            throw th;
        }
        this.A01.A00();
    }

    public C173768Rp(NativeTraceWriterCallbacks nativeTraceWriterCallbacks, String str, String str2, Buffer[] bufferArr, long j) {
        super("Prflo:Logger");
        this.A00 = j;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = bufferArr;
        AnonymousClass845 r3 = new AnonymousClass845(nativeTraceWriterCallbacks, bufferArr.length <= 1 ? false : true);
        this.A01 = r3;
        this.A02 = new NativeTraceWriter(bufferArr[0], str, AnonymousClass000.A0X("-0", AnonymousClass000.A0l(str2)), r3);
    }
}
