package X;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SectionIndexer;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4lp  reason: invalid class name and case insensitive filesystem */
public class C91934lp extends AnonymousClass4OS implements SectionIndexer {
    public List A00;
    public List A01;
    public List A02;
    public List A03 = AnonymousClass001.A0s();
    public List A04 = AnonymousClass001.A0s();
    public final Context A05;
    public final AnonymousClass5UX A06;
    public final C105365Uq A07;
    public final C620733j A08;

    public int getCount() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A01.get(i);
    }

    public int getPositionForSection(int i) {
        List list = this.A03;
        if (i >= list.size() || i < 0) {
            return -1;
        }
        return AnonymousClass000.A09(list, i);
    }

    public int getSectionForPosition(int i) {
        List list = this.A02;
        List list2 = this.A04;
        List list3 = this.A03;
        if (i < 0) {
            return 0;
        }
        if (i >= list.size()) {
            return AnonymousClass002.A03(list2);
        }
        int size = list3.size();
        do {
            size--;
            if (size < 0) {
                return 0;
            }
        } while (AnonymousClass000.A09(list3, size) > i);
        return size;
    }

    public Object[] getSections() {
        return this.A04.toArray(new String[1]);
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        C102605Jm r3;
        String str;
        C182128nu r6 = (C182128nu) this.A01.get(i);
        C626936e.A06(r6);
        if (r6 instanceof C171088Fs) {
            if (view == null) {
                view = LayoutInflater.from(this.A05).inflate(R.layout.f8nameremoved, viewGroup, false);
                AnonymousClass0YY.A06(view, 2);
            }
            TextView A0I = C86614Ku.A0I(view);
            C106905aM.A04(A0I);
            A0I.setText(((C171088Fs) r6).A00);
            return view;
        }
        if (view == null) {
            view = LayoutInflater.from(this.A05).inflate(R.layout.f8nameremoved, viewGroup, false);
            r3 = new C102605Jm(view);
            view.setTag(r3);
        } else {
            r3 = (C102605Jm) view.getTag();
        }
        if (r6 instanceof AnonymousClass8Fr) {
            AnonymousClass0YY.A06(view, 2);
            r3.A01.setVisibility(4);
            r3.A02.setText(((AnonymousClass8Fr) r6).A00);
            r3.A03.setVisibility(8);
            return view;
        }
        C112795kJ r62 = (C112795kJ) r6;
        ImageView imageView = r3.A01;
        imageView.setVisibility(0);
        this.A06.A06(imageView, R.drawable.avatar_contact);
        AnonymousClass3ZH contact = r62.getContact();
        this.A07.A08(imageView, contact);
        r3.A02.A0K(this.A00, r62.A00);
        TextEmojiLabel textEmojiLabel = r3.A03;
        textEmojiLabel.setVisibility(0);
        List list = r62.A01;
        if (list.size() > 1) {
            String[] strArr = new String[list.size()];
            for (int i2 = 0; i2 < list.size(); i2++) {
                strArr[i2] = AnonymousClass36P.A02(AnonymousClass4L0.A0L(list, i2));
            }
            str = TextUtils.join(", ", strArr);
        } else {
            str = AnonymousClass36P.A02(contact);
        }
        textEmojiLabel.setText(str);
        return view;
    }

    public C91934lp(Context context, AnonymousClass5UX r3, C105365Uq r4, C620733j r5, List list) {
        this.A01 = list;
        this.A05 = context;
        this.A06 = r3;
        this.A07 = r4;
        this.A02 = list;
        this.A08 = r5;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        Pair A002 = C100265Af.A00(this.A08, this.A02);
        this.A04 = (List) A002.first;
        this.A03 = (List) A002.second;
    }
}
