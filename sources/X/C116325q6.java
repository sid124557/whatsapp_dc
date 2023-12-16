package X;

import android.graphics.Bitmap;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.stickers.StickerView;

/* renamed from: X.5q6  reason: invalid class name and case insensitive filesystem */
public class C116325q6 implements C185528tp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C114005mL A01;
    public final /* synthetic */ AnonymousClass39M A02;
    public final /* synthetic */ AnonymousClass33O A03;
    public final /* synthetic */ StickerView A04;

    public C116325q6(C114005mL r1, AnonymousClass39M r2, AnonymousClass33O r3, StickerView stickerView, int i) {
        this.A01 = r1;
        this.A04 = stickerView;
        this.A03 = r3;
        this.A02 = r2;
        this.A00 = i;
    }

    public int BD5() {
        return this.A00;
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r12) {
        if (bitmap == null || bitmap.getWidth() <= 0 || bitmap.getHeight() <= 0) {
            AnonymousClass33O r0 = this.A03;
            AnonymousClass39M r2 = this.A02;
            StickerView stickerView = this.A04;
            int i = this.A00;
            r0.A05(stickerView, r2, (C183108pV) null, 1, i, i, false, false);
            return;
        }
        this.A04.setImageBitmap(bitmap);
    }

    public void Bp1(View view) {
        this.A04.setImageResource(R.drawable.sticker_error_in_conversation);
    }
}
