package com.whatsapp.inappsupport.ui;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass002;
import X.AnonymousClass0R8;
import X.AnonymousClass0x2;
import X.AnonymousClass1G7;
import X.AnonymousClass5WY;
import X.C005205m;
import X.C08240dc;
import X.C08270df;
import X.C108955dq;
import X.C15070qj;
import X.C18260x0;
import X.C18300x5;
import X.C379524r;
import X.C53202mi;
import X.C631938h;
import X.C635439q;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.whatsapp.R;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SupportTopicsActivity extends AnonymousClass1G7 implements C15070qj {
    public int A00;
    public int A01;
    public MenuItem A02;
    public AnonymousClass5WY A03;
    public C53202mi A04;
    public List A05;

    public void A74(C108955dq r14) {
        int i = this.A00;
        if (i == 1 || i == 2) {
            AnonymousClass0x2.A0m(this, C379524r.A00(getIntent()));
            return;
        }
        ArrayList A0p = AnonymousClass000.A0p(this.A05);
        ArrayList A0p2 = AnonymousClass000.A0p(this.A05);
        for (int i2 = 0; i2 < this.A05.size(); i2++) {
            if (((SupportTopicsFragment) this.A05.get(i2)).A00 != null) {
                C108955dq r1 = ((SupportTopicsFragment) this.A05.get(i2)).A00;
                A0p.add(r1.A03);
                A0p2.add(r1.A02);
            }
        }
        if (r14 != null) {
            A0p.add(r14.A03);
            A0p2.add(r14.A02);
        }
        Bundle bundleExtra = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
        Objects.requireNonNull(bundleExtra);
        String string = bundleExtra.getString("com.whatsapp.support.DescribeProblemActivity.from");
        AnonymousClass5WY r3 = this.A03;
        boolean A002 = this.A04.A00();
        if (string == null) {
            string = "support_topics";
        }
        Bundle bundleExtra2 = getIntent().getBundleExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.describe_problem_bundle");
        Objects.requireNonNull(bundleExtra2);
        startActivity(r3.A00(this, bundleExtra2, (C631938h) null, (Integer) null, string, (String) null, A0p2, A0p, A002));
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 15 && i2 == -1) {
            setResult(-1, C379524r.A00(getIntent()));
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    public void onBackPressed() {
        boolean z;
        if (!this.A05.isEmpty()) {
            List list = this.A05;
            list.remove(AnonymousClass002.A03(list));
            if (!this.A05.isEmpty()) {
                SupportTopicsFragment supportTopicsFragment = (SupportTopicsFragment) C18300x5.A0c(this.A05);
                MenuItem menuItem = this.A02;
                if (menuItem != null) {
                    C108955dq r0 = supportTopicsFragment.A00;
                    if (r0 != null) {
                        z = r0.A06;
                    } else {
                        z = false;
                    }
                    menuItem.setVisible(z);
                }
            }
        }
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (this.A01 != 1) {
            return super.onCreateOptionsMenu(menu);
        }
        getMenuInflater().inflate(R.menu.f10nameremoved, menu);
        MenuItem findItem = menu.findItem(R.id.support_topic_skip);
        this.A02 = findItem;
        findItem.setVisible(false);
        return true;
    }

    public void onCreate(Bundle bundle) {
        Intent intent = getIntent();
        this.A01 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.ui_version", 1);
        this.A00 = intent.getIntExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.contact_us_action", 3);
        if (this.A01 == 2) {
            String string = getString(R.string.f11nameremoved);
            setTheme(R.style.f12nameremoved);
            super.onCreate(bundle);
            setTitle(string);
            setContentView((int) R.layout.f8nameremoved);
            findViewById(R.id.toolbar_layout).setVisibility(0);
            Toolbar toolbar = (Toolbar) C005205m.A00(this, R.id.toolbar);
            C18260x0.A0E(this, getResources(), toolbar, this.A00, R.drawable.ic_back);
            toolbar.setTitle((CharSequence) string);
            toolbar.setNavigationOnClickListener(new C635439q((Object) this, 41));
            setSupportActionBar(toolbar);
            View findViewById = findViewById(R.id.contact_us_button);
            findViewById.setVisibility(0);
            C635439q.A00(findViewById, this, 42);
        } else {
            super.onCreate(bundle);
            setContentView((int) R.layout.f8nameremoved);
            AnonymousClass0R8 supportActionBar = getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0J(getString(R.string.f11nameremoved));
                supportActionBar.A0N(true);
            }
        }
        this.A05 = AnonymousClass001.A0s();
        C08270df supportFragmentManager = getSupportFragmentManager();
        ArrayList arrayList = supportFragmentManager.A0F;
        if (arrayList == null) {
            arrayList = AnonymousClass001.A0s();
            supportFragmentManager.A0F = arrayList;
        }
        arrayList.add(this);
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("com.whatsapp.inappsupport.ui.SupportTopicsActivity.support_topics");
        Objects.requireNonNull(parcelableArrayListExtra);
        SupportTopicsFragment supportTopicsFragment = new SupportTopicsFragment();
        Bundle A08 = AnonymousClass002.A08();
        A08.putParcelable("parent_topic", (Parcelable) null);
        A08.putParcelableArrayList("topics", parcelableArrayListExtra);
        supportTopicsFragment.A0u(A08);
        C08240dc A0J = AnonymousClass0x2.A0J(this);
        A0J.A09(supportTopicsFragment, R.id.support_topics_container);
        A0J.A01();
        this.A05.add(supportTopicsFragment);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332 && !this.A05.isEmpty()) {
            onBackPressed();
            return true;
        } else if (menuItem.getItemId() != R.id.support_topic_skip) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            A74((C108955dq) null);
            return true;
        }
    }
}
