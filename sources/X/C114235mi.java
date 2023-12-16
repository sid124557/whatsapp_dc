package X;

import android.content.ContentUris;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;

/* renamed from: X.5mi  reason: invalid class name and case insensitive filesystem */
public class C114235mi implements C84584Cx {
    public final long A00;
    public final /* synthetic */ AnonymousClass5UB A01;

    public Bitmap BJk() {
        AnonymousClass6DM r5;
        byte[] bArr = null;
        try {
            r5 = new AnonymousClass6DM();
            r5.setDataSource(this.A01.A0C.getApplicationContext(), ContentUris.withAppendedId(MediaStore.Audio.Media.EXTERNAL_CONTENT_URI, this.A00));
            bArr = r5.getEmbeddedPicture();
            r5.close();
        } catch (Exception | OutOfMemoryError e) {
            C18260x0.A1P(AnonymousClass001.A0o(), "audiofilelistactivity/albumartloader ", e);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        if (bArr == null) {
            return AnonymousClass30R.A07;
        }
        try {
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        } catch (OutOfMemoryError unused) {
            return AnonymousClass30R.A07;
        }
        throw th;
    }

    public C114235mi(AnonymousClass5UB r1, long j) {
        this.A01 = r1;
        this.A00 = j;
    }

    public String BDW() {
        return Long.toString(this.A00);
    }
}
