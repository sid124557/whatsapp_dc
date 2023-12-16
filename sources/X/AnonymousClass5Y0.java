package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.superpack.WhatsAppOpenboxArchive;
import java.util.Set;

/* renamed from: X.5Y0  reason: invalid class name */
public class AnonymousClass5Y0 {
    public static final Set A0C = AnonymousClass002.A0K();
    public static final String[] A0D = {"➕", "➖", "➗", "✖️", "🟰", "♾️", "💲", "💱", "™️", "©️", "®️", "👁️‍🗨️", "🔚", "🔙", "🔛", "🔝", "🔜", "〰️", "➰", "➿", "✔️"};
    public AnonymousClass5ZC A00 = new AnonymousClass5ZC(1000, 100000, 100000, false);
    public Boolean A01;
    public final C56612sH A02;
    public final C54292oU A03;
    public final C133856i3 A04;
    public final C105885Wu A05 = new C105885Wu();
    public final C105885Wu A06 = new C105885Wu();
    public final AnonymousClass1VX A07;
    public final AnonymousClass4FV A08;
    public final C156687h2 A09;
    public final C183538qC A0A;
    public volatile WhatsAppOpenboxArchive A0B;

    public static void A00(Resources resources, ImageView imageView, AnonymousClass5Y0 r8, int[] iArr) {
        AnonymousClass5Y0 r0 = r8;
        imageView.setImageDrawable(r0.A04(resources, new C94274qr(iArr), 0.75f, -1));
    }

    public final BitmapDrawable A01(Resources resources, C157917j8 r14, C105885Wu r15, C182418oN r16) {
        boolean contains;
        Bitmap BJn;
        int[] iArr = r14.A00;
        if (iArr.length == 1) {
            Context context = this.A03.A00;
            if (!C107405bG.A0D(context)) {
                contains = false;
            } else {
                Set set = A0C;
                if (set.isEmpty()) {
                    for (String r1 : A0D) {
                        set.add(new C157917j8(C86664Kz.A0N(new C94284qs(r1))));
                    }
                }
                contains = set.contains(r14);
            }
            Bitmap A002 = r15.A00(r14, contains);
            if (A002 != null) {
                return new BitmapDrawable(resources, A002);
            }
            C182418oN r12 = r16;
            if (!(r16 == null || (BJn = r12.BJn(resources, iArr[0])) == null)) {
                if (contains) {
                    float A012 = C86664Kz.A01(context.getResources(), R.dimen.f6nameremoved);
                    Bitmap A0Y = C86664Kz.A0Y(BJn.getWidth(), BJn.getHeight());
                    Canvas A062 = AnonymousClass4L0.A06(A0Y);
                    Paint A0B2 = C86604Kt.A0B();
                    A0B2.setColorFilter((ColorFilter) this.A0A.get());
                    float f = (float) (((double) A012) * 0.70710678118d);
                    float f2 = -f;
                    A062.drawBitmap(BJn, f2, f2, A0B2);
                    A062.drawBitmap(BJn, f, f2, A0B2);
                    A062.drawBitmap(BJn, f2, f, A0B2);
                    A062.drawBitmap(BJn, f, f, A0B2);
                    float f3 = -A012;
                    A062.drawBitmap(BJn, f3, 0.0f, A0B2);
                    A062.drawBitmap(BJn, 0.0f, f3, A0B2);
                    A062.drawBitmap(BJn, A012, 0.0f, A0B2);
                    A062.drawBitmap(BJn, 0.0f, A012, A0B2);
                    A0B2.setColorFilter((ColorFilter) null);
                    A062.drawBitmap(BJn, 0.0f, 0.0f, A0B2);
                    BJn = A0Y;
                }
                r15.A01(BJn, r14, contains);
                return new BitmapDrawable(resources, BJn);
            }
        }
        return null;
    }

    public final Drawable A03(Resources resources, C157917j8 r11, C105885Wu r12, C182418oN r13) {
        int[] iArr = r11.A00;
        int length = iArr.length;
        if (length == 1) {
            return A01(resources, r11, r12, r13);
        }
        Bitmap A002 = r12.A00(r11, false);
        if (A002 == null) {
            BitmapDrawable[] bitmapDrawableArr = new BitmapDrawable[length];
            for (int i = 0; i < length; i++) {
                BitmapDrawable A012 = A01(resources, new C157917j8(new int[]{iArr[i]}), r12, r13);
                bitmapDrawableArr[i] = A012;
                if (A012 == null) {
                    return null;
                }
            }
            A002 = C100415Av.A00(bitmapDrawableArr);
            if (A002 == null) {
                return null;
            }
            r12.A01(A002, r11, false);
        }
        return new BitmapDrawable(resources, A002);
    }

    public final C157917j8 A06(C157857j0 r4, long j) {
        if (j == -1) {
            j = C86664Kz.A0N(r4);
            if (j == -1) {
                return null;
            }
        }
        Long valueOf = Long.valueOf(j);
        if (valueOf != null) {
            return new C157917j8(valueOf.longValue());
        }
        return null;
    }

    public AnonymousClass5Y0(C56612sH r5, C54292oU r6, C133856i3 r7, AnonymousClass1VX r8, AnonymousClass4FV r9, C156687h2 r10) {
        this.A02 = r5;
        this.A07 = r8;
        this.A03 = r6;
        this.A08 = r9;
        this.A04 = r7;
        this.A09 = r10;
        this.A0A = C72333dY.A06(new AnonymousClass4KG(r6, 16));
    }

    public Drawable A02(Resources resources, C184318rb r5, C157857j0 r6, long j) {
        C157917j8 A062 = A06(r6, j);
        if (A062 == null) {
            return null;
        }
        C105885Wu r1 = this.A05;
        Drawable A032 = A03(resources, A062, r1, (C182418oN) null);
        if (A032 != null) {
            return A032;
        }
        Drawable A033 = A03(resources, A062, r1, new AnonymousClass8GV(r5, this));
        if (A033 != null) {
            return A033;
        }
        return A03(resources, A062, this.A06, new C114075mS(this));
    }

    public Drawable A04(Resources resources, C157857j0 r4, float f, long j) {
        Drawable A052 = A05(resources, r4, j);
        if (A052 == null) {
            return new C86744Lj(r4.A01(), f);
        }
        return A052;
    }

    public Drawable A05(Resources resources, C157857j0 r5, long j) {
        C157917j8 A062 = A06(r5, j);
        if (A062 == null) {
            return null;
        }
        return A03(resources, A062, this.A06, new C114075mS(this));
    }
}
