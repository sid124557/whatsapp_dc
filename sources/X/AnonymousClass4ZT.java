package X;

import android.content.Context;
import android.net.Uri;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.greenalert.GreenAlertActivity;
import java.util.TreeMap;

/* renamed from: X.4ZT  reason: invalid class name */
public class AnonymousClass4ZT extends AnonymousClass0R4 {
    public final C15870s6 A00;
    public final C111095hX A01;
    public final C69263Wi A02;
    public final AnonymousClass5X8 A03;
    public final C620633i A04;
    public final C57162tC A05;
    public final C620733j A06;
    public final AnonymousClass1VX A07;
    public final C66433Lk A08;
    public final C106675Zy A09;

    public Object A0D(ViewGroup viewGroup, int i) {
        NestedScrollView nestedScrollView;
        int i2;
        if (i == 0) {
            nestedScrollView = (NestedScrollView) C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            TextView A0G = C18300x5.A0G(nestedScrollView, R.id.green_alert_education_title);
            C06560Yg.A0T(A0G, true);
            A0G.setText(R.string.f11nameremoved);
            C18300x5.A0G(nestedScrollView, R.id.green_alert_education_intro).setText(R.string.f11nameremoved);
            View A022 = C06560Yg.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_1);
            AnonymousClass0x9.A0E(A022, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_1);
            C18300x5.A0G(A022, R.id.green_alert_education_image_caption).setText(Html.fromHtml(C86624Kv.A0b(A022, R.string.f11nameremoved)));
            View A023 = C06560Yg.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_2);
            AnonymousClass0x9.A0E(A023, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_2);
            C18300x5.A0G(A023, R.id.green_alert_education_image_caption).setText(Html.fromHtml(C86624Kv.A0b(A023, R.string.f11nameremoved)));
            View A024 = C06560Yg.A02(nestedScrollView, R.id.green_alert_education_image_and_caption_3);
            String A0I = A0I(C155607fB.A00);
            AnonymousClass0x9.A0E(A024, R.id.green_alert_education_image).setImageResource(R.drawable.ga_edu_3);
            A0L(AnonymousClass0x7.A0K(A024, R.id.green_alert_education_image_caption), AnonymousClass002.A0F(A024.getContext(), "0", new Object[1], 0, R.string.f11nameremoved), A0I);
        } else if (i == 1) {
            nestedScrollView = (NestedScrollView) C18280x3.A0D(viewGroup).inflate(R.layout.f8nameremoved, viewGroup, false);
            TextView A0G2 = C18300x5.A0G(nestedScrollView, R.id.green_alert_tos_title);
            C06560Yg.A0T(A0G2, true);
            A0G2.setText(A0G(nestedScrollView.getContext(), GreenAlertActivity.A0O));
            C18300x5.A0G(nestedScrollView, R.id.green_alert_tos_intro).setText(Html.fromHtml(A0G(nestedScrollView.getContext(), GreenAlertActivity.A0I)));
            A0L(AnonymousClass0x7.A0K(nestedScrollView, R.id.green_alert_tos_bullets_header), A0H(nestedScrollView.getContext(), GreenAlertActivity.A0J, "0"), A0I(C155607fB.A00));
            A0K(C06560Yg.A02(nestedScrollView, R.id.green_alert_tos_bullet_1), A0G(nestedScrollView.getContext(), GreenAlertActivity.A0K), new String[0], R.drawable.ga_tos_1);
            A0K(C06560Yg.A02(nestedScrollView, R.id.green_alert_tos_bullet_2), A0G(nestedScrollView.getContext(), GreenAlertActivity.A0L), new String[0], R.drawable.ga_tos_2);
            if (C155607fB.A00(this.A09)) {
                C86604Kt.A1B(nestedScrollView, R.id.green_alert_tos_bullet_3);
            } else {
                C86604Kt.A1E(nestedScrollView, R.id.green_alert_tos_bullet_3, 0);
                A0K(C06560Yg.A02(nestedScrollView, R.id.green_alert_tos_bullet_3), A0H(nestedScrollView.getContext(), GreenAlertActivity.A0M, "0"), new String[]{A0I(C155607fB.A02)}, R.drawable.ga_tos_3);
            }
            A0L(AnonymousClass0x7.A0K(nestedScrollView, R.id.green_alert_tos_footer), A0H(nestedScrollView.getContext(), GreenAlertActivity.A0N, "0", "1", "2"), A0J(C155607fB.A03), A0J(C155607fB.A01), A0I(C155607fB.A04));
        } else {
            throw AnonymousClass000.A0G("Unknown page: ", AnonymousClass001.A0o(), i);
        }
        Context context = nestedScrollView.getContext();
        if (context != null) {
            String string = context.getString(R.string.f11nameremoved);
            String string2 = context.getString(R.string.f11nameremoved);
            if (i == 0) {
                View findViewById = nestedScrollView.findViewById(R.id.start_list_green_alert_education_view);
                if (findViewById != null) {
                    findViewById.setContentDescription(string);
                }
                i2 = R.id.end_list_green_alert_education_view;
            } else {
                View findViewById2 = nestedScrollView.findViewById(R.id.start_list_green_alert_tos_view);
                if (findViewById2 != null) {
                    findViewById2.setContentDescription(string);
                }
                i2 = R.id.end_list_green_alert_tos_view;
            }
            View findViewById3 = nestedScrollView.findViewById(i2);
            if (findViewById3 != null) {
                findViewById3.setContentDescription(string2);
            }
        }
        nestedScrollView.A0E = this.A00;
        nestedScrollView.setTag(Integer.valueOf(i));
        viewGroup.addView(nestedScrollView);
        return nestedScrollView;
    }

    public final void A0L(TextEmojiLabel textEmojiLabel, String str, String... strArr) {
        int length = strArr.length;
        Object[] objArr = new Object[length];
        TreeMap treeMap = new TreeMap();
        for (int i = 0; i < length; i++) {
            String valueOf = String.valueOf(i);
            objArr[i] = valueOf;
            treeMap.put(valueOf, Uri.parse(strArr[i]));
        }
        Context context = textEmojiLabel.getContext();
        AnonymousClass1VX r9 = this.A07;
        C69263Wi r6 = this.A02;
        C107635bd.A0G(context, this.A01, r6, textEmojiLabel, this.A04, r9, String.format(C620733j.A02(this.A06), str, objArr), treeMap);
    }

    public int A0C() {
        return 2;
    }

    public void A0E(ViewGroup viewGroup, Object obj, int i) {
        viewGroup.removeView((View) obj);
    }

    public final String A0G(Context context, int[] iArr) {
        char c;
        C106675Zy r1 = this.A09;
        if (C155607fB.A00(r1) || (r1.A05("BR") && iArr == GreenAlertActivity.A0N)) {
            c = 1;
        } else {
            c = 0;
        }
        return context.getString(iArr[c]);
    }

    public final String A0H(Context context, int[] iArr, Object... objArr) {
        char c;
        C106675Zy r1 = this.A09;
        if (C155607fB.A00(r1) || (r1.A05("BR") && iArr == GreenAlertActivity.A0N)) {
            c = 1;
        } else {
            c = 0;
        }
        return context.getString(iArr[c], objArr);
    }

    public final String A0I(String[] strArr) {
        char A1S;
        C66433Lk r2 = this.A08;
        C106675Zy r1 = this.A09;
        if (C155607fB.A00(r1)) {
            A1S = 2;
        } else {
            A1S = AnonymousClass000.A1S(r1.A05("BR") ? 1 : 0);
        }
        return r2.A04("security-and-privacy", strArr[A1S]).toString();
    }

    public final String A0J(String[] strArr) {
        char A1S;
        AnonymousClass5X8 r2 = this.A03;
        C106675Zy r1 = this.A09;
        if (C155607fB.A00(r1)) {
            A1S = 2;
        } else {
            A1S = AnonymousClass000.A1S(r1.A05("BR") ? 1 : 0);
        }
        return r2.A00(strArr[A1S]).toString();
    }

    public AnonymousClass4ZT(C15870s6 r1, C111095hX r2, C69263Wi r3, AnonymousClass5X8 r4, C620633i r5, C57162tC r6, C620733j r7, AnonymousClass1VX r8, C66433Lk r9, C106675Zy r10) {
        this.A07 = r8;
        this.A02 = r3;
        this.A09 = r10;
        this.A01 = r2;
        this.A03 = r4;
        this.A08 = r9;
        this.A04 = r5;
        this.A06 = r7;
        this.A05 = r6;
        this.A00 = r1;
    }

    public boolean A0F(View view, Object obj) {
        return AnonymousClass000.A1Y(view, obj);
    }

    public final void A0K(View view, String str, String[] strArr, int i) {
        AnonymousClass0x9.A0E(view, R.id.green_alert_tos_bullet_image).setImageResource(i);
        A0L(AnonymousClass0x7.A0K(view, R.id.green_alert_tos_bullet_text), str, strArr);
    }
}
