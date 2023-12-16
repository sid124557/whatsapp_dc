package X;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;

/* renamed from: X.4bQ  reason: invalid class name and case insensitive filesystem */
public class C89064bQ extends AnonymousClass6JG {
    public final Context A00;
    public final C15910sA A01;
    public final C69263Wi A02;
    public final C56972sr A03;
    public final AnonymousClass5UX A04;
    public final C64773Ex A05;
    public final AnonymousClass5ZU A06;
    public final C613330g A07;
    public final C620733j A08;
    public final AnonymousClass4UX A09;
    public final C72173dI A0A;

    public CharSequence A04(int i) {
        if (i == 0) {
            C620733j r7 = this.A08;
            Context context = this.A00;
            int A062 = C86614Ku.A06(this.A09.A03.A02);
            Resources resources = context.getResources();
            Object[] A0L = AnonymousClass002.A0L();
            A0L[0] = C107165ao.A01(context, r7, A062);
            return resources.getQuantityString(R.plurals.f9nameremoved, A062, A0L);
        }
        AnonymousClass5OD r6 = (AnonymousClass5OD) C86644Kx.A0h(this.A09.A06).get(i - 1);
        C620733j r1 = this.A08;
        Context context2 = this.A00;
        String A012 = C107165ao.A01(context2, r1, C86614Ku.A06(r6.A02));
        Object[] A0M = AnonymousClass002.A0M();
        A0M[0] = r6.A03;
        return AnonymousClass002.A0F(context2, A012, A0M, 1, R.string.f11nameremoved);
    }

    public int A0C() {
        return C86614Ku.A06(this.A09.A06) + 1;
    }

    public /* bridge */ /* synthetic */ int A0G(Object obj) {
        int i;
        AnonymousClass4UX r3 = this.A09;
        Object obj2 = ((AnonymousClass0PJ) obj).A01;
        C626936e.A06(obj2);
        AnonymousClass5OD r2 = (AnonymousClass5OD) obj2;
        if (r2.A03.equals(r3.A03.A03)) {
            return 0;
        }
        int indexOf = C86644Kx.A0h(r3.A06).indexOf(r2);
        if (indexOf < 0 || (i = indexOf + 1) == -1) {
            return -2;
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Object A0H(ViewGroup viewGroup, int i) {
        AnonymousClass5OD r10;
        Context context = this.A00;
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(R.id.reactions_bottom_sheet_tab_recycler_view);
        recyclerView.setPadding(0, context.getResources().getDimensionPixelSize(R.dimen.f6nameremoved), 0, 0);
        recyclerView.setClipToPadding(false);
        AnonymousClass4UX r11 = this.A09;
        if (i == 0) {
            r10 = r11.A03;
        } else {
            r10 = (AnonymousClass5OD) C86644Kx.A0h(r11.A06).get(i - 1);
        }
        C18270x1.A0u(recyclerView);
        C69263Wi r3 = this.A02;
        C56972sr r4 = this.A03;
        AnonymousClass5UX r5 = this.A04;
        C64773Ex r6 = this.A05;
        C72173dI r12 = this.A0A;
        AnonymousClass5ZU r7 = this.A06;
        C620733j r9 = this.A08;
        recyclerView.setAdapter(new C87974Wv(this.A01, r3, r4, r5, r6, r7, this.A07, r9, r10, r11, r12));
        viewGroup.addView(recyclerView);
        return AnonymousClass0x9.A0G(recyclerView, r10);
    }

    public /* bridge */ /* synthetic */ void A0I(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) ((AnonymousClass0PJ) obj).A00);
    }

    public /* bridge */ /* synthetic */ boolean A0K(View view, Object obj) {
        return AnonymousClass000.A1Y(view, ((AnonymousClass0PJ) obj).A00);
    }

    public C89064bQ(Context context, C15910sA r4, C69263Wi r5, C56972sr r6, AnonymousClass5UX r7, C64773Ex r8, AnonymousClass5ZU r9, C613330g r10, C620733j r11, AnonymousClass4UX r12, C72173dI r13) {
        this.A02 = r5;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = r8;
        this.A0A = r13;
        this.A06 = r9;
        this.A08 = r11;
        this.A07 = r10;
        this.A00 = context;
        this.A01 = r4;
        this.A09 = r12;
        C86604Kt.A1N(r4, r12.A06, this, 324);
    }
}
