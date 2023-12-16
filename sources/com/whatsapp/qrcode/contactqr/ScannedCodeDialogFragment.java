package com.whatsapp.qrcode.contactqr;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass2YV;
import X.AnonymousClass36P;
import X.AnonymousClass3ZH;
import X.AnonymousClass4BC;
import X.AnonymousClass4FS;
import X.AnonymousClass5Y0;
import X.AnonymousClass5YB;
import X.AnonymousClass5ZU;
import X.AnonymousClass64B;
import X.AnonymousClass64J;
import X.AnonymousClass681;
import X.C06560Yg;
import X.C105055Tk;
import X.C105365Uq;
import X.C106165Xw;
import X.C107345b9;
import X.C109385eX;
import X.C114015mM;
import X.C18300x5;
import X.C18310x6;
import X.C29421in;
import X.C47882dz;
import X.C51602k5;
import X.C56422rx;
import X.C56602sG;
import X.C56612sH;
import X.C56972sr;
import X.C57052sz;
import X.C620733j;
import X.C627736r;
import X.C64223Cq;
import X.C64773Ex;
import X.C86634Kw;
import X.C86664Kz;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.UserJid;
import java.util.List;

public class ScannedCodeDialogFragment extends Hilt_ScannedCodeDialogFragment implements AnonymousClass64B {
    public int A00;
    public ImageView A01;
    public C56972sr A02;
    public AnonymousClass64J A03;
    public C64773Ex A04;
    public C29421in A05;
    public C47882dz A06;
    public C56422rx A07;
    public AnonymousClass5ZU A08;
    public C105365Uq A09;
    public C114015mM A0A;
    public C64223Cq A0B;
    public C56612sH A0C;
    public C620733j A0D;
    public AnonymousClass3ZH A0E;
    public AnonymousClass5Y0 A0F;
    public UserJid A0G;
    public AnonymousClass2YV A0H;
    public AnonymousClass4BC A0I;
    public C105055Tk A0J;
    public C106165Xw A0K;
    public AnonymousClass4FS A0L;
    public String A0M;
    public String A0N;
    public String A0O;
    public final View.OnClickListener A0P = new C109385eX(this, 5);
    public final View.OnClickListener A0Q = new C109385eX(this, 6);
    public final C56602sG A0R = AnonymousClass681.A00(this, 36);

    public void A0k(int i, int i2, Intent intent) {
        if (i == 1) {
            if (i2 == -1) {
                this.A0B.A08();
                A0m(C627736r.A00(A0R()));
                Intent A0D2 = C86634Kw.A0D(A0G(), C86664Kz.A1B(), this.A0G);
                A0D2.putExtra("added_by_qr_code", true);
                C57052sz.A00(A0D2, this);
            }
            A1K();
            this.A0J.A00();
            return;
        }
        super.A0k(i, i2, intent);
    }

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View A022;
        int i;
        Bundle A0H2 = A0H();
        this.A00 = A0H2.getInt("ARG_TYPE");
        this.A0G = C86634Kw.A0l(A0H2, "ARG_JID");
        this.A0N = A0H2.getString("ARG_MESSAGE");
        this.A0M = A0H2.getString("ARG_SOURCE");
        this.A0O = A0H2.getString("ARG_QR_CODE_ID");
        this.A0E = C64773Ex.A00(this.A04, this.A0G);
        boolean A0a = this.A02.A0a(this.A0G);
        View A0H3 = C18310x6.A0H(C86634Kw.A0K(this), R.layout.f8nameremoved);
        TextView A0G2 = C18300x5.A0G(A0H3, R.id.title);
        TextView A0G3 = C18300x5.A0G(A0H3, R.id.positive_button);
        this.A01 = AnonymousClass0x9.A0E(A0H3, R.id.profile_picture);
        View A023 = C06560Yg.A02(A0H3, R.id.contact_info);
        TextView A0G4 = C18300x5.A0G(A0H3, R.id.result_title);
        TextEmojiLabel A0K2 = AnonymousClass0x7.A0K(A0H3, R.id.result_subtitle);
        if (!this.A0E.A0P()) {
            A0G4.setText(this.A0D.A0I(AnonymousClass36P.A06(this.A0G)));
            String A0K3 = this.A08.A0K(this.A0E);
            if (A0K3 != null) {
                A0K2.A0K((List) null, A0K3);
            } else {
                A0K2.setVisibility(8);
            }
        } else {
            AnonymousClass5YB A002 = AnonymousClass5YB.A00(A023, this.A03, R.id.result_title);
            A0G4.setText(C107345b9.A03(A1D(), A0G4.getPaint(), this.A0F, this.A0E.A0L()));
            A002.A06(1);
            AnonymousClass2YV r0 = this.A0H;
            int i2 = R.string.f11nameremoved;
            if (r0.A01.A0X(5846)) {
                i2 = R.string.f11nameremoved;
            }
            A0K2.setText(i2);
        }
        this.A09.A08(this.A01, this.A0E);
        int i3 = this.A00;
        if (i3 == 0) {
            A0G2.setText(R.string.f11nameremoved);
            if (A0a || !C86664Kz.A1W(this.A02)) {
                A0G3.setText(R.string.f11nameremoved);
                A0G3.setOnClickListener(this.A0Q);
                return A0H3;
            }
            C51602k5 r1 = this.A0E.A0F;
            int i4 = R.string.f11nameremoved;
            if (r1 != null) {
                i4 = R.string.f11nameremoved;
            }
            A0G3.setText(i4);
            A0G3.setOnClickListener(this.A0P);
            A022 = C06560Yg.A02(A0H3, R.id.details_row);
            i = 7;
        } else if (i3 == 1) {
            A1K();
            return A0H3;
        } else if (i3 == 2) {
            A0G2.setText(R.string.f11nameremoved);
            A0G3.setText(R.string.f11nameremoved);
            A0G3.setOnClickListener(this.A0P);
            A022 = C06560Yg.A02(A0H3, R.id.details_row);
            i = 8;
        } else {
            throw AnonymousClass001.A0c("Unhandled type");
        }
        AnonymousClass0x2.A0y(A022, this, i);
        return A0H3;
    }

    public void A0a() {
        super.A0a();
        this.A09.A00();
    }

    public void A0d() {
        super.A0d();
        this.A05.A07(this.A0R);
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        this.A09 = this.A0A.A06(A0G(), "scanned-code-dialog-fragment");
    }

    public void A1G(Context context) {
        super.A1G(context);
        if (context instanceof AnonymousClass4BC) {
            this.A0I = (AnonymousClass4BC) context;
        }
        this.A05.A06(this.A0R);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        AnonymousClass4BC r0 = this.A0I;
        if (r0 != null) {
            r0.BZD();
        }
    }
}
