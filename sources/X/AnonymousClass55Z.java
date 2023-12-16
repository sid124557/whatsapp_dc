package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.55Z  reason: invalid class name */
public class AnonymousClass55Z extends AnonymousClass5ZM {
    public C89654ea A00;
    public AnonymousClass64N A01;
    public final int A02;
    public final int A03;
    public final Uri A04;
    public final C56332ro A05;
    public final C620633i A06;
    public final C620733j A07;
    public final AnonymousClass3ZH A08;
    public final String A09;

    public AnonymousClass55Z(Uri uri, C89654ea r3, AnonymousClass64N r4, C56332ro r5, C620633i r6, C620733j r7, AnonymousClass3ZH r8, String str, int i, int i2) {
        super(r3, true);
        this.A01 = r4;
        this.A06 = r6;
        this.A07 = r7;
        this.A04 = uri;
        this.A08 = r8;
        this.A00 = r3;
        this.A05 = r5;
        this.A09 = str;
        this.A03 = i;
        this.A02 = i2;
    }

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        InputStream A062;
        int i;
        this.A05.A02(this.A08).delete();
        AnonymousClass5UR A0R = this.A06.A0R();
        if (A0R == null) {
            Log.w("profileinfo/cropphoto contentResolver=null");
            return Integer.valueOf(R.string.f11nameremoved);
        }
        try {
            Uri uri = this.A04;
            A062 = A0R.A06(uri);
            if (A062 == null) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "profileinfo/cropphoto/no-input-stream ", uri);
                return Integer.valueOf(R.string.f11nameremoved);
            }
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            Integer num = null;
            BitmapFactory.decodeStream(A062, (Rect) null, options);
            int i2 = options.outWidth;
            if (i2 <= 0 || (i = options.outHeight) <= 0) {
                C18260x0.A1Q(AnonymousClass001.A0o(), "profileinfo/cropphoto/not-an-image ", uri);
                num = Integer.valueOf(R.string.f11nameremoved);
            } else if (i2 < 192 || i < 192) {
                num = Integer.valueOf(R.plurals.f9nameremoved);
            }
            A062.close();
            return num;
        } catch (IOException e) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("profileinfo/cropphoto/ ");
            A0o.append(this.A04);
            C18280x3.A1C(A0o, e);
            return Integer.valueOf(R.string.f11nameremoved);
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public /* bridge */ /* synthetic */ void A0C(Object obj) {
        int i;
        Number number = (Number) obj;
        C89654ea r6 = this.A00;
        if (r6 != null && this.A01 != null) {
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == R.plurals.f9nameremoved) {
                    C620733j r3 = this.A07;
                    Object[] objArr = new Object[1];
                    AnonymousClass000.A1P(objArr, 192, 0);
                    r6.Bou(r3.A0L(objArr, R.plurals.f9nameremoved, 192));
                    return;
                }
                r6.Bot(intValue);
                return;
            }
            AnonymousClass5P9 r32 = new AnonymousClass5P9(r6);
            r32.A09 = this.A04;
            r32.A04 = 192;
            r32.A0I = false;
            r32.A0E = false;
            r32.A0A = Uri.fromFile(this.A05.A02(this.A08));
            r32.A0C = Bitmap.CompressFormat.JPEG.toString();
            r32.A0D = this.A09;
            if (this.A02 == 1) {
                r32.A0E = true;
                r32.A00 = 16;
                r32.A01 = 9;
                r32.A0H = true;
                r32.A0F = true;
                i = 640;
                r32.A06 = 1138;
            } else {
                r32.A00 = 1;
                r32.A01 = 1;
                i = 640;
                r32.A06 = 640;
            }
            r32.A07 = i;
            this.A01.startActivityForResult(r32.A00(), this.A03);
        }
    }
}
