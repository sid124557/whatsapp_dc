package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.payments.ui.IndiaUpiMyQrFragment;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* renamed from: X.9Gm  reason: invalid class name and case insensitive filesystem */
public class C191799Gm extends AnonymousClass5ZM {
    public final View A00;
    public final C64393Dh A01;
    public final C202859mh A02;
    public final WeakReference A03;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        FileOutputStream fileOutputStream;
        Log.i("PAY: ShareQrCodeUtil start share QR code background job");
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("image/*");
        File A0R = this.A01.A0R("qrcode.jpg");
        Uri A012 = C627536m.A01((Context) this.A03.get(), A0R);
        try {
            fileOutputStream = new FileOutputStream(A0R);
            Bitmap.createBitmap(this.A00.getDrawingCache()).compress(Bitmap.CompressFormat.JPEG, 100, fileOutputStream);
            fileOutputStream.close();
            intent.putExtra("android.intent.extra.STREAM", A012);
            return Intent.createChooser(intent, (CharSequence) null);
        } catch (IOException e) {
            Log.e("PAY: ShareQrCodeUtil cannot process qr code for sharing", e);
            return null;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        Intent intent = (Intent) obj;
        IndiaUpiMyQrFragment indiaUpiMyQrFragment = ((C197859dz) this.A02).A00;
        if (intent == null || intent.resolveActivity(indiaUpiMyQrFragment.A0R().getPackageManager()) == null) {
            indiaUpiMyQrFragment.A04.A0H(R.string.f11nameremoved, 1);
            return;
        }
        indiaUpiMyQrFragment.startActivityForResult(intent, 1006);
        indiaUpiMyQrFragment.A00.setDrawingCacheEnabled(false);
    }

    public C191799Gm(Context context, View view, C64393Dh r4, C202859mh r5) {
        this.A03 = AnonymousClass0x9.A14(context);
        this.A00 = view;
        this.A01 = r4;
        this.A02 = r5;
    }
}
