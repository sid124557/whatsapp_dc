package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4Wb  reason: invalid class name and case insensitive filesystem */
public class C87774Wb extends AnonymousClass0R6 {
    public int A00;
    public AnonymousClass64J A01;
    public List A02;
    public boolean A03 = false;
    public final Context A04;
    public final LayoutInflater A05;
    public final AnonymousClass5MG A06;
    public final AnonymousClass5ZU A07;
    public final C105365Uq A08;
    public final C620733j A09;

    public int A0G() {
        List list = this.A02;
        if (list == null) {
            return 0;
        }
        int size = list.size();
        int i = this.A00;
        if (size <= i || this.A03) {
            return size;
        }
        return i + 1;
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r10, int i) {
        int i2;
        C88294Ye r102 = (C88294Ye) r10;
        if (this.A03 || i != (i2 = this.A00)) {
            List list = this.A02;
            if (list != null) {
                C148177Hh r6 = (C148177Hh) list.get(i);
                AnonymousClass3ZH r5 = r6.A00;
                AnonymousClass5YB r3 = r102.A05;
                r3.A08(r5);
                AnonymousClass5YB.A03(r3, C18300x5.A03(this.A04, R.attr.f3nameremoved, R.color.f5nameremoved));
                ImageView imageView = r102.A01;
                StringBuilder A0o = AnonymousClass001.A0o();
                A0o.append(this.A06.A03(R.string.f11nameremoved));
                AnonymousClass0YZ.A0F(imageView, AnonymousClass000.A0X(C627336j.A07(r5.A0H), A0o));
                C105365Uq r32 = this.A08;
                r32.A08(imageView, r5);
                AnonymousClass5ZU r1 = this.A07;
                if (r1.A0e(r5, -1) && r5.A0b != null) {
                    TextEmojiLabel textEmojiLabel = r102.A03;
                    textEmojiLabel.setVisibility(0);
                    textEmojiLabel.A0K((List) null, AnonymousClass5ZU.A03(r1, r5));
                }
                if (r5.A0X != null) {
                    TextEmojiLabel textEmojiLabel2 = r102.A04;
                    textEmojiLabel2.setVisibility(0);
                    textEmojiLabel2.A0K((List) null, r5.A0X);
                } else {
                    r102.A04.setVisibility(8);
                }
                C109725f5.A00(r102.A0H, this, r5, r6, 46);
                r32.A08(imageView, r5);
                return;
            }
            return;
        }
        int A082 = C86614Ku.A08(this.A02) - i2;
        AnonymousClass5YB r2 = r102.A05;
        String A0p = C86604Kt.A0p(this.A09, A082, R.plurals.f9nameremoved);
        TextEmojiLabel textEmojiLabel3 = r2.A02;
        textEmojiLabel3.setText(A0p);
        AnonymousClass0x2.A0q(this.A04, textEmojiLabel3, R.color.f5nameremoved);
        r102.A04.setVisibility(8);
        r102.A01.setImageResource(R.drawable.ic_more_participants);
        C18290x4.A1F(r102.A0H, this, 0);
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        return new C88294Ye(AnonymousClass001.A0R(this.A05, viewGroup, R.layout.f8nameremoved), this.A01);
    }

    public C87774Wb(Context context, AnonymousClass64J r3, AnonymousClass5MG r4, AnonymousClass5ZU r5, C105365Uq r6, C620733j r7, int i) {
        this.A04 = context;
        this.A05 = LayoutInflater.from(context);
        this.A07 = r5;
        this.A09 = r7;
        this.A06 = r4;
        this.A08 = r6;
        this.A01 = r3;
        this.A00 = i;
    }
}
