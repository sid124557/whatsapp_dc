package X;

import android.system.Os;
import java.io.FileDescriptor;

/* renamed from: X.0V3  reason: invalid class name */
public class AnonymousClass0V3 {
    public static FileDescriptor A00(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static void A01(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static void A02(FileDescriptor fileDescriptor, int i, long j) {
        Os.lseek(fileDescriptor, j, i);
    }
}
