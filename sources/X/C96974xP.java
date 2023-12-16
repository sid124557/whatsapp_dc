package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4xP  reason: invalid class name and case insensitive filesystem */
public final class C96974xP extends AnonymousClass4XA {
    public final C05460Tk A00;
    public final C111095hX A01;
    public final AnonymousClass5ZU A02;

    public C96974xP(C15910sA r10, C111095hX r11, AnonymousClass5ZU r12, C105365Uq r13, C46502bj r14, AnonymousClass4Ut r15, boolean z) {
        super(r10, r13, r14, r15, z);
        this.A02 = r12;
        this.A01 = r11;
        C188798zV r1 = new C188798zV(7);
        this.A00 = new C05460Tk(new C05360Ta(r1).A00(), new C08490eZ(this));
    }

    public void BNf(C05570Ua r10, int i) {
        String str;
        C95814uZ r0;
        AnonymousClass3ZH r02;
        AnonymousClass3ZH r7;
        C162457s7.A0J(r10, 0);
        AnonymousClass7EI r1 = (AnonymousClass7EI) this.A00.A02.get(i);
        if ((r1 instanceof C136916nT) && (r10 instanceof C125586Ip)) {
            AnonymousClass7ZJ r5 = ((C136916nT) r1).A00;
            C125586Ip r102 = (C125586Ip) r10;
            AnonymousClass7YJ r6 = r5.A00;
            C109525el r4 = null;
            if (r6 != null) {
                AnonymousClass3ZH r2 = r6.A00;
                if (r2 == null) {
                    String str2 = r6.A01;
                    if (str2 != null) {
                        r102.A04.A02.A00(r102.A03, str2);
                    }
                } else {
                    r102.A04.A01.A08(r102.A03, r2);
                }
            }
            r102.A02.A0K((List) null, r5.A03);
            TextView textView = r102.A01;
            if (r6 == null || (r7 = r6.A00) == null) {
                str = null;
            } else {
                str = r102.A04.A02.A0D(r7, -1, false, true).A01;
            }
            textView.setText(str);
            View view = r102.A0H;
            view.setContentDescription(textView.getText());
            if (r6 == null || (r02 = r6.A00) == null) {
                r0 = null;
            } else {
                r0 = r02.A0H;
            }
            UserJid A03 = AnonymousClass32Y.A03(r0);
            if (A03 != null) {
                r4 = new C109525el(r102.A04, r102, A03, 1);
            }
            view.setOnClickListener(r4);
            if (this.A04) {
                AnonymousClass4Ut r12 = this.A03;
                ImageView imageView = r102.A00;
                C624134x r22 = r5.A01;
                C162457s7.A0J(imageView, 0);
                AnonymousClass08M A012 = AnonymousClass08M.A01();
                r12.A0A.A09(imageView, r22, new C172058Jl(imageView, A012));
                C86604Kt.A1N(this.A00, A012, new AnonymousClass629(r102), 293);
            }
        }
    }

    public C05570Ua BQR(ViewGroup viewGroup, int i) {
        int i2;
        C162457s7.A0J(viewGroup, 0);
        if (i == 0) {
            i2 = R.layout.f8nameremoved;
        } else {
            i2 = R.layout.f8nameremoved;
            if (i != 2) {
                return new C125586Ip(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, R.layout.f8nameremoved, false), this);
            }
        }
        return new AnonymousClass6IJ(C18310x6.A0I(C18280x3.A0D(viewGroup), viewGroup, i2, false), this);
    }

    public int getItemViewType(int i) {
        return ((AnonymousClass7EI) this.A00.A02.get(i)).A00.ordinal();
    }
}
