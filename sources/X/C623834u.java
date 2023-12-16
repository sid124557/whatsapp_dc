package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.whatsapp.R;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.34u  reason: invalid class name and case insensitive filesystem */
public abstract class C623834u {
    public boolean A00;
    public final C56972sr A01;
    public final AnonymousClass0WN A02;
    public final AnonymousClass310 A03;
    public final C56512s6 A04;
    public final C54292oU A05;
    public final C48502f0 A06;
    public final C48092eK A07;
    public final C84924Eg A08;
    public final C48772fR A09;
    public final C622634i A0A;

    public void A0C() {
        this.A00 = true;
    }

    public static Point A01(Context context) {
        int i;
        int i2;
        Point point = new Point();
        C620633i.A01(context).getDefaultDisplay().getSize(point);
        if (AnonymousClass001.A0M(context).orientation == 2 && (i = point.x) < (i2 = point.y)) {
            point.y = i;
            point.x = i2;
        }
        point.y -= ((int) context.getResources().getDimension(R.dimen.f6nameremoved)) + AnonymousClass5YL.A01(context, C620633i.A01(context));
        return point;
    }

    public static AnonymousClass5WB A02(Point point, boolean z) {
        int i = point.x;
        int i2 = point.y;
        Long valueOf = Long.valueOf(C58152un.A00 / 32);
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        options.inDither = z;
        return new AnonymousClass5WB(options, valueOf, i, i2, false);
    }

    public static ArrayList A03(File file) {
        Log.d("chat-settings-store/getbackupfiles");
        List A0A2 = C06550Ye.A0A(AnonymousClass22O.CRYPT14);
        File A0A3 = AnonymousClass002.A0A(file, "wallpapers.backup");
        ArrayList A092 = C06550Ye.A09(A0A3, A0A2);
        File A0A4 = AnonymousClass002.A0A(file, "Wallpapers");
        if (A0A4.exists()) {
            A092.add(A0A4);
        }
        C06550Ye.A0M(A0A3, A092);
        return A092;
    }

    public Drawable A04(AnonymousClass5QL r5) {
        if (this instanceof C32531r5) {
            if (r5 == null) {
                return null;
            }
            Drawable drawable = r5.A00;
            Integer num = r5.A01;
            if (num == null || drawable == null) {
                return drawable;
            }
            AnonymousClass366.A05(this.A05.A00, drawable, num.intValue());
            return drawable;
        } else if (r5 == null) {
            return null;
        } else {
            return r5.A00;
        }
    }

    public Uri A05() {
        if (this instanceof C32531r5) {
            return ((C32531r5) this).A04.A05();
        }
        C32521r4 r4 = (C32521r4) this;
        PhoneUserJid A052 = C56972sr.A05(r4.A05);
        StringBuilder A0o = AnonymousClass001.A0o();
        StringBuilder A0o2 = AnonymousClass001.A0o();
        C18280x3.A0u(A052, A0o2);
        A0o.append(C627236i.A04(AnonymousClass001.A0k(A0o2, System.currentTimeMillis())));
        String A0X = AnonymousClass000.A0X(".jpg", A0o);
        File file = r4.A03.A08().A0Q;
        C64393Dh.A07(file, false);
        return Uri.fromFile(AnonymousClass002.A0A(file, A0X));
    }

    public C06270Wx A06() {
        if (this instanceof C32531r5) {
            return ((C32531r5) this).A00;
        }
        return null;
    }

