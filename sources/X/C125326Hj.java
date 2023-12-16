package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.6Hj  reason: invalid class name and case insensitive filesystem */
public class C125326Hj extends AnonymousClass0R6 {
    public int A00 = -1;
    public int A01;
    public List A02 = AnonymousClass001.A0s();
    public final /* synthetic */ C153447bK A03;

    public C125326Hj(C153447bK r2) {
        this.A03 = r2;
    }

    public long A0B(int i) {
        if (!this.A00) {
            return -1;
        }
        C153447bK r6 = this.A03;
        if (r6 instanceof C135726l9) {
            C135726l9 r62 = (C135726l9) r6;
            boolean z = r62.A01;
            if (z && i == 0) {
                return -1;
            }
            List list = r62.A03;
            if (z) {
                i--;
            }
            String str = ((C50612iT) list.get(i)).A0G;
            Map map = r62.A04;
            Number number = (Number) map.get(str);
            if (number == null) {
                long j = r62.A00;
                r62.A00 = 1 + j;
                number = Long.valueOf(j);
                map.put(str, number);
            }
            return number.longValue();
        }
        throw AnonymousClass002.A0G("You must override getStableId");
    }

    public int A0G() {
        return this.A02.size();
    }

    public final void A0K() {
        int i;
        int i2;
        ShapePickerRecyclerView shapePickerRecyclerView = this.A03.A08;
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A05;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            int A1G = gridLayoutManagerNonPredictiveAnimations.A1G();
            GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations2 = shapePickerRecyclerView.A05;
            if (gridLayoutManagerNonPredictiveAnimations2 != null) {
                int A1I = gridLayoutManagerNonPredictiveAnimations2.A1I();
                if (A1G == 0) {
                    i = 0;
                } else if (A1I == shapePickerRecyclerView.getAdapterItemCount() - 1) {
                    i = AnonymousClass002.A03(this.A02);
                } else {
                    i = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < this.A02.size(); i4++) {
                        int A09 = AnonymousClass000.A09(this.A02, i4);
                        if (i4 < AnonymousClass002.A03(this.A02)) {
                            i2 = AnonymousClass000.A09(this.A02, i4 + 1) - 1;
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        int min = Math.min(AnonymousClass001.A0A(A09, A1G), AnonymousClass001.A0A(i2, (A1G + A1I) / 2));
                        if (min < i3) {
                            i = i4;
                            i3 = min;
                        }
                    }
                }
                A0M(i);
                return;
            }
            throw AnonymousClass001.A0e("Must set adapter first");
        }
        throw AnonymousClass001.A0e("Must set adapter first");
    }

    public final void A0L(int i) {
        C153447bK r1 = this.A03;
        r1.A02 = false;
        A0M(i);
        ShapePickerRecyclerView shapePickerRecyclerView = r1.A08;
        int A09 = AnonymousClass000.A09(this.A02, i);
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A05;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            C04690Qg r0 = shapePickerRecyclerView.A04;
            r0.A00 = A09;
            gridLayoutManagerNonPredictiveAnimations.A0x(r0);
            return;
        }
        throw AnonymousClass001.A0e("Must set adapter first");
    }

    public final void A0M(int i) {
        int i2 = this.A00;
        this.A00 = i;
        A06(i2);
        A06(this.A00);
        int max = Math.max(this.A00 - (this.A01 / 2), 0);
        C153447bK r2 = this.A03;
        C04690Qg r1 = r2.A05;
        if (max != r1.A00) {
            r1.A00 = max;
            r2.A03.A0x(r1);
        }
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        View view;
        String A0F;
        AnonymousClass6IZ r92 = (AnonymousClass6IZ) r9;
        int i2 = 0;
        boolean A1U = AnonymousClass000.A1U(this.A00, i);
        C153447bK r6 = this.A03;
        if (r6 instanceof C135726l9) {
            C135726l9 r62 = (C135726l9) r6;
            boolean z = r62.A01;
            if (!z || i != 0) {
                List list = r62.A03;
                if (z) {
                    i--;
                }
                C50612iT r5 = (C50612iT) list.get(i);
                String str = r5.A0G;
                ImageView imageView = r92.A01;
                if (!str.equals(imageView.getTag())) {
                    r62.A02.A0B(r5, new C68773Ul(imageView, str));
                    view = r92.A0H;
                    A0F = AnonymousClass002.A0F(view.getContext(), r5.A0I, AnonymousClass002.A0L(), 0, R.string.f11nameremoved);
                }
            } else {
                ImageView imageView2 = r92.A01;
                imageView2.setTag((Object) null);
                imageView2.setImageResource(R.drawable.ic_stickers_recents);
                view = r92.A0H;
                A0F = view.getContext().getString(R.string.f11nameremoved);
            }
            view.setContentDescription(A0F);
        } else {
            ImageView imageView3 = r92.A01;
            imageView3.setImageResource(C135736lA.A01[i]);
            float f = 0.55f;
            if (A1U) {
                f = 1.0f;
            }
            imageView3.setAlpha(f);
            View view2 = r92.A0H;
            C18300x5.A13(view2.getContext(), view2, C135736lA.A02[i]);
        }
        View view3 = r92.A00;
        if (!A1U) {
            i2 = 8;
        }
        view3.setVisibility(i2);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C153447bK r2 = this.A03;
        AnonymousClass6IZ r3 = new AnonymousClass6IZ(AnonymousClass001.A0R(C18280x3.A0D(r2.A06), viewGroup, R.layout.f8nameremoved));
        r2.A01(r3, r2.A00);
        r3.A0H.setOnClickListener(new C109485eh(this, 27, r3));
        return r3;
    }
}
