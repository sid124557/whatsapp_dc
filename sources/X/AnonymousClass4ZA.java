package X;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.whatsapp.R;
import java.util.Set;

/* renamed from: X.4ZA  reason: invalid class name */
public class AnonymousClass4ZA extends C05570Ua implements View.OnClickListener, View.OnLongClickListener {
    public final int A00;
    public final ColorDrawable A01;
    public final AnonymousClass5ZS A02;
    public final C53492nB A03;
    public final C134366iu A04;
    public final Set A05;

    public void onClick(View view) {
        AnonymousClass4X4 r0;
        AnonymousClass5ZS r2 = this.A02;
        C134366iu r3 = this.A04;
        AnonymousClass5UD r02 = r2.A0F;
        if (r02 != null && (r0 = r02.A04) != null && r0.A00 != null && !r2.A0Q() && r2.A0F.A0B.A0O == 4) {
            if (!(!r2.A0i.A0A.isEmpty())) {
                r2.A0K(r3.A0A, r3, false);
            } else {
                r2.A0J(r3.A0A);
            }
            AnonymousClass5U6 r22 = r2.A0l;
            C94824ry r1 = r22.A01;
            if (r1 != null) {
                r1.A02 = C18290x4.A0b();
                r22.A01();
                r22.A00();
            }
        }
    }

    public boolean onLongClick(View view) {
        AnonymousClass4X4 r0;
        AnonymousClass5ZS r3 = this.A02;
        C134366iu r2 = this.A04;
        AnonymousClass5UD r02 = r3.A0F;
        if (r02 == null || (r0 = r02.A04) == null || r0.A00 == null || r3.A0Q() || r3.A0F.A0B.A0O != 4) {
            return true;
        }
        r3.A0J(r2.A0A);
        return true;
    }

    public AnonymousClass4ZA(AnonymousClass5ZS r3, C53492nB r4, C134366iu r5, Set set) {
        super(r5);
        this.A04 = r5;
        this.A05 = set;
        this.A03 = r4;
        r5.setOnClickListener(this);
        r5.setOnLongClickListener(this);
        this.A02 = r3;
        int A042 = AnonymousClass0Y8.A04(r5.getContext(), R.color.f5nameremoved);
        this.A00 = A042;
        this.A01 = new ColorDrawable(A042);
    }
}
