package X;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.widget.ImageView;

/* renamed from: X.7is  reason: invalid class name and case insensitive filesystem */
public final class C157787is {
    public static final PorterDuffXfermode A0Q = new PorterDuffXfermode(PorterDuff.Mode.SRC_IN);
    public BitmapDrawable A00;
    public ImageView.ScaleType A01 = ImageView.ScaleType.CENTER_CROP;
    public C142746xh A02;
    public C142556xO A03;
    public C152457Yy A04;
    public AnonymousClass5CO A05;
    public boolean A06;
    public boolean A07;
    public final Context A08;
    public final Path A09 = AnonymousClass002.A06();
    public final Path A0A = AnonymousClass002.A06();
    public final Path A0B = AnonymousClass002.A06();
    public final Rect A0C = AnonymousClass001.A0N();
    public final RectF A0D = AnonymousClass002.A07();
    public final RectF A0E = AnonymousClass002.A07();
    public final RectF A0F = AnonymousClass002.A07();
    public final RectF A0G = AnonymousClass002.A07();
    public final RectF A0H = AnonymousClass002.A07();
    public final RectF A0I = AnonymousClass002.A07();
    public final C620733j A0J;
    public final AnonymousClass84D A0K;
    public final AnonymousClass66R A0L = AnonymousClass8P7.A00(C175098Xb.A00);
    public final AnonymousClass66R A0M = AnonymousClass8P7.A00(C175108Xc.A00);
    public final AnonymousClass66R A0N = AnonymousClass8P7.A00(C175118Xd.A00);
    public final AnonymousClass66R A0O = AnonymousClass8P7.A00(new C120525yj(this));
    public final AnonymousClass66R A0P = AnonymousClass8P7.A00(new C120535yk(this));

    public final void A00() {
        AnonymousClass66R r2 = this.A0P;
        ((Paint) r2.getValue()).setStrokeWidth(this.A04.A01);
        AnonymousClass5CO r3 = this.A05;
        if (r3 instanceof AnonymousClass576) {
            ((Paint) r2.getValue()).setColor(AnonymousClass0Y8.A04(this.A08, ((AnonymousClass576) r3).A00.statusColor));
        }
    }

    public C157787is(Context context, C620733j r4, AnonymousClass84D r5, C142746xh r6, C142556xO r7, boolean z) {
        this.A08 = context;
        this.A0J = r4;
        this.A07 = z;
        this.A03 = r7;
        this.A02 = r6;
        this.A0K = r5;
        this.A04 = C159497lw.A02(this.A03).A00(context);
        this.A05 = new AnonymousClass576(AnonymousClass593.UNSEEN);
    }
}
