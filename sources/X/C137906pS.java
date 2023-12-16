package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.whatsapp.CircularProgressBar;
import com.whatsapp.R;
import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.6pS  reason: invalid class name and case insensitive filesystem */
public class C137906pS extends AnonymousClass8J3 {
    public int A00;
    public View A01;
    public TextView A02;
    public CircularProgressBar A03;
    public C50612iT A04;
    public final AnonymousClass33O A05;
    public final C56932sn A06;
    public final AnonymousClass4BP A07;
    public final StickerPackDownloader A08;

    public C137906pS(Context context, LayoutInflater layoutInflater, AnonymousClass1VX r9, AnonymousClass33O r10, C50612iT r11, C56932sn r12, AnonymousClass4BP r13, StickerPackDownloader stickerPackDownloader, int i, int i2) {
        super(context, layoutInflater, r9, i, i2);
        this.A06 = r12;
        this.A08 = stickerPackDownloader;
        this.A05 = r10;
        this.A04 = r11;
        this.A07 = r13;
    }

    public void A05() {
        View view;
        if (this instanceof C137866pO) {
            C137866pO r4 = (C137866pO) this;
            CircularProgressBar circularProgressBar = r4.A03;
            if (!(circularProgressBar == null || r4.A02 == null)) {
                if (r4.A02) {
                    circularProgressBar.setVisibility(0);
                    r4.A02.setVisibility(0);
                    boolean isEmpty = TextUtils.isEmpty(r4.A04.A0I);
                    TextView textView = r4.A02;
                    if (isEmpty) {
                        textView.setText(R.string.f11nameremoved);
                    } else {
                        textView.setText(AnonymousClass002.A0F(r4.A0B, r4.A04.A0I, AnonymousClass002.A0L(), 0, R.string.f11nameremoved));
                    }
                } else {
                    circularProgressBar.setVisibility(8);
                    r4.A02.setVisibility(8);
                }
            }
            if (r4.A00 == null) {
                return;
            }
            if (r4.A04.A05.size() != 0 || r4.A02) {
                r4.A00.setVisibility(8);
                return;
            }
            r4.A00.setVisibility(0);
            r4.A01.setOnClickListener(new C109675f0((Object) r4, 9));
            return;
        }
        CircularProgressBar circularProgressBar2 = this.A03;
        if (circularProgressBar2 != null && this.A02 != null && (view = this.A01) != null) {
            if (this.A04.A06) {
                circularProgressBar2.setVisibility(0);
                this.A02.setVisibility(0);
                this.A01.setVisibility(0);
                boolean isEmpty2 = TextUtils.isEmpty(this.A04.A0I);
                TextView textView2 = this.A02;
                if (isEmpty2) {
                    textView2.setText(R.string.f11nameremoved);
                } else {
                    textView2.setText(AnonymousClass002.A0F(this.A0B, this.A04.A0I, new Object[1], 0, R.string.f11nameremoved));
                }
                int i = this.A00;
                CircularProgressBar circularProgressBar3 = this.A03;
                if (i >= 0) {
                    circularProgressBar3.setIndeterminate(false);
                    this.A03.setProgress(this.A00);
                    return;
                }
                circularProgressBar3.setIndeterminate(true);
                return;
            }
            view.setVisibility(8);
            this.A03.setVisibility(8);
            this.A02.setVisibility(8);
        }
    }

    public void A06(C50612iT r3) {
        this.A04 = r3;
        A00().A0K(r3.A05);
    }

    public void A03(View view) {
        this.A03 = (CircularProgressBar) C06560Yg.A02(view, R.id.pack_loading);
        this.A02 = C18300x5.A0G(view, R.id.pack_loading_text);
        View A022 = C06560Yg.A02(view, R.id.cancel_button);
        this.A01 = A022;
        A022.setOnClickListener(new C989753y(this, 32));
        A05();
    }
}
