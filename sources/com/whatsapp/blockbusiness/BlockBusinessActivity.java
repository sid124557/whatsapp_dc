package com.whatsapp.blockbusiness;

import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1Ha;
import X.AnonymousClass1Hf;
import X.AnonymousClass1RT;
import X.AnonymousClass32Y;
import X.AnonymousClass3LP;
import X.AnonymousClass4HY;
import X.C08240dc;
import X.C107695bk;
import X.C18270x1;
import X.C18280x3;
import X.C18290x4;
import X.C49562gj;
import X.C57362tW;
import X.C64333Db;
import X.C88834as;
import X.C89644eZ;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.whatsapp.R;
import com.whatsapp.blockbusiness.blockreasonlist.BlockReasonListFragment;
import com.whatsapp.jid.UserJid;

public final class BlockBusinessActivity extends C89644eZ {
    public AnonymousClass3LP A00;
    public C49562gj A01;
    public UserJid A02;
    public String A03;
    public boolean A04;

    public void A5r() {
        if (!this.A04) {
            this.A04 = true;
            C88834as A0I = C18280x3.A0I(this);
            C64333Db r1 = A0I.A4Z;
            AnonymousClass1Hf.A2G(r1, this);
            C107695bk r0 = r1.A00;
            AnonymousClass1Ha.A23(r1, r0, r0, this);
            AnonymousClass1Ha.A24(r1, this);
            this.A00 = r1.Akp();
            this.A01 = A0I.ACa();
        }
    }

    public void onBackPressed() {
        C49562gj r3 = this.A01;
        if (r3 != null) {
            String str = this.A03;
            if (str == null) {
                throw C18270x1.A0S("entryPoint");
            }
            UserJid userJid = this.A02;
            if (userJid == null) {
                throw C18270x1.A0S("userJid");
            }
            r3.A00(userJid, str, 2);
            super.onBackPressed();
            return;
        }
        throw C18270x1.A0S("blockFunnelLogger");
    }

    public BlockBusinessActivity(int i) {
        this.A04 = false;
        AnonymousClass4HY.A00(this, 18);
    }

    public void onCreate(Bundle bundle) {
        String string;
        super.onCreate(bundle);
        setContentView((int) R.layout.f8nameremoved);
        String stringExtra = getIntent().getStringExtra("jid_extra");
        if (stringExtra != null) {
            boolean booleanExtra = getIntent().getBooleanExtra("third_party_bot", false);
            this.A02 = AnonymousClass32Y.A09(stringExtra);
            String stringExtra2 = getIntent().getStringExtra("entry_point_extra");
            if (stringExtra2 != null) {
                this.A03 = stringExtra2;
                C49562gj r3 = this.A01;
                if (r3 != null) {
                    UserJid userJid = this.A02;
                    if (userJid == null) {
                        throw C18270x1.A0S("userJid");
                    }
                    r3.A00(userJid, stringExtra2, 0);
                    UserJid userJid2 = this.A02;
                    if (userJid2 == null) {
                        throw C18270x1.A0S("userJid");
                    }
                    AnonymousClass3LP r0 = this.A00;
                    if (r0 != null) {
                        if (C57362tW.A00(r0, userJid2)) {
                            string = AnonymousClass1RT.A00(getApplicationContext(), R.string.f11nameremoved);
                        } else {
                            int i = R.string.f11nameremoved;
                            if (booleanExtra) {
                                i = R.string.f11nameremoved;
                            }
                            string = getString(i);
                        }
                        AnonymousClass0R8 supportActionBar = getSupportActionBar();
                        if (supportActionBar != null) {
                            supportActionBar.A0N(true);
                            supportActionBar.A0J(string);
                        }
                        if (bundle == null) {
                            Intent intent = getIntent();
                            C08240dc A0J = AnonymousClass0x2.A0J(this);
                            String str = this.A03;
                            if (str == null) {
                                throw C18270x1.A0S("entryPoint");
                            }
                            boolean booleanExtra2 = intent.getBooleanExtra("show_success_toast_extra", false);
                            boolean booleanExtra3 = intent.getBooleanExtra("from_spam_panel_extra", false);
                            boolean booleanExtra4 = intent.getBooleanExtra("show_report_upsell", false);
                            boolean booleanExtra5 = intent.getBooleanExtra("report_block_and_delete_contact", false);
                            boolean booleanExtra6 = intent.getBooleanExtra("should_launch_home_activity_post_block", false);
                            Bundle A08 = AnonymousClass002.A08();
                            A08.putString("jid", stringExtra);
                            A08.putString("entry_point", str);
                            A08.putBoolean("show_success_toast", booleanExtra2);
                            A08.putBoolean("from_spam_panel", booleanExtra3);
                            A08.putBoolean("show_report_upsell", booleanExtra4);
                            A08.putBoolean("report_block_and_delete_contact", booleanExtra5);
                            A08.putBoolean("should_launch_home_activity", booleanExtra6);
                            BlockReasonListFragment blockReasonListFragment = new BlockReasonListFragment();
                            blockReasonListFragment.A0u(A08);
                            A0J.A0A(blockReasonListFragment, R.id.container);
                            A0J.A03();
                            return;
                        }
                        return;
                    }
                    throw C18270x1.A0S("infraABProps");
                }
                throw C18270x1.A0S("blockFunnelLogger");
            }
            throw AnonymousClass001.A0c("Required value was null.");
        }
        throw AnonymousClass001.A0c("Required value was null.");
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (C18290x4.A04(menuItem) == 16908332) {
            C49562gj r3 = this.A01;
            if (r3 != null) {
                String str = this.A03;
                if (str == null) {
                    throw C18270x1.A0S("entryPoint");
                }
                UserJid userJid = this.A02;
                if (userJid == null) {
                    throw C18270x1.A0S("userJid");
                }
                r3.A00(userJid, str, 2);
            } else {
                throw C18270x1.A0S("blockFunnelLogger");
            }
        }
        return super.onOptionsItemSelected(menuItem);
    }

    public BlockBusinessActivity() {
        this(0);
    }
}
