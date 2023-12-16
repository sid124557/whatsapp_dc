package com.whatsapp.group.ui;

import X.AnonymousClass002;
import X.AnonymousClass0x9;
import X.AnonymousClass340;
import X.AnonymousClass3ZH;
import X.AnonymousClass487;
import X.AnonymousClass4HQ;
import X.AnonymousClass58H;
import X.AnonymousClass5B5;
import X.AnonymousClass5Y0;
import X.AnonymousClass5ZU;
import X.AnonymousClass66R;
import X.C08310eF;
import X.C154517dI;
import X.C162457s7;
import X.C18270x1;
import X.C18300x5;
import X.C18310x6;
import X.C60152y5;
import X.C620633i;
import X.C620733j;
import X.C621033m;
import X.C635439q;
import X.C64773Ex;
import X.C80753yk;
import X.C80763yl;
import X.C95814uZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.WaEditText;
import com.whatsapp.wds.components.button.WDSButton;

public final class GroupJoinRequestReasonBottomSheetFragment extends Hilt_GroupJoinRequestReasonBottomSheetFragment {
    public C621033m A00;
    public C64773Ex A01;
    public AnonymousClass5ZU A02;
    public C620633i A03;
    public C620733j A04;
    public AnonymousClass487 A05;
    public AnonymousClass5Y0 A06;
    public C60152y5 A07;
    public WDSButton A08;
    public String A09 = "";
    public final AnonymousClass66R A0A;
    public final AnonymousClass66R A0B;
    public final AnonymousClass66R A0C = AnonymousClass340.A02(this, "group_subject");
    public final AnonymousClass66R A0D = AnonymousClass340.A02(this, "raw_parent_jid");
    public final AnonymousClass66R A0E = AnonymousClass340.A02(this, "message");

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        C162457s7.A0D(inflate);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        String string;
        View view2 = view;
        C162457s7.A0J(view2, 0);
        super.A0w(bundle, view2);
        TextView A092 = AnonymousClass002.A09(view2, R.id.request_counter);
        ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scrollView);
        WaEditText waEditText = (WaEditText) view2.findViewById(R.id.join_request_input);
        TextView A093 = AnonymousClass002.A09(view2, R.id.title);
        TextView A094 = AnonymousClass002.A09(view2, R.id.request_disclaimer);
        TextView A095 = AnonymousClass002.A09(view2, R.id.request_hint);
        View findViewById = view2.findViewById(R.id.back_btn);
        this.A08 = (WDSButton) view2.findViewById(R.id.request_btn);
        Context A0G = A0G();
        AnonymousClass5Y0 r14 = this.A06;
        if (r14 != null) {
            C620633i r11 = this.A03;
            if (r11 != null) {
                C620733j r12 = this.A04;
                if (r12 != null) {
                    C60152y5 r15 = this.A07;
                    if (r15 != null) {
                        AnonymousClass487 r13 = this.A05;
                        if (r13 != null) {
                            AnonymousClass5B5.A00(A0G, scrollView, A092, A095, waEditText, r11, r12, r13, r14, r15, 65536);
                            waEditText.addTextChangedListener(new AnonymousClass4HQ(this, 4));
                            waEditText.setText(AnonymousClass0x9.A13(this.A0E));
                            WDSButton wDSButton = this.A08;
                            if (wDSButton != null) {
                                C18310x6.A19(wDSButton, this, view2, 17);
                            }
                            A093.setText(AnonymousClass0x9.A13(this.A0C));
                            C64773Ex r5 = this.A01;
                            if (r5 != null) {
                                AnonymousClass3ZH A072 = r5.A07((C95814uZ) this.A0A.getValue());
                                if (A072 == null) {
                                    string = C08310eF.A09(this).getString(R.string.f11nameremoved);
                                } else {
                                    Object[] A0L = AnonymousClass002.A0L();
                                    AnonymousClass5ZU r4 = this.A02;
                                    if (r4 != null) {
                                        C18300x5.A1E(r4, A072, A0L, 0);
                                        string = C08310eF.A09(this).getString(R.string.f11nameremoved, A0L);
                                    } else {
                                        throw C18270x1.A0S("waContactNames");
                                    }
                                }
                                A094.setText(string);
                                C635439q.A00(findViewById, this, 15);
                                return;
                            }
                            throw C18270x1.A0S("contactManager");
                        }
                        throw C18270x1.A0S("emojiRichFormatterStaticCaller");
                    }
                    throw C18270x1.A0S("sharedPreferencesFactory");
                }
                throw C18270x1.A0S("whatsAppLocale");
            }
            throw C18270x1.A0S("systemServices");
        }
        throw C18270x1.A0S("emojiLoader");
    }

    public GroupJoinRequestReasonBottomSheetFragment() {
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A0A = C154517dI.A00(r1, new C80753yk(this));
        this.A0B = C154517dI.A00(r1, new C80763yl(this));
    }

    public int A1H() {
        return R.style.f12nameremoved;
    }
}
