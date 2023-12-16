package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;
import java.util.List;

/* renamed from: X.4OQ  reason: invalid class name */
public class AnonymousClass4OQ extends ArrayAdapter {
    public final /* synthetic */ C89634eX A00;

    public final AnonymousClass0PJ A00(View view, ViewGroup viewGroup, C91984lu r6) {
        AnonymousClass5QN r0;
        if (view == null) {
            C89634eX r2 = this.A00;
            view = AnonymousClass001.A0R(r2.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
            r0 = new AnonymousClass5QN(view, r2.A07);
            view.setTag(r0);
        } else {
            r0 = (AnonymousClass5QN) view.getTag();
        }
        this.A00.A7N(r0, r6.A00);
        return AnonymousClass0x9.A0G(view, r0);
    }

    public int getViewTypeCount() {
        return 4;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass4OQ(Context context, C89634eX r3, List list) {
        super(context, R.layout.f8nameremoved, list);
        this.A00 = r3;
    }

    public int getItemViewType(int i) {
        Object item = getItem(i);
        C626936e.A06(item);
        C103085Lm r1 = (C103085Lm) item;
        if (r1 instanceof C91974lt) {
            return 0;
        }
        if (r1 instanceof C91944lq) {
            return 1;
        }
        if (r1 instanceof C91954lr) {
            return 2;
        }
        return 3;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        AnonymousClass5HW r0;
        String lowerCase;
        C102595Jl r02;
        AnonymousClass0PJ A0G;
        int itemViewType = getItemViewType(i);
        C103085Lm r4 = (C103085Lm) getItem(i);
        if (itemViewType == 0) {
            if (view == null) {
                C89634eX r2 = this.A00;
                view = AnonymousClass001.A0R(r2.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
                AnonymousClass0YY.A06(view, 2);
                r0 = new AnonymousClass5HW(C86644Kx.A0O(view, R.id.title), r2);
                view.setTag(r0);
            } else {
                r0 = (AnonymousClass5HW) view.getTag();
            }
            WaTextView waTextView = r0.A00;
            C106905aM.A04(waTextView);
            waTextView.setText(((C91974lt) r4).A00);
            return view;
        } else if (itemViewType != 2) {
            if (itemViewType != 3) {
                A0G = A00(view, viewGroup, (C91984lu) r4);
            } else {
                C89634eX r5 = this.A00;
                C91964ls r42 = (C91964ls) r4;
                if (view == null) {
                    view = AnonymousClass001.A0R(r5.getLayoutInflater(), viewGroup, R.layout.f8nameremoved);
                    r02 = new C102595Jl(view, r5.A07);
                    view.setTag(r02);
                } else {
                    r02 = (C102595Jl) view.getTag();
                }
                List list = r42.A00;
                r02.A03.A0A((AnonymousClass3ZH) C18290x4.A0k(list), r5.A0T);
                TextEmojiLabel textEmojiLabel = r02.A02;
                if (!C86664Kz.A1V(textEmojiLabel)) {
                    r02.A01.setContentDescription(textEmojiLabel.getText());
                }
                C109725f5.A00(r02.A00, r5, list, r02, 28);
                if (r5.A0D.A0N(6739) == 1) {
                    WDSButton wDSButton = r02.A04;
                    wDSButton.setVariant(C142006wU.OUTLINE);
                    wDSButton.setSize(C141606vq.SMALL);
                }
                A0G = AnonymousClass0x9.A0G(view, r02);
            }
            return (View) A0G.A00;
        } else {
            AnonymousClass0PJ A002 = A00(view, viewGroup, (C91984lu) r4);
            View view2 = (View) A002.A00;
            C89634eX r7 = this.A00;
            AnonymousClass5QN r8 = (AnonymousClass5QN) A002.A01;
            C91954lr r43 = (C91954lr) r4;
            if (r43.A00) {
                AnonymousClass3ZH r22 = r43.A00;
                CharSequence A003 = AnonymousClass5ZU.A00(r7, r7.A0N, r22);
                String A02 = AnonymousClass36P.A02(r22);
                if (!TextUtils.isEmpty(A02)) {
                    if (TextUtils.isEmpty(A003)) {
                        lowerCase = "";
                    } else {
                        lowerCase = A003.toString().toLowerCase(C620733j.A02(r7.A0N));
                    }
                    TextEmojiLabel textEmojiLabel2 = r8.A02;
                    textEmojiLabel2.setVisibility(0);
                    Resources resources = r7.getResources();
                    Object[] objArr = new Object[2];
                    C18280x3.A19(lowerCase, A02, objArr);
                    textEmojiLabel2.A0K((List) null, resources.getString(R.string.f11nameremoved, objArr));
                    return view2;
                }
            }
            r8.A02.setVisibility(8);
            return view2;
        }
    }
}
