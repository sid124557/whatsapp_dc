package X;

import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5mt  reason: invalid class name and case insensitive filesystem */
public final class C114345mt implements C184388ri {
    public final /* synthetic */ C95424td A00;
    public final /* synthetic */ String A01;

    public void BTT(File file, String str, byte[] bArr) {
        C162457s7.A0J(str, 0);
        C95424td r2 = this.A00;
        r2.A03 = null;
        if (file == null) {
            C18260x0.A0t("OnlineGifPreviewHolder/file is null for ", str, AnonymousClass001.A0o());
            return;
        }
        String str2 = this.A01;
        if (!str.equals(str2)) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("OnlineGifPreviewHolder/outdated url ");
            A0o.append(str);
            C18260x0.A0q(" current ", str2, A0o);
            return;
        }
        if (bArr != null) {
            r2.A05.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length, C33141sV.A08));
        }
        C18260x0.A0q("OnlineGifPreviewHolder/player created for ", str, AnonymousClass001.A0o());
        C149507Ms r3 = r2.A02;
        if (r3 != null) {
            try {
                C172218Kd A012 = C172218Kd.A01(ParcelFileDescriptor.open(AnonymousClass002.A0B(file.getAbsolutePath()), 268435456), false);
                r3.A01 = A012;
                AnonymousClass6D4 A06 = A012.A06(r3.A02.getContext());
                r3.A00 = A06;
                A06.start();
            } catch (IOException e) {
                Log.e("gif/loading/io-exception", e);
            }
            r3.A03.setImageDrawable(r3.A00);
        }
        r2.A05.setVisibility(8);
    }

    public C114345mt(C95424td r1, String str) {
        this.A00 = r1;
        this.A01 = str;
    }

    public void onFailure(Exception exc) {
    }
}
