package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import com.whatsapp.WaImageView;
import java.io.File;

/* renamed from: X.565  reason: invalid class name */
public final class AnonymousClass565 extends AnonymousClass5YG {
    public Bitmap A00;
    public AnonymousClass6D4 A01;
    public WaImageView A02;
    public C172218Kd A03;

    public AnonymousClass565(Context context, File file) {
        C162457s7.A0J(file, 2);
        C172218Kd A012 = C172218Kd.A01(ParcelFileDescriptor.open(file, 268435456), false);
        this.A03 = A012;
        AnonymousClass6D4 A06 = A012.A06(context);
        C162457s7.A0D(A06);
        this.A01 = A06;
        WaImageView waImageView = new WaImageView(context);
        waImageView.setImageDrawable(this.A01);
        this.A02 = waImageView;
    }
}
