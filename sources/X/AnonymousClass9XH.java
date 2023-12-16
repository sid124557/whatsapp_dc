package X;

import android.graphics.BitmapFactory;
import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import java.io.ByteArrayInputStream;

/* renamed from: X.9XH  reason: invalid class name */
public class AnonymousClass9XH implements Camera.PictureCallback {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Rect A02;
    public final /* synthetic */ AnonymousClass9SQ A03;
    public final /* synthetic */ AnonymousClass9ZR A04;
    public final /* synthetic */ AnonymousClass9V5 A05;
    public final /* synthetic */ C194409St A06;

    public AnonymousClass9XH(Rect rect, AnonymousClass9SQ r2, AnonymousClass9ZR r3, AnonymousClass9V5 r4, C194409St r5, int i, int i2) {
        this.A04 = r3;
        this.A00 = i;
        this.A02 = rect;
        this.A05 = r4;
        this.A01 = i2;
        this.A03 = r2;
        this.A06 = r5;
    }

    public void onPictureTaken(byte[] bArr, Camera camera) {
        Rect rect;
        Rect rect2;
        int i;
        Integer valueOf;
        Float valueOf2;
        Float valueOf3;
        byte[] bArr2 = bArr;
        if (C195029Vp.A00()) {
            bArr2 = C195029Vp.A01();
        } else if (this.A04.A0X.get()) {
            Log.d("Camera1Device", "Photo capture took too long, not invoking photo capture callback");
            return;
        }
        if (bArr2 != null) {
            int A002 = AnonymousClass9U9.A00(bArr2);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr2, 0, bArr2.length, options);
            rect = new Rect(0, 0, options.outWidth, options.outHeight);
            AnonymousClass9LL.A00(rect, this.A02, this.A00, A002);
            rect2 = rect;
        } else {
            rect = null;
            rect2 = new Rect();
        }
        Rect rect3 = this.A02;
        int i2 = this.A00;
        AnonymousClass9ZR r9 = this.A04;
        C194409St r4 = new C194409St(rect2, rect3, i2, r9.A00);
        AnonymousClass9N2 r1 = AnonymousClass9VN.A0d;
        AnonymousClass9V5 r14 = this.A05;
        r4.A01(r1, r14.A01(AnonymousClass9V5.A04));
        r4.A01(AnonymousClass9VN.A0X, bArr2);
        AnonymousClass9XE r3 = r9.A0O;
        AnonymousClass9N2 r12 = AnonymousClass9VN.A0e;
        if (r3.A0B) {
            i = r3.A09;
        } else {
            i = 0;
        }
        r4.A01(r12, Integer.valueOf(i));
        r4.A01(AnonymousClass9VN.A0c, Integer.valueOf(this.A01));
        AnonymousClass9VN r8 = new AnonymousClass9VN(r4);
        AnonymousClass9SQ r122 = this.A03;
        r9.A0U.A05(new AnonymousClass9hI(r122, r8), r9.A0T.A03);
        C203589nz r13 = r9.A09;
        r13.getClass();
        if (!C1899593h.A1V(C203589nz.A0C, r13) && bArr2 != null) {
            AnonymousClass9VQ r7 = new AnonymousClass9VQ(new ByteArrayInputStream(bArr2));
            C194409St r6 = this.A06;
            AnonymousClass9N2 r132 = AnonymousClass9VN.A0T;
            Long l = null;
            double A003 = r7.A00("ExposureTime");
            if (A003 != -1.0d) {
                l = Long.valueOf((long) (A003 * Math.pow(10.0d, 9.0d)));
            }
            r6.A01(r132, l);
            AnonymousClass9N2 r2 = AnonymousClass9VN.A0Z;
            Integer num = null;
            int A012 = r7.A01("PhotographicSensitivity");
            if (A012 == -1) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(A012);
            }
            r6.A01(r2, valueOf);
            AnonymousClass9N2 r42 = AnonymousClass9VN.A0O;
            double A004 = r7.A00("ApertureValue");
            if (A004 == -1.0d) {
                valueOf2 = null;
            } else {
                valueOf2 = Float.valueOf((float) A004);
            }
            r6.A01(r42, valueOf2);
            AnonymousClass9N2 r43 = AnonymousClass9VN.A0V;
            double A005 = r7.A00("FocalLength");
            if (A005 == -1.0d) {
                valueOf3 = null;
            } else {
                valueOf3 = Float.valueOf((float) A005);
            }
            r6.A01(r43, valueOf3);
            AnonymousClass9N2 r22 = AnonymousClass9VN.A0P;
            int A013 = r7.A01("WhiteBalance");
            if (A013 != -1) {
                num = Integer.valueOf(A013);
            }
            r6.A01(r22, num);
        }
        C203589nz r32 = r9.A09;
        AnonymousClass9ZR r15 = r9;
        r15.A09(r122, r32, r14, this.A06, r8);
        C1899593h.A1U(r9.A0N.A00);
        if (rect != null) {
            rect.width();
            rect.height();
        } else {
            new IllegalStateException("JPEG byte array was null.");
        }
        AnonymousClass9WT.A00();
    }
}
