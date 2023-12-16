package com.whatsapp.xfamily.groups.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass0x2;
import X.AnonymousClass1Hf;
import X.AnonymousClass29Q;
import X.AnonymousClass2J4;
import X.AnonymousClass31C;
import X.AnonymousClass345;
import X.AnonymousClass3TU;
import X.AnonymousClass3ZH;
import X.AnonymousClass493;
import X.AnonymousClass4AT;
import X.AnonymousClass4SG;
import X.AnonymousClass5IE;
import X.AnonymousClass5QN;
import X.AnonymousClass5ZU;
import X.AnonymousClass68W;
import X.C106905aM;
import X.C107695bk;
import X.C111095hX;
import X.C111145hc;
import X.C162457s7;
import X.C18260x0;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18310x6;
import X.C18320x8;
import X.C183538qC;
import X.C27991fJ;
import X.C28011fL;
import X.C56072rN;
import X.C56952sp;
import X.C624134x;
import X.C64333Db;
import X.C66493Lq;
import X.C69263Wi;
import X.C71303bt;
import X.C71563cJ;
import X.C72343dZ;
import X.C86654Ky;
import X.C88834as;
import X.C89634eX;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import com.facebook.msys.mci.DefaultCrypto;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

public final class LinkExistingGroupActivity extends C89634eX implements AnonymousClass493, AnonymousClass4AT {
    public C27991fJ A00;
    public AnonymousClass5IE A01;
    public AnonymousClass2J4 A02;
    public C111145hc A03;
    public C183538qC A04;
    public C183538qC A05;
    public C183538qC A06;
    public C183538qC A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public Map A0D;
    public boolean A0E;

    public void A7O(AnonymousClass5QN r5, AnonymousClass3ZH r6) {
        TextEmojiLabel textEmojiLabel = r5.A02;
        C86654Ky.A1F(textEmojiLabel);
        if (r6.A0U()) {
            textEmojiLabel.setVisibility(0);
            AnonymousClass5ZU r2 = this.A0D;
            Jid A0I = r6.A0I(C28011fL.class);
            C162457s7.A0K(A0I, "null cannot be cast to non-null type com.whatsapp.jid.MultipleParticipantJid");
            textEmojiLabel.A0K((List) null, C18320x8.A0e(A0I, r2.A0D));
            r5.A01(r6.A0y);
            return;
        }
        super.A7O(r5, r6);
    }

    public void Ayk(AnonymousClass3ZH r3) {
        C162457s7.A0J(r3, 0);
        C111145hc r1 = this.A03;
        if (r1 == null) {
            throw C18270x1.A0S("xFamilyUserFlowLogger");
        }
        r1.A05("TAP_EXISTING_GROUP");
        super.Ayk(r3);
    }

    public void BkF() {
        A7e(true);
    }

    public void A5r() {
        if (!this.A0E) {
            this.A0E = true;
            C88834as A2W = AnonymousClass4SG.A2W(this);
            C64333Db r2 = A2W.A4Z;
            AnonymousClass4SG.A3W(r2, this);
            C107695bk r1 = r2.A00;
            AnonymousClass4SG.A3Q(r2, r1, this, AnonymousClass4SG.A2t(r2, r1, this));
            AnonymousClass4SG.A3T(r2, r1, this);
            AnonymousClass4SG.A3M(A2W, r2, this, r2.A6O.get());
            this.A04 = C72343dZ.A00(r2.A5B);
            this.A07 = C72343dZ.A00(r2.AKw);
            this.A06 = C72343dZ.A00(r2.AGN);
            this.A05 = C72343dZ.A00(r2.AGL);
            this.A02 = (AnonymousClass2J4) r2.Abw.get();
            this.A0D = r1.AQT();
        }
    }

    public final void A7c() {
        AnonymousClass5IE r3 = this.A01;
        if (r3 != null) {
            r3.A00.set(true);
            r3.A01.BkS(new C71303bt(r3, 8));
        }
        Intent A072 = C18320x8.A07();
        A072.putExtra("is_success", true);
        A072.putExtra("selected_group_name", this.A0C);
        A072.putExtra("selected_group_link", this.A0B);
        String str = this.A08;
        if (str == null) {
            throw C18270x1.A0S("eventId");
        }
        A072.putExtra("event_id", str);
        setResult(-1, A072);
        A7d();
    }

