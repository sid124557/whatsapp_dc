package X;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4Ob  reason: invalid class name and case insensitive filesystem */
public class C87114Ob extends BaseAdapter {
    public int A00 = 4;
    public int A01 = 3;
    public List A02;
    public boolean A03;
    public final Activity A04;
    public final LayoutInflater A05;
    public final AnonymousClass64J A06;
    public final AnonymousClass5MG A07;
    public final AnonymousClass5ZU A08;
    public final C105365Uq A09;
    public final AnonymousClass5Y0 A0A;
    public final AnonymousClass4FS A0B;

    public C87114Ob(Activity activity, AnonymousClass64J r3, AnonymousClass5MG r4, AnonymousClass5ZU r5, C105365Uq r6, AnonymousClass5Y0 r7, AnonymousClass4FS r8) {
        this.A0A = r7;
        this.A04 = activity;
        this.A0B = r8;
        this.A08 = r5;
        this.A06 = r3;
        this.A07 = r4;
        this.A09 = r6;
        this.A05 = LayoutInflater.from(activity);
        this.A02 = AnonymousClass001.A0s();
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5J4 r0;
        AnonymousClass3ZH A0L;
        int i2;
        if (view == null) {
            view = this.A05.inflate(R.layout.f8nameremoved, viewGroup, false);
            r0 = new AnonymousClass5J4();
            r0.A03 = AnonymousClass5YB.A00(view, this.A06, R.id.name);
            r0.A02 = AnonymousClass0x7.A0K(view, R.id.aboutInfo);
            r0.A01 = AnonymousClass0x9.A0E(view, R.id.avatar);
            r0.A00 = C06560Yg.A02(view, R.id.divider);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass5J4) view.getTag();
        }
        int count = getCount() - 1;
        View view2 = r0.A00;
        if (i == count) {
            view2.setVisibility(8);
        } else {
            view2.setVisibility(0);
        }
        if (this.A03 || C86614Ku.A08(this.A02) <= this.A00 || i != (i2 = this.A01)) {
            List list = this.A02;
            if (list == null) {
                A0L = null;
            } else {
                A0L = AnonymousClass4L0.A0L(list, i);
            }
            C626936e.A06(A0L);
            AnonymousClass5YB.A03(r0.A03, C18300x5.A03(this.A04, R.attr.f3nameremoved, R.color.f5nameremoved));
            r0.A03.A08(A0L);
            ImageView imageView = r0.A01;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append(this.A07.A03(R.string.f11nameremoved));
            AnonymousClass0YZ.A0F(imageView, AnonymousClass000.A0X(AnonymousClass3ZH.A08(A0L), A0o));
            r0.A02.setVisibility(0);
            r0.A02.setTag(A0L.A0H);
            AnonymousClass5ZU r8 = this.A08;
            String A0e = C18320x8.A0e(AnonymousClass3ZH.A05(A0L, C28011fL.class), r8.A0D);
            if (A0e != null) {
                TextEmojiLabel textEmojiLabel = r0.A02;
                textEmojiLabel.setText(C107345b9.A05(textEmojiLabel.getContext(), this.A0A, A0e));
            } else {
                C86634Kw.A1I(r0.A02);
                AnonymousClass0x7.A1B(new C991154m(r0.A02, r8, this.A0A, (C27991fJ) AnonymousClass3ZH.A05(A0L, C27991fJ.class)), this.A0B);
            }
            this.A09.A08(r0.A01, A0L);
            r0.A01.setClickable(true);
            AnonymousClass547.A00(r0.A01, r0, this, A0L, 6);
            return view;
        }
        AnonymousClass5YB r7 = r0.A03;
        Activity activity = this.A04;
        r7.A02.setText(AnonymousClass0x2.A0Y(activity.getResources(), C86614Ku.A08(this.A02) - i2, 0, R.plurals.f9nameremoved));
        AnonymousClass5YB.A03(r0.A03, AnonymousClass0Y8.A04(activity, R.color.f5nameremoved));
        r0.A02.setVisibility(8);
        boolean z = C1001059l.A04;
        ImageView imageView2 = r0.A01;
        if (z) {
            C107335b8.A0C(imageView2.getContext(), imageView2, R.drawable.ic_more_participants, R.color.f5nameremoved);
        } else {
            imageView2.setImageResource(R.drawable.ic_more_participants);
        }
        r0.A01.setClickable(false);
        return view;
    }

    public int getCount() {
        int i;
        if (this.A03 || C86614Ku.A08(this.A02) <= (i = this.A00)) {
            return C86614Ku.A08(this.A02);
        }
        return i;
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        List list = this.A02;
        if (list == null) {
            return null;
        }
        return list.get(i);
    }

    public int getViewTypeCount() {
        return 1;
    }

    public long getItemId(int i) {
        return (long) i;
    }
}
