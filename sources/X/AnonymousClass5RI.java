package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.ArrayList;

/* renamed from: X.5RI  reason: invalid class name */
public final class AnonymousClass5RI {
    public View A00;
    public AnonymousClass64Q A01;
    public AnonymousClass4PV A02;
    public AnonymousClass4Qy A03;
    public C185698u6 A04;
    public C94044pl A05;
    public C94034pk A06;
    public ArrayList A07;
    public boolean A08;
    public boolean A09;
    public final ViewGroup A0A;
    public final ViewGroup A0B;
    public final ListView A0C;
    public final C009707r A0D;
    public final C116985rC A0E;
    public final AnonymousClass4FU A0F;
    public final C56972sr A0G;
    public final C56962sq A0H;
    public final C41242Jm A0I;
    public final C64773Ex A0J;
    public final C147277Dm A0K;
    public final AnonymousClass5UU A0L;
    public final C56982ss A0M;
    public final C614530v A0N;
    public final AnonymousClass1VX A0O;
    public final AnonymousClass3LP A0P;
    public final C66493Lq A0Q;
    public final C53202mi A0R;
    public final C95814uZ A0S;
    public final C56572sD A0T;
    public final C187958y5 A0U;
    public final C46192bE A0V;

    public final void A00(AnonymousClass3ZH r4, boolean z) {
        C185698u6 r1;
        C55502qS r0;
        AnonymousClass5UU r2 = this.A0L;
        r2.A00 = r4;
        r2.A01 = z;
        if (this.A04 == null) {
            if ((!this.A0O.A0X(412) || ((r0 = r4.A0E) != null && r0.A02())) && !C86624Kv.A1X(r4, this.A0P)) {
                r1 = new C94054pm(this.A0D);
            } else {
                r1 = new C94074po(this.A0D);
            }
            this.A04 = r1;
            r1.setup(r2);
            C185698u6 r22 = this.A04;
            if (r22 instanceof C94054pm) {
                this.A0C.addFooterView((View) r22);
            } else if (r22 instanceof C94074po) {
                ViewGroup viewGroup = this.A0B;
                viewGroup.setVisibility(0);
                viewGroup.addView((View) r22);
            }
        }
    }

    public void A01(boolean z, int i) {
        TextView textView;
        int i2;
        this.A00.setVisibility(AnonymousClass001.A08(z ? 1 : 0));
        if (z || i == 0) {
            AnonymousClass4Qy r0 = this.A03;
            if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
            return;
        }
        if (this.A03 == null) {
            this.A03 = new AnonymousClass4Qy(this.A0D);
            LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
            A0C2.gravity = 17;
            this.A03.setBackgroundResource(R.drawable.date_balloon);
            this.A0A.addView(this.A03, A0C2);
        }
        AnonymousClass4Qy r02 = this.A03;
        if (r02 != null) {
            r02.setVisibility(0);
            AnonymousClass4Qy r1 = this.A03;
            if (i == 1) {
                r1.A00.setVisibility(0);
                textView = r1.A01;
                i2 = R.string.f11nameremoved;
            } else if (i == 2) {
                r1.A00.setVisibility(8);
                textView = r1.A01;
                i2 = R.string.f11nameremoved;
            } else {
                return;
            }
            textView.setText(i2);
        }
    }

    public AnonymousClass5RI(ViewGroup viewGroup, ListView listView, C009707r r6, C116985rC r7, AnonymousClass4FU r8, C56972sr r9, C56962sq r10, AnonymousClass64Q r11, C41242Jm r12, C64773Ex r13, C147277Dm r14, AnonymousClass5UU r15, C56982ss r16, C614530v r17, AnonymousClass1VX r18, AnonymousClass3LP r19, C66493Lq r20, C53202mi r21, C95814uZ r22, C55832qz r23, C56572sD r24, C187958y5 r25) {
        this.A0O = r18;
        this.A0D = r6;
        this.A0G = r9;
        this.A0M = r16;
        this.A0T = r24;
        this.A0P = r19;
        this.A0J = r13;
        this.A0U = r25;
        this.A0H = r10;
        this.A0Q = r20;
        C614530v r2 = r17;
        this.A0N = r2;
        this.A0R = r21;
        this.A0E = r7;
        this.A0I = r12;
        this.A0L = r15;
        this.A0F = r8;
        this.A0K = r14;
        this.A0S = r22;
        this.A0C = listView;
        this.A0B = viewGroup;
        this.A0V = new C46192bE(r9, r13, r2, r23);
        this.A01 = r11;
        ViewGroup viewGroup2 = (ViewGroup) AnonymousClass001.A0R(r6.getLayoutInflater(), listView, R.layout.f8nameremoved);
        this.A0A = viewGroup2;
        this.A00 = viewGroup2.findViewById(R.id.progress);
        listView.addHeaderView(viewGroup2);
    }
}
