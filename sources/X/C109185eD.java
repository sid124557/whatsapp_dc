package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Typeface;
import android.text.style.LineBackgroundSpan;
import com.whatsapp.WaEditText;
import java.util.List;

/* renamed from: X.5eD  reason: invalid class name and case insensitive filesystem */
public final class C109185eD implements LineBackgroundSpan {
    public float A00;
    public int A01;
    public List A02;
    public final Context A03;
    public final Paint A04;
    public final WaEditText A05;

    public C109185eD(Context context, WaEditText waEditText, float f, int i) {
        C162457s7.A0J(context, 1);
        this.A03 = context;
        this.A05 = waEditText;
        this.A01 = i;
        this.A00 = f;
        Paint A0Z = C86664Kz.A0Z();
        A0Z.setStyle(Paint.Style.FILL_AND_STROKE);
        this.A04 = A0Z;
    }

    public void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        C18260x0.A0O(canvas, paint);
        int color = paint.getColor();
        Paint paint2 = this.A04;
        paint2.setColor(this.A01);
        paint2.setAlpha((int) (this.A00 * ((float) 255)));
        WaEditText waEditText = this.A05;
        float f = (float) 2;
        paint2.setPathEffect(new CornerPathEffect(waEditText.getTextSize() / f));
        Context context = this.A03;
        this.A02 = C106835aF.A00(context, waEditText.getLayout(), waEditText.getTextSize() / f);
        Typeface typeface = waEditText.getTypeface();
        Typeface typeface2 = C95964vF.A0I;
        if (typeface2 == null) {
            typeface2 = Typeface.createFromAsset(context.getAssets(), "fonts/FacebookScriptWA-Regular.otf");
            C95964vF.A0I = typeface2;
        }
        if (C162457s7.A0P(typeface, typeface2)) {
            this.A02 = C106835aF.A01(context, waEditText.getLayout(), waEditText.getTextSize() / f);
        }
        List list = this.A02;
        if (list == null) {
            throw C18270x1.A0S("paths");
        }
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = this.A02;
            if (list2 == null) {
                throw C18270x1.A0S("paths");
            }
            canvas.drawPath((Path) list2.get(i9), paint2);
        }
        paint.setColor(color);
    }
}
