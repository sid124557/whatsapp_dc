package X;

import android.graphics.BitmapFactory;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import java.util.List;

/* renamed from: X.95U  reason: invalid class name */
public abstract class AnonymousClass95U extends C05570Ua {
    public void A07(AnonymousClass9NZ r9, int i) {
        View.OnClickListener onClickListener;
        View view;
        Button button;
        if (this instanceof AnonymousClass9EZ) {
            ((AnonymousClass9EZ) this).A00.setText(((AnonymousClass9FI) r9).A00);
        } else if (this instanceof C191239Ed) {
            throw AnonymousClass001.A0g("title");
        } else {
            if (this instanceof C191259Ef) {
                C191259Ef r4 = (C191259Ef) this;
                AnonymousClass9FZ r92 = (AnonymousClass9FZ) r9;
                C107335b8.A0C(r4.A0H.getContext(), r4.A01, r92.A00, r92.A01);
                r4.A02.setText(r92.A04);
                Button button2 = r4.A00;
                button2.setText(r92.A03);
                onClickListener = r92.A02;
                button = button2;
            } else if (this instanceof C191249Ee) {
                C191249Ee r2 = (C191249Ee) this;
                AnonymousClass9FT r93 = (AnonymousClass9FT) r9;
                r2.A01.setText(r93.A00);
                r2.A02.setText(r93.A01);
                r2.A00.setVisibility(0);
                return;
            } else if (this instanceof C191229Ec) {
                C191229Ec r3 = (C191229Ec) this;
                r3.A01.setText(((AnonymousClass9FK) r9).A00);
                C1899593h.A0i(r3.A0H.getContext(), r3.A00, R.color.f5nameremoved);
                return;
            } else if (this instanceof C191269Eg) {
                C191269Eg r7 = (C191269Eg) this;
                C191499Fd r94 = (C191499Fd) r9;
                byte[] bArr = r94.A09;
                if (bArr != null) {
                    r7.A01.setImageBitmap(BitmapFactory.decodeByteArray(bArr, 0, bArr.length));
                }
                r7.A04.setText((CharSequence) C1899593h.A0X(r94.A03));
                String str = r94.A04;
                if (str != null) {
                    r7.A03.setText(str);
                }
                TextView textView = r7.A03;
                int i2 = 0;
                if (r94.A04 == null) {
                    i2 = 8;
                }
                textView.setVisibility(i2);
                if (r94.A08) {
                    LinearLayout linearLayout = r7.A02;
                    linearLayout.setVisibility(0);
                    ImageView A0E = AnonymousClass0x9.A0E(linearLayout, R.id.warning_icon);
                    TextView A0G = C18300x5.A0G(linearLayout, R.id.warning_message);
                    C107335b8.A0C(r7.A0H.getContext(), A0E, r94.A00, r94.A01);
                    A0G.setText(r94.A06);
                    if (r94.A07) {
                        Button button3 = r7.A00;
                        button3.setVisibility(0);
                        button3.setText(r94.A05);
                        onClickListener = r94.A02;
                        button = button3;
                    } else {
                        view = r7.A00;
                    }
                } else {
                    view = r7.A02;
                }
                view.setVisibility(8);
                return;
            } else if (this instanceof AnonymousClass9EY) {
                return;
            } else {
                if (this instanceof C191219Eb) {
                    C191219Eb r32 = (C191219Eb) this;
                    AnonymousClass9FA r95 = (AnonymousClass9FA) r9;
                    r32.A01.setText(r95.A02);
                    r32.A00.A0K((List) null, Html.fromHtml(r95.A01));
                    View view2 = r32.A0H;
                    onClickListener = r95.A00;
                    button = view2;
                } else if (this instanceof AnonymousClass9EX) {
                    View view3 = this.A0H;
                    onClickListener = ((AnonymousClass9F7) r9).A00;
                    button = view3;
                } else {
                    C191209Ea r5 = (C191209Ea) this;
                    AnonymousClass9FX r96 = (AnonymousClass9FX) r9;
                    ImageView imageView = r5.A00;
                    View view4 = r5.A0H;
                    C107335b8.A0C(view4.getContext(), imageView, r96.A00, r96.A01);
                    r5.A01.setText(r96.A02);
                    view4.setOnClickListener(r96.A03);
                    return;
                }
            }
            button.setOnClickListener(onClickListener);
        }
    }

    public AnonymousClass95U(View view) {
        super(view);
    }
}
