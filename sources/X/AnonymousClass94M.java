package X;

import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageView;

/* renamed from: X.94M  reason: invalid class name */
public class AnonymousClass94M extends LinearLayout implements AnonymousClass4GJ {
    public View A00;
    public View A01;
    public LinearLayout A02;
    public TextEmojiLabel A03;
    public WaImageView A04;
    public C620633i A05;
    public AnonymousClass1VX A06;
    public C106715a2 A07;
    public C116855qy A08;
    public boolean A09;

    public final Object generatedComponent() {
        C116855qy r0 = this.A08;
        if (r0 == null) {
            r0 = C116855qy.A00(this);
            this.A08 = r0;
        }
        return r0.generatedComponent();
    }

    public AnonymousClass94M(Context context, C620733j r12, AnonymousClass39Q r13, C194869Uu r14, int i, boolean z) {
        super(context);
        if (!this.A09) {
            this.A09 = true;
            C64333Db A002 = C88864av.A00(generatedComponent());
            this.A06 = C64333Db.A4B(A002);
            this.A07 = C1899593h.A0V(A002.A00);
            this.A05 = C64333Db.A2o(A002);
        }
        View.inflate(getContext(), R.layout.f8nameremoved, this);
        this.A01 = C06560Yg.A02(this, R.id.incentive_info_container);
        this.A00 = C06560Yg.A02(this, R.id.incentive_message_divider);
        this.A04 = AnonymousClass0x9.A0L(this, R.id.incentive_icon);
        this.A03 = AnonymousClass0x7.A0K(this, R.id.incentive_info_text);
        this.A02 = C86654Ky.A0N(this, R.id.incentive_blurb_container);
        this.A01.setVisibility(0);
        if (z) {
            this.A00.setVisibility(0);
        }
        AnonymousClass39Q r4 = r14.A09.A00.A02;
        String str = r14.A0C;
        String string = context.getString(R.string.f11nameremoved);
        if (i != 0) {
            if (i != 1) {
                if (!(i == 2 || i == 3)) {
                    if (i != 4) {
                        if (!(i == 5 || i == 7)) {
                            return;
                        }
                    } else if (r14.A01 != 0) {
                        return;
                    }
                }
                Runnable[] runnableArr = {new C198579f9()};
                SpannableString A042 = this.A07.A04(this.A03.getContext(), string, runnableArr, new String[]{"fine-print"}, new String[]{str});
                AnonymousClass0x2.A12(this.A03, this.A05);
                AnonymousClass0x2.A14(this.A06, this.A03);
                this.A03.setText(A042);
                this.A02.getBackground().setLevel(1);
            } else if (r14.A00 == 0) {
                this.A03.setText(R.string.f11nameremoved);
                this.A02.getBackground().setLevel(1);
            } else {
                return;
            }
            this.A04.setVisibility(8);
        } else if (r13.A00.compareTo(r4.A00) >= 0) {
            String str2 = r14.A0E;
            AnonymousClass39L r1 = r14.A07;
            Runnable[] runnableArr2 = {new C198569f8()};
            SpannableString A043 = this.A07.A04(this.A03.getContext(), AnonymousClass0x2.A0X(context, AnonymousClass9UO.A00(context, r12, r1.A01, r1.A02).toString(), 1, R.string.f11nameremoved), runnableArr2, new String[]{"cashback-terms"}, new String[]{str2});
            AnonymousClass0x2.A12(this.A03, this.A05);
            AnonymousClass0x2.A14(this.A06, this.A03);
            this.A03.setText(A043);
            this.A02.getBackground().setLevel(0);
            this.A04.setVisibility(0);
        } else {
            AnonymousClass39L r2 = r14.A07;
            C85204Fi r15 = r2.A01;
            String obj = AnonymousClass9UO.A00(context, r12, r15, r4).toString();
            String obj2 = AnonymousClass9UO.A00(context, r12, r15, r2.A02).toString();
            Object[] A0M = AnonymousClass002.A0M();
            AnonymousClass000.A16(obj2, obj, A0M);
            this.A03.setText(context.getString(R.string.f11nameremoved, A0M));
            this.A02.getBackground().setLevel(0);
            this.A04.setVisibility(0);
        }
    }
}
