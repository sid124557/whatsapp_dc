package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4mW  reason: invalid class name and case insensitive filesystem */
public final class C92344mW extends AnonymousClass4X9 {
    public final int A00;
    public final Context A01;
    public final C08270df A02;
    public final AnonymousClass677 A03;
    public final List A04;

    public C92344mW(Context context, C08270df r17, C15910sA r18, AnonymousClass679 r19, C30791n7 r20) {
        Object next;
        int lineCount;
        Context context2 = context;
        C162457s7.A0J(context2, 1);
        C08270df r0 = r17;
        C15910sA r3 = r18;
        AnonymousClass679 r2 = r19;
        C30791n7 r1 = r20;
        C18260x0.A0e(r0, r2, r3, r1);
        this.A01 = context2;
        this.A02 = r0;
        C626936e.A0B(AnonymousClass36V.A07(r1));
        List list = r1.A01;
        list = list == null ? C72023d3.A00 : list;
        this.A04 = list;
        this.A03 = new C112965kf(r3, r2);
        ArrayList A0c = C73783g4.A0c(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C624134x A0T = C18300x5.A0T(it);
            if (!(A0T instanceof AnonymousClass4DV)) {
                StringBuilder A0o = AnonymousClass001.A0o();
                C18260x0.A0n(C624134x.A08(A0T, "CarouselMessageAdapter/measureTextLines; unsupported message type for message: key=", A0o), A0o);
                lineCount = 0;
            } else {
                AnonymousClass39W B5s = ((AnonymousClass4DV) A0T).B5s();
                String str = (B5s == null || (str = B5s.A08) == null) ? "" : str;
                TextPaint textPaint = new TextPaint();
                textPaint.setTypeface(Typeface.SANS_SERIF);
                textPaint.setAntiAlias(true);
                Context context3 = this.A01;
                textPaint.setTextSize(context3.getResources().getDimension(R.dimen.f6nameremoved));
                float f = (float) 2;
                lineCount = new StaticLayout(str, textPaint, (int) ((context3.getResources().getDimension(R.dimen.f6nameremoved) + (context3.getResources().getDimension(R.dimen.f6nameremoved) * f)) - (f * context3.getResources().getDimension(R.dimen.f6nameremoved))), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, true).getLineCount();
            }
            C18270x1.A1K(A0c, lineCount);
        }
        Iterator it2 = A0c.iterator();
        if (!it2.hasNext()) {
            next = null;
        } else {
            next = it2.next();
            if (it2.hasNext()) {
                int A0K = AnonymousClass001.A0K(next);
                do {
                    Object next2 = it2.next();
                    int A0K2 = AnonymousClass001.A0K(next2);
                    if (A0K < A0K2) {
                        next = next2;
                        A0K = A0K2;
                    }
                } while (it2.hasNext());
            }
        }
        this.A00 = Math.max(1, C18310x6.A06((Number) next));
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C162457s7.A0J(viewGroup, 0);
        Context context = this.A01;
        FrameLayout frameLayout = new FrameLayout(context);
        C86624Kv.A0x(frameLayout, -2);
        CardView A002 = AnonymousClass4X9.A00(frameLayout, viewGroup);
        A002.setCardBackgroundColor(0);
        A002.setBackgroundColor(0);
        A002.setRadius(0.0f);
        C106895aL.A01(A002, new C158547k9(0, 0, 0, 0));
        A002.setCardElevation(0.0f);
        A002.setElevation(0.0f);
        return new C92374mZ(context, A002, this.A02, this.A03, this.A00);
    }

    public int A0G() {
        return this.A04.size();
    }

    public final int A0K(AnonymousClass2z0 r4) {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (C86614Ku.A0h(it).equals(r4)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r2, int i) {
        AnonymousClass4Z0 r22 = (AnonymousClass4Z0) r2;
        C162457s7.A0J(r22, 0);
        Object A06 = C73723fy.A06(this.A04, i);
        if (A06 != null) {
            r22.A07(A06);
        }
    }

    public int getItemViewType(int i) {
        Object A06 = C73723fy.A06(this.A04, i);
        if (A06 instanceof AnonymousClass1n1) {
            return 1;
        }
        return C18310x6.A02(A06 instanceof C31941p8 ? 1 : 0);
    }
}
