package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.09R  reason: invalid class name */
public final class AnonymousClass09R extends C04580Ov {
    public final float A00;
    public final float A01;
    public final float A02;
    public final int A03;
    public final C141896wJ A04;

    public AnonymousClass09R(C141896wJ r2, float f, float f2, float f3, int i) {
        C162457s7.A0J(r2, 5);
        this.A01 = f;
        this.A02 = f2;
        this.A00 = f3;
        this.A03 = i;
        this.A04 = r2;
    }

    public void A03(Rect rect, View view, AnonymousClass0Q1 r14, RecyclerView recyclerView) {
        C125336Hk r9;
        int height;
        int A012;
        C162457s7.A0J(rect, 0);
        C162457s7.A0J(view, 1);
        C162457s7.A0J(recyclerView, 2);
        AnonymousClass0R6 r92 = recyclerView.A0N;
        String str = null;
        if ((r92 instanceof C125336Hk) && (r9 = (C125336Hk) r92) != null) {
            int A002 = RecyclerView.A00(view);
            int A0G = r9.A0G();
            if (A002 != -1 && A002 < A0G) {
                C06440Xs layoutManager = recyclerView.getLayoutManager();
                C162457s7.A0K(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                int i = 0;
                boolean A1U = AnonymousClass000.A1U(AnonymousClass0YH.A01(layoutManager.A07), 1);
                C180488l9 A003 = ((C151627Vn) r9.A0L().get(A002)).A00();
                C162457s7.A0K(A003, "null cannot be cast to non-null type com.instagram.common.bloks.component.base.BloksModel");
                AnonymousClass84O A0I = ((AnonymousClass84O) A003).A0I();
                if (A0I != null) {
                    str = A0I.A0O(42);
                }
                C141896wJ A004 = AnonymousClass0VE.A00(this.A04, str);
                int i2 = this.A03;
                if (i2 == 1) {
                    height = recyclerView.getWidth();
                } else {
                    height = recyclerView.getHeight();
                }
                C160247nJ A013 = ((C151627Vn) r9.A0L().get(A002)).A01().A01();
                if (A013 != null) {
                    C151847Wn A005 = A013.A00();
                    if (i2 == 1) {
                        A012 = A005.A02();
                    } else {
                        A012 = A005.A01();
                    }
                    int i3 = height - A012;
                    int ordinal = A004.ordinal();
                    if (ordinal == 1) {
                        i = C1222663s.A00(((double) i3) / 2.0d);
                    } else if (ordinal == 2) {
                        i = i3;
                    }
                    if (i2 != 1) {
                        rect.top = i;
                    } else if (A1U) {
                        rect.right = i;
                    } else {
                        rect.left = i;
                    }
                }
                if (A002 == 0) {
                    int i4 = (int) this.A01;
                    if (i2 == 1) {
                        rect.top = i4;
                    } else if (A1U) {
                        rect.right = i4;
                    } else {
                        rect.left = i4;
                    }
                }
                int i5 = A0G - 1;
                if (A002 < i5) {
                    int i6 = (int) this.A02;
                    if (i2 == 1) {
                        rect.bottom = i6;
                    } else if (A1U) {
                        rect.left = i6;
                    } else {
                        rect.right = i6;
                    }
                }
                if (A002 == i5) {
                    int i7 = (int) this.A00;
                    if (i2 == 1) {
                        rect.bottom = i7;
                    } else if (A1U) {
                        rect.left = i7;
                    } else {
                        rect.right = i7;
                    }
                }
            }
        }
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass09R) {
                AnonymousClass09R r5 = (AnonymousClass09R) obj;
                if (!(Float.compare(this.A01, r5.A01) == 0 && Float.compare(this.A02, r5.A02) == 0 && Float.compare(this.A00, r5.A00) == 0 && this.A03 == r5.A03 && this.A04 == r5.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AnonymousClass002.A02(this.A04, ((((((Float.floatToIntBits(this.A01) * 31) + Float.floatToIntBits(this.A02)) * 31) + Float.floatToIntBits(this.A00)) * 31) + this.A03) * 31);
    }

    public String toString() {
        StringBuilder A0o = AnonymousClass001.A0o();
        A0o.append("ItemDecoration(spacingBefore=");
        A0o.append(this.A01);
        A0o.append(", spacingBetween=");
        A0o.append(this.A02);
        A0o.append(", spacingAfter=");
        A0o.append(this.A00);
        A0o.append(", orientation=");
        A0o.append(this.A03);
        A0o.append(", alignItems=");
        A0o.append(this.A04);
        return AnonymousClass000.A0c(A0o);
    }
}
