package X;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.conversationslist.ConversationsFragment;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: X.4qR  reason: invalid class name and case insensitive filesystem */
public class C94234qR extends C105295Ui {
    public ViewGroup A00;
    public HorizontalScrollView A01;
    public ImageButton A02;
    public ImageView A03;
    public LinearLayout A04;
    public RelativeLayout A05;
    public TextView A06;
    public TextView A07;
    public AnonymousClass5UY A08;
    public AnonymousClass5UY A09;
    public Map A0A = AnonymousClass001.A0t();
    public final AnonymousClass5ZU A0B;
    public final C105365Uq A0C;
    public final C620733j A0D;

    public C94234qR(C56962sq r9, C64773Ex r10, AnonymousClass5ZU r11, C56332ro r12, C105365Uq r13, ConversationsFragment conversationsFragment, C620733j r15, AnonymousClass4FV r16, AnonymousClass4FS r17) {
        super(r9, r10, r12, conversationsFragment, r16, r17);
        this.A0B = r11;
        this.A0D = r15;
        this.A0C = r13;
    }

    public static void A00(Configuration configuration, View view, boolean z) {
        int dimensionPixelSize;
        if (view != null) {
            View findViewById = view.findViewById(R.id.empty_illustration);
            int i = configuration.orientation;
            Resources resources = view.getResources();
            int i2 = R.dimen.f6nameremoved;
            if (i == 2) {
                i2 = R.dimen.f6nameremoved;
            }
            int dimensionPixelSize2 = resources.getDimensionPixelSize(i2);
            if (findViewById != null && findViewById.getVisibility() == 0) {
                C86624Kv.A0w(findViewById, dimensionPixelSize2);
                findViewById.getLayoutParams().width = dimensionPixelSize2;
            }
            ViewGroup.MarginLayoutParams A0T = AnonymousClass001.A0T(view);
            if (A0T != null) {
                if (z) {
                    dimensionPixelSize = 0;
                } else {
                    dimensionPixelSize = view.getResources().getDimensionPixelSize(R.dimen.f6nameremoved);
                }
                A0T.topMargin = dimensionPixelSize;
            }
        }
    }

    public AnonymousClass4s5 A03(AnonymousClass3ZH r3, Long l, int i) {
        AnonymousClass4s5 r1 = new AnonymousClass4s5();
        r1.A04 = Integer.valueOf(i);
        if (l != null) {
            r1.A05 = l;
        }
        return r1;
    }

    public void A04(ViewGroup viewGroup, C003203q r12, ArrayList arrayList, int i) {
        if (this.A04 != null && arrayList.size() > 1) {
            A02(false);
            this.A04.removeAllViews();
            boolean z = this instanceof C94104pu;
            if (z) {
                this.A0A.clear();
            }
            LayoutInflater from = LayoutInflater.from(r12);
            if (from != null) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    AnonymousClass3ZH r5 = (AnonymousClass3ZH) arrayList.get(i2);
                    View inflate = from.inflate(R.layout.f8nameremoved, viewGroup, false);
                    if (i2 > 0) {
                        LinearLayout.LayoutParams A0C2 = C86624Kv.A0C();
                        A0C2.setMarginStart(viewGroup.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                        inflate.setLayoutParams(A0C2);
                    }
                    ImageView A0F = AnonymousClass0x9.A0F(inflate, R.id.contact_photo);
                    A0F.setImportantForAccessibility(2);
                    if (z && r5.A0H != null && !C107575bX.A0F(r5.A0H.user)) {
                        this.A0A.put(r5.A0H.user, A0F);
                    }
                    this.A0C.A08(A0F, r5);
                    String escapeHtml = Html.escapeHtml(C18300x5.A0h(this.A0B, r5));
                    if (escapeHtml != null) {
                        C18280x3.A1E(escapeHtml, AnonymousClass002.A09(inflate, R.id.contact_name));
                    }
                    this.A04.addView(inflate);
                    inflate.setOnClickListener(new AnonymousClass540(this, r5, (long) i2));
                }
                if (i > 15) {
                    View inflate2 = from.inflate(R.layout.f8nameremoved, viewGroup, false);
                    LinearLayout.LayoutParams A0C3 = C86624Kv.A0C();
                    A0C3.setMarginStart(viewGroup.getResources().getDimensionPixelSize(R.dimen.f6nameremoved));
                    inflate2.setLayoutParams(A0C3);
                    this.A04.addView(inflate2);
                    C18310x6.A18(inflate2, this, 7);
                    ImageButton imageButton = (ImageButton) inflate2.findViewById(R.id.view_more_arrow);
                    this.A02 = imageButton;
                    imageButton.setImportantForAccessibility(2);
                    if (this.A02 != null && C102805Ki.A00(this.A0D)) {
                        this.A02.setRotationY(180.0f);
                    }
                }
            }
        }
    }

    public void A05(C003203q r6, ArrayList arrayList, int i) {
        Resources resources = r6.getResources();
        int i2 = 1;
        Object[] objArr = new Object[1];
        boolean A1Y = C18300x5.A1Y(objArr, i);
        String quantityString = resources.getQuantityString(R.plurals.f9nameremoved, i, objArr);
        TextView textView = this.A06;
        if (textView != null) {
            textView.setText(quantityString);
        }
        TextView textView2 = this.A07;
        if (textView2 != null) {
            textView2.setVisibility(A1Y ? 1 : 0);
        }
        ImageView imageView = this.A03;
        HorizontalScrollView horizontalScrollView = this.A01;
        if (arrayList.size() > 1) {
            i2 = 0;
        }
        int i3 = 0;
        if (imageView != null) {
            imageView.setVisibility(AnonymousClass001.A08(i2));
        }
        if (horizontalScrollView != null) {
            if (i2 != 0) {
                i3 = 8;
            }
            horizontalScrollView.setVisibility(i3);
        }
    }
}
