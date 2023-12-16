package X;

import android.util.SparseIntArray;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;
import com.facebook.msys.mci.DefaultCrypto;

/* renamed from: X.7PM  reason: invalid class name */
public class AnonymousClass7PM {
    public final C177728gM A00;
    public final C156557gp A01;
    public final C156557gp A02;
    public final C156557gp A03;
    public final C156557gp A04;
    public final C186618vf A05;
    public final C186618vf A06;
    public final C186618vf A07;

    public AnonymousClass7PM() {
        int i;
        AnonymousClass82K r0;
        int i2;
        int i3;
        C154687da.A00();
        int A0K = (int) AnonymousClass6C8.A0K();
        if (A0K > 16777216) {
            i = (A0K / 4) * 3;
        } else {
            i = A0K / 2;
        }
        this.A01 = new C156557gp(C154657dX.A00, 0, i, -1);
        this.A05 = C1679883o.A00();
        int i4 = AnonymousClass76R.A00;
        int i5 = i4 * 4194304;
        int i6 = AnonymousClass35S.A0F;
        SparseIntArray sparseIntArray = new SparseIntArray();
        do {
            sparseIntArray.put(i6, i4);
            i6 *= 2;
        } while (i6 <= 4194304);
        this.A02 = new C156557gp(sparseIntArray, 4194304, i5, i4);
        synchronized (AnonymousClass82K.class) {
            r0 = AnonymousClass82K.A00;
            if (r0 == null) {
                r0 = new AnonymousClass82K();
                AnonymousClass82K.A00 = r0;
            }
        }
        this.A00 = r0;
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        sparseIntArray2.put(EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH, 5);
        sparseIntArray2.put(EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH, 5);
        sparseIntArray2.put(ZipDecompressor.UNZIP_BUFFER_SIZE, 5);
        sparseIntArray2.put(DefaultCrypto.BUFFER_SIZE, 5);
        sparseIntArray2.put(16384, 5);
        sparseIntArray2.put(32768, 5);
        sparseIntArray2.put(65536, 5);
        sparseIntArray2.put(AnonymousClass35S.A0F, 5);
        sparseIntArray2.put(262144, 2);
        sparseIntArray2.put(524288, 2);
        sparseIntArray2.put(1048576, 2);
        int A0K2 = (int) AnonymousClass6C8.A0K();
        if (A0K2 < 16777216) {
            i2 = 3145728;
        } else {
            i2 = 12582912;
            if (A0K2 < 33554432) {
                i2 = 6291456;
            }
        }
        int A0K3 = (int) AnonymousClass6C8.A0K();
        if (A0K3 < 16777216) {
            i3 = A0K3 / 2;
        } else {
            i3 = (A0K3 / 4) * 3;
        }
        this.A03 = new C156557gp(sparseIntArray2, i2, i3, -1);
        this.A06 = C1679883o.A00();
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        sparseIntArray3.put(16384, 5);
        this.A04 = new C156557gp(sparseIntArray3, 81920, 1048576, -1);
        this.A07 = C1679883o.A00();
        C154687da.A00();
    }
}
