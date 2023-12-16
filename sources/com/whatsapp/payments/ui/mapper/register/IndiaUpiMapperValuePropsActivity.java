package com.whatsapp.payments.ui.mapper.register;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass4TJ;
import X.AnonymousClass6C7;
import X.AnonymousClass8M7;
import X.AnonymousClass910;
import X.AnonymousClass97n;
import X.AnonymousClass9LV;
import X.C106715a2;
import X.C153527bU;
import X.C18270x1;
import X.C18290x4;
import X.C1891290c;
import X.C197109ca;
import X.C56972sr;
import X.C86964Mo;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.view.MenuItem;
import android.widget.TextView;
import com.whatsapp.Me;
import com.whatsapp.R;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.wds.components.button.WDSButton;

public final class IndiaUpiMapperValuePropsActivity extends AnonymousClass97n {
    public TextView A00;
    public TextView A01;
    public C197109ca A02;
    public C153527bU A03;
    public C106715a2 A04;
    public WDSButton A05;
    public WDSButton A06;

    public void onBackPressed() {
        super.onBackPressed();
        C197109ca r3 = this.A02;
        if (r3 != null) {
            Integer A0f = AnonymousClass001.A0f();
            r3.BKB(A0f, A0f, "alias_intro", AnonymousClass6C7.A0h(this));
            return;
        }
        throw C18270x1.A0S("fieldStatsLogger");
    }

    public void onCreate(Bundle bundle) {
        String str;
        String str2;
        super.onCreate(bundle);
        AnonymousClass6C7.A0y(this);
        setContentView((int) R.layout.f8nameremoved);
        this.A06 = (WDSButton) C18290x4.A0N(this, R.id.mapper_value_props_continue);
        this.A05 = (WDSButton) C18290x4.A0N(this, R.id.mapper_add_mobile_number);
        this.A00 = (TextView) C18290x4.A0N(this, R.id.mapper_create_custom_number);
        this.A01 = (TextView) C18290x4.A0N(this, R.id.recover_custom_number);
        TextEmojiLabel textEmojiLabel = (TextEmojiLabel) findViewById(R.id.mapper_value_props_sub_title);
        C106715a2 r7 = this.A04;
        if (r7 != null) {
            Context context = textEmojiLabel.getContext();
            C153527bU r0 = this.A03;
            if (r0 != null) {
                boolean A042 = r0.A04();
                int i = R.string.f11nameremoved;
                if (A042) {
                    i = R.string.f11nameremoved;
                }
                Object[] objArr = new Object[1];
                C56972sr r02 = this.A01;
                r02.A0P();
                Me me = r02.A00;
                if (me == null || (str = me.number) == null) {
                    str = "";
                }
                SpannableString A043 = r7.A04(context, AnonymousClass002.A0F(this, str, objArr, 0, i), new Runnable[]{new AnonymousClass8M7(this)}, new String[]{"learn-more"}, new String[]{"https://faq.whatsapp.com/general/payments/about-using-your-mobile-number-as-your-UPI-number"});
                textEmojiLabel.setAccessibilityHelper(new AnonymousClass4TJ(textEmojiLabel, this.A08));
                textEmojiLabel.setLinkHandler(new C86964Mo(this.A0D));
                textEmojiLabel.setText(A043);
                AnonymousClass9LV.A00(this, R.drawable.onboarding_actionbar_home_close);
                Intent intent = new Intent(this, IndiaUpiMapperLinkActivity.class);
                intent.putExtra("extra_payment_name", getIntent().getParcelableExtra("extra_payment_name"));
                intent.addFlags(33554432);
                WDSButton wDSButton = this.A06;
                if (wDSButton == null) {
                    throw C18270x1.A0S("continueButton");
                }
                wDSButton.setOnClickListener(new AnonymousClass910(intent, 4, this));
                WDSButton wDSButton2 = this.A05;
                if (wDSButton2 == null) {
                    throw C18270x1.A0S("addMobileNumberButton");
                }
                wDSButton2.setOnClickListener(new AnonymousClass910(intent, 5, this));
                onConfigurationChanged(AnonymousClass001.A0M(this));
                C197109ca r4 = this.A02;
                if (r4 != null) {
                    Intent intent2 = getIntent();
                    if (intent2 != null) {
                        str2 = intent2.getStringExtra("extra_referral_screen");
                    } else {
                        str2 = null;
                    }
                    r4.BKB(0, (Integer) null, "alias_intro", str2);
                    TextView textView = this.A00;
                    if (textView == null) {
                        throw C18270x1.A0S("createCustomNumberTextView");
                    }
                    C1891290c.A00(textView, this, 30);
                    TextView textView2 = this.A01;
                    if (textView2 == null) {
                        throw C18270x1.A0S("recoverCustomNumberTextView");
                    }
                    C1891290c.A00(textView2, this, 31);
                    C153527bU r03 = this.A03;
                    if (r03 != null) {
                        boolean A044 = r03.A04();
                        WDSButton wDSButton3 = this.A06;
                        if (wDSButton3 == null) {
                            throw C18270x1.A0S("continueButton");
                        }
                        wDSButton3.setVisibility(AnonymousClass001.A08(A044 ^ true ? 1 : 0));
                        WDSButton wDSButton4 = this.A05;
                        if (wDSButton4 == null) {
                            throw C18270x1.A0S("addMobileNumberButton");
                        }
                        wDSButton4.setVisibility(AnonymousClass001.A08(A044 ? 1 : 0));
                        TextView textView3 = this.A01;
                        if (textView3 == null) {
                            throw C18270x1.A0S("recoverCustomNumberTextView");
                        }
                        textView3.setVisibility(8);
                        TextView textView4 = this.A00;
                        if (textView4 == null) {
                            throw C18270x1.A0S("createCustomNumberTextView");
                        }
                        textView4.setVisibility(8);
                        if (A044) {
                            C153527bU r04 = this.A03;
                            if (r04 == null) {
                                throw C18270x1.A0S("indiaUpiMapperAliasManager");
                            } else if (r04.A00() != null) {
                                TextView textView5 = this.A01;
                                if (textView5 == null) {
                                    throw C18270x1.A0S("recoverCustomNumberTextView");
                                }
                                textView5.setVisibility(0);
                                TextView textView6 = this.A00;
                                if (textView6 == null) {
                                    throw C18270x1.A0S("createCustomNumberTextView");
                                }
                                textView6.setVisibility(4);
                            } else {
                                C153527bU r05 = this.A03;
                                if (r05 == null) {
                                    throw C18270x1.A0S("indiaUpiMapperAliasManager");
                                } else if (r05.A05()) {
                                    TextView textView7 = this.A00;
                                    if (textView7 == null) {
                                        throw C18270x1.A0S("createCustomNumberTextView");
                                    }
                                    textView7.setVisibility(0);
                                }
                            }
                        }
                    } else {
                        throw C18270x1.A0S("indiaUpiMapperAliasManager");
                    }
                } else {
                    throw C18270x1.A0S("fieldStatsLogger");
                }
            } else {
                throw C18270x1.A0S("indiaUpiMapperAliasManager");
            }
        } else {
            throw C18270x1.A0S("linkifier");
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            C197109ca r4 = this.A02;
            if (r4 != null) {
                r4.BKB(AnonymousClass001.A0f(), C18290x4.A0a(), "alias_intro", AnonymousClass6C7.A0h(this));
            } else {
                throw C18270x1.A0S("fieldStatsLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
