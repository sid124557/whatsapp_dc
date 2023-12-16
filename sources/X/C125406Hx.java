package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.LruCache;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.6Hx  reason: invalid class name and case insensitive filesystem */
public class C125406Hx extends C04580Ov {
    public int A00;
    public Rect A01 = AnonymousClass001.A0N();
    public LruCache A02 = new LruCache(50);
    public View A03;
    public boolean A04;
    public final C186028ud A05;

    public static /* synthetic */ void A00(C125406Hx r2, int i, int i2) {
        LruCache lruCache = r2.A02;
        if (lruCache.size() != 0) {
            for (int i3 = i; i3 <= i + i2; i3++) {
                lruCache.remove(Integer.valueOf(i3));
            }
        }
    }

    public void A02(Canvas canvas, AnonymousClass0Q1 r11, RecyclerView recyclerView) {
        C06440Xs layoutManager;
        C186028ud r7 = this.A05;
        if (r7.BoH() && (layoutManager = recyclerView.getLayoutManager()) != null) {
            int i = 0;
            View A0Q = layoutManager.A0Q(0);
            if (A0Q != null) {
                int A002 = RecyclerView.A00(A0Q);
                if (A002 == -1) {
                    View view = this.A03;
                    canvas.save();
                    canvas.translate((float) this.A01.left, 0.0f);
                    view.draw(canvas);
                } else {
                    int B85 = r7.B85(A002);
                    if (B85 == -1) {
                        this.A04 = true;
                        return;
                    }
                    this.A04 = false;
                    if (A002 == B85) {
                        layoutManager.A0j(A0Q, this.A01);
                    }
                    LruCache lruCache = this.A02;
                    Integer valueOf = Integer.valueOf(B85);
                    View view2 = (View) lruCache.get(valueOf);
                    if (view2 == null) {
                        C05570Ua BQR = r7.BQR(recyclerView, r7.getItemViewType(B85));
                        r7.BNf(BQR, B85);
                        view2 = BQR.A0H;
                        lruCache.put(valueOf, view2);
                    }
                    Rect rect = this.A01;
                    view2.measure(ViewGroup.getChildMeasureSpec(C86664Kz.A05(recyclerView.getWidth()), AnonymousClass000.A02(recyclerView), view2.getLayoutParams().width), ViewGroup.getChildMeasureSpec(View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 0), AnonymousClass000.A03(recyclerView), view2.getLayoutParams().height));
                    this.A00 = view2.getMeasuredHeight() + rect.bottom + rect.top;
                    view2.layout(0, 0, view2.getMeasuredWidth() + rect.left + rect.right, this.A00);
                    this.A03 = view2;
                    int bottom = view2.getBottom() - rect.top;
                    while (i < recyclerView.getChildCount()) {
                        View childAt = recyclerView.getChildAt(i);
                        Rect A0N = AnonymousClass001.A0N();
                        RecyclerView.A05(childAt, A0N);
                        if (A0N.bottom <= bottom || A0N.top > bottom) {
                            i++;
                        } else if (childAt != null) {
                            int A003 = RecyclerView.A00(childAt);
                            if (A003 == -1 || !r7.BHh(A003)) {
                                canvas.save();
                                canvas.translate((float) rect.left, 0.0f);
                            } else {
                                canvas.save();
                                canvas.translate((float) rect.left, (float) (childAt.getTop() - view2.getHeight()));
                            }
                            view2.draw(canvas);
                        } else {
                            return;
                        }
                    }
                    return;
                }
                canvas.restore();
            }
        }
    }

    public C125406Hx(Context context, RecyclerView recyclerView, C181648n6 r5, C186028ud r6) {
        this.A05 = r6;
        recyclerView.A14.add(new AnonymousClass80T(new AnonymousClass0N1(context, new AnonymousClass6EO(r5, this)), r5, r6, this));
        r6.BiZ(new C188828zY(this, 1));
    }
}
