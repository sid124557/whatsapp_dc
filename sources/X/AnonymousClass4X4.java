package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.whatsapp.R;
import java.util.List;
import java.util.Set;

/* renamed from: X.4X4  reason: invalid class name */
public class AnonymousClass4X4 extends AnonymousClass0R6 {
    public C186308v5 A00;
    public final Context A01;
    public final C69263Wi A02;
    public final AnonymousClass5ZS A03;
    public final AnonymousClass1VX A04;
    public final C53492nB A05;
    public final C72173dI A06;
    public final C183538qC A07;
    public final List A08;
    public final Set A09;

    public int A0G() {
        int count;
        C186308v5 r0 = this.A00;
        int i = 0;
        if (r0 == null) {
            count = 0;
        } else {
            count = r0.getCount();
        }
        if (AnonymousClass001.A1Z(this.A07.get())) {
            i = this.A08.size();
        }
        return count + i;
    }

    public /* bridge */ /* synthetic */ void A0J(C05570Ua r3) {
        C134366iu r1 = ((AnonymousClass4ZA) r3).A04;
        r1.setImageDrawable((Drawable) null);
        r1.A06 = null;
    }

    public final C186058ug A0K(int i) {
        C186308v5 r1;
        if (this.A00 == null) {
            return null;
        }
        if (AnonymousClass001.A1Z(this.A07.get())) {
            List list = this.A08;
            if (i < list.size()) {
                return (C186058ug) list.get(i);
            }
            r1 = this.A00;
            i -= list.size();
        } else {
            r1 = this.A00;
        }
        return r1.B9S(i);
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r7, int i) {
        boolean z;
        int i2;
        AnonymousClass4ZA r72 = (AnonymousClass4ZA) r7;
        C186058ug A0K = A0K(i);
        C18260x0.A1P(AnonymousClass001.A0o(), "RecentMediaAdapter/onBindViewHolder: ", A0K);
        C134366iu r4 = r72.A04;
        r4.setMediaItem(A0K);
        r4.A06 = null;
        r4.setId(R.id.thumb);
        C53492nB r3 = r72.A03;
        r3.A01((C84584Cx) r4.getTag());
        if (A0K != null) {
            C86644Kx.A1A(r4);
            AnonymousClass0YZ.A0F(r4, A0K.B3d().toString());
            C1234068h r1 = new C1234068h(A0K, 0, r72);
            r4.setTag(r1);
            r3.A02(r1, new C1234368k(A0K, r72, r1, 0));
            z = r72.A05.contains(r4.getUri());
        } else {
            C86664Kz.A1R(r4);
            AnonymousClass0YZ.A0F(r4, (String) null);
            r4.setBackgroundColor(r72.A00);
            r4.setImageDrawable((Drawable) null);
            z = false;
        }
        r4.setChecked(z);
        if (A0K == null && this.A00 != null) {
            if (AnonymousClass001.A1Z(this.A07.get())) {
                i2 = this.A08.size();
            } else {
                i2 = 0;
            }
            int i3 = i - i2;
            if (i3 >= 0 && this.A04.A0X(5882)) {
                this.A06.execute(new C117705sM((Object) this, i3, 19));
            }
        }
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        C134356it r4 = new C134356it(this.A01, this);
        r4.setSelector((Drawable) null);
        Set set = this.A09;
        return new AnonymousClass4ZA(this.A03, this.A05, r4, set);
    }

    public AnonymousClass4X4(Context context, C69263Wi r3, AnonymousClass5ZS r4, AnonymousClass1VX r5, C53492nB r6, AnonymousClass4FS r7, C183538qC r8, List list, Set set) {
        this.A04 = r5;
        this.A02 = r3;
        this.A01 = context;
        this.A09 = set;
        this.A08 = list;
        this.A05 = r6;
        this.A07 = r8;
        this.A03 = r4;
        this.A06 = C72173dI.A00(r7);
        A0E(true);
    }

    public long A0B(int i) {
        C186058ug A0K = A0K(i);
        if (A0K == null) {
            return 0;
        }
        return (long) AnonymousClass31W.A02(A0K).hashCode();
    }
}
