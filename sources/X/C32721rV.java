package X;

import android.graphics.Bitmap;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.1rV  reason: invalid class name and case insensitive filesystem */
public final class C32721rV extends C153367bC {
    public final AnonymousClass1VX A00;
    public final AnonymousClass4FV A01;
    public final C33121sT A02;
    public final C59962xm A03;
    public final File A04;

    public boolean A04(C369520j r7) {
        C162457s7.A0J(r7, 0);
        boolean z = true;
        if (this.A02.A05(this.A04, (String) null) == null) {
            z = false;
            int i = 3;
            if (r7.ordinal() != 0) {
                i = 4;
            }
            if (this.A00.A0Y(C58422vE.A02, 6787)) {
                C24181Wk r1 = new C24181Wk();
                r1.A00 = Integer.valueOf(i);
                this.A01.BhD(r1);
            }
        }
        return z;
    }

    public Bitmap A00() {
        C59962xm r0 = this.A03;
        try {
            AnonymousClass0QL A05 = r0.A01.A05(this.A04, (String) null);
            if (A05 != null) {
                AnonymousClass01G r02 = new AnonymousClass01G();
                r02.A0G(A05);
                return C59962xm.A00(r02, 64, 64);
            }
        } catch (OutOfMemoryError e) {
            Log.w("LottieUtils/getThumbnailBitmap OOM getting thumbnail bitmap", e);
        }
        return null;
    }

    public byte[] A05() {
        C59962xm r2 = this.A03;
        String absolutePath = this.A04.getAbsolutePath();
        C162457s7.A0D(absolutePath);
        try {
            JSONObject A08 = r2.A01.A08(AnonymousClass002.A0B(absolutePath), (String) null);
            if (A08 != null) {
                return AnonymousClass0x2.A1a(C18290x4.A0o(A08.getJSONObject("metadata").getJSONObject("customProps")));
            }
        } catch (JSONException e) {
            C18260x0.A17("LottieUtils/getMetadataFromPath error getting metadata json ", AnonymousClass001.A0o(), e);
            return null;
        } catch (IOException e2) {
            C18260x0.A17("LottieUtils/getMetadataFromPath exception retrieving lottie file ", AnonymousClass001.A0o(), e2);
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32721rV(AnonymousClass1VX r1, AnonymousClass4FV r2, C33121sT r3, C59962xm r4, File file) {
        super(file);
        C18260x0.A0V(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = file;
    }

    public String A02() {
        return "application/was";
    }

    public boolean A03() {
        return true;
    }
}
