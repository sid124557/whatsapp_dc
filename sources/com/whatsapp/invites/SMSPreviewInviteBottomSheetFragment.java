package com.whatsapp.invites;

import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass0x7;
import X.AnonymousClass31C;
import X.AnonymousClass3ZH;
import X.AnonymousClass4FS;
import X.AnonymousClass4WY;
import X.AnonymousClass5ZU;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C105365Uq;
import X.C109715f4;
import X.C114015mM;
import X.C162457s7;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C27991fJ;
import X.C53802nh;
import X.C56972sr;
import X.C56982ss;
import X.C620733j;
import X.C626936e;
import X.C627336j;
import X.C64773Ex;
import X.C69263Wi;
import X.C70003Zm;
import X.C95814uZ;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.R;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;

public final class SMSPreviewInviteBottomSheetFragment extends Hilt_SMSPreviewInviteBottomSheetFragment {
    public C69263Wi A00;
    public C56972sr A01;
    public C64773Ex A02;
    public AnonymousClass5ZU A03;
    public C105365Uq A04;
    public C114015mM A05;
    public C53802nh A06;
    public C620733j A07;
    public C56982ss A08;
    public AnonymousClass4WY A09;
    public AnonymousClass31C A0A;
    public AnonymousClass4FS A0B;
    public boolean A0C = true;
    public boolean A0D;
    public final ArrayList A0E = AnonymousClass001.A0s();
    public final ArrayList A0F = AnonymousClass001.A0s();

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        int i;
        String string;
        String str;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        View A0E2 = C18280x3.A0E(view, R.id.container);
        C114015mM r3 = this.A05;
        if (r3 != null) {
            this.A04 = r3.A06(A0R(), "hybrid-invite-group-participants-activity");
            Bundle A0H = A0H();
            for (Object add : C627336j.A0B(UserJid.class, A0H.getStringArrayList("sms_invites_jids"))) {
                this.A0F.add(add);
            }
            this.A0C = A0H.getBoolean("all_participants_non_wa_in_request", true);
            TextView A0I = AnonymousClass0x2.A0I(A0E2, R.id.send_invite_title);
            Resources A092 = C08310eF.A09(this);
            ArrayList arrayList = this.A0F;
            String quantityString = A092.getQuantityString(R.plurals.f9nameremoved, arrayList.size());
            C162457s7.A0D(quantityString);
            A0I.setText(quantityString);
            C27991fJ A072 = C27991fJ.A01.A07(A0H.getString("group_jid"));
            C626936e.A06(A072);
            C162457s7.A0D(A072);
            TextView A0I2 = AnonymousClass0x2.A0I(A0E2, R.id.send_invite_subtitle);
            if (arrayList.size() == 1) {
                boolean A1Z = A1Z(A072);
                int i2 = R.string.f11nameremoved;
                if (A1Z) {
                    i2 = R.string.f11nameremoved;
                }
                Object[] objArr = new Object[1];
                C64773Ex r32 = this.A02;
                if (r32 != null) {
                    AnonymousClass3ZH A073 = r32.A07((C95814uZ) arrayList.get(0));
                    if (A073 == null || (str = A073.A0J()) == null) {
                        str = "";
                    }
                    string = AnonymousClass0x7.A0n(this, str, objArr, 0, i2);
                } else {
                    throw C18270x1.A0S("contactManager");
                }
            } else {
                if (this.A0C || arrayList.size() <= 1) {
                    boolean A1Z2 = A1Z(A072);
                    i = R.string.f11nameremoved;
                    if (A1Z2) {
                        i = R.string.f11nameremoved;
                    }
                } else {
                    boolean A1Z3 = A1Z(A072);
                    i = R.string.f11nameremoved;
                    if (A1Z3) {
                        i = R.string.f11nameremoved;
                    }
                }
                string = C08310eF.A09(this).getString(i);
            }
            C162457s7.A0D(string);
            A0I2.setText(string);
            RecyclerView recyclerView = (RecyclerView) C18280x3.A0E(A0E2, R.id.invite_contacts_recycler);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(1);
            linearLayoutManager.A1X(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            Context A0G = A0G();
            C56982ss r12 = this.A08;
            if (r12 != null) {
                LayoutInflater from = LayoutInflater.from(A0Q());
                C162457s7.A0D(from);
                AnonymousClass5ZU r9 = this.A03;
                if (r9 != null) {
                    C620733j r11 = this.A07;
                    if (r11 != null) {
                        C105365Uq r10 = this.A04;
                        if (r10 == null) {
                            throw C18270x1.A0S("contactPhotoLoader");
                        }
                        AnonymousClass4WY r6 = new AnonymousClass4WY(A0G, from, r9, r10, r11, r12);
                        this.A09 = r6;
                        recyclerView.setAdapter(r6);
                        AnonymousClass4FS r5 = this.A0B;
                        if (r5 != null) {
                            r5.BkP(C70003Zm.A00(this, 47));
                            C18290x4.A1F(C06560Yg.A02(A0E2, R.id.btn_not_now), this, 1);
                            C06560Yg.A02(A0E2, R.id.btn_send_invites).setOnClickListener(new C109715f4(this, A072, A0H.getInt("invite_trigger_source"), 11));
                            return;
                        }
                        throw C18270x1.A0S("waWorkers");
                    }
                    throw C18270x1.A0S("whatsAppLocale");
                }
                throw C18270x1.A0S("waContactNames");
            }
            throw C18270x1.A0S("chatsCache");
        }
        throw C18270x1.A0S("contactPhotos");
    }

    public final void A1Y(String str) {
        C69263Wi r1 = this.A00;
        if (r1 != null) {
            r1.A0Q(str, 0);
            return;
        }
        throw C18270x1.A0S("globalUI");
    }

    public final boolean A1Z(C27991fJ r4) {
        C56982ss r0 = this.A08;
        if (r0 != null) {
            int A062 = r0.A06(r4);
            if (A062 == 1 || A062 == 3) {
                return true;
            }
            return false;
        }
        throw C18270x1.A0S("chatsCache");
    }

    public void A0a() {
        super.A0a();
        C105365Uq r1 = this.A04;
        if (r1 == null) {
            throw C18270x1.A0S("contactPhotoLoader");
        }
        r1.A00();
    }

    public void A0d() {
        super.A0d();
        if (!this.A0D) {
            String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            C162457s7.A0D(string);
            A1Y(string);
        }
        C003203q A0Q = A0Q();
        if (A0Q != null && !A0Q.isFinishing()) {
            A0Q.finish();
        }
    }
}
