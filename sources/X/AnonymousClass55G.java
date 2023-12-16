package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.55G  reason: invalid class name */
public class AnonymousClass55G extends AnonymousClass5ZM {
    public int A00;
    public AnonymousClass5Y7 A01;
    public AnonymousClass4Z9 A02;
    public C87964Wu A03;
    public WeakReference A04;
    public Bitmap[] A05;
    public boolean[] A06;
    public boolean[] A07;
    public final C133846i2 A08;

    public /* bridge */ /* synthetic */ Object A08(Object[] objArr) {
        int i = this.A00;
        int i2 = i - 1;
        if (i == 0) {
            return this.A01.A02;
        }
        Bitmap bitmap = this.A05[i2];
        if (bitmap != null) {
            boolean[] zArr = this.A07;
            if (zArr[i2]) {
                zArr[i2] = !FilterUtils.A02(this.A01.A02, bitmap, this.A08, i);
            }
            return this.A05[i2];
        }
        Bitmap A002 = FilterUtils.A00(this.A01.A02, this.A08, i, true);
        if (A002 != null) {
            this.A05[i2] = A002;
            this.A07[i2] = false;
            return A002;
        }
        Log.e("FilterThumbnailAdapter/onBindViewHolder/onPostExecute/failed to create thumbnail");
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x004d, code lost:
        if (r5 == null) goto L_0x004f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0C(java.lang.Object r5) {
        /*
            r4 = this;
            android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
            java.lang.ref.WeakReference r0 = r4.A04
            android.content.Context r3 = X.C86664Kz.A0U(r0)
            r2 = 0
            if (r3 == 0) goto L_0x004d
            X.5Y7 r0 = r4.A01
            android.graphics.Bitmap r0 = r0.A02
            if (r0 == 0) goto L_0x004d
            if (r5 == 0) goto L_0x004f
            boolean r0 = r5.isRecycled()
            if (r0 != 0) goto L_0x0041
            X.4Z9 r0 = r4.A02
            android.widget.ImageView r0 = r0.A02
            r0.setBackgroundResource(r2)
            X.4Z9 r0 = r4.A02
            android.widget.ImageView r1 = r0.A02
            android.graphics.drawable.BitmapDrawable r0 = X.C86654Ky.A0E(r3, r5)
            r1.setImageDrawable(r0)
            X.4Z9 r0 = r4.A02
            android.widget.TextView r1 = r0.A03
            int r0 = r4.A00
            X.7L7 r0 = X.C106315Ym.A00(r0)
            int r0 = r0.A01
            r1.setText(r0)
            X.4Z9 r1 = r4.A02
            android.view.View r0 = r1.A01
            r0.setOnClickListener(r1)
        L_0x0041:
            r0 = 0
            r4.A01 = r0
            r4.A03 = r0
            r4.A02 = r0
            r4.A07 = r0
            r4.A05 = r0
            return
        L_0x004d:
            if (r5 != 0) goto L_0x0041
        L_0x004f:
            int r0 = r4.A00
            if (r0 == 0) goto L_0x0041
            int r1 = r0 + -1
            boolean[] r0 = r4.A06
            r0[r1] = r2
            X.4Wu r0 = r4.A03
            if (r0 == 0) goto L_0x0041
            r0.A06(r1)
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass55G.A0C(java.lang.Object):void");
    }

    public AnonymousClass55G(Context context, C133846i2 r3, AnonymousClass5Y7 r4, AnonymousClass4Z9 r5, C87964Wu r6, Bitmap[] bitmapArr, boolean[] zArr, boolean[] zArr2, int i) {
        this.A04 = AnonymousClass0x9.A14(context);
        this.A01 = r4;
        this.A03 = r6;
        this.A00 = i;
        this.A05 = bitmapArr;
        this.A07 = zArr;
        this.A06 = zArr2;
        this.A02 = r5;
        this.A08 = r3;
    }
}
