package X;

import android.view.LayoutInflater;
import android.view.View;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.5hn  reason: invalid class name and case insensitive filesystem */
public abstract class C111255hn implements C184998st {
    public View A00;
    public final AnonymousClass4Pc A01;
    public final C194629Tw A02;

    public void A02(int i) {
        if (i != 1) {
            switch (i) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    return;
            }
        }
        this.A02.A02();
    }

    public View A00() {
        int i;
        View view = this.A00;
        if (view != null) {
            return view;
        }
        AnonymousClass4Pc r2 = this.A01;
        LayoutInflater A0D = C18280x3.A0D(r2);
        if (this instanceof C90114fr) {
            i = R.layout.f8nameremoved;
        } else {
            i = R.layout.f8nameremoved;
        }
        View A0R = AnonymousClass001.A0R(A0D, r2, i);
        this.A00 = A0R;
        return A0R;
    }

    public void A01() {
        C626936e.A04(this.A00);
        this.A00.setVisibility(8);
        this.A02.A03();
    }

    public void BFb() {
        C86604Kt.A1A(this.A00);
    }

    public boolean Bo4() {
        return this.A02.A05();
    }

    public void BrS() {
        if (this instanceof C90124fs) {
            C194629Tw r3 = this.A02;
            if (r3.A05() && this.A00 == null) {
                this.A01.addView(A00());
            }
            View A002 = A00();
            AnonymousClass0x7.A0K(A002, R.id.banner_title).A0K((List) null, r3.A00(A002.getContext(), R.string.f11nameremoved));
            C18300x5.A0G(A002, R.id.banner_image).setText(r3.A01());
            AnonymousClass4Pc r32 = this.A01;
            AnonymousClass5Yj.A0A(r32.getContext(), r32, R.attr.f3nameremoved, R.color.f5nameremoved);
            C18320x8.A15(r32, this, 16);
            C18320x8.A15(C06560Yg.A02(A002, R.id.cancel), this, 17);
            A002.setVisibility(0);
            r32.A01(16, 1);
            return;
        }
        if (this.A02.A05() && this.A00 == null) {
            this.A01.addView(A00());
        }
        View A003 = A00();
        TextEmojiLabel A0K = AnonymousClass0x7.A0K(A003, R.id.banner_title);
        AnonymousClass4Pc r5 = this.A01;
        A0K.A0K((List) null, C107575bX.A00(r5.getContext(), new Object[]{C107575bX.A04(A003.getContext(), AnonymousClass5Yj.A00(A003.getContext()))}, R.string.f11nameremoved));
        AnonymousClass5Yj.A0A(r5.getContext(), r5, R.attr.f3nameremoved, R.color.f5nameremoved);
        C18320x8.A15(r5, this, 14);
        C18320x8.A15(C06560Yg.A02(A003, R.id.cancel), this, 15);
        A003.setVisibility(0);
        r5.A01(23, 1);
    }

    public C111255hn(AnonymousClass4Pc r1, C194629Tw r2) {
        this.A01 = r1;
        this.A02 = r2;
    }
}
