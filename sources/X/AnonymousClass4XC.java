package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.chip.Chip;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.4XC  reason: invalid class name */
public final class AnonymousClass4XC extends AnonymousClass0R6 {
    public AnonymousClass5ER A00;
    public C185648u1 A01;
    public List A02;

    public AnonymousClass4XC(AnonymousClass5ER r2) {
        C162457s7.A0J(r2, 1);
        this.A00 = r2;
    }

    public static final Chip A00(Context context) {
        Chip chip = new Chip(context, (AttributeSet) null);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.leftMargin = dimensionPixelSize;
        marginLayoutParams.rightMargin = dimensionPixelSize;
        chip.setLayoutParams(marginLayoutParams);
        chip.setChipEndPadding(context.getResources().getDimension(R.dimen.f6nameremoved));
        chip.setChipStartPadding(context.getResources().getDimension(R.dimen.f6nameremoved));
        chip.setCloseIconResource(R.drawable.ic_chevron_down);
        return chip;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        if (i == 2) {
            Chip A002 = A00(C86614Ku.A0B(viewGroup));
            C185648u1 r0 = this.A01;
            if (r0 != null) {
                return new C90764iH(A002, r0);
            }
            throw C18270x1.A0S("onItemClickListener");
        } else if (i == 3) {
            Chip A003 = A00(C86614Ku.A0B(viewGroup));
            C185648u1 r02 = this.A01;
            if (r02 != null) {
                return new C90784iJ(A003, r02);
            }
            throw C18270x1.A0S("onItemClickListener");
        } else if (i == 4) {
            Chip A004 = A00(C86614Ku.A0B(viewGroup));
            C185648u1 r03 = this.A01;
            if (r03 != null) {
                return new C90774iI(A004, r03);
            }
            throw C18270x1.A0S("onItemClickListener");
        } else if (i == 6) {
            View A0H = C18310x6.A0H(LayoutInflater.from(C86614Ku.A0B(viewGroup)), R.layout.f8nameremoved);
            C162457s7.A0D(A0H);
            C185648u1 r04 = this.A01;
            if (r04 != null) {
                return new C90814iM(A0H, r04);
            }
            throw C18270x1.A0S("onItemClickListener");
        } else if (i == 7) {
            AnonymousClass5ER r2 = this.A00;
            Chip A005 = A00(C18290x4.A0F(viewGroup));
            C185648u1 r1 = this.A01;
            if (r1 != null) {
                return new C90794iK(A005, r1, C64333Db.A2t(r2.A00.A03));
            }
            throw C18270x1.A0S("onItemClickListener");
        } else {
            throw C86604Kt.A0h("FilterBarAdapter /onCreateViewHolder unhandled view type: ", AnonymousClass001.A0o(), i);
        }
    }

    public int A0G() {
        List list = this.A02;
        if (list != null) {
            return list.size();
        }
        throw C18270x1.A0S("filterListItems");
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        AnonymousClass6J2 r22 = (AnonymousClass6J2) r2;
        C162457s7.A0J(r22, 0);
        List list = this.A02;
        if (list == null) {
            throw C18270x1.A0S("filterListItems");
        }
        r22.A07((C150417Qq) list.get(i));
    }

    public int getItemViewType(int i) {
        List list = this.A02;
        if (list == null) {
            throw C18270x1.A0S("filterListItems");
        }
        Object obj = list.get(i);
        if (obj instanceof C132616fg) {
            return 2;
        }
        if (obj instanceof C132626fh) {
            return 7;
        }
        if (obj instanceof C132646fj) {
            return 3;
        }
        if (obj instanceof C132636fi) {
            return 4;
        }
        if (obj instanceof C132606ff) {
            return 6;
        }
        throw C73153f1.A00();
    }
}
