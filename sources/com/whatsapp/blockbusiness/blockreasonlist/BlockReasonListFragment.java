package com.whatsapp.blockbusiness.blockreasonlist;

import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass120;
import X.AnonymousClass20K;
import X.AnonymousClass30W;
import X.AnonymousClass32Y;
import X.AnonymousClass3LP;
import X.AnonymousClass3ZH;
import X.AnonymousClass43Y;
import X.AnonymousClass43Z;
import X.AnonymousClass487;
import X.AnonymousClass4FS;
import X.AnonymousClass4K2;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C003203q;
import X.C154517dI;
import X.C162457s7;
import X.C175738Zn;
import X.C18270x1;
import X.C18290x4;
import X.C18300x5;
import X.C33901ts;
import X.C49562gj;
import X.C52202l3;
import X.C56962sq;
import X.C58422vE;
import X.C60152y5;
import X.C620633i;
import X.C621033m;
import X.C627736r;
import X.C64773Ex;
import X.C69263Wi;
import X.C71643cR;
import X.C73723fy;
import X.C76823sP;
import X.C85714Hi;
import X.C89654ea;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.jid.UserJid;
import com.whatsapp.wds.components.button.WDSButton;

public final class BlockReasonListFragment extends Hilt_BlockReasonListFragment {
    public CheckBox A00;
    public RecyclerView A01;
    public C69263Wi A02;
    public AnonymousClass120 A03;
    public C64773Ex A04;
    public AnonymousClass5ZU A05;
    public C620633i A06;
    public AnonymousClass487 A07;
    public AnonymousClass5Y0 A08;
    public AnonymousClass3LP A09;
    public C60152y5 A0A;
    public AnonymousClass4FS A0B;
    public WDSButton A0C;
    public Runnable A0D;
    public final AnonymousClass66R A0E = C154517dI.A01(new C76823sP(this));

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f7, code lost:
        if (r1.startsWith("ent:") == false) goto L_0x00f9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View A0K(android.os.Bundle r11, android.view.LayoutInflater r12, android.view.ViewGroup r13) {
        /*
            r10 = this;
            r2 = 0
            X.C162457s7.A0J(r12, r2)
            android.os.Bundle r1 = r10.A0H()
            java.lang.String r0 = "jid"
            java.lang.String r3 = r1.getString(r0)
            if (r3 == 0) goto L_0x0195
            r0 = 2131624170(0x7f0e00ea, float:1.8875512E38)
            android.view.View r4 = r12.inflate(r0, r13, r2)
            X.C162457s7.A0H(r4)
            r0 = 2131428034(0x7f0b02c2, float:1.8477701E38)
            android.view.View r7 = r4.findViewById(r0)
            r6 = r7
            androidx.recyclerview.widget.RecyclerView r6 = (androidx.recyclerview.widget.RecyclerView) r6
            r6.getContext()
            r5 = 1
            X.C18320x8.A19(r6, r5)
            android.content.Context r0 = r6.getContext()
            X.09S r2 = new X.09S
            r2.<init>(r0)
            android.content.Context r1 = r6.getContext()
            r0 = 2131231079(0x7f080167, float:1.8078229E38)
            android.graphics.drawable.Drawable r0 = X.AnonymousClass0RP.A00(r1, r0)
            if (r0 == 0) goto L_0x0043
            r2.A00 = r0
        L_0x0043:
            r6.A0o(r2)
            r6.A0h = r5
            X.C162457s7.A0D(r7)
            r10.A01 = r6
            r0 = 2131432895(0x7f0b15bf, float:1.848756E38)
            android.view.View r0 = r4.findViewById(r0)
            X.C06560Yg.A0T(r0, r5)
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A09(r3)
            X.3Ex r0 = r10.A04
            if (r0 == 0) goto L_0x018e
            X.3ZH r9 = r0.A0A(r1)
            X.3LP r0 = r10.A09
            if (r0 == 0) goto L_0x0187
            boolean r0 = X.C57362tW.A00(r0, r1)
            r8 = 0
            r7 = 1
            if (r0 == 0) goto L_0x00e7
            android.content.Context r1 = r10.A0G()
            java.lang.String r2 = X.AnonymousClass1RT.A02
            if (r2 != 0) goto L_0x0080
            r0 = 2131895467(0x7f1224ab, float:1.9425768E38)
            java.lang.String r2 = r1.getString(r0)
            X.AnonymousClass1RT.A02 = r2
        L_0x0080:
            r1 = 2131895444(0x7f122494, float:1.9425721E38)
            java.lang.Object[] r0 = X.C18310x6.A1b(r2, r8)
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r10, r2, r0, r5, r1)
        L_0x008b:
            X.C162457s7.A0H(r1)
            r0 = 2131428041(0x7f0b02c9, float:1.8477715E38)
            android.view.View r5 = r4.findViewById(r0)
            com.whatsapp.FAQTextView r5 = (com.whatsapp.FAQTextView) r5
            android.text.SpannableString r2 = new android.text.SpannableString
            r2.<init>(r1)
            java.lang.String r1 = "chats"
            java.lang.String r0 = "controls-when-messaging-businesses"
            r5.setEducationTextFromNamedArticle(r2, r1, r0)
            r0 = 2131433003(0x7f0b162b, float:1.848778E38)
            android.view.View r0 = X.C18290x4.A0M(r4, r0)
            android.widget.CheckBox r0 = (android.widget.CheckBox) r0
            r10.A00 = r0
            com.whatsapp.jid.UserJid r1 = X.AnonymousClass32Y.A0A(r3)
            X.3LP r0 = r10.A09
            if (r0 == 0) goto L_0x0178
            boolean r0 = X.C57362tW.A00(r0, r1)
            if (r0 != 0) goto L_0x00d3
            android.os.Bundle r1 = r10.A0H()
            java.lang.String r0 = "show_report_upsell"
            boolean r0 = r1.getBoolean(r0)
            if (r0 == 0) goto L_0x00d3
            r0 = 2131433005(0x7f0b162d, float:1.8487783E38)
            android.view.View r0 = r4.findViewById(r0)
            r0.setVisibility(r8)
        L_0x00d3:
            r0 = 2131428019(0x7f0b02b3, float:1.847767E38)
            android.view.View r2 = X.C18290x4.A0M(r4, r0)
            com.whatsapp.wds.components.button.WDSButton r2 = (com.whatsapp.wds.components.button.WDSButton) r2
            r10.A0C = r2
            java.lang.String r1 = "blockButton"
            if (r2 != 0) goto L_0x0138
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x00e7:
            r6 = 2131895713(0x7f1225a1, float:1.9426267E38)
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.String r1 = r9.A0T
            if (r1 == 0) goto L_0x00f9
            java.lang.String r0 = "ent:"
            boolean r1 = r1.startsWith(r0)
            r0 = 1
            if (r1 != 0) goto L_0x00fa
        L_0x00f9:
            r0 = 0
        L_0x00fa:
            r2 = -1
            if (r0 == 0) goto L_0x0127
            java.lang.String r1 = r9.A0L()
            int r0 = r9.A08
            if (r0 != r7) goto L_0x010d
            X.5ZU r0 = r10.A05
            if (r0 == 0) goto L_0x017f
            java.lang.String r1 = r0.A0N(r9)
        L_0x010d:
            if (r1 == 0) goto L_0x011b
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x011b
        L_0x0115:
            java.lang.String r1 = X.AnonymousClass0x7.A0n(r10, r1, r5, r8, r6)
            goto L_0x008b
        L_0x011b:
            X.5ZU r0 = r10.A05
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0127:
            X.5ZU r0 = r10.A05
            if (r0 != 0) goto L_0x0133
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0133:
            java.lang.String r1 = r0.A0R(r9, r2, r7)
            goto L_0x0115
        L_0x0138:
            X.5ee r0 = new X.5ee
            r0.<init>(r7, r3, r10)
            r2.setOnClickListener(r0)
            com.whatsapp.wds.components.button.WDSButton r2 = r10.A0C
            if (r2 != 0) goto L_0x0149
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r1)
            throw r0
        L_0x0149:
            X.3LP r1 = r10.A09
            if (r1 == 0) goto L_0x0171
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass32Y.A0A(r3)
            boolean r0 = X.C57362tW.A00(r1, r0)
            r2.setEnabled(r0)
            r0 = 14
            X.5sN r1 = new X.5sN
            r1.<init>(r10, r4, r3, r0)
            X.4FS r0 = r10.A0B
            if (r0 == 0) goto L_0x0169
            r0.BkM(r1)
            r10.A0D = r1
            return r4
        L_0x0169:
            java.lang.String r0 = "waWorkers"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0171:
            java.lang.String r0 = "infraABProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0178:
            java.lang.String r0 = "infraABProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x017f:
            java.lang.String r0 = "waContactNames"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0187:
            java.lang.String r0 = "infraABProps"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x018e:
            java.lang.String r0 = "contactManager"
            java.lang.RuntimeException r0 = X.C18270x1.A0S(r0)
            throw r0
        L_0x0195:
            java.lang.IllegalArgumentException r0 = X.C18300x5.A0X()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment.A0K(android.os.Bundle, android.view.LayoutInflater, android.view.ViewGroup):android.view.View");
    }

    public void A0q(Bundle bundle) {
        C162457s7.A0J(bundle, 0);
        super.A0q(bundle);
        AnonymousClass120 r0 = this.A03;
        if (r0 == null) {
            throw C18270x1.A0S("adapter");
        }
        bundle.putInt("selectedItem", r0.A00);
        AnonymousClass120 r02 = this.A03;
        if (r02 == null) {
            throw C18270x1.A0S("adapter");
        }
        bundle.putString("text", r02.A01.toString());
    }

    public void A0w(Bundle bundle, View view) {
        C162457s7.A0J(view, 0);
        boolean z = A0H().getBoolean("should_launch_home_activity");
        AnonymousClass66R r4 = this.A0E;
        AnonymousClass4K2.A00(A0V(), ((BlockReasonListViewModel) r4.getValue()).A01, new AnonymousClass43Y(bundle, this), 5);
        AnonymousClass4K2.A00(A0V(), ((BlockReasonListViewModel) r4.getValue()).A0D, new AnonymousClass43Z(this, z), 6);
    }

    public void A0c() {
        Runnable runnable = this.A0D;
        if (runnable != null) {
            AnonymousClass4FS r0 = this.A0B;
            if (r0 != null) {
                r0.BjN(runnable);
            } else {
                throw C18270x1.A0S("waWorkers");
            }
        }
        super.A0c();
    }

    public final void A1V(String str) {
        AnonymousClass20K r15;
        boolean z = A0H().getBoolean("show_success_toast");
        boolean z2 = A0H().getBoolean("from_spam_panel");
        CheckBox checkBox = this.A00;
        String str2 = null;
        if (checkBox == null) {
            throw C18270x1.A0S("reportCheckbox");
        }
        boolean isChecked = checkBox.isChecked();
        boolean z3 = A0H().getBoolean("report_block_and_delete_contact");
        String string = A0H().getString("entry_point");
        if (string != null) {
            C003203q A0R = A0R();
            AnonymousClass0x9.A1L(A0R);
            C89654ea r11 = (C89654ea) A0R;
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) this.A0E.getValue();
            AnonymousClass120 r0 = this.A03;
            if (r0 == null) {
                throw C18270x1.A0S("adapter");
            }
            C52202l3 r02 = (C52202l3) C73723fy.A06(r0.A07, r0.A00);
            if (r02 != null) {
                str2 = r02.A01;
            }
            AnonymousClass120 r1 = this.A03;
            if (r1 == null) {
                throw C18270x1.A0S("adapter");
            }
            Integer valueOf = Integer.valueOf(r1.A00);
            String obj = r1.A01.toString();
            AnonymousClass120 r03 = this.A03;
            if (r03 == null) {
                throw C18270x1.A0S("adapter");
            }
            C52202l3 r04 = (C52202l3) C73723fy.A06(r03.A07, r03.A00);
            if (r04 != null) {
                r15 = r04.A00;
            } else {
                r15 = null;
            }
            C162457s7.A0J(r11, 0);
            UserJid A092 = AnonymousClass32Y.A09(str);
            AnonymousClass3ZH A0A2 = blockReasonListViewModel.A05.A0A(A092);
            String str3 = null;
            if (obj != null && !C175738Zn.A0V(obj)) {
                str3 = obj;
            }
            if (z2 || z3) {
                C49562gj r7 = blockReasonListViewModel.A0B;
                int i = 3;
                if (!isChecked) {
                    i = 1;
                    C162457s7.A0J(A092, 1);
                }
                r7.A00(A092, string, i);
                AnonymousClass4FS r6 = blockReasonListViewModel.A0E;
                C621033m r13 = blockReasonListViewModel.A03;
                AnonymousClass30W r16 = blockReasonListViewModel.A06;
                AnonymousClass0x7.A1B(new C33901ts(r11, r11, r13, new C85714Hi(blockReasonListViewModel, 0), r15, r16, A0A2, valueOf, str2, str3, string, false, isChecked, true), r6);
                if (z3) {
                    C56962sq r3 = blockReasonListViewModel.A04;
                    r3.A0c.BkM(new C71643cR(r11, r3, A0A2));
                }
            } else {
                C49562gj r12 = blockReasonListViewModel.A0B;
                C162457s7.A0J(A092, 1);
                r12.A00(A092, string, 1);
                blockReasonListViewModel.A04.A0B(r11, new C85714Hi(blockReasonListViewModel, 1), r15, A0A2, valueOf, str2, str3, string, true, z);
            }
            if (this.A02.A0Y(C58422vE.A02, 3369) && z3) {
                Intent A002 = C627736r.A00(A1D());
                C162457s7.A0D(A002);
                A0m(A002);
                return;
            }
            return;
        }
        throw C18300x5.A0X();
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        String string = A0H().getString("jid");
        if (string != null) {
            BlockReasonListViewModel blockReasonListViewModel = (BlockReasonListViewModel) this.A0E.getValue();
            C18290x4.A1M(blockReasonListViewModel.A0E, blockReasonListViewModel, AnonymousClass32Y.A09(string), 14);
            return;
        }
        throw C18300x5.A0X();
    }
}
