package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* renamed from: X.6He  reason: invalid class name and case insensitive filesystem */
public class C125276He extends AnonymousClass0R6 {
    public final Handler A00;
    public final AnonymousClass30B A01;
    public final C620633i A02;
    public final C54292oU A03;
    public final AnonymousClass5O9 A04;
    public final AnonymousClass7IG A05;
    public final AnonymousClass7EV A06;
    public final AnonymousClass4FS A07;
    public final List A08;
    public final Map A09;

    public int A0G() {
        return this.A08.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        AnonymousClass5ZM r1;
        String str;
        int i2;
        GradientDrawable gradientDrawable;
        ImageView.ScaleType scaleType;
        AnonymousClass6J7 r102 = (AnonymousClass6J7) r10;
        r102.A0H.setOnClickListener(new AnonymousClass54E(r102, 25, this));
        Integer num = (Integer) this.A08.get(i);
        if (r102 instanceof C137706p8) {
            C137706p8 r5 = (C137706p8) r102;
            Context context = r5.A0H.getContext();
            int intValue = num.intValue();
            Drawable drawable = null;
            if (intValue == 0) {
                str = context.getString(R.string.f11nameremoved);
                i2 = R.drawable.ic_wallpaper_thumb_bright;
                gradientDrawable = C18310x6.A0G(context, i2);
            } else if (intValue == 1) {
                str = context.getString(R.string.f11nameremoved);
                i2 = R.drawable.ic_wallpaper_thumb_dark;
                gradientDrawable = C18310x6.A0G(context, i2);
            } else if (intValue == 2) {
                str = context.getString(R.string.f11nameremoved);
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setSize(1, 1);
                gradientDrawable2.setColor(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
                Drawable[] drawableArr = new Drawable[2];
                AnonymousClass001.A1I(gradientDrawable2, C107335b8.A0B(C18310x6.A0G(context, R.drawable.whatsapp_doodle), AnonymousClass0Y8.A04(context, R.color.f5nameremoved)), drawableArr);
                gradientDrawable = new LayerDrawable(drawableArr);
            } else if (intValue == 3) {
                str = context.getString(R.string.f11nameremoved);
                GradientDrawable gradientDrawable3 = new GradientDrawable();
                gradientDrawable3.setSize(1, 1);
                gradientDrawable3.setColor(AnonymousClass0Y8.A04(context, R.color.f5nameremoved));
                drawable = C107335b8.A04(context, R.drawable.ic_attachment_gallery, R.color.f5nameremoved);
                gradientDrawable = gradientDrawable3;
            } else {
                throw AnonymousClass002.A0E(AnonymousClass000.A0P(num, "Unknown categoryType: ", AnonymousClass001.A0o()));
            }
            C125106Fl r12 = r5.A00;
            r12.A00(gradientDrawable, drawable, str);
            if (intValue == 2) {
                scaleType = ImageView.ScaleType.CENTER;
            } else {
                scaleType = ImageView.ScaleType.CENTER_CROP;
            }
            r12.setPreviewScaleType(scaleType);
        } else if (r102 instanceof C137716p9) {
            C137716p9 r3 = (C137716p9) r102;
            Context context2 = r3.A0H.getContext();
            String string = context2.getString(R.string.f11nameremoved);
            GradientDrawable gradientDrawable4 = new GradientDrawable();
            gradientDrawable4.setSize(1, 1);
            gradientDrawable4.setColor(AnonymousClass0Y8.A04(context2, R.color.f5nameremoved));
            r3.A05.A00(gradientDrawable4, C107335b8.A04(context2, R.drawable.ic_attachment_gallery, R.color.f5nameremoved), string);
            if (!r3.A01 && r3.A00 == null) {
                C138146pq r2 = new C138146pq(r3.A03, new AnonymousClass7IH(r3, string));
                r3.A00 = r2;
                r3.A06.BkL(r2, AnonymousClass4L0.A0U());
            }
        }
        if ((r102 instanceof C137716p9) && (r1 = ((C137716p9) r102).A00) != null) {
            AnonymousClass6C9.A12(r1, this.A09, i);
        }
    }

    public int getItemViewType(int i) {
        return AnonymousClass000.A09(this.A08, i);
    }

    public C125276He(Handler handler, AnonymousClass30B r4, C620633i r5, C54292oU r6, AnonymousClass5O9 r7, AnonymousClass7IG r8, AnonymousClass4FS r9, List list) {
        HashMap A0t = AnonymousClass001.A0t();
        this.A09 = A0t;
        Objects.requireNonNull(A0t);
        this.A06 = new AnonymousClass7EV(A0t);
        this.A08 = list;
        this.A05 = r8;
        this.A00 = handler;
        this.A02 = r5;
        this.A01 = r4;
        this.A03 = r6;
        this.A07 = r9;
        this.A04 = r7;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        if (i == 5) {
            return new C137696p7(LayoutInflater.from(context).inflate(R.layout.f8nameremoved, (ViewGroup) null), this.A06);
        } else if (i == 4) {
            return new C137686p6(LayoutInflater.from(context).inflate(R.layout.f8nameremoved, (ViewGroup) null), this.A06);
        } else if (i != 3) {
            return new C137706p8(this.A06, new C125106Fl(context));
        } else {
            Handler handler = this.A00;
            C620633i r2 = this.A02;
            AnonymousClass30B r1 = this.A01;
            C54292oU r5 = this.A03;
            AnonymousClass4FS r10 = this.A07;
            return new C137716p9(r5, this.A04, new C53492nB(handler, r1, r2, "wallpaper-category"), this.A06, new C125106Fl(context), r10);
        }
    }
}
