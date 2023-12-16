package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.whatsapp.WaNetworkResourceImageView;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.5rr  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C117395rr implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C103695Nz A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ WeakReference A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        C103695Nz r5 = this.A02;
        boolean z = this.A05;
        String str = this.A03;
        int i = this.A00;
        int i2 = this.A01;
        WeakReference weakReference = this.A04;
        Context context = r5.A01.A00;
        C162457s7.A0D(context);
        if (z) {
            String A0U = C175738Zn.A0U(str, ".", "_night.", false);
            int i3 = C06280Wy.A00;
            if ((i3 == 2 || ((i3 == -1 || i3 == 3) && (AnonymousClass001.A0M(context).uiMode & 48) == 32)) && C18300x5.A1V(context.getFilesDir(), AnonymousClass000.A0T("NetworkResource/", A0U))) {
                Log.d("NetworkResourceLoader/using dark theme resource");
                str = A0U;
            }
        }
        String absolutePath = AnonymousClass002.A0A(context.getFilesDir(), AnonymousClass000.A0T("NetworkResource/", str)).getAbsolutePath();
        try {
            C55682qk r6 = r5.A00;
            C162457s7.A0H(absolutePath);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(absolutePath, options);
            int i4 = options.outHeight;
            int i5 = options.outWidth;
            int i6 = 1;
            if (i4 > i2 || i5 > i) {
                int i7 = i4 / 2;
                int i8 = i5 / 2;
                while (i7 / i6 >= i2 && i8 / i6 >= i) {
                    i6 *= 2;
                }
            }
            options.inSampleSize = i6;
            options.inJustDecodeBounds = false;
            Bitmap decodeFile = BitmapFactory.decodeFile(absolutePath, options);
            if (decodeFile == null) {
                r6.A0A("NetworkResourceLoader/", false, AnonymousClass000.A0V("unable to decode", absolutePath, AnonymousClass001.A0o()));
                C18260x0.A0r("NetworkResourceLoader/unable-to-decode/", absolutePath, AnonymousClass001.A0o());
                return;
            }
            Bitmap A002 = AnonymousClass5CF.A00(decodeFile, i, i2);
            WaNetworkResourceImageView waNetworkResourceImageView = (WaNetworkResourceImageView) weakReference.get();
            if (waNetworkResourceImageView != null) {
                waNetworkResourceImageView.A00 = A002;
                waNetworkResourceImageView.postInvalidate();
            }
        } catch (IllegalArgumentException e) {
            C18260x0.A0r("NetworkResourceLoader/decodeFile/failed to generate bitmap/", absolutePath, AnonymousClass001.A0o());
            r5.A00.A09("NetworkResourceLoader/", e.toString(), e);
        }
    }

    public /* synthetic */ C117395rr(C103695Nz r1, String str, WeakReference weakReference, int i, int i2, boolean z) {
        this.A02 = r1;
        this.A05 = z;
        this.A03 = str;
        this.A00 = i;
        this.A01 = i2;
        this.A04 = weakReference;
    }
}
