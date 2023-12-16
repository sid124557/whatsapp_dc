package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;

/* renamed from: X.6J4  reason: invalid class name */
public class AnonymousClass6J4 extends C05570Ua {
    public boolean A00 = true;
    public final View A01;
    public final View A02;
    public final View A03;
    public final View A04;
    public final View A05;
    public final ViewGroup A06;
    public final ViewGroup A07;
    public final C620733j A08;

    public void A07() {
        if (!this.A00) {
            this.A01.setBackgroundResource(0);
            AnonymousClass0XC.A02((ViewGroup) this.A0H, new AnonymousClass0A9());
            this.A05.setVisibility(8);
            this.A02.setVisibility(8);
            this.A04.setVisibility(8);
            this.A03.setSelected(false);
            this.A00 = true;
        }
    }

    public AnonymousClass6J4(Context context, ViewGroup viewGroup, C620733j r5) {
        super(AnonymousClass001.A0R(LayoutInflater.from(context), viewGroup, R.layout.f8nameremoved));
        this.A08 = r5;
        View view = this.A0H;
        this.A01 = view.findViewById(R.id.reactions_bg);
        this.A02 = view.findViewById(R.id.reaction_lol);
        this.A04 = view.findViewById(R.id.reaction_sad);
        this.A03 = view.findViewById(R.id.reaction_love);
        this.A05 = view.findViewById(R.id.reaction_wow);
        this.A07 = (ViewGroup) view.findViewById(R.id.reactions_right);
        this.A06 = (ViewGroup) view.findViewById(R.id.reactions_left);
    }
}
