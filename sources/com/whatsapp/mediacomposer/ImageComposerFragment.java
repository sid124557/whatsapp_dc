package com.whatsapp.mediacomposer;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass1VX;
import X.AnonymousClass30B;
import X.AnonymousClass33p;
import X.AnonymousClass4FS;
import X.AnonymousClass4SG;
import X.AnonymousClass5Y7;
import X.AnonymousClass5YF;
import X.AnonymousClass7XV;
import X.C003203q;
import X.C05630Ug;
import X.C1000259c;
import X.C104435Qy;
import X.C106105Xq;
import X.C107655bf;
import X.C109225eH;
import X.C114755nY;
import X.C114825nf;
import X.C1234068h;
import X.C1234168i;
import X.C1234368k;
import X.C133846i2;
import X.C1451774m;
import X.C148287Hu;
import X.C171248Gi;
import X.C171428Ha;
import X.C179418j7;
import X.C18290x4;
import X.C186068uh;
import X.C33131sU;
import X.C53492nB;
import X.C620733j;
import X.C64393Dh;
import X.C84584Cx;
import X.C86604Kt;
import X.C86614Ku;
import X.C86634Kw;
import X.C86644Kx;
import X.C86664Kz;
import X.C87964Wu;
import X.C89654ea;
import X.C96004vP;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.bottombar.filterswipe.FilterSwipeView;
import com.whatsapp.mediacomposer.doodle.ImagePreviewContentLayout;
import com.whatsapp.mediaview.PhotoView;
import com.whatsapp.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class ImageComposerFragment extends Hilt_ImageComposerFragment {
    public Bitmap A00;
    public C64393Dh A01;
    public AnonymousClass30B A02;
    public C133846i2 A03;
    public C84584Cx A04;
    public C84584Cx A05;
    public ImagePreviewContentLayout A06;
    public AnonymousClass5Y7 A07;
    public PhotoView A08;
    public boolean A09;
    public boolean A0A = false;
    public boolean A0B = false;

    public void A0k(int i, int i2, Intent intent) {
        int intExtra;
        if (i == 1) {
            if (i2 == -1) {
                Rect rect = (Rect) intent.getParcelableExtra("rect");
                int intExtra2 = intent.getIntExtra("rotate", 0);
                int intExtra3 = intent.getIntExtra("error_message_id", -1);
                C114825nf r0 = this.A0E;
                if (!(r0 == null || rect == null)) {
                    A1V(rect, r0.A0N.A06, intExtra2, intExtra3);
                }
            } else if (i2 == 0) {
                if (intent == null) {
                    A1W((Bundle) null);
                } else if (A0Q() != null && (intExtra = intent.getIntExtra("error_message_id", -1)) > 0) {
                    this.A03.A0N((C89654ea) A0Q(), intExtra);
                }
            }
            this.A09 = false;
            return;
        }
        super.A0k(i, i2, intent);
    }

    public void A0c() {
        AnonymousClass7XV r1;
        this.A06.A00();
        AnonymousClass5Y7 r2 = this.A07;
        r2.A04 = null;
        r2.A03 = null;
        r2.A02 = null;
        C86634Kw.A1C(r2.A0J, (C05630Ug) null);
        BottomSheetBehavior bottomSheetBehavior = r2.A07;
        if (!(bottomSheetBehavior == null || (r1 = r2.A06) == null)) {
            bottomSheetBehavior.A0u.remove(r1);
        }
        r2.A03();
        C53492nB r12 = C86644Kx.A0Y(this).A0k;
        if (r12 != null) {
            C84584Cx r0 = this.A04;
            if (r0 != null) {
                r12.A01(r0);
            }
            C84584Cx r02 = this.A05;
            if (r02 != null) {
                r12.A01(r02);
            }
        }
        super.A0c();
    }

    public void A0q(Bundle bundle) {
        bundle.putBoolean("handle-crop-image-result", this.A09);
    }

    public boolean A1S() {
        if (this.A07.A07() || super.A1S()) {
            return true;
        }
        return false;
    }

    public final int A1U() {
        Uri uri = this.A00;
        int i = 0;
        if (uri == null) {
            return 0;
        }
        String queryParameter = uri.getQueryParameter("rotation");
        if (queryParameter != null) {
            i = Integer.parseInt(queryParameter);
        }
        return (AnonymousClass4SG.A2l(this.A00, (MediaComposerActivity) C86664Kz.A1E(this)).A01() + i) % 360;
    }

    public final void A1V(Rect rect, RectF rectF, int i, int i2) {
        Uri uri;
        InputStream A0G;
        int parseInt;
        if (rectF != null && (uri = this.A00) != null && this.A0E != null) {
            int A012 = AnonymousClass4SG.A2l(uri, C86644Kx.A0Y(this)).A01();
            PhotoView photoView = this.A08;
            photoView.A0J = null;
            photoView.A04 = 0.0f;
            AnonymousClass5Y7 r2 = this.A07;
            r2.A03 = null;
            C33131sU r1 = r2.A0Q;
            if (r1 != null) {
                r1.A08(r2.A0Y);
            }
            File A002 = C96004vP.A00(this.A00, this.A01);
            Uri fromFile = Uri.fromFile(A002);
            C186068uh A1E = C86664Kz.A1E(this);
            Uri uri2 = this.A00;
            int i3 = (A012 + i) % 360;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) A1E;
            AnonymousClass5YF A2l = AnonymousClass4SG.A2l(uri2, mediaComposerActivity);
            synchronized (A2l) {
                A2l.A04 = rect;
            }
            synchronized (A2l) {
                A2l.A01 = i3;
            }
            synchronized (A2l) {
                A2l.A06 = A002;
            }
            mediaComposerActivity.A7L(uri2);
            mediaComposerActivity.A0w.A08.A02.A05();
            mediaComposerActivity.A7H();
            if (this.A00.getQueryParameter("flip-h") != null) {
                fromFile = C18290x4.A0H(fromFile.buildUpon(), "flip-h", "1");
            }
            int A1U = A1U();
            if (A1U != 0) {
                fromFile = C18290x4.A0H(fromFile.buildUpon(), "rotation", Integer.toString(A1U));
            }
            try {
                boolean z = this.A0B;
                AnonymousClass1VX r12 = this.A0A;
                int i4 = 1576;
                if (z) {
                    i4 = 2654;
                }
                int A0N = r12.A0N(i4);
                Bitmap A0B2 = this.A0O.A0B(fromFile, A0N, A0N);
                AnonymousClass5Y7 r13 = this.A07;
                r13.A04 = A0B2;
                r13.A09 = false;
                r13.A02();
                AnonymousClass5Y7 r4 = this.A07;
                r4.A04();
                C87964Wu r0 = r4.A08;
                if (r0 != null) {
                    r0.A05();
                } else {
                    Handler handler = r4.A0I;
                    Runnable runnable = r4.A0X;
                    handler.removeCallbacks(runnable);
                    runnable.run();
                }
                Bitmap bitmap = this.A07.A03;
                if (bitmap == null) {
                    Log.e("ImageComposerFragment/cropImage/nullBitmap");
                    this.A03.A0H(R.string.f11nameremoved, 1);
                    return;
                }
                this.A08.A06(bitmap);
                try {
                    BitmapFactory.Options options = new BitmapFactory.Options();
                    options.inJustDecodeBounds = true;
                    Uri fromFile2 = Uri.fromFile(AnonymousClass4SG.A2l(this.A00, (MediaComposerActivity) C86664Kz.A1E(this)).A07());
                    A0G = this.A0O.A0G(fromFile2, true);
                    BitmapFactory.decodeStream(A0G, (Rect) null, options);
                    A0G.close();
                    RectF A0b = C86664Kz.A0b((float) options.outWidth, (float) options.outHeight);
                    Matrix A0K = C107655bf.A0K(fromFile2, this.A05.A0R());
                    if (A0K == null) {
                        A0K = AnonymousClass002.A05();
                    }
                    String queryParameter = this.A00.getQueryParameter("rotation");
                    if (!(queryParameter == null || (parseInt = Integer.parseInt(queryParameter)) == 0)) {
                        A0K.postRotate((float) parseInt);
                    }
                    A0K.mapRect(A0b);
                    float f = A0b.left;
                    float f2 = A0b.top;
                    RectF rectF2 = new RectF(rect);
                    A0K.mapRect(rectF2);
                    rectF2.offset(-f, -f2);
                    float width = rectF.width() / A0b.width();
                    rectF2.left *= width;
                    rectF2.top *= width;
                    rectF2.right *= width;
                    rectF2.bottom *= width;
                    this.A0E.A07(rectF2);
                    C114825nf r42 = this.A0E;
                    C104435Qy r3 = r42.A0N;
                    int i5 = (r3.A02 + i) % 360;
                    r3.A02 = i5;
                    RectF rectF3 = r3.A07;
                    if (rectF3 != null) {
                        C1451774m.A00(r3.A09, rectF3, (float) i5);
                    }
                    r42.A0M.requestLayout();
                    r42.A0L.A01();
                    return;
                } catch (IOException unused) {
                    if (i2 > 0) {
                        this.A03.A0N((C89654ea) A0Q(), i2);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            } catch (C1000259c | IOException | OutOfMemoryError e) {
                Log.e("ImageComposerFragment/cropImage", e);
            }
        } else {
            return;
        }
        throw th;
    }

    public final void A1W(Bundle bundle) {
        Uri build;
        this.A08.setTag(this.A00);
        C186068uh A1E = C86664Kz.A1E(this);
        Uri uri = this.A00;
        if (uri == null) {
            build = Uri.EMPTY;
        } else {
            C106105Xq r1 = ((MediaComposerActivity) A1E).A1n;
            File A052 = r1.A00(uri).A05();
            if (A052 == null) {
                A052 = r1.A00(this.A00).A07();
            }
            Uri.Builder buildUpon = Uri.fromFile(A052).buildUpon();
            int A1U = A1U();
            if (A1U != 0) {
                buildUpon.appendQueryParameter("rotation", Integer.toString(A1U));
            }
            if (this.A00.getQueryParameter("flip-h") != null) {
                buildUpon.appendQueryParameter("flip-h", this.A00.getQueryParameter("flip-h"));
            }
            build = buildUpon.build();
        }
        C1234068h r2 = new C1234068h(build, 1, this);
        this.A04 = r2;
        C1234368k r12 = new C1234368k(bundle, this, A1E, 2);
        C53492nB r0 = ((MediaComposerActivity) A1E).A0k;
        if (r0 != null) {
            r0.A02(r2, r12);
        }
    }

    public final void A1X(boolean z, boolean z2) {
        AnonymousClass5Y7 r0 = this.A07;
        if (z) {
            r0.A01();
        } else {
            r0.A06(z2);
        }
        C003203q A0Q = A0Q();
        if (A0Q instanceof C179418j7) {
            boolean z3 = !z;
            MediaComposerActivity mediaComposerActivity = (MediaComposerActivity) ((C179418j7) A0Q);
            C114755nY r2 = mediaComposerActivity.A0w;
            boolean A072 = mediaComposerActivity.A0t.A07();
            C148287Hu r02 = r2.A05;
            if (z3) {
                if (A072) {
                    FilterSwipeView filterSwipeView = r02.A01;
                    TextView textView = filterSwipeView.A00;
                    if (textView.getVisibility() == 0) {
                        C86604Kt.A1H(textView, C86604Kt.A0G());
                        filterSwipeView.setFilterSwipeTextVisibility(4);
                    }
                }
            } else if (A072) {
                FilterSwipeView filterSwipeView2 = r02.A01;
                TextView textView2 = filterSwipeView2.A00;
                if (textView2.getVisibility() == 4) {
                    filterSwipeView2.setFilterSwipeTextVisibility(0);
                    C86604Kt.A1H(textView2, C86604Kt.A0H());
                }
            }
        }
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return AnonymousClass001.A0R(layoutInflater, viewGroup, R.layout.f8nameremoved);
    }

    public void A0w(Bundle bundle, View view) {
        View view2 = view;
        this.A06 = (ImagePreviewContentLayout) view.findViewById(R.id.media_content);
        super.A0w(bundle, view);
        Uri uri = this.A00;
        if (uri != null) {
            int A002 = AnonymousClass4SG.A2l(uri, C86644Kx.A0Y(this)).A00();
            AnonymousClass30B r4 = this.A02;
            AnonymousClass4FS r10 = this.A0P;
            C133846i2 r7 = this.A03;
            C620733j r6 = this.A08;
            AnonymousClass33p r5 = this.A07;
            this.A07 = new AnonymousClass5Y7(this.A00, view2, A0R(), r4, r5, r6, r7, new C109225eH(this), this.A0E, r10, A002);
            this.A08 = (PhotoView) view.findViewById(R.id.photo);
            C114825nf r1 = this.A0E;
            if (r1 != null) {
                this.A06.A02 = r1;
            }
            ImagePreviewContentLayout imagePreviewContentLayout = this.A06;
            imagePreviewContentLayout.A03 = new C171428Ha(this);
            C18290x4.A1F(imagePreviewContentLayout, this, 22);
            if (bundle == null || !bundle.getBoolean("handle-crop-image-result", false)) {
                A1W(bundle);
            }
            if (this.A00 == null) {
                C1234168i r2 = new C1234168i(this, 0);
                this.A05 = r2;
                C171248Gi r12 = new C171248Gi(this);
                C53492nB r0 = C86644Kx.A0Y(this).A0k;
                if (r0 != null) {
                    r0.A02(r2, r12);
                }
            }
        }
    }

    public void A1J() {
        super.A1J();
        AnonymousClass5Y7 r1 = this.A07;
        if (!r1.A09) {
            r1.A04();
        }
        C87964Wu r0 = r1.A08;
        if (r0 == null) {
            r1.A0I.postDelayed(r1.A0X, 500);
        } else {
            r0.A05();
        }
    }

    public void A1P(Rect rect) {
        super.A1P(rect);
        if (this.A0B != null) {
            AnonymousClass5Y7 r4 = this.A07;
            if (!rect.equals(r4.A05)) {
                r4.A05 = new Rect(0, rect.top, 0, rect.bottom);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        AnonymousClass5Y7 r2 = this.A07;
        if (r2.A07 != null) {
            C86614Ku.A1J(r2.A0M.getViewTreeObserver(), r2, 12);
        }
    }
}
