package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.R;
import com.whatsapp.filter.FilterUtils;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import com.whatsapp.util.Log;

/* renamed from: X.5Y7  reason: invalid class name */
public class AnonymousClass5Y7 {
    public float A00;
    public int A01;
    public Bitmap A02;
    public Bitmap A03;
    public Bitmap A04;
    public Rect A05;
    public AnonymousClass7XV A06;
    public BottomSheetBehavior A07;
    public C87964Wu A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final int A0G;
    public final int A0H;
    public final Handler A0I = AnonymousClass000.A0A();
    public final View A0J;
    public final View A0K;
    public final View A0L;
    public final CoordinatorLayout A0M;
    public final AnonymousClass0N1 A0N;
    public final C003203q A0O;
    public final RecyclerView A0P;
    public final C33131sU A0Q;
    public final AnonymousClass33p A0R;
    public final C620733j A0S;
    public final C133846i2 A0T;
    public final C109225eH A0U;
    public final C114825nf A0V;
    public final C72173dI A0W;
    public final Runnable A0X;
    public final String A0Y;

    public AnonymousClass5Y7(Uri uri, View view, C003203q r11, AnonymousClass30B r12, AnonymousClass33p r13, C620733j r14, C133846i2 r15, C109225eH r16, C114825nf r17, AnonymousClass4FS r18, int i) {
        this.A0O = r11;
        this.A0S = r14;
        this.A0R = r13;
        this.A0K = view;
        this.A0U = r16;
        this.A01 = i;
        this.A0T = r15;
        this.A0V = r17;
        this.A0Q = r12.A02();
        this.A0W = C72173dI.A00(r18);
        this.A0N = new AnonymousClass0N1(view.getContext(), new C188718zN(this, 2));
        this.A0M = (CoordinatorLayout) C06560Yg.A02(this.A0K, R.id.filter_sheet_container);
        this.A0J = C06560Yg.A02(this.A0K, R.id.filter_bottom_sheet);
        this.A0P = C86654Ky.A0P(this.A0K, R.id.filter_selector);
        this.A0L = C06560Yg.A02(this.A0K, R.id.media_content);
        this.A00 = 0.28f;
        this.A0Y = AnonymousClass000.A0X("-filter", C18290x4.A0v(uri));
        this.A0H = r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0G = r11.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        this.A0X = new C70513ac(this, r11, r15, view, 7);
    }

