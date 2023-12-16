package com.whatsapp.inappsupport.ui;

import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass4SG;
import X.AnonymousClass5Yj;
import X.AnonymousClass66R;
import X.AnonymousClass8WO;
import X.AnonymousClass8YE;
import X.C07890cz;
import X.C106715a2;
import X.C107335b8;
import X.C107695bk;
import X.C1216861m;
import X.C1216961n;
import X.C1217061o;
import X.C154517dI;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C18320x8;
import X.C53602nM;
import X.C54322oX;
import X.C631938h;
import X.C635439q;
import X.C64333Db;
import X.C70003Zm;
import X.C86604Kt;
import X.C86664Kz;
import X.C89644eZ;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class ContactUsWithAiActivity extends C89644eZ {
    public TextEmojiLabel A00;
    public C53602nM A01;
    public C631938h A02;
    public C54322oX A03;
    public C106715a2 A04;
    public WDSButton A05;
    public boolean A06;
    public final AnonymousClass66R A07;

    public void A5r() {
        if (!this.A06) {
            this.A06 = true;
            C64333Db A2Y = AnonymousClass4SG.A2Y(this);
            AnonymousClass4SG.A3W(A2Y, this);
            C107695bk r1 = A2Y.A00;
            AnonymousClass4SG.A3Q(A2Y, r1, this, AnonymousClass4SG.A2t(A2Y, r1, this));
            this.A04 = C18280x3.A0Q(r1);
            this.A01 = C18280x3.A0L(r1);
            this.A03 = (C54322oX) A2Y.AXY.get();
        }
    }

    public final C54322oX A74() {
        C54322oX r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        throw C18270x1.A0S("supportLogger");
    }

    public final void A75() {
        C631938h r3 = this.A02;
        Intent A072 = C18320x8.A07();
        A072.setClassName(getPackageName(), "com.whatsapp.inappsupport.ui.ContactUsActivity");
        A072.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", "ContactUsWithAi:fallback:email");
        A072.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", (String) null);
        if (r3 != null) {
            A072.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext", r3);
        }
        A6T(A072, true);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (menu != null) {
            if (menu instanceof C07890cz) {
                ((C07890cz) menu).A0H = true;
            }
            getMenuInflater().inflate(R.menu.f10nameremoved, menu);
            Drawable A032 = C107335b8.A03(this, R.drawable.vec_email_unfilled, R.color.f5nameremoved);
            MenuItem findItem = menu.findItem(R.id.menu_contact_us_via_email);
            if (findItem != null) {
                findItem.setIcon(A032);
            }
        }
        return super.onCreateOptionsMenu(menu);
    }

    public ContactUsWithAiActivity(int i) {
        this.A06 = false;
        C86604Kt.A1K(this, 51);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        AnonymousClass0R8 supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0N(true);
            supportActionBar.A0J(getString(R.string.f11nameremoved));
        }
        this.A02 = (C631938h) getIntent().getParcelableExtra("com.whatsapp.inappsupport.ui.ContactUsWithAiActivity.supportUserContext");
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) C18290x4.A0L(this, R.id.textView_information_about_reviewing_data);
        this.A00 = textEmojiLabel;
        C106715a2 r5 = this.A04;
        if (r5 == null) {
            throw C18270x1.A0S("linkifier");
        } else if (textEmojiLabel == null) {
            throw C18270x1.A0S("informationAboutReviewingDataTextView");
        } else {
            Context context = textEmojiLabel.getContext();
            TextEmojiLabel textEmojiLabel2 = this.A00;
            if (textEmojiLabel2 == null) {
                throw C18270x1.A0S("informationAboutReviewingDataTextView");
            }
            String A1K = C86664Kz.A1K(textEmojiLabel2);
            TextEmojiLabel textEmojiLabel3 = this.A00;
            if (textEmojiLabel3 == null) {
                throw C18270x1.A0S("informationAboutReviewingDataTextView");
            }
            SpannableStringBuilder A062 = r5.A06(context, new C70003Zm(this, 35), A1K, "learn-more", AnonymousClass5Yj.A02(textEmojiLabel3.getContext(), R.attr.f3nameremoved, R.color.f5nameremoved));
            TextEmojiLabel textEmojiLabel4 = this.A00;
            if (textEmojiLabel4 == null) {
                throw C18270x1.A0S("informationAboutReviewingDataTextView");
            }
            AnonymousClass0x2.A14(this.A0D, textEmojiLabel4);
            TextEmojiLabel textEmojiLabel5 = this.A00;
            if (textEmojiLabel5 == null) {
                throw C18270x1.A0S("informationAboutReviewingDataTextView");
            }
            textEmojiLabel5.setText(A062);
            WDSButton wDSButton = (WDSButton) C18290x4.A0L(this, R.id.button_start_chat);
            C635439q.A00(wDSButton, this, 35);
            this.A05 = wDSButton;
            C18290x4.A1A(this, C86664Kz.A0u(this, R.id.imageView_chat_with_support), R.drawable.vec_chat_with_support);
            AnonymousClass66R r3 = this.A07;
            C86604Kt.A1N(this, ((ContactUsWithAiViewModel) r3.getValue()).A03, new AnonymousClass8YE(this), 258);
            C86604Kt.A1N(this, ((ContactUsWithAiViewModel) r3.getValue()).A02, new C1216861m(this), 259);
            C86604Kt.A1N(this, ((ContactUsWithAiViewModel) r3.getValue()).A0C, new C1216961n(this), 260);
            C86604Kt.A1N(this, ((ContactUsWithAiViewModel) r3.getValue()).A0B, new C1217061o(this), 261);
            A74().A01(9, (String) null);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == R.id.menu_contact_us_via_email) {
            A75();
            A74().A01(3, (String) null);
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public ContactUsWithAiActivity() {
        this(0);
        this.A07 = C154517dI.A01(new AnonymousClass8WO(this));
    }
}
