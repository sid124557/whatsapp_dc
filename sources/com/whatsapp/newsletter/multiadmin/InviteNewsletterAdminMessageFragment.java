package com.whatsapp.newsletter.multiadmin;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0x7;
import X.AnonymousClass0x9;
import X.AnonymousClass1RL;
import X.AnonymousClass1VX;
import X.AnonymousClass31A;
import X.AnonymousClass340;
import X.AnonymousClass3ZH;
import X.AnonymousClass58H;
import X.AnonymousClass5ZU;
import X.AnonymousClass621;
import X.AnonymousClass669;
import X.AnonymousClass66R;
import X.C003203q;
import X.C06560Yg;
import X.C08310eF;
import X.C103605Nq;
import X.C105365Uq;
import X.C106715a2;
import X.C114015mM;
import X.C1229166i;
import X.C154517dI;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18300x5;
import X.C18310x6;
import X.C18320x8;
import X.C56982ss;
import X.C620733j;
import X.C627336j;
import X.C64773Ex;
import X.C66433Lk;
import X.C73743g0;
import X.C73783g4;
import X.C80833ys;
import X.C80843yt;
import X.C86614Ku;
import X.C86634Kw;
import X.C95814uZ;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.R;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.contact.picker.SelectedContactsList;
import com.whatsapp.jid.Jid;
import com.whatsapp.mentions.MentionableEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class InviteNewsletterAdminMessageFragment extends Hilt_InviteNewsletterAdminMessageFragment implements C1229166i {
    public C64773Ex A00;
    public AnonymousClass5ZU A01;
    public C105365Uq A02;
    public C114015mM A03;
    public SelectedContactsList A04;
    public C620733j A05;
    public C56982ss A06;
    public AnonymousClass1RL A07;
    public AnonymousClass1VX A08;
    public MentionableEntry A09;
    public C103605Nq A0A;
    public C66433Lk A0B;
    public C106715a2 A0C;
    public ArrayList A0D = AnonymousClass001.A0s();
    public final AnonymousClass66R A0E = AnonymousClass340.A00(this, "arg_from_contacts_picker");
    public final AnonymousClass66R A0F;
    public final AnonymousClass66R A0G;

    public View A0K(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C162457s7.A0J(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.f8nameremoved, viewGroup);
        C162457s7.A0D(inflate);
        return inflate;
    }

    public void A0w(Bundle bundle, View view) {
        String A0n;
        C162457s7.A0J(view, 0);
        super.A0w(bundle, view);
        Iterator A0q = C18320x8.A0q(this.A0F.getValue());
        while (A0q.hasNext()) {
            C95814uZ A0P = C18300x5.A0P(A0q);
            C64773Ex r0 = this.A00;
            if (r0 != null) {
                AnonymousClass3ZH A072 = r0.A07(A0P);
                if (A072 != null) {
                    A072.A0y = true;
                    this.A0D.add(A072);
                }
            } else {
                throw C18270x1.A0S("contactManager");
            }
        }
        TextView A092 = AnonymousClass002.A09(view, R.id.newsletter_name);
        AnonymousClass1RL r02 = this.A07;
        if (r02 == null) {
            throw C18270x1.A0S("newsletterInfo");
        }
        A092.setText(r02.A0H);
        MentionableEntry mentionableEntry = (MentionableEntry) C06560Yg.A02(view, R.id.admin_invite_caption);
        this.A09 = mentionableEntry;
        if (mentionableEntry != null) {
            Object[] objArr = new Object[1];
            AnonymousClass1RL r03 = this.A07;
            if (r03 == null) {
                throw C18270x1.A0S("newsletterInfo");
            }
            mentionableEntry.setText(AnonymousClass0x7.A0n(this, r03.A0H, objArr, 0, R.string.f11nameremoved));
        }
        C64773Ex r1 = this.A00;
        if (r1 != null) {
            AnonymousClass3ZH A073 = r1.A07((C95814uZ) this.A0G.getValue());
            if (A073 != null) {
                C105365Uq r12 = this.A02;
                if (r12 == null) {
                    throw C18270x1.A0S("contactPhotoLoader");
                }
                r12.A08(AnonymousClass0x9.A0F(view, R.id.newsletter_icon), A073);
            }
            ImageView A0F2 = AnonymousClass0x9.A0F(view, R.id.admin_invite_send_button);
            C620733j r2 = this.A05;
            if (r2 != null) {
                C86614Ku.A1B(C18310x6.A0G(A0F2.getContext(), R.drawable.input_send), A0F2, r2);
                C18300x5.A19(A0F2, this, 21);
                TextView A093 = AnonymousClass002.A09(view, R.id.admin_invite_title);
                AnonymousClass66R r4 = this.A0E;
                if (C18270x1.A1V(r4)) {
                    A0n = C08310eF.A09(this).getString(R.string.f11nameremoved);
                } else {
                    Object[] objArr2 = new Object[1];
                    AnonymousClass5ZU r13 = this.A01;
                    if (r13 != null) {
                        A0n = AnonymousClass0x7.A0n(this, C18300x5.A0h(r13, (AnonymousClass3ZH) this.A0D.get(0)), objArr2, 0, R.string.f11nameremoved);
                    } else {
                        throw C18270x1.A0S("waContactNames");
                    }
                }
                A093.setText(A0n);
                C18300x5.A19(view.findViewById(R.id.admin_invite_close_button), this, 22);
                if (C18270x1.A1V(r4)) {
                    View A0M = C86634Kw.A0M((ViewStub) C18280x3.A0E(view, R.id.selected_list_stub), R.layout.f8nameremoved);
                    C162457s7.A0K(A0M, "null cannot be cast to non-null type com.whatsapp.contact.picker.SelectedContactsList");
                    SelectedContactsList selectedContactsList = (SelectedContactsList) A0M;
                    this.A04 = selectedContactsList;
                    if (selectedContactsList != null) {
                        selectedContactsList.A08 = this;
                        selectedContactsList.A09 = this.A0D;
                        selectedContactsList.setVisibility(0);
                    }
                    SelectedContactsList selectedContactsList2 = this.A04;
                    if (selectedContactsList2 != null) {
                        C18280x3.A0E(selectedContactsList2, R.id.selected_items_divider).setVisibility(8);
                        return;
                    }
                    return;
                }
                View A0M2 = C86634Kw.A0M((ViewStub) C18280x3.A0E(view, R.id.invite_info_stub), R.layout.f8nameremoved);
                C162457s7.A0K(A0M2, "null cannot be cast to non-null type com.whatsapp.WaTextView");
                TextView textView = (TextView) A0M2;
                C106715a2 r6 = this.A0C;
                if (r6 != null) {
                    Context context = view.getContext();
                    Object[] A0L = AnonymousClass002.A0L();
                    C66433Lk r14 = this.A0B;
                    if (r14 != null) {
                        textView.setText(r6.A03(context, AnonymousClass0x7.A0n(this, r14.A03("360977646301595"), A0L, 0, R.string.f11nameremoved)));
                        AnonymousClass1VX r04 = this.A08;
                        if (r04 != null) {
                            C18270x1.A0q(textView, r04);
                            return;
                        }
                        throw C18270x1.A0R();
                    }
                    throw C18270x1.A0S("faqLinkFactory");
                }
                throw C18270x1.A0S("linkifier");
            }
            throw C18270x1.A0S("whatsAppLocale");
        }
        throw C18270x1.A0S("contactManager");
    }

    public void Ayk(AnonymousClass3ZH r6) {
        AnonymousClass669 r1;
        C162457s7.A0J(r6, 0);
        C003203q A0Q = A0Q();
        if ((A0Q instanceof AnonymousClass669) && (r1 = (AnonymousClass669) A0Q) != null) {
            r1.BPt(r6);
        }
        ArrayList arrayList = this.A0D;
        arrayList.remove(r6);
        if (arrayList.isEmpty()) {
            A1K();
            return;
        }
        SelectedContactsList selectedContactsList = this.A04;
        if (selectedContactsList != null) {
            selectedContactsList.A09 = arrayList;
        }
        AnonymousClass66R r4 = this.A0F;
        List list = (List) r4.getValue();
        AnonymousClass621 r12 = new AnonymousClass621(r6);
        C162457s7.A0J(list, 0);
        C73743g0.A0Z(list, r12, true);
        SelectedContactsList selectedContactsList2 = this.A04;
        if (selectedContactsList2 != null) {
            Iterable<Jid> iterable = (Iterable) r4.getValue();
            ArrayList A0c = C73783g4.A0c(iterable);
            for (Jid A022 : iterable) {
                A0c.add(C627336j.A02(A022));
            }
            if (!A0c.isEmpty()) {
                selectedContactsList2.A07.A05();
            }
        }
    }

    public void Bb8() {
    }

    public void Bb9() {
    }

    public void Bs7() {
    }

    public InviteNewsletterAdminMessageFragment() {
        AnonymousClass58H r1 = AnonymousClass58H.NONE;
        this.A0F = C154517dI.A00(r1, new C80843yt(this));
        this.A0G = C154517dI.A00(r1, new C80833ys(this));
    }

    public void A0c() {
        super.A0c();
        this.A04 = null;
    }

    public void A0p(Bundle bundle) {
        super.A0p(bundle);
        if (((List) this.A0F.getValue()).isEmpty()) {
            A1K();
            return;
        }
        C56982ss r1 = this.A06;
        if (r1 != null) {
            AnonymousClass31A A002 = C56982ss.A00(r1, (C95814uZ) this.A0G.getValue());
            C162457s7.A0K(A002, "null cannot be cast to non-null type com.whatsapp.data.NewsletterInfo");
            this.A07 = (AnonymousClass1RL) A002;
            C114015mM r2 = this.A03;
            if (r2 != null) {
                this.A02 = r2.A04(A0G(), this, "AddNewsletterAdminInviteFragment");
                return;
            }
            throw C18270x1.A0S("contactPhotos");
        }
        throw C18270x1.A0S("chatsCache");
    }

    public void B1w(ThumbnailButton thumbnailButton, AnonymousClass3ZH r3, boolean z) {
        C18260x0.A0O(r3, thumbnailButton);
        C105365Uq r0 = this.A02;
        if (r0 == null) {
            throw C18270x1.A0S("contactPhotoLoader");
        }
        r0.A08(thumbnailButton, r3);
    }
}