    public static /* synthetic */ void A00(AnonymousClass5Y7 r6) {
        Rect rect;
        RecyclerView recyclerView = r6.A0P;
        ViewGroup.MarginLayoutParams A0T2 = AnonymousClass001.A0T(recyclerView);
        if (A0T2 != null) {
            Rect rect2 = r6.A05;
            if (rect2 != null) {
                A0T2.leftMargin = rect2.left;
                A0T2.rightMargin = rect2.right;
                A0T2.topMargin = rect2.top;
                A0T2.bottomMargin = rect2.bottom;
            }
            recyclerView.setLayoutParams(A0T2);
            recyclerView.A0h = true;
        }
        View view = r6.A0K;
        int width = view.getWidth();
        int height = view.getHeight();
        int dimensionPixelSize = r6.A0O.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        float f = 0.5f;
        if (width < height) {
            f = 0.28f;
        }
        r6.A00 = f;
        BottomSheetBehavior bottomSheetBehavior = r6.A07;
        if (!(bottomSheetBehavior == null || (rect = r6.A05) == null)) {
            bottomSheetBehavior.A0U((height - dimensionPixelSize) - rect.bottom, false);
        }
        float f2 = ((float) width) / 2.0f;
        float A0D2 = ((float) C86664Kz.A0D(recyclerView, height)) / 2.0f;
        View view2 = r6.A0L;
        view2.setPivotX(f2);
        view2.setPivotY(A0D2);
        C114825nf r2 = r6.A0V;
        if (r2 != null) {
            DoodleView doodleView = r2.A0M;
            doodleView.setPivotX(f2);
            doodleView.setPivotY(A0D2);
        }
        BottomSheetBehavior bottomSheetBehavior2 = r6.A07;
        if (bottomSheetBehavior2 != null && bottomSheetBehavior2.A0O == 3) {
            float f3 = 1.0f - r6.A00;
            view2.setScaleX(f3);
            view2.setScaleY(f3);
            if (r2 != null) {
                DoodleView doodleView2 = r2.A0M;
                doodleView2.setScaleX(f3);
                doodleView2.setScaleY(f3);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r2 == 3) goto L_0x000d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01() {
        /*
            r4 = this;
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = r4.A07
            if (r3 == 0) goto L_0x000d
            int r2 = r3.A0O
            r0 = 4
            if (r2 == r0) goto L_0x000d
            r0 = 3
            r1 = 0
            if (r2 != r0) goto L_0x000e
        L_0x000d:
            r1 = 1
        L_0x000e:
            r2 = 0
            if (r1 == 0) goto L_0x001f
            if (r3 == 0) goto L_0x0019
            int r1 = r3.A0O
            r0 = 3
            if (r1 != r0) goto L_0x0019
            return
        L_0x0019:
            android.view.View r0 = r4.A0J
            r0.setVisibility(r2)
            return
        L_0x001f:
            r0 = 1
            r4.A0C = r0
            r4.A0A = r2
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5Y7.A01():void");
    }

    public void A02() {
        String str;
        C33131sU r5 = this.A0Q;
        if (r5 == null) {
            str = "FilterSelectorController/updateFilteredMediaBitmap/thumbCache is null";
        } else if (this.A04 == null) {
            str = "FilterSelectorController/updateFilteredMediaBitmap/mediaBitmap is null";
        } else {
            String str2 = this.A0Y;
            Bitmap bitmap = (Bitmap) r5.A06(str2);
            this.A03 = bitmap;
            if (bitmap == null) {
                int i = this.A01;
                if (i == 0) {
                    this.A03 = this.A04;
                    r5.A08(str2);
                    return;
                }
                Bitmap A002 = FilterUtils.A00(this.A04, this.A0T, i, true);
                this.A03 = A002;
                if (A002 == null) {
                    this.A03 = this.A04;
                    this.A01 = 0;
                    Log.w("FilterSelectorController/updateFilteredMediaBitmap/filter failed");
                    return;
                }
                r5.A09(str2, A002);
                return;
            }
            return;
        }
        Log.d(str);
    }

    public final void A03() {
        C87964Wu r5 = this.A08;
        if (r5 != null) {
            int i = 0;
            while (true) {
                AnonymousClass5Y7 r2 = r5.A09;
                RecyclerView recyclerView = r2.A0P;
                if (i < recyclerView.getChildCount()) {
                    AnonymousClass4Z9 r0 = (AnonymousClass4Z9) recyclerView.A0H(recyclerView.getChildAt(i));
                    if (r0 != null) {
                        ImageView imageView = r0.A02;
                        imageView.setBackgroundResource(0);
                        imageView.setImageDrawable((Drawable) null);
                    }
                    i++;
                } else {
                    new C138126po(r5.A01).A02.executeOnExecutor(r2.A0W, new Void[0]);
                    return;
                }
            }
        }
    }

    public final void A04() {
        if (this.A04 != null && !this.A09) {
            C003203q r2 = this.A0O;
            if (r2.A06.A02 != AnonymousClass0GC.DESTROYED) {
                new AnonymousClass68M((C15910sA) r2, this).A02.executeOnExecutor(this.A0W, new Void[0]);
                this.A09 = true;
            }
        }
    }

    public void A05(Runnable runnable, Runnable runnable2, int i) {
        C33131sU r2;
        if (this.A04 == null || (r2 = this.A0Q) == null) {
            Log.e("FilterSelectorController/startUpdateFilteredMediaBitmapTask/mediaBitmap is null");
            return;
        }
        String str = this.A0Y;
        Bitmap bitmap = (Bitmap) r2.A06(str);
        if (i != this.A01 || i == 0) {
            r2.A08(str);
        }
        if (i != 0) {
            new AnonymousClass553(bitmap, this.A0O, this, runnable, runnable2, i).A02.executeOnExecutor(this.A0W, new Void[0]);
            return;
        }
        this.A03 = this.A04;
        if (runnable != null) {
            runnable.run();
        }
        this.A01 = 0;
        this.A0U.A00();
    }

    public void A06(boolean z) {
        int i;
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        if (bottomSheetBehavior == null || (i = bottomSheetBehavior.A0O) == 4 || i == 3) {
            this.A0J.setVisibility(4);
            return;
        }
        this.A0C = false;
        this.A0A = true;
        this.A0B = z;
    }

    public final boolean A07() {
        BottomSheetBehavior bottomSheetBehavior = this.A07;
        if (bottomSheetBehavior == null || bottomSheetBehavior.A0O == 4 || this.A0F) {
            return false;
        }
        AnonymousClass7XV r2 = this.A06;
        if (r2 != null) {
            r2.A03(this.A0J, 1);
        }
        BottomSheetBehavior bottomSheetBehavior2 = this.A07;
        if (bottomSheetBehavior2 != null) {
            bottomSheetBehavior2.A0S(4);
        }
        this.A0F = true;
        return true;
    }
}
