package X;

import android.graphics.Bitmap;
import com.whatsapp.stickers.WebpInfo;
import com.whatsapp.stickers.WebpUtils;
import java.io.File;

/* renamed from: X.1rW  reason: invalid class name and case insensitive filesystem */
public final class C32731rW extends C153367bC {
    public final AnonymousClass33Q A00;
    public final WebpInfo A01;
    public final WebpUtils A02;
    public final File A03;
    public final AnonymousClass66R A04 = C154517dI.A01(new C79633ww(this));

    public Bitmap A00() {
        AnonymousClass33Q r3 = this.A00;
        File file = this.A03;
        return r3.A03(file, file.getName(), 64, 64);
    }

    public C158307jl A01() {
        return new C158307jl(AnonymousClass0x2.A09(this.A04));
    }

    public boolean A03() {
        if (AnonymousClass0x2.A09(this.A04) > -1) {
            return true;
        }
        return false;
    }

    public boolean A04(C369520j r2) {
        return AnonymousClass000.A1W(this.A01);
    }

    public byte[] A05() {
        return this.A02.A05(this.A03.getAbsolutePath());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32731rW(AnonymousClass33Q r2, WebpUtils webpUtils, File file) {
        super(file);
        C18260x0.A0Q(r2, webpUtils);
        this.A00 = r2;
        this.A02 = webpUtils;
        this.A03 = file;
        this.A01 = webpUtils.A02(file.getAbsolutePath());
    }

    public String A02() {
        return "image/webp";
    }
}
