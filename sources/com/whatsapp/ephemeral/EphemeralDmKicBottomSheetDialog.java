package com.whatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0RP;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass314;
import X.AnonymousClass33p;
import X.AnonymousClass3LQ;
import X.AnonymousClass4A7;
import X.AnonymousClass64B;
import X.C003203q;
import X.C06560Yg;
import X.C08270df;
import X.C104395Qu;
import X.C111095hX;
import X.C18270x1;
import X.C18280x3;
import X.C53602nM;
import X.C56612sH;
import X.C633839a;
import X.C634239e;
import X.C66433Lk;
import X.C95814uZ;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.R;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.wds.components.button.WDSButton;

public class EphemeralDmKicBottomSheetDialog extends Hilt_EphemeralDmKicBottomSheetDialog implements AnonymousClass64B {
    public static AnonymousClass4A7 A0L;
    public int A00 = 0;
    public C111095hX A01;
    public WaImageView A02;
    public WaImageView A03;
    public WaTextView A04;
    public WaTextView A05;
    public WaTextView A06;
    public WaTextView A07;
    public WaTextView A08;
    public WaTextView A09;
    public C53602nM A0A;
    public AnonymousClass314 A0B;
    public C56612sH A0C;
    public AnonymousClass33p A0D;
    public C104395Qu A0E;
    public C95814uZ A0F;
    public AnonymousClass3LQ A0G;
    public C66433Lk A0H;
    public WDSButton A0I;
    public WDSButton A0J;
    public boolean A0K = false;

    public static void A01(C08270df r3, C95814uZ r4, int i) {
        EphemeralDmKicBottomSheetDialog ephemeralDmKicBottomSheetDialog = new EphemeralDmKicBottomSheetDialog();
        Bundle A082 = AnonymousClass002.A08();
        A082.putParcelable("chat_jid", r4);
        A082.putInt("entry_point", i);
        ephemeralDmKicBottomSheetDialog.A0u(A082);
        ephemeralDmKicBottomSheetDialog.A1O(r3, "ephemeral_kic_nux");
    }

    public void onCancel(DialogInterface dialogInterface) {
        C18270x1.A0l(C18270x1.A03(this.A0D), "ephemeral_kic_nux", true);
        A1L();
        super.onCancel(dialogInterface);
    }

    public static void A00(C08270df r1, AnonymousClass33p r2, AnonymousClass4A7 r3, C95814uZ r4, int i) {
        if (A02(r1, r2)) {
            A01(r1, r4, i);
            A0L = r3;
        }
    }

    public static boolean A02(C08270df r2, AnonymousClass33p r3) {
        if (r2.A0t() || C18280x3.A1W(AnonymousClass0x2.A0F(r3), "ephemeral_kic_nux") || r2.A0D("ephemeral_kic_nux") != null) {
            return false;
        }
        return true;
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        WaTextView waTextView;
        int i;
        WaImageView waImageView;
        int i2;
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
        this.A0F = (C95814uZ) A0H().getParcelable("chat_jid");
        int i3 = A0H().getInt("entry_point");
        this.A00 = i3;
        int i4 = 1;
        this.A0K = AnonymousClass000.A1U(i3, 3);
        this.A0J = (WDSButton) C06560Yg.A02(inflate, R.id.ephemeral_nux_ok);
        this.A0I = (WDSButton) C06560Yg.A02(inflate, R.id.ephemeral_nux_learn_more);
        this.A08 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_text_third_line);
        this.A06 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_text_second_line);
        this.A04 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_text_first_line);
        this.A07 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_subtitle);
        this.A09 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_title);
        this.A03 = AnonymousClass0x9.A0L(inflate, R.id.ephemeral_nux_icon);
        this.A02 = AnonymousClass0x9.A0L(inflate, R.id.ephemeral_nux_dismiss);
        this.A05 = AnonymousClass0x7.A0L(inflate, R.id.ephemeral_nux_new);
        boolean z = !this.A0G.A00.A02((Object) null, "ephemeral");
        if (!z || this.A0K) {
            C633839a.A00(this.A0J, this, 17);
            this.A0I.setOnClickListener(new C634239e(4, this, true));
            C633839a.A00(this.A02, this, 18);
            this.A07.setVisibility(8);
            this.A05.setVisibility(0);
            int i5 = this.A00;
            WaTextView waTextView2 = this.A04;
            if (i5 == 1) {
                waTextView2.setText(R.string.f11nameremoved);
                this.A09.setText(R.string.f11nameremoved);
                this.A06.setText(R.string.f11nameremoved);
                waTextView = this.A04;
                i = R.drawable.ic_action_undo_keep;
            } else {
                waTextView2.setText(R.string.f11nameremoved);
                this.A09.setText(R.string.f11nameremoved);
                this.A06.setText(R.string.f11nameremoved);
                waTextView = this.A04;
                i = R.drawable.calendar_month;
            }
            A1a(waTextView, i);
            this.A08.setText(R.string.f11nameremoved);
            A1a(this.A08, R.drawable.ic_group_ephemeral_v2);
            A1a(this.A06, R.drawable.ic_add_new_group);
            waImageView = this.A03;
            i2 = R.drawable.ic_action_keep;
        } else {
            C633839a.A00(this.A0J, this, 17);
            this.A0I.setOnClickListener(new C634239e(4, this, false));
            C633839a.A00(this.A02, this, 18);
            this.A07.setVisibility(0);
            this.A05.setVisibility(8);
            int i6 = this.A00;
            WaTextView waTextView3 = this.A09;
            int i7 = R.string.f11nameremoved;
            if (i6 == 2) {
                i7 = R.string.f11nameremoved;
            }
            waTextView3.setText(i7);
            this.A08.setText(R.string.f11nameremoved);
            A1a(this.A08, R.drawable.ic_hand);
            this.A06.setText(R.string.f11nameremoved);
            A1a(this.A06, R.drawable.ic_action_keep);
            this.A04.setText(R.string.f11nameremoved);
            A1a(this.A04, R.drawable.ic_dm_timer);
            this.A07.setText(R.string.f11nameremoved);
            waImageView = this.A03;
            i2 = R.drawable.ic_ephemeral_v2;
        }
        waImageView.setImageResource(i2);
        C104395Qu r6 = this.A0E;
        C95814uZ r5 = this.A0F;
        AnonymousClass314 r4 = this.A0B;
        if (!z) {
            i4 = 2;
        }
        r6.A00(r4, r5, Integer.valueOf(i4), this.A00);
        return inflate;
    }

    public void A0f() {
        super.A0f();
        if (C18280x3.A1W(AnonymousClass0x2.A0F(this.A0D), "ephemeral_kic_nux") && !this.A0K) {
            A1L();
        }
    }

    public final void A1a(WaTextView waTextView, int i) {
        waTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(AnonymousClass0RP.A00(A0G(), i), (Drawable) null, (Drawable) null, (Drawable) null);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        C003203q A0Q = A0Q();
        if (A0Q instanceof AnonymousClass4A7) {
            ((AnonymousClass4A7) A0Q).BXH();
        }
        AnonymousClass4A7 r0 = A0L;
        if (r0 != null) {
            r0.BXH();
            A0L = null;
        }
    }
}
