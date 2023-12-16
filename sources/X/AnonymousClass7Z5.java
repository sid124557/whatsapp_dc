package X;

import android.graphics.Bitmap;

/* renamed from: X.7Z5  reason: invalid class name */
public class AnonymousClass7Z5 {
    public final int A00;
    public final Bitmap.Config A01;
    public final Bitmap.Config A02;
    public final boolean A03;

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && getClass() == obj.getClass()) {
                AnonymousClass7Z5 r5 = (AnonymousClass7Z5) obj;
                if (!(this.A00 == r5.A00 && this.A03 == r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass6CA.A01(((((AnonymousClass6CA.A01(3100, this.A00) * 31) + (this.A03 ? 1 : 0)) * 31) + this.A02.ordinal()) * 31, this.A01.ordinal());
    }

    public AnonymousClass7Z5(C149227Ln r2) {
        this.A00 = r2.A00;
        this.A03 = r2.A03;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ImageDecodeOptions{");
        AnonymousClass7W7 r2 = new AnonymousClass7W7(C18310x6.A0n(this));
        r2.A00(String.valueOf(100), "minDecodeIntervalMs");
        r2.A00(String.valueOf(this.A00), "maxDimensionPx");
        String valueOf = String.valueOf(false);
        r2.A00(valueOf, "decodePreviewFrame");
        r2.A00(valueOf, "useLastFrameForPreview");
        r2.A00(valueOf, "decodeAllFrames");
        r2.A00(String.valueOf(this.A03), "forceStaticImage");
        r2.A00(this.A02.name(), "bitmapConfigName");
        r2.A00(this.A01.name(), "animatedBitmapConfigName");
        r2.A00((Object) null, "customImageDecoder");
        r2.A00((Object) null, "bitmapTransformation");
        r2.A00((Object) null, "colorSpace");
        AnonymousClass000.A1B(r2, A0o);
        return AnonymousClass000.A0g(A0o);
    }
}
