package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import java.util.List;

/* renamed from: X.4Wk  reason: invalid class name and case insensitive filesystem */
public class C87864Wk extends AnonymousClass0R6 {
    public int A00 = -1;
    public AnonymousClass7HX A01;
    public final List A02 = AnonymousClass001.A0s();

    public int A0G() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void BNf(C05570Ua r9, int i) {
        View view;
        AnonymousClass6ID r92 = (AnonymousClass6ID) r9;
        C156427gb r1 = (C156427gb) this.A02.get(i);
        if (getItemViewType(i) == 0) {
            C133606he r93 = (C133606he) r92;
            String str = r1.A02;
            boolean isEmpty = TextUtils.isEmpty(str);
            View view2 = r93.A0H;
            if (isEmpty) {
                view2.setVisibility(8);
                return;
            }
            view2.setVisibility(0);
            r93.A00.A0K((List) null, str);
            return;
        }
        C108785dY r7 = r1.A00;
        C94094pt r94 = (C94094pt) r92;
        String str2 = r1.A01;
        if (r7 == null) {
            view = r94.A0H;
        } else {
            r94.A00.setChecked(AnonymousClass000.A1U(r94.A01(), r94.A05.A00));
            r94.A0H.setVisibility(0);
            String str3 = r7.A01;
            boolean isEmpty2 = TextUtils.isEmpty(str3);
            TextEmojiLabel textEmojiLabel = r94.A02;
            if (isEmpty2) {
                textEmojiLabel.setVisibility(8);
            } else {
                textEmojiLabel.A0K((List) null, str3);
                textEmojiLabel.setVisibility(0);
            }
            r94.A04.A0K((List) null, r7.A03);
            String str4 = r7.A00;
            boolean isEmpty3 = TextUtils.isEmpty(str4);
            TextEmojiLabel textEmojiLabel2 = r94.A01;
            if (isEmpty3) {
                textEmojiLabel2.setVisibility(8);
            } else {
                textEmojiLabel2.A0K((List) null, str4);
                textEmojiLabel2.setVisibility(0);
            }
            boolean isEmpty4 = TextUtils.isEmpty(str2);
            TextEmojiLabel textEmojiLabel3 = r94.A03;
            view = textEmojiLabel3;
            if (!isEmpty4) {
                textEmojiLabel3.A0K((List) null, str2);
                textEmojiLabel3.setVisibility(0);
                return;
            }
        }
        view.setVisibility(8);
    }

    public int getItemViewType(int i) {
        return C18320x8.A1U(((C156427gb) this.A02.get(i)).A02) ^ true ? 1 : 0;
    }

    public /* bridge */ /* synthetic */ C05570Ua BQR(ViewGroup viewGroup, int i) {
        LayoutInflater A0D = C18280x3.A0D(viewGroup);
        if (i == 0) {
            return new C133606he(A0D.inflate(R.layout.f8nameremoved, viewGroup, false), this);
        }
        return new C94094pt(A0D.inflate(R.layout.f8nameremoved, viewGroup, false), this);
    }
}
