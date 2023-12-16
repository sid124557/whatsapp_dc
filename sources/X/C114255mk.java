package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import com.whatsapp.filter.FilterUtils;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.5mk  reason: invalid class name and case insensitive filesystem */
public class C114255mk implements C84584Cx {
    public Context A00;
    public C95274sy A01;
    public final int A02;
    public final Uri A03;
    public final C620733j A04;
    public final C133846i2 A05;
    public final AnonymousClass5Y0 A06;
    public final AnonymousClass1VX A07;
    public final AnonymousClass5YF A08;
    public final C988953q A09;
    public final AnonymousClass33O A0A;
    public final C989053r A0B;
    public final AtomicBoolean A0C = C18280x3.A0l();

    public Bitmap BJk() {
        Bitmap bitmap;
        Bitmap bitmap2;
        Rect rect;
        AtomicBoolean atomicBoolean = this.A0C;
        if (!atomicBoolean.get() && this.A01.getTag() == this) {
            AnonymousClass5YF r3 = this.A08;
            Uri fromFile = Uri.fromFile(r3.A06());
            byte A002 = this.A09.A00(this.A03);
            if (A002 == 1) {
                try {
                    C989053r r1 = this.A0B;
                    int i = this.A02;
                    bitmap = r1.A0B(fromFile, i, i);
                } catch (C1000259c | IOException unused) {
                    bitmap = C1457877h.A00;
                }
            } else if (A002 == 3 || A002 == 13) {
                File A072 = r3.A07();
                C626936e.A06(A072);
                Bitmap A012 = C107085af.A01(A072);
                if (A012 != null) {
                    Bitmap.Config config = A012.getConfig();
                    int i2 = this.A02;
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmap = Bitmap.createBitmap(i2, i2, config);
                    Canvas A062 = AnonymousClass4L0.A06(bitmap);
                    Paint A0Z = C86664Kz.A0Z();
                    A0Z.setAntiAlias(true);
                    A0Z.setFilterBitmap(true);
                    A0Z.setDither(true);
                    int width = A012.getWidth();
                    int height = A012.getHeight();
                    if (width > height) {
                        rect = new Rect((width - height) / 2, 0, (width + height) / 2, height);
                    } else {
                        rect = new Rect(0, (height - width) / 2, width, (height + width) / 2);
                    }
                    A062.drawBitmap(A012, rect, new Rect(0, 0, i2, i2), A0Z);
                    A012.recycle();
                } else {
                    bitmap = C1457877h.A00;
                }
            } else {
                bitmap = null;
            }
            if (!atomicBoolean.get()) {
                if (bitmap != null) {
                    int A003 = r3.A00();
                    if (A003 == 0 || !this.A07.A0X(2589) || (bitmap2 = FilterUtils.A00(bitmap, this.A05, A003, true)) == null) {
                        bitmap2 = bitmap;
                    }
                    if (r3.A0A() == null) {
                        return bitmap2;
                    }
                    if (!bitmap2.isMutable()) {
                        bitmap2 = bitmap2.copy(Bitmap.Config.ARGB_8888, true);
                    }
                    String A0A2 = r3.A0A();
                    C106985aV A032 = C106985aV.A03(this.A00, this.A04, this.A06, this.A0A, A0A2);
                    if (A032 != null) {
                        A032.A07(bitmap2, 0, false, false);
                    }
                    if (bitmap2 != null) {
                        return bitmap2;
                    }
                }
                return C1457877h.A00;
            }
        }
        return null;
    }

    public C114255mk(Uri uri, C620733j r3, C133846i2 r4, AnonymousClass5Y0 r5, AnonymousClass1VX r6, AnonymousClass5YF r7, C988953q r8, C95274sy r9, AnonymousClass33O r10, C989053r r11, int i) {
        this.A00 = r9.getContext();
        this.A04 = r3;
        this.A06 = r5;
        this.A0B = r11;
        this.A09 = r8;
        this.A0A = r10;
        this.A03 = uri;
        this.A08 = r7;
        this.A01 = r9;
        this.A02 = i;
        this.A05 = r4;
        this.A07 = r6;
    }

    public String BDW() {
        StringBuilder A0o = AnonymousClass001.A0o();
        AnonymousClass000.A1B(this.A03, A0o);
        return AnonymousClass000.A0X("-thumb", A0o);
    }
}
