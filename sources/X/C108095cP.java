package X;

import android.content.DialogInterface;
import android.text.TextUtils;
import com.whatsapp.R;
import com.whatsapp.mediacomposer.doodle.DoodleView;
import java.util.List;

/* renamed from: X.5cP  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C108095cP implements DialogInterface.OnDismissListener {
    public final /* synthetic */ C114825nf A00;
    public final /* synthetic */ C95964vF A01;
    public final /* synthetic */ C149797Nx A02;

    public final void onDismiss(DialogInterface dialogInterface) {
        C106085Xo r0;
        C114825nf r1 = this.A00;
        C95964vF r6 = this.A01;
        C149797Nx r2 = this.A02;
        boolean isEmpty = TextUtils.isEmpty(r2.A04);
        if (r6 != null) {
            if (isEmpty) {
                r0 = r1.A0L;
            } else {
                AnonymousClass5US r4 = r1.A0T;
                AnonymousClass5PR r02 = r4.A03;
                List list = r4.A04;
                r02.A00(list);
                C105425Uw r03 = r4.A01;
                if (r03 != null && !list.contains(r03)) {
                    r4.A01 = null;
                }
                DoodleView doodleView = r1.A0M;
                String str = r2.A04;
                float f = r2.A00;
                AnonymousClass5X6 r04 = r2.A03;
                int i = r04.A03;
                int i2 = r2.A02;
                int i3 = r2.A01;
                int i4 = r04.A02;
                if (!(str.equals(r6.A0A) && r6.A01.getColor() == i && i2 == r6.A07 && i3 == r6.A06 && i4 == r6.A09.A02)) {
                    AnonymousClass5US r3 = doodleView.A0I;
                    r3.A03.A00.add(new C95994vK(r6.A0A(), r6));
                    r6.A0a(str, f, i2, i3, i4);
                    r6.A0J(i);
                    doodleView.invalidate();
                    if (r6 != r3.A01) {
                        r0 = doodleView.A0F;
                    }
                }
            }
            r0.A01();
        } else if (!isEmpty) {
            DoodleView doodleView2 = r1.A0M;
            String str2 = r2.A04;
            float f2 = r2.A00;
            AnonymousClass5X6 r05 = r2.A03;
            int i5 = r05.A03;
            int i6 = r2.A02;
            int i7 = r2.A01;
            int i8 = r05.A02;
            C95964vF r5 = new C95964vF(doodleView2.getContext(), doodleView2.A06);
            r5.A0a(str2, f2, i6, i7, i8);
            r5.A0J(i5);
            doodleView2.A03(r5);
        }
        AnonymousClass33p r06 = r1.A0E;
        C18270x1.A0h(C18270x1.A03(r06), "text_tool_media_composer_font", r1.A02);
        C86604Kt.A0z(r1.A03.getContext(), r1.A08.findViewById(16908290).getRootView(), R.color.f5nameremoved);
        r1.A0M.invalidate();
        C105305Uj r32 = r1.A0V;
        r32.A07(0);
        r1.A05.A02();
        r1.A06();
        r32.A03();
        r32.A0C = false;
    }

    public /* synthetic */ C108095cP(C114825nf r1, C95964vF r2, C149797Nx r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
