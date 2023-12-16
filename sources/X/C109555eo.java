package X;

import android.view.View;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsFragment;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel;
import com.whatsapp.expressionstray.emoji.EmojiExpressionsViewModel$onSkinToneSelected$1;

/* renamed from: X.5eo  reason: invalid class name and case insensitive filesystem */
public class C109555eo implements View.OnClickListener {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public final int A04;

    public C109555eo(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.A04 = i2;
        this.A01 = obj;
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A04) {
            case 0:
                int i = this.A00;
                int[] iArr = (int[]) this.A02;
                EmojiExpressionsViewModel A0i = C86634Kw.A0i((EmojiExpressionsFragment) this.A01);
                C162457s7.A0H(iArr);
                C162457s7.A0J(iArr, 1);
                C107005aX.A03(A0i.A09, iArr);
                A0i.A0E(iArr, i);
                C616131n.A02((C85494Gl) null, new EmojiExpressionsViewModel$onSkinToneSelected$1(A0i, (C84814Du) null, iArr, i), AnonymousClass0IV.A00(A0i), (AnonymousClass20D) null, 3);
                ((View) this.A03).setVisibility(8);
                return;
            case 1:
                int i2 = this.A00;
                ((C194711h) this.A01).A0C.BGj(((AnonymousClass1UD) this.A02).A00, Integer.valueOf(i2), this.A03);
                return;
            default:
                int i3 = this.A00;
                ((AnonymousClass4Z2) this.A01).A07.A0L.BWP(new AnonymousClass7HU(C998258i.UNKNOWN, ((AnonymousClass3ZL) this.A03).A01), ((C148327Hy) this.A02).A01, i3);
                return;
        }
    }
}
