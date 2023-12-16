package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.whatsapp.R;

/* renamed from: X.4NX  reason: invalid class name */
public class AnonymousClass4NX extends View implements AnonymousClass4GJ {
    public int A00;
    public long A01;
    public Path A02;
    public Drawable A03;
    public C116855qy A04;
    public boolean A05;
    public boolean A06;
    public int[] A07;
    public final /* synthetic */ AnonymousClass5ZF A08;

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0031, code lost:
        if (X.C107425bI.A02(r11) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setEmoji(int[] r11) {
        /*
            r10 = this;
            r4 = 0
            r3 = 0
            r5 = r10
            if (r11 != 0) goto L_0x0013
            r10.A07 = r4
            r0 = -1
            r10.A01 = r0
            r10.A03 = r4
            r10.A06 = r3
            r10.setContentDescription(r4)
        L_0x0012:
            return
        L_0x0013:
            X.4qr r0 = new X.4qr
            r0.<init>(r11)
            long r8 = com.whatsapp.emoji.EmojiDescriptor.A00(r0, r3)
            long r1 = r10.A01
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 == 0) goto L_0x0012
            r10.A07 = r11
            r10.A01 = r8
            boolean r0 = X.C107425bI.A03(r11)
            if (r0 != 0) goto L_0x0033
            boolean r1 = X.C107425bI.A02(r11)
            r0 = 0
            if (r1 == 0) goto L_0x0034
        L_0x0033:
            r0 = 1
        L_0x0034:
            r10.A06 = r0
            r10.A03 = r4
            r1 = 0
            int r0 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x005b
            android.graphics.drawable.Drawable r0 = X.AnonymousClass5ZF.A00(r8)
            r10.A03 = r0
            if (r0 != 0) goto L_0x0063
            X.5ZF r6 = r10.A08
            X.4qr r7 = new X.4qr
            r7.<init>(r11)
            X.7MU r4 = new X.7MU
            r4.<init>(r5, r6, r7, r8)
            X.4MX r0 = X.AnonymousClass5ZF.A0X
            android.os.Message r0 = android.os.Message.obtain(r0, r3, r3, r3, r4)
            r0.sendToTarget()
        L_0x005b:
            java.lang.String r0 = X.C106655Zv.A01(r11)
            r10.setContentDescription(r0)
            return
        L_0x0063:
            r10.invalidate()
            goto L_0x005b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4NX.setEmoji(int[]):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4NX(Context context, AnonymousClass5ZF r4) {
        super(context);
        this.A08 = r4;
        if (!this.A05) {
            this.A05 = true;
            generatedComponent();
        }
        this.A01 = -1;
        this.A00 = AnonymousClass0Y8.A04(context, R.color.f5nameremoved);
    }

    public final Object generatedComponent() {
        C116855qy r0 = this.A04;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A06) {
            if (this.A02 == null) {
                this.A02 = AnonymousClass002.A06();
            }
            Paint paint = this.A08.A0A;
            paint.setColor(this.A00);
            this.A02.reset();
            C86614Ku.A19(this.A02, this);
            C86614Ku.A18(this.A02, this);
            C86604Kt.A17(this.A02, this, (getWidth() * 3) / 4);
            C86604Kt.A17(this.A02, this, (getWidth() * 9) / 10);
            this.A02.setFillType(Path.FillType.WINDING);
            canvas.drawPath(this.A02, paint);
        }
        if (this.A03 != null) {
            int i = this.A08.A07;
            int width = (getWidth() - i) / 2;
            int height = (getHeight() - i) / 2;
            Drawable drawable = this.A03;
            if (drawable instanceof C86744Lj) {
                C86624Kv.A0n(drawable, this);
            } else {
                drawable.setBounds(width, height, i + width, i + height);
            }
            this.A03.draw(canvas);
        }
    }
}
