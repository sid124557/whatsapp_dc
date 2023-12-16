package com.whatsapp.ephemeral;

import X.AnonymousClass000;
import X.AnonymousClass002;
import X.AnonymousClass0x2;
import X.AnonymousClass1VX;
import X.AnonymousClass1ZH;
import X.AnonymousClass30N;
import X.AnonymousClass3LQ;
import X.AnonymousClass4FV;
import X.AnonymousClass64B;
import X.C06560Yg;
import X.C08270df;
import X.C111095hX;
import X.C18300x5;
import X.C41532Kp;
import X.C58422vE;
import X.C624134x;
import X.C627336j;
import X.C633839a;
import X.C66433Lk;
import X.C95814uZ;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.whatsapp.R;

public class ViewOnceNuxBottomSheet extends Hilt_ViewOnceNuxBottomSheet implements AnonymousClass64B {
    public int A00 = -1;
    public C111095hX A01;
    public AnonymousClass1VX A02;
    public AnonymousClass4FV A03;
    public AnonymousClass30N A04;
    public AnonymousClass3LQ A05;
    public C66433Lk A06;
    public String A07 = "-1";
    public boolean A08;
    public boolean A09;
    public boolean A0A = true;

    public static boolean A01(C08270df r5, C41532Kp r6, AnonymousClass3LQ r7, C624134x r8) {
        String str;
        if (AnonymousClass000.A1X(r8)) {
            str = "ephemeral_view_once";
        } else {
            str = "ephemeral_view_once_receiver";
        }
        if (r7.A00.A02((Object) null, str) || r5.A0D("view_once_nux_v2") != null) {
            return false;
        }
        A00(r5, r6, r8, false);
        return true;
    }

    public final void A1a(boolean z) {
        int i;
        AnonymousClass1ZH r3 = new AnonymousClass1ZH();
        String str = this.A07;
        if (!str.equals("-1")) {
            r3.A00 = Boolean.valueOf(this.A08);
            r3.A03 = this.A04.A04(str);
            int i2 = 2;
            if (this.A00 == 42) {
                i2 = 1;
            }
            r3.A01 = Integer.valueOf(i2);
            if (this.A0A) {
                i = 2;
                if (z) {
                    i = 7;
                }
            } else {
                i = 5;
                if (z) {
                    i = 10;
                }
            }
            r3.A02 = Integer.valueOf(i);
            this.A03.BhD(r3);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        String str;
        AnonymousClass3LQ r1 = this.A05;
        if (this.A0A) {
            str = "ephemeral_view_once";
        } else {
            str = "ephemeral_view_once_receiver";
        }
        r1.A00.A01(str, (Object) null);
        super.onDismiss(dialogInterface);
    }

    public static void A00(C08270df r6, C41532Kp r7, C624134x r8, boolean z) {
        C95814uZ r1;
        Bundle A082 = AnonymousClass002.A08();
        if (r8 != null && (r1 = r8.A1J.A00) != null) {
            AnonymousClass0x2.A0v(A082, r1, "CHAT_JID");
            A082.putInt("MESSAGE_TYPE", r8.A1I);
            A082.putBoolean("IN_GROUP", C627336j.A0K(r1));
            A082.putBoolean("IS_SENDER", false);
        } else if (r7 != null) {
            C95814uZ r12 = r7.A01;
            AnonymousClass0x2.A0v(A082, r12, "CHAT_JID");
            A082.putInt("MESSAGE_TYPE", r7.A00);
            A082.putBoolean("IN_GROUP", C627336j.A0K(r12));
        }
        A082.putBoolean("FORCE_SHOW", z);
        ViewOnceNuxBottomSheet viewOnceNuxBottomSheet = new ViewOnceNuxBottomSheet();
        viewOnceNuxBottomSheet.A0u(A082);
        viewOnceNuxBottomSheet.A1O(r6, "view_once_nux_v2");
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Bundle A0H = A0H();
        this.A08 = A0H.getBoolean("IN_GROUP", false);
        this.A07 = A0H.getString("CHAT_JID", "-1");
        this.A00 = A0H.getInt("MESSAGE_TYPE", -1);
        this.A09 = A0H.getBoolean("FORCE_SHOW", false);
        this.A0A = A0H.getBoolean("IS_SENDER", true);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0f() {
        String str;
        super.A0f();
        if (!this.A09) {
            AnonymousClass3LQ r3 = this.A05;
            if (this.A0A) {
                str = "ephemeral_view_once";
            } else {
                str = "ephemeral_view_once_receiver";
            }
            if (r3.A00.A02((Object) null, str)) {
                A1L();
            }
        }
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        super.A0w(bundle, view);
        View A022 = C06560Yg.A02(view, R.id.vo_sp_bottom_sheet_ok_button);
        View A023 = C06560Yg.A02(view, R.id.vo_sp_close_button);
        View A024 = C06560Yg.A02(view, R.id.vo_sp_bottom_sheet_learn_more_button);
        TextView A0G = C18300x5.A0G(view, R.id.vo_sp_title);
        TextView A0G2 = C18300x5.A0G(view, R.id.vo_sp_first_bullet_summary);
        TextView A0G3 = C18300x5.A0G(view, R.id.vo_sp_second_bullet_summary);
        if (this.A0A) {
            A0G.setText(R.string.f11nameremoved);
            A0G2.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else if (this.A02.A0Y(C58422vE.A02, 2802)) {
            A0G.setText(R.string.f11nameremoved);
            A0G2.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else if (this.A00 == 42) {
            A0G.setText(R.string.f11nameremoved);
            A0G2.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        } else {
            A0G.setText(R.string.f11nameremoved);
            A0G2.setText(R.string.f11nameremoved);
            i = R.string.f11nameremoved;
        }
        A0G3.setText(i);
        C633839a.A00(A022, this, 20);
        C633839a.A00(A023, this, 21);
        C633839a.A00(A024, this, 22);
        A1a(false);
    }
}
