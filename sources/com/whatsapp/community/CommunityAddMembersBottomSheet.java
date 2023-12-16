package com.whatsapp.community;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass29Q;
import X.AnonymousClass31C;
import X.AnonymousClass33p;
import X.AnonymousClass3TU;
import X.AnonymousClass4AT;
import X.AnonymousClass58H;
import X.AnonymousClass5V0;
import X.AnonymousClass66R;
import X.C08310eF;
import X.C1001059l;
import X.C109455ee;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C19340zH;
import X.C27991fJ;
import X.C29441ip;
import X.C52882mC;
import X.C56942so;
import X.C66493Lq;
import X.C69263Wi;
import X.C80183xp;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;

public final class CommunityAddMembersBottomSheet extends Hilt_CommunityAddMembersBottomSheet implements AnonymousClass4AT {
    public LinearLayout A00;
    public LinearLayout A01;
    public LinearLayout A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public C69263Wi A06;
    public C56942so A07;
    public C29441ip A08;
    public AnonymousClass33p A09;
    public C66493Lq A0A;
    public AnonymousClass31C A0B;
    public String A0C;
    public final AnonymousClass66R A0D = C154517dI.A00(AnonymousClass58H.NONE, new C80183xp(this));

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        return layoutInflater.inflate(R.layout.f8nameremoved, viewGroup, false);
    }

    public void A0w(Bundle bundle, View view) {
        LinearLayout linearLayout;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Context A1D = A1D();
        if (A1D != null) {
            C29441ip r0 = this.A08;
            if (r0 == null) {
                throw C18270x1.A0S("connectivityStateProvider");
            } else if (!r0.A0F()) {
                Log.e("CommunityAddMembersBottomSheet/ no network access");
                C19340zH A002 = AnonymousClass5V0.A00(A1D);
                A002.A0g(C08310eF.A09(this).getString(R.string.f11nameremoved));
                C19340zH.A02(this, A002);
                A002.A0S();
                A1K();
                return;
            }
        }
        AnonymousClass002.A09(view, R.id.community_add_members_title).setText(R.string.f11nameremoved);
        if (C1001059l.A04) {
            AnonymousClass0x9.A0F(view, R.id.add_member_image).setImageResource(R.drawable.ic_voip_add_person_filled_wds);
        }
        TextView A092 = AnonymousClass002.A09(A0J(), R.id.add_members_action_item_text);
        this.A03 = A092;
        if (A092 != null) {
            A092.setText(R.string.f11nameremoved);
        }
        this.A00 = (LinearLayout) A0J().findViewById(R.id.add_members_action);
        C56942so r02 = this.A07;
        if (r02 != null) {
            AnonymousClass66R r4 = this.A0D;
            C52882mC A003 = r02.A0H.A00((C27991fJ) r4.getValue());
            GroupJid groupJid = null;
            if (A003 != null) {
                groupJid = A003.A02;
            }
            if (!(!(groupJid instanceof C27991fJ) || groupJid == null || (linearLayout = this.A00) == null)) {
                C18290x4.A1I(linearLayout, this, groupJid, 16);
            }
            C66493Lq r03 = this.A0A;
            if (r03 != null) {
                String A0o = C18310x6.A0o(r4.getValue(), r03.A1F);
                if (A0o == null) {
                    Log.i("CommunityAddMembersBottomSheet/invitelink/sendgetlink");
                    C69263Wi r3 = this.A06;
                    if (r3 != null) {
                        AnonymousClass31C r2 = this.A0B;
                        if (r2 != null) {
                            new AnonymousClass3TU(r3, this, r2, false).A00((C27991fJ) r4.getValue());
                            return;
                        }
                        throw C18270x1.A0S("messageClient");
                    }
                    throw C18270x1.A0S("globalUI");
                }
                A1Y(A0o);
                return;
            }
            throw C18270x1.A0S("groupChatManager");
        }
        throw C18270x1.A0S("communityChatManager");
    }

    public void A0a() {
        LinearLayout linearLayout = this.A01;
        if (linearLayout != null) {
            linearLayout.setOnClickListener((View.OnClickListener) null);
        }
        this.A01 = null;
        this.A04 = null;
        LinearLayout linearLayout2 = this.A00;
        if (linearLayout2 != null) {
            linearLayout2.setOnClickListener((View.OnClickListener) null);
        }
        this.A00 = null;
        this.A03 = null;
        LinearLayout linearLayout3 = this.A02;
        if (linearLayout3 != null) {
            linearLayout3.setOnClickListener((View.OnClickListener) null);
        }
        this.A02 = null;
        this.A05 = null;
        super.A0a();
    }

    public void A0k(int i, int i2, Intent intent) {
        if (i != 105 && i != 106) {
            return;
        }
        if (i2 == -1) {
            A1K();
        } else if (i2 == 0) {
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("CommunityAddMembersBottomSheet/ ");
            A0o.append(i);
            C18260x0.A1J(A0o, " result canceled");
        }
    }

    public final void A1Y(String str) {
        if (this.A0B != null) {
            this.A0C = AnonymousClass000.A0V("https://chat.whatsapp.com/", str, AnonymousClass001.A0o());
            TextView A092 = AnonymousClass002.A09(A0J(), R.id.link);
            this.A04 = A092;
            if (A092 != null) {
                String str2 = this.A0C;
                if (str2 == null) {
                    throw C18270x1.A0S("linkUri");
                }
                A092.setText(str2);
            }
            this.A01 = (LinearLayout) A0J().findViewById(R.id.link_btn);
            int dimensionPixelSize = C08310eF.A09(this).getDimensionPixelSize(R.dimen.f6nameremoved);
            LinearLayout linearLayout = this.A01;
            if (linearLayout != null) {
                linearLayout.setPadding(linearLayout.getPaddingLeft(), dimensionPixelSize, linearLayout.getPaddingRight(), dimensionPixelSize);
            }
            LinearLayout linearLayout2 = this.A01;
            if (linearLayout2 != null) {
                C18320x8.A13(linearLayout2, this, 25);
            }
            this.A05 = AnonymousClass002.A09(A0J(), R.id.share_link_action_item_text);
            String string = C08310eF.A09(this).getString(R.string.f11nameremoved);
            C162457s7.A0D(string);
            TextView textView = this.A05;
            if (textView != null) {
                textView.setText(C18310x6.A0m(this, string, R.string.f11nameremoved));
            }
            this.A02 = (LinearLayout) A0J().findViewById(R.id.share_via_whatsapp_action);
            Object[] objArr = new Object[1];
            String str3 = this.A0C;
            if (str3 == null) {
                throw C18270x1.A0S("linkUri");
            }
            String A0n = AnonymousClass0x7.A0n(this, str3, objArr, 0, R.string.f11nameremoved);
            C162457s7.A0D(A0n);
            LinearLayout linearLayout3 = this.A02;
            if (linearLayout3 != null) {
                linearLayout3.setOnClickListener(new C109455ee(5, A0n, this));
            }
        }
    }

    public void BV9(int i, String str, boolean z) {
        StringBuilder A0o = AnonymousClass001.A0o();
        if (str != null) {
            C18260x0.A0s("CommunityAddMembersBottomSheet/invitelink/gotcode/", str, A0o);
            C66493Lq r2 = this.A0A;
            if (r2 != null) {
                r2.A1F.put(this.A0D.getValue(), str);
                A1Y(str);
                return;
            }
            throw C18270x1.A0S("groupChatManager");
        }
        C18260x0.A0y("CommunityAddMembersBottomSheet/invitelink/failed/", A0o, i);
        int A002 = AnonymousClass29Q.A00(i, true);
        C69263Wi r1 = this.A06;
        if (r1 != null) {
            r1.A0F(A002, 0);
            return;
        }
        throw C18270x1.A0S("globalUI");
    }

    public void onCancel(DialogInterface dialogInterface) {
        A1K();
    }
}
