package com.whatsapp.stickers.info;

import X.AnonymousClass043;
import X.AnonymousClass0x7;
import X.AnonymousClass1RR;
import X.AnonymousClass33O;
import X.AnonymousClass39M;
import X.AnonymousClass4FS;
import X.AnonymousClass555;
import X.AnonymousClass5LB;
import X.AnonymousClass5P0;
import X.AnonymousClass5V0;
import X.AnonymousClass5ZD;
import X.AnonymousClass6BM;
import X.C003203q;
import X.C06200Wq;
import X.C06560Yg;
import X.C08310eF;
import X.C106405Yw;
import X.C106905aM;
import X.C111095hX;
import X.C1235268t;
import X.C18300x5;
import X.C19340zH;
import X.C49652gs;
import X.C54872pQ;
import X.C55732qp;
import X.C55862r2;
import X.C56932sn;
import X.C56972sr;
import X.C95814uZ;
import X.C97144xh;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaTextView;
import com.whatsapp.stickers.StickerView;
import java.util.Collections;
import java.util.Set;

public class StickerInfoDialogFragment extends Hilt_StickerInfoDialogFragment {
    public int A00;
    public View A01;
    public View A02;
    public Button A03;
    public Button A04;
    public Button A05;
    public TextView A06;
    public TextView A07;
    public C111095hX A08;
    public C56972sr A09;
    public WaTextView A0A;
    public C54872pQ A0B;
    public AnonymousClass5P0 A0C;
    public C95814uZ A0D;
    public C49652gs A0E;
    public AnonymousClass5ZD A0F;
    public C55862r2 A0G;
    public AnonymousClass39M A0H;
    public C55732qp A0I;
    public AnonymousClass33O A0J;
    public C56932sn A0K;
    public StickerView A0L;
    public AnonymousClass5LB A0M;
    public C97144xh A0N;
    public AnonymousClass4FS A0O;
    public final DialogInterface.OnClickListener A0P = C1235268t.A00(this, 131);
    public final DialogInterface.OnClickListener A0Q = C1235268t.A00(this, 132);

    public void A0g() {
        super.A0g();
        C06200Wq r1 = ((AnonymousClass043) this.A03).A00;
        Button button = r1.A0G;
        this.A03 = button;
        this.A04 = r1.A0E;
        this.A05 = r1.A0F;
        if (this.A0J != null && this.A0H != null && this.A0L != null && this.A0M == null) {
            button.setVisibility(8);
            this.A04.setVisibility(8);
            this.A05.setVisibility(8);
            AnonymousClass33O r0 = this.A0J;
            AnonymousClass39M r2 = this.A0H;
            StickerView stickerView = this.A0L;
            int i = this.A00;
            r0.A05(stickerView, r2, new AnonymousClass6BM(this, 1), 1, i, i, true, false);
            C55732qp r7 = this.A0I;
            C56932sn r8 = this.A0K;
            AnonymousClass0x7.A1B(new AnonymousClass555(this.A0E, this.A0H, r7, r8, this), this.A0O);
        }
    }

    public final void A1V(AnonymousClass39M r4, AnonymousClass5LB r5) {
        boolean z = r5.A07;
        C56932sn r1 = this.A0K;
        Set singleton = Collections.singleton(r4);
        if (z) {
            r1.A0F(singleton);
            return;
        }
        r1.A0E(singleton);
        if (!A1W()) {
            boolean z2 = r5.A06;
            C97144xh r0 = this.A0N;
            if (z2) {
                r0.A09("starred");
            } else {
                r0.A0A("starred");
            }
        }
    }

    public final boolean A1W() {
        C95814uZ r1;
        AnonymousClass5P0 r3 = this.A0C;
        C95814uZ r2 = this.A0D;
        if (r2 == null) {
            return true;
        }
        AnonymousClass1RR A012 = C56972sr.A01(r3.A02);
        if (A012 != null) {
            r1 = A012.A0H;
        } else {
            r1 = null;
        }
        return r3.A00(r3.A06.A01(r2), r1);
    }

    public Dialog A1J(Bundle bundle) {
        C003203q A0R = A0R();
        Bundle A0H2 = A0H();
        this.A0H = (AnonymousClass39M) A0H2.getParcelable("sticker");
        this.A0D = C106405Yw.A02(A0H2, "raw-chat-jid");
        C19340zH A002 = AnonymousClass5V0.A00(A0R);
        LayoutInflater layoutInflater = A0R.getLayoutInflater();
        this.A00 = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, (ViewGroup) null);
        StickerView stickerView = (StickerView) C06560Yg.A02(inflate, R.id.sticker_view);
        this.A0L = stickerView;
        stickerView.A03 = true;
        this.A01 = C06560Yg.A02(inflate, R.id.progress_view);
        this.A02 = C06560Yg.A02(inflate, R.id.sticker_info_container);
        this.A0A = AnonymousClass0x7.A0L(inflate, R.id.sticker_pack_name);
        this.A07 = C18300x5.A0G(inflate, R.id.sticker_pack_publisher);
        this.A06 = C18300x5.A0G(inflate, R.id.bullet_sticker_info);
        C106905aM.A04(this.A0A);
        A002.setPositiveButton(R.string.f11nameremoved, this.A0P);
        A002.setNegativeButton(R.string.f11nameremoved, (DialogInterface.OnClickListener) null);
        A002.A0X(this.A0Q, R.string.f11nameremoved);
        A002.setView(inflate);
        return A002.create();
    }
}
