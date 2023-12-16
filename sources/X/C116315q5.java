package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.5q5  reason: invalid class name and case insensitive filesystem */
public class C116315q5 implements C185528tp {
    public final int A00;
    public final ImageView A01;
    public final C33141sV A02;

    public int BD5() {
        return this.A02.A05(this.A01.getContext());
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r5) {
        ImageView imageView = this.A01;
        if (bitmap != null) {
            imageView.setImageBitmap(bitmap);
        } else {
            imageView.setImageResource(this.A00);
        }
    }

    public void Bp1(View view) {
        C86624Kv.A1B(this.A01);
    }

    public C116315q5(ImageView imageView, C33141sV r2, int i) {
        this.A02 = r2;
        this.A01 = imageView;
        this.A00 = i;
    }
}
