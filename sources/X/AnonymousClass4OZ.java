package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.whatsapp.R;
import com.whatsapp.components.SelectionCheckView;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4OZ  reason: invalid class name */
public class AnonymousClass4OZ extends BaseAdapter {
    public List A00 = AnonymousClass001.A0s();
    public final /* synthetic */ C89104bW A01;

    public AnonymousClass4OZ(C89104bW r2) {
        this.A01 = r2;
    }

    public final void A00(SelectionCheckView selectionCheckView, boolean z) {
        int i;
        C89104bW r1 = this.A01;
        if (r1.A0M) {
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
        } else {
            i = R.string.f11nameremoved;
            if (z) {
                i = R.string.f11nameremoved;
            }
        }
        C18300x5.A13(r1, selectionCheckView, i);
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass7MT r0;
        AnonymousClass3ZH A0L = AnonymousClass4L0.A0L(this.A00, i);
        if (view == null) {
            C89104bW r2 = this.A01;
            view = r2.getLayoutInflater().inflate(R.layout.f8nameremoved, viewGroup, false);
            r0 = new AnonymousClass7MT();
            view.setTag(r0);
            r0.A00 = AnonymousClass0x9.A0F(view, R.id.contactpicker_row_photo);
            r0.A01 = AnonymousClass5YB.A00(view, r2.A06, R.id.contactpicker_row_name);
            r0.A02 = (SelectionCheckView) view.findViewById(R.id.selection_check);
            C106905aM.A04(r0.A01.A02);
        } else {
            r0 = (AnonymousClass7MT) view.getTag();
        }
        view.setClickable(false);
        view.setLongClickable(false);
        Class<UserJid> cls = UserJid.class;
        r0.A03 = (UserJid) AnonymousClass3ZH.A05(A0L, cls);
        C89104bW r5 = this.A01;
        r5.A0D.A08(r0.A00, A0L);
        AnonymousClass0YY.A06(r0.A00, 2);
        r0.A01.A0A(A0L, r5.A0J);
        boolean A1Y = C86644Kx.A1Y(A0L, cls, r5.A0V);
        boolean z = r5.A0M;
        SelectionCheckView selectionCheckView = r0.A02;
        int i2 = R.drawable.teal_circle;
        if (z) {
            i2 = R.drawable.red_circle;
        }
        selectionCheckView.setSelectionBackground(i2);
        if (r5.A0U.remove(A0L.A0I(cls))) {
            r0.A02.getViewTreeObserver().addOnPreDrawListener(new C167007zc(this, r0, A1Y));
        } else {
            boolean A0P = r5.A07.A0P((UserJid) A0L.A0I(cls));
            SelectionCheckView selectionCheckView2 = r0.A02;
            if (A0P) {
                selectionCheckView2.A06(r5.A0M, false);
                C18300x5.A13(r5, r0.A02, R.string.f11nameremoved);
                view.setAlpha(0.5f);
                return view;
            }
            selectionCheckView2.A06(A1Y, false);
            A00(r0.A02, A1Y);
        }
        view.setAlpha(1.0f);
        return view;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
