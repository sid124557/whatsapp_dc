package X;

import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.mediaview.PhotoView;
import java.util.HashSet;

/* renamed from: X.5Bq  reason: invalid class name and case insensitive filesystem */
public class C100625Bq implements C185528tp {
    public int A00;
    public Object A01;
    public final int A02;

    public C100625Bq(Object obj, int i, int i2) {
        this.A02 = i2;
        this.A01 = obj;
        this.A00 = i;
    }

    public int BD5() {
        int i = this.A02;
        int i2 = this.A00;
        if (i == 0) {
            return (int) (((float) i2) * C86604Kt.A00(((AnonymousClass5R5) this.A01).A03));
        }
        return i2;
    }

    public /* synthetic */ void BTR() {
    }

    public void Bof(Bitmap bitmap, View view, C624134x r9) {
        Drawable A03;
        switch (this.A02) {
            case 0:
                int A05 = C18300x5.A05(view, r9, 0);
                C91794l6 r2 = (C91794l6) view;
                if (bitmap == null) {
                    r2.A02 = 0;
                    byte b = r9.A1I;
                    if (b == 23 || b == 1 || b == 25) {
                        C86664Kz.A1R(r2);
                        C86624Kv.A0l(((AnonymousClass5R5) this.A01).A03.getResources(), r2, R.color.f5nameremoved);
                        A03 = C107335b8.A03(view.getContext(), R.drawable.camera, R.color.f5nameremoved);
                    } else if (b == A05) {
                        Drawable[] drawableArr = new Drawable[A05];
                        drawableArr[0] = new ColorDrawable(AnonymousClass0Y8.A04(view.getContext(), R.color.f5nameremoved));
                        drawableArr[1] = new InsetDrawable(AnonymousClass0RP.A00(view.getContext(), R.drawable.gallery_audio_item), view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                        A03 = new LayerDrawable(drawableArr);
                    } else if (b == 13 || b == 3 || b == 28 || b == 29) {
                        r2.setImageResource(R.drawable.media_video);
                    } else if (b == 9 || b == 26) {
                        A03 = AnonymousClass5VP.A00(view.getContext(), (AnonymousClass1nF) r9);
                    } else {
                        r2.setImageResource(0);
                    }
                    r2.setImageDrawable(A03);
                } else {
                    r2.setImageBitmap(bitmap);
                }
                HashSet hashSet = ((AnonymousClass5R5) this.A01).A0F;
                AnonymousClass2z0 r1 = r9.A1J;
                if (!hashSet.contains(r1)) {
                    hashSet.add(r1);
                    C86604Kt.A1H(view, C86604Kt.A0H());
                    return;
                }
                return;
            case 1:
                C985251f r12 = (C985251f) this.A01;
                r12.A06.A06(bitmap);
                r12.A02 = true;
                return;
            default:
                ((C985551i) this.A01).A0G.A06(bitmap);
                return;
        }
    }

    public /* synthetic */ void Bp1(View view) {
        switch (this.A02) {
            case 0:
                return;
            case 1:
                C985251f r2 = (C985251f) this.A01;
                PhotoView photoView = r2.A06;
                photoView.A0J = null;
                photoView.A04 = 0.0f;
                r2.A02 = false;
                return;
            default:
                PhotoView photoView2 = ((C985551i) this.A01).A0G;
                photoView2.A0J = null;
                photoView2.A04 = 0.0f;
                return;
        }
    }
}
