package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

/* renamed from: X.1Pt  reason: invalid class name and case insensitive filesystem */
public class C22701Pt extends C19400zX {
    public final Resources A00;
    public final LayoutInflater A01;
    public final AnonymousClass5ZU A02;

    public C22701Pt(Context context, C56972sr r12, C64773Ex r13, AnonymousClass5ZU r14, C105365Uq r15, C105165Tv r16, AnonymousClass677 r17, C55832qz r18, AnonymousClass543 r19) {
        super(context, r12, r13, r15, r16, r17, r18, r19);
        this.A01 = LayoutInflater.from(context);
        this.A00 = context.getResources();
        this.A02 = r14;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        View inflate;
        String A0R;
        if (view != null) {
            inflate = view;
        } else {
            inflate = this.A01.inflate(R.layout.f8nameremoved, viewGroup, false);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(R.id.chat_bubble_container);
        TextView A09 = AnonymousClass002.A09(inflate, R.id.kept_by_footer_tv);
        if (viewGroup2 == null || A09 == null) {
            return super.getView(i, view, viewGroup);
        }
        View view2 = super.getView(i, viewGroup2.getChildAt(0), viewGroup);
        if (view == null) {
            viewGroup2.addView(view2);
        }
        C624134x B8i = B8i(this.A02, i);
        C626936e.A06(B8i);
        C30551md r9 = B8i.A1S;
        if (r9 != null && !r9.A1J.A02) {
            Resources resources = this.A00;
            Object[] A0L = AnonymousClass002.A0L();
            C64773Ex r1 = this.A02;
            AnonymousClass5ZU r2 = this.A02;
            if (r9.A0o() == null) {
                A0R = null;
            } else {
                A0R = r2.A0R(r1.A0A(r9.A0o()), C18280x3.A01(AnonymousClass2z0.A0D(B8i) ? 1 : 0), false);
            }
            A09.setText(C18320x8.A0b(resources, A0R, A0L, 0, R.string.f11nameremoved));
        }
        return inflate;
    }
}
