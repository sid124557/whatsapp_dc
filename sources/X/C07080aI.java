package X;

import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.bloks.stdlib.components.bkcomponentstextinput.BloksEditText;

/* renamed from: X.0aI  reason: invalid class name and case insensitive filesystem */
public class C07080aI implements View.OnFocusChangeListener {
    public final C04080Ms A00;
    public final C153427bI A01;
    public final AnonymousClass84O A02;
    public final C835248t A03;
    public final C835248t A04;

    public void onFocusChange(View view, boolean z) {
        C835248t r3;
        Editable text;
        BloksEditText bloksEditText = (BloksEditText) view;
        TextUtils.TruncateAt ellipsize = bloksEditText.getEllipsize();
        if (z) {
            if (ellipsize != null) {
                AnonymousClass0YA.A00((TextUtils.TruncateAt) null, bloksEditText, this.A00);
                bloksEditText.getExtendedPaddingTop();
                bloksEditText.getViewTreeObserver().addOnPreDrawListener(new C07270ab(bloksEditText, this));
            }
            r3 = this.A03;
        } else {
            if (ellipsize == null && AnonymousClass0YA.A07(bloksEditText) && (text = bloksEditText.getText()) != null) {
                Rect A0N = AnonymousClass001.A0N();
                bloksEditText.getPaint().getTextBounds(text.toString(), 0, text.length(), A0N);
                if (A0N.width() > AnonymousClass000.A06(bloksEditText, bloksEditText.getWidth())) {
                    AnonymousClass0YA.A00(TextUtils.TruncateAt.END, bloksEditText, this.A00);
                }
            }
            r3 = this.A04;
        }
        if (r3 != null) {
            C152057Xj r0 = new C152057Xj();
            AnonymousClass84O r2 = this.A02;
            r0.A04(r2, 0);
            C153427bI r1 = this.A01;
            r0.A04(r1, 1);
            C159377lj.A01(r1, r2, r0.A03(), r3);
        }
    }

    public C07080aI(C153427bI r2, AnonymousClass84O r3, C835248t r4, C835248t r5) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = (C04080Ms) C162377rs.A06(r2, r3);
    }
}
