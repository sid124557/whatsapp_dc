package X;

import java.io.DataInputStream;
import java.io.File;
import java.io.IOException;
import java.util.List;

/* renamed from: X.1rn  reason: invalid class name and case insensitive filesystem */
public class C32861rn extends C56712sR {
    public final List A00;

    public C32861rn(List list, int[] iArr, long j) {
        super(iArr, list.size(), j);
        this.A00 = list;
    }

    public static C56712sR A00(File file, int[] iArr) {
        DataInputStream dataInputStream;
        try {
            dataInputStream = new DataInputStream(AnonymousClass0x7.A0c(file));
            long readLong = dataInputStream.readLong();
            List A002 = C100395At.A00(Long.valueOf(readLong), iArr);
            int size = A002.size();
            int[] iArr2 = new int[size];
            for (int i = 0; i < size; i++) {
                iArr2[i] = dataInputStream.readInt();
            }
            C32861rn r0 = new C32861rn(A002, iArr2, readLong);
            dataInputStream.close();
            return r0;
        } catch (IOException e) {
            C18260x0.A0k(file, "ChunkStore/chunk object not found: ", AnonymousClass001.A0o(), e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }
}
