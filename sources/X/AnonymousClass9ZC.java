package X;

import android.content.Context;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.cameracore.ardelivery.compression.zip.ZipDecompressor;

/* renamed from: X.9ZC  reason: invalid class name */
public final class AnonymousClass9ZC implements C185558ts {
    public C159067l3 A00;
    public boolean A01;
    public final C159067l3 A02;
    public final C151087Tj A03;
    public final C152827aC A04;
    public final C194729Ug A05;
    public final C180448l5 A06;
    public final AnonymousClass9ZL A07;
    public final AnonymousClass9ZM A08;

    public void BKS() {
        if (!this.A01) {
            this.A03.A00();
        }
    }

    public AnonymousClass9ZC(Context context, C159067l3 r6, C159067l3 r7, C194729Ug r8, C185568tt r9) {
        AnonymousClass96X r0;
        this.A05 = r8;
        this.A02 = r6;
        int i = 5;
        if (r7 != null) {
            int i2 = r7.A00;
            int i3 = i2 & 256;
            i = i3 != 0 ? 261 : i;
            if ((i2 & 32) != 0) {
                i |= 32;
                if ((i2 & ZipDecompressor.UNZIP_BUFFER_SIZE) != 0) {
                    i |= ZipDecompressor.UNZIP_BUFFER_SIZE;
                } else if ((i2 & EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH) != 0) {
                    i |= EditorInfoCompat.MEMORY_EFFICIENT_TEXT_LENGTH;
                } else if ((i2 & 512) != 0) {
                    i |= 512;
                } else if ((i2 & EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH) != 0) {
                    i |= EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH;
                } else if (i3 != 0) {
                    i |= 256;
                }
            }
            r6.A05(r7, i);
        } else {
            r6.A03(5);
        }
        this.A04 = new C152827aC(context.getResources());
        synchronized (r6.A07) {
            r0 = new AnonymousClass96X(r6);
        }
        this.A03 = r0;
        r0.A00();
        this.A06 = new AnonymousClass9ZN();
        AnonymousClass9ZL r1 = new AnonymousClass9ZL(r8, r9);
        this.A07 = r1;
        this.A08 = new AnonymousClass9ZM(this);
        r1.A00 = this;
    }

    public C159067l3 B7E() {
        return this.A02;
    }

    public C184818sb BC7() {
        return this.A07;
    }

    public C180438l4 BDQ() {
        return this.A08;
    }

    public C180448l5 BDc() {
        return this.A06;
    }
}