    public AnonymousClass5QL A07(Context context, Uri uri, C95814uZ r10, boolean z) {
        InputStream A0G;
        InputStream inputStream;
        if (this instanceof C32531r5) {
            C32531r5 r3 = (C32531r5) this;
            boolean z2 = false;
            BitmapDrawable bitmapDrawable = null;
            try {
                C989053r r1 = r3.A05;
                if (z) {
                    inputStream = r1.A0G(uri, true);
                } else {
                    inputStream = AnonymousClass0x9.A0g(C627536m.A04(uri));
                }
                Bitmap bitmap = C107245ax.A04((AnonymousClass5QA) null, A02(A01(context), false), inputStream, false).A02;
                if (bitmap != null) {
                    bitmapDrawable = new BitmapDrawable(context.getResources(), bitmap);
                } else {
                    r3.A02.A0F(R.string.f11nameremoved, 0);
                }
                inputStream.close();
            } catch (IOException unused) {
                r3.A02.A0F(R.string.f11nameremoved, 0);
            } catch (Throwable th) {
                th.addSuppressed(th);
            }
            if (bitmapDrawable == null) {
                return r3.A08(context, r10);
            }
            if (r10 == null) {
                z2 = true;
            }
            return r3.A0H(context, r3.A0I(context, bitmapDrawable, r10), z2);
        }
        C32521r4 r32 = (C32521r4) this;
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("wallpaper/set with Uri with size (width x height): ");
        A0o.append(0);
        C18260x0.A0y("x", A0o, 0);
        r32.A00 = null;
        try {
            A0G = r32.A08.A0G(uri, true);
            Bitmap bitmap2 = C107245ax.A04((AnonymousClass5QA) null, A02(A01(context), false), A0G, false).A02;
            if (bitmap2 != null) {
                r32.A00 = new BitmapDrawable(context.getResources(), bitmap2);
            } else {
                r32.A04.A0F(R.string.f11nameremoved, 0);
            }
            r32.A00 = true;
            A0G.close();
        } catch (IOException e) {
            Log.e((Throwable) e);
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        Drawable drawable = r32.A00;
        if (drawable != null) {
            r32.A0H(context, drawable);
        }
        return new AnonymousClass5QL(r32.A00, 0, "DOWNLOADED", true);
        throw th;
        throw th;
    }

    public AnonymousClass5QL A08(Context context, C95814uZ r5) {
        if (!(this instanceof C32531r5)) {
            return ((C32521r4) this).A0G(context, false);
        }
        C32531r5 r2 = (C32531r5) this;
        AnonymousClass0PJ A0G = r2.A0G(context, r5);
        Object obj = A0G.A00;
        C626936e.A06(obj);
        Object obj2 = A0G.A01;
        C626936e.A06(obj2);
        return r2.A0H(context, (AnonymousClass2P1) obj, AnonymousClass001.A1Z(obj2));
    }

    public File A09() {
        if (this instanceof C32531r5) {
            return ((C32531r5) this).A04.A09();
        }
        return AnonymousClass002.A0A(C54292oU.A03(this.A05), "wallpaper.jpg");
    }

    public void A0A() {
        if (this instanceof C32531r5) {
            C32531r5 r2 = (C32531r5) this;
            C71293bs.A00(r2.A06, r2, 23);
        }
    }

    public void A0B() {
        if (this instanceof C32531r5) {
            C06270Wx.A03(((C32531r5) this).A00, 0);
        }
    }

    public void A0D(Context context, C95814uZ r4) {
        if (this instanceof C32531r5) {
            ((C32531r5) this).A0L(context, r4, (AnonymousClass2P1) null);
        }
    }

    public void A0E(Context context, C95814uZ r7, int i) {
        if (this instanceof C32531r5) {
            C32531r5 r4 = (C32531r5) this;
            Object obj = r4.A0G(context, r7).A00;
            C626936e.A06(obj);
            AnonymousClass2P1 r0 = (AnonymousClass2P1) obj;
            r4.A0L(context, r7, new AnonymousClass2P1(Integer.valueOf(i), r0.A01, r0.A02));
        }
    }

    public boolean A0F() {
        if (this instanceof C32531r5) {
            C32531r5 r1 = (C32531r5) this;
            boolean A0F = r1.A04.A0F();
            r1.A0K();
            return A0F;
        }
        C32521r4 r0 = (C32521r4) this;
        return AnonymousClass000.A1U(r0.A06.A03(AnonymousClass002.A0A(C54292oU.A03(r0.A05), "wallpaper.jpg"), "wallpaper"), 19);
    }

    public C623834u(C56972sr r1, AnonymousClass0WN r2, AnonymousClass310 r3, C56512s6 r4, C54292oU r5, C48502f0 r6, C48092eK r7, C84924Eg r8, C48772fR r9, C622634i r10) {
        this.A05 = r5;
        this.A0A = r10;
        this.A01 = r1;
        this.A03 = r3;
        this.A06 = r6;
        this.A02 = r2;
        this.A04 = r4;
        this.A08 = r8;
        this.A09 = r9;
        this.A07 = r7;
    }
}
