package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import org.json.JSONObject;

/* renamed from: X.4v7  reason: invalid class name */
public class AnonymousClass4v7 extends C135676l4 implements C183098pU {
    public int A00;
    public Drawable A01;
    public String A02;
    public String A03;
    public boolean A04;
    public final int A05;
    public final Context A06;
    public final AnonymousClass33O A07;
    public final String A08;

    public final void A0Y() {
        String str = this.A02;
        C626936e.A06(str);
        String str2 = this.A03;
        C626936e.A06(str2);
        int i = this.A05;
        C626936e.A0C(AnonymousClass001.A1W(i));
        AnonymousClass39M r3 = new AnonymousClass39M();
        int i2 = this.A00;
        r3.A09 = str;
        r3.A01 = i2;
        r3.A0D = str2;
        r3.A0L = this.A04;
        this.A07.A04(this.A06, r3, this, i, i);
    }

    public void Bca(Drawable drawable) {
        this.A01 = drawable;
        RectF rectF = this.A02;
        A0M(rectF, rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public Drawable A09() {
        return this.A01;
    }

    public String A0B() {
        return "sticker";
    }

    public void A0K(Canvas canvas) {
        if (this.A01 != null) {
            A00(canvas, this);
            canvas.restore();
        }
    }

    public void A0L(Canvas canvas) {
        if (this.A01 != null) {
            canvas.save();
            if (this.A01 != null) {
                A00(canvas, this);
                canvas.restore();
            }
            canvas.restore();
        }
    }

    public boolean A0Q() {
        return false;
    }

    public boolean A0R() {
        return false;
    }

    public boolean A0T() {
        return true;
    }

    public float A0X() {
        float width;
        int height;
        Drawable drawable = this.A01;
        if (drawable == null) {
            return 0.0f;
        }
        if (drawable instanceof AnonymousClass6D5) {
            width = (float) drawable.getBounds().right;
            height = this.A01.getBounds().bottom;
        } else {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            width = (float) bitmapDrawable.getBitmap().getWidth();
            height = bitmapDrawable.getBitmap().getHeight();
        }
        return width / ((float) height);
    }

    public final void A0Z(Canvas canvas, int i, int i2) {
        RectF rectF = this.A02;
        float width = rectF.width() / ((float) i);
        float height = rectF.height() / ((float) i2);
        canvas.translate(rectF.centerX(), rectF.centerY());
        canvas.scale(width, height);
        canvas.rotate(this.A00);
        float f = ((float) (-i)) / 2.0f;
        canvas.translate(f, f);
    }

    public AnonymousClass4v7(Context context, AnonymousClass33O r6, JSONObject jSONObject) {
        this.A06 = context;
        this.A05 = jSONObject.getInt("sticker_size");
        this.A07 = r6;
        if (jSONObject.has("file_path") && jSONObject.has("plain_file_hash") && jSONObject.has("file_storage_location")) {
            this.A02 = jSONObject.getString("file_path");
            this.A03 = jSONObject.getString("plain_file_hash");
            this.A00 = jSONObject.getInt("file_storage_location");
            this.A04 = jSONObject.getBoolean("sticker_is_lottie");
            A0Y();
        }
        this.A08 = jSONObject.getString("content_description");
        super.A0O(jSONObject);
        if (this.A01 == null) {
            throw AnonymousClass001.A0c("loadedDrawable was not loaded correctly");
        }
    }

    public static void A00(Canvas canvas, AnonymousClass4v7 r4) {
        canvas.save();
        Drawable drawable = r4.A01;
        if (drawable instanceof AnonymousClass6D5) {
            AnonymousClass6D5 r2 = (AnonymousClass6D5) drawable;
            r4.A0Z(canvas, r2.getBounds().right, r2.getBounds().bottom);
            r2.A00(canvas);
            return;
        }
        BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
        r4.A0Z(canvas, bitmapDrawable.getBitmap().getWidth(), bitmapDrawable.getBitmap().getHeight());
        bitmapDrawable.draw(canvas);
    }

    public String A0C(Context context) {
        return this.A08;
    }

    public void A0P(JSONObject jSONObject) {
        String str;
        super.A0P(jSONObject);
        String str2 = this.A02;
        if (!(str2 == null || (str = this.A03) == null)) {
            jSONObject.put("file_path", str2);
            jSONObject.put("plain_file_hash", str);
            jSONObject.put("file_storage_location", this.A00);
        }
        jSONObject.put("sticker_size", this.A05);
        jSONObject.put("content_description", this.A08);
        jSONObject.put("sticker_is_lottie", this.A04);
    }

    public AnonymousClass4v7(Context context, AnonymousClass39M r3, AnonymousClass33O r4, int i) {
        this.A06 = context;
        this.A02 = r3.A09;
        this.A05 = i;
        this.A00 = r3.A01;
        this.A03 = r3.A0D;
        this.A04 = r3.A0L;
        this.A08 = AnonymousClass320.A00(context, r3);
        this.A07 = r4;
        A0Y();
    }
}