    public final void A7d() {
        C111145hc r1 = this.A03;
        if (r1 == null) {
            throw C18270x1.A0S("xFamilyUserFlowLogger");
        }
        r1.A05("REDIRECT_TO_FB");
        if (AnonymousClass345.A00(this, "com.facebook.katana") == -1 && AnonymousClass345.A00(this, "com.facebook.wakizashi") == -1) {
            Log.w("LinkExistingGroupActivity/redirectToFB FB app not found");
            C111145hc r12 = this.A03;
            if (r12 == null) {
                throw C18270x1.A0S("xFamilyUserFlowLogger");
            }
            r12.A03("EXIT_GROUP_SELECTION");
            this.A05.A0H(R.string.f11nameremoved, 0);
        } else {
            C111095hX r3 = this.A00;
            StringBuilder A0o = AnonymousClass001.A0o();
            A0o.append("fb://event/");
            String str = this.A08;
            if (str == null) {
                throw C18270x1.A0S("eventId");
            }
            A0o.append(URLEncoder.encode(str, DefaultCrypto.UTF_8));
            A0o.append("?wa_invite_uri=");
            A0o.append(URLEncoder.encode(this.A0B, DefaultCrypto.UTF_8));
            A0o.append("&wa_group_name=");
            String A0X = AnonymousClass000.A0X(URLEncoder.encode(this.A0C, DefaultCrypto.UTF_8), A0o);
            C162457s7.A0D(A0X);
            C18260x0.A0s("LinkExistingGroupActivity/generateFBDeeplink generated: ", A0X, AnonymousClass001.A0o());
            r3.BkW(this, Uri.parse(A0X), (C624134x) null);
            C111145hc r0 = this.A03;
            if (r0 == null) {
                throw C18270x1.A0S("xFamilyUserFlowLogger");
            }
            r0.A01();
        }
        finishAndRemoveTask();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 11) {
            if (i != 150) {
                super.onActivityResult(i, i2, intent);
            } else if (i2 != -1) {
                Log.i("LinkExistingGroupActivity/contact access permissions denied");
                C111145hc r1 = this.A03;
                if (r1 == null) {
                    throw C18270x1.A0S("xFamilyUserFlowLogger");
                }
                r1.A05("SEE_NO_CONTACT_ACCESS");
                finish();
            }
        } else if (i2 == -1 && intent != null) {
            C27991fJ A072 = C27991fJ.A01.A07(intent.getStringExtra("group_jid"));
            C18260x0.A1R(C18290x4.A0u(A072), "LinkExistingGroupActivity/group created ", A072);
            AnonymousClass3ZH A0A2 = this.A0B.A0A(A072);
            this.A0f.clear();
            super.Ayk(A0A2);
        }
    }

    public LinkExistingGroupActivity(int i) {
        this.A0E = false;
        AnonymousClass68W.A00(this, 118);
    }

    public void A7L(View view, View view2, View view3, View view4) {
        super.A7L(view, view2, view3, view4);
        C18270x1.A0p(view3);
        addNewGroupCreationHeader(view4);
    }

    public final void A7e(boolean z) {
        AnonymousClass5IE r0;
        C18260x0.A1E("LinkExistingGroupActivity/sendGetLink/recreate:", AnonymousClass001.A0o(), z);
        C27991fJ r4 = this.A00;
        if (r4 != null) {
            if (z && (r0 = this.A01) != null) {
                r0.A01.A0T(new C71563cJ(r0), 500);
            }
            C69263Wi r2 = this.A05;
            C183538qC r02 = this.A07;
            if (r02 != null) {
                new AnonymousClass3TU(r2, this, (AnonymousClass31C) r02.get(), z).A00(r4);
                return;
            }
            throw C18270x1.A0S("messageClient");
        }
        Log.e("LinkExistingGroupActivity/sendGetLink/inviteCode empty");
    }

    public void BV9(int i, String str, boolean z) {
        String A0V;
        StringBuilder A0o = AnonymousClass001.A0o();
        if (str != null) {
            A0o.append("LinkExistingGroupActivity/onLinkReceived/gotcode/");
            A0o.append(str);
            C18260x0.A1E(" recreate:", A0o, z);
            C27991fJ r1 = this.A00;
            if (r1 != null) {
                C183538qC r0 = this.A05;
                if (r0 != null) {
                    ((C66493Lq) r0.get()).A1F.put(r1, str);
                } else {
                    throw C18270x1.A0S("groupChatManager");
                }
            }
            this.A0A = str;
            if (str.length() == 0) {
                A0V = null;
            } else {
                A0V = AnonymousClass000.A0V("https://chat.whatsapp.com/", str, AnonymousClass001.A0o());
            }
            this.A0B = A0V;
            A7c();
            return;
        }
        C18260x0.A0y("LinkExistingGroupActivity/onLinkReceived/failed/", A0o, i);
        if (i == 436) {
            C27991fJ r12 = this.A00;
            if (r12 != null) {
                C183538qC r02 = this.A05;
                if (r02 != null) {
                    ((C66493Lq) r02.get()).A1F.remove(r12);
                    return;
                }
                throw C18270x1.A0S("groupChatManager");
            }
            return;
        }
        AnonymousClass5IE r3 = this.A01;
        if (r3 != null) {
            r3.A00.set(true);
            r3.A01.BkS(new C71303bt(r3, 8));
        }
        C183538qC r03 = this.A06;
        if (r03 != null) {
            this.A05.A0H(AnonymousClass29Q.A00(i, ((C56072rN) r03.get()).A06(this.A00)), 0);
            String str2 = this.A0A;
            if (str2 == null || str2.length() == 0) {
                A7d();
                return;
            }
            return;
        }
        throw C18270x1.A0S("groupChatUtils");
    }

    public final void addNewGroupCreationHeader(View view) {
        ViewParent viewParent;
        View A0I = C18310x6.A0I(getLayoutInflater(), this.A04, R.layout.f8nameremoved, false);
        TextView A0I2 = AnonymousClass0x2.A0I(A0I, R.id.link_existing_group_picker_title);
        C106905aM.A04(A0I2);
        A0I2.setText(R.string.f11nameremoved);
        View A0E2 = C18280x3.A0E(A0I, R.id.add_groups_new_group);
        C18320x8.A14(A0E2, this, 30);
        C106905aM.A04(AnonymousClass0x2.A0I(A0E2, R.id.create_new_group_text));
        if (view != null) {
            viewParent = view.getParent();
        } else {
            viewParent = null;
        }
        ViewGroup viewGroup = (ViewGroup) viewParent;
        if (viewGroup != null) {
            viewGroup.addView(A0I, 0);
        }
    }

    public void onBackPressed() {
        A7G();
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        Map map = this.A0D;
        if (map != null) {
            Object A0i = AnonymousClass001.A0i(map, 1004342578);
            if (A0i != null) {
                C111145hc r2 = (C111145hc) A0i;
                this.A03 = r2;
                r2.A02(1004342578, (String) null, "INIT_GROUP_SELECTION");
                boolean z = false;
                if (!(getIntent() == null || (stringExtra = getIntent().getStringExtra("event_id")) == null || stringExtra.length() == 0)) {
                    AnonymousClass2J4 r0 = this.A02;
                    if (r0 != null) {
                        z = C56952sp.A0K(r0.A00, 3989, false);
                    } else {
                        throw C18270x1.A0S("xFamilyGating");
                    }
                }
                if (!z) {
                    setResult(-1, C18320x8.A07().putExtra("is_success", false));
                    Log.w("LinkExistingGroupActivity/onCreate invalid request");
                    C111145hc r02 = this.A03;
                    if (r02 == null) {
                        throw C18270x1.A0S("xFamilyUserFlowLogger");
                    }
                    r02.A03("EXIT_GROUP_SELECTION");
                    finish();
                }
                if (!this.A09.A02()) {
                    Log.w("LinkExistingGroupActivity/onCreate registration");
                    C111145hc r03 = this.A03;
                    if (r03 == null) {
                        throw C18270x1.A0S("xFamilyUserFlowLogger");
                    }
                    r03.A03("EXIT_GROUP_SELECTION");
                    AnonymousClass4SG.A36(this);
                }
                if (AnonymousClass1Hf.A27(this).contains("tos_2016_opt_out_state") && C18280x3.A1W(AnonymousClass0x2.A0F(this.A09), "tos_2016_opt_out_state")) {
                    Log.w("LinkExistingGroupActivity/onCreate opt out");
                    C111145hc r04 = this.A03;
                    if (r04 == null) {
                        throw C18270x1.A0S("xFamilyUserFlowLogger");
                    }
                    r04.A03("EXIT_GROUP_SELECTION");
                    finish();
                }
                this.A08 = String.valueOf(getIntent().getStringExtra("event_id"));
                this.A09 = getIntent().getStringExtra("event_name");
                C69263Wi r1 = this.A05;
                C162457s7.A0C(r1);
                this.A01 = new AnonymousClass5IE(r1);
                C111145hc r12 = this.A03;
                if (r12 == null) {
                    throw C18270x1.A0S("xFamilyUserFlowLogger");
                }
                r12.A05("SEE_GROUP_SELECTION");
                return;
            }
            throw C18290x4.A0Y();
        }
        throw C18270x1.A0S("xFamilyUserFlowLoggers");
    }

    public LinkExistingGroupActivity() {
        this(0);
    }
}
